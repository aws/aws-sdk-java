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

import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.UUID;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.junit.Assert;
import org.junit.Test;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.http.MockServerTestBase;
import com.amazonaws.http.apache.client.impl.ApacheHttpClientFactory;
import com.amazonaws.http.apache.client.impl.ConnectionManagerAwareHttpClient;
import com.amazonaws.http.client.HttpClientFactory;
import com.amazonaws.http.server.MockServer;
import com.amazonaws.http.settings.HttpClientSettings;

/**
 * This class starts a mock proxy server, and once a request is sent to this mock proxy server,
 * a 200 OK will be returned. We'll take advantage of this returned status code to test whether
 * a request to the given fake service host is passed through the proxy or not.
 */
public class SdkProxyRoutePlannerIntegrationTest extends MockServerTestBase {

    private static final String FOO_FAKE_SERVICE_HOST_PREFIX = UUID.randomUUID().toString();
    private static final String FOO_FAKE_SERVICE_HOST = FOO_FAKE_SERVICE_HOST_PREFIX + ".com";
    private static final String BAR_FAKE_SERVICE_HOST = UUID.randomUUID().toString() + ".com";
    private static final String BAZ_FAKE_SERVICE_HOST = UUID.randomUUID().toString() + ".com";

    @Override
    protected MockServer buildMockServer() {
        return new MockServer(MockServer.DummyResponseServerBehavior.build(200, "OK", "Hi"));
    }

    @Test
    public void nonProxyHostsNull_fakeHost() throws IOException {
        mockSuccessfulRequest(null, FOO_FAKE_SERVICE_HOST);
    }

    @Test
    public void nonProxyHostEmpty_fakeHost() throws IOException {
        mockSuccessfulRequest("", FOO_FAKE_SERVICE_HOST);
    }

    @Test(expected = UnknownHostException.class)
    public void nonProxyHostsNotNull_fakeHostDoesMatch() throws Exception {
        mockUnsuccessfulRequest(FOO_FAKE_SERVICE_HOST, FOO_FAKE_SERVICE_HOST);
    }

    @Test
    public void nonProxyHostsNotNull_fakeHostDoesNotMatch() throws IOException {
        mockSuccessfulRequest(FOO_FAKE_SERVICE_HOST, BAR_FAKE_SERVICE_HOST);
    }

    @Test(expected = UnknownHostException.class)
    public void nonProxyHostsWithWildcardPrefix_fakeHostDoesMatch() throws Exception {
        mockUnsuccessfulRequest("*.com", FOO_FAKE_SERVICE_HOST);
    }

    @Test
    public void nonProxyHostsWithWildcardPrefix_fakeHostDoesNotMatch() throws IOException {
        mockSuccessfulRequest("*.org", BAR_FAKE_SERVICE_HOST);
    }

    @Test(expected = UnknownHostException.class)
    public void nonProxyHostsWithWildcardSuffix_fakeHostDoesMatch() throws Exception {
        mockUnsuccessfulRequest(FOO_FAKE_SERVICE_HOST_PREFIX + ".*", FOO_FAKE_SERVICE_HOST);
    }

    @Test
    public void nonProxyHostsWithWildcardSuffix_fakeHostDoesNotMatch() throws IOException {
        mockSuccessfulRequest(FOO_FAKE_SERVICE_HOST_PREFIX + ".*", BAR_FAKE_SERVICE_HOST);
    }

    @Test(expected = UnknownHostException.class)
    public void nonProxyHostsWithOrSign_fakeHostDoesMatch() throws Exception {
        mockUnsuccessfulRequest(FOO_FAKE_SERVICE_HOST + "|" + BAR_FAKE_SERVICE_HOST, FOO_FAKE_SERVICE_HOST);
    }

    @Test
    public void nonProxyHostsWithOrSign_fakeHostDoesNotMatch() throws IOException {
        mockSuccessfulRequest(FOO_FAKE_SERVICE_HOST + "|" + BAZ_FAKE_SERVICE_HOST, BAR_FAKE_SERVICE_HOST);
    }

    // Create a HttpClient with the proxy set up to the local mock server.
    private HttpClient createHttpClient(String nonProxyHosts) {
        HttpClientFactory<ConnectionManagerAwareHttpClient> httpClientFactory = new ApacheHttpClientFactory();
        ClientConfiguration config = new ClientConfiguration()
                .withProxyHost("localhost").withProxyPort(server.getPort())
                .withNonProxyHosts(nonProxyHosts);
        return httpClientFactory.create(HttpClientSettings.adapt(config));
    }

    /**
     * The fakeHost doesn't match the nonProxyHosts pattern, so that requests to this fakeHost
     * will pass through the proxy and return successfully.
     */
    private void mockSuccessfulRequest(String nonProxyHosts, String fakeHost) throws IOException {
        HttpClient client = createHttpClient(nonProxyHosts);
        HttpUriRequest uriRequest = new HttpGet("http://" + fakeHost);
        HttpResponse response = executeWithRetries(client, uriRequest);
        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
    }

    /**
     * The fakeHost does match the nonProxyHosts pattern, so that requests to this fakeHost
     * will bypass the proxy and throw an UnknownHostException.
     */
    private void mockUnsuccessfulRequest(String nonProxyHosts, String fakeHost)
            throws Exception {
        HttpClient client = createHttpClient(nonProxyHosts);
        HttpUriRequest uriRequest = new HttpGet("http://" + fakeHost);
        executeWithRetries(client, uriRequest);
        fail("UnknownHostException is expected!");
    }

    /**
     * Executes the http request retrying the failed requests upto 3 times.
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
