/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.internal;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.http.MockServerTestBase;
import com.amazonaws.http.apache.client.impl.ApacheHttpClientFactory;
import com.amazonaws.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.amazonaws.http.client.HttpClientFactory;
import com.amazonaws.http.server.MockServer;
import com.amazonaws.http.settings.HttpClientSettings;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.*;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * This class starts a mock proxy server, and once a request is sent to this mock proxy server,
 * a 200 OK will be returned. We'll take advantage of this returned status code to test whether
 * a request to the given fake service host is passed through the proxy or not.
 */
public class SystemDefaultRoutePlannerIntegrationTest extends MockServerTestBase {

    private static final String FOO_FAKE_SERVICE_HOST_PREFIX = UUID.randomUUID().toString();
    private static final String FOO_FAKE_SERVICE_HOST = FOO_FAKE_SERVICE_HOST_PREFIX + ".com";

    private static final ProxySelector defaultBeforeTest  = ProxySelector.getDefault();

    @After
    public void teardown() {
        ProxySelector.setDefault(defaultBeforeTest);
    }

    @Before
    public void methodSetup() {
        server.resetAcceptCount();
    }

    @Override
    protected MockServer buildMockServer() {
        return new MockServer(MockServer.DummyResponseServerBehavior.build(200, "OK", "Hi"));
    }

    @Test
    public void testProxySelector_OfTypeHttp_ConnectsToProxy() throws IOException {
        ProxySelector testProxySelector = new ProxySelector() {
            @Override
            public List<Proxy> select(URI uri) {
                InetSocketAddress socketAddress = new InetSocketAddress("localhost", server.getPort());
                Proxy proxy = new Proxy(Proxy.Type.HTTP, socketAddress);
                return Collections.singletonList(proxy);
            }

            @Override
            public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
                throw new IllegalStateException();
            }
        };

        ProxySelector.setDefault(testProxySelector);
        mockSuccessfulRequest();
        assertEquals(1, server.getAcceptCount());
    }

    @Test
    public void testProxySelector_OfTypeDirect_DoesNotConnectsToProxy() throws IOException {
        try {
            mockSuccessfulRequest();
            fail("Call should have produced an UnknownHostException");
        } catch (UnknownHostException e) {
            assertEquals(0, server.getAcceptCount());
        }

    }

    // Create a HttpClient with the proxy set up to the local mock server.
    private HttpClient createHttpClient() {
        HttpClientFactory<ConnectionManagerAwareHttpClient> httpClientFactory = new ApacheHttpClientFactory();
        ClientConfiguration config = new ClientConfiguration();
        return httpClientFactory.create(HttpClientSettings.adapt(config));
    }

    /**
     * The fakeHost doesn't match the nonProxyHosts pattern, so that requests to this fakeHost
     * will pass through the proxy and return successfully.
     */
    private void mockSuccessfulRequest() throws IOException {
        HttpClient client = createHttpClient();
        HttpUriRequest uriRequest = new HttpGet("http://" + FOO_FAKE_SERVICE_HOST);
        HttpResponse response = executeWithRetries(client, uriRequest);
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
    }

    /**
     * Executes the http request retrying the failed requests up to 3 times.
     */
    private HttpResponse executeWithRetries(HttpClient client, HttpUriRequest request) throws IOException {

        for (int attempt = 0; ; attempt++) {
            try {
                return client.execute(request);
            } catch (IOException exception) {
                if (attempt > 2) {
                    throw exception;
                }
            }
        }
    }

}
