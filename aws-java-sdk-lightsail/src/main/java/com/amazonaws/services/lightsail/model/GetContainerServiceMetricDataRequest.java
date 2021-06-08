/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerServiceMetricData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContainerServiceMetricDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the container service for which to get metric data.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid container service metric names are listed below, along with the most useful statistics to include in your
     * request, and the published unit value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPUUtilization</code> - The average percentage of compute units that are currently in use across all nodes
     * of the container service. This metric identifies the processing power required to run containers on each node of
     * the container service.
     * </p>
     * <p>
     * Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MemoryUtilization</code> - The average percentage of available memory that is currently in use across all
     * nodes of the container service. This metric identifies the memory required to run containers on each node of the
     * container service.
     * </p>
     * <p>
     * Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String metricName;
    /**
     * <p>
     * The start time of the time period.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the time period.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <p>
     * All container service metric data is available in 5-minute (300 seconds) granularity.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified period. By
     * comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can determine the
     * full scope of a metric and how close the average use is to the <code>Minimum</code> and <code>Maximum</code>
     * values. This comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> statistics;

    /**
     * <p>
     * The name of the container service for which to get metric data.
     * </p>
     * 
     * @param serviceName
     *        The name of the container service for which to get metric data.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the container service for which to get metric data.
     * </p>
     * 
     * @return The name of the container service for which to get metric data.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the container service for which to get metric data.
     * </p>
     * 
     * @param serviceName
     *        The name of the container service for which to get metric data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerServiceMetricDataRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid container service metric names are listed below, along with the most useful statistics to include in your
     * request, and the published unit value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPUUtilization</code> - The average percentage of compute units that are currently in use across all nodes
     * of the container service. This metric identifies the processing power required to run containers on each node of
     * the container service.
     * </p>
     * <p>
     * Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MemoryUtilization</code> - The average percentage of available memory that is currently in use across all
     * nodes of the container service. This metric identifies the memory required to run containers on each node of the
     * container service.
     * </p>
     * <p>
     * Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The metric for which you want to return information.</p>
     *        <p>
     *        Valid container service metric names are listed below, along with the most useful statistics to include in
     *        your request, and the published unit value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CPUUtilization</code> - The average percentage of compute units that are currently in use across all
     *        nodes of the container service. This metric identifies the processing power required to run containers on
     *        each node of the container service.
     *        </p>
     *        <p>
     *        Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     *        </p>
     *        <p>
     *        Unit: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MemoryUtilization</code> - The average percentage of available memory that is currently in use
     *        across all nodes of the container service. This metric identifies the memory required to run containers on
     *        each node of the container service.
     *        </p>
     *        <p>
     *        Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     *        </p>
     *        <p>
     *        Unit: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     * @see ContainerServiceMetricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid container service metric names are listed below, along with the most useful statistics to include in your
     * request, and the published unit value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPUUtilization</code> - The average percentage of compute units that are currently in use across all nodes
     * of the container service. This metric identifies the processing power required to run containers on each node of
     * the container service.
     * </p>
     * <p>
     * Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MemoryUtilization</code> - The average percentage of available memory that is currently in use across all
     * nodes of the container service. This metric identifies the memory required to run containers on each node of the
     * container service.
     * </p>
     * <p>
     * Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The metric for which you want to return information.</p>
     *         <p>
     *         Valid container service metric names are listed below, along with the most useful statistics to include
     *         in your request, and the published unit value.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CPUUtilization</code> - The average percentage of compute units that are currently in use across
     *         all nodes of the container service. This metric identifies the processing power required to run
     *         containers on each node of the container service.
     *         </p>
     *         <p>
     *         Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     *         </p>
     *         <p>
     *         Unit: The published unit is <code>Percent</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MemoryUtilization</code> - The average percentage of available memory that is currently in use
     *         across all nodes of the container service. This metric identifies the memory required to run containers
     *         on each node of the container service.
     *         </p>
     *         <p>
     *         Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     *         </p>
     *         <p>
     *         Unit: The published unit is <code>Percent</code>.
     *         </p>
     *         </li>
     * @see ContainerServiceMetricName
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid container service metric names are listed below, along with the most useful statistics to include in your
     * request, and the published unit value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPUUtilization</code> - The average percentage of compute units that are currently in use across all nodes
     * of the container service. This metric identifies the processing power required to run containers on each node of
     * the container service.
     * </p>
     * <p>
     * Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MemoryUtilization</code> - The average percentage of available memory that is currently in use across all
     * nodes of the container service. This metric identifies the memory required to run containers on each node of the
     * container service.
     * </p>
     * <p>
     * Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The metric for which you want to return information.</p>
     *        <p>
     *        Valid container service metric names are listed below, along with the most useful statistics to include in
     *        your request, and the published unit value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CPUUtilization</code> - The average percentage of compute units that are currently in use across all
     *        nodes of the container service. This metric identifies the processing power required to run containers on
     *        each node of the container service.
     *        </p>
     *        <p>
     *        Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     *        </p>
     *        <p>
     *        Unit: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MemoryUtilization</code> - The average percentage of available memory that is currently in use
     *        across all nodes of the container service. This metric identifies the memory required to run containers on
     *        each node of the container service.
     *        </p>
     *        <p>
     *        Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     *        </p>
     *        <p>
     *        Unit: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServiceMetricName
     */

    public GetContainerServiceMetricDataRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid container service metric names are listed below, along with the most useful statistics to include in your
     * request, and the published unit value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPUUtilization</code> - The average percentage of compute units that are currently in use across all nodes
     * of the container service. This metric identifies the processing power required to run containers on each node of
     * the container service.
     * </p>
     * <p>
     * Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MemoryUtilization</code> - The average percentage of available memory that is currently in use across all
     * nodes of the container service. This metric identifies the memory required to run containers on each node of the
     * container service.
     * </p>
     * <p>
     * Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * Unit: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The metric for which you want to return information.</p>
     *        <p>
     *        Valid container service metric names are listed below, along with the most useful statistics to include in
     *        your request, and the published unit value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CPUUtilization</code> - The average percentage of compute units that are currently in use across all
     *        nodes of the container service. This metric identifies the processing power required to run containers on
     *        each node of the container service.
     *        </p>
     *        <p>
     *        Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     *        </p>
     *        <p>
     *        Unit: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MemoryUtilization</code> - The average percentage of available memory that is currently in use
     *        across all nodes of the container service. This metric identifies the memory required to run containers on
     *        each node of the container service.
     *        </p>
     *        <p>
     *        Statistics: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     *        </p>
     *        <p>
     *        Unit: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerServiceMetricName
     */

    public GetContainerServiceMetricDataRequest withMetricName(ContainerServiceMetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The start time of the time period.
     * </p>
     * 
     * @param startTime
     *        The start time of the time period.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the time period.
     * </p>
     * 
     * @return The start time of the time period.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the time period.
     * </p>
     * 
     * @param startTime
     *        The start time of the time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerServiceMetricDataRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the time period.
     * </p>
     * 
     * @param endTime
     *        The end time of the time period.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the time period.
     * </p>
     * 
     * @return The end time of the time period.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the time period.
     * </p>
     * 
     * @param endTime
     *        The end time of the time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerServiceMetricDataRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <p>
     * All container service metric data is available in 5-minute (300 seconds) granularity.
     * </p>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points.</p>
     *        <p>
     *        All container service metric data is available in 5-minute (300 seconds) granularity.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <p>
     * All container service metric data is available in 5-minute (300 seconds) granularity.
     * </p>
     * 
     * @return The granularity, in seconds, of the returned data points.</p>
     *         <p>
     *         All container service metric data is available in 5-minute (300 seconds) granularity.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <p>
     * All container service metric data is available in 5-minute (300 seconds) granularity.
     * </p>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points.</p>
     *        <p>
     *        All container service metric data is available in 5-minute (300 seconds) granularity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerServiceMetricDataRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified period. By
     * comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can determine the
     * full scope of a metric and how close the average use is to the <code>Minimum</code> and <code>Maximum</code>
     * values. This comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The statistic for the metric.</p>
     *         <p>
     *         The following statistics are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *         low volumes of activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Maximum</code> - The highest value observed during the specified period. Use this value to
     *         determine high volumes of activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Sum</code> - All values submitted for the matching metric added together. You can use this
     *         statistic to determine the total volume of a metric.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified
     *         period. By comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you
     *         can determine the full scope of a metric and how close the average use is to the <code>Minimum</code> and
     *         <code>Maximum</code> values. This comparison helps you to know when to increase or decrease your
     *         resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *         </p>
     *         </li>
     * @see MetricStatistic
     */

    public java.util.List<String> getStatistics() {
        return statistics;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified period. By
     * comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can determine the
     * full scope of a metric and how close the average use is to the <code>Minimum</code> and <code>Maximum</code>
     * values. This comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistics
     *        The statistic for the metric.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified
     *        period. By comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can
     *        determine the full scope of a metric and how close the average use is to the <code>Minimum</code> and
     *        <code>Maximum</code> values. This comparison helps you to know when to increase or decrease your
     *        resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @see MetricStatistic
     */

    public void setStatistics(java.util.Collection<String> statistics) {
        if (statistics == null) {
            this.statistics = null;
            return;
        }

        this.statistics = new java.util.ArrayList<String>(statistics);
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified period. By
     * comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can determine the
     * full scope of a metric and how close the average use is to the <code>Minimum</code> and <code>Maximum</code>
     * values. This comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatistics(java.util.Collection)} or {@link #withStatistics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statistics
     *        The statistic for the metric.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified
     *        period. By comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can
     *        determine the full scope of a metric and how close the average use is to the <code>Minimum</code> and
     *        <code>Maximum</code> values. This comparison helps you to know when to increase or decrease your
     *        resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetContainerServiceMetricDataRequest withStatistics(String... statistics) {
        if (this.statistics == null) {
            setStatistics(new java.util.ArrayList<String>(statistics.length));
        }
        for (String ele : statistics) {
            this.statistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified period. By
     * comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can determine the
     * full scope of a metric and how close the average use is to the <code>Minimum</code> and <code>Maximum</code>
     * values. This comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistics
     *        The statistic for the metric.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified
     *        period. By comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can
     *        determine the full scope of a metric and how close the average use is to the <code>Minimum</code> and
     *        <code>Maximum</code> values. This comparison helps you to know when to increase or decrease your
     *        resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetContainerServiceMetricDataRequest withStatistics(java.util.Collection<String> statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified period. By
     * comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can determine the
     * full scope of a metric and how close the average use is to the <code>Minimum</code> and <code>Maximum</code>
     * values. This comparison helps you to know when to increase or decrease your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistics
     *        The statistic for the metric.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> - The value of <code>Sum</code> / <code>SampleCount</code> during the specified
     *        period. By comparing this statistic with the <code>Minimum</code> and <code>Maximum</code> values, you can
     *        determine the full scope of a metric and how close the average use is to the <code>Minimum</code> and
     *        <code>Maximum</code> values. This comparison helps you to know when to increase or decrease your
     *        resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetContainerServiceMetricDataRequest withStatistics(MetricStatistic... statistics) {
        java.util.ArrayList<String> statisticsCopy = new java.util.ArrayList<String>(statistics.length);
        for (MetricStatistic value : statistics) {
            statisticsCopy.add(value.toString());
        }
        if (getStatistics() == null) {
            setStatistics(statisticsCopy);
        } else {
            getStatistics().addAll(statisticsCopy);
        }
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContainerServiceMetricDataRequest == false)
            return false;
        GetContainerServiceMetricDataRequest other = (GetContainerServiceMetricDataRequest) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetContainerServiceMetricDataRequest clone() {
        return (GetContainerServiceMetricDataRequest) super.clone();
    }

}
