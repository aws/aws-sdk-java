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

public class PollingStrategy{

    /**
     * Condition on whether polling should be retried.
     */
    private final RetryStrategy retryStrategy;

    /**
     * Delay strategy to control the sleep time between retry attempts.
     */
    private final DelayStrategy delayStrategy;

    /**
     * Constructs a new PollingStrategy with RetryStrategy
     * and DelayStrategy defined
     *
     * @param retryStrategy Retry condition on whether polling should be retried.
     *                      If null value is specified, the SDK' default retry
     *                      condition is used.
     */
    public PollingStrategy(RetryStrategy retryStrategy, DelayStrategy delayStrategy) {
        this.retryStrategy = retryStrategy;
        this.delayStrategy = delayStrategy;
    }

    /**
     * Returns the retry condition included in this Polling Strategy.
     *
     * @return The retry condition included in this Polling Strategy.
     */
    RetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    /**
     * Returns the delay strategy included in this Polling Strategy.
     *
     * @return The delay strategy included in this Polling Strategy.
     */
    DelayStrategy getDelayStrategy() {
        return this.delayStrategy;
    }

    /**
     * The hook for providing custom condition on whether polling of a resource
     * should be retried.
     */
    public interface RetryStrategy {
        /**
         * Returns whether polling of a resource should be retried according to the
         * given polling context.
         *
         * @param pollingStrategyContext Provides the polling context required to make the retry decision
         * @return True if it should be retried.
         * @see PollingStrategyContext
         */
        boolean shouldRetry(PollingStrategyContext pollingStrategyContext);
    }

    /**
     * The hook for providing custom delay strategy to control the sleep time
     * between retries.
     */
    public interface DelayStrategy {

        /**
         * Defines the custom delay strategy to control the sleep time
         *
         * @param pollingStrategyContext Provides the polling context required to define custom delay
         * @throws InterruptedException
         * @see PollingStrategyContext
         */
        void delayBeforeNextRetry(PollingStrategyContext pollingStrategyContext) throws InterruptedException;

    }
}
