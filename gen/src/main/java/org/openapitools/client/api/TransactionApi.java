/*
 * Node Public API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: operators@constellationnetwork.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.InlineResponse2001;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionApi {
    private ApiClient localVarApiClient;

    public TransactionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for transactionHashGet
     * @param hash Hash of transaction to return (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Transaction </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Transaction not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call transactionHashGetCall(String hash, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/{hash}"
            .replaceAll("\\{" + "hash" + "\\}", localVarApiClient.escapeString(hash.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call transactionHashGetValidateBeforeCall(String hash, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'hash' is set
        if (hash == null) {
            throw new ApiException("Missing the required parameter 'hash' when calling transactionHashGet(Async)");
        }
        

        okhttp3.Call localVarCall = transactionHashGetCall(hash, _callback);
        return localVarCall;

    }

    /**
     * Get transaction from node
     * 
     * @param hash Hash of transaction to return (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Transaction </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Transaction not found </td><td>  -  </td></tr>
     </table>
     */
    public Object transactionHashGet(String hash) throws ApiException {
        ApiResponse<Object> localVarResp = transactionHashGetWithHttpInfo(hash);
        return localVarResp.getData();
    }

    /**
     * Get transaction from node
     * 
     * @param hash Hash of transaction to return (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Transaction </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Transaction not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> transactionHashGetWithHttpInfo(String hash) throws ApiException {
        okhttp3.Call localVarCall = transactionHashGetValidateBeforeCall(hash, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get transaction from node (asynchronously)
     * 
     * @param hash Hash of transaction to return (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Transaction </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Transaction not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call transactionHashGetAsync(String hash, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = transactionHashGetValidateBeforeCall(hash, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for transactionLastRefAddressGet
     * @param address Address to get the last reference (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Last reference </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Last reference not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call transactionLastRefAddressGetCall(String address, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/transaction/last-ref/{address}"
            .replaceAll("\\{" + "address" + "\\}", localVarApiClient.escapeString(address.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call transactionLastRefAddressGetValidateBeforeCall(String address, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling transactionLastRefAddressGet(Async)");
        }
        

        okhttp3.Call localVarCall = transactionLastRefAddressGetCall(address, _callback);
        return localVarCall;

    }

    /**
     * Get last reference of a given address
     * 
     * @param address Address to get the last reference (required)
     * @return InlineResponse2001
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Last reference </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Last reference not found </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse2001 transactionLastRefAddressGet(String address) throws ApiException {
        ApiResponse<InlineResponse2001> localVarResp = transactionLastRefAddressGetWithHttpInfo(address);
        return localVarResp.getData();
    }

    /**
     * Get last reference of a given address
     * 
     * @param address Address to get the last reference (required)
     * @return ApiResponse&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Last reference </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Last reference not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse2001> transactionLastRefAddressGetWithHttpInfo(String address) throws ApiException {
        okhttp3.Call localVarCall = transactionLastRefAddressGetValidateBeforeCall(address, null);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get last reference of a given address (asynchronously)
     * 
     * @param address Address to get the last reference (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Last reference </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Last reference not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call transactionLastRefAddressGetAsync(String address, final ApiCallback<InlineResponse2001> _callback) throws ApiException {

        okhttp3.Call localVarCall = transactionLastRefAddressGetValidateBeforeCall(address, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse2001>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for transactionPost
     * @param body Transaction generated by Constellation Wallet (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Transaction hash </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid transaction </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call transactionPostCall(Object body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/transaction";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call transactionPostValidateBeforeCall(Object body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling transactionPost(Async)");
        }
        

        okhttp3.Call localVarCall = transactionPostCall(body, _callback);
        return localVarCall;

    }

    /**
     * Send transaction to network
     * 
     * @param body Transaction generated by Constellation Wallet (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Transaction hash </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid transaction </td><td>  -  </td></tr>
     </table>
     */
    public String transactionPost(Object body) throws ApiException {
        ApiResponse<String> localVarResp = transactionPostWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Send transaction to network
     * 
     * @param body Transaction generated by Constellation Wallet (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Transaction hash </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid transaction </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> transactionPostWithHttpInfo(Object body) throws ApiException {
        okhttp3.Call localVarCall = transactionPostValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send transaction to network (asynchronously)
     * 
     * @param body Transaction generated by Constellation Wallet (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Transaction hash </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid transaction </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call transactionPostAsync(Object body, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = transactionPostValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}