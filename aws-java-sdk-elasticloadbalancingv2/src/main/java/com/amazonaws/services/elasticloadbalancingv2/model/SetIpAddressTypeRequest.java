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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/SetIpAddressType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetIpAddressTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the load balancer.
     * </p>
     */
    private String loadBalancerArn;
    /**
     * <p>
     * The IP address type. The possible values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code>
     * (for IPv4 and IPv6 addresses). Internal load balancers must use <code>ipv4</code>.
     * </p>
     */
    private String ipAddressType;

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

    public SetIpAddressTypeRequest withLoadBalancerArn(String loadBalancerArn) {
        setLoadBalancerArn(loadBalancerArn);
        return this;
    }

    /**
     * <p>
     * The IP address type. The possible values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code>
     * (for IPv4 and IPv6 addresses). Internal load balancers must use <code>ipv4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type. The possible values are <code>ipv4</code> (for IPv4 addresses) and
     *        <code>dualstack</code> (for IPv4 and IPv6 addresses). Internal load balancers must use <code>ipv4</code>.
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * The IP address type. The possible values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code>
     * (for IPv4 and IPv6 addresses). Internal load balancers must use <code>ipv4</code>.
     * </p>
     * 
     * @return The IP address type. The possible values are <code>ipv4</code> (for IPv4 addresses) and
     *         <code>dualstack</code> (for IPv4 and IPv6 addresses). Internal load balancers must use <code>ipv4</code>.
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * The IP address type. The possible values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code>
     * (for IPv4 and IPv6 addresses). Internal load balancers must use <code>ipv4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type. The possible values are <code>ipv4</code> (for IPv4 addresses) and
     *        <code>dualstack</code> (for IPv4 and IPv6 addresses). Internal load balancers must use <code>ipv4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public SetIpAddressTypeRequest withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * The IP address type. The possible values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code>
     * (for IPv4 and IPv6 addresses). Internal load balancers must use <code>ipv4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type. The possible values are <code>ipv4</code> (for IPv4 addresses) and
     *        <code>dualstack</code> (for IPv4 and IPv6 addresses). Internal load balancers must use <code>ipv4</code>.
     * @see IpAddressType
     */

    public void setIpAddressType(IpAddressType ipAddressType) {
        withIpAddressType(ipAddressType);
    }

    /**
     * <p>
     * The IP address type. The possible values are <code>ipv4</code> (for IPv4 addresses) and <code>dualstack</code>
     * (for IPv4 and IPv6 addresses). Internal load balancers must use <code>ipv4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The IP address type. The possible values are <code>ipv4</code> (for IPv4 addresses) and
     *        <code>dualstack</code> (for IPv4 and IPv6 addresses). Internal load balancers must use <code>ipv4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public SetIpAddressTypeRequest withIpAddressType(IpAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
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
        if (getIpAddressType() != null)
            sb.append("IpAddressType: ").append(getIpAddressType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetIpAddressTypeRequest == false)
            return false;
        SetIpAddressTypeRequest other = (SetIpAddressTypeRequest) obj;
        if (other.getLoadBalancerArn() == null ^ this.getLoadBalancerArn() == null)
            return false;
        if (other.getLoadBalancerArn() != null && other.getLoadBalancerArn().equals(this.getLoadBalancerArn()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null && other.getIpAddressType().equals(this.getIpAddressType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerArn() == null) ? 0 : getLoadBalancerArn().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        return hashCode;
    }

    @Override
    public SetIpAddressTypeRequest clone() {
        return (SetIpAddressTypeRequest) super.clone();
    }

}
