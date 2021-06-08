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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListGameServerGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGameServerGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of game server group objects that match the request.
     * </p>
     */
    private java.util.List<GameServerGroup> gameServerGroups;
    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A collection of game server group objects that match the request.
     * </p>
     * 
     * @return A collection of game server group objects that match the request.
     */

    public java.util.List<GameServerGroup> getGameServerGroups() {
        return gameServerGroups;
    }

    /**
     * <p>
     * A collection of game server group objects that match the request.
     * </p>
     * 
     * @param gameServerGroups
     *        A collection of game server group objects that match the request.
     */

    public void setGameServerGroups(java.util.Collection<GameServerGroup> gameServerGroups) {
        if (gameServerGroups == null) {
            this.gameServerGroups = null;
            return;
        }

        this.gameServerGroups = new java.util.ArrayList<GameServerGroup>(gameServerGroups);
    }

    /**
     * <p>
     * A collection of game server group objects that match the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGameServerGroups(java.util.Collection)} or {@link #withGameServerGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param gameServerGroups
     *        A collection of game server group objects that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGameServerGroupsResult withGameServerGroups(GameServerGroup... gameServerGroups) {
        if (this.gameServerGroups == null) {
            setGameServerGroups(new java.util.ArrayList<GameServerGroup>(gameServerGroups.length));
        }
        for (GameServerGroup ele : gameServerGroups) {
            this.gameServerGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of game server group objects that match the request.
     * </p>
     * 
     * @param gameServerGroups
     *        A collection of game server group objects that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGameServerGroupsResult withGameServerGroups(java.util.Collection<GameServerGroup> gameServerGroups) {
        setGameServerGroups(gameServerGroups);
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

    public ListGameServerGroupsResult withNextToken(String nextToken) {
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
        if (getGameServerGroups() != null)
            sb.append("GameServerGroups: ").append(getGameServerGroups()).append(",");
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

        if (obj instanceof ListGameServerGroupsResult == false)
            return false;
        ListGameServerGroupsResult other = (ListGameServerGroupsResult) obj;
        if (other.getGameServerGroups() == null ^ this.getGameServerGroups() == null)
            return false;
        if (other.getGameServerGroups() != null && other.getGameServerGroups().equals(this.getGameServerGroups()) == false)
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

        hashCode = prime * hashCode + ((getGameServerGroups() == null) ? 0 : getGameServerGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGameServerGroupsResult clone() {
        try {
            return (ListGameServerGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
