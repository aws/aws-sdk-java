/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/ListConnections"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConnectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of connections and the details for each connection, such as status, owner, and provider type.
     * </p>
     */
    private java.util.List<Connection> connections;
    /**
     * <p>
     * A token that can be used in the next <code>ListConnections</code> call. To view all items in the list, continue
     * to call this operation with each subsequent token until no more <code>nextToken</code> values are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of connections and the details for each connection, such as status, owner, and provider type.
     * </p>
     * 
     * @return A list of connections and the details for each connection, such as status, owner, and provider type.
     */

    public java.util.List<Connection> getConnections() {
        return connections;
    }

    /**
     * <p>
     * A list of connections and the details for each connection, such as status, owner, and provider type.
     * </p>
     * 
     * @param connections
     *        A list of connections and the details for each connection, such as status, owner, and provider type.
     */

    public void setConnections(java.util.Collection<Connection> connections) {
        if (connections == null) {
            this.connections = null;
            return;
        }

        this.connections = new java.util.ArrayList<Connection>(connections);
    }

    /**
     * <p>
     * A list of connections and the details for each connection, such as status, owner, and provider type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnections(java.util.Collection)} or {@link #withConnections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param connections
     *        A list of connections and the details for each connection, such as status, owner, and provider type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectionsResult withConnections(Connection... connections) {
        if (this.connections == null) {
            setConnections(new java.util.ArrayList<Connection>(connections.length));
        }
        for (Connection ele : connections) {
            this.connections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of connections and the details for each connection, such as status, owner, and provider type.
     * </p>
     * 
     * @param connections
     *        A list of connections and the details for each connection, such as status, owner, and provider type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectionsResult withConnections(java.util.Collection<Connection> connections) {
        setConnections(connections);
        return this;
    }

    /**
     * <p>
     * A token that can be used in the next <code>ListConnections</code> call. To view all items in the list, continue
     * to call this operation with each subsequent token until no more <code>nextToken</code> values are returned.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used in the next <code>ListConnections</code> call. To view all items in the list,
     *        continue to call this operation with each subsequent token until no more <code>nextToken</code> values are
     *        returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used in the next <code>ListConnections</code> call. To view all items in the list, continue
     * to call this operation with each subsequent token until no more <code>nextToken</code> values are returned.
     * </p>
     * 
     * @return A token that can be used in the next <code>ListConnections</code> call. To view all items in the list,
     *         continue to call this operation with each subsequent token until no more <code>nextToken</code> values
     *         are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that can be used in the next <code>ListConnections</code> call. To view all items in the list, continue
     * to call this operation with each subsequent token until no more <code>nextToken</code> values are returned.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used in the next <code>ListConnections</code> call. To view all items in the list,
     *        continue to call this operation with each subsequent token until no more <code>nextToken</code> values are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectionsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListConnectionsResult == false)
            return false;
        ListConnectionsResult other = (ListConnectionsResult) obj;
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
    public ListConnectionsResult clone() {
        try {
            return (ListConnectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
