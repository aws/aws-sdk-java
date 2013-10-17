/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;


/**
 * <p>
 * A structure containing a list of connections.
 * </p>
 */
public class DescribeConnectionsResult implements Serializable {

    /**
     * A list of connections.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Connection> connections;

    /**
     * A list of connections.
     *
     * @return A list of connections.
     */
    public java.util.List<Connection> getConnections() {
        if (connections == null) {
              connections = new com.amazonaws.internal.ListWithAutoConstructFlag<Connection>();
              connections.setAutoConstruct(true);
        }
        return connections;
    }
    
    /**
     * A list of connections.
     *
     * @param connections A list of connections.
     */
    public void setConnections(java.util.Collection<Connection> connections) {
        if (connections == null) {
            this.connections = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Connection> connectionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Connection>(connections.size());
        connectionsCopy.addAll(connections);
        this.connections = connectionsCopy;
    }
    
    /**
     * A list of connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connections A list of connections.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeConnectionsResult withConnections(Connection... connections) {
        if (getConnections() == null) setConnections(new java.util.ArrayList<Connection>(connections.length));
        for (Connection value : connections) {
            getConnections().add(value);
        }
        return this;
    }
    
    /**
     * A list of connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connections A list of connections.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeConnectionsResult withConnections(java.util.Collection<Connection> connections) {
        if (connections == null) {
            this.connections = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Connection> connectionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Connection>(connections.size());
            connectionsCopy.addAll(connections);
            this.connections = connectionsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConnections() != null) sb.append("Connections: " + getConnections() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeConnectionsResult == false) return false;
        DescribeConnectionsResult other = (DescribeConnectionsResult)obj;
        
        if (other.getConnections() == null ^ this.getConnections() == null) return false;
        if (other.getConnections() != null && other.getConnections().equals(this.getConnections()) == false) return false; 
        return true;
    }
    
}
    