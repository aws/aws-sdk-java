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
 * Keys And Attributes
 */
public class KeysAndAttributes {

    private java.util.List<Key> keys;

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
     * Returns the value of the Keys property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The value of the Keys property for this object.
     */
    public java.util.List<Key> getKeys() {
        
        return keys;
    }
    
    /**
     * Sets the value of the Keys property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param keys The new value for the Keys property for this object.
     */
    public void setKeys(java.util.Collection<Key> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        java.util.List<Key> keysCopy = new java.util.ArrayList<Key>(keys.size());
        keysCopy.addAll(keys);
        this.keys = keysCopy;
    }
    
    /**
     * Sets the value of the Keys property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param keys The new value for the Keys property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public KeysAndAttributes withKeys(Key... keys) {
        if (getKeys() == null) setKeys(new java.util.ArrayList<Key>(keys.length));
        for (Key value : keys) {
            getKeys().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Keys property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param keys The new value for the Keys property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public KeysAndAttributes withKeys(java.util.Collection<Key> keys) {
        if (keys == null) {
            this.keys = null;
        } else {
            java.util.List<Key> keysCopy = new java.util.ArrayList<Key>(keys.size());
            keysCopy.addAll(keys);
            this.keys = keysCopy;
        }

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
    public KeysAndAttributes withAttributesToGet(String... attributesToGet) {
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
    public KeysAndAttributes withAttributesToGet(java.util.Collection<String> attributesToGet) {
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
    public KeysAndAttributes withConsistentRead(Boolean consistentRead) {
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
        if (keys != null) sb.append("Keys: " + keys + ", ");
        if (attributesToGet != null) sb.append("AttributesToGet: " + attributesToGet + ", ");
        if (consistentRead != null) sb.append("ConsistentRead: " + consistentRead + ", ");
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
    