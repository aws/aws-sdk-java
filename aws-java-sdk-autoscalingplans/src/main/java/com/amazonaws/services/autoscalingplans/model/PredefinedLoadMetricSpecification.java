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
package com.amazonaws.services.autoscalingplans.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a predefined metric that can be used for predictive scaling.
 * </p>
 * <p>
 * After creating your scaling plan, you can use the AWS Auto Scaling console to visualize forecasts for the specified
 * metric. For more information, see <a
 * href="https://docs.aws.amazon.com/autoscaling/plans/userguide/gs-create-scaling-plan.html#gs-view-resource">View
 * Scaling Information for a Resource</a> in the <i>AWS Auto Scaling User Guide</i>.
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
     * type is <code>ALBTargetGroupRequestCount</code> and there is a target group for an Application Load Balancer
     * attached to the Auto Scaling group.
     * </p>
     * <p>
     * You create the resource label by appending the final portion of the load balancer ARN and the final portion of
     * the target group ARN into a single value, separated by a forward slash (/). The format is
     * app/&lt;load-balancer-name
     * &gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:
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
     * This is an example:
     * app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
     * </p>
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
     * type is <code>ALBTargetGroupRequestCount</code> and there is a target group for an Application Load Balancer
     * attached to the Auto Scaling group.
     * </p>
     * <p>
     * You create the resource label by appending the final portion of the load balancer ARN and the final portion of
     * the target group ARN into a single value, separated by a forward slash (/). The format is
     * app/&lt;load-balancer-name
     * &gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:
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
     * This is an example:
     * app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
     * </p>
     * <p>
     * To find the ARN for an Application Load Balancer, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> API operation. To find the ARN for the target group, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     * >DescribeTargetGroups</a> API operation.
     * </p>
     * 
     * @param resourceLabel
     *        Identifies the resource associated with the metric type. You can't specify a resource label unless the
     *        metric type is <code>ALBTargetGroupRequestCount</code> and there is a target group for an Application Load
     *        Balancer attached to the Auto Scaling group.</p>
     *        <p>
     *        You create the resource label by appending the final portion of the load balancer ARN and the final
     *        portion of the target group ARN into a single value, separated by a forward slash (/). The format is
     *        app/&lt
     *        ;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group
     *        -id&gt;, where:
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
     *        This is an example:
     *        app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
     *        </p>
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
     * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric
     * type is <code>ALBTargetGroupRequestCount</code> and there is a target group for an Application Load Balancer
     * attached to the Auto Scaling group.
     * </p>
     * <p>
     * You create the resource label by appending the final portion of the load balancer ARN and the final portion of
     * the target group ARN into a single value, separated by a forward slash (/). The format is
     * app/&lt;load-balancer-name
     * &gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:
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
     * This is an example:
     * app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
     * </p>
     * <p>
     * To find the ARN for an Application Load Balancer, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> API operation. To find the ARN for the target group, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     * >DescribeTargetGroups</a> API operation.
     * </p>
     * 
     * @return Identifies the resource associated with the metric type. You can't specify a resource label unless the
     *         metric type is <code>ALBTargetGroupRequestCount</code> and there is a target group for an Application
     *         Load Balancer attached to the Auto Scaling group.</p>
     *         <p>
     *         You create the resource label by appending the final portion of the load balancer ARN and the final
     *         portion of the target group ARN into a single value, separated by a forward slash (/). The format is
     *         app/&lt;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-
     *         group-id&gt;, where:
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
     *         This is an example:
     *         app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
     *         </p>
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
     * Identifies the resource associated with the metric type. You can't specify a resource label unless the metric
     * type is <code>ALBTargetGroupRequestCount</code> and there is a target group for an Application Load Balancer
     * attached to the Auto Scaling group.
     * </p>
     * <p>
     * You create the resource label by appending the final portion of the load balancer ARN and the final portion of
     * the target group ARN into a single value, separated by a forward slash (/). The format is
     * app/&lt;load-balancer-name
     * &gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group-id&gt;, where:
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
     * This is an example:
     * app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
     * </p>
     * <p>
     * To find the ARN for an Application Load Balancer, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> API operation. To find the ARN for the target group, use the <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     * >DescribeTargetGroups</a> API operation.
     * </p>
     * 
     * @param resourceLabel
     *        Identifies the resource associated with the metric type. You can't specify a resource label unless the
     *        metric type is <code>ALBTargetGroupRequestCount</code> and there is a target group for an Application Load
     *        Balancer attached to the Auto Scaling group.</p>
     *        <p>
     *        You create the resource label by appending the final portion of the load balancer ARN and the final
     *        portion of the target group ARN into a single value, separated by a forward slash (/). The format is
     *        app/&lt
     *        ;load-balancer-name&gt;/&lt;load-balancer-id&gt;/targetgroup/&lt;target-group-name&gt;/&lt;target-group
     *        -id&gt;, where:
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
     *        This is an example:
     *        app/EC2Co-EcsEl-1TKLTMITMM0EO/f37c06a68c1748aa/targetgroup/EC2Co-Defau-LDNM7Q3ZH1ZN/6d4ea56ca2d6a18d.
     *        </p>
     *        <p>
     *        To find the ARN for an Application Load Balancer, use the <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a> API operation. To find the ARN for the target group, use the <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     *        >DescribeTargetGroups</a> API operation.
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
