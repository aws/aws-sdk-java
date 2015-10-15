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

import java.net.SocketTimeoutException;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.http.request.EmptyHttpRequest;
import com.amazonaws.http.response.NullErrorResponseHandler;
import com.amazonaws.http.response.NullResponseHandler;
import com.amazonaws.http.server.ProblematicServer;
import com.amazonaws.Request;

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

    private static ProblematicServer server = new ProblematicServer(ProblematicServer.ServerIssue.UNRESPONSIVE);

    @BeforeClass
    public static void startServer() {
        server.startServer();
    }

    @AfterClass
    public static void stopServer() {
        server.stopServer();
    }

    @Test(timeout = 60 * 1000)
    public void testSslHandshakeTimeout() {
        String localhostEndpoint = "https://localhost:" + server.getPort();

        AmazonHttpClient httpClient = new AmazonHttpClient(
                new ClientConfiguration()
                        .withConnectionTimeout(CLIENT_CONNECTION_TO)
                        .withSocketTimeout(CLIENT_SOCKET_TO)
                        .withMaxErrorRetry(0));

        Request<?> request = new EmptyHttpRequest(localhostEndpoint, HttpMethodName.GET);

        System.out.println("Sending request to localhost...");

        try {
            httpClient.execute(request, new NullResponseHandler(), new NullErrorResponseHandler(), new ExecutionContext());

            Assert.fail("Client-side socket read timeout is expected!");

        } catch (AmazonClientException e) {
            Assert.assertTrue(e.getCause() instanceof SocketTimeoutException);

            SocketTimeoutException ste = (SocketTimeoutException) e.getCause();
            Assert.assertEquals("Read timed out", ste.getMessage());
        }

    }

}
