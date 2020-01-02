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
 * Specifies the properties of a custom index field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DocumentMetadataConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentMetadataConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the index field.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data type of the index field.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Provides manual tuning parameters to determine how the field affects the search results.
     * </p>
     */
    private Relevance relevance;
    /**
     * <p>
     * Provides information about how the field is used during a search.
     * </p>
     */
    private Search search;

    /**
     * <p>
     * The name of the index field.
     * </p>
     * 
     * @param name
     *        The name of the index field.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the index field.
     * </p>
     * 
     * @return The name of the index field.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the index field.
     * </p>
     * 
     * @param name
     *        The name of the index field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentMetadataConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data type of the index field.
     * </p>
     * 
     * @param type
     *        The data type of the index field.
     * @see DocumentAttributeValueType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the index field.
     * </p>
     * 
     * @return The data type of the index field.
     * @see DocumentAttributeValueType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The data type of the index field.
     * </p>
     * 
     * @param type
     *        The data type of the index field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentAttributeValueType
     */

    public DocumentMetadataConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The data type of the index field.
     * </p>
     * 
     * @param type
     *        The data type of the index field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentAttributeValueType
     */

    public DocumentMetadataConfiguration withType(DocumentAttributeValueType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Provides manual tuning parameters to determine how the field affects the search results.
     * </p>
     * 
     * @param relevance
     *        Provides manual tuning parameters to determine how the field affects the search results.
     */

    public void setRelevance(Relevance relevance) {
        this.relevance = relevance;
    }

    /**
     * <p>
     * Provides manual tuning parameters to determine how the field affects the search results.
     * </p>
     * 
     * @return Provides manual tuning parameters to determine how the field affects the search results.
     */

    public Relevance getRelevance() {
        return this.relevance;
    }

    /**
     * <p>
     * Provides manual tuning parameters to determine how the field affects the search results.
     * </p>
     * 
     * @param relevance
     *        Provides manual tuning parameters to determine how the field affects the search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentMetadataConfiguration withRelevance(Relevance relevance) {
        setRelevance(relevance);
        return this;
    }

    /**
     * <p>
     * Provides information about how the field is used during a search.
     * </p>
     * 
     * @param search
     *        Provides information about how the field is used during a search.
     */

    public void setSearch(Search search) {
        this.search = search;
    }

    /**
     * <p>
     * Provides information about how the field is used during a search.
     * </p>
     * 
     * @return Provides information about how the field is used during a search.
     */

    public Search getSearch() {
        return this.search;
    }

    /**
     * <p>
     * Provides information about how the field is used during a search.
     * </p>
     * 
     * @param search
     *        Provides information about how the field is used during a search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentMetadataConfiguration withSearch(Search search) {
        setSearch(search);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getRelevance() != null)
            sb.append("Relevance: ").append(getRelevance()).append(",");
        if (getSearch() != null)
            sb.append("Search: ").append(getSearch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentMetadataConfiguration == false)
            return false;
        DocumentMetadataConfiguration other = (DocumentMetadataConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getRelevance() == null ^ this.getRelevance() == null)
            return false;
        if (other.getRelevance() != null && other.getRelevance().equals(this.getRelevance()) == false)
            return false;
        if (other.getSearch() == null ^ this.getSearch() == null)
            return false;
        if (other.getSearch() != null && other.getSearch().equals(this.getSearch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getRelevance() == null) ? 0 : getRelevance().hashCode());
        hashCode = prime * hashCode + ((getSearch() == null) ? 0 : getSearch().hashCode());
        return hashCode;
    }

    @Override
    public DocumentMetadataConfiguration clone() {
        try {
            return (DocumentMetadataConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.DocumentMetadataConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
