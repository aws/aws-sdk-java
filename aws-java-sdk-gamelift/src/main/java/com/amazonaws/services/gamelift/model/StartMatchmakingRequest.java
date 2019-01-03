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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchmaking" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMatchmakingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one
     * in the form of a UUID. Use this identifier to track the matchmaking ticket status and retrieve match results.
     * </p>
     */
    private String ticketId;
    /**
     * <p>
     * Name of the matchmaking configuration to use for this request. Matchmaking configurations must exist in the same
     * region as this request.
     * </p>
     */
    private String configurationName;
    /**
     * <p>
     * Information on each player to be matched. This information must include a player ID, and may contain player
     * attributes and latency data to be used in the matchmaking process. After a successful match, <code>Player</code>
     * objects contain the name of the team the player is assigned to.
     * </p>
     */
    private java.util.List<Player> players;

    /**
     * <p>
     * Unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one
     * in the form of a UUID. Use this identifier to track the matchmaking ticket status and retrieve match results.
     * </p>
     * 
     * @param ticketId
     *        Unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will
     *        generate one in the form of a UUID. Use this identifier to track the matchmaking ticket status and
     *        retrieve match results.
     */

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one
     * in the form of a UUID. Use this identifier to track the matchmaking ticket status and retrieve match results.
     * </p>
     * 
     * @return Unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will
     *         generate one in the form of a UUID. Use this identifier to track the matchmaking ticket status and
     *         retrieve match results.
     */

    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one
     * in the form of a UUID. Use this identifier to track the matchmaking ticket status and retrieve match results.
     * </p>
     * 
     * @param ticketId
     *        Unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will
     *        generate one in the form of a UUID. Use this identifier to track the matchmaking ticket status and
     *        retrieve match results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMatchmakingRequest withTicketId(String ticketId) {
        setTicketId(ticketId);
        return this;
    }

    /**
     * <p>
     * Name of the matchmaking configuration to use for this request. Matchmaking configurations must exist in the same
     * region as this request.
     * </p>
     * 
     * @param configurationName
     *        Name of the matchmaking configuration to use for this request. Matchmaking configurations must exist in
     *        the same region as this request.
     */

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    /**
     * <p>
     * Name of the matchmaking configuration to use for this request. Matchmaking configurations must exist in the same
     * region as this request.
     * </p>
     * 
     * @return Name of the matchmaking configuration to use for this request. Matchmaking configurations must exist in
     *         the same region as this request.
     */

    public String getConfigurationName() {
        return this.configurationName;
    }

    /**
     * <p>
     * Name of the matchmaking configuration to use for this request. Matchmaking configurations must exist in the same
     * region as this request.
     * </p>
     * 
     * @param configurationName
     *        Name of the matchmaking configuration to use for this request. Matchmaking configurations must exist in
     *        the same region as this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMatchmakingRequest withConfigurationName(String configurationName) {
        setConfigurationName(configurationName);
        return this;
    }

    /**
     * <p>
     * Information on each player to be matched. This information must include a player ID, and may contain player
     * attributes and latency data to be used in the matchmaking process. After a successful match, <code>Player</code>
     * objects contain the name of the team the player is assigned to.
     * </p>
     * 
     * @return Information on each player to be matched. This information must include a player ID, and may contain
     *         player attributes and latency data to be used in the matchmaking process. After a successful match,
     *         <code>Player</code> objects contain the name of the team the player is assigned to.
     */

    public java.util.List<Player> getPlayers() {
        return players;
    }

    /**
     * <p>
     * Information on each player to be matched. This information must include a player ID, and may contain player
     * attributes and latency data to be used in the matchmaking process. After a successful match, <code>Player</code>
     * objects contain the name of the team the player is assigned to.
     * </p>
     * 
     * @param players
     *        Information on each player to be matched. This information must include a player ID, and may contain
     *        player attributes and latency data to be used in the matchmaking process. After a successful match,
     *        <code>Player</code> objects contain the name of the team the player is assigned to.
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
     * Information on each player to be matched. This information must include a player ID, and may contain player
     * attributes and latency data to be used in the matchmaking process. After a successful match, <code>Player</code>
     * objects contain the name of the team the player is assigned to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlayers(java.util.Collection)} or {@link #withPlayers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param players
     *        Information on each player to be matched. This information must include a player ID, and may contain
     *        player attributes and latency data to be used in the matchmaking process. After a successful match,
     *        <code>Player</code> objects contain the name of the team the player is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMatchmakingRequest withPlayers(Player... players) {
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
     * Information on each player to be matched. This information must include a player ID, and may contain player
     * attributes and latency data to be used in the matchmaking process. After a successful match, <code>Player</code>
     * objects contain the name of the team the player is assigned to.
     * </p>
     * 
     * @param players
     *        Information on each player to be matched. This information must include a player ID, and may contain
     *        player attributes and latency data to be used in the matchmaking process. After a successful match,
     *        <code>Player</code> objects contain the name of the team the player is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMatchmakingRequest withPlayers(java.util.Collection<Player> players) {
        setPlayers(players);
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
        if (getPlayers() != null)
            sb.append("Players: ").append(getPlayers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMatchmakingRequest == false)
            return false;
        StartMatchmakingRequest other = (StartMatchmakingRequest) obj;
        if (other.getTicketId() == null ^ this.getTicketId() == null)
            return false;
        if (other.getTicketId() != null && other.getTicketId().equals(this.getTicketId()) == false)
            return false;
        if (other.getConfigurationName() == null ^ this.getConfigurationName() == null)
            return false;
        if (other.getConfigurationName() != null && other.getConfigurationName().equals(this.getConfigurationName()) == false)
            return false;
        if (other.getPlayers() == null ^ this.getPlayers() == null)
            return false;
        if (other.getPlayers() != null && other.getPlayers().equals(this.getPlayers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTicketId() == null) ? 0 : getTicketId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationName() == null) ? 0 : getConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getPlayers() == null) ? 0 : getPlayers().hashCode());
        return hashCode;
    }

    @Override
    public StartMatchmakingRequest clone() {
        return (StartMatchmakingRequest) super.clone();
    }

}
