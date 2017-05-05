/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a VPC in a VPC peering connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpcPeeringConnectionVpcInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcPeeringConnectionVpcInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The IPv4 CIDR block for the VPC.
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
     * The IPv6 CIDR block for the VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Ipv6CidrBlock> ipv6CidrBlockSet;
    /**
     * <p>
     * Information about the VPC peering connection options for the accepter or requester VPC.
     * </p>
     */
    private VpcPeeringConnectionOptionsDescription peeringOptions;

    /**
     * <p>
     * The IPv4 CIDR block for the VPC.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 CIDR block for the VPC.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR block for the VPC.
     * </p>
     * 
     * @return The IPv4 CIDR block for the VPC.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR block for the VPC.
     * </p>
     * 
     * @param cidrBlock
     *        The IPv4 CIDR block for the VPC.
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
     * The IPv6 CIDR block for the VPC.
     * </p>
     * 
     * @return The IPv6 CIDR block for the VPC.
     */

    public java.util.List<Ipv6CidrBlock> getIpv6CidrBlockSet() {
        if (ipv6CidrBlockSet == null) {
            ipv6CidrBlockSet = new com.amazonaws.internal.SdkInternalList<Ipv6CidrBlock>();
        }
        return ipv6CidrBlockSet;
    }

    /**
     * <p>
     * The IPv6 CIDR block for the VPC.
     * </p>
     * 
     * @param ipv6CidrBlockSet
     *        The IPv6 CIDR block for the VPC.
     */

    public void setIpv6CidrBlockSet(java.util.Collection<Ipv6CidrBlock> ipv6CidrBlockSet) {
        if (ipv6CidrBlockSet == null) {
            this.ipv6CidrBlockSet = null;
            return;
        }

        this.ipv6CidrBlockSet = new com.amazonaws.internal.SdkInternalList<Ipv6CidrBlock>(ipv6CidrBlockSet);
    }

    /**
     * <p>
     * The IPv6 CIDR block for the VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6CidrBlockSet(java.util.Collection)} or {@link #withIpv6CidrBlockSet(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ipv6CidrBlockSet
     *        The IPv6 CIDR block for the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnectionVpcInfo withIpv6CidrBlockSet(Ipv6CidrBlock... ipv6CidrBlockSet) {
        if (this.ipv6CidrBlockSet == null) {
            setIpv6CidrBlockSet(new com.amazonaws.internal.SdkInternalList<Ipv6CidrBlock>(ipv6CidrBlockSet.length));
        }
        for (Ipv6CidrBlock ele : ipv6CidrBlockSet) {
            this.ipv6CidrBlockSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR block for the VPC.
     * </p>
     * 
     * @param ipv6CidrBlockSet
     *        The IPv6 CIDR block for the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnectionVpcInfo withIpv6CidrBlockSet(java.util.Collection<Ipv6CidrBlock> ipv6CidrBlockSet) {
        setIpv6CidrBlockSet(ipv6CidrBlockSet);
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
            sb.append("CidrBlock: ").append(getCidrBlock()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getIpv6CidrBlockSet() != null)
            sb.append("Ipv6CidrBlockSet: ").append(getIpv6CidrBlockSet()).append(",");
        if (getPeeringOptions() != null)
            sb.append("PeeringOptions: ").append(getPeeringOptions());
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
        if (other.getIpv6CidrBlockSet() == null ^ this.getIpv6CidrBlockSet() == null)
            return false;
        if (other.getIpv6CidrBlockSet() != null && other.getIpv6CidrBlockSet().equals(this.getIpv6CidrBlockSet()) == false)
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
        hashCode = prime * hashCode + ((getIpv6CidrBlockSet() == null) ? 0 : getIpv6CidrBlockSet().hashCode());
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
