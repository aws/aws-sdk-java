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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about comments on a pull request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CommentsForPullRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommentsForPullRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The system-generated ID of the pull request.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The full commit ID of the commit that was the tip of the destination branch when the pull request was created.
     * This commit will be superceded by the after commit in the source branch when and if you merge the source branch
     * into the destination branch.
     * </p>
     */
    private String beforeCommitId;
    /**
     * <p>
     * he full commit ID of the commit that was the tip of the source branch at the time the comment was made.
     * </p>
     */
    private String afterCommitId;
    /**
     * <p>
     * The full blob ID of the file on which you want to comment on the destination commit.
     * </p>
     */
    private String beforeBlobId;
    /**
     * <p>
     * The full blob ID of the file on which you want to comment on the source commit.
     * </p>
     */
    private String afterBlobId;
    /**
     * <p>
     * Location information about the comment on the pull request, including the file name, line number, and whether the
     * version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER' (source branch).
     * </p>
     */
    private Location location;
    /**
     * <p>
     * An array of comment objects. Each comment object contains information about a comment on the pull request.
     * </p>
     */
    private java.util.List<Comment> comments;

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

    public CommentsForPullRequest withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the pull request.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     * 
     * @return The name of the repository that contains the pull request.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForPullRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit that was the tip of the destination branch when the pull request was created.
     * This commit will be superceded by the after commit in the source branch when and if you merge the source branch
     * into the destination branch.
     * </p>
     * 
     * @param beforeCommitId
     *        The full commit ID of the commit that was the tip of the destination branch when the pull request was
     *        created. This commit will be superceded by the after commit in the source branch when and if you merge the
     *        source branch into the destination branch.
     */

    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that was the tip of the destination branch when the pull request was created.
     * This commit will be superceded by the after commit in the source branch when and if you merge the source branch
     * into the destination branch.
     * </p>
     * 
     * @return The full commit ID of the commit that was the tip of the destination branch when the pull request was
     *         created. This commit will be superceded by the after commit in the source branch when and if you merge
     *         the source branch into the destination branch.
     */

    public String getBeforeCommitId() {
        return this.beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that was the tip of the destination branch when the pull request was created.
     * This commit will be superceded by the after commit in the source branch when and if you merge the source branch
     * into the destination branch.
     * </p>
     * 
     * @param beforeCommitId
     *        The full commit ID of the commit that was the tip of the destination branch when the pull request was
     *        created. This commit will be superceded by the after commit in the source branch when and if you merge the
     *        source branch into the destination branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForPullRequest withBeforeCommitId(String beforeCommitId) {
        setBeforeCommitId(beforeCommitId);
        return this;
    }

    /**
     * <p>
     * he full commit ID of the commit that was the tip of the source branch at the time the comment was made.
     * </p>
     * 
     * @param afterCommitId
     *        he full commit ID of the commit that was the tip of the source branch at the time the comment was made.
     */

    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * he full commit ID of the commit that was the tip of the source branch at the time the comment was made.
     * </p>
     * 
     * @return he full commit ID of the commit that was the tip of the source branch at the time the comment was made.
     */

    public String getAfterCommitId() {
        return this.afterCommitId;
    }

    /**
     * <p>
     * he full commit ID of the commit that was the tip of the source branch at the time the comment was made.
     * </p>
     * 
     * @param afterCommitId
     *        he full commit ID of the commit that was the tip of the source branch at the time the comment was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForPullRequest withAfterCommitId(String afterCommitId) {
        setAfterCommitId(afterCommitId);
        return this;
    }

    /**
     * <p>
     * The full blob ID of the file on which you want to comment on the destination commit.
     * </p>
     * 
     * @param beforeBlobId
     *        The full blob ID of the file on which you want to comment on the destination commit.
     */

    public void setBeforeBlobId(String beforeBlobId) {
        this.beforeBlobId = beforeBlobId;
    }

    /**
     * <p>
     * The full blob ID of the file on which you want to comment on the destination commit.
     * </p>
     * 
     * @return The full blob ID of the file on which you want to comment on the destination commit.
     */

    public String getBeforeBlobId() {
        return this.beforeBlobId;
    }

    /**
     * <p>
     * The full blob ID of the file on which you want to comment on the destination commit.
     * </p>
     * 
     * @param beforeBlobId
     *        The full blob ID of the file on which you want to comment on the destination commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForPullRequest withBeforeBlobId(String beforeBlobId) {
        setBeforeBlobId(beforeBlobId);
        return this;
    }

    /**
     * <p>
     * The full blob ID of the file on which you want to comment on the source commit.
     * </p>
     * 
     * @param afterBlobId
     *        The full blob ID of the file on which you want to comment on the source commit.
     */

    public void setAfterBlobId(String afterBlobId) {
        this.afterBlobId = afterBlobId;
    }

    /**
     * <p>
     * The full blob ID of the file on which you want to comment on the source commit.
     * </p>
     * 
     * @return The full blob ID of the file on which you want to comment on the source commit.
     */

    public String getAfterBlobId() {
        return this.afterBlobId;
    }

    /**
     * <p>
     * The full blob ID of the file on which you want to comment on the source commit.
     * </p>
     * 
     * @param afterBlobId
     *        The full blob ID of the file on which you want to comment on the source commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForPullRequest withAfterBlobId(String afterBlobId) {
        setAfterBlobId(afterBlobId);
        return this;
    }

    /**
     * <p>
     * Location information about the comment on the pull request, including the file name, line number, and whether the
     * version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER' (source branch).
     * </p>
     * 
     * @param location
     *        Location information about the comment on the pull request, including the file name, line number, and
     *        whether the version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER'
     *        (source branch).
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * Location information about the comment on the pull request, including the file name, line number, and whether the
     * version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER' (source branch).
     * </p>
     * 
     * @return Location information about the comment on the pull request, including the file name, line number, and
     *         whether the version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER'
     *         (source branch).
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Location information about the comment on the pull request, including the file name, line number, and whether the
     * version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER' (source branch).
     * </p>
     * 
     * @param location
     *        Location information about the comment on the pull request, including the file name, line number, and
     *        whether the version of the file where the comment was made is 'BEFORE' (destination branch) or 'AFTER'
     *        (source branch).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForPullRequest withLocation(Location location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * An array of comment objects. Each comment object contains information about a comment on the pull request.
     * </p>
     * 
     * @return An array of comment objects. Each comment object contains information about a comment on the pull
     *         request.
     */

    public java.util.List<Comment> getComments() {
        return comments;
    }

    /**
     * <p>
     * An array of comment objects. Each comment object contains information about a comment on the pull request.
     * </p>
     * 
     * @param comments
     *        An array of comment objects. Each comment object contains information about a comment on the pull request.
     */

    public void setComments(java.util.Collection<Comment> comments) {
        if (comments == null) {
            this.comments = null;
            return;
        }

        this.comments = new java.util.ArrayList<Comment>(comments);
    }

    /**
     * <p>
     * An array of comment objects. Each comment object contains information about a comment on the pull request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComments(java.util.Collection)} or {@link #withComments(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param comments
     *        An array of comment objects. Each comment object contains information about a comment on the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForPullRequest withComments(Comment... comments) {
        if (this.comments == null) {
            setComments(new java.util.ArrayList<Comment>(comments.length));
        }
        for (Comment ele : comments) {
            this.comments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of comment objects. Each comment object contains information about a comment on the pull request.
     * </p>
     * 
     * @param comments
     *        An array of comment objects. Each comment object contains information about a comment on the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForPullRequest withComments(java.util.Collection<Comment> comments) {
        setComments(comments);
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
        if (getBeforeBlobId() != null)
            sb.append("BeforeBlobId: ").append(getBeforeBlobId()).append(",");
        if (getAfterBlobId() != null)
            sb.append("AfterBlobId: ").append(getAfterBlobId()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getComments() != null)
            sb.append("Comments: ").append(getComments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommentsForPullRequest == false)
            return false;
        CommentsForPullRequest other = (CommentsForPullRequest) obj;
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
        if (other.getComments() == null ^ this.getComments() == null)
            return false;
        if (other.getComments() != null && other.getComments().equals(this.getComments()) == false)
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
        hashCode = prime * hashCode + ((getBeforeBlobId() == null) ? 0 : getBeforeBlobId().hashCode());
        hashCode = prime * hashCode + ((getAfterBlobId() == null) ? 0 : getAfterBlobId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getComments() == null) ? 0 : getComments().hashCode());
        return hashCode;
    }

    @Override
    public CommentsForPullRequest clone() {
        try {
            return (CommentsForPullRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.CommentsForPullRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
