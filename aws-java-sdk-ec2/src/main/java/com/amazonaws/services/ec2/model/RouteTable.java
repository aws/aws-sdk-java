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
 * Describes a route table.
 * </p>
 */
public class RouteTable implements Serializable {

    /**
     * The ID of the route table.
     */
    private String routeTableId;

    /**
     * The ID of the VPC.
     */
    private String vpcId;

    /**
     * The routes in the route table.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Route> routes;

    /**
     * The associations between the route table and one or more subnets.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RouteTableAssociation> associations;

    /**
     * Any tags assigned to the route table.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Any virtual private gateway (VGW) propagating routes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PropagatingVgw> propagatingVgws;

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
    public RouteTable withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * The ID of the VPC.
     *
     * @return The ID of the VPC.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC.
     *
     * @param vpcId The ID of the VPC.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RouteTable withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The routes in the route table.
     *
     * @return The routes in the route table.
     */
    public java.util.List<Route> getRoutes() {
        if (routes == null) {
              routes = new com.amazonaws.internal.ListWithAutoConstructFlag<Route>();
              routes.setAutoConstruct(true);
        }
        return routes;
    }
    
    /**
     * The routes in the route table.
     *
     * @param routes The routes in the route table.
     */
    public void setRoutes(java.util.Collection<Route> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Route> routesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Route>(routes.size());
        routesCopy.addAll(routes);
        this.routes = routesCopy;
    }
    
    /**
     * The routes in the route table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routes The routes in the route table.
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
     * The routes in the route table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routes The routes in the route table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RouteTable withRoutes(java.util.Collection<Route> routes) {
        if (routes == null) {
            this.routes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Route> routesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Route>(routes.size());
            routesCopy.addAll(routes);
            this.routes = routesCopy;
        }

        return this;
    }

    /**
     * The associations between the route table and one or more subnets.
     *
     * @return The associations between the route table and one or more subnets.
     */
    public java.util.List<RouteTableAssociation> getAssociations() {
        if (associations == null) {
              associations = new com.amazonaws.internal.ListWithAutoConstructFlag<RouteTableAssociation>();
              associations.setAutoConstruct(true);
        }
        return associations;
    }
    
    /**
     * The associations between the route table and one or more subnets.
     *
     * @param associations The associations between the route table and one or more subnets.
     */
    public void setAssociations(java.util.Collection<RouteTableAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RouteTableAssociation> associationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RouteTableAssociation>(associations.size());
        associationsCopy.addAll(associations);
        this.associations = associationsCopy;
    }
    
    /**
     * The associations between the route table and one or more subnets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associations The associations between the route table and one or more subnets.
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
     * The associations between the route table and one or more subnets.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associations The associations between the route table and one or more subnets.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RouteTable withAssociations(java.util.Collection<RouteTableAssociation> associations) {
        if (associations == null) {
            this.associations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RouteTableAssociation> associationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RouteTableAssociation>(associations.size());
            associationsCopy.addAll(associations);
            this.associations = associationsCopy;
        }

        return this;
    }

    /**
     * Any tags assigned to the route table.
     *
     * @return Any tags assigned to the route table.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the route table.
     *
     * @param tags Any tags assigned to the route table.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * Any tags assigned to the route table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the route table.
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
     * Any tags assigned to the route table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the route table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RouteTable withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * Any virtual private gateway (VGW) propagating routes.
     *
     * @return Any virtual private gateway (VGW) propagating routes.
     */
    public java.util.List<PropagatingVgw> getPropagatingVgws() {
        if (propagatingVgws == null) {
              propagatingVgws = new com.amazonaws.internal.ListWithAutoConstructFlag<PropagatingVgw>();
              propagatingVgws.setAutoConstruct(true);
        }
        return propagatingVgws;
    }
    
    /**
     * Any virtual private gateway (VGW) propagating routes.
     *
     * @param propagatingVgws Any virtual private gateway (VGW) propagating routes.
     */
    public void setPropagatingVgws(java.util.Collection<PropagatingVgw> propagatingVgws) {
        if (propagatingVgws == null) {
            this.propagatingVgws = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PropagatingVgw> propagatingVgwsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PropagatingVgw>(propagatingVgws.size());
        propagatingVgwsCopy.addAll(propagatingVgws);
        this.propagatingVgws = propagatingVgwsCopy;
    }
    
    /**
     * Any virtual private gateway (VGW) propagating routes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param propagatingVgws Any virtual private gateway (VGW) propagating routes.
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
     * Any virtual private gateway (VGW) propagating routes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param propagatingVgws Any virtual private gateway (VGW) propagating routes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RouteTable withPropagatingVgws(java.util.Collection<PropagatingVgw> propagatingVgws) {
        if (propagatingVgws == null) {
            this.propagatingVgws = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PropagatingVgw> propagatingVgwsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PropagatingVgw>(propagatingVgws.size());
            propagatingVgwsCopy.addAll(propagatingVgws);
            this.propagatingVgws = propagatingVgwsCopy;
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
        if (getRouteTableId() != null) sb.append("RouteTableId: " + getRouteTableId() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getRoutes() != null) sb.append("Routes: " + getRoutes() + ",");
        if (getAssociations() != null) sb.append("Associations: " + getAssociations() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getPropagatingVgws() != null) sb.append("PropagatingVgws: " + getPropagatingVgws() );
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
        return true;
    }
    
}
    