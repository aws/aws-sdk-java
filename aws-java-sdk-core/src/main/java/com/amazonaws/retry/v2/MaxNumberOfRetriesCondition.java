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

import static com.amazonaws.util.ValidationUtils.assertIsPositive;

/**
 * Simple retry condition that allows retries up to a certain max number of retries.
 */
public class MaxNumberOfRetriesCondition implements RetryCondition {

    private final int maxNumberOfRetries;

    public MaxNumberOfRetriesCondition(int maxNumberOfRetries) {
        this.maxNumberOfRetries = assertIsPositive(maxNumberOfRetries, "maxNumberOfRetries");
    }

    @Override
    public boolean shouldRetry(RetryPolicyContext context) {
        return context.retriesAttempted() < maxNumberOfRetries;
    }
}
