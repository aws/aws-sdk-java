/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This structure defines the CloudWatch metric to return, along with the statistic, period, and unit.
 * </p>
 * <p>
 * For more information about the CloudWatch terminology below, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html">Amazon CloudWatch
 * concepts</a> in the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/MetricStat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricStat implements Serializable, Cloneable {

    /**
     * <p>
     * The CloudWatch metric to return, including the metric name, namespace, and dimensions. To get the exact metric
     * name, namespace, and dimensions, inspect the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html">Metric</a> object that is
     * returned by a call to <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html">ListMetrics</a>.
     * </p>
     */
    private Metric metric;
    /**
     * <p>
     * The statistic to return. It can include any CloudWatch statistic or extended statistic. For a list of valid
     * values, see the table in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic"
     * >Statistics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * The most commonly used metrics for predictive scaling are <code>Average</code> and <code>Sum</code>.
     * </p>
     */
    private String stat;
    /**
     * <p>
     * The unit to use for the returned data points. For a complete list of the units that CloudWatch supports, see the
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html">MetricDatum</a>
     * data type in the <i>Amazon CloudWatch API Reference</i>.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The CloudWatch metric to return, including the metric name, namespace, and dimensions. To get the exact metric
     * name, namespace, and dimensions, inspect the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html">Metric</a> object that is
     * returned by a call to <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html">ListMetrics</a>.
     * </p>
     * 
     * @param metric
     *        The CloudWatch metric to return, including the metric name, namespace, and dimensions. To get the exact
     *        metric name, namespace, and dimensions, inspect the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html">Metric</a> object
     *        that is returned by a call to <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html"
     *        >ListMetrics</a>.
     */

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The CloudWatch metric to return, including the metric name, namespace, and dimensions. To get the exact metric
     * name, namespace, and dimensions, inspect the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html">Metric</a> object that is
     * returned by a call to <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html">ListMetrics</a>.
     * </p>
     * 
     * @return The CloudWatch metric to return, including the metric name, namespace, and dimensions. To get the exact
     *         metric name, namespace, and dimensions, inspect the <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html">Metric</a> object
     *         that is returned by a call to <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html"
     *         >ListMetrics</a>.
     */

    public Metric getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The CloudWatch metric to return, including the metric name, namespace, and dimensions. To get the exact metric
     * name, namespace, and dimensions, inspect the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html">Metric</a> object that is
     * returned by a call to <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html">ListMetrics</a>.
     * </p>
     * 
     * @param metric
     *        The CloudWatch metric to return, including the metric name, namespace, and dimensions. To get the exact
     *        metric name, namespace, and dimensions, inspect the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html">Metric</a> object
     *        that is returned by a call to <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html"
     *        >ListMetrics</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStat withMetric(Metric metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The statistic to return. It can include any CloudWatch statistic or extended statistic. For a list of valid
     * values, see the table in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic"
     * >Statistics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * The most commonly used metrics for predictive scaling are <code>Average</code> and <code>Sum</code>.
     * </p>
     * 
     * @param stat
     *        The statistic to return. It can include any CloudWatch statistic or extended statistic. For a list of
     *        valid values, see the table in <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic"
     *        >Statistics</a> in the <i>Amazon CloudWatch User Guide</i>.</p>
     *        <p>
     *        The most commonly used metrics for predictive scaling are <code>Average</code> and <code>Sum</code>.
     */

    public void setStat(String stat) {
        this.stat = stat;
    }

    /**
     * <p>
     * The statistic to return. It can include any CloudWatch statistic or extended statistic. For a list of valid
     * values, see the table in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic"
     * >Statistics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * The most commonly used metrics for predictive scaling are <code>Average</code> and <code>Sum</code>.
     * </p>
     * 
     * @return The statistic to return. It can include any CloudWatch statistic or extended statistic. For a list of
     *         valid values, see the table in <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic"
     *         >Statistics</a> in the <i>Amazon CloudWatch User Guide</i>.</p>
     *         <p>
     *         The most commonly used metrics for predictive scaling are <code>Average</code> and <code>Sum</code>.
     */

    public String getStat() {
        return this.stat;
    }

    /**
     * <p>
     * The statistic to return. It can include any CloudWatch statistic or extended statistic. For a list of valid
     * values, see the table in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic"
     * >Statistics</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * The most commonly used metrics for predictive scaling are <code>Average</code> and <code>Sum</code>.
     * </p>
     * 
     * @param stat
     *        The statistic to return. It can include any CloudWatch statistic or extended statistic. For a list of
     *        valid values, see the table in <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic"
     *        >Statistics</a> in the <i>Amazon CloudWatch User Guide</i>.</p>
     *        <p>
     *        The most commonly used metrics for predictive scaling are <code>Average</code> and <code>Sum</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStat withStat(String stat) {
        setStat(stat);
        return this;
    }

    /**
     * <p>
     * The unit to use for the returned data points. For a complete list of the units that CloudWatch supports, see the
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html">MetricDatum</a>
     * data type in the <i>Amazon CloudWatch API Reference</i>.
     * </p>
     * 
     * @param unit
     *        The unit to use for the returned data points. For a complete list of the units that CloudWatch supports,
     *        see the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html">MetricDatum
     *        </a> data type in the <i>Amazon CloudWatch API Reference</i>.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit to use for the returned data points. For a complete list of the units that CloudWatch supports, see the
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html">MetricDatum</a>
     * data type in the <i>Amazon CloudWatch API Reference</i>.
     * </p>
     * 
     * @return The unit to use for the returned data points. For a complete list of the units that CloudWatch supports,
     *         see the <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html">
     *         MetricDatum</a> data type in the <i>Amazon CloudWatch API Reference</i>.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit to use for the returned data points. For a complete list of the units that CloudWatch supports, see the
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html">MetricDatum</a>
     * data type in the <i>Amazon CloudWatch API Reference</i>.
     * </p>
     * 
     * @param unit
     *        The unit to use for the returned data points. For a complete list of the units that CloudWatch supports,
     *        see the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html">MetricDatum
     *        </a> data type in the <i>Amazon CloudWatch API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStat withUnit(String unit) {
        setUnit(unit);
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
