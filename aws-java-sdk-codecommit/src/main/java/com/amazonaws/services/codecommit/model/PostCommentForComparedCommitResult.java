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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PostCommentForComparedCommit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostCommentForComparedCommitResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository where you posted a comment on the comparison between commits.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * In the directionality you established, the full commit ID of the 'before' commit.
     * </p>
     */
    private String beforeCommitId;
    /**
     * <p>
     * In the directionality you established, the full commit ID of the 'after' commit.
     * </p>
     */
    private String afterCommitId;
    /**
     * <p>
     * In the directionality you established, the blob ID of the 'before' blob.
     * </p>
     */
    private String beforeBlobId;
    /**
     * <p>
     * In the directionality you established, the blob ID of the 'after' blob.
     * </p>
     */
    private String afterBlobId;
    /**
     * <p>
     * The location of the comment in the comparison between the two commits.
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
     * The name of the repository where you posted a comment on the comparison between commits.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you posted a comment on the comparison between commits.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you posted a comment on the comparison between commits.
     * </p>
     * 
     * @return The name of the repository where you posted a comment on the comparison between commits.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you posted a comment on the comparison between commits.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where you posted a comment on the comparison between commits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForComparedCommitResult withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * In the directionality you established, the full commit ID of the 'before' commit.
     * </p>
     * 
     * @param beforeCommitId
     *        In the directionality you established, the full commit ID of the 'before' commit.
     */

    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * In the directionality you established, the full commit ID of the 'before' commit.
     * </p>
     * 
     * @return In the directionality you established, the full commit ID of the 'before' commit.
     */

    public String getBeforeCommitId() {
        return this.beforeCommitId;
    }

    /**
     * <p>
     * In the directionality you established, the full commit ID of the 'before' commit.
     * </p>
     * 
     * @param beforeCommitId
     *        In the directionality you established, the full commit ID of the 'before' commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForComparedCommitResult withBeforeCommitId(String beforeCommitId) {
        setBeforeCommitId(beforeCommitId);
        return this;
    }

    /**
     * <p>
     * In the directionality you established, the full commit ID of the 'after' commit.
     * </p>
     * 
     * @param afterCommitId
     *        In the directionality you established, the full commit ID of the 'after' commit.
     */

    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * In the directionality you established, the full commit ID of the 'after' commit.
     * </p>
     * 
     * @return In the directionality you established, the full commit ID of the 'after' commit.
     */

    public String getAfterCommitId() {
        return this.afterCommitId;
    }

    /**
     * <p>
     * In the directionality you established, the full commit ID of the 'after' commit.
     * </p>
     * 
     * @param afterCommitId
     *        In the directionality you established, the full commit ID of the 'after' commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForComparedCommitResult withAfterCommitId(String afterCommitId) {
        setAfterCommitId(afterCommitId);
        return this;
    }

    /**
     * <p>
     * In the directionality you established, the blob ID of the 'before' blob.
     * </p>
     * 
     * @param beforeBlobId
     *        In the directionality you established, the blob ID of the 'before' blob.
     */

    public void setBeforeBlobId(String beforeBlobId) {
        this.beforeBlobId = beforeBlobId;
    }

    /**
     * <p>
     * In the directionality you established, the blob ID of the 'before' blob.
     * </p>
     * 
     * @return In the directionality you established, the blob ID of the 'before' blob.
     */

    public String getBeforeBlobId() {
        return this.beforeBlobId;
    }

    /**
     * <p>
     * In the directionality you established, the blob ID of the 'before' blob.
     * </p>
     * 
     * @param beforeBlobId
     *        In the directionality you established, the blob ID of the 'before' blob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForComparedCommitResult withBeforeBlobId(String beforeBlobId) {
        setBeforeBlobId(beforeBlobId);
        return this;
    }

    /**
     * <p>
     * In the directionality you established, the blob ID of the 'after' blob.
     * </p>
     * 
     * @param afterBlobId
     *        In the directionality you established, the blob ID of the 'after' blob.
     */

    public void setAfterBlobId(String afterBlobId) {
        this.afterBlobId = afterBlobId;
    }

    /**
     * <p>
     * In the directionality you established, the blob ID of the 'after' blob.
     * </p>
     * 
     * @return In the directionality you established, the blob ID of the 'after' blob.
     */

    public String getAfterBlobId() {
        return this.afterBlobId;
    }

    /**
     * <p>
     * In the directionality you established, the blob ID of the 'after' blob.
     * </p>
     * 
     * @param afterBlobId
     *        In the directionality you established, the blob ID of the 'after' blob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForComparedCommitResult withAfterBlobId(String afterBlobId) {
        setAfterBlobId(afterBlobId);
        return this;
    }

    /**
     * <p>
     * The location of the comment in the comparison between the two commits.
     * </p>
     * 
     * @param location
     *        The location of the comment in the comparison between the two commits.
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the comment in the comparison between the two commits.
     * </p>
     * 
     * @return The location of the comment in the comparison between the two commits.
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the comment in the comparison between the two commits.
     * </p>
     * 
     * @param location
     *        The location of the comment in the comparison between the two commits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCommentForComparedCommitResult withLocation(Location location) {
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

    public PostCommentForComparedCommitResult withComment(Comment comment) {
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

        if (obj instanceof PostCommentForComparedCommitResult == false)
            return false;
        PostCommentForComparedCommitResult other = (PostCommentForComparedCommitResult) obj;
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
        hashCode = prime * hashCode + ((getBeforeCommitId() == null) ? 0 : getBeforeCommitId().hashCode());
        hashCode = prime * hashCode + ((getAfterCommitId() == null) ? 0 : getAfterCommitId().hashCode());
        hashCode = prime * hashCode + ((getBeforeBlobId() == null) ? 0 : getBeforeBlobId().hashCode());
        hashCode = prime * hashCode + ((getAfterBlobId() == null) ? 0 : getAfterBlobId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public PostCommentForComparedCommitResult clone() {
        try {
            return (PostCommentForComparedCommitResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
