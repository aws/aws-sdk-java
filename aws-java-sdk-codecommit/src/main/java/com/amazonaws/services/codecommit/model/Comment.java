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
 * Returns information about a specific comment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/Comment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Comment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The system-generated comment ID.
     * </p>
     */
    private String commentId;
    /**
     * <p>
     * The content of the comment.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The ID of the comment for which this comment is a reply, if any.
     * </p>
     */
    private String inReplyTo;
    /**
     * <p>
     * The date and time the comment was created, in timestamp format.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date and time the comment was most recently modified, in timestamp format.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the person who posted the comment.
     * </p>
     */
    private String authorArn;
    /**
     * <p>
     * A Boolean value indicating whether the comment has been deleted.
     * </p>
     */
    private Boolean deleted;
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
     * The system-generated comment ID.
     * </p>
     * 
     * @param commentId
     *        The system-generated comment ID.
     */

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * <p>
     * The system-generated comment ID.
     * </p>
     * 
     * @return The system-generated comment ID.
     */

    public String getCommentId() {
        return this.commentId;
    }

    /**
     * <p>
     * The system-generated comment ID.
     * </p>
     * 
     * @param commentId
     *        The system-generated comment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Comment withCommentId(String commentId) {
        setCommentId(commentId);
        return this;
    }

    /**
     * <p>
     * The content of the comment.
     * </p>
     * 
     * @param content
     *        The content of the comment.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the comment.
     * </p>
     * 
     * @return The content of the comment.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the comment.
     * </p>
     * 
     * @param content
     *        The content of the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Comment withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The ID of the comment for which this comment is a reply, if any.
     * </p>
     * 
     * @param inReplyTo
     *        The ID of the comment for which this comment is a reply, if any.
     */

    public void setInReplyTo(String inReplyTo) {
        this.inReplyTo = inReplyTo;
    }

    /**
     * <p>
     * The ID of the comment for which this comment is a reply, if any.
     * </p>
     * 
     * @return The ID of the comment for which this comment is a reply, if any.
     */

    public String getInReplyTo() {
        return this.inReplyTo;
    }

    /**
     * <p>
     * The ID of the comment for which this comment is a reply, if any.
     * </p>
     * 
     * @param inReplyTo
     *        The ID of the comment for which this comment is a reply, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Comment withInReplyTo(String inReplyTo) {
        setInReplyTo(inReplyTo);
        return this;
    }

    /**
     * <p>
     * The date and time the comment was created, in timestamp format.
     * </p>
     * 
     * @param creationDate
     *        The date and time the comment was created, in timestamp format.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time the comment was created, in timestamp format.
     * </p>
     * 
     * @return The date and time the comment was created, in timestamp format.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time the comment was created, in timestamp format.
     * </p>
     * 
     * @param creationDate
     *        The date and time the comment was created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Comment withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date and time the comment was most recently modified, in timestamp format.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time the comment was most recently modified, in timestamp format.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time the comment was most recently modified, in timestamp format.
     * </p>
     * 
     * @return The date and time the comment was most recently modified, in timestamp format.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time the comment was most recently modified, in timestamp format.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time the comment was most recently modified, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Comment withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the person who posted the comment.
     * </p>
     * 
     * @param authorArn
     *        The Amazon Resource Name (ARN) of the person who posted the comment.
     */

    public void setAuthorArn(String authorArn) {
        this.authorArn = authorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the person who posted the comment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the person who posted the comment.
     */

    public String getAuthorArn() {
        return this.authorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the person who posted the comment.
     * </p>
     * 
     * @param authorArn
     *        The Amazon Resource Name (ARN) of the person who posted the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Comment withAuthorArn(String authorArn) {
        setAuthorArn(authorArn);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the comment has been deleted.
     * </p>
     * 
     * @param deleted
     *        A Boolean value indicating whether the comment has been deleted.
     */

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * <p>
     * A Boolean value indicating whether the comment has been deleted.
     * </p>
     * 
     * @return A Boolean value indicating whether the comment has been deleted.
     */

    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * A Boolean value indicating whether the comment has been deleted.
     * </p>
     * 
     * @param deleted
     *        A Boolean value indicating whether the comment has been deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Comment withDeleted(Boolean deleted) {
        setDeleted(deleted);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the comment has been deleted.
     * </p>
     * 
     * @return A Boolean value indicating whether the comment has been deleted.
     */

    public Boolean isDeleted() {
        return this.deleted;
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

    public Comment withClientRequestToken(String clientRequestToken) {
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
        if (getCommentId() != null)
            sb.append("CommentId: ").append(getCommentId()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getInReplyTo() != null)
            sb.append("InReplyTo: ").append(getInReplyTo()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getAuthorArn() != null)
            sb.append("AuthorArn: ").append(getAuthorArn()).append(",");
        if (getDeleted() != null)
            sb.append("Deleted: ").append(getDeleted()).append(",");
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

        if (obj instanceof Comment == false)
            return false;
        Comment other = (Comment) obj;
        if (other.getCommentId() == null ^ this.getCommentId() == null)
            return false;
        if (other.getCommentId() != null && other.getCommentId().equals(this.getCommentId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getInReplyTo() == null ^ this.getInReplyTo() == null)
            return false;
        if (other.getInReplyTo() != null && other.getInReplyTo().equals(this.getInReplyTo()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getAuthorArn() == null ^ this.getAuthorArn() == null)
            return false;
        if (other.getAuthorArn() != null && other.getAuthorArn().equals(this.getAuthorArn()) == false)
            return false;
        if (other.getDeleted() == null ^ this.getDeleted() == null)
            return false;
        if (other.getDeleted() != null && other.getDeleted().equals(this.getDeleted()) == false)
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

        hashCode = prime * hashCode + ((getCommentId() == null) ? 0 : getCommentId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getInReplyTo() == null) ? 0 : getInReplyTo().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getAuthorArn() == null) ? 0 : getAuthorArn().hashCode());
        hashCode = prime * hashCode + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
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
        com.amazonaws.services.codecommit.model.transform.CommentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
