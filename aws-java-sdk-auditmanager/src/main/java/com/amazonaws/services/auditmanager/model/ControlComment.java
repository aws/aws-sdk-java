/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A comment posted by a user on a control. This includes the author's name, the comment text, and a timestamp.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ControlComment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlComment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the user who authored the comment.
     * </p>
     */
    private String authorName;
    /**
     * <p>
     * The body text of a control comment.
     * </p>
     */
    private String commentBody;
    /**
     * <p>
     * The time when the comment was posted.
     * </p>
     */
    private java.util.Date postedDate;

    /**
     * <p>
     * The name of the user who authored the comment.
     * </p>
     * 
     * @param authorName
     *        The name of the user who authored the comment.
     */

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * <p>
     * The name of the user who authored the comment.
     * </p>
     * 
     * @return The name of the user who authored the comment.
     */

    public String getAuthorName() {
        return this.authorName;
    }

    /**
     * <p>
     * The name of the user who authored the comment.
     * </p>
     * 
     * @param authorName
     *        The name of the user who authored the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlComment withAuthorName(String authorName) {
        setAuthorName(authorName);
        return this;
    }

    /**
     * <p>
     * The body text of a control comment.
     * </p>
     * 
     * @param commentBody
     *        The body text of a control comment.
     */

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    /**
     * <p>
     * The body text of a control comment.
     * </p>
     * 
     * @return The body text of a control comment.
     */

    public String getCommentBody() {
        return this.commentBody;
    }

    /**
     * <p>
     * The body text of a control comment.
     * </p>
     * 
     * @param commentBody
     *        The body text of a control comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlComment withCommentBody(String commentBody) {
        setCommentBody(commentBody);
        return this;
    }

    /**
     * <p>
     * The time when the comment was posted.
     * </p>
     * 
     * @param postedDate
     *        The time when the comment was posted.
     */

    public void setPostedDate(java.util.Date postedDate) {
        this.postedDate = postedDate;
    }

    /**
     * <p>
     * The time when the comment was posted.
     * </p>
     * 
     * @return The time when the comment was posted.
     */

    public java.util.Date getPostedDate() {
        return this.postedDate;
    }

    /**
     * <p>
     * The time when the comment was posted.
     * </p>
     * 
     * @param postedDate
     *        The time when the comment was posted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlComment withPostedDate(java.util.Date postedDate) {
        setPostedDate(postedDate);
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
        if (getAuthorName() != null)
            sb.append("AuthorName: ").append(getAuthorName()).append(",");
        if (getCommentBody() != null)
            sb.append("CommentBody: ").append(getCommentBody()).append(",");
        if (getPostedDate() != null)
            sb.append("PostedDate: ").append(getPostedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ControlComment == false)
            return false;
        ControlComment other = (ControlComment) obj;
        if (other.getAuthorName() == null ^ this.getAuthorName() == null)
            return false;
        if (other.getAuthorName() != null && other.getAuthorName().equals(this.getAuthorName()) == false)
            return false;
        if (other.getCommentBody() == null ^ this.getCommentBody() == null)
            return false;
        if (other.getCommentBody() != null && other.getCommentBody().equals(this.getCommentBody()) == false)
            return false;
        if (other.getPostedDate() == null ^ this.getPostedDate() == null)
            return false;
        if (other.getPostedDate() != null && other.getPostedDate().equals(this.getPostedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorName() == null) ? 0 : getAuthorName().hashCode());
        hashCode = prime * hashCode + ((getCommentBody() == null) ? 0 : getCommentBody().hashCode());
        hashCode = prime * hashCode + ((getPostedDate() == null) ? 0 : getPostedDate().hashCode());
        return hashCode;
    }

    @Override
    public ControlComment clone() {
        try {
            return (ControlComment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.ControlCommentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
