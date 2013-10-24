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

import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.NotThreadSafe;

/**
 * In contrast to {@link TimingInfo}, which is intended to be a minimal support
 * of the timing info, this class is the full support of timing info including
 * features related to sub-measurements and counters.
 * <p>
 * This class is instantiated instead of {@link TimingInfo} when
 * request metric collection is required during a particular service
 * request/response cycle.
 */
@NotThreadSafe
class TimingInfoFullSupport extends TimingInfo {
    private final Map<String, List<TimingInfo>> subMeasurementsByName = new HashMap<String, List<TimingInfo>>();
    private final Map<String, Number> countersByName = new HashMap<String, Number>();

    /**
     * A private ctor to facilitate the deprecation of using millisecond and
     * migration to using nanosecond for timing measurement.
     * 
     * @param startEpochTimeMilli start time since epoch in millisecond
     * @param startTimeNano start time in nanosecond
     * @param endTimeNano end time in nanosecond; or null if not known
     * 
     * @see TimingInfo#startTimingFullSupport()
     * @see TimingInfo#startTimingFullSupport(long)
     * @see TimingInfo#newTimingInfoFullSupport(long, long)
     * @see TimingInfo#newTimingInfoFullSupport(long, long, long)
     */
    TimingInfoFullSupport(Long startEpochTimeMilli, long startTimeNano, Long endTimeNano) {
        super(startEpochTimeMilli, startTimeNano, endTimeNano);
    }

    @Override
    public void addSubMeasurement(String subMeasurementName, TimingInfo ti) {
        List<TimingInfo> timings = subMeasurementsByName.get(subMeasurementName);
        if (timings == null) {
            timings = new ArrayList<TimingInfo>();
            subMeasurementsByName.put(subMeasurementName, timings);
        }
        if (ti.isEndTimeKnown()) {
            timings.add(ti);
        } else {
            LogFactory.getLog(getClass()).debug(
                "Skip submeasurement timing info with no end time for "
                + subMeasurementName);
        }
    }

    @Override
    public TimingInfo getSubMeasurement(String subMeasurementName) {
        return getSubMeasurement(subMeasurementName, 0);
    }

    @Override
    public TimingInfo getSubMeasurement(String subMesurementName, int index) {

        List<TimingInfo> timings = subMeasurementsByName.get(subMesurementName);
        if (index < 0 || timings == null || timings.size() == 0
                || index >= timings.size()) {
            return null;
        }

        return timings.get(index);
    }

    @Override
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

    @Override
    public List<TimingInfo> getAllSubMeasurements(String subMeasurementName) {
        return subMeasurementsByName.get(subMeasurementName);
    }

    @Override
    public Map<String, List<TimingInfo>> getSubMeasurementsByName() {
        return subMeasurementsByName;
    }

    @Override
    public Number getCounter(String key) {
        return countersByName.get(key);
    }

    @Override
    public Map<String, Number> getAllCounters() {
        return countersByName;
    }

    @Override
    public void setCounter(String key, long count) {
        countersByName.put(key, count);
    }

    @Override
    public void incrementCounter(String key) {

        int count = 0;
        Number counter = getCounter(key);

        if (counter != null) {
            count = counter.intValue();
        }

        setCounter(key, ++count);
    }
}
