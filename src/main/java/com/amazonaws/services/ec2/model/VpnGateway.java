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
        java.util.List<VpcAttachment> vpcAttachmentsCopy = new java.util.ArrayList<VpcAttachment>();
        if (vpcAttachments != null) {
            vpcAttachmentsCopy.addAll(vpcAttachments);
        }
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
        java.util.List<VpcAttachment> vpcAttachmentsCopy = new java.util.ArrayList<VpcAttachment>();
        if (vpcAttachments != null) {
            vpcAttachmentsCopy.addAll(vpcAttachments);
        }
        this.vpcAttachments = vpcAttachmentsCopy;

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
        
        sb.append("VpnGatewayId: " + vpnGatewayId + ", ");
        sb.append("State: " + state + ", ");
        sb.append("Type: " + type + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("VpcAttachments: " + vpcAttachments + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    