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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RegisterGameServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterGameServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the game server group where the game server is running. Use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * A custom string that uniquely identifies the game server to register. Game server IDs are developer-defined and
     * must be unique across all game server groups in your AWS account.
     * </p>
     */
    private String gameServerId;
    /**
     * <p>
     * The unique identifier for the instance where the game server is running. This ID is available in the instance
     * metadata. EC2 instance IDs use a 17-character format, for example: <code>i-1234567890abcdef0</code>.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Information that is needed to make inbound client connections to the game server. This might include the IP
     * address and port, DNS name, and other information.
     * </p>
     */
    private String connectionInfo;
    /**
     * <p>
     * A set of custom game server properties, formatted as a single string value. This data is passed to a game client
     * or service when it requests information on game servers using <a>ListGameServers</a> or <a>ClaimGameServer</a>.
     * </p>
     */
    private String gameServerData;

    /**
     * <p>
     * A unique identifier for the game server group where the game server is running. Use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        A unique identifier for the game server group where the game server is running. Use either the
     *        <a>GameServerGroup</a> name or ARN value.
     */

    public void setGameServerGroupName(String gameServerGroupName) {
        this.gameServerGroupName = gameServerGroupName;
    }

    /**
     * <p>
     * A unique identifier for the game server group where the game server is running. Use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @return A unique identifier for the game server group where the game server is running. Use either the
     *         <a>GameServerGroup</a> name or ARN value.
     */

    public String getGameServerGroupName() {
        return this.gameServerGroupName;
    }

    /**
     * <p>
     * A unique identifier for the game server group where the game server is running. Use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        A unique identifier for the game server group where the game server is running. Use either the
     *        <a>GameServerGroup</a> name or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterGameServerRequest withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
        return this;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server to register. Game server IDs are developer-defined and
     * must be unique across all game server groups in your AWS account.
     * </p>
     * 
     * @param gameServerId
     *        A custom string that uniquely identifies the game server to register. Game server IDs are
     *        developer-defined and must be unique across all game server groups in your AWS account.
     */

    public void setGameServerId(String gameServerId) {
        this.gameServerId = gameServerId;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server to register. Game server IDs are developer-defined and
     * must be unique across all game server groups in your AWS account.
     * </p>
     * 
     * @return A custom string that uniquely identifies the game server to register. Game server IDs are
     *         developer-defined and must be unique across all game server groups in your AWS account.
     */

    public String getGameServerId() {
        return this.gameServerId;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server to register. Game server IDs are developer-defined and
     * must be unique across all game server groups in your AWS account.
     * </p>
     * 
     * @param gameServerId
     *        A custom string that uniquely identifies the game server to register. Game server IDs are
     *        developer-defined and must be unique across all game server groups in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterGameServerRequest withGameServerId(String gameServerId) {
        setGameServerId(gameServerId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the instance where the game server is running. This ID is available in the instance
     * metadata. EC2 instance IDs use a 17-character format, for example: <code>i-1234567890abcdef0</code>.
     * </p>
     * 
     * @param instanceId
     *        The unique identifier for the instance where the game server is running. This ID is available in the
     *        instance metadata. EC2 instance IDs use a 17-character format, for example:
     *        <code>i-1234567890abcdef0</code>.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The unique identifier for the instance where the game server is running. This ID is available in the instance
     * metadata. EC2 instance IDs use a 17-character format, for example: <code>i-1234567890abcdef0</code>.
     * </p>
     * 
     * @return The unique identifier for the instance where the game server is running. This ID is available in the
     *         instance metadata. EC2 instance IDs use a 17-character format, for example:
     *         <code>i-1234567890abcdef0</code>.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The unique identifier for the instance where the game server is running. This ID is available in the instance
     * metadata. EC2 instance IDs use a 17-character format, for example: <code>i-1234567890abcdef0</code>.
     * </p>
     * 
     * @param instanceId
     *        The unique identifier for the instance where the game server is running. This ID is available in the
     *        instance metadata. EC2 instance IDs use a 17-character format, for example:
     *        <code>i-1234567890abcdef0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterGameServerRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Information that is needed to make inbound client connections to the game server. This might include the IP
     * address and port, DNS name, and other information.
     * </p>
     * 
     * @param connectionInfo
     *        Information that is needed to make inbound client connections to the game server. This might include the
     *        IP address and port, DNS name, and other information.
     */

    public void setConnectionInfo(String connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    /**
     * <p>
     * Information that is needed to make inbound client connections to the game server. This might include the IP
     * address and port, DNS name, and other information.
     * </p>
     * 
     * @return Information that is needed to make inbound client connections to the game server. This might include the
     *         IP address and port, DNS name, and other information.
     */

    public String getConnectionInfo() {
        return this.connectionInfo;
    }

    /**
     * <p>
     * Information that is needed to make inbound client connections to the game server. This might include the IP
     * address and port, DNS name, and other information.
     * </p>
     * 
     * @param connectionInfo
     *        Information that is needed to make inbound client connections to the game server. This might include the
     *        IP address and port, DNS name, and other information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterGameServerRequest withConnectionInfo(String connectionInfo) {
        setConnectionInfo(connectionInfo);
        return this;
    }

    /**
     * <p>
     * A set of custom game server properties, formatted as a single string value. This data is passed to a game client
     * or service when it requests information on game servers using <a>ListGameServers</a> or <a>ClaimGameServer</a>.
     * </p>
     * 
     * @param gameServerData
     *        A set of custom game server properties, formatted as a single string value. This data is passed to a game
     *        client or service when it requests information on game servers using <a>ListGameServers</a> or
     *        <a>ClaimGameServer</a>.
     */

    public void setGameServerData(String gameServerData) {
        this.gameServerData = gameServerData;
    }

    /**
     * <p>
     * A set of custom game server properties, formatted as a single string value. This data is passed to a game client
     * or service when it requests information on game servers using <a>ListGameServers</a> or <a>ClaimGameServer</a>.
     * </p>
     * 
     * @return A set of custom game server properties, formatted as a single string value. This data is passed to a game
     *         client or service when it requests information on game servers using <a>ListGameServers</a> or
     *         <a>ClaimGameServer</a>.
     */

    public String getGameServerData() {
        return this.gameServerData;
    }

    /**
     * <p>
     * A set of custom game server properties, formatted as a single string value. This data is passed to a game client
     * or service when it requests information on game servers using <a>ListGameServers</a> or <a>ClaimGameServer</a>.
     * </p>
     * 
     * @param gameServerData
     *        A set of custom game server properties, formatted as a single string value. This data is passed to a game
     *        client or service when it requests information on game servers using <a>ListGameServers</a> or
     *        <a>ClaimGameServer</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterGameServerRequest withGameServerData(String gameServerData) {
        setGameServerData(gameServerData);
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
        if (getGameServerGroupName() != null)
            sb.append("GameServerGroupName: ").append(getGameServerGroupName()).append(",");
        if (getGameServerId() != null)
            sb.append("GameServerId: ").append(getGameServerId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getConnectionInfo() != null)
            sb.append("ConnectionInfo: ").append(getConnectionInfo()).append(",");
        if (getGameServerData() != null)
            sb.append("GameServerData: ").append(getGameServerData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterGameServerRequest == false)
            return false;
        RegisterGameServerRequest other = (RegisterGameServerRequest) obj;
        if (other.getGameServerGroupName() == null ^ this.getGameServerGroupName() == null)
            return false;
        if (other.getGameServerGroupName() != null && other.getGameServerGroupName().equals(this.getGameServerGroupName()) == false)
            return false;
        if (other.getGameServerId() == null ^ this.getGameServerId() == null)
            return false;
        if (other.getGameServerId() != null && other.getGameServerId().equals(this.getGameServerId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getConnectionInfo() == null ^ this.getConnectionInfo() == null)
            return false;
        if (other.getConnectionInfo() != null && other.getConnectionInfo().equals(this.getConnectionInfo()) == false)
            return false;
        if (other.getGameServerData() == null ^ this.getGameServerData() == null)
            return false;
        if (other.getGameServerData() != null && other.getGameServerData().equals(this.getGameServerData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getGameServerId() == null) ? 0 : getGameServerId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getConnectionInfo() == null) ? 0 : getConnectionInfo().hashCode());
        hashCode = prime * hashCode + ((getGameServerData() == null) ? 0 : getGameServerData().hashCode());
        return hashCode;
    }

    @Override
    public RegisterGameServerRequest clone() {
        return (RegisterGameServerRequest) super.clone();
    }

}
