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
 * Represents an index and an attached object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/IndexAttachment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IndexAttachment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The indexed attribute values.
     * </p>
     */
    private java.util.List<AttributeKeyAndValue> indexedAttributes;
    /**
     * <p>
     * In response to <a>ListIndex</a>, the <code>ObjectIdentifier</code> of the object attached to the index. In
     * response to <a>ListAttachedIndices</a>, the <code>ObjectIdentifier</code> of the index attached to the object.
     * This field will always contain the <code>ObjectIdentifier</code> of the object on the opposite side of the
     * attachment specified in the query.
     * </p>
     */
    private String objectIdentifier;

    /**
     * <p>
     * The indexed attribute values.
     * </p>
     * 
     * @return The indexed attribute values.
     */

    public java.util.List<AttributeKeyAndValue> getIndexedAttributes() {
        return indexedAttributes;
    }

    /**
     * <p>
     * The indexed attribute values.
     * </p>
     * 
     * @param indexedAttributes
     *        The indexed attribute values.
     */

    public void setIndexedAttributes(java.util.Collection<AttributeKeyAndValue> indexedAttributes) {
        if (indexedAttributes == null) {
            this.indexedAttributes = null;
            return;
        }

        this.indexedAttributes = new java.util.ArrayList<AttributeKeyAndValue>(indexedAttributes);
    }

    /**
     * <p>
     * The indexed attribute values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIndexedAttributes(java.util.Collection)} or {@link #withIndexedAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param indexedAttributes
     *        The indexed attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexAttachment withIndexedAttributes(AttributeKeyAndValue... indexedAttributes) {
        if (this.indexedAttributes == null) {
            setIndexedAttributes(new java.util.ArrayList<AttributeKeyAndValue>(indexedAttributes.length));
        }
        for (AttributeKeyAndValue ele : indexedAttributes) {
            this.indexedAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The indexed attribute values.
     * </p>
     * 
     * @param indexedAttributes
     *        The indexed attribute values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexAttachment withIndexedAttributes(java.util.Collection<AttributeKeyAndValue> indexedAttributes) {
        setIndexedAttributes(indexedAttributes);
        return this;
    }

    /**
     * <p>
     * In response to <a>ListIndex</a>, the <code>ObjectIdentifier</code> of the object attached to the index. In
     * response to <a>ListAttachedIndices</a>, the <code>ObjectIdentifier</code> of the index attached to the object.
     * This field will always contain the <code>ObjectIdentifier</code> of the object on the opposite side of the
     * attachment specified in the query.
     * </p>
     * 
     * @param objectIdentifier
     *        In response to <a>ListIndex</a>, the <code>ObjectIdentifier</code> of the object attached to the index. In
     *        response to <a>ListAttachedIndices</a>, the <code>ObjectIdentifier</code> of the index attached to the
     *        object. This field will always contain the <code>ObjectIdentifier</code> of the object on the opposite
     *        side of the attachment specified in the query.
     */

    public void setObjectIdentifier(String objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }

    /**
     * <p>
     * In response to <a>ListIndex</a>, the <code>ObjectIdentifier</code> of the object attached to the index. In
     * response to <a>ListAttachedIndices</a>, the <code>ObjectIdentifier</code> of the index attached to the object.
     * This field will always contain the <code>ObjectIdentifier</code> of the object on the opposite side of the
     * attachment specified in the query.
     * </p>
     * 
     * @return In response to <a>ListIndex</a>, the <code>ObjectIdentifier</code> of the object attached to the index.
     *         In response to <a>ListAttachedIndices</a>, the <code>ObjectIdentifier</code> of the index attached to the
     *         object. This field will always contain the <code>ObjectIdentifier</code> of the object on the opposite
     *         side of the attachment specified in the query.
     */

    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * <p>
     * In response to <a>ListIndex</a>, the <code>ObjectIdentifier</code> of the object attached to the index. In
     * response to <a>ListAttachedIndices</a>, the <code>ObjectIdentifier</code> of the index attached to the object.
     * This field will always contain the <code>ObjectIdentifier</code> of the object on the opposite side of the
     * attachment specified in the query.
     * </p>
     * 
     * @param objectIdentifier
     *        In response to <a>ListIndex</a>, the <code>ObjectIdentifier</code> of the object attached to the index. In
     *        response to <a>ListAttachedIndices</a>, the <code>ObjectIdentifier</code> of the index attached to the
     *        object. This field will always contain the <code>ObjectIdentifier</code> of the object on the opposite
     *        side of the attachment specified in the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexAttachment withObjectIdentifier(String objectIdentifier) {
        setObjectIdentifier(objectIdentifier);
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
        if (getIndexedAttributes() != null)
            sb.append("IndexedAttributes: ").append(getIndexedAttributes()).append(",");
        if (getObjectIdentifier() != null)
            sb.append("ObjectIdentifier: ").append(getObjectIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IndexAttachment == false)
            return false;
        IndexAttachment other = (IndexAttachment) obj;
        if (other.getIndexedAttributes() == null ^ this.getIndexedAttributes() == null)
            return false;
        if (other.getIndexedAttributes() != null && other.getIndexedAttributes().equals(this.getIndexedAttributes()) == false)
            return false;
        if (other.getObjectIdentifier() == null ^ this.getObjectIdentifier() == null)
            return false;
        if (other.getObjectIdentifier() != null && other.getObjectIdentifier().equals(this.getObjectIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexedAttributes() == null) ? 0 : getIndexedAttributes().hashCode());
        hashCode = prime * hashCode + ((getObjectIdentifier() == null) ? 0 : getObjectIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public IndexAttachment clone() {
        try {
            return (IndexAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.IndexAttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
