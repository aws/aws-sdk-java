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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGameServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the game server group where the game server is running. Use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * A custom string that uniquely identifies the game server to update.
     * </p>
     */
    private String gameServerId;
    /**
     * <p>
     * A set of custom game server properties, formatted as a single string value. This data is passed to a game client
     * or service when it requests information on game servers using <a>ListGameServers</a> or <a>ClaimGameServer</a>.
     * </p>
     */
    private String gameServerData;
    /**
     * <p>
     * Indicates whether the game server is available or is currently hosting gameplay.
     * </p>
     */
    private String utilizationStatus;
    /**
     * <p>
     * Indicates health status of the game server. A request that includes this parameter updates the game server's
     * <i>LastHealthCheckTime</i> timestamp.
     * </p>
     */
    private String healthCheck;

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

    public UpdateGameServerRequest withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
        return this;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server to update.
     * </p>
     * 
     * @param gameServerId
     *        A custom string that uniquely identifies the game server to update.
     */

    public void setGameServerId(String gameServerId) {
        this.gameServerId = gameServerId;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server to update.
     * </p>
     * 
     * @return A custom string that uniquely identifies the game server to update.
     */

    public String getGameServerId() {
        return this.gameServerId;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server to update.
     * </p>
     * 
     * @param gameServerId
     *        A custom string that uniquely identifies the game server to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameServerRequest withGameServerId(String gameServerId) {
        setGameServerId(gameServerId);
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

    public UpdateGameServerRequest withGameServerData(String gameServerData) {
        setGameServerData(gameServerData);
        return this;
    }

    /**
     * <p>
     * Indicates whether the game server is available or is currently hosting gameplay.
     * </p>
     * 
     * @param utilizationStatus
     *        Indicates whether the game server is available or is currently hosting gameplay.
     * @see GameServerUtilizationStatus
     */

    public void setUtilizationStatus(String utilizationStatus) {
        this.utilizationStatus = utilizationStatus;
    }

    /**
     * <p>
     * Indicates whether the game server is available or is currently hosting gameplay.
     * </p>
     * 
     * @return Indicates whether the game server is available or is currently hosting gameplay.
     * @see GameServerUtilizationStatus
     */

    public String getUtilizationStatus() {
        return this.utilizationStatus;
    }

    /**
     * <p>
     * Indicates whether the game server is available or is currently hosting gameplay.
     * </p>
     * 
     * @param utilizationStatus
     *        Indicates whether the game server is available or is currently hosting gameplay.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerUtilizationStatus
     */

    public UpdateGameServerRequest withUtilizationStatus(String utilizationStatus) {
        setUtilizationStatus(utilizationStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether the game server is available or is currently hosting gameplay.
     * </p>
     * 
     * @param utilizationStatus
     *        Indicates whether the game server is available or is currently hosting gameplay.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerUtilizationStatus
     */

    public UpdateGameServerRequest withUtilizationStatus(GameServerUtilizationStatus utilizationStatus) {
        this.utilizationStatus = utilizationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Indicates health status of the game server. A request that includes this parameter updates the game server's
     * <i>LastHealthCheckTime</i> timestamp.
     * </p>
     * 
     * @param healthCheck
     *        Indicates health status of the game server. A request that includes this parameter updates the game
     *        server's <i>LastHealthCheckTime</i> timestamp.
     * @see GameServerHealthCheck
     */

    public void setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * Indicates health status of the game server. A request that includes this parameter updates the game server's
     * <i>LastHealthCheckTime</i> timestamp.
     * </p>
     * 
     * @return Indicates health status of the game server. A request that includes this parameter updates the game
     *         server's <i>LastHealthCheckTime</i> timestamp.
     * @see GameServerHealthCheck
     */

    public String getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * Indicates health status of the game server. A request that includes this parameter updates the game server's
     * <i>LastHealthCheckTime</i> timestamp.
     * </p>
     * 
     * @param healthCheck
     *        Indicates health status of the game server. A request that includes this parameter updates the game
     *        server's <i>LastHealthCheckTime</i> timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerHealthCheck
     */

    public UpdateGameServerRequest withHealthCheck(String healthCheck) {
        setHealthCheck(healthCheck);
        return this;
    }

    /**
     * <p>
     * Indicates health status of the game server. A request that includes this parameter updates the game server's
     * <i>LastHealthCheckTime</i> timestamp.
     * </p>
     * 
     * @param healthCheck
     *        Indicates health status of the game server. A request that includes this parameter updates the game
     *        server's <i>LastHealthCheckTime</i> timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerHealthCheck
     */

    public UpdateGameServerRequest withHealthCheck(GameServerHealthCheck healthCheck) {
        this.healthCheck = healthCheck.toString();
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
        if (getGameServerData() != null)
            sb.append("GameServerData: ").append(getGameServerData()).append(",");
        if (getUtilizationStatus() != null)
            sb.append("UtilizationStatus: ").append(getUtilizationStatus()).append(",");
        if (getHealthCheck() != null)
            sb.append("HealthCheck: ").append(getHealthCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGameServerRequest == false)
            return false;
        UpdateGameServerRequest other = (UpdateGameServerRequest) obj;
        if (other.getGameServerGroupName() == null ^ this.getGameServerGroupName() == null)
            return false;
        if (other.getGameServerGroupName() != null && other.getGameServerGroupName().equals(this.getGameServerGroupName()) == false)
            return false;
        if (other.getGameServerId() == null ^ this.getGameServerId() == null)
            return false;
        if (other.getGameServerId() != null && other.getGameServerId().equals(this.getGameServerId()) == false)
            return false;
        if (other.getGameServerData() == null ^ this.getGameServerData() == null)
            return false;
        if (other.getGameServerData() != null && other.getGameServerData().equals(this.getGameServerData()) == false)
            return false;
        if (other.getUtilizationStatus() == null ^ this.getUtilizationStatus() == null)
            return false;
        if (other.getUtilizationStatus() != null && other.getUtilizationStatus().equals(this.getUtilizationStatus()) == false)
            return false;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getGameServerId() == null) ? 0 : getGameServerId().hashCode());
        hashCode = prime * hashCode + ((getGameServerData() == null) ? 0 : getGameServerData().hashCode());
        hashCode = prime * hashCode + ((getUtilizationStatus() == null) ? 0 : getUtilizationStatus().hashCode());
        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGameServerRequest clone() {
        return (UpdateGameServerRequest) super.clone();
    }

}
