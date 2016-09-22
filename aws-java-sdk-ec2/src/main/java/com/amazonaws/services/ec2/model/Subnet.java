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
 * Describes a subnet.
 * </p>
 */
public class Subnet implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The current state of the subnet.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The ID of the VPC the subnet is in.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The CIDR block assigned to the subnet.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * The number of unused IP addresses in the subnet. Note that the IP addresses for any stopped instances are
     * considered unavailable.
     * </p>
     */
    private Integer availableIpAddressCount;
    /**
     * <p>
     * The Availability Zone of the subnet.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Indicates whether this is the default subnet for the Availability Zone.
     * </p>
     */
    private Boolean defaultForAz;
    /**
     * <p>
     * Indicates whether instances launched in this subnet receive a public IP address.
     * </p>
     */
    private Boolean mapPublicIpOnLaunch;
    /**
     * <p>
     * Any tags assigned to the subnet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

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

    public Subnet withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * 
     * @param state
     *        The current state of the subnet.
     * @see SubnetState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * 
     * @return The current state of the subnet.
     * @see SubnetState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * 
     * @param state
     *        The current state of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubnetState
     */

    public Subnet withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * 
     * @param state
     *        The current state of the subnet.
     * @see SubnetState
     */

    public void setState(SubnetState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * 
     * @param state
     *        The current state of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubnetState
     */

    public Subnet withState(SubnetState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC the subnet is in.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC the subnet is in.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC the subnet is in.
     * </p>
     * 
     * @return The ID of the VPC the subnet is in.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC the subnet is in.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC the subnet is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The CIDR block assigned to the subnet.
     * </p>
     * 
     * @param cidrBlock
     *        The CIDR block assigned to the subnet.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The CIDR block assigned to the subnet.
     * </p>
     * 
     * @return The CIDR block assigned to the subnet.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The CIDR block assigned to the subnet.
     * </p>
     * 
     * @param cidrBlock
     *        The CIDR block assigned to the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * The number of unused IP addresses in the subnet. Note that the IP addresses for any stopped instances are
     * considered unavailable.
     * </p>
     * 
     * @param availableIpAddressCount
     *        The number of unused IP addresses in the subnet. Note that the IP addresses for any stopped instances are
     *        considered unavailable.
     */

    public void setAvailableIpAddressCount(Integer availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
    }

    /**
     * <p>
     * The number of unused IP addresses in the subnet. Note that the IP addresses for any stopped instances are
     * considered unavailable.
     * </p>
     * 
     * @return The number of unused IP addresses in the subnet. Note that the IP addresses for any stopped instances are
     *         considered unavailable.
     */

    public Integer getAvailableIpAddressCount() {
        return this.availableIpAddressCount;
    }

    /**
     * <p>
     * The number of unused IP addresses in the subnet. Note that the IP addresses for any stopped instances are
     * considered unavailable.
     * </p>
     * 
     * @param availableIpAddressCount
     *        The number of unused IP addresses in the subnet. Note that the IP addresses for any stopped instances are
     *        considered unavailable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withAvailableIpAddressCount(Integer availableIpAddressCount) {
        setAvailableIpAddressCount(availableIpAddressCount);
        return this;
    }

    /**
     * <p>
     * The Availability Zone of the subnet.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the subnet.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the subnet.
     * </p>
     * 
     * @return The Availability Zone of the subnet.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the subnet.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the default subnet for the Availability Zone.
     * </p>
     * 
     * @param defaultForAz
     *        Indicates whether this is the default subnet for the Availability Zone.
     */

    public void setDefaultForAz(Boolean defaultForAz) {
        this.defaultForAz = defaultForAz;
    }

    /**
     * <p>
     * Indicates whether this is the default subnet for the Availability Zone.
     * </p>
     * 
     * @return Indicates whether this is the default subnet for the Availability Zone.
     */

    public Boolean getDefaultForAz() {
        return this.defaultForAz;
    }

    /**
     * <p>
     * Indicates whether this is the default subnet for the Availability Zone.
     * </p>
     * 
     * @param defaultForAz
     *        Indicates whether this is the default subnet for the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withDefaultForAz(Boolean defaultForAz) {
        setDefaultForAz(defaultForAz);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the default subnet for the Availability Zone.
     * </p>
     * 
     * @return Indicates whether this is the default subnet for the Availability Zone.
     */

    public Boolean isDefaultForAz() {
        return this.defaultForAz;
    }

    /**
     * <p>
     * Indicates whether instances launched in this subnet receive a public IP address.
     * </p>
     * 
     * @param mapPublicIpOnLaunch
     *        Indicates whether instances launched in this subnet receive a public IP address.
     */

    public void setMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Indicates whether instances launched in this subnet receive a public IP address.
     * </p>
     * 
     * @return Indicates whether instances launched in this subnet receive a public IP address.
     */

    public Boolean getMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Indicates whether instances launched in this subnet receive a public IP address.
     * </p>
     * 
     * @param mapPublicIpOnLaunch
     *        Indicates whether instances launched in this subnet receive a public IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        setMapPublicIpOnLaunch(mapPublicIpOnLaunch);
        return this;
    }

    /**
     * <p>
     * Indicates whether instances launched in this subnet receive a public IP address.
     * </p>
     * 
     * @return Indicates whether instances launched in this subnet receive a public IP address.
     */

    public Boolean isMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Any tags assigned to the subnet.
     * </p>
     * 
     * @return Any tags assigned to the subnet.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the subnet.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the subnet.
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
     * Any tags assigned to the subnet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withTags(Tag... tags) {
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
     * Any tags assigned to the subnet.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subnet withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
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
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getAvailableIpAddressCount() != null)
            sb.append("AvailableIpAddressCount: " + getAvailableIpAddressCount() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDefaultForAz() != null)
            sb.append("DefaultForAz: " + getDefaultForAz() + ",");
        if (getMapPublicIpOnLaunch() != null)
            sb.append("MapPublicIpOnLaunch: " + getMapPublicIpOnLaunch() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subnet == false)
            return false;
        Subnet other = (Subnet) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getAvailableIpAddressCount() == null ^ this.getAvailableIpAddressCount() == null)
            return false;
        if (other.getAvailableIpAddressCount() != null && other.getAvailableIpAddressCount().equals(this.getAvailableIpAddressCount()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDefaultForAz() == null ^ this.getDefaultForAz() == null)
            return false;
        if (other.getDefaultForAz() != null && other.getDefaultForAz().equals(this.getDefaultForAz()) == false)
            return false;
        if (other.getMapPublicIpOnLaunch() == null ^ this.getMapPublicIpOnLaunch() == null)
            return false;
        if (other.getMapPublicIpOnLaunch() != null && other.getMapPublicIpOnLaunch().equals(this.getMapPublicIpOnLaunch()) == false)
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

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getAvailableIpAddressCount() == null) ? 0 : getAvailableIpAddressCount().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDefaultForAz() == null) ? 0 : getDefaultForAz().hashCode());
        hashCode = prime * hashCode + ((getMapPublicIpOnLaunch() == null) ? 0 : getMapPublicIpOnLaunch().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Subnet clone() {
        try {
            return (Subnet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
