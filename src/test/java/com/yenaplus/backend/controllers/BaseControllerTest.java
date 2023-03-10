/*
 * EnoviaRestAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.yenaplus.backend.controllers;

import com.yenaplus.backend.EnoviaRestAPIClient;
import com.yenaplus.backend.Environment;
import com.yenaplus.backend.testing.HttpCallbackCatcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 * Base class for all test cases.
 */
public class BaseControllerTest {
    /**
     * Test configuration.
     */
    public static final int REQUEST_TIMEOUT = 30;

    public static final double ASSERT_PRECISION = 0.01;
    
    /**
     * Global rules for tests.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures,
     * Used to serve as HttpCallback and to capture request & response.
     */

    protected static HttpCallbackCatcher httpResponse;
    
    /**
     * Setup test.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        httpResponse = new HttpCallbackCatcher(); 
    }

    /**
     * Tear down test.
     */
    @AfterClass
    public static void tearDown() throws Exception {
        httpResponse = null;
    }

    /**
     * Create test configuration from Environment variables.
     */
    protected static EnoviaRestAPIClient createConfigurationFromEnvironment() {
        EnoviaRestAPIClient.Builder builder = new EnoviaRestAPIClient.Builder();

        final String environment = System.getenv("ENOVIA_REST_API_LIB_ENVIRONMENT");
        final String timeout = System.getenv("ENOVIA_REST_API_LIB_TIMEOUT");

        if (environment != null) {
            builder.environment(Environment.fromString(environment));
        }
        if (timeout != null) {
            builder.httpClientConfig(configBuilder -> configBuilder.timeout(
                    Long.parseLong(timeout)));
        }
        return builder.build();
    }

    
    /**
     * Create test configuration.
     */
    protected static EnoviaRestAPIClient createConfiguration() {
        // Set Configuration parameters for test execution
        EnoviaRestAPIClient config = createConfigurationFromEnvironment();
        config = config.newBuilder()
                .httpCallback(httpResponse)
                .build();
        return config;
    }
}
