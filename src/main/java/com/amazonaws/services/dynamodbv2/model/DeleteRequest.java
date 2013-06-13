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
package com.amazonaws.services.dynamodbv2.model;
import java.io.Serializable;

/**
 * <p>
 * Represents a request to perform a <i>DeleteItem</i> operation on an item.
 * </p>
 */
public class DeleteRequest  implements Serializable  {

    /**
     * A map of attribute name to attribute values, representing the primary
     * key of the item to delete. All of the table's primary key attributes
     * must be specified, and their data types must match those of the
     * table's key schema.
     */
    private java.util.Map<String,AttributeValue> key;

    /**
     * A map of attribute name to attribute values, representing the primary
     * key of the item to delete. All of the table's primary key attributes
     * must be specified, and their data types must match those of the
     * table's key schema.
     *
     * @return A map of attribute name to attribute values, representing the primary
     *         key of the item to delete. All of the table's primary key attributes
     *         must be specified, and their data types must match those of the
     *         table's key schema.
     */
    public java.util.Map<String,AttributeValue> getKey() {
        
        return key;

    }
    
    /**
     * A map of attribute name to attribute values, representing the primary
     * key of the item to delete. All of the table's primary key attributes
     * must be specified, and their data types must match those of the
     * table's key schema.
     *
     * @param key A map of attribute name to attribute values, representing the primary
     *         key of the item to delete. All of the table's primary key attributes
     *         must be specified, and their data types must match those of the
     *         table's key schema.
     */
    public void setKey(java.util.Map<String,AttributeValue> key) {
        this.key = key;
    }
    
    /**
     * A map of attribute name to attribute values, representing the primary
     * key of the item to delete. All of the table's primary key attributes
     * must be specified, and their data types must match those of the
     * table's key schema.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key A map of attribute name to attribute values, representing the primary
     *         key of the item to delete. All of the table's primary key attributes
     *         must be specified, and their data types must match those of the
     *         table's key schema.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteRequest withKey(java.util.Map<String,AttributeValue> key) {
        setKey(key);
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
        if (getKey() != null) sb.append("Key: " + getKey() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteRequest == false) return false;
        DeleteRequest other = (DeleteRequest)obj;
        
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        return true;
    }
    
}
    