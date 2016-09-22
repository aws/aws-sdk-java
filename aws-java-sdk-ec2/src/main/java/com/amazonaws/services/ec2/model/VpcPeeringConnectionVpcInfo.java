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
 * Describes a VPC in a VPC peering connection.
 * </p>
 */
public class VpcPeeringConnectionVpcInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The CIDR block for the VPC.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * The AWS account ID of the VPC owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Information about the VPC peering connection options for the accepter or requester VPC.
     * </p>
     */
    private VpcPeeringConnectionOptionsDescription peeringOptions;

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

    public VpcPeeringConnectionVpcInfo withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the VPC owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the VPC owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the VPC owner.
     * </p>
     * 
     * @return The AWS account ID of the VPC owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the VPC owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the VPC owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnectionVpcInfo withOwnerId(String ownerId) {
        setOwnerId(ownerId);
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

    public VpcPeeringConnectionVpcInfo withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter or requester VPC.
     * </p>
     * 
     * @param peeringOptions
     *        Information about the VPC peering connection options for the accepter or requester VPC.
     */

    public void setPeeringOptions(VpcPeeringConnectionOptionsDescription peeringOptions) {
        this.peeringOptions = peeringOptions;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter or requester VPC.
     * </p>
     * 
     * @return Information about the VPC peering connection options for the accepter or requester VPC.
     */

    public VpcPeeringConnectionOptionsDescription getPeeringOptions() {
        return this.peeringOptions;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter or requester VPC.
     * </p>
     * 
     * @param peeringOptions
     *        Information about the VPC peering connection options for the accepter or requester VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnectionVpcInfo withPeeringOptions(VpcPeeringConnectionOptionsDescription peeringOptions) {
        setPeeringOptions(peeringOptions);
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
        if (getCidrBlock() != null)
            sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getPeeringOptions() != null)
            sb.append("PeeringOptions: " + getPeeringOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcPeeringConnectionVpcInfo == false)
            return false;
        VpcPeeringConnectionVpcInfo other = (VpcPeeringConnectionVpcInfo) obj;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getPeeringOptions() == null ^ this.getPeeringOptions() == null)
            return false;
        if (other.getPeeringOptions() != null && other.getPeeringOptions().equals(this.getPeeringOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getPeeringOptions() == null) ? 0 : getPeeringOptions().hashCode());
        return hashCode;
    }

    @Override
    public VpcPeeringConnectionVpcInfo clone() {
        try {
            return (VpcPeeringConnectionVpcInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
