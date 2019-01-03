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
public class DescribeVpcEndpointConnectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about one or more VPC endpoint connections.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpcEndpointConnection> vpcEndpointConnections;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about one or more VPC endpoint connections.
     * </p>
     * 
     * @return Information about one or more VPC endpoint connections.
     */

    public java.util.List<VpcEndpointConnection> getVpcEndpointConnections() {
        if (vpcEndpointConnections == null) {
            vpcEndpointConnections = new com.amazonaws.internal.SdkInternalList<VpcEndpointConnection>();
        }
        return vpcEndpointConnections;
    }

    /**
     * <p>
     * Information about one or more VPC endpoint connections.
     * </p>
     * 
     * @param vpcEndpointConnections
     *        Information about one or more VPC endpoint connections.
     */

    public void setVpcEndpointConnections(java.util.Collection<VpcEndpointConnection> vpcEndpointConnections) {
        if (vpcEndpointConnections == null) {
            this.vpcEndpointConnections = null;
            return;
        }

        this.vpcEndpointConnections = new com.amazonaws.internal.SdkInternalList<VpcEndpointConnection>(vpcEndpointConnections);
    }

    /**
     * <p>
     * Information about one or more VPC endpoint connections.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcEndpointConnections(java.util.Collection)} or
     * {@link #withVpcEndpointConnections(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vpcEndpointConnections
     *        Information about one or more VPC endpoint connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointConnectionsResult withVpcEndpointConnections(VpcEndpointConnection... vpcEndpointConnections) {
        if (this.vpcEndpointConnections == null) {
            setVpcEndpointConnections(new com.amazonaws.internal.SdkInternalList<VpcEndpointConnection>(vpcEndpointConnections.length));
        }
        for (VpcEndpointConnection ele : vpcEndpointConnections) {
            this.vpcEndpointConnections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more VPC endpoint connections.
     * </p>
     * 
     * @param vpcEndpointConnections
     *        Information about one or more VPC endpoint connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointConnectionsResult withVpcEndpointConnections(java.util.Collection<VpcEndpointConnection> vpcEndpointConnections) {
        setVpcEndpointConnections(vpcEndpointConnections);
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

    public DescribeVpcEndpointConnectionsResult withNextToken(String nextToken) {
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
        if (getVpcEndpointConnections() != null)
            sb.append("VpcEndpointConnections: ").append(getVpcEndpointConnections()).append(",");
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

        if (obj instanceof DescribeVpcEndpointConnectionsResult == false)
            return false;
        DescribeVpcEndpointConnectionsResult other = (DescribeVpcEndpointConnectionsResult) obj;
        if (other.getVpcEndpointConnections() == null ^ this.getVpcEndpointConnections() == null)
            return false;
        if (other.getVpcEndpointConnections() != null && other.getVpcEndpointConnections().equals(this.getVpcEndpointConnections()) == false)
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

        hashCode = prime * hashCode + ((getVpcEndpointConnections() == null) ? 0 : getVpcEndpointConnections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcEndpointConnectionsResult clone() {
        try {
            return (DescribeVpcEndpointConnectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
