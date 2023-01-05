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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetPlayerConnectionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPlayerConnectionStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of connection ids, one for each connection in use by the player.
     * </p>
     */
    private java.util.List<Connection> connections;

    /**
     * <p>
     * The list of connection ids, one for each connection in use by the player.
     * </p>
     * 
     * @return The list of connection ids, one for each connection in use by the player.
     */

    public java.util.List<Connection> getConnections() {
        return connections;
    }

    /**
     * <p>
     * The list of connection ids, one for each connection in use by the player.
     * </p>
     * 
     * @param connections
     *        The list of connection ids, one for each connection in use by the player.
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
     * The list of connection ids, one for each connection in use by the player.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnections(java.util.Collection)} or {@link #withConnections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param connections
     *        The list of connection ids, one for each connection in use by the player.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlayerConnectionStatusResult withConnections(Connection... connections) {
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
     * The list of connection ids, one for each connection in use by the player.
     * </p>
     * 
     * @param connections
     *        The list of connection ids, one for each connection in use by the player.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlayerConnectionStatusResult withConnections(java.util.Collection<Connection> connections) {
        setConnections(connections);
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
            sb.append("Connections: ").append(getConnections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPlayerConnectionStatusResult == false)
            return false;
        GetPlayerConnectionStatusResult other = (GetPlayerConnectionStatusResult) obj;
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
    public GetPlayerConnectionStatusResult clone() {
        try {
            return (GetPlayerConnectionStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
