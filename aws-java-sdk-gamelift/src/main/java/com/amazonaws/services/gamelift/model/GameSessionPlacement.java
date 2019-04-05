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
 * Object that describes a <a>StartGameSessionPlacement</a> request. This object includes the full details of the
 * original request plus the current status and start/end time stamps.
 * </p>
 * <p>
 * Game session placement-related operations include:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>StartGameSessionPlacement</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionPlacement</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopGameSessionPlacement</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GameSessionPlacement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameSessionPlacement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a game session placement.
     * </p>
     */
    private String placementId;
    /**
     * <p>
     * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
     * </p>
     */
    private String gameSessionQueueName;
    /**
     * <p>
     * Current status of the game session placement request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The placement request is currently in the queue waiting to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FULFILLED</b> -- A new game session and player sessions (if requested) have been successfully created. Values
     * for <i>GameSessionArn</i> and <i>GameSessionRegion</i> are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELLED</b> -- The placement request was canceled with a call to <a>StopGameSessionPlacement</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMED_OUT</b> -- A new game session was not successfully created before the time limit expired. You can
     * resubmit the placement request as needed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
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
     * Unique identifier for the game session. This value is set once the new game session is placed (placement status
     * is <code>FULFILLED</code>).
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * Identifier for the game session created by this placement request. This value is set once the new game session is
     * placed (placement status is <code>FULFILLED</code>). This identifier is unique across all regions. You can use
     * this value as a <code>GameSessionId</code> value as needed.
     * </p>
     */
    private String gameSessionArn;
    /**
     * <p>
     * Name of the region where the game session created by this placement request is running. This value is set once
     * the new game session is placed (placement status is <code>FULFILLED</code>).
     * </p>
     */
    private String gameSessionRegion;
    /**
     * <p>
     * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     * connected to AWS regions.
     * </p>
     */
    private java.util.List<PlayerLatency> playerLatencies;
    /**
     * <p>
     * Time stamp indicating when this request was placed in the queue. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Time stamp indicating when this request was completed, canceled, or timed out.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and
     * port number. This value is set once the new game session is placed (placement status is <code>FULFILLED</code>).
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address
     * and port number. This value is set once the new game session is placed (placement status is
     * <code>FULFILLED</code>).
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Collection of information on player sessions created in response to the game session placement request. These
     * player sessions are created only once a new game session is successfully placed (placement status is
     * <code>FULFILLED</code>). This information includes the player ID (as provided in the placement request) and the
     * corresponding player session ID. Retrieve full player sessions by calling <a>DescribePlayerSessions</a> with the
     * player session ID.
     * </p>
     */
    private java.util.List<PlacedPlayerSession> placedPlayerSessions;
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
     * Information on the matchmaking process for this game. Data is in JSON syntax, formatted as a string. It
     * identifies the matchmaking configuration used to create the match, and contains data on all players assigned to
     * the match, including player attributes and team assignments. For more details on matchmaker data, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data">Match
     * Data</a>.
     * </p>
     */
    private String matchmakerData;

    /**
     * <p>
     * Unique identifier for a game session placement.
     * </p>
     * 
     * @param placementId
     *        Unique identifier for a game session placement.
     */

    public void setPlacementId(String placementId) {
        this.placementId = placementId;
    }

    /**
     * <p>
     * Unique identifier for a game session placement.
     * </p>
     * 
     * @return Unique identifier for a game session placement.
     */

    public String getPlacementId() {
        return this.placementId;
    }

    /**
     * <p>
     * Unique identifier for a game session placement.
     * </p>
     * 
     * @param placementId
     *        Unique identifier for a game session placement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withPlacementId(String placementId) {
        setPlacementId(placementId);
        return this;
    }

    /**
     * <p>
     * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
     * </p>
     * 
     * @param gameSessionQueueName
     *        Descriptive label that is associated with game session queue. Queue names must be unique within each
     *        region.
     */

    public void setGameSessionQueueName(String gameSessionQueueName) {
        this.gameSessionQueueName = gameSessionQueueName;
    }

    /**
     * <p>
     * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
     * </p>
     * 
     * @return Descriptive label that is associated with game session queue. Queue names must be unique within each
     *         region.
     */

    public String getGameSessionQueueName() {
        return this.gameSessionQueueName;
    }

    /**
     * <p>
     * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
     * </p>
     * 
     * @param gameSessionQueueName
     *        Descriptive label that is associated with game session queue. Queue names must be unique within each
     *        region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withGameSessionQueueName(String gameSessionQueueName) {
        setGameSessionQueueName(gameSessionQueueName);
        return this;
    }

    /**
     * <p>
     * Current status of the game session placement request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The placement request is currently in the queue waiting to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FULFILLED</b> -- A new game session and player sessions (if requested) have been successfully created. Values
     * for <i>GameSessionArn</i> and <i>GameSessionRegion</i> are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELLED</b> -- The placement request was canceled with a call to <a>StopGameSessionPlacement</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMED_OUT</b> -- A new game session was not successfully created before the time limit expired. You can
     * resubmit the placement request as needed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the game session placement request.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING</b> -- The placement request is currently in the queue waiting to be processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FULFILLED</b> -- A new game session and player sessions (if requested) have been successfully created.
     *        Values for <i>GameSessionArn</i> and <i>GameSessionRegion</i> are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELLED</b> -- The placement request was canceled with a call to <a>StopGameSessionPlacement</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TIMED_OUT</b> -- A new game session was not successfully created before the time limit expired. You can
     *        resubmit the placement request as needed.
     *        </p>
     *        </li>
     * @see GameSessionPlacementState
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the game session placement request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The placement request is currently in the queue waiting to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FULFILLED</b> -- A new game session and player sessions (if requested) have been successfully created. Values
     * for <i>GameSessionArn</i> and <i>GameSessionRegion</i> are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELLED</b> -- The placement request was canceled with a call to <a>StopGameSessionPlacement</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMED_OUT</b> -- A new game session was not successfully created before the time limit expired. You can
     * resubmit the placement request as needed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Current status of the game session placement request.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>PENDING</b> -- The placement request is currently in the queue waiting to be processed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FULFILLED</b> -- A new game session and player sessions (if requested) have been successfully created.
     *         Values for <i>GameSessionArn</i> and <i>GameSessionRegion</i> are available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CANCELLED</b> -- The placement request was canceled with a call to <a>StopGameSessionPlacement</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>TIMED_OUT</b> -- A new game session was not successfully created before the time limit expired. You
     *         can resubmit the placement request as needed.
     *         </p>
     *         </li>
     * @see GameSessionPlacementState
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the game session placement request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The placement request is currently in the queue waiting to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FULFILLED</b> -- A new game session and player sessions (if requested) have been successfully created. Values
     * for <i>GameSessionArn</i> and <i>GameSessionRegion</i> are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELLED</b> -- The placement request was canceled with a call to <a>StopGameSessionPlacement</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMED_OUT</b> -- A new game session was not successfully created before the time limit expired. You can
     * resubmit the placement request as needed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the game session placement request.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING</b> -- The placement request is currently in the queue waiting to be processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FULFILLED</b> -- A new game session and player sessions (if requested) have been successfully created.
     *        Values for <i>GameSessionArn</i> and <i>GameSessionRegion</i> are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELLED</b> -- The placement request was canceled with a call to <a>StopGameSessionPlacement</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TIMED_OUT</b> -- A new game session was not successfully created before the time limit expired. You can
     *        resubmit the placement request as needed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameSessionPlacementState
     */

    public GameSessionPlacement withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the game session placement request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The placement request is currently in the queue waiting to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FULFILLED</b> -- A new game session and player sessions (if requested) have been successfully created. Values
     * for <i>GameSessionArn</i> and <i>GameSessionRegion</i> are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELLED</b> -- The placement request was canceled with a call to <a>StopGameSessionPlacement</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMED_OUT</b> -- A new game session was not successfully created before the time limit expired. You can
     * resubmit the placement request as needed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the game session placement request.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING</b> -- The placement request is currently in the queue waiting to be processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FULFILLED</b> -- A new game session and player sessions (if requested) have been successfully created.
     *        Values for <i>GameSessionArn</i> and <i>GameSessionRegion</i> are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELLED</b> -- The placement request was canceled with a call to <a>StopGameSessionPlacement</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TIMED_OUT</b> -- A new game session was not successfully created before the time limit expired. You can
     *        resubmit the placement request as needed.
     *        </p>
     *        </li>
     * @see GameSessionPlacementState
     */

    public void setStatus(GameSessionPlacementState status) {
        withStatus(status);
    }

    /**
     * <p>
     * Current status of the game session placement request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The placement request is currently in the queue waiting to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FULFILLED</b> -- A new game session and player sessions (if requested) have been successfully created. Values
     * for <i>GameSessionArn</i> and <i>GameSessionRegion</i> are available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELLED</b> -- The placement request was canceled with a call to <a>StopGameSessionPlacement</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMED_OUT</b> -- A new game session was not successfully created before the time limit expired. You can
     * resubmit the placement request as needed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the game session placement request.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING</b> -- The placement request is currently in the queue waiting to be processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FULFILLED</b> -- A new game session and player sessions (if requested) have been successfully created.
     *        Values for <i>GameSessionArn</i> and <i>GameSessionRegion</i> are available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELLED</b> -- The placement request was canceled with a call to <a>StopGameSessionPlacement</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TIMED_OUT</b> -- A new game session was not successfully created before the time limit expired. You can
     *        resubmit the placement request as needed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameSessionPlacementState
     */

    public GameSessionPlacement withStatus(GameSessionPlacementState status) {
        this.status = status.toString();
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

    public GameSessionPlacement withGameProperties(GameProperty... gameProperties) {
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

    public GameSessionPlacement withGameProperties(java.util.Collection<GameProperty> gameProperties) {
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

    public GameSessionPlacement withMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
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

    public GameSessionPlacement withGameSessionName(String gameSessionName) {
        setGameSessionName(gameSessionName);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the game session. This value is set once the new game session is placed (placement status
     * is <code>FULFILLED</code>).
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for the game session. This value is set once the new game session is placed (placement
     *        status is <code>FULFILLED</code>).
     */

    public void setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for the game session. This value is set once the new game session is placed (placement status
     * is <code>FULFILLED</code>).
     * </p>
     * 
     * @return Unique identifier for the game session. This value is set once the new game session is placed (placement
     *         status is <code>FULFILLED</code>).
     */

    public String getGameSessionId() {
        return this.gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for the game session. This value is set once the new game session is placed (placement status
     * is <code>FULFILLED</code>).
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for the game session. This value is set once the new game session is placed (placement
     *        status is <code>FULFILLED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * <p>
     * Identifier for the game session created by this placement request. This value is set once the new game session is
     * placed (placement status is <code>FULFILLED</code>). This identifier is unique across all regions. You can use
     * this value as a <code>GameSessionId</code> value as needed.
     * </p>
     * 
     * @param gameSessionArn
     *        Identifier for the game session created by this placement request. This value is set once the new game
     *        session is placed (placement status is <code>FULFILLED</code>). This identifier is unique across all
     *        regions. You can use this value as a <code>GameSessionId</code> value as needed.
     */

    public void setGameSessionArn(String gameSessionArn) {
        this.gameSessionArn = gameSessionArn;
    }

    /**
     * <p>
     * Identifier for the game session created by this placement request. This value is set once the new game session is
     * placed (placement status is <code>FULFILLED</code>). This identifier is unique across all regions. You can use
     * this value as a <code>GameSessionId</code> value as needed.
     * </p>
     * 
     * @return Identifier for the game session created by this placement request. This value is set once the new game
     *         session is placed (placement status is <code>FULFILLED</code>). This identifier is unique across all
     *         regions. You can use this value as a <code>GameSessionId</code> value as needed.
     */

    public String getGameSessionArn() {
        return this.gameSessionArn;
    }

    /**
     * <p>
     * Identifier for the game session created by this placement request. This value is set once the new game session is
     * placed (placement status is <code>FULFILLED</code>). This identifier is unique across all regions. You can use
     * this value as a <code>GameSessionId</code> value as needed.
     * </p>
     * 
     * @param gameSessionArn
     *        Identifier for the game session created by this placement request. This value is set once the new game
     *        session is placed (placement status is <code>FULFILLED</code>). This identifier is unique across all
     *        regions. You can use this value as a <code>GameSessionId</code> value as needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withGameSessionArn(String gameSessionArn) {
        setGameSessionArn(gameSessionArn);
        return this;
    }

    /**
     * <p>
     * Name of the region where the game session created by this placement request is running. This value is set once
     * the new game session is placed (placement status is <code>FULFILLED</code>).
     * </p>
     * 
     * @param gameSessionRegion
     *        Name of the region where the game session created by this placement request is running. This value is set
     *        once the new game session is placed (placement status is <code>FULFILLED</code>).
     */

    public void setGameSessionRegion(String gameSessionRegion) {
        this.gameSessionRegion = gameSessionRegion;
    }

    /**
     * <p>
     * Name of the region where the game session created by this placement request is running. This value is set once
     * the new game session is placed (placement status is <code>FULFILLED</code>).
     * </p>
     * 
     * @return Name of the region where the game session created by this placement request is running. This value is set
     *         once the new game session is placed (placement status is <code>FULFILLED</code>).
     */

    public String getGameSessionRegion() {
        return this.gameSessionRegion;
    }

    /**
     * <p>
     * Name of the region where the game session created by this placement request is running. This value is set once
     * the new game session is placed (placement status is <code>FULFILLED</code>).
     * </p>
     * 
     * @param gameSessionRegion
     *        Name of the region where the game session created by this placement request is running. This value is set
     *        once the new game session is placed (placement status is <code>FULFILLED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withGameSessionRegion(String gameSessionRegion) {
        setGameSessionRegion(gameSessionRegion);
        return this;
    }

    /**
     * <p>
     * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     * connected to AWS regions.
     * </p>
     * 
     * @return Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     *         connected to AWS regions.
     */

    public java.util.List<PlayerLatency> getPlayerLatencies() {
        return playerLatencies;
    }

    /**
     * <p>
     * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     * connected to AWS regions.
     * </p>
     * 
     * @param playerLatencies
     *        Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     *        connected to AWS regions.
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
     * connected to AWS regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlayerLatencies(java.util.Collection)} or {@link #withPlayerLatencies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param playerLatencies
     *        Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     *        connected to AWS regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withPlayerLatencies(PlayerLatency... playerLatencies) {
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
     * connected to AWS regions.
     * </p>
     * 
     * @param playerLatencies
     *        Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when
     *        connected to AWS regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withPlayerLatencies(java.util.Collection<PlayerLatency> playerLatencies) {
        setPlayerLatencies(playerLatencies);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this request was placed in the queue. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param startTime
     *        Time stamp indicating when this request was placed in the queue. Format is a number expressed in Unix time
     *        as milliseconds (for example "1469498468.057").
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Time stamp indicating when this request was placed in the queue. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @return Time stamp indicating when this request was placed in the queue. Format is a number expressed in Unix
     *         time as milliseconds (for example "1469498468.057").
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Time stamp indicating when this request was placed in the queue. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param startTime
     *        Time stamp indicating when this request was placed in the queue. Format is a number expressed in Unix time
     *        as milliseconds (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this request was completed, canceled, or timed out.
     * </p>
     * 
     * @param endTime
     *        Time stamp indicating when this request was completed, canceled, or timed out.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Time stamp indicating when this request was completed, canceled, or timed out.
     * </p>
     * 
     * @return Time stamp indicating when this request was completed, canceled, or timed out.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Time stamp indicating when this request was completed, canceled, or timed out.
     * </p>
     * 
     * @param endTime
     *        Time stamp indicating when this request was completed, canceled, or timed out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and
     * port number. This value is set once the new game session is placed (placement status is <code>FULFILLED</code>).
     * </p>
     * 
     * @param ipAddress
     *        IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *        address and port number. This value is set once the new game session is placed (placement status is
     *        <code>FULFILLED</code>).
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and
     * port number. This value is set once the new game session is placed (placement status is <code>FULFILLED</code>).
     * </p>
     * 
     * @return IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *         address and port number. This value is set once the new game session is placed (placement status is
     *         <code>FULFILLED</code>).
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and
     * port number. This value is set once the new game session is placed (placement status is <code>FULFILLED</code>).
     * </p>
     * 
     * @param ipAddress
     *        IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *        address and port number. This value is set once the new game session is placed (placement status is
     *        <code>FULFILLED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address
     * and port number. This value is set once the new game session is placed (placement status is
     * <code>FULFILLED</code>).
     * </p>
     * 
     * @param port
     *        Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *        address and port number. This value is set once the new game session is placed (placement status is
     *        <code>FULFILLED</code>).
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address
     * and port number. This value is set once the new game session is placed (placement status is
     * <code>FULFILLED</code>).
     * </p>
     * 
     * @return Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *         address and port number. This value is set once the new game session is placed (placement status is
     *         <code>FULFILLED</code>).
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address
     * and port number. This value is set once the new game session is placed (placement status is
     * <code>FULFILLED</code>).
     * </p>
     * 
     * @param port
     *        Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *        address and port number. This value is set once the new game session is placed (placement status is
     *        <code>FULFILLED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Collection of information on player sessions created in response to the game session placement request. These
     * player sessions are created only once a new game session is successfully placed (placement status is
     * <code>FULFILLED</code>). This information includes the player ID (as provided in the placement request) and the
     * corresponding player session ID. Retrieve full player sessions by calling <a>DescribePlayerSessions</a> with the
     * player session ID.
     * </p>
     * 
     * @return Collection of information on player sessions created in response to the game session placement request.
     *         These player sessions are created only once a new game session is successfully placed (placement status
     *         is <code>FULFILLED</code>). This information includes the player ID (as provided in the placement
     *         request) and the corresponding player session ID. Retrieve full player sessions by calling
     *         <a>DescribePlayerSessions</a> with the player session ID.
     */

    public java.util.List<PlacedPlayerSession> getPlacedPlayerSessions() {
        return placedPlayerSessions;
    }

    /**
     * <p>
     * Collection of information on player sessions created in response to the game session placement request. These
     * player sessions are created only once a new game session is successfully placed (placement status is
     * <code>FULFILLED</code>). This information includes the player ID (as provided in the placement request) and the
     * corresponding player session ID. Retrieve full player sessions by calling <a>DescribePlayerSessions</a> with the
     * player session ID.
     * </p>
     * 
     * @param placedPlayerSessions
     *        Collection of information on player sessions created in response to the game session placement request.
     *        These player sessions are created only once a new game session is successfully placed (placement status is
     *        <code>FULFILLED</code>). This information includes the player ID (as provided in the placement request)
     *        and the corresponding player session ID. Retrieve full player sessions by calling
     *        <a>DescribePlayerSessions</a> with the player session ID.
     */

    public void setPlacedPlayerSessions(java.util.Collection<PlacedPlayerSession> placedPlayerSessions) {
        if (placedPlayerSessions == null) {
            this.placedPlayerSessions = null;
            return;
        }

        this.placedPlayerSessions = new java.util.ArrayList<PlacedPlayerSession>(placedPlayerSessions);
    }

    /**
     * <p>
     * Collection of information on player sessions created in response to the game session placement request. These
     * player sessions are created only once a new game session is successfully placed (placement status is
     * <code>FULFILLED</code>). This information includes the player ID (as provided in the placement request) and the
     * corresponding player session ID. Retrieve full player sessions by calling <a>DescribePlayerSessions</a> with the
     * player session ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacedPlayerSessions(java.util.Collection)} or {@link #withPlacedPlayerSessions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param placedPlayerSessions
     *        Collection of information on player sessions created in response to the game session placement request.
     *        These player sessions are created only once a new game session is successfully placed (placement status is
     *        <code>FULFILLED</code>). This information includes the player ID (as provided in the placement request)
     *        and the corresponding player session ID. Retrieve full player sessions by calling
     *        <a>DescribePlayerSessions</a> with the player session ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withPlacedPlayerSessions(PlacedPlayerSession... placedPlayerSessions) {
        if (this.placedPlayerSessions == null) {
            setPlacedPlayerSessions(new java.util.ArrayList<PlacedPlayerSession>(placedPlayerSessions.length));
        }
        for (PlacedPlayerSession ele : placedPlayerSessions) {
            this.placedPlayerSessions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of information on player sessions created in response to the game session placement request. These
     * player sessions are created only once a new game session is successfully placed (placement status is
     * <code>FULFILLED</code>). This information includes the player ID (as provided in the placement request) and the
     * corresponding player session ID. Retrieve full player sessions by calling <a>DescribePlayerSessions</a> with the
     * player session ID.
     * </p>
     * 
     * @param placedPlayerSessions
     *        Collection of information on player sessions created in response to the game session placement request.
     *        These player sessions are created only once a new game session is successfully placed (placement status is
     *        <code>FULFILLED</code>). This information includes the player ID (as provided in the placement request)
     *        and the corresponding player session ID. Retrieve full player sessions by calling
     *        <a>DescribePlayerSessions</a> with the player session ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withPlacedPlayerSessions(java.util.Collection<PlacedPlayerSession> placedPlayerSessions) {
        setPlacedPlayerSessions(placedPlayerSessions);
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

    public GameSessionPlacement withGameSessionData(String gameSessionData) {
        setGameSessionData(gameSessionData);
        return this;
    }

    /**
     * <p>
     * Information on the matchmaking process for this game. Data is in JSON syntax, formatted as a string. It
     * identifies the matchmaking configuration used to create the match, and contains data on all players assigned to
     * the match, including player attributes and team assignments. For more details on matchmaker data, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data">Match
     * Data</a>.
     * </p>
     * 
     * @param matchmakerData
     *        Information on the matchmaking process for this game. Data is in JSON syntax, formatted as a string. It
     *        identifies the matchmaking configuration used to create the match, and contains data on all players
     *        assigned to the match, including player attributes and team assignments. For more details on matchmaker
     *        data, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data"
     *        >Match Data</a>.
     */

    public void setMatchmakerData(String matchmakerData) {
        this.matchmakerData = matchmakerData;
    }

    /**
     * <p>
     * Information on the matchmaking process for this game. Data is in JSON syntax, formatted as a string. It
     * identifies the matchmaking configuration used to create the match, and contains data on all players assigned to
     * the match, including player attributes and team assignments. For more details on matchmaker data, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data">Match
     * Data</a>.
     * </p>
     * 
     * @return Information on the matchmaking process for this game. Data is in JSON syntax, formatted as a string. It
     *         identifies the matchmaking configuration used to create the match, and contains data on all players
     *         assigned to the match, including player attributes and team assignments. For more details on matchmaker
     *         data, see <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data"
     *         >Match Data</a>.
     */

    public String getMatchmakerData() {
        return this.matchmakerData;
    }

    /**
     * <p>
     * Information on the matchmaking process for this game. Data is in JSON syntax, formatted as a string. It
     * identifies the matchmaking configuration used to create the match, and contains data on all players assigned to
     * the match, including player attributes and team assignments. For more details on matchmaker data, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data">Match
     * Data</a>.
     * </p>
     * 
     * @param matchmakerData
     *        Information on the matchmaking process for this game. Data is in JSON syntax, formatted as a string. It
     *        identifies the matchmaking configuration used to create the match, and contains data on all players
     *        assigned to the match, including player attributes and team assignments. For more details on matchmaker
     *        data, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data"
     *        >Match Data</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionPlacement withMatchmakerData(String matchmakerData) {
        setMatchmakerData(matchmakerData);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getGameProperties() != null)
            sb.append("GameProperties: ").append(getGameProperties()).append(",");
        if (getMaximumPlayerSessionCount() != null)
            sb.append("MaximumPlayerSessionCount: ").append(getMaximumPlayerSessionCount()).append(",");
        if (getGameSessionName() != null)
            sb.append("GameSessionName: ").append(getGameSessionName()).append(",");
        if (getGameSessionId() != null)
            sb.append("GameSessionId: ").append(getGameSessionId()).append(",");
        if (getGameSessionArn() != null)
            sb.append("GameSessionArn: ").append(getGameSessionArn()).append(",");
        if (getGameSessionRegion() != null)
            sb.append("GameSessionRegion: ").append(getGameSessionRegion()).append(",");
        if (getPlayerLatencies() != null)
            sb.append("PlayerLatencies: ").append(getPlayerLatencies()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getPlacedPlayerSessions() != null)
            sb.append("PlacedPlayerSessions: ").append(getPlacedPlayerSessions()).append(",");
        if (getGameSessionData() != null)
            sb.append("GameSessionData: ").append(getGameSessionData()).append(",");
        if (getMatchmakerData() != null)
            sb.append("MatchmakerData: ").append(getMatchmakerData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GameSessionPlacement == false)
            return false;
        GameSessionPlacement other = (GameSessionPlacement) obj;
        if (other.getPlacementId() == null ^ this.getPlacementId() == null)
            return false;
        if (other.getPlacementId() != null && other.getPlacementId().equals(this.getPlacementId()) == false)
            return false;
        if (other.getGameSessionQueueName() == null ^ this.getGameSessionQueueName() == null)
            return false;
        if (other.getGameSessionQueueName() != null && other.getGameSessionQueueName().equals(this.getGameSessionQueueName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        if (other.getGameSessionArn() == null ^ this.getGameSessionArn() == null)
            return false;
        if (other.getGameSessionArn() != null && other.getGameSessionArn().equals(this.getGameSessionArn()) == false)
            return false;
        if (other.getGameSessionRegion() == null ^ this.getGameSessionRegion() == null)
            return false;
        if (other.getGameSessionRegion() != null && other.getGameSessionRegion().equals(this.getGameSessionRegion()) == false)
            return false;
        if (other.getPlayerLatencies() == null ^ this.getPlayerLatencies() == null)
            return false;
        if (other.getPlayerLatencies() != null && other.getPlayerLatencies().equals(this.getPlayerLatencies()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getPlacedPlayerSessions() == null ^ this.getPlacedPlayerSessions() == null)
            return false;
        if (other.getPlacedPlayerSessions() != null && other.getPlacedPlayerSessions().equals(this.getPlacedPlayerSessions()) == false)
            return false;
        if (other.getGameSessionData() == null ^ this.getGameSessionData() == null)
            return false;
        if (other.getGameSessionData() != null && other.getGameSessionData().equals(this.getGameSessionData()) == false)
            return false;
        if (other.getMatchmakerData() == null ^ this.getMatchmakerData() == null)
            return false;
        if (other.getMatchmakerData() != null && other.getMatchmakerData().equals(this.getMatchmakerData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlacementId() == null) ? 0 : getPlacementId().hashCode());
        hashCode = prime * hashCode + ((getGameSessionQueueName() == null) ? 0 : getGameSessionQueueName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getGameProperties() == null) ? 0 : getGameProperties().hashCode());
        hashCode = prime * hashCode + ((getMaximumPlayerSessionCount() == null) ? 0 : getMaximumPlayerSessionCount().hashCode());
        hashCode = prime * hashCode + ((getGameSessionName() == null) ? 0 : getGameSessionName().hashCode());
        hashCode = prime * hashCode + ((getGameSessionId() == null) ? 0 : getGameSessionId().hashCode());
        hashCode = prime * hashCode + ((getGameSessionArn() == null) ? 0 : getGameSessionArn().hashCode());
        hashCode = prime * hashCode + ((getGameSessionRegion() == null) ? 0 : getGameSessionRegion().hashCode());
        hashCode = prime * hashCode + ((getPlayerLatencies() == null) ? 0 : getPlayerLatencies().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getPlacedPlayerSessions() == null) ? 0 : getPlacedPlayerSessions().hashCode());
        hashCode = prime * hashCode + ((getGameSessionData() == null) ? 0 : getGameSessionData().hashCode());
        hashCode = prime * hashCode + ((getMatchmakerData() == null) ? 0 : getMatchmakerData().hashCode());
        return hashCode;
    }

    @Override
    public GameSessionPlacement clone() {
        try {
            return (GameSessionPlacement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.GameSessionPlacementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
