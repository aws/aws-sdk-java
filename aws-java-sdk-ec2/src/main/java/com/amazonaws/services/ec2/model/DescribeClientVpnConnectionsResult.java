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
public class DescribeClientVpnConnectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the active and terminated client connections.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClientVpnConnection> connections;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the active and terminated client connections.
     * </p>
     * 
     * @return Information about the active and terminated client connections.
     */

    public java.util.List<ClientVpnConnection> getConnections() {
        if (connections == null) {
            connections = new com.amazonaws.internal.SdkInternalList<ClientVpnConnection>();
        }
        return connections;
    }

    /**
     * <p>
     * Information about the active and terminated client connections.
     * </p>
     * 
     * @param connections
     *        Information about the active and terminated client connections.
     */

    public void setConnections(java.util.Collection<ClientVpnConnection> connections) {
        if (connections == null) {
            this.connections = null;
            return;
        }

        this.connections = new com.amazonaws.internal.SdkInternalList<ClientVpnConnection>(connections);
    }

    /**
     * <p>
     * Information about the active and terminated client connections.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnections(java.util.Collection)} or {@link #withConnections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param connections
     *        Information about the active and terminated client connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientVpnConnectionsResult withConnections(ClientVpnConnection... connections) {
        if (this.connections == null) {
            setConnections(new com.amazonaws.internal.SdkInternalList<ClientVpnConnection>(connections.length));
        }
        for (ClientVpnConnection ele : connections) {
            this.connections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the active and terminated client connections.
     * </p>
     * 
     * @param connections
     *        Information about the active and terminated client connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClientVpnConnectionsResult withConnections(java.util.Collection<ClientVpnConnection> connections) {
        setConnections(connections);
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

    public DescribeClientVpnConnectionsResult withNextToken(String nextToken) {
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
        if (getConnections() != null)
            sb.append("Connections: ").append(getConnections()).append(",");
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

        if (obj instanceof DescribeClientVpnConnectionsResult == false)
            return false;
        DescribeClientVpnConnectionsResult other = (DescribeClientVpnConnectionsResult) obj;
        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null && other.getConnections().equals(this.getConnections()) == false)
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

        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClientVpnConnectionsResult clone() {
        try {
            return (DescribeClientVpnConnectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
