/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.any;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.put;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.amazonaws.SDKGlobalConfiguration;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.stubbing.Scenario;
import java.net.URISyntaxException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

public class EC2MetadataUtilsFaultTest {
    private static final String TOKEN = "123456789";
    private static final String DUMMY_PATH = "/dummy/path";

    @ClassRule
    public static WireMockRule mockServer = new WireMockRule(0);

    private static final String TOKEN_PATH = "/latest/api/token";

    @After
    public void clearWireMock() {
        mockServer.resetMappings();
    }

    @BeforeClass
    public static void setup() throws URISyntaxException {
        System.setProperty(
            SDKGlobalConfiguration.EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY,
            "http://localhost:" + mockServer.port());
    }

    @AfterClass
    public static void cleanUp() {
        System.clearProperty(SDKGlobalConfiguration.EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY);
    }

    @Test
    public void ioException_retrySucceed_shouldReturnData() {
        generateReadTimeoutRetrySucceedTokenStub();
        List<String> items = EC2MetadataUtils.getItems(DUMMY_PATH);
        assertNotNull(items);
        assertEquals("helloworld", items.get(0));
        WireMock.verify(2, getRequestedFor(urlPathEqualTo(DUMMY_PATH)));
    }

    @Test
    public void ioException_allRetryAttemptsFail_shouldReturnNull() {
        generateReadTimedoutStub();
        List<String> items = EC2MetadataUtils.getItems(DUMMY_PATH);
        assertNull(items);
        WireMock.verify(4, getRequestedFor(urlPathEqualTo(DUMMY_PATH)));
    }

    @Test
    public void serverErrors_retrySucceeded_shouldReturnNull() {
        generate500RetrySucceedTokenStub();
        List<String> items = EC2MetadataUtils.getItems(DUMMY_PATH);
        assertNotNull(items);
        assertEquals("helloworld", items.get(0));
        WireMock.verify(2, getRequestedFor(urlPathEqualTo(DUMMY_PATH)));
    }

    private void generateReadTimeoutRetrySucceedTokenStub() {
        generateSuccessfulTokenStub();
        stubFor(
            any(urlPathEqualTo(DUMMY_PATH))
                .withHeader("User-Agent", equalTo(VersionInfoUtils.getUserAgent()))
                .inScenario("retry at read time out")
                .whenScenarioStateIs(Scenario.STARTED)
                .willSetStateTo("first attempt")
                .willReturn(aResponse().withFixedDelay(1200)));

        stubFor(
            any(urlPathEqualTo(DUMMY_PATH))
                .withHeader("User-Agent", equalTo(VersionInfoUtils.getUserAgent()))
                .inScenario("retry at read time out")
                .whenScenarioStateIs("first attempt")
                .willSetStateTo("second attempt")
                .willReturn(aResponse()
                                .withStatus(200)
                                .withBody("helloworld")));
    }

    private void generate500RetrySucceedTokenStub() {
        generateSuccessfulTokenStub();
        stubFor(
            any(urlPathEqualTo(DUMMY_PATH))
                .withHeader("User-Agent", equalTo(VersionInfoUtils.getUserAgent()))
                .inScenario("retry at 500")
                .whenScenarioStateIs(Scenario.STARTED)
                .willSetStateTo("first attempt")
                .willReturn(aResponse().withStatus(500)));

        stubFor(
            any(urlPathEqualTo(DUMMY_PATH))
                .withHeader("User-Agent", equalTo(VersionInfoUtils.getUserAgent()))
                .inScenario("retry at 500")
                .whenScenarioStateIs("first attempt")
                .willSetStateTo("second attempt")
                .willReturn(aResponse()
                                .withStatus(200)
                                .withBody("helloworld")));
    }

    private void generateReadTimedoutStub() {
        generateSuccessfulTokenStub();
        stubFor(
            any(urlPathEqualTo(DUMMY_PATH))
                .withHeader("User-Agent", equalTo(VersionInfoUtils.getUserAgent()))
                .willReturn(aResponse().withFixedDelay(1200)));
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

}
