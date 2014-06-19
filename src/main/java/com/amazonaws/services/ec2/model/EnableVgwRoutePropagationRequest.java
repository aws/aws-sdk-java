/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#enableVgwRoutePropagation(EnableVgwRoutePropagationRequest) EnableVgwRoutePropagation operation}.
 * <p>
 * Enables a virtual private gateway (VGW) to propagate routes to the
 * routing tables of a VPC.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#enableVgwRoutePropagation(EnableVgwRoutePropagationRequest)
 */
public class EnableVgwRoutePropagationRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the routing table.
     */
    private String routeTableId;

    /**
     * The ID of the virtual private gateway.
     */
    private String gatewayId;

    /**
     * The ID of the routing table.
     *
     * @return The ID of the routing table.
     */
    public String getRouteTableId() {
        return routeTableId;
    }
    
    /**
     * The ID of the routing table.
     *
     * @param routeTableId The ID of the routing table.
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }
    
    /**
     * The ID of the routing table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableId The ID of the routing table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnableVgwRoutePropagationRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * The ID of the virtual private gateway.
     *
     * @return The ID of the virtual private gateway.
     */
    public String getGatewayId() {
        return gatewayId;
    }
    
    /**
     * The ID of the virtual private gateway.
     *
     * @param gatewayId The ID of the virtual private gateway.
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }
    
    /**
     * The ID of the virtual private gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param gatewayId The ID of the virtual private gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnableVgwRoutePropagationRequest withGatewayId(String gatewayId) {
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
        if (getRouteTableId() != null) sb.append("RouteTableId: " + getRouteTableId() + ",");
        if (getGatewayId() != null) sb.append("GatewayId: " + getGatewayId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode()); 
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EnableVgwRoutePropagationRequest == false) return false;
        EnableVgwRoutePropagationRequest other = (EnableVgwRoutePropagationRequest)obj;
        
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null) return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false) return false; 
        if (other.getGatewayId() == null ^ this.getGatewayId() == null) return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false) return false; 
        return true;
    }
    
}
    