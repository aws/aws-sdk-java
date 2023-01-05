/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a server in a Fleet Advisor collector inventory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ServerShortInfoResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerShortInfoResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a server in a Fleet Advisor collector inventory.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The IP address of a server in a Fleet Advisor collector inventory.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The name address of a server in a Fleet Advisor collector inventory.
     * </p>
     */
    private String serverName;

    /**
     * <p>
     * The ID of a server in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param serverId
     *        The ID of a server in a Fleet Advisor collector inventory.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The ID of a server in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The ID of a server in a Fleet Advisor collector inventory.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The ID of a server in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param serverId
     *        The ID of a server in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerShortInfoResponse withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The IP address of a server in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of a server in a Fleet Advisor collector inventory.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address of a server in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The IP address of a server in a Fleet Advisor collector inventory.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address of a server in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of a server in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerShortInfoResponse withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The name address of a server in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param serverName
     *        The name address of a server in a Fleet Advisor collector inventory.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name address of a server in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @return The name address of a server in a Fleet Advisor collector inventory.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name address of a server in a Fleet Advisor collector inventory.
     * </p>
     * 
     * @param serverName
     *        The name address of a server in a Fleet Advisor collector inventory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerShortInfoResponse withServerName(String serverName) {
        setServerName(serverName);
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
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerShortInfoResponse == false)
            return false;
        ServerShortInfoResponse other = (ServerShortInfoResponse) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        return hashCode;
    }

    @Override
    public ServerShortInfoResponse clone() {
        try {
            return (ServerShortInfoResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ServerShortInfoResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
