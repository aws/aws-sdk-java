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
 * A single query suggestion.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Suggestion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Suggestion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The UUID (universally unique identifier) of a single query suggestion.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The value for the UUID (universally unique identifier) of a single query suggestion.
     * </p>
     * <p>
     * The value is the text string of a suggestion.
     * </p>
     */
    private SuggestionValue value;
    /**
     * <p>
     * The list of document IDs and their fields/attributes that are used for a single query suggestion, if document
     * fields set to use for query suggestions.
     * </p>
     */
    private java.util.List<SourceDocument> sourceDocuments;

    /**
     * <p>
     * The UUID (universally unique identifier) of a single query suggestion.
     * </p>
     * 
     * @param id
     *        The UUID (universally unique identifier) of a single query suggestion.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The UUID (universally unique identifier) of a single query suggestion.
     * </p>
     * 
     * @return The UUID (universally unique identifier) of a single query suggestion.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The UUID (universally unique identifier) of a single query suggestion.
     * </p>
     * 
     * @param id
     *        The UUID (universally unique identifier) of a single query suggestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suggestion withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The value for the UUID (universally unique identifier) of a single query suggestion.
     * </p>
     * <p>
     * The value is the text string of a suggestion.
     * </p>
     * 
     * @param value
     *        The value for the UUID (universally unique identifier) of a single query suggestion.</p>
     *        <p>
     *        The value is the text string of a suggestion.
     */

    public void setValue(SuggestionValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the UUID (universally unique identifier) of a single query suggestion.
     * </p>
     * <p>
     * The value is the text string of a suggestion.
     * </p>
     * 
     * @return The value for the UUID (universally unique identifier) of a single query suggestion.</p>
     *         <p>
     *         The value is the text string of a suggestion.
     */

    public SuggestionValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the UUID (universally unique identifier) of a single query suggestion.
     * </p>
     * <p>
     * The value is the text string of a suggestion.
     * </p>
     * 
     * @param value
     *        The value for the UUID (universally unique identifier) of a single query suggestion.</p>
     *        <p>
     *        The value is the text string of a suggestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suggestion withValue(SuggestionValue value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The list of document IDs and their fields/attributes that are used for a single query suggestion, if document
     * fields set to use for query suggestions.
     * </p>
     * 
     * @return The list of document IDs and their fields/attributes that are used for a single query suggestion, if
     *         document fields set to use for query suggestions.
     */

    public java.util.List<SourceDocument> getSourceDocuments() {
        return sourceDocuments;
    }

    /**
     * <p>
     * The list of document IDs and their fields/attributes that are used for a single query suggestion, if document
     * fields set to use for query suggestions.
     * </p>
     * 
     * @param sourceDocuments
     *        The list of document IDs and their fields/attributes that are used for a single query suggestion, if
     *        document fields set to use for query suggestions.
     */

    public void setSourceDocuments(java.util.Collection<SourceDocument> sourceDocuments) {
        if (sourceDocuments == null) {
            this.sourceDocuments = null;
            return;
        }

        this.sourceDocuments = new java.util.ArrayList<SourceDocument>(sourceDocuments);
    }

    /**
     * <p>
     * The list of document IDs and their fields/attributes that are used for a single query suggestion, if document
     * fields set to use for query suggestions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceDocuments(java.util.Collection)} or {@link #withSourceDocuments(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sourceDocuments
     *        The list of document IDs and their fields/attributes that are used for a single query suggestion, if
     *        document fields set to use for query suggestions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suggestion withSourceDocuments(SourceDocument... sourceDocuments) {
        if (this.sourceDocuments == null) {
            setSourceDocuments(new java.util.ArrayList<SourceDocument>(sourceDocuments.length));
        }
        for (SourceDocument ele : sourceDocuments) {
            this.sourceDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of document IDs and their fields/attributes that are used for a single query suggestion, if document
     * fields set to use for query suggestions.
     * </p>
     * 
     * @param sourceDocuments
     *        The list of document IDs and their fields/attributes that are used for a single query suggestion, if
     *        document fields set to use for query suggestions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Suggestion withSourceDocuments(java.util.Collection<SourceDocument> sourceDocuments) {
        setSourceDocuments(sourceDocuments);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getSourceDocuments() != null)
            sb.append("SourceDocuments: ").append(getSourceDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Suggestion == false)
            return false;
        Suggestion other = (Suggestion) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getSourceDocuments() == null ^ this.getSourceDocuments() == null)
            return false;
        if (other.getSourceDocuments() != null && other.getSourceDocuments().equals(this.getSourceDocuments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getSourceDocuments() == null) ? 0 : getSourceDocuments().hashCode());
        return hashCode;
    }

    @Override
    public Suggestion clone() {
        try {
            return (Suggestion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SuggestionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
