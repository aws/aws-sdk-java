/*
 * Copyright 2011-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.put;
import static com.github.tomakehurst.wiremock.client.WireMock.putRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.profile.internal.BasicProfileConfigFileLoader;
import com.amazonaws.profile.path.AwsProfileFileLocationProvider;
import com.amazonaws.util.VersionInfoUtils;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.stubbing.Scenario;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import utils.TestProfileFileLocationProvider;

@RunWith(MockitoJUnitRunner.class)
public class InstanceMetadataServiceResourceFetcherTest {

    public static final BasicProfileConfigFileLoader CONFIG_FILE_LOADER = BasicProfileConfigFileLoader.INSTANCE;
    @ClassRule
    public static WireMockRule mockServer = new WireMockRule(0);

    private static final String TOKEN_PATH = "/latest/api/token";
    private static final String CREDENTIALS_PATH = "/dummy/credentials/path";

    private static final String SUCCESS_BODY = "{\"AccessKeyId\":\"ACCESS_KEY_ID\",\"SecretAccessKey\":\"SECRET_ACCESS_KEY\","
            + "\"Token\":\"TOKEN_TOKEN_TOKEN\",\"Expiration\":\"3000-05-03T04:55:54Z\"}";
    private static final String TOKEN = "123456789";

    private static URI endpoint;
    private static URI tokenEndpoint;

    private static InstanceMetadataServiceResourceFetcher resourceFetcher;

    @Mock
    private ConnectionUtils mockConnection;

    @BeforeClass
    public static void setup() throws URISyntaxException {
        tokenEndpoint = new URI("http://localhost:" + mockServer.port() + TOKEN_PATH);
        endpoint = new URI("http://localhost:" + mockServer.port() + CREDENTIALS_PATH);
        resourceFetcher = InstanceMetadataServiceResourceFetcher.getInstance();
        System.setProperty(SDKGlobalConfiguration.EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY,
            "http://localhost:" + mockServer.port());
    }

    @Before
    public void methodSetup() {
        System.clearProperty(SDKGlobalConfiguration.AWS_EC2_METADATA_V1_DISABLED_SYSTEM_PROPERTY);
    }

    @AfterClass
    public static void cleanUp() {
        System.clearProperty(SDKGlobalConfiguration.EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY);
    }

    @Test
    public void metadataDisabled_shouldThrowException() {
        System.setProperty(SDKGlobalConfiguration.AWS_EC2_METADATA_DISABLED_SYSTEM_PROPERTY, "true");
        try {
            resourceFetcher.readResource(endpoint);
            fail("no exception");
        } catch (AmazonClientException exception) {
            assertTrue(exception.getMessage().contains("EC2 Instance Metadata Service is disabled"));
        }
        System.clearProperty(SDKGlobalConfiguration.AWS_EC2_METADATA_DISABLED_SYSTEM_PROPERTY);
    }

    @Test
    public void token200_shouldSendToken() {
        generateSuccessfulTokenStub();
        generateStub(200, SUCCESS_BODY);

        assertEquals(SUCCESS_BODY, resourceFetcher.readResource(endpoint));
        verifySecureWorkflowHeaders();
    }

    @Test
    public void token404_shouldFallbackInsecureWorkflow() {
        generateErrorTokenStub(404);
        generateStub(200, SUCCESS_BODY);

        assertEquals(SUCCESS_BODY, resourceFetcher.readResource(endpoint));
        verifyInsecureWorkflowHeaders();
    }

    @Test
    public void tokenNonRetryableError_shouldFallbackInsecureWorkflow() {
        generateErrorTokenStub(405);
        generateStub(200, SUCCESS_BODY);

        assertEquals(SUCCESS_BODY, resourceFetcher.readResource(endpoint));
        verifyInsecureWorkflowHeaders();
    }

    @Test
    public void token400_shouldThrowException() {
        generateErrorTokenStub(400);

        try {
            resourceFetcher.readResource(endpoint);
            fail("no exception");
        } catch (AmazonServiceException exception) {
           assertEquals(exception.getStatusCode(), 400);
        }
        verify(putRequestedFor(urlPathEqualTo(TOKEN_PATH)).withHeader("x-aws-ec2-metadata-token-ttl-seconds", equalTo("21600")));
    }

    @Test
    public void token503_shouldThrowException() {
        generateErrorTokenStub(503);

        try {
            resourceFetcher.readResource(endpoint);
            fail("no exception");
        } catch (AmazonServiceException exception) {
            assertEquals(exception.getStatusCode(), 503);
        }
        verify(putRequestedFor(urlPathEqualTo(TOKEN_PATH)).withHeader("x-aws-ec2-metadata-token-ttl-seconds", equalTo("21600")));
    }

    @Test
    public void token403_shouldFallbackInsecureWorkflow() {
        generateErrorTokenStub(403);
        generateStub(200, SUCCESS_BODY);

        assertEquals(SUCCESS_BODY, resourceFetcher.readResource(endpoint));
        verifyInsecureWorkflowHeaders();
    }

    @Test
    public void tokenTimeoutException_shouldFallbackInsecureWorkflow() throws IOException {
        generateStub(200, SUCCESS_BODY);
        Mockito.when(mockConnection.connectToEndpoint(eq(tokenEndpoint), any(Map.class), eq("PUT")))
               .thenThrow(new SocketTimeoutException());

        Mockito.when(mockConnection.connectToEndpoint(eq(endpoint), any(Map.class), eq("GET")))
               .thenCallRealMethod();

        assertEquals(SUCCESS_BODY, new InstanceMetadataServiceResourceFetcher(mockConnection, CONFIG_FILE_LOADER).readResource(endpoint));
        verify(getRequestedFor(urlPathEqualTo(CREDENTIALS_PATH)).withoutHeader("x-aws-ec2-metadata-token"));
    }

    @Test
    public void tokenOtherIOException_shouldThrowException() throws IOException {
        IOException ioException = new IOException("foobar");
        Mockito.when(mockConnection.connectToEndpoint(eq(tokenEndpoint), any(Map.class), eq("PUT"))).thenThrow(ioException);

        try {
            new InstanceMetadataServiceResourceFetcher(mockConnection, CONFIG_FILE_LOADER).readResource(endpoint);
            fail("no exception");
        } catch (SdkClientException exception) {
            assertEquals(exception.getCause(), ioException);
        }
    }

    @Test
    public void token404_v1FallbackDisabled_shouldThrowException() throws IOException {
        generateErrorTokenStub(404);
        generateStub(200, SUCCESS_BODY);
        System.setProperty(SDKGlobalConfiguration.AWS_EC2_METADATA_V1_DISABLED_SYSTEM_PROPERTY, "true");

        try {
            assertEquals(SUCCESS_BODY, resourceFetcher.readResource(endpoint));
            fail("no exception");
        } catch (AmazonClientException exception) {
            assertEquals("Failed to retrieve IMDS token, and fallback to IMDS v1 is disabled via the " +
                            "AWS_EC2_METADATA_V1_DISABLED environment variable and/or " +
                            "com.amazonaws.sdk.disableEc2MetadataV1 system property " +
                            "and/or ec2_metadata_v1_disabled profile property.",
                    exception.getMessage());
        }
    }

    @Test
    public void tokenNonRetryableError_v1FallbackDisabled_shouldThrowException() {
        generateErrorTokenStub(405);
        generateStub(200, SUCCESS_BODY);
        System.setProperty(SDKGlobalConfiguration.AWS_EC2_METADATA_V1_DISABLED_SYSTEM_PROPERTY, "true");

        try {
            assertEquals(SUCCESS_BODY, resourceFetcher.readResource(endpoint));
            fail("no exception");
        } catch (AmazonClientException exception) {
            assertEquals("Failed to retrieve IMDS token, and fallback to IMDS v1 is disabled via the " +
                            "AWS_EC2_METADATA_V1_DISABLED environment variable and/or " +
                            "com.amazonaws.sdk.disableEc2MetadataV1 system property and/or ec2_metadata_v1_disabled profile property.",
                    exception.getMessage());
        }
    }

    @Test
    public void token403_v1FallbackDisabled_shouldThrowException() {
        generateErrorTokenStub(403);
        generateStub(200, SUCCESS_BODY);
        System.setProperty(SDKGlobalConfiguration.AWS_EC2_METADATA_V1_DISABLED_SYSTEM_PROPERTY, "true");

        try {
            assertEquals(SUCCESS_BODY, resourceFetcher.readResource(endpoint));
            fail("no exception");
        } catch (AmazonClientException exception) {
            assertEquals("Failed to retrieve IMDS token, and fallback to IMDS v1 is disabled via the " +
                            "AWS_EC2_METADATA_V1_DISABLED environment variable and/or " +
                            "com.amazonaws.sdk.disableEc2MetadataV1 system property and/or ec2_metadata_v1_disabled profile property.",
                    exception.getMessage());
        }
    }

    @Test
    public void tokenTimeoutException_v1FallbackDisabled_shouldThrowException() throws IOException {
        generateStub(200, SUCCESS_BODY);
        Mockito.when(mockConnection.connectToEndpoint(eq(tokenEndpoint), any(Map.class), eq("PUT")))
                .thenThrow(new SocketTimeoutException());

        Mockito.when(mockConnection.connectToEndpoint(eq(endpoint), any(Map.class), eq("GET")))
                .thenCallRealMethod();

        System.setProperty(SDKGlobalConfiguration.AWS_EC2_METADATA_V1_DISABLED_SYSTEM_PROPERTY, "true");

        try {
            assertEquals(SUCCESS_BODY,
                    new InstanceMetadataServiceResourceFetcher(mockConnection, CONFIG_FILE_LOADER).readResource(endpoint));
            fail("no exception");
        } catch (AmazonClientException exception) {
            assertEquals("Failed to retrieve IMDS token, and fallback to IMDS v1 is disabled via the " +
                            "AWS_EC2_METADATA_V1_DISABLED environment variable and/or " +
                            "com.amazonaws.sdk.disableEc2MetadataV1 system property and/or ec2_metadata_v1_disabled profile property.",
                    exception.getMessage());
        }
    }

    @Test
    public void tokenNonRetryableError_v1FallbackDisabledInProfilePath_shouldThrowException() throws IOException {
        AwsProfileFileLocationProvider profileFileLocationProvider =
                new TestProfileFileLocationProvider("Ec2MetadataV1Disabled.tst", "/resources/profileconfig/");
        BasicProfileConfigFileLoader configFileLoader = new BasicProfileConfigFileLoader(profileFileLocationProvider);

        generateStub(200, SUCCESS_BODY);
        Mockito.when(mockConnection.connectToEndpoint(eq(tokenEndpoint), any(Map.class), eq("PUT")))
                .thenThrow(new SocketTimeoutException());
        Mockito.when(mockConnection.connectToEndpoint(eq(endpoint), any(Map.class), eq("GET")))
                .thenCallRealMethod();

        // Even if the system setting is set to false, the profile file will still be checked.
        System.setProperty(SDKGlobalConfiguration.AWS_EC2_METADATA_V1_DISABLED_SYSTEM_PROPERTY, "false");
        try {
            new InstanceMetadataServiceResourceFetcher(mockConnection,configFileLoader)
                    .readResource(endpoint);
            fail("no exception");
        } catch (AmazonClientException exception) {
            assertEquals("Failed to retrieve IMDS token, and fallback to IMDS v1 is disabled via the" +
                            " AWS_EC2_METADATA_V1_DISABLED environment variable" +
                            " and/or com.amazonaws.sdk.disableEc2MetadataV1 system property and/or ec2_metadata_v1_disabled profile property.",
                    exception.getMessage());
        }
    }

    @Test
    public void tokenNonRetryableError_whenV1FallbackNotDisabledInProfilePath_shouldFallbackToInsecureWorkflow() throws IOException {
        generateErrorTokenStub(405);
        generateStub(200, SUCCESS_BODY);
        Mockito.when(mockConnection.connectToEndpoint(eq(tokenEndpoint), any(Map.class), eq("PUT")))
                .thenThrow(new SocketTimeoutException());
        Mockito.when(mockConnection.connectToEndpoint(eq(endpoint), any(Map.class), eq("GET")))
                .thenCallRealMethod();

        AwsProfileFileLocationProvider profileFileLocationProvider =
                new TestProfileFileLocationProvider("Ec2MetadataV1Enabled.tst", "/resources/profileconfig/");
        BasicProfileConfigFileLoader configFileLoader = new BasicProfileConfigFileLoader(profileFileLocationProvider);

        System.setProperty(SDKGlobalConfiguration.AWS_EC2_METADATA_V1_DISABLED_SYSTEM_PROPERTY, "false");
        assertEquals(SUCCESS_BODY, new InstanceMetadataServiceResourceFetcher(mockConnection,configFileLoader).readResource(endpoint));
    }

    @Test
    public void metadataNonRetryableError_shouldThrowException() {
        generateSuccessfulTokenStub();
        generateStub(404, "");

        try {
            resourceFetcher.readResource(endpoint);
            fail("no exception");
        } catch (SdkClientException exception) {
            assertTrue(exception.getMessage().contains("The requested metadata is not found at"));
        }
        verifySecureWorkflowHeaders();
    }

    @Test
    public void metadata500_shouldThrowException() {
        generateSuccessfulTokenStub();
        generateStub(500, "{\"code\":\"500 Internal Server Error\",\"message\":\"ERROR_MESSAGE\"}");

        try {
            resourceFetcher.readResource(endpoint);
            fail("Expected AmazonServiceException");
        } catch (AmazonServiceException ase) {
            assertEquals(500, ase.getStatusCode());
            assertEquals("500 Internal Server Error", ase.getErrorCode());
            assertEquals("ERROR_MESSAGE", ase.getErrorMessage());
        }
    }

    @Test
    public void metadata401_shouldThrowException() throws IOException {
        generateSuccessfulTokenStub();
        generateStub(401, "{\"code\":\"401 Unauthorized\",\"message\":\"ERROR_MESSAGE\"}");

        try {
            resourceFetcher.readResource(endpoint);
            fail("Expected AmazonServiceException");
        } catch (AmazonServiceException ase) {
            assertEquals(401, ase.getStatusCode());
            assertEquals("401 Unauthorized", ase.getErrorCode());
            assertEquals("ERROR_MESSAGE", ase.getErrorMessage());
        }
    }

    private void generateSuccessfulTokenStub() {
        stubFor(
            put(urlPathEqualTo(TOKEN_PATH))
                .withHeader("User-Agent", equalTo(VersionInfoUtils.getUserAgent()))
                .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/plain")
                                .withHeader("X-aws-ec2-metadata-token-ttl-seconds", "21600")
                                .withBody(TOKEN)));
    }

    private void generateErrorTokenStub(int statusCode) {
        stubFor(
            put(urlPathEqualTo(TOKEN_PATH))
                .withHeader("User-Agent", equalTo(VersionInfoUtils.getUserAgent()))
                .willReturn(aResponse()
                                .withStatus(statusCode)));
    }

    private void generateErrorTokenStub(int statusCode, String message) {
        stubFor(
            put(urlPathEqualTo(TOKEN_PATH))
                .withHeader("User-Agent", equalTo(VersionInfoUtils.getUserAgent()))
                .willReturn(aResponse()
                                .withStatus(statusCode)
                                .withBody(message)));
    }

    private void generateRetrySucceedTokenStub() {
        stubFor(
            put(urlPathEqualTo(TOKEN_PATH))
                .withHeader("User-Agent", equalTo(VersionInfoUtils.getUserAgent()))
                .inScenario("retry at 503")
                .whenScenarioStateIs(Scenario.STARTED)
                .willSetStateTo("first attempt")
                .willReturn(aResponse()
                                .withStatus(503)));

        stubFor(
            put(urlPathEqualTo(TOKEN_PATH))
                .withHeader("User-Agent", equalTo(VersionInfoUtils.getUserAgent()))
                .inScenario("retry at 503")
                .whenScenarioStateIs("first attempt")
                .willSetStateTo("second attempt")
                .willReturn(aResponse()
                                .withStatus(200)
                                .withBody(TOKEN)));
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

    private void verifySecureWorkflowHeaders() {
        verify(putRequestedFor(urlPathEqualTo(TOKEN_PATH)).withHeader("x-aws-ec2-metadata-token-ttl-seconds", equalTo("21600")));
        verify(getRequestedFor(urlPathEqualTo(CREDENTIALS_PATH)).withHeader("x-aws-ec2-metadata-token", equalTo(TOKEN)));
    }

    private void verifyInsecureWorkflowHeaders() {
        verify(putRequestedFor(urlPathEqualTo(TOKEN_PATH)).withHeader("x-aws-ec2-metadata-token-ttl-seconds", equalTo("21600")));
        verify(getRequestedFor(urlPathEqualTo(CREDENTIALS_PATH)).withoutHeader("x-aws-ec2-metadata-token"));
    }

}

