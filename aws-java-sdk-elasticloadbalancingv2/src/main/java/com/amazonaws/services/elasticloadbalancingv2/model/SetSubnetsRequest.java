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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetSubnets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetSubnetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     */
    private String loadBalancerArn;
    /**
     * <p>
     * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify
     * only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     * </p>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify
     * only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     * </p>
     * <p>
     * You cannot specify Elastic IP addresses for your subnets.
     * </p>
     */
    private java.util.List<SubnetMapping> subnetMappings;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) of the load balancer.
     */

    public void setLoadBalancerArn(String loadBalancerArn) {
        this.loadBalancerArn = loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the load balancer.
     */

    public String getLoadBalancerArn() {
        return this.loadBalancerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     * 
     * @param loadBalancerArn
     *        The Amazon Resource Name (ARN) of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSubnetsRequest withLoadBalancerArn(String loadBalancerArn) {
        setLoadBalancerArn(loadBalancerArn);
        return this;
    }

    /**
     * <p>
     * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify
     * only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     * </p>
     * 
     * @return The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can
     *         specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify
     * only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     * </p>
     * 
     * @param subnets
     *        The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can
     *        specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify
     * only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can
     *        specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSubnetsRequest withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify
     * only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     * </p>
     * 
     * @param subnets
     *        The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can
     *        specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSubnetsRequest withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify
     * only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     * </p>
     * <p>
     * You cannot specify Elastic IP addresses for your subnets.
     * </p>
     * 
     * @return The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can
     *         specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings.</p>
     *         <p>
     *         You cannot specify Elastic IP addresses for your subnets.
     */

    public java.util.List<SubnetMapping> getSubnetMappings() {
        return subnetMappings;
    }

    /**
     * <p>
     * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify
     * only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     * </p>
     * <p>
     * You cannot specify Elastic IP addresses for your subnets.
     * </p>
     * 
     * @param subnetMappings
     *        The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can
     *        specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings.</p>
     *        <p>
     *        You cannot specify Elastic IP addresses for your subnets.
     */

    public void setSubnetMappings(java.util.Collection<SubnetMapping> subnetMappings) {
        if (subnetMappings == null) {
            this.subnetMappings = null;
            return;
        }

        this.subnetMappings = new java.util.ArrayList<SubnetMapping>(subnetMappings);
    }

    /**
     * <p>
     * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify
     * only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     * </p>
     * <p>
     * You cannot specify Elastic IP addresses for your subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetMappings(java.util.Collection)} or {@link #withSubnetMappings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param subnetMappings
     *        The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can
     *        specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings.</p>
     *        <p>
     *        You cannot specify Elastic IP addresses for your subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSubnetsRequest withSubnetMappings(SubnetMapping... subnetMappings) {
        if (this.subnetMappings == null) {
            setSubnetMappings(new java.util.ArrayList<SubnetMapping>(subnetMappings.length));
        }
        for (SubnetMapping ele : subnetMappings) {
            this.subnetMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can specify
     * only one subnet per Availability Zone. You must specify either subnets or subnet mappings.
     * </p>
     * <p>
     * You cannot specify Elastic IP addresses for your subnets.
     * </p>
     * 
     * @param subnetMappings
     *        The IDs of the public subnets. You must specify subnets from at least two Availability Zones. You can
     *        specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings.</p>
     *        <p>
     *        You cannot specify Elastic IP addresses for your subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSubnetsRequest withSubnetMappings(java.util.Collection<SubnetMapping> subnetMappings) {
        setSubnetMappings(subnetMappings);
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
        if (getLoadBalancerArn() != null)
            sb.append("LoadBalancerArn: ").append(getLoadBalancerArn()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getSubnetMappings() != null)
            sb.append("SubnetMappings: ").append(getSubnetMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetSubnetsRequest == false)
            return false;
        SetSubnetsRequest other = (SetSubnetsRequest) obj;
        if (other.getLoadBalancerArn() == null ^ this.getLoadBalancerArn() == null)
            return false;
        if (other.getLoadBalancerArn() != null && other.getLoadBalancerArn().equals(this.getLoadBalancerArn()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getSubnetMappings() == null ^ this.getSubnetMappings() == null)
            return false;
        if (other.getSubnetMappings() != null && other.getSubnetMappings().equals(this.getSubnetMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerArn() == null) ? 0 : getLoadBalancerArn().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getSubnetMappings() == null) ? 0 : getSubnetMappings().hashCode());
        return hashCode;
    }

    @Override
    public SetSubnetsRequest clone() {
        return (SetSubnetsRequest) super.clone();
    }

}
