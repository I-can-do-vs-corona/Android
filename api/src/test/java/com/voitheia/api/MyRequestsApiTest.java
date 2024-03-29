/*
 * Voitheia API
 * Api for Voitheia. Developed for the WeVsVirus hackathon
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.voitheia.api;

import com.voitheia.api.invoker.ApiException;
import com.voitheia.api.model.GetAllRequestResponse;
import com.voitheia.api.model.GetRequestResponse;
import com.voitheia.api.model.PatchRequestDto;
import com.voitheia.api.model.ProblemDetails;
import com.voitheia.api.model.TakeRequestDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MyRequestsApi
 */
@Ignore
public class MyRequestsApiTest {

    private final MyRequestsApi api = new MyRequestsApi();

    
    /**
     * Get all requests assigned to the logged in user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void myRequestsGetTest() throws ApiException {
        GetAllRequestResponse response = api.myRequestsGet();

        // TODO: test validations
    }
    
    /**
     * Cancel a previously taken request
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void myRequestsIdDeleteTest() throws ApiException {
        Integer id = null;
        api.myRequestsIdDelete(id);

        // TODO: test validations
    }
    
    /**
     * Get a specific request assigned to the logged in user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void myRequestsIdGetTest() throws ApiException {
        Integer id = null;
        GetRequestResponse response = api.myRequestsIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Updates the status of a request. Currently only close is supported
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void myRequestsIdPatchTest() throws ApiException {
        Integer id = null;
        PatchRequestDto patchRequestDto = null;
        api.myRequestsIdPatch(id, patchRequestDto);

        // TODO: test validations
    }
    
    /**
     * Add a request to the users personal request list.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void myRequestsPostTest() throws ApiException {
        TakeRequestDto takeRequestDto = null;
        api.myRequestsPost(takeRequestDto);

        // TODO: test validations
    }
    
}
