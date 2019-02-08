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
 * Properties describing a player session. Player session objects are created either by creating a player session for a
 * specific game session, or as part of a game session placement. A player session represents either a player
 * reservation for a game session (status <code>RESERVED</code>) or actual player activity in a game session (status
 * <code>ACTIVE</code>). A player session object (including player data) is automatically passed to a game session when
 * the player connects to the game session and is validated.
 * </p>
 * <p>
 * When a player disconnects, the player session status changes to <code>COMPLETED</code>. Once the session ends, the
 * player session object is retained for 30 days and then removed.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePlayerSession</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreatePlayerSessions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribePlayerSessions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * Game session placements
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
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/PlayerSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlayerSession implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a player session.
     * </p>
     */
    private String playerSessionId;
    /**
     * <p>
     * Unique identifier for a player that is associated with this player session.
     * </p>
     */
    private String playerId;
    /**
     * <p>
     * Unique identifier for the game session that the player session is connected to.
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * Unique identifier for a fleet that the player's game session is running on.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     */
    private java.util.Date terminationTime;
    /**
     * <p>
     * Current status of the player session.
     * </p>
     * <p>
     * Possible player session statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RESERVED</b> -- The player session request has been received, but the player has not yet connected to the
     * server process and/or been validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The player has been validated by the server process and is currently connected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPLETED</b> -- The player connection has been dropped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMEDOUT</b> -- A player session request was received, but the player did not connect and/or was not validated
     * within the timeout limit (60 seconds).
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Port number for the game session. To connect to a Amazon GameLift server process, an app needs both the IP
     * address and port number.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted
     * as needed for use in the game.
     * </p>
     */
    private String playerData;

    /**
     * <p>
     * Unique identifier for a player session.
     * </p>
     * 
     * @param playerSessionId
     *        Unique identifier for a player session.
     */

    public void setPlayerSessionId(String playerSessionId) {
        this.playerSessionId = playerSessionId;
    }

    /**
     * <p>
     * Unique identifier for a player session.
     * </p>
     * 
     * @return Unique identifier for a player session.
     */

    public String getPlayerSessionId() {
        return this.playerSessionId;
    }

    /**
     * <p>
     * Unique identifier for a player session.
     * </p>
     * 
     * @param playerSessionId
     *        Unique identifier for a player session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayerSession withPlayerSessionId(String playerSessionId) {
        setPlayerSessionId(playerSessionId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a player that is associated with this player session.
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player that is associated with this player session.
     */

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    /**
     * <p>
     * Unique identifier for a player that is associated with this player session.
     * </p>
     * 
     * @return Unique identifier for a player that is associated with this player session.
     */

    public String getPlayerId() {
        return this.playerId;
    }

    /**
     * <p>
     * Unique identifier for a player that is associated with this player session.
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player that is associated with this player session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayerSession withPlayerId(String playerId) {
        setPlayerId(playerId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the game session that the player session is connected to.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for the game session that the player session is connected to.
     */

    public void setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for the game session that the player session is connected to.
     * </p>
     * 
     * @return Unique identifier for the game session that the player session is connected to.
     */

    public String getGameSessionId() {
        return this.gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for the game session that the player session is connected to.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for the game session that the player session is connected to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayerSession withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a fleet that the player's game session is running on.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet that the player's game session is running on.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet that the player's game session is running on.
     * </p>
     * 
     * @return Unique identifier for a fleet that the player's game session is running on.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet that the player's game session is running on.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet that the player's game session is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayerSession withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @return Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *         milliseconds (for example "1469498468.057").
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayerSession withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param terminationTime
     *        Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     */

    public void setTerminationTime(java.util.Date terminationTime) {
        this.terminationTime = terminationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @return Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     *         milliseconds (for example "1469498468.057").
     */

    public java.util.Date getTerminationTime() {
        return this.terminationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param terminationTime
     *        Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayerSession withTerminationTime(java.util.Date terminationTime) {
        setTerminationTime(terminationTime);
        return this;
    }

    /**
     * <p>
     * Current status of the player session.
     * </p>
     * <p>
     * Possible player session statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RESERVED</b> -- The player session request has been received, but the player has not yet connected to the
     * server process and/or been validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The player has been validated by the server process and is currently connected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPLETED</b> -- The player connection has been dropped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMEDOUT</b> -- A player session request was received, but the player did not connect and/or was not validated
     * within the timeout limit (60 seconds).
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the player session.</p>
     *        <p>
     *        Possible player session statuses include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RESERVED</b> -- The player session request has been received, but the player has not yet connected to
     *        the server process and/or been validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The player has been validated by the server process and is currently connected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPLETED</b> -- The player connection has been dropped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TIMEDOUT</b> -- A player session request was received, but the player did not connect and/or was not
     *        validated within the timeout limit (60 seconds).
     *        </p>
     *        </li>
     * @see PlayerSessionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the player session.
     * </p>
     * <p>
     * Possible player session statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RESERVED</b> -- The player session request has been received, but the player has not yet connected to the
     * server process and/or been validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The player has been validated by the server process and is currently connected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPLETED</b> -- The player connection has been dropped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMEDOUT</b> -- A player session request was received, but the player did not connect and/or was not validated
     * within the timeout limit (60 seconds).
     * </p>
     * </li>
     * </ul>
     * 
     * @return Current status of the player session.</p>
     *         <p>
     *         Possible player session statuses include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>RESERVED</b> -- The player session request has been received, but the player has not yet connected to
     *         the server process and/or been validated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ACTIVE</b> -- The player has been validated by the server process and is currently connected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>COMPLETED</b> -- The player connection has been dropped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>TIMEDOUT</b> -- A player session request was received, but the player did not connect and/or was not
     *         validated within the timeout limit (60 seconds).
     *         </p>
     *         </li>
     * @see PlayerSessionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the player session.
     * </p>
     * <p>
     * Possible player session statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RESERVED</b> -- The player session request has been received, but the player has not yet connected to the
     * server process and/or been validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The player has been validated by the server process and is currently connected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPLETED</b> -- The player connection has been dropped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMEDOUT</b> -- A player session request was received, but the player did not connect and/or was not validated
     * within the timeout limit (60 seconds).
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the player session.</p>
     *        <p>
     *        Possible player session statuses include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RESERVED</b> -- The player session request has been received, but the player has not yet connected to
     *        the server process and/or been validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The player has been validated by the server process and is currently connected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPLETED</b> -- The player connection has been dropped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TIMEDOUT</b> -- A player session request was received, but the player did not connect and/or was not
     *        validated within the timeout limit (60 seconds).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlayerSessionStatus
     */

    public PlayerSession withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the player session.
     * </p>
     * <p>
     * Possible player session statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RESERVED</b> -- The player session request has been received, but the player has not yet connected to the
     * server process and/or been validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The player has been validated by the server process and is currently connected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPLETED</b> -- The player connection has been dropped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMEDOUT</b> -- A player session request was received, but the player did not connect and/or was not validated
     * within the timeout limit (60 seconds).
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the player session.</p>
     *        <p>
     *        Possible player session statuses include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RESERVED</b> -- The player session request has been received, but the player has not yet connected to
     *        the server process and/or been validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The player has been validated by the server process and is currently connected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPLETED</b> -- The player connection has been dropped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TIMEDOUT</b> -- A player session request was received, but the player did not connect and/or was not
     *        validated within the timeout limit (60 seconds).
     *        </p>
     *        </li>
     * @see PlayerSessionStatus
     */

    public void setStatus(PlayerSessionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * Current status of the player session.
     * </p>
     * <p>
     * Possible player session statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RESERVED</b> -- The player session request has been received, but the player has not yet connected to the
     * server process and/or been validated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The player has been validated by the server process and is currently connected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPLETED</b> -- The player connection has been dropped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMEDOUT</b> -- A player session request was received, but the player did not connect and/or was not validated
     * within the timeout limit (60 seconds).
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the player session.</p>
     *        <p>
     *        Possible player session statuses include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RESERVED</b> -- The player session request has been received, but the player has not yet connected to
     *        the server process and/or been validated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The player has been validated by the server process and is currently connected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPLETED</b> -- The player connection has been dropped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TIMEDOUT</b> -- A player session request was received, but the player did not connect and/or was not
     *        validated within the timeout limit (60 seconds).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlayerSessionStatus
     */

    public PlayerSession withStatus(PlayerSessionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @param ipAddress
     *        IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *        address and port number.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @return IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *         address and port number.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and
     * port number.
     * </p>
     * 
     * @param ipAddress
     *        IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP
     *        address and port number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayerSession withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Port number for the game session. To connect to a Amazon GameLift server process, an app needs both the IP
     * address and port number.
     * </p>
     * 
     * @param port
     *        Port number for the game session. To connect to a Amazon GameLift server process, an app needs both the IP
     *        address and port number.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Port number for the game session. To connect to a Amazon GameLift server process, an app needs both the IP
     * address and port number.
     * </p>
     * 
     * @return Port number for the game session. To connect to a Amazon GameLift server process, an app needs both the
     *         IP address and port number.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Port number for the game session. To connect to a Amazon GameLift server process, an app needs both the IP
     * address and port number.
     * </p>
     * 
     * @param port
     *        Port number for the game session. To connect to a Amazon GameLift server process, an app needs both the IP
     *        address and port number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayerSession withPort(Integer port) {
        setPort(port);
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

    public PlayerSession withPlayerData(String playerData) {
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
        if (getPlayerSessionId() != null)
            sb.append("PlayerSessionId: ").append(getPlayerSessionId()).append(",");
        if (getPlayerId() != null)
            sb.append("PlayerId: ").append(getPlayerId()).append(",");
        if (getGameSessionId() != null)
            sb.append("GameSessionId: ").append(getGameSessionId()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTerminationTime() != null)
            sb.append("TerminationTime: ").append(getTerminationTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
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

        if (obj instanceof PlayerSession == false)
            return false;
        PlayerSession other = (PlayerSession) obj;
        if (other.getPlayerSessionId() == null ^ this.getPlayerSessionId() == null)
            return false;
        if (other.getPlayerSessionId() != null && other.getPlayerSessionId().equals(this.getPlayerSessionId()) == false)
            return false;
        if (other.getPlayerId() == null ^ this.getPlayerId() == null)
            return false;
        if (other.getPlayerId() != null && other.getPlayerId().equals(this.getPlayerId()) == false)
            return false;
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTerminationTime() == null ^ this.getTerminationTime() == null)
            return false;
        if (other.getTerminationTime() != null && other.getTerminationTime().equals(this.getTerminationTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
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

        hashCode = prime * hashCode + ((getPlayerSessionId() == null) ? 0 : getPlayerSessionId().hashCode());
        hashCode = prime * hashCode + ((getPlayerId() == null) ? 0 : getPlayerId().hashCode());
        hashCode = prime * hashCode + ((getGameSessionId() == null) ? 0 : getGameSessionId().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTerminationTime() == null) ? 0 : getTerminationTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getPlayerData() == null) ? 0 : getPlayerData().hashCode());
        return hashCode;
    }

    @Override
    public PlayerSession clone() {
        try {
            return (PlayerSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.PlayerSessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
