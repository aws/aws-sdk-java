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
public class TerminateClientVpnConnectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The user who established the terminated client connections.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The current state of the client connections.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TerminateConnectionStatus> connectionStatuses;

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateClientVpnConnectionsResult withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The user who established the terminated client connections.
     * </p>
     * 
     * @param username
     *        The user who established the terminated client connections.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user who established the terminated client connections.
     * </p>
     * 
     * @return The user who established the terminated client connections.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user who established the terminated client connections.
     * </p>
     * 
     * @param username
     *        The user who established the terminated client connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateClientVpnConnectionsResult withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The current state of the client connections.
     * </p>
     * 
     * @return The current state of the client connections.
     */

    public java.util.List<TerminateConnectionStatus> getConnectionStatuses() {
        if (connectionStatuses == null) {
            connectionStatuses = new com.amazonaws.internal.SdkInternalList<TerminateConnectionStatus>();
        }
        return connectionStatuses;
    }

    /**
     * <p>
     * The current state of the client connections.
     * </p>
     * 
     * @param connectionStatuses
     *        The current state of the client connections.
     */

    public void setConnectionStatuses(java.util.Collection<TerminateConnectionStatus> connectionStatuses) {
        if (connectionStatuses == null) {
            this.connectionStatuses = null;
            return;
        }

        this.connectionStatuses = new com.amazonaws.internal.SdkInternalList<TerminateConnectionStatus>(connectionStatuses);
    }

    /**
     * <p>
     * The current state of the client connections.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectionStatuses(java.util.Collection)} or {@link #withConnectionStatuses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param connectionStatuses
     *        The current state of the client connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateClientVpnConnectionsResult withConnectionStatuses(TerminateConnectionStatus... connectionStatuses) {
        if (this.connectionStatuses == null) {
            setConnectionStatuses(new com.amazonaws.internal.SdkInternalList<TerminateConnectionStatus>(connectionStatuses.length));
        }
        for (TerminateConnectionStatus ele : connectionStatuses) {
            this.connectionStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The current state of the client connections.
     * </p>
     * 
     * @param connectionStatuses
     *        The current state of the client connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateClientVpnConnectionsResult withConnectionStatuses(java.util.Collection<TerminateConnectionStatus> connectionStatuses) {
        setConnectionStatuses(connectionStatuses);
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: ").append(getClientVpnEndpointId()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getConnectionStatuses() != null)
            sb.append("ConnectionStatuses: ").append(getConnectionStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateClientVpnConnectionsResult == false)
            return false;
        TerminateClientVpnConnectionsResult other = (TerminateClientVpnConnectionsResult) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getConnectionStatuses() == null ^ this.getConnectionStatuses() == null)
            return false;
        if (other.getConnectionStatuses() != null && other.getConnectionStatuses().equals(this.getConnectionStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getConnectionStatuses() == null) ? 0 : getConnectionStatuses().hashCode());
        return hashCode;
    }

    @Override
    public TerminateClientVpnConnectionsResult clone() {
        try {
            return (TerminateClientVpnConnectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
