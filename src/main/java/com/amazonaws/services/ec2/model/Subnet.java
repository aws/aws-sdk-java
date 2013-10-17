/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The Subnet data type.
 * </p>
 */
public class Subnet implements Serializable {

    /**
     * Specifies the ID of the subnet.
     */
    private String subnetId;

    /**
     * Describes the current state of the subnet. The state of the subnet may
     * be either <code>pending</code> or <code>available</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     */
    private String state;

    /**
     * Contains the ID of the VPC the subnet is in.
     */
    private String vpcId;

    /**
     * Specifies the CIDR block assigned to the subnet.
     */
    private String cidrBlock;

    /**
     * Specifies the number of unused IP addresses in the subnet. <note> <p>
     * The IP addresses for any stopped instances are considered unavailable.
     * </note>
     */
    private Integer availableIpAddressCount;

    /**
     * Specifies the Availability Zone the subnet is in.
     */
    private String availabilityZone;

    private Boolean defaultForAz;

    private Boolean mapPublicIpOnLaunch;

    /**
     * A list of tags for the Subnet.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Specifies the ID of the subnet.
     *
     * @return Specifies the ID of the subnet.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * Specifies the ID of the subnet.
     *
     * @param subnetId Specifies the ID of the subnet.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * Specifies the ID of the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId Specifies the ID of the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Describes the current state of the subnet. The state of the subnet may
     * be either <code>pending</code> or <code>available</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @return Describes the current state of the subnet. The state of the subnet may
     *         be either <code>pending</code> or <code>available</code>.
     *
     * @see SubnetState
     */
    public String getState() {
        return state;
    }
    
    /**
     * Describes the current state of the subnet. The state of the subnet may
     * be either <code>pending</code> or <code>available</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state Describes the current state of the subnet. The state of the subnet may
     *         be either <code>pending</code> or <code>available</code>.
     *
     * @see SubnetState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Describes the current state of the subnet. The state of the subnet may
     * be either <code>pending</code> or <code>available</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state Describes the current state of the subnet. The state of the subnet may
     *         be either <code>pending</code> or <code>available</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SubnetState
     */
    public Subnet withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Describes the current state of the subnet. The state of the subnet may
     * be either <code>pending</code> or <code>available</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state Describes the current state of the subnet. The state of the subnet may
     *         be either <code>pending</code> or <code>available</code>.
     *
     * @see SubnetState
     */
    public void setState(SubnetState state) {
        this.state = state.toString();
    }
    
    /**
     * Describes the current state of the subnet. The state of the subnet may
     * be either <code>pending</code> or <code>available</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available
     *
     * @param state Describes the current state of the subnet. The state of the subnet may
     *         be either <code>pending</code> or <code>available</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SubnetState
     */
    public Subnet withState(SubnetState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Contains the ID of the VPC the subnet is in.
     *
     * @return Contains the ID of the VPC the subnet is in.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * Contains the ID of the VPC the subnet is in.
     *
     * @param vpcId Contains the ID of the VPC the subnet is in.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * Contains the ID of the VPC the subnet is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId Contains the ID of the VPC the subnet is in.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * Specifies the CIDR block assigned to the subnet.
     *
     * @return Specifies the CIDR block assigned to the subnet.
     */
    public String getCidrBlock() {
        return cidrBlock;
    }
    
    /**
     * Specifies the CIDR block assigned to the subnet.
     *
     * @param cidrBlock Specifies the CIDR block assigned to the subnet.
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }
    
    /**
     * Specifies the CIDR block assigned to the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrBlock Specifies the CIDR block assigned to the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * Specifies the number of unused IP addresses in the subnet. <note> <p>
     * The IP addresses for any stopped instances are considered unavailable.
     * </note>
     *
     * @return Specifies the number of unused IP addresses in the subnet. <note> <p>
     *         The IP addresses for any stopped instances are considered unavailable.
     *         </note>
     */
    public Integer getAvailableIpAddressCount() {
        return availableIpAddressCount;
    }
    
    /**
     * Specifies the number of unused IP addresses in the subnet. <note> <p>
     * The IP addresses for any stopped instances are considered unavailable.
     * </note>
     *
     * @param availableIpAddressCount Specifies the number of unused IP addresses in the subnet. <note> <p>
     *         The IP addresses for any stopped instances are considered unavailable.
     *         </note>
     */
    public void setAvailableIpAddressCount(Integer availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
    }
    
    /**
     * Specifies the number of unused IP addresses in the subnet. <note> <p>
     * The IP addresses for any stopped instances are considered unavailable.
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availableIpAddressCount Specifies the number of unused IP addresses in the subnet. <note> <p>
     *         The IP addresses for any stopped instances are considered unavailable.
     *         </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withAvailableIpAddressCount(Integer availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
        return this;
    }

    /**
     * Specifies the Availability Zone the subnet is in.
     *
     * @return Specifies the Availability Zone the subnet is in.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Specifies the Availability Zone the subnet is in.
     *
     * @param availabilityZone Specifies the Availability Zone the subnet is in.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Specifies the Availability Zone the subnet is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone Specifies the Availability Zone the subnet is in.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Returns the value of the DefaultForAz property for this object.
     *
     * @return The value of the DefaultForAz property for this object.
     */
    public Boolean isDefaultForAz() {
        return defaultForAz;
    }
    
    /**
     * Sets the value of the DefaultForAz property for this object.
     *
     * @param defaultForAz The new value for the DefaultForAz property for this object.
     */
    public void setDefaultForAz(Boolean defaultForAz) {
        this.defaultForAz = defaultForAz;
    }
    
    /**
     * Sets the value of the DefaultForAz property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultForAz The new value for the DefaultForAz property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withDefaultForAz(Boolean defaultForAz) {
        this.defaultForAz = defaultForAz;
        return this;
    }

    /**
     * Returns the value of the DefaultForAz property for this object.
     *
     * @return The value of the DefaultForAz property for this object.
     */
    public Boolean getDefaultForAz() {
        return defaultForAz;
    }

    /**
     * Returns the value of the MapPublicIpOnLaunch property for this object.
     *
     * @return The value of the MapPublicIpOnLaunch property for this object.
     */
    public Boolean isMapPublicIpOnLaunch() {
        return mapPublicIpOnLaunch;
    }
    
    /**
     * Sets the value of the MapPublicIpOnLaunch property for this object.
     *
     * @param mapPublicIpOnLaunch The new value for the MapPublicIpOnLaunch property for this object.
     */
    public void setMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
    }
    
    /**
     * Sets the value of the MapPublicIpOnLaunch property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mapPublicIpOnLaunch The new value for the MapPublicIpOnLaunch property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
        return this;
    }

    /**
     * Returns the value of the MapPublicIpOnLaunch property for this object.
     *
     * @return The value of the MapPublicIpOnLaunch property for this object.
     */
    public Boolean getMapPublicIpOnLaunch() {
        return mapPublicIpOnLaunch;
    }

    /**
     * A list of tags for the Subnet.
     *
     * @return A list of tags for the Subnet.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags for the Subnet.
     *
     * @param tags A list of tags for the Subnet.
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
     * A list of tags for the Subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the Subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags for the Subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the Subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Subnet withTags(java.util.Collection<Tag> tags) {
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
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getCidrBlock() != null) sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getAvailableIpAddressCount() != null) sb.append("AvailableIpAddressCount: " + getAvailableIpAddressCount() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (isDefaultForAz() != null) sb.append("DefaultForAz: " + isDefaultForAz() + ",");
        if (isMapPublicIpOnLaunch() != null) sb.append("MapPublicIpOnLaunch: " + isMapPublicIpOnLaunch() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode()); 
        hashCode = prime * hashCode + ((getAvailableIpAddressCount() == null) ? 0 : getAvailableIpAddressCount().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((isDefaultForAz() == null) ? 0 : isDefaultForAz().hashCode()); 
        hashCode = prime * hashCode + ((isMapPublicIpOnLaunch() == null) ? 0 : isMapPublicIpOnLaunch().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Subnet == false) return false;
        Subnet other = (Subnet)obj;
        
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null) return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false) return false; 
        if (other.getAvailableIpAddressCount() == null ^ this.getAvailableIpAddressCount() == null) return false;
        if (other.getAvailableIpAddressCount() != null && other.getAvailableIpAddressCount().equals(this.getAvailableIpAddressCount()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.isDefaultForAz() == null ^ this.isDefaultForAz() == null) return false;
        if (other.isDefaultForAz() != null && other.isDefaultForAz().equals(this.isDefaultForAz()) == false) return false; 
        if (other.isMapPublicIpOnLaunch() == null ^ this.isMapPublicIpOnLaunch() == null) return false;
        if (other.isMapPublicIpOnLaunch() != null && other.isMapPublicIpOnLaunch().equals(this.isMapPublicIpOnLaunch()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    