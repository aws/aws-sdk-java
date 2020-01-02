/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This structure defines the metric to be returned, along with the statistics, period, and units.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/MetricStat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricStat implements Serializable, Cloneable {

    /**
     * <p>
     * The metric to return, including the metric name, namespace, and dimensions.
     * </p>
     */
    private Metric metric;
    /**
     * <p>
     * The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period can be as
     * short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that are collected at
     * intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution
     * metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     * <code>StorageResolution</code> of 1 second.
     * </p>
     * <p>
     * If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must specify
     * the period as follows or no data points in that time range is returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     * </p>
     * </li>
     * </ul>
     */
    private Integer period;
    /**
     * <p>
     * The statistic to return. It can include any CloudWatch statistic or extended statistic.
     * </p>
     */
    private String stat;
    /**
     * <p>
     * When you are using a <code>Put</code> operation, this defines what unit you want to use when storing the metric.
     * </p>
     * <p>
     * In a <code>Get</code> operation, if you omit <code>Unit</code> then all data that was collected with any unit is
     * returned, along with the corresponding units that were specified when the data was reported to CloudWatch. If you
     * specify a unit, the operation returns only data data that was collected with that unit specified. If you specify
     * a unit that does not match the data collected, the results of the operation are null. CloudWatch does not perform
     * unit conversions.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The metric to return, including the metric name, namespace, and dimensions.
     * </p>
     * 
     * @param metric
     *        The metric to return, including the metric name, namespace, and dimensions.
     */

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The metric to return, including the metric name, namespace, and dimensions.
     * </p>
     * 
     * @return The metric to return, including the metric name, namespace, and dimensions.
     */

    public Metric getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The metric to return, including the metric name, namespace, and dimensions.
     * </p>
     * 
     * @param metric
     *        The metric to return, including the metric name, namespace, and dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStat withMetric(Metric metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period can be as
     * short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that are collected at
     * intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution
     * metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     * <code>StorageResolution</code> of 1 second.
     * </p>
     * <p>
     * If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must specify
     * the period as follows or no data points in that time range is returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     * </p>
     * </li>
     * </ul>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period
     *        can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that
     *        are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of
     *        60. High-resolution metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     *        <code>StorageResolution</code> of 1 second.</p>
     *        <p>
     *        If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must
     *        specify the period as follows or no data points in that time range is returned:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     *        </p>
     *        </li>
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period can be as
     * short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that are collected at
     * intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution
     * metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     * <code>StorageResolution</code> of 1 second.
     * </p>
     * <p>
     * If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must specify
     * the period as follows or no data points in that time range is returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period
     *         can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that
     *         are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple
     *         of 60. High-resolution metrics are those metrics stored by a <code>PutMetricData</code> call that
     *         includes a <code>StorageResolution</code> of 1 second.</p>
     *         <p>
     *         If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must
     *         specify the period as follows or no data points in that time range is returned:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     *         </p>
     *         </li>
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period can be as
     * short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that are collected at
     * intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution
     * metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     * <code>StorageResolution</code> of 1 second.
     * </p>
     * <p>
     * If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must specify
     * the period as follows or no data points in that time range is returned:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     * </p>
     * </li>
     * <li>
     * <p>
     * Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     * </p>
     * </li>
     * </ul>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period
     *        can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that
     *        are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of
     *        60. High-resolution metrics are those metrics stored by a <code>PutMetricData</code> call that includes a
     *        <code>StorageResolution</code> of 1 second.</p>
     *        <p>
     *        If the <code>StartTime</code> parameter specifies a time stamp that is greater than 3 hours ago, you must
     *        specify the period as follows or no data points in that time range is returned:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Start time between 3 hours and 15 days ago - Use a multiple of 60 seconds (1 minute).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time between 15 and 63 days ago - Use a multiple of 300 seconds (5 minutes).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Start time greater than 63 days ago - Use a multiple of 3600 seconds (1 hour).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStat withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The statistic to return. It can include any CloudWatch statistic or extended statistic.
     * </p>
     * 
     * @param stat
     *        The statistic to return. It can include any CloudWatch statistic or extended statistic.
     */

    public void setStat(String stat) {
        this.stat = stat;
    }

    /**
     * <p>
     * The statistic to return. It can include any CloudWatch statistic or extended statistic.
     * </p>
     * 
     * @return The statistic to return. It can include any CloudWatch statistic or extended statistic.
     */

    public String getStat() {
        return this.stat;
    }

    /**
     * <p>
     * The statistic to return. It can include any CloudWatch statistic or extended statistic.
     * </p>
     * 
     * @param stat
     *        The statistic to return. It can include any CloudWatch statistic or extended statistic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStat withStat(String stat) {
        setStat(stat);
        return this;
    }

    /**
     * <p>
     * When you are using a <code>Put</code> operation, this defines what unit you want to use when storing the metric.
     * </p>
     * <p>
     * In a <code>Get</code> operation, if you omit <code>Unit</code> then all data that was collected with any unit is
     * returned, along with the corresponding units that were specified when the data was reported to CloudWatch. If you
     * specify a unit, the operation returns only data data that was collected with that unit specified. If you specify
     * a unit that does not match the data collected, the results of the operation are null. CloudWatch does not perform
     * unit conversions.
     * </p>
     * 
     * @param unit
     *        When you are using a <code>Put</code> operation, this defines what unit you want to use when storing the
     *        metric.</p>
     *        <p>
     *        In a <code>Get</code> operation, if you omit <code>Unit</code> then all data that was collected with any
     *        unit is returned, along with the corresponding units that were specified when the data was reported to
     *        CloudWatch. If you specify a unit, the operation returns only data data that was collected with that unit
     *        specified. If you specify a unit that does not match the data collected, the results of the operation are
     *        null. CloudWatch does not perform unit conversions.
     * @see StandardUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * When you are using a <code>Put</code> operation, this defines what unit you want to use when storing the metric.
     * </p>
     * <p>
     * In a <code>Get</code> operation, if you omit <code>Unit</code> then all data that was collected with any unit is
     * returned, along with the corresponding units that were specified when the data was reported to CloudWatch. If you
     * specify a unit, the operation returns only data data that was collected with that unit specified. If you specify
     * a unit that does not match the data collected, the results of the operation are null. CloudWatch does not perform
     * unit conversions.
     * </p>
     * 
     * @return When you are using a <code>Put</code> operation, this defines what unit you want to use when storing the
     *         metric.</p>
     *         <p>
     *         In a <code>Get</code> operation, if you omit <code>Unit</code> then all data that was collected with any
     *         unit is returned, along with the corresponding units that were specified when the data was reported to
     *         CloudWatch. If you specify a unit, the operation returns only data data that was collected with that unit
     *         specified. If you specify a unit that does not match the data collected, the results of the operation are
     *         null. CloudWatch does not perform unit conversions.
     * @see StandardUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * When you are using a <code>Put</code> operation, this defines what unit you want to use when storing the metric.
     * </p>
     * <p>
     * In a <code>Get</code> operation, if you omit <code>Unit</code> then all data that was collected with any unit is
     * returned, along with the corresponding units that were specified when the data was reported to CloudWatch. If you
     * specify a unit, the operation returns only data data that was collected with that unit specified. If you specify
     * a unit that does not match the data collected, the results of the operation are null. CloudWatch does not perform
     * unit conversions.
     * </p>
     * 
     * @param unit
     *        When you are using a <code>Put</code> operation, this defines what unit you want to use when storing the
     *        metric.</p>
     *        <p>
     *        In a <code>Get</code> operation, if you omit <code>Unit</code> then all data that was collected with any
     *        unit is returned, along with the corresponding units that were specified when the data was reported to
     *        CloudWatch. If you specify a unit, the operation returns only data data that was collected with that unit
     *        specified. If you specify a unit that does not match the data collected, the results of the operation are
     *        null. CloudWatch does not perform unit conversions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public MetricStat withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * When you are using a <code>Put</code> operation, this defines what unit you want to use when storing the metric.
     * </p>
     * <p>
     * In a <code>Get</code> operation, if you omit <code>Unit</code> then all data that was collected with any unit is
     * returned, along with the corresponding units that were specified when the data was reported to CloudWatch. If you
     * specify a unit, the operation returns only data data that was collected with that unit specified. If you specify
     * a unit that does not match the data collected, the results of the operation are null. CloudWatch does not perform
     * unit conversions.
     * </p>
     * 
     * @param unit
     *        When you are using a <code>Put</code> operation, this defines what unit you want to use when storing the
     *        metric.</p>
     *        <p>
     *        In a <code>Get</code> operation, if you omit <code>Unit</code> then all data that was collected with any
     *        unit is returned, along with the corresponding units that were specified when the data was reported to
     *        CloudWatch. If you specify a unit, the operation returns only data data that was collected with that unit
     *        specified. If you specify a unit that does not match the data collected, the results of the operation are
     *        null. CloudWatch does not perform unit conversions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public MetricStat withUnit(StandardUnit unit) {
        this.unit = unit.toString();
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
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getStat() != null)
            sb.append("Stat: ").append(getStat()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricStat == false)
            return false;
        MetricStat other = (MetricStat) obj;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getStat() == null ^ this.getStat() == null)
            return false;
        if (other.getStat() != null && other.getStat().equals(this.getStat()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStat() == null) ? 0 : getStat().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public MetricStat clone() {
        try {
            return (MetricStat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
