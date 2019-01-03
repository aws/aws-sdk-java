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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringConnections"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcPeeringConnectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Collection of VPC peering connection records that match the request.
     * </p>
     */
    private java.util.List<VpcPeeringConnection> vpcPeeringConnections;

    /**
     * <p>
     * Collection of VPC peering connection records that match the request.
     * </p>
     * 
     * @return Collection of VPC peering connection records that match the request.
     */

    public java.util.List<VpcPeeringConnection> getVpcPeeringConnections() {
        return vpcPeeringConnections;
    }

    /**
     * <p>
     * Collection of VPC peering connection records that match the request.
     * </p>
     * 
     * @param vpcPeeringConnections
     *        Collection of VPC peering connection records that match the request.
     */

    public void setVpcPeeringConnections(java.util.Collection<VpcPeeringConnection> vpcPeeringConnections) {
        if (vpcPeeringConnections == null) {
            this.vpcPeeringConnections = null;
            return;
        }

        this.vpcPeeringConnections = new java.util.ArrayList<VpcPeeringConnection>(vpcPeeringConnections);
    }

    /**
     * <p>
     * Collection of VPC peering connection records that match the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcPeeringConnections(java.util.Collection)} or
     * {@link #withVpcPeeringConnections(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vpcPeeringConnections
     *        Collection of VPC peering connection records that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcPeeringConnectionsResult withVpcPeeringConnections(VpcPeeringConnection... vpcPeeringConnections) {
        if (this.vpcPeeringConnections == null) {
            setVpcPeeringConnections(new java.util.ArrayList<VpcPeeringConnection>(vpcPeeringConnections.length));
        }
        for (VpcPeeringConnection ele : vpcPeeringConnections) {
            this.vpcPeeringConnections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of VPC peering connection records that match the request.
     * </p>
     * 
     * @param vpcPeeringConnections
     *        Collection of VPC peering connection records that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcPeeringConnectionsResult withVpcPeeringConnections(java.util.Collection<VpcPeeringConnection> vpcPeeringConnections) {
        setVpcPeeringConnections(vpcPeeringConnections);
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
        if (getVpcPeeringConnections() != null)
            sb.append("VpcPeeringConnections: ").append(getVpcPeeringConnections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcPeeringConnectionsResult == false)
            return false;
        DescribeVpcPeeringConnectionsResult other = (DescribeVpcPeeringConnectionsResult) obj;
        if (other.getVpcPeeringConnections() == null ^ this.getVpcPeeringConnections() == null)
            return false;
        if (other.getVpcPeeringConnections() != null && other.getVpcPeeringConnections().equals(this.getVpcPeeringConnections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcPeeringConnections() == null) ? 0 : getVpcPeeringConnections().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcPeeringConnectionsResult clone() {
        try {
            return (DescribeVpcPeeringConnectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
