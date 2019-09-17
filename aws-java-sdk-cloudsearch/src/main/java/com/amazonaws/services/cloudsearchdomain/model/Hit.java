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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a document that matches the search request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Hit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The document ID of a document that matches the search request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The fields returned from a document that matches the search request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, java.util.List<String>> fields;
    /**
     * <p>
     * The expressions returned from a document that matches the search request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> exprs;
    /**
     * <p>
     * The highlights returned from a document that matches the search request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> highlights;

    /**
     * <p>
     * The document ID of a document that matches the search request.
     * </p>
     * 
     * @param id
     *        The document ID of a document that matches the search request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The document ID of a document that matches the search request.
     * </p>
     * 
     * @return The document ID of a document that matches the search request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The document ID of a document that matches the search request.
     * </p>
     * 
     * @param id
     *        The document ID of a document that matches the search request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hit withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The fields returned from a document that matches the search request.
     * </p>
     * 
     * @return The fields returned from a document that matches the search request.
     */

    public java.util.Map<String, java.util.List<String>> getFields() {
        if (fields == null) {
            fields = new com.amazonaws.internal.SdkInternalMap<String, java.util.List<String>>();
        }
        return fields;
    }

    /**
     * <p>
     * The fields returned from a document that matches the search request.
     * </p>
     * 
     * @param fields
     *        The fields returned from a document that matches the search request.
     */

    public void setFields(java.util.Map<String, java.util.List<String>> fields) {
        this.fields = fields == null ? null : new com.amazonaws.internal.SdkInternalMap<String, java.util.List<String>>(fields);
    }

    /**
     * <p>
     * The fields returned from a document that matches the search request.
     * </p>
     * 
     * @param fields
     *        The fields returned from a document that matches the search request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hit withFields(java.util.Map<String, java.util.List<String>> fields) {
        setFields(fields);
        return this;
    }

    public Hit addFieldsEntry(String key, java.util.List<String> value) {
        if (null == this.fields) {
            this.fields = new com.amazonaws.internal.SdkInternalMap<String, java.util.List<String>>();
        }
        if (this.fields.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.fields.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Fields.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hit clearFieldsEntries() {
        this.fields = null;
        return this;
    }

    /**
     * <p>
     * The expressions returned from a document that matches the search request.
     * </p>
     * 
     * @return The expressions returned from a document that matches the search request.
     */

    public java.util.Map<String, String> getExprs() {
        if (exprs == null) {
            exprs = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return exprs;
    }

    /**
     * <p>
     * The expressions returned from a document that matches the search request.
     * </p>
     * 
     * @param exprs
     *        The expressions returned from a document that matches the search request.
     */

    public void setExprs(java.util.Map<String, String> exprs) {
        this.exprs = exprs == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(exprs);
    }

    /**
     * <p>
     * The expressions returned from a document that matches the search request.
     * </p>
     * 
     * @param exprs
     *        The expressions returned from a document that matches the search request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hit withExprs(java.util.Map<String, String> exprs) {
        setExprs(exprs);
        return this;
    }

    public Hit addExprsEntry(String key, String value) {
        if (null == this.exprs) {
            this.exprs = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.exprs.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.exprs.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Exprs.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hit clearExprsEntries() {
        this.exprs = null;
        return this;
    }

    /**
     * <p>
     * The highlights returned from a document that matches the search request.
     * </p>
     * 
     * @return The highlights returned from a document that matches the search request.
     */

    public java.util.Map<String, String> getHighlights() {
        if (highlights == null) {
            highlights = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return highlights;
    }

    /**
     * <p>
     * The highlights returned from a document that matches the search request.
     * </p>
     * 
     * @param highlights
     *        The highlights returned from a document that matches the search request.
     */

    public void setHighlights(java.util.Map<String, String> highlights) {
        this.highlights = highlights == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(highlights);
    }

    /**
     * <p>
     * The highlights returned from a document that matches the search request.
     * </p>
     * 
     * @param highlights
     *        The highlights returned from a document that matches the search request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hit withHighlights(java.util.Map<String, String> highlights) {
        setHighlights(highlights);
        return this;
    }

    public Hit addHighlightsEntry(String key, String value) {
        if (null == this.highlights) {
            this.highlights = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.highlights.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.highlights.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Highlights.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hit clearHighlightsEntries() {
        this.highlights = null;
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
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getExprs() != null)
            sb.append("Exprs: ").append(getExprs()).append(",");
        if (getHighlights() != null)
            sb.append("Highlights: ").append(getHighlights());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Hit == false)
            return false;
        Hit other = (Hit) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getExprs() == null ^ this.getExprs() == null)
            return false;
        if (other.getExprs() != null && other.getExprs().equals(this.getExprs()) == false)
            return false;
        if (other.getHighlights() == null ^ this.getHighlights() == null)
            return false;
        if (other.getHighlights() != null && other.getHighlights().equals(this.getHighlights()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getExprs() == null) ? 0 : getExprs().hashCode());
        hashCode = prime * hashCode + ((getHighlights() == null) ? 0 : getHighlights().hashCode());
        return hashCode;
    }

    @Override
    public Hit clone() {
        try {
            return (Hit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudsearchdomain.model.transform.HitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
