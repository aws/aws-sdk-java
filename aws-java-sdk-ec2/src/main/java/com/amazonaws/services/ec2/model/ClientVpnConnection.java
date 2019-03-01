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

/**
 * <p>
 * Describes a client connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ClientVpnConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientVpnConnection implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client is connected.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The current date and time.
     * </p>
     */
    private String timestamp;
    /**
     * <p>
     * The ID of the client connection.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The username of the client who established the client connection. This information is only provided if Active
     * Directory client authentication is used.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The date and time the client connection was established.
     * </p>
     */
    private String connectionEstablishedTime;
    /**
     * <p>
     * The number of bytes sent by the client.
     * </p>
     */
    private String ingressBytes;
    /**
     * <p>
     * The number of bytes received by the client.
     * </p>
     */
    private String egressBytes;
    /**
     * <p>
     * The number of packets sent by the client.
     * </p>
     */
    private String ingressPackets;
    /**
     * <p>
     * The number of packets received by the client.
     * </p>
     */
    private String egressPackets;
    /**
     * <p>
     * The IP address of the client.
     * </p>
     */
    private String clientIp;
    /**
     * <p>
     * The common name associated with the client. This is either the name of the client certificate, or the Active
     * Directory user name.
     * </p>
     */
    private String commonName;
    /**
     * <p>
     * The current state of the client connection.
     * </p>
     */
    private ClientVpnConnectionStatus status;
    /**
     * <p>
     * The date and time the client connection was terminated.
     * </p>
     */
    private String connectionEndTime;

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

    public ClientVpnConnection withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The current date and time.
     * </p>
     * 
     * @param timestamp
     *        The current date and time.
     */

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The current date and time.
     * </p>
     * 
     * @return The current date and time.
     */

    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The current date and time.
     * </p>
     * 
     * @param timestamp
     *        The current date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnConnection withTimestamp(String timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the client connection.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     * 
     * @return The ID of the client connection.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the client connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnConnection withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The username of the client who established the client connection. This information is only provided if Active
     * Directory client authentication is used.
     * </p>
     * 
     * @param username
     *        The username of the client who established the client connection. This information is only provided if
     *        Active Directory client authentication is used.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username of the client who established the client connection. This information is only provided if Active
     * Directory client authentication is used.
     * </p>
     * 
     * @return The username of the client who established the client connection. This information is only provided if
     *         Active Directory client authentication is used.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username of the client who established the client connection. This information is only provided if Active
     * Directory client authentication is used.
     * </p>
     * 
     * @param username
     *        The username of the client who established the client connection. This information is only provided if
     *        Active Directory client authentication is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnConnection withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The date and time the client connection was established.
     * </p>
     * 
     * @param connectionEstablishedTime
     *        The date and time the client connection was established.
     */

    public void setConnectionEstablishedTime(String connectionEstablishedTime) {
        this.connectionEstablishedTime = connectionEstablishedTime;
    }

    /**
     * <p>
     * The date and time the client connection was established.
     * </p>
     * 
     * @return The date and time the client connection was established.
     */

    public String getConnectionEstablishedTime() {
        return this.connectionEstablishedTime;
    }

    /**
     * <p>
     * The date and time the client connection was established.
     * </p>
     * 
     * @param connectionEstablishedTime
     *        The date and time the client connection was established.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnConnection withConnectionEstablishedTime(String connectionEstablishedTime) {
        setConnectionEstablishedTime(connectionEstablishedTime);
        return this;
    }

    /**
     * <p>
     * The number of bytes sent by the client.
     * </p>
     * 
     * @param ingressBytes
     *        The number of bytes sent by the client.
     */

    public void setIngressBytes(String ingressBytes) {
        this.ingressBytes = ingressBytes;
    }

    /**
     * <p>
     * The number of bytes sent by the client.
     * </p>
     * 
     * @return The number of bytes sent by the client.
     */

    public String getIngressBytes() {
        return this.ingressBytes;
    }

    /**
     * <p>
     * The number of bytes sent by the client.
     * </p>
     * 
     * @param ingressBytes
     *        The number of bytes sent by the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnConnection withIngressBytes(String ingressBytes) {
        setIngressBytes(ingressBytes);
        return this;
    }

    /**
     * <p>
     * The number of bytes received by the client.
     * </p>
     * 
     * @param egressBytes
     *        The number of bytes received by the client.
     */

    public void setEgressBytes(String egressBytes) {
        this.egressBytes = egressBytes;
    }

    /**
     * <p>
     * The number of bytes received by the client.
     * </p>
     * 
     * @return The number of bytes received by the client.
     */

    public String getEgressBytes() {
        return this.egressBytes;
    }

    /**
     * <p>
     * The number of bytes received by the client.
     * </p>
     * 
     * @param egressBytes
     *        The number of bytes received by the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnConnection withEgressBytes(String egressBytes) {
        setEgressBytes(egressBytes);
        return this;
    }

    /**
     * <p>
     * The number of packets sent by the client.
     * </p>
     * 
     * @param ingressPackets
     *        The number of packets sent by the client.
     */

    public void setIngressPackets(String ingressPackets) {
        this.ingressPackets = ingressPackets;
    }

    /**
     * <p>
     * The number of packets sent by the client.
     * </p>
     * 
     * @return The number of packets sent by the client.
     */

    public String getIngressPackets() {
        return this.ingressPackets;
    }

    /**
     * <p>
     * The number of packets sent by the client.
     * </p>
     * 
     * @param ingressPackets
     *        The number of packets sent by the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnConnection withIngressPackets(String ingressPackets) {
        setIngressPackets(ingressPackets);
        return this;
    }

    /**
     * <p>
     * The number of packets received by the client.
     * </p>
     * 
     * @param egressPackets
     *        The number of packets received by the client.
     */

    public void setEgressPackets(String egressPackets) {
        this.egressPackets = egressPackets;
    }

    /**
     * <p>
     * The number of packets received by the client.
     * </p>
     * 
     * @return The number of packets received by the client.
     */

    public String getEgressPackets() {
        return this.egressPackets;
    }

    /**
     * <p>
     * The number of packets received by the client.
     * </p>
     * 
     * @param egressPackets
     *        The number of packets received by the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnConnection withEgressPackets(String egressPackets) {
        setEgressPackets(egressPackets);
        return this;
    }

    /**
     * <p>
     * The IP address of the client.
     * </p>
     * 
     * @param clientIp
     *        The IP address of the client.
     */

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * <p>
     * The IP address of the client.
     * </p>
     * 
     * @return The IP address of the client.
     */

    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * <p>
     * The IP address of the client.
     * </p>
     * 
     * @param clientIp
     *        The IP address of the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnConnection withClientIp(String clientIp) {
        setClientIp(clientIp);
        return this;
    }

    /**
     * <p>
     * The common name associated with the client. This is either the name of the client certificate, or the Active
     * Directory user name.
     * </p>
     * 
     * @param commonName
     *        The common name associated with the client. This is either the name of the client certificate, or the
     *        Active Directory user name.
     */

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    /**
     * <p>
     * The common name associated with the client. This is either the name of the client certificate, or the Active
     * Directory user name.
     * </p>
     * 
     * @return The common name associated with the client. This is either the name of the client certificate, or the
     *         Active Directory user name.
     */

    public String getCommonName() {
        return this.commonName;
    }

    /**
     * <p>
     * The common name associated with the client. This is either the name of the client certificate, or the Active
     * Directory user name.
     * </p>
     * 
     * @param commonName
     *        The common name associated with the client. This is either the name of the client certificate, or the
     *        Active Directory user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnConnection withCommonName(String commonName) {
        setCommonName(commonName);
        return this;
    }

    /**
     * <p>
     * The current state of the client connection.
     * </p>
     * 
     * @param status
     *        The current state of the client connection.
     */

    public void setStatus(ClientVpnConnectionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the client connection.
     * </p>
     * 
     * @return The current state of the client connection.
     */

    public ClientVpnConnectionStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the client connection.
     * </p>
     * 
     * @param status
     *        The current state of the client connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnConnection withStatus(ClientVpnConnectionStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date and time the client connection was terminated.
     * </p>
     * 
     * @param connectionEndTime
     *        The date and time the client connection was terminated.
     */

    public void setConnectionEndTime(String connectionEndTime) {
        this.connectionEndTime = connectionEndTime;
    }

    /**
     * <p>
     * The date and time the client connection was terminated.
     * </p>
     * 
     * @return The date and time the client connection was terminated.
     */

    public String getConnectionEndTime() {
        return this.connectionEndTime;
    }

    /**
     * <p>
     * The date and time the client connection was terminated.
     * </p>
     * 
     * @param connectionEndTime
     *        The date and time the client connection was terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnConnection withConnectionEndTime(String connectionEndTime) {
        setConnectionEndTime(connectionEndTime);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getConnectionEstablishedTime() != null)
            sb.append("ConnectionEstablishedTime: ").append(getConnectionEstablishedTime()).append(",");
        if (getIngressBytes() != null)
            sb.append("IngressBytes: ").append(getIngressBytes()).append(",");
        if (getEgressBytes() != null)
            sb.append("EgressBytes: ").append(getEgressBytes()).append(",");
        if (getIngressPackets() != null)
            sb.append("IngressPackets: ").append(getIngressPackets()).append(",");
        if (getEgressPackets() != null)
            sb.append("EgressPackets: ").append(getEgressPackets()).append(",");
        if (getClientIp() != null)
            sb.append("ClientIp: ").append(getClientIp()).append(",");
        if (getCommonName() != null)
            sb.append("CommonName: ").append(getCommonName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getConnectionEndTime() != null)
            sb.append("ConnectionEndTime: ").append(getConnectionEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientVpnConnection == false)
            return false;
        ClientVpnConnection other = (ClientVpnConnection) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getConnectionEstablishedTime() == null ^ this.getConnectionEstablishedTime() == null)
            return false;
        if (other.getConnectionEstablishedTime() != null && other.getConnectionEstablishedTime().equals(this.getConnectionEstablishedTime()) == false)
            return false;
        if (other.getIngressBytes() == null ^ this.getIngressBytes() == null)
            return false;
        if (other.getIngressBytes() != null && other.getIngressBytes().equals(this.getIngressBytes()) == false)
            return false;
        if (other.getEgressBytes() == null ^ this.getEgressBytes() == null)
            return false;
        if (other.getEgressBytes() != null && other.getEgressBytes().equals(this.getEgressBytes()) == false)
            return false;
        if (other.getIngressPackets() == null ^ this.getIngressPackets() == null)
            return false;
        if (other.getIngressPackets() != null && other.getIngressPackets().equals(this.getIngressPackets()) == false)
            return false;
        if (other.getEgressPackets() == null ^ this.getEgressPackets() == null)
            return false;
        if (other.getEgressPackets() != null && other.getEgressPackets().equals(this.getEgressPackets()) == false)
            return false;
        if (other.getClientIp() == null ^ this.getClientIp() == null)
            return false;
        if (other.getClientIp() != null && other.getClientIp().equals(this.getClientIp()) == false)
            return false;
        if (other.getCommonName() == null ^ this.getCommonName() == null)
            return false;
        if (other.getCommonName() != null && other.getCommonName().equals(this.getCommonName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getConnectionEndTime() == null ^ this.getConnectionEndTime() == null)
            return false;
        if (other.getConnectionEndTime() != null && other.getConnectionEndTime().equals(this.getConnectionEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getConnectionEstablishedTime() == null) ? 0 : getConnectionEstablishedTime().hashCode());
        hashCode = prime * hashCode + ((getIngressBytes() == null) ? 0 : getIngressBytes().hashCode());
        hashCode = prime * hashCode + ((getEgressBytes() == null) ? 0 : getEgressBytes().hashCode());
        hashCode = prime * hashCode + ((getIngressPackets() == null) ? 0 : getIngressPackets().hashCode());
        hashCode = prime * hashCode + ((getEgressPackets() == null) ? 0 : getEgressPackets().hashCode());
        hashCode = prime * hashCode + ((getClientIp() == null) ? 0 : getClientIp().hashCode());
        hashCode = prime * hashCode + ((getCommonName() == null) ? 0 : getCommonName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getConnectionEndTime() == null) ? 0 : getConnectionEndTime().hashCode());
        return hashCode;
    }

    @Override
    public ClientVpnConnection clone() {
        try {
            return (ClientVpnConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
