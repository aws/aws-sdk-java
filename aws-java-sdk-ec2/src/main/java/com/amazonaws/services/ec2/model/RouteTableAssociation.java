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
 * Describes an association between a route table and a subnet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RouteTableAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteTableAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether this is the main route table.
     * </p>
     */
    private Boolean main;
    /**
     * <p>
     * The ID of the association between a route table and a subnet.
     * </p>
     */
    private String routeTableAssociationId;
    /**
     * <p>
     * The ID of the route table.
     * </p>
     */
    private String routeTableId;
    /**
     * <p>
     * The ID of the subnet. A subnet ID is not returned for an implicit association.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * Indicates whether this is the main route table.
     * </p>
     * 
     * @param main
     *        Indicates whether this is the main route table.
     */

    public void setMain(Boolean main) {
        this.main = main;
    }

    /**
     * <p>
     * Indicates whether this is the main route table.
     * </p>
     * 
     * @return Indicates whether this is the main route table.
     */

    public Boolean getMain() {
        return this.main;
    }

    /**
     * <p>
     * Indicates whether this is the main route table.
     * </p>
     * 
     * @param main
     *        Indicates whether this is the main route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTableAssociation withMain(Boolean main) {
        setMain(main);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the main route table.
     * </p>
     * 
     * @return Indicates whether this is the main route table.
     */

    public Boolean isMain() {
        return this.main;
    }

    /**
     * <p>
     * The ID of the association between a route table and a subnet.
     * </p>
     * 
     * @param routeTableAssociationId
     *        The ID of the association between a route table and a subnet.
     */

    public void setRouteTableAssociationId(String routeTableAssociationId) {
        this.routeTableAssociationId = routeTableAssociationId;
    }

    /**
     * <p>
     * The ID of the association between a route table and a subnet.
     * </p>
     * 
     * @return The ID of the association between a route table and a subnet.
     */

    public String getRouteTableAssociationId() {
        return this.routeTableAssociationId;
    }

    /**
     * <p>
     * The ID of the association between a route table and a subnet.
     * </p>
     * 
     * @param routeTableAssociationId
     *        The ID of the association between a route table and a subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTableAssociation withRouteTableAssociationId(String routeTableAssociationId) {
        setRouteTableAssociationId(routeTableAssociationId);
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

    public RouteTableAssociation withRouteTableId(String routeTableId) {
        setRouteTableId(routeTableId);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet. A subnet ID is not returned for an implicit association.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet. A subnet ID is not returned for an implicit association.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet. A subnet ID is not returned for an implicit association.
     * </p>
     * 
     * @return The ID of the subnet. A subnet ID is not returned for an implicit association.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet. A subnet ID is not returned for an implicit association.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet. A subnet ID is not returned for an implicit association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTableAssociation withSubnetId(String subnetId) {
        setSubnetId(subnetId);
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
        if (getMain() != null)
            sb.append("Main: ").append(getMain()).append(",");
        if (getRouteTableAssociationId() != null)
            sb.append("RouteTableAssociationId: ").append(getRouteTableAssociationId()).append(",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: ").append(getRouteTableId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteTableAssociation == false)
            return false;
        RouteTableAssociation other = (RouteTableAssociation) obj;
        if (other.getMain() == null ^ this.getMain() == null)
            return false;
        if (other.getMain() != null && other.getMain().equals(this.getMain()) == false)
            return false;
        if (other.getRouteTableAssociationId() == null ^ this.getRouteTableAssociationId() == null)
            return false;
        if (other.getRouteTableAssociationId() != null && other.getRouteTableAssociationId().equals(this.getRouteTableAssociationId()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMain() == null) ? 0 : getMain().hashCode());
        hashCode = prime * hashCode + ((getRouteTableAssociationId() == null) ? 0 : getRouteTableAssociationId().hashCode());
        hashCode = prime * hashCode + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public RouteTableAssociation clone() {
        try {
            return (RouteTableAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
