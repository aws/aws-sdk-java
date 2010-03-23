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
 * Describe Vpn Gateways Result
 */
public class DescribeVpnGatewaysResult {
        
    private java.util.List<VpnGateway> vpnGateways;

    /**
     * Returns the value of the VpnGateways property for this object.
     *
     * @return The value of the VpnGateways property for this object.
     */
    public java.util.List<VpnGateway> getVpnGateways() {
        if (vpnGateways == null) {
            vpnGateways = new java.util.ArrayList<VpnGateway>();
        }
        return vpnGateways;
    }
    
    /**
     * Sets the value of the VpnGateways property for this object.
     *
     * @param vpnGateways The new value for the VpnGateways property for this object.
     */
    public void setVpnGateways(java.util.Collection<VpnGateway> vpnGateways) {
        java.util.List<VpnGateway> vpnGatewaysCopy = new java.util.ArrayList<VpnGateway>();
        if (vpnGateways != null) {
            vpnGatewaysCopy.addAll(vpnGateways);
        }
        this.vpnGateways = vpnGatewaysCopy;
    }
    
    /**
     * Sets the value of the VpnGateways property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGateways The new value for the VpnGateways property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnGatewaysResult withVpnGateways(VpnGateway... vpnGateways) {
        for (VpnGateway value : vpnGateways) {
            getVpnGateways().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the VpnGateways property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGateways The new value for the VpnGateways property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnGatewaysResult withVpnGateways(java.util.Collection<VpnGateway> vpnGateways) {
        java.util.List<VpnGateway> vpnGatewaysCopy = new java.util.ArrayList<VpnGateway>();
        if (vpnGateways != null) {
            vpnGatewaysCopy.addAll(vpnGateways);
        }
        this.vpnGateways = vpnGatewaysCopy;

        return this;
    }
    
}
    