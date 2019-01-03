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
 * Represents the properties of a local secondary index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/LocalSecondaryIndexDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalSecondaryIndexDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the name of the local secondary index.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key
     * types:
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
    private java.util.List<KeySchemaElement> keySchema;
    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into the global secondary index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected.
     * </p>
     */
    private Projection projection;
    /**
     * <p>
     * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours.
     * Recent changes might not be reflected in this value.
     * </p>
     */
    private Long indexSizeBytes;
    /**
     * <p>
     * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     */
    private Long itemCount;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     * </p>
     */
    private String indexArn;

    /**
     * <p>
     * Represents the name of the local secondary index.
     * </p>
     * 
     * @param indexName
     *        Represents the name of the local secondary index.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * Represents the name of the local secondary index.
     * </p>
     * 
     * @return Represents the name of the local secondary index.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * Represents the name of the local secondary index.
     * </p>
     * 
     * @param indexName
     *        Represents the name of the local secondary index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalSecondaryIndexDescription withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key
     * types:
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
     * @return The complete key schema for the local secondary index, consisting of one or more pairs of attribute names
     *         and key types:</p>
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
     */

    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key
     * types:
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
     * @param keySchema
     *        The complete key schema for the local secondary index, consisting of one or more pairs of attribute names
     *        and key types:</p>
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

    public void setKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
            return;
        }

        this.keySchema = new java.util.ArrayList<KeySchemaElement>(keySchema);
    }

    /**
     * <p>
     * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key
     * types:
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
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeySchema(java.util.Collection)} or {@link #withKeySchema(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keySchema
     *        The complete key schema for the local secondary index, consisting of one or more pairs of attribute names
     *        and key types:</p>
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
     */

    public LocalSecondaryIndexDescription withKeySchema(KeySchemaElement... keySchema) {
        if (this.keySchema == null) {
            setKeySchema(new java.util.ArrayList<KeySchemaElement>(keySchema.length));
        }
        for (KeySchemaElement ele : keySchema) {
            this.keySchema.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The complete key schema for the local secondary index, consisting of one or more pairs of attribute names and key
     * types:
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
     * @param keySchema
     *        The complete key schema for the local secondary index, consisting of one or more pairs of attribute names
     *        and key types:</p>
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
     */

    public LocalSecondaryIndexDescription withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into the global secondary index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected.
     * </p>
     * 
     * @param projection
     *        Represents attributes that are copied (projected) from the table into the global secondary index. These
     *        are in addition to the primary key attributes and index key attributes, which are automatically projected.
     */

    public void setProjection(Projection projection) {
        this.projection = projection;
    }

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into the global secondary index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected.
     * </p>
     * 
     * @return Represents attributes that are copied (projected) from the table into the global secondary index. These
     *         are in addition to the primary key attributes and index key attributes, which are automatically
     *         projected.
     */

    public Projection getProjection() {
        return this.projection;
    }

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into the global secondary index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected.
     * </p>
     * 
     * @param projection
     *        Represents attributes that are copied (projected) from the table into the global secondary index. These
     *        are in addition to the primary key attributes and index key attributes, which are automatically projected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalSecondaryIndexDescription withProjection(Projection projection) {
        setProjection(projection);
        return this;
    }

    /**
     * <p>
     * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours.
     * Recent changes might not be reflected in this value.
     * </p>
     * 
     * @param indexSizeBytes
     *        The total size of the specified index, in bytes. DynamoDB updates this value approximately every six
     *        hours. Recent changes might not be reflected in this value.
     */

    public void setIndexSizeBytes(Long indexSizeBytes) {
        this.indexSizeBytes = indexSizeBytes;
    }

    /**
     * <p>
     * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours.
     * Recent changes might not be reflected in this value.
     * </p>
     * 
     * @return The total size of the specified index, in bytes. DynamoDB updates this value approximately every six
     *         hours. Recent changes might not be reflected in this value.
     */

    public Long getIndexSizeBytes() {
        return this.indexSizeBytes;
    }

    /**
     * <p>
     * The total size of the specified index, in bytes. DynamoDB updates this value approximately every six hours.
     * Recent changes might not be reflected in this value.
     * </p>
     * 
     * @param indexSizeBytes
     *        The total size of the specified index, in bytes. DynamoDB updates this value approximately every six
     *        hours. Recent changes might not be reflected in this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalSecondaryIndexDescription withIndexSizeBytes(Long indexSizeBytes) {
        setIndexSizeBytes(indexSizeBytes);
        return this;
    }

    /**
     * <p>
     * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * 
     * @param itemCount
     *        The number of items in the specified index. DynamoDB updates this value approximately every six hours.
     *        Recent changes might not be reflected in this value.
     */

    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * 
     * @return The number of items in the specified index. DynamoDB updates this value approximately every six hours.
     *         Recent changes might not be reflected in this value.
     */

    public Long getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * The number of items in the specified index. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * 
     * @param itemCount
     *        The number of items in the specified index. DynamoDB updates this value approximately every six hours.
     *        Recent changes might not be reflected in this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalSecondaryIndexDescription withItemCount(Long itemCount) {
        setItemCount(itemCount);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     * </p>
     * 
     * @param indexArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the index.
     */

    public void setIndexArn(String indexArn) {
        this.indexArn = indexArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that uniquely identifies the index.
     */

    public String getIndexArn() {
        return this.indexArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the index.
     * </p>
     * 
     * @param indexArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalSecondaryIndexDescription withIndexArn(String indexArn) {
        setIndexArn(indexArn);
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
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getKeySchema() != null)
            sb.append("KeySchema: ").append(getKeySchema()).append(",");
        if (getProjection() != null)
            sb.append("Projection: ").append(getProjection()).append(",");
        if (getIndexSizeBytes() != null)
            sb.append("IndexSizeBytes: ").append(getIndexSizeBytes()).append(",");
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount()).append(",");
        if (getIndexArn() != null)
            sb.append("IndexArn: ").append(getIndexArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalSecondaryIndexDescription == false)
            return false;
        LocalSecondaryIndexDescription other = (LocalSecondaryIndexDescription) obj;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getKeySchema() == null ^ this.getKeySchema() == null)
            return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false)
            return false;
        if (other.getProjection() == null ^ this.getProjection() == null)
            return false;
        if (other.getProjection() != null && other.getProjection().equals(this.getProjection()) == false)
            return false;
        if (other.getIndexSizeBytes() == null ^ this.getIndexSizeBytes() == null)
            return false;
        if (other.getIndexSizeBytes() != null && other.getIndexSizeBytes().equals(this.getIndexSizeBytes()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getIndexArn() == null ^ this.getIndexArn() == null)
            return false;
        if (other.getIndexArn() != null && other.getIndexArn().equals(this.getIndexArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode());
        hashCode = prime * hashCode + ((getProjection() == null) ? 0 : getProjection().hashCode());
        hashCode = prime * hashCode + ((getIndexSizeBytes() == null) ? 0 : getIndexSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getIndexArn() == null) ? 0 : getIndexArn().hashCode());
        return hashCode;
    }

    @Override
    public LocalSecondaryIndexDescription clone() {
        try {
            return (LocalSecondaryIndexDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.LocalSecondaryIndexDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
