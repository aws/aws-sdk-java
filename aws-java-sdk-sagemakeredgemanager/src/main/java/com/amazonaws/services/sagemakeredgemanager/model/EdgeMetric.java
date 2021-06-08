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
package com.amazonaws.services.sagemakeredgemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information required for edge device metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/EdgeMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgeMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dimension of metrics published.
     * </p>
     */
    private String dimension;
    /**
     * <p>
     * Returns the name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * Returns the value of the metric.
     * </p>
     */
    private Double value;
    /**
     * <p>
     * Timestamp of when the metric was requested.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The dimension of metrics published.
     * </p>
     * 
     * @param dimension
     *        The dimension of metrics published.
     */

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * <p>
     * The dimension of metrics published.
     * </p>
     * 
     * @return The dimension of metrics published.
     */

    public String getDimension() {
        return this.dimension;
    }

    /**
     * <p>
     * The dimension of metrics published.
     * </p>
     * 
     * @param dimension
     *        The dimension of metrics published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeMetric withDimension(String dimension) {
        setDimension(dimension);
        return this;
    }

    /**
     * <p>
     * Returns the name of the metric.
     * </p>
     * 
     * @param metricName
     *        Returns the name of the metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * Returns the name of the metric.
     * </p>
     * 
     * @return Returns the name of the metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * Returns the name of the metric.
     * </p>
     * 
     * @param metricName
     *        Returns the name of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeMetric withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * Returns the value of the metric.
     * </p>
     * 
     * @param value
     *        Returns the value of the metric.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * Returns the value of the metric.
     * </p>
     * 
     * @return Returns the value of the metric.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * Returns the value of the metric.
     * </p>
     * 
     * @param value
     *        Returns the value of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeMetric withValue(Double value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the metric was requested.
     * </p>
     * 
     * @param timestamp
     *        Timestamp of when the metric was requested.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Timestamp of when the metric was requested.
     * </p>
     * 
     * @return Timestamp of when the metric was requested.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Timestamp of when the metric was requested.
     * </p>
     * 
     * @param timestamp
     *        Timestamp of when the metric was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeMetric withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getDimension() != null)
            sb.append("Dimension: ").append(getDimension()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgeMetric == false)
            return false;
        EdgeMetric other = (EdgeMetric) obj;
        if (other.getDimension() == null ^ this.getDimension() == null)
            return false;
        if (other.getDimension() != null && other.getDimension().equals(this.getDimension()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimension() == null) ? 0 : getDimension().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public EdgeMetric clone() {
        try {
            return (EdgeMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakeredgemanager.model.transform.EdgeMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
