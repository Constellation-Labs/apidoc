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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.InlineResponse2001;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionApi
 */
@Ignore
public class TransactionApiTest {

    private final TransactionApi api = new TransactionApi();

    
    /**
     * Get transaction from node
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionHashGetTest() throws ApiException {
        String hash = null;
        Object response = api.transactionHashGet(hash);

        // TODO: test validations
    }
    
    /**
     * Get last reference of a given address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionLastRefAddressGetTest() throws ApiException {
        String address = null;
        InlineResponse2001 response = api.transactionLastRefAddressGet(address);

        // TODO: test validations
    }
    
    /**
     * Send transaction to network
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transactionPostTest() throws ApiException {
        Object body = null;
        String response = api.transactionPost(body);

        // TODO: test validations
    }
    
}
