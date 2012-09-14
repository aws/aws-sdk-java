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

    private java.util.List<PropagatingVgw> propagatingVgws;

    private java.util.List<PropagatedRoute> propagatedRoutes;

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
        if (routes == null) {
            this.routes = null;
            return;
        }

        java.util.List<Route> routesCopy = new java.util.ArrayList<Route>(routes.size());
        routesCopy.addAll(routes);
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
        if (getRoutes() == null) setRoutes(new java.util.ArrayList<Route>(routes.length));
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
        if (routes == null) {
            this.routes = null;
        } else {
            java.util.List<Route> routesCopy = new java.util.ArrayList<Route>(routes.size());
            routesCopy.addAll(routes);
            this.routes = routesCopy;
        }

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
        if (associations == null) {
            this.associations = null;
            return;
        }

        java.util.List<RouteTableAssociation> associationsCopy = new java.util.ArrayList<RouteTableAssociation>(associations.size());
        associationsCopy.addAll(associations);
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
        if (getAssociations() == null) setAssociations(new java.util.ArrayList<RouteTableAssociation>(associations.length));
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
        if (associations == null) {
            this.associations = null;
        } else {
            java.util.List<RouteTableAssociation> associationsCopy = new java.util.ArrayList<RouteTableAssociation>(associations.size());
            associationsCopy.addAll(associations);
            this.associations = associationsCopy;
        }

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
        if (tags == null) {
            this.tags = null;
            return;
        }

        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
        tagsCopy.addAll(tags);
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
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
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
        if (tags == null) {
            this.tags = null;
        } else {
            java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the PropagatingVgws property for this object.
     *
     * @return The value of the PropagatingVgws property for this object.
     */
    public java.util.List<PropagatingVgw> getPropagatingVgws() {
        
        if (propagatingVgws == null) {
            propagatingVgws = new java.util.ArrayList<PropagatingVgw>();
        }
        return propagatingVgws;
    }
    
    /**
     * Sets the value of the PropagatingVgws property for this object.
     *
     * @param propagatingVgws The new value for the PropagatingVgws property for this object.
     */
    public void setPropagatingVgws(java.util.Collection<PropagatingVgw> propagatingVgws) {
        if (propagatingVgws == null) {
            this.propagatingVgws = null;
            return;
        }

        java.util.List<PropagatingVgw> propagatingVgwsCopy = new java.util.ArrayList<PropagatingVgw>(propagatingVgws.size());
        propagatingVgwsCopy.addAll(propagatingVgws);
        this.propagatingVgws = propagatingVgwsCopy;
    }
    
    /**
     * Sets the value of the PropagatingVgws property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param propagatingVgws The new value for the PropagatingVgws property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RouteTable withPropagatingVgws(PropagatingVgw... propagatingVgws) {
        if (getPropagatingVgws() == null) setPropagatingVgws(new java.util.ArrayList<PropagatingVgw>(propagatingVgws.length));
        for (PropagatingVgw value : propagatingVgws) {
            getPropagatingVgws().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the PropagatingVgws property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param propagatingVgws The new value for the PropagatingVgws property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RouteTable withPropagatingVgws(java.util.Collection<PropagatingVgw> propagatingVgws) {
        if (propagatingVgws == null) {
            this.propagatingVgws = null;
        } else {
            java.util.List<PropagatingVgw> propagatingVgwsCopy = new java.util.ArrayList<PropagatingVgw>(propagatingVgws.size());
            propagatingVgwsCopy.addAll(propagatingVgws);
            this.propagatingVgws = propagatingVgwsCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the PropagatedRoutes property for this object.
     *
     * @return The value of the PropagatedRoutes property for this object.
     */
    public java.util.List<PropagatedRoute> getPropagatedRoutes() {
        
        if (propagatedRoutes == null) {
            propagatedRoutes = new java.util.ArrayList<PropagatedRoute>();
        }
        return propagatedRoutes;
    }
    
    /**
     * Sets the value of the PropagatedRoutes property for this object.
     *
     * @param propagatedRoutes The new value for the PropagatedRoutes property for this object.
     */
    public void setPropagatedRoutes(java.util.Collection<PropagatedRoute> propagatedRoutes) {
        if (propagatedRoutes == null) {
            this.propagatedRoutes = null;
            return;
        }

        java.util.List<PropagatedRoute> propagatedRoutesCopy = new java.util.ArrayList<PropagatedRoute>(propagatedRoutes.size());
        propagatedRoutesCopy.addAll(propagatedRoutes);
        this.propagatedRoutes = propagatedRoutesCopy;
    }
    
    /**
     * Sets the value of the PropagatedRoutes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param propagatedRoutes The new value for the PropagatedRoutes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RouteTable withPropagatedRoutes(PropagatedRoute... propagatedRoutes) {
        if (getPropagatedRoutes() == null) setPropagatedRoutes(new java.util.ArrayList<PropagatedRoute>(propagatedRoutes.length));
        for (PropagatedRoute value : propagatedRoutes) {
            getPropagatedRoutes().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the PropagatedRoutes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param propagatedRoutes The new value for the PropagatedRoutes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RouteTable withPropagatedRoutes(java.util.Collection<PropagatedRoute> propagatedRoutes) {
        if (propagatedRoutes == null) {
            this.propagatedRoutes = null;
        } else {
            java.util.List<PropagatedRoute> propagatedRoutesCopy = new java.util.ArrayList<PropagatedRoute>(propagatedRoutes.size());
            propagatedRoutesCopy.addAll(propagatedRoutes);
            this.propagatedRoutes = propagatedRoutesCopy;
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
        if (routeTableId != null) sb.append("RouteTableId: " + routeTableId + ", ");
        if (vpcId != null) sb.append("VpcId: " + vpcId + ", ");
        if (routes != null) sb.append("Routes: " + routes + ", ");
        if (associations != null) sb.append("Associations: " + associations + ", ");
        if (tags != null) sb.append("Tags: " + tags + ", ");
        if (propagatingVgws != null) sb.append("PropagatingVgws: " + propagatingVgws + ", ");
        if (propagatedRoutes != null) sb.append("PropagatedRoutes: " + propagatedRoutes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode()); 
        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getPropagatingVgws() == null) ? 0 : getPropagatingVgws().hashCode()); 
        hashCode = prime * hashCode + ((getPropagatedRoutes() == null) ? 0 : getPropagatedRoutes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof RouteTable == false) return false;
        RouteTable other = (RouteTable)obj;
        
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null) return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getRoutes() == null ^ this.getRoutes() == null) return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false) return false; 
        if (other.getAssociations() == null ^ this.getAssociations() == null) return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getPropagatingVgws() == null ^ this.getPropagatingVgws() == null) return false;
        if (other.getPropagatingVgws() != null && other.getPropagatingVgws().equals(this.getPropagatingVgws()) == false) return false; 
        if (other.getPropagatedRoutes() == null ^ this.getPropagatedRoutes() == null) return false;
        if (other.getPropagatedRoutes() != null && other.getPropagatedRoutes().equals(this.getPropagatedRoutes()) == false) return false; 
        return true;
    }
    
}
    