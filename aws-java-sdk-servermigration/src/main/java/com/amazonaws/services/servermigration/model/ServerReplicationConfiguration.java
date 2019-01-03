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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Replication configuration of a server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ServerReplicationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerReplicationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the server this replication configuration is associated with.
     * </p>
     */
    private Server server;
    /**
     * <p>
     * Parameters for replicating the server.
     * </p>
     */
    private ServerReplicationParameters serverReplicationParameters;

    /**
     * <p>
     * Identifier of the server this replication configuration is associated with.
     * </p>
     * 
     * @param server
     *        Identifier of the server this replication configuration is associated with.
     */

    public void setServer(Server server) {
        this.server = server;
    }

    /**
     * <p>
     * Identifier of the server this replication configuration is associated with.
     * </p>
     * 
     * @return Identifier of the server this replication configuration is associated with.
     */

    public Server getServer() {
        return this.server;
    }

    /**
     * <p>
     * Identifier of the server this replication configuration is associated with.
     * </p>
     * 
     * @param server
     *        Identifier of the server this replication configuration is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerReplicationConfiguration withServer(Server server) {
        setServer(server);
        return this;
    }

    /**
     * <p>
     * Parameters for replicating the server.
     * </p>
     * 
     * @param serverReplicationParameters
     *        Parameters for replicating the server.
     */

    public void setServerReplicationParameters(ServerReplicationParameters serverReplicationParameters) {
        this.serverReplicationParameters = serverReplicationParameters;
    }

    /**
     * <p>
     * Parameters for replicating the server.
     * </p>
     * 
     * @return Parameters for replicating the server.
     */

    public ServerReplicationParameters getServerReplicationParameters() {
        return this.serverReplicationParameters;
    }

    /**
     * <p>
     * Parameters for replicating the server.
     * </p>
     * 
     * @param serverReplicationParameters
     *        Parameters for replicating the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerReplicationConfiguration withServerReplicationParameters(ServerReplicationParameters serverReplicationParameters) {
        setServerReplicationParameters(serverReplicationParameters);
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
        if (getServer() != null)
            sb.append("Server: ").append(getServer()).append(",");
        if (getServerReplicationParameters() != null)
            sb.append("ServerReplicationParameters: ").append(getServerReplicationParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerReplicationConfiguration == false)
            return false;
        ServerReplicationConfiguration other = (ServerReplicationConfiguration) obj;
        if (other.getServer() == null ^ this.getServer() == null)
            return false;
        if (other.getServer() != null && other.getServer().equals(this.getServer()) == false)
            return false;
        if (other.getServerReplicationParameters() == null ^ this.getServerReplicationParameters() == null)
            return false;
        if (other.getServerReplicationParameters() != null && other.getServerReplicationParameters().equals(this.getServerReplicationParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServer() == null) ? 0 : getServer().hashCode());
        hashCode = prime * hashCode + ((getServerReplicationParameters() == null) ? 0 : getServerReplicationParameters().hashCode());
        return hashCode;
    }

    @Override
    public ServerReplicationConfiguration clone() {
        try {
            return (ServerReplicationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ServerReplicationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
