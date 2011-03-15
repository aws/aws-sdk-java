/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Route Table
 */
public class RouteTable {

    private String routeTableId;

    private String vpcId;

    private java.util.List<Route> routes;

    private java.util.List<RouteTableAssociation> associations;

    private java.util.List<Tag> tags;

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
    public RouteTable withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    
    
    /**
     * Returns the value of the VpcId property for this object.
     *
     * @return The value of the VpcId property for this object.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * Sets the value of the VpcId property for this object.
     *
     * @param vpcId The new value for the VpcId property for this object.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * Sets the value of the VpcId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The new value for the VpcId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RouteTable withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    
    
    /**
     * Returns the value of the Routes property for this object.
     *
     * @return The value of the Routes property for this object.
     */
    public java.util.List<Route> getRoutes() {
        if (routes == null) {
            routes = new java.util.ArrayList<Route>();
        }
        return routes;
    }
    
    /**
     * Sets the value of the Routes property for this object.
     *
     * @param routes The new value for the Routes property for this object.
     */
    public void setRoutes(java.util.Collection<Route> routes) {
        java.util.List<Route> routesCopy = new java.util.ArrayList<Route>();
        if (routes != null) {
            routesCopy.addAll(routes);
        }
        this.routes = routesCopy;
    }
    
    /**
     * Sets the value of the Routes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routes The new value for the Routes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RouteTable withRoutes(Route... routes) {
        for (Route value : routes) {
            getRoutes().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Routes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routes The new value for the Routes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RouteTable withRoutes(java.util.Collection<Route> routes) {
        java.util.List<Route> routesCopy = new java.util.ArrayList<Route>();
        if (routes != null) {
            routesCopy.addAll(routes);
        }
        this.routes = routesCopy;

        return this;
    }
    
    /**
     * Returns the value of the Associations property for this object.
     *
     * @return The value of the Associations property for this object.
     */
    public java.util.List<RouteTableAssociation> getAssociations() {
        if (associations == null) {
            associations = new java.util.ArrayList<RouteTableAssociation>();
        }
        return associations;
    }
    
    /**
     * Sets the value of the Associations property for this object.
     *
     * @param associations The new value for the Associations property for this object.
     */
    public void setAssociations(java.util.Collection<RouteTableAssociation> associations) {
        java.util.List<RouteTableAssociation> associationsCopy = new java.util.ArrayList<RouteTableAssociation>();
        if (associations != null) {
            associationsCopy.addAll(associations);
        }
        this.associations = associationsCopy;
    }
    
    /**
     * Sets the value of the Associations property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associations The new value for the Associations property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RouteTable withAssociations(RouteTableAssociation... associations) {
        for (RouteTableAssociation value : associations) {
            getAssociations().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Associations property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associations The new value for the Associations property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RouteTable withAssociations(java.util.Collection<RouteTableAssociation> associations) {
        java.util.List<RouteTableAssociation> associationsCopy = new java.util.ArrayList<RouteTableAssociation>();
        if (associations != null) {
            associationsCopy.addAll(associations);
        }
        this.associations = associationsCopy;

        return this;
    }
    
    /**
     * Returns the value of the Tags property for this object.
     *
     * @return The value of the Tags property for this object.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     *
     * @param tags The new value for the Tags property for this object.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
        this.tags = tagsCopy;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The new value for the Tags property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RouteTable withTags(Tag... tags) {
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The new value for the Tags property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RouteTable withTags(java.util.Collection<Tag> tags) {
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
        this.tags = tagsCopy;

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
        sb.append("RouteTableId: " + routeTableId + ", ");
        sb.append("VpcId: " + vpcId + ", ");
        sb.append("Routes: " + routes + ", ");
        sb.append("Associations: " + associations + ", ");
        sb.append("Tags: " + tags + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    