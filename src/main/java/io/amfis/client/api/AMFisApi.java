package io.amfis.client.api;

import com.google.gson.reflect.TypeToken;

import io.amfis.client.ApiClient;
import io.amfis.client.ApiException;
import io.amfis.client.ApiResponse;
import io.amfis.client.Configuration;
import io.amfis.client.Pair;
import io.amfis.client.ProgressRequestBody;
import io.amfis.client.ProgressResponseBody;
import io.amfis.client.model.RequestAMFIS;
import io.amfis.client.model.Response;
import io.amfis.client.model.ScoreResponse;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AMFisApi {
    private ApiClient apiClient;
    public AMFisApi() {
        this(Configuration.getDefaultApiClient());
    }
    public AMFisApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call postAMFISDatosGeneralesCall(String xApiKey, String username, String password, RequestAMFIS request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private okhttp3.Call postAMFISDatosGeneralesBeforeCall(String xApiKey, String username, String password, RequestAMFIS request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling postAMFISDatosGenerales(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling postAMFISDatosGenerales(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling postAMFISDatosGenerales(Async)");
        }
        
        okhttp3.Call call = postAMFISDatosGeneralesCall(xApiKey, username, password, request, progressListener, progressRequestListener);
        return call;
    }
    
    public ScoreResponse postAMFISDatosGenerales(String xApiKey, String username, String password, RequestAMFIS request) throws ApiException {
        ApiResponse<ScoreResponse> resp = postAMFISDatosGeneralesWithHttpInfo(xApiKey, username, password, request);
        return resp.getData();
    }
    
    public ApiResponse<ScoreResponse> postAMFISDatosGeneralesWithHttpInfo(String xApiKey, String username, String password, RequestAMFIS request) throws ApiException {
        okhttp3.Call call = postAMFISDatosGeneralesBeforeCall(xApiKey, username, password, request, null, null);
        Type localVarReturnType = new TypeToken<ScoreResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }



    public Response postAMFISFolioConsulta(String xApiKey, String username, String password, RequestAMFIS request) throws ApiException {
        ApiResponse<Response> resp = postAMFISFolioConsultaWithHttpInfo(xApiKey, username, password, request);
        return resp.getData();
    }

    public ApiResponse<Response> postAMFISFolioConsultaWithHttpInfo(String xApiKey, String username, String password, RequestAMFIS request)
            throws ApiException {
        okhttp3.Call call = postAMFISFolioConsultaValidateBeforeCall(xApiKey, username, password, request, null, null);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    private okhttp3.Call postAMFISFolioConsultaValidateBeforeCall(String xApiKey, String username, String password, RequestAMFIS request,
                                                          final ProgressResponseBody.ProgressListener progressListener,
                                                          final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling postAMFISFolioConsulta(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling postAMFISFolioConsulta(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling postAMFISFolioConsulta(Async)");
        }


        okhttp3.Call call = postAMFISFolioConsultaCall(xApiKey, username, password, request, progressListener, progressRequestListener);
        return call;
    }
    public okhttp3.Call postAMFISFolioConsultaCall(String xApiKey, String username, String password, RequestAMFIS request,
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
