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
     * The metric type. The following predefined metrics are available:
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
     * target group.
     * </p>
     * </li>
     * </ul>
     */
    private String predefinedMetricType;
    /**
     * <p>
     * A label that uniquely identifies a specific Application Load Balancer target group from which to determine the
     * average request count served by your Auto Scaling group. You can't specify a resource label unless the target
     * group is attached to the Auto Scaling group.
     * </p>
     * <p>
     * You create the resource label by appending the final portion of the load balancer ARN and the final portion of
     * the target group ARN into a single value, separated by a forward slash (/). The format of the resource label is:
     * </p>
     * <p>
     * <code>app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff</code>.
     * </p>
     * <p>
     * Where:
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
     * <p>
     * To find the ARN for an Application Load Balancer, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> API operation. To find the ARN for the target group, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     * >DescribeTargetGroups</a> API operation.
     * </p>
     */
    private String resourceLabel;

    /**
     * <p>
     * The metric type. The following predefined metrics are available:
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
     * target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param predefinedMetricType
     *        The metric type. The following predefined metrics are available:</p>
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
     *        Balancer target group.
     *        </p>
     *        </li>
     * @see MetricType
     */

    public void setPredefinedMetricType(String predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType;
    }

    /**
     * <p>
     * The metric type. The following predefined metrics are available:
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
     * target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The metric type. The following predefined metrics are available:</p>
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
     *         Balancer target group.
     *         </p>
     *         </li>
     * @see MetricType
     */

    public String getPredefinedMetricType() {
        return this.predefinedMetricType;
    }

    /**
     * <p>
     * The metric type. The following predefined metrics are available:
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
     * target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param predefinedMetricType
     *        The metric type. The following predefined metrics are available:</p>
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
     *        Balancer target group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public PredefinedMetricSpecification withPredefinedMetricType(String predefinedMetricType) {
        setPredefinedMetricType(predefinedMetricType);
        return this;
    }

    /**
     * <p>
     * The metric type. The following predefined metrics are available:
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
     * target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param predefinedMetricType
     *        The metric type. The following predefined metrics are available:</p>
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
     *        Balancer target group.
     *        </p>
     *        </li>
     * @see MetricType
     */

    public void setPredefinedMetricType(MetricType predefinedMetricType) {
        withPredefinedMetricType(predefinedMetricType);
    }

    /**
     * <p>
     * The metric type. The following predefined metrics are available:
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
     * target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param predefinedMetricType
     *        The metric type. The following predefined metrics are available:</p>
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
     *        Balancer target group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public PredefinedMetricSpecification withPredefinedMetricType(MetricType predefinedMetricType) {
        this.predefinedMetricType = predefinedMetricType.toString();
        return this;
    }

    /**
     * <p>
     * A label that uniquely identifies a specific Application Load Balancer target group from which to determine the
     * average request count served by your Auto Scaling group. You can't specify a resource label unless the target
     * group is attached to the Auto Scaling group.
     * </p>
     * <p>
     * You create the resource label by appending the final portion of the load balancer ARN and the final portion of
     * the target group ARN into a single value, separated by a forward slash (/). The format of the resource label is:
     * </p>
     * <p>
     * <code>app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff</code>.
     * </p>
     * <p>
     * Where:
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
     * <p>
     * To find the ARN for an Application Load Balancer, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> API operation. To find the ARN for the target group, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     * >DescribeTargetGroups</a> API operation.
     * </p>
     * 
     * @param resourceLabel
     *        A label that uniquely identifies a specific Application Load Balancer target group from which to determine
     *        the average request count served by your Auto Scaling group. You can't specify a resource label unless the
     *        target group is attached to the Auto Scaling group.</p>
     *        <p>
     *        You create the resource label by appending the final portion of the load balancer ARN and the final
     *        portion of the target group ARN into a single value, separated by a forward slash (/). The format of the
     *        resource label is:
     *        </p>
     *        <p>
     *        <code>app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff</code>.
     *        </p>
     *        <p>
     *        Where:
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
     *        </ul>
     *        <p>
     *        To find the ARN for an Application Load Balancer, use the <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a> API operation. To find the ARN for the target group, use the <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     *        >DescribeTargetGroups</a> API operation.
     */

    public void setResourceLabel(String resourceLabel) {
        this.resourceLabel = resourceLabel;
    }

    /**
     * <p>
     * A label that uniquely identifies a specific Application Load Balancer target group from which to determine the
     * average request count served by your Auto Scaling group. You can't specify a resource label unless the target
     * group is attached to the Auto Scaling group.
     * </p>
     * <p>
     * You create the resource label by appending the final portion of the load balancer ARN and the final portion of
     * the target group ARN into a single value, separated by a forward slash (/). The format of the resource label is:
     * </p>
     * <p>
     * <code>app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff</code>.
     * </p>
     * <p>
     * Where:
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
     * <p>
     * To find the ARN for an Application Load Balancer, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> API operation. To find the ARN for the target group, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     * >DescribeTargetGroups</a> API operation.
     * </p>
     * 
     * @return A label that uniquely identifies a specific Application Load Balancer target group from which to
     *         determine the average request count served by your Auto Scaling group. You can't specify a resource label
     *         unless the target group is attached to the Auto Scaling group.</p>
     *         <p>
     *         You create the resource label by appending the final portion of the load balancer ARN and the final
     *         portion of the target group ARN into a single value, separated by a forward slash (/). The format of the
     *         resource label is:
     *         </p>
     *         <p>
     *         <code>app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff</code>.
     *         </p>
     *         <p>
     *         Where:
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
     *         </ul>
     *         <p>
     *         To find the ARN for an Application Load Balancer, use the <a href=
     *         "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *         >DescribeLoadBalancers</a> API operation. To find the ARN for the target group, use the <a href=
     *         "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     *         >DescribeTargetGroups</a> API operation.
     */

    public String getResourceLabel() {
        return this.resourceLabel;
    }

    /**
     * <p>
     * A label that uniquely identifies a specific Application Load Balancer target group from which to determine the
     * average request count served by your Auto Scaling group. You can't specify a resource label unless the target
     * group is attached to the Auto Scaling group.
     * </p>
     * <p>
     * You create the resource label by appending the final portion of the load balancer ARN and the final portion of
     * the target group ARN into a single value, separated by a forward slash (/). The format of the resource label is:
     * </p>
     * <p>
     * <code>app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff</code>.
     * </p>
     * <p>
     * Where:
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
     * <p>
     * To find the ARN for an Application Load Balancer, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> API operation. To find the ARN for the target group, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     * >DescribeTargetGroups</a> API operation.
     * </p>
     * 
     * @param resourceLabel
     *        A label that uniquely identifies a specific Application Load Balancer target group from which to determine
     *        the average request count served by your Auto Scaling group. You can't specify a resource label unless the
     *        target group is attached to the Auto Scaling group.</p>
     *        <p>
     *        You create the resource label by appending the final portion of the load balancer ARN and the final
     *        portion of the target group ARN into a single value, separated by a forward slash (/). The format of the
     *        resource label is:
     *        </p>
     *        <p>
     *        <code>app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff</code>.
     *        </p>
     *        <p>
     *        Where:
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
     *        </ul>
     *        <p>
     *        To find the ARN for an Application Load Balancer, use the <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a> API operation. To find the ARN for the target group, use the <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     *        >DescribeTargetGroups</a> API operation.
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
