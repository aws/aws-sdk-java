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
package com.amazonaws.metrics.internal.cloudwatch;

import com.amazonaws.metrics.MetricType;

/**
 * <a href=
 * "http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/metrics/package-summary.html"
 * >Machine Metrics</a>.
 */
enum MachineMetric implements MetricType {
    // JVM Metrics
    TotalMemory(Dim.Memory, MetricName.JvmMetric),
    FreeMemory(Dim.Memory, MetricName.JvmMetric),
    UsedMemory(Dim.Memory, MetricName.JvmMetric),
    SpareMemory(Dim.Memory, MetricName.JvmMetric),

    ThreadCount(Dim.Threads, MetricName.JvmMetric),
    DeadLockThreadCount(Dim.Threads, MetricName.JvmMetric, _.EXCLUDES_ZERO_VALUES),  // exclude zero value datum
    DaemonThreadCount(Dim.Threads, MetricName.JvmMetric, _.EXCLUDES_ZERO_VALUES),    // exclude zero value datum
    PeakThreadCount(Dim.Threads, MetricName.JvmMetric),
    TotalStartedThreadCount(Dim.Threads, MetricName.JvmMetric),

    // OS Metrics
    OpenFileDescriptorCount(Dim.FileDescriptors, MetricName.OSMetric),
    SpareFileDescriptorCount(Dim.FileDescriptors, MetricName.OSMetric),
    ;

    private final Dim dimension;
    private final boolean includeZeroValue; 
    private final MetricName metricName;

    private MachineMetric(Dim dimension, MetricName metricName) {
        this(dimension, metricName, _.INCLUDES_ZERO_VALUES);
    }
    private MachineMetric(Dim dimension, MetricName metricName, boolean includeZeroValue) {
        this.dimension = dimension;
        this.metricName = metricName;
        this.includeZeroValue = includeZeroValue;
    }
    String getDimensionName() { return dimension.name(); }
    String getMetricName() { return metricName.name(); }
    boolean includeZeroValue() { return includeZeroValue; }

    /** Returns the metric name for OS metrics. */
    static String getOSMetricName() {
        return MetricName.OSMetric.name();
    }

    /**
     * Machine metric names.
     */
    private static enum MetricName {
        JvmMetric,
        OSMetric,
        ;
    }
    /**
     * Dimensions.
     */
    private static enum Dim {
        Memory,
        Threads,
        FileDescriptors,
        ;
    }
    /**
     * An internal class used to holds static constants used by the enum. 
     */
    private static class _ {
        static final boolean INCLUDES_ZERO_VALUES = true;
        static final boolean EXCLUDES_ZERO_VALUES = false;
    }
}
