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

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 */
public class SearchGameSessionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Collection of objects containing game session properties for each session matching the request.
     * </p>
     */
    private java.util.List<GameSession> gameSessions;
    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Collection of objects containing game session properties for each session matching the request.
     * </p>
     * 
     * @return Collection of objects containing game session properties for each session matching the request.
     */

    public java.util.List<GameSession> getGameSessions() {
        return gameSessions;
    }

    /**
     * <p>
     * Collection of objects containing game session properties for each session matching the request.
     * </p>
     * 
     * @param gameSessions
     *        Collection of objects containing game session properties for each session matching the request.
     */

    public void setGameSessions(java.util.Collection<GameSession> gameSessions) {
        if (gameSessions == null) {
            this.gameSessions = null;
            return;
        }

        this.gameSessions = new java.util.ArrayList<GameSession>(gameSessions);
    }

    /**
     * <p>
     * Collection of objects containing game session properties for each session matching the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGameSessions(java.util.Collection)} or {@link #withGameSessions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param gameSessions
     *        Collection of objects containing game session properties for each session matching the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGameSessionsResult withGameSessions(GameSession... gameSessions) {
        if (this.gameSessions == null) {
            setGameSessions(new java.util.ArrayList<GameSession>(gameSessions.length));
        }
        for (GameSession ele : gameSessions) {
            this.gameSessions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of objects containing game session properties for each session matching the request.
     * </p>
     * 
     * @param gameSessions
     *        Collection of objects containing game session properties for each session matching the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGameSessionsResult withGameSessions(java.util.Collection<GameSession> gameSessions) {
        setGameSessions(gameSessions);
        return this;
    }

    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        Token indicating where to resume retrieving results on the next call to this action. If no token is
     *        returned, these results represent the end of the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @return Token indicating where to resume retrieving results on the next call to this action. If no token is
     *         returned, these results represent the end of the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        Token indicating where to resume retrieving results on the next call to this action. If no token is
     *        returned, these results represent the end of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGameSessionsResult withNextToken(String nextToken) {
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
        if (getGameSessions() != null)
            sb.append("GameSessions: " + getGameSessions() + ",");
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

        if (obj instanceof SearchGameSessionsResult == false)
            return false;
        SearchGameSessionsResult other = (SearchGameSessionsResult) obj;
        if (other.getGameSessions() == null ^ this.getGameSessions() == null)
            return false;
        if (other.getGameSessions() != null && other.getGameSessions().equals(this.getGameSessions()) == false)
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

        hashCode = prime * hashCode + ((getGameSessions() == null) ? 0 : getGameSessions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchGameSessionsResult clone() {
        try {
            return (SearchGameSessionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
