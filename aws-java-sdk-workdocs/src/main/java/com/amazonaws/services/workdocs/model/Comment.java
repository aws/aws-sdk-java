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
 * Describes a comment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/Comment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Comment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the comment.
     * </p>
     */
    private String commentId;
    /**
     * <p>
     * The ID of the parent comment.
     * </p>
     */
    private String parentId;
    /**
     * <p>
     * The ID of the root comment in the thread.
     * </p>
     */
    private String threadId;
    /**
     * <p>
     * The text of the comment.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The details of the user who made the comment.
     * </p>
     */
    private User contributor;
    /**
     * <p>
     * The time that the comment was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The status of the comment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment
     * author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners,
     * and contributors.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * If the comment is a reply to another user's comment, this field contains the user ID of the user being replied
     * to.
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

    public Comment withCommentId(String commentId) {
        setCommentId(commentId);
        return this;
    }

    /**
     * <p>
     * The ID of the parent comment.
     * </p>
     * 
     * @param parentId
     *        The ID of the parent comment.
     */

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * The ID of the parent comment.
     * </p>
     * 
     * @return The ID of the parent comment.
     */

    public String getParentId() {
        return this.parentId;
    }

    /**
     * <p>
     * The ID of the parent comment.
     * </p>
     * 
     * @param parentId
     *        The ID of the parent comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Comment withParentId(String parentId) {
        setParentId(parentId);
        return this;
    }

    /**
     * <p>
     * The ID of the root comment in the thread.
     * </p>
     * 
     * @param threadId
     *        The ID of the root comment in the thread.
     */

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    /**
     * <p>
     * The ID of the root comment in the thread.
     * </p>
     * 
     * @return The ID of the root comment in the thread.
     */

    public String getThreadId() {
        return this.threadId;
    }

    /**
     * <p>
     * The ID of the root comment in the thread.
     * </p>
     * 
     * @param threadId
     *        The ID of the root comment in the thread.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Comment withThreadId(String threadId) {
        setThreadId(threadId);
        return this;
    }

    /**
     * <p>
     * The text of the comment.
     * </p>
     * 
     * @param text
     *        The text of the comment.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text of the comment.
     * </p>
     * 
     * @return The text of the comment.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text of the comment.
     * </p>
     * 
     * @param text
     *        The text of the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Comment withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The details of the user who made the comment.
     * </p>
     * 
     * @param contributor
     *        The details of the user who made the comment.
     */

    public void setContributor(User contributor) {
        this.contributor = contributor;
    }

    /**
     * <p>
     * The details of the user who made the comment.
     * </p>
     * 
     * @return The details of the user who made the comment.
     */

    public User getContributor() {
        return this.contributor;
    }

    /**
     * <p>
     * The details of the user who made the comment.
     * </p>
     * 
     * @param contributor
     *        The details of the user who made the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Comment withContributor(User contributor) {
        setContributor(contributor);
        return this;
    }

    /**
     * <p>
     * The time that the comment was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time that the comment was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time that the comment was created.
     * </p>
     * 
     * @return The time that the comment was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time that the comment was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time that the comment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Comment withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The status of the comment.
     * </p>
     * 
     * @param status
     *        The status of the comment.
     * @see CommentStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the comment.
     * </p>
     * 
     * @return The status of the comment.
     * @see CommentStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the comment.
     * </p>
     * 
     * @param status
     *        The status of the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommentStatusType
     */

    public Comment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the comment.
     * </p>
     * 
     * @param status
     *        The status of the comment.
     * @see CommentStatusType
     */

    public void setStatus(CommentStatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the comment.
     * </p>
     * 
     * @param status
     *        The status of the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommentStatusType
     */

    public Comment withStatus(CommentStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment
     * author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners,
     * and contributors.
     * </p>
     * 
     * @param visibility
     *        The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the
     *        comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document
     *        owners, co-owners, and contributors.
     * @see CommentVisibilityType
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment
     * author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners,
     * and contributors.
     * </p>
     * 
     * @return The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the
     *         comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document
     *         owners, co-owners, and contributors.
     * @see CommentVisibilityType
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment
     * author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners,
     * and contributors.
     * </p>
     * 
     * @param visibility
     *        The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the
     *        comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document
     *        owners, co-owners, and contributors.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommentVisibilityType
     */

    public Comment withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment
     * author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners,
     * and contributors.
     * </p>
     * 
     * @param visibility
     *        The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the
     *        comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document
     *        owners, co-owners, and contributors.
     * @see CommentVisibilityType
     */

    public void setVisibility(CommentVisibilityType visibility) {
        withVisibility(visibility);
    }

    /**
     * <p>
     * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment
     * author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners,
     * and contributors.
     * </p>
     * 
     * @param visibility
     *        The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the
     *        comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document
     *        owners, co-owners, and contributors.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommentVisibilityType
     */

    public Comment withVisibility(CommentVisibilityType visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * If the comment is a reply to another user's comment, this field contains the user ID of the user being replied
     * to.
     * </p>
     * 
     * @param recipientId
     *        If the comment is a reply to another user's comment, this field contains the user ID of the user being
     *        replied to.
     */

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    /**
     * <p>
     * If the comment is a reply to another user's comment, this field contains the user ID of the user being replied
     * to.
     * </p>
     * 
     * @return If the comment is a reply to another user's comment, this field contains the user ID of the user being
     *         replied to.
     */

    public String getRecipientId() {
        return this.recipientId;
    }

    /**
     * <p>
     * If the comment is a reply to another user's comment, this field contains the user ID of the user being replied
     * to.
     * </p>
     * 
     * @param recipientId
     *        If the comment is a reply to another user's comment, this field contains the user ID of the user being
     *        replied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Comment withRecipientId(String recipientId) {
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
        if (getParentId() != null)
            sb.append("ParentId: ").append(getParentId()).append(",");
        if (getThreadId() != null)
            sb.append("ThreadId: ").append(getThreadId()).append(",");
        if (getText() != null)
            sb.append("Text: ").append("***Sensitive Data Redacted***").append(",");
        if (getContributor() != null)
            sb.append("Contributor: ").append(getContributor()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
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

        if (obj instanceof Comment == false)
            return false;
        Comment other = (Comment) obj;
        if (other.getCommentId() == null ^ this.getCommentId() == null)
            return false;
        if (other.getCommentId() != null && other.getCommentId().equals(this.getCommentId()) == false)
            return false;
        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
            return false;
        if (other.getThreadId() == null ^ this.getThreadId() == null)
            return false;
        if (other.getThreadId() != null && other.getThreadId().equals(this.getThreadId()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getContributor() == null ^ this.getContributor() == null)
            return false;
        if (other.getContributor() != null && other.getContributor().equals(this.getContributor()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
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
        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getContributor() == null) ? 0 : getContributor().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getRecipientId() == null) ? 0 : getRecipientId().hashCode());
        return hashCode;
    }

    @Override
    public Comment clone() {
        try {
            return (Comment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.CommentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
