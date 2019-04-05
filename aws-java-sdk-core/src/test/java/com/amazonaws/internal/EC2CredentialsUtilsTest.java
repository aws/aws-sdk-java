/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.internal;

import com.amazonaws.util.VersionInfoUtils;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.argThat;
import static org.mockito.Matchers.eq;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matcher;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.retry.internal.CredentialsEndpointRetryParameters;
import com.amazonaws.retry.internal.CredentialsEndpointRetryPolicy;
import com.github.tomakehurst.wiremock.junit.WireMockRule;

import utils.http.SocketUtils;

@RunWith(MockitoJUnitRunner.class)
public class EC2CredentialsUtilsTest {

    private static final String USER_AGENT = VersionInfoUtils.getUserAgent();

    @ClassRule
    public static WireMockRule mockServer = new WireMockRule(0);

    private static final String CREDENTIALS_PATH = "/dummy/credentials/path";

    private static final String SUCCESS_BODY = "{\"AccessKeyId\":\"ACCESS_KEY_ID\",\"SecretAccessKey\":\"SECRET_ACCESS_KEY\","
            + "\"Token\":\"TOKEN_TOKEN_TOKEN\",\"Expiration\":\"3000-05-03T04:55:54Z\"}";

    private static URI endpoint;

    private static CustomRetryPolicy customRetryPolicy;

    private static EC2CredentialsUtils ec2CredentialsUtils;

    @Mock
    private ConnectionUtils mockConnection;

    @BeforeClass
    public static void setup() throws URISyntaxException {
        endpoint = new URI("http://localhost:" + mockServer.port() + CREDENTIALS_PATH);
        customRetryPolicy = new CustomRetryPolicy();
        ec2CredentialsUtils = EC2CredentialsUtils.getInstance();
    }

    /**
     * When a connection to end host cannot be opened, throws {@link IOException}.
     */
    @Test (expected = IOException.class)
    public void readResourceThrowsIOExceptionWhenNoConnection() throws IOException, URISyntaxException {
        int port = 0;
        try {
            port = SocketUtils.getUnusedPort();
        } catch (IOException ioexception) {
            fail("Unable to find an unused port");
        }

        ec2CredentialsUtils.readResource(new URI("http://localhost:" + port));
    }

    /**
     * When server returns with status code 200,
     * the test successfully returns the body from the response.
     */
    @Test
    public void readResouceReturnsResponseBodyFor200Response() throws IOException {
        generateStub(200, SUCCESS_BODY);

        assertEquals(SUCCESS_BODY, ec2CredentialsUtils.readResource(endpoint));
    }

    /**
     * When server returns with 404 status code,
     * the test should throw AmazonClientException.
     */
    @Test
    public void readResouceReturnsAceFor404ErrorResponse() throws Exception {
        try {
            ec2CredentialsUtils.readResource(new URI("http://localhost:" + mockServer.port() + "/dummyPath"));
            fail("Expected AmazonClientException");
        } catch (AmazonClientException ace) {
            assertTrue(ace.getMessage().contains("The requested metadata is not found at"));
        }
    }

    /**
     * When server returns a status code other than 200 and 404,
     * the test should throw AmazonServiceException. The request
     * is not retried.
     */
    @Test
    public void readResouceReturnsAseFor5xxResponse() throws IOException {
        generateStub(500, "{\"code\":\"500 Internal Server Error\",\"message\":\"ERROR_MESSAGE\"}");

        try {
            ec2CredentialsUtils.readResource(endpoint);
            fail("Expected AmazonServiceException");
        } catch (AmazonServiceException ase) {
            assertEquals(500, ase.getStatusCode());
            assertEquals("500 Internal Server Error", ase.getErrorCode());
            assertEquals("ERROR_MESSAGE", ase.getErrorMessage());
        }
    }

    /**
     * When server returns a status code other than 200 and 404
     * and error body message is not in Json format,
     * the test throws AmazonServiceException.
     */
    @Test
    public void readResouceNonJsonErrorBody() throws IOException {
        generateStub(500, "Non Json error body");

        try {
            ec2CredentialsUtils.readResource(endpoint);
            fail("Expected AmazonServiceException");
        } catch (AmazonServiceException ase) {
            assertEquals(500, ase.getStatusCode());
            assertNotNull(ase.getErrorMessage());
        }
    }

    /**
     * When readResource is called with default retry policy and IOException occurs,
     * the request is not retried.
     */
    @Test
    @SuppressWarnings("unchecked")
    public void readResouceWithDefaultRetryPolicy_DoesNotRetry_ForIoException() throws IOException {
        Mockito.when(mockConnection.connectToEndpoint(eq(endpoint), any(Map.class))).thenThrow(new IOException());

        try {
            new EC2CredentialsUtils(mockConnection).readResource(endpoint);
            fail("Expected an IOexception");
        } catch (IOException exception) {
            Mockito.verify(mockConnection, Mockito.times(1)).connectToEndpoint(eq(endpoint), any(Map.class));
        }
    }

    /**
     * When readResource is called with custom retry policy and IOException occurs,
     * the request is retried and the number of retries is equal to the value
     * returned by getMaxRetries method of the custom retry policy.
     */
    @Test
    @SuppressWarnings("unchecked")
    public void readResouceWithCustomRetryPolicy_DoesRetry_ForIoException() throws IOException {
        Mockito.when(mockConnection.connectToEndpoint(eq(endpoint), any(Map.class))).thenThrow(new IOException());

        try {
            new EC2CredentialsUtils(mockConnection).readResource(endpoint, customRetryPolicy, null);
            fail("Expected an IOexception");
        } catch (IOException exception) {
             Mockito.verify(mockConnection, Mockito.times(CustomRetryPolicy.MAX_RETRIES + 1)).connectToEndpoint(eq(endpoint), any(Map.class));
        }
    }

    /**
     * When readResource is called with custom retry policy
     * and the exception is not an IOException,
     * then the request is not retried.
     */
    @Test
    @SuppressWarnings("unchecked")
    public void readResouceWithCustomRetryPolicy_DoesNotRetry_ForNonIoException() throws IOException {
        generateStub(500, "Non Json error body");
        Mockito.when(mockConnection.connectToEndpoint(eq(endpoint), any(Map.class))).thenCallRealMethod();

        try {
            new EC2CredentialsUtils(mockConnection).readResource(endpoint, customRetryPolicy, new HashMap<String, String>());
            fail("Expected an AmazonServiceException");
        } catch (AmazonServiceException ase) {
            Mockito.verify(mockConnection, Mockito.times(1)).connectToEndpoint(eq(endpoint), any(Map.class));
        }
    }

    /**
     * When readResource is called,
     * the SDK User-Agent should be added.
     */
    @Test
    @SuppressWarnings("unchecked")
    public void readResouce_AddsSDKUserAgent() throws IOException {
        Mockito.when(mockConnection.connectToEndpoint(eq(endpoint), any(Map.class))).thenThrow(new IOException());

        try {
            new EC2CredentialsUtils(mockConnection).readResource(endpoint);
            fail("Expected an IOexception");
        } catch (IOException exception) {
            Matcher<Map<? extends String, ? extends String>> expectedHeaders = hasEntry("User-Agent", USER_AGENT);
            Mockito.verify(mockConnection, Mockito.times(1)).connectToEndpoint(eq(endpoint), (Map<String, String>) argThat(expectedHeaders));
        }
    }

    /**
     * When readResource is called with custom retry policy,
     * the SDK User-Agent should be added.
     */
    @Test
    @SuppressWarnings("unchecked")
    public void readResouceWithCustomRetryPolicy_AddsSDKUserAgent() throws IOException {
        Mockito.when(mockConnection.connectToEndpoint(eq(endpoint), any(Map.class))).thenThrow(new IOException());

        try {
            new EC2CredentialsUtils(mockConnection).readResource(endpoint, customRetryPolicy, null);
            fail("Expected an IOexception");
        } catch (IOException exception) {
            Matcher<Map<? extends String, ? extends String>> expectedHeaders = hasEntry("User-Agent", USER_AGENT);
            Mockito.verify(mockConnection, Mockito.times(CustomRetryPolicy.MAX_RETRIES + 1)).connectToEndpoint(eq(endpoint), (Map<String, String>) argThat(expectedHeaders));
        }
    }

    /**
     * When readResource is called with custom retry policy
     * and additional headers, the SDK User-Agent should be
     * added.
     */
    @Test
    @SuppressWarnings("unchecked")
    public void readResouceWithCustomRetryPolicyAndHeaders_AddsSDKUserAgent() throws IOException {
        Mockito.when(mockConnection.connectToEndpoint(eq(endpoint), any(Map.class))).thenThrow(new IOException());

        try {
            Map<String, String> headers = new HashMap<String, String>();
            headers.put("Foo","Bar");
            new EC2CredentialsUtils(mockConnection).readResource(endpoint, customRetryPolicy, headers);
            fail("Expected an IOexception");
        } catch (IOException exception) {
            Matcher<Map<? extends String, ? extends String>> expectedHeaders = allOf(
                hasEntry("User-Agent", USER_AGENT),
                hasEntry("Foo", "Bar")
            );
            Mockito.verify(mockConnection, Mockito.times(CustomRetryPolicy.MAX_RETRIES + 1)).connectToEndpoint(eq(endpoint), (Map<String, String>) argThat(expectedHeaders));
        }
    }

    private void generateStub(int statusCode, String message) {
        stubFor(
                get(urlPathEqualTo(CREDENTIALS_PATH))
                .withHeader("User-Agent", equalTo(VersionInfoUtils.getUserAgent()))
                .willReturn(aResponse()
                                .withStatus(statusCode)
                                .withHeader("Content-Type", "application/json")
                                .withHeader("charset", "utf-8")
                                .withBody(message)));
    }

    /**
     * Retry policy that retries only if a request fails with an IOException.
     */
    private static class CustomRetryPolicy implements CredentialsEndpointRetryPolicy {

        private static final int MAX_RETRIES = 3;

        @Override
        public boolean shouldRetry(int retriesAttempted, CredentialsEndpointRetryParameters retryParams) {

            if (retriesAttempted >= MAX_RETRIES) {
                return false;
            }

            if (retryParams.getException() != null && retryParams.getException() instanceof IOException) {
                return true;
            }

            return false;
        }

    }

}

