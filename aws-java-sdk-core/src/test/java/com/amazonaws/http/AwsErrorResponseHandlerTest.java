
/*
 * Copyright 2020-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.util.AWSRequestMetrics;
import org.apache.http.HttpStatus;
import org.junit.Test;

public class AwsErrorResponseHandlerTest {

    private static final String ERROR_MESSAGE = "someErrorMessage";
    private static final String PROXY_HOST = "someHost";
    private static final String REQUEST_ID = "1234";
    private static final String SERVICE_NAME = "someService";

    @Test
    public void handle_withProxy() throws Exception {
        HttpResponseHandler<AmazonServiceException> delegate = mock(HttpResponseHandler.class);
        AmazonServiceException ase = new AmazonServiceException(ERROR_MESSAGE);
        ase.setRequestId(REQUEST_ID);
        when(delegate.handle(any(HttpResponse.class))).thenReturn(ase);
        AWSRequestMetrics awsRequestMetrics = mock(AWSRequestMetrics.class);
        ClientConfiguration conf = new ClientConfiguration();
        conf.setProxyHost(PROXY_HOST);
        AwsErrorResponseHandler responseHandler = new AwsErrorResponseHandler(delegate, awsRequestMetrics, conf);
        HttpResponse httpResponse = new HttpResponse(new DefaultRequest<String>(SERVICE_NAME), null);
        httpResponse.setStatusCode(HttpStatus.SC_FORBIDDEN);
        AmazonServiceException e = responseHandler.handle(httpResponse);
        assertNotNull(e);
        assertEquals(PROXY_HOST, e.getProxyHost());
        assertNotNull(e.getMessage());
        assertTrue(e.getMessage().contains("Proxy: " + PROXY_HOST));
    }

    @Test
    public void handle_withoutProxy() throws Exception {
        HttpResponseHandler<AmazonServiceException> delegate = mock(HttpResponseHandler.class);
        AmazonServiceException ase = new AmazonServiceException(ERROR_MESSAGE);
        when(delegate.handle(any(HttpResponse.class))).thenReturn(ase);
        AWSRequestMetrics awsRequestMetrics = mock(AWSRequestMetrics.class);
        ClientConfiguration conf = new ClientConfiguration();
        AwsErrorResponseHandler responseHandler = new AwsErrorResponseHandler(delegate, awsRequestMetrics, conf);
        HttpResponse httpResponse = new HttpResponse(new DefaultRequest<String>(SERVICE_NAME), null);
        httpResponse.setStatusCode(HttpStatus.SC_FORBIDDEN);
        AmazonServiceException e = responseHandler.handle(httpResponse);
        assertNotNull(e);
        assertNull(e.getProxyHost());
        assertNotNull(e.getMessage());
        assertTrue(e.getMessage().contains("Proxy: null"));
    }
}