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
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchBackfill" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMatchBackfillRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate
     * one in the form of a UUID. Use this identifier to track the match backfill ticket status and retrieve match
     * results.
     * </p>
     */
    private String ticketId;
    /**
     * <p>
     * Name of the matchmaker to use for this request. You can use either the configuration name or ARN value. The ARN
     * of the matchmaker that was used with the original game session is listed in the <a>GameSession</a> object,
     * <code>MatchmakerData</code> property.
     * </p>
     */
    private String configurationName;
    /**
     * <p>
     * Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is assigned to a
     * game session and uniquely identifies it. This is the same as the game session ID.
     * </p>
     */
    private String gameSessionArn;
    /**
     * <p>
     * Match information on all players that are currently assigned to the game session. This information is used by the
     * matchmaker to find new players and add them to the existing game.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PlayerID, PlayerAttributes, Team -\\- This information is maintained in the <a>GameSession</a> object,
     * <code>MatchmakerData</code> property, for all players who are currently assigned to the game session. The
     * matchmaker data is in JSON syntax, formatted as a string. For more details, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data"> Match
     * Data</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LatencyInMs -\\- If the matchmaker uses player latency, include a latency value, in milliseconds, for the Region
     * that the game session is currently in. Do not include latency values for any other Region.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Player> players;

    /**
     * <p>
     * A unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate
     * one in the form of a UUID. Use this identifier to track the match backfill ticket status and retrieve match
     * results.
     * </p>
     * 
     * @param ticketId
     *        A unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will
     *        generate one in the form of a UUID. Use this identifier to track the match backfill ticket status and
     *        retrieve match results.
     */

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * <p>
     * A unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate
     * one in the form of a UUID. Use this identifier to track the match backfill ticket status and retrieve match
     * results.
     * </p>
     * 
     * @return A unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will
     *         generate one in the form of a UUID. Use this identifier to track the match backfill ticket status and
     *         retrieve match results.
     */

    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * <p>
     * A unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate
     * one in the form of a UUID. Use this identifier to track the match backfill ticket status and retrieve match
     * results.
     * </p>
     * 
     * @param ticketId
     *        A unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will
     *        generate one in the form of a UUID. Use this identifier to track the match backfill ticket status and
     *        retrieve match results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMatchBackfillRequest withTicketId(String ticketId) {
        setTicketId(ticketId);
        return this;
    }

    /**
     * <p>
     * Name of the matchmaker to use for this request. You can use either the configuration name or ARN value. The ARN
     * of the matchmaker that was used with the original game session is listed in the <a>GameSession</a> object,
     * <code>MatchmakerData</code> property.
     * </p>
     * 
     * @param configurationName
     *        Name of the matchmaker to use for this request. You can use either the configuration name or ARN value.
     *        The ARN of the matchmaker that was used with the original game session is listed in the <a>GameSession</a>
     *        object, <code>MatchmakerData</code> property.
     */

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    /**
     * <p>
     * Name of the matchmaker to use for this request. You can use either the configuration name or ARN value. The ARN
     * of the matchmaker that was used with the original game session is listed in the <a>GameSession</a> object,
     * <code>MatchmakerData</code> property.
     * </p>
     * 
     * @return Name of the matchmaker to use for this request. You can use either the configuration name or ARN value.
     *         The ARN of the matchmaker that was used with the original game session is listed in the
     *         <a>GameSession</a> object, <code>MatchmakerData</code> property.
     */

    public String getConfigurationName() {
        return this.configurationName;
    }

    /**
     * <p>
     * Name of the matchmaker to use for this request. You can use either the configuration name or ARN value. The ARN
     * of the matchmaker that was used with the original game session is listed in the <a>GameSession</a> object,
     * <code>MatchmakerData</code> property.
     * </p>
     * 
     * @param configurationName
     *        Name of the matchmaker to use for this request. You can use either the configuration name or ARN value.
     *        The ARN of the matchmaker that was used with the original game session is listed in the <a>GameSession</a>
     *        object, <code>MatchmakerData</code> property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMatchBackfillRequest withConfigurationName(String configurationName) {
        setConfigurationName(configurationName);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is assigned to a
     * game session and uniquely identifies it. This is the same as the game session ID.
     * </p>
     * 
     * @param gameSessionArn
     *        Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is
     *        assigned to a game session and uniquely identifies it. This is the same as the game session ID.
     */

    public void setGameSessionArn(String gameSessionArn) {
        this.gameSessionArn = gameSessionArn;
    }

    /**
     * <p>
     * Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is assigned to a
     * game session and uniquely identifies it. This is the same as the game session ID.
     * </p>
     * 
     * @return Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is
     *         assigned to a game session and uniquely identifies it. This is the same as the game session ID.
     */

    public String getGameSessionArn() {
        return this.gameSessionArn;
    }

    /**
     * <p>
     * Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is assigned to a
     * game session and uniquely identifies it. This is the same as the game session ID.
     * </p>
     * 
     * @param gameSessionArn
     *        Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is
     *        assigned to a game session and uniquely identifies it. This is the same as the game session ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMatchBackfillRequest withGameSessionArn(String gameSessionArn) {
        setGameSessionArn(gameSessionArn);
        return this;
    }

    /**
     * <p>
     * Match information on all players that are currently assigned to the game session. This information is used by the
     * matchmaker to find new players and add them to the existing game.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PlayerID, PlayerAttributes, Team -\\- This information is maintained in the <a>GameSession</a> object,
     * <code>MatchmakerData</code> property, for all players who are currently assigned to the game session. The
     * matchmaker data is in JSON syntax, formatted as a string. For more details, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data"> Match
     * Data</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LatencyInMs -\\- If the matchmaker uses player latency, include a latency value, in milliseconds, for the Region
     * that the game session is currently in. Do not include latency values for any other Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Match information on all players that are currently assigned to the game session. This information is
     *         used by the matchmaker to find new players and add them to the existing game.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PlayerID, PlayerAttributes, Team -\\- This information is maintained in the <a>GameSession</a> object,
     *         <code>MatchmakerData</code> property, for all players who are currently assigned to the game session. The
     *         matchmaker data is in JSON syntax, formatted as a string. For more details, see <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data">
     *         Match Data</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LatencyInMs -\\- If the matchmaker uses player latency, include a latency value, in milliseconds, for the
     *         Region that the game session is currently in. Do not include latency values for any other Region.
     *         </p>
     *         </li>
     */

    public java.util.List<Player> getPlayers() {
        return players;
    }

    /**
     * <p>
     * Match information on all players that are currently assigned to the game session. This information is used by the
     * matchmaker to find new players and add them to the existing game.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PlayerID, PlayerAttributes, Team -\\- This information is maintained in the <a>GameSession</a> object,
     * <code>MatchmakerData</code> property, for all players who are currently assigned to the game session. The
     * matchmaker data is in JSON syntax, formatted as a string. For more details, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data"> Match
     * Data</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LatencyInMs -\\- If the matchmaker uses player latency, include a latency value, in milliseconds, for the Region
     * that the game session is currently in. Do not include latency values for any other Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param players
     *        Match information on all players that are currently assigned to the game session. This information is used
     *        by the matchmaker to find new players and add them to the existing game.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PlayerID, PlayerAttributes, Team -\\- This information is maintained in the <a>GameSession</a> object,
     *        <code>MatchmakerData</code> property, for all players who are currently assigned to the game session. The
     *        matchmaker data is in JSON syntax, formatted as a string. For more details, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data">
     *        Match Data</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LatencyInMs -\\- If the matchmaker uses player latency, include a latency value, in milliseconds, for the
     *        Region that the game session is currently in. Do not include latency values for any other Region.
     *        </p>
     *        </li>
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
     * Match information on all players that are currently assigned to the game session. This information is used by the
     * matchmaker to find new players and add them to the existing game.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PlayerID, PlayerAttributes, Team -\\- This information is maintained in the <a>GameSession</a> object,
     * <code>MatchmakerData</code> property, for all players who are currently assigned to the game session. The
     * matchmaker data is in JSON syntax, formatted as a string. For more details, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data"> Match
     * Data</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LatencyInMs -\\- If the matchmaker uses player latency, include a latency value, in milliseconds, for the Region
     * that the game session is currently in. Do not include latency values for any other Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlayers(java.util.Collection)} or {@link #withPlayers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param players
     *        Match information on all players that are currently assigned to the game session. This information is used
     *        by the matchmaker to find new players and add them to the existing game.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PlayerID, PlayerAttributes, Team -\\- This information is maintained in the <a>GameSession</a> object,
     *        <code>MatchmakerData</code> property, for all players who are currently assigned to the game session. The
     *        matchmaker data is in JSON syntax, formatted as a string. For more details, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data">
     *        Match Data</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LatencyInMs -\\- If the matchmaker uses player latency, include a latency value, in milliseconds, for the
     *        Region that the game session is currently in. Do not include latency values for any other Region.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMatchBackfillRequest withPlayers(Player... players) {
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
     * Match information on all players that are currently assigned to the game session. This information is used by the
     * matchmaker to find new players and add them to the existing game.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PlayerID, PlayerAttributes, Team -\\- This information is maintained in the <a>GameSession</a> object,
     * <code>MatchmakerData</code> property, for all players who are currently assigned to the game session. The
     * matchmaker data is in JSON syntax, formatted as a string. For more details, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data"> Match
     * Data</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LatencyInMs -\\- If the matchmaker uses player latency, include a latency value, in milliseconds, for the Region
     * that the game session is currently in. Do not include latency values for any other Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param players
     *        Match information on all players that are currently assigned to the game session. This information is used
     *        by the matchmaker to find new players and add them to the existing game.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PlayerID, PlayerAttributes, Team -\\- This information is maintained in the <a>GameSession</a> object,
     *        <code>MatchmakerData</code> property, for all players who are currently assigned to the game session. The
     *        matchmaker data is in JSON syntax, formatted as a string. For more details, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/match-server.html#match-server-data">
     *        Match Data</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LatencyInMs -\\- If the matchmaker uses player latency, include a latency value, in milliseconds, for the
     *        Region that the game session is currently in. Do not include latency values for any other Region.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMatchBackfillRequest withPlayers(java.util.Collection<Player> players) {
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
        if (getGameSessionArn() != null)
            sb.append("GameSessionArn: ").append(getGameSessionArn()).append(",");
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

        if (obj instanceof StartMatchBackfillRequest == false)
            return false;
        StartMatchBackfillRequest other = (StartMatchBackfillRequest) obj;
        if (other.getTicketId() == null ^ this.getTicketId() == null)
            return false;
        if (other.getTicketId() != null && other.getTicketId().equals(this.getTicketId()) == false)
            return false;
        if (other.getConfigurationName() == null ^ this.getConfigurationName() == null)
            return false;
        if (other.getConfigurationName() != null && other.getConfigurationName().equals(this.getConfigurationName()) == false)
            return false;
        if (other.getGameSessionArn() == null ^ this.getGameSessionArn() == null)
            return false;
        if (other.getGameSessionArn() != null && other.getGameSessionArn().equals(this.getGameSessionArn()) == false)
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
        hashCode = prime * hashCode + ((getGameSessionArn() == null) ? 0 : getGameSessionArn().hashCode());
        hashCode = prime * hashCode + ((getPlayers() == null) ? 0 : getPlayers().hashCode());
        return hashCode;
    }

    @Override
    public StartMatchBackfillRequest clone() {
        return (StartMatchBackfillRequest) super.clone();
    }

}
