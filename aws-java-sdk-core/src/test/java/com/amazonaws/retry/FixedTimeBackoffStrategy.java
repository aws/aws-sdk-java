/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.retry.RetryPolicy.BackoffStrategy;

/**
 * Test implementation of {@link BackoffStrategy} to wait a fixed time between retries
 */
public class FixedTimeBackoffStrategy implements BackoffStrategy {

    private final long fixedTimeDelay;

    public FixedTimeBackoffStrategy(long fixedTimeDelay) {
        this.fixedTimeDelay = fixedTimeDelay;
    }

    @Override
    public long delayBeforeNextRetry(AmazonWebServiceRequest originalRequest,
                                     AmazonClientException exception,
                                     int retriesAttempted) {
        return this.fixedTimeDelay;
    }

}