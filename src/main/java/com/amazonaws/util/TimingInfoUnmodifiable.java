/*
 * Copyright 2011-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util;

import org.apache.http.annotation.ThreadSafe;

/**
 * A {@link TimingInfo} that is unmodifiable.
 */
@ThreadSafe
final class TimingInfoUnmodifiable extends TimingInfo {
    /**
     * @see TimingInfo#unmodifiableTimingInfo(long, Long)
     * @see TimingInfo#unmodifiableTimingInfo(long, long, Long)
     * 
     * @param startEpochTimeMilli
     *            start time since epoch in millisecond; or null if not known
     * @param startTimeNano
     *            start time in nanosecond
     * @param endTimeNano
     *            end time in nanosecond; or null if not known
     */
    TimingInfoUnmodifiable(Long startEpochTimeMilli, long startTimeNano, Long endTimeNano) {
        super(startEpochTimeMilli, startTimeNano, endTimeNano);
    }

    /**
     * Always throws {@link UnsupportedOperationException}.
     */
    @Override public void setEndTime(long _) {
        throw new UnsupportedOperationException();
    }
    /**
     * Always throws {@link UnsupportedOperationException}.
     */
    @Override public void setEndTimeNano(long _) {
        throw new UnsupportedOperationException();
    }
    /**
     * Always throws {@link UnsupportedOperationException}.
     */
    @Override public TimingInfo endTiming() {
        throw new UnsupportedOperationException();
    }
}
