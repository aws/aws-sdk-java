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

import static com.amazonaws.http.AmazonHttpClient.HEADER_SDK_TRANSACTION_ID;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.findAll;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.github.tomakehurst.wiremock.verification.LoggedRequest;

import utils.http.WireMockTestBase;

public class SdkTransactionIdInHeaderTest extends WireMockTestBase {

    private static final String RESOURCE_PATH = "/transaction-id/";

    @Test
    public void retriedRequest_HasSameTransactionIdForAllRetries() throws Exception {
        stubFor(get(urlEqualTo(RESOURCE_PATH)).willReturn(aResponse().withStatus(500)));
        executeRequest();
        assertTransactionIdIsUnchangedAcrossRetries();
    }

    private void assertTransactionIdIsUnchangedAcrossRetries() {
        String previousTransactionId = null;
        for (LoggedRequest request : findAll(getRequestedFor(urlEqualTo(RESOURCE_PATH)))) {
            final String currentTransactionId = request.getHeader(HEADER_SDK_TRANSACTION_ID);
            // Transaction ID should always be set
            assertNotNull(currentTransactionId);
            // Transaction ID should be the same across retries
            if (previousTransactionId != null) {
                assertEquals(previousTransactionId, currentTransactionId);
            }
            previousTransactionId = currentTransactionId;
        }
    }

    private void executeRequest() throws Exception {
        AmazonHttpClient httpClient = new AmazonHttpClient(new ClientConfiguration());
        try {
            httpClient.requestExecutionBuilder().request(newGetRequest(RESOURCE_PATH)).errorResponseHandler(stubErrorHandler()).execute();
            fail("Expected exception");
        } catch (AmazonServiceException expected) {
        }
    }

}
