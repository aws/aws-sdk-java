/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.http.AmazonHttpClient.HEADER_SDK_RETRY_INFO;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.containing;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static org.junit.Assert.fail;

import org.apache.log4j.BasicConfigurator;
import org.junit.Test;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.retry.RetryPolicy;

import utils.http.WireMockTestBase;
import utils.retry.AlwaysRetryCondition;
import utils.retry.SimpleArrayBackoffStrategy;

public class RetryCountInUserAgentTest extends WireMockTestBase {

    private static final int[] BACKOFF_VALUES = new int[] { 0, 10, 20 };

    private static final String RESOURCE_PATH = "/user-agent/";

    @Test
    public void retriedRequest_AppendsCorrectRetryCountInUserAgent() throws Exception {
        BasicConfigurator.configure();
        stubFor(get(urlEqualTo(RESOURCE_PATH)).willReturn(aResponse().withStatus(500)));

        executeRequest();

        verify(1, getRequestedFor(urlEqualTo(RESOURCE_PATH)).withHeader(HEADER_SDK_RETRY_INFO, containing("0/0/")));
        verify(1, getRequestedFor(urlEqualTo(RESOURCE_PATH)).withHeader(HEADER_SDK_RETRY_INFO, containing("1/0/")));
        verify(1, getRequestedFor(urlEqualTo(RESOURCE_PATH)).withHeader(HEADER_SDK_RETRY_INFO, containing("2/10/")));
        verify(1, getRequestedFor(urlEqualTo(RESOURCE_PATH)).withHeader(HEADER_SDK_RETRY_INFO, containing("3/20/")));
    }

    @Test
    public void retriedRequest_AppendsCorrectRetryCountInUserAgent_throttlingEnabled() throws Exception {
        BasicConfigurator.configure();
        stubFor(get(urlEqualTo(RESOURCE_PATH)).willReturn(aResponse().withStatus(500)));

        executeRequest();

        verify(1, getRequestedFor(urlEqualTo(RESOURCE_PATH)).withHeader(HEADER_SDK_RETRY_INFO, containing("0/0/500")));
        verify(1, getRequestedFor(urlEqualTo(RESOURCE_PATH)).withHeader(HEADER_SDK_RETRY_INFO, containing("1/0/495")));
        verify(1, getRequestedFor(urlEqualTo(RESOURCE_PATH)).withHeader(HEADER_SDK_RETRY_INFO, containing("2/10/490")));
        verify(1, getRequestedFor(urlEqualTo(RESOURCE_PATH)).withHeader(HEADER_SDK_RETRY_INFO, containing("3/20/485")));
    }

    private void executeRequest() throws Exception {
        AmazonHttpClient httpClient = new AmazonHttpClient(
                new ClientConfiguration().withRetryPolicy(buildRetryPolicy())
                .withThrottledRetries(true));
        try {
            httpClient.requestExecutionBuilder().request(newGetRequest(RESOURCE_PATH)).errorResponseHandler(stubErrorHandler()).execute();
            fail("Expected exception");
        } catch (AmazonServiceException expected) {
        }
    }

    public RetryPolicy buildRetryPolicy() {
        RetryPolicy policy = new RetryPolicy(new AlwaysRetryCondition(), new SimpleArrayBackoffStrategy(BACKOFF_VALUES),
                3, false);
        return policy;
    }

}
