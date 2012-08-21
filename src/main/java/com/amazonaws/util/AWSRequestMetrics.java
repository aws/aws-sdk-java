/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.http.AmazonHttpClient;

public class AWSRequestMetrics {

    /**
     * Set of predefined Metrics.
     */
    public static enum Field {
        StatusCode, // The http status code
        AWSErrorCode,
        AWSRequestID,
        BytesProcessed,
        AttemptCount,
        ResponseProcessingTime,
        ClientExecuteTime,
        RequestSigningTime,
        HttpRequestTime,
        RequestMarshallTime,
        RetryPauseTime,
        RedirectLocation,
        Exception,
        CredentialsRequestTime,
        ServiceEndpoint,
        ServiceName,
    }
    
    private final TimingInfo timingInfo;
    
    /* Cache the system profiling flag so we don't have to do System.getProperty every time. */
    private final boolean profilingSystemPropertyEnabled;
    /* Stores some key value pairs. */
    private final Map<String, List<Object>> properties = new HashMap<String, List<Object>>();
    
    /* A map to store events that are being profiled. */
    private final Map<String, Long> eventsBeingProfiled = new HashMap<String, Long>();
    /* Latency Logger */
    private static final Log latencyLogger = LogFactory.getLog("com.amazonaws.latency");
    private static final Object KEY_VALUE_SEPARATOR = "=";
    private static final Object COMMA_SEPARATOR = ", ";
    
    
    public AWSRequestMetrics() {
        this.timingInfo = new TimingInfo();
        this.profilingSystemPropertyEnabled = isProfilingEnabled();
    }

    /* Check the profiling system property and return true if set */
    private static boolean isProfilingEnabled() {
        return System.getProperty(AmazonHttpClient.PROFILING_SYSTEM_PROPERTY) == null ? false : true;
    }
    
    /**
     *  Start an event which will be timed. The startTime and endTime are added to timingInfo only after
     *  endEvent is called. For every startEvent there should be a corresponding endEvent. If you start the
     *  same event without ending it, this will overwrite the old event. i.e. There is no support for recursive
     *  events yet. Having said that, if you start and end an event in that sequence multiple times, all events
     *  are logged in timingInfo in that order.
     *  
     *  This feature is enabled only if the system property "com.amazonaws.sdk.enableRuntimeProfiling" is set.
     *
     *   @param eventName - The name of the event to start
     */
    public void startEvent(String eventName) {
        if (profilingSystemPropertyEnabled) {
            /* This will overwrite past events */
            eventsBeingProfiled.put(eventName, System.nanoTime());
        }
    }
    
    /**
     * End an event which was previously started. Once ended, log how much time the event took. It is illegal to
     * end an Event that was not started. It is good practice to endEvent in a finally block. See Also startEvent.
     * 
     * This feature is enabled only if the system property "com.amazonaws.sdk.enableRuntimeProfiling" is set.
     * 
     * @param eventName - The name of the event to start
     */
    public void endEvent(String eventName) {
        if (profilingSystemPropertyEnabled) {
            Long startTime = eventsBeingProfiled.get(eventName);
            /* Somebody tried to end an event that was not started. */
            if (startTime == null) {
                throw new IllegalStateException("Trying to end an event which was never started. " + eventName);
            }
            
            this.timingInfo.addSubMeasurement(eventName, new TimingInfo(startTime, System.nanoTime()));
        }
    }
    
    /**
     * Add 1 to an existing count for a given event. If the count for that event does not exist, then it creates one
     * and initializes it to 1.
     * 
     * This feature is enabled only if the system property "com.amazonaws.sdk.enableRuntimeProfiling" is set.
     * 
     * @param event - The name of the event to count
     */
    public void incrementCounter(String event) {
        if (profilingSystemPropertyEnabled) {
            timingInfo.incrementCounter(event);
        }
    }
    
    public void setCounter(String counterName, long count) {
        if (profilingSystemPropertyEnabled) {
            timingInfo.setCounter(counterName, count);
        }
    }
    
    /**
     * Add a property. If you add the same property more than once, it stores all values a list.
     * 
     * @param propertyName The name of the property
     * @param value The property value
     */
    public void addProperty(String propertyName, Object value) {
        List<Object> propertyList = properties.get(propertyName);
        if (propertyList == null) {
            propertyList = new ArrayList<Object>();
            properties.put(propertyName, propertyList);
        }
        
        propertyList.add(value);
    }
    
    public void log() {
        if (!profilingSystemPropertyEnabled) {
            return;
        }
        
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
    
    public TimingInfo getTimingInfo() {
        return timingInfo;
    }
}
