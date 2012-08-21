/*
 * Copyright 2011-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class TimingInfo {
    
    private final long startTime;
    private long endTime;
    private final Map<String, List<TimingInfo>> subMeasurementsByName = new HashMap<String, List<TimingInfo>>();
    private final Map<String, Number> countersByName = new HashMap<String, Number>();

    public TimingInfo() {
        this(System.currentTimeMillis(), -1);
    }

    public TimingInfo(long startTime) {
        this(startTime, -1);
    }

    public TimingInfo(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * Returns the time, in epoch milliseconds, at which this timing period started.
     * 
     * @return the time, in epoch milliseconds, at which this timing period started.
     */
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    
    /**
     *  Returns the difference between endTime and startTime in milli-seconds
     */
    public double getTimeTakenMillis() {
        return TimeUnit.NANOSECONDS.toMicros(endTime - startTime)/1000.0 /* do double math */;
    }
    
    @Override
    public String toString() {
        return String.valueOf(getTimeTakenMillis());
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
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
        
        return getSubMeasurement(subMeasurementName, subMeasurementsByName.size()-1);
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
