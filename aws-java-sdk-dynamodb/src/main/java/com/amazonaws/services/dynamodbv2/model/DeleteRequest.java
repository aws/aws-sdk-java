/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a request to perform a <code>DeleteItem</code> operation on an item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A map of attribute name to attribute values, representing the primary key of the item to delete. All of the
     * table's primary key attributes must be specified, and their data types must match those of the table's key
     * schema.
     * </p>
     */
    private java.util.Map<String, AttributeValue> key;

    /**
     * Default constructor for DeleteRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public DeleteRequest() {
    }

    /**
     * Constructs a new DeleteRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param key
     *        A map of attribute name to attribute values, representing the primary key of the item to delete. All of
     *        the table's primary key attributes must be specified, and their data types must match those of the table's
     *        key schema.
     */
    public DeleteRequest(java.util.Map<String, AttributeValue> key) {
        setKey(key);
    }

    /**
     * <p>
     * A map of attribute name to attribute values, representing the primary key of the item to delete. All of the
     * table's primary key attributes must be specified, and their data types must match those of the table's key
     * schema.
     * </p>
     * 
     * @return A map of attribute name to attribute values, representing the primary key of the item to delete. All of
     *         the table's primary key attributes must be specified, and their data types must match those of the
     *         table's key schema.
     */

    public java.util.Map<String, AttributeValue> getKey() {
        return key;
    }

    /**
     * <p>
     * A map of attribute name to attribute values, representing the primary key of the item to delete. All of the
     * table's primary key attributes must be specified, and their data types must match those of the table's key
     * schema.
     * </p>
     * 
     * @param key
     *        A map of attribute name to attribute values, representing the primary key of the item to delete. All of
     *        the table's primary key attributes must be specified, and their data types must match those of the table's
     *        key schema.
     */

    public void setKey(java.util.Map<String, AttributeValue> key) {
        this.key = key;
    }

    /**
     * <p>
     * A map of attribute name to attribute values, representing the primary key of the item to delete. All of the
     * table's primary key attributes must be specified, and their data types must match those of the table's key
     * schema.
     * </p>
     * 
     * @param key
     *        A map of attribute name to attribute values, representing the primary key of the item to delete. All of
     *        the table's primary key attributes must be specified, and their data types must match those of the table's
     *        key schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRequest withKey(java.util.Map<String, AttributeValue> key) {
        setKey(key);
        return this;
    }

    public DeleteRequest addKeyEntry(String key, AttributeValue value) {
        if (null == this.key) {
            this.key = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.key.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.key.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Key.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRequest clearKeyEntries() {
        this.key = null;
        return this;
    }

    /**
     * Set the hash and range key attributes of the item.
     * <p>
     * For a hash-only table, you only need to provide the hash attribute. For a hash-and-range table, you must provide
     * both.
     *
     * @param hashKey
     *        a map entry including the name and value of the primary hash key.
     * @param rangeKey
     *        a map entry including the name and value of the primary range key, or null if it is a hash-only table.
     */
    public void setKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey)
            throws IllegalArgumentException {
        java.util.HashMap<String, AttributeValue> key = new java.util.HashMap<String, AttributeValue>();
        if (hashKey != null) {
            key.put(hashKey.getKey(), hashKey.getValue());
        } else {
            throw new IllegalArgumentException("hashKey must be non-null object.");
        }
        if (rangeKey != null) {
            key.put(rangeKey.getKey(), rangeKey.getValue());
        }
        setKey(key);
    }

    /**
     * Set the hash and range key attributes of the item.
     * <p>
     * For a hash-only table, you only need to provide the hash attribute. For a hash-and-range table, you must provide
     * both.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKey
     *        a map entry including the name and value of the primary hash key.
     * @param rangeKey
     *        a map entry including the name and value of the primary range key, or null if it is a hash-only table.
     */
    public DeleteRequest withKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey)
            throws IllegalArgumentException {
        setKey(hashKey, rangeKey);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null)
            sb.append("Key: ").append(getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRequest == false)
            return false;
        DeleteRequest other = (DeleteRequest) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRequest clone() {
        try {
            return (DeleteRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.DeleteRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
