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
package com.amazonaws.http;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.SDKGlobalTime;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.util.DateUtils;
import java.util.Date;
import org.junit.Test;
import utils.http.WireMockTestBase;

public class AmazonHttpClientClockSkewErrorTest extends WireMockTestBase {

    private static final String RESOURCE_PATH = "/transaction-id/";
    private long hour = 3600 * 1000;
    private Date skewedDate = new Date(System.currentTimeMillis() - hour);

    @Test
    public void globalTimeOffset_IsAdjusted_WhenClockSkewErrorHappens_And_RequestIsNotRetried() throws Exception {
        stub(500, skewedDate);

        ClientConfiguration config = new ClientConfiguration();
        config.setRetryPolicy(PredefinedRetryPolicies.NO_RETRY_POLICY);

        executeRequest(config);


        // Asserts global time offset is adjusted by atleast an hour
        assertTrue(SDKGlobalTime.getGlobalTimeOffset() >= 3600);
    }

    @Test
    public void globalTimeOffset_IsAdjusted_WhenClockSkewErrorHappens_And_RequestIsRetried() throws Exception {
        stub(500, skewedDate);

        ClientConfiguration config = new ClientConfiguration();

        executeRequest(config);

        // Asserts global time offset is adjusted by atleast an hour
        assertTrue(SDKGlobalTime.getGlobalTimeOffset() >= 3600);
    }

    @Test
    public void globalTimeOffset_IsAdjusted_When403ClockSkewErrorHappens() throws Exception {
        stub(403, skewedDate);

        executeRequest(new ClientConfiguration());

        // Asserts global time offset is adjusted by atleast an hour
        assertTrue(SDKGlobalTime.getGlobalTimeOffset() >= 3600);
    }

    private void executeRequest(ClientConfiguration clientConfiguration) throws Exception {
        AmazonHttpClient httpClient = new AmazonHttpClient(clientConfiguration);
        try {
            httpClient.requestExecutionBuilder().request(newGetRequest(RESOURCE_PATH))
                    .errorResponseHandler(stubErrorHandler())
                    .execute();
            fail("Expected exception");
        } catch (AmazonServiceException expected) {
            assertEquals("RequestTimeTooSkewed", expected.getErrorCode());
        }
    }

    @Override
    protected HttpResponseHandler<AmazonServiceException> stubErrorHandler() throws Exception {
        HttpResponseHandler<AmazonServiceException> errorHandler = mock(JsonErrorResponseHandler.class);
        when(errorHandler.handle(any(HttpResponse.class))).thenReturn(createClockSkewException());
        return errorHandler;
    }

    private AmazonServiceException createClockSkewException() {
        AmazonServiceException exception = new AmazonServiceException("clock skew error");
        exception.setErrorCode("RequestTimeTooSkewed");
        exception.setStatusCode(500);

        return exception;
    }

    private void stub(int errorCode, Date skewedDate) {
        stubFor(get(urlEqualTo(RESOURCE_PATH))
                        .willReturn(aResponse()
                                            .withStatus(errorCode)
                                            .withHeader("Date", DateUtils.formatRFC822Date(skewedDate))));
    }
}
