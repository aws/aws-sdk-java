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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;


/**
 * List Gateways Result
 */
public class ListGatewaysResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<GatewayInfo> gateways;

    private String marker;

    /**
     * Returns the value of the Gateways property for this object.
     *
     * @return The value of the Gateways property for this object.
     */
    public java.util.List<GatewayInfo> getGateways() {
        if (gateways == null) {
              gateways = new com.amazonaws.internal.ListWithAutoConstructFlag<GatewayInfo>();
              gateways.setAutoConstruct(true);
        }
        return gateways;
    }
    
    /**
     * Sets the value of the Gateways property for this object.
     *
     * @param gateways The new value for the Gateways property for this object.
     */
    public void setGateways(java.util.Collection<GatewayInfo> gateways) {
        if (gateways == null) {
            this.gateways = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<GatewayInfo> gatewaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GatewayInfo>(gateways.size());
        gatewaysCopy.addAll(gateways);
        this.gateways = gatewaysCopy;
    }
    
    /**
     * Sets the value of the Gateways property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gateways The new value for the Gateways property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListGatewaysResult withGateways(GatewayInfo... gateways) {
        if (getGateways() == null) setGateways(new java.util.ArrayList<GatewayInfo>(gateways.length));
        for (GatewayInfo value : gateways) {
            getGateways().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Gateways property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gateways The new value for the Gateways property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListGatewaysResult withGateways(java.util.Collection<GatewayInfo> gateways) {
        if (gateways == null) {
            this.gateways = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<GatewayInfo> gatewaysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GatewayInfo>(gateways.size());
            gatewaysCopy.addAll(gateways);
            this.gateways = gatewaysCopy;
        }

        return this;
    }

    /**
     * Returns the value of the Marker property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return The value of the Marker property for this object.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker The new value for the Marker property for this object.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker The new value for the Marker property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListGatewaysResult withMarker(String marker) {
        this.marker = marker;
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
        if (getGateways() != null) sb.append("Gateways: " + getGateways() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGateways() == null) ? 0 : getGateways().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListGatewaysResult == false) return false;
        ListGatewaysResult other = (ListGatewaysResult)obj;
        
        if (other.getGateways() == null ^ this.getGateways() == null) return false;
        if (other.getGateways() != null && other.getGateways().equals(this.getGateways()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    