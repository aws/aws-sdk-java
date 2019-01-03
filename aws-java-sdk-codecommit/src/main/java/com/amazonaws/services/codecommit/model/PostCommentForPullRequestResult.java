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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForPullRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostCommentForPullRequestResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository where you posted a comment on a pull request.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The full commit ID of the commit in the source branch used to create the pull request, or in the case of an
     * updated pull request, the full commit ID of the commit used to update the pull request.
     * </p>
     */
    private String beforeCommitId;
    /**
     * <p>
     * The full commit ID of the commit in the destination branch where the pull request will be merged.
     * </p>
     */
    private String afterCommitId;
    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the 'before' blob.
     * </p>
     */
    private String beforeBlobId;
    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the 'after' blob.
     * </p>
     */
    private String afterBlobId;
    /**
     * <p>
     * The location of the change where you posted your comment.
     * </p>
     */
    private Location location;
    /**
     * <p>
     * The content of the comment you posted.
     * </p>
     */
    private Comment comment;

    /**
     * <p>
     * The name of the repository where you posted a comment on a pull request.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you posted a comment on a pull request.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you posted a comment on a pull request.
     * </p>
     * 
     * @return The name of the repository where you posted a comment on a pull request.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you posted a comment on a pull request.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you posted a comment on a pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestResult withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request.
     */

    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * 
     * @return The system-generated ID of the pull request.
     */

    public String getPullRequestId() {
        return this.pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestResult withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch used to create the pull request, or in the case of an
     * updated pull request, the full commit ID of the commit used to update the pull request.
     * </p>
     * 
     * @param beforeCommitId
     *        The full commit ID of the commit in the source branch used to create the pull request, or in the case of
     *        an updated pull request, the full commit ID of the commit used to update the pull request.
     */

    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch used to create the pull request, or in the case of an
     * updated pull request, the full commit ID of the commit used to update the pull request.
     * </p>
     * 
     * @return The full commit ID of the commit in the source branch used to create the pull request, or in the case of
     *         an updated pull request, the full commit ID of the commit used to update the pull request.
     */

    public String getBeforeCommitId() {
        return this.beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the source branch used to create the pull request, or in the case of an
     * updated pull request, the full commit ID of the commit used to update the pull request.
     * </p>
     * 
     * @param beforeCommitId
     *        The full commit ID of the commit in the source branch used to create the pull request, or in the case of
     *        an updated pull request, the full commit ID of the commit used to update the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestResult withBeforeCommitId(String beforeCommitId) {
        setBeforeCommitId(beforeCommitId);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch where the pull request will be merged.
     * </p>
     * 
     * @param afterCommitId
     *        The full commit ID of the commit in the destination branch where the pull request will be merged.
     */

    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch where the pull request will be merged.
     * </p>
     * 
     * @return The full commit ID of the commit in the destination branch where the pull request will be merged.
     */

    public String getAfterCommitId() {
        return this.afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit in the destination branch where the pull request will be merged.
     * </p>
     * 
     * @param afterCommitId
     *        The full commit ID of the commit in the destination branch where the pull request will be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestResult withAfterCommitId(String afterCommitId) {
        setAfterCommitId(afterCommitId);
        return this;
    }

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the 'before' blob.
     * </p>
     * 
     * @param beforeBlobId
     *        In the directionality of the pull request, the blob ID of the 'before' blob.
     */

    public void setBeforeBlobId(String beforeBlobId) {
        this.beforeBlobId = beforeBlobId;
    }

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the 'before' blob.
     * </p>
     * 
     * @return In the directionality of the pull request, the blob ID of the 'before' blob.
     */

    public String getBeforeBlobId() {
        return this.beforeBlobId;
    }

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the 'before' blob.
     * </p>
     * 
     * @param beforeBlobId
     *        In the directionality of the pull request, the blob ID of the 'before' blob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestResult withBeforeBlobId(String beforeBlobId) {
        setBeforeBlobId(beforeBlobId);
        return this;
    }

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the 'after' blob.
     * </p>
     * 
     * @param afterBlobId
     *        In the directionality of the pull request, the blob ID of the 'after' blob.
     */

    public void setAfterBlobId(String afterBlobId) {
        this.afterBlobId = afterBlobId;
    }

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the 'after' blob.
     * </p>
     * 
     * @return In the directionality of the pull request, the blob ID of the 'after' blob.
     */

    public String getAfterBlobId() {
        return this.afterBlobId;
    }

    /**
     * <p>
     * In the directionality of the pull request, the blob ID of the 'after' blob.
     * </p>
     * 
     * @param afterBlobId
     *        In the directionality of the pull request, the blob ID of the 'after' blob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestResult withAfterBlobId(String afterBlobId) {
        setAfterBlobId(afterBlobId);
        return this;
    }

    /**
     * <p>
     * The location of the change where you posted your comment.
     * </p>
     * 
     * @param location
     *        The location of the change where you posted your comment.
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the change where you posted your comment.
     * </p>
     * 
     * @return The location of the change where you posted your comment.
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the change where you posted your comment.
     * </p>
     * 
     * @param location
     *        The location of the change where you posted your comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestResult withLocation(Location location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The content of the comment you posted.
     * </p>
     * 
     * @param comment
     *        The content of the comment you posted.
     */

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The content of the comment you posted.
     * </p>
     * 
     * @return The content of the comment you posted.
     */

    public Comment getComment() {
        return this.comment;
    }

    /**
     * <p>
     * The content of the comment you posted.
     * </p>
     * 
     * @param comment
     *        The content of the comment you posted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForPullRequestResult withComment(Comment comment) {
        setComment(comment);
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
        if (getPullRequestId() != null)
            sb.append("PullRequestId: ").append(getPullRequestId()).append(",");
        if (getBeforeCommitId() != null)
            sb.append("BeforeCommitId: ").append(getBeforeCommitId()).append(",");
        if (getAfterCommitId() != null)
            sb.append("AfterCommitId: ").append(getAfterCommitId()).append(",");
        if (getBeforeBlobId() != null)
            sb.append("BeforeBlobId: ").append(getBeforeBlobId()).append(",");
        if (getAfterBlobId() != null)
            sb.append("AfterBlobId: ").append(getAfterBlobId()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostCommentForPullRequestResult == false)
            return false;
        PostCommentForPullRequestResult other = (PostCommentForPullRequestResult) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getBeforeCommitId() == null ^ this.getBeforeCommitId() == null)
            return false;
        if (other.getBeforeCommitId() != null && other.getBeforeCommitId().equals(this.getBeforeCommitId()) == false)
            return false;
        if (other.getAfterCommitId() == null ^ this.getAfterCommitId() == null)
            return false;
        if (other.getAfterCommitId() != null && other.getAfterCommitId().equals(this.getAfterCommitId()) == false)
            return false;
        if (other.getBeforeBlobId() == null ^ this.getBeforeBlobId() == null)
            return false;
        if (other.getBeforeBlobId() != null && other.getBeforeBlobId().equals(this.getBeforeBlobId()) == false)
            return false;
        if (other.getAfterBlobId() == null ^ this.getAfterBlobId() == null)
            return false;
        if (other.getAfterBlobId() != null && other.getAfterBlobId().equals(this.getAfterBlobId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getBeforeCommitId() == null) ? 0 : getBeforeCommitId().hashCode());
        hashCode = prime * hashCode + ((getAfterCommitId() == null) ? 0 : getAfterCommitId().hashCode());
        hashCode = prime * hashCode + ((getBeforeBlobId() == null) ? 0 : getBeforeBlobId().hashCode());
        hashCode = prime * hashCode + ((getAfterBlobId() == null) ? 0 : getAfterBlobId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public PostCommentForPullRequestResult clone() {
        try {
            return (PostCommentForPullRequestResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
