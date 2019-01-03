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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSessions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePlayerSessionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the game session to add players to.
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * List of unique identifiers for the players to be added.
     * </p>
     */
    private java.util.List<String> playerIds;
    /**
     * <p>
     * Map of string pairs, each specifying a player ID and a set of developer-defined information related to the
     * player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game. Player data
     * strings for player IDs not included in the <code>PlayerIds</code> parameter are ignored.
     * </p>
     */
    private java.util.Map<String, String> playerDataMap;

    /**
     * <p>
     * Unique identifier for the game session to add players to.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for the game session to add players to.
     */

    public void setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for the game session to add players to.
     * </p>
     * 
     * @return Unique identifier for the game session to add players to.
     */

    public String getGameSessionId() {
        return this.gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for the game session to add players to.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for the game session to add players to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlayerSessionsRequest withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * <p>
     * List of unique identifiers for the players to be added.
     * </p>
     * 
     * @return List of unique identifiers for the players to be added.
     */

    public java.util.List<String> getPlayerIds() {
        return playerIds;
    }

    /**
     * <p>
     * List of unique identifiers for the players to be added.
     * </p>
     * 
     * @param playerIds
     *        List of unique identifiers for the players to be added.
     */

    public void setPlayerIds(java.util.Collection<String> playerIds) {
        if (playerIds == null) {
            this.playerIds = null;
            return;
        }

        this.playerIds = new java.util.ArrayList<String>(playerIds);
    }

    /**
     * <p>
     * List of unique identifiers for the players to be added.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlayerIds(java.util.Collection)} or {@link #withPlayerIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param playerIds
     *        List of unique identifiers for the players to be added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlayerSessionsRequest withPlayerIds(String... playerIds) {
        if (this.playerIds == null) {
            setPlayerIds(new java.util.ArrayList<String>(playerIds.length));
        }
        for (String ele : playerIds) {
            this.playerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of unique identifiers for the players to be added.
     * </p>
     * 
     * @param playerIds
     *        List of unique identifiers for the players to be added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlayerSessionsRequest withPlayerIds(java.util.Collection<String> playerIds) {
        setPlayerIds(playerIds);
        return this;
    }

    /**
     * <p>
     * Map of string pairs, each specifying a player ID and a set of developer-defined information related to the
     * player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game. Player data
     * strings for player IDs not included in the <code>PlayerIds</code> parameter are ignored.
     * </p>
     * 
     * @return Map of string pairs, each specifying a player ID and a set of developer-defined information related to
     *         the player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game.
     *         Player data strings for player IDs not included in the <code>PlayerIds</code> parameter are ignored.
     */

    public java.util.Map<String, String> getPlayerDataMap() {
        return playerDataMap;
    }

    /**
     * <p>
     * Map of string pairs, each specifying a player ID and a set of developer-defined information related to the
     * player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game. Player data
     * strings for player IDs not included in the <code>PlayerIds</code> parameter are ignored.
     * </p>
     * 
     * @param playerDataMap
     *        Map of string pairs, each specifying a player ID and a set of developer-defined information related to the
     *        player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game.
     *        Player data strings for player IDs not included in the <code>PlayerIds</code> parameter are ignored.
     */

    public void setPlayerDataMap(java.util.Map<String, String> playerDataMap) {
        this.playerDataMap = playerDataMap;
    }

    /**
     * <p>
     * Map of string pairs, each specifying a player ID and a set of developer-defined information related to the
     * player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game. Player data
     * strings for player IDs not included in the <code>PlayerIds</code> parameter are ignored.
     * </p>
     * 
     * @param playerDataMap
     *        Map of string pairs, each specifying a player ID and a set of developer-defined information related to the
     *        player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game.
     *        Player data strings for player IDs not included in the <code>PlayerIds</code> parameter are ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlayerSessionsRequest withPlayerDataMap(java.util.Map<String, String> playerDataMap) {
        setPlayerDataMap(playerDataMap);
        return this;
    }

    public CreatePlayerSessionsRequest addPlayerDataMapEntry(String key, String value) {
        if (null == this.playerDataMap) {
            this.playerDataMap = new java.util.HashMap<String, String>();
        }
        if (this.playerDataMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.playerDataMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PlayerDataMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlayerSessionsRequest clearPlayerDataMapEntries() {
        this.playerDataMap = null;
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
        if (getPlayerIds() != null)
            sb.append("PlayerIds: ").append(getPlayerIds()).append(",");
        if (getPlayerDataMap() != null)
            sb.append("PlayerDataMap: ").append(getPlayerDataMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePlayerSessionsRequest == false)
            return false;
        CreatePlayerSessionsRequest other = (CreatePlayerSessionsRequest) obj;
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        if (other.getPlayerIds() == null ^ this.getPlayerIds() == null)
            return false;
        if (other.getPlayerIds() != null && other.getPlayerIds().equals(this.getPlayerIds()) == false)
            return false;
        if (other.getPlayerDataMap() == null ^ this.getPlayerDataMap() == null)
            return false;
        if (other.getPlayerDataMap() != null && other.getPlayerDataMap().equals(this.getPlayerDataMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameSessionId() == null) ? 0 : getGameSessionId().hashCode());
        hashCode = prime * hashCode + ((getPlayerIds() == null) ? 0 : getPlayerIds().hashCode());
        hashCode = prime * hashCode + ((getPlayerDataMap() == null) ? 0 : getPlayerDataMap().hashCode());
        return hashCode;
    }

    @Override
    public CreatePlayerSessionsRequest clone() {
        return (CreatePlayerSessionsRequest) super.clone();
    }

}
