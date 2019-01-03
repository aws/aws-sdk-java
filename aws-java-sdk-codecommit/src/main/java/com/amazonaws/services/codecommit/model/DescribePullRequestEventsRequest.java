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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DescribePullRequestEvents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePullRequestEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * Optional. The pull request event type about which you want to return information.
     * </p>
     */
    private String pullRequestEventType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the
     * pull request with additional commits or changing the status of a pull request.
     * </p>
     */
    private String actorArn;
    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next batch of the results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The default is 100 events, which is also the
     * maximum number of events that can be returned in a result.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     */

    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @return The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     */

    public String getPullRequestId() {
        return this.pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePullRequestEventsRequest withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * Optional. The pull request event type about which you want to return information.
     * </p>
     * 
     * @param pullRequestEventType
     *        Optional. The pull request event type about which you want to return information.
     * @see PullRequestEventType
     */

    public void setPullRequestEventType(String pullRequestEventType) {
        this.pullRequestEventType = pullRequestEventType;
    }

    /**
     * <p>
     * Optional. The pull request event type about which you want to return information.
     * </p>
     * 
     * @return Optional. The pull request event type about which you want to return information.
     * @see PullRequestEventType
     */

    public String getPullRequestEventType() {
        return this.pullRequestEventType;
    }

    /**
     * <p>
     * Optional. The pull request event type about which you want to return information.
     * </p>
     * 
     * @param pullRequestEventType
     *        Optional. The pull request event type about which you want to return information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PullRequestEventType
     */

    public DescribePullRequestEventsRequest withPullRequestEventType(String pullRequestEventType) {
        setPullRequestEventType(pullRequestEventType);
        return this;
    }

    /**
     * <p>
     * Optional. The pull request event type about which you want to return information.
     * </p>
     * 
     * @param pullRequestEventType
     *        Optional. The pull request event type about which you want to return information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PullRequestEventType
     */

    public DescribePullRequestEventsRequest withPullRequestEventType(PullRequestEventType pullRequestEventType) {
        this.pullRequestEventType = pullRequestEventType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the
     * pull request with additional commits or changing the status of a pull request.
     * </p>
     * 
     * @param actorArn
     *        The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating
     *        the pull request with additional commits or changing the status of a pull request.
     */

    public void setActorArn(String actorArn) {
        this.actorArn = actorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the
     * pull request with additional commits or changing the status of a pull request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating
     *         the pull request with additional commits or changing the status of a pull request.
     */

    public String getActorArn() {
        return this.actorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the
     * pull request with additional commits or changing the status of a pull request.
     * </p>
     * 
     * @param actorArn
     *        The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating
     *        the pull request with additional commits or changing the status of a pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePullRequestEventsRequest withActorArn(String actorArn) {
        setActorArn(actorArn);
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

    public DescribePullRequestEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The default is 100 events, which is also the
     * maximum number of events that can be returned in a result.
     * </p>
     * 
     * @param maxResults
     *        A non-negative integer used to limit the number of returned results. The default is 100 events, which is
     *        also the maximum number of events that can be returned in a result.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The default is 100 events, which is also the
     * maximum number of events that can be returned in a result.
     * </p>
     * 
     * @return A non-negative integer used to limit the number of returned results. The default is 100 events, which is
     *         also the maximum number of events that can be returned in a result.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The default is 100 events, which is also the
     * maximum number of events that can be returned in a result.
     * </p>
     * 
     * @param maxResults
     *        A non-negative integer used to limit the number of returned results. The default is 100 events, which is
     *        also the maximum number of events that can be returned in a result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePullRequestEventsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getPullRequestId() != null)
            sb.append("PullRequestId: ").append(getPullRequestId()).append(",");
        if (getPullRequestEventType() != null)
            sb.append("PullRequestEventType: ").append(getPullRequestEventType()).append(",");
        if (getActorArn() != null)
            sb.append("ActorArn: ").append(getActorArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePullRequestEventsRequest == false)
            return false;
        DescribePullRequestEventsRequest other = (DescribePullRequestEventsRequest) obj;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getPullRequestEventType() == null ^ this.getPullRequestEventType() == null)
            return false;
        if (other.getPullRequestEventType() != null && other.getPullRequestEventType().equals(this.getPullRequestEventType()) == false)
            return false;
        if (other.getActorArn() == null ^ this.getActorArn() == null)
            return false;
        if (other.getActorArn() != null && other.getActorArn().equals(this.getActorArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getPullRequestEventType() == null) ? 0 : getPullRequestEventType().hashCode());
        hashCode = prime * hashCode + ((getActorArn() == null) ? 0 : getActorArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribePullRequestEventsRequest clone() {
        return (DescribePullRequestEventsRequest) super.clone();
    }

}
