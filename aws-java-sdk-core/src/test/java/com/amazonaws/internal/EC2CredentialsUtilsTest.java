/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.github.tomakehurst.wiremock.junit.WireMockRule;

import utils.http.SocketUtils;

public class EC2CredentialsUtilsTest {

    @ClassRule
    public static WireMockRule mockServer = new WireMockRule(0);

    private static final String CREDENTIALS_PATH = "/dummy/credentials/path";

    private static final String SUCCESS_BODY = "{\"AccessKeyId\":\"ACCESS_KEY_ID\",\"SecretAccessKey\":\"SECRET_ACCESS_KEY\","
            + "\"Token\":\"TOKEN_TOKEN_TOKEN\",\"Expiration\":\"3000-05-03T04:55:54Z\"}";

    private static URI endpoint;

    @BeforeClass
    public static void setup() throws URISyntaxException {
        endpoint = new URI("http://localhost:" + mockServer.port() + CREDENTIALS_PATH);
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

        EC2CredentialsUtils.readResource(new URI("http://localhost:" + port));
    }

    /**
     * When server returns with status code 200,
     * the test successfully returns the body from the response.
     */
    @Test
    public void readResouceReturnsResponseBodyFor200Response() throws IOException {
        generateStub(200, SUCCESS_BODY);

        assertEquals(SUCCESS_BODY, EC2CredentialsUtils.readResource(endpoint));
    }

    /**
     * When server returns with 404 status code,
     * the test should throw AmazonClientException.
     */
    @Test
    public void readResouceReturnsAceFor404ErrorResponse() throws Exception {
        try {
            EC2CredentialsUtils.readResource(new URI("http://localhost:" + mockServer.port() + "/dummyPath"));
            fail("Expected AmazonClientException");
        } catch (AmazonClientException ace) {
            assertTrue(ace.getMessage().contains("The requested metadata is not found at"));
        }
    }

    /**
     * When server returns a status code other than 200 and 404,
     * the test should throw AmazonServiceException.
     */
    @Test
    public void readResouceReturnsAseFor5xxResponse() throws IOException {
        generateStub(500, "{\"code\":\"500 Internal Server Error\",\"message\":\"ERROR_MESSAGE\"}");

        try {
            EC2CredentialsUtils.readResource(endpoint);
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
            EC2CredentialsUtils.readResource(endpoint);
            fail("Expected AmazonServiceException");
        } catch (AmazonServiceException ase) {
            assertEquals(500, ase.getStatusCode());
            assertNotNull(ase.getErrorMessage());
        }
    }

    private void generateStub(int statusCode, String message) {
        stubFor(
                get(urlPathEqualTo(CREDENTIALS_PATH))
                .willReturn(aResponse()
                                .withStatus(statusCode)
                                .withHeader("Content-Type", "application/json")
                                .withHeader("charset", "utf-8")
                                .withBody(message)));
    }

}
