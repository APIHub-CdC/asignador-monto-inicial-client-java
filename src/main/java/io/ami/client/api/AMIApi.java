package io.ami.client.api;

import com.google.gson.reflect.TypeToken;

import io.ami.client.ApiClient;
import io.ami.client.ApiException;
import io.ami.client.ApiResponse;
import io.ami.client.Configuration;
import io.ami.client.Pair;
import io.ami.client.ProgressRequestBody;
import io.ami.client.ProgressResponseBody;
import io.ami.client.model.RequestAMI;
import io.ami.client.model.Response;
import io.ami.client.model.ScoreResponse;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AMIApi {
    private ApiClient apiClient;
    public AMIApi() {
        this(Configuration.getDefaultApiClient());
    }
    public AMIApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call postAMIDatosGeneralesCall(String xApiKey, String username, String password, RequestAMI request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "/datos-generales";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
        		"application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    private okhttp3.Call postAMIDatosGeneralesBeforeCall(String xApiKey, String username, String password, RequestAMI request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling postAMIDatosGenerales(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling postAMIDatosGenerales(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling postAMIDatosGenerales(Async)");
        }
        
        okhttp3.Call call = postAMIDatosGeneralesCall(xApiKey, username, password, request, progressListener, progressRequestListener);
        return call;
    }
    
    public ScoreResponse postAMIDatosGenerales(String xApiKey, String username, String password, RequestAMI request) throws ApiException {
        ApiResponse<ScoreResponse> resp = postAMIDatosGeneralesWithHttpInfo(xApiKey, username, password, request);
        return resp.getData();
    }
    
    public ApiResponse<ScoreResponse> postAMIDatosGeneralesWithHttpInfo(String xApiKey, String username, String password, RequestAMI request) throws ApiException {
        okhttp3.Call call = postAMIDatosGeneralesBeforeCall(xApiKey, username, password, request, null, null);
        Type localVarReturnType = new TypeToken<ScoreResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }



    public Response postAMIFolioConsulta(String xApiKey, String username, String password, RequestAMI request) throws ApiException {
        ApiResponse<Response> resp = postAMIFolioConsultaWithHttpInfo(xApiKey, username, password, request);
        return resp.getData();
    }

    public ApiResponse<Response> postAMIFolioConsultaWithHttpInfo(String xApiKey, String username, String password, RequestAMI request)
            throws ApiException {
        okhttp3.Call call = postAMIFolioConsultaValidateBeforeCall(xApiKey, username, password, request, null, null);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    private okhttp3.Call postAMIFolioConsultaValidateBeforeCall(String xApiKey, String username, String password, RequestAMI request,
                                                                final ProgressResponseBody.ProgressListener progressListener,
                                                                final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling postAMIFolioConsulta(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling postAMIFolioConsulta(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling postAMIFolioConsulta(Async)");
        }


        okhttp3.Call call = postAMIFolioConsultaCall(xApiKey, username, password, request, progressListener, progressRequestListener);
        return call;
    }
    public okhttp3.Call postAMIFolioConsultaCall(String xApiKey, String username, String password, RequestAMI request,
                                                 final ProgressResponseBody.ProgressListener progressListener,
                                                 final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "/folio-consulta";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
            localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
            localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
            localVarHeaderParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

}
