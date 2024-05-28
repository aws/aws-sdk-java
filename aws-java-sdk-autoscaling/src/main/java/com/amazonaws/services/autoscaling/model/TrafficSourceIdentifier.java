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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Identifying information for a traffic source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/TrafficSourceIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficSourceIdentifier implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies the traffic source.
     * </p>
     * <p>
     * For Application Load Balancers, Gateway Load Balancers, Network Load Balancers, and VPC Lattice, this will be the
     * Amazon Resource Name (ARN) for a target group in this account and Region. For Classic Load Balancers, this will
     * be the name of the Classic Load Balancer in this account and Region.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Application Load Balancer ARN:
     * <code>arn:aws:elasticloadbalancing:us-west-2:123456789012:targetgroup/my-targets/1234567890123456</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Classic Load Balancer name: <code>my-classic-load-balancer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VPC Lattice ARN: <code>arn:aws:vpc-lattice:us-west-2:123456789012:targetgroup/tg-1234567890123456</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the ARN of a target group for a Application Load Balancer, Gateway Load Balancer, or Network Load
     * Balancer, or the name of a Classic Load Balancer, use the Elastic Load Balancing <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     * >DescribeTargetGroups</a> and <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> API operations.
     * </p>
     * <p>
     * To get the ARN of a target group for VPC Lattice, use the VPC Lattice <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/APIReference/API_GetTargetGroup.html">GetTargetGroup</a> API
     * operation.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Provides additional context for the value of <code>Identifier</code>.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load Balancer,
     * or Network Load Balancer target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Required if the identifier is the name of a Classic Load Balancer.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Identifies the traffic source.
     * </p>
     * <p>
     * For Application Load Balancers, Gateway Load Balancers, Network Load Balancers, and VPC Lattice, this will be the
     * Amazon Resource Name (ARN) for a target group in this account and Region. For Classic Load Balancers, this will
     * be the name of the Classic Load Balancer in this account and Region.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Application Load Balancer ARN:
     * <code>arn:aws:elasticloadbalancing:us-west-2:123456789012:targetgroup/my-targets/1234567890123456</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Classic Load Balancer name: <code>my-classic-load-balancer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VPC Lattice ARN: <code>arn:aws:vpc-lattice:us-west-2:123456789012:targetgroup/tg-1234567890123456</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the ARN of a target group for a Application Load Balancer, Gateway Load Balancer, or Network Load
     * Balancer, or the name of a Classic Load Balancer, use the Elastic Load Balancing <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     * >DescribeTargetGroups</a> and <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> API operations.
     * </p>
     * <p>
     * To get the ARN of a target group for VPC Lattice, use the VPC Lattice <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/APIReference/API_GetTargetGroup.html">GetTargetGroup</a> API
     * operation.
     * </p>
     * 
     * @param identifier
     *        Identifies the traffic source.</p>
     *        <p>
     *        For Application Load Balancers, Gateway Load Balancers, Network Load Balancers, and VPC Lattice, this will
     *        be the Amazon Resource Name (ARN) for a target group in this account and Region. For Classic Load
     *        Balancers, this will be the name of the Classic Load Balancer in this account and Region.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Application Load Balancer ARN:
     *        <code>arn:aws:elasticloadbalancing:us-west-2:123456789012:targetgroup/my-targets/1234567890123456</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Classic Load Balancer name: <code>my-classic-load-balancer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VPC Lattice ARN: <code>arn:aws:vpc-lattice:us-west-2:123456789012:targetgroup/tg-1234567890123456</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the ARN of a target group for a Application Load Balancer, Gateway Load Balancer, or Network Load
     *        Balancer, or the name of a Classic Load Balancer, use the Elastic Load Balancing <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     *        >DescribeTargetGroups</a> and <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a> API operations.
     *        </p>
     *        <p>
     *        To get the ARN of a target group for VPC Lattice, use the VPC Lattice <a
     *        href="https://docs.aws.amazon.com/vpc-lattice/latest/APIReference/API_GetTargetGroup.html"
     *        >GetTargetGroup</a> API operation.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * Identifies the traffic source.
     * </p>
     * <p>
     * For Application Load Balancers, Gateway Load Balancers, Network Load Balancers, and VPC Lattice, this will be the
     * Amazon Resource Name (ARN) for a target group in this account and Region. For Classic Load Balancers, this will
     * be the name of the Classic Load Balancer in this account and Region.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Application Load Balancer ARN:
     * <code>arn:aws:elasticloadbalancing:us-west-2:123456789012:targetgroup/my-targets/1234567890123456</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Classic Load Balancer name: <code>my-classic-load-balancer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VPC Lattice ARN: <code>arn:aws:vpc-lattice:us-west-2:123456789012:targetgroup/tg-1234567890123456</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the ARN of a target group for a Application Load Balancer, Gateway Load Balancer, or Network Load
     * Balancer, or the name of a Classic Load Balancer, use the Elastic Load Balancing <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     * >DescribeTargetGroups</a> and <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> API operations.
     * </p>
     * <p>
     * To get the ARN of a target group for VPC Lattice, use the VPC Lattice <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/APIReference/API_GetTargetGroup.html">GetTargetGroup</a> API
     * operation.
     * </p>
     * 
     * @return Identifies the traffic source.</p>
     *         <p>
     *         For Application Load Balancers, Gateway Load Balancers, Network Load Balancers, and VPC Lattice, this
     *         will be the Amazon Resource Name (ARN) for a target group in this account and Region. For Classic Load
     *         Balancers, this will be the name of the Classic Load Balancer in this account and Region.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Application Load Balancer ARN:
     *         <code>arn:aws:elasticloadbalancing:us-west-2:123456789012:targetgroup/my-targets/1234567890123456</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Classic Load Balancer name: <code>my-classic-load-balancer</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VPC Lattice ARN: <code>arn:aws:vpc-lattice:us-west-2:123456789012:targetgroup/tg-1234567890123456</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the ARN of a target group for a Application Load Balancer, Gateway Load Balancer, or Network Load
     *         Balancer, or the name of a Classic Load Balancer, use the Elastic Load Balancing <a href=
     *         "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     *         >DescribeTargetGroups</a> and <a href=
     *         "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *         >DescribeLoadBalancers</a> API operations.
     *         </p>
     *         <p>
     *         To get the ARN of a target group for VPC Lattice, use the VPC Lattice <a
     *         href="https://docs.aws.amazon.com/vpc-lattice/latest/APIReference/API_GetTargetGroup.html"
     *         >GetTargetGroup</a> API operation.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * Identifies the traffic source.
     * </p>
     * <p>
     * For Application Load Balancers, Gateway Load Balancers, Network Load Balancers, and VPC Lattice, this will be the
     * Amazon Resource Name (ARN) for a target group in this account and Region. For Classic Load Balancers, this will
     * be the name of the Classic Load Balancer in this account and Region.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Application Load Balancer ARN:
     * <code>arn:aws:elasticloadbalancing:us-west-2:123456789012:targetgroup/my-targets/1234567890123456</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Classic Load Balancer name: <code>my-classic-load-balancer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * VPC Lattice ARN: <code>arn:aws:vpc-lattice:us-west-2:123456789012:targetgroup/tg-1234567890123456</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the ARN of a target group for a Application Load Balancer, Gateway Load Balancer, or Network Load
     * Balancer, or the name of a Classic Load Balancer, use the Elastic Load Balancing <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     * >DescribeTargetGroups</a> and <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> API operations.
     * </p>
     * <p>
     * To get the ARN of a target group for VPC Lattice, use the VPC Lattice <a
     * href="https://docs.aws.amazon.com/vpc-lattice/latest/APIReference/API_GetTargetGroup.html">GetTargetGroup</a> API
     * operation.
     * </p>
     * 
     * @param identifier
     *        Identifies the traffic source.</p>
     *        <p>
     *        For Application Load Balancers, Gateway Load Balancers, Network Load Balancers, and VPC Lattice, this will
     *        be the Amazon Resource Name (ARN) for a target group in this account and Region. For Classic Load
     *        Balancers, this will be the name of the Classic Load Balancer in this account and Region.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Application Load Balancer ARN:
     *        <code>arn:aws:elasticloadbalancing:us-west-2:123456789012:targetgroup/my-targets/1234567890123456</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Classic Load Balancer name: <code>my-classic-load-balancer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VPC Lattice ARN: <code>arn:aws:vpc-lattice:us-west-2:123456789012:targetgroup/tg-1234567890123456</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the ARN of a target group for a Application Load Balancer, Gateway Load Balancer, or Network Load
     *        Balancer, or the name of a Classic Load Balancer, use the Elastic Load Balancing <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html"
     *        >DescribeTargetGroups</a> and <a href=
     *        "https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a> API operations.
     *        </p>
     *        <p>
     *        To get the ARN of a target group for VPC Lattice, use the VPC Lattice <a
     *        href="https://docs.aws.amazon.com/vpc-lattice/latest/APIReference/API_GetTargetGroup.html"
     *        >GetTargetGroup</a> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficSourceIdentifier withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Provides additional context for the value of <code>Identifier</code>.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load Balancer,
     * or Network Load Balancer target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Required if the identifier is the name of a Classic Load Balancer.
     * </p>
     * 
     * @param type
     *        Provides additional context for the value of <code>Identifier</code>.</p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load
     *        Balancer, or Network Load Balancer target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Required if the identifier is the name of a Classic Load Balancer.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Provides additional context for the value of <code>Identifier</code>.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load Balancer,
     * or Network Load Balancer target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Required if the identifier is the name of a Classic Load Balancer.
     * </p>
     * 
     * @return Provides additional context for the value of <code>Identifier</code>.</p>
     *         <p>
     *         The following lists the valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load
     *         Balancer, or Network Load Balancer target group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Required if the identifier is the name of a Classic Load Balancer.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Provides additional context for the value of <code>Identifier</code>.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load Balancer,
     * or Network Load Balancer target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Required if the identifier is the name of a Classic Load Balancer.
     * </p>
     * 
     * @param type
     *        Provides additional context for the value of <code>Identifier</code>.</p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load
     *        Balancer, or Network Load Balancer target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Required if the identifier is the name of a Classic Load Balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficSourceIdentifier withType(String type) {
        setType(type);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficSourceIdentifier == false)
            return false;
        TrafficSourceIdentifier other = (TrafficSourceIdentifier) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public TrafficSourceIdentifier clone() {
        try {
            return (TrafficSourceIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
