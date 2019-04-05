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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Player information for use when creating player sessions using a game session placement request with
 * <a>StartGameSessionPlacement</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DesiredPlayerSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DesiredPlayerSession implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a player to associate with the player session.
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
     * Unique identifier for a player to associate with the player session.
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player to associate with the player session.
     */

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    /**
     * <p>
     * Unique identifier for a player to associate with the player session.
     * </p>
     * 
     * @return Unique identifier for a player to associate with the player session.
     */

    public String getPlayerId() {
        return this.playerId;
    }

    /**
     * <p>
     * Unique identifier for a player to associate with the player session.
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player to associate with the player session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DesiredPlayerSession withPlayerId(String playerId) {
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

    public DesiredPlayerSession withPlayerData(String playerData) {
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

        if (obj instanceof DesiredPlayerSession == false)
            return false;
        DesiredPlayerSession other = (DesiredPlayerSession) obj;
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

        hashCode = prime * hashCode + ((getPlayerId() == null) ? 0 : getPlayerId().hashCode());
        hashCode = prime * hashCode + ((getPlayerData() == null) ? 0 : getPlayerData().hashCode());
        return hashCode;
    }

    @Override
    public DesiredPlayerSession clone() {
        try {
            return (DesiredPlayerSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.DesiredPlayerSessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
