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
 * Route Table Association
 */
public class RouteTableAssociation implements Serializable {

    private String routeTableAssociationId;

    private String routeTableId;

    private String subnetId;

    private Boolean main;

    /**
     * Returns the value of the RouteTableAssociationId property for this
     * object.
     *
     * @return The value of the RouteTableAssociationId property for this object.
     */
    public String getRouteTableAssociationId() {
        return routeTableAssociationId;
    }
    
    /**
     * Sets the value of the RouteTableAssociationId property for this
     * object.
     *
     * @param routeTableAssociationId The new value for the RouteTableAssociationId property for this
     *         object.
     */
    public void setRouteTableAssociationId(String routeTableAssociationId) {
        this.routeTableAssociationId = routeTableAssociationId;
    }
    
    /**
     * Sets the value of the RouteTableAssociationId property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableAssociationId The new value for the RouteTableAssociationId property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RouteTableAssociation withRouteTableAssociationId(String routeTableAssociationId) {
        this.routeTableAssociationId = routeTableAssociationId;
        return this;
    }

    /**
     * Returns the value of the RouteTableId property for this object.
     *
     * @return The value of the RouteTableId property for this object.
     */
    public String getRouteTableId() {
        return routeTableId;
    }
    
    /**
     * Sets the value of the RouteTableId property for this object.
     *
     * @param routeTableId The new value for the RouteTableId property for this object.
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }
    
    /**
     * Sets the value of the RouteTableId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableId The new value for the RouteTableId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RouteTableAssociation withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * Returns the value of the SubnetId property for this object.
     *
     * @return The value of the SubnetId property for this object.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * Sets the value of the SubnetId property for this object.
     *
     * @param subnetId The new value for the SubnetId property for this object.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * Sets the value of the SubnetId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The new value for the SubnetId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RouteTableAssociation withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Returns the value of the Main property for this object.
     *
     * @return The value of the Main property for this object.
     */
    public Boolean isMain() {
        return main;
    }
    
    /**
     * Sets the value of the Main property for this object.
     *
     * @param main The new value for the Main property for this object.
     */
    public void setMain(Boolean main) {
        this.main = main;
    }
    
    /**
     * Sets the value of the Main property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param main The new value for the Main property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RouteTableAssociation withMain(Boolean main) {
        this.main = main;
        return this;
    }

    /**
     * Returns the value of the Main property for this object.
     *
     * @return The value of the Main property for this object.
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
    