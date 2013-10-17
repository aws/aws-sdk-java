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
 * Represents a set of primary keys and, for each key, the attributes to retrieve from the table.
 * </p>
 */
public class KeysAndAttributes implements Serializable {

    /**
     * Represents the primary key attribute values that define the items and
     * the attributes associated with the items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<java.util.Map<String,AttributeValue>> keys;

    /**
     * Represents one or more attributes to retrieve from the table or index.
     * If no attribute names are specified then all attributes will be
     * returned. If any of the specified attributes are not found, they will
     * not appear in the result. <p>If you are querying an index and request
     * only attributes that are projected into that index, the operation will
     * read only the index and not the table. If any of the requested
     * attributes are not projected into the index, Amazon DynamoDB will need
     * to fetch each matching item from the table. This extra fetching incurs
     * additional throughput cost and latency.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGet;

    /**
     * Represents the consistency of a read operation. If set to
     * <code>true</code>, then a strongly consistent read is used; otherwise,
     * an eventually consistent read is used.
     */
    private Boolean consistentRead;

    /**
     * Represents the primary key attribute values that define the items and
     * the attributes associated with the items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return Represents the primary key attribute values that define the items and
     *         the attributes associated with the items.
     */
    public java.util.List<java.util.Map<String,AttributeValue>> getKeys() {
        return keys;
    }
    
    /**
     * Represents the primary key attribute values that define the items and
     * the attributes associated with the items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param keys Represents the primary key attribute values that define the items and
     *         the attributes associated with the items.
     */
    public void setKeys(java.util.Collection<java.util.Map<String,AttributeValue>> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<java.util.Map<String,AttributeValue>> keysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<java.util.Map<String,AttributeValue>>(keys.size());
        keysCopy.addAll(keys);
        this.keys = keysCopy;
    }
    
    /**
     * Represents the primary key attribute values that define the items and
     * the attributes associated with the items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param keys Represents the primary key attribute values that define the items and
     *         the attributes associated with the items.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public KeysAndAttributes withKeys(java.util.Map<String,AttributeValue>... keys) {
        if (getKeys() == null) setKeys(new java.util.ArrayList<java.util.Map<String,AttributeValue>>(keys.length));
        for (java.util.Map<String,AttributeValue> value : keys) {
            getKeys().add(value);
        }
        return this;
    }
    
    /**
     * Represents the primary key attribute values that define the items and
     * the attributes associated with the items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param keys Represents the primary key attribute values that define the items and
     *         the attributes associated with the items.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public KeysAndAttributes withKeys(java.util.Collection<java.util.Map<String,AttributeValue>> keys) {
        if (keys == null) {
            this.keys = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<java.util.Map<String,AttributeValue>> keysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<java.util.Map<String,AttributeValue>>(keys.size());
            keysCopy.addAll(keys);
            this.keys = keysCopy;
        }

        return this;
    }

    /**
     * Represents one or more attributes to retrieve from the table or index.
     * If no attribute names are specified then all attributes will be
     * returned. If any of the specified attributes are not found, they will
     * not appear in the result. <p>If you are querying an index and request
     * only attributes that are projected into that index, the operation will
     * read only the index and not the table. If any of the requested
     * attributes are not projected into the index, Amazon DynamoDB will need
     * to fetch each matching item from the table. This extra fetching incurs
     * additional throughput cost and latency.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Represents one or more attributes to retrieve from the table or index.
     *         If no attribute names are specified then all attributes will be
     *         returned. If any of the specified attributes are not found, they will
     *         not appear in the result. <p>If you are querying an index and request
     *         only attributes that are projected into that index, the operation will
     *         read only the index and not the table. If any of the requested
     *         attributes are not projected into the index, Amazon DynamoDB will need
     *         to fetch each matching item from the table. This extra fetching incurs
     *         additional throughput cost and latency.
     */
    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }
    
    /**
     * Represents one or more attributes to retrieve from the table or index.
     * If no attribute names are specified then all attributes will be
     * returned. If any of the specified attributes are not found, they will
     * not appear in the result. <p>If you are querying an index and request
     * only attributes that are projected into that index, the operation will
     * read only the index and not the table. If any of the requested
     * attributes are not projected into the index, Amazon DynamoDB will need
     * to fetch each matching item from the table. This extra fetching incurs
     * additional throughput cost and latency.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet Represents one or more attributes to retrieve from the table or index.
     *         If no attribute names are specified then all attributes will be
     *         returned. If any of the specified attributes are not found, they will
     *         not appear in the result. <p>If you are querying an index and request
     *         only attributes that are projected into that index, the operation will
     *         read only the index and not the table. If any of the requested
     *         attributes are not projected into the index, Amazon DynamoDB will need
     *         to fetch each matching item from the table. This extra fetching incurs
     *         additional throughput cost and latency.
     */
    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(attributesToGet.size());
        attributesToGetCopy.addAll(attributesToGet);
        this.attributesToGet = attributesToGetCopy;
    }
    
    /**
     * Represents one or more attributes to retrieve from the table or index.
     * If no attribute names are specified then all attributes will be
     * returned. If any of the specified attributes are not found, they will
     * not appear in the result. <p>If you are querying an index and request
     * only attributes that are projected into that index, the operation will
     * read only the index and not the table. If any of the requested
     * attributes are not projected into the index, Amazon DynamoDB will need
     * to fetch each matching item from the table. This extra fetching incurs
     * additional throughput cost and latency.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet Represents one or more attributes to retrieve from the table or index.
     *         If no attribute names are specified then all attributes will be
     *         returned. If any of the specified attributes are not found, they will
     *         not appear in the result. <p>If you are querying an index and request
     *         only attributes that are projected into that index, the operation will
     *         read only the index and not the table. If any of the requested
     *         attributes are not projected into the index, Amazon DynamoDB will need
     *         to fetch each matching item from the table. This extra fetching incurs
     *         additional throughput cost and latency.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public KeysAndAttributes withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        for (String value : attributesToGet) {
            getAttributesToGet().add(value);
        }
        return this;
    }
    
    /**
     * Represents one or more attributes to retrieve from the table or index.
     * If no attribute names are specified then all attributes will be
     * returned. If any of the specified attributes are not found, they will
     * not appear in the result. <p>If you are querying an index and request
     * only attributes that are projected into that index, the operation will
     * read only the index and not the table. If any of the requested
     * attributes are not projected into the index, Amazon DynamoDB will need
     * to fetch each matching item from the table. This extra fetching incurs
     * additional throughput cost and latency.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet Represents one or more attributes to retrieve from the table or index.
     *         If no attribute names are specified then all attributes will be
     *         returned. If any of the specified attributes are not found, they will
     *         not appear in the result. <p>If you are querying an index and request
     *         only attributes that are projected into that index, the operation will
     *         read only the index and not the table. If any of the requested
     *         attributes are not projected into the index, Amazon DynamoDB will need
     *         to fetch each matching item from the table. This extra fetching incurs
     *         additional throughput cost and latency.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public KeysAndAttributes withAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(attributesToGet.size());
            attributesToGetCopy.addAll(attributesToGet);
            this.attributesToGet = attributesToGetCopy;
        }

        return this;
    }

    /**
     * Represents the consistency of a read operation. If set to
     * <code>true</code>, then a strongly consistent read is used; otherwise,
     * an eventually consistent read is used.
     *
     * @return Represents the consistency of a read operation. If set to
     *         <code>true</code>, then a strongly consistent read is used; otherwise,
     *         an eventually consistent read is used.
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }
    
    /**
     * Represents the consistency of a read operation. If set to
     * <code>true</code>, then a strongly consistent read is used; otherwise,
     * an eventually consistent read is used.
     *
     * @param consistentRead Represents the consistency of a read operation. If set to
     *         <code>true</code>, then a strongly consistent read is used; otherwise,
     *         an eventually consistent read is used.
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }
    
    /**
     * Represents the consistency of a read operation. If set to
     * <code>true</code>, then a strongly consistent read is used; otherwise,
     * an eventually consistent read is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consistentRead Represents the consistency of a read operation. If set to
     *         <code>true</code>, then a strongly consistent read is used; otherwise,
     *         an eventually consistent read is used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public KeysAndAttributes withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }

    /**
     * Represents the consistency of a read operation. If set to
     * <code>true</code>, then a strongly consistent read is used; otherwise,
     * an eventually consistent read is used.
     *
     * @return Represents the consistency of a read operation. If set to
     *         <code>true</code>, then a strongly consistent read is used; otherwise,
     *         an eventually consistent read is used.
     */
    public Boolean getConsistentRead() {
        return consistentRead;
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
        if (getKeys() != null) sb.append("Keys: " + getKeys() + ",");
        if (getAttributesToGet() != null) sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (isConsistentRead() != null) sb.append("ConsistentRead: " + isConsistentRead() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode()); 
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode()); 
        hashCode = prime * hashCode + ((isConsistentRead() == null) ? 0 : isConsistentRead().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof KeysAndAttributes == false) return false;
        KeysAndAttributes other = (KeysAndAttributes)obj;
        
        if (other.getKeys() == null ^ this.getKeys() == null) return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false) return false; 
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null) return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false) return false; 
        if (other.isConsistentRead() == null ^ this.isConsistentRead() == null) return false;
        if (other.isConsistentRead() != null && other.isConsistentRead().equals(this.isConsistentRead()) == false) return false; 
        return true;
    }
    
}
    