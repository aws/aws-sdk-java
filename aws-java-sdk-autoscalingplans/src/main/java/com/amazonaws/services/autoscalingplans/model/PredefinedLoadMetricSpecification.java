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
 * Represents a predefined metric that can be used for predictive scaling.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/PredefinedLoadMetricSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredefinedLoadMetricSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric type.
     * </p>
     */
    private String predefinedLoadMetricType;
    /**
     * <p>
     * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric
     * type is <code>ALBRequestCountPerTarget</code> and there is a target group for an Application Load Balancer
     * attached to the Auto Scaling group.
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
     * The metric type.
     * </p>
     * 
     * @param predefinedLoadMetricType
     *        The metric type.
     * @see LoadMetricType
     */

    public void setPredefinedLoadMetricType(String predefinedLoadMetricType) {
        this.predefinedLoadMetricType = predefinedLoadMetricType;
    }

    /**
     * <p>
     * The metric type.
     * </p>
     * 
     * @return The metric type.
     * @see LoadMetricType
     */

    public String getPredefinedLoadMetricType() {
        return this.predefinedLoadMetricType;
    }

    /**
     * <p>
     * The metric type.
     * </p>
     * 
     * @param predefinedLoadMetricType
     *        The metric type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadMetricType
     */

    public PredefinedLoadMetricSpecification withPredefinedLoadMetricType(String predefinedLoadMetricType) {
        setPredefinedLoadMetricType(predefinedLoadMetricType);
        return this;
    }

    /**
     * <p>
     * The metric type.
     * </p>
     * 
     * @param predefinedLoadMetricType
     *        The metric type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadMetricType
     */

    public PredefinedLoadMetricSpecification withPredefinedLoadMetricType(LoadMetricType predefinedLoadMetricType) {
        this.predefinedLoadMetricType = predefinedLoadMetricType.toString();
        return this;
    }

    /**
     * <p>
     * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric
     * type is <code>ALBRequestCountPerTarget</code> and there is a target group for an Application Load Balancer
     * attached to the Auto Scaling group.
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
     *        Balancer attached to the Auto Scaling group.</p>
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
     * attached to the Auto Scaling group.
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
     *         Balancer attached to the Auto Scaling group.</p>
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
     * attached to the Auto Scaling group.
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
     *        Balancer attached to the Auto Scaling group.</p>
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

    public PredefinedLoadMetricSpecification withResourceLabel(String resourceLabel) {
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
        if (getPredefinedLoadMetricType() != null)
            sb.append("PredefinedLoadMetricType: ").append(getPredefinedLoadMetricType()).append(",");
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

        if (obj instanceof PredefinedLoadMetricSpecification == false)
            return false;
        PredefinedLoadMetricSpecification other = (PredefinedLoadMetricSpecification) obj;
        if (other.getPredefinedLoadMetricType() == null ^ this.getPredefinedLoadMetricType() == null)
            return false;
        if (other.getPredefinedLoadMetricType() != null && other.getPredefinedLoadMetricType().equals(this.getPredefinedLoadMetricType()) == false)
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

        hashCode = prime * hashCode + ((getPredefinedLoadMetricType() == null) ? 0 : getPredefinedLoadMetricType().hashCode());
        hashCode = prime * hashCode + ((getResourceLabel() == null) ? 0 : getResourceLabel().hashCode());
        return hashCode;
    }

    @Override
    public PredefinedLoadMetricSpecification clone() {
        try {
            return (PredefinedLoadMetricSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.autoscalingplans.model.transform.PredefinedLoadMetricSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
