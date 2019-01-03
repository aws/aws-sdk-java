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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a <a>ListAttachedIndices</a> response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchListAttachedIndicesResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchListAttachedIndicesResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The indices attached to the specified object.
     * </p>
     */
    private java.util.List<IndexAttachment> indexAttachments;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The indices attached to the specified object.
     * </p>
     * 
     * @return The indices attached to the specified object.
     */

    public java.util.List<IndexAttachment> getIndexAttachments() {
        return indexAttachments;
    }

    /**
     * <p>
     * The indices attached to the specified object.
     * </p>
     * 
     * @param indexAttachments
     *        The indices attached to the specified object.
     */

    public void setIndexAttachments(java.util.Collection<IndexAttachment> indexAttachments) {
        if (indexAttachments == null) {
            this.indexAttachments = null;
            return;
        }

        this.indexAttachments = new java.util.ArrayList<IndexAttachment>(indexAttachments);
    }

    /**
     * <p>
     * The indices attached to the specified object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIndexAttachments(java.util.Collection)} or {@link #withIndexAttachments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param indexAttachments
     *        The indices attached to the specified object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListAttachedIndicesResponse withIndexAttachments(IndexAttachment... indexAttachments) {
        if (this.indexAttachments == null) {
            setIndexAttachments(new java.util.ArrayList<IndexAttachment>(indexAttachments.length));
        }
        for (IndexAttachment ele : indexAttachments) {
            this.indexAttachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The indices attached to the specified object.
     * </p>
     * 
     * @param indexAttachments
     *        The indices attached to the specified object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListAttachedIndicesResponse withIndexAttachments(java.util.Collection<IndexAttachment> indexAttachments) {
        setIndexAttachments(indexAttachments);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListAttachedIndicesResponse withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getIndexAttachments() != null)
            sb.append("IndexAttachments: ").append(getIndexAttachments()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchListAttachedIndicesResponse == false)
            return false;
        BatchListAttachedIndicesResponse other = (BatchListAttachedIndicesResponse) obj;
        if (other.getIndexAttachments() == null ^ this.getIndexAttachments() == null)
            return false;
        if (other.getIndexAttachments() != null && other.getIndexAttachments().equals(this.getIndexAttachments()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexAttachments() == null) ? 0 : getIndexAttachments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchListAttachedIndicesResponse clone() {
        try {
            return (BatchListAttachedIndicesResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchListAttachedIndicesResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
