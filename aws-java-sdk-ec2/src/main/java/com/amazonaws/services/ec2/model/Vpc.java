/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes a VPC.
 * </p>
 */
public class Vpc implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The current state of the VPC.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The CIDR block for the VPC.
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
     * Any tags assigned to the VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The allowed tenancy of instances launched into the VPC.
     * </p>
     */
    private String instanceTenancy;
    /**
     * <p>
     * Indicates whether the VPC is the default VPC.
     * </p>
     */
    private Boolean isDefault;

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
        this.state = state.toString();
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
        setState(state);
        return this;
    }

    /**
     * <p>
     * The CIDR block for the VPC.
     * </p>
     * 
     * @param cidrBlock
     *        The CIDR block for the VPC.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The CIDR block for the VPC.
     * </p>
     * 
     * @return The CIDR block for the VPC.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The CIDR block for the VPC.
     * </p>
     * 
     * @param cidrBlock
     *        The CIDR block for the VPC.
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
        this.instanceTenancy = instanceTenancy.toString();
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
        setInstanceTenancy(instanceTenancy);
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
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getDhcpOptionsId() != null)
            sb.append("DhcpOptionsId: " + getDhcpOptionsId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getInstanceTenancy() != null)
            sb.append("InstanceTenancy: " + getInstanceTenancy() + ",");
        if (getIsDefault() != null)
            sb.append("IsDefault: " + getIsDefault());
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
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getDhcpOptionsId() == null ^ this.getDhcpOptionsId() == null)
            return false;
        if (other.getDhcpOptionsId() != null && other.getDhcpOptionsId().equals(this.getDhcpOptionsId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null)
            return false;
        if (other.getInstanceTenancy() != null && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDhcpOptionsId() == null) ? 0 : getDhcpOptionsId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
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
