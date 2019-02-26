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
package com.amazonaws.retry.v2;

import com.amazonaws.DefaultRequest;
import com.amazonaws.SdkClientException;

import org.junit.Test;

import utils.model.EmptyAmazonWebServiceRequest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RetryPolicyContextTest {

    @Test
    public void totalRequests_IsOneMoreThanRetriesAttempted() {
        assertEquals(4, RetryPolicyContexts.withRetriesAttempted(3).totalRequests());
    }

    @Test
    public void nullHttpStatusCodeAllowed() {
        assertNull(RetryPolicyContexts.withStatusCode(null).httpStatusCode());
    }

    @Test
    public void nullExceptionAllowed() {
        assertNull(RetryPolicyContexts.withException(null).exception());
    }

    @Test
    public void buildFully() {
        final EmptyAmazonWebServiceRequest origRequest = new EmptyAmazonWebServiceRequest();
        final DefaultRequest<EmptyAmazonWebServiceRequest> request =
                new DefaultRequest<EmptyAmazonWebServiceRequest>(origRequest, "foo");
        final SdkClientException exception = new SdkClientException("boom");
        final RetryPolicyContext context = RetryPolicyContext.builder()
                .retriesAttempted(3)
                .httpStatusCode(400)
                .request(request)
                .exception(exception)
                .originalRequest(origRequest)
                .build();


        assertEquals(3, context.retriesAttempted());
        assertEquals(Integer.valueOf(400), context.httpStatusCode());
        assertEquals(request, context.request());
        assertEquals(exception, context.exception());
        assertEquals(origRequest, context.originalRequest());
    }

}