/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodb.AmazonDynamoDB#getItem(GetItemRequest) GetItem operation}.
 * <p>
 * Retrieves a set of Attributes for an item that matches the primary key.
 * </p>
 * <p>
 * The <code>GetItem</code> operation provides an eventually-consistent read by default. If eventually-consistent reads are not acceptable for your
 * application, use <code>ConsistentRead</code> . Although this operation might take longer than a standard read, it always returns the last updated
 * value.
 * </p>
 *
 * @see com.amazonaws.services.dynamodb.AmazonDynamoDB#getItem(GetItemRequest)
 */
public class GetItemRequest extends AmazonWebServiceRequest {

    /**
     * The name of the table in which you want to get an item. Allowed
     * characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * The primary key that uniquely identifies each item in a table. A
     * primary key can be a one attribute (hash) primary key or a two
     * attribute (hash-and-range) primary key.
     */
    private Key key;

    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private java.util.List<String> attributesToGet;

    /**
     * If set to <code>true</code>, then a consistent read is issued.
     * Otherwise eventually-consistent is used.
     */
    private Boolean consistentRead;

    /**
     * Default constructor for a new GetItemRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetItemRequest() {}
    
    /**
     * Constructs a new GetItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table in which you want to get an
     * item. Allowed characters are <code>a-z</code>, <code>A-Z</code>,
     * <code>0-9</code>, <code>_</code> (underscore), <code>-</code> (hyphen)
     * and <code>.</code> (period).
     * @param key The primary key that uniquely identifies each item in a
     * table. A primary key can be a one attribute (hash) primary key or a
     * two attribute (hash-and-range) primary key.
     */
    public GetItemRequest(String tableName, Key key) {
        this.tableName = tableName;
        this.key = key;
    }

    
    
    /**
     * The name of the table in which you want to get an item. Allowed
     * characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table in which you want to get an item. Allowed
     *         characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table in which you want to get an item. Allowed
     * characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table in which you want to get an item. Allowed
     *         characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table in which you want to get an item. Allowed
     * characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table in which you want to get an item. Allowed
     *         characters are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetItemRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
    
    /**
     * The primary key that uniquely identifies each item in a table. A
     * primary key can be a one attribute (hash) primary key or a two
     * attribute (hash-and-range) primary key.
     *
     * @return The primary key that uniquely identifies each item in a table. A
     *         primary key can be a one attribute (hash) primary key or a two
     *         attribute (hash-and-range) primary key.
     */
    public Key getKey() {
        return key;
    }
    
    /**
     * The primary key that uniquely identifies each item in a table. A
     * primary key can be a one attribute (hash) primary key or a two
     * attribute (hash-and-range) primary key.
     *
     * @param key The primary key that uniquely identifies each item in a table. A
     *         primary key can be a one attribute (hash) primary key or a two
     *         attribute (hash-and-range) primary key.
     */
    public void setKey(Key key) {
        this.key = key;
    }
    
    /**
     * The primary key that uniquely identifies each item in a table. A
     * primary key can be a one attribute (hash) primary key or a two
     * attribute (hash-and-range) primary key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key The primary key that uniquely identifies each item in a table. A
     *         primary key can be a one attribute (hash) primary key or a two
     *         attribute (hash-and-range) primary key.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetItemRequest withKey(Key key) {
        this.key = key;
        return this;
    }
    
    
    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return List of <code>Attribute</code> names. If attribute names are not
     *         specified then all attributes will be returned. If some attributes are
     *         not found, they will not appear in the result.
     */
    public java.util.List<String> getAttributesToGet() {
        
        return attributesToGet;
    }
    
    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet List of <code>Attribute</code> names. If attribute names are not
     *         specified then all attributes will be returned. If some attributes are
     *         not found, they will not appear in the result.
     */
    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
        attributesToGetCopy.addAll(attributesToGet);
        this.attributesToGet = attributesToGetCopy;
    }
    
    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet List of <code>Attribute</code> names. If attribute names are not
     *         specified then all attributes will be returned. If some attributes are
     *         not found, they will not appear in the result.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetItemRequest withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        for (String value : attributesToGet) {
            getAttributesToGet().add(value);
        }
        return this;
    }
    
    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet List of <code>Attribute</code> names. If attribute names are not
     *         specified then all attributes will be returned. If some attributes are
     *         not found, they will not appear in the result.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetItemRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
        } else {
            java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
            attributesToGetCopy.addAll(attributesToGet);
            this.attributesToGet = attributesToGetCopy;
        }

        return this;
    }
    
    /**
     * If set to <code>true</code>, then a consistent read is issued.
     * Otherwise eventually-consistent is used.
     *
     * @return If set to <code>true</code>, then a consistent read is issued.
     *         Otherwise eventually-consistent is used.
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }
    
    /**
     * If set to <code>true</code>, then a consistent read is issued.
     * Otherwise eventually-consistent is used.
     *
     * @param consistentRead If set to <code>true</code>, then a consistent read is issued.
     *         Otherwise eventually-consistent is used.
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }
    
    /**
     * If set to <code>true</code>, then a consistent read is issued.
     * Otherwise eventually-consistent is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consistentRead If set to <code>true</code>, then a consistent read is issued.
     *         Otherwise eventually-consistent is used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetItemRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }
    
    
    /**
     * If set to <code>true</code>, then a consistent read is issued.
     * Otherwise eventually-consistent is used.
     *
     * @return If set to <code>true</code>, then a consistent read is issued.
     *         Otherwise eventually-consistent is used.
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
        if (tableName != null) sb.append("TableName: " + tableName + ", ");
        if (key != null) sb.append("Key: " + key + ", ");
        if (attributesToGet != null) sb.append("AttributesToGet: " + attributesToGet + ", ");
        if (consistentRead != null) sb.append("ConsistentRead: " + consistentRead + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode()); 
        hashCode = prime * hashCode + ((isConsistentRead() == null) ? 0 : isConsistentRead().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof GetItemRequest == false) return false;
        GetItemRequest other = (GetItemRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null) return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false) return false; 
        if (other.isConsistentRead() == null ^ this.isConsistentRead() == null) return false;
        if (other.isConsistentRead() != null && other.isConsistentRead().equals(this.isConsistentRead()) == false) return false; 
        return true;
    }
    
}
    