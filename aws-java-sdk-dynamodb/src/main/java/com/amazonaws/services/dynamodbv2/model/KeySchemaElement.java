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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents <i>a single element</i> of a key schema. A key schema specifies
 * the attributes that make up the primary key of a table, or the key attributes
 * of an index.
 * </p>
 * <p>
 * A <i>KeySchemaElement</i> represents exactly one attribute of the primary
 * key. For example, a hash type primary key would be represented by one
 * <i>KeySchemaElement</i>. A hash-and-range type primary key would require one
 * <i>KeySchemaElement</i> for the hash attribute, and another
 * <i>KeySchemaElement</i> for the range attribute.
 * </p>
 */
public class KeySchemaElement implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a key attribute.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The attribute data, consisting of the data type and the attribute value
     * itself.
     * </p>
     */
    private String keyType;

    /**
     * Default constructor for KeySchemaElement object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public KeySchemaElement() {
    }

    /**
     * Constructs a new KeySchemaElement object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param attributeName
     *        The name of a key attribute.
     * @param keyType
     *        The attribute data, consisting of the data type and the attribute
     *        value itself.
     */
    public KeySchemaElement(String attributeName, String keyType) {
        setAttributeName(attributeName);
        setKeyType(keyType);
    }

    /**
     * Constructs a new KeySchemaElement object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param attributeName
     *        The name of a key attribute.
     * @param keyType
     *        The attribute data, consisting of the data type and the attribute
     *        value itself.
     */
    public KeySchemaElement(String attributeName, KeyType keyType) {
        setAttributeName(attributeName);
        setKeyType(keyType.toString());
    }

    /**
     * <p>
     * The name of a key attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of a key attribute.
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of a key attribute.
     * </p>
     * 
     * @return The name of a key attribute.
     */
    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of a key attribute.
     * </p>
     * 
     * @param attributeName
     *        The name of a key attribute.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public KeySchemaElement withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The attribute data, consisting of the data type and the attribute value
     * itself.
     * </p>
     * 
     * @param keyType
     *        The attribute data, consisting of the data type and the attribute
     *        value itself.
     * @see KeyType
     */
    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    /**
     * <p>
     * The attribute data, consisting of the data type and the attribute value
     * itself.
     * </p>
     * 
     * @return The attribute data, consisting of the data type and the attribute
     *         value itself.
     * @see KeyType
     */
    public String getKeyType() {
        return this.keyType;
    }

    /**
     * <p>
     * The attribute data, consisting of the data type and the attribute value
     * itself.
     * </p>
     * 
     * @param keyType
     *        The attribute data, consisting of the data type and the attribute
     *        value itself.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyType
     */
    public KeySchemaElement withKeyType(String keyType) {
        setKeyType(keyType);
        return this;
    }

    /**
     * <p>
     * The attribute data, consisting of the data type and the attribute value
     * itself.
     * </p>
     * 
     * @param keyType
     *        The attribute data, consisting of the data type and the attribute
     *        value itself.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyType
     */
    public void setKeyType(KeyType keyType) {
        this.keyType = keyType.toString();
    }

    /**
     * <p>
     * The attribute data, consisting of the data type and the attribute value
     * itself.
     * </p>
     * 
     * @param keyType
     *        The attribute data, consisting of the data type and the attribute
     *        value itself.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyType
     */
    public KeySchemaElement withKeyType(KeyType keyType) {
        setKeyType(keyType);
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
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName() + ",");
        if (getKeyType() != null)
            sb.append("KeyType: " + getKeyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeySchemaElement == false)
            return false;
        KeySchemaElement other = (KeySchemaElement) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getKeyType() == null ^ this.getKeyType() == null)
            return false;
        if (other.getKeyType() != null
                && other.getKeyType().equals(this.getKeyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getKeyType() == null) ? 0 : getKeyType().hashCode());
        return hashCode;
    }

    @Override
    public KeySchemaElement clone() {
        try {
            return (KeySchemaElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}