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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteVpnConnection(DeleteVpnConnectionRequest) DeleteVpnConnection operation}.
 * <p>
 * Deletes a VPN connection. Use this if you want to delete a VPC and
 * all its associated components. Another reason to use this operation is
 * if you believe the tunnel credentials for your VPN connection have
 * been compromised. In that situation, you can delete the VPN connection
 * and create a new one that has new keys, without needing to delete the
 * VPC or VPN gateway. If you create a new VPN connection, you must
 * reconfigure the customer gateway using the new configuration
 * information returned with the new VPN connection ID.
 * </p>
 * <p>
 * If you're deleting the VPC and all its associated parts, we recommend
 * you detach the VPN gateway from the VPC and delete the VPC before
 * deleting the VPN connection.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteVpnConnection(DeleteVpnConnectionRequest)
 */
public class DeleteVpnConnectionRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the VPN connection to delete
     */
    private String vpnConnectionId;

    /**
     * The ID of the VPN connection to delete
     *
     * @return The ID of the VPN connection to delete
     */
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }
    
    /**
     * The ID of the VPN connection to delete
     *
     * @param vpnConnectionId The ID of the VPN connection to delete
     */
    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }
    
    /**
     * The ID of the VPN connection to delete
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionId The ID of the VPN connection to delete
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteVpnConnectionRequest withVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
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
        sb.append("VpnConnectionId: " + vpnConnectionId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    