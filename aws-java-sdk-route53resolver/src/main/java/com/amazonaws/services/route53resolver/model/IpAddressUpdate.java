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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * In an <a>UpdateResolverEndpoint</a> request, information about an IP address to update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/IpAddressUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpAddressUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * <i>Only when removing an IP address from a resolver endpoint</i>: The ID of the IP address that you want to
     * remove. To get this ID, use <a>GetResolverEndpoint</a>.
     * </p>
     */
    private String ipId;
    /**
     * <p>
     * The ID of the subnet that includes the IP address that you want to update. To get this ID, use
     * <a>GetResolverEndpoint</a>.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The new IP address.
     * </p>
     */
    private String ip;

    /**
     * <p>
     * <i>Only when removing an IP address from a resolver endpoint</i>: The ID of the IP address that you want to
     * remove. To get this ID, use <a>GetResolverEndpoint</a>.
     * </p>
     * 
     * @param ipId
     *        <i>Only when removing an IP address from a resolver endpoint</i>: The ID of the IP address that you want
     *        to remove. To get this ID, use <a>GetResolverEndpoint</a>.
     */

    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    /**
     * <p>
     * <i>Only when removing an IP address from a resolver endpoint</i>: The ID of the IP address that you want to
     * remove. To get this ID, use <a>GetResolverEndpoint</a>.
     * </p>
     * 
     * @return <i>Only when removing an IP address from a resolver endpoint</i>: The ID of the IP address that you want
     *         to remove. To get this ID, use <a>GetResolverEndpoint</a>.
     */

    public String getIpId() {
        return this.ipId;
    }

    /**
     * <p>
     * <i>Only when removing an IP address from a resolver endpoint</i>: The ID of the IP address that you want to
     * remove. To get this ID, use <a>GetResolverEndpoint</a>.
     * </p>
     * 
     * @param ipId
     *        <i>Only when removing an IP address from a resolver endpoint</i>: The ID of the IP address that you want
     *        to remove. To get this ID, use <a>GetResolverEndpoint</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressUpdate withIpId(String ipId) {
        setIpId(ipId);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet that includes the IP address that you want to update. To get this ID, use
     * <a>GetResolverEndpoint</a>.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet that includes the IP address that you want to update. To get this ID, use
     *        <a>GetResolverEndpoint</a>.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet that includes the IP address that you want to update. To get this ID, use
     * <a>GetResolverEndpoint</a>.
     * </p>
     * 
     * @return The ID of the subnet that includes the IP address that you want to update. To get this ID, use
     *         <a>GetResolverEndpoint</a>.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet that includes the IP address that you want to update. To get this ID, use
     * <a>GetResolverEndpoint</a>.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet that includes the IP address that you want to update. To get this ID, use
     *        <a>GetResolverEndpoint</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressUpdate withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The new IP address.
     * </p>
     * 
     * @param ip
     *        The new IP address.
     */

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * <p>
     * The new IP address.
     * </p>
     * 
     * @return The new IP address.
     */

    public String getIp() {
        return this.ip;
    }

    /**
     * <p>
     * The new IP address.
     * </p>
     * 
     * @param ip
     *        The new IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressUpdate withIp(String ip) {
        setIp(ip);
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
        if (getIpId() != null)
            sb.append("IpId: ").append(getIpId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getIp() != null)
            sb.append("Ip: ").append(getIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpAddressUpdate == false)
            return false;
        IpAddressUpdate other = (IpAddressUpdate) obj;
        if (other.getIpId() == null ^ this.getIpId() == null)
            return false;
        if (other.getIpId() != null && other.getIpId().equals(this.getIpId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getIp() == null ^ this.getIp() == null)
            return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpId() == null) ? 0 : getIpId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        return hashCode;
    }

    @Override
    public IpAddressUpdate clone() {
        try {
            return (IpAddressUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.IpAddressUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
