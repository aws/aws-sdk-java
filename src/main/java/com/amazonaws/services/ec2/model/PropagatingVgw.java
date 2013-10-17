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
 * Propagating Vgw
 */
public class PropagatingVgw implements Serializable {

    private String gatewayId;

    /**
     * Returns the value of the GatewayId property for this object.
     *
     * @return The value of the GatewayId property for this object.
     */
    public String getGatewayId() {
        return gatewayId;
    }
    
    /**
     * Sets the value of the GatewayId property for this object.
     *
     * @param gatewayId The new value for the GatewayId property for this object.
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }
    
    /**
     * Sets the value of the GatewayId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gatewayId The new value for the GatewayId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PropagatingVgw withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
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
        if (getGatewayId() != null) sb.append("GatewayId: " + getGatewayId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PropagatingVgw == false) return false;
        PropagatingVgw other = (PropagatingVgw)obj;
        
        if (other.getGatewayId() == null ^ this.getGatewayId() == null) return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false) return false; 
        return true;
    }
    
}
    