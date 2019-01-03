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
 * Launch configuration for a server group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ServerGroupLaunchConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerGroupLaunchConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the server group the launch configuration is associated with.
     * </p>
     */
    private String serverGroupId;
    /**
     * <p>
     * Launch order of servers in the server group.
     * </p>
     */
    private Integer launchOrder;
    /**
     * <p>
     * Launch configuration for servers in the server group.
     * </p>
     */
    private java.util.List<ServerLaunchConfiguration> serverLaunchConfigurations;

    /**
     * <p>
     * Identifier of the server group the launch configuration is associated with.
     * </p>
     * 
     * @param serverGroupId
     *        Identifier of the server group the launch configuration is associated with.
     */

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    /**
     * <p>
     * Identifier of the server group the launch configuration is associated with.
     * </p>
     * 
     * @return Identifier of the server group the launch configuration is associated with.
     */

    public String getServerGroupId() {
        return this.serverGroupId;
    }

    /**
     * <p>
     * Identifier of the server group the launch configuration is associated with.
     * </p>
     * 
     * @param serverGroupId
     *        Identifier of the server group the launch configuration is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroupLaunchConfiguration withServerGroupId(String serverGroupId) {
        setServerGroupId(serverGroupId);
        return this;
    }

    /**
     * <p>
     * Launch order of servers in the server group.
     * </p>
     * 
     * @param launchOrder
     *        Launch order of servers in the server group.
     */

    public void setLaunchOrder(Integer launchOrder) {
        this.launchOrder = launchOrder;
    }

    /**
     * <p>
     * Launch order of servers in the server group.
     * </p>
     * 
     * @return Launch order of servers in the server group.
     */

    public Integer getLaunchOrder() {
        return this.launchOrder;
    }

    /**
     * <p>
     * Launch order of servers in the server group.
     * </p>
     * 
     * @param launchOrder
     *        Launch order of servers in the server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroupLaunchConfiguration withLaunchOrder(Integer launchOrder) {
        setLaunchOrder(launchOrder);
        return this;
    }

    /**
     * <p>
     * Launch configuration for servers in the server group.
     * </p>
     * 
     * @return Launch configuration for servers in the server group.
     */

    public java.util.List<ServerLaunchConfiguration> getServerLaunchConfigurations() {
        return serverLaunchConfigurations;
    }

    /**
     * <p>
     * Launch configuration for servers in the server group.
     * </p>
     * 
     * @param serverLaunchConfigurations
     *        Launch configuration for servers in the server group.
     */

    public void setServerLaunchConfigurations(java.util.Collection<ServerLaunchConfiguration> serverLaunchConfigurations) {
        if (serverLaunchConfigurations == null) {
            this.serverLaunchConfigurations = null;
            return;
        }

        this.serverLaunchConfigurations = new java.util.ArrayList<ServerLaunchConfiguration>(serverLaunchConfigurations);
    }

    /**
     * <p>
     * Launch configuration for servers in the server group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerLaunchConfigurations(java.util.Collection)} or
     * {@link #withServerLaunchConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param serverLaunchConfigurations
     *        Launch configuration for servers in the server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroupLaunchConfiguration withServerLaunchConfigurations(ServerLaunchConfiguration... serverLaunchConfigurations) {
        if (this.serverLaunchConfigurations == null) {
            setServerLaunchConfigurations(new java.util.ArrayList<ServerLaunchConfiguration>(serverLaunchConfigurations.length));
        }
        for (ServerLaunchConfiguration ele : serverLaunchConfigurations) {
            this.serverLaunchConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Launch configuration for servers in the server group.
     * </p>
     * 
     * @param serverLaunchConfigurations
     *        Launch configuration for servers in the server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroupLaunchConfiguration withServerLaunchConfigurations(java.util.Collection<ServerLaunchConfiguration> serverLaunchConfigurations) {
        setServerLaunchConfigurations(serverLaunchConfigurations);
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
        if (getLaunchOrder() != null)
            sb.append("LaunchOrder: ").append(getLaunchOrder()).append(",");
        if (getServerLaunchConfigurations() != null)
            sb.append("ServerLaunchConfigurations: ").append(getServerLaunchConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerGroupLaunchConfiguration == false)
            return false;
        ServerGroupLaunchConfiguration other = (ServerGroupLaunchConfiguration) obj;
        if (other.getServerGroupId() == null ^ this.getServerGroupId() == null)
            return false;
        if (other.getServerGroupId() != null && other.getServerGroupId().equals(this.getServerGroupId()) == false)
            return false;
        if (other.getLaunchOrder() == null ^ this.getLaunchOrder() == null)
            return false;
        if (other.getLaunchOrder() != null && other.getLaunchOrder().equals(this.getLaunchOrder()) == false)
            return false;
        if (other.getServerLaunchConfigurations() == null ^ this.getServerLaunchConfigurations() == null)
            return false;
        if (other.getServerLaunchConfigurations() != null && other.getServerLaunchConfigurations().equals(this.getServerLaunchConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerGroupId() == null) ? 0 : getServerGroupId().hashCode());
        hashCode = prime * hashCode + ((getLaunchOrder() == null) ? 0 : getLaunchOrder().hashCode());
        hashCode = prime * hashCode + ((getServerLaunchConfigurations() == null) ? 0 : getServerLaunchConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ServerGroupLaunchConfiguration clone() {
        try {
            return (ServerGroupLaunchConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ServerGroupLaunchConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
