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
 * A response message that contains the index fields for a search domain.
 * </p>
 */
public class DescribeIndexFieldsResult implements Serializable {

    /**
     * The index fields configured for the domain.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<IndexFieldStatus> indexFields;

    /**
     * The index fields configured for the domain.
     *
     * @return The index fields configured for the domain.
     */
    public java.util.List<IndexFieldStatus> getIndexFields() {
        if (indexFields == null) {
              indexFields = new com.amazonaws.internal.ListWithAutoConstructFlag<IndexFieldStatus>();
              indexFields.setAutoConstruct(true);
        }
        return indexFields;
    }
    
    /**
     * The index fields configured for the domain.
     *
     * @param indexFields The index fields configured for the domain.
     */
    public void setIndexFields(java.util.Collection<IndexFieldStatus> indexFields) {
        if (indexFields == null) {
            this.indexFields = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<IndexFieldStatus> indexFieldsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IndexFieldStatus>(indexFields.size());
        indexFieldsCopy.addAll(indexFields);
        this.indexFields = indexFieldsCopy;
    }
    
    /**
     * The index fields configured for the domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param indexFields The index fields configured for the domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeIndexFieldsResult withIndexFields(IndexFieldStatus... indexFields) {
        if (getIndexFields() == null) setIndexFields(new java.util.ArrayList<IndexFieldStatus>(indexFields.length));
        for (IndexFieldStatus value : indexFields) {
            getIndexFields().add(value);
        }
        return this;
    }
    
    /**
     * The index fields configured for the domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param indexFields The index fields configured for the domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeIndexFieldsResult withIndexFields(java.util.Collection<IndexFieldStatus> indexFields) {
        if (indexFields == null) {
            this.indexFields = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<IndexFieldStatus> indexFieldsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IndexFieldStatus>(indexFields.size());
            indexFieldsCopy.addAll(indexFields);
            this.indexFields = indexFieldsCopy;
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
        if (getIndexFields() != null) sb.append("IndexFields: " + getIndexFields() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIndexFields() == null) ? 0 : getIndexFields().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeIndexFieldsResult == false) return false;
        DescribeIndexFieldsResult other = (DescribeIndexFieldsResult)obj;
        
        if (other.getIndexFields() == null ^ this.getIndexFields() == null) return false;
        if (other.getIndexFields() != null && other.getIndexFields().equals(this.getIndexFields()) == false) return false; 
        return true;
    }
    
}
    