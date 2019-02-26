/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.http.timers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.amazonaws.http.apache.client.impl.ApacheHttpClientFactory;
import com.amazonaws.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.amazonaws.http.response.ErrorDuringUnmarshallingResponseHandler;
import com.amazonaws.http.settings.HttpClientSettings;
import org.apache.http.HttpEntity;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.protocol.HttpContext;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.client.HttpClientFactory;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.request.EmptyHttpRequest;
import com.amazonaws.http.response.HttpResponseProxy;
import com.amazonaws.http.response.NullErrorResponseHandler;
import com.amazonaws.http.response.NullResponseHandler;
import com.amazonaws.http.timers.client.ClientExecutionTimer;
import com.amazonaws.http.timers.request.HttpRequestTimer;

/**
 * Useful asserts and utilities for verifying behavior or the client execution timeout and request
 * timeout features
 */
public class ClientExecutionAndRequestTimerTestUtils {

    /**
     * Can take a little bit for ScheduledThreadPoolExecutor to update it's internal state
     */
    private static final int WAIT_BEFORE_ASSERT_ON_EXECUTOR = 500;

    /**
     * Assert that the executor backing {@link ClientExecutionTimer} was never created or used
     * 
     * @param requestTimer
     */
    public static void assertRequestTimerExecutorNotCreated(HttpRequestTimer requestTimer) {
        assertNull(requestTimer.getExecutor());
    }

    /**
     * Assert that the executor backing {@link ClientExecutionTimer} was never created or used
     * 
     * @param clientExecutionTimer
     */
    public static void assertClientExecutionTimerExecutorNotCreated(ClientExecutionTimer clientExecutionTimer) {
        assertNull(clientExecutionTimer.getExecutor());
    }

    /**
     * Assert response was buffered into memory to enforce the timeout on both connection
     * established and reading of content
     * 
     * @param responseProxy
     *            Must by a spied {@link HttpResponseProxy}
     */
    public static void assertResponseIsBuffered(HttpResponseProxy responseProxy) {
        verify(responseProxy).setEntity(any(BufferedHttpEntity.class));
    }

    /**
     * Assert response was NOT buffered into memory as should be the case when client execution and
     * request timeouts are disabled or an operation is streaming and it's content must be left open
     * 
     * @param responseProxy
     *            Must by a spied {@link HttpResponseProxy}
     */
    public static void assertResponseWasNotBuffered(HttpResponseProxy responseProxy) {
        verify(responseProxy, never()).setEntity(any(BufferedHttpEntity.class));
    }

    /**
     * Waits until a little after the thread pools keep alive time and then asserts that all thre
     * 
     * @param timerExecutor
     *            Executor used by timer implementation
     * @throws InterruptedException
     */
    public static void assertCoreThreadsShutDownAfterBeingIdle(ScheduledThreadPoolExecutor timerExecutor) {
        try {
            Thread.sleep(timerExecutor.getKeepAliveTime(TimeUnit.MILLISECONDS) + 1000);
        } catch (InterruptedException ignored) {
        }
        assertEquals(0, timerExecutor.getPoolSize());
    }

    /**
     * If the request completes successfully then the timer task should be canceled and should be
     * removed from the thread pool to prevent build up of canceled tasks
     * 
     * @param timerExecutor
     *            Executor used by timer implementation
     */
    public static void assertCanceledTasksRemoved(ScheduledThreadPoolExecutor timerExecutor) {
        waitBeforeAssertOnExecutor();
        assertEquals(0, timerExecutor.getQueue().size());
    }

    /**
     * Asserts the timer never went off (I.E. no timeout was exceeded and no timer task was
     * executed)
     * 
     * @param timerExecutor
     *            Executor used by timer implementation
     */
    public static void assertTimerNeverTriggered(ScheduledThreadPoolExecutor timerExecutor) {
        assertNumberOfTasksTriggered(timerExecutor, 0);
    }

    public static void assertNumberOfTasksTriggered(ClientExecutionTimer clientExecutionTimer,
                                                    int expectedNumberOfTasks) {
        assertNumberOfTasksTriggered(clientExecutionTimer.getExecutor(), expectedNumberOfTasks);
    }

    public static void assertNumberOfTasksTriggered(HttpRequestTimer requestTimer, int expectedNumberOfTasks) {
        assertNumberOfTasksTriggered(requestTimer.getExecutor(), expectedNumberOfTasks);
    }

    private static void assertNumberOfTasksTriggered(ScheduledThreadPoolExecutor timerExecutor,
                                                     int expectedNumberOfTasks) {
        waitBeforeAssertOnExecutor();
        assertEquals(expectedNumberOfTasks, timerExecutor.getCompletedTaskCount());
    }

    /**
     * Creates Apache {@link HttpClient} spy
     * 
     * @param config
     *            {@link ClientConfiguration} for {@link HttpClientFactory}
     * @return Real implementation of {@link HttpClient} with ability to verify method calls or
     *         partially mock
     */
    public static ConnectionManagerAwareHttpClient createRawHttpClientSpy(ClientConfiguration config) {
        HttpClientFactory<ConnectionManagerAwareHttpClient> httpClientFactory = new ApacheHttpClientFactory();
        return spy(httpClientFactory.create(HttpClientSettings.adapt(config, false)));
    }

    /**
     * Creates Apache {@link HttpResponseProxy} spy
     * 
     * @return Real implementation of {@link HttpResponseProxy} with ability to verify method calls
     *         or partially mock
     */
    public static HttpResponseProxy createHttpResponseProxySpy() throws IOException {
        StringEntity entity = new StringEntity("mock response body");
        HttpResponseProxy responseProxy = spy(createHttpResponseProxy(entity));
        doReturn(entity).when(responseProxy).getEntity();
        return responseProxy;
    }

    /**
     * Creates Apache {@link HttpResponseProxy} with a null entity
     */
    public static HttpResponseProxy createHttpHeadResponseProxy() throws IOException {
        return createHttpResponseProxy(null);
    }

    private static HttpResponseProxy createHttpResponseProxy(HttpEntity entity) {
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        BasicStatusLine statusLine = new BasicStatusLine(protocolVersion, 200, "mock response");
        BasicHttpResponse response = new BasicHttpResponse(statusLine);
        response.setEntity(entity);
        return new HttpResponseProxy(response);
    }

    public static Request<?> createMockGetRequest() {
        String localhostEndpoint = "http://localhost:0";
        return new EmptyHttpRequest(localhostEndpoint, HttpMethodName.GET);
    }

    public static Request<?> createMockHeadRequest() {
        String localhostEndpoint = "http://localhost:0";
        return new EmptyHttpRequest(localhostEndpoint, HttpMethodName.HEAD);
    }

    /**
     * Execute the request with a dummy response handler and error response handler
     */
    public static void execute(AmazonHttpClient httpClient, Request<?> request) {
        httpClient.requestExecutionBuilder()
                .request(request)
                .errorResponseHandler(new NullErrorResponseHandler())
                .execute(new ErrorDuringUnmarshallingResponseHandler());
    }

    public static void assertNumberOfRetries(HttpClient spyClient, int expectedNumberOfRequests) {
        try {
            verify(spyClient, times(expectedNumberOfRequests)).execute(any(HttpRequestBase.class),
                    any(HttpContext.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void waitBeforeAssertOnExecutor() {
        try {
            Thread.sleep(WAIT_BEFORE_ASSERT_ON_EXECUTOR);
        } catch (InterruptedException ignored) {
        }
    }

    public static void interruptCurrentThreadAfterDelay(final long delay) {
        final Thread currentThread = Thread.currentThread();
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(delay);
                    currentThread.interrupt();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }.start();
    }

}
