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
 * Describe Route Tables Result
 */
public class DescribeRouteTablesResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<RouteTable> routeTables;

    /**
     * Returns the value of the RouteTables property for this object.
     *
     * @return The value of the RouteTables property for this object.
     */
    public java.util.List<RouteTable> getRouteTables() {
        if (routeTables == null) {
              routeTables = new com.amazonaws.internal.ListWithAutoConstructFlag<RouteTable>();
              routeTables.setAutoConstruct(true);
        }
        return routeTables;
    }
    
    /**
     * Sets the value of the RouteTables property for this object.
     *
     * @param routeTables The new value for the RouteTables property for this object.
     */
    public void setRouteTables(java.util.Collection<RouteTable> routeTables) {
        if (routeTables == null) {
            this.routeTables = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RouteTable> routeTablesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RouteTable>(routeTables.size());
        routeTablesCopy.addAll(routeTables);
        this.routeTables = routeTablesCopy;
    }
    
    /**
     * Sets the value of the RouteTables property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTables The new value for the RouteTables property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeRouteTablesResult withRouteTables(RouteTable... routeTables) {
        if (getRouteTables() == null) setRouteTables(new java.util.ArrayList<RouteTable>(routeTables.length));
        for (RouteTable value : routeTables) {
            getRouteTables().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the RouteTables property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTables The new value for the RouteTables property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeRouteTablesResult withRouteTables(java.util.Collection<RouteTable> routeTables) {
        if (routeTables == null) {
            this.routeTables = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RouteTable> routeTablesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RouteTable>(routeTables.size());
            routeTablesCopy.addAll(routeTables);
            this.routeTables = routeTablesCopy;
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
        if (getRouteTables() != null) sb.append("RouteTables: " + getRouteTables() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRouteTables() == null) ? 0 : getRouteTables().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeRouteTablesResult == false) return false;
        DescribeRouteTablesResult other = (DescribeRouteTablesResult)obj;
        
        if (other.getRouteTables() == null ^ this.getRouteTables() == null) return false;
        if (other.getRouteTables() != null && other.getRouteTables().equals(this.getRouteTables()) == false) return false; 
        return true;
    }
    
}
    