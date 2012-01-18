/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The VpnGateway data type.
 * </p>
 */
public class VpnGateway {

    /**
     * Specifies the ID of the VPN gateway.
     */
    private String vpnGatewayId;

    /**
     * Describes the current state of the VPN gateway. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     */
    private String state;

    /**
     * Specifies the type of VPN connection the VPN gateway supports.
     */
    private String type;

    /**
     * Specifies the Availability Zone where the VPN gateway was created.
     */
    private String availabilityZone;

    /**
     * Contains information about the VPCs attached to the VPN gateway.
     */
    private java.util.List<VpcAttachment> vpcAttachments;

    /**
     * A list of tags for the VpnGateway.
     */
    private java.util.List<Tag> tags;

    /**
     * Specifies the ID of the VPN gateway.
     *
     * @return Specifies the ID of the VPN gateway.
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }
    
    /**
     * Specifies the ID of the VPN gateway.
     *
     * @param vpnGatewayId Specifies the ID of the VPN gateway.
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }
    
    /**
     * Specifies the ID of the VPN gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayId Specifies the ID of the VPN gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    
    
    /**
     * Describes the current state of the VPN gateway. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     *
     * @return Describes the current state of the VPN gateway. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Describes the current state of the VPN gateway. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     *
     * @param state Describes the current state of the VPN gateway. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Describes the current state of the VPN gateway. Valid values are
     * <code>pending</code>, <code>available</code>, <code>deleting</code>,
     * and <code>deleted</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state Describes the current state of the VPN gateway. Valid values are
     *         <code>pending</code>, <code>available</code>, <code>deleting</code>,
     *         and <code>deleted</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * Specifies the type of VPN connection the VPN gateway supports.
     *
     * @return Specifies the type of VPN connection the VPN gateway supports.
     */
    public String getType() {
        return type;
    }
    
    /**
     * Specifies the type of VPN connection the VPN gateway supports.
     *
     * @param type Specifies the type of VPN connection the VPN gateway supports.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Specifies the type of VPN connection the VPN gateway supports.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type Specifies the type of VPN connection the VPN gateway supports.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withType(String type) {
        this.type = type;
        return this;
    }
    
    
    /**
     * Specifies the Availability Zone where the VPN gateway was created.
     *
     * @return Specifies the Availability Zone where the VPN gateway was created.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Specifies the Availability Zone where the VPN gateway was created.
     *
     * @param availabilityZone Specifies the Availability Zone where the VPN gateway was created.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Specifies the Availability Zone where the VPN gateway was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone Specifies the Availability Zone where the VPN gateway was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * Contains information about the VPCs attached to the VPN gateway.
     *
     * @return Contains information about the VPCs attached to the VPN gateway.
     */
    public java.util.List<VpcAttachment> getVpcAttachments() {
        
        if (vpcAttachments == null) {
            vpcAttachments = new java.util.ArrayList<VpcAttachment>();
        }
        return vpcAttachments;
    }
    
    /**
     * Contains information about the VPCs attached to the VPN gateway.
     *
     * @param vpcAttachments Contains information about the VPCs attached to the VPN gateway.
     */
    public void setVpcAttachments(java.util.Collection<VpcAttachment> vpcAttachments) {
        if (vpcAttachments == null) {
            this.vpcAttachments = null;
            return;
        }

        java.util.List<VpcAttachment> vpcAttachmentsCopy = new java.util.ArrayList<VpcAttachment>(vpcAttachments.size());
        vpcAttachmentsCopy.addAll(vpcAttachments);
        this.vpcAttachments = vpcAttachmentsCopy;
    }
    
    /**
     * Contains information about the VPCs attached to the VPN gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcAttachments Contains information about the VPCs attached to the VPN gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withVpcAttachments(VpcAttachment... vpcAttachments) {
        if (getVpcAttachments() == null) setVpcAttachments(new java.util.ArrayList<VpcAttachment>(vpcAttachments.length));
        for (VpcAttachment value : vpcAttachments) {
            getVpcAttachments().add(value);
        }
        return this;
    }
    
    /**
     * Contains information about the VPCs attached to the VPN gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcAttachments Contains information about the VPCs attached to the VPN gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withVpcAttachments(java.util.Collection<VpcAttachment> vpcAttachments) {
        if (vpcAttachments == null) {
            this.vpcAttachments = null;
        } else {
            java.util.List<VpcAttachment> vpcAttachmentsCopy = new java.util.ArrayList<VpcAttachment>(vpcAttachments.size());
            vpcAttachmentsCopy.addAll(vpcAttachments);
            this.vpcAttachments = vpcAttachmentsCopy;
        }

        return this;
    }
    
    /**
     * A list of tags for the VpnGateway.
     *
     * @return A list of tags for the VpnGateway.
     */
    public java.util.List<Tag> getTags() {
        
        if (tags == null) {
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * A list of tags for the VpnGateway.
     *
     * @param tags A list of tags for the VpnGateway.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags for the VpnGateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the VpnGateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags for the VpnGateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the VpnGateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
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
        if (vpnGatewayId != null) sb.append("VpnGatewayId: " + vpnGatewayId + ", ");
        if (state != null) sb.append("State: " + state + ", ");
        if (type != null) sb.append("Type: " + type + ", ");
        if (availabilityZone != null) sb.append("AvailabilityZone: " + availabilityZone + ", ");
        if (vpcAttachments != null) sb.append("VpcAttachments: " + vpcAttachments + ", ");
        if (tags != null) sb.append("Tags: " + tags + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getVpcAttachments() == null) ? 0 : getVpcAttachments().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof VpnGateway == false) return false;
        VpnGateway other = (VpnGateway)obj;
        
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null) return false;
        if (other.getVpnGatewayId() != null && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getVpcAttachments() == null ^ this.getVpcAttachments() == null) return false;
        if (other.getVpcAttachments() != null && other.getVpcAttachments().equals(this.getVpcAttachments()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    