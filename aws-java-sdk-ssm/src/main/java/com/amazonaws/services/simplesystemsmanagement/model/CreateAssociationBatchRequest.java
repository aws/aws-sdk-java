/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement#createAssociationBatch(CreateAssociationBatchRequest) CreateAssociationBatch operation}.
 * <p>
 * Associates the specified configuration documents with the specified
 * instances.
 * </p>
 * <p>
 * When you associate a configuration document with an instance, the
 * configuration agent on the instance processes the configuration
 * document and configures the instance as specified.
 * </p>
 * <p>
 * If you associate a configuration document with an instance that
 * already has an associated configuration document, we replace the
 * current configuration document with the new configuration document.
 * </p>
 *
 * @see com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement#createAssociationBatch(CreateAssociationBatchRequest)
 */
public class CreateAssociationBatchRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * One or more associations.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CreateAssociationBatchRequestEntry> entries;

    /**
     * One or more associations.
     *
     * @return One or more associations.
     */
    public java.util.List<CreateAssociationBatchRequestEntry> getEntries() {
        if (entries == null) {
              entries = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateAssociationBatchRequestEntry>();
              entries.setAutoConstruct(true);
        }
        return entries;
    }
    
    /**
     * One or more associations.
     *
     * @param entries One or more associations.
     */
    public void setEntries(java.util.Collection<CreateAssociationBatchRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CreateAssociationBatchRequestEntry> entriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateAssociationBatchRequestEntry>(entries.size());
        entriesCopy.addAll(entries);
        this.entries = entriesCopy;
    }
    
    /**
     * One or more associations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries One or more associations.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAssociationBatchRequest withEntries(CreateAssociationBatchRequestEntry... entries) {
        if (getEntries() == null) setEntries(new java.util.ArrayList<CreateAssociationBatchRequestEntry>(entries.length));
        for (CreateAssociationBatchRequestEntry value : entries) {
            getEntries().add(value);
        }
        return this;
    }
    
    /**
     * One or more associations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entries One or more associations.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAssociationBatchRequest withEntries(java.util.Collection<CreateAssociationBatchRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CreateAssociationBatchRequestEntry> entriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CreateAssociationBatchRequestEntry>(entries.size());
            entriesCopy.addAll(entries);
            this.entries = entriesCopy;
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
        if (getEntries() != null) sb.append("Entries: " + getEntries() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateAssociationBatchRequest == false) return false;
        CreateAssociationBatchRequest other = (CreateAssociationBatchRequest)obj;
        
        if (other.getEntries() == null ^ this.getEntries() == null) return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateAssociationBatchRequest clone() {
        
            return (CreateAssociationBatchRequest) super.clone();
    }

}
    