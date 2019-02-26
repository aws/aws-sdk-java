/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth;

import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import java.util.Date;

/**
 * Clock interface to prevent static coupling to {@link System#currentTimeMillis()}.
 */
@SdkProtectedApi
public interface SdkClock {

    /**
     * Standard implementation that calls out to {@link System#currentTimeMillis()}. Used in production code.
     */
    SdkClock STANDARD = new SdkClock() {
        @Override
        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    };

    long currentTimeMillis();

    /**
     * Mock implementation used in tests.
     */
    final class MockClock implements SdkClock {
        private final long mockedTime;

        public MockClock(Date mockedTime) {
            this(mockedTime.getTime());
        }

        public MockClock(long mockedTime) {
            this.mockedTime = mockedTime;
        }

        @Override
        public long currentTimeMillis() {
            return mockedTime;
        }
    }

    /**
     * Container for Singleton instance of the {@link SdkClock}.
     */
    final class Instance {

        private static SdkClock clock = STANDARD;

        public static SdkClock get() {
            return clock;
        }

        /**
         * Should only be used by tests to mock the clock.
         *
         * @param newClock New clock to use.
         */
        @SdkTestInternalApi
        public static void set(SdkClock newClock) {
            clock = newClock;
        }

        /**
         * Reset the clock to {@link #STANDARD}. Should only be used by SDK tests.
         */
        @SdkTestInternalApi
        public static void reset() {
            clock = STANDARD;
        }

    }
}
