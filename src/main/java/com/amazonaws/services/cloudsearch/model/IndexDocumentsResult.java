/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;


/**
 * <p>
 * The result of an <code>IndexDocuments</code> action.
 * </p>
 */
public class IndexDocumentsResult implements Serializable {

    /**
     * The names of the fields that are currently being processed due to an
     * <code>IndexDocuments</code> action.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> fieldNames;

    /**
     * The names of the fields that are currently being processed due to an
     * <code>IndexDocuments</code> action.
     *
     * @return The names of the fields that are currently being processed due to an
     *         <code>IndexDocuments</code> action.
     */
    public java.util.List<String> getFieldNames() {
        if (fieldNames == null) {
              fieldNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              fieldNames.setAutoConstruct(true);
        }
        return fieldNames;
    }
    
    /**
     * The names of the fields that are currently being processed due to an
     * <code>IndexDocuments</code> action.
     *
     * @param fieldNames The names of the fields that are currently being processed due to an
     *         <code>IndexDocuments</code> action.
     */
    public void setFieldNames(java.util.Collection<String> fieldNames) {
        if (fieldNames == null) {
            this.fieldNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> fieldNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(fieldNames.size());
        fieldNamesCopy.addAll(fieldNames);
        this.fieldNames = fieldNamesCopy;
    }
    
    /**
     * The names of the fields that are currently being processed due to an
     * <code>IndexDocuments</code> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fieldNames The names of the fields that are currently being processed due to an
     *         <code>IndexDocuments</code> action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IndexDocumentsResult withFieldNames(String... fieldNames) {
        if (getFieldNames() == null) setFieldNames(new java.util.ArrayList<String>(fieldNames.length));
        for (String value : fieldNames) {
            getFieldNames().add(value);
        }
        return this;
    }
    
    /**
     * The names of the fields that are currently being processed due to an
     * <code>IndexDocuments</code> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fieldNames The names of the fields that are currently being processed due to an
     *         <code>IndexDocuments</code> action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IndexDocumentsResult withFieldNames(java.util.Collection<String> fieldNames) {
        if (fieldNames == null) {
            this.fieldNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> fieldNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(fieldNames.size());
            fieldNamesCopy.addAll(fieldNames);
            this.fieldNames = fieldNamesCopy;
        }

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
        if (getFieldNames() != null) sb.append("FieldNames: " + getFieldNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFieldNames() == null) ? 0 : getFieldNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IndexDocumentsResult == false) return false;
        IndexDocumentsResult other = (IndexDocumentsResult)obj;
        
        if (other.getFieldNames() == null ^ this.getFieldNames() == null) return false;
        if (other.getFieldNames() != null && other.getFieldNames().equals(this.getFieldNames()) == false) return false; 
        return true;
    }
    
}
    