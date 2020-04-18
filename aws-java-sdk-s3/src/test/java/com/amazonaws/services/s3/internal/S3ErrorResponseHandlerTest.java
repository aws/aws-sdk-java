/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

import static org.junit.Assert.*;

import org.apache.http.HttpStatus;

import org.junit.Test;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.StringInputStream;

public class S3ErrorResponseHandlerTest {

    private static final String PROXY_HOST = "someHost";
    private static final String SERVICE_NAME = "someService";

    @Test
    public void handle_withProxy_withRequestId() throws Exception {
        ClientConfiguration conf = new ClientConfiguration();
        conf.setProxyHost(PROXY_HOST);
        S3ErrorResponseHandler responseHandler = new S3ErrorResponseHandler(conf);
        HttpResponse httpResponse = new HttpResponse(new DefaultRequest<String>(SERVICE_NAME), null);
        httpResponse.setStatusCode(HttpStatus.SC_FORBIDDEN);
        httpResponse.setContent(new StringInputStream(
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Error>"
                + "  <RequestId>1234</RequestId>"
                + "</Error>"));
        AmazonServiceException e = responseHandler.handle(httpResponse);
        assertNotNull(e);
        assertEquals(PROXY_HOST, e.getProxyHost());
        assertNotNull(e.getMessage());
        assertFalse(e.getMessage().contains(PROXY_HOST));
    }

    @Test
    public void handle_withProxy_withoutRequestId() throws Exception {
        ClientConfiguration conf = new ClientConfiguration();
        conf.setProxyHost(PROXY_HOST);
        S3ErrorResponseHandler responseHandler = new S3ErrorResponseHandler(conf);
        HttpResponse httpResponse = new HttpResponse(new DefaultRequest<String>(SERVICE_NAME), null);
        httpResponse.setStatusCode(HttpStatus.SC_FORBIDDEN);
        AmazonServiceException e = responseHandler.handle(httpResponse);
        assertNotNull(e);
        assertEquals(PROXY_HOST, e.getProxyHost());
        assertNotNull(e.getMessage());
        assertTrue(e.getMessage().contains(PROXY_HOST));
    }

    @Test
    public void handle_withoutProxy() throws Exception {
        ClientConfiguration conf = new ClientConfiguration();
        S3ErrorResponseHandler responseHandler = new S3ErrorResponseHandler(conf);
        HttpResponse httpResponse = new HttpResponse(new DefaultRequest<String>(SERVICE_NAME), null);
        httpResponse.setStatusCode(HttpStatus.SC_FORBIDDEN);
        AmazonServiceException e = responseHandler.handle(httpResponse);
        assertNotNull(e);
        assertNull(e.getProxyHost());
        assertNotNull(e.getMessage());
        assertFalse(e.getMessage().contains(PROXY_HOST));
    }
}
