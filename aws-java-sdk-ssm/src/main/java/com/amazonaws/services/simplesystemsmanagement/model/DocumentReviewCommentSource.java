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
 * Information about comments added to a document review request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DocumentReviewCommentSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentReviewCommentSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of information added to a review request. Currently, only the value <code>Comment</code> is supported.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The content of a comment entered by a user who requests a review of a new document version, or who reviews the
     * new version.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The type of information added to a review request. Currently, only the value <code>Comment</code> is supported.
     * </p>
     * 
     * @param type
     *        The type of information added to a review request. Currently, only the value <code>Comment</code> is
     *        supported.
     * @see DocumentReviewCommentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of information added to a review request. Currently, only the value <code>Comment</code> is supported.
     * </p>
     * 
     * @return The type of information added to a review request. Currently, only the value <code>Comment</code> is
     *         supported.
     * @see DocumentReviewCommentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of information added to a review request. Currently, only the value <code>Comment</code> is supported.
     * </p>
     * 
     * @param type
     *        The type of information added to a review request. Currently, only the value <code>Comment</code> is
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReviewCommentType
     */

    public DocumentReviewCommentSource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of information added to a review request. Currently, only the value <code>Comment</code> is supported.
     * </p>
     * 
     * @param type
     *        The type of information added to a review request. Currently, only the value <code>Comment</code> is
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReviewCommentType
     */

    public DocumentReviewCommentSource withType(DocumentReviewCommentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The content of a comment entered by a user who requests a review of a new document version, or who reviews the
     * new version.
     * </p>
     * 
     * @param content
     *        The content of a comment entered by a user who requests a review of a new document version, or who reviews
     *        the new version.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of a comment entered by a user who requests a review of a new document version, or who reviews the
     * new version.
     * </p>
     * 
     * @return The content of a comment entered by a user who requests a review of a new document version, or who
     *         reviews the new version.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of a comment entered by a user who requests a review of a new document version, or who reviews the
     * new version.
     * </p>
     * 
     * @param content
     *        The content of a comment entered by a user who requests a review of a new document version, or who reviews
     *        the new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentReviewCommentSource withContent(String content) {
        setContent(content);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentReviewCommentSource == false)
            return false;
        DocumentReviewCommentSource other = (DocumentReviewCommentSource) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public DocumentReviewCommentSource clone() {
        try {
            return (DocumentReviewCommentSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.DocumentReviewCommentSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
