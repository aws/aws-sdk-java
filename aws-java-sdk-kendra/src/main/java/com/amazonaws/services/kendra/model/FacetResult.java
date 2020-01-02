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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The facet values for the documents in the response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/FacetResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FacetResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key for the facet values. This is the same as the <code>DocumentAttributeKey</code> provided in the query.
     * </p>
     */
    private String documentAttributeKey;
    /**
     * <p>
     * An array of key/value pairs, where the key is the value of the attribute and the count is the number of documents
     * that share the key value.
     * </p>
     */
    private java.util.List<DocumentAttributeValueCountPair> documentAttributeValueCountPairs;

    /**
     * <p>
     * The key for the facet values. This is the same as the <code>DocumentAttributeKey</code> provided in the query.
     * </p>
     * 
     * @param documentAttributeKey
     *        The key for the facet values. This is the same as the <code>DocumentAttributeKey</code> provided in the
     *        query.
     */

    public void setDocumentAttributeKey(String documentAttributeKey) {
        this.documentAttributeKey = documentAttributeKey;
    }

    /**
     * <p>
     * The key for the facet values. This is the same as the <code>DocumentAttributeKey</code> provided in the query.
     * </p>
     * 
     * @return The key for the facet values. This is the same as the <code>DocumentAttributeKey</code> provided in the
     *         query.
     */

    public String getDocumentAttributeKey() {
        return this.documentAttributeKey;
    }

    /**
     * <p>
     * The key for the facet values. This is the same as the <code>DocumentAttributeKey</code> provided in the query.
     * </p>
     * 
     * @param documentAttributeKey
     *        The key for the facet values. This is the same as the <code>DocumentAttributeKey</code> provided in the
     *        query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FacetResult withDocumentAttributeKey(String documentAttributeKey) {
        setDocumentAttributeKey(documentAttributeKey);
        return this;
    }

    /**
     * <p>
     * An array of key/value pairs, where the key is the value of the attribute and the count is the number of documents
     * that share the key value.
     * </p>
     * 
     * @return An array of key/value pairs, where the key is the value of the attribute and the count is the number of
     *         documents that share the key value.
     */

    public java.util.List<DocumentAttributeValueCountPair> getDocumentAttributeValueCountPairs() {
        return documentAttributeValueCountPairs;
    }

    /**
     * <p>
     * An array of key/value pairs, where the key is the value of the attribute and the count is the number of documents
     * that share the key value.
     * </p>
     * 
     * @param documentAttributeValueCountPairs
     *        An array of key/value pairs, where the key is the value of the attribute and the count is the number of
     *        documents that share the key value.
     */

    public void setDocumentAttributeValueCountPairs(java.util.Collection<DocumentAttributeValueCountPair> documentAttributeValueCountPairs) {
        if (documentAttributeValueCountPairs == null) {
            this.documentAttributeValueCountPairs = null;
            return;
        }

        this.documentAttributeValueCountPairs = new java.util.ArrayList<DocumentAttributeValueCountPair>(documentAttributeValueCountPairs);
    }

    /**
     * <p>
     * An array of key/value pairs, where the key is the value of the attribute and the count is the number of documents
     * that share the key value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentAttributeValueCountPairs(java.util.Collection)} or
     * {@link #withDocumentAttributeValueCountPairs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param documentAttributeValueCountPairs
     *        An array of key/value pairs, where the key is the value of the attribute and the count is the number of
     *        documents that share the key value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FacetResult withDocumentAttributeValueCountPairs(DocumentAttributeValueCountPair... documentAttributeValueCountPairs) {
        if (this.documentAttributeValueCountPairs == null) {
            setDocumentAttributeValueCountPairs(new java.util.ArrayList<DocumentAttributeValueCountPair>(documentAttributeValueCountPairs.length));
        }
        for (DocumentAttributeValueCountPair ele : documentAttributeValueCountPairs) {
            this.documentAttributeValueCountPairs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key/value pairs, where the key is the value of the attribute and the count is the number of documents
     * that share the key value.
     * </p>
     * 
     * @param documentAttributeValueCountPairs
     *        An array of key/value pairs, where the key is the value of the attribute and the count is the number of
     *        documents that share the key value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FacetResult withDocumentAttributeValueCountPairs(java.util.Collection<DocumentAttributeValueCountPair> documentAttributeValueCountPairs) {
        setDocumentAttributeValueCountPairs(documentAttributeValueCountPairs);
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
        if (getDocumentAttributeKey() != null)
            sb.append("DocumentAttributeKey: ").append(getDocumentAttributeKey()).append(",");
        if (getDocumentAttributeValueCountPairs() != null)
            sb.append("DocumentAttributeValueCountPairs: ").append(getDocumentAttributeValueCountPairs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FacetResult == false)
            return false;
        FacetResult other = (FacetResult) obj;
        if (other.getDocumentAttributeKey() == null ^ this.getDocumentAttributeKey() == null)
            return false;
        if (other.getDocumentAttributeKey() != null && other.getDocumentAttributeKey().equals(this.getDocumentAttributeKey()) == false)
            return false;
        if (other.getDocumentAttributeValueCountPairs() == null ^ this.getDocumentAttributeValueCountPairs() == null)
            return false;
        if (other.getDocumentAttributeValueCountPairs() != null
                && other.getDocumentAttributeValueCountPairs().equals(this.getDocumentAttributeValueCountPairs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentAttributeKey() == null) ? 0 : getDocumentAttributeKey().hashCode());
        hashCode = prime * hashCode + ((getDocumentAttributeValueCountPairs() == null) ? 0 : getDocumentAttributeValueCountPairs().hashCode());
        return hashCode;
    }

    @Override
    public FacetResult clone() {
        try {
            return (FacetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.FacetResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
