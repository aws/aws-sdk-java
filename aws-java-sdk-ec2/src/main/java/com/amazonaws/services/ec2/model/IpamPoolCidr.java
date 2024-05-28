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
 * A CIDR provisioned to an IPAM pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamPoolCidr" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamPoolCidr implements Serializable, Cloneable {

    /**
     * <p>
     * The CIDR provisioned to the IPAM pool. A CIDR is a representation of an IP address and its associated network
     * mask (or netmask) and refers to a range of IP addresses. An IPv4 CIDR example is <code>10.24.34.0/23</code>. An
     * IPv6 CIDR example is <code>2001:DB8::/32</code>.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The state of the CIDR.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Details related to why an IPAM pool CIDR failed to be provisioned.
     * </p>
     */
    private IpamPoolCidrFailureReason failureReason;
    /**
     * <p>
     * The IPAM pool CIDR ID.
     * </p>
     */
    private String ipamPoolCidrId;
    /**
     * <p>
     * The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning Amazon-provided
     * IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools. Cannot be used to provision
     * BYOIP CIDRs to top-level pools. "NetmaskLength" or "Cidr" is required.
     * </p>
     */
    private Integer netmaskLength;

    /**
     * <p>
     * The CIDR provisioned to the IPAM pool. A CIDR is a representation of an IP address and its associated network
     * mask (or netmask) and refers to a range of IP addresses. An IPv4 CIDR example is <code>10.24.34.0/23</code>. An
     * IPv6 CIDR example is <code>2001:DB8::/32</code>.
     * </p>
     * 
     * @param cidr
     *        The CIDR provisioned to the IPAM pool. A CIDR is a representation of an IP address and its associated
     *        network mask (or netmask) and refers to a range of IP addresses. An IPv4 CIDR example is
     *        <code>10.24.34.0/23</code>. An IPv6 CIDR example is <code>2001:DB8::/32</code>.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The CIDR provisioned to the IPAM pool. A CIDR is a representation of an IP address and its associated network
     * mask (or netmask) and refers to a range of IP addresses. An IPv4 CIDR example is <code>10.24.34.0/23</code>. An
     * IPv6 CIDR example is <code>2001:DB8::/32</code>.
     * </p>
     * 
     * @return The CIDR provisioned to the IPAM pool. A CIDR is a representation of an IP address and its associated
     *         network mask (or netmask) and refers to a range of IP addresses. An IPv4 CIDR example is
     *         <code>10.24.34.0/23</code>. An IPv6 CIDR example is <code>2001:DB8::/32</code>.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The CIDR provisioned to the IPAM pool. A CIDR is a representation of an IP address and its associated network
     * mask (or netmask) and refers to a range of IP addresses. An IPv4 CIDR example is <code>10.24.34.0/23</code>. An
     * IPv6 CIDR example is <code>2001:DB8::/32</code>.
     * </p>
     * 
     * @param cidr
     *        The CIDR provisioned to the IPAM pool. A CIDR is a representation of an IP address and its associated
     *        network mask (or netmask) and refers to a range of IP addresses. An IPv4 CIDR example is
     *        <code>10.24.34.0/23</code>. An IPv6 CIDR example is <code>2001:DB8::/32</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPoolCidr withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The state of the CIDR.
     * </p>
     * 
     * @param state
     *        The state of the CIDR.
     * @see IpamPoolCidrState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the CIDR.
     * </p>
     * 
     * @return The state of the CIDR.
     * @see IpamPoolCidrState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the CIDR.
     * </p>
     * 
     * @param state
     *        The state of the CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPoolCidrState
     */

    public IpamPoolCidr withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the CIDR.
     * </p>
     * 
     * @param state
     *        The state of the CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPoolCidrState
     */

    public IpamPoolCidr withState(IpamPoolCidrState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Details related to why an IPAM pool CIDR failed to be provisioned.
     * </p>
     * 
     * @param failureReason
     *        Details related to why an IPAM pool CIDR failed to be provisioned.
     */

    public void setFailureReason(IpamPoolCidrFailureReason failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * Details related to why an IPAM pool CIDR failed to be provisioned.
     * </p>
     * 
     * @return Details related to why an IPAM pool CIDR failed to be provisioned.
     */

    public IpamPoolCidrFailureReason getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * Details related to why an IPAM pool CIDR failed to be provisioned.
     * </p>
     * 
     * @param failureReason
     *        Details related to why an IPAM pool CIDR failed to be provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPoolCidr withFailureReason(IpamPoolCidrFailureReason failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The IPAM pool CIDR ID.
     * </p>
     * 
     * @param ipamPoolCidrId
     *        The IPAM pool CIDR ID.
     */

    public void setIpamPoolCidrId(String ipamPoolCidrId) {
        this.ipamPoolCidrId = ipamPoolCidrId;
    }

    /**
     * <p>
     * The IPAM pool CIDR ID.
     * </p>
     * 
     * @return The IPAM pool CIDR ID.
     */

    public String getIpamPoolCidrId() {
        return this.ipamPoolCidrId;
    }

    /**
     * <p>
     * The IPAM pool CIDR ID.
     * </p>
     * 
     * @param ipamPoolCidrId
     *        The IPAM pool CIDR ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPoolCidr withIpamPoolCidrId(String ipamPoolCidrId) {
        setIpamPoolCidrId(ipamPoolCidrId);
        return this;
    }

    /**
     * <p>
     * The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning Amazon-provided
     * IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools. Cannot be used to provision
     * BYOIP CIDRs to top-level pools. "NetmaskLength" or "Cidr" is required.
     * </p>
     * 
     * @param netmaskLength
     *        The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning
     *        Amazon-provided IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools.
     *        Cannot be used to provision BYOIP CIDRs to top-level pools. "NetmaskLength" or "Cidr" is required.
     */

    public void setNetmaskLength(Integer netmaskLength) {
        this.netmaskLength = netmaskLength;
    }

    /**
     * <p>
     * The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning Amazon-provided
     * IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools. Cannot be used to provision
     * BYOIP CIDRs to top-level pools. "NetmaskLength" or "Cidr" is required.
     * </p>
     * 
     * @return The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning
     *         Amazon-provided IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools.
     *         Cannot be used to provision BYOIP CIDRs to top-level pools. "NetmaskLength" or "Cidr" is required.
     */

    public Integer getNetmaskLength() {
        return this.netmaskLength;
    }

    /**
     * <p>
     * The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning Amazon-provided
     * IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools. Cannot be used to provision
     * BYOIP CIDRs to top-level pools. "NetmaskLength" or "Cidr" is required.
     * </p>
     * 
     * @param netmaskLength
     *        The netmask length of the CIDR you'd like to provision to a pool. Can be used for provisioning
     *        Amazon-provided IPv6 CIDRs to top-level pools and for provisioning CIDRs to pools with source pools.
     *        Cannot be used to provision BYOIP CIDRs to top-level pools. "NetmaskLength" or "Cidr" is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPoolCidr withNetmaskLength(Integer netmaskLength) {
        setNetmaskLength(netmaskLength);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getIpamPoolCidrId() != null)
            sb.append("IpamPoolCidrId: ").append(getIpamPoolCidrId()).append(",");
        if (getNetmaskLength() != null)
            sb.append("NetmaskLength: ").append(getNetmaskLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpamPoolCidr == false)
            return false;
        IpamPoolCidr other = (IpamPoolCidr) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getIpamPoolCidrId() == null ^ this.getIpamPoolCidrId() == null)
            return false;
        if (other.getIpamPoolCidrId() != null && other.getIpamPoolCidrId().equals(this.getIpamPoolCidrId()) == false)
            return false;
        if (other.getNetmaskLength() == null ^ this.getNetmaskLength() == null)
            return false;
        if (other.getNetmaskLength() != null && other.getNetmaskLength().equals(this.getNetmaskLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getIpamPoolCidrId() == null) ? 0 : getIpamPoolCidrId().hashCode());
        hashCode = prime * hashCode + ((getNetmaskLength() == null) ? 0 : getNetmaskLength().hashCode());
        return hashCode;
    }

    @Override
    public IpamPoolCidr clone() {
        try {
            return (IpamPoolCidr) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
