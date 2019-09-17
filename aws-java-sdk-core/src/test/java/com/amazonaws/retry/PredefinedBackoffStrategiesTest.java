/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights
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

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PredefinedBackoffStrategiesTest {

    private static final int BASE_DELAY = 100;
    private static final int BOUNDED_MAX_DELAY = 20000;
    private static final int UNBOUNDED_MAX_DELAY = Integer.MAX_VALUE;

    private static final int[] EXPONENTIAL_BACKOFF_VALUES = new int[]{100, 200, 400, 800, 1600, 3200, 6400, 12800, 20000, 20000};

    @Test
    public void testFullJitterStrategy() {
        int[] expectedLowerBound = new int[10];
        expectInRange(new PredefinedBackoffStrategies.FullJitterBackoffStrategy(BASE_DELAY, BOUNDED_MAX_DELAY), expectedLowerBound, EXPONENTIAL_BACKOFF_VALUES);
        expectMeanIncreasing(new PredefinedBackoffStrategies.FullJitterBackoffStrategy(BASE_DELAY, UNBOUNDED_MAX_DELAY));
        expectNonZeroStandardDeviation(new PredefinedBackoffStrategies.FullJitterBackoffStrategy(BASE_DELAY, UNBOUNDED_MAX_DELAY));
    }

    @Test
    public void testEqualJitterStrategy() {
        int[] expectedLowerBound = new int[]{50, 100, 200, 400, 800, 1600, 3200, 6400, 10000, 10000};
        expectInRange(new PredefinedBackoffStrategies.EqualJitterBackoffStrategy(BASE_DELAY, BOUNDED_MAX_DELAY), expectedLowerBound, EXPONENTIAL_BACKOFF_VALUES);
        expectMeanIncreasing(new PredefinedBackoffStrategies.EqualJitterBackoffStrategy(BASE_DELAY, UNBOUNDED_MAX_DELAY));
        expectNonZeroStandardDeviation(new PredefinedBackoffStrategies.EqualJitterBackoffStrategy(BASE_DELAY, UNBOUNDED_MAX_DELAY));
    }

    @Test
    public void testExponentialBackoffStrategy() {
        RetryPolicy.BackoffStrategy exponential =
                new PredefinedBackoffStrategies.ExponentialBackoffStrategy(BASE_DELAY, BOUNDED_MAX_DELAY);
        for (int attempt = 0; attempt < 10; attempt++) {
            for (int i = 0; i < 10000; i++) {
                long delay = exponential.delayBeforeNextRetry(null, null, attempt);
                Assert.assertTrue("Expected a fixed delay value", delay == EXPONENTIAL_BACKOFF_VALUES[attempt]);
            }
        }
    }

    @Test
    public void testHandleOverflow() {
        int maxInt = Integer.MAX_VALUE;
        RetryPolicy.BackoffStrategy fullJitter = new PredefinedBackoffStrategies.FullJitterBackoffStrategy(BASE_DELAY, maxInt);
        RetryPolicy.BackoffStrategy equalJitter = new PredefinedBackoffStrategies.EqualJitterBackoffStrategy(BASE_DELAY, maxInt);
        RetryPolicy.BackoffStrategy exponential = new PredefinedBackoffStrategies.ExponentialBackoffStrategy(BASE_DELAY, maxInt);

        int maxRetries = 40;
        for (int i = 0; i < maxRetries; i++) {
            long fullJitterDelay = fullJitter.delayBeforeNextRetry(null, null, i);
            Assert.assertTrue(fullJitterDelay >= 0);
            Assert.assertTrue(fullJitterDelay <= maxInt);

            long equalJitterDelay = equalJitter.delayBeforeNextRetry(null, null, i);
            Assert.assertTrue(equalJitterDelay >= 0);
            Assert.assertTrue(equalJitterDelay <= maxInt);

            long exponentialJitterDelay = exponential.delayBeforeNextRetry(null, null, i);
            Assert.assertTrue(exponentialJitterDelay >= 0);
            Assert.assertTrue(exponentialJitterDelay <= maxInt);
        }
    }

    @Test
    public void testMinimumValuesReturnedByBackoffStrategies() {
        int maxInt = Integer.MAX_VALUE;
        int value = 1;
        RetryPolicy.BackoffStrategy fullJitter = new PredefinedBackoffStrategies.FullJitterBackoffStrategy(value, value);
        RetryPolicy.BackoffStrategy equalJitter = new PredefinedBackoffStrategies.EqualJitterBackoffStrategy(value, value);
        RetryPolicy.BackoffStrategy exponential = new PredefinedBackoffStrategies.ExponentialBackoffStrategy(value, value);

        long fullJitterDelay = fullJitter.delayBeforeNextRetry(null, null, 0);
        Assert.assertTrue(fullJitterDelay >= 0);
        Assert.assertTrue(fullJitterDelay <= maxInt);

        long equalJitterDelay = equalJitter.delayBeforeNextRetry(null, null, 0);
        Assert.assertTrue(equalJitterDelay >= 0);
        Assert.assertTrue(equalJitterDelay <= maxInt);

        long exponentialJitterDelay = exponential.delayBeforeNextRetry(null, null, 0);
        Assert.assertTrue(exponentialJitterDelay >= 0);
        Assert.assertTrue(exponentialJitterDelay <= maxInt);
    }

    /*
     * The max value that can be returned by ExponentialBackoffStrategy.delayBeforeNextRetry is Integer.MAX_VALUE
     */
    @Test
    public void test_MaxValue_Returned_InExponentialBackoffDelay_IsEqualTo_IntegerMax() {
        int maxInt = Integer.MAX_VALUE;
        RetryPolicy.BackoffStrategy exponential = new PredefinedBackoffStrategies.ExponentialBackoffStrategy(maxInt, maxInt);
        Assert.assertEquals(maxInt, exponential.delayBeforeNextRetry(null, null, 40));
    }

    private void expectInRange(RetryPolicy.BackoffStrategy strategy, int[] expectedLowerBound, int[] expectedUpperBound) {
        for (int attempt = 0; attempt < 10; attempt++) {
            for (int i = 0; i < 10000; i++) {
                long delay = strategy.delayBeforeNextRetry(null, null, attempt);
                Assert.assertTrue("Delay should always be greater or equal to expected lower bound", delay >= expectedLowerBound[attempt]);
                Assert.assertTrue("Delay should be within expected upper bound", delay <= expectedUpperBound[attempt]);
            }
        }
    }

    private void expectMeanIncreasing(RetryPolicy.BackoffStrategy strategy) {
        double[] mean = new double[10];

        for (int attempt = 0; attempt < 10; attempt++) {
            long sum = 0L;
            for (int i = 0; i < 10000; i++) {
                sum += strategy.delayBeforeNextRetry(null, null, attempt);
            }
            mean[attempt] = sum / 10000;
        }

        for (int attempt = 1; attempt < 10; attempt++) {
            Assert.assertTrue("Average delay from this attempt should be greater than that of the previous attempt",
                    mean[attempt] > mean[attempt - 1]);
        }
    }

    private void expectNonZeroStandardDeviation(RetryPolicy.BackoffStrategy strategy) {
        for (double value : getStandardDeviationValues(strategy)) {
            Assert.assertTrue("Standard deviation should be non-zero", value > 0);
        }
    }

    private List<Double> getStandardDeviationValues(RetryPolicy.BackoffStrategy strategy) {
        List<Double> standardDeviationValues = new ArrayList<Double>();
        for (int attempt = 0; attempt < 10; attempt++) {
            List<Long> delayValues = new ArrayList<Long>();
            for (int i = 0; i < 10000; i++) {
                delayValues.add(strategy.delayBeforeNextRetry(null, null, attempt));
            }

            long sum = 0L;
            for (long value : delayValues) {
                sum += value;
            }
            double mean = sum / delayValues.size();

            double temp = 0L;
            for (long value : delayValues) {
                temp += Math.pow((mean - value), 2);
            }
            double variance = temp / delayValues.size();
            standardDeviationValues.add(Math.sqrt(variance));
        }
        return standardDeviationValues;
    }

}
