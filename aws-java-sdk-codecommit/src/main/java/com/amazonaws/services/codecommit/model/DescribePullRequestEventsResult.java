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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DescribePullRequestEvents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePullRequestEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the pull request events.
     * </p>
     */
    private java.util.List<PullRequestEvent> pullRequestEvents;
    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the pull request events.
     * </p>
     * 
     * @return Information about the pull request events.
     */

    public java.util.List<PullRequestEvent> getPullRequestEvents() {
        return pullRequestEvents;
    }

    /**
     * <p>
     * Information about the pull request events.
     * </p>
     * 
     * @param pullRequestEvents
     *        Information about the pull request events.
     */

    public void setPullRequestEvents(java.util.Collection<PullRequestEvent> pullRequestEvents) {
        if (pullRequestEvents == null) {
            this.pullRequestEvents = null;
            return;
        }

        this.pullRequestEvents = new java.util.ArrayList<PullRequestEvent>(pullRequestEvents);
    }

    /**
     * <p>
     * Information about the pull request events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPullRequestEvents(java.util.Collection)} or {@link #withPullRequestEvents(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param pullRequestEvents
     *        Information about the pull request events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePullRequestEventsResult withPullRequestEvents(PullRequestEvent... pullRequestEvents) {
        if (this.pullRequestEvents == null) {
            setPullRequestEvents(new java.util.ArrayList<PullRequestEvent>(pullRequestEvents.length));
        }
        for (PullRequestEvent ele : pullRequestEvents) {
            this.pullRequestEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the pull request events.
     * </p>
     * 
     * @param pullRequestEvents
     *        Information about the pull request events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePullRequestEventsResult withPullRequestEvents(java.util.Collection<PullRequestEvent> pullRequestEvents) {
        setPullRequestEvents(pullRequestEvents);
        return this;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used in a request to return the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that can be used in a request to return the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that can be used in a request to return the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePullRequestEventsResult withNextToken(String nextToken) {
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
        if (getPullRequestEvents() != null)
            sb.append("PullRequestEvents: ").append(getPullRequestEvents()).append(",");
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

        if (obj instanceof DescribePullRequestEventsResult == false)
            return false;
        DescribePullRequestEventsResult other = (DescribePullRequestEventsResult) obj;
        if (other.getPullRequestEvents() == null ^ this.getPullRequestEvents() == null)
            return false;
        if (other.getPullRequestEvents() != null && other.getPullRequestEvents().equals(this.getPullRequestEvents()) == false)
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

        hashCode = prime * hashCode + ((getPullRequestEvents() == null) ? 0 : getPullRequestEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePullRequestEventsResult clone() {
        try {
            return (DescribePullRequestEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
