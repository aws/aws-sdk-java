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
 * Represents a server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/Server" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Server implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the server.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The type of server.
     * </p>
     */
    private String serverType;
    /**
     * <p>
     * Information about the VM server.
     * </p>
     */
    private VmServer vmServer;
    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     */
    private String replicationJobId;
    /**
     * <p>
     * Indicates whether the replication job is deleted or failed.
     * </p>
     */
    private Boolean replicationJobTerminated;

    /**
     * <p>
     * The identifier of the server.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The identifier of the server.
     * </p>
     * 
     * @return The identifier of the server.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The identifier of the server.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Server withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The type of server.
     * </p>
     * 
     * @param serverType
     *        The type of server.
     * @see ServerType
     */

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    /**
     * <p>
     * The type of server.
     * </p>
     * 
     * @return The type of server.
     * @see ServerType
     */

    public String getServerType() {
        return this.serverType;
    }

    /**
     * <p>
     * The type of server.
     * </p>
     * 
     * @param serverType
     *        The type of server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerType
     */

    public Server withServerType(String serverType) {
        setServerType(serverType);
        return this;
    }

    /**
     * <p>
     * The type of server.
     * </p>
     * 
     * @param serverType
     *        The type of server.
     * @see ServerType
     */

    public void setServerType(ServerType serverType) {
        withServerType(serverType);
    }

    /**
     * <p>
     * The type of server.
     * </p>
     * 
     * @param serverType
     *        The type of server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerType
     */

    public Server withServerType(ServerType serverType) {
        this.serverType = serverType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the VM server.
     * </p>
     * 
     * @param vmServer
     *        Information about the VM server.
     */

    public void setVmServer(VmServer vmServer) {
        this.vmServer = vmServer;
    }

    /**
     * <p>
     * Information about the VM server.
     * </p>
     * 
     * @return Information about the VM server.
     */

    public VmServer getVmServer() {
        return this.vmServer;
    }

    /**
     * <p>
     * Information about the VM server.
     * </p>
     * 
     * @param vmServer
     *        Information about the VM server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Server withVmServer(VmServer vmServer) {
        setVmServer(vmServer);
        return this;
    }

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     * 
     * @param replicationJobId
     *        The identifier of the replication job.
     */

    public void setReplicationJobId(String replicationJobId) {
        this.replicationJobId = replicationJobId;
    }

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     * 
     * @return The identifier of the replication job.
     */

    public String getReplicationJobId() {
        return this.replicationJobId;
    }

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     * 
     * @param replicationJobId
     *        The identifier of the replication job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Server withReplicationJobId(String replicationJobId) {
        setReplicationJobId(replicationJobId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the replication job is deleted or failed.
     * </p>
     * 
     * @param replicationJobTerminated
     *        Indicates whether the replication job is deleted or failed.
     */

    public void setReplicationJobTerminated(Boolean replicationJobTerminated) {
        this.replicationJobTerminated = replicationJobTerminated;
    }

    /**
     * <p>
     * Indicates whether the replication job is deleted or failed.
     * </p>
     * 
     * @return Indicates whether the replication job is deleted or failed.
     */

    public Boolean getReplicationJobTerminated() {
        return this.replicationJobTerminated;
    }

    /**
     * <p>
     * Indicates whether the replication job is deleted or failed.
     * </p>
     * 
     * @param replicationJobTerminated
     *        Indicates whether the replication job is deleted or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Server withReplicationJobTerminated(Boolean replicationJobTerminated) {
        setReplicationJobTerminated(replicationJobTerminated);
        return this;
    }

    /**
     * <p>
     * Indicates whether the replication job is deleted or failed.
     * </p>
     * 
     * @return Indicates whether the replication job is deleted or failed.
     */

    public Boolean isReplicationJobTerminated() {
        return this.replicationJobTerminated;
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
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getServerType() != null)
            sb.append("ServerType: ").append(getServerType()).append(",");
        if (getVmServer() != null)
            sb.append("VmServer: ").append(getVmServer()).append(",");
        if (getReplicationJobId() != null)
            sb.append("ReplicationJobId: ").append(getReplicationJobId()).append(",");
        if (getReplicationJobTerminated() != null)
            sb.append("ReplicationJobTerminated: ").append(getReplicationJobTerminated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Server == false)
            return false;
        Server other = (Server) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getServerType() == null ^ this.getServerType() == null)
            return false;
        if (other.getServerType() != null && other.getServerType().equals(this.getServerType()) == false)
            return false;
        if (other.getVmServer() == null ^ this.getVmServer() == null)
            return false;
        if (other.getVmServer() != null && other.getVmServer().equals(this.getVmServer()) == false)
            return false;
        if (other.getReplicationJobId() == null ^ this.getReplicationJobId() == null)
            return false;
        if (other.getReplicationJobId() != null && other.getReplicationJobId().equals(this.getReplicationJobId()) == false)
            return false;
        if (other.getReplicationJobTerminated() == null ^ this.getReplicationJobTerminated() == null)
            return false;
        if (other.getReplicationJobTerminated() != null && other.getReplicationJobTerminated().equals(this.getReplicationJobTerminated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getServerType() == null) ? 0 : getServerType().hashCode());
        hashCode = prime * hashCode + ((getVmServer() == null) ? 0 : getVmServer().hashCode());
        hashCode = prime * hashCode + ((getReplicationJobId() == null) ? 0 : getReplicationJobId().hashCode());
        hashCode = prime * hashCode + ((getReplicationJobTerminated() == null) ? 0 : getReplicationJobTerminated().hashCode());
        return hashCode;
    }

    @Override
    public Server clone() {
        try {
            return (Server) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ServerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
