/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class DeleteLocalGatewayRouteTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the local gateway route table.
     * </p>
     */
    private LocalGatewayRouteTable localGatewayRouteTable;

    /**
     * <p>
     * Information about the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTable
     *        Information about the local gateway route table.
     */

    public void setLocalGatewayRouteTable(LocalGatewayRouteTable localGatewayRouteTable) {
        this.localGatewayRouteTable = localGatewayRouteTable;
    }

    /**
     * <p>
     * Information about the local gateway route table.
     * </p>
     * 
     * @return Information about the local gateway route table.
     */

    public LocalGatewayRouteTable getLocalGatewayRouteTable() {
        return this.localGatewayRouteTable;
    }

    /**
     * <p>
     * Information about the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTable
     *        Information about the local gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLocalGatewayRouteTableResult withLocalGatewayRouteTable(LocalGatewayRouteTable localGatewayRouteTable) {
        setLocalGatewayRouteTable(localGatewayRouteTable);
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
        if (getLocalGatewayRouteTable() != null)
            sb.append("LocalGatewayRouteTable: ").append(getLocalGatewayRouteTable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLocalGatewayRouteTableResult == false)
            return false;
        DeleteLocalGatewayRouteTableResult other = (DeleteLocalGatewayRouteTableResult) obj;
        if (other.getLocalGatewayRouteTable() == null ^ this.getLocalGatewayRouteTable() == null)
            return false;
        if (other.getLocalGatewayRouteTable() != null && other.getLocalGatewayRouteTable().equals(this.getLocalGatewayRouteTable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalGatewayRouteTable() == null) ? 0 : getLocalGatewayRouteTable().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLocalGatewayRouteTableResult clone() {
        try {
            return (DeleteLocalGatewayRouteTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
