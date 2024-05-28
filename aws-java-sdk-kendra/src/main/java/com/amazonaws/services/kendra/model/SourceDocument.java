/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The document ID and its fields/attributes that are used for a query suggestion, if document fields set to use for
 * query suggestions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SourceDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the document used for a query suggestion.
     * </p>
     */
    private String documentId;
    /**
     * <p>
     * The document fields/attributes used for a query suggestion.
     * </p>
     */
    private java.util.List<String> suggestionAttributes;
    /**
     * <p>
     * The additional fields/attributes to include in the response. You can use additional fields to provide extra
     * information in the response. Additional fields are not used to based suggestions on.
     * </p>
     */
    private java.util.List<DocumentAttribute> additionalAttributes;

    /**
     * <p>
     * The identifier of the document used for a query suggestion.
     * </p>
     * 
     * @param documentId
     *        The identifier of the document used for a query suggestion.
     */

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * <p>
     * The identifier of the document used for a query suggestion.
     * </p>
     * 
     * @return The identifier of the document used for a query suggestion.
     */

    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * <p>
     * The identifier of the document used for a query suggestion.
     * </p>
     * 
     * @param documentId
     *        The identifier of the document used for a query suggestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceDocument withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * The document fields/attributes used for a query suggestion.
     * </p>
     * 
     * @return The document fields/attributes used for a query suggestion.
     */

    public java.util.List<String> getSuggestionAttributes() {
        return suggestionAttributes;
    }

    /**
     * <p>
     * The document fields/attributes used for a query suggestion.
     * </p>
     * 
     * @param suggestionAttributes
     *        The document fields/attributes used for a query suggestion.
     */

    public void setSuggestionAttributes(java.util.Collection<String> suggestionAttributes) {
        if (suggestionAttributes == null) {
            this.suggestionAttributes = null;
            return;
        }

        this.suggestionAttributes = new java.util.ArrayList<String>(suggestionAttributes);
    }

    /**
     * <p>
     * The document fields/attributes used for a query suggestion.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuggestionAttributes(java.util.Collection)} or {@link #withSuggestionAttributes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param suggestionAttributes
     *        The document fields/attributes used for a query suggestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceDocument withSuggestionAttributes(String... suggestionAttributes) {
        if (this.suggestionAttributes == null) {
            setSuggestionAttributes(new java.util.ArrayList<String>(suggestionAttributes.length));
        }
        for (String ele : suggestionAttributes) {
            this.suggestionAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The document fields/attributes used for a query suggestion.
     * </p>
     * 
     * @param suggestionAttributes
     *        The document fields/attributes used for a query suggestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceDocument withSuggestionAttributes(java.util.Collection<String> suggestionAttributes) {
        setSuggestionAttributes(suggestionAttributes);
        return this;
    }

    /**
     * <p>
     * The additional fields/attributes to include in the response. You can use additional fields to provide extra
     * information in the response. Additional fields are not used to based suggestions on.
     * </p>
     * 
     * @return The additional fields/attributes to include in the response. You can use additional fields to provide
     *         extra information in the response. Additional fields are not used to based suggestions on.
     */

    public java.util.List<DocumentAttribute> getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * <p>
     * The additional fields/attributes to include in the response. You can use additional fields to provide extra
     * information in the response. Additional fields are not used to based suggestions on.
     * </p>
     * 
     * @param additionalAttributes
     *        The additional fields/attributes to include in the response. You can use additional fields to provide
     *        extra information in the response. Additional fields are not used to based suggestions on.
     */

    public void setAdditionalAttributes(java.util.Collection<DocumentAttribute> additionalAttributes) {
        if (additionalAttributes == null) {
            this.additionalAttributes = null;
            return;
        }

        this.additionalAttributes = new java.util.ArrayList<DocumentAttribute>(additionalAttributes);
    }

    /**
     * <p>
     * The additional fields/attributes to include in the response. You can use additional fields to provide extra
     * information in the response. Additional fields are not used to based suggestions on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalAttributes(java.util.Collection)} or {@link #withAdditionalAttributes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param additionalAttributes
     *        The additional fields/attributes to include in the response. You can use additional fields to provide
     *        extra information in the response. Additional fields are not used to based suggestions on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceDocument withAdditionalAttributes(DocumentAttribute... additionalAttributes) {
        if (this.additionalAttributes == null) {
            setAdditionalAttributes(new java.util.ArrayList<DocumentAttribute>(additionalAttributes.length));
        }
        for (DocumentAttribute ele : additionalAttributes) {
            this.additionalAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The additional fields/attributes to include in the response. You can use additional fields to provide extra
     * information in the response. Additional fields are not used to based suggestions on.
     * </p>
     * 
     * @param additionalAttributes
     *        The additional fields/attributes to include in the response. You can use additional fields to provide
     *        extra information in the response. Additional fields are not used to based suggestions on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceDocument withAdditionalAttributes(java.util.Collection<DocumentAttribute> additionalAttributes) {
        setAdditionalAttributes(additionalAttributes);
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
        if (getDocumentId() != null)
            sb.append("DocumentId: ").append(getDocumentId()).append(",");
        if (getSuggestionAttributes() != null)
            sb.append("SuggestionAttributes: ").append(getSuggestionAttributes()).append(",");
        if (getAdditionalAttributes() != null)
            sb.append("AdditionalAttributes: ").append(getAdditionalAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceDocument == false)
            return false;
        SourceDocument other = (SourceDocument) obj;
        if (other.getDocumentId() == null ^ this.getDocumentId() == null)
            return false;
        if (other.getDocumentId() != null && other.getDocumentId().equals(this.getDocumentId()) == false)
            return false;
        if (other.getSuggestionAttributes() == null ^ this.getSuggestionAttributes() == null)
            return false;
        if (other.getSuggestionAttributes() != null && other.getSuggestionAttributes().equals(this.getSuggestionAttributes()) == false)
            return false;
        if (other.getAdditionalAttributes() == null ^ this.getAdditionalAttributes() == null)
            return false;
        if (other.getAdditionalAttributes() != null && other.getAdditionalAttributes().equals(this.getAdditionalAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        hashCode = prime * hashCode + ((getSuggestionAttributes() == null) ? 0 : getSuggestionAttributes().hashCode());
        hashCode = prime * hashCode + ((getAdditionalAttributes() == null) ? 0 : getAdditionalAttributes().hashCode());
        return hashCode;
    }

    @Override
    public SourceDocument clone() {
        try {
            return (SourceDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SourceDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
