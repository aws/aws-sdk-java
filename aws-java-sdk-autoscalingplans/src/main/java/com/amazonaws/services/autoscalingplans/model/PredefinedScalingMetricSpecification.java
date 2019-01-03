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
package com.amazonaws.services.autoscalingplans.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a predefined metric that can be used for dynamic scaling as part of a target tracking scaling policy.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/PredefinedScalingMetricSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredefinedScalingMetricSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Auto Scaling groups, Spot
     * Fleet requests, and ECS services.
     * </p>
     */
    private String predefinedScalingMetricType;
    /**
     * <p>
     * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric
     * type is <code>ALBRequestCountPerTarget</code> and there is a target group for an Application Load Balancer
     * attached to the Auto Scaling group, Spot Fleet request, or ECS service.
     * </p>
     * <p>
     * The format is
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target
     * -group-id&gt;, where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.
     * </p>
     * </li>
     * </ul>
     */
    private String resourceLabel;

    /**
     * <p>
     * The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Auto Scaling groups, Spot
     * Fleet requests, and ECS services.
     * </p>
     * 
     * @param predefinedScalingMetricType
     *        The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Auto Scaling
     *        groups, Spot Fleet requests, and ECS services.
     * @see ScalingMetricType
     */

    public void setPredefinedScalingMetricType(String predefinedScalingMetricType) {
        this.predefinedScalingMetricType = predefinedScalingMetricType;
    }

    /**
     * <p>
     * The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Auto Scaling groups, Spot
     * Fleet requests, and ECS services.
     * </p>
     * 
     * @return The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Auto Scaling
     *         groups, Spot Fleet requests, and ECS services.
     * @see ScalingMetricType
     */

    public String getPredefinedScalingMetricType() {
        return this.predefinedScalingMetricType;
    }

    /**
     * <p>
     * The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Auto Scaling groups, Spot
     * Fleet requests, and ECS services.
     * </p>
     * 
     * @param predefinedScalingMetricType
     *        The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Auto Scaling
     *        groups, Spot Fleet requests, and ECS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingMetricType
     */

    public PredefinedScalingMetricSpecification withPredefinedScalingMetricType(String predefinedScalingMetricType) {
        setPredefinedScalingMetricType(predefinedScalingMetricType);
        return this;
    }

    /**
     * <p>
     * The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Auto Scaling groups, Spot
     * Fleet requests, and ECS services.
     * </p>
     * 
     * @param predefinedScalingMetricType
     *        The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Auto Scaling
     *        groups, Spot Fleet requests, and ECS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingMetricType
     */

    public PredefinedScalingMetricSpecification withPredefinedScalingMetricType(ScalingMetricType predefinedScalingMetricType) {
        this.predefinedScalingMetricType = predefinedScalingMetricType.toString();
        return this;
    }

    /**
     * <p>
     * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric
     * type is <code>ALBRequestCountPerTarget</code> and there is a target group for an Application Load Balancer
     * attached to the Auto Scaling group, Spot Fleet request, or ECS service.
     * </p>
     * <p>
     * The format is
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target
     * -group-id&gt;, where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceLabel
     *        Identifies the resource associated with the metric type. You can't specify a resource label unless the
     *        metric type is <code>ALBRequestCountPerTarget</code> and there is a target group for an Application Load
     *        Balancer attached to the Auto Scaling group, Spot Fleet request, or ECS service.</p>
     *        <p>
     *        The format is
     *        app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;
     *        /&lt;target-group-id&gt;, where:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group
     *        ARN.
     *        </p>
     *        </li>
     */

    public void setResourceLabel(String resourceLabel) {
        this.resourceLabel = resourceLabel;
    }

    /**
     * <p>
     * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric
     * type is <code>ALBRequestCountPerTarget</code> and there is a target group for an Application Load Balancer
     * attached to the Auto Scaling group, Spot Fleet request, or ECS service.
     * </p>
     * <p>
     * The format is
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target
     * -group-id&gt;, where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Identifies the resource associated with the metric type. You can't specify a resource label unless the
     *         metric type is <code>ALBRequestCountPerTarget</code> and there is a target group for an Application Load
     *         Balancer attached to the Auto Scaling group, Spot Fleet request, or ECS service.</p>
     *         <p>
     *         The format is
     *         app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt
     *         ;/&lt;target-group-id&gt;, where:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group
     *         ARN.
     *         </p>
     *         </li>
     */

    public String getResourceLabel() {
        return this.resourceLabel;
    }

    /**
     * <p>
     * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric
     * type is <code>ALBRequestCountPerTarget</code> and there is a target group for an Application Load Balancer
     * attached to the Auto Scaling group, Spot Fleet request, or ECS service.
     * </p>
     * <p>
     * The format is
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target
     * -group-id&gt;, where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group ARN.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceLabel
     *        Identifies the resource associated with the metric type. You can't specify a resource label unless the
     *        metric type is <code>ALBRequestCountPerTarget</code> and there is a target group for an Application Load
     *        Balancer attached to the Auto Scaling group, Spot Fleet request, or ECS service.</p>
     *        <p>
     *        The format is
     *        app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;
     *        /&lt;target-group-id&gt;, where:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt; is the final portion of the target group
     *        ARN.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredefinedScalingMetricSpecification withResourceLabel(String resourceLabel) {
        setResourceLabel(resourceLabel);
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
        if (getPredefinedScalingMetricType() != null)
            sb.append("PredefinedScalingMetricType: ").append(getPredefinedScalingMetricType()).append(",");
        if (getResourceLabel() != null)
            sb.append("ResourceLabel: ").append(getResourceLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredefinedScalingMetricSpecification == false)
            return false;
        PredefinedScalingMetricSpecification other = (PredefinedScalingMetricSpecification) obj;
        if (other.getPredefinedScalingMetricType() == null ^ this.getPredefinedScalingMetricType() == null)
            return false;
        if (other.getPredefinedScalingMetricType() != null && other.getPredefinedScalingMetricType().equals(this.getPredefinedScalingMetricType()) == false)
            return false;
        if (other.getResourceLabel() == null ^ this.getResourceLabel() == null)
            return false;
        if (other.getResourceLabel() != null && other.getResourceLabel().equals(this.getResourceLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredefinedScalingMetricType() == null) ? 0 : getPredefinedScalingMetricType().hashCode());
        hashCode = prime * hashCode + ((getResourceLabel() == null) ? 0 : getResourceLabel().hashCode());
        return hashCode;
    }

    @Override
    public PredefinedScalingMetricSpecification clone() {
        try {
            return (PredefinedScalingMetricSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.autoscalingplans.model.transform.PredefinedScalingMetricSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
