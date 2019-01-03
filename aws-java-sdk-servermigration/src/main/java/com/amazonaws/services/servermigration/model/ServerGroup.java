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
 * A logical grouping of servers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ServerGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of a server group.
     * </p>
     */
    private String serverGroupId;
    /**
     * <p>
     * Name of a server group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * List of servers belonging to a server group.
     * </p>
     */
    private java.util.List<Server> serverList;

    /**
     * <p>
     * Identifier of a server group.
     * </p>
     * 
     * @param serverGroupId
     *        Identifier of a server group.
     */

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    /**
     * <p>
     * Identifier of a server group.
     * </p>
     * 
     * @return Identifier of a server group.
     */

    public String getServerGroupId() {
        return this.serverGroupId;
    }

    /**
     * <p>
     * Identifier of a server group.
     * </p>
     * 
     * @param serverGroupId
     *        Identifier of a server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroup withServerGroupId(String serverGroupId) {
        setServerGroupId(serverGroupId);
        return this;
    }

    /**
     * <p>
     * Name of a server group.
     * </p>
     * 
     * @param name
     *        Name of a server group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of a server group.
     * </p>
     * 
     * @return Name of a server group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of a server group.
     * </p>
     * 
     * @param name
     *        Name of a server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * List of servers belonging to a server group.
     * </p>
     * 
     * @return List of servers belonging to a server group.
     */

    public java.util.List<Server> getServerList() {
        return serverList;
    }

    /**
     * <p>
     * List of servers belonging to a server group.
     * </p>
     * 
     * @param serverList
     *        List of servers belonging to a server group.
     */

    public void setServerList(java.util.Collection<Server> serverList) {
        if (serverList == null) {
            this.serverList = null;
            return;
        }

        this.serverList = new java.util.ArrayList<Server>(serverList);
    }

    /**
     * <p>
     * List of servers belonging to a server group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerList(java.util.Collection)} or {@link #withServerList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serverList
     *        List of servers belonging to a server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroup withServerList(Server... serverList) {
        if (this.serverList == null) {
            setServerList(new java.util.ArrayList<Server>(serverList.length));
        }
        for (Server ele : serverList) {
            this.serverList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of servers belonging to a server group.
     * </p>
     * 
     * @param serverList
     *        List of servers belonging to a server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerGroup withServerList(java.util.Collection<Server> serverList) {
        setServerList(serverList);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getServerList() != null)
            sb.append("ServerList: ").append(getServerList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerGroup == false)
            return false;
        ServerGroup other = (ServerGroup) obj;
        if (other.getServerGroupId() == null ^ this.getServerGroupId() == null)
            return false;
        if (other.getServerGroupId() != null && other.getServerGroupId().equals(this.getServerGroupId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServerList() == null ^ this.getServerList() == null)
            return false;
        if (other.getServerList() != null && other.getServerList().equals(this.getServerList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerGroupId() == null) ? 0 : getServerGroupId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServerList() == null) ? 0 : getServerList().hashCode());
        return hashCode;
    }

    @Override
    public ServerGroup clone() {
        try {
            return (ServerGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ServerGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
