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
 * Describes a VPC in a VPC peering connection.
 * </p>
 */
public class VpcPeeringConnectionVpcInfo implements Serializable {

    /**
     * The CIDR block for the VPC.
     */
    private String cidrBlock;

    /**
     * The AWS account ID of the VPC owner.
     */
    private String ownerId;

    /**
     * The ID of the VPC.
     */
    private String vpcId;

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
    public VpcPeeringConnectionVpcInfo withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * The AWS account ID of the VPC owner.
     *
     * @return The AWS account ID of the VPC owner.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * The AWS account ID of the VPC owner.
     *
     * @param ownerId The AWS account ID of the VPC owner.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * The AWS account ID of the VPC owner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId The AWS account ID of the VPC owner.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcPeeringConnectionVpcInfo withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

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
    public VpcPeeringConnectionVpcInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
        if (getCidrBlock() != null) sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getOwnerId() != null) sb.append("OwnerId: " + getOwnerId() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VpcPeeringConnectionVpcInfo == false) return false;
        VpcPeeringConnectionVpcInfo other = (VpcPeeringConnectionVpcInfo)obj;
        
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null) return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false) return false; 
        if (other.getOwnerId() == null ^ this.getOwnerId() == null) return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        return true;
    }
    
}
    