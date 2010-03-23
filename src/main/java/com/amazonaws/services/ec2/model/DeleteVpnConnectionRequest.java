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
 * Delete Vpn Connection Request
 */
public class DeleteVpnConnectionRequest extends AmazonWebServiceRequest {
        
    private String vpnConnectionId;

    /**
     * Returns the value of the VpnConnectionId property for this object.
     *
     * @return The value of the VpnConnectionId property for this object.
     */
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }
    
    /**
     * Sets the value of the VpnConnectionId property for this object.
     *
     * @param vpnConnectionId The new value for the VpnConnectionId property for this object.
     */
    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }
    
    /**
     * Sets the value of the VpnConnectionId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionId The new value for the VpnConnectionId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteVpnConnectionRequest withVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    
    
}
    