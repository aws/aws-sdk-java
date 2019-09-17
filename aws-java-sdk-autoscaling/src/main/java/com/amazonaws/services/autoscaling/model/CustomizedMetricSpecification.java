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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents a CloudWatch metric of your choosing for a target tracking scaling policy to use with Amazon EC2 Auto
 * Scaling.
 * </p>
 * <p>
 * To create your customized metric specification:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Add values for each required parameter from CloudWatch. You can use an existing metric, or a new metric that you
 * create. To use your own metric, you must first publish the metric to CloudWatch. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html">Publish Custom
 * Metrics</a> in the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Choose a metric that changes proportionally with capacity. The value of the metric should increase or decrease in
 * inverse proportion to the number of capacity units. That is, the value of the metric should decrease when capacity
 * increases.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about CloudWatch, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html">Amazon CloudWatch
 * Concepts</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CustomizedMetricSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomizedMetricSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The namespace of the metric.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     * <p>
     * Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling
     * policy.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricDimension> dimensions;
    /**
     * <p>
     * The statistic of the metric.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The unit of the metric.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @return The name of the metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomizedMetricSpecification withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     * 
     * @return The namespace of the metric.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomizedMetricSpecification withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     * <p>
     * Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling
     * policy.
     * </p>
     * 
     * @return The dimensions of the metric.</p>
     *         <p>
     *         Conditional: If you published your metric with dimensions, you must specify the same dimensions in your
     *         scaling policy.
     */

    public java.util.List<MetricDimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<MetricDimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     * <p>
     * Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling
     * policy.
     * </p>
     * 
     * @param dimensions
     *        The dimensions of the metric.</p>
     *        <p>
     *        Conditional: If you published your metric with dimensions, you must specify the same dimensions in your
     *        scaling policy.
     */

    public void setDimensions(java.util.Collection<MetricDimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new com.amazonaws.internal.SdkInternalList<MetricDimension>(dimensions);
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     * <p>
     * Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling
     * policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The dimensions of the metric.</p>
     *        <p>
     *        Conditional: If you published your metric with dimensions, you must specify the same dimensions in your
     *        scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomizedMetricSpecification withDimensions(MetricDimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new com.amazonaws.internal.SdkInternalList<MetricDimension>(dimensions.length));
        }
        for (MetricDimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dimensions of the metric.
     * </p>
     * <p>
     * Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling
     * policy.
     * </p>
     * 
     * @param dimensions
     *        The dimensions of the metric.</p>
     *        <p>
     *        Conditional: If you published your metric with dimensions, you must specify the same dimensions in your
     *        scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomizedMetricSpecification withDimensions(java.util.Collection<MetricDimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The statistic of the metric.
     * </p>
     * 
     * @param statistic
     *        The statistic of the metric.
     * @see MetricStatistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic of the metric.
     * </p>
     * 
     * @return The statistic of the metric.
     * @see MetricStatistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic of the metric.
     * </p>
     * 
     * @param statistic
     *        The statistic of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public CustomizedMetricSpecification withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic of the metric.
     * </p>
     * 
     * @param statistic
     *        The statistic of the metric.
     * @see MetricStatistic
     */

    public void setStatistic(MetricStatistic statistic) {
        withStatistic(statistic);
    }

    /**
     * <p>
     * The statistic of the metric.
     * </p>
     * 
     * @param statistic
     *        The statistic of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public CustomizedMetricSpecification withStatistic(MetricStatistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @param unit
     *        The unit of the metric.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @return The unit of the metric.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of the metric.
     * </p>
     * 
     * @param unit
     *        The unit of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomizedMetricSpecification withUnit(String unit) {
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic()).append(",");
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

        if (obj instanceof CustomizedMetricSpecification == false)
            return false;
        CustomizedMetricSpecification other = (CustomizedMetricSpecification) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
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

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public CustomizedMetricSpecification clone() {
        try {
            return (CustomizedMetricSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
