/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.http.timers.request;

import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.assertNumberOfRetries;
import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.assertNumberOfTasksTriggered;
import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.execute;
import static com.amazonaws.http.timers.TimeoutTestConstants.TEST_TIMEOUT;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.spy;

import java.io.IOException;

import org.apache.http.client.HttpClient;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.TestPreConditions;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.HttpClientFactory;
import com.amazonaws.http.OverloadedMockServerTestBase;
import com.amazonaws.http.exception.HttpRequestTimeoutException;
import com.amazonaws.http.server.MockServer;
import com.amazonaws.http.server.MockServer.ServerBehavior;

/**
 * Tests requiring an Overloaded server, that is a server that responds but can't close the
 * connection in a timely fashion
 */
// TODO rename to overloaded
public class OverloadServerTests extends OverloadedMockServerTestBase {

    private AmazonHttpClient httpClient;

    @BeforeClass
    public static void preConditions() {
        TestPreConditions.assumeNotJava6();
    }

    @Override
    protected MockServer buildMockServer() {
        return MockServer.createMockServer(ServerBehavior.OVERLOADED);
    }

    @Test(timeout = TEST_TIMEOUT)
    public void requestTimeoutEnabled_HonorsRetryPolicy() throws IOException {
        int maxRetries = 2;
        ClientConfiguration config = new ClientConfiguration().withRequestTimeout(1 * 1000)
                .withMaxErrorRetry(maxRetries);
        HttpClientFactory httpClientFactory = new HttpClientFactory();
        HttpClient rawHttpClient = spy(httpClientFactory.createHttpClient(config));

        httpClient = new AmazonHttpClient(config, rawHttpClient, null);

        try {
            execute(httpClient, newGetRequest());
            fail("Exception expected");
        } catch (AmazonClientException e) {
            /* the expected exception and number of requests. */
            assertThat(e.getCause(), instanceOf(HttpRequestTimeoutException.class));
            int expectedNumberOfRequests = 1 + maxRetries;
            assertNumberOfRetries(rawHttpClient, expectedNumberOfRequests);
            assertNumberOfTasksTriggered(httpClient.getHttpRequestTimer(), expectedNumberOfRequests);
        }
    }

}