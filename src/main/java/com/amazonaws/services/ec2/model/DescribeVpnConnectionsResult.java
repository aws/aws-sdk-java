/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * </p>
 */
public class DescribeVpnConnectionsResult implements Serializable {

    /**
     * 
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VpnConnection> vpnConnections;

    /**
     * 
     *
     * @return 
     */
    public java.util.List<VpnConnection> getVpnConnections() {
        if (vpnConnections == null) {
              vpnConnections = new com.amazonaws.internal.ListWithAutoConstructFlag<VpnConnection>();
              vpnConnections.setAutoConstruct(true);
        }
        return vpnConnections;
    }
    
    /**
     * 
     *
     * @param vpnConnections 
     */
    public void setVpnConnections(java.util.Collection<VpnConnection> vpnConnections) {
        if (vpnConnections == null) {
            this.vpnConnections = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VpnConnection> vpnConnectionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpnConnection>(vpnConnections.size());
        vpnConnectionsCopy.addAll(vpnConnections);
        this.vpnConnections = vpnConnectionsCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnections 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVpnConnectionsResult withVpnConnections(VpnConnection... vpnConnections) {
        if (getVpnConnections() == null) setVpnConnections(new java.util.ArrayList<VpnConnection>(vpnConnections.length));
        for (VpnConnection value : vpnConnections) {
            getVpnConnections().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnConnections 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVpnConnectionsResult withVpnConnections(java.util.Collection<VpnConnection> vpnConnections) {
        if (vpnConnections == null) {
            this.vpnConnections = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VpnConnection> vpnConnectionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpnConnection>(vpnConnections.size());
            vpnConnectionsCopy.addAll(vpnConnections);
            this.vpnConnections = vpnConnectionsCopy;
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
        if (getVpnConnections() != null) sb.append("VpnConnections: " + getVpnConnections() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpnConnections() == null) ? 0 : getVpnConnections().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpnConnectionsResult == false) return false;
        DescribeVpnConnectionsResult other = (DescribeVpnConnectionsResult)obj;
        
        if (other.getVpnConnections() == null ^ this.getVpnConnections() == null) return false;
        if (other.getVpnConnections() != null && other.getVpnConnections().equals(this.getVpnConnections()) == false) return false; 
        return true;
    }
    
}
    