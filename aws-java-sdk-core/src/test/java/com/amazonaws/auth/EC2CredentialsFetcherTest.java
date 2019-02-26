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
package com.amazonaws.auth;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.CredentialsEndpointProvider;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.IOUtils;
import com.github.tomakehurst.wiremock.junit.WireMockRule;

public class EC2CredentialsFetcherTest {

    @ClassRule
    public static WireMockRule mockServer = new WireMockRule(0);

    /** One minute (in milliseconds) */
    private static final long ONE_MINUTE = 1000L * 60;

    /** Environment variable name for the AWS ECS Container credentials path */
    private static final String CREDENTIALS_PATH = "/dummy/credentials/path";

    private static String successResponse;

    private static String successResponseWithInvalidBody;

    @BeforeClass
    public static void setup() throws IOException {
        successResponse = IOUtils.toString(EC2CredentialsFetcherTest.class.getResourceAsStream("/resources/wiremock/successResponse.json"));
        successResponseWithInvalidBody = IOUtils.toString(EC2CredentialsFetcherTest.class.getResourceAsStream("/resources/wiremock/successResponseWithInvalidBody.json"));
    }


    /** Tests that the credentials provider reloads credentials appropriately */
    @Test
    public void testNeedsToLoadCredentialsMethod() throws Exception {
        TestCredentialsProvider credentialsProvider = new TestCredentialsProvider();

        // The provider should not refresh credentials when they aren't close to expiring and are recent
        stubForSuccessResonseWithCustomExpirationDate(200, DateUtils.formatISO8601Date(new Date(System.currentTimeMillis() + ONE_MINUTE * 60 * 24)).toString());
        credentialsProvider.getCredentials();
        assertFalse(credentialsProvider.needsToLoadCredentials());

        // The provider should refresh credentials when they aren't close to expiring, but are more than an hour old
        stubForSuccessResonseWithCustomExpirationDate(200, DateUtils.formatISO8601Date(new Date(System.currentTimeMillis() + ONE_MINUTE * 16)).toString());
        credentialsProvider.getCredentials();
        credentialsProvider.setLastInstanceProfileCheck(new Date(System.currentTimeMillis() - ONE_MINUTE * 61));
        assertTrue(credentialsProvider.needsToLoadCredentials());

        // The provider should refresh credentials when they are close to expiring
        stubForSuccessResonseWithCustomExpirationDate(200, DateUtils.formatISO8601Date(new Date(System.currentTimeMillis() + ONE_MINUTE * 14)).toString());
        credentialsProvider.getCredentials();
        assertTrue(credentialsProvider.needsToLoadCredentials());
    }

    /**
     * Test that loadCredentials returns proper credentials when response from client is in proper Json format.
     */
    @Test
    public void testLoadCredentialsParsesJsonResponseProperly() {
        stubForSuccessResponseWithCustomBody(200, successResponse);

         TestCredentialsProvider credentialsProvider = new TestCredentialsProvider();
         AWSSessionCredentials credentials = (AWSSessionCredentials) credentialsProvider.getCredentials();

         assertEquals("ACCESS_KEY_ID",     credentials.getAWSAccessKeyId());
         assertEquals("SECRET_ACCESS_KEY", credentials.getAWSSecretKey());
         assertEquals("TOKEN_TOKEN_TOKEN", credentials.getSessionToken());
    }

    /**
     * Test that when credentials are null and response from client does not have access key/secret key,
     * throws AmazonClientException.
     */
    @Test
    public void testLoadCredentialsThrowsAceWhenClientResponseDontHaveKeys() {
        // Stub for success response but without keys in the response body
        stubForSuccessResponseWithCustomBody(200, successResponseWithInvalidBody);

        TestCredentialsProvider credentialsProvider = new TestCredentialsProvider();

        try {
            credentialsProvider.getCredentials();
            fail("Expected an AmazonClientException");
        } catch (AmazonClientException ace) {
            assertEquals("Unable to load credentials.", ace.getMessage());
        }
    }

    /**
     * Tests how the credentials provider behaves when the
     * server is not running.
     */
    @Test
    public void testNoMetadataService() throws Exception {
        stubForErrorResponse();

        TestCredentialsProvider credentialsProvider = new TestCredentialsProvider();

        // When there are no credentials, the provider should throw an exception if we can't connect
        try {
            credentialsProvider.getCredentials();
            fail("Expected an AmazonClientException, but wasn't thrown");
        } catch (AmazonClientException ace) {
            assertNotNull(ace.getMessage());
        }

        // When there are valid credentials (but need to be refreshed) and the endpoint returns 404 status,
        // the provider should throw an exception.
        stubForSuccessResonseWithCustomExpirationDate(200, new Date(System.currentTimeMillis() + ONE_MINUTE * 4).toString());
        credentialsProvider.getCredentials(); // loads the credentials that will be expired soon
        credentialsProvider.setLastInstanceProfileCheck(new Date(System.currentTimeMillis() - (ONE_MINUTE * 61)));
        stubForErrorResponse();  // Behaves as if server is unavailable.
        try {
            credentialsProvider.getCredentials();
            fail("Expected an AmazonClientException, but wasn't thrown");
        } catch (AmazonClientException ace) {
            assertNotNull(ace.getMessage());
        }
    }

    private void stubForSuccessResponseWithCustomBody(int statusCode, String body) {
        stubFor(
                get(urlPathEqualTo(CREDENTIALS_PATH))
                .willReturn(aResponse()
                                .withStatus(statusCode)
                                .withHeader("Content-Type", "application/json")
                                .withHeader("charset", "utf-8")
                                .withBody(body)));
    }

    private void stubForSuccessResonseWithCustomExpirationDate(int statusCode, String expiration) {
        stubFor(
                get(urlPathEqualTo(CREDENTIALS_PATH))
                .willReturn(aResponse()
                                .withStatus(statusCode)
                                .withHeader("Content-Type", "application/json")
                                .withHeader("charset", "utf-8")
                                .withBody("{\"AccessKeyId\":\"ACCESS_KEY_ID\",\"SecretAccessKey\":\"SECRET_ACCESS_KEY\","
                                        + "\"Expiration\":\"" + expiration + "\"}")));
    }

    private void stubForErrorResponse() {
        stubFor(
                get(urlPathEqualTo(CREDENTIALS_PATH))
                .willReturn(aResponse()
                                .withStatus(404)
                                .withHeader("Content-Type", "application/json")
                                .withHeader("charset", "utf-8")
                                .withBody("{\"code\":\"404 Not Found\",\"message\":\"DetailedErrorMessage\"}")));
    }


    private static class TestCredentialsProvider extends EC2CredentialsFetcher {
        public TestCredentialsProvider() {
            super(new TestCredentialsEndpointProvider("http://localhost:" + mockServer.port()));
        }

        public void setLastInstanceProfileCheck(Date lastInstanceProfileCheck) {
            this.lastInstanceProfileCheck = lastInstanceProfileCheck;
        }
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
        public URI getCredentialsEndpoint() throws URISyntaxException {
            return new URI(host + CREDENTIALS_PATH);
        }
    }

}
