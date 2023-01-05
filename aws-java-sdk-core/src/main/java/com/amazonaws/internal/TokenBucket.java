/*
 * Copyright 2011-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.internal;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;

@SdkInternalApi
public class TokenBucket {
    private static final double MIN_FILL_RATE = 0.5;
    private static final double MIN_CAPACITY = 1.0;

    private static final double SMOOTH = 0.8;
    private static final double BETA = 0.7;
    private static final double SCALE_CONSTANT = 0.4;

    private final Clock clock;

    private Double fillRate;
    private Double maxCapacity;
    private double currentCapacity;
    private Double lastTimestamp;
    private boolean enabled;
    private double measuredTxRate;
    private double lastTxRateBucket;
    private long requestCount;
    private double lastMaxRate;
    private double lastThrottleTime;

    private double timeWindow;

    public interface Clock {
        double time();
    }

    public TokenBucket() {
        clock = new DefaultClock();
        initialize();
    }

    @SdkTestInternalApi
    TokenBucket(Clock clock) {
        this.clock = clock;
        initialize();
    }

    /**
     *
     * Acquire tokens from the bucket. If the bucket contains enough capacity
     * to satisfy the request, this method will return immediately, otherwise
     * the method will block the calling thread until enough tokens are refilled.
     * <p>
     * <pre>
     * _TokenBucketAcquire(amount)
     *   # Client side throttling is not enabled until we see a throttling error.
     *   if not enabled
     *     return
     *
     *   _TokenBucketRefill()
     *   # Next see if we have enough capacity for the requested amount.
     *   if amount <= current_capacity
     *     current_capacity = current_capacity - amount
     *   else
     *     sleep((amount - current_capacity) / fill_rate)
     *     current_capacity = current_capacity - amount
     *   return
     * </pre>
     * <p>
     * This is equivalent to {@code acquire(amount, false)}.
     *
     * @param amount The amount of tokens to acquire.
     *
     * @return Whether the amount was successfully acquired.
     */
    public boolean acquire(double amount) {
        return acquire(amount, false);
    }
    /**
     *
     * Acquire tokens from the bucket. If the bucket contains enough capacity
     * to satisfy the request, this method will return immediately. Otherwise,
     * the behavior depends on the value of {@code fastFail}. If it is {@code
     * true}, then it will return {@code false} immediately, signaling that
     * enough capacity could not be acquired. Otherwise if {@code fastFail} is
     * {@code false}, then it will wait the required amount of time to fill the
     * bucket with enough tokens to satisfy {@code amount}.
     * <pre>
     * _TokenBucketAcquire(amount)
     *   # Client side throttling is not enabled until we see a throttling error.
     *   if not enabled
     *     return
     *
     *   _TokenBucketRefill()
     *   # Next see if we have enough capacity for the requested amount.
     *   if amount <= current_capacity
     *     current_capacity = current_capacity - amount
     *   else
     *     sleep((amount - current_capacity) / fill_rate)
     *     current_capacity = current_capacity - amount
     *   return
     * </pre>
     *
     * @param amount The amount of tokens to acquire.
     * @param fastFail Whether this method should return immediately instead
     *                 of waiting if {@code amount} exceeds the current
     *                 capacity.
     *
     * @return Whether the amount was successfully acquired.
     */
    public boolean acquire(double amount, boolean fastFail) {
        double waitTime = 0.0;

        synchronized (this) {
            // If rate limiting is not enabled, we technically have an uncapped limit
            if (!enabled) {
                return true;
            }

            refill();

            double originalCapacity = currentCapacity;
            double unfulfilled = tryAcquireCapacity(amount);

            if (unfulfilled > 0.0 && fastFail) {
                currentCapacity = originalCapacity;
                return false;
            }

            // If all the tokens couldn't be acquired immediately, wait enough
            // time to fill the remainder.
            if (unfulfilled > 0) {
                waitTime = unfulfilled / fillRate;
            }
        }

        if (waitTime > 0) {
            sleep(waitTime);
        }

        return true;
    }



    /**
     *
     * @param amount The amount of capacity to acquire from the bucket.
     * @return The unfulfilled amount.
     */
    double tryAcquireCapacity(double amount) {
        double result;
        if (amount <= currentCapacity) {
            result = 0;
        } else {
            result = amount - currentCapacity;
        }
        currentCapacity = currentCapacity - amount;
        return result;
    }

    private void initialize() {
        fillRate = null;
        maxCapacity = null;
        currentCapacity = 0.0;
        lastTimestamp = null;
        enabled = false;
        measuredTxRate = 0.0;
        lastTxRateBucket = Math.floor(clock.time());
        requestCount = 0;
        lastMaxRate = 0.0;
        lastThrottleTime = clock.time();
    }

    /**
     * <pre>
     * _TokenBucketRefill()
     *   timestamp = time()
     *   if last_timestamp is unset
     *     last_timestamp = timestamp
     *     return
     *   fill_amount = (timestamp - last_timestamp) * fill_rate
     *   current_capacity = min(max_capacity, current_capacity + fill_amount)
     *   last_timestamp = timestamp
     * </pre>
     */
    // Package private for testing
    synchronized void refill() {
        double timestamp = clock.time();
        if (lastTimestamp == null) {
            lastTimestamp = timestamp;
            return;
        }

        double fillAmount = (timestamp - lastTimestamp) * fillRate;
        currentCapacity = Math.min(maxCapacity, currentCapacity + fillAmount);
        lastTimestamp = timestamp;
    }

    /**
     * <pre>
     * _TokenBucketUpdateRate(new_rps)
     *   # Refill based on our current rate before we update to the new fill rate.
     *   _TokenBucketRefill()
     *   fill_rate = max(new_rps, MIN_FILL_RATE)
     *   max_capacity = max(new_rps, MIN_CAPACITY)
     *   # When we scale down we can't have a current capacity that exceeds our
     *   # max_capacity.
     *   current_capacity = min(current_capacity, max_capacity)
     * </pre>
     */
    private synchronized void updateRate(double newRps) {
        refill();
        fillRate = Math.max(newRps, MIN_FILL_RATE);
        maxCapacity = Math.max(newRps, MIN_CAPACITY);
        currentCapacity = Math.min(currentCapacity, maxCapacity);
    }

    /**
     * <pre>
     * t = time()
     * time_bucket = floor(t * 2) / 2
     * request_count = request_count + 1
     * if time_bucket > last_tx_rate_bucket
     *   current_rate = request_count / (time_bucket - last_tx_rate_bucket)
     *   measured_tx_rate = (current_rate * SMOOTH) + (measured_tx_rate * (1 - SMOOTH))
     *   request_count = 0
     *   last_tx_rate_bucket = time_bucket
     * </pre>
     */
    private synchronized void updateMeasuredRate() {
        double t = clock.time();
        double timeBucket = Math.floor(t * 2) / 2;
        requestCount = requestCount + 1;
        if (timeBucket > lastTxRateBucket) {
            double currentRate = requestCount / (timeBucket - lastTxRateBucket);
            measuredTxRate = (currentRate * SMOOTH) + (measuredTxRate * (1 - SMOOTH));
            requestCount = 0;
            lastTxRateBucket = timeBucket;
        }
    }

    synchronized void enable() {
        enabled = true;
    }

    /**
     * <pre>
     * _UpdateClientSendingRate(response)
     *   _UpdateMeasuredRate()
     *
     *   if IsThrottlingError(response)
     *     if not enabled
     *       rate_to_use = measured_tx_rate
     *     else
     *       rate_to_use = min(measured_tx_rate, fill_rate)
     *
     *     # The fill_rate is from the token bucket.
     *     last_max_rate = rate_to_use
     *     _CalculateTimeWindow()
     *     last_throttle_time = time()
     *     calculated_rate = _CUBICThrottle(rate_to_use)
     *     TokenBucketEnable()
     *   else
     *     _CalculateTimeWindow()
     *     calculated_rate = _CUBICSuccess(time())
     *
     *   new_rate = min(calculated_rate, 2 * measured_tx_rate)
     *   _TokenBucketUpdateRate(new_rate)
     * </pre>
     */
    public synchronized void updateClientSendingRate(boolean throttlingResponse) {
        updateMeasuredRate();

        double calculatedRate;
        if (throttlingResponse) {
            double rateToUse;
            if (!enabled) {
                rateToUse = measuredTxRate;
            } else {
                rateToUse = Math.min(measuredTxRate, fillRate);
            }

            lastMaxRate = rateToUse;
            calculateTimeWindow();
            lastThrottleTime = clock.time();
            calculatedRate = cubicThrottle(rateToUse);
            enable();
        } else {
            calculateTimeWindow();
            calculatedRate = cubicSuccess(clock.time());
        }

        double newRate = Math.min(calculatedRate, 2 * measuredTxRate);
        updateRate(newRate);
    }

    /**
     * <pre>
     * _CalculateTimeWindow()
     *   # This is broken out into a separate calculation because it only
     *   # gets updated when last_max_rate change so it can be cached.
     *   _time_window = ((last_max_rate * (1 - BETA)) / SCALE_CONSTANT) ^ (1 / 3)
     * </pre>
     */
    // Package private for testing
    synchronized void calculateTimeWindow() {
        timeWindow = Math.pow((lastMaxRate * (1 - BETA)) / SCALE_CONSTANT, 1.0 / 3);
    }

    /**
     * Sleep for a given amount of seconds.
     * @param seconds The amount of time to sleep in seconds.
     */
    // Package private for testing
    void sleep(double seconds) {
        long millisToSleep = (long) (seconds * 1000);
        try {
            Thread.sleep(millisToSleep);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(ie);
        }
    }

    /**
     * <pre>
     * _CUBICThrottle(rate_to_use)
     *   calculated_rate = rate_to_use * BETA
     *   return calculated_rate
     * </pre>
     */
    // Package private for testing
    double cubicThrottle(double rateToUse) {
        double calculatedRate = rateToUse * BETA;
        return calculatedRate;
    }

    /**
     * <pre>
     * _CUBICSuccess(timestamp)
     *   dt = timestamp - last_throttle_time
     *   calculated_rate = (SCALE_CONSTANT * ((dt - _time_window) ^ 3)) + last_max_rate
     *   return calculated_rate
     * </pre>
     */
    // Package private for testing
    synchronized double cubicSuccess(double timestamp) {
        double dt = timestamp - lastThrottleTime;
        double calculatedRate = SCALE_CONSTANT * Math.pow(dt - timeWindow, 3) + lastMaxRate;
        return calculatedRate;
    }

    static class DefaultClock implements Clock {
        @Override
        public double time() {
            long timeMillis = System.nanoTime();
            return timeMillis / 1000000000.;
        }
    }

    @SdkTestInternalApi
    synchronized void setLastMaxRate(double lastMaxRate) {
        this.lastMaxRate = lastMaxRate;
    }

    @SdkTestInternalApi
    synchronized void setLastThrottleTime(double lastThrottleTime) {
        this.lastThrottleTime = lastThrottleTime;
    }

    @SdkTestInternalApi
    synchronized double getMeasuredTxRate() {
        return measuredTxRate;
    }

    @SdkTestInternalApi
    synchronized double getFillRate() {
        return fillRate;
    }

    @SdkTestInternalApi
    synchronized void setCurrentCapacity(double currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    @SdkTestInternalApi
    synchronized double getCurrentCapacity() {
        return currentCapacity;
    }

    @SdkTestInternalApi
    synchronized void setFillRate(double fillRate) {
        this.fillRate = fillRate;
    }
}
