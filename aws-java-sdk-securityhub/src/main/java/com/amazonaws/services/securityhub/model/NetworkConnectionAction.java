/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provided if <code>ActionType</code> is <code>NETWORK_CONNECTION</code>. It provides details about the attempted
 * network connection that was detected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/NetworkConnectionAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkConnectionAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The direction of the network connection request (<code>IN</code> or <code>OUT</code>).
     * </p>
     */
    private String connectionDirection;
    /**
     * <p>
     * Information about the remote IP address that issued the network connection request.
     * </p>
     */
    private ActionRemoteIpDetails remoteIpDetails;
    /**
     * <p>
     * Information about the port on the remote IP address.
     * </p>
     */
    private ActionRemotePortDetails remotePortDetails;
    /**
     * <p>
     * Information about the port on the EC2 instance.
     * </p>
     */
    private ActionLocalPortDetails localPortDetails;
    /**
     * <p>
     * The protocol used to make the network connection request.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * Indicates whether the network connection attempt was blocked.
     * </p>
     */
    private Boolean blocked;

    /**
     * <p>
     * The direction of the network connection request (<code>IN</code> or <code>OUT</code>).
     * </p>
     * 
     * @param connectionDirection
     *        The direction of the network connection request (<code>IN</code> or <code>OUT</code>).
     */

    public void setConnectionDirection(String connectionDirection) {
        this.connectionDirection = connectionDirection;
    }

    /**
     * <p>
     * The direction of the network connection request (<code>IN</code> or <code>OUT</code>).
     * </p>
     * 
     * @return The direction of the network connection request (<code>IN</code> or <code>OUT</code>).
     */

    public String getConnectionDirection() {
        return this.connectionDirection;
    }

    /**
     * <p>
     * The direction of the network connection request (<code>IN</code> or <code>OUT</code>).
     * </p>
     * 
     * @param connectionDirection
     *        The direction of the network connection request (<code>IN</code> or <code>OUT</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConnectionAction withConnectionDirection(String connectionDirection) {
        setConnectionDirection(connectionDirection);
        return this;
    }

    /**
     * <p>
     * Information about the remote IP address that issued the network connection request.
     * </p>
     * 
     * @param remoteIpDetails
     *        Information about the remote IP address that issued the network connection request.
     */

    public void setRemoteIpDetails(ActionRemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
    }

    /**
     * <p>
     * Information about the remote IP address that issued the network connection request.
     * </p>
     * 
     * @return Information about the remote IP address that issued the network connection request.
     */

    public ActionRemoteIpDetails getRemoteIpDetails() {
        return this.remoteIpDetails;
    }

    /**
     * <p>
     * Information about the remote IP address that issued the network connection request.
     * </p>
     * 
     * @param remoteIpDetails
     *        Information about the remote IP address that issued the network connection request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConnectionAction withRemoteIpDetails(ActionRemoteIpDetails remoteIpDetails) {
        setRemoteIpDetails(remoteIpDetails);
        return this;
    }

    /**
     * <p>
     * Information about the port on the remote IP address.
     * </p>
     * 
     * @param remotePortDetails
     *        Information about the port on the remote IP address.
     */

    public void setRemotePortDetails(ActionRemotePortDetails remotePortDetails) {
        this.remotePortDetails = remotePortDetails;
    }

    /**
     * <p>
     * Information about the port on the remote IP address.
     * </p>
     * 
     * @return Information about the port on the remote IP address.
     */

    public ActionRemotePortDetails getRemotePortDetails() {
        return this.remotePortDetails;
    }

    /**
     * <p>
     * Information about the port on the remote IP address.
     * </p>
     * 
     * @param remotePortDetails
     *        Information about the port on the remote IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConnectionAction withRemotePortDetails(ActionRemotePortDetails remotePortDetails) {
        setRemotePortDetails(remotePortDetails);
        return this;
    }

    /**
     * <p>
     * Information about the port on the EC2 instance.
     * </p>
     * 
     * @param localPortDetails
     *        Information about the port on the EC2 instance.
     */

    public void setLocalPortDetails(ActionLocalPortDetails localPortDetails) {
        this.localPortDetails = localPortDetails;
    }

    /**
     * <p>
     * Information about the port on the EC2 instance.
     * </p>
     * 
     * @return Information about the port on the EC2 instance.
     */

    public ActionLocalPortDetails getLocalPortDetails() {
        return this.localPortDetails;
    }

    /**
     * <p>
     * Information about the port on the EC2 instance.
     * </p>
     * 
     * @param localPortDetails
     *        Information about the port on the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConnectionAction withLocalPortDetails(ActionLocalPortDetails localPortDetails) {
        setLocalPortDetails(localPortDetails);
        return this;
    }

    /**
     * <p>
     * The protocol used to make the network connection request.
     * </p>
     * 
     * @param protocol
     *        The protocol used to make the network connection request.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used to make the network connection request.
     * </p>
     * 
     * @return The protocol used to make the network connection request.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol used to make the network connection request.
     * </p>
     * 
     * @param protocol
     *        The protocol used to make the network connection request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConnectionAction withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * Indicates whether the network connection attempt was blocked.
     * </p>
     * 
     * @param blocked
     *        Indicates whether the network connection attempt was blocked.
     */

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * <p>
     * Indicates whether the network connection attempt was blocked.
     * </p>
     * 
     * @return Indicates whether the network connection attempt was blocked.
     */

    public Boolean getBlocked() {
        return this.blocked;
    }

    /**
     * <p>
     * Indicates whether the network connection attempt was blocked.
     * </p>
     * 
     * @param blocked
     *        Indicates whether the network connection attempt was blocked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConnectionAction withBlocked(Boolean blocked) {
        setBlocked(blocked);
        return this;
    }

    /**
     * <p>
     * Indicates whether the network connection attempt was blocked.
     * </p>
     * 
     * @return Indicates whether the network connection attempt was blocked.
     */

    public Boolean isBlocked() {
        return this.blocked;
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
        if (getConnectionDirection() != null)
            sb.append("ConnectionDirection: ").append(getConnectionDirection()).append(",");
        if (getRemoteIpDetails() != null)
            sb.append("RemoteIpDetails: ").append(getRemoteIpDetails()).append(",");
        if (getRemotePortDetails() != null)
            sb.append("RemotePortDetails: ").append(getRemotePortDetails()).append(",");
        if (getLocalPortDetails() != null)
            sb.append("LocalPortDetails: ").append(getLocalPortDetails()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getBlocked() != null)
            sb.append("Blocked: ").append(getBlocked());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkConnectionAction == false)
            return false;
        NetworkConnectionAction other = (NetworkConnectionAction) obj;
        if (other.getConnectionDirection() == null ^ this.getConnectionDirection() == null)
            return false;
        if (other.getConnectionDirection() != null && other.getConnectionDirection().equals(this.getConnectionDirection()) == false)
            return false;
        if (other.getRemoteIpDetails() == null ^ this.getRemoteIpDetails() == null)
            return false;
        if (other.getRemoteIpDetails() != null && other.getRemoteIpDetails().equals(this.getRemoteIpDetails()) == false)
            return false;
        if (other.getRemotePortDetails() == null ^ this.getRemotePortDetails() == null)
            return false;
        if (other.getRemotePortDetails() != null && other.getRemotePortDetails().equals(this.getRemotePortDetails()) == false)
            return false;
        if (other.getLocalPortDetails() == null ^ this.getLocalPortDetails() == null)
            return false;
        if (other.getLocalPortDetails() != null && other.getLocalPortDetails().equals(this.getLocalPortDetails()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getBlocked() == null ^ this.getBlocked() == null)
            return false;
        if (other.getBlocked() != null && other.getBlocked().equals(this.getBlocked()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionDirection() == null) ? 0 : getConnectionDirection().hashCode());
        hashCode = prime * hashCode + ((getRemoteIpDetails() == null) ? 0 : getRemoteIpDetails().hashCode());
        hashCode = prime * hashCode + ((getRemotePortDetails() == null) ? 0 : getRemotePortDetails().hashCode());
        hashCode = prime * hashCode + ((getLocalPortDetails() == null) ? 0 : getLocalPortDetails().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getBlocked() == null) ? 0 : getBlocked().hashCode());
        return hashCode;
    }

    @Override
    public NetworkConnectionAction clone() {
        try {
            return (NetworkConnectionAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.NetworkConnectionActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
