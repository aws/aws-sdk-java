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

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * From the spec:
 *
 * The new_token_bucket_rate is the expected value that should be passed to the _TokenBucketUpdateRate() at the end of
 * _UpdateClientSendingRate(). The measured_tx_rate value is the measured client sending rate calculated from
 * _UpdateMeasuredRate().
 *
 * Note: per spec owner, "new_token_bucket_rate" above is supposed to be "fill_rate" instead.
 */
@RunWith(Parameterized.class)
public class TokenBucketEndToEndTest {
    private static final double EPSILON = 1E-6;

    private static final TestClock TEST_CLOCK = new TestClock();
    private static final TokenBucket TOKEN_BUCKET = new TokenBucket(TEST_CLOCK);

    @Parameterized.Parameter
    public TestCase testCase;

    @Parameterized.Parameters(name = "{0}")
    public static Iterable<TestCase> testCases() {
        return Arrays.<TestCase>asList(
                new TestCase().withTimestamp(0.2).withMeasuredTxRate(0.000000).withExpectedNewFillRate(0.500000),
                new TestCase().withTimestamp(0.4).withMeasuredTxRate(0.000000).withExpectedNewFillRate(0.500000),
                new TestCase().withTimestamp(0.6).withMeasuredTxRate(4.800000).withExpectedNewFillRate(0.500000),
                new TestCase().withTimestamp(0.8).withMeasuredTxRate(4.800000).withExpectedNewFillRate(0.500000),
                new TestCase().withTimestamp(1.0).withMeasuredTxRate(4.160000).withExpectedNewFillRate(0.500000),
                new TestCase().withTimestamp(1.2).withMeasuredTxRate(4.160000).withExpectedNewFillRate(0.691200),
                new TestCase().withTimestamp(1.4).withMeasuredTxRate(4.160000).withExpectedNewFillRate(1.097600),
                new TestCase().withTimestamp(1.6).withMeasuredTxRate(5.632000).withExpectedNewFillRate(1.638400),
                new TestCase().withTimestamp(1.8).withMeasuredTxRate(5.632000).withExpectedNewFillRate(2.332800),
                new TestCase().withThrottled(true).withTimestamp(2.0).withMeasuredTxRate(4.326400).withExpectedNewFillRate(3.028480),
                new TestCase().withTimestamp(2.2).withMeasuredTxRate(4.326400).withExpectedNewFillRate(3.486639),
                new TestCase().withTimestamp(2.4).withMeasuredTxRate(4.326400).withExpectedNewFillRate(3.821874),
                new TestCase().withTimestamp(2.6).withMeasuredTxRate(5.665280).withExpectedNewFillRate(4.053386),
                new TestCase().withTimestamp(2.8).withMeasuredTxRate(5.665280).withExpectedNewFillRate(4.200373),
                new TestCase().withTimestamp(3.0).withMeasuredTxRate(4.333056).withExpectedNewFillRate(4.282037),
                new TestCase().withThrottled(true).withTimestamp(3.2).withMeasuredTxRate(4.333056).withExpectedNewFillRate(2.997426),
                new TestCase().withTimestamp(3.4).withMeasuredTxRate(4.333056).withExpectedNewFillRate(3.452226)
                );
    }

    @Test
    public void testCalculatesCorrectFillRate() {
        TEST_CLOCK.setTime(testCase.timestamp);

        TOKEN_BUCKET.updateClientSendingRate(testCase.throttled);

        assertThat("The calculated fill rate is not within error of the expected value",
                TOKEN_BUCKET.getFillRate(), closeTo(testCase.expectedNewFillRate, EPSILON));
        assertThat("The calculated tx rate is not within error of the expected value",
                TOKEN_BUCKET.getMeasuredTxRate(), closeTo(testCase.measuredTxRate, EPSILON));

    }

    private static class TestCase {
        private boolean throttled;
        private double timestamp;
        private double measuredTxRate;

        private double expectedNewFillRate;

        public TestCase withThrottled(boolean throttled) {
            this.throttled = throttled;
            return this;
        }

        public TestCase withTimestamp(double timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public TestCase withMeasuredTxRate(double measuredTxRate) {
            this.measuredTxRate = measuredTxRate;
            return this;
        }

        public TestCase withExpectedNewFillRate(double expectedNewFillRate) {
            this.expectedNewFillRate = expectedNewFillRate;
            return this;
        }

        @Override
        public String toString() {
            return "TestCase{" +
                    "throttled=" + throttled +
                    ", timestamp=" + timestamp +
                    ", measuredTxRate=" + measuredTxRate +
                    ", expectedNewFillRate=" + expectedNewFillRate +
                    '}';
        }
    }

    private static class TestClock implements TokenBucket.Clock {
        private double time = 0;

        public void setTime(double time) {
            this.time = time;
        }

        @Override
        public double time() {
            return time;
        }
    }
}
