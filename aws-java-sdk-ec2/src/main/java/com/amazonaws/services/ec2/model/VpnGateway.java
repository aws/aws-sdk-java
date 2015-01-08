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
 * Describes a virtual private gateway.
 * </p>
 */
public class VpnGateway implements Serializable {

    /**
     * The ID of the virtual private gateway.
     */
    private String vpnGatewayId;

    /**
     * The current state of the virtual private gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     */
    private String state;

    /**
     * The type of VPN connection the virtual private gateway supports.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     */
    private String type;

    /**
     * The Availability Zone where the virtual private gateway was created.
     */
    private String availabilityZone;

    /**
     * Any VPCs attached to the virtual private gateway.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VpcAttachment> vpcAttachments;

    /**
     * Any tags assigned to the virtual private gateway.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The ID of the virtual private gateway.
     *
     * @return The ID of the virtual private gateway.
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }
    
    /**
     * The ID of the virtual private gateway.
     *
     * @param vpnGatewayId The ID of the virtual private gateway.
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }
    
    /**
     * The ID of the virtual private gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayId The ID of the virtual private gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpnGateway withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }

    /**
     * The current state of the virtual private gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @return The current state of the virtual private gateway.
     *
     * @see VpnState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The current state of the virtual private gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The current state of the virtual private gateway.
     *
     * @see VpnState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The current state of the virtual private gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The current state of the virtual private gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VpnState
     */
    public VpnGateway withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The current state of the virtual private gateway.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The current state of the virtual private gateway.
     *
     * @see VpnState
     */
    public void setState(VpnState state) {
        this.state = state.toString();
    }
    
    /**
     * The current state of the virtual private gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state The current state of the virtual private gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see VpnState
     */
    public VpnGateway withState(VpnState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The type of VPN connection the virtual private gateway supports.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @return The type of VPN connection the virtual private gateway supports.
     *
     * @see GatewayType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of VPN connection the virtual private gateway supports.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection the virtual private gateway supports.
     *
     * @see GatewayType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of VPN connection the virtual private gateway supports.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection the virtual private gateway supports.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see GatewayType
     */
    public VpnGateway withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of VPN connection the virtual private gateway supports.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection the virtual private gateway supports.
     *
     * @see GatewayType
     */
    public void setType(GatewayType type) {
        this.type = type.toString();
    }
    
    /**
     * The type of VPN connection the virtual private gateway supports.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ipsec.1
     *
     * @param type The type of VPN connection the virtual private gateway supports.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see GatewayType
     */
    public VpnGateway withType(GatewayType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * The Availability Zone where the virtual private gateway was created.
     *
     * @return The Availability Zone where the virtual private gateway was created.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone where the virtual private gateway was created.
     *
     * @param availabilityZone The Availability Zone where the virtual private gateway was created.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone where the virtual private gateway was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone where the virtual private gateway was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpnGateway withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Any VPCs attached to the virtual private gateway.
     *
     * @return Any VPCs attached to the virtual private gateway.
     */
    public java.util.List<VpcAttachment> getVpcAttachments() {
        if (vpcAttachments == null) {
              vpcAttachments = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcAttachment>();
              vpcAttachments.setAutoConstruct(true);
        }
        return vpcAttachments;
    }
    
    /**
     * Any VPCs attached to the virtual private gateway.
     *
     * @param vpcAttachments Any VPCs attached to the virtual private gateway.
     */
    public void setVpcAttachments(java.util.Collection<VpcAttachment> vpcAttachments) {
        if (vpcAttachments == null) {
            this.vpcAttachments = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VpcAttachment> vpcAttachmentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcAttachment>(vpcAttachments.size());
        vpcAttachmentsCopy.addAll(vpcAttachments);
        this.vpcAttachments = vpcAttachmentsCopy;
    }
    
    /**
     * Any VPCs attached to the virtual private gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcAttachments Any VPCs attached to the virtual private gateway.
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
     * Any VPCs attached to the virtual private gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcAttachments Any VPCs attached to the virtual private gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpnGateway withVpcAttachments(java.util.Collection<VpcAttachment> vpcAttachments) {
        if (vpcAttachments == null) {
            this.vpcAttachments = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VpcAttachment> vpcAttachmentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcAttachment>(vpcAttachments.size());
            vpcAttachmentsCopy.addAll(vpcAttachments);
            this.vpcAttachments = vpcAttachmentsCopy;
        }

        return this;
    }

    /**
     * Any tags assigned to the virtual private gateway.
     *
     * @return Any tags assigned to the virtual private gateway.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the virtual private gateway.
     *
     * @param tags Any tags assigned to the virtual private gateway.
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
     * Any tags assigned to the virtual private gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the virtual private gateway.
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
     * Any tags assigned to the virtual private gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the virtual private gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpnGateway withTags(java.util.Collection<Tag> tags) {
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
        if (getVpnGatewayId() != null) sb.append("VpnGatewayId: " + getVpnGatewayId() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getVpcAttachments() != null) sb.append("VpcAttachments: " + getVpcAttachments() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
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
    