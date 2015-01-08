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
 * Describes a VPC peering connection.
 * </p>
 */
public class VpcPeeringConnection implements Serializable {

    /**
     * The information of the peer VPC.
     */
    private VpcPeeringConnectionVpcInfo accepterVpcInfo;

    /**
     * The time that an unaccepted VPC peering connection will expire.
     */
    private java.util.Date expirationTime;

    /**
     * The information of the requester VPC.
     */
    private VpcPeeringConnectionVpcInfo requesterVpcInfo;

    /**
     * The status of the VPC peering connection.
     */
    private VpcPeeringConnectionStateReason status;

    /**
     * Any tags assigned to the resource.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The ID of the VPC peering connection.
     */
    private String vpcPeeringConnectionId;

    /**
     * The information of the peer VPC.
     *
     * @return The information of the peer VPC.
     */
    public VpcPeeringConnectionVpcInfo getAccepterVpcInfo() {
        return accepterVpcInfo;
    }
    
    /**
     * The information of the peer VPC.
     *
     * @param accepterVpcInfo The information of the peer VPC.
     */
    public void setAccepterVpcInfo(VpcPeeringConnectionVpcInfo accepterVpcInfo) {
        this.accepterVpcInfo = accepterVpcInfo;
    }
    
    /**
     * The information of the peer VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accepterVpcInfo The information of the peer VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcPeeringConnection withAccepterVpcInfo(VpcPeeringConnectionVpcInfo accepterVpcInfo) {
        this.accepterVpcInfo = accepterVpcInfo;
        return this;
    }

    /**
     * The time that an unaccepted VPC peering connection will expire.
     *
     * @return The time that an unaccepted VPC peering connection will expire.
     */
    public java.util.Date getExpirationTime() {
        return expirationTime;
    }
    
    /**
     * The time that an unaccepted VPC peering connection will expire.
     *
     * @param expirationTime The time that an unaccepted VPC peering connection will expire.
     */
    public void setExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
    }
    
    /**
     * The time that an unaccepted VPC peering connection will expire.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expirationTime The time that an unaccepted VPC peering connection will expire.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcPeeringConnection withExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * The information of the requester VPC.
     *
     * @return The information of the requester VPC.
     */
    public VpcPeeringConnectionVpcInfo getRequesterVpcInfo() {
        return requesterVpcInfo;
    }
    
    /**
     * The information of the requester VPC.
     *
     * @param requesterVpcInfo The information of the requester VPC.
     */
    public void setRequesterVpcInfo(VpcPeeringConnectionVpcInfo requesterVpcInfo) {
        this.requesterVpcInfo = requesterVpcInfo;
    }
    
    /**
     * The information of the requester VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requesterVpcInfo The information of the requester VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcPeeringConnection withRequesterVpcInfo(VpcPeeringConnectionVpcInfo requesterVpcInfo) {
        this.requesterVpcInfo = requesterVpcInfo;
        return this;
    }

    /**
     * The status of the VPC peering connection.
     *
     * @return The status of the VPC peering connection.
     */
    public VpcPeeringConnectionStateReason getStatus() {
        return status;
    }
    
    /**
     * The status of the VPC peering connection.
     *
     * @param status The status of the VPC peering connection.
     */
    public void setStatus(VpcPeeringConnectionStateReason status) {
        this.status = status;
    }
    
    /**
     * The status of the VPC peering connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the VPC peering connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcPeeringConnection withStatus(VpcPeeringConnectionStateReason status) {
        this.status = status;
        return this;
    }

    /**
     * Any tags assigned to the resource.
     *
     * @return Any tags assigned to the resource.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the resource.
     *
     * @param tags Any tags assigned to the resource.
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
     * Any tags assigned to the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcPeeringConnection withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Any tags assigned to the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcPeeringConnection withTags(java.util.Collection<Tag> tags) {
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
     * The ID of the VPC peering connection.
     *
     * @return The ID of the VPC peering connection.
     */
    public String getVpcPeeringConnectionId() {
        return vpcPeeringConnectionId;
    }
    
    /**
     * The ID of the VPC peering connection.
     *
     * @param vpcPeeringConnectionId The ID of the VPC peering connection.
     */
    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }
    
    /**
     * The ID of the VPC peering connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcPeeringConnectionId The ID of the VPC peering connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcPeeringConnection withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
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
        if (getAccepterVpcInfo() != null) sb.append("AccepterVpcInfo: " + getAccepterVpcInfo() + ",");
        if (getExpirationTime() != null) sb.append("ExpirationTime: " + getExpirationTime() + ",");
        if (getRequesterVpcInfo() != null) sb.append("RequesterVpcInfo: " + getRequesterVpcInfo() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getVpcPeeringConnectionId() != null) sb.append("VpcPeeringConnectionId: " + getVpcPeeringConnectionId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccepterVpcInfo() == null) ? 0 : getAccepterVpcInfo().hashCode()); 
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode()); 
        hashCode = prime * hashCode + ((getRequesterVpcInfo() == null) ? 0 : getRequesterVpcInfo().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VpcPeeringConnection == false) return false;
        VpcPeeringConnection other = (VpcPeeringConnection)obj;
        
        if (other.getAccepterVpcInfo() == null ^ this.getAccepterVpcInfo() == null) return false;
        if (other.getAccepterVpcInfo() != null && other.getAccepterVpcInfo().equals(this.getAccepterVpcInfo()) == false) return false; 
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null) return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false) return false; 
        if (other.getRequesterVpcInfo() == null ^ this.getRequesterVpcInfo() == null) return false;
        if (other.getRequesterVpcInfo() != null && other.getRequesterVpcInfo().equals(this.getRequesterVpcInfo()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null) return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false) return false; 
        return true;
    }
    
}
    