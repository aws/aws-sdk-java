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
 * Describe Vpn Connections Result
 */
public class DescribeVpnConnectionsResult {
        
    private java.util.List<VpnConnection> vpnConnections;

    /**
     * Returns the value of the VpnConnections property for this object.
     *
     * @return The value of the VpnConnections property for this object.
     */
    public java.util.List<VpnConnection> getVpnConnections() {
        if (vpnConnections == null) {
            vpnConnections = new java.util.ArrayList<VpnConnection>();
        }
        return vpnConnections;
    }
    
    /**
     * Sets the value of the VpnConnections property for this object.
     *
     * @param vpnConnections The new value for the VpnConnections property for this object.
     */
    public void setVpnConnections(java.util.Collection<VpnConnection> vpnConnections) {
        java.util.List<VpnConnection> vpnConnectionsCopy = new java.util.ArrayList<VpnConnection>();
        if (vpnConnections != null) {
            vpnConnectionsCopy.addAll(vpnConnections);
        }
        this.vpnConnections = vpnConnectionsCopy;
    }
    
    /**
     * Sets the value of the VpnConnections property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnections The new value for the VpnConnections property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnConnectionsResult withVpnConnections(VpnConnection... vpnConnections) {
        for (VpnConnection value : vpnConnections) {
            getVpnConnections().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the VpnConnections property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnections The new value for the VpnConnections property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnConnectionsResult withVpnConnections(java.util.Collection<VpnConnection> vpnConnections) {
        java.util.List<VpnConnection> vpnConnectionsCopy = new java.util.ArrayList<VpnConnection>();
        if (vpnConnections != null) {
            vpnConnectionsCopy.addAll(vpnConnections);
        }
        this.vpnConnections = vpnConnectionsCopy;

        return this;
    }
    
}
    