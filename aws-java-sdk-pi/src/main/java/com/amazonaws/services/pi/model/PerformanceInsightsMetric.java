/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This data type helps to determine Performance Insights metric to render for the insight.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/PerformanceInsightsMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerformanceInsightsMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Performance Insights metric.
     * </p>
     */
    private String metric;
    /**
     * <p>
     * The Performance Insights metric name.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * A dimension map that contains the dimensions for this partition.
     * </p>
     */
    private java.util.Map<String, String> dimensions;
    /**
     * <p>
     * The value of the metric. For example, <code>9</code> for <code>db.load.avg</code>.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The Performance Insights metric.
     * </p>
     * 
     * @param metric
     *        The Performance Insights metric.
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The Performance Insights metric.
     * </p>
     * 
     * @return The Performance Insights metric.
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The Performance Insights metric.
     * </p>
     * 
     * @param metric
     *        The Performance Insights metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetric withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The Performance Insights metric name.
     * </p>
     * 
     * @param displayName
     *        The Performance Insights metric name.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The Performance Insights metric name.
     * </p>
     * 
     * @return The Performance Insights metric name.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The Performance Insights metric name.
     * </p>
     * 
     * @param displayName
     *        The Performance Insights metric name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetric withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * A dimension map that contains the dimensions for this partition.
     * </p>
     * 
     * @return A dimension map that contains the dimensions for this partition.
     */

    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * A dimension map that contains the dimensions for this partition.
     * </p>
     * 
     * @param dimensions
     *        A dimension map that contains the dimensions for this partition.
     */

    public void setDimensions(java.util.Map<String, String> dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * A dimension map that contains the dimensions for this partition.
     * </p>
     * 
     * @param dimensions
     *        A dimension map that contains the dimensions for this partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetric withDimensions(java.util.Map<String, String> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * Add a single Dimensions entry
     *
     * @see PerformanceInsightsMetric#withDimensions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetric addDimensionsEntry(String key, String value) {
        if (null == this.dimensions) {
            this.dimensions = new java.util.HashMap<String, String>();
        }
        if (this.dimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Dimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetric clearDimensionsEntries() {
        this.dimensions = null;
        return this;
    }

    /**
     * <p>
     * The value of the metric. For example, <code>9</code> for <code>db.load.avg</code>.
     * </p>
     * 
     * @param value
     *        The value of the metric. For example, <code>9</code> for <code>db.load.avg</code>.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the metric. For example, <code>9</code> for <code>db.load.avg</code>.
     * </p>
     * 
     * @return The value of the metric. For example, <code>9</code> for <code>db.load.avg</code>.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the metric. For example, <code>9</code> for <code>db.load.avg</code>.
     * </p>
     * 
     * @param value
     *        The value of the metric. For example, <code>9</code> for <code>db.load.avg</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceInsightsMetric withValue(Double value) {
        setValue(value);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PerformanceInsightsMetric == false)
            return false;
        PerformanceInsightsMetric other = (PerformanceInsightsMetric) obj;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public PerformanceInsightsMetric clone() {
        try {
            return (PerformanceInsightsMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.PerformanceInsightsMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
