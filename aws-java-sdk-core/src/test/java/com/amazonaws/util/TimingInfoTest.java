/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
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
package com.amazonaws.util;

import static com.amazonaws.util.TimingInfo.UNKNOWN;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class TimingInfoTest {
    @Test
    public void startEndTiming() {
        // Start timing
        final long startTimeNano = System.nanoTime();
        final long startTimeMilli = System.currentTimeMillis();
        TimingInfo[] tis = {
            TimingInfo.startTimingFullSupport(),
            TimingInfo.startTiming()
        };
        for (TimingInfo ti: tis) {
            assertTrue(ti.isStartEpochTimeMilliKnown());
            assertTrue(ti.getStartTimeNano() >= startTimeNano);
            assertTrue(ti.getStartEpochTimeMilli() >= startTimeMilli);
            // End time is not known
            assertFalse(ti.isEndTimeKnown());
            assertTrue(ti.getEndTimeNano() == UNKNOWN);
            assertTrue(ti.getEndEpochTimeMilli() == UNKNOWN);
            assertTrue(ti.getEndTime() == ti.getEndEpochTimeMilli());
            assertTrue(ti.getTimeTakenMillis() == UNKNOWN);
            assertTrue(ti.getElapsedTimeMillis() == UNKNOWN);
            // End timing
            ti.endTiming();
            assertTrue(ti.isEndTimeKnown());
            assertTrue(ti.getEndTimeNano() >= startTimeNano);
            assertTrue(ti.getEndEpochTimeMilli() >= startTimeMilli);
            assertTrue(ti.getEndTime() == ti.getEndEpochTimeMilli());
            assertTrue(ti.getTimeTakenMillis() >= 0);
            assertTrue(ti.getElapsedTimeMillis() >=0 );
        }
    }

    @Test
    public void newTimingWithClockTime() throws InterruptedException {
        final long startTimeMilli = System.currentTimeMillis();
        final long startTimeNano = System.nanoTime();
        Thread.sleep(1);// sleep for 1 millisecond
        final long endTimeNano = System.nanoTime();
        TimingInfo ti = TimingInfo.newTimingInfoFullSupport(startTimeMilli, startTimeNano, endTimeNano);
        assertTrue(ti.isStartEpochTimeMilliKnown());
        assertTrue(ti.getStartTimeNano() == startTimeNano);
        assertTrue(ti.getStartEpochTimeMilli() == startTimeMilli);
        assertTrue(ti.isEndTimeKnown());
        assertTrue(ti.getEndTimeNano() > startTimeNano);
        assertTrue(ti.getEndEpochTimeMilli() >= startTimeMilli);
        assertTrue(ti.getEndTime() == ti.getEndEpochTimeMilli());
        assertTrue(ti.getTimeTakenMillis() >= 0);
        assertTrue(ti.getElapsedTimeMillis() >=0 );
    }

    @Test
    public void newTimingWithNoClockTime() throws InterruptedException {
        final long startTimeNano = System.nanoTime();
        Thread.sleep(1);// sleep for 1 millisecond
        final long endTimeNano = System.nanoTime();
        TimingInfo ti = TimingInfo.newTimingInfoFullSupport(startTimeNano, endTimeNano);
        assertFalse(ti.isStartEpochTimeMilliKnown());
        assertTrue(ti.getStartTimeNano() == startTimeNano);
        assertTrue(ti.getStartEpochTimeMilli() == UNKNOWN);
        assertTrue(ti.isEndTimeKnown());
        assertTrue(ti.getEndTimeNano() > startTimeNano);
        assertTrue(ti.getEndEpochTimeMilli() == UNKNOWN);
        assertTrue(ti.getEndTime() == ti.getEndEpochTimeMilli());
        assertTrue(ti.getTimeTakenMillis() >= 0);
        assertTrue(ti.getElapsedTimeMillis() >=0 );
    }

    // Test the absurd case when the start/end times were insanely swapped
    // perhaps by accident ?
    @Test
    public void absurdTimingWithNoClock() throws InterruptedException {
        final long startTimeNano = System.nanoTime();
        Thread.sleep(1);// sleep for 1 millisecond
        final long endTimeNano = System.nanoTime();
        // absurdly swap the start/end times
        TimingInfo ti = TimingInfo.newTimingInfoFullSupport(endTimeNano, startTimeNano);
        assertFalse(ti.isStartEpochTimeMilliKnown());
        assertTrue(ti.getStartTimeNano() > startTimeNano);
        assertTrue(ti.getStartEpochTimeMilli() == UNKNOWN);
        assertTrue(ti.isEndTimeKnown());
        assertTrue(ti.getEndTimeNano() < endTimeNano);
        assertTrue(ti.getEndEpochTimeMilli() == UNKNOWN);
        assertTrue(ti.getEndTime() == ti.getEndEpochTimeMilli());
        double double_diff = (double)TimeUnit.NANOSECONDS.toMicros(startTimeNano - endTimeNano)/1000.0;
        assertTrue(ti.getTimeTakenMillis() == double_diff);
        long long_diff = TimeUnit.NANOSECONDS.toMillis(startTimeNano - endTimeNano);
        assertTrue(ti.getElapsedTimeMillis() == long_diff);
    }

    // Test the absurd case when the start/end times were insanely swapped
    // perhaps by accident
    @Test
    public void absurdTimingWithClock() throws InterruptedException {
        final long startTimeMilli = System.currentTimeMillis();
        final long startTimeNano = System.nanoTime();
        Thread.sleep(1);// sleep for 1 millisecond
        final long endTimeNano = System.nanoTime();
        // absurdly swap the start/end times
        TimingInfo ti = TimingInfo.newTimingInfoFullSupport(startTimeMilli, endTimeNano, startTimeNano);
        assertTrue(ti.isStartEpochTimeMilliKnown());
        assertTrue(ti.getStartTimeNano() > startTimeNano);
        assertTrue(ti.getStartEpochTimeMilli() == startTimeMilli);
        assertTrue(ti.isEndTimeKnown());
        assertTrue(ti.getEndTimeNano() < endTimeNano);
        long end_epoch_time = startTimeMilli
                + TimeUnit.NANOSECONDS.toMillis(startTimeNano - endTimeNano);
        assertTrue(ti.getEndEpochTimeMilli() == end_epoch_time);
        assertTrue(ti.getEndTime() == ti.getEndEpochTimeMilli());
        double double_diff = (double)TimeUnit.NANOSECONDS.toMicros(startTimeNano - endTimeNano)/1000.0;
        assertTrue(ti.getTimeTakenMillis() == double_diff);
        long long_diff = TimeUnit.NANOSECONDS.toMillis(startTimeNano - endTimeNano);
        assertTrue(ti.getElapsedTimeMillis() == long_diff);
    }

    @Test
    public void startEndTimingIfKnown() {
        // Start timing
        final long startTimeNano = System.nanoTime();
        final long startTimeMilli = System.currentTimeMillis();
        TimingInfo ti = TimingInfo.startTimingFullSupport();
        assertTrue(ti.isStartEpochTimeMilliKnown());
        assertTrue(ti.getStartTimeNano() >= startTimeNano);
        assertTrue(ti.getStartEpochTimeMilliIfKnown().longValue() >= startTimeMilli);
        // End time is not known
        assertFalse(ti.isEndTimeKnown());
        assertNull(ti.getEndTimeNanoIfKnown());
        assertNull(ti.getEndEpochTimeMilliIfKnown());
        assertNull(ti.getTimeTakenMillisIfKnown());
        // End timing
        ti.endTiming();
        assertTrue(ti.isEndTimeKnown());
        assertTrue(ti.getEndTimeNanoIfKnown().longValue() >= startTimeNano);
        assertTrue(ti.getEndEpochTimeMilliIfKnown().longValue() >= startTimeMilli);
        assertTrue(ti.getEndEpochTimeMilli() == ti.getEndEpochTimeMilliIfKnown().longValue());
        assertTrue(ti.getTimeTakenMillisIfKnown().longValue() >= 0);
    }

    @Test
    public void newTimingWithClockTimeIfKnown() throws InterruptedException {
        final long startTimeMilli = System.currentTimeMillis();
        final long startTimeNano = System.nanoTime();
        Thread.sleep(1);// sleep for 1 millisecond
        final long endTimeNano = System.nanoTime();
        TimingInfo ti = TimingInfo.newTimingInfoFullSupport(startTimeMilli, startTimeNano, endTimeNano);
        assertTrue(ti.isStartEpochTimeMilliKnown());
        assertTrue(ti.getStartTimeNano() == startTimeNano);
        assertTrue(ti.getStartEpochTimeMilliIfKnown().longValue() == startTimeMilli);
        assertTrue(ti.isEndTimeKnown());
        assertTrue(ti.getEndTimeNanoIfKnown().longValue() > startTimeNano);
        assertTrue(ti.getEndEpochTimeMilliIfKnown().longValue() >= startTimeMilli);
        assertTrue(ti.getEndEpochTimeMilliIfKnown().longValue() == ti.getEndEpochTimeMilli());
        assertTrue(ti.getTimeTakenMillisIfKnown().longValue() >= 0);
    }

    @Test
    public void newTimingWithNoClockTimeIfKnown() throws InterruptedException {
        final long startTimeNano = System.nanoTime();
        Thread.sleep(1);// sleep for 1 millisecond
        final long endTimeNano = System.nanoTime();
        TimingInfo ti = TimingInfo.newTimingInfoFullSupport(startTimeNano, endTimeNano);
        assertFalse(ti.isStartEpochTimeMilliKnown());
        assertTrue(ti.getStartTimeNano() == startTimeNano);
        assertNull(ti.getStartEpochTimeMilliIfKnown());
        assertTrue(ti.isEndTimeKnown());
        assertTrue(ti.getEndTimeNanoIfKnown().longValue() > startTimeNano);
        assertNull(ti.getEndEpochTimeMilliIfKnown());
        assertTrue(ti.getTimeTakenMillisIfKnown().longValue() >= 0);
    }

    // Test the absurd case when the start/end times were insanely swapped
    // perhaps by accident ?
    @Test
    public void absurdTimingWithNoClockIfKnown() throws InterruptedException {
        final long startTimeNano = System.nanoTime();
        Thread.sleep(1);// sleep for 1 millisecond
        final long endTimeNano = System.nanoTime();
        // absurdly swap the start/end times
        TimingInfo ti = TimingInfo.newTimingInfoFullSupport(endTimeNano, startTimeNano);
        assertFalse(ti.isStartEpochTimeMilliKnown());
        assertTrue(ti.getStartTimeNano() > startTimeNano);
        assertNull(ti.getStartEpochTimeMilliIfKnown());
        assertTrue(ti.isEndTimeKnown());
        assertTrue(ti.getEndTimeNanoIfKnown().longValue() < endTimeNano);
        assertNull(ti.getEndEpochTimeMilliIfKnown());
        double double_diff = (double)TimeUnit.NANOSECONDS.toMicros(startTimeNano - endTimeNano)/1000.0;
        assertTrue(ti.getTimeTakenMillisIfKnown().doubleValue() == double_diff);
        long long_diff = TimeUnit.NANOSECONDS.toMillis(startTimeNano - endTimeNano);
        assertTrue(ti.getTimeTakenMillisIfKnown().longValue() == long_diff);
    }

    // Test the absurd case when the start/end times were insanely swapped
    // perhaps by accident
    @Test
    public void absurdTimingWithClockIfKnown() throws InterruptedException {
        final long startTimeMilli = System.currentTimeMillis();
        final long startTimeNano = System.nanoTime();
        Thread.sleep(1);// sleep for 1 millisecond
        final long endTimeNano = System.nanoTime();
        // absurdly swap the start/end times
        TimingInfo ti = TimingInfo.newTimingInfoFullSupport(startTimeMilli, endTimeNano, startTimeNano);
        assertTrue(ti.isStartEpochTimeMilliKnown());
        assertTrue(ti.getStartTimeNano() > startTimeNano);
        assertTrue(ti.getStartEpochTimeMilliIfKnown().longValue() == startTimeMilli);
        assertTrue(ti.isEndTimeKnown());
        assertTrue(ti.getEndTimeNanoIfKnown().longValue() < endTimeNano);
        long end_epoch_time = startTimeMilli
                + TimeUnit.NANOSECONDS.toMillis(startTimeNano - endTimeNano);
        assertTrue(ti.getEndEpochTimeMilliIfKnown().longValue() == end_epoch_time);
        assertTrue(ti.getEndEpochTimeMilliIfKnown().longValue() == ti.getEndEpochTimeMilli());
        double double_diff = (double)TimeUnit.NANOSECONDS.toMicros(startTimeNano - endTimeNano)/1000.0;
        assertTrue(ti.getTimeTakenMillisIfKnown().doubleValue() == double_diff);
        long long_diff = TimeUnit.NANOSECONDS.toMillis(startTimeNano - endTimeNano);
        assertTrue(ti.getTimeTakenMillisIfKnown().longValue() == long_diff);
    }
    
    @Test
    public void subEventsEnabled() {
        TimingInfo ti = TimingInfo.startTimingFullSupport();
        ti.addSubMeasurement("m1", TimingInfo.startTimingFullSupport());
        assertNotNull(ti.getAllSubMeasurements("m1"));

        ti.incrementCounter("c1");
        assertTrue(ti.getAllCounters().size() == 1);

        ti.setCounter("c2", 0);
        assertTrue(ti.getAllCounters().size() == 2);
    }

    @Test
    public void subEventsDisabled() {
        TimingInfo ti = TimingInfo.startTiming();
        ti.addSubMeasurement("m1", TimingInfo.startTiming());
        assertNull(ti.getAllSubMeasurements("m1"));

        ti.incrementCounter("c1");
        assertTrue(ti.getAllCounters().size() == 0);

        ti.setCounter("c2", 0);
        assertTrue(ti.getAllCounters().size() == 0);
    }
    
}
