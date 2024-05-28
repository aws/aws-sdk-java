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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the configuration of a subnet for a VPC endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/SubnetConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubnetConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The IPv4 address to assign to the endpoint network interface in the subnet. You must provide an IPv4 address if
     * the VPC endpoint supports IPv4.
     * </p>
     * <p>
     * If you specify an IPv4 address when modifying a VPC endpoint, we replace the existing endpoint network interface
     * with a new endpoint network interface with this IP address. This process temporarily disconnects the subnet and
     * the VPC endpoint.
     * </p>
     */
    private String ipv4;
    /**
     * <p>
     * The IPv6 address to assign to the endpoint network interface in the subnet. You must provide an IPv6 address if
     * the VPC endpoint supports IPv6.
     * </p>
     * <p>
     * If you specify an IPv6 address when modifying a VPC endpoint, we replace the existing endpoint network interface
     * with a new endpoint network interface with this IP address. This process temporarily disconnects the subnet and
     * the VPC endpoint.
     * </p>
     */
    private String ipv6;

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @return The ID of the subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetConfiguration withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The IPv4 address to assign to the endpoint network interface in the subnet. You must provide an IPv4 address if
     * the VPC endpoint supports IPv4.
     * </p>
     * <p>
     * If you specify an IPv4 address when modifying a VPC endpoint, we replace the existing endpoint network interface
     * with a new endpoint network interface with this IP address. This process temporarily disconnects the subnet and
     * the VPC endpoint.
     * </p>
     * 
     * @param ipv4
     *        The IPv4 address to assign to the endpoint network interface in the subnet. You must provide an IPv4
     *        address if the VPC endpoint supports IPv4.</p>
     *        <p>
     *        If you specify an IPv4 address when modifying a VPC endpoint, we replace the existing endpoint network
     *        interface with a new endpoint network interface with this IP address. This process temporarily disconnects
     *        the subnet and the VPC endpoint.
     */

    public void setIpv4(String ipv4) {
        this.ipv4 = ipv4;
    }

    /**
     * <p>
     * The IPv4 address to assign to the endpoint network interface in the subnet. You must provide an IPv4 address if
     * the VPC endpoint supports IPv4.
     * </p>
     * <p>
     * If you specify an IPv4 address when modifying a VPC endpoint, we replace the existing endpoint network interface
     * with a new endpoint network interface with this IP address. This process temporarily disconnects the subnet and
     * the VPC endpoint.
     * </p>
     * 
     * @return The IPv4 address to assign to the endpoint network interface in the subnet. You must provide an IPv4
     *         address if the VPC endpoint supports IPv4.</p>
     *         <p>
     *         If you specify an IPv4 address when modifying a VPC endpoint, we replace the existing endpoint network
     *         interface with a new endpoint network interface with this IP address. This process temporarily
     *         disconnects the subnet and the VPC endpoint.
     */

    public String getIpv4() {
        return this.ipv4;
    }

    /**
     * <p>
     * The IPv4 address to assign to the endpoint network interface in the subnet. You must provide an IPv4 address if
     * the VPC endpoint supports IPv4.
     * </p>
     * <p>
     * If you specify an IPv4 address when modifying a VPC endpoint, we replace the existing endpoint network interface
     * with a new endpoint network interface with this IP address. This process temporarily disconnects the subnet and
     * the VPC endpoint.
     * </p>
     * 
     * @param ipv4
     *        The IPv4 address to assign to the endpoint network interface in the subnet. You must provide an IPv4
     *        address if the VPC endpoint supports IPv4.</p>
     *        <p>
     *        If you specify an IPv4 address when modifying a VPC endpoint, we replace the existing endpoint network
     *        interface with a new endpoint network interface with this IP address. This process temporarily disconnects
     *        the subnet and the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetConfiguration withIpv4(String ipv4) {
        setIpv4(ipv4);
        return this;
    }

    /**
     * <p>
     * The IPv6 address to assign to the endpoint network interface in the subnet. You must provide an IPv6 address if
     * the VPC endpoint supports IPv6.
     * </p>
     * <p>
     * If you specify an IPv6 address when modifying a VPC endpoint, we replace the existing endpoint network interface
     * with a new endpoint network interface with this IP address. This process temporarily disconnects the subnet and
     * the VPC endpoint.
     * </p>
     * 
     * @param ipv6
     *        The IPv6 address to assign to the endpoint network interface in the subnet. You must provide an IPv6
     *        address if the VPC endpoint supports IPv6.</p>
     *        <p>
     *        If you specify an IPv6 address when modifying a VPC endpoint, we replace the existing endpoint network
     *        interface with a new endpoint network interface with this IP address. This process temporarily disconnects
     *        the subnet and the VPC endpoint.
     */

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    /**
     * <p>
     * The IPv6 address to assign to the endpoint network interface in the subnet. You must provide an IPv6 address if
     * the VPC endpoint supports IPv6.
     * </p>
     * <p>
     * If you specify an IPv6 address when modifying a VPC endpoint, we replace the existing endpoint network interface
     * with a new endpoint network interface with this IP address. This process temporarily disconnects the subnet and
     * the VPC endpoint.
     * </p>
     * 
     * @return The IPv6 address to assign to the endpoint network interface in the subnet. You must provide an IPv6
     *         address if the VPC endpoint supports IPv6.</p>
     *         <p>
     *         If you specify an IPv6 address when modifying a VPC endpoint, we replace the existing endpoint network
     *         interface with a new endpoint network interface with this IP address. This process temporarily
     *         disconnects the subnet and the VPC endpoint.
     */

    public String getIpv6() {
        return this.ipv6;
    }

    /**
     * <p>
     * The IPv6 address to assign to the endpoint network interface in the subnet. You must provide an IPv6 address if
     * the VPC endpoint supports IPv6.
     * </p>
     * <p>
     * If you specify an IPv6 address when modifying a VPC endpoint, we replace the existing endpoint network interface
     * with a new endpoint network interface with this IP address. This process temporarily disconnects the subnet and
     * the VPC endpoint.
     * </p>
     * 
     * @param ipv6
     *        The IPv6 address to assign to the endpoint network interface in the subnet. You must provide an IPv6
     *        address if the VPC endpoint supports IPv6.</p>
     *        <p>
     *        If you specify an IPv6 address when modifying a VPC endpoint, we replace the existing endpoint network
     *        interface with a new endpoint network interface with this IP address. This process temporarily disconnects
     *        the subnet and the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubnetConfiguration withIpv6(String ipv6) {
        setIpv6(ipv6);
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
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getIpv4() != null)
            sb.append("Ipv4: ").append(getIpv4()).append(",");
        if (getIpv6() != null)
            sb.append("Ipv6: ").append(getIpv6());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubnetConfiguration == false)
            return false;
        SubnetConfiguration other = (SubnetConfiguration) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getIpv4() == null ^ this.getIpv4() == null)
            return false;
        if (other.getIpv4() != null && other.getIpv4().equals(this.getIpv4()) == false)
            return false;
        if (other.getIpv6() == null ^ this.getIpv6() == null)
            return false;
        if (other.getIpv6() != null && other.getIpv6().equals(this.getIpv6()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getIpv4() == null) ? 0 : getIpv4().hashCode());
        hashCode = prime * hashCode + ((getIpv6() == null) ? 0 : getIpv6().hashCode());
        return hashCode;
    }

    @Override
    public SubnetConfiguration clone() {
        try {
            return (SubnetConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
