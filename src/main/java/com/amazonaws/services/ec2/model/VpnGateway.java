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
 * Vpn Gateway
 */
public class VpnGateway {
        
    private String vpnGatewayId;

    private String state;

    private String type;

    private String availabilityZone;

    private java.util.List<VpcAttachment> vpcAttachments;

    /**
     * Returns the value of the VpnGatewayId property for this object.
     *
     * @return The value of the VpnGatewayId property for this object.
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }
    
    /**
     * Sets the value of the VpnGatewayId property for this object.
     *
     * @param vpnGatewayId The new value for the VpnGatewayId property for this object.
     */
    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }
    
    /**
     * Sets the value of the VpnGatewayId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGatewayId The new value for the VpnGatewayId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    
    
    /**
     * Returns the value of the State property for this object.
     *
     * @return The value of the State property for this object.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the value of the State property for this object.
     *
     * @param state The new value for the State property for this object.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * Returns the value of the Type property for this object.
     *
     * @return The value of the Type property for this object.
     */
    public String getType() {
        return type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     *
     * @param type The new value for the Type property for this object.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The new value for the Type property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withType(String type) {
        this.type = type;
        return this;
    }
    
    
    /**
     * Returns the value of the AvailabilityZone property for this object.
     *
     * @return The value of the AvailabilityZone property for this object.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Sets the value of the AvailabilityZone property for this object.
     *
     * @param availabilityZone The new value for the AvailabilityZone property for this object.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Sets the value of the AvailabilityZone property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The new value for the AvailabilityZone property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * Returns the value of the VpcAttachments property for this object.
     *
     * @return The value of the VpcAttachments property for this object.
     */
    public java.util.List<VpcAttachment> getVpcAttachments() {
        if (vpcAttachments == null) {
            vpcAttachments = new java.util.ArrayList<VpcAttachment>();
        }
        return vpcAttachments;
    }
    
    /**
     * Sets the value of the VpcAttachments property for this object.
     *
     * @param vpcAttachments The new value for the VpcAttachments property for this object.
     */
    public void setVpcAttachments(java.util.Collection<VpcAttachment> vpcAttachments) {
        java.util.List<VpcAttachment> vpcAttachmentsCopy = new java.util.ArrayList<VpcAttachment>();
        if (vpcAttachments != null) {
            vpcAttachmentsCopy.addAll(vpcAttachments);
        }
        this.vpcAttachments = vpcAttachmentsCopy;
    }
    
    /**
     * Sets the value of the VpcAttachments property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcAttachments The new value for the VpcAttachments property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withVpcAttachments(VpcAttachment... vpcAttachments) {
        for (VpcAttachment value : vpcAttachments) {
            getVpcAttachments().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the VpcAttachments property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcAttachments The new value for the VpcAttachments property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public VpnGateway withVpcAttachments(java.util.Collection<VpcAttachment> vpcAttachments) {
        java.util.List<VpcAttachment> vpcAttachmentsCopy = new java.util.ArrayList<VpcAttachment>();
        if (vpcAttachments != null) {
            vpcAttachmentsCopy.addAll(vpcAttachments);
        }
        this.vpcAttachments = vpcAttachmentsCopy;

        return this;
    }
    
}
    