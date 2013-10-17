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
public class CreateVpnGatewayResult implements Serializable {

    /**
     * 
     */
    private VpnGateway vpnGateway;

    /**
     * 
     *
     * @return 
     */
    public VpnGateway getVpnGateway() {
        return vpnGateway;
    }
    
    /**
     * 
     *
     * @param vpnGateway 
     */
    public void setVpnGateway(VpnGateway vpnGateway) {
        this.vpnGateway = vpnGateway;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpnGateway 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVpnGatewayResult withVpnGateway(VpnGateway vpnGateway) {
        this.vpnGateway = vpnGateway;
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
        if (getVpnGateway() != null) sb.append("VpnGateway: " + getVpnGateway() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpnGateway() == null) ? 0 : getVpnGateway().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateVpnGatewayResult == false) return false;
        CreateVpnGatewayResult other = (CreateVpnGatewayResult)obj;
        
        if (other.getVpnGateway() == null ^ this.getVpnGateway() == null) return false;
        if (other.getVpnGateway() != null && other.getVpnGateway().equals(this.getVpnGateway()) == false) return false; 
        return true;
    }
    
}
    