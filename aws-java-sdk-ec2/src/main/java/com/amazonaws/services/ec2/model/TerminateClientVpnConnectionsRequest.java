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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.TerminateClientVpnConnectionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateClientVpnConnectionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<TerminateClientVpnConnectionsRequest> {

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client is connected.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The ID of the client connection to be terminated.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The name of the user who initiated the connection. Use this option to terminate all active connections for the
     * specified user. This option can only be used if the user has established up to five connections.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client is connected.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint to which the client is connected.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client is connected.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint to which the client is connected.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client is connected.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint to which the client is connected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateClientVpnConnectionsRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The ID of the client connection to be terminated.
     * </p>
     * 
     * @param connectionId
     *        The ID of the client connection to be terminated.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the client connection to be terminated.
     * </p>
     * 
     * @return The ID of the client connection to be terminated.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the client connection to be terminated.
     * </p>
     * 
     * @param connectionId
     *        The ID of the client connection to be terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateClientVpnConnectionsRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The name of the user who initiated the connection. Use this option to terminate all active connections for the
     * specified user. This option can only be used if the user has established up to five connections.
     * </p>
     * 
     * @param username
     *        The name of the user who initiated the connection. Use this option to terminate all active connections for
     *        the specified user. This option can only be used if the user has established up to five connections.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The name of the user who initiated the connection. Use this option to terminate all active connections for the
     * specified user. This option can only be used if the user has established up to five connections.
     * </p>
     * 
     * @return The name of the user who initiated the connection. Use this option to terminate all active connections
     *         for the specified user. This option can only be used if the user has established up to five connections.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The name of the user who initiated the connection. Use this option to terminate all active connections for the
     * specified user. This option can only be used if the user has established up to five connections.
     * </p>
     * 
     * @param username
     *        The name of the user who initiated the connection. Use this option to terminate all active connections for
     *        the specified user. This option can only be used if the user has established up to five connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateClientVpnConnectionsRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<TerminateClientVpnConnectionsRequest> getDryRunRequest() {
        Request<TerminateClientVpnConnectionsRequest> request = new TerminateClientVpnConnectionsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateClientVpnConnectionsRequest == false)
            return false;
        TerminateClientVpnConnectionsRequest other = (TerminateClientVpnConnectionsRequest) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public TerminateClientVpnConnectionsRequest clone() {
        return (TerminateClientVpnConnectionsRequest) super.clone();
    }
}
