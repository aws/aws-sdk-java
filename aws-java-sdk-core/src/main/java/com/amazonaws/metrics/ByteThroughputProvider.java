/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.metrics;

/**
 * Byte throughput metric information provider.
 */
public abstract class ByteThroughputProvider {
    private long duration;
    private int byteCount;
    private final ThroughputMetricType throughputType;

    protected ByteThroughputProvider(ThroughputMetricType type) { this.throughputType = type; }
    public ThroughputMetricType getThroughputMetricType() { return throughputType; }
    public int getByteCount() { return byteCount; }
    public long getDurationNano() { return duration; }
    
    /**
     * Returns a provider id that can be used to compute the number of active
     * byte throughput provider of a specific metric type being active in a
     * given time interval.
     */
    public String getProviderId() { return super.toString(); }
    
    /**
     * @param bytesDelta the number of bytes to increment
     * @param startTimeNano the start time in nano seconds
     */
    protected void increment(int bytesDelta, long startTimeNano) {
        this.byteCount += bytesDelta;
        this.duration += System.nanoTime() - startTimeNano;
    }
    
    protected void reset() {
        this.byteCount = 0;
        this.duration = 0;
    }

    @Override
    public String toString() {
        return String.format(
                "providerId=%s, throughputType=%s, byteCount=%d, duration=%d",
                getProviderId(), throughputType, byteCount, duration);
    }
}
