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
import org.openapitools.client.model.InlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetricsApi
 */
@Ignore
public class MetricsApiTest {

    private final MetricsApi api = new MetricsApi();

    
    /**
     * Get node&#39;s metrics
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void metricsGetTest() throws ApiException {
        InlineResponse200 response = api.metricsGet();

        // TODO: test validations
    }
    
    /**
     * Get node&#39;s micrometer metrics
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void micrometerMetricsGetTest() throws ApiException {
        String response = api.micrometerMetricsGet();

        // TODO: test validations
    }
    
}