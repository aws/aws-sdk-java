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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.http.annotation.NotThreadSafe;

@NotThreadSafe
public class TimingInfo {
    private static final int UNKNOWN = -1;
    /**
     * The wall clock time (as the number of milliseconds since Epoch)
     * of when the timing measurement starts; or -1 if unknown.
     * This field is not meant to be used for timing measurement.
     * For more info, see:
     * https://blogs.oracle.com/dholmes/entry/inside_the_hotspot_vm_clocks
     */
    private final long startEpochTimeMilli;
    /** 
     * Start time in nanosecond used for timing measurement.
     * Note the value in this field may have nothing to do with
     * the wall clock time.
     * The wall clock time of when the timing measurement starts
     * can optionally be captured in {@link #startEpochTimeMilli}.
     * For more info, see:
     * https://blogs.oracle.com/dholmes/entry/inside_the_hotspot_vm_clocks
     */
    private final long startTimeNano;
    /** 
     * End time in nanosecond used for timing measurement or -1 if unknown.
     * Note the value in this field is only meant to be used for timing
     * measurement, and is not directly related to the wall clock time.
     * For more info, see:
     * https://blogs.oracle.com/dholmes/entry/inside_the_hotspot_vm_clocks
     */
    private long endTimeNano;
    private final Map<String, List<TimingInfo>> subMeasurementsByName = new HashMap<String, List<TimingInfo>>();
    private final Map<String, Number> countersByName = new HashMap<String, Number>();

    /**
     * @deprecated The best practice is to use nanoseconds for timing measurement
     * in Java.  Use {@link #startTiming()} instead.
     * <p>
     * Captures the current start time in millisecond.
     * 
     * @see TimingInfo#startTiming()
     */
    @Deprecated
    public TimingInfo() {
        this(System.currentTimeMillis(), System.nanoTime(), UNKNOWN);
    }

    /**
     * @deprecated The best practice is to use nanoseconds for timing measurement
     * in Java.  
     * The time unit of the input parameter was ambiguous,
     * and now assumed to be nanosecond.
     * Please use {@link #startTiming(long)} instead.
     * <p>
     * Captures the start time in millisecond.
     * 
     * @see TimingInfo#newTimingInfo(long))
     */
    @Deprecated
    public TimingInfo(long startTimeNano) {
        this(UNKNOWN, startTimeNano, UNKNOWN);
    }

    /**
     * @deprecated The best practice is to use nanoseconds for timing measurement
     * in Java.
     * The time unit of the input parameters were ambiguous,
     * and now assumed to be nanosecond based on empirical observation.
     * Please use {@link #newTimingInfo(long, long)} instead.
     * 
     * @see Timing#newTimingInfo(long, long))
     */
    @Deprecated
    public TimingInfo(long startTimeNano, long endTimeNano) {
        this(UNKNOWN, startTimeNano, endTimeNano);
    }

    /**
     * Captures the current wall clock time (since epoch in millisecond)
     * and the current time (in nanosecond) used for timing measurement.
     * For more info, see:
     * https://blogs.oracle.com/dholmes/entry/inside_the_hotspot_vm_clocks
     */
    public static TimingInfo startTiming() {
        return new TimingInfo(System.currentTimeMillis(), System.nanoTime(), UNKNOWN);
    }

    /**
     * Captures the given start time in nanosecond, ignoring the wall clock time.
     *
     * @param startTimeNano start time in nanosecond
     */
    public static TimingInfo startTiming(long startTimeNano) {
        return new TimingInfo(UNKNOWN, startTimeNano, UNKNOWN);
    }

    /**
     * Returns a {@link TimingInfo} based on the given
     * start and end time in nanosecond, ignoring the wall clock time.
     *
     * @param startTimeNano start time in nanosecond
     * @param endTimeNano end time in nanosecond
     */
    public static TimingInfo newTimingInfo(long startTimeNano, long endTimeNano) {
        return new TimingInfo(UNKNOWN, startTimeNano, endTimeNano);
    }

    /**
     * Returns a {@link TimingInfo} based on the given
     * start time since epoch in millisecond,
     * and the given start and end time in nanosecond.
     *
     * @param startEpochTimeMilli start time since epoch in millisecond
     * @param startTimeNano start time in nanosecond
     * @param endTimeNano end time in nanosecond
     */
    public static TimingInfo newTimingInfo(
        long startEpochTimeMilli, long startTimeNano, long endTimeNano) {
        return new TimingInfo(startEpochTimeMilli, startTimeNano, endTimeNano);
    }

    /**
     * A private ctor to facilitate the deprecation of using millisecond and
     * migration to using nanosecond for timing measurement.
     * 
     * @param startEpochTimeMilli start time since epoch in millisecond
     * @param startTimeNano start time in nanosecond
     * @param endTimeNano end time in nanosecond
     */
    private TimingInfo(long startEpochTimeMilli, long startTimeNano, long endTimeNano) {
        this.startEpochTimeMilli = startEpochTimeMilli;
        this.startTimeNano = startTimeNano;
        this.endTimeNano = endTimeNano;
    }

    /**
     * @deprecated by {#link {@link #getStartEpochTimeMilli()} and {@link #getStartTimeNano()}.
     * <p>
     * The time unit of the start time returned was ambiguous,
     * and is now assumed to be the wall clock time in millisecond since Epoch
     * when the timing measurement starts.
     * 
     * @see #getStartEpochTimeMilli()
     * @see #getStartTimeNano()
     */
    @Deprecated
    public long getStartTime() {
        return startEpochTimeMilli < 0
             // best effort even though technically this is incorrect
             ? TimeUnit.NANOSECONDS.toMillis(startTimeNano)
             : startEpochTimeMilli
             ;
    }

    /**
     * Returns the wall clock time (as the number of milliseconds since Epoch)
     * of when the timing measurement starts; or -1 if unknown.
     */
    public long getStartEpochTimeMilli() {
        return startEpochTimeMilli;
    }

    /**
     * Returns the start time (in nanosecond) used for timing measurement.
     */
    public long getStartTimeNano() {
        return startTimeNano;
    }

    /**
     * @deprecated by {#link {@link #getEndEpochTimeMilli()} and {@link #getEndTimeNano()}.
     * The time unit of the returned end time was ambiguous,
     * and is now assumed to be the wall clock time in millisecond since Epoch
     * when the timing measurement ends; or -1 if unknown.
     * 
     * @see #getEndEpochTimeMilli()
     * @see #getEndTimeNano()
     */
    @Deprecated
    public long getEndTime() {
        return getEndEpochTimeMilli();
    }

    /**
     * Returns the wall clock time (as the number of milliseconds since Epoch)
     * of when the timing measurement ended; or -1 if unknown.
     *
     * @see #getEndTimeNano()
     */
    public long getEndEpochTimeMilli() {
        return startEpochTimeMilli < 0 || endTimeNano < 0
             ? UNKNOWN
               // make use of the wall clock time and elpased time
             : startEpochTimeMilli + getElapsedTimeMillis();
    }

    /**
     * Returns the end time (in nanoseconds) used for timing measurement;
     * or -1 if unknown.
     */
    public long getEndTimeNano() {
        return endTimeNano;
    }

    /**
     * Returns the elapsed time in millisecond
     * (as double and therefore with higher precision than 
     * if it was returned in long).
     *
     * @see #getElapsedTimeMillis()
     */
    public double getTimeTakenMillis() {
        double micros = (double)TimeUnit.NANOSECONDS.toMicros(endTimeNano - startTimeNano);
        return micros / 1000.0; // convert microseconds to milliseconds in double rather than long, preserving the precision
    }

    /**
     * Returns the elapsed time in millisecond (as long).
     *  
     * @see #getTimeTakenMillis()
     */
    public long getElapsedTimeMillis() {
        return TimeUnit.NANOSECONDS.toMillis(endTimeNano - startTimeNano);
    }

    @Override
    public String toString() {
        return String.valueOf(getTimeTakenMillis());
    }

    /**
     * @deprecated The best practice is to use nanoseconds for timing measurement
     * in Java.
     * The time unit of the input parameter was ambiguous,
     * and now assumed to be millisecond based on empirical observation.
     *
     * @param endTimeMilli end time in millisecond
     * 
     * @see #setEndTimeNano(long)
     */
    @Deprecated
    public void setEndTime(long endTimeMilli) {
        this.endTimeNano = TimeUnit.MILLISECONDS.toNanos(endTimeMilli);
    }

    /**
     * Sets the end time (in nanosecond) used for timing measurement.
     * 
     * @see TimingInfo#endTiming()
     */
    public void setEndTimeNano(long endTimeNano) {
        this.endTimeNano = endTimeNano;
    }

    /**
     * Captures the current end time (in nanosecond) used for
     * timing measurement.
     */
    public TimingInfo endTiming() {
        this.endTimeNano = System.nanoTime();
        return this;
    }

    public void addSubMeasurement(String subMeasurementName, TimingInfo timingInfo) {
        List<TimingInfo> timings = subMeasurementsByName.get(subMeasurementName);
        if (timings == null) {
            timings = new ArrayList<TimingInfo>();
            subMeasurementsByName.put(subMeasurementName, timings);
        }

        timings.add(timingInfo);
    }

    public TimingInfo getSubMeasurement(String subMeasurementName) {
        return getSubMeasurement(subMeasurementName, 0);
    }

    public TimingInfo getSubMeasurement(String subMesurementName, int index) {

        List<TimingInfo> timings = subMeasurementsByName.get(subMesurementName);
        if (index < 0 || timings == null || timings.size() == 0
                || index >= timings.size()) {
            return null;
        }

        return timings.get(index);
    }

    public TimingInfo getLastSubMeasurement(String subMeasurementName) {

        if (subMeasurementsByName == null || subMeasurementsByName.size() == 0) {
            return null;
        }

        List<TimingInfo> timings = subMeasurementsByName.get(subMeasurementName);
        if (timings == null || timings.size() == 0) {
            return null;
        }

        return timings.get(timings.size() - 1);
    }

    public List<TimingInfo> getAllSubMeasurements(String subMeasurementName) {
        return subMeasurementsByName.get(subMeasurementName);
    }

    public Map<String, List<TimingInfo>> getSubMeasurementsByName() {
        return subMeasurementsByName;
    }

    public Number getCounter(String key) {
        return countersByName.get(key);
    }

    public Map<String, Number> getAllCounters() {
        return countersByName;
    }

    public void setCounter(String key, long count) {
        countersByName.put(key, count);
    }

    public void incrementCounter(String key) {

        int count = 0;
        Number counter = getCounter(key);

        if (counter != null) {
            count = counter.intValue();
        }

        setCounter(key, ++count);
    }
}
