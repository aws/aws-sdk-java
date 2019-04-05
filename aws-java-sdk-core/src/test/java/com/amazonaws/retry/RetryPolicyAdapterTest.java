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
package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.retry.v2.RetryPolicyContext;
import com.amazonaws.retry.v2.RetryPolicyContexts;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RetryPolicyAdapterTest {

    @Mock
    private RetryPolicy.RetryCondition retryCondition;

    @Mock
    private RetryPolicy.BackoffStrategy backoffStrategy;

    private RetryPolicy legacyPolicy;

    private ClientConfiguration clientConfiguration = new ClientConfiguration().withMaxErrorRetry(10);

    private RetryPolicyAdapter adapter;

    @Before
    public void setup() {
        legacyPolicy = new RetryPolicy(retryCondition, backoffStrategy, 3, false);
        adapter = new RetryPolicyAdapter(legacyPolicy, clientConfiguration);
    }

    @Test
    public void getLegacyRetryPolicy_ReturnsSamePolicy() {
        assertEquals(legacyPolicy, adapter.getLegacyRetryPolicy());
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullRetryPolicy_ThrowsException() {
        new RetryPolicyAdapter(null, clientConfiguration);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullClientConfiguration_ThrowsException() {
        new RetryPolicyAdapter(legacyPolicy, null);
    }

    @Test
    public void computeDelayBeforeNextRetry_DelegatesToLegacyPolicy() {
        final RetryPolicyContext context = RetryPolicyContexts.LEGACY;
        adapter.computeDelayBeforeNextRetry(context);

        verify(backoffStrategy).delayBeforeNextRetry(
                eq((AmazonWebServiceRequest) context.originalRequest()),
                eq((AmazonClientException) context.exception()),
                eq(context.retriesAttempted()));
    }

    @Test
    public void shouldRetry_MaxErrorRetryReached() {
        assertFalse(adapter.shouldRetry(RetryPolicyContexts.withRetriesAttempted(3)));
    }

    @Test
    public void shouldRetry_MaxErrorInClientConfigHonored_DoesNotUseMaxErrorInPolicy() {
        when(retryCondition.shouldRetry(any(AmazonWebServiceRequest.class), any(AmazonClientException.class), anyInt()))
                .thenReturn(true);
        legacyPolicy = new RetryPolicy(retryCondition, backoffStrategy, 3, true);
        adapter = new RetryPolicyAdapter(legacyPolicy, clientConfiguration);
        assertTrue(adapter.shouldRetry(RetryPolicyContexts.withRetriesAttempted(3)));
        assertFalse(adapter.shouldRetry(RetryPolicyContexts.withRetriesAttempted(10)));
    }

    @Test
    public void shouldRetry_MaxErrorNotExceeded_DelegatesToLegacyRetryCondition() {
        final RetryPolicyContext context = RetryPolicyContexts.LEGACY;
        adapter.shouldRetry(context);

        verify(retryCondition).shouldRetry(
                eq((AmazonWebServiceRequest) context.originalRequest()),
                eq((AmazonClientException) context.exception()),
                eq(context.retriesAttempted()));
    }

}