/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.waiters;

public class MaxAttemptsRetryStrategy implements PollingStrategy.RetryStrategy {

    /**
     * Represents default number of maximum attempts allowed
     * for polling
     */
    private final int defaultMaxAttempts;

    /**
     * Constructs a new MaxAttemptsRetryStrategy with the given
     * default number of attempts
     *
     * @param defaultMaxAttempts
     */
    public MaxAttemptsRetryStrategy(int defaultMaxAttempts) {
        this.defaultMaxAttempts = defaultMaxAttempts;
    }

    /**
     * Default way of checking if polling should be retried
     * or fast failed
     *
     * @param pollingStrategyContext Provides the polling context required to make the retry decision
     * @return false if the number of re
     */
    @Override
    public boolean shouldRetry(PollingStrategyContext pollingStrategyContext) {
        return pollingStrategyContext.getRetriesAttempted() < defaultMaxAttempts;
    }
}
