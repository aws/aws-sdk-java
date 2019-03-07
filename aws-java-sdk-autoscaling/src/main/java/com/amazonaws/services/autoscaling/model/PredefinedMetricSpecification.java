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
 * Represents a predefined metric for a target tracking scaling policy to use with Amazon EC2 Auto Scaling.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PredefinedMetricSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredefinedMetricSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The metric type.
     * </p>
     */
    private String predefinedMetricType;
    /**
     * <p>
     * Identifies the resource associated with the metric type. The following predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code> - Average CPU utilization of the Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code> - Average number of bytes received on all network interfaces by the Auto Scaling
     * group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code> - Average number of bytes sent out on all network interfaces by the Auto
     * Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code> - Number of requests completed per target in an Application Load Balancer
     * or a Network Load Balancer target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For predefined metric types <code>ASGAverageCPUUtilization</code>, <code>ASGAverageNetworkIn</code>, and
     * <code>ASGAverageNetworkOut</code>, the parameter must not be specified as the resource associated with the metric
     * type is the Auto Scaling group. For predefined metric type <code>ALBRequestCountPerTarget</code>, the parameter
     * must be specified in the format:
     * <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     * , where <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code> is the final portion of the load
     * balancer ARN, and <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code> is the final portion
     * of the target group ARN. The target group must be attached to the Auto Scaling group.
     * </p>
     */
    private String resourceLabel;

    /**
     * <p>
     * The metric type.
     * </p>
     * 
     * @param predefinedMetricType
     *        The metric type.
     * @see MetricType
     */

    public void setPredefinedMetricType(String predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType;
    }

    /**
     * <p>
     * The metric type.
     * </p>
     * 
     * @return The metric type.
     * @see MetricType
     */

    public String getPredefinedMetricType() {
        return this.predefinedMetricType;
    }

    /**
     * <p>
     * The metric type.
     * </p>
     * 
     * @param predefinedMetricType
     *        The metric type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public PredefinedMetricSpecification withPredefinedMetricType(String predefinedMetricType) {
        setPredefinedMetricType(predefinedMetricType);
        return this;
    }

    /**
     * <p>
     * The metric type.
     * </p>
     * 
     * @param predefinedMetricType
     *        The metric type.
     * @see MetricType
     */

    public void setPredefinedMetricType(MetricType predefinedMetricType) {
        withPredefinedMetricType(predefinedMetricType);
    }

    /**
     * <p>
     * The metric type.
     * </p>
     * 
     * @param predefinedMetricType
     *        The metric type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public PredefinedMetricSpecification withPredefinedMetricType(MetricType predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType.toString();
        return this;
    }

    /**
     * <p>
     * Identifies the resource associated with the metric type. The following predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code> - Average CPU utilization of the Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code> - Average number of bytes received on all network interfaces by the Auto Scaling
     * group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code> - Average number of bytes sent out on all network interfaces by the Auto
     * Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code> - Number of requests completed per target in an Application Load Balancer
     * or a Network Load Balancer target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For predefined metric types <code>ASGAverageCPUUtilization</code>, <code>ASGAverageNetworkIn</code>, and
     * <code>ASGAverageNetworkOut</code>, the parameter must not be specified as the resource associated with the metric
     * type is the Auto Scaling group. For predefined metric type <code>ALBRequestCountPerTarget</code>, the parameter
     * must be specified in the format:
     * <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     * , where <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code> is the final portion of the load
     * balancer ARN, and <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code> is the final portion
     * of the target group ARN. The target group must be attached to the Auto Scaling group.
     * </p>
     * 
     * @param resourceLabel
     *        Identifies the resource associated with the metric type. The following predefined metrics are
     *        available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASGAverageCPUUtilization</code> - Average CPU utilization of the Auto Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASGAverageNetworkIn</code> - Average number of bytes received on all network interfaces by the Auto
     *        Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASGAverageNetworkOut</code> - Average number of bytes sent out on all network interfaces by the Auto
     *        Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALBRequestCountPerTarget</code> - Number of requests completed per target in an Application Load
     *        Balancer or a Network Load Balancer target group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For predefined metric types <code>ASGAverageCPUUtilization</code>, <code>ASGAverageNetworkIn</code>, and
     *        <code>ASGAverageNetworkOut</code>, the parameter must not be specified as the resource associated with the
     *        metric type is the Auto Scaling group. For predefined metric type <code>ALBRequestCountPerTarget</code>,
     *        the parameter must be specified in the format:
     *        <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     *        , where <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code> is the final portion of the
     *        load balancer ARN, and <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code> is the
     *        final portion of the target group ARN. The target group must be attached to the Auto Scaling group.
     */

    public void setResourceLabel(String resourceLabel) {
        this.resourceLabel = resourceLabel;
    }

    /**
     * <p>
     * Identifies the resource associated with the metric type. The following predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code> - Average CPU utilization of the Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code> - Average number of bytes received on all network interfaces by the Auto Scaling
     * group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code> - Average number of bytes sent out on all network interfaces by the Auto
     * Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code> - Number of requests completed per target in an Application Load Balancer
     * or a Network Load Balancer target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For predefined metric types <code>ASGAverageCPUUtilization</code>, <code>ASGAverageNetworkIn</code>, and
     * <code>ASGAverageNetworkOut</code>, the parameter must not be specified as the resource associated with the metric
     * type is the Auto Scaling group. For predefined metric type <code>ALBRequestCountPerTarget</code>, the parameter
     * must be specified in the format:
     * <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     * , where <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code> is the final portion of the load
     * balancer ARN, and <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code> is the final portion
     * of the target group ARN. The target group must be attached to the Auto Scaling group.
     * </p>
     * 
     * @return Identifies the resource associated with the metric type. The following predefined metrics are
     *         available:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASGAverageCPUUtilization</code> - Average CPU utilization of the Auto Scaling group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASGAverageNetworkIn</code> - Average number of bytes received on all network interfaces by the Auto
     *         Scaling group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASGAverageNetworkOut</code> - Average number of bytes sent out on all network interfaces by the
     *         Auto Scaling group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALBRequestCountPerTarget</code> - Number of requests completed per target in an Application Load
     *         Balancer or a Network Load Balancer target group.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For predefined metric types <code>ASGAverageCPUUtilization</code>, <code>ASGAverageNetworkIn</code>, and
     *         <code>ASGAverageNetworkOut</code>, the parameter must not be specified as the resource associated with
     *         the metric type is the Auto Scaling group. For predefined metric type
     *         <code>ALBRequestCountPerTarget</code>, the parameter must be specified in the format:
     *         <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     *         , where <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code> is the final portion of the
     *         load balancer ARN, and <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code> is the
     *         final portion of the target group ARN. The target group must be attached to the Auto Scaling group.
     */

    public String getResourceLabel() {
        return this.resourceLabel;
    }

    /**
     * <p>
     * Identifies the resource associated with the metric type. The following predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code> - Average CPU utilization of the Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code> - Average number of bytes received on all network interfaces by the Auto Scaling
     * group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code> - Average number of bytes sent out on all network interfaces by the Auto
     * Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code> - Number of requests completed per target in an Application Load Balancer
     * or a Network Load Balancer target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For predefined metric types <code>ASGAverageCPUUtilization</code>, <code>ASGAverageNetworkIn</code>, and
     * <code>ASGAverageNetworkOut</code>, the parameter must not be specified as the resource associated with the metric
     * type is the Auto Scaling group. For predefined metric type <code>ALBRequestCountPerTarget</code>, the parameter
     * must be specified in the format:
     * <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     * , where <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code> is the final portion of the load
     * balancer ARN, and <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code> is the final portion
     * of the target group ARN. The target group must be attached to the Auto Scaling group.
     * </p>
     * 
     * @param resourceLabel
     *        Identifies the resource associated with the metric type. The following predefined metrics are
     *        available:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASGAverageCPUUtilization</code> - Average CPU utilization of the Auto Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASGAverageNetworkIn</code> - Average number of bytes received on all network interfaces by the Auto
     *        Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASGAverageNetworkOut</code> - Average number of bytes sent out on all network interfaces by the Auto
     *        Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALBRequestCountPerTarget</code> - Number of requests completed per target in an Application Load
     *        Balancer or a Network Load Balancer target group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For predefined metric types <code>ASGAverageCPUUtilization</code>, <code>ASGAverageNetworkIn</code>, and
     *        <code>ASGAverageNetworkOut</code>, the parameter must not be specified as the resource associated with the
     *        metric type is the Auto Scaling group. For predefined metric type <code>ALBRequestCountPerTarget</code>,
     *        the parameter must be specified in the format:
     *        <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i>/targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code>
     *        , where <code>app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code> is the final portion of the
     *        load balancer ARN, and <code>targetgroup/<i>target-group-name</i>/<i>target-group-id</i> </code> is the
     *        final portion of the target group ARN. The target group must be attached to the Auto Scaling group.
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

}
