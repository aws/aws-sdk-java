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

/**
 * <p>
 * The KeySchema identifies the primary key as a one attribute primary key (hash) or a composite two attribute (hash-and-range) primary key. Single
 * attribute primary keys have one index value: a <code>HashKeyElement</code> .
 * A composite hash-and-range primary key contains two attribute values: a <code>HashKeyElement</code> and a <code>RangeKeyElement</code> .
 * </p>
 */
public class KeySchema {

    /**
     * A hash key element is treated as the primary key, and can be a string
     * or a number. Single attribute primary keys have one index value. The
     * value can be <code>String</code>, <code>Number</code>,
     * <code>StringSet</code>, <code>NumberSet</code>.
     */
    private KeySchemaElement hashKeyElement;

    /**
     * A range key element is treated as a secondary key (used in conjunction
     * with the primary key), and can be a string or a number, and is only
     * used for hash-and-range primary keys. The value can be
     * <code>String</code>, <code>Number</code>, <code>StringSet</code>,
     * <code>NumberSet</code>.
     */
    private KeySchemaElement rangeKeyElement;

    /**
     * Default constructor for a new KeySchema object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public KeySchema() {}
    
    /**
     * Constructs a new KeySchema object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param hashKeyElement A hash key element is treated as the primary
     * key, and can be a string or a number. Single attribute primary keys
     * have one index value. The value can be <code>String</code>,
     * <code>Number</code>, <code>StringSet</code>, <code>NumberSet</code>.
     */
    public KeySchema(KeySchemaElement hashKeyElement) {
        this.hashKeyElement = hashKeyElement;
    }

    
    
    /**
     * A hash key element is treated as the primary key, and can be a string
     * or a number. Single attribute primary keys have one index value. The
     * value can be <code>String</code>, <code>Number</code>,
     * <code>StringSet</code>, <code>NumberSet</code>.
     *
     * @return A hash key element is treated as the primary key, and can be a string
     *         or a number. Single attribute primary keys have one index value. The
     *         value can be <code>String</code>, <code>Number</code>,
     *         <code>StringSet</code>, <code>NumberSet</code>.
     */
    public KeySchemaElement getHashKeyElement() {
        return hashKeyElement;
    }
    
    /**
     * A hash key element is treated as the primary key, and can be a string
     * or a number. Single attribute primary keys have one index value. The
     * value can be <code>String</code>, <code>Number</code>,
     * <code>StringSet</code>, <code>NumberSet</code>.
     *
     * @param hashKeyElement A hash key element is treated as the primary key, and can be a string
     *         or a number. Single attribute primary keys have one index value. The
     *         value can be <code>String</code>, <code>Number</code>,
     *         <code>StringSet</code>, <code>NumberSet</code>.
     */
    public void setHashKeyElement(KeySchemaElement hashKeyElement) {
        this.hashKeyElement = hashKeyElement;
    }
    
    /**
     * A hash key element is treated as the primary key, and can be a string
     * or a number. Single attribute primary keys have one index value. The
     * value can be <code>String</code>, <code>Number</code>,
     * <code>StringSet</code>, <code>NumberSet</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKeyElement A hash key element is treated as the primary key, and can be a string
     *         or a number. Single attribute primary keys have one index value. The
     *         value can be <code>String</code>, <code>Number</code>,
     *         <code>StringSet</code>, <code>NumberSet</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public KeySchema withHashKeyElement(KeySchemaElement hashKeyElement) {
        this.hashKeyElement = hashKeyElement;
        return this;
    }
    
    
    /**
     * A range key element is treated as a secondary key (used in conjunction
     * with the primary key), and can be a string or a number, and is only
     * used for hash-and-range primary keys. The value can be
     * <code>String</code>, <code>Number</code>, <code>StringSet</code>,
     * <code>NumberSet</code>.
     *
     * @return A range key element is treated as a secondary key (used in conjunction
     *         with the primary key), and can be a string or a number, and is only
     *         used for hash-and-range primary keys. The value can be
     *         <code>String</code>, <code>Number</code>, <code>StringSet</code>,
     *         <code>NumberSet</code>.
     */
    public KeySchemaElement getRangeKeyElement() {
        return rangeKeyElement;
    }
    
    /**
     * A range key element is treated as a secondary key (used in conjunction
     * with the primary key), and can be a string or a number, and is only
     * used for hash-and-range primary keys. The value can be
     * <code>String</code>, <code>Number</code>, <code>StringSet</code>,
     * <code>NumberSet</code>.
     *
     * @param rangeKeyElement A range key element is treated as a secondary key (used in conjunction
     *         with the primary key), and can be a string or a number, and is only
     *         used for hash-and-range primary keys. The value can be
     *         <code>String</code>, <code>Number</code>, <code>StringSet</code>,
     *         <code>NumberSet</code>.
     */
    public void setRangeKeyElement(KeySchemaElement rangeKeyElement) {
        this.rangeKeyElement = rangeKeyElement;
    }
    
    /**
     * A range key element is treated as a secondary key (used in conjunction
     * with the primary key), and can be a string or a number, and is only
     * used for hash-and-range primary keys. The value can be
     * <code>String</code>, <code>Number</code>, <code>StringSet</code>,
     * <code>NumberSet</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rangeKeyElement A range key element is treated as a secondary key (used in conjunction
     *         with the primary key), and can be a string or a number, and is only
     *         used for hash-and-range primary keys. The value can be
     *         <code>String</code>, <code>Number</code>, <code>StringSet</code>,
     *         <code>NumberSet</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public KeySchema withRangeKeyElement(KeySchemaElement rangeKeyElement) {
        this.rangeKeyElement = rangeKeyElement;
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
        if (hashKeyElement != null) sb.append("HashKeyElement: " + hashKeyElement + ", ");
        if (rangeKeyElement != null) sb.append("RangeKeyElement: " + rangeKeyElement + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHashKeyElement() == null) ? 0 : getHashKeyElement().hashCode()); 
        hashCode = prime * hashCode + ((getRangeKeyElement() == null) ? 0 : getRangeKeyElement().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof KeySchema == false) return false;
        KeySchema other = (KeySchema)obj;
        
        if (other.getHashKeyElement() == null ^ this.getHashKeyElement() == null) return false;
        if (other.getHashKeyElement() != null && other.getHashKeyElement().equals(this.getHashKeyElement()) == false) return false; 
        if (other.getRangeKeyElement() == null ^ this.getRangeKeyElement() == null) return false;
        if (other.getRangeKeyElement() != null && other.getRangeKeyElement().equals(this.getRangeKeyElement()) == false) return false; 
        return true;
    }
    
}
    