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
package com.amazonaws.http.timers.client;

import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.assertClientExecutionTimerExecutorNotCreated;
import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.assertNumberOfTasksTriggered;
import static com.amazonaws.http.timers.ClientExecutionAndRequestTimerTestUtils.interruptCurrentThreadAfterDelay;
import static com.amazonaws.http.timers.TimeoutTestConstants.CLIENT_EXECUTION_TIMEOUT;
import static com.amazonaws.http.timers.TimeoutTestConstants.PRECISION_MULTIPLIER;
import static com.amazonaws.http.timers.TimeoutTestConstants.TEST_TIMEOUT;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.SocketTimeoutException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.TestPreConditions;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.UnresponsiveMockServerTestBase;
import com.amazonaws.http.exception.HttpRequestTimeoutException;
import com.amazonaws.http.response.NullErrorResponseHandler;
import com.amazonaws.http.response.NullResponseHandler;
import com.amazonaws.retry.FixedTimeBackoffStrategy;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;

public class UnresponsiveServerIntegrationTests extends UnresponsiveMockServerTestBase {

    private static final int LONGER_SOCKET_TIMEOUT = CLIENT_EXECUTION_TIMEOUT * PRECISION_MULTIPLIER;
    private static final int SHORTER_SOCKET_TIMEOUT = CLIENT_EXECUTION_TIMEOUT / PRECISION_MULTIPLIER;
    private static final int LONGER_REQUEST_TIMEOUT = CLIENT_EXECUTION_TIMEOUT * PRECISION_MULTIPLIER;
    private static final int SHORTER_REQUEST_TIMEOUT = CLIENT_EXECUTION_TIMEOUT / PRECISION_MULTIPLIER;

    private AmazonHttpClient httpClient;

    @BeforeClass
    public static void preConditions() {
        TestPreConditions.assumeNotJava6();
    }

    @Test(timeout = TEST_TIMEOUT)
    public void clientExecutionTimeoutDisabled_SocketTimeoutExceptionIsThrown_NoThreadsCreated() {
        httpClient = new AmazonHttpClient(new ClientConfiguration().withSocketTimeout(1 * 1000).withMaxErrorRetry(0));

        try {
            httpClient.requestExecutionBuilder().request(newGetRequest()).execute();
            fail("Exception expected");
        } catch (AmazonClientException e) {
            assertThat(e.getCause(), instanceOf(SocketTimeoutException.class));
            assertClientExecutionTimerExecutorNotCreated(httpClient.getClientExecutionTimer());
        }
    }

    /**
     * The client execution timer uses interrupts to abort the client but if another thread
     * interrupts the current thread for another reason we don't want to squash the
     * {@link InterruptedException}. We should set the thread's interrupted status and throw the
     * exception back out (we can't throw the actual {@link InterruptedException} because it's
     * checked)
     */
    @Test(timeout = TEST_TIMEOUT)
    public void interruptCausedBySomethingOtherThanTimer_PropagatesInterruptToCaller() {
        final int socketTimeoutInMillis = 100;
        httpClient = new AmazonHttpClient(new ClientConfiguration().withSocketTimeout(socketTimeoutInMillis)
                .withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT)
                .withRetryPolicy(new RetryPolicy(PredefinedRetryPolicies.DEFAULT_RETRY_CONDITION,
                        new FixedTimeBackoffStrategy(CLIENT_EXECUTION_TIMEOUT), 1, false)));

        // We make sure the first connection has failed due to the socket timeout before
        // interrupting so we know that we are sleeping per the backoff strategy. Apache HTTP
        // client doesn't seem to honor interrupts reliably but Thread.sleep does
        interruptCurrentThreadAfterDelay(socketTimeoutInMillis * 2);

        try {
            httpClient.requestExecutionBuilder().request(newGetRequest()).execute();
            fail("Exception expected");
        } catch (AmazonClientException e) {
            assertTrue(Thread.currentThread().isInterrupted());
            assertThat(e.getCause(), instanceOf(InterruptedException.class));
        }
    }

    @Test(timeout = TEST_TIMEOUT)
    public void clientExecutionTimeoutEnabled_WithLongerSocketTimeout_ThrowsClientExecutionTimeoutException()
            throws IOException {
        httpClient = new AmazonHttpClient(new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT)
                .withSocketTimeout(LONGER_SOCKET_TIMEOUT).withMaxErrorRetry(0));

        try {
            httpClient.requestExecutionBuilder().request(newGetRequest()).execute();
            fail("Exception expected");
        } catch (AmazonClientException e) {
            assertThat(e, instanceOf(ClientExecutionTimeoutException.class));
            assertNumberOfTasksTriggered(httpClient.getClientExecutionTimer(), 1);
        }
    }

    @Test(timeout = TEST_TIMEOUT)
    public void clientExecutionTimeoutEnabled_WithShorterSocketTimeout_ThrowsSocketTimeoutException()
            throws IOException {
        httpClient = new AmazonHttpClient(new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT)
                .withSocketTimeout(SHORTER_SOCKET_TIMEOUT).withMaxErrorRetry(0));

        try {
            httpClient.requestExecutionBuilder().request(newGetRequest()).execute();
            fail("Exception expected");
        } catch (AmazonClientException e) {
            assertThat(e.getCause(), instanceOf(SocketTimeoutException.class));
            assertNumberOfTasksTriggered(httpClient.getClientExecutionTimer(), 0);
        }
    }

    @Test(timeout = TEST_TIMEOUT)
    public void clientExecutionTimeoutEnabled_WithShorterClientExecutionTimeout_ThrowsClientExecutionTimeoutException()
            throws IOException {
        httpClient = new AmazonHttpClient(new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT)
                .withRequestTimeout(LONGER_REQUEST_TIMEOUT).withMaxErrorRetry(0));

        try {
            httpClient.requestExecutionBuilder().request(newGetRequest()).execute();
            fail("Exception expected");
        } catch (AmazonClientException e) {
            assertThat(e, instanceOf(ClientExecutionTimeoutException.class));
            assertNumberOfTasksTriggered(httpClient.getClientExecutionTimer(), 1);
            assertNumberOfTasksTriggered(httpClient.getHttpRequestTimer(), 0);
        }
    }

    @Test(timeout = TEST_TIMEOUT)
    public void clientExecutionTimeoutEnabled_WithShorterRequestTimeout_ThrowsHttpRequestTimeoutException()
            throws IOException {
        httpClient = new AmazonHttpClient(new ClientConfiguration().withClientExecutionTimeout(CLIENT_EXECUTION_TIMEOUT)
                .withRequestTimeout(SHORTER_REQUEST_TIMEOUT).withMaxErrorRetry(0));

        try {
            httpClient.requestExecutionBuilder().request(newGetRequest()).execute();
            fail("Exception expected");
        } catch (AmazonClientException e) {
            assertThat(e.getCause(), instanceOf(HttpRequestTimeoutException.class));
            // Completed tasks means the client execution was aborted by the timer
            assertNumberOfTasksTriggered(httpClient.getClientExecutionTimer(), 0);
            assertNumberOfTasksTriggered(httpClient.getHttpRequestTimer(), 1);
        }
    }

    @Test(timeout = TEST_TIMEOUT)
    public void clientExecutionTimeoutEnabled_WithShorterRequestTimeoutAndRetry_ThrowsClientExecutionTimeoutException()
            throws IOException {
        final int clientExecutionTimeout = 1500;
        final int requestTimeout = 1000;
        final int backoffTime = 300;
        httpClient = new AmazonHttpClient(new ClientConfiguration().withClientExecutionTimeout(clientExecutionTimeout)
                .withRequestTimeout(requestTimeout)
                .withRetryPolicy(new RetryPolicy(PredefinedRetryPolicies.DEFAULT_RETRY_CONDITION,
                        new FixedTimeBackoffStrategy(backoffTime), Integer.MAX_VALUE, false)));

        try {
            httpClient.requestExecutionBuilder().request(newGetRequest()).execute();
            fail("Exception expected");
        } catch (AmazonClientException e) {
            assertThat(e, instanceOf(ClientExecutionTimeoutException.class));
            // Completed tasks means the client execution was aborted by the timer
            assertNumberOfTasksTriggered(httpClient.getClientExecutionTimer(), 1);
            assertNumberOfTasksTriggered(httpClient.getHttpRequestTimer(), 1);
        }
    }
}
