/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.NotThreadSafe;

import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.RequestMetricCollector;

/**
 * In contrast to {@link AWSRequestMetrics}, which is intended to be a minimal
 * support of AWS SDK request metrics, this class is the full support of AWS SDK
 * request metrics including features such as properties and sub-events.
 * <p>
 * This class is instantiated instead of {@link AWSRequestMetrics} when request
 * metric collection is required during a particular service request/response
 * cycle.
 */
@NotThreadSafe
public class AWSRequestMetricsFullSupport extends AWSRequestMetrics {
    /* Stores some key value pairs. */
    private final Map<String, List<Object>> properties = new HashMap<String, List<Object>>();
    
    /* A map to store events that are being profiled. */
    private final Map<String, TimingInfo> eventsBeingProfiled = new HashMap<String, TimingInfo>();
    /* Latency Logger */
    private static final Log latencyLogger = LogFactory.getLog("com.amazonaws.latency");
    private static final Object KEY_VALUE_SEPARATOR = "=";
    private static final Object COMMA_SEPARATOR = ", ";

    /**
     * This constructor should be used in the case when AWS SDK metrics
     * collector is enabled.
     * 
     * @see AWSRequestMetricsFullSupport
     */
    public AWSRequestMetricsFullSupport() {
        super(TimingInfo.startTimingFullSupport());
    }
    
    /**
     * Start an event which will be timed. The startTime and endTime are added
     * to timingInfo only after endEvent is called. For every startEvent there
     * should be a corresponding endEvent. If you start the same event without
     * ending it, this will overwrite the old event. i.e. There is no support
     * for recursive events yet. Having said that, if you start and end an event
     * in that sequence multiple times, all events are logged in timingInfo in
     * that order.
     * 
     * This feature is enabled if the system property
     * "com.amazonaws.sdk.enableRuntimeProfiling" is set, or if a
     * {@link RequestMetricCollector} is in use either at the request, web service
     * client, or AWS SDK level.
     * 
     * @param eventName
     *            - The name of the event to start
     * 
     * @see AwsSdkMetrics
     */
    @Override
    public void startEvent(String eventName) {
        /* This will overwrite past events */
        eventsBeingProfiled.put // ignoring the wall clock time
            (eventName, TimingInfo.startTimingFullSupport(System.nanoTime()));
    }

    @Override
    public void startEvent(MetricType f) {
        startEvent(f.name());
    }

    /**
     * End an event which was previously started. Once ended, log how much time
     * the event took. It is illegal to end an Event that was not started. It is
     * good practice to endEvent in a finally block. See Also startEvent.
     * 
     * @param eventName
     *            - The name of the event to start
     */
    @Override
    public void endEvent(String eventName) {
        TimingInfo event = eventsBeingProfiled.get(eventName);
        /* Somebody tried to end an event that was not started. */
        if (event == null) {
            LogFactory.getLog(getClass()).warn
                ("Trying to end an event which was never started: " + eventName);
            return;
        }
        event.endTiming();
        this.timingInfo.addSubMeasurement(
            eventName,
            TimingInfo.unmodifiableTimingInfo(
                event.getStartTimeNano(),
                event.getEndTimeNano()));
    }

    @Override
    public void endEvent(MetricType f) {
        endEvent(f.name());
    }

    /**
     * Add 1 to an existing count for a given event. If the count for that event
     * does not exist, then it creates one and initializes it to 1.
     * 
     * This feature is enabled if the system property
     * "com.amazonaws.sdk.enableRuntimeProfiling" is set, or if a
     * {@link RequestMetricCollector} is in use either at the request, web service
     * client, or AWS SDK level.
     * 
     * @param event
     *            - The name of the event to count
     */
    @Override
    public void incrementCounter(String event) {
        timingInfo.incrementCounter(event);
    }

    @Override
    public void incrementCounter(MetricType f) {
        incrementCounter(f.name());
    }
    
    @Override
    public void setCounter(String counterName, long count) {
        timingInfo.setCounter(counterName, count);
    }

    @Override
    public void setCounter(MetricType f, long count) {
        setCounter(f.name(), count);
    }
    
    /**
     * Add a property. If you add the same property more than once, it stores
     * all values a list.
     * 
     * This feature is enabled if the system property
     * "com.amazonaws.sdk.enableRuntimeProfiling" is set, or if a
     * {@link RequestMetricCollector} is in use either at the request, web service
     * client, or AWS SDK level.
     * 
     * @param propertyName
     *            The name of the property
     * @param value
     *            The property value
     */
    @Override
    public void addProperty(String propertyName, Object value) {
        List<Object> propertyList = properties.get(propertyName);
        if (propertyList == null) {
            propertyList = new ArrayList<Object>();
            properties.put(propertyName, propertyList);
        }
        
        propertyList.add(value);
    }

    @Override
    public void addProperty(MetricType f, Object value) {
        addProperty(f.name(), value);
    }

    @Override
    public void log() {
        StringBuilder builder = new StringBuilder();

        for (Entry<String, List<Object>> entry : properties.entrySet()) {
            keyValueFormat(entry.getKey(), entry.getValue(), builder);
        }

        for (Entry<String, Number> entry : timingInfo.getAllCounters().entrySet()) {
            keyValueFormat(entry.getKey(), entry.getValue(), builder);
        }

        for (Entry<String, List<TimingInfo>> entry : timingInfo.getSubMeasurementsByName().entrySet()) {
            keyValueFormat(entry.getKey(), entry.getValue(), builder);
        }

        latencyLogger.info(builder.toString());
    }

    private void keyValueFormat(Object key, Object value, StringBuilder builder) {
        builder.append(key).append(KEY_VALUE_SEPARATOR).append(value).append(COMMA_SEPARATOR);
    }

    @Override
    public List<Object> getProperty(String propertyName){
    	return properties.get(propertyName);
    }

    @Override
    public List<Object> getProperty(MetricType f){
        return getProperty(f.name());
    }

    /** Always returns true. */
    @Override
    public final boolean isEnabled() {
        return true;
    }
}
