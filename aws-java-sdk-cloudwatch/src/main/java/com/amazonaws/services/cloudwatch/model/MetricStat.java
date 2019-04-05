/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The period, in seconds, to use when retrieving the metric.
     * </p>
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
     * The unit to use for the returned data points.
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
     * The period, in seconds, to use when retrieving the metric.
     * </p>
     * 
     * @param period
     *        The period, in seconds, to use when retrieving the metric.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period, in seconds, to use when retrieving the metric.
     * </p>
     * 
     * @return The period, in seconds, to use when retrieving the metric.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The period, in seconds, to use when retrieving the metric.
     * </p>
     * 
     * @param period
     *        The period, in seconds, to use when retrieving the metric.
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
     * The unit to use for the returned data points.
     * </p>
     * 
     * @param unit
     *        The unit to use for the returned data points.
     * @see StandardUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit to use for the returned data points.
     * </p>
     * 
     * @return The unit to use for the returned data points.
     * @see StandardUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit to use for the returned data points.
     * </p>
     * 
     * @param unit
     *        The unit to use for the returned data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public MetricStat withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit to use for the returned data points.
     * </p>
     * 
     * @param unit
     *        The unit to use for the returned data points.
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
