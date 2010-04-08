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
 * <p>
 * 
 * </p>
 */
public class DescribeVpnConnectionsRequest extends AmazonWebServiceRequest {

    /**
     * A VPN connection ID. More than one may be specified per request.
     */
    private java.util.List<String> vpnConnectionIds;

    /**
     * A VPN connection ID. More than one may be specified per request.
     *
     * @return A VPN connection ID. More than one may be specified per request.
     */
    public java.util.List<String> getVpnConnectionIds() {
        if (vpnConnectionIds == null) {
            vpnConnectionIds = new java.util.ArrayList<String>();
        }
        return vpnConnectionIds;
    }
    
    /**
     * A VPN connection ID. More than one may be specified per request.
     *
     * @param vpnConnectionIds A VPN connection ID. More than one may be specified per request.
     */
    public void setVpnConnectionIds(java.util.Collection<String> vpnConnectionIds) {
        java.util.List<String> vpnConnectionIdsCopy = new java.util.ArrayList<String>();
        if (vpnConnectionIds != null) {
            vpnConnectionIdsCopy.addAll(vpnConnectionIds);
        }
        this.vpnConnectionIds = vpnConnectionIdsCopy;
    }
    
    /**
     * A VPN connection ID. More than one may be specified per request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionIds A VPN connection ID. More than one may be specified per request.
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
     * A VPN connection ID. More than one may be specified per request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnectionIds A VPN connection ID. More than one may be specified per request.
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("VpnConnectionIds: " + vpnConnectionIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    