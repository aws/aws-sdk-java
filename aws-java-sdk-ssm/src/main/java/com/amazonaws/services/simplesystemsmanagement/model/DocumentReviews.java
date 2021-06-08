/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a document approval review.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DocumentReviews" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentReviews implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action to take on a document approval review request.
     * </p>
     */
    private String action;
    /**
     * <p>
     * A comment entered by a user in your organization about the document review request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DocumentReviewCommentSource> comment;

    /**
     * <p>
     * The action to take on a document approval review request.
     * </p>
     * 
     * @param action
     *        The action to take on a document approval review request.
     * @see DocumentReviewAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to take on a document approval review request.
     * </p>
     * 
     * @return The action to take on a document approval review request.
     * @see DocumentReviewAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action to take on a document approval review request.
     * </p>
     * 
     * @param action
     *        The action to take on a document approval review request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReviewAction
     */

    public DocumentReviews withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action to take on a document approval review request.
     * </p>
     * 
     * @param action
     *        The action to take on a document approval review request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReviewAction
     */

    public DocumentReviews withAction(DocumentReviewAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * A comment entered by a user in your organization about the document review request.
     * </p>
     * 
     * @return A comment entered by a user in your organization about the document review request.
     */

    public java.util.List<DocumentReviewCommentSource> getComment() {
        if (comment == null) {
            comment = new com.amazonaws.internal.SdkInternalList<DocumentReviewCommentSource>();
        }
        return comment;
    }

    /**
     * <p>
     * A comment entered by a user in your organization about the document review request.
     * </p>
     * 
     * @param comment
     *        A comment entered by a user in your organization about the document review request.
     */

    public void setComment(java.util.Collection<DocumentReviewCommentSource> comment) {
        if (comment == null) {
            this.comment = null;
            return;
        }

        this.comment = new com.amazonaws.internal.SdkInternalList<DocumentReviewCommentSource>(comment);
    }

    /**
     * <p>
     * A comment entered by a user in your organization about the document review request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComment(java.util.Collection)} or {@link #withComment(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param comment
     *        A comment entered by a user in your organization about the document review request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentReviews withComment(DocumentReviewCommentSource... comment) {
        if (this.comment == null) {
            setComment(new com.amazonaws.internal.SdkInternalList<DocumentReviewCommentSource>(comment.length));
        }
        for (DocumentReviewCommentSource ele : comment) {
            this.comment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A comment entered by a user in your organization about the document review request.
     * </p>
     * 
     * @param comment
     *        A comment entered by a user in your organization about the document review request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentReviews withComment(java.util.Collection<DocumentReviewCommentSource> comment) {
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
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

        if (obj instanceof DocumentReviews == false)
            return false;
        DocumentReviews other = (DocumentReviews) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
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

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public DocumentReviews clone() {
        try {
            return (DocumentReviews) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.DocumentReviewsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
