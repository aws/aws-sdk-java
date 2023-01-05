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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TokenBucketCubicTest {
    private static final double EPSILON = 1E-6;

    @Parameterized.Parameter
    public TestCaseGroup testCaseGroup;

    @Parameterized.Parameters(name = "{0}")
    public static Iterable<TestCaseGroup> testCases() {
        return Arrays.<TestCaseGroup>asList(
                new TestCaseGroup()
                        .withName("All success")
                        .withLastMaxRate(10)
                        .withLastThrottleTime(5)
                        .withTestCases(
                                new TestCase().withTimestamp(5).withExpectedCalculatedRate(7.0),
                                new TestCase().withTimestamp(6).withExpectedCalculatedRate(9.64893600966),
                                new TestCase().withTimestamp(7).withExpectedCalculatedRate(10.000030849917364),
                                new TestCase().withTimestamp(8).withExpectedCalculatedRate(10.453284520772092),
                                new TestCase().withTimestamp(9).withExpectedCalculatedRate(13.408697022224185),
                                new TestCase().withTimestamp(10).withExpectedCalculatedRate(21.26626835427364),
                                new TestCase().withTimestamp(11).withExpectedCalculatedRate(36.425998516920465)
                        ),

                new TestCaseGroup()
                        .withName("Mixed")
                        .withLastMaxRate(10)
                        .withLastThrottleTime(5)
                        .withTestCases(
                                new TestCase().withTimestamp(5).withExpectedCalculatedRate(7.0),
                                new TestCase().withTimestamp(6).withExpectedCalculatedRate(9.64893600966),
                                new TestCase().withTimestamp(7).withThrottled(true).withExpectedCalculatedRate(6.754255206761999),
                                new TestCase().withTimestamp(8).withThrottled(true).withExpectedCalculatedRate(4.727978644733399),
                                new TestCase().withTimestamp(9).withExpectedCalculatedRate(6.606547753887045),
                                new TestCase().withTimestamp(10).withExpectedCalculatedRate(6.763279816944947),
                                new TestCase().withTimestamp(11).withExpectedCalculatedRate(7.598174833907107),
                                new TestCase().withTimestamp(12).withExpectedCalculatedRate(11.511232804773524)
                        )
        );
    }

    @Test
    public void calculatesCorrectRate() {
        // Prime the token bucket for the initial test case
        TokenBucket tb = new TokenBucket();
        tb.setLastMaxRate(testCaseGroup.lastMaxRate);
        tb.setLastThrottleTime(testCaseGroup.lastThrottleTime);
        tb.calculateTimeWindow();

        // Note: No group starts with a throttled case, so we never actually
        // use this value; just to make the compiler happy.
        double lastCalculatedRate = Double.NEGATIVE_INFINITY;

        for (TestCase tc :testCaseGroup.testCases) {
            if (tc.throttled) {
                tb.setLastMaxRate(lastCalculatedRate);
                tb.calculateTimeWindow();

                tb.setLastThrottleTime(tc.timestamp);
                lastCalculatedRate = tb.cubicThrottle(lastCalculatedRate);
            } else {
                tb.calculateTimeWindow();
                lastCalculatedRate = tb.cubicSuccess(tc.timestamp);
            }

            assertThat(lastCalculatedRate, closeTo(tc.expectedCalculatedRate, EPSILON));
        }
    }

    private static class TestCaseGroup {
        private String name;
        private double lastMaxRate;
        private double lastThrottleTime;
        private List<TestCase> testCases;

        public TestCaseGroup withName(String name) {
            this.name = name;
            return this;
        }

        public TestCaseGroup withLastMaxRate(double lastMaxRate) {
            this.lastMaxRate = lastMaxRate;
            return this;
        }

        public TestCaseGroup withLastThrottleTime(double lastThrottleTime) {
            this.lastThrottleTime = lastThrottleTime;
            return this;
        }

        public TestCaseGroup withTestCases(TestCase... testCases) {
            this.testCases = Arrays.<TestCase>asList(testCases);
            return this;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private static class TestCase {
        private boolean throttled;
        private double timestamp;
        private double expectedCalculatedRate;

        public TestCase withThrottled(boolean throttled) {
            this.throttled = throttled;
            return this;
        }

        public TestCase withTimestamp(double timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public TestCase withExpectedCalculatedRate(double expectedCalculatedRate) {
            this.expectedCalculatedRate = expectedCalculatedRate;
            return this;
        }
    }
}
