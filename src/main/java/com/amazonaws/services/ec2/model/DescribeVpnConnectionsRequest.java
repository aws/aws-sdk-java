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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Describe Vpn Connections Request
 */
public class DescribeVpnConnectionsRequest extends AmazonWebServiceRequest {

    private java.util.List<String> vpnConnectionIds;

    /**
     * Returns the value of the VpnConnectionIds property for this object.
     *
     * @return The value of the VpnConnectionIds property for this object.
     */
    public java.util.List<String> getVpnConnectionIds() {
        if (vpnConnectionIds == null) {
            vpnConnectionIds = new java.util.ArrayList<String>();
        }
        return vpnConnectionIds;
    }
    
    /**
     * Sets the value of the VpnConnectionIds property for this object.
     *
     * @param vpnConnectionIds The new value for the VpnConnectionIds property for this object.
     */
    public void setVpnConnectionIds(java.util.Collection<String> vpnConnectionIds) {
        java.util.List<String> vpnConnectionIdsCopy = new java.util.ArrayList<String>();
        if (vpnConnectionIds != null) {
            vpnConnectionIdsCopy.addAll(vpnConnectionIds);
        }
        this.vpnConnectionIds = vpnConnectionIdsCopy;
    }
    
    /**
     * Sets the value of the VpnConnectionIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionIds The new value for the VpnConnectionIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnConnectionsRequest withVpnConnectionIds(String... vpnConnectionIds) {
        for (String value : vpnConnectionIds) {
            getVpnConnectionIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the VpnConnectionIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionIds The new value for the VpnConnectionIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpnConnectionsRequest withVpnConnectionIds(java.util.Collection<String> vpnConnectionIds) {
        java.util.List<String> vpnConnectionIdsCopy = new java.util.ArrayList<String>();
        if (vpnConnectionIds != null) {
            vpnConnectionIdsCopy.addAll(vpnConnectionIds);
        }
        this.vpnConnectionIds = vpnConnectionIdsCopy;

        return this;
    }
    
}
    