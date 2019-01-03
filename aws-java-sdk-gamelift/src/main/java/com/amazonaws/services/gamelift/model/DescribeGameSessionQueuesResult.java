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

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionQueues" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGameSessionQueuesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Collection of objects that describes the requested game session queues.
     * </p>
     */
    private java.util.List<GameSessionQueue> gameSessionQueues;
    /**
     * <p>
     * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Collection of objects that describes the requested game session queues.
     * </p>
     * 
     * @return Collection of objects that describes the requested game session queues.
     */

    public java.util.List<GameSessionQueue> getGameSessionQueues() {
        return gameSessionQueues;
    }

    /**
     * <p>
     * Collection of objects that describes the requested game session queues.
     * </p>
     * 
     * @param gameSessionQueues
     *        Collection of objects that describes the requested game session queues.
     */

    public void setGameSessionQueues(java.util.Collection<GameSessionQueue> gameSessionQueues) {
        if (gameSessionQueues == null) {
            this.gameSessionQueues = null;
            return;
        }

        this.gameSessionQueues = new java.util.ArrayList<GameSessionQueue>(gameSessionQueues);
    }

    /**
     * <p>
     * Collection of objects that describes the requested game session queues.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGameSessionQueues(java.util.Collection)} or {@link #withGameSessionQueues(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param gameSessionQueues
     *        Collection of objects that describes the requested game session queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionQueuesResult withGameSessionQueues(GameSessionQueue... gameSessionQueues) {
        if (this.gameSessionQueues == null) {
            setGameSessionQueues(new java.util.ArrayList<GameSessionQueue>(gameSessionQueues.length));
        }
        for (GameSessionQueue ele : gameSessionQueues) {
            this.gameSessionQueues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of objects that describes the requested game session queues.
     * </p>
     * 
     * @param gameSessionQueues
     *        Collection of objects that describes the requested game session queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionQueuesResult withGameSessionQueues(java.util.Collection<GameSessionQueue> gameSessionQueues) {
        setGameSessionQueues(gameSessionQueues);
        return this;
    }

    /**
     * <p>
     * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        Token that indicates where to resume retrieving results on the next call to this action. If no token is
     *        returned, these results represent the end of the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @return Token that indicates where to resume retrieving results on the next call to this action. If no token is
     *         returned, these results represent the end of the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        Token that indicates where to resume retrieving results on the next call to this action. If no token is
     *        returned, these results represent the end of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionQueuesResult withNextToken(String nextToken) {
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
        if (getGameSessionQueues() != null)
            sb.append("GameSessionQueues: ").append(getGameSessionQueues()).append(",");
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

        if (obj instanceof DescribeGameSessionQueuesResult == false)
            return false;
        DescribeGameSessionQueuesResult other = (DescribeGameSessionQueuesResult) obj;
        if (other.getGameSessionQueues() == null ^ this.getGameSessionQueues() == null)
            return false;
        if (other.getGameSessionQueues() != null && other.getGameSessionQueues().equals(this.getGameSessionQueues()) == false)
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

        hashCode = prime * hashCode + ((getGameSessionQueues() == null) ? 0 : getGameSessionQueues().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGameSessionQueuesResult clone() {
        try {
            return (DescribeGameSessionQueuesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
