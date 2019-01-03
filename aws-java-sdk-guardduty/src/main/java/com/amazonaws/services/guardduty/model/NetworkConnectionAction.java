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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about the NETWORK_CONNECTION action described in this finding.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/NetworkConnectionAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkConnectionAction implements Serializable, Cloneable, StructuredPojo {

    /** Network connection blocked information. */
    private Boolean blocked;
    /** Network connection direction. */
    private String connectionDirection;
    /** Local port information of the connection. */
    private LocalPortDetails localPortDetails;
    /** Network connection protocol. */
    private String protocol;
    /** Remote IP information of the connection. */
    private RemoteIpDetails remoteIpDetails;
    /** Remote port information of the connection. */
    private RemotePortDetails remotePortDetails;

    /**
     * Network connection blocked information.
     * 
     * @param blocked
     *        Network connection blocked information.
     */

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * Network connection blocked information.
     * 
     * @return Network connection blocked information.
     */

    public Boolean getBlocked() {
        return this.blocked;
    }

    /**
     * Network connection blocked information.
     * 
     * @param blocked
     *        Network connection blocked information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConnectionAction withBlocked(Boolean blocked) {
        setBlocked(blocked);
        return this;
    }

    /**
     * Network connection blocked information.
     * 
     * @return Network connection blocked information.
     */

    public Boolean isBlocked() {
        return this.blocked;
    }

    /**
     * Network connection direction.
     * 
     * @param connectionDirection
     *        Network connection direction.
     */

    public void setConnectionDirection(String connectionDirection) {
        this.connectionDirection = connectionDirection;
    }

    /**
     * Network connection direction.
     * 
     * @return Network connection direction.
     */

    public String getConnectionDirection() {
        return this.connectionDirection;
    }

    /**
     * Network connection direction.
     * 
     * @param connectionDirection
     *        Network connection direction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConnectionAction withConnectionDirection(String connectionDirection) {
        setConnectionDirection(connectionDirection);
        return this;
    }

    /**
     * Local port information of the connection.
     * 
     * @param localPortDetails
     *        Local port information of the connection.
     */

    public void setLocalPortDetails(LocalPortDetails localPortDetails) {
        this.localPortDetails = localPortDetails;
    }

    /**
     * Local port information of the connection.
     * 
     * @return Local port information of the connection.
     */

    public LocalPortDetails getLocalPortDetails() {
        return this.localPortDetails;
    }

    /**
     * Local port information of the connection.
     * 
     * @param localPortDetails
     *        Local port information of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConnectionAction withLocalPortDetails(LocalPortDetails localPortDetails) {
        setLocalPortDetails(localPortDetails);
        return this;
    }

    /**
     * Network connection protocol.
     * 
     * @param protocol
     *        Network connection protocol.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * Network connection protocol.
     * 
     * @return Network connection protocol.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * Network connection protocol.
     * 
     * @param protocol
     *        Network connection protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConnectionAction withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * Remote IP information of the connection.
     * 
     * @param remoteIpDetails
     *        Remote IP information of the connection.
     */

    public void setRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
    }

    /**
     * Remote IP information of the connection.
     * 
     * @return Remote IP information of the connection.
     */

    public RemoteIpDetails getRemoteIpDetails() {
        return this.remoteIpDetails;
    }

    /**
     * Remote IP information of the connection.
     * 
     * @param remoteIpDetails
     *        Remote IP information of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConnectionAction withRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        setRemoteIpDetails(remoteIpDetails);
        return this;
    }

    /**
     * Remote port information of the connection.
     * 
     * @param remotePortDetails
     *        Remote port information of the connection.
     */

    public void setRemotePortDetails(RemotePortDetails remotePortDetails) {
        this.remotePortDetails = remotePortDetails;
    }

    /**
     * Remote port information of the connection.
     * 
     * @return Remote port information of the connection.
     */

    public RemotePortDetails getRemotePortDetails() {
        return this.remotePortDetails;
    }

    /**
     * Remote port information of the connection.
     * 
     * @param remotePortDetails
     *        Remote port information of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkConnectionAction withRemotePortDetails(RemotePortDetails remotePortDetails) {
        setRemotePortDetails(remotePortDetails);
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
        if (getBlocked() != null)
            sb.append("Blocked: ").append(getBlocked()).append(",");
        if (getConnectionDirection() != null)
            sb.append("ConnectionDirection: ").append(getConnectionDirection()).append(",");
        if (getLocalPortDetails() != null)
            sb.append("LocalPortDetails: ").append(getLocalPortDetails()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getRemoteIpDetails() != null)
            sb.append("RemoteIpDetails: ").append(getRemoteIpDetails()).append(",");
        if (getRemotePortDetails() != null)
            sb.append("RemotePortDetails: ").append(getRemotePortDetails());
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
        if (other.getBlocked() == null ^ this.getBlocked() == null)
            return false;
        if (other.getBlocked() != null && other.getBlocked().equals(this.getBlocked()) == false)
            return false;
        if (other.getConnectionDirection() == null ^ this.getConnectionDirection() == null)
            return false;
        if (other.getConnectionDirection() != null && other.getConnectionDirection().equals(this.getConnectionDirection()) == false)
            return false;
        if (other.getLocalPortDetails() == null ^ this.getLocalPortDetails() == null)
            return false;
        if (other.getLocalPortDetails() != null && other.getLocalPortDetails().equals(this.getLocalPortDetails()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getRemoteIpDetails() == null ^ this.getRemoteIpDetails() == null)
            return false;
        if (other.getRemoteIpDetails() != null && other.getRemoteIpDetails().equals(this.getRemoteIpDetails()) == false)
            return false;
        if (other.getRemotePortDetails() == null ^ this.getRemotePortDetails() == null)
            return false;
        if (other.getRemotePortDetails() != null && other.getRemotePortDetails().equals(this.getRemotePortDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlocked() == null) ? 0 : getBlocked().hashCode());
        hashCode = prime * hashCode + ((getConnectionDirection() == null) ? 0 : getConnectionDirection().hashCode());
        hashCode = prime * hashCode + ((getLocalPortDetails() == null) ? 0 : getLocalPortDetails().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getRemoteIpDetails() == null) ? 0 : getRemoteIpDetails().hashCode());
        hashCode = prime * hashCode + ((getRemotePortDetails() == null) ? 0 : getRemotePortDetails().hashCode());
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
        com.amazonaws.services.guardduty.model.transform.NetworkConnectionActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
