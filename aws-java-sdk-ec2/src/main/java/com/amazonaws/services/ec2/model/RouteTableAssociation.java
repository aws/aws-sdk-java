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
 * <p>
 * Describes an association between a route table and a subnet.
 * </p>
 */
public class RouteTableAssociation implements Serializable {

    /**
     * The ID of the association between a route table and a subnet.
     */
    private String routeTableAssociationId;

    /**
     * The ID of the route table.
     */
    private String routeTableId;

    /**
     * The ID of the subnet.
     */
    private String subnetId;

    /**
     * Indicates whether this is the main route table.
     */
    private Boolean main;

    /**
     * The ID of the association between a route table and a subnet.
     *
     * @return The ID of the association between a route table and a subnet.
     */
    public String getRouteTableAssociationId() {
        return routeTableAssociationId;
    }
    
    /**
     * The ID of the association between a route table and a subnet.
     *
     * @param routeTableAssociationId The ID of the association between a route table and a subnet.
     */
    public void setRouteTableAssociationId(String routeTableAssociationId) {
        this.routeTableAssociationId = routeTableAssociationId;
    }
    
    /**
     * The ID of the association between a route table and a subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableAssociationId The ID of the association between a route table and a subnet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RouteTableAssociation withRouteTableAssociationId(String routeTableAssociationId) {
        this.routeTableAssociationId = routeTableAssociationId;
        return this;
    }

    /**
     * The ID of the route table.
     *
     * @return The ID of the route table.
     */
    public String getRouteTableId() {
        return routeTableId;
    }
    
    /**
     * The ID of the route table.
     *
     * @param routeTableId The ID of the route table.
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }
    
    /**
     * The ID of the route table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableId The ID of the route table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RouteTableAssociation withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * The ID of the subnet.
     *
     * @return The ID of the subnet.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The ID of the subnet.
     *
     * @param subnetId The ID of the subnet.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The ID of the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The ID of the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RouteTableAssociation withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Indicates whether this is the main route table.
     *
     * @return Indicates whether this is the main route table.
     */
    public Boolean isMain() {
        return main;
    }
    
    /**
     * Indicates whether this is the main route table.
     *
     * @param main Indicates whether this is the main route table.
     */
    public void setMain(Boolean main) {
        this.main = main;
    }
    
    /**
     * Indicates whether this is the main route table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param main Indicates whether this is the main route table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RouteTableAssociation withMain(Boolean main) {
        this.main = main;
        return this;
    }

    /**
     * Indicates whether this is the main route table.
     *
     * @return Indicates whether this is the main route table.
     */
    public Boolean getMain() {
        return main;
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
        if (getRouteTableAssociationId() != null) sb.append("RouteTableAssociationId: " + getRouteTableAssociationId() + ",");
        if (getRouteTableId() != null) sb.append("RouteTableId: " + getRouteTableId() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (isMain() != null) sb.append("Main: " + isMain() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRouteTableAssociationId() == null) ? 0 : getRouteTableAssociationId().hashCode()); 
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((isMain() == null) ? 0 : isMain().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RouteTableAssociation == false) return false;
        RouteTableAssociation other = (RouteTableAssociation)obj;
        
        if (other.getRouteTableAssociationId() == null ^ this.getRouteTableAssociationId() == null) return false;
        if (other.getRouteTableAssociationId() != null && other.getRouteTableAssociationId().equals(this.getRouteTableAssociationId()) == false) return false; 
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null) return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.isMain() == null ^ this.isMain() == null) return false;
        if (other.isMain() != null && other.isMain().equals(this.isMain()) == false) return false; 
        return true;
    }
    
}
    