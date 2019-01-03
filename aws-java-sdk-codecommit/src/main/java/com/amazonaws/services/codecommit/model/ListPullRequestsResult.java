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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListPullRequests" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPullRequestsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated IDs of the pull requests.
     * </p>
     */
    private java.util.List<String> pullRequestIds;
    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The system-generated IDs of the pull requests.
     * </p>
     * 
     * @return The system-generated IDs of the pull requests.
     */

    public java.util.List<String> getPullRequestIds() {
        return pullRequestIds;
    }

    /**
     * <p>
     * The system-generated IDs of the pull requests.
     * </p>
     * 
     * @param pullRequestIds
     *        The system-generated IDs of the pull requests.
     */

    public void setPullRequestIds(java.util.Collection<String> pullRequestIds) {
        if (pullRequestIds == null) {
            this.pullRequestIds = null;
            return;
        }

        this.pullRequestIds = new java.util.ArrayList<String>(pullRequestIds);
    }

    /**
     * <p>
     * The system-generated IDs of the pull requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPullRequestIds(java.util.Collection)} or {@link #withPullRequestIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param pullRequestIds
     *        The system-generated IDs of the pull requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPullRequestsResult withPullRequestIds(String... pullRequestIds) {
        if (this.pullRequestIds == null) {
            setPullRequestIds(new java.util.ArrayList<String>(pullRequestIds.length));
        }
        for (String ele : pullRequestIds) {
            this.pullRequestIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The system-generated IDs of the pull requests.
     * </p>
     * 
     * @param pullRequestIds
     *        The system-generated IDs of the pull requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPullRequestsResult withPullRequestIds(java.util.Collection<String> pullRequestIds) {
        setPullRequestIds(pullRequestIds);
        return this;
    }

    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that when provided in a request, returns the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that when provided in a request, returns the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that when provided in a request, returns the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPullRequestsResult withNextToken(String nextToken) {
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
        if (getPullRequestIds() != null)
            sb.append("PullRequestIds: ").append(getPullRequestIds()).append(",");
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

        if (obj instanceof ListPullRequestsResult == false)
            return false;
        ListPullRequestsResult other = (ListPullRequestsResult) obj;
        if (other.getPullRequestIds() == null ^ this.getPullRequestIds() == null)
            return false;
        if (other.getPullRequestIds() != null && other.getPullRequestIds().equals(this.getPullRequestIds()) == false)
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

        hashCode = prime * hashCode + ((getPullRequestIds() == null) ? 0 : getPullRequestIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPullRequestsResult clone() {
        try {
            return (ListPullRequestsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
