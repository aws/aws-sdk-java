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
 * The Subnet data type.
 * </p>
 */
public class Subnet {

    /**
     * Specifies the ID of the subnet.
     */
    private String subnetId;

    /**
     * Describes the current state of the subnet. The state of the subnet may
     * be either <code>pending</code> or <code>available</code>.
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
     *
     * @return Describes the current state of the subnet. The state of the subnet may
     *         be either <code>pending</code> or <code>available</code>.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Describes the current state of the subnet. The state of the subnet may
     * be either <code>pending</code> or <code>available</code>.
     *
     * @param state Describes the current state of the subnet. The state of the subnet may
     *         be either <code>pending</code> or <code>available</code>.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Describes the current state of the subnet. The state of the subnet may
     * be either <code>pending</code> or <code>available</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state Describes the current state of the subnet. The state of the subnet may
     *         be either <code>pending</code> or <code>available</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Subnet withState(String state) {
        this.state = state;
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
        
        sb.append("SubnetId: " + subnetId + ", ");
        sb.append("State: " + state + ", ");
        sb.append("VpcId: " + vpcId + ", ");
        sb.append("CidrBlock: " + cidrBlock + ", ");
        sb.append("AvailableIpAddressCount: " + availableIpAddressCount + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    