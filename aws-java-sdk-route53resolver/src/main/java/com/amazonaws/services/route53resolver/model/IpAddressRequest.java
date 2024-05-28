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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * In a <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverEndpoint.html"
 * >CreateResolverEndpoint</a> request, the IP address that DNS queries originate from (for outbound endpoints) or that
 * you forward DNS queries to (for inbound endpoints). <code>IpAddressRequest</code> also includes the ID of the subnet
 * that contains the IP address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/IpAddressRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpAddressRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the subnet that contains the IP address.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The IPv4 address that you want to use for DNS queries.
     * </p>
     */
    private String ip;
    /**
     * <p>
     * The IPv6 address that you want to use for DNS queries.
     * </p>
     */
    private String ipv6;

    /**
     * <p>
     * The ID of the subnet that contains the IP address.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet that contains the IP address.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet that contains the IP address.
     * </p>
     * 
     * @return The ID of the subnet that contains the IP address.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet that contains the IP address.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet that contains the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The IPv4 address that you want to use for DNS queries.
     * </p>
     * 
     * @param ip
     *        The IPv4 address that you want to use for DNS queries.
     */

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * <p>
     * The IPv4 address that you want to use for DNS queries.
     * </p>
     * 
     * @return The IPv4 address that you want to use for DNS queries.
     */

    public String getIp() {
        return this.ip;
    }

    /**
     * <p>
     * The IPv4 address that you want to use for DNS queries.
     * </p>
     * 
     * @param ip
     *        The IPv4 address that you want to use for DNS queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressRequest withIp(String ip) {
        setIp(ip);
        return this;
    }

    /**
     * <p>
     * The IPv6 address that you want to use for DNS queries.
     * </p>
     * 
     * @param ipv6
     *        The IPv6 address that you want to use for DNS queries.
     */

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    /**
     * <p>
     * The IPv6 address that you want to use for DNS queries.
     * </p>
     * 
     * @return The IPv6 address that you want to use for DNS queries.
     */

    public String getIpv6() {
        return this.ipv6;
    }

    /**
     * <p>
     * The IPv6 address that you want to use for DNS queries.
     * </p>
     * 
     * @param ipv6
     *        The IPv6 address that you want to use for DNS queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressRequest withIpv6(String ipv6) {
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
        if (getIp() != null)
            sb.append("Ip: ").append(getIp()).append(",");
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

        if (obj instanceof IpAddressRequest == false)
            return false;
        IpAddressRequest other = (IpAddressRequest) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getIp() == null ^ this.getIp() == null)
            return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false)
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
        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        hashCode = prime * hashCode + ((getIpv6() == null) ? 0 : getIpv6().hashCode());
        return hashCode;
    }

    @Override
    public IpAddressRequest clone() {
        try {
            return (IpAddressRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.IpAddressRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
