/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.metrics;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.amazonaws.regions.Regions;

/**
 *  Administration of AwsSdkMetrics as an MBean.
 */
public class MetricAdmin implements MetricAdminMBean {
    @Override
    public boolean enableDefaultMetrics() {
        return AwsSdkMetrics.enableDefaultMetrics();
    }
    @Override
    public void disableMetrics() {
        AwsSdkMetrics.disableMetrics();
    }
    @Override
    public String getRequestMetricCollector() {
        MetricCollector mc = AwsSdkMetrics.getInternalMetricCollector();
        RequestMetricCollector rmc = mc == null ? null : mc.getRequestMetricCollector();
        return mc == null || rmc == RequestMetricCollector.NONE
             ? "NONE"
             : rmc.getClass().getName()
             ;
    }
    @Override
    public String getServiceMetricCollector() {
        MetricCollector mc = AwsSdkMetrics.getInternalMetricCollector();
        ServiceMetricCollector smc = mc == null ? null : mc.getServiceMetricCollector();
        return mc == null || smc == ServiceMetricCollector.NONE
             ? "NONE"
             : smc.getClass().getName()
             ;
    }
    @Override
    public boolean isMetricsEnabled() {
        return AwsSdkMetrics.isMetricsEnabled();
    }

    @Override
    public boolean isMachineMetricsExcluded() {
        return AwsSdkMetrics.isMachineMetricExcluded();
    }
    @Override
    public void setMachineMetricsExcluded(boolean excludeJvmMetrics) {
        AwsSdkMetrics.setMachineMetricsExcluded(excludeJvmMetrics);
    }
    @Override
    public String getRegion() {
        return AwsSdkMetrics.getRegionName();
    }
    @Override
    public void setRegion(String region) {
        AwsSdkMetrics.setRegion(region);
    }
    @Override
    public Integer getMetricQueueSize() {
        return AwsSdkMetrics.getMetricQueueSize();
    }
    @Override
    public void setMetricQueueSize(Integer metricQueueSize) {
        AwsSdkMetrics.setMetricQueueSize(metricQueueSize);

    }
    @Override
    public Integer getQueuePollTimeoutMilli() {
        Long queuePollTimeoutMilli = AwsSdkMetrics.getQueuePollTimeoutMilli();
        return queuePollTimeoutMilli == null ? null : queuePollTimeoutMilli.intValue();
    }
    @Override
    public void setQueuePollTimeoutMilli(Integer timeoutMilli) {
        AwsSdkMetrics.setQueuePollTimeoutMilli(timeoutMilli == null ? null : timeoutMilli.longValue());
    }
    @Override
    public String getMetricNameSpace() {
        return AwsSdkMetrics.getMetricNameSpace();
    }
    @Override
    public void setMetricNameSpace(String metricNameSpace) {
        AwsSdkMetrics.setMetricNameSpace(metricNameSpace);
    }

    @Override
    public boolean isPerHostMetricsIncluded() {
        return AwsSdkMetrics.isPerHostMetricIncluded();
    }
    @Override
    public void setPerHostMetricsIncluded(boolean includePerHostMetrics) {
        AwsSdkMetrics.setPerHostMetricsIncluded(includePerHostMetrics);
    }
    @Override
    public String getJvmMetricName() {
        return AwsSdkMetrics.getJvmMetricName();
    }
    @Override
    public void setJvmMetricName(String jvmMetricName) {
        AwsSdkMetrics.setJvmMetricName(jvmMetricName);
    }
    @Override
    public String getHostMetricName() {
        return AwsSdkMetrics.getHostMetricName();
    }
    @Override
    public void setHostMetricName(String hostMetricName) {
        AwsSdkMetrics.setHostMetricName(hostMetricName);
    }
    @Override
    public String getCredentialFile() {
        return AwsSdkMetrics.getCredentialFile();
    }

    @Override
    public void setCredentialFile(String filepath)
            throws FileNotFoundException, IOException {
        AwsSdkMetrics.setCredentialFile(filepath);
    }
    @Override
    public boolean isSingleMetricNamespace() {
        return AwsSdkMetrics.isSingleMetricNamespace();
    }
    @Override
    public void setSingleMetricNamespace(boolean singleMetricNamespace) {
        AwsSdkMetrics.setSingleMetricNamespace(singleMetricNamespace);
    }
}
