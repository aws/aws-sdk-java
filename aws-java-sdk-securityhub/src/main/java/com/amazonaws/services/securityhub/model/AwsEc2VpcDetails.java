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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an EC2 VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2VpcDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VpcDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the IPv4 CIDR blocks associated with the VPC.
     * </p>
     */
    private java.util.List<CidrBlockAssociation> cidrBlockAssociationSet;
    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the VPC.
     * </p>
     */
    private java.util.List<Ipv6CidrBlockAssociation> ipv6CidrBlockAssociationSet;
    /**
     * <p>
     * The identifier of the set of Dynamic Host Configuration Protocol (DHCP) options that are associated with the VPC.
     * If the default options are associated with the VPC, then this is default.
     * </p>
     */
    private String dhcpOptionsId;
    /**
     * <p>
     * The current state of the VPC.
     * </p>
     */
    private String state;

    /**
     * <p>
     * Information about the IPv4 CIDR blocks associated with the VPC.
     * </p>
     * 
     * @return Information about the IPv4 CIDR blocks associated with the VPC.
     */

    public java.util.List<CidrBlockAssociation> getCidrBlockAssociationSet() {
        return cidrBlockAssociationSet;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR blocks associated with the VPC.
     * </p>
     * 
     * @param cidrBlockAssociationSet
     *        Information about the IPv4 CIDR blocks associated with the VPC.
     */

    public void setCidrBlockAssociationSet(java.util.Collection<CidrBlockAssociation> cidrBlockAssociationSet) {
        if (cidrBlockAssociationSet == null) {
            this.cidrBlockAssociationSet = null;
            return;
        }

        this.cidrBlockAssociationSet = new java.util.ArrayList<CidrBlockAssociation>(cidrBlockAssociationSet);
    }

    /**
     * <p>
     * Information about the IPv4 CIDR blocks associated with the VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrBlockAssociationSet(java.util.Collection)} or
     * {@link #withCidrBlockAssociationSet(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param cidrBlockAssociationSet
     *        Information about the IPv4 CIDR blocks associated with the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcDetails withCidrBlockAssociationSet(CidrBlockAssociation... cidrBlockAssociationSet) {
        if (this.cidrBlockAssociationSet == null) {
            setCidrBlockAssociationSet(new java.util.ArrayList<CidrBlockAssociation>(cidrBlockAssociationSet.length));
        }
        for (CidrBlockAssociation ele : cidrBlockAssociationSet) {
            this.cidrBlockAssociationSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR blocks associated with the VPC.
     * </p>
     * 
     * @param cidrBlockAssociationSet
     *        Information about the IPv4 CIDR blocks associated with the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcDetails withCidrBlockAssociationSet(java.util.Collection<CidrBlockAssociation> cidrBlockAssociationSet) {
        setCidrBlockAssociationSet(cidrBlockAssociationSet);
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the VPC.
     * </p>
     * 
     * @return Information about the IPv6 CIDR blocks associated with the VPC.
     */

    public java.util.List<Ipv6CidrBlockAssociation> getIpv6CidrBlockAssociationSet() {
        return ipv6CidrBlockAssociationSet;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the VPC.
     * </p>
     * 
     * @param ipv6CidrBlockAssociationSet
     *        Information about the IPv6 CIDR blocks associated with the VPC.
     */

    public void setIpv6CidrBlockAssociationSet(java.util.Collection<Ipv6CidrBlockAssociation> ipv6CidrBlockAssociationSet) {
        if (ipv6CidrBlockAssociationSet == null) {
            this.ipv6CidrBlockAssociationSet = null;
            return;
        }

        this.ipv6CidrBlockAssociationSet = new java.util.ArrayList<Ipv6CidrBlockAssociation>(ipv6CidrBlockAssociationSet);
    }

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6CidrBlockAssociationSet(java.util.Collection)} or
     * {@link #withIpv6CidrBlockAssociationSet(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param ipv6CidrBlockAssociationSet
     *        Information about the IPv6 CIDR blocks associated with the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcDetails withIpv6CidrBlockAssociationSet(Ipv6CidrBlockAssociation... ipv6CidrBlockAssociationSet) {
        if (this.ipv6CidrBlockAssociationSet == null) {
            setIpv6CidrBlockAssociationSet(new java.util.ArrayList<Ipv6CidrBlockAssociation>(ipv6CidrBlockAssociationSet.length));
        }
        for (Ipv6CidrBlockAssociation ele : ipv6CidrBlockAssociationSet) {
            this.ipv6CidrBlockAssociationSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the VPC.
     * </p>
     * 
     * @param ipv6CidrBlockAssociationSet
     *        Information about the IPv6 CIDR blocks associated with the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcDetails withIpv6CidrBlockAssociationSet(java.util.Collection<Ipv6CidrBlockAssociation> ipv6CidrBlockAssociationSet) {
        setIpv6CidrBlockAssociationSet(ipv6CidrBlockAssociationSet);
        return this;
    }

    /**
     * <p>
     * The identifier of the set of Dynamic Host Configuration Protocol (DHCP) options that are associated with the VPC.
     * If the default options are associated with the VPC, then this is default.
     * </p>
     * 
     * @param dhcpOptionsId
     *        The identifier of the set of Dynamic Host Configuration Protocol (DHCP) options that are associated with
     *        the VPC. If the default options are associated with the VPC, then this is default.
     */

    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }

    /**
     * <p>
     * The identifier of the set of Dynamic Host Configuration Protocol (DHCP) options that are associated with the VPC.
     * If the default options are associated with the VPC, then this is default.
     * </p>
     * 
     * @return The identifier of the set of Dynamic Host Configuration Protocol (DHCP) options that are associated with
     *         the VPC. If the default options are associated with the VPC, then this is default.
     */

    public String getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }

    /**
     * <p>
     * The identifier of the set of Dynamic Host Configuration Protocol (DHCP) options that are associated with the VPC.
     * If the default options are associated with the VPC, then this is default.
     * </p>
     * 
     * @param dhcpOptionsId
     *        The identifier of the set of Dynamic Host Configuration Protocol (DHCP) options that are associated with
     *        the VPC. If the default options are associated with the VPC, then this is default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcDetails withDhcpOptionsId(String dhcpOptionsId) {
        setDhcpOptionsId(dhcpOptionsId);
        return this;
    }

    /**
     * <p>
     * The current state of the VPC.
     * </p>
     * 
     * @param state
     *        The current state of the VPC.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the VPC.
     * </p>
     * 
     * @return The current state of the VPC.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the VPC.
     * </p>
     * 
     * @param state
     *        The current state of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcDetails withState(String state) {
        setState(state);
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
        if (getCidrBlockAssociationSet() != null)
            sb.append("CidrBlockAssociationSet: ").append(getCidrBlockAssociationSet()).append(",");
        if (getIpv6CidrBlockAssociationSet() != null)
            sb.append("Ipv6CidrBlockAssociationSet: ").append(getIpv6CidrBlockAssociationSet()).append(",");
        if (getDhcpOptionsId() != null)
            sb.append("DhcpOptionsId: ").append(getDhcpOptionsId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2VpcDetails == false)
            return false;
        AwsEc2VpcDetails other = (AwsEc2VpcDetails) obj;
        if (other.getCidrBlockAssociationSet() == null ^ this.getCidrBlockAssociationSet() == null)
            return false;
        if (other.getCidrBlockAssociationSet() != null && other.getCidrBlockAssociationSet().equals(this.getCidrBlockAssociationSet()) == false)
            return false;
        if (other.getIpv6CidrBlockAssociationSet() == null ^ this.getIpv6CidrBlockAssociationSet() == null)
            return false;
        if (other.getIpv6CidrBlockAssociationSet() != null && other.getIpv6CidrBlockAssociationSet().equals(this.getIpv6CidrBlockAssociationSet()) == false)
            return false;
        if (other.getDhcpOptionsId() == null ^ this.getDhcpOptionsId() == null)
            return false;
        if (other.getDhcpOptionsId() != null && other.getDhcpOptionsId().equals(this.getDhcpOptionsId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrBlockAssociationSet() == null) ? 0 : getCidrBlockAssociationSet().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlockAssociationSet() == null) ? 0 : getIpv6CidrBlockAssociationSet().hashCode());
        hashCode = prime * hashCode + ((getDhcpOptionsId() == null) ? 0 : getDhcpOptionsId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2VpcDetails clone() {
        try {
            return (AwsEc2VpcDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2VpcDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
