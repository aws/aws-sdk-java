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
 * Create Route Table Result
 */
public class CreateRouteTableResult implements Serializable {

    private RouteTable routeTable;

    /**
     * Returns the value of the RouteTable property for this object.
     *
     * @return The value of the RouteTable property for this object.
     */
    public RouteTable getRouteTable() {
        return routeTable;
    }
    
    /**
     * Sets the value of the RouteTable property for this object.
     *
     * @param routeTable The new value for the RouteTable property for this object.
     */
    public void setRouteTable(RouteTable routeTable) {
        this.routeTable = routeTable;
    }
    
    /**
     * Sets the value of the RouteTable property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTable The new value for the RouteTable property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateRouteTableResult withRouteTable(RouteTable routeTable) {
        this.routeTable = routeTable;
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
        if (getRouteTable() != null) sb.append("RouteTable: " + getRouteTable() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRouteTable() == null) ? 0 : getRouteTable().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateRouteTableResult == false) return false;
        CreateRouteTableResult other = (CreateRouteTableResult)obj;
        
        if (other.getRouteTable() == null ^ this.getRouteTable() == null) return false;
        if (other.getRouteTable() != null && other.getRouteTable().equals(this.getRouteTable()) == false) return false; 
        return true;
    }
    
}
    