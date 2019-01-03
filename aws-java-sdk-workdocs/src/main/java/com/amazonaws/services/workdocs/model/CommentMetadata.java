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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the metadata of a comment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CommentMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommentMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the comment.
     * </p>
     */
    private String commentId;
    /**
     * <p>
     * The user who made the comment.
     * </p>
     */
    private User contributor;
    /**
     * <p>
     * The timestamp that the comment was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The status of the comment.
     * </p>
     */
    private String commentStatus;
    /**
     * <p>
     * The ID of the user being replied to.
     * </p>
     */
    private String recipientId;

    /**
     * <p>
     * The ID of the comment.
     * </p>
     * 
     * @param commentId
     *        The ID of the comment.
     */

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * <p>
     * The ID of the comment.
     * </p>
     * 
     * @return The ID of the comment.
     */

    public String getCommentId() {
        return this.commentId;
    }

    /**
     * <p>
     * The ID of the comment.
     * </p>
     * 
     * @param commentId
     *        The ID of the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentMetadata withCommentId(String commentId) {
        setCommentId(commentId);
        return this;
    }

    /**
     * <p>
     * The user who made the comment.
     * </p>
     * 
     * @param contributor
     *        The user who made the comment.
     */

    public void setContributor(User contributor) {
        this.contributor = contributor;
    }

    /**
     * <p>
     * The user who made the comment.
     * </p>
     * 
     * @return The user who made the comment.
     */

    public User getContributor() {
        return this.contributor;
    }

    /**
     * <p>
     * The user who made the comment.
     * </p>
     * 
     * @param contributor
     *        The user who made the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentMetadata withContributor(User contributor) {
        setContributor(contributor);
        return this;
    }

    /**
     * <p>
     * The timestamp that the comment was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp that the comment was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp that the comment was created.
     * </p>
     * 
     * @return The timestamp that the comment was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp that the comment was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp that the comment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentMetadata withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The status of the comment.
     * </p>
     * 
     * @param commentStatus
     *        The status of the comment.
     * @see CommentStatusType
     */

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    /**
     * <p>
     * The status of the comment.
     * </p>
     * 
     * @return The status of the comment.
     * @see CommentStatusType
     */

    public String getCommentStatus() {
        return this.commentStatus;
    }

    /**
     * <p>
     * The status of the comment.
     * </p>
     * 
     * @param commentStatus
     *        The status of the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommentStatusType
     */

    public CommentMetadata withCommentStatus(String commentStatus) {
        setCommentStatus(commentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the comment.
     * </p>
     * 
     * @param commentStatus
     *        The status of the comment.
     * @see CommentStatusType
     */

    public void setCommentStatus(CommentStatusType commentStatus) {
        withCommentStatus(commentStatus);
    }

    /**
     * <p>
     * The status of the comment.
     * </p>
     * 
     * @param commentStatus
     *        The status of the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommentStatusType
     */

    public CommentMetadata withCommentStatus(CommentStatusType commentStatus) {
        this.commentStatus = commentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the user being replied to.
     * </p>
     * 
     * @param recipientId
     *        The ID of the user being replied to.
     */

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    /**
     * <p>
     * The ID of the user being replied to.
     * </p>
     * 
     * @return The ID of the user being replied to.
     */

    public String getRecipientId() {
        return this.recipientId;
    }

    /**
     * <p>
     * The ID of the user being replied to.
     * </p>
     * 
     * @param recipientId
     *        The ID of the user being replied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommentMetadata withRecipientId(String recipientId) {
        setRecipientId(recipientId);
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
        if (getCommentId() != null)
            sb.append("CommentId: ").append(getCommentId()).append(",");
        if (getContributor() != null)
            sb.append("Contributor: ").append(getContributor()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getCommentStatus() != null)
            sb.append("CommentStatus: ").append(getCommentStatus()).append(",");
        if (getRecipientId() != null)
            sb.append("RecipientId: ").append(getRecipientId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommentMetadata == false)
            return false;
        CommentMetadata other = (CommentMetadata) obj;
        if (other.getCommentId() == null ^ this.getCommentId() == null)
            return false;
        if (other.getCommentId() != null && other.getCommentId().equals(this.getCommentId()) == false)
            return false;
        if (other.getContributor() == null ^ this.getContributor() == null)
            return false;
        if (other.getContributor() != null && other.getContributor().equals(this.getContributor()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getCommentStatus() == null ^ this.getCommentStatus() == null)
            return false;
        if (other.getCommentStatus() != null && other.getCommentStatus().equals(this.getCommentStatus()) == false)
            return false;
        if (other.getRecipientId() == null ^ this.getRecipientId() == null)
            return false;
        if (other.getRecipientId() != null && other.getRecipientId().equals(this.getRecipientId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        hashCode = prime * hashCode + ((getContributor() == null) ? 0 : getContributor().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCommentStatus() == null) ? 0 : getCommentStatus().hashCode());
        hashCode = prime * hashCode + ((getRecipientId() == null) ? 0 : getRecipientId().hashCode());
        return hashCode;
    }

    @Override
    public CommentMetadata clone() {
        try {
            return (CommentMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.CommentMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
