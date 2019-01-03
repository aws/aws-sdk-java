/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a route table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RouteTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteTable implements Serializable, Cloneable {

    /**
     * <p>
     * The associations between the route table and one or more subnets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RouteTableAssociation> associations;
    /**
     * <p>
     * Any virtual private gateway (VGW) propagating routes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PropagatingVgw> propagatingVgws;
    /**
     * <p>
     * The ID of the route table.
     * </p>
     */
    private String routeTableId;
    /**
     * <p>
     * The routes in the route table.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Route> routes;
    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ID of the AWS account that owns the route table.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The associations between the route table and one or more subnets.
     * </p>
     * 
     * @return The associations between the route table and one or more subnets.
     */

    public java.util.List<RouteTableAssociation> getAssociations() {
        if (associations == null) {
            associations = new com.amazonaws.internal.SdkInternalList<RouteTableAssociation>();
        }
        return associations;
    }

    /**
     * <p>
     * The associations between the route table and one or more subnets.
     * </p>
     * 
     * @param associations
     *        The associations between the route table and one or more subnets.
     */

    public void setAssociations(java.util.Collection<RouteTableAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }

        this.associations = new com.amazonaws.internal.SdkInternalList<RouteTableAssociation>(associations);
    }

    /**
     * <p>
     * The associations between the route table and one or more subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociations(java.util.Collection)} or {@link #withAssociations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param associations
     *        The associations between the route table and one or more subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTable withAssociations(RouteTableAssociation... associations) {
        if (this.associations == null) {
            setAssociations(new com.amazonaws.internal.SdkInternalList<RouteTableAssociation>(associations.length));
        }
        for (RouteTableAssociation ele : associations) {
            this.associations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The associations between the route table and one or more subnets.
     * </p>
     * 
     * @param associations
     *        The associations between the route table and one or more subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTable withAssociations(java.util.Collection<RouteTableAssociation> associations) {
        setAssociations(associations);
        return this;
    }

    /**
     * <p>
     * Any virtual private gateway (VGW) propagating routes.
     * </p>
     * 
     * @return Any virtual private gateway (VGW) propagating routes.
     */

    public java.util.List<PropagatingVgw> getPropagatingVgws() {
        if (propagatingVgws == null) {
            propagatingVgws = new com.amazonaws.internal.SdkInternalList<PropagatingVgw>();
        }
        return propagatingVgws;
    }

    /**
     * <p>
     * Any virtual private gateway (VGW) propagating routes.
     * </p>
     * 
     * @param propagatingVgws
     *        Any virtual private gateway (VGW) propagating routes.
     */

    public void setPropagatingVgws(java.util.Collection<PropagatingVgw> propagatingVgws) {
        if (propagatingVgws == null) {
            this.propagatingVgws = null;
            return;
        }

        this.propagatingVgws = new com.amazonaws.internal.SdkInternalList<PropagatingVgw>(propagatingVgws);
    }

    /**
     * <p>
     * Any virtual private gateway (VGW) propagating routes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropagatingVgws(java.util.Collection)} or {@link #withPropagatingVgws(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param propagatingVgws
     *        Any virtual private gateway (VGW) propagating routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTable withPropagatingVgws(PropagatingVgw... propagatingVgws) {
        if (this.propagatingVgws == null) {
            setPropagatingVgws(new com.amazonaws.internal.SdkInternalList<PropagatingVgw>(propagatingVgws.length));
        }
        for (PropagatingVgw ele : propagatingVgws) {
            this.propagatingVgws.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any virtual private gateway (VGW) propagating routes.
     * </p>
     * 
     * @param propagatingVgws
     *        Any virtual private gateway (VGW) propagating routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTable withPropagatingVgws(java.util.Collection<PropagatingVgw> propagatingVgws) {
        setPropagatingVgws(propagatingVgws);
        return this;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table.
     */

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @return The ID of the route table.
     */

    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTable withRouteTableId(String routeTableId) {
        setRouteTableId(routeTableId);
        return this;
    }

    /**
     * <p>
     * The routes in the route table.
     * </p>
     * 
     * @return The routes in the route table.
     */

    public java.util.List<Route> getRoutes() {
        if (routes == null) {
            routes = new com.amazonaws.internal.SdkInternalList<Route>();
        }
        return routes;
    }

    /**
     * <p>
     * The routes in the route table.
     * </p>
     * 
     * @param routes
     *        The routes in the route table.
     */

    public void setRoutes(java.util.Collection<Route> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }

        this.routes = new com.amazonaws.internal.SdkInternalList<Route>(routes);
    }

    /**
     * <p>
     * The routes in the route table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutes(java.util.Collection)} or {@link #withRoutes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param routes
     *        The routes in the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTable withRoutes(Route... routes) {
        if (this.routes == null) {
            setRoutes(new com.amazonaws.internal.SdkInternalList<Route>(routes.length));
        }
        for (Route ele : routes) {
            this.routes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The routes in the route table.
     * </p>
     * 
     * @param routes
     *        The routes in the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTable withRoutes(java.util.Collection<Route> routes) {
        setRoutes(routes);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     * 
     * @return Any tags assigned to the route table.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the route table.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTable withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTable withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTable withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the route table.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the route table.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the route table.
     * </p>
     * 
     * @return The ID of the AWS account that owns the route table.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the route table.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTable withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAssociations() != null)
            sb.append("Associations: ").append(getAssociations()).append(",");
        if (getPropagatingVgws() != null)
            sb.append("PropagatingVgws: ").append(getPropagatingVgws()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId()).append(",");
        if (getRoutes() != null)
            sb.append("Routes: ").append(getRoutes()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteTable == false)
            return false;
        RouteTable other = (RouteTable) obj;
        if (other.getAssociations() == null ^ this.getAssociations() == null)
            return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false)
            return false;
        if (other.getPropagatingVgws() == null ^ this.getPropagatingVgws() == null)
            return false;
        if (other.getPropagatingVgws() != null && other.getPropagatingVgws().equals(this.getPropagatingVgws()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getRoutes() == null ^ this.getRoutes() == null)
            return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        hashCode = prime * hashCode + ((getPropagatingVgws() == null) ? 0 : getPropagatingVgws().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        return hashCode;
    }

    @Override
    public RouteTable clone() {
        try {
            return (RouteTable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
