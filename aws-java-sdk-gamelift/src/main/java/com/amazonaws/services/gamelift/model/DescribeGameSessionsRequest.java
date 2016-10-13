/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class DescribeGameSessionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet. Specify a fleet to retrieve information on all game sessions active on the fleet.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Unique identifier for the game session to retrieve information on. Game session ID format is as follows:
     * "arn:aws:gamelift:&lt;region&gt;::gamesession/fleet-&lt;fleet ID&gt;/&lt;ID string&gt;". The value of &lt;ID
     * string&gt; is either a custom ID string (if one was specified when the game session was created) an
     * auto-generated string.
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * Unique identifier for a fleet alias. Specify an alias to retrieve information on all game sessions active on the
     * fleet.
     * </p>
     */
    private String aliasId;
    /**
     * <p>
     * Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     * <code>TERMINATED</code>, <code>ACTIVATING</code>, and <code>TERMINATING</code> (the last two are transitory).
     * </p>
     */
    private String statusFilter;
    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use the token that is returned with a previous
     * call to this action. To specify the start of the result set, do not specify a value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Unique identifier for a fleet. Specify a fleet to retrieve information on all game sessions active on the fleet.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet. Specify a fleet to retrieve information on all game sessions active on the
     *        fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet. Specify a fleet to retrieve information on all game sessions active on the fleet.
     * </p>
     * 
     * @return Unique identifier for a fleet. Specify a fleet to retrieve information on all game sessions active on the
     *         fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet. Specify a fleet to retrieve information on all game sessions active on the fleet.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet. Specify a fleet to retrieve information on all game sessions active on the
     *        fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionsRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the game session to retrieve information on. Game session ID format is as follows:
     * "arn:aws:gamelift:&lt;region&gt;::gamesession/fleet-&lt;fleet ID&gt;/&lt;ID string&gt;". The value of &lt;ID
     * string&gt; is either a custom ID string (if one was specified when the game session was created) an
     * auto-generated string.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for the game session to retrieve information on. Game session ID format is as follows:
     *        "arn:aws:gamelift:&lt;region&gt;::gamesession/fleet-&lt;fleet ID&gt;/&lt;ID string&gt;". The value of
     *        &lt;ID string&gt; is either a custom ID string (if one was specified when the game session was created) an
     *        auto-generated string.
     */

    public void setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for the game session to retrieve information on. Game session ID format is as follows:
     * "arn:aws:gamelift:&lt;region&gt;::gamesession/fleet-&lt;fleet ID&gt;/&lt;ID string&gt;". The value of &lt;ID
     * string&gt; is either a custom ID string (if one was specified when the game session was created) an
     * auto-generated string.
     * </p>
     * 
     * @return Unique identifier for the game session to retrieve information on. Game session ID format is as follows:
     *         "arn:aws:gamelift:&lt;region&gt;::gamesession/fleet-&lt;fleet ID&gt;/&lt;ID string&gt;". The value of
     *         &lt;ID string&gt; is either a custom ID string (if one was specified when the game session was created)
     *         an auto-generated string.
     */

    public String getGameSessionId() {
        return this.gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for the game session to retrieve information on. Game session ID format is as follows:
     * "arn:aws:gamelift:&lt;region&gt;::gamesession/fleet-&lt;fleet ID&gt;/&lt;ID string&gt;". The value of &lt;ID
     * string&gt; is either a custom ID string (if one was specified when the game session was created) an
     * auto-generated string.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for the game session to retrieve information on. Game session ID format is as follows:
     *        "arn:aws:gamelift:&lt;region&gt;::gamesession/fleet-&lt;fleet ID&gt;/&lt;ID string&gt;". The value of
     *        &lt;ID string&gt; is either a custom ID string (if one was specified when the game session was created) an
     *        auto-generated string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionsRequest withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a fleet alias. Specify an alias to retrieve information on all game sessions active on the
     * fleet.
     * </p>
     * 
     * @param aliasId
     *        Unique identifier for a fleet alias. Specify an alias to retrieve information on all game sessions active
     *        on the fleet.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * Unique identifier for a fleet alias. Specify an alias to retrieve information on all game sessions active on the
     * fleet.
     * </p>
     * 
     * @return Unique identifier for a fleet alias. Specify an alias to retrieve information on all game sessions active
     *         on the fleet.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * Unique identifier for a fleet alias. Specify an alias to retrieve information on all game sessions active on the
     * fleet.
     * </p>
     * 
     * @param aliasId
     *        Unique identifier for a fleet alias. Specify an alias to retrieve information on all game sessions active
     *        on the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionsRequest withAliasId(String aliasId) {
        setAliasId(aliasId);
        return this;
    }

    /**
     * <p>
     * Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     * <code>TERMINATED</code>, <code>ACTIVATING</code>, and <code>TERMINATING</code> (the last two are transitory).
     * </p>
     * 
     * @param statusFilter
     *        Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     *        <code>TERMINATED</code>, <code>ACTIVATING</code>, and <code>TERMINATING</code> (the last two are
     *        transitory).
     */

    public void setStatusFilter(String statusFilter) {
        this.statusFilter = statusFilter;
    }

    /**
     * <p>
     * Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     * <code>TERMINATED</code>, <code>ACTIVATING</code>, and <code>TERMINATING</code> (the last two are transitory).
     * </p>
     * 
     * @return Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     *         <code>TERMINATED</code>, <code>ACTIVATING</code>, and <code>TERMINATING</code> (the last two are
     *         transitory).
     */

    public String getStatusFilter() {
        return this.statusFilter;
    }

    /**
     * <p>
     * Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     * <code>TERMINATED</code>, <code>ACTIVATING</code>, and <code>TERMINATING</code> (the last two are transitory).
     * </p>
     * 
     * @param statusFilter
     *        Game session status to filter results on. Possible game session statuses include <code>ACTIVE</code>,
     *        <code>TERMINATED</code>, <code>ACTIVATING</code>, and <code>TERMINATING</code> (the last two are
     *        transitory).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionsRequest withStatusFilter(String statusFilter) {
        setStatusFilter(statusFilter);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *        set of sequential pages.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     * 
     * @return Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *         set of sequential pages.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *        set of sequential pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use the token that is returned with a previous
     * call to this action. To specify the start of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results. Use the token that is returned with a
     *        previous call to this action. To specify the start of the result set, do not specify a value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use the token that is returned with a previous
     * call to this action. To specify the start of the result set, do not specify a value.
     * </p>
     * 
     * @return Token indicating the start of the next sequential page of results. Use the token that is returned with a
     *         previous call to this action. To specify the start of the result set, do not specify a value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use the token that is returned with a previous
     * call to this action. To specify the start of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results. Use the token that is returned with a
     *        previous call to this action. To specify the start of the result set, do not specify a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getGameSessionId() != null)
            sb.append("GameSessionId: " + getGameSessionId() + ",");
        if (getAliasId() != null)
            sb.append("AliasId: " + getAliasId() + ",");
        if (getStatusFilter() != null)
            sb.append("StatusFilter: " + getStatusFilter() + ",");
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

        if (obj instanceof DescribeGameSessionsRequest == false)
            return false;
        DescribeGameSessionsRequest other = (DescribeGameSessionsRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        if (other.getStatusFilter() == null ^ this.getStatusFilter() == null)
            return false;
        if (other.getStatusFilter() != null && other.getStatusFilter().equals(this.getStatusFilter()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getGameSessionId() == null) ? 0 : getGameSessionId().hashCode());
        hashCode = prime * hashCode + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        hashCode = prime * hashCode + ((getStatusFilter() == null) ? 0 : getStatusFilter().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGameSessionsRequest clone() {
        return (DescribeGameSessionsRequest) super.clone();
    }
}
