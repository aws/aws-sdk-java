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
 * Represents a key schema. Specifies the attributes that make up the primary key of a table, or the key attributes of a secondary index.
 * </p>
 */
public class KeySchemaElement implements Serializable {

    /**
     * Represents the name of a key attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String attributeName;

    /**
     * Represents the attribute data, consisting of the data type and the
     * attribute value itself.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HASH, RANGE
     */
    private String keyType;

    /**
     * Default constructor for a new KeySchemaElement object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public KeySchemaElement() {}
    
    /**
     * Constructs a new KeySchemaElement object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param attributeName Represents the name of a key attribute.
     * @param keyType Represents the attribute data, consisting of the data
     * type and the attribute value itself.
     */
    public KeySchemaElement(String attributeName, String keyType) {
        setAttributeName(attributeName);
        setKeyType(keyType);
    }

    /**
     * Constructs a new KeySchemaElement object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param attributeName Represents the name of a key attribute.
     * @param keyType Represents the attribute data, consisting of the data
     * type and the attribute value itself.
     */
    public KeySchemaElement(String attributeName, KeyType keyType) {
        this.attributeName = attributeName;
        this.keyType = keyType.toString();
    }

    /**
     * Represents the name of a key attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return Represents the name of a key attribute.
     */
    public String getAttributeName() {
        return attributeName;
    }
    
    /**
     * Represents the name of a key attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param attributeName Represents the name of a key attribute.
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    
    /**
     * Represents the name of a key attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param attributeName Represents the name of a key attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public KeySchemaElement withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * Represents the attribute data, consisting of the data type and the
     * attribute value itself.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HASH, RANGE
     *
     * @return Represents the attribute data, consisting of the data type and the
     *         attribute value itself.
     *
     * @see KeyType
     */
    public String getKeyType() {
        return keyType;
    }
    
    /**
     * Represents the attribute data, consisting of the data type and the
     * attribute value itself.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HASH, RANGE
     *
     * @param keyType Represents the attribute data, consisting of the data type and the
     *         attribute value itself.
     *
     * @see KeyType
     */
    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }
    
    /**
     * Represents the attribute data, consisting of the data type and the
     * attribute value itself.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HASH, RANGE
     *
     * @param keyType Represents the attribute data, consisting of the data type and the
     *         attribute value itself.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see KeyType
     */
    public KeySchemaElement withKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * Represents the attribute data, consisting of the data type and the
     * attribute value itself.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HASH, RANGE
     *
     * @param keyType Represents the attribute data, consisting of the data type and the
     *         attribute value itself.
     *
     * @see KeyType
     */
    public void setKeyType(KeyType keyType) {
        this.keyType = keyType.toString();
    }
    
    /**
     * Represents the attribute data, consisting of the data type and the
     * attribute value itself.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HASH, RANGE
     *
     * @param keyType Represents the attribute data, consisting of the data type and the
     *         attribute value itself.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see KeyType
     */
    public KeySchemaElement withKeyType(KeyType keyType) {
        this.keyType = keyType.toString();
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
        if (getAttributeName() != null) sb.append("AttributeName: " + getAttributeName() + ",");
        if (getKeyType() != null) sb.append("KeyType: " + getKeyType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode()); 
        hashCode = prime * hashCode + ((getKeyType() == null) ? 0 : getKeyType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof KeySchemaElement == false) return false;
        KeySchemaElement other = (KeySchemaElement)obj;
        
        if (other.getAttributeName() == null ^ this.getAttributeName() == null) return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false) return false; 
        if (other.getKeyType() == null ^ this.getKeyType() == null) return false;
        if (other.getKeyType() != null && other.getKeyType().equals(this.getKeyType()) == false) return false; 
        return true;
    }
    
}
    