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
 * Simple backoff strategy that always uses a fixed delay.
 */
public class FixedDelayBackoffStrategy implements BackoffStrategy {

    private final int fixedBackoff;

    public FixedDelayBackoffStrategy(int fixedBackoff) {
        this.fixedBackoff = assertIsPositive(fixedBackoff, "fixedBackoff");
    }

    @Override
    public long computeDelayBeforeNextRetry(RetryPolicyContext context) {
        return fixedBackoff;
    }
}
