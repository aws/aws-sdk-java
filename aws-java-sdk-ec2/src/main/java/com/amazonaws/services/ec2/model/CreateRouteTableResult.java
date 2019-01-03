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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRouteTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the route table.
     * </p>
     */
    private RouteTable routeTable;

    /**
     * <p>
     * Information about the route table.
     * </p>
     * 
     * @param routeTable
     *        Information about the route table.
     */

    public void setRouteTable(RouteTable routeTable) {
        this.routeTable = routeTable;
    }

    /**
     * <p>
     * Information about the route table.
     * </p>
     * 
     * @return Information about the route table.
     */

    public RouteTable getRouteTable() {
        return this.routeTable;
    }

    /**
     * <p>
     * Information about the route table.
     * </p>
     * 
     * @param routeTable
     *        Information about the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteTableResult withRouteTable(RouteTable routeTable) {
        setRouteTable(routeTable);
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
        if (getRouteTable() != null)
            sb.append("RouteTable: ").append(getRouteTable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRouteTableResult == false)
            return false;
        CreateRouteTableResult other = (CreateRouteTableResult) obj;
        if (other.getRouteTable() == null ^ this.getRouteTable() == null)
            return false;
        if (other.getRouteTable() != null && other.getRouteTable().equals(this.getRouteTable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRouteTable() == null) ? 0 : getRouteTable().hashCode());
        return hashCode;
    }

    @Override
    public CreateRouteTableResult clone() {
        try {
            return (CreateRouteTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
