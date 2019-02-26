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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a predefined metric for a target tracking scaling policy to use with Application Auto Scaling.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/PredefinedMetricSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredefinedMetricSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot fleet requests and
     * ECS services.
     * </p>
     */
    private String predefinedMetricType;
    /**
     * <p>
     * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric
     * type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot fleet request or
     * ECS service.
     * </p>
     * <p>
     * The format is
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target
     * -group-id&gt;, where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN
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
     * The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot fleet requests and
     * ECS services.
     * </p>
     * 
     * @param predefinedMetricType
     *        The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot fleet requests
     *        and ECS services.
     * @see MetricType
     */

    public void setPredefinedMetricType(String predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType;
    }

    /**
     * <p>
     * The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot fleet requests and
     * ECS services.
     * </p>
     * 
     * @return The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot fleet
     *         requests and ECS services.
     * @see MetricType
     */

    public String getPredefinedMetricType() {
        return this.predefinedMetricType;
    }

    /**
     * <p>
     * The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot fleet requests and
     * ECS services.
     * </p>
     * 
     * @param predefinedMetricType
     *        The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot fleet requests
     *        and ECS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public PredefinedMetricSpecification withPredefinedMetricType(String predefinedMetricType) {
        setPredefinedMetricType(predefinedMetricType);
        return this;
    }

    /**
     * <p>
     * The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot fleet requests and
     * ECS services.
     * </p>
     * 
     * @param predefinedMetricType
     *        The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot fleet requests
     *        and ECS services.
     * @see MetricType
     */

    public void setPredefinedMetricType(MetricType predefinedMetricType) {
        withPredefinedMetricType(predefinedMetricType);
    }

    /**
     * <p>
     * The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot fleet requests and
     * ECS services.
     * </p>
     * 
     * @param predefinedMetricType
     *        The metric type. The <code>ALBRequestCountPerTarget</code> metric type applies only to Spot fleet requests
     *        and ECS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public PredefinedMetricSpecification withPredefinedMetricType(MetricType predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType.toString();
        return this;
    }

    /**
     * <p>
     * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric
     * type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot fleet request or
     * ECS service.
     * </p>
     * <p>
     * The format is
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target
     * -group-id&gt;, where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN
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
     *        metric type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot
     *        fleet request or ECS service.</p>
     *        <p>
     *        The format is
     *        app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;
     *        /&lt;target-group-id&gt;, where:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN
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
     * type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot fleet request or
     * ECS service.
     * </p>
     * <p>
     * The format is
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target
     * -group-id&gt;, where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN
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
     *         metric type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot
     *         fleet request or ECS service.</p>
     *         <p>
     *         The format is
     *         app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt
     *         ;/&lt;target-group-id&gt;, where:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN
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
     * type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot fleet request or
     * ECS service.
     * </p>
     * <p>
     * The format is
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target
     * -group-id&gt;, where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN
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
     *        metric type is <code>ALBRequestCountPerTarget</code> and there is a target group attached to the Spot
     *        fleet request or ECS service.</p>
     *        <p>
     *        The format is
     *        app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;
     *        /&lt;target-group-id&gt;, where:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt; is the final portion of the load balancer ARN
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

    public PredefinedMetricSpecification withResourceLabel(String resourceLabel) {
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
        if (getPredefinedMetricType() != null)
            sb.append("PredefinedMetricType: ").append(getPredefinedMetricType()).append(",");
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

        if (obj instanceof PredefinedMetricSpecification == false)
            return false;
        PredefinedMetricSpecification other = (PredefinedMetricSpecification) obj;
        if (other.getPredefinedMetricType() == null ^ this.getPredefinedMetricType() == null)
            return false;
        if (other.getPredefinedMetricType() != null && other.getPredefinedMetricType().equals(this.getPredefinedMetricType()) == false)
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

        hashCode = prime * hashCode + ((getPredefinedMetricType() == null) ? 0 : getPredefinedMetricType().hashCode());
        hashCode = prime * hashCode + ((getResourceLabel() == null) ? 0 : getResourceLabel().hashCode());
        return hashCode;
    }

    @Override
    public PredefinedMetricSpecification clone() {
        try {
            return (PredefinedMetricSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationautoscaling.model.transform.PredefinedMetricSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
