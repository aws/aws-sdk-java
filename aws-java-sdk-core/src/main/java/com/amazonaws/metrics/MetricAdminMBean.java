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
import java.net.InetAddress;

/**
 * MBean interface for AwsSdkMetrics administration.
 */
public interface MetricAdminMBean {
    /**
     * Returns true if metrics at the AWS SDK level is enabled; false if
     * disabled.
     */
    public boolean isMetricsEnabled();

    /**
     * Returns the name of the request metric collector set at the AWS SDK
     * level, or NONE if there is none.
     */
    public String getRequestMetricCollector();

    /**
     * Returns the name of the service metric collector set at the AWS SDK
     * level, or NONE if there is none.
     */
    public String getServiceMetricCollector();

    /**
     * Starts the default AWS SDK metric collector, but only if no metric
     * collector is currently in use at the AWS SDK level.
     * 
     * @return true if the default AWS SDK metric collector has been
     *         successfully started by this call; false otherwise.
     */
    public boolean enableDefaultMetrics();

    /**
     * Disables the metric collector at the AWS SDK level.
     */
    public void disableMetrics();

    /**
     * Returns true if machine metrics is to be excluded; false otherwise.
     */
    public boolean isMachineMetricsExcluded();

    /**
     * Used to set whether the JVM metrics is to be excluded.
     * 
     * @param excludeMachineMetrics
     *            true if JVM metrics is to be excluded; false otherwise.
     */
    public void setMachineMetricsExcluded(boolean excludeMachineMetrics);

    /**
     * Returns true if per-host metrics is to be included; false otherwise.
     */
    public boolean isPerHostMetricsIncluded();

    /**
     * Used to set whether the per-host metrics is to be included.
     * 
     * @param includePerHostMetrics
     *            true if per-host metrics is to be included; false otherwise.
     */
    public void setPerHostMetricsIncluded(boolean includePerHostMetrics);

    /**
     * Returns the region configured for the default AWS SDK metric collector;
     * or null if the default is to be used.
     */
    public String getRegion();

    /**
     * Sets the region to be used for the default AWS SDK metric collector; or
     * null if the default is to be used.
     */
    public void setRegion(String region);

    /**
     * Returns the last set AWS credential file; or null if there is none.
     */
    public String getCredentialFile();

    /**
     * Sets the AWS credential file used by the default AWS SDK metric collector
     * for accessing CloudWatch.
     * 
     * @param filepath
     *            must be a valid path to an AWS credential property file.
     */
    public void setCredentialFile(String filepath)
        throws FileNotFoundException, IOException;

    /**
     * Returns the internal metric queue size to be used for the default AWS SDK
     * metric collector; or null if the default is to be used.
     */
    public Integer getMetricQueueSize();

    /**
     * Sets the metric queue size to be used for the default AWS SDK metric
     * collector; or null if the default is to be used.
     */
    public void setMetricQueueSize(Integer metricQueueSize);

    /**
     * Returns the internal metric queue timeout in millisecond to be used for
     * the default AWS SDK metric collector; or null if the default is to be
     * used. Use Integer instead of Long as it seems jconsole does not handle
     * Long properly.
     */
    public Integer getQueuePollTimeoutMilli();

    /**
     * Sets the queue poll time in millisecond to be used for the default AWS
     * SDK metric collector; or null if the default is to be used. Use Integer
     * instead of Long as it seems jconsole does not handle Long properly.
     */
    public void setQueuePollTimeoutMilli(Integer timeoutMilli);

    /**
     * Returns the metric name space.
     */
    public String getMetricNameSpace();

    /**
     * Sets the metric name space.
     * 
     * @throws IllegalArgumentException
     *             if the given name space is either null or blank.
     */
    public void setMetricNameSpace(String metricNameSpace);

    /**
     * Returns the JVM metric name. If the returned value is either null or
     * blank, no JVM level metrics will be generated.
     */
    public String getJvmMetricName();

    /**
     * Sets the JVM metric name to enable per-JVM level metrics generation. If
     * the given value is either null or blank, no JVM level metrics will be
     * generated.
     */
    public void setJvmMetricName(String jvmMetricName);

    /**
     * Returns the host name for metric purposes. If the returned value is
     * either null or blank, the host name will be automatically detected via
     * {@link InetAddress}.
     */
    public String getHostMetricName();

    /**
     * Sets the host name to enable per-host level metrics generation. If
     * the given value is either null or blank but the per-host metric is
     * enabled, the host name will be automatically detected via
     * {@link InetAddress}.
     */
    public void setHostMetricName(String hostMetricName);

    /**
     * Returns true if single metric name space is to be used; false otherwise.
     */
    public boolean isSingleMetricNamespace();

    /**
     * Used to set whether a single metric name space is to be used.
     */
    public void setSingleMetricNamespace(boolean singleMetricNamespace);
}