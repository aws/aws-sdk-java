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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForPullRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostCommentForPullRequestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The name of the repository where you want to post a comment on a pull request.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull
     * request was created.
     * </p>
     */
    private String beforeCommitId;
    /**
     * <p>
     * The full commit ID of the commit in the source branch that is the current tip of the branch for the pull request
     * when you post the comment.
     * </p>
     */
    private String afterCommitId;
    /**
     * <p>
     * The location of the change where you want to post your comment. If no location is provided, the comment will be
     * posted as a general comment on the pull request difference between the before commit ID and the after commit ID.
     * </p>
     */
    private Location location;
    /**
     * <p>
     * The content of your comment on the change.
     * </p>
     */
    private String content;
    /**
     * <p>
     * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request is received with the same parameters and a token is included, the
     * request will return information about the initial request that used that token.
     * </p>
     */
    private String clientRequestToken;

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

    public PostCommentForPullRequestRequest withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The name of the repository where you want to post a comment on a pull request.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to post a comment on a pull request.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to post a comment on a pull request.
     * </p>
     * 
     * @return The name of the repository where you want to post a comment on a pull request.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to post a comment on a pull request.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to post a comment on a pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull
     * request was created.
     * </p>
     * 
     * @param beforeCommitId
     *        The full commit ID of the commit in the destination branch that was the tip of the branch at the time the
     *        pull request was created.
     */

    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull
     * request was created.
     * </p>
     * 
     * @return The full commit ID of the commit in the destination branch that was the tip of the branch at the time the
     *         pull request was created.
     */

    public String getBeforeCommitId() {
        return this.beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull
     * request was created.
     * </p>
     * 
     * @param beforeCommitId
     *        The full commit ID of the commit in the destination branch that was the tip of the branch at the time the
     *        pull request was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestRequest withBeforeCommitId(String beforeCommitId) {
        setBeforeCommitId(beforeCommitId);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch that is the current tip of the branch for the pull request
     * when you post the comment.
     * </p>
     * 
     * @param afterCommitId
     *        The full commit ID of the commit in the source branch that is the current tip of the branch for the pull
     *        request when you post the comment.
     */

    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch that is the current tip of the branch for the pull request
     * when you post the comment.
     * </p>
     * 
     * @return The full commit ID of the commit in the source branch that is the current tip of the branch for the pull
     *         request when you post the comment.
     */

    public String getAfterCommitId() {
        return this.afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch that is the current tip of the branch for the pull request
     * when you post the comment.
     * </p>
     * 
     * @param afterCommitId
     *        The full commit ID of the commit in the source branch that is the current tip of the branch for the pull
     *        request when you post the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestRequest withAfterCommitId(String afterCommitId) {
        setAfterCommitId(afterCommitId);
        return this;
    }

    /**
     * <p>
     * The location of the change where you want to post your comment. If no location is provided, the comment will be
     * posted as a general comment on the pull request difference between the before commit ID and the after commit ID.
     * </p>
     * 
     * @param location
     *        The location of the change where you want to post your comment. If no location is provided, the comment
     *        will be posted as a general comment on the pull request difference between the before commit ID and the
     *        after commit ID.
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the change where you want to post your comment. If no location is provided, the comment will be
     * posted as a general comment on the pull request difference between the before commit ID and the after commit ID.
     * </p>
     * 
     * @return The location of the change where you want to post your comment. If no location is provided, the comment
     *         will be posted as a general comment on the pull request difference between the before commit ID and the
     *         after commit ID.
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the change where you want to post your comment. If no location is provided, the comment will be
     * posted as a general comment on the pull request difference between the before commit ID and the after commit ID.
     * </p>
     * 
     * @param location
     *        The location of the change where you want to post your comment. If no location is provided, the comment
     *        will be posted as a general comment on the pull request difference between the before commit ID and the
     *        after commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestRequest withLocation(Location location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The content of your comment on the change.
     * </p>
     * 
     * @param content
     *        The content of your comment on the change.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of your comment on the change.
     * </p>
     * 
     * @return The content of your comment on the change.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of your comment on the change.
     * </p>
     * 
     * @param content
     *        The content of your comment on the change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request is received with the same parameters and a token is included, the
     * request will return information about the initial request that used that token.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, client-generated idempotency token that when provided in a request, ensures the request cannot
     *        be repeated with a changed parameter. If a request is received with the same parameters and a token is
     *        included, the request will return information about the initial request that used that token.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request is received with the same parameters and a token is included, the
     * request will return information about the initial request that used that token.
     * </p>
     * 
     * @return A unique, client-generated idempotency token that when provided in a request, ensures the request cannot
     *         be repeated with a changed parameter. If a request is received with the same parameters and a token is
     *         included, the request will return information about the initial request that used that token.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request is received with the same parameters and a token is included, the
     * request will return information about the initial request that used that token.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, client-generated idempotency token that when provided in a request, ensures the request cannot
     *        be repeated with a changed parameter. If a request is received with the same parameters and a token is
     *        included, the request will return information about the initial request that used that token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getBeforeCommitId() != null)
            sb.append("BeforeCommitId: ").append(getBeforeCommitId()).append(",");
        if (getAfterCommitId() != null)
            sb.append("AfterCommitId: ").append(getAfterCommitId()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostCommentForPullRequestRequest == false)
            return false;
        PostCommentForPullRequestRequest other = (PostCommentForPullRequestRequest) obj;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBeforeCommitId() == null ^ this.getBeforeCommitId() == null)
            return false;
        if (other.getBeforeCommitId() != null && other.getBeforeCommitId().equals(this.getBeforeCommitId()) == false)
            return false;
        if (other.getAfterCommitId() == null ^ this.getAfterCommitId() == null)
            return false;
        if (other.getAfterCommitId() != null && other.getAfterCommitId().equals(this.getAfterCommitId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getBeforeCommitId() == null) ? 0 : getBeforeCommitId().hashCode());
        hashCode = prime * hashCode + ((getAfterCommitId() == null) ? 0 : getAfterCommitId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public PostCommentForPullRequestRequest clone() {
        return (PostCommentForPullRequestRequest) super.clone();
    }

}
