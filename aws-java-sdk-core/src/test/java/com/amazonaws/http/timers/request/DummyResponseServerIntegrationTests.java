/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.TestPreConditions;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.MockServerTestBase;
import com.amazonaws.http.apache.client.impl.ApacheHttpClientFactory;
import com.amazonaws.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.amazonaws.http.client.HttpClientFactory;
import com.amazonaws.http.response.ErrorDuringUnmarshallingResponseHandler;
import com.amazonaws.http.response.NullErrorResponseHandler;
import com.amazonaws.http.server.MockServer;
import com.amazonaws.http.settings.HttpClientSettings;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.assertNumberOfRetries;
import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.assertNumberOfTasksTriggered;
import static com.amazonaws.http.timers.TimeoutTestConstants.TEST_TIMEOUT;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.spy;

/**
 * Tests that use a server that returns a predetermined response within the timeout limit
 */
public class DummyResponseServerIntegrationTests extends MockServerTestBase {

    private static final int STATUS_CODE = 500;
    private AmazonHttpClient httpClient;

    @BeforeClass
    public static void preConditions() {
        TestPreConditions.assumeNotJava6();
    }

    @Override
    protected MockServer buildMockServer() {
        return new MockServer(
                MockServer.DummyResponseServerBehavior.build(STATUS_CODE, "Internal Server Failure", "Dummy response"));
    }

    @Test(timeout = TEST_TIMEOUT)
    public void requestTimeoutEnabled_ServerRespondsWithRetryableError_RetriesUpToLimitThenThrowsServerException()
            throws IOException {
        int maxRetries = 2;
        ClientConfiguration config = new ClientConfiguration().withRequestTimeout(25 * 1000)
                .withClientExecutionTimeout(25 * 1000).withMaxErrorRetry(maxRetries);
        HttpClientFactory<ConnectionManagerAwareHttpClient> httpClientFactory = new ApacheHttpClientFactory();
        ConnectionManagerAwareHttpClient rawHttpClient = spy(httpClientFactory.create(HttpClientSettings.adapt(config)));

        httpClient = new AmazonHttpClient(config, rawHttpClient, null);

        try {
            httpClient.execute(newGetRequest(),
                               new ErrorDuringUnmarshallingResponseHandler(),
                               new NullErrorResponseHandler(),
                               new ExecutionContext());
            fail("Exception expected");
        } catch (AmazonServiceException e) {
            assertEquals(e.getStatusCode(), STATUS_CODE);
            int expectedNumberOfRequests = 1 + maxRetries;
            assertNumberOfRetries(rawHttpClient, expectedNumberOfRequests);
            assertNumberOfTasksTriggered(httpClient.getHttpRequestTimer(), 0);
            assertNumberOfTasksTriggered(httpClient.getClientExecutionTimer(), 0);
        }
    }


}