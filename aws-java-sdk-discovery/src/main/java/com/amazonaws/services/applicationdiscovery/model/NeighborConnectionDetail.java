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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about neighboring servers.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NeighborConnectionDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the server that opened the network connection.
     * </p>
     */
    private String sourceServerId;
    /**
     * <p>
     * The ID of the server that accepted the network connection.
     * </p>
     */
    private String destinationServerId;
    /**
     * <p>
     * The destination network port for the connection.
     * </p>
     */
    private Integer destinationPort;
    /**
     * <p>
     * The network protocol used for the connection.
     * </p>
     */
    private String transportProtocol;
    /**
     * <p>
     * The number of open network connections with the neighboring server.
     * </p>
     */
    private Long connectionsCount;

    /**
     * <p>
     * The ID of the server that opened the network connection.
     * </p>
     * 
     * @param sourceServerId
     *        The ID of the server that opened the network connection.
     */

    public void setSourceServerId(String sourceServerId) {
        this.sourceServerId = sourceServerId;
    }

    /**
     * <p>
     * The ID of the server that opened the network connection.
     * </p>
     * 
     * @return The ID of the server that opened the network connection.
     */

    public String getSourceServerId() {
        return this.sourceServerId;
    }

    /**
     * <p>
     * The ID of the server that opened the network connection.
     * </p>
     * 
     * @param sourceServerId
     *        The ID of the server that opened the network connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeighborConnectionDetail withSourceServerId(String sourceServerId) {
        setSourceServerId(sourceServerId);
        return this;
    }

    /**
     * <p>
     * The ID of the server that accepted the network connection.
     * </p>
     * 
     * @param destinationServerId
     *        The ID of the server that accepted the network connection.
     */

    public void setDestinationServerId(String destinationServerId) {
        this.destinationServerId = destinationServerId;
    }

    /**
     * <p>
     * The ID of the server that accepted the network connection.
     * </p>
     * 
     * @return The ID of the server that accepted the network connection.
     */

    public String getDestinationServerId() {
        return this.destinationServerId;
    }

    /**
     * <p>
     * The ID of the server that accepted the network connection.
     * </p>
     * 
     * @param destinationServerId
     *        The ID of the server that accepted the network connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeighborConnectionDetail withDestinationServerId(String destinationServerId) {
        setDestinationServerId(destinationServerId);
        return this;
    }

    /**
     * <p>
     * The destination network port for the connection.
     * </p>
     * 
     * @param destinationPort
     *        The destination network port for the connection.
     */

    public void setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * <p>
     * The destination network port for the connection.
     * </p>
     * 
     * @return The destination network port for the connection.
     */

    public Integer getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * <p>
     * The destination network port for the connection.
     * </p>
     * 
     * @param destinationPort
     *        The destination network port for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeighborConnectionDetail withDestinationPort(Integer destinationPort) {
        setDestinationPort(destinationPort);
        return this;
    }

    /**
     * <p>
     * The network protocol used for the connection.
     * </p>
     * 
     * @param transportProtocol
     *        The network protocol used for the connection.
     */

    public void setTransportProtocol(String transportProtocol) {
        this.transportProtocol = transportProtocol;
    }

    /**
     * <p>
     * The network protocol used for the connection.
     * </p>
     * 
     * @return The network protocol used for the connection.
     */

    public String getTransportProtocol() {
        return this.transportProtocol;
    }

    /**
     * <p>
     * The network protocol used for the connection.
     * </p>
     * 
     * @param transportProtocol
     *        The network protocol used for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeighborConnectionDetail withTransportProtocol(String transportProtocol) {
        setTransportProtocol(transportProtocol);
        return this;
    }

    /**
     * <p>
     * The number of open network connections with the neighboring server.
     * </p>
     * 
     * @param connectionsCount
     *        The number of open network connections with the neighboring server.
     */

    public void setConnectionsCount(Long connectionsCount) {
        this.connectionsCount = connectionsCount;
    }

    /**
     * <p>
     * The number of open network connections with the neighboring server.
     * </p>
     * 
     * @return The number of open network connections with the neighboring server.
     */

    public Long getConnectionsCount() {
        return this.connectionsCount;
    }

    /**
     * <p>
     * The number of open network connections with the neighboring server.
     * </p>
     * 
     * @param connectionsCount
     *        The number of open network connections with the neighboring server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NeighborConnectionDetail withConnectionsCount(Long connectionsCount) {
        setConnectionsCount(connectionsCount);
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
        if (getSourceServerId() != null)
            sb.append("SourceServerId: ").append(getSourceServerId()).append(",");
        if (getDestinationServerId() != null)
            sb.append("DestinationServerId: ").append(getDestinationServerId()).append(",");
        if (getDestinationPort() != null)
            sb.append("DestinationPort: ").append(getDestinationPort()).append(",");
        if (getTransportProtocol() != null)
            sb.append("TransportProtocol: ").append(getTransportProtocol()).append(",");
        if (getConnectionsCount() != null)
            sb.append("ConnectionsCount: ").append(getConnectionsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NeighborConnectionDetail == false)
            return false;
        NeighborConnectionDetail other = (NeighborConnectionDetail) obj;
        if (other.getSourceServerId() == null ^ this.getSourceServerId() == null)
            return false;
        if (other.getSourceServerId() != null && other.getSourceServerId().equals(this.getSourceServerId()) == false)
            return false;
        if (other.getDestinationServerId() == null ^ this.getDestinationServerId() == null)
            return false;
        if (other.getDestinationServerId() != null && other.getDestinationServerId().equals(this.getDestinationServerId()) == false)
            return false;
        if (other.getDestinationPort() == null ^ this.getDestinationPort() == null)
            return false;
        if (other.getDestinationPort() != null && other.getDestinationPort().equals(this.getDestinationPort()) == false)
            return false;
        if (other.getTransportProtocol() == null ^ this.getTransportProtocol() == null)
            return false;
        if (other.getTransportProtocol() != null && other.getTransportProtocol().equals(this.getTransportProtocol()) == false)
            return false;
        if (other.getConnectionsCount() == null ^ this.getConnectionsCount() == null)
            return false;
        if (other.getConnectionsCount() != null && other.getConnectionsCount().equals(this.getConnectionsCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceServerId() == null) ? 0 : getSourceServerId().hashCode());
        hashCode = prime * hashCode + ((getDestinationServerId() == null) ? 0 : getDestinationServerId().hashCode());
        hashCode = prime * hashCode + ((getDestinationPort() == null) ? 0 : getDestinationPort().hashCode());
        hashCode = prime * hashCode + ((getTransportProtocol() == null) ? 0 : getTransportProtocol().hashCode());
        hashCode = prime * hashCode + ((getConnectionsCount() == null) ? 0 : getConnectionsCount().hashCode());
        return hashCode;
    }

    @Override
    public NeighborConnectionDetail clone() {
        try {
            return (NeighborConnectionDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.NeighborConnectionDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
