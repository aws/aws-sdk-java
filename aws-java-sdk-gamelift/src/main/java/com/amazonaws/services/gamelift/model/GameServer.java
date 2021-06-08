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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>This data type is used with the GameLift FleetIQ and game server groups.</b>
 * </p>
 * <p>
 * Properties describing a game server that is running on an instance in a <a>GameServerGroup</a>.
 * </p>
 * <p>
 * A game server is created by a successful call to <code>RegisterGameServer</code> and deleted by calling
 * <code>DeregisterGameServer</code>. A game server is claimed to host a game session by calling
 * <code>ClaimGameServer</code>.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>RegisterGameServer</a> | <a>ListGameServers</a> | <a>ClaimGameServer</a> | <a>DescribeGameServer</a> |
 * <a>UpdateGameServer</a> | <a>DeregisterGameServer</a> | <a
 * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by task</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GameServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameServer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the game server group where the game server is running. Use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * The ARN identifier for the game server group where the game server is located.
     * </p>
     */
    private String gameServerGroupArn;
    /**
     * <p>
     * A custom string that uniquely identifies the game server. Game server IDs are developer-defined and are unique
     * across all game server groups in an AWS account.
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
     * The port and IP address that must be used to establish a client connection to the game server.
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
     * Indicates when an available game server has been reserved for gameplay but has not yet started hosting a game.
     * Once it is claimed, the game server remains in <code>CLAIMED</code> status for a maximum of one minute. During
     * this time, game clients connect to the game server to start the game and trigger the game server to update its
     * utilization status. After one minute, the game server claim status reverts to null.
     * </p>
     */
    private String claimStatus;
    /**
     * <p>
     * Indicates whether the game server is currently available for new games or is busy. Possible statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The game server is available to be claimed. A game server that has been claimed remains
     * in this status until it reports game hosting activity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UTILIZED</code> - The game server is currently hosting a game session with players.
     * </p>
     * </li>
     * </ul>
     */
    private String utilizationStatus;
    /**
     * <p>
     * Timestamp that indicates when the game server was created with a <a>RegisterGameServer</a> request. The format is
     * a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     */
    private java.util.Date registrationTime;
    /**
     * <p>
     * Timestamp that indicates the last time the game server was claimed with a <a>ClaimGameServer</a> request. The
     * format is a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>). This value
     * is used to calculate when a claimed game server's status should revert to null.
     * </p>
     */
    private java.util.Date lastClaimTime;
    /**
     * <p>
     * Timestamp that indicates the last time the game server was updated with health status using an
     * <a>UpdateGameServer</a> request. The format is a number expressed in Unix time as milliseconds (for example
     * <code>"1469498468.057"</code>). After game server registration, this property is only changed when a game server
     * update specifies a health check value.
     * </p>
     */
    private java.util.Date lastHealthCheckTime;

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

    public GameServer withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
        return this;
    }

    /**
     * <p>
     * The ARN identifier for the game server group where the game server is located.
     * </p>
     * 
     * @param gameServerGroupArn
     *        The ARN identifier for the game server group where the game server is located.
     */

    public void setGameServerGroupArn(String gameServerGroupArn) {
        this.gameServerGroupArn = gameServerGroupArn;
    }

    /**
     * <p>
     * The ARN identifier for the game server group where the game server is located.
     * </p>
     * 
     * @return The ARN identifier for the game server group where the game server is located.
     */

    public String getGameServerGroupArn() {
        return this.gameServerGroupArn;
    }

    /**
     * <p>
     * The ARN identifier for the game server group where the game server is located.
     * </p>
     * 
     * @param gameServerGroupArn
     *        The ARN identifier for the game server group where the game server is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServer withGameServerGroupArn(String gameServerGroupArn) {
        setGameServerGroupArn(gameServerGroupArn);
        return this;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server. Game server IDs are developer-defined and are unique
     * across all game server groups in an AWS account.
     * </p>
     * 
     * @param gameServerId
     *        A custom string that uniquely identifies the game server. Game server IDs are developer-defined and are
     *        unique across all game server groups in an AWS account.
     */

    public void setGameServerId(String gameServerId) {
        this.gameServerId = gameServerId;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server. Game server IDs are developer-defined and are unique
     * across all game server groups in an AWS account.
     * </p>
     * 
     * @return A custom string that uniquely identifies the game server. Game server IDs are developer-defined and are
     *         unique across all game server groups in an AWS account.
     */

    public String getGameServerId() {
        return this.gameServerId;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server. Game server IDs are developer-defined and are unique
     * across all game server groups in an AWS account.
     * </p>
     * 
     * @param gameServerId
     *        A custom string that uniquely identifies the game server. Game server IDs are developer-defined and are
     *        unique across all game server groups in an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServer withGameServerId(String gameServerId) {
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

    public GameServer withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The port and IP address that must be used to establish a client connection to the game server.
     * </p>
     * 
     * @param connectionInfo
     *        The port and IP address that must be used to establish a client connection to the game server.
     */

    public void setConnectionInfo(String connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    /**
     * <p>
     * The port and IP address that must be used to establish a client connection to the game server.
     * </p>
     * 
     * @return The port and IP address that must be used to establish a client connection to the game server.
     */

    public String getConnectionInfo() {
        return this.connectionInfo;
    }

    /**
     * <p>
     * The port and IP address that must be used to establish a client connection to the game server.
     * </p>
     * 
     * @param connectionInfo
     *        The port and IP address that must be used to establish a client connection to the game server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServer withConnectionInfo(String connectionInfo) {
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

    public GameServer withGameServerData(String gameServerData) {
        setGameServerData(gameServerData);
        return this;
    }

    /**
     * <p>
     * Indicates when an available game server has been reserved for gameplay but has not yet started hosting a game.
     * Once it is claimed, the game server remains in <code>CLAIMED</code> status for a maximum of one minute. During
     * this time, game clients connect to the game server to start the game and trigger the game server to update its
     * utilization status. After one minute, the game server claim status reverts to null.
     * </p>
     * 
     * @param claimStatus
     *        Indicates when an available game server has been reserved for gameplay but has not yet started hosting a
     *        game. Once it is claimed, the game server remains in <code>CLAIMED</code> status for a maximum of one
     *        minute. During this time, game clients connect to the game server to start the game and trigger the game
     *        server to update its utilization status. After one minute, the game server claim status reverts to null.
     * @see GameServerClaimStatus
     */

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    /**
     * <p>
     * Indicates when an available game server has been reserved for gameplay but has not yet started hosting a game.
     * Once it is claimed, the game server remains in <code>CLAIMED</code> status for a maximum of one minute. During
     * this time, game clients connect to the game server to start the game and trigger the game server to update its
     * utilization status. After one minute, the game server claim status reverts to null.
     * </p>
     * 
     * @return Indicates when an available game server has been reserved for gameplay but has not yet started hosting a
     *         game. Once it is claimed, the game server remains in <code>CLAIMED</code> status for a maximum of one
     *         minute. During this time, game clients connect to the game server to start the game and trigger the game
     *         server to update its utilization status. After one minute, the game server claim status reverts to null.
     * @see GameServerClaimStatus
     */

    public String getClaimStatus() {
        return this.claimStatus;
    }

    /**
     * <p>
     * Indicates when an available game server has been reserved for gameplay but has not yet started hosting a game.
     * Once it is claimed, the game server remains in <code>CLAIMED</code> status for a maximum of one minute. During
     * this time, game clients connect to the game server to start the game and trigger the game server to update its
     * utilization status. After one minute, the game server claim status reverts to null.
     * </p>
     * 
     * @param claimStatus
     *        Indicates when an available game server has been reserved for gameplay but has not yet started hosting a
     *        game. Once it is claimed, the game server remains in <code>CLAIMED</code> status for a maximum of one
     *        minute. During this time, game clients connect to the game server to start the game and trigger the game
     *        server to update its utilization status. After one minute, the game server claim status reverts to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerClaimStatus
     */

    public GameServer withClaimStatus(String claimStatus) {
        setClaimStatus(claimStatus);
        return this;
    }

    /**
     * <p>
     * Indicates when an available game server has been reserved for gameplay but has not yet started hosting a game.
     * Once it is claimed, the game server remains in <code>CLAIMED</code> status for a maximum of one minute. During
     * this time, game clients connect to the game server to start the game and trigger the game server to update its
     * utilization status. After one minute, the game server claim status reverts to null.
     * </p>
     * 
     * @param claimStatus
     *        Indicates when an available game server has been reserved for gameplay but has not yet started hosting a
     *        game. Once it is claimed, the game server remains in <code>CLAIMED</code> status for a maximum of one
     *        minute. During this time, game clients connect to the game server to start the game and trigger the game
     *        server to update its utilization status. After one minute, the game server claim status reverts to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerClaimStatus
     */

    public GameServer withClaimStatus(GameServerClaimStatus claimStatus) {
        this.claimStatus = claimStatus.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the game server is currently available for new games or is busy. Possible statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The game server is available to be claimed. A game server that has been claimed remains
     * in this status until it reports game hosting activity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UTILIZED</code> - The game server is currently hosting a game session with players.
     * </p>
     * </li>
     * </ul>
     * 
     * @param utilizationStatus
     *        Indicates whether the game server is currently available for new games or is busy. Possible statuses
     *        include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The game server is available to be claimed. A game server that has been claimed
     *        remains in this status until it reports game hosting activity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UTILIZED</code> - The game server is currently hosting a game session with players.
     *        </p>
     *        </li>
     * @see GameServerUtilizationStatus
     */

    public void setUtilizationStatus(String utilizationStatus) {
        this.utilizationStatus = utilizationStatus;
    }

    /**
     * <p>
     * Indicates whether the game server is currently available for new games or is busy. Possible statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The game server is available to be claimed. A game server that has been claimed remains
     * in this status until it reports game hosting activity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UTILIZED</code> - The game server is currently hosting a game session with players.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether the game server is currently available for new games or is busy. Possible statuses
     *         include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - The game server is available to be claimed. A game server that has been claimed
     *         remains in this status until it reports game hosting activity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UTILIZED</code> - The game server is currently hosting a game session with players.
     *         </p>
     *         </li>
     * @see GameServerUtilizationStatus
     */

    public String getUtilizationStatus() {
        return this.utilizationStatus;
    }

    /**
     * <p>
     * Indicates whether the game server is currently available for new games or is busy. Possible statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The game server is available to be claimed. A game server that has been claimed remains
     * in this status until it reports game hosting activity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UTILIZED</code> - The game server is currently hosting a game session with players.
     * </p>
     * </li>
     * </ul>
     * 
     * @param utilizationStatus
     *        Indicates whether the game server is currently available for new games or is busy. Possible statuses
     *        include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The game server is available to be claimed. A game server that has been claimed
     *        remains in this status until it reports game hosting activity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UTILIZED</code> - The game server is currently hosting a game session with players.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerUtilizationStatus
     */

    public GameServer withUtilizationStatus(String utilizationStatus) {
        setUtilizationStatus(utilizationStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether the game server is currently available for new games or is busy. Possible statuses include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The game server is available to be claimed. A game server that has been claimed remains
     * in this status until it reports game hosting activity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UTILIZED</code> - The game server is currently hosting a game session with players.
     * </p>
     * </li>
     * </ul>
     * 
     * @param utilizationStatus
     *        Indicates whether the game server is currently available for new games or is busy. Possible statuses
     *        include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The game server is available to be claimed. A game server that has been claimed
     *        remains in this status until it reports game hosting activity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UTILIZED</code> - The game server is currently hosting a game session with players.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerUtilizationStatus
     */

    public GameServer withUtilizationStatus(GameServerUtilizationStatus utilizationStatus) {
        this.utilizationStatus = utilizationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Timestamp that indicates when the game server was created with a <a>RegisterGameServer</a> request. The format is
     * a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param registrationTime
     *        Timestamp that indicates when the game server was created with a <a>RegisterGameServer</a> request. The
     *        format is a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     */

    public void setRegistrationTime(java.util.Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    /**
     * <p>
     * Timestamp that indicates when the game server was created with a <a>RegisterGameServer</a> request. The format is
     * a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @return Timestamp that indicates when the game server was created with a <a>RegisterGameServer</a> request. The
     *         format is a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     */

    public java.util.Date getRegistrationTime() {
        return this.registrationTime;
    }

    /**
     * <p>
     * Timestamp that indicates when the game server was created with a <a>RegisterGameServer</a> request. The format is
     * a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param registrationTime
     *        Timestamp that indicates when the game server was created with a <a>RegisterGameServer</a> request. The
     *        format is a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServer withRegistrationTime(java.util.Date registrationTime) {
        setRegistrationTime(registrationTime);
        return this;
    }

    /**
     * <p>
     * Timestamp that indicates the last time the game server was claimed with a <a>ClaimGameServer</a> request. The
     * format is a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>). This value
     * is used to calculate when a claimed game server's status should revert to null.
     * </p>
     * 
     * @param lastClaimTime
     *        Timestamp that indicates the last time the game server was claimed with a <a>ClaimGameServer</a> request.
     *        The format is a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     *        This value is used to calculate when a claimed game server's status should revert to null.
     */

    public void setLastClaimTime(java.util.Date lastClaimTime) {
        this.lastClaimTime = lastClaimTime;
    }

    /**
     * <p>
     * Timestamp that indicates the last time the game server was claimed with a <a>ClaimGameServer</a> request. The
     * format is a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>). This value
     * is used to calculate when a claimed game server's status should revert to null.
     * </p>
     * 
     * @return Timestamp that indicates the last time the game server was claimed with a <a>ClaimGameServer</a> request.
     *         The format is a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>
     *         ). This value is used to calculate when a claimed game server's status should revert to null.
     */

    public java.util.Date getLastClaimTime() {
        return this.lastClaimTime;
    }

    /**
     * <p>
     * Timestamp that indicates the last time the game server was claimed with a <a>ClaimGameServer</a> request. The
     * format is a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>). This value
     * is used to calculate when a claimed game server's status should revert to null.
     * </p>
     * 
     * @param lastClaimTime
     *        Timestamp that indicates the last time the game server was claimed with a <a>ClaimGameServer</a> request.
     *        The format is a number expressed in Unix time as milliseconds (for example <code>"1469498468.057"</code>).
     *        This value is used to calculate when a claimed game server's status should revert to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServer withLastClaimTime(java.util.Date lastClaimTime) {
        setLastClaimTime(lastClaimTime);
        return this;
    }

    /**
     * <p>
     * Timestamp that indicates the last time the game server was updated with health status using an
     * <a>UpdateGameServer</a> request. The format is a number expressed in Unix time as milliseconds (for example
     * <code>"1469498468.057"</code>). After game server registration, this property is only changed when a game server
     * update specifies a health check value.
     * </p>
     * 
     * @param lastHealthCheckTime
     *        Timestamp that indicates the last time the game server was updated with health status using an
     *        <a>UpdateGameServer</a> request. The format is a number expressed in Unix time as milliseconds (for
     *        example <code>"1469498468.057"</code>). After game server registration, this property is only changed when
     *        a game server update specifies a health check value.
     */

    public void setLastHealthCheckTime(java.util.Date lastHealthCheckTime) {
        this.lastHealthCheckTime = lastHealthCheckTime;
    }

    /**
     * <p>
     * Timestamp that indicates the last time the game server was updated with health status using an
     * <a>UpdateGameServer</a> request. The format is a number expressed in Unix time as milliseconds (for example
     * <code>"1469498468.057"</code>). After game server registration, this property is only changed when a game server
     * update specifies a health check value.
     * </p>
     * 
     * @return Timestamp that indicates the last time the game server was updated with health status using an
     *         <a>UpdateGameServer</a> request. The format is a number expressed in Unix time as milliseconds (for
     *         example <code>"1469498468.057"</code>). After game server registration, this property is only changed
     *         when a game server update specifies a health check value.
     */

    public java.util.Date getLastHealthCheckTime() {
        return this.lastHealthCheckTime;
    }

    /**
     * <p>
     * Timestamp that indicates the last time the game server was updated with health status using an
     * <a>UpdateGameServer</a> request. The format is a number expressed in Unix time as milliseconds (for example
     * <code>"1469498468.057"</code>). After game server registration, this property is only changed when a game server
     * update specifies a health check value.
     * </p>
     * 
     * @param lastHealthCheckTime
     *        Timestamp that indicates the last time the game server was updated with health status using an
     *        <a>UpdateGameServer</a> request. The format is a number expressed in Unix time as milliseconds (for
     *        example <code>"1469498468.057"</code>). After game server registration, this property is only changed when
     *        a game server update specifies a health check value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServer withLastHealthCheckTime(java.util.Date lastHealthCheckTime) {
        setLastHealthCheckTime(lastHealthCheckTime);
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
        if (getGameServerGroupArn() != null)
            sb.append("GameServerGroupArn: ").append(getGameServerGroupArn()).append(",");
        if (getGameServerId() != null)
            sb.append("GameServerId: ").append(getGameServerId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getConnectionInfo() != null)
            sb.append("ConnectionInfo: ").append(getConnectionInfo()).append(",");
        if (getGameServerData() != null)
            sb.append("GameServerData: ").append(getGameServerData()).append(",");
        if (getClaimStatus() != null)
            sb.append("ClaimStatus: ").append(getClaimStatus()).append(",");
        if (getUtilizationStatus() != null)
            sb.append("UtilizationStatus: ").append(getUtilizationStatus()).append(",");
        if (getRegistrationTime() != null)
            sb.append("RegistrationTime: ").append(getRegistrationTime()).append(",");
        if (getLastClaimTime() != null)
            sb.append("LastClaimTime: ").append(getLastClaimTime()).append(",");
        if (getLastHealthCheckTime() != null)
            sb.append("LastHealthCheckTime: ").append(getLastHealthCheckTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GameServer == false)
            return false;
        GameServer other = (GameServer) obj;
        if (other.getGameServerGroupName() == null ^ this.getGameServerGroupName() == null)
            return false;
        if (other.getGameServerGroupName() != null && other.getGameServerGroupName().equals(this.getGameServerGroupName()) == false)
            return false;
        if (other.getGameServerGroupArn() == null ^ this.getGameServerGroupArn() == null)
            return false;
        if (other.getGameServerGroupArn() != null && other.getGameServerGroupArn().equals(this.getGameServerGroupArn()) == false)
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
        if (other.getClaimStatus() == null ^ this.getClaimStatus() == null)
            return false;
        if (other.getClaimStatus() != null && other.getClaimStatus().equals(this.getClaimStatus()) == false)
            return false;
        if (other.getUtilizationStatus() == null ^ this.getUtilizationStatus() == null)
            return false;
        if (other.getUtilizationStatus() != null && other.getUtilizationStatus().equals(this.getUtilizationStatus()) == false)
            return false;
        if (other.getRegistrationTime() == null ^ this.getRegistrationTime() == null)
            return false;
        if (other.getRegistrationTime() != null && other.getRegistrationTime().equals(this.getRegistrationTime()) == false)
            return false;
        if (other.getLastClaimTime() == null ^ this.getLastClaimTime() == null)
            return false;
        if (other.getLastClaimTime() != null && other.getLastClaimTime().equals(this.getLastClaimTime()) == false)
            return false;
        if (other.getLastHealthCheckTime() == null ^ this.getLastHealthCheckTime() == null)
            return false;
        if (other.getLastHealthCheckTime() != null && other.getLastHealthCheckTime().equals(this.getLastHealthCheckTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getGameServerGroupArn() == null) ? 0 : getGameServerGroupArn().hashCode());
        hashCode = prime * hashCode + ((getGameServerId() == null) ? 0 : getGameServerId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getConnectionInfo() == null) ? 0 : getConnectionInfo().hashCode());
        hashCode = prime * hashCode + ((getGameServerData() == null) ? 0 : getGameServerData().hashCode());
        hashCode = prime * hashCode + ((getClaimStatus() == null) ? 0 : getClaimStatus().hashCode());
        hashCode = prime * hashCode + ((getUtilizationStatus() == null) ? 0 : getUtilizationStatus().hashCode());
        hashCode = prime * hashCode + ((getRegistrationTime() == null) ? 0 : getRegistrationTime().hashCode());
        hashCode = prime * hashCode + ((getLastClaimTime() == null) ? 0 : getLastClaimTime().hashCode());
        hashCode = prime * hashCode + ((getLastHealthCheckTime() == null) ? 0 : getLastHealthCheckTime().hashCode());
        return hashCode;
    }

    @Override
    public GameServer clone() {
        try {
            return (GameServer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.GameServerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
