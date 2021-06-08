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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServerInstances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGameServerInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The collection of requested game server instances.
     * </p>
     */
    private java.util.List<GameServerInstance> gameServerInstances;
    /**
     * <p>
     * A token that indicates where to resume retrieving results on the next call to this operation. If no token is
     * returned, these results represent the end of the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The collection of requested game server instances.
     * </p>
     * 
     * @return The collection of requested game server instances.
     */

    public java.util.List<GameServerInstance> getGameServerInstances() {
        return gameServerInstances;
    }

    /**
     * <p>
     * The collection of requested game server instances.
     * </p>
     * 
     * @param gameServerInstances
     *        The collection of requested game server instances.
     */

    public void setGameServerInstances(java.util.Collection<GameServerInstance> gameServerInstances) {
        if (gameServerInstances == null) {
            this.gameServerInstances = null;
            return;
        }

        this.gameServerInstances = new java.util.ArrayList<GameServerInstance>(gameServerInstances);
    }

    /**
     * <p>
     * The collection of requested game server instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGameServerInstances(java.util.Collection)} or {@link #withGameServerInstances(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param gameServerInstances
     *        The collection of requested game server instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameServerInstancesResult withGameServerInstances(GameServerInstance... gameServerInstances) {
        if (this.gameServerInstances == null) {
            setGameServerInstances(new java.util.ArrayList<GameServerInstance>(gameServerInstances.length));
        }
        for (GameServerInstance ele : gameServerInstances) {
            this.gameServerInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The collection of requested game server instances.
     * </p>
     * 
     * @param gameServerInstances
     *        The collection of requested game server instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameServerInstancesResult withGameServerInstances(java.util.Collection<GameServerInstance> gameServerInstances) {
        setGameServerInstances(gameServerInstances);
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

    public DescribeGameServerInstancesResult withNextToken(String nextToken) {
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
        if (getGameServerInstances() != null)
            sb.append("GameServerInstances: ").append(getGameServerInstances()).append(",");
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

        if (obj instanceof DescribeGameServerInstancesResult == false)
            return false;
        DescribeGameServerInstancesResult other = (DescribeGameServerInstancesResult) obj;
        if (other.getGameServerInstances() == null ^ this.getGameServerInstances() == null)
            return false;
        if (other.getGameServerInstances() != null && other.getGameServerInstances().equals(this.getGameServerInstances()) == false)
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

        hashCode = prime * hashCode + ((getGameServerInstances() == null) ? 0 : getGameServerInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGameServerInstancesResult clone() {
        try {
            return (DescribeGameServerInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
