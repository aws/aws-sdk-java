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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListRobots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRobotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of robots that meet the criteria of the request.
     * </p>
     */
    private java.util.List<Robot> robots;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListRobots</code> request. When the results of a
     * <code>ListRobot</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of robots that meet the criteria of the request.
     * </p>
     * 
     * @return A list of robots that meet the criteria of the request.
     */

    public java.util.List<Robot> getRobots() {
        return robots;
    }

    /**
     * <p>
     * A list of robots that meet the criteria of the request.
     * </p>
     * 
     * @param robots
     *        A list of robots that meet the criteria of the request.
     */

    public void setRobots(java.util.Collection<Robot> robots) {
        if (robots == null) {
            this.robots = null;
            return;
        }

        this.robots = new java.util.ArrayList<Robot>(robots);
    }

    /**
     * <p>
     * A list of robots that meet the criteria of the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRobots(java.util.Collection)} or {@link #withRobots(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param robots
     *        A list of robots that meet the criteria of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRobotsResult withRobots(Robot... robots) {
        if (this.robots == null) {
            setRobots(new java.util.ArrayList<Robot>(robots.length));
        }
        for (Robot ele : robots) {
            this.robots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of robots that meet the criteria of the request.
     * </p>
     * 
     * @param robots
     *        A list of robots that meet the criteria of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRobotsResult withRobots(java.util.Collection<Robot> robots) {
        setRobots(robots);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListRobots</code> request. When the results of a
     * <code>ListRobot</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListRobots</code> request. When the results
     *        of a <code>ListRobot</code> request exceed <code>maxResults</code>, this value can be used to retrieve the
     *        next page of results. This value is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListRobots</code> request. When the results of a
     * <code>ListRobot</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListRobots</code> request. When the results
     *         of a <code>ListRobot</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     *         the next page of results. This value is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListRobots</code> request. When the results of a
     * <code>ListRobot</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListRobots</code> request. When the results
     *        of a <code>ListRobot</code> request exceed <code>maxResults</code>, this value can be used to retrieve the
     *        next page of results. This value is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRobotsResult withNextToken(String nextToken) {
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
        if (getRobots() != null)
            sb.append("Robots: ").append(getRobots()).append(",");
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

        if (obj instanceof ListRobotsResult == false)
            return false;
        ListRobotsResult other = (ListRobotsResult) obj;
        if (other.getRobots() == null ^ this.getRobots() == null)
            return false;
        if (other.getRobots() != null && other.getRobots().equals(this.getRobots()) == false)
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

        hashCode = prime * hashCode + ((getRobots() == null) ? 0 : getRobots().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRobotsResult clone() {
        try {
            return (ListRobotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
