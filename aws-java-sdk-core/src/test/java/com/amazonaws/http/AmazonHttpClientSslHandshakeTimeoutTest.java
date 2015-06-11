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
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.ReadLimitInfo;
import com.amazonaws.Request;
import com.amazonaws.util.AWSRequestMetrics;

/**
 * This test is to verify that the apache-httpclient library has fixed the bug
 * where socket timeout configuration is incorrectly ignored during SSL
 * handshake. This test is expected to hang (and fail after the junit timeout)
 * if run against the problematic httpclient version (e.g. 4.3).
 *
 * @see https://issues.apache.org/jira/browse/HTTPCLIENT-1478
 */
public class AmazonHttpClientSslHandshakeTimeoutTest {

    private static final int CLIENT_CONNECTION_TO = 1 * 1000;
    private static final int CLIENT_SOCKET_TO     = 1 * 1000;

    /**
     * The server socket which the test service will listen to.
     */
    private static ServerSocket serverSocket;

    private static UnresponsiveSocketListenerThread listenerThread;

    @BeforeClass
    public static void startServer() {
        try {
            serverSocket = new ServerSocket(0); // auto-assign a port at localhost
        } catch (IOException e) {
            throw new RuntimeException("Unable to start the server socker.", e);
        }

        listenerThread = new UnresponsiveSocketListenerThread(serverSocket);
        listenerThread.setDaemon(true);
        listenerThread.start();
    }

    @AfterClass
    public static void stopServer() {
        listenerThread.interrupt();
        try {
            listenerThread.join(10 * 1000);
        } catch (InterruptedException e1) {
            System.err.println("The listener thread didn't terminate " +
                    "after waiting for 10 seconds.");
        }

        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(
                        "Unable to stop the server socket.", e);
            }
        }
    }

    @Test(timeout = 60 * 1000)
    public void testSslHandshakeTimeout() {
        String localhostEndpoint = "https://localhost:" + serverSocket.getLocalPort();

        AmazonHttpClient httpClient = new AmazonHttpClient(
                new ClientConfiguration()
                        .withConnectionTimeout(CLIENT_CONNECTION_TO)
                        .withSocketTimeout(CLIENT_SOCKET_TO)
                        .withMaxErrorRetry(0));

        Request<?> request = new EmptyHttpRequest(localhostEndpoint, HttpMethodName.GET);

        System.out.println("Sending request to localhost...");

        try {
            httpClient.execute(request, new HttpResponseHandler<AmazonWebServiceResponse<Object>>() {

                @Override
                public AmazonWebServiceResponse<Object> handle(HttpResponse response) throws Exception {
                    return null;
                }

                @Override
                public boolean needsConnectionLeftOpen() {
                    return false;
                }

            }, new HttpResponseHandler<AmazonServiceException>() {

                @Override
                public AmazonServiceException handle(HttpResponse response) throws Exception {
                    return new AmazonServiceException(null);
                }

                @Override
                public boolean needsConnectionLeftOpen() {
                    return false;
                }

            }, new ExecutionContext());

            Assert.fail("Client-side socket read timeout is expected!");

        } catch (AmazonClientException e) {
            Assert.assertTrue(e.getCause() instanceof SocketTimeoutException);

            SocketTimeoutException ste = (SocketTimeoutException) e.getCause();
            Assert.assertEquals("Read timed out", ste.getMessage());
        }

    }

    /**
     * A daemon thread which runs a simple server that listens to a specific
     * server socket. Whenever a connection is created, the server simply keeps
     * holding the connection open and no byte will be written to the socket.
     * The test client talking to this server is expected to timeout
     * appropriately, instead of hanging and waiting for the response forever.
     */
    private static class UnresponsiveSocketListenerThread extends Thread {

        /** The server socket which this tread listens and responds to */
        private final ServerSocket serverSocket;

        public UnresponsiveSocketListenerThread(ServerSocket serverSocket) {
            super("aws-java-sdk-test-unresponsive-socket-listner");
            this.serverSocket = serverSocket;

            setDaemon(true);
        }

        @Override
        public void run() {
            try {
                Socket socket = serverSocket.accept();

                System.out.println("Socket created on port " + socket.getLocalPort());

                while (true) {
                    System.out.println("I don't want to talk.");
                    Thread.sleep(10 * 1000);
                }

            } catch (IOException e) {
                throw new RuntimeException("Error when waiting for new socket connection.", e);

            } catch (InterruptedException e) {
                System.err.println("Socket listener thread interrupted. Terminating the thread...");
                return;
            }
        }
    }

    private static class EmptyHttpRequest implements Request<Object> {

        private final URI endpoint;
        private final HttpMethodName httpMethod;

        public EmptyHttpRequest(String endpoint, HttpMethodName httpMethod) {
            this.endpoint = URI.create(endpoint);
            this.httpMethod = httpMethod;
        }

        @Override
        public void addHeader(String name, String value) {
        }

        @Override
        public Map<String, String> getHeaders() {
            return Collections.emptyMap();
        }

        @Override
        public void setHeaders(Map<String, String> headers) {
        }

        @Override
        public void setResourcePath(String path) {
        }

        @Override
        public String getResourcePath() {
            return null;
        }

        @Override
        public void addParameter(String name, String value) {
        }

        @Override
        public Request<Object> withParameter(String name, String value) {
            return this;
        }

        @Override
        public Map<String, List<String>> getParameters() {
            return Collections.emptyMap();
        }

        @Override
        public void setParameters(Map<String, List<String>> parameters) {
        }

        @Override
        public URI getEndpoint() {
            return endpoint;
        }

        @Override
        public void setEndpoint(URI endpoint) {
            throw new UnsupportedOperationException();
        }

        @Override
        public HttpMethodName getHttpMethod() {
            return httpMethod;
        }

        @Override
        public void setHttpMethod(HttpMethodName httpMethod) {
            throw new UnsupportedOperationException();
        }

        @Override
        public InputStream getContent() {
            return null;
        }

        @Override
        public void setContent(InputStream content) {
        }

        @Override
        public String getServiceName() {
            return null;
        }

        @Override
        public AmazonWebServiceRequest getOriginalRequest() {
            return new AmazonWebServiceRequest() {};
        }

        @Override
        public int getTimeOffset() {
            return 0;
        }

        @Override
        public void setTimeOffset(int timeOffset) {
        }

        @Override
        public Request<Object> withTimeOffset(int timeOffset) {
            return this;
        }

        @Override
        public AWSRequestMetrics getAWSRequestMetrics() {
            return null;
        }

        @Override
        public void setAWSRequestMetrics(AWSRequestMetrics metrics) {
        }

        @Override
        public ReadLimitInfo getReadLimitInfo() {
            return new AmazonWebServiceRequest() {};
        }

        @Override
        public InputStream getContentUnwrapped() {
            return null;
        }

        @Override
        public Object getOriginalRequestObject() {
            return new AmazonWebServiceRequest() {};
        }
    }
}
