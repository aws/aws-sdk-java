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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines when a new instance is auto-scaled into the compute fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/TargetTrackingScalingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetTrackingScalingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric type to determine auto-scaling.
     * </p>
     */
    private String metricType;
    /**
     * <p>
     * The value of <code>metricType</code> when to start scaling.
     * </p>
     */
    private Double targetValue;

    /**
     * <p>
     * The metric type to determine auto-scaling.
     * </p>
     * 
     * @param metricType
     *        The metric type to determine auto-scaling.
     * @see FleetScalingMetricType
     */

    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    /**
     * <p>
     * The metric type to determine auto-scaling.
     * </p>
     * 
     * @return The metric type to determine auto-scaling.
     * @see FleetScalingMetricType
     */

    public String getMetricType() {
        return this.metricType;
    }

    /**
     * <p>
     * The metric type to determine auto-scaling.
     * </p>
     * 
     * @param metricType
     *        The metric type to determine auto-scaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetScalingMetricType
     */

    public TargetTrackingScalingConfiguration withMetricType(String metricType) {
        setMetricType(metricType);
        return this;
    }

    /**
     * <p>
     * The metric type to determine auto-scaling.
     * </p>
     * 
     * @param metricType
     *        The metric type to determine auto-scaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetScalingMetricType
     */

    public TargetTrackingScalingConfiguration withMetricType(FleetScalingMetricType metricType) {
        this.metricType = metricType.toString();
        return this;
    }

    /**
     * <p>
     * The value of <code>metricType</code> when to start scaling.
     * </p>
     * 
     * @param targetValue
     *        The value of <code>metricType</code> when to start scaling.
     */

    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    /**
     * <p>
     * The value of <code>metricType</code> when to start scaling.
     * </p>
     * 
     * @return The value of <code>metricType</code> when to start scaling.
     */

    public Double getTargetValue() {
        return this.targetValue;
    }

    /**
     * <p>
     * The value of <code>metricType</code> when to start scaling.
     * </p>
     * 
     * @param targetValue
     *        The value of <code>metricType</code> when to start scaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingScalingConfiguration withTargetValue(Double targetValue) {
        setTargetValue(targetValue);
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
        if (getMetricType() != null)
            sb.append("MetricType: ").append(getMetricType()).append(",");
        if (getTargetValue() != null)
            sb.append("TargetValue: ").append(getTargetValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetTrackingScalingConfiguration == false)
            return false;
        TargetTrackingScalingConfiguration other = (TargetTrackingScalingConfiguration) obj;
        if (other.getMetricType() == null ^ this.getMetricType() == null)
            return false;
        if (other.getMetricType() != null && other.getMetricType().equals(this.getMetricType()) == false)
            return false;
        if (other.getTargetValue() == null ^ this.getTargetValue() == null)
            return false;
        if (other.getTargetValue() != null && other.getTargetValue().equals(this.getTargetValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricType() == null) ? 0 : getMetricType().hashCode());
        hashCode = prime * hashCode + ((getTargetValue() == null) ? 0 : getTargetValue().hashCode());
        return hashCode;
    }

    @Override
    public TargetTrackingScalingConfiguration clone() {
        try {
            return (TargetTrackingScalingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.TargetTrackingScalingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
