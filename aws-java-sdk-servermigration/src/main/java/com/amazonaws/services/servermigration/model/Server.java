/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Object representing a server
 */
public class Server implements Serializable, Cloneable {

    private String serverId;

    private String serverType;

    private VmServer vmServer;

    private String replicationJobId;

    private Boolean replicationJobTerminated;

    /**
     * @param serverId
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * @return
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * @param serverId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Server withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * @param serverType
     * @see ServerType
     */

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    /**
     * @return
     * @see ServerType
     */

    public String getServerType() {
        return this.serverType;
    }

    /**
     * @param serverType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerType
     */

    public Server withServerType(String serverType) {
        setServerType(serverType);
        return this;
    }

    /**
     * @param serverType
     * @see ServerType
     */

    public void setServerType(ServerType serverType) {
        this.serverType = serverType.toString();
    }

    /**
     * @param serverType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerType
     */

    public Server withServerType(ServerType serverType) {
        setServerType(serverType);
        return this;
    }

    /**
     * @param vmServer
     */

    public void setVmServer(VmServer vmServer) {
        this.vmServer = vmServer;
    }

    /**
     * @return
     */

    public VmServer getVmServer() {
        return this.vmServer;
    }

    /**
     * @param vmServer
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Server withVmServer(VmServer vmServer) {
        setVmServer(vmServer);
        return this;
    }

    /**
     * @param replicationJobId
     */

    public void setReplicationJobId(String replicationJobId) {
        this.replicationJobId = replicationJobId;
    }

    /**
     * @return
     */

    public String getReplicationJobId() {
        return this.replicationJobId;
    }

    /**
     * @param replicationJobId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Server withReplicationJobId(String replicationJobId) {
        setReplicationJobId(replicationJobId);
        return this;
    }

    /**
     * @param replicationJobTerminated
     */

    public void setReplicationJobTerminated(Boolean replicationJobTerminated) {
        this.replicationJobTerminated = replicationJobTerminated;
    }

    /**
     * @return
     */

    public Boolean getReplicationJobTerminated() {
        return this.replicationJobTerminated;
    }

    /**
     * @param replicationJobTerminated
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Server withReplicationJobTerminated(Boolean replicationJobTerminated) {
        setReplicationJobTerminated(replicationJobTerminated);
        return this;
    }

    /**
     * @return
     */

    public Boolean isReplicationJobTerminated() {
        return this.replicationJobTerminated;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ServerId: " + getServerId() + ",");
        if (getServerType() != null)
            sb.append("ServerType: " + getServerType() + ",");
        if (getVmServer() != null)
            sb.append("VmServer: " + getVmServer() + ",");
        if (getReplicationJobId() != null)
            sb.append("ReplicationJobId: " + getReplicationJobId() + ",");
        if (getReplicationJobTerminated() != null)
            sb.append("ReplicationJobTerminated: " + getReplicationJobTerminated());
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
}
