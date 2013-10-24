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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;


/**
 * <p>
 * A structure containing a list of virtual private gateways.
 * </p>
 */
public class DescribeVirtualGatewaysResult implements Serializable {

    /**
     * A list of virtual private gateways.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VirtualGateway> virtualGateways;

    /**
     * A list of virtual private gateways.
     *
     * @return A list of virtual private gateways.
     */
    public java.util.List<VirtualGateway> getVirtualGateways() {
        if (virtualGateways == null) {
              virtualGateways = new com.amazonaws.internal.ListWithAutoConstructFlag<VirtualGateway>();
              virtualGateways.setAutoConstruct(true);
        }
        return virtualGateways;
    }
    
    /**
     * A list of virtual private gateways.
     *
     * @param virtualGateways A list of virtual private gateways.
     */
    public void setVirtualGateways(java.util.Collection<VirtualGateway> virtualGateways) {
        if (virtualGateways == null) {
            this.virtualGateways = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VirtualGateway> virtualGatewaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VirtualGateway>(virtualGateways.size());
        virtualGatewaysCopy.addAll(virtualGateways);
        this.virtualGateways = virtualGatewaysCopy;
    }
    
    /**
     * A list of virtual private gateways.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualGateways A list of virtual private gateways.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVirtualGatewaysResult withVirtualGateways(VirtualGateway... virtualGateways) {
        if (getVirtualGateways() == null) setVirtualGateways(new java.util.ArrayList<VirtualGateway>(virtualGateways.length));
        for (VirtualGateway value : virtualGateways) {
            getVirtualGateways().add(value);
        }
        return this;
    }
    
    /**
     * A list of virtual private gateways.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualGateways A list of virtual private gateways.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVirtualGatewaysResult withVirtualGateways(java.util.Collection<VirtualGateway> virtualGateways) {
        if (virtualGateways == null) {
            this.virtualGateways = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VirtualGateway> virtualGatewaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VirtualGateway>(virtualGateways.size());
            virtualGatewaysCopy.addAll(virtualGateways);
            this.virtualGateways = virtualGatewaysCopy;
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
        if (getVirtualGateways() != null) sb.append("VirtualGateways: " + getVirtualGateways() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVirtualGateways() == null) ? 0 : getVirtualGateways().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVirtualGatewaysResult == false) return false;
        DescribeVirtualGatewaysResult other = (DescribeVirtualGatewaysResult)obj;
        
        if (other.getVirtualGateways() == null ^ this.getVirtualGateways() == null) return false;
        if (other.getVirtualGateways() != null && other.getVirtualGateways().equals(this.getVirtualGateways()) == false) return false; 
        return true;
    }
    
}
    