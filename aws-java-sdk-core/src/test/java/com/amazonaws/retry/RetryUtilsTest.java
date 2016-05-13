/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
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

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class RetryUtilsTest {

    @Test
    public void testFullJitterBackoffInRange() {
        int baseDelay = 100;
        int maxDelay = 20000;
        Random rand = new Random();
        int[] expectedUpperBound = new int[]{100, 200, 400, 800, 1600, 3200, 6400, 12800, 20000, 20000};

        for (int attempt = 0; attempt < 10; attempt++) {
            for (int i = 0; i < 10000; i++) {
                int delay = RetryUtils.calculateFullJitterBackoff(attempt, baseDelay, maxDelay, rand);
                Assert.assertTrue("Delay should always be greater or equal to 0", delay >= 0);
                Assert.assertTrue("Delay should be within expected upper bound", delay <= expectedUpperBound[attempt]);
            }
        }
    }

    @Test
    public void testFullJitterBackoffMeanIncreasing() {
        int baseDelay = 100;
        int maxDelay = Integer.MAX_VALUE;
        Random rand = new Random();
        double[] mean = new double[10];

        for (int attempt = 0; attempt < 10; attempt++) {
            long sum = 0L;
            for (int i = 0; i < 10000; i++) {
                sum += RetryUtils.calculateFullJitterBackoff(attempt+5, baseDelay, maxDelay, rand);
            }
            mean[attempt] = sum / 10000;
        }

        for (int attempt = 1; attempt < 10; attempt++) {
            Assert.assertTrue("Average delay from this attempt should be greater than that of the previous attempt",
                    mean[attempt] > mean[attempt - 1]);
        }
    }

    @Test
    public void testFullJitterStandardDeviation() {
        int baseDelay = 100;
        int maxDelay = Integer.MAX_VALUE;
        Random rand = new Random();

        for (int attempt = 0; attempt < 10; attempt++) {
            List<Integer> delayValues = new ArrayList<Integer>();
            for (int i = 0; i < 10000; i++) {
                delayValues.add(RetryUtils.calculateFullJitterBackoff(attempt, baseDelay, maxDelay, rand));
            }

            long sum = 0L;
            for (int value : delayValues) {
                sum += value;
            }
            double mean = sum / delayValues.size();

            double temp = 0L;
            for (int value : delayValues) {
                temp += Math.pow((mean - value), 2);
            }
            double variance = temp / delayValues.size();

            Assert.assertTrue("Standard deviation should be non-zero", Math.sqrt(variance) > 0);
        }
    }
}
