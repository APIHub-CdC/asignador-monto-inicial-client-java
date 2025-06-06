package io.ami.client;

import java.util.List;
import java.util.Map;

public class ApiResponse<T> {
    final private int statusCode;
    final private Map<String, List<String>> headers;
    final private T data;
    
    public ApiResponse(int statusCode, Map<String, List<String>> headers) {
        this(statusCode, headers, null);
    }
    
    public ApiResponse(int statusCode, Map<String, List<String>> headers, T data) {
        this.statusCode = statusCode;
        this.headers = headers;
        this.data = data;
    }
    public int getStatusCode() {
        return statusCode;
    }
    public Map<String, List<String>> getHeaders() {
        return headers;
    }
    public T getData() {
        return data;
    }
}
