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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metric you want to retain. Dimensions are optional.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricToRetain implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * What is measured by the behavior.
     * </p>
     */
    private String metric;
    /**
     * <p>
     * The dimension of a metric. This can't be used with custom metrics.
     * </p>
     */
    private MetricDimension metricDimension;

    /**
     * <p>
     * What is measured by the behavior.
     * </p>
     * 
     * @param metric
     *        What is measured by the behavior.
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * What is measured by the behavior.
     * </p>
     * 
     * @return What is measured by the behavior.
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * What is measured by the behavior.
     * </p>
     * 
     * @param metric
     *        What is measured by the behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricToRetain withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The dimension of a metric. This can't be used with custom metrics.
     * </p>
     * 
     * @param metricDimension
     *        The dimension of a metric. This can't be used with custom metrics.
     */

    public void setMetricDimension(MetricDimension metricDimension) {
        this.metricDimension = metricDimension;
    }

    /**
     * <p>
     * The dimension of a metric. This can't be used with custom metrics.
     * </p>
     * 
     * @return The dimension of a metric. This can't be used with custom metrics.
     */

    public MetricDimension getMetricDimension() {
        return this.metricDimension;
    }

    /**
     * <p>
     * The dimension of a metric. This can't be used with custom metrics.
     * </p>
     * 
     * @param metricDimension
     *        The dimension of a metric. This can't be used with custom metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricToRetain withMetricDimension(MetricDimension metricDimension) {
        setMetricDimension(metricDimension);
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
        if (getMetricDimension() != null)
            sb.append("MetricDimension: ").append(getMetricDimension());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricToRetain == false)
            return false;
        MetricToRetain other = (MetricToRetain) obj;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getMetricDimension() == null ^ this.getMetricDimension() == null)
            return false;
        if (other.getMetricDimension() != null && other.getMetricDimension().equals(this.getMetricDimension()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getMetricDimension() == null) ? 0 : getMetricDimension().hashCode());
        return hashCode;
    }

    @Override
    public MetricToRetain clone() {
        try {
            return (MetricToRetain) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.MetricToRetainMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
