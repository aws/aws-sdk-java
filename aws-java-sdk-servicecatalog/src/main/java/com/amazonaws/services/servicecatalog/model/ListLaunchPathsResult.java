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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * 
 */
public class ListLaunchPathsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of launch path information summaries for the specified <code>PageToken</code>.
     * </p>
     */
    private java.util.List<LaunchPathSummary> launchPathSummaries;
    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * List of launch path information summaries for the specified <code>PageToken</code>.
     * </p>
     * 
     * @return List of launch path information summaries for the specified <code>PageToken</code>.
     */

    public java.util.List<LaunchPathSummary> getLaunchPathSummaries() {
        return launchPathSummaries;
    }

    /**
     * <p>
     * List of launch path information summaries for the specified <code>PageToken</code>.
     * </p>
     * 
     * @param launchPathSummaries
     *        List of launch path information summaries for the specified <code>PageToken</code>.
     */

    public void setLaunchPathSummaries(java.util.Collection<LaunchPathSummary> launchPathSummaries) {
        if (launchPathSummaries == null) {
            this.launchPathSummaries = null;
            return;
        }

        this.launchPathSummaries = new java.util.ArrayList<LaunchPathSummary>(launchPathSummaries);
    }

    /**
     * <p>
     * List of launch path information summaries for the specified <code>PageToken</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchPathSummaries(java.util.Collection)} or {@link #withLaunchPathSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param launchPathSummaries
     *        List of launch path information summaries for the specified <code>PageToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLaunchPathsResult withLaunchPathSummaries(LaunchPathSummary... launchPathSummaries) {
        if (this.launchPathSummaries == null) {
            setLaunchPathSummaries(new java.util.ArrayList<LaunchPathSummary>(launchPathSummaries.length));
        }
        for (LaunchPathSummary ele : launchPathSummaries) {
            this.launchPathSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of launch path information summaries for the specified <code>PageToken</code>.
     * </p>
     * 
     * @param launchPathSummaries
     *        List of launch path information summaries for the specified <code>PageToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLaunchPathsResult withLaunchPathSummaries(java.util.Collection<LaunchPathSummary> launchPathSummaries) {
        setLaunchPathSummaries(launchPathSummaries);
        return this;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next page of results for this operation. If there are no more pages,
     *        this value is null.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @return The page token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The page token to use to retrieve the next page of results for this operation. If there are no more pages, this
     * value is null.
     * </p>
     * 
     * @param nextPageToken
     *        The page token to use to retrieve the next page of results for this operation. If there are no more pages,
     *        this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLaunchPathsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getLaunchPathSummaries() != null)
            sb.append("LaunchPathSummaries: " + getLaunchPathSummaries() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLaunchPathsResult == false)
            return false;
        ListLaunchPathsResult other = (ListLaunchPathsResult) obj;
        if (other.getLaunchPathSummaries() == null ^ this.getLaunchPathSummaries() == null)
            return false;
        if (other.getLaunchPathSummaries() != null && other.getLaunchPathSummaries().equals(this.getLaunchPathSummaries()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchPathSummaries() == null) ? 0 : getLaunchPathSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLaunchPathsResult clone() {
        try {
            return (ListLaunchPathsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
