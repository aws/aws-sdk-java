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
public class ListBuildsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Collection of build records that match the request.
     * </p>
     */
    private java.util.List<Build> builds;
    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Collection of build records that match the request.
     * </p>
     * 
     * @return Collection of build records that match the request.
     */

    public java.util.List<Build> getBuilds() {
        return builds;
    }

    /**
     * <p>
     * Collection of build records that match the request.
     * </p>
     * 
     * @param builds
     *        Collection of build records that match the request.
     */

    public void setBuilds(java.util.Collection<Build> builds) {
        if (builds == null) {
            this.builds = null;
            return;
        }

        this.builds = new java.util.ArrayList<Build>(builds);
    }

    /**
     * <p>
     * Collection of build records that match the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuilds(java.util.Collection)} or {@link #withBuilds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param builds
     *        Collection of build records that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuildsResult withBuilds(Build... builds) {
        if (this.builds == null) {
            setBuilds(new java.util.ArrayList<Build>(builds.length));
        }
        for (Build ele : builds) {
            this.builds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of build records that match the request.
     * </p>
     * 
     * @param builds
     *        Collection of build records that match the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuildsResult withBuilds(java.util.Collection<Build> builds) {
        setBuilds(builds);
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

    public ListBuildsResult withNextToken(String nextToken) {
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
        if (getBuilds() != null)
            sb.append("Builds: " + getBuilds() + ",");
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

        if (obj instanceof ListBuildsResult == false)
            return false;
        ListBuildsResult other = (ListBuildsResult) obj;
        if (other.getBuilds() == null ^ this.getBuilds() == null)
            return false;
        if (other.getBuilds() != null && other.getBuilds().equals(this.getBuilds()) == false)
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

        hashCode = prime * hashCode + ((getBuilds() == null) ? 0 : getBuilds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBuildsResult clone() {
        try {
            return (ListBuildsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
