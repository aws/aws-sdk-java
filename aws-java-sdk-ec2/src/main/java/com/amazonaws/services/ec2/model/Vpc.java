/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a VPC.
 * </p>
 */
public class Vpc implements Serializable {

    /**
     * The ID of the VPC.
     */
    private String vpcId;

    /**
     * The current state of the VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     */
    private String state;

    /**
     * The CIDR block for the VPC.
     */
    private String cidrBlock;

    /**
     * The ID of the set of DHCP options you've associated with the VPC (or
     * <code>default</code> if the default options are associated with the
     * VPC).
     */
    private String dhcpOptionsId;

    /**
     * Any tags assigned to the VPC.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The allowed tenancy of instances launched into the VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     */
    private String instanceTenancy;

    /**
     * Indicates whether the VPC is the default VPC.
     */
    private Boolean isDefault;

    /**
     * The ID of the VPC.
     *
     * @return The ID of the VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC.
     *
     * @param vpcId The ID of the VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Vpc withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The current state of the VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @return The current state of the VPC.
     *
     * @see VpcState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The current state of the VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state The current state of the VPC.
     *
     * @see VpcState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The current state of the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state The current state of the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VpcState
     */
    public Vpc withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The current state of the VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state The current state of the VPC.
     *
     * @see VpcState
     */
    public void setState(VpcState state) {
        this.state = state.toString();
    }
    
    /**
     * The current state of the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state The current state of the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VpcState
     */
    public Vpc withState(VpcState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The CIDR block for the VPC.
     *
     * @return The CIDR block for the VPC.
     */
    public String getCidrBlock() {
        return cidrBlock;
    }
    
    /**
     * The CIDR block for the VPC.
     *
     * @param cidrBlock The CIDR block for the VPC.
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }
    
    /**
     * The CIDR block for the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrBlock The CIDR block for the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Vpc withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * The ID of the set of DHCP options you've associated with the VPC (or
     * <code>default</code> if the default options are associated with the
     * VPC).
     *
     * @return The ID of the set of DHCP options you've associated with the VPC (or
     *         <code>default</code> if the default options are associated with the
     *         VPC).
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }
    
    /**
     * The ID of the set of DHCP options you've associated with the VPC (or
     * <code>default</code> if the default options are associated with the
     * VPC).
     *
     * @param dhcpOptionsId The ID of the set of DHCP options you've associated with the VPC (or
     *         <code>default</code> if the default options are associated with the
     *         VPC).
     */
    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }
    
    /**
     * The ID of the set of DHCP options you've associated with the VPC (or
     * <code>default</code> if the default options are associated with the
     * VPC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsId The ID of the set of DHCP options you've associated with the VPC (or
     *         <code>default</code> if the default options are associated with the
     *         VPC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Vpc withDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
        return this;
    }

    /**
     * Any tags assigned to the VPC.
     *
     * @return Any tags assigned to the VPC.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the VPC.
     *
     * @param tags Any tags assigned to the VPC.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * Any tags assigned to the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Vpc withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Any tags assigned to the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Vpc withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * The allowed tenancy of instances launched into the VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @return The allowed tenancy of instances launched into the VPC.
     *
     * @see Tenancy
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }
    
    /**
     * The allowed tenancy of instances launched into the VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The allowed tenancy of instances launched into the VPC.
     *
     * @see Tenancy
     */
    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }
    
    /**
     * The allowed tenancy of instances launched into the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The allowed tenancy of instances launched into the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Tenancy
     */
    public Vpc withInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
        return this;
    }

    /**
     * The allowed tenancy of instances launched into the VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The allowed tenancy of instances launched into the VPC.
     *
     * @see Tenancy
     */
    public void setInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
    }
    
    /**
     * The allowed tenancy of instances launched into the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The allowed tenancy of instances launched into the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Tenancy
     */
    public Vpc withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * Indicates whether the VPC is the default VPC.
     *
     * @return Indicates whether the VPC is the default VPC.
     */
    public Boolean isDefault() {
        return isDefault;
    }
    
    /**
     * Indicates whether the VPC is the default VPC.
     *
     * @param isDefault Indicates whether the VPC is the default VPC.
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
    
    /**
     * Indicates whether the VPC is the default VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isDefault Indicates whether the VPC is the default VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Vpc withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Indicates whether the VPC is the default VPC.
     *
     * @return Indicates whether the VPC is the default VPC.
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getCidrBlock() != null) sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getDhcpOptionsId() != null) sb.append("DhcpOptionsId: " + getDhcpOptionsId() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getInstanceTenancy() != null) sb.append("InstanceTenancy: " + getInstanceTenancy() + ",");
        if (isDefault() != null) sb.append("IsDefault: " + isDefault() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isDefault() == null) ? 0 : isDefault().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Vpc == false) return false;
        Vpc other = (Vpc)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null) return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false) return false; 
        if (other.getDhcpOptionsId() == null ^ this.getDhcpOptionsId() == null) return false;
        if (other.getDhcpOptionsId() != null && other.getDhcpOptionsId().equals(this.getDhcpOptionsId()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null) return false;
        if (other.getInstanceTenancy() != null && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false) return false; 
        if (other.isDefault() == null ^ this.isDefault() == null) return false;
        if (other.isDefault() != null && other.isDefault().equals(this.isDefault()) == false) return false; 
        return true;
    }
    
}
    