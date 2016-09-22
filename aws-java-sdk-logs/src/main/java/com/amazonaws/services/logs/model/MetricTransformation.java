/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * 
 */
public class MetricTransformation implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * Namespace to which the metric belongs.
     * </p>
     */
    private String metricNamespace;
    /**
     * <p>
     * A string representing a value to publish to this metric when a filter pattern matches a log event.
     * </p>
     */
    private String metricValue;
    /**
     * <p>
     * (Optional) A default value to emit when a filter pattern does not match a log event. Can be null.
     * </p>
     */
    private Double defaultValue;

    /**
     * <p>
     * Name of the metric.
     * </p>
     * 
     * @param metricName
     *        Name of the metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * Name of the metric.
     * </p>
     * 
     * @return Name of the metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * Name of the metric.
     * </p>
     * 
     * @param metricName
     *        Name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricTransformation withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * Namespace to which the metric belongs.
     * </p>
     * 
     * @param metricNamespace
     *        Namespace to which the metric belongs.
     */

    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    /**
     * <p>
     * Namespace to which the metric belongs.
     * </p>
     * 
     * @return Namespace to which the metric belongs.
     */

    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    /**
     * <p>
     * Namespace to which the metric belongs.
     * </p>
     * 
     * @param metricNamespace
     *        Namespace to which the metric belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricTransformation withMetricNamespace(String metricNamespace) {
        setMetricNamespace(metricNamespace);
        return this;
    }

    /**
     * <p>
     * A string representing a value to publish to this metric when a filter pattern matches a log event.
     * </p>
     * 
     * @param metricValue
     *        A string representing a value to publish to this metric when a filter pattern matches a log event.
     */

    public void setMetricValue(String metricValue) {
        this.metricValue = metricValue;
    }

    /**
     * <p>
     * A string representing a value to publish to this metric when a filter pattern matches a log event.
     * </p>
     * 
     * @return A string representing a value to publish to this metric when a filter pattern matches a log event.
     */

    public String getMetricValue() {
        return this.metricValue;
    }

    /**
     * <p>
     * A string representing a value to publish to this metric when a filter pattern matches a log event.
     * </p>
     * 
     * @param metricValue
     *        A string representing a value to publish to this metric when a filter pattern matches a log event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricTransformation withMetricValue(String metricValue) {
        setMetricValue(metricValue);
        return this;
    }

    /**
     * <p>
     * (Optional) A default value to emit when a filter pattern does not match a log event. Can be null.
     * </p>
     * 
     * @param defaultValue
     *        (Optional) A default value to emit when a filter pattern does not match a log event. Can be null.
     */

    public void setDefaultValue(Double defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * (Optional) A default value to emit when a filter pattern does not match a log event. Can be null.
     * </p>
     * 
     * @return (Optional) A default value to emit when a filter pattern does not match a log event. Can be null.
     */

    public Double getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * (Optional) A default value to emit when a filter pattern does not match a log event. Can be null.
     * </p>
     * 
     * @param defaultValue
     *        (Optional) A default value to emit when a filter pattern does not match a log event. Can be null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricTransformation withDefaultValue(Double defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("MetricName: " + getMetricName() + ",");
        if (getMetricNamespace() != null)
            sb.append("MetricNamespace: " + getMetricNamespace() + ",");
        if (getMetricValue() != null)
            sb.append("MetricValue: " + getMetricValue() + ",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: " + getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricTransformation == false)
            return false;
        MetricTransformation other = (MetricTransformation) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricNamespace() == null ^ this.getMetricNamespace() == null)
            return false;
        if (other.getMetricNamespace() != null && other.getMetricNamespace().equals(this.getMetricNamespace()) == false)
            return false;
        if (other.getMetricValue() == null ^ this.getMetricValue() == null)
            return false;
        if (other.getMetricValue() != null && other.getMetricValue().equals(this.getMetricValue()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricNamespace() == null) ? 0 : getMetricNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public MetricTransformation clone() {
        try {
            return (MetricTransformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
