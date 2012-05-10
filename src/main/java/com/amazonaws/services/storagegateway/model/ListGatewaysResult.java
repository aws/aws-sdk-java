/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * <ul>
 * <li> ListGatewaysOutput$Gateways </li>
 * <li> ListGatewaysOutput$Marker </li>
 * 
 * </ul>
 */
public class ListGatewaysResult {

    /**
     * An array of <a>GatewayInfo</a> objects.
     */
    private java.util.List<GatewayInfo> gateways;

    /**
     * Use the marker in your next request to fetch the next set of gateways
     * in the list. If there are no more gateways to list, this field does
     * not appear in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * An array of <a>GatewayInfo</a> objects.
     *
     * @return An array of <a>GatewayInfo</a> objects.
     */
    public java.util.List<GatewayInfo> getGateways() {
        
        if (gateways == null) {
            gateways = new java.util.ArrayList<GatewayInfo>();
        }
        return gateways;
    }
    
    /**
     * An array of <a>GatewayInfo</a> objects.
     *
     * @param gateways An array of <a>GatewayInfo</a> objects.
     */
    public void setGateways(java.util.Collection<GatewayInfo> gateways) {
        if (gateways == null) {
            this.gateways = null;
            return;
        }

        java.util.List<GatewayInfo> gatewaysCopy = new java.util.ArrayList<GatewayInfo>(gateways.size());
        gatewaysCopy.addAll(gateways);
        this.gateways = gatewaysCopy;
    }
    
    /**
     * An array of <a>GatewayInfo</a> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gateways An array of <a>GatewayInfo</a> objects.
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
     * An array of <a>GatewayInfo</a> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gateways An array of <a>GatewayInfo</a> objects.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListGatewaysResult withGateways(java.util.Collection<GatewayInfo> gateways) {
        if (gateways == null) {
            this.gateways = null;
        } else {
            java.util.List<GatewayInfo> gatewaysCopy = new java.util.ArrayList<GatewayInfo>(gateways.size());
            gatewaysCopy.addAll(gateways);
            this.gateways = gatewaysCopy;
        }

        return this;
    }
    
    /**
     * Use the marker in your next request to fetch the next set of gateways
     * in the list. If there are no more gateways to list, this field does
     * not appear in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return Use the marker in your next request to fetch the next set of gateways
     *         in the list. If there are no more gateways to list, this field does
     *         not appear in the response.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use the marker in your next request to fetch the next set of gateways
     * in the list. If there are no more gateways to list, this field does
     * not appear in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker Use the marker in your next request to fetch the next set of gateways
     *         in the list. If there are no more gateways to list, this field does
     *         not appear in the response.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use the marker in your next request to fetch the next set of gateways
     * in the list. If there are no more gateways to list, this field does
     * not appear in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker Use the marker in your next request to fetch the next set of gateways
     *         in the list. If there are no more gateways to list, this field does
     *         not appear in the response.
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
        if (gateways != null) sb.append("Gateways: " + gateways + ", ");
        if (marker != null) sb.append("Marker: " + marker + ", ");
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
    