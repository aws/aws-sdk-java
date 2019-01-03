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
 * Returns information about comments on the comparison between two commits.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/CommentsForComparedCommit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommentsForComparedCommit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the repository that contains the compared commits.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The full commit ID of the commit used to establish the 'before' of the comparison.
     * </p>
     */
    private String beforeCommitId;
    /**
     * <p>
     * The full commit ID of the commit used to establish the 'after' of the comparison.
     * </p>
     */
    private String afterCommitId;
    /**
     * <p>
     * The full blob ID of the commit used to establish the 'before' of the comparison.
     * </p>
     */
    private String beforeBlobId;
    /**
     * <p>
     * The full blob ID of the commit used to establish the 'after' of the comparison.
     * </p>
     */
    private String afterBlobId;
    /**
     * <p>
     * Location information about the comment on the comparison, including the file name, line number, and whether the
     * version of the file where the comment was made is 'BEFORE' or 'AFTER'.
     * </p>
     */
    private Location location;
    /**
     * <p>
     * An array of comment objects. Each comment object contains information about a comment on the comparison between
     * commits.
     * </p>
     */
    private java.util.List<Comment> comments;

    /**
     * <p>
     * The name of the repository that contains the compared commits.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the compared commits.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the compared commits.
     * </p>
     * 
     * @return The name of the repository that contains the compared commits.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the compared commits.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the compared commits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForComparedCommit withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit used to establish the 'before' of the comparison.
     * </p>
     * 
     * @param beforeCommitId
     *        The full commit ID of the commit used to establish the 'before' of the comparison.
     */

    public void setBeforeCommitId(String beforeCommitId) {
        this.beforeCommitId = beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit used to establish the 'before' of the comparison.
     * </p>
     * 
     * @return The full commit ID of the commit used to establish the 'before' of the comparison.
     */

    public String getBeforeCommitId() {
        return this.beforeCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit used to establish the 'before' of the comparison.
     * </p>
     * 
     * @param beforeCommitId
     *        The full commit ID of the commit used to establish the 'before' of the comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForComparedCommit withBeforeCommitId(String beforeCommitId) {
        setBeforeCommitId(beforeCommitId);
        return this;
    }

    /**
     * <p>
     * The full commit ID of the commit used to establish the 'after' of the comparison.
     * </p>
     * 
     * @param afterCommitId
     *        The full commit ID of the commit used to establish the 'after' of the comparison.
     */

    public void setAfterCommitId(String afterCommitId) {
        this.afterCommitId = afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit used to establish the 'after' of the comparison.
     * </p>
     * 
     * @return The full commit ID of the commit used to establish the 'after' of the comparison.
     */

    public String getAfterCommitId() {
        return this.afterCommitId;
    }

    /**
     * <p>
     * The full commit ID of the commit used to establish the 'after' of the comparison.
     * </p>
     * 
     * @param afterCommitId
     *        The full commit ID of the commit used to establish the 'after' of the comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForComparedCommit withAfterCommitId(String afterCommitId) {
        setAfterCommitId(afterCommitId);
        return this;
    }

    /**
     * <p>
     * The full blob ID of the commit used to establish the 'before' of the comparison.
     * </p>
     * 
     * @param beforeBlobId
     *        The full blob ID of the commit used to establish the 'before' of the comparison.
     */

    public void setBeforeBlobId(String beforeBlobId) {
        this.beforeBlobId = beforeBlobId;
    }

    /**
     * <p>
     * The full blob ID of the commit used to establish the 'before' of the comparison.
     * </p>
     * 
     * @return The full blob ID of the commit used to establish the 'before' of the comparison.
     */

    public String getBeforeBlobId() {
        return this.beforeBlobId;
    }

    /**
     * <p>
     * The full blob ID of the commit used to establish the 'before' of the comparison.
     * </p>
     * 
     * @param beforeBlobId
     *        The full blob ID of the commit used to establish the 'before' of the comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForComparedCommit withBeforeBlobId(String beforeBlobId) {
        setBeforeBlobId(beforeBlobId);
        return this;
    }

    /**
     * <p>
     * The full blob ID of the commit used to establish the 'after' of the comparison.
     * </p>
     * 
     * @param afterBlobId
     *        The full blob ID of the commit used to establish the 'after' of the comparison.
     */

    public void setAfterBlobId(String afterBlobId) {
        this.afterBlobId = afterBlobId;
    }

    /**
     * <p>
     * The full blob ID of the commit used to establish the 'after' of the comparison.
     * </p>
     * 
     * @return The full blob ID of the commit used to establish the 'after' of the comparison.
     */

    public String getAfterBlobId() {
        return this.afterBlobId;
    }

    /**
     * <p>
     * The full blob ID of the commit used to establish the 'after' of the comparison.
     * </p>
     * 
     * @param afterBlobId
     *        The full blob ID of the commit used to establish the 'after' of the comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForComparedCommit withAfterBlobId(String afterBlobId) {
        setAfterBlobId(afterBlobId);
        return this;
    }

    /**
     * <p>
     * Location information about the comment on the comparison, including the file name, line number, and whether the
     * version of the file where the comment was made is 'BEFORE' or 'AFTER'.
     * </p>
     * 
     * @param location
     *        Location information about the comment on the comparison, including the file name, line number, and
     *        whether the version of the file where the comment was made is 'BEFORE' or 'AFTER'.
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * <p>
     * Location information about the comment on the comparison, including the file name, line number, and whether the
     * version of the file where the comment was made is 'BEFORE' or 'AFTER'.
     * </p>
     * 
     * @return Location information about the comment on the comparison, including the file name, line number, and
     *         whether the version of the file where the comment was made is 'BEFORE' or 'AFTER'.
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Location information about the comment on the comparison, including the file name, line number, and whether the
     * version of the file where the comment was made is 'BEFORE' or 'AFTER'.
     * </p>
     * 
     * @param location
     *        Location information about the comment on the comparison, including the file name, line number, and
     *        whether the version of the file where the comment was made is 'BEFORE' or 'AFTER'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForComparedCommit withLocation(Location location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * An array of comment objects. Each comment object contains information about a comment on the comparison between
     * commits.
     * </p>
     * 
     * @return An array of comment objects. Each comment object contains information about a comment on the comparison
     *         between commits.
     */

    public java.util.List<Comment> getComments() {
        return comments;
    }

    /**
     * <p>
     * An array of comment objects. Each comment object contains information about a comment on the comparison between
     * commits.
     * </p>
     * 
     * @param comments
     *        An array of comment objects. Each comment object contains information about a comment on the comparison
     *        between commits.
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
     * An array of comment objects. Each comment object contains information about a comment on the comparison between
     * commits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComments(java.util.Collection)} or {@link #withComments(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param comments
     *        An array of comment objects. Each comment object contains information about a comment on the comparison
     *        between commits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForComparedCommit withComments(Comment... comments) {
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
     * An array of comment objects. Each comment object contains information about a comment on the comparison between
     * commits.
     * </p>
     * 
     * @param comments
     *        An array of comment objects. Each comment object contains information about a comment on the comparison
     *        between commits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentsForComparedCommit withComments(java.util.Collection<Comment> comments) {
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

        if (obj instanceof CommentsForComparedCommit == false)
            return false;
        CommentsForComparedCommit other = (CommentsForComparedCommit) obj;
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
    public CommentsForComparedCommit clone() {
        try {
            return (CommentsForComparedCommit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.CommentsForComparedCommitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
