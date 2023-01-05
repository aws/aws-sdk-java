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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ConnectionDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The public key of the client.
     * </p>
     */
    private String clientPublicKey;
    /**
     * <p>
     * The public key of the server.
     * </p>
     */
    private String serverPublicKey;
    /**
     * <p>
     * The endpoint for the server.
     * </p>
     */
    private String serverEndpoint;
    /**
     * <p>
     * The client tunnel address.
     * </p>
     */
    private String clientTunnelAddress;
    /**
     * <p>
     * The server tunnel address.
     * </p>
     */
    private String serverTunnelAddress;
    /**
     * <p>
     * The allowed IP addresses.
     * </p>
     */
    private java.util.List<String> allowedIps;

    /**
     * <p>
     * The public key of the client.
     * </p>
     * 
     * @param clientPublicKey
     *        The public key of the client.
     */

    public void setClientPublicKey(String clientPublicKey) {
        this.clientPublicKey = clientPublicKey;
    }

    /**
     * <p>
     * The public key of the client.
     * </p>
     * 
     * @return The public key of the client.
     */

    public String getClientPublicKey() {
        return this.clientPublicKey;
    }

    /**
     * <p>
     * The public key of the client.
     * </p>
     * 
     * @param clientPublicKey
     *        The public key of the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionDetails withClientPublicKey(String clientPublicKey) {
        setClientPublicKey(clientPublicKey);
        return this;
    }

    /**
     * <p>
     * The public key of the server.
     * </p>
     * 
     * @param serverPublicKey
     *        The public key of the server.
     */

    public void setServerPublicKey(String serverPublicKey) {
        this.serverPublicKey = serverPublicKey;
    }

    /**
     * <p>
     * The public key of the server.
     * </p>
     * 
     * @return The public key of the server.
     */

    public String getServerPublicKey() {
        return this.serverPublicKey;
    }

    /**
     * <p>
     * The public key of the server.
     * </p>
     * 
     * @param serverPublicKey
     *        The public key of the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionDetails withServerPublicKey(String serverPublicKey) {
        setServerPublicKey(serverPublicKey);
        return this;
    }

    /**
     * <p>
     * The endpoint for the server.
     * </p>
     * 
     * @param serverEndpoint
     *        The endpoint for the server.
     */

    public void setServerEndpoint(String serverEndpoint) {
        this.serverEndpoint = serverEndpoint;
    }

    /**
     * <p>
     * The endpoint for the server.
     * </p>
     * 
     * @return The endpoint for the server.
     */

    public String getServerEndpoint() {
        return this.serverEndpoint;
    }

    /**
     * <p>
     * The endpoint for the server.
     * </p>
     * 
     * @param serverEndpoint
     *        The endpoint for the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionDetails withServerEndpoint(String serverEndpoint) {
        setServerEndpoint(serverEndpoint);
        return this;
    }

    /**
     * <p>
     * The client tunnel address.
     * </p>
     * 
     * @param clientTunnelAddress
     *        The client tunnel address.
     */

    public void setClientTunnelAddress(String clientTunnelAddress) {
        this.clientTunnelAddress = clientTunnelAddress;
    }

    /**
     * <p>
     * The client tunnel address.
     * </p>
     * 
     * @return The client tunnel address.
     */

    public String getClientTunnelAddress() {
        return this.clientTunnelAddress;
    }

    /**
     * <p>
     * The client tunnel address.
     * </p>
     * 
     * @param clientTunnelAddress
     *        The client tunnel address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionDetails withClientTunnelAddress(String clientTunnelAddress) {
        setClientTunnelAddress(clientTunnelAddress);
        return this;
    }

    /**
     * <p>
     * The server tunnel address.
     * </p>
     * 
     * @param serverTunnelAddress
     *        The server tunnel address.
     */

    public void setServerTunnelAddress(String serverTunnelAddress) {
        this.serverTunnelAddress = serverTunnelAddress;
    }

    /**
     * <p>
     * The server tunnel address.
     * </p>
     * 
     * @return The server tunnel address.
     */

    public String getServerTunnelAddress() {
        return this.serverTunnelAddress;
    }

    /**
     * <p>
     * The server tunnel address.
     * </p>
     * 
     * @param serverTunnelAddress
     *        The server tunnel address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionDetails withServerTunnelAddress(String serverTunnelAddress) {
        setServerTunnelAddress(serverTunnelAddress);
        return this;
    }

    /**
     * <p>
     * The allowed IP addresses.
     * </p>
     * 
     * @return The allowed IP addresses.
     */

    public java.util.List<String> getAllowedIps() {
        return allowedIps;
    }

    /**
     * <p>
     * The allowed IP addresses.
     * </p>
     * 
     * @param allowedIps
     *        The allowed IP addresses.
     */

    public void setAllowedIps(java.util.Collection<String> allowedIps) {
        if (allowedIps == null) {
            this.allowedIps = null;
            return;
        }

        this.allowedIps = new java.util.ArrayList<String>(allowedIps);
    }

    /**
     * <p>
     * The allowed IP addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedIps(java.util.Collection)} or {@link #withAllowedIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowedIps
     *        The allowed IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionDetails withAllowedIps(String... allowedIps) {
        if (this.allowedIps == null) {
            setAllowedIps(new java.util.ArrayList<String>(allowedIps.length));
        }
        for (String ele : allowedIps) {
            this.allowedIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The allowed IP addresses.
     * </p>
     * 
     * @param allowedIps
     *        The allowed IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionDetails withAllowedIps(java.util.Collection<String> allowedIps) {
        setAllowedIps(allowedIps);
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
        if (getClientPublicKey() != null)
            sb.append("ClientPublicKey: ").append(getClientPublicKey()).append(",");
        if (getServerPublicKey() != null)
            sb.append("ServerPublicKey: ").append(getServerPublicKey()).append(",");
        if (getServerEndpoint() != null)
            sb.append("ServerEndpoint: ").append(getServerEndpoint()).append(",");
        if (getClientTunnelAddress() != null)
            sb.append("ClientTunnelAddress: ").append(getClientTunnelAddress()).append(",");
        if (getServerTunnelAddress() != null)
            sb.append("ServerTunnelAddress: ").append(getServerTunnelAddress()).append(",");
        if (getAllowedIps() != null)
            sb.append("AllowedIps: ").append(getAllowedIps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionDetails == false)
            return false;
        ConnectionDetails other = (ConnectionDetails) obj;
        if (other.getClientPublicKey() == null ^ this.getClientPublicKey() == null)
            return false;
        if (other.getClientPublicKey() != null && other.getClientPublicKey().equals(this.getClientPublicKey()) == false)
            return false;
        if (other.getServerPublicKey() == null ^ this.getServerPublicKey() == null)
            return false;
        if (other.getServerPublicKey() != null && other.getServerPublicKey().equals(this.getServerPublicKey()) == false)
            return false;
        if (other.getServerEndpoint() == null ^ this.getServerEndpoint() == null)
            return false;
        if (other.getServerEndpoint() != null && other.getServerEndpoint().equals(this.getServerEndpoint()) == false)
            return false;
        if (other.getClientTunnelAddress() == null ^ this.getClientTunnelAddress() == null)
            return false;
        if (other.getClientTunnelAddress() != null && other.getClientTunnelAddress().equals(this.getClientTunnelAddress()) == false)
            return false;
        if (other.getServerTunnelAddress() == null ^ this.getServerTunnelAddress() == null)
            return false;
        if (other.getServerTunnelAddress() != null && other.getServerTunnelAddress().equals(this.getServerTunnelAddress()) == false)
            return false;
        if (other.getAllowedIps() == null ^ this.getAllowedIps() == null)
            return false;
        if (other.getAllowedIps() != null && other.getAllowedIps().equals(this.getAllowedIps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientPublicKey() == null) ? 0 : getClientPublicKey().hashCode());
        hashCode = prime * hashCode + ((getServerPublicKey() == null) ? 0 : getServerPublicKey().hashCode());
        hashCode = prime * hashCode + ((getServerEndpoint() == null) ? 0 : getServerEndpoint().hashCode());
        hashCode = prime * hashCode + ((getClientTunnelAddress() == null) ? 0 : getClientTunnelAddress().hashCode());
        hashCode = prime * hashCode + ((getServerTunnelAddress() == null) ? 0 : getServerTunnelAddress().hashCode());
        hashCode = prime * hashCode + ((getAllowedIps() == null) ? 0 : getAllowedIps().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionDetails clone() {
        try {
            return (ConnectionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.ConnectionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
