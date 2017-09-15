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
package com.amazonaws.http;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.SDKGlobalTime;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.util.DateUtils;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import java.net.URI;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.Date;

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

public class AmazonHttpClientClockSkewErrorTest {
    @Rule
    public WireMockRule mockServer = new WireMockRule(0);

    private static final int HOUR_IN_SECONDS = 3600;
    private static final int HOUR_IN_MS = HOUR_IN_SECONDS * 1000;
    private static final String RESOURCE_PATH = "/transaction-id/";

    @Before
    public void setUp() {
        Date skewedDate = new Date(System.currentTimeMillis() - HOUR_IN_MS);

        stubFor(get(urlEqualTo(RESOURCE_PATH))
                .willReturn(aResponse()
                            .withStatus(500)
                            .withHeader("Date", DateUtils.formatRFC822Date(skewedDate))));
        SDKGlobalTime.setGlobalTimeOffset(0);
    }

    @Test
    public void globalTimeOffset_IsAdjusted_WhenClockSkewErrorHappens_And_RequestIsNotRetried() throws Exception {
        ClientConfiguration config = new ClientConfiguration();
        config.setRetryPolicy(PredefinedRetryPolicies.NO_RETRY_POLICY);

        AmazonHttpClient httpClient = new AmazonHttpClient(config);
        executeRequest(httpClient);

        // Asserts global time offset is adjusted by atleast an hour
        assertTrue(SDKGlobalTime.getGlobalTimeOffset() >= HOUR_IN_SECONDS);
        assertTrue(httpClient.getTimeOffset() >= HOUR_IN_SECONDS);
    }

    @Test
    public void globalTimeOffset_IsAdjusted_WhenClockSkewErrorHappens_And_RequestIsRetried() throws Exception {

        AmazonHttpClient httpClient = new AmazonHttpClient(new ClientConfiguration());
        executeRequest(httpClient);

        // Asserts global time offset is adjusted by atleast an hour
        assertTrue(SDKGlobalTime.getGlobalTimeOffset() >= HOUR_IN_SECONDS);
        assertTrue(httpClient.getTimeOffset() >= HOUR_IN_SECONDS);
    }

    @SuppressWarnings("unchecked")
    private void executeRequest(AmazonHttpClient httpClient) throws Exception {
        try {
            HttpResponseHandler<AmazonWebServiceResponse<String>> responseHandler = mock(HttpResponseHandler.class);
            httpClient.execute(newGetRequest(RESOURCE_PATH), responseHandler, stubErrorHandler(), new ExecutionContext());
            fail("Expected exception");
        } catch (AmazonServiceException expected) {
            assertEquals("RequestTimeTooSkewed", expected.getErrorCode());
        }
    }

    private HttpResponseHandler<AmazonServiceException> stubErrorHandler() throws Exception {
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

    private Request<?> newGetRequest(String resourcePath) {
        Request<?> request = new DefaultRequest<String>("mock");
        request.setEndpoint(URI.create("http://localhost:" + mockServer.port() + resourcePath));
        request.setHttpMethod(HttpMethodName.GET);
        return request;
    }
}
