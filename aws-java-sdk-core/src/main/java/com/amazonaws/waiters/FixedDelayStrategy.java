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

public class FixedDelayStrategy implements PollingStrategy.DelayStrategy{

    /**
     * Represents default delay time in seconds
     */
    private final int defaultDelayInSeconds;

    /**
     * Constructs a new FixedDelayStrategy with the given
     * default delay time
     *
     * @param defaultDelayInSeconds
     */
    public FixedDelayStrategy(int defaultDelayInSeconds) {
        this.defaultDelayInSeconds = defaultDelayInSeconds;
    }

    /**
     * Defines a default way of delaying the polling bound by
     * the default delay associated with the corresponding
     * waiter definition
     *
     * @param pollingStrategyContext Provides the polling context required to define custom delay
     * @throws InterruptedException
     */
    @Override
    public void delayBeforeNextRetry(PollingStrategyContext pollingStrategyContext) throws InterruptedException {
        Thread.sleep(defaultDelayInSeconds * 1000);
    }
}
