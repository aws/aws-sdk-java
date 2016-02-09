/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class DescribePlayerSessionsRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a game session.
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * Unique identifier for a player.
     * </p>
     */
    private String playerId;
    /**
     * <p>
     * Unique identifier for a playersession.
     * </p>
     */
    private String playerSessionId;
    /**
     * <p>
     * Player session status to filter results on.
     * </p>
     */
    private String playerSessionStatusFilter;
    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages. If a player
     * session ID is specified, this parameter is ignored.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Token indicating the start of the next sequential page of results. A
     * token is returned any time there may be additional results to be
     * retrieved. To start at the beginning of a result set, do not set this
     * parameter. If a player session ID is specified, this parameter is
     * ignored.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Unique identifier for a game session.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for a game session.
     */
    public void setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for a game session.
     * </p>
     * 
     * @return Unique identifier for a game session.
     */
    public String getGameSessionId() {
        return this.gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for a game session.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for a game session.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribePlayerSessionsRequest withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a player.
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player.
     */
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    /**
     * <p>
     * Unique identifier for a player.
     * </p>
     * 
     * @return Unique identifier for a player.
     */
    public String getPlayerId() {
        return this.playerId;
    }

    /**
     * <p>
     * Unique identifier for a player.
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribePlayerSessionsRequest withPlayerId(String playerId) {
        setPlayerId(playerId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a playersession.
     * </p>
     * 
     * @param playerSessionId
     *        Unique identifier for a playersession.
     */
    public void setPlayerSessionId(String playerSessionId) {
        this.playerSessionId = playerSessionId;
    }

    /**
     * <p>
     * Unique identifier for a playersession.
     * </p>
     * 
     * @return Unique identifier for a playersession.
     */
    public String getPlayerSessionId() {
        return this.playerSessionId;
    }

    /**
     * <p>
     * Unique identifier for a playersession.
     * </p>
     * 
     * @param playerSessionId
     *        Unique identifier for a playersession.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribePlayerSessionsRequest withPlayerSessionId(
            String playerSessionId) {
        setPlayerSessionId(playerSessionId);
        return this;
    }

    /**
     * <p>
     * Player session status to filter results on.
     * </p>
     * 
     * @param playerSessionStatusFilter
     *        Player session status to filter results on.
     */
    public void setPlayerSessionStatusFilter(String playerSessionStatusFilter) {
        this.playerSessionStatusFilter = playerSessionStatusFilter;
    }

    /**
     * <p>
     * Player session status to filter results on.
     * </p>
     * 
     * @return Player session status to filter results on.
     */
    public String getPlayerSessionStatusFilter() {
        return this.playerSessionStatusFilter;
    }

    /**
     * <p>
     * Player session status to filter results on.
     * </p>
     * 
     * @param playerSessionStatusFilter
     *        Player session status to filter results on.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribePlayerSessionsRequest withPlayerSessionStatusFilter(
            String playerSessionStatusFilter) {
        setPlayerSessionStatusFilter(playerSessionStatusFilter);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages. If a player
     * session ID is specified, this parameter is ignored.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. You can use this parameter
     *        with <i>NextToken</i> to get results as a set of sequential pages.
     *        If a player session ID is specified, this parameter is ignored.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages. If a player
     * session ID is specified, this parameter is ignored.
     * </p>
     * 
     * @return Maximum number of results to return. You can use this parameter
     *         with <i>NextToken</i> to get results as a set of sequential
     *         pages. If a player session ID is specified, this parameter is
     *         ignored.
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages. If a player
     * session ID is specified, this parameter is ignored.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. You can use this parameter
     *        with <i>NextToken</i> to get results as a set of sequential pages.
     *        If a player session ID is specified, this parameter is ignored.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribePlayerSessionsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. A
     * token is returned any time there may be additional results to be
     * retrieved. To start at the beginning of a result set, do not set this
     * parameter. If a player session ID is specified, this parameter is
     * ignored.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results.
     *        A token is returned any time there may be additional results to be
     *        retrieved. To start at the beginning of a result set, do not set
     *        this parameter. If a player session ID is specified, this
     *        parameter is ignored.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. A
     * token is returned any time there may be additional results to be
     * retrieved. To start at the beginning of a result set, do not set this
     * parameter. If a player session ID is specified, this parameter is
     * ignored.
     * </p>
     * 
     * @return Token indicating the start of the next sequential page of
     *         results. A token is returned any time there may be additional
     *         results to be retrieved. To start at the beginning of a result
     *         set, do not set this parameter. If a player session ID is
     *         specified, this parameter is ignored.
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. A
     * token is returned any time there may be additional results to be
     * retrieved. To start at the beginning of a result set, do not set this
     * parameter. If a player session ID is specified, this parameter is
     * ignored.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results.
     *        A token is returned any time there may be additional results to be
     *        retrieved. To start at the beginning of a result set, do not set
     *        this parameter. If a player session ID is specified, this
     *        parameter is ignored.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribePlayerSessionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("GameSessionId: " + getGameSessionId() + ",");
        if (getPlayerId() != null)
            sb.append("PlayerId: " + getPlayerId() + ",");
        if (getPlayerSessionId() != null)
            sb.append("PlayerSessionId: " + getPlayerSessionId() + ",");
        if (getPlayerSessionStatusFilter() != null)
            sb.append("PlayerSessionStatusFilter: "
                    + getPlayerSessionStatusFilter() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePlayerSessionsRequest == false)
            return false;
        DescribePlayerSessionsRequest other = (DescribePlayerSessionsRequest) obj;
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null
                && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        if (other.getPlayerId() == null ^ this.getPlayerId() == null)
            return false;
        if (other.getPlayerId() != null
                && other.getPlayerId().equals(this.getPlayerId()) == false)
            return false;
        if (other.getPlayerSessionId() == null
                ^ this.getPlayerSessionId() == null)
            return false;
        if (other.getPlayerSessionId() != null
                && other.getPlayerSessionId().equals(this.getPlayerSessionId()) == false)
            return false;
        if (other.getPlayerSessionStatusFilter() == null
                ^ this.getPlayerSessionStatusFilter() == null)
            return false;
        if (other.getPlayerSessionStatusFilter() != null
                && other.getPlayerSessionStatusFilter().equals(
                        this.getPlayerSessionStatusFilter()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null
                && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGameSessionId() == null) ? 0 : getGameSessionId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPlayerId() == null) ? 0 : getPlayerId().hashCode());
        hashCode = prime
                * hashCode
                + ((getPlayerSessionId() == null) ? 0 : getPlayerSessionId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPlayerSessionStatusFilter() == null) ? 0
                        : getPlayerSessionStatusFilter().hashCode());
        hashCode = prime * hashCode
                + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePlayerSessionsRequest clone() {
        return (DescribePlayerSessionsRequest) super.clone();
    }
}