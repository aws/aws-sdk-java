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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Vpc" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Vpc implements Serializable, Cloneable {

    /**
     * <p>
     * The primary IPv4 CIDR block for the VPC.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * The ID of the set of DHCP options you've associated with the VPC (or <code>default</code> if the default options
     * are associated with the VPC).
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
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ID of the AWS account that owns the VPC.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The allowed tenancy of instances launched into the VPC.
     * </p>
     */
    private String instanceTenancy;
    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpcIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet;
    /**
     * <p>
     * Information about the IPv4 CIDR blocks associated with the VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpcCidrBlockAssociation> cidrBlockAssociationSet;
    /**
     * <p>
     * Indicates whether the VPC is the default VPC.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The primary IPv4 CIDR block for the VPC.
     * </p>
     * 
     * @param cidrBlock
     *        The primary IPv4 CIDR block for the VPC.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The primary IPv4 CIDR block for the VPC.
     * </p>
     * 
     * @return The primary IPv4 CIDR block for the VPC.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The primary IPv4 CIDR block for the VPC.
     * </p>
     * 
     * @param cidrBlock
     *        The primary IPv4 CIDR block for the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vpc withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * The ID of the set of DHCP options you've associated with the VPC (or <code>default</code> if the default options
     * are associated with the VPC).
     * </p>
     * 
     * @param dhcpOptionsId
     *        The ID of the set of DHCP options you've associated with the VPC (or <code>default</code> if the default
     *        options are associated with the VPC).
     */

    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }

    /**
     * <p>
     * The ID of the set of DHCP options you've associated with the VPC (or <code>default</code> if the default options
     * are associated with the VPC).
     * </p>
     * 
     * @return The ID of the set of DHCP options you've associated with the VPC (or <code>default</code> if the default
     *         options are associated with the VPC).
     */

    public String getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }

    /**
     * <p>
     * The ID of the set of DHCP options you've associated with the VPC (or <code>default</code> if the default options
     * are associated with the VPC).
     * </p>
     * 
     * @param dhcpOptionsId
     *        The ID of the set of DHCP options you've associated with the VPC (or <code>default</code> if the default
     *        options are associated with the VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vpc withDhcpOptionsId(String dhcpOptionsId) {
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
     * @see VpcState
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
     * @see VpcState
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
     * @see VpcState
     */

    public Vpc withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the VPC.
     * </p>
     * 
     * @param state
     *        The current state of the VPC.
     * @see VpcState
     */

    public void setState(VpcState state) {
        withState(state);
    }

    /**
     * <p>
     * The current state of the VPC.
     * </p>
     * 
     * @param state
     *        The current state of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcState
     */

    public Vpc withState(VpcState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vpc withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the VPC.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the VPC.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the VPC.
     * </p>
     * 
     * @return The ID of the AWS account that owns the VPC.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the VPC.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vpc withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The allowed tenancy of instances launched into the VPC.
     * </p>
     * 
     * @param instanceTenancy
     *        The allowed tenancy of instances launched into the VPC.
     * @see Tenancy
     */

    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }

    /**
     * <p>
     * The allowed tenancy of instances launched into the VPC.
     * </p>
     * 
     * @return The allowed tenancy of instances launched into the VPC.
     * @see Tenancy
     */

    public String getInstanceTenancy() {
        return this.instanceTenancy;
    }

    /**
     * <p>
     * The allowed tenancy of instances launched into the VPC.
     * </p>
     * 
     * @param instanceTenancy
     *        The allowed tenancy of instances launched into the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public Vpc withInstanceTenancy(String instanceTenancy) {
        setInstanceTenancy(instanceTenancy);
        return this;
    }

    /**
     * <p>
     * The allowed tenancy of instances launched into the VPC.
     * </p>
     * 
     * @param instanceTenancy
     *        The allowed tenancy of instances launched into the VPC.
     * @see Tenancy
     */

    public void setInstanceTenancy(Tenancy instanceTenancy) {
        withInstanceTenancy(instanceTenancy);
    }

    /**
     * <p>
     * The allowed tenancy of instances launched into the VPC.
     * </p>
     * 
     * @param instanceTenancy
     *        The allowed tenancy of instances launched into the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public Vpc withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * <p>
     * Information about the IPv6 CIDR blocks associated with the VPC.
     * </p>
     * 
     * @return Information about the IPv6 CIDR blocks associated with the VPC.
     */

    public java.util.List<VpcIpv6CidrBlockAssociation> getIpv6CidrBlockAssociationSet() {
        if (ipv6CidrBlockAssociationSet == null) {
            ipv6CidrBlockAssociationSet = new com.amazonaws.internal.SdkInternalList<VpcIpv6CidrBlockAssociation>();
        }
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

    public void setIpv6CidrBlockAssociationSet(java.util.Collection<VpcIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet) {
        if (ipv6CidrBlockAssociationSet == null) {
            this.ipv6CidrBlockAssociationSet = null;
            return;
        }

        this.ipv6CidrBlockAssociationSet = new com.amazonaws.internal.SdkInternalList<VpcIpv6CidrBlockAssociation>(ipv6CidrBlockAssociationSet);
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

    public Vpc withIpv6CidrBlockAssociationSet(VpcIpv6CidrBlockAssociation... ipv6CidrBlockAssociationSet) {
        if (this.ipv6CidrBlockAssociationSet == null) {
            setIpv6CidrBlockAssociationSet(new com.amazonaws.internal.SdkInternalList<VpcIpv6CidrBlockAssociation>(ipv6CidrBlockAssociationSet.length));
        }
        for (VpcIpv6CidrBlockAssociation ele : ipv6CidrBlockAssociationSet) {
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

    public Vpc withIpv6CidrBlockAssociationSet(java.util.Collection<VpcIpv6CidrBlockAssociation> ipv6CidrBlockAssociationSet) {
        setIpv6CidrBlockAssociationSet(ipv6CidrBlockAssociationSet);
        return this;
    }

    /**
     * <p>
     * Information about the IPv4 CIDR blocks associated with the VPC.
     * </p>
     * 
     * @return Information about the IPv4 CIDR blocks associated with the VPC.
     */

    public java.util.List<VpcCidrBlockAssociation> getCidrBlockAssociationSet() {
        if (cidrBlockAssociationSet == null) {
            cidrBlockAssociationSet = new com.amazonaws.internal.SdkInternalList<VpcCidrBlockAssociation>();
        }
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

    public void setCidrBlockAssociationSet(java.util.Collection<VpcCidrBlockAssociation> cidrBlockAssociationSet) {
        if (cidrBlockAssociationSet == null) {
            this.cidrBlockAssociationSet = null;
            return;
        }

        this.cidrBlockAssociationSet = new com.amazonaws.internal.SdkInternalList<VpcCidrBlockAssociation>(cidrBlockAssociationSet);
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

    public Vpc withCidrBlockAssociationSet(VpcCidrBlockAssociation... cidrBlockAssociationSet) {
        if (this.cidrBlockAssociationSet == null) {
            setCidrBlockAssociationSet(new com.amazonaws.internal.SdkInternalList<VpcCidrBlockAssociation>(cidrBlockAssociationSet.length));
        }
        for (VpcCidrBlockAssociation ele : cidrBlockAssociationSet) {
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

    public Vpc withCidrBlockAssociationSet(java.util.Collection<VpcCidrBlockAssociation> cidrBlockAssociationSet) {
        setCidrBlockAssociationSet(cidrBlockAssociationSet);
        return this;
    }

    /**
     * <p>
     * Indicates whether the VPC is the default VPC.
     * </p>
     * 
     * @param isDefault
     *        Indicates whether the VPC is the default VPC.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Indicates whether the VPC is the default VPC.
     * </p>
     * 
     * @return Indicates whether the VPC is the default VPC.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Indicates whether the VPC is the default VPC.
     * </p>
     * 
     * @param isDefault
     *        Indicates whether the VPC is the default VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vpc withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Indicates whether the VPC is the default VPC.
     * </p>
     * 
     * @return Indicates whether the VPC is the default VPC.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     * 
     * @return Any tags assigned to the VPC.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the VPC.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vpc withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vpc withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock()).append(",");
        if (getDhcpOptionsId() != null)
            sb.append("DhcpOptionsId: ").append(getDhcpOptionsId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getInstanceTenancy() != null)
            sb.append("InstanceTenancy: ").append(getInstanceTenancy()).append(",");
        if (getIpv6CidrBlockAssociationSet() != null)
            sb.append("Ipv6CidrBlockAssociationSet: ").append(getIpv6CidrBlockAssociationSet()).append(",");
        if (getCidrBlockAssociationSet() != null)
            sb.append("CidrBlockAssociationSet: ").append(getCidrBlockAssociationSet()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Vpc == false)
            return false;
        Vpc other = (Vpc) obj;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getDhcpOptionsId() == null ^ this.getDhcpOptionsId() == null)
            return false;
        if (other.getDhcpOptionsId() != null && other.getDhcpOptionsId().equals(this.getDhcpOptionsId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null)
            return false;
        if (other.getInstanceTenancy() != null && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false)
            return false;
        if (other.getIpv6CidrBlockAssociationSet() == null ^ this.getIpv6CidrBlockAssociationSet() == null)
            return false;
        if (other.getIpv6CidrBlockAssociationSet() != null && other.getIpv6CidrBlockAssociationSet().equals(this.getIpv6CidrBlockAssociationSet()) == false)
            return false;
        if (other.getCidrBlockAssociationSet() == null ^ this.getCidrBlockAssociationSet() == null)
            return false;
        if (other.getCidrBlockAssociationSet() != null && other.getCidrBlockAssociationSet().equals(this.getCidrBlockAssociationSet()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDhcpOptionsId() == null) ? 0 : getDhcpOptionsId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlockAssociationSet() == null) ? 0 : getIpv6CidrBlockAssociationSet().hashCode());
        hashCode = prime * hashCode + ((getCidrBlockAssociationSet() == null) ? 0 : getCidrBlockAssociationSet().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Vpc clone() {
        try {
            return (Vpc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
