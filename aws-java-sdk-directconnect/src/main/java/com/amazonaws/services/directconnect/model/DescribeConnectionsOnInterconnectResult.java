/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

/**
 * <p>
 * A structure containing a list of connections.
 * </p>
 */
public class DescribeConnectionsOnInterconnectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of connections.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Connection> connections;

    /**
     * <p>
     * A list of connections.
     * </p>
     * 
     * @return A list of connections.
     */

    public java.util.List<Connection> getConnections() {
        if (connections == null) {
            connections = new com.amazonaws.internal.SdkInternalList<Connection>();
        }
        return connections;
    }

    /**
     * <p>
     * A list of connections.
     * </p>
     * 
     * @param connections
     *        A list of connections.
     */

    public void setConnections(java.util.Collection<Connection> connections) {
        if (connections == null) {
            this.connections = null;
            return;
        }

        this.connections = new com.amazonaws.internal.SdkInternalList<Connection>(connections);
    }

    /**
     * <p>
     * A list of connections.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnections(java.util.Collection)} or {@link #withConnections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param connections
     *        A list of connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionsOnInterconnectResult withConnections(Connection... connections) {
        if (this.connections == null) {
            setConnections(new com.amazonaws.internal.SdkInternalList<Connection>(connections.length));
        }
        for (Connection ele : connections) {
            this.connections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of connections.
     * </p>
     * 
     * @param connections
     *        A list of connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectionsOnInterconnectResult withConnections(java.util.Collection<Connection> connections) {
        setConnections(connections);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Connections: " + getConnections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConnectionsOnInterconnectResult == false)
            return false;
        DescribeConnectionsOnInterconnectResult other = (DescribeConnectionsOnInterconnectResult) obj;
        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null && other.getConnections().equals(this.getConnections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectionsOnInterconnectResult clone() {
        try {
            return (DescribeConnectionsOnInterconnectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
