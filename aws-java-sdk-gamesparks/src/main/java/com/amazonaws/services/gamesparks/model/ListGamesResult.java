/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListGames" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGamesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of games.
     * </p>
     */
    private java.util.List<GameSummary> games;
    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use this value when making the next call to this operation to continue where the last one finished.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of games.
     * </p>
     * 
     * @return The list of games.
     */

    public java.util.List<GameSummary> getGames() {
        return games;
    }

    /**
     * <p>
     * The list of games.
     * </p>
     * 
     * @param games
     *        The list of games.
     */

    public void setGames(java.util.Collection<GameSummary> games) {
        if (games == null) {
            this.games = null;
            return;
        }

        this.games = new java.util.ArrayList<GameSummary>(games);
    }

    /**
     * <p>
     * The list of games.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGames(java.util.Collection)} or {@link #withGames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param games
     *        The list of games.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGamesResult withGames(GameSummary... games) {
        if (this.games == null) {
            setGames(new java.util.ArrayList<GameSummary>(games.length));
        }
        for (GameSummary ele : games) {
            this.games.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of games.
     * </p>
     * 
     * @param games
     *        The list of games.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGamesResult withGames(java.util.Collection<GameSummary> games) {
        setGames(games);
        return this;
    }

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use this value when making the next call to this operation to continue where the last one finished.
     * </p>
     * 
     * @param nextToken
     *        The token that indicates the start of the next sequential page of results.</p>
     *        <p>
     *        Use this value when making the next call to this operation to continue where the last one finished.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use this value when making the next call to this operation to continue where the last one finished.
     * </p>
     * 
     * @return The token that indicates the start of the next sequential page of results.</p>
     *         <p>
     *         Use this value when making the next call to this operation to continue where the last one finished.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use this value when making the next call to this operation to continue where the last one finished.
     * </p>
     * 
     * @param nextToken
     *        The token that indicates the start of the next sequential page of results.</p>
     *        <p>
     *        Use this value when making the next call to this operation to continue where the last one finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGamesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getGames() != null)
            sb.append("Games: ").append(getGames()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGamesResult == false)
            return false;
        ListGamesResult other = (ListGamesResult) obj;
        if (other.getGames() == null ^ this.getGames() == null)
            return false;
        if (other.getGames() != null && other.getGames().equals(this.getGames()) == false)
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

        hashCode = prime * hashCode + ((getGames() == null) ? 0 : getGames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGamesResult clone() {
        try {
            return (ListGamesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
