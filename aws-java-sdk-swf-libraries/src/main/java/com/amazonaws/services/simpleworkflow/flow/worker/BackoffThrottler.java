/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.worker;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Used to throttle code execution in presence of failures using exponential
 * backoff logic. The formula used to calculate the next sleep interval is:
 * 
 * <pre>
 * min(pow(backoffCoefficient, failureCount - 1) * initialSleep, maxSleep);
 * </pre>
 * <p>
 * Example usage:
 * 
 * <pre>
 * BackoffThrottler throttler = new BackoffThrottler(1000, 60000, 2);
 * while(!stopped) {
 *     try {
 *         throttler.throttle();
 *         // some code that can fail and should be throttled
 *         ...
 *         throttler.success();
 *     }
 *     catch (Exception e) {
 *         throttler.failure();
 *     }
 * }
 * </pre>
 * 
 * @author fateev
 */
public class BackoffThrottler {

    private final long initialSleep;

    private final long maxSleep;

    private final double backoffCoefficient;

    private final AtomicLong failureCount = new AtomicLong();

    /**
     * Construct an instance of the throttler.
     * 
     * @param initialSleep
     *            time to sleep on the first failure
     * @param maxSleep
     *            maximum time to sleep independently of number of failures
     * @param backoffCoefficient
     *            coefficient used to calculate the next time to sleep.
     */
    public BackoffThrottler(long initialSleep, long maxSleep, double backoffCoefficient) {
        this.initialSleep = initialSleep;
        this.maxSleep = maxSleep;
        this.backoffCoefficient = backoffCoefficient;
    }

    private long calculateSleepTime() {
        double sleepMillis = (Math.pow(backoffCoefficient, failureCount.get() - 1)) * initialSleep;
        return Math.min((long) sleepMillis, maxSleep);
    }

    /**
     * Sleep if there were failures since the last success call.
     * 
     * @throws InterruptedException
     */
    public void throttle() throws InterruptedException {
        if (failureCount.get() > 0) {
            Thread.sleep(calculateSleepTime());
        }
    }

    /**
     * Resent failure count to 0.
     */
    public void success() {
        failureCount.set(0);
    }

    /**
     * Increment failure count.
     */
    public void failure() {
        failureCount.incrementAndGet();
    }

}
