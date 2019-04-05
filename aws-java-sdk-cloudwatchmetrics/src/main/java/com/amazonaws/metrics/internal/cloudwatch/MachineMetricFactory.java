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
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.LogFactory;

import com.amazonaws.jmx.spi.JmxInfoProvider;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.MetricType;
import com.amazonaws.services.cloudwatch.model.Dimension;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.StandardUnit;

class MachineMetricFactory {
    private static final List<MachineMetric> memoryMetrics = Arrays.asList(
            TotalMemory, FreeMemory, UsedMemory, SpareMemory);
    private static final List<MachineMetric> threadMetrics = Arrays.asList(
            ThreadCount, DeadLockThreadCount, DaemonThreadCount,
            PeakThreadCount, TotalStartedThreadCount);
    private static final List<MachineMetric> fdMetrics = Arrays.asList(
            OpenFileDescriptorCount, SpareFileDescriptorCount);
    private final JmxInfoProvider jmxInfoProvider = JmxInfoProvider.Factory.getJmxInfoProvider();

    /**
     * Add the given list of metrics and corresponding values specified in
     * "metricValues" to the given list of metric datum.
     * 
     * @param list
     *            list of metric data
     * @param metricValues
     *            list of metrics and their corresponding values
     */
    private void addMetrics(List<MetricDatum> list,
            MetricValues metricValues,
            StandardUnit unit) {
        List<MachineMetric> machineMetrics = metricValues.getMetrics();
        List<Long> values = metricValues.getValues();
        for (int i=0; i < machineMetrics.size(); i++) {
            MachineMetric metric = machineMetrics.get(i);
            long val = values.get(i).longValue();
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

    /**
     * Returns the set of custom machine metrics specified in the SDK metrics
     * registry; or an empty set if there is none. Note any machine metrics
     * found in the registry must have been custom specified, as the default
     * behavior is to include all machine metrics when enabled.
     * 
     * @return a non-null set of machine metrics. An empty set means no custom
     *         machine metrics have been specified.
     */
    private Set<MachineMetric> customMachineMetrics() {
        Set<MachineMetric> customized = new HashSet<MachineMetric>();
        for (MetricType m: AwsSdkMetrics.getPredefinedMetrics()) {
            if (m instanceof MachineMetric)
                customized.add((MachineMetric)m);
        }
        return customized;
    }

    /**
     * Returns a subset of the given list of metrics in "defaults" and the
     * corresponding value of each returned metric in the subset. Note if the
     * custom set is empty, the full set of default machine metrics and values
     * will be returned. (In particular, as in set theory, a set is a subset of
     * itself.)
     * 
     * @param customSet
     *            custom machine metrics specified in the SDK metrics registry
     * @param defaults
     *            the given default list of metrics
     * @param values
     *            corresponding values of each metric in "defaults"
     */
    private MetricValues metricValues(Set<MachineMetric> customSet,
            List<MachineMetric> defaults, List<Long> values) {
        List<MachineMetric> actualMetrics = defaults;
        List<Long> actualValues = values;
        if (customSet.size() > 0) {
            // custom set of machine metrics specified
            actualMetrics = new ArrayList<MachineMetric>();
            actualValues = new ArrayList<Long>();
            for (int i=0; i < defaults.size(); i++) {
                MachineMetric mm = defaults.get(i);
                if (customSet.contains(mm)) {
                    actualMetrics.add(mm);
                    actualValues.add(values.get(i));
                }
            }
        }
        return new MetricValues(actualMetrics, actualValues);
    }

    List<MetricDatum> generateMetrics() {
        if (AwsSdkMetrics.isMachineMetricExcluded())
            return Collections.emptyList();
        Set<MachineMetric> customSet = customMachineMetrics();
        List<MetricDatum> targetList = new ArrayList<MetricDatum>(
                MachineMetric.values().length);
        // Memory usage
        addMemoryMetrics(targetList, customSet);
        // Thread related counts
        try {
            addThreadMetrics(targetList, customSet);
        } catch (Throwable t) {
            LogFactory.getLog(getClass()).debug("Ignoring thread metrics", t);
        }
        // File descriptor usage
        try {
            addFileDescriptorMetrics(targetList, customSet);
        } catch (Throwable t) {
            LogFactory.getLog(getClass()).debug("Ignoring file descriptor metrics", t);
        }
        return targetList;
    }

    private void addMemoryMetrics(List<MetricDatum> targetList,
            Set<MachineMetric> customSet) {
        Runtime rt = Runtime.getRuntime();
        long totalMem = rt.totalMemory();
        long freeMem = rt.freeMemory();
        long usedMem = totalMem - freeMem;
        long spareMem = rt.maxMemory() - usedMem;
        List<Long> values = Arrays.asList(totalMem, freeMem, usedMem, spareMem);
        MetricValues metricValues = memoryMetricValues(customSet, values);
        addMetrics(targetList, metricValues, StandardUnit.Bytes);
    }

    private void addFileDescriptorMetrics(List<MetricDatum> targetList,
            Set<MachineMetric> customSet) {
        JmxInfoProvider provider = JmxInfoProvider.Factory.getJmxInfoProvider();
        long[] fdInfo = provider.getFileDecriptorInfo();

        if (fdInfo != null) {
            long openFdCount = fdInfo[0];
            long maxFdCount = fdInfo[1];
            List<Long> values = Arrays.asList(openFdCount, maxFdCount - openFdCount);
            MetricValues metricValues = fdMetricValues(customSet, values); 
            addMetrics(targetList, metricValues, StandardUnit.Count);
        }
    }

    private void addThreadMetrics(List<MetricDatum> targetList,
            Set<MachineMetric> customSet) {
        long threadCount = jmxInfoProvider.getThreadCount();
        long[] ids = jmxInfoProvider.findDeadlockedThreads();
        long deadLockThreadCount = ids == null ? 0 : ids.length;
        long daemonThreadCount = jmxInfoProvider.getDaemonThreadCount();
        long peakThreadCount = jmxInfoProvider.getPeakThreadCount();
        long totalStartedThreadCount = jmxInfoProvider.getTotalStartedThreadCount();
        List<Long> values = Arrays.asList(threadCount,
            deadLockThreadCount,
            daemonThreadCount,
            peakThreadCount,
            totalStartedThreadCount);
        MetricValues metricValues = threadMetricValues(customSet, values); 
        addMetrics(targetList, metricValues, StandardUnit.Count);
    }

    /**
     * Returns the set of memory metrics and the corresponding values based on
     * the default and the customized set of metrics, if any.
     * 
     * @param customSet
     *            a non-null customized set of metrics
     * @param values
     *            a non-null list of values corresponding to the list of default
     *            memory metrics
     */
    private MetricValues memoryMetricValues(Set<MachineMetric> customSet,
            List<Long> values) {
        return metricValues(customSet, MachineMetricFactory.memoryMetrics,
                values);
    }

    /**
     * Returns the set of file-descriptor metrics and the corresponding values based on
     * the default and the customized set of metrics, if any.
     * 
     * @param customSet
     *            a non-null customized set of metrics
     * @param values
     *            a non-null list of values corresponding to the list of default
     *            file-descriptor metrics
     */
    private MetricValues fdMetricValues(Set<MachineMetric> customSet,
            List<Long> values) {
        return metricValues(customSet, MachineMetricFactory.fdMetrics, values);
    }

    /**
     * Returns the set of thread metrics and the corresponding values based on
     * the default and the customized set of metrics, if any.
     * 
     * @param customSet
     *            a non-null customized set of metrics
     * @param values
     *            a non-null list of values corresponding to the list of default
     *            thread metrics
     */
    private MetricValues threadMetricValues(Set<MachineMetric> customSet,
            List<Long> values) {
        return metricValues(customSet, MachineMetricFactory.threadMetrics,
                values);
    }

    // Used to get around the limitation of Java returning at most a single value
    private static class MetricValues {
        private final List<MachineMetric> metrics;
        private final List<Long> values;
        MetricValues(List<MachineMetric> metrics, List<Long> values) {
            this.metrics = metrics;
            this.values = values;
        }
        List<MachineMetric> getMetrics() { return metrics; }
        List<Long> getValues() { return values; }
    }
}
