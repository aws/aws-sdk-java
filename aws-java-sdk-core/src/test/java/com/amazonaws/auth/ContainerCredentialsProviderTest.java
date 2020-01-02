/*
 * Copyright 2011-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.internal.CredentialsEndpointProvider;
import com.github.tomakehurst.wiremock.junit.WireMockRule;

/**
 * Tests for the ContainerCredentialsProvider.
 */
public class ContainerCredentialsProviderTest {
    @ClassRule
    public static WireMockRule mockServer = new WireMockRule(0);

    /** Environment variable name for the AWS ECS Container credentials path */
    private static final String CREDENTIALS_PATH = "/dummy/credentials/path";

    private static final String ACCESS_KEY_ID = "ACCESS_KEY_ID";

    private static final String SECRET_ACCESS_KEY = "SECRET_ACCESS_KEY";

    private static final String TOKEN = "TOKEN_TOKEN_TOKEN";

    private static final String EXPIRATION_DATE = "3000-05-03T04:55:54Z";

    private static ContainerCredentialsProvider containerCredentialsProvider;

    @BeforeClass
    public static void setup() {
        containerCredentialsProvider = new ContainerCredentialsProvider(new TestCredentialsEndpointProvider("http://localhost:" + mockServer.port()));
    }

    @Before
    public void refreshCredentials() {
        containerCredentialsProvider.refresh();
    }

    /**
     * Tests that when "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI" is not set,
     * throws an AmazonClientException.
     */
    @Test (expected = AmazonClientException.class)
    public void testEnvVariableNotSet() {
        ContainerCredentialsProvider credentialsProvider = new ContainerCredentialsProvider();
        credentialsProvider.getCredentials();
    }

    /**
     * Tests that the getCredentials parses the response properly when
     * it receives a valid 200 response from endpoint.
     */
    @Test
    public void testGetCredentialsReturnsValidResponseFromEcsEndpoint() {
        stubForSuccessResponse();

        BasicSessionCredentials credentials = (BasicSessionCredentials) containerCredentialsProvider.getCredentials();

        Assert.assertEquals(ACCESS_KEY_ID, credentials.getAWSAccessKeyId());
        Assert.assertEquals(SECRET_ACCESS_KEY, credentials.getAWSSecretKey());
        Assert.assertEquals(TOKEN, credentials.getSessionToken());
        Assert.assertEquals(new DateTime(EXPIRATION_DATE).toDate(), containerCredentialsProvider.getCredentialsExpiration());
    }

    /**
     * Tests that the getCredentials won't leak credentials data if the response from ECS is corrupted.
     */
    @Test
    public void getCredentialsWithCorruptResponseDoesNotIncludeCredentialsInExceptionMessage() {
        stubForCorruptedSuccessResponse();

        try {
            containerCredentialsProvider.getCredentials();
            Assert.fail();
        } catch (Exception e) {
            String stackTrace = ExceptionUtils.getStackTrace(e);
            Assert.assertFalse(stackTrace.contains("ACCESS_KEY_ID"));
            Assert.assertFalse(stackTrace.contains("SECRET_ACCESS_KEY"));
            Assert.assertFalse(stackTrace.contains("TOKEN_TOKEN_TOKEN"));
        }
    }

    /**
     * Tests when the response is 404 Not found,
     * then getCredentials method throws an AmazonClientException.
     */
    @Test
    public void testGetCredentialsThrowsAceFor404ErrorResponse() {
        stubForErrorResponse(404);
        try {
            containerCredentialsProvider.getCredentials();
            fail("The test should throw an exception");
        } catch (AmazonClientException exception) {
             assertNotNull(exception.getMessage());
        }
    }

    /**
     * Tests when the request to http endpoint returns a non-200 or non-404 response,
     * then getCredentials method throws an AmazonServiceException.
     */
    @Test
    public void testGetCredentialsThrowsAseForNon200AndNon404ErrorResponse() {
        stubForErrorResponse(401);

        try {
            containerCredentialsProvider.getCredentials();
            fail("The test should have thrown an exception");
        } catch (AmazonServiceException exception) {
            assertEquals(401, exception.getStatusCode());
            assertNotNull(exception.getMessage());
        }
    }

    private void stubForSuccessResponse() {
        stubFor200Response(getSuccessfulBody());
    }

    private void stubForCorruptedSuccessResponse() {
        String body = getSuccessfulBody();
        stubFor200Response(body.substring(0, body.length() - 2));
    }

    private void stubFor200Response(String body) {
        stubFor(get(urlPathEqualTo(CREDENTIALS_PATH))
                        .willReturn(aResponse()
                                            .withStatus(200)
                                            .withHeader("Content-Type", "application/json")
                                            .withHeader("charset", "utf-8")
                                            .withBody(body)));
    }

    private String getSuccessfulBody() {
        return "{\"AccessKeyId\":\"ACCESS_KEY_ID\"," +
               "\"SecretAccessKey\":\"SECRET_ACCESS_KEY\"," +
               "\"Token\":\"TOKEN_TOKEN_TOKEN\"," +
               "\"Expiration\":\"3000-05-03T04:55:54Z\"}";
    }

    private void stubForErrorResponse(int statusCode) {
        stubFor(
                get(urlPathEqualTo(CREDENTIALS_PATH))
                .willReturn(aResponse()
                                .withStatus(statusCode)
                                .withHeader("Content-Type", "application/json")
                                .withHeader("charset", "utf-8")
                                .withBody("{\"code\":\"" + statusCode + "\",\"message\":\"DetailedErrorMessage\"}")));
    }

    /**
     * Dummy CredentialsPathProvider that overrides the endpoint
     * and connects to the WireMock server.
     */
    private static class TestCredentialsEndpointProvider extends CredentialsEndpointProvider {

        private final String host;

        public TestCredentialsEndpointProvider(String host) {
            this.host = host;
        }

        @Override
        public URI getCredentialsEndpoint() {
            return URI.create(host + CREDENTIALS_PATH);
        }
    }
}
