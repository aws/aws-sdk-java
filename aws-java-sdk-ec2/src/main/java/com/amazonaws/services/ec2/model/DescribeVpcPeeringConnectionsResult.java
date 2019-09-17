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
public class DescribeVpcPeeringConnectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the VPC peering connections.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpcPeeringConnection> vpcPeeringConnections;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the VPC peering connections.
     * </p>
     * 
     * @return Information about the VPC peering connections.
     */

    public java.util.List<VpcPeeringConnection> getVpcPeeringConnections() {
        if (vpcPeeringConnections == null) {
            vpcPeeringConnections = new com.amazonaws.internal.SdkInternalList<VpcPeeringConnection>();
        }
        return vpcPeeringConnections;
    }

    /**
     * <p>
     * Information about the VPC peering connections.
     * </p>
     * 
     * @param vpcPeeringConnections
     *        Information about the VPC peering connections.
     */

    public void setVpcPeeringConnections(java.util.Collection<VpcPeeringConnection> vpcPeeringConnections) {
        if (vpcPeeringConnections == null) {
            this.vpcPeeringConnections = null;
            return;
        }

        this.vpcPeeringConnections = new com.amazonaws.internal.SdkInternalList<VpcPeeringConnection>(vpcPeeringConnections);
    }

    /**
     * <p>
     * Information about the VPC peering connections.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcPeeringConnections(java.util.Collection)} or
     * {@link #withVpcPeeringConnections(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vpcPeeringConnections
     *        Information about the VPC peering connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcPeeringConnectionsResult withVpcPeeringConnections(VpcPeeringConnection... vpcPeeringConnections) {
        if (this.vpcPeeringConnections == null) {
            setVpcPeeringConnections(new com.amazonaws.internal.SdkInternalList<VpcPeeringConnection>(vpcPeeringConnections.length));
        }
        for (VpcPeeringConnection ele : vpcPeeringConnections) {
            this.vpcPeeringConnections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the VPC peering connections.
     * </p>
     * 
     * @param vpcPeeringConnections
     *        Information about the VPC peering connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcPeeringConnectionsResult withVpcPeeringConnections(java.util.Collection<VpcPeeringConnection> vpcPeeringConnections) {
        setVpcPeeringConnections(vpcPeeringConnections);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcPeeringConnectionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
            sb.append("VpcPeeringConnections: ").append(getVpcPeeringConnections()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcPeeringConnections() == null) ? 0 : getVpcPeeringConnections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
