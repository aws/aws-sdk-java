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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForComparedCommit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostCommentForComparedCommitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository where you want to post a comment on the comparison between commits.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     * </p>
     */
    private String beforeCommitId;
    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     * </p>
     */
    private String afterCommitId;
    /**
     * <p>
     * The location of the comparison where you want to comment.
     * </p>
     */
    private Location location;
    /**
     * <p>
     * The content of the comment you want to make.
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
     * The name of the repository where you want to post a comment on the comparison between commits.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to post a comment on the comparison between commits.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to post a comment on the comparison between commits.
     * </p>
     * 
     * @return The name of the repository where you want to post a comment on the comparison between commits.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to post a comment on the comparison between commits.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you want to post a comment on the comparison between commits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForComparedCommitRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     * </p>
     * 
     * @param beforeCommitId
     *        To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     */

    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     * </p>
     * 
     * @return To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     */

    public String getBeforeCommitId() {
        return this.beforeCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     * </p>
     * 
     * @param beforeCommitId
     *        To establish the directionality of the comparison, the full commit ID of the 'before' commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForComparedCommitRequest withBeforeCommitId(String beforeCommitId) {
        setBeforeCommitId(beforeCommitId);
        return this;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     * </p>
     * 
     * @param afterCommitId
     *        To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     */

    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     * </p>
     * 
     * @return To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     */

    public String getAfterCommitId() {
        return this.afterCommitId;
    }

    /**
     * <p>
     * To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     * </p>
     * 
     * @param afterCommitId
     *        To establish the directionality of the comparison, the full commit ID of the 'after' commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForComparedCommitRequest withAfterCommitId(String afterCommitId) {
        setAfterCommitId(afterCommitId);
        return this;
    }

    /**
     * <p>
     * The location of the comparison where you want to comment.
     * </p>
     * 
     * @param location
     *        The location of the comparison where you want to comment.
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the comparison where you want to comment.
     * </p>
     * 
     * @return The location of the comparison where you want to comment.
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the comparison where you want to comment.
     * </p>
     * 
     * @param location
     *        The location of the comparison where you want to comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForComparedCommitRequest withLocation(Location location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The content of the comment you want to make.
     * </p>
     * 
     * @param content
     *        The content of the comment you want to make.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the comment you want to make.
     * </p>
     * 
     * @return The content of the comment you want to make.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the comment you want to make.
     * </p>
     * 
     * @param content
     *        The content of the comment you want to make.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForComparedCommitRequest withContent(String content) {
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

    public PostCommentForComparedCommitRequest withClientRequestToken(String clientRequestToken) {
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

        if (obj instanceof PostCommentForComparedCommitRequest == false)
            return false;
        PostCommentForComparedCommitRequest other = (PostCommentForComparedCommitRequest) obj;
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

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getBeforeCommitId() == null) ? 0 : getBeforeCommitId().hashCode());
        hashCode = prime * hashCode + ((getAfterCommitId() == null) ? 0 : getAfterCommitId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public PostCommentForComparedCommitRequest clone() {
        return (PostCommentForComparedCommitRequest) super.clone();
    }

}
