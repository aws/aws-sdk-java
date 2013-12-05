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
package com.amazonaws.metrics.internal.cloudwatch;

import static com.amazonaws.metrics.internal.cloudwatch.MachineMetric.DaemonThreadCount;
import static com.amazonaws.metrics.internal.cloudwatch.MachineMetric.DeadLockThreadCount;
import static com.amazonaws.metrics.internal.cloudwatch.MachineMetric.FreeMemory;
import static com.amazonaws.metrics.internal.cloudwatch.MachineMetric.OpenFileDescriptorCount;
import static com.amazonaws.metrics.internal.cloudwatch.MachineMetric.PeakThreadCount;
import static com.amazonaws.metrics.internal.cloudwatch.MachineMetric.SpareFileDescriptorCount;
import static com.amazonaws.metrics.internal.cloudwatch.MachineMetric.SpareMemory;
import static com.amazonaws.metrics.internal.cloudwatch.MachineMetric.ThreadCount;
import static com.amazonaws.metrics.internal.cloudwatch.MachineMetric.TotalMemory;
import static com.amazonaws.metrics.internal.cloudwatch.MachineMetric.TotalStartedThreadCount;
import static com.amazonaws.metrics.internal.cloudwatch.MachineMetric.UsedMemory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.LogFactory;

import com.amazonaws.jmx.spi.JmxInfoProvider;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.services.cloudwatch.model.Dimension;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.StandardUnit;

class MachineMetricFactory {
    private static final MachineMetric[] memoryMetrics = { 
        TotalMemory, FreeMemory, UsedMemory, SpareMemory, 
    };
    private static final MachineMetric[] threadMetrics = { 
        ThreadCount, DeadLockThreadCount, DaemonThreadCount, PeakThreadCount, TotalStartedThreadCount,  
    };
    private static final MachineMetric[] fdMetrics = { 
        OpenFileDescriptorCount, SpareFileDescriptorCount,  
    };
    private final JmxInfoProvider jmxInfoProvider = JmxInfoProvider.Factory.getJmxInfoProvider();

    private void addMetrics(List<MetricDatum> list, MachineMetric[] machineMetrics,
            long[] values, StandardUnit unit) {
        for (int i=0; i < machineMetrics.length; i++) {
            MachineMetric metric = machineMetrics[i];
            long val = values[i];
            // skip zero values in some cases
            if (val != 0 || metric.includeZeroValue()) {
                MetricDatum datum = new MetricDatum()
                    .withMetricName(metric.getMetricName())
                    .withDimensions(
                        new Dimension()
                        .withName(metric.getDimensionName())
                        .withValue(metric.name()))
                    .withUnit(unit)
                    .withValue((double) val)
                    ;
                list.add(datum);
            }
        }
    }

    List<MetricDatum> generateMetrics() {
        if (AwsSdkMetrics.isMachineMetricExcluded())
            return Collections.emptyList();
        // Memory usage
        List<MetricDatum> list = new ArrayList<MetricDatum>(MachineMetric.values().length);
        Runtime rt = Runtime.getRuntime();
        long totalMem = rt.totalMemory();
        long freeMem = rt.freeMemory();
        long usedMem = totalMem - freeMem;
        long spareMem = rt.maxMemory() - usedMem;
        long[] memories = { totalMem, freeMem, usedMem, spareMem  };
        addMetrics(list, memoryMetrics, memories, StandardUnit.Bytes);
        // Thread related counts
        try {
            addThreadMetrics(list);
        } catch (Throwable t) {
            LogFactory.getLog(getClass()).debug("Ignoring thread metrics", t);
        }
        // File descriptor usage
        try {
            addFileDescriptorMetrics(list);
        } catch (Throwable t) {
            LogFactory.getLog(getClass()).debug("Ignoring file descriptor metrics", t);
        }
        return list;
    }

    private void addFileDescriptorMetrics(List<MetricDatum> list) {
        JmxInfoProvider provider = JmxInfoProvider.Factory.getJmxInfoProvider();
        long[] fdInfo = provider.getFileDecriptorInfo();

        if (fdInfo != null) {
            long openFdCount = fdInfo[0];
            long maxFdCount = fdInfo[1];
            long[] fdCounts = { openFdCount, maxFdCount - openFdCount};
            addMetrics(list, fdMetrics, fdCounts, StandardUnit.Count);
        }
    }

    private void addThreadMetrics(List<MetricDatum> list) {
        int threadCount = jmxInfoProvider.getThreadCount();
        long[] ids = jmxInfoProvider.findDeadlockedThreads();
        int deadLockThreadCount = ids == null ? 0 : ids.length;
        int daemonThreadCount = jmxInfoProvider.getDaemonThreadCount();
        int peakThreadCount = jmxInfoProvider.getPeakThreadCount();
        long totalStartedThreadCount = jmxInfoProvider.getTotalStartedThreadCount();
        long[] counts = {
            threadCount,
            deadLockThreadCount,
            daemonThreadCount,
            peakThreadCount,
            totalStartedThreadCount
        };
        addMetrics(list, threadMetrics, counts, StandardUnit.Count);
    }
}
