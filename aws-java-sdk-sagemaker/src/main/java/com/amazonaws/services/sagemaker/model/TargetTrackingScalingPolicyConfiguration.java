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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A target tracking scaling policy. Includes support for predefined or customized metrics.
 * </p>
 * <p>
 * When using the <a
 * href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_PutScalingPolicy.html">PutScalingPolicy
 * </a> API, this parameter is required when you are creating a policy with the policy type
 * <code>TargetTrackingScaling</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TargetTrackingScalingPolicyConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetTrackingScalingPolicyConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object containing information about a metric.
     * </p>
     */
    private MetricSpecification metricSpecification;
    /**
     * <p>
     * The recommended target value to specify for the metric when creating a scaling policy.
     * </p>
     */
    private Double targetValue;

    /**
     * <p>
     * An object containing information about a metric.
     * </p>
     * 
     * @param metricSpecification
     *        An object containing information about a metric.
     */

    public void setMetricSpecification(MetricSpecification metricSpecification) {
        this.metricSpecification = metricSpecification;
    }

    /**
     * <p>
     * An object containing information about a metric.
     * </p>
     * 
     * @return An object containing information about a metric.
     */

    public MetricSpecification getMetricSpecification() {
        return this.metricSpecification;
    }

    /**
     * <p>
     * An object containing information about a metric.
     * </p>
     * 
     * @param metricSpecification
     *        An object containing information about a metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingScalingPolicyConfiguration withMetricSpecification(MetricSpecification metricSpecification) {
        setMetricSpecification(metricSpecification);
        return this;
    }

    /**
     * <p>
     * The recommended target value to specify for the metric when creating a scaling policy.
     * </p>
     * 
     * @param targetValue
     *        The recommended target value to specify for the metric when creating a scaling policy.
     */

    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    /**
     * <p>
     * The recommended target value to specify for the metric when creating a scaling policy.
     * </p>
     * 
     * @return The recommended target value to specify for the metric when creating a scaling policy.
     */

    public Double getTargetValue() {
        return this.targetValue;
    }

    /**
     * <p>
     * The recommended target value to specify for the metric when creating a scaling policy.
     * </p>
     * 
     * @param targetValue
     *        The recommended target value to specify for the metric when creating a scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetTrackingScalingPolicyConfiguration withTargetValue(Double targetValue) {
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
        if (getMetricSpecification() != null)
            sb.append("MetricSpecification: ").append(getMetricSpecification()).append(",");
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

        if (obj instanceof TargetTrackingScalingPolicyConfiguration == false)
            return false;
        TargetTrackingScalingPolicyConfiguration other = (TargetTrackingScalingPolicyConfiguration) obj;
        if (other.getMetricSpecification() == null ^ this.getMetricSpecification() == null)
            return false;
        if (other.getMetricSpecification() != null && other.getMetricSpecification().equals(this.getMetricSpecification()) == false)
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

        hashCode = prime * hashCode + ((getMetricSpecification() == null) ? 0 : getMetricSpecification().hashCode());
        hashCode = prime * hashCode + ((getTargetValue() == null) ? 0 : getTargetValue().hashCode());
        return hashCode;
    }

    @Override
    public TargetTrackingScalingPolicyConfiguration clone() {
        try {
            return (TargetTrackingScalingPolicyConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TargetTrackingScalingPolicyConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
