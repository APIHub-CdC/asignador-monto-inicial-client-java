package io.ami.client;

import okhttp3.MediaType;
import okhttp3.RequestBody;

import java.io.IOException;

import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

public class ProgressRequestBody extends RequestBody {
    public interface ProgressRequestListener {
        void onRequestProgress(long bytesWritten, long contentLength, boolean done);
    }
    private final RequestBody requestBody;
    private final ProgressRequestListener progressListener;
    public ProgressRequestBody(RequestBody requestBody, ProgressRequestListener progressListener) {
        this.requestBody = requestBody;
        this.progressListener = progressListener;
    }
    @Override
    public MediaType contentType() {
        return requestBody.contentType();
    }
    @Override
    public long contentLength() throws IOException {
        return requestBody.contentLength();
    }
    @Override
    public void writeTo(BufferedSink sink) throws IOException {
        BufferedSink bufferedSink = Okio.buffer(sink(sink));
        requestBody.writeTo(bufferedSink);
        bufferedSink.flush();
    }
    private Sink sink(Sink sink) {
        return new ForwardingSink(sink) {
            long bytesWritten = 0L;
            long contentLength = 0L;
            @Override
            public void write(Buffer source, long byteCount) throws IOException {
                super.write(source, byteCount);
                if (contentLength == 0) {
                    contentLength = contentLength();
                }
                bytesWritten += byteCount;
                progressListener.onRequestProgress(bytesWritten, contentLength, bytesWritten == contentLength);
            }
        };
    }
}
