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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SimpleRetryPolicyTest {

    @Mock
    private RetryCondition retryCondition;

    @Mock
    private BackoffStrategy backoffStrategy;

    @Test(expected = IllegalArgumentException.class)
    public void nullRetryCondition_ThrowsException() {
        new SimpleRetryPolicy(null, backoffStrategy);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullBackoffStrategy_ThrowsException() {
        new SimpleRetryPolicy(retryCondition, null);
    }

    @Test
    public void shouldRetry_DelegatesToRetryCondition() {
        RetryPolicy policy = new SimpleRetryPolicy(retryCondition, backoffStrategy);
        policy.shouldRetry(RetryPolicyContexts.EMPTY);

        verify(retryCondition).shouldRetry(RetryPolicyContexts.EMPTY);
    }

    @Test
    public void delay_DelegatesToBackoffStrategy() {
        RetryPolicy policy = new SimpleRetryPolicy(retryCondition, backoffStrategy);
        policy.computeDelayBeforeNextRetry(RetryPolicyContexts.EMPTY);

        verify(backoffStrategy).computeDelayBeforeNextRetry(RetryPolicyContexts.EMPTY);

    }

}