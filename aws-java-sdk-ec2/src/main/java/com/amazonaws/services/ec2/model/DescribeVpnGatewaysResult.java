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
 * 
 */
public class DescribeVpnGatewaysResult implements Serializable {

    /**
     * Information about one or more virtual private gateways.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VpnGateway> vpnGateways;

    /**
     * Information about one or more virtual private gateways.
     *
     * @return Information about one or more virtual private gateways.
     */
    public java.util.List<VpnGateway> getVpnGateways() {
        if (vpnGateways == null) {
              vpnGateways = new com.amazonaws.internal.ListWithAutoConstructFlag<VpnGateway>();
              vpnGateways.setAutoConstruct(true);
        }
        return vpnGateways;
    }
    
    /**
     * Information about one or more virtual private gateways.
     *
     * @param vpnGateways Information about one or more virtual private gateways.
     */
    public void setVpnGateways(java.util.Collection<VpnGateway> vpnGateways) {
        if (vpnGateways == null) {
            this.vpnGateways = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VpnGateway> vpnGatewaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpnGateway>(vpnGateways.size());
        vpnGatewaysCopy.addAll(vpnGateways);
        this.vpnGateways = vpnGatewaysCopy;
    }
    
    /**
     * Information about one or more virtual private gateways.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGateways Information about one or more virtual private gateways.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpnGatewaysResult withVpnGateways(VpnGateway... vpnGateways) {
        if (getVpnGateways() == null) setVpnGateways(new java.util.ArrayList<VpnGateway>(vpnGateways.length));
        for (VpnGateway value : vpnGateways) {
            getVpnGateways().add(value);
        }
        return this;
    }
    
    /**
     * Information about one or more virtual private gateways.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGateways Information about one or more virtual private gateways.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpnGatewaysResult withVpnGateways(java.util.Collection<VpnGateway> vpnGateways) {
        if (vpnGateways == null) {
            this.vpnGateways = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VpnGateway> vpnGatewaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpnGateway>(vpnGateways.size());
            vpnGatewaysCopy.addAll(vpnGateways);
            this.vpnGateways = vpnGatewaysCopy;
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
        if (getVpnGateways() != null) sb.append("VpnGateways: " + getVpnGateways() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpnGateways() == null) ? 0 : getVpnGateways().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpnGatewaysResult == false) return false;
        DescribeVpnGatewaysResult other = (DescribeVpnGatewaysResult)obj;
        
        if (other.getVpnGateways() == null ^ this.getVpnGateways() == null) return false;
        if (other.getVpnGateways() != null && other.getVpnGateways().equals(this.getVpnGateways()) == false) return false; 
        return true;
    }
    
}
    