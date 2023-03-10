/*
 * EnoviaRestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.yenaplus.backend.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.yenaplus.backend.EnoviaRestAPIClient;
import com.yenaplus.backend.exceptions.ApiException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DownloadPackageControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static EnoviaRestAPIClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static DownloadPackageController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getDownloadPackageController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Test case for gettabledata.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testGettabledata() throws Exception {
        // Parameters for the API call
        String u = 
                "5D10960500001CFC635196510000011A";

        // Set callback and perform API call
        try {
            controller.gettabledata(u);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

}
