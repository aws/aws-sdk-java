/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ClaimGameServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClaimGameServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An identifier for the game server group. When claiming a specific game server, this is the game server group
     * whether the game server is located. When requesting that GameLift FleetIQ locate an available game server, this
     * is the game server group to search on. You can use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * A custom string that uniquely identifies the game server to claim. If this parameter is left empty, GameLift
     * FleetIQ searches for an available game server in the specified game server group.
     * </p>
     */
    private String gameServerId;
    /**
     * <p>
     * A set of custom game server properties, formatted as a single string value, to be passed to the claimed game
     * server.
     * </p>
     */
    private String gameServerData;

    /**
     * <p>
     * An identifier for the game server group. When claiming a specific game server, this is the game server group
     * whether the game server is located. When requesting that GameLift FleetIQ locate an available game server, this
     * is the game server group to search on. You can use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        An identifier for the game server group. When claiming a specific game server, this is the game server
     *        group whether the game server is located. When requesting that GameLift FleetIQ locate an available game
     *        server, this is the game server group to search on. You can use either the <a>GameServerGroup</a> name or
     *        ARN value.
     */

    public void setGameServerGroupName(String gameServerGroupName) {
        this.gameServerGroupName = gameServerGroupName;
    }

    /**
     * <p>
     * An identifier for the game server group. When claiming a specific game server, this is the game server group
     * whether the game server is located. When requesting that GameLift FleetIQ locate an available game server, this
     * is the game server group to search on. You can use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @return An identifier for the game server group. When claiming a specific game server, this is the game server
     *         group whether the game server is located. When requesting that GameLift FleetIQ locate an available game
     *         server, this is the game server group to search on. You can use either the <a>GameServerGroup</a> name or
     *         ARN value.
     */

    public String getGameServerGroupName() {
        return this.gameServerGroupName;
    }

    /**
     * <p>
     * An identifier for the game server group. When claiming a specific game server, this is the game server group
     * whether the game server is located. When requesting that GameLift FleetIQ locate an available game server, this
     * is the game server group to search on. You can use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        An identifier for the game server group. When claiming a specific game server, this is the game server
     *        group whether the game server is located. When requesting that GameLift FleetIQ locate an available game
     *        server, this is the game server group to search on. You can use either the <a>GameServerGroup</a> name or
     *        ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimGameServerRequest withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
        return this;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server to claim. If this parameter is left empty, GameLift
     * FleetIQ searches for an available game server in the specified game server group.
     * </p>
     * 
     * @param gameServerId
     *        A custom string that uniquely identifies the game server to claim. If this parameter is left empty,
     *        GameLift FleetIQ searches for an available game server in the specified game server group.
     */

    public void setGameServerId(String gameServerId) {
        this.gameServerId = gameServerId;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server to claim. If this parameter is left empty, GameLift
     * FleetIQ searches for an available game server in the specified game server group.
     * </p>
     * 
     * @return A custom string that uniquely identifies the game server to claim. If this parameter is left empty,
     *         GameLift FleetIQ searches for an available game server in the specified game server group.
     */

    public String getGameServerId() {
        return this.gameServerId;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server to claim. If this parameter is left empty, GameLift
     * FleetIQ searches for an available game server in the specified game server group.
     * </p>
     * 
     * @param gameServerId
     *        A custom string that uniquely identifies the game server to claim. If this parameter is left empty,
     *        GameLift FleetIQ searches for an available game server in the specified game server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimGameServerRequest withGameServerId(String gameServerId) {
        setGameServerId(gameServerId);
        return this;
    }

    /**
     * <p>
     * A set of custom game server properties, formatted as a single string value, to be passed to the claimed game
     * server.
     * </p>
     * 
     * @param gameServerData
     *        A set of custom game server properties, formatted as a single string value, to be passed to the claimed
     *        game server.
     */

    public void setGameServerData(String gameServerData) {
        this.gameServerData = gameServerData;
    }

    /**
     * <p>
     * A set of custom game server properties, formatted as a single string value, to be passed to the claimed game
     * server.
     * </p>
     * 
     * @return A set of custom game server properties, formatted as a single string value, to be passed to the claimed
     *         game server.
     */

    public String getGameServerData() {
        return this.gameServerData;
    }

    /**
     * <p>
     * A set of custom game server properties, formatted as a single string value, to be passed to the claimed game
     * server.
     * </p>
     * 
     * @param gameServerData
     *        A set of custom game server properties, formatted as a single string value, to be passed to the claimed
     *        game server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimGameServerRequest withGameServerData(String gameServerData) {
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

        if (obj instanceof ClaimGameServerRequest == false)
            return false;
        ClaimGameServerRequest other = (ClaimGameServerRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getGameServerId() == null) ? 0 : getGameServerId().hashCode());
        hashCode = prime * hashCode + ((getGameServerData() == null) ? 0 : getGameServerData().hashCode());
        return hashCode;
    }

    @Override
    public ClaimGameServerRequest clone() {
        return (ClaimGameServerRequest) super.clone();
    }

}
