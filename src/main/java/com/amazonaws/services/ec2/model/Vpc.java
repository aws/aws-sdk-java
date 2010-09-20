/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The Vpc data type.
 * </p>
 */
public class Vpc {

    /**
     * Specifies the ID of the VPC.
     */
    private String vpcId;

    /**
     * Describes the current state of the VPC. The state of the subnet may be
     * either <code>pending</code> or <code>available</code>.
     */
    private String state;

    /**
     * Specifies the CIDR block the VPC covers.
     */
    private String cidrBlock;

    /**
     * Specifies the ID of the set of DHCP options associated with the VPC.
     * Contains a value of <code>default</code> if the default options are
     * associated with the VPC.
     */
    private String dhcpOptionsId;

    /**
     * A list of tags for the VPC.
     */
    private java.util.List<Tag> tags;

    /**
     * Specifies the ID of the VPC.
     *
     * @return Specifies the ID of the VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * Specifies the ID of the VPC.
     *
     * @param vpcId Specifies the ID of the VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * Specifies the ID of the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId Specifies the ID of the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Vpc withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    
    
    /**
     * Describes the current state of the VPC. The state of the subnet may be
     * either <code>pending</code> or <code>available</code>.
     *
     * @return Describes the current state of the VPC. The state of the subnet may be
     *         either <code>pending</code> or <code>available</code>.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Describes the current state of the VPC. The state of the subnet may be
     * either <code>pending</code> or <code>available</code>.
     *
     * @param state Describes the current state of the VPC. The state of the subnet may be
     *         either <code>pending</code> or <code>available</code>.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Describes the current state of the VPC. The state of the subnet may be
     * either <code>pending</code> or <code>available</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state Describes the current state of the VPC. The state of the subnet may be
     *         either <code>pending</code> or <code>available</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Vpc withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * Specifies the CIDR block the VPC covers.
     *
     * @return Specifies the CIDR block the VPC covers.
     */
    public String getCidrBlock() {
        return cidrBlock;
    }
    
    /**
     * Specifies the CIDR block the VPC covers.
     *
     * @param cidrBlock Specifies the CIDR block the VPC covers.
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }
    
    /**
     * Specifies the CIDR block the VPC covers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrBlock Specifies the CIDR block the VPC covers.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Vpc withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    
    
    /**
     * Specifies the ID of the set of DHCP options associated with the VPC.
     * Contains a value of <code>default</code> if the default options are
     * associated with the VPC.
     *
     * @return Specifies the ID of the set of DHCP options associated with the VPC.
     *         Contains a value of <code>default</code> if the default options are
     *         associated with the VPC.
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }
    
    /**
     * Specifies the ID of the set of DHCP options associated with the VPC.
     * Contains a value of <code>default</code> if the default options are
     * associated with the VPC.
     *
     * @param dhcpOptionsId Specifies the ID of the set of DHCP options associated with the VPC.
     *         Contains a value of <code>default</code> if the default options are
     *         associated with the VPC.
     */
    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }
    
    /**
     * Specifies the ID of the set of DHCP options associated with the VPC.
     * Contains a value of <code>default</code> if the default options are
     * associated with the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dhcpOptionsId Specifies the ID of the set of DHCP options associated with the VPC.
     *         Contains a value of <code>default</code> if the default options are
     *         associated with the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Vpc withDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
        return this;
    }
    
    
    /**
     * A list of tags for the VPC.
     *
     * @return A list of tags for the VPC.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * A list of tags for the VPC.
     *
     * @param tags A list of tags for the VPC.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags for the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Vpc withTags(Tag... tags) {
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags for the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Vpc withTags(java.util.Collection<Tag> tags) {
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
        this.tags = tagsCopy;

        return this;
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
        sb.append("VpcId: " + vpcId + ", ");
        sb.append("State: " + state + ", ");
        sb.append("CidrBlock: " + cidrBlock + ", ");
        sb.append("DhcpOptionsId: " + dhcpOptionsId + ", ");
        sb.append("Tags: " + tags + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    