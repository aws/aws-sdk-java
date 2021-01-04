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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListGameServers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGameServersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of game server objects that match the request.
     * </p>
     */
    private java.util.List<GameServer> gameServers;
    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A collection of game server objects that match the request.
     * </p>
     * 
     * @return A collection of game server objects that match the request.
     */

    public java.util.List<GameServer> getGameServers() {
        return gameServers;
    }

    /**
     * <p>
     * A collection of game server objects that match the request.
     * </p>
     * 
     * @param gameServers
     *        A collection of game server objects that match the request.
     */

    public void setGameServers(java.util.Collection<GameServer> gameServers) {
        if (gameServers == null) {
            this.gameServers = null;
            return;
        }

        this.gameServers = new java.util.ArrayList<GameServer>(gameServers);
    }

    /**
     * <p>
     * A collection of game server objects that match the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGameServers(java.util.Collection)} or {@link #withGameServers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param gameServers
     *        A collection of game server objects that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGameServersResult withGameServers(GameServer... gameServers) {
        if (this.gameServers == null) {
            setGameServers(new java.util.ArrayList<GameServer>(gameServers.length));
        }
        for (GameServer ele : gameServers) {
            this.gameServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of game server objects that match the request.
     * </p>
     * 
     * @param gameServers
     *        A collection of game server objects that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGameServersResult withGameServers(java.util.Collection<GameServer> gameServers) {
        setGameServers(gameServers);
        return this;
    }

    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where to resume retrieving results on the next call to this operation. If no token
     *        is returned, these results represent the end of the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     * 
     * @return A token that indicates where to resume retrieving results on the next call to this operation. If no token
     *         is returned, these results represent the end of the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where to resume retrieving results on the next call to this operation. If no token
     *        is returned, these results represent the end of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGameServersResult withNextToken(String nextToken) {
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
        if (getGameServers() != null)
            sb.append("GameServers: ").append(getGameServers()).append(",");
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

        if (obj instanceof ListGameServersResult == false)
            return false;
        ListGameServersResult other = (ListGameServersResult) obj;
        if (other.getGameServers() == null ^ this.getGameServers() == null)
            return false;
        if (other.getGameServers() != null && other.getGameServers().equals(this.getGameServers()) == false)
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

        hashCode = prime * hashCode + ((getGameServers() == null) ? 0 : getGameServers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGameServersResult clone() {
        try {
            return (ListGameServersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
