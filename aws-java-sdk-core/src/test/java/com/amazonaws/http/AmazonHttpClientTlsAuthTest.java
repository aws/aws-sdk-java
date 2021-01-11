/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.any;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Protocol;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.RequestPatternBuilder;
import java.io.IOException;
import java.net.SocketException;
import java.net.URI;
import javax.net.ssl.SSLException;
import org.hamcrest.Matchers;
import org.hamcrest.core.IsInstanceOf;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

/**
 * Tests for the TLS client side auth behavior for {@link AmazonHttpClient}.
 */
public class AmazonHttpClientTlsAuthTest extends ClientTlsAuthTestBase {
    private static final String KEY_STORE_PROPERTY = "javax.net.ssl.keyStore";
    private static final String KEY_STORE_PASSWORD_PROPERTY = "javax.net.ssl.keyStorePassword";
    private static final String KEY_STORE_TYPE_PROPERTY = "javax.net.ssl.keyStoreType";

    private static WireMockServer wireMockServer;
    private static AmazonHttpClient httpClient;

    private HttpResponseHandler mockResponseHandler;
    private AmazonWebServiceResponse mockResponse;

    private static TlsKeyManagersProvider provider;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void setUp() throws IOException {
        ClientTlsAuthTestBase.setUp();

        // Will be used by both client and server to trust the self-signed
        // cert they present to each other
        System.setProperty("javax.net.ssl.trustStore", serverKeyStore.getAbsolutePath());
        System.setProperty("javax.net.ssl.trustStorePassword", STORE_PASSWORD);
        System.setProperty("javax.net.ssl.trustStoreType", "jks");

        provider = new FileStoreTlsKeyManagersProvider(clientKeyStore, CLIENT_STORE_TYPE, STORE_PASSWORD);
    }

    @Before
    public void methodSetup() {
        wireMockServer = new WireMockServer(wireMockConfig()
                .dynamicPort()
                .dynamicHttpsPort()
                .needClientAuth(true)
                .keystorePath(serverKeyStore.getAbsolutePath())
                .keystorePassword(STORE_PASSWORD)
        );

        wireMockServer.start();

        wireMockServer.stubFor(any(urlMatching(".*")).willReturn(aResponse().withStatus(200).withBody("{}")));

        mockResponseHandler = mock(HttpResponseHandler.class);
        mockResponse = mock(AmazonWebServiceResponse.class);
    }

    @AfterClass
    public static void teardown() throws IOException {
        wireMockServer.stop();
        System.clearProperty("javax.net.ssl.trustStore");
        System.clearProperty("javax.net.ssl.trustStorePassword");
        System.clearProperty("javax.net.ssl.trustStoreType");
        ClientTlsAuthTestBase.teardown();
    }

    @After
    public void methodTeardown() {
        if (httpClient != null) {
            httpClient.shutdown();
        }
        httpClient = null;

        wireMockServer.stop();
    }

    @Test
    public void canMakeHttpsRequestWhenKeyProviderConfigured() throws Exception {
        httpClient = new AmazonHttpClient(new ClientConfiguration()
                .withTlsKeyManagersProvider(provider));
        makeRequestWithClient(httpClient);
        wireMockServer.verify(1, getRequestedFor(urlEqualTo("/")));
    }

    @Test
    public void requestFailsWhenNoKeyManagersProvided() throws Throwable {
        thrown.expectCause(Matchers.anyOf(IsInstanceOf.<Exception>instanceOf(SSLException.class),
                IsInstanceOf.<Exception>instanceOf(SocketException.class)));
        try {
            httpClient = new AmazonHttpClient(new ClientConfiguration()
                    .withTlsKeyManagersProvider(NoneTlsKeyManagersProvider.getInstance()));
            makeRequestWithClient(httpClient);
        } finally {
            verifyZeroInteractions(mockResponseHandler);
            wireMockServer.verify(0, RequestPatternBuilder.allRequests());
        }
    }

    @Test
    public void defaultsToSystemPropertiesKeyManagersProvider() throws Exception {
        System.setProperty(KEY_STORE_PROPERTY, clientKeyStore.getAbsolutePath());
        System.setProperty(KEY_STORE_TYPE_PROPERTY, CLIENT_STORE_TYPE);
        System.setProperty(KEY_STORE_PASSWORD_PROPERTY, STORE_PASSWORD);
        httpClient = new AmazonHttpClient(new ClientConfiguration());
        try {
            makeRequestWithClient(httpClient);
        } finally {
            System.clearProperty(KEY_STORE_PROPERTY);
            System.clearProperty(KEY_STORE_TYPE_PROPERTY);
            System.clearProperty(KEY_STORE_PASSWORD_PROPERTY);
        }
    }

    @Test
    public void defaultsToSystemPropertiesKeyManagersProvider_explicitlySetToNull() throws Exception {
        System.setProperty(KEY_STORE_PROPERTY, clientKeyStore.getAbsolutePath());
        System.setProperty(KEY_STORE_TYPE_PROPERTY, CLIENT_STORE_TYPE);
        System.setProperty(KEY_STORE_PASSWORD_PROPERTY, STORE_PASSWORD);
        httpClient = new AmazonHttpClient(new ClientConfiguration().withTlsKeyManagersProvider(null));
        try {
            makeRequestWithClient(httpClient);
        } finally {
            System.clearProperty(KEY_STORE_PROPERTY);
            System.clearProperty(KEY_STORE_TYPE_PROPERTY);
            System.clearProperty(KEY_STORE_PASSWORD_PROPERTY);
        }
    }

    // WireMock doesn't mock 'CONNECT' methods; it will return a 404 for the
    // request, which will get unmarshalled as an error. This is fine for our
    // purposes since that means the TLS handshake succeeded if we got this
    // far.
    @Test(expected = TestException.class)
    public void authenticatesWithTlsProxy() throws Exception {
        ClientConfiguration config = new ClientConfiguration()
                .withProxyHost("localhost")
                .withProxyPort(wireMockServer.httpsPort())
                .withProxyProtocol(Protocol.HTTPS)
                .withTlsKeyManagersProvider(provider);
        httpClient = new AmazonHttpClient(config);
        makeRequestWithClient(httpClient);
    }

    private void makeRequestWithClient(AmazonHttpClient client) throws Exception {
        DefaultRequest<Void> request = new DefaultRequest<Void>(null, "service");
        request.setHttpMethod(HttpMethodName.GET);
        request.setEndpoint(URI.create("https://localhost:" + wireMockServer.httpsPort()));
        ExecutionContext executionContext = new ExecutionContext();

        when(mockResponseHandler.handle(Mockito.any(HttpResponse.class))).thenReturn(mockResponse);

        HttpResponseHandler mockErrorResponseHandler = mock(HttpResponseHandler.class);
        when(mockErrorResponseHandler.handle(Mockito.any(HttpResponse.class))).thenReturn(new TestException("boom"));

        client.execute(request, mockResponseHandler, mockErrorResponseHandler, executionContext, null);
    }

    private static class TestException extends AmazonServiceException {
        public TestException(String errorMessage) {
            super(errorMessage);
        }
    }
}
