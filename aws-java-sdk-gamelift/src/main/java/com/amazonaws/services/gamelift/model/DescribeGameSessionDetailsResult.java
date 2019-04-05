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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGameSessionDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Collection of objects containing game session properties and the protection policy currently in force for each
     * session matching the request.
     * </p>
     */
    private java.util.List<GameSessionDetail> gameSessionDetails;
    /**
     * <p>
     * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Collection of objects containing game session properties and the protection policy currently in force for each
     * session matching the request.
     * </p>
     * 
     * @return Collection of objects containing game session properties and the protection policy currently in force for
     *         each session matching the request.
     */

    public java.util.List<GameSessionDetail> getGameSessionDetails() {
        return gameSessionDetails;
    }

    /**
     * <p>
     * Collection of objects containing game session properties and the protection policy currently in force for each
     * session matching the request.
     * </p>
     * 
     * @param gameSessionDetails
     *        Collection of objects containing game session properties and the protection policy currently in force for
     *        each session matching the request.
     */

    public void setGameSessionDetails(java.util.Collection<GameSessionDetail> gameSessionDetails) {
        if (gameSessionDetails == null) {
            this.gameSessionDetails = null;
            return;
        }

        this.gameSessionDetails = new java.util.ArrayList<GameSessionDetail>(gameSessionDetails);
    }

    /**
     * <p>
     * Collection of objects containing game session properties and the protection policy currently in force for each
     * session matching the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGameSessionDetails(java.util.Collection)} or {@link #withGameSessionDetails(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param gameSessionDetails
     *        Collection of objects containing game session properties and the protection policy currently in force for
     *        each session matching the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionDetailsResult withGameSessionDetails(GameSessionDetail... gameSessionDetails) {
        if (this.gameSessionDetails == null) {
            setGameSessionDetails(new java.util.ArrayList<GameSessionDetail>(gameSessionDetails.length));
        }
        for (GameSessionDetail ele : gameSessionDetails) {
            this.gameSessionDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of objects containing game session properties and the protection policy currently in force for each
     * session matching the request.
     * </p>
     * 
     * @param gameSessionDetails
     *        Collection of objects containing game session properties and the protection policy currently in force for
     *        each session matching the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionDetailsResult withGameSessionDetails(java.util.Collection<GameSessionDetail> gameSessionDetails) {
        setGameSessionDetails(gameSessionDetails);
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

    public DescribeGameSessionDetailsResult withNextToken(String nextToken) {
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
        if (getGameSessionDetails() != null)
            sb.append("GameSessionDetails: ").append(getGameSessionDetails()).append(",");
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

        if (obj instanceof DescribeGameSessionDetailsResult == false)
            return false;
        DescribeGameSessionDetailsResult other = (DescribeGameSessionDetailsResult) obj;
        if (other.getGameSessionDetails() == null ^ this.getGameSessionDetails() == null)
            return false;
        if (other.getGameSessionDetails() != null && other.getGameSessionDetails().equals(this.getGameSessionDetails()) == false)
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

        hashCode = prime * hashCode + ((getGameSessionDetails() == null) ? 0 : getGameSessionDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGameSessionDetailsResult clone() {
        try {
            return (DescribeGameSessionDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
