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

import static com.amazonaws.util.ValidationUtils.assertNotNull;

/**
 * Implementation of {@link RetryPolicy} that combines an individual {@link RetryCondition} and {@link BackoffStrategy}.
 */
public class SimpleRetryPolicy implements RetryPolicy {

    private final RetryCondition retryCondition;
    private final BackoffStrategy backoffStrategy;

    public SimpleRetryPolicy(RetryCondition retryCondition, BackoffStrategy backoffStrategy) {
        this.retryCondition = assertNotNull(retryCondition, "retryCondition");
        this.backoffStrategy = assertNotNull(backoffStrategy, "backoffStrategy");
    }

    @Override
    public long computeDelayBeforeNextRetry(RetryPolicyContext context) {
        return backoffStrategy.computeDelayBeforeNextRetry(context);
    }

    @Override
    public boolean shouldRetry(RetryPolicyContext context) {
        return retryCondition.shouldRetry(context);
    }
}
