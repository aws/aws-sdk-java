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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartGameSessionPlacement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartGameSessionPlacementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier to assign to the new game session placement. This value is developer-defined. The value must be
     * unique across all regions and cannot be reused unless you are resubmitting a canceled or timed-out placement
     * request.
     * </p>
     */
    private String placementId;
    /**
     * <p>
     * Name of the queue to use to place the new game session.
     * </p>
     */
    private String gameSessionQueueName;
    /**
     * <p>
     * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game
     * server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>).
     * </p>
     */
    private java.util.List<GameProperty> gameProperties;
    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the game session.
     * </p>
     */
    private Integer maximumPlayerSessionCount;
    /**
     * <p>
     * Descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     */
    private String gameSessionName;
    /**
     * <p>
     * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     * connected to AWS regions. This information is used to try to place the new game session where it can offer the
     * best possible gameplay experience for the players.
     * </p>
     */
    private java.util.List<PlayerLatency> playerLatencies;
    /**
     * <p>
     * Set of information on each player to create a player session for.
     * </p>
     */
    private java.util.List<DesiredPlayerSession> desiredPlayerSessions;
    /**
     * <p>
     * Set of custom game session properties, formatted as a single string value. This data is passed to a game server
     * process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>).
     * </p>
     */
    private String gameSessionData;

    /**
     * <p>
     * Unique identifier to assign to the new game session placement. This value is developer-defined. The value must be
     * unique across all regions and cannot be reused unless you are resubmitting a canceled or timed-out placement
     * request.
     * </p>
     * 
     * @param placementId
     *        Unique identifier to assign to the new game session placement. This value is developer-defined. The value
     *        must be unique across all regions and cannot be reused unless you are resubmitting a canceled or timed-out
     *        placement request.
     */

    public void setPlacementId(String placementId) {
        this.placementId = placementId;
    }

    /**
     * <p>
     * Unique identifier to assign to the new game session placement. This value is developer-defined. The value must be
     * unique across all regions and cannot be reused unless you are resubmitting a canceled or timed-out placement
     * request.
     * </p>
     * 
     * @return Unique identifier to assign to the new game session placement. This value is developer-defined. The value
     *         must be unique across all regions and cannot be reused unless you are resubmitting a canceled or
     *         timed-out placement request.
     */

    public String getPlacementId() {
        return this.placementId;
    }

    /**
     * <p>
     * Unique identifier to assign to the new game session placement. This value is developer-defined. The value must be
     * unique across all regions and cannot be reused unless you are resubmitting a canceled or timed-out placement
     * request.
     * </p>
     * 
     * @param placementId
     *        Unique identifier to assign to the new game session placement. This value is developer-defined. The value
     *        must be unique across all regions and cannot be reused unless you are resubmitting a canceled or timed-out
     *        placement request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGameSessionPlacementRequest withPlacementId(String placementId) {
        setPlacementId(placementId);
        return this;
    }

    /**
     * <p>
     * Name of the queue to use to place the new game session.
     * </p>
     * 
     * @param gameSessionQueueName
     *        Name of the queue to use to place the new game session.
     */

    public void setGameSessionQueueName(String gameSessionQueueName) {
        this.gameSessionQueueName = gameSessionQueueName;
    }

    /**
     * <p>
     * Name of the queue to use to place the new game session.
     * </p>
     * 
     * @return Name of the queue to use to place the new game session.
     */

    public String getGameSessionQueueName() {
        return this.gameSessionQueueName;
    }

    /**
     * <p>
     * Name of the queue to use to place the new game session.
     * </p>
     * 
     * @param gameSessionQueueName
     *        Name of the queue to use to place the new game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGameSessionPlacementRequest withGameSessionQueueName(String gameSessionQueueName) {
        setGameSessionQueueName(gameSessionQueueName);
        return this;
    }

    /**
     * <p>
     * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game
     * server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>).
     * </p>
     * 
     * @return Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to
     *         a game server process in the <a>GameSession</a> object with a request to start a new game session (see <a
     *         href=
     *         "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *         >Start a Game Session</a>).
     */

    public java.util.List<GameProperty> getGameProperties() {
        return gameProperties;
    }

    /**
     * <p>
     * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game
     * server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>).
     * </p>
     * 
     * @param gameProperties
     *        Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to
     *        a game server process in the <a>GameSession</a> object with a request to start a new game session (see <a
     *        href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *        >Start a Game Session</a>).
     */

    public void setGameProperties(java.util.Collection<GameProperty> gameProperties) {
        if (gameProperties == null) {
            this.gameProperties = null;
            return;
        }

        this.gameProperties = new java.util.ArrayList<GameProperty>(gameProperties);
    }

    /**
     * <p>
     * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game
     * server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGameProperties(java.util.Collection)} or {@link #withGameProperties(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param gameProperties
     *        Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to
     *        a game server process in the <a>GameSession</a> object with a request to start a new game session (see <a
     *        href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *        >Start a Game Session</a>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGameSessionPlacementRequest withGameProperties(GameProperty... gameProperties) {
        if (this.gameProperties == null) {
            setGameProperties(new java.util.ArrayList<GameProperty>(gameProperties.length));
        }
        for (GameProperty ele : gameProperties) {
            this.gameProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game
     * server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>).
     * </p>
     * 
     * @param gameProperties
     *        Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to
     *        a game server process in the <a>GameSession</a> object with a request to start a new game session (see <a
     *        href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *        >Start a Game Session</a>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGameSessionPlacementRequest withGameProperties(java.util.Collection<GameProperty> gameProperties) {
        setGameProperties(gameProperties);
        return this;
    }

    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        Maximum number of players that can be connected simultaneously to the game session.
     */

    public void setMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        this.maximumPlayerSessionCount = maximumPlayerSessionCount;
    }

    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @return Maximum number of players that can be connected simultaneously to the game session.
     */

    public Integer getMaximumPlayerSessionCount() {
        return this.maximumPlayerSessionCount;
    }

    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        Maximum number of players that can be connected simultaneously to the game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGameSessionPlacementRequest withMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        setMaximumPlayerSessionCount(maximumPlayerSessionCount);
        return this;
    }

    /**
     * <p>
     * Descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @param gameSessionName
     *        Descriptive label that is associated with a game session. Session names do not need to be unique.
     */

    public void setGameSessionName(String gameSessionName) {
        this.gameSessionName = gameSessionName;
    }

    /**
     * <p>
     * Descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @return Descriptive label that is associated with a game session. Session names do not need to be unique.
     */

    public String getGameSessionName() {
        return this.gameSessionName;
    }

    /**
     * <p>
     * Descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @param gameSessionName
     *        Descriptive label that is associated with a game session. Session names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGameSessionPlacementRequest withGameSessionName(String gameSessionName) {
        setGameSessionName(gameSessionName);
        return this;
    }

    /**
     * <p>
     * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     * connected to AWS regions. This information is used to try to place the new game session where it can offer the
     * best possible gameplay experience for the players.
     * </p>
     * 
     * @return Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     *         connected to AWS regions. This information is used to try to place the new game session where it can
     *         offer the best possible gameplay experience for the players.
     */

    public java.util.List<PlayerLatency> getPlayerLatencies() {
        return playerLatencies;
    }

    /**
     * <p>
     * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     * connected to AWS regions. This information is used to try to place the new game session where it can offer the
     * best possible gameplay experience for the players.
     * </p>
     * 
     * @param playerLatencies
     *        Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     *        connected to AWS regions. This information is used to try to place the new game session where it can offer
     *        the best possible gameplay experience for the players.
     */

    public void setPlayerLatencies(java.util.Collection<PlayerLatency> playerLatencies) {
        if (playerLatencies == null) {
            this.playerLatencies = null;
            return;
        }

        this.playerLatencies = new java.util.ArrayList<PlayerLatency>(playerLatencies);
    }

    /**
     * <p>
     * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     * connected to AWS regions. This information is used to try to place the new game session where it can offer the
     * best possible gameplay experience for the players.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlayerLatencies(java.util.Collection)} or {@link #withPlayerLatencies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param playerLatencies
     *        Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     *        connected to AWS regions. This information is used to try to place the new game session where it can offer
     *        the best possible gameplay experience for the players.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGameSessionPlacementRequest withPlayerLatencies(PlayerLatency... playerLatencies) {
        if (this.playerLatencies == null) {
            setPlayerLatencies(new java.util.ArrayList<PlayerLatency>(playerLatencies.length));
        }
        for (PlayerLatency ele : playerLatencies) {
            this.playerLatencies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     * connected to AWS regions. This information is used to try to place the new game session where it can offer the
     * best possible gameplay experience for the players.
     * </p>
     * 
     * @param playerLatencies
     *        Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     *        connected to AWS regions. This information is used to try to place the new game session where it can offer
     *        the best possible gameplay experience for the players.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGameSessionPlacementRequest withPlayerLatencies(java.util.Collection<PlayerLatency> playerLatencies) {
        setPlayerLatencies(playerLatencies);
        return this;
    }

    /**
     * <p>
     * Set of information on each player to create a player session for.
     * </p>
     * 
     * @return Set of information on each player to create a player session for.
     */

    public java.util.List<DesiredPlayerSession> getDesiredPlayerSessions() {
        return desiredPlayerSessions;
    }

    /**
     * <p>
     * Set of information on each player to create a player session for.
     * </p>
     * 
     * @param desiredPlayerSessions
     *        Set of information on each player to create a player session for.
     */

    public void setDesiredPlayerSessions(java.util.Collection<DesiredPlayerSession> desiredPlayerSessions) {
        if (desiredPlayerSessions == null) {
            this.desiredPlayerSessions = null;
            return;
        }

        this.desiredPlayerSessions = new java.util.ArrayList<DesiredPlayerSession>(desiredPlayerSessions);
    }

    /**
     * <p>
     * Set of information on each player to create a player session for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDesiredPlayerSessions(java.util.Collection)} or
     * {@link #withDesiredPlayerSessions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param desiredPlayerSessions
     *        Set of information on each player to create a player session for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGameSessionPlacementRequest withDesiredPlayerSessions(DesiredPlayerSession... desiredPlayerSessions) {
        if (this.desiredPlayerSessions == null) {
            setDesiredPlayerSessions(new java.util.ArrayList<DesiredPlayerSession>(desiredPlayerSessions.length));
        }
        for (DesiredPlayerSession ele : desiredPlayerSessions) {
            this.desiredPlayerSessions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Set of information on each player to create a player session for.
     * </p>
     * 
     * @param desiredPlayerSessions
     *        Set of information on each player to create a player session for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGameSessionPlacementRequest withDesiredPlayerSessions(java.util.Collection<DesiredPlayerSession> desiredPlayerSessions) {
        setDesiredPlayerSessions(desiredPlayerSessions);
        return this;
    }

    /**
     * <p>
     * Set of custom game session properties, formatted as a single string value. This data is passed to a game server
     * process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>).
     * </p>
     * 
     * @param gameSessionData
     *        Set of custom game session properties, formatted as a single string value. This data is passed to a game
     *        server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *        >Start a Game Session</a>).
     */

    public void setGameSessionData(String gameSessionData) {
        this.gameSessionData = gameSessionData;
    }

    /**
     * <p>
     * Set of custom game session properties, formatted as a single string value. This data is passed to a game server
     * process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>).
     * </p>
     * 
     * @return Set of custom game session properties, formatted as a single string value. This data is passed to a game
     *         server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     *         "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *         >Start a Game Session</a>).
     */

    public String getGameSessionData() {
        return this.gameSessionData;
    }

    /**
     * <p>
     * Set of custom game session properties, formatted as a single string value. This data is passed to a game server
     * process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a Game Session</a>).
     * </p>
     * 
     * @param gameSessionData
     *        Set of custom game session properties, formatted as a single string value. This data is passed to a game
     *        server process in the <a>GameSession</a> object with a request to start a new game session (see <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     *        >Start a Game Session</a>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartGameSessionPlacementRequest withGameSessionData(String gameSessionData) {
        setGameSessionData(gameSessionData);
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
        if (getPlacementId() != null)
            sb.append("PlacementId: ").append(getPlacementId()).append(",");
        if (getGameSessionQueueName() != null)
            sb.append("GameSessionQueueName: ").append(getGameSessionQueueName()).append(",");
        if (getGameProperties() != null)
            sb.append("GameProperties: ").append(getGameProperties()).append(",");
        if (getMaximumPlayerSessionCount() != null)
            sb.append("MaximumPlayerSessionCount: ").append(getMaximumPlayerSessionCount()).append(",");
        if (getGameSessionName() != null)
            sb.append("GameSessionName: ").append(getGameSessionName()).append(",");
        if (getPlayerLatencies() != null)
            sb.append("PlayerLatencies: ").append(getPlayerLatencies()).append(",");
        if (getDesiredPlayerSessions() != null)
            sb.append("DesiredPlayerSessions: ").append(getDesiredPlayerSessions()).append(",");
        if (getGameSessionData() != null)
            sb.append("GameSessionData: ").append(getGameSessionData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartGameSessionPlacementRequest == false)
            return false;
        StartGameSessionPlacementRequest other = (StartGameSessionPlacementRequest) obj;
        if (other.getPlacementId() == null ^ this.getPlacementId() == null)
            return false;
        if (other.getPlacementId() != null && other.getPlacementId().equals(this.getPlacementId()) == false)
            return false;
        if (other.getGameSessionQueueName() == null ^ this.getGameSessionQueueName() == null)
            return false;
        if (other.getGameSessionQueueName() != null && other.getGameSessionQueueName().equals(this.getGameSessionQueueName()) == false)
            return false;
        if (other.getGameProperties() == null ^ this.getGameProperties() == null)
            return false;
        if (other.getGameProperties() != null && other.getGameProperties().equals(this.getGameProperties()) == false)
            return false;
        if (other.getMaximumPlayerSessionCount() == null ^ this.getMaximumPlayerSessionCount() == null)
            return false;
        if (other.getMaximumPlayerSessionCount() != null && other.getMaximumPlayerSessionCount().equals(this.getMaximumPlayerSessionCount()) == false)
            return false;
        if (other.getGameSessionName() == null ^ this.getGameSessionName() == null)
            return false;
        if (other.getGameSessionName() != null && other.getGameSessionName().equals(this.getGameSessionName()) == false)
            return false;
        if (other.getPlayerLatencies() == null ^ this.getPlayerLatencies() == null)
            return false;
        if (other.getPlayerLatencies() != null && other.getPlayerLatencies().equals(this.getPlayerLatencies()) == false)
            return false;
        if (other.getDesiredPlayerSessions() == null ^ this.getDesiredPlayerSessions() == null)
            return false;
        if (other.getDesiredPlayerSessions() != null && other.getDesiredPlayerSessions().equals(this.getDesiredPlayerSessions()) == false)
            return false;
        if (other.getGameSessionData() == null ^ this.getGameSessionData() == null)
            return false;
        if (other.getGameSessionData() != null && other.getGameSessionData().equals(this.getGameSessionData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlacementId() == null) ? 0 : getPlacementId().hashCode());
        hashCode = prime * hashCode + ((getGameSessionQueueName() == null) ? 0 : getGameSessionQueueName().hashCode());
        hashCode = prime * hashCode + ((getGameProperties() == null) ? 0 : getGameProperties().hashCode());
        hashCode = prime * hashCode + ((getMaximumPlayerSessionCount() == null) ? 0 : getMaximumPlayerSessionCount().hashCode());
        hashCode = prime * hashCode + ((getGameSessionName() == null) ? 0 : getGameSessionName().hashCode());
        hashCode = prime * hashCode + ((getPlayerLatencies() == null) ? 0 : getPlayerLatencies().hashCode());
        hashCode = prime * hashCode + ((getDesiredPlayerSessions() == null) ? 0 : getDesiredPlayerSessions().hashCode());
        hashCode = prime * hashCode + ((getGameSessionData() == null) ? 0 : getGameSessionData().hashCode());
        return hashCode;
    }

    @Override
    public StartGameSessionPlacementRequest clone() {
        return (StartGameSessionPlacementRequest) super.clone();
    }

}
