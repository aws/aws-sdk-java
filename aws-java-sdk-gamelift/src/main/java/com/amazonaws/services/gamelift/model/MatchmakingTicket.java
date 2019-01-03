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
 * Ticket generated to track the progress of a matchmaking request. Each ticket is uniquely identified by a ticket ID,
 * supplied by the requester, when creating a matchmaking request with <a>StartMatchmaking</a>. Tickets can be retrieved
 * by calling <a>DescribeMatchmaking</a> with the ticket ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/MatchmakingTicket" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchmakingTicket implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a matchmaking ticket.
     * </p>
     */
    private String ticketId;
    /**
     * <p>
     * Name of the <a>MatchmakingConfiguration</a> that is used with this ticket. Matchmaking configurations determine
     * how players are grouped into a match and how a new game session is created for the match.
     * </p>
     */
    private String configurationName;
    /**
     * <p>
     * Current status of the matchmaking request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>QUEUED</b> -- The matchmaking request has been received and is currently waiting to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SEARCHING</b> -- The matchmaking request is currently being processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REQUIRES_ACCEPTANCE</b> -- A match has been proposed and the players must accept the match (see
     * <a>AcceptMatch</a>). This status is used only with requests that use a matchmaking configuration with a player
     * acceptance requirement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PLACING</b> -- The FlexMatch engine has matched players and is in the process of placing a new game session
     * for the match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPLETED</b> -- Players have been matched and a game session is ready to host the players. A ticket in this
     * state contains the necessary connection information for players.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b> -- The matchmaking request was not completed. Tickets with players who fail to accept a proposed
     * match are placed in <code>FAILED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELLED</b> -- The matchmaking request was canceled with a call to <a>StopMatchmaking</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMED_OUT</b> -- The matchmaking request was not successful within the duration specified in the matchmaking
     * configuration.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Matchmaking requests that fail to successfully complete (statuses FAILED, CANCELLED, TIMED_OUT) can be
     * resubmitted as new requests with new ticket IDs.
     * </p>
     * </note>
     */
    private String status;
    /**
     * <p>
     * Code to explain the current status. For example, a status reason may indicate when a ticket has returned to
     * <code>SEARCHING</code> status after a proposed match fails to receive player acceptances.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * Additional information about the current status.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Time stamp indicating when this matchmaking request was received. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Time stamp indicating when this matchmaking request stopped being processed due to success, failure, or
     * cancellation. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * A set of <code>Player</code> objects, each representing a player to find matches for. Players are identified by a
     * unique player ID and may include latency data for use during matchmaking. If the ticket is in status
     * <code>COMPLETED</code>, the <code>Player</code> objects include the team the players were assigned to in the
     * resulting match.
     * </p>
     */
    private java.util.List<Player> players;
    /**
     * <p>
     * Identifier and connection information of the game session created for the match. This information is added to the
     * ticket only after the matchmaking request has been successfully completed.
     * </p>
     */
    private GameSessionConnectionInfo gameSessionConnectionInfo;
    /**
     * <p>
     * Average amount of time (in seconds) that players are currently waiting for a match. If there is not enough recent
     * data, this property may be empty.
     * </p>
     */
    private Integer estimatedWaitTime;

    /**
     * <p>
     * Unique identifier for a matchmaking ticket.
     * </p>
     * 
     * @param ticketId
     *        Unique identifier for a matchmaking ticket.
     */

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking ticket.
     * </p>
     * 
     * @return Unique identifier for a matchmaking ticket.
     */

    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking ticket.
     * </p>
     * 
     * @param ticketId
     *        Unique identifier for a matchmaking ticket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingTicket withTicketId(String ticketId) {
        setTicketId(ticketId);
        return this;
    }

    /**
     * <p>
     * Name of the <a>MatchmakingConfiguration</a> that is used with this ticket. Matchmaking configurations determine
     * how players are grouped into a match and how a new game session is created for the match.
     * </p>
     * 
     * @param configurationName
     *        Name of the <a>MatchmakingConfiguration</a> that is used with this ticket. Matchmaking configurations
     *        determine how players are grouped into a match and how a new game session is created for the match.
     */

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    /**
     * <p>
     * Name of the <a>MatchmakingConfiguration</a> that is used with this ticket. Matchmaking configurations determine
     * how players are grouped into a match and how a new game session is created for the match.
     * </p>
     * 
     * @return Name of the <a>MatchmakingConfiguration</a> that is used with this ticket. Matchmaking configurations
     *         determine how players are grouped into a match and how a new game session is created for the match.
     */

    public String getConfigurationName() {
        return this.configurationName;
    }

    /**
     * <p>
     * Name of the <a>MatchmakingConfiguration</a> that is used with this ticket. Matchmaking configurations determine
     * how players are grouped into a match and how a new game session is created for the match.
     * </p>
     * 
     * @param configurationName
     *        Name of the <a>MatchmakingConfiguration</a> that is used with this ticket. Matchmaking configurations
     *        determine how players are grouped into a match and how a new game session is created for the match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingTicket withConfigurationName(String configurationName) {
        setConfigurationName(configurationName);
        return this;
    }

    /**
     * <p>
     * Current status of the matchmaking request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>QUEUED</b> -- The matchmaking request has been received and is currently waiting to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SEARCHING</b> -- The matchmaking request is currently being processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REQUIRES_ACCEPTANCE</b> -- A match has been proposed and the players must accept the match (see
     * <a>AcceptMatch</a>). This status is used only with requests that use a matchmaking configuration with a player
     * acceptance requirement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PLACING</b> -- The FlexMatch engine has matched players and is in the process of placing a new game session
     * for the match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPLETED</b> -- Players have been matched and a game session is ready to host the players. A ticket in this
     * state contains the necessary connection information for players.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b> -- The matchmaking request was not completed. Tickets with players who fail to accept a proposed
     * match are placed in <code>FAILED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELLED</b> -- The matchmaking request was canceled with a call to <a>StopMatchmaking</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMED_OUT</b> -- The matchmaking request was not successful within the duration specified in the matchmaking
     * configuration.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Matchmaking requests that fail to successfully complete (statuses FAILED, CANCELLED, TIMED_OUT) can be
     * resubmitted as new requests with new ticket IDs.
     * </p>
     * </note>
     * 
     * @param status
     *        Current status of the matchmaking request.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>QUEUED</b> -- The matchmaking request has been received and is currently waiting to be processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SEARCHING</b> -- The matchmaking request is currently being processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REQUIRES_ACCEPTANCE</b> -- A match has been proposed and the players must accept the match (see
     *        <a>AcceptMatch</a>). This status is used only with requests that use a matchmaking configuration with a
     *        player acceptance requirement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PLACING</b> -- The FlexMatch engine has matched players and is in the process of placing a new game
     *        session for the match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPLETED</b> -- Players have been matched and a game session is ready to host the players. A ticket in
     *        this state contains the necessary connection information for players.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAILED</b> -- The matchmaking request was not completed. Tickets with players who fail to accept a
     *        proposed match are placed in <code>FAILED</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELLED</b> -- The matchmaking request was canceled with a call to <a>StopMatchmaking</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TIMED_OUT</b> -- The matchmaking request was not successful within the duration specified in the
     *        matchmaking configuration.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Matchmaking requests that fail to successfully complete (statuses FAILED, CANCELLED, TIMED_OUT) can be
     *        resubmitted as new requests with new ticket IDs.
     *        </p>
     * @see MatchmakingConfigurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the matchmaking request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>QUEUED</b> -- The matchmaking request has been received and is currently waiting to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SEARCHING</b> -- The matchmaking request is currently being processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REQUIRES_ACCEPTANCE</b> -- A match has been proposed and the players must accept the match (see
     * <a>AcceptMatch</a>). This status is used only with requests that use a matchmaking configuration with a player
     * acceptance requirement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PLACING</b> -- The FlexMatch engine has matched players and is in the process of placing a new game session
     * for the match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPLETED</b> -- Players have been matched and a game session is ready to host the players. A ticket in this
     * state contains the necessary connection information for players.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b> -- The matchmaking request was not completed. Tickets with players who fail to accept a proposed
     * match are placed in <code>FAILED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELLED</b> -- The matchmaking request was canceled with a call to <a>StopMatchmaking</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMED_OUT</b> -- The matchmaking request was not successful within the duration specified in the matchmaking
     * configuration.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Matchmaking requests that fail to successfully complete (statuses FAILED, CANCELLED, TIMED_OUT) can be
     * resubmitted as new requests with new ticket IDs.
     * </p>
     * </note>
     * 
     * @return Current status of the matchmaking request.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>QUEUED</b> -- The matchmaking request has been received and is currently waiting to be processed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SEARCHING</b> -- The matchmaking request is currently being processed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>REQUIRES_ACCEPTANCE</b> -- A match has been proposed and the players must accept the match (see
     *         <a>AcceptMatch</a>). This status is used only with requests that use a matchmaking configuration with a
     *         player acceptance requirement.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PLACING</b> -- The FlexMatch engine has matched players and is in the process of placing a new game
     *         session for the match.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>COMPLETED</b> -- Players have been matched and a game session is ready to host the players. A ticket
     *         in this state contains the necessary connection information for players.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FAILED</b> -- The matchmaking request was not completed. Tickets with players who fail to accept a
     *         proposed match are placed in <code>FAILED</code> status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CANCELLED</b> -- The matchmaking request was canceled with a call to <a>StopMatchmaking</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>TIMED_OUT</b> -- The matchmaking request was not successful within the duration specified in the
     *         matchmaking configuration.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Matchmaking requests that fail to successfully complete (statuses FAILED, CANCELLED, TIMED_OUT) can be
     *         resubmitted as new requests with new ticket IDs.
     *         </p>
     * @see MatchmakingConfigurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the matchmaking request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>QUEUED</b> -- The matchmaking request has been received and is currently waiting to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SEARCHING</b> -- The matchmaking request is currently being processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REQUIRES_ACCEPTANCE</b> -- A match has been proposed and the players must accept the match (see
     * <a>AcceptMatch</a>). This status is used only with requests that use a matchmaking configuration with a player
     * acceptance requirement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PLACING</b> -- The FlexMatch engine has matched players and is in the process of placing a new game session
     * for the match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPLETED</b> -- Players have been matched and a game session is ready to host the players. A ticket in this
     * state contains the necessary connection information for players.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b> -- The matchmaking request was not completed. Tickets with players who fail to accept a proposed
     * match are placed in <code>FAILED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELLED</b> -- The matchmaking request was canceled with a call to <a>StopMatchmaking</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMED_OUT</b> -- The matchmaking request was not successful within the duration specified in the matchmaking
     * configuration.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Matchmaking requests that fail to successfully complete (statuses FAILED, CANCELLED, TIMED_OUT) can be
     * resubmitted as new requests with new ticket IDs.
     * </p>
     * </note>
     * 
     * @param status
     *        Current status of the matchmaking request.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>QUEUED</b> -- The matchmaking request has been received and is currently waiting to be processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SEARCHING</b> -- The matchmaking request is currently being processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REQUIRES_ACCEPTANCE</b> -- A match has been proposed and the players must accept the match (see
     *        <a>AcceptMatch</a>). This status is used only with requests that use a matchmaking configuration with a
     *        player acceptance requirement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PLACING</b> -- The FlexMatch engine has matched players and is in the process of placing a new game
     *        session for the match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPLETED</b> -- Players have been matched and a game session is ready to host the players. A ticket in
     *        this state contains the necessary connection information for players.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAILED</b> -- The matchmaking request was not completed. Tickets with players who fail to accept a
     *        proposed match are placed in <code>FAILED</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELLED</b> -- The matchmaking request was canceled with a call to <a>StopMatchmaking</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TIMED_OUT</b> -- The matchmaking request was not successful within the duration specified in the
     *        matchmaking configuration.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Matchmaking requests that fail to successfully complete (statuses FAILED, CANCELLED, TIMED_OUT) can be
     *        resubmitted as new requests with new ticket IDs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MatchmakingConfigurationStatus
     */

    public MatchmakingTicket withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the matchmaking request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>QUEUED</b> -- The matchmaking request has been received and is currently waiting to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SEARCHING</b> -- The matchmaking request is currently being processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REQUIRES_ACCEPTANCE</b> -- A match has been proposed and the players must accept the match (see
     * <a>AcceptMatch</a>). This status is used only with requests that use a matchmaking configuration with a player
     * acceptance requirement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PLACING</b> -- The FlexMatch engine has matched players and is in the process of placing a new game session
     * for the match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>COMPLETED</b> -- Players have been matched and a game session is ready to host the players. A ticket in this
     * state contains the necessary connection information for players.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b> -- The matchmaking request was not completed. Tickets with players who fail to accept a proposed
     * match are placed in <code>FAILED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELLED</b> -- The matchmaking request was canceled with a call to <a>StopMatchmaking</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TIMED_OUT</b> -- The matchmaking request was not successful within the duration specified in the matchmaking
     * configuration.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Matchmaking requests that fail to successfully complete (statuses FAILED, CANCELLED, TIMED_OUT) can be
     * resubmitted as new requests with new ticket IDs.
     * </p>
     * </note>
     * 
     * @param status
     *        Current status of the matchmaking request.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>QUEUED</b> -- The matchmaking request has been received and is currently waiting to be processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SEARCHING</b> -- The matchmaking request is currently being processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REQUIRES_ACCEPTANCE</b> -- A match has been proposed and the players must accept the match (see
     *        <a>AcceptMatch</a>). This status is used only with requests that use a matchmaking configuration with a
     *        player acceptance requirement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PLACING</b> -- The FlexMatch engine has matched players and is in the process of placing a new game
     *        session for the match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>COMPLETED</b> -- Players have been matched and a game session is ready to host the players. A ticket in
     *        this state contains the necessary connection information for players.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAILED</b> -- The matchmaking request was not completed. Tickets with players who fail to accept a
     *        proposed match are placed in <code>FAILED</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELLED</b> -- The matchmaking request was canceled with a call to <a>StopMatchmaking</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TIMED_OUT</b> -- The matchmaking request was not successful within the duration specified in the
     *        matchmaking configuration.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Matchmaking requests that fail to successfully complete (statuses FAILED, CANCELLED, TIMED_OUT) can be
     *        resubmitted as new requests with new ticket IDs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MatchmakingConfigurationStatus
     */

    public MatchmakingTicket withStatus(MatchmakingConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Code to explain the current status. For example, a status reason may indicate when a ticket has returned to
     * <code>SEARCHING</code> status after a proposed match fails to receive player acceptances.
     * </p>
     * 
     * @param statusReason
     *        Code to explain the current status. For example, a status reason may indicate when a ticket has returned
     *        to <code>SEARCHING</code> status after a proposed match fails to receive player acceptances.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Code to explain the current status. For example, a status reason may indicate when a ticket has returned to
     * <code>SEARCHING</code> status after a proposed match fails to receive player acceptances.
     * </p>
     * 
     * @return Code to explain the current status. For example, a status reason may indicate when a ticket has returned
     *         to <code>SEARCHING</code> status after a proposed match fails to receive player acceptances.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Code to explain the current status. For example, a status reason may indicate when a ticket has returned to
     * <code>SEARCHING</code> status after a proposed match fails to receive player acceptances.
     * </p>
     * 
     * @param statusReason
     *        Code to explain the current status. For example, a status reason may indicate when a ticket has returned
     *        to <code>SEARCHING</code> status after a proposed match fails to receive player acceptances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingTicket withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Additional information about the current status.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the current status.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Additional information about the current status.
     * </p>
     * 
     * @return Additional information about the current status.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Additional information about the current status.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingTicket withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this matchmaking request was received. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param startTime
     *        Time stamp indicating when this matchmaking request was received. Format is a number expressed in Unix
     *        time as milliseconds (for example "1469498468.057").
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Time stamp indicating when this matchmaking request was received. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @return Time stamp indicating when this matchmaking request was received. Format is a number expressed in Unix
     *         time as milliseconds (for example "1469498468.057").
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Time stamp indicating when this matchmaking request was received. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param startTime
     *        Time stamp indicating when this matchmaking request was received. Format is a number expressed in Unix
     *        time as milliseconds (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingTicket withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this matchmaking request stopped being processed due to success, failure, or
     * cancellation. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param endTime
     *        Time stamp indicating when this matchmaking request stopped being processed due to success, failure, or
     *        cancellation. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Time stamp indicating when this matchmaking request stopped being processed due to success, failure, or
     * cancellation. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @return Time stamp indicating when this matchmaking request stopped being processed due to success, failure, or
     *         cancellation. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Time stamp indicating when this matchmaking request stopped being processed due to success, failure, or
     * cancellation. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param endTime
     *        Time stamp indicating when this matchmaking request stopped being processed due to success, failure, or
     *        cancellation. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingTicket withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A set of <code>Player</code> objects, each representing a player to find matches for. Players are identified by a
     * unique player ID and may include latency data for use during matchmaking. If the ticket is in status
     * <code>COMPLETED</code>, the <code>Player</code> objects include the team the players were assigned to in the
     * resulting match.
     * </p>
     * 
     * @return A set of <code>Player</code> objects, each representing a player to find matches for. Players are
     *         identified by a unique player ID and may include latency data for use during matchmaking. If the ticket
     *         is in status <code>COMPLETED</code>, the <code>Player</code> objects include the team the players were
     *         assigned to in the resulting match.
     */

    public java.util.List<Player> getPlayers() {
        return players;
    }

    /**
     * <p>
     * A set of <code>Player</code> objects, each representing a player to find matches for. Players are identified by a
     * unique player ID and may include latency data for use during matchmaking. If the ticket is in status
     * <code>COMPLETED</code>, the <code>Player</code> objects include the team the players were assigned to in the
     * resulting match.
     * </p>
     * 
     * @param players
     *        A set of <code>Player</code> objects, each representing a player to find matches for. Players are
     *        identified by a unique player ID and may include latency data for use during matchmaking. If the ticket is
     *        in status <code>COMPLETED</code>, the <code>Player</code> objects include the team the players were
     *        assigned to in the resulting match.
     */

    public void setPlayers(java.util.Collection<Player> players) {
        if (players == null) {
            this.players = null;
            return;
        }

        this.players = new java.util.ArrayList<Player>(players);
    }

    /**
     * <p>
     * A set of <code>Player</code> objects, each representing a player to find matches for. Players are identified by a
     * unique player ID and may include latency data for use during matchmaking. If the ticket is in status
     * <code>COMPLETED</code>, the <code>Player</code> objects include the team the players were assigned to in the
     * resulting match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlayers(java.util.Collection)} or {@link #withPlayers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param players
     *        A set of <code>Player</code> objects, each representing a player to find matches for. Players are
     *        identified by a unique player ID and may include latency data for use during matchmaking. If the ticket is
     *        in status <code>COMPLETED</code>, the <code>Player</code> objects include the team the players were
     *        assigned to in the resulting match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingTicket withPlayers(Player... players) {
        if (this.players == null) {
            setPlayers(new java.util.ArrayList<Player>(players.length));
        }
        for (Player ele : players) {
            this.players.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of <code>Player</code> objects, each representing a player to find matches for. Players are identified by a
     * unique player ID and may include latency data for use during matchmaking. If the ticket is in status
     * <code>COMPLETED</code>, the <code>Player</code> objects include the team the players were assigned to in the
     * resulting match.
     * </p>
     * 
     * @param players
     *        A set of <code>Player</code> objects, each representing a player to find matches for. Players are
     *        identified by a unique player ID and may include latency data for use during matchmaking. If the ticket is
     *        in status <code>COMPLETED</code>, the <code>Player</code> objects include the team the players were
     *        assigned to in the resulting match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingTicket withPlayers(java.util.Collection<Player> players) {
        setPlayers(players);
        return this;
    }

    /**
     * <p>
     * Identifier and connection information of the game session created for the match. This information is added to the
     * ticket only after the matchmaking request has been successfully completed.
     * </p>
     * 
     * @param gameSessionConnectionInfo
     *        Identifier and connection information of the game session created for the match. This information is added
     *        to the ticket only after the matchmaking request has been successfully completed.
     */

    public void setGameSessionConnectionInfo(GameSessionConnectionInfo gameSessionConnectionInfo) {
        this.gameSessionConnectionInfo = gameSessionConnectionInfo;
    }

    /**
     * <p>
     * Identifier and connection information of the game session created for the match. This information is added to the
     * ticket only after the matchmaking request has been successfully completed.
     * </p>
     * 
     * @return Identifier and connection information of the game session created for the match. This information is
     *         added to the ticket only after the matchmaking request has been successfully completed.
     */

    public GameSessionConnectionInfo getGameSessionConnectionInfo() {
        return this.gameSessionConnectionInfo;
    }

    /**
     * <p>
     * Identifier and connection information of the game session created for the match. This information is added to the
     * ticket only after the matchmaking request has been successfully completed.
     * </p>
     * 
     * @param gameSessionConnectionInfo
     *        Identifier and connection information of the game session created for the match. This information is added
     *        to the ticket only after the matchmaking request has been successfully completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingTicket withGameSessionConnectionInfo(GameSessionConnectionInfo gameSessionConnectionInfo) {
        setGameSessionConnectionInfo(gameSessionConnectionInfo);
        return this;
    }

    /**
     * <p>
     * Average amount of time (in seconds) that players are currently waiting for a match. If there is not enough recent
     * data, this property may be empty.
     * </p>
     * 
     * @param estimatedWaitTime
     *        Average amount of time (in seconds) that players are currently waiting for a match. If there is not enough
     *        recent data, this property may be empty.
     */

    public void setEstimatedWaitTime(Integer estimatedWaitTime) {
        this.estimatedWaitTime = estimatedWaitTime;
    }

    /**
     * <p>
     * Average amount of time (in seconds) that players are currently waiting for a match. If there is not enough recent
     * data, this property may be empty.
     * </p>
     * 
     * @return Average amount of time (in seconds) that players are currently waiting for a match. If there is not
     *         enough recent data, this property may be empty.
     */

    public Integer getEstimatedWaitTime() {
        return this.estimatedWaitTime;
    }

    /**
     * <p>
     * Average amount of time (in seconds) that players are currently waiting for a match. If there is not enough recent
     * data, this property may be empty.
     * </p>
     * 
     * @param estimatedWaitTime
     *        Average amount of time (in seconds) that players are currently waiting for a match. If there is not enough
     *        recent data, this property may be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchmakingTicket withEstimatedWaitTime(Integer estimatedWaitTime) {
        setEstimatedWaitTime(estimatedWaitTime);
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
        if (getTicketId() != null)
            sb.append("TicketId: ").append(getTicketId()).append(",");
        if (getConfigurationName() != null)
            sb.append("ConfigurationName: ").append(getConfigurationName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getPlayers() != null)
            sb.append("Players: ").append(getPlayers()).append(",");
        if (getGameSessionConnectionInfo() != null)
            sb.append("GameSessionConnectionInfo: ").append(getGameSessionConnectionInfo()).append(",");
        if (getEstimatedWaitTime() != null)
            sb.append("EstimatedWaitTime: ").append(getEstimatedWaitTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchmakingTicket == false)
            return false;
        MatchmakingTicket other = (MatchmakingTicket) obj;
        if (other.getTicketId() == null ^ this.getTicketId() == null)
            return false;
        if (other.getTicketId() != null && other.getTicketId().equals(this.getTicketId()) == false)
            return false;
        if (other.getConfigurationName() == null ^ this.getConfigurationName() == null)
            return false;
        if (other.getConfigurationName() != null && other.getConfigurationName().equals(this.getConfigurationName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getPlayers() == null ^ this.getPlayers() == null)
            return false;
        if (other.getPlayers() != null && other.getPlayers().equals(this.getPlayers()) == false)
            return false;
        if (other.getGameSessionConnectionInfo() == null ^ this.getGameSessionConnectionInfo() == null)
            return false;
        if (other.getGameSessionConnectionInfo() != null && other.getGameSessionConnectionInfo().equals(this.getGameSessionConnectionInfo()) == false)
            return false;
        if (other.getEstimatedWaitTime() == null ^ this.getEstimatedWaitTime() == null)
            return false;
        if (other.getEstimatedWaitTime() != null && other.getEstimatedWaitTime().equals(this.getEstimatedWaitTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTicketId() == null) ? 0 : getTicketId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationName() == null) ? 0 : getConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getPlayers() == null) ? 0 : getPlayers().hashCode());
        hashCode = prime * hashCode + ((getGameSessionConnectionInfo() == null) ? 0 : getGameSessionConnectionInfo().hashCode());
        hashCode = prime * hashCode + ((getEstimatedWaitTime() == null) ? 0 : getEstimatedWaitTime().hashCode());
        return hashCode;
    }

    @Override
    public MatchmakingTicket clone() {
        try {
            return (MatchmakingTicket) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.MatchmakingTicketMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
