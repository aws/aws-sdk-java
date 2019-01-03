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
 * Replication configuration for a server group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ServerGroupReplicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerGroupReplicationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the server group this replication configuration is associated with.
     * </p>
     */
    private String serverGroupId;
    /**
     * <p>
     * Replication configuration for servers in the server group.
     * </p>
     */
    private java.util.List<ServerReplicationConfiguration> serverReplicationConfigurations;

    /**
     * <p>
     * Identifier of the server group this replication configuration is associated with.
     * </p>
     * 
     * @param serverGroupId
     *        Identifier of the server group this replication configuration is associated with.
     */

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    /**
     * <p>
     * Identifier of the server group this replication configuration is associated with.
     * </p>
     * 
     * @return Identifier of the server group this replication configuration is associated with.
     */

    public String getServerGroupId() {
        return this.serverGroupId;
    }

    /**
     * <p>
     * Identifier of the server group this replication configuration is associated with.
     * </p>
     * 
     * @param serverGroupId
     *        Identifier of the server group this replication configuration is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroupReplicationConfiguration withServerGroupId(String serverGroupId) {
        setServerGroupId(serverGroupId);
        return this;
    }

    /**
     * <p>
     * Replication configuration for servers in the server group.
     * </p>
     * 
     * @return Replication configuration for servers in the server group.
     */

    public java.util.List<ServerReplicationConfiguration> getServerReplicationConfigurations() {
        return serverReplicationConfigurations;
    }

    /**
     * <p>
     * Replication configuration for servers in the server group.
     * </p>
     * 
     * @param serverReplicationConfigurations
     *        Replication configuration for servers in the server group.
     */

    public void setServerReplicationConfigurations(java.util.Collection<ServerReplicationConfiguration> serverReplicationConfigurations) {
        if (serverReplicationConfigurations == null) {
            this.serverReplicationConfigurations = null;
            return;
        }

        this.serverReplicationConfigurations = new java.util.ArrayList<ServerReplicationConfiguration>(serverReplicationConfigurations);
    }

    /**
     * <p>
     * Replication configuration for servers in the server group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerReplicationConfigurations(java.util.Collection)} or
     * {@link #withServerReplicationConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param serverReplicationConfigurations
     *        Replication configuration for servers in the server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroupReplicationConfiguration withServerReplicationConfigurations(ServerReplicationConfiguration... serverReplicationConfigurations) {
        if (this.serverReplicationConfigurations == null) {
            setServerReplicationConfigurations(new java.util.ArrayList<ServerReplicationConfiguration>(serverReplicationConfigurations.length));
        }
        for (ServerReplicationConfiguration ele : serverReplicationConfigurations) {
            this.serverReplicationConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Replication configuration for servers in the server group.
     * </p>
     * 
     * @param serverReplicationConfigurations
     *        Replication configuration for servers in the server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroupReplicationConfiguration withServerReplicationConfigurations(
            java.util.Collection<ServerReplicationConfiguration> serverReplicationConfigurations) {
        setServerReplicationConfigurations(serverReplicationConfigurations);
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
        if (getServerGroupId() != null)
            sb.append("ServerGroupId: ").append(getServerGroupId()).append(",");
        if (getServerReplicationConfigurations() != null)
            sb.append("ServerReplicationConfigurations: ").append(getServerReplicationConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerGroupReplicationConfiguration == false)
            return false;
        ServerGroupReplicationConfiguration other = (ServerGroupReplicationConfiguration) obj;
        if (other.getServerGroupId() == null ^ this.getServerGroupId() == null)
            return false;
        if (other.getServerGroupId() != null && other.getServerGroupId().equals(this.getServerGroupId()) == false)
            return false;
        if (other.getServerReplicationConfigurations() == null ^ this.getServerReplicationConfigurations() == null)
            return false;
        if (other.getServerReplicationConfigurations() != null
                && other.getServerReplicationConfigurations().equals(this.getServerReplicationConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerGroupId() == null) ? 0 : getServerGroupId().hashCode());
        hashCode = prime * hashCode + ((getServerReplicationConfigurations() == null) ? 0 : getServerReplicationConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ServerGroupReplicationConfiguration clone() {
        try {
            return (ServerGroupReplicationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ServerGroupReplicationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
