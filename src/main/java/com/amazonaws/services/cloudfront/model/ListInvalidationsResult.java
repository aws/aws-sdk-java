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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;


/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 */
public class ListInvalidationsResult implements Serializable {

    /**
     * Information about invalidation batches.
     */
    private InvalidationList invalidationList;

    /**
     * Information about invalidation batches.
     *
     * @return Information about invalidation batches.
     */
    public InvalidationList getInvalidationList() {
        return invalidationList;
    }
    
    /**
     * Information about invalidation batches.
     *
     * @param invalidationList Information about invalidation batches.
     */
    public void setInvalidationList(InvalidationList invalidationList) {
        this.invalidationList = invalidationList;
    }
    
    /**
     * Information about invalidation batches.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param invalidationList Information about invalidation batches.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListInvalidationsResult withInvalidationList(InvalidationList invalidationList) {
        this.invalidationList = invalidationList;
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
        if (getInvalidationList() != null) sb.append("InvalidationList: " + getInvalidationList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInvalidationList() == null) ? 0 : getInvalidationList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListInvalidationsResult == false) return false;
        ListInvalidationsResult other = (ListInvalidationsResult)obj;
        
        if (other.getInvalidationList() == null ^ this.getInvalidationList() == null) return false;
        if (other.getInvalidationList() != null && other.getInvalidationList().equals(this.getInvalidationList()) == false) return false; 
        return true;
    }
    
}
    