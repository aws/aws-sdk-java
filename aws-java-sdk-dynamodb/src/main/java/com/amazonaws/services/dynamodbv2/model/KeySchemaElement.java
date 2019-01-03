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
 * Represents <i>a single element</i> of a key schema. A key schema specifies the attributes that make up the primary
 * key of a table, or the key attributes of an index.
 * </p>
 * <p>
 * A <code>KeySchemaElement</code> represents exactly one attribute of the primary key. For example, a simple primary
 * key would be represented by one <code>KeySchemaElement</code> (for the partition key). A composite primary key would
 * require one <code>KeySchemaElement</code> for the partition key, and another <code>KeySchemaElement</code> for the
 * sort key.
 * </p>
 * <p>
 * A <code>KeySchemaElement</code> must be a scalar, top-level attribute (not a nested attribute). The data type must be
 * one of String, Number, or Binary. The attribute cannot be nested within a List or a Map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/KeySchemaElement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeySchemaElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a key attribute.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The role that this key attribute will assume:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HASH</code> - partition key
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code> - sort key
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from
     * DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their
     * partition key values.
     * </p>
     * <p>
     * The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the
     * way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key
     * value.
     * </p>
     * </note>
     */
    private String keyType;

    /**
     * Default constructor for KeySchemaElement object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public KeySchemaElement() {
    }

    /**
     * Constructs a new KeySchemaElement object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param attributeName
     *        The name of a key attribute.
     * @param keyType
     *        The role that this key attribute will assume:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HASH</code> - partition key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RANGE</code> - sort key
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives
     *        from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based
     *        on their partition key values.
     *        </p>
     *        <p>
     *        The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives
     *        from the way DynamoDB stores items with the same partition key physically close together, in sorted order
     *        by the sort key value.
     *        </p>
     */
    public KeySchemaElement(String attributeName, String keyType) {
        setAttributeName(attributeName);
        setKeyType(keyType);
    }

    /**
     * Constructs a new KeySchemaElement object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param attributeName
     *        The name of a key attribute.
     * @param keyType
     *        The role that this key attribute will assume:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HASH</code> - partition key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RANGE</code> - sort key
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives
     *        from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based
     *        on their partition key values.
     *        </p>
     *        <p>
     *        The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives
     *        from the way DynamoDB stores items with the same partition key physically close together, in sorted order
     *        by the sort key value.
     *        </p>
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeySchemaElement withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The role that this key attribute will assume:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HASH</code> - partition key
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code> - sort key
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from
     * DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their
     * partition key values.
     * </p>
     * <p>
     * The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the
     * way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key
     * value.
     * </p>
     * </note>
     * 
     * @param keyType
     *        The role that this key attribute will assume:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HASH</code> - partition key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RANGE</code> - sort key
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives
     *        from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based
     *        on their partition key values.
     *        </p>
     *        <p>
     *        The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives
     *        from the way DynamoDB stores items with the same partition key physically close together, in sorted order
     *        by the sort key value.
     *        </p>
     * @see KeyType
     */

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    /**
     * <p>
     * The role that this key attribute will assume:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HASH</code> - partition key
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code> - sort key
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from
     * DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their
     * partition key values.
     * </p>
     * <p>
     * The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the
     * way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key
     * value.
     * </p>
     * </note>
     * 
     * @return The role that this key attribute will assume:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HASH</code> - partition key
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RANGE</code> - sort key
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute"
     *         derives from DynamoDB' usage of an internal hash function to evenly distribute data items across
     *         partitions, based on their partition key values.
     *         </p>
     *         <p>
     *         The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives
     *         from the way DynamoDB stores items with the same partition key physically close together, in sorted order
     *         by the sort key value.
     *         </p>
     * @see KeyType
     */

    public String getKeyType() {
        return this.keyType;
    }

    /**
     * <p>
     * The role that this key attribute will assume:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HASH</code> - partition key
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code> - sort key
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from
     * DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their
     * partition key values.
     * </p>
     * <p>
     * The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the
     * way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key
     * value.
     * </p>
     * </note>
     * 
     * @param keyType
     *        The role that this key attribute will assume:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HASH</code> - partition key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RANGE</code> - sort key
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives
     *        from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based
     *        on their partition key values.
     *        </p>
     *        <p>
     *        The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives
     *        from the way DynamoDB stores items with the same partition key physically close together, in sorted order
     *        by the sort key value.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyType
     */

    public KeySchemaElement withKeyType(String keyType) {
        setKeyType(keyType);
        return this;
    }

    /**
     * <p>
     * The role that this key attribute will assume:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HASH</code> - partition key
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code> - sort key
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from
     * DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their
     * partition key values.
     * </p>
     * <p>
     * The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the
     * way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key
     * value.
     * </p>
     * </note>
     * 
     * @param keyType
     *        The role that this key attribute will assume:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HASH</code> - partition key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RANGE</code> - sort key
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives
     *        from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based
     *        on their partition key values.
     *        </p>
     *        <p>
     *        The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives
     *        from the way DynamoDB stores items with the same partition key physically close together, in sorted order
     *        by the sort key value.
     *        </p>
     * @see KeyType
     */

    public void setKeyType(KeyType keyType) {
        withKeyType(keyType);
    }

    /**
     * <p>
     * The role that this key attribute will assume:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HASH</code> - partition key
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANGE</code> - sort key
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives from
     * DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their
     * partition key values.
     * </p>
     * <p>
     * The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives from the
     * way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key
     * value.
     * </p>
     * </note>
     * 
     * @param keyType
     *        The role that this key attribute will assume:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HASH</code> - partition key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RANGE</code> - sort key
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The partition key of an item is also known as its <i>hash attribute</i>. The term "hash attribute" derives
     *        from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based
     *        on their partition key values.
     *        </p>
     *        <p>
     *        The sort key of an item is also known as its <i>range attribute</i>. The term "range attribute" derives
     *        from the way DynamoDB stores items with the same partition key physically close together, in sorted order
     *        by the sort key value.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyType
     */

    public KeySchemaElement withKeyType(KeyType keyType) {
        this.keyType = keyType.toString();
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getKeyType() != null)
            sb.append("KeyType: ").append(getKeyType());
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
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getKeyType() == null ^ this.getKeyType() == null)
            return false;
        if (other.getKeyType() != null && other.getKeyType().equals(this.getKeyType()) == false)
            return false;
        return true;
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
    public KeySchemaElement clone() {
        try {
            return (KeySchemaElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.KeySchemaElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
