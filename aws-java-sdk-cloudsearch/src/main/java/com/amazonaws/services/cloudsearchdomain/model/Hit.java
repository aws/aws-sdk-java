/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a document that matches the search request.
 * </p>
 */
public class Hit implements Serializable {

    /**
     * The document ID of a document that matches the search request.
     */
    private String id;

    /**
     * The fields returned from a document that matches the search request.
     */
    private java.util.Map<String,java.util.List<String>> fields;

    /**
     * The highlights returned from a document that matches the search
     * request.
     */
    private java.util.Map<String,String> highlights;

    /**
     * The document ID of a document that matches the search request.
     *
     * @return The document ID of a document that matches the search request.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The document ID of a document that matches the search request.
     *
     * @param id The document ID of a document that matches the search request.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The document ID of a document that matches the search request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The document ID of a document that matches the search request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Hit withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The fields returned from a document that matches the search request.
     *
     * @return The fields returned from a document that matches the search request.
     */
    public java.util.Map<String,java.util.List<String>> getFields() {
        
        if (fields == null) {
            fields = new java.util.HashMap<String,java.util.List<String>>();
        }
        return fields;
    }
    
    /**
     * The fields returned from a document that matches the search request.
     *
     * @param fields The fields returned from a document that matches the search request.
     */
    public void setFields(java.util.Map<String,java.util.List<String>> fields) {
        this.fields = fields;
    }
    
    /**
     * The fields returned from a document that matches the search request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fields The fields returned from a document that matches the search request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Hit withFields(java.util.Map<String,java.util.List<String>> fields) {
        setFields(fields);
        return this;
    }

    /**
     * The fields returned from a document that matches the search request.
     * <p>
     * The method adds a new key-value pair into Fields parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Fields.
     * @param value The corresponding value of the entry to be added into Fields.
     */
    public Hit addFieldsEntry(String key, java.util.List<String> value) {
        if (null == this.fields) {
            this.fields = new java.util.HashMap<String,java.util.List<String>>();
        }
        if (this.fields.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.fields.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Fields.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public Hit clearFieldsEntries() {
        this.fields = null;
        return this;
    }
    
    /**
     * The highlights returned from a document that matches the search
     * request.
     *
     * @return The highlights returned from a document that matches the search
     *         request.
     */
    public java.util.Map<String,String> getHighlights() {
        
        if (highlights == null) {
            highlights = new java.util.HashMap<String,String>();
        }
        return highlights;
    }
    
    /**
     * The highlights returned from a document that matches the search
     * request.
     *
     * @param highlights The highlights returned from a document that matches the search
     *         request.
     */
    public void setHighlights(java.util.Map<String,String> highlights) {
        this.highlights = highlights;
    }
    
    /**
     * The highlights returned from a document that matches the search
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param highlights The highlights returned from a document that matches the search
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Hit withHighlights(java.util.Map<String,String> highlights) {
        setHighlights(highlights);
        return this;
    }

    /**
     * The highlights returned from a document that matches the search
     * request.
     * <p>
     * The method adds a new key-value pair into Highlights parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Highlights.
     * @param value The corresponding value of the entry to be added into Highlights.
     */
    public Hit addHighlightsEntry(String key, String value) {
        if (null == this.highlights) {
            this.highlights = new java.util.HashMap<String,String>();
        }
        if (this.highlights.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.highlights.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Highlights.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public Hit clearHighlightsEntries() {
        this.highlights = null;
        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getFields() != null) sb.append("Fields: " + getFields() + ",");
        if (getHighlights() != null) sb.append("Highlights: " + getHighlights() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode()); 
        hashCode = prime * hashCode + ((getHighlights() == null) ? 0 : getHighlights().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Hit == false) return false;
        Hit other = (Hit)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getFields() == null ^ this.getFields() == null) return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false) return false; 
        if (other.getHighlights() == null ^ this.getHighlights() == null) return false;
        if (other.getHighlights() != null && other.getHighlights().equals(this.getHighlights()) == false) return false; 
        return true;
    }
    
}
    