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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListPullRequests" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPullRequestsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository for which you want to list pull requests.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user who created the pull request. If used, this filters the
     * results to pull requests created by that user.
     * </p>
     */
    private String authorArn;
    /**
     * <p>
     * Optional. The status of the pull request. If used, this refines the results to the pull requests that match the
     * specified status.
     * </p>
     */
    private String pullRequestStatus;
    /**
     * <p>
     * An enumeration token that when provided in a request, returns the next batch of the results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A non-negative integer used to limit the number of returned results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the repository for which you want to list pull requests.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository for which you want to list pull requests.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository for which you want to list pull requests.
     * </p>
     * 
     * @return The name of the repository for which you want to list pull requests.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository for which you want to list pull requests.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository for which you want to list pull requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPullRequestsRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user who created the pull request. If used, this filters the
     * results to pull requests created by that user.
     * </p>
     * 
     * @param authorArn
     *        Optional. The Amazon Resource Name (ARN) of the user who created the pull request. If used, this filters
     *        the results to pull requests created by that user.
     */

    public void setAuthorArn(String authorArn) {
        this.authorArn = authorArn;
    }

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user who created the pull request. If used, this filters the
     * results to pull requests created by that user.
     * </p>
     * 
     * @return Optional. The Amazon Resource Name (ARN) of the user who created the pull request. If used, this filters
     *         the results to pull requests created by that user.
     */

    public String getAuthorArn() {
        return this.authorArn;
    }

    /**
     * <p>
     * Optional. The Amazon Resource Name (ARN) of the user who created the pull request. If used, this filters the
     * results to pull requests created by that user.
     * </p>
     * 
     * @param authorArn
     *        Optional. The Amazon Resource Name (ARN) of the user who created the pull request. If used, this filters
     *        the results to pull requests created by that user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPullRequestsRequest withAuthorArn(String authorArn) {
        setAuthorArn(authorArn);
        return this;
    }

    /**
     * <p>
     * Optional. The status of the pull request. If used, this refines the results to the pull requests that match the
     * specified status.
     * </p>
     * 
     * @param pullRequestStatus
     *        Optional. The status of the pull request. If used, this refines the results to the pull requests that
     *        match the specified status.
     * @see PullRequestStatusEnum
     */

    public void setPullRequestStatus(String pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus;
    }

    /**
     * <p>
     * Optional. The status of the pull request. If used, this refines the results to the pull requests that match the
     * specified status.
     * </p>
     * 
     * @return Optional. The status of the pull request. If used, this refines the results to the pull requests that
     *         match the specified status.
     * @see PullRequestStatusEnum
     */

    public String getPullRequestStatus() {
        return this.pullRequestStatus;
    }

    /**
     * <p>
     * Optional. The status of the pull request. If used, this refines the results to the pull requests that match the
     * specified status.
     * </p>
     * 
     * @param pullRequestStatus
     *        Optional. The status of the pull request. If used, this refines the results to the pull requests that
     *        match the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PullRequestStatusEnum
     */

    public ListPullRequestsRequest withPullRequestStatus(String pullRequestStatus) {
        setPullRequestStatus(pullRequestStatus);
        return this;
    }

    /**
     * <p>
     * Optional. The status of the pull request. If used, this refines the results to the pull requests that match the
     * specified status.
     * </p>
     * 
     * @param pullRequestStatus
     *        Optional. The status of the pull request. If used, this refines the results to the pull requests that
     *        match the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PullRequestStatusEnum
     */

    public ListPullRequestsRequest withPullRequestStatus(PullRequestStatusEnum pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus.toString();
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

    public ListPullRequestsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @param maxResults
     *        A non-negative integer used to limit the number of returned results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @return A non-negative integer used to limit the number of returned results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @param maxResults
     *        A non-negative integer used to limit the number of returned results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPullRequestsRequest withMaxResults(Integer maxResults) {
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getAuthorArn() != null)
            sb.append("AuthorArn: ").append(getAuthorArn()).append(",");
        if (getPullRequestStatus() != null)
            sb.append("PullRequestStatus: ").append(getPullRequestStatus()).append(",");
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

        if (obj instanceof ListPullRequestsRequest == false)
            return false;
        ListPullRequestsRequest other = (ListPullRequestsRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getAuthorArn() == null ^ this.getAuthorArn() == null)
            return false;
        if (other.getAuthorArn() != null && other.getAuthorArn().equals(this.getAuthorArn()) == false)
            return false;
        if (other.getPullRequestStatus() == null ^ this.getPullRequestStatus() == null)
            return false;
        if (other.getPullRequestStatus() != null && other.getPullRequestStatus().equals(this.getPullRequestStatus()) == false)
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

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getAuthorArn() == null) ? 0 : getAuthorArn().hashCode());
        hashCode = prime * hashCode + ((getPullRequestStatus() == null) ? 0 : getPullRequestStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPullRequestsRequest clone() {
        return (ListPullRequestsRequest) super.clone();
    }

}
