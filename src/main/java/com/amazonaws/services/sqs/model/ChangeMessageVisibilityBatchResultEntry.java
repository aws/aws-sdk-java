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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;


/**
 * <p>
 * Encloses the id of an entry in ChangeMessageVisibilityBatch.
 * </p>
 */
public class ChangeMessageVisibilityBatchResultEntry implements Serializable {

    /**
     * Represents a message whose visibility timeout has been changed
     * successfully.
     */
    private String id;

    /**
     * Represents a message whose visibility timeout has been changed
     * successfully.
     *
     * @return Represents a message whose visibility timeout has been changed
     *         successfully.
     */
    public String getId() {
        return id;
    }
    
    /**
     * Represents a message whose visibility timeout has been changed
     * successfully.
     *
     * @param id Represents a message whose visibility timeout has been changed
     *         successfully.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Represents a message whose visibility timeout has been changed
     * successfully.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id Represents a message whose visibility timeout has been changed
     *         successfully.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChangeMessageVisibilityBatchResultEntry withId(String id) {
        this.id = id;
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
        if (getId() != null) sb.append("Id: " + getId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChangeMessageVisibilityBatchResultEntry == false) return false;
        ChangeMessageVisibilityBatchResultEntry other = (ChangeMessageVisibilityBatchResultEntry)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        return true;
    }
    
}
    