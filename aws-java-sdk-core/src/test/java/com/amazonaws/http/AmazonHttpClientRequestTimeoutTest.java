/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights
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
package com.amazonaws.http;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ProtocolVersion;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.http.exception.HttpRequestTimeoutException;
import com.amazonaws.http.request.EmptyHttpRequest;
import com.amazonaws.http.response.HttpResponseProxy;
import com.amazonaws.http.response.NullErrorResponseHandler;
import com.amazonaws.http.response.NullResponseHandler;
import com.amazonaws.http.server.ProblematicServer;
import com.amazonaws.Request;

/**
 * This is the test suite for the request timeout option in the AmazonHttpClient.
 */
public class AmazonHttpClientRequestTimeoutTest {

    @Test(timeout = 10 * 1000)
    public void testRequestTimeoutDisabled() {
        ProblematicServer server = new ProblematicServer(ProblematicServer.ServerIssue.UNRESPONSIVE);
        server.startServer();
        
        String localhostEndpoint = "http://localhost:" + server.getPort();
        Request<?> request = new EmptyHttpRequest(localhostEndpoint, HttpMethodName.GET);

        AmazonHttpClient httpClient = new AmazonHttpClient(
                new ClientConfiguration()
                        .withSocketTimeout(1 * 1000)
                        .withRequestTimeout(0)
                        .withMaxErrorRetry(0));

        try {
            httpClient.execute(request, new NullResponseHandler(), new NullErrorResponseHandler(), new ExecutionContext());
            Assert.fail("Client-side socket read timeout is expected!");
        } catch (AmazonClientException e) {
            Assert.assertTrue(e.getCause() instanceof SocketTimeoutException);
            /* The internal request timer should not have been instantiated. */
            ScheduledThreadPoolExecutor httpRequestTimer = httpClient.getHttpRequestTimer().getExecutor();
            Assert.assertNull(httpRequestTimer);
        }
        
        server.stopServer();
        httpClient.shutdown();
    }

    @Test(timeout = 25 * 1000)
    public void testRequestTimeoutEnforcedWithRetries() throws IOException {
        ProblematicServer server = new ProblematicServer(ProblematicServer.ServerIssue.OVERLOADED);
        server.startServer();
        
        int maxRetries = 2;
        ClientConfiguration config = new ClientConfiguration()
            .withRequestTimeout(1 * 1000)
            .withMaxErrorRetry(maxRetries);
        HttpClientFactory httpClientFactory = new HttpClientFactory();
        HttpClient rawHttpClient = spy(httpClientFactory.createHttpClient(config));
        String localhostEndpoint = "http://localhost:" + server.getPort();
        Request<?> request = new EmptyHttpRequest(localhostEndpoint, HttpMethodName.GET);

        AmazonHttpClient httpClient = new AmazonHttpClient(config, rawHttpClient, null);

        try {
            httpClient.execute(request, new NullResponseHandler(), new NullErrorResponseHandler(), new ExecutionContext());
            Assert.fail("Client-side request timeout is expected!");
        } catch (AmazonClientException e) {
            /* Assert the expected exception and number of requests. */
            Assert.assertTrue(e.getCause() instanceof HttpRequestTimeoutException);
            int expectedNumberOfRequests = 1 + maxRetries;
            verify(rawHttpClient, times(expectedNumberOfRequests)).execute(any(HttpRequestBase.class), any(HttpContext.class));
            ScheduledThreadPoolExecutor httpRequestTimer = httpClient.getHttpRequestTimer().getExecutor();
            Assert.assertEquals(expectedNumberOfRequests, httpRequestTimer.getCompletedTaskCount());
        }
        
        server.stopServer();
        httpClient.shutdown();
    }

    @Test
    public void testRequestTimerCancelledTask() throws IOException, InterruptedException {
        ClientConfiguration config = new ClientConfiguration()
            .withRequestTimeout(5 * 1000)
            .withMaxErrorRetry(0);
        HttpClientFactory httpClientFactory = new HttpClientFactory();
        HttpClient rawHttpClient = spy(httpClientFactory.createHttpClient(config));
        
        HttpResponseProxy responseProxy = createHttpResponseProxySpy();
        doReturn(responseProxy).when(rawHttpClient).execute(any(HttpRequestBase.class), any(HttpContext.class));
        
        String localhostEndpoint = "http://localhost:0";
        Request<?> request = new EmptyHttpRequest(localhostEndpoint, HttpMethodName.GET);

        AmazonHttpClient httpClient = new AmazonHttpClient(config, rawHttpClient, null);

        try {
            httpClient.execute(request, new NullResponseHandler(), new NullErrorResponseHandler(), new ExecutionContext());
            Assert.fail("Should have been unable to unmarshall the response!");
        } catch (AmazonClientException e) {
            Assert.assertTrue(e.getCause() instanceof RuntimeException);
            RuntimeException re = (RuntimeException) e.getCause();
            Assert.assertTrue(re.getMessage().contains("Unable to unmarshall response"));
        }
        
        /* Verify the response was buffered when enforcing the request timeout. */
        verify(responseProxy).setEntity(any(BufferedHttpEntity.class));
        
        /* Verify cancelled tasks are removed on demand and the core threads die out after the keep alive time. */
        ScheduledThreadPoolExecutor httpRequestTimer = httpClient.getHttpRequestTimer().getExecutor();
        Assert.assertEquals(0, httpRequestTimer.getCompletedTaskCount());
        Assert.assertEquals(0, httpRequestTimer.getQueue().size());
        Assert.assertEquals(1, httpRequestTimer.getPoolSize());
        Thread.sleep(httpRequestTimer.getKeepAliveTime(TimeUnit.MILLISECONDS) + 1000);
        Assert.assertEquals(0, httpRequestTimer.getPoolSize());
        
        httpClient.shutdown();
    }
    
    @Test
    public void testResponseNotBufferedForDisabledRequestTimeout() throws IOException, InterruptedException {
        ClientConfiguration config = new ClientConfiguration()
            .withRequestTimeout(0);
        HttpClientFactory httpClientFactory = new HttpClientFactory();
        HttpClient rawHttpClient = spy(httpClientFactory.createHttpClient(config));
        
        HttpResponseProxy responseProxy = createHttpResponseProxySpy();
        doReturn(responseProxy).when(rawHttpClient).execute(any(HttpRequestBase.class), any(HttpContext.class));
        
        String localhostEndpoint = "http://localhost:0";
        Request<?> request = new EmptyHttpRequest(localhostEndpoint, HttpMethodName.GET);
    
        AmazonHttpClient httpClient = new AmazonHttpClient(config, rawHttpClient, null);
    
        try {
            httpClient.execute(request, new NullResponseHandler(), new NullErrorResponseHandler(), new ExecutionContext());
            Assert.fail("Should have been unable to unmarshall the response!");
        } catch (AmazonClientException e) {}
        
        /* Verify the response is not buffered when the request timeout is disabled. */
        verify(responseProxy, never()).setEntity(any(BufferedHttpEntity.class));
        httpClient.shutdown();
    }
    
    @Test
    public void testResponseNotBufferedForStreamingOperation() throws IOException, InterruptedException {
        ClientConfiguration config = new ClientConfiguration()
            .withRequestTimeout(5 * 1000);
        HttpClientFactory httpClientFactory = new HttpClientFactory();
        HttpClient rawHttpClient = spy(httpClientFactory.createHttpClient(config));
        
        HttpResponseProxy responseProxy = createHttpResponseProxySpy();
        doReturn(responseProxy).when(rawHttpClient).execute(any(HttpRequestBase.class), any(HttpContext.class));
        
        String localhostEndpoint = "http://localhost:0";
        Request<?> request = new EmptyHttpRequest(localhostEndpoint, HttpMethodName.GET);
    
        AmazonHttpClient httpClient = new AmazonHttpClient(config, rawHttpClient, null);
    
        try {
            httpClient.execute(request, 
                    new NullResponseHandler() {
                        @Override
                        public boolean needsConnectionLeftOpen() {
                            return true;
                        }
                    }, new NullErrorResponseHandler(), new ExecutionContext());
            Assert.fail("Should have been unable to unmarshall the response!");
        } catch (AmazonClientException e) {}
        
        /* Verify the response is not buffered when the response handler requires the connection to be left open. */
        verify(responseProxy, never()).setEntity(any(BufferedHttpEntity.class));
        httpClient.shutdown();
    }
    
    private HttpResponseProxy createHttpResponseProxySpy() throws IOException {
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        BasicStatusLine statusLine = new BasicStatusLine(protocolVersion, 200, "mock response");
        BasicHttpResponse response = new BasicHttpResponse(statusLine);
        HttpResponseProxy responseProxy = spy(new HttpResponseProxy(response));
        doReturn(new StringEntity("mock response body")).when(responseProxy).getEntity();
        return responseProxy;
    }
    
}
