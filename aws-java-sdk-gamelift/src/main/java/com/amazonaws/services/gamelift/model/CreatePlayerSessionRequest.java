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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePlayerSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the game session to add a player to.
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * Unique identifier for a player. Player IDs are developer-defined.
     * </p>
     */
    private String playerId;
    /**
     * <p>
     * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted
     * as needed for use in the game.
     * </p>
     */
    private String playerData;

    /**
     * <p>
     * Unique identifier for the game session to add a player to.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for the game session to add a player to.
     */

    public void setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for the game session to add a player to.
     * </p>
     * 
     * @return Unique identifier for the game session to add a player to.
     */

    public String getGameSessionId() {
        return this.gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for the game session to add a player to.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for the game session to add a player to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlayerSessionRequest withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a player. Player IDs are developer-defined.
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player. Player IDs are developer-defined.
     */

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    /**
     * <p>
     * Unique identifier for a player. Player IDs are developer-defined.
     * </p>
     * 
     * @return Unique identifier for a player. Player IDs are developer-defined.
     */

    public String getPlayerId() {
        return this.playerId;
    }

    /**
     * <p>
     * Unique identifier for a player. Player IDs are developer-defined.
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player. Player IDs are developer-defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlayerSessionRequest withPlayerId(String playerId) {
        setPlayerId(playerId);
        return this;
    }

    /**
     * <p>
     * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted
     * as needed for use in the game.
     * </p>
     * 
     * @param playerData
     *        Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be
     *        formatted as needed for use in the game.
     */

    public void setPlayerData(String playerData) {
        this.playerData = playerData;
    }

    /**
     * <p>
     * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted
     * as needed for use in the game.
     * </p>
     * 
     * @return Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be
     *         formatted as needed for use in the game.
     */

    public String getPlayerData() {
        return this.playerData;
    }

    /**
     * <p>
     * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted
     * as needed for use in the game.
     * </p>
     * 
     * @param playerData
     *        Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be
     *        formatted as needed for use in the game.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlayerSessionRequest withPlayerData(String playerData) {
        setPlayerData(playerData);
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
        if (getGameSessionId() != null)
            sb.append("GameSessionId: ").append(getGameSessionId()).append(",");
        if (getPlayerId() != null)
            sb.append("PlayerId: ").append(getPlayerId()).append(",");
        if (getPlayerData() != null)
            sb.append("PlayerData: ").append(getPlayerData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePlayerSessionRequest == false)
            return false;
        CreatePlayerSessionRequest other = (CreatePlayerSessionRequest) obj;
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        if (other.getPlayerId() == null ^ this.getPlayerId() == null)
            return false;
        if (other.getPlayerId() != null && other.getPlayerId().equals(this.getPlayerId()) == false)
            return false;
        if (other.getPlayerData() == null ^ this.getPlayerData() == null)
            return false;
        if (other.getPlayerData() != null && other.getPlayerData().equals(this.getPlayerData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameSessionId() == null) ? 0 : getGameSessionId().hashCode());
        hashCode = prime * hashCode + ((getPlayerId() == null) ? 0 : getPlayerId().hashCode());
        hashCode = prime * hashCode + ((getPlayerData() == null) ? 0 : getPlayerData().hashCode());
        return hashCode;
    }

    @Override
    public CreatePlayerSessionRequest clone() {
        return (CreatePlayerSessionRequest) super.clone();
    }

}
