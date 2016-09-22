/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <i>CreateTable</i> operation.
 * </p>
 */
public class CreateTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and indexes.
     * </p>
     */
    private java.util.List<AttributeDefinition> attributeDefinitions;
    /**
     * <p>
     * The name of the table to create.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Specifies the attributes that make up the primary key for a table or an index. The attributes in <i>KeySchema</i>
     * must also be defined in the <i>AttributeDefinitions</i> array. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data Model</a> in the
     * <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each <i>KeySchemaElement</i> in the array is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeName</i> - The name of this key attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KeyType</i> - The role that the key attribute will assume:
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
     * For a simple primary key (partition key), you must provide exactly one element with a <i>KeyType</i> of
     * <code>HASH</code>.
     * </p>
     * <p>
     * For a composite primary key (partition key and sort key), you must provide exactly two elements, in this order:
     * The first element must have a <i>KeyType</i> of <code>HASH</code>, and the second element must have a
     * <i>KeyType</i> of <code>RANGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key"
     * >Specifying the Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.List<KeySchemaElement> keySchema;
    /**
     * <p>
     * One or more local secondary indexes (the maximum is five) to be created on the table. Each index is scoped to a
     * given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size of a local
     * secondary index is unconstrained.
     * </p>
     * <p>
     * Each local secondary index in the array includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>IndexName</i> - The name of the local secondary index. Must be unique only for this table.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <i>KeySchema</i> - Specifies the key schema for the local secondary index. The key schema must begin with the
     * same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ProjectionType</i> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <i>NonKeyAttributes</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the secondary
     * index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of the secondary
     * indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two
     * distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.List<LocalSecondaryIndex> localSecondaryIndexes;
    /**
     * <p>
     * One or more global secondary indexes (the maximum is five) to be created on the table. Each global secondary
     * index in the array includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>IndexName</i> - The name of the global secondary index. Must be unique only for this table.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <i>KeySchema</i> - Specifies the key schema for the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ProjectionType</i> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <i>NonKeyAttributes</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the secondary
     * index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of the secondary
     * indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two
     * distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>ProvisionedThroughput</i> - The provisioned throughput settings for the global secondary index, consisting of
     * read and write capacity units.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<GlobalSecondaryIndex> globalSecondaryIndexes;

    private ProvisionedThroughput provisionedThroughput;
    /**
     * <p>
     * The settings for DynamoDB Streams on the table. These settings consist of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>StreamEnabled</i> - Indicates whether Streams is to be enabled (true) or disabled (false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what information
     * is written to the table's stream. Valid values for <i>StreamViewType</i> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private StreamSpecification streamSpecification;

    /**
     * Default constructor for CreateTableRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateTableRequest() {
    }

    /**
     * Constructs a new CreateTableRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     *        The name of the table to create.
     * @param keySchema
     *        Specifies the attributes that make up the primary key for a table or an index. The attributes in
     *        <i>KeySchema</i> must also be defined in the <i>AttributeDefinitions</i> array. For more information, see
     *        <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data Model</a> in
     *        the <i>Amazon DynamoDB Developer Guide</i>.</p>
     *        <p>
     *        Each <i>KeySchemaElement</i> in the array is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeName</i> - The name of this key attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>KeyType</i> - The role that the key attribute will assume:
     *        </p>
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
     *        </note>
     *        <p>
     *        For a simple primary key (partition key), you must provide exactly one element with a <i>KeyType</i> of
     *        <code>HASH</code>.
     *        </p>
     *        <p>
     *        For a composite primary key (partition key and sort key), you must provide exactly two elements, in this
     *        order: The first element must have a <i>KeyType</i> of <code>HASH</code>, and the second element must have
     *        a <i>KeyType</i> of <code>RANGE</code>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key"
     *        >Specifying the Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */
    public CreateTableRequest(String tableName, java.util.List<KeySchemaElement> keySchema) {
        setTableName(tableName);
        setKeySchema(keySchema);
    }

    /**
     * Constructs a new CreateTableRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param attributeDefinitions
     *        An array of attributes that describe the key schema for the table and indexes.
     * @param tableName
     *        The name of the table to create.
     * @param keySchema
     *        Specifies the attributes that make up the primary key for a table or an index. The attributes in
     *        <i>KeySchema</i> must also be defined in the <i>AttributeDefinitions</i> array. For more information, see
     *        <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data Model</a> in
     *        the <i>Amazon DynamoDB Developer Guide</i>.</p>
     *        <p>
     *        Each <i>KeySchemaElement</i> in the array is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeName</i> - The name of this key attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>KeyType</i> - The role that the key attribute will assume:
     *        </p>
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
     *        </note>
     *        <p>
     *        For a simple primary key (partition key), you must provide exactly one element with a <i>KeyType</i> of
     *        <code>HASH</code>.
     *        </p>
     *        <p>
     *        For a composite primary key (partition key and sort key), you must provide exactly two elements, in this
     *        order: The first element must have a <i>KeyType</i> of <code>HASH</code>, and the second element must have
     *        a <i>KeyType</i> of <code>RANGE</code>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key"
     *        >Specifying the Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @param provisionedThroughput
     */
    public CreateTableRequest(java.util.List<AttributeDefinition> attributeDefinitions, String tableName, java.util.List<KeySchemaElement> keySchema,
            ProvisionedThroughput provisionedThroughput) {
        setAttributeDefinitions(attributeDefinitions);
        setTableName(tableName);
        setKeySchema(keySchema);
        setProvisionedThroughput(provisionedThroughput);
    }

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and indexes.
     * </p>
     * 
     * @return An array of attributes that describe the key schema for the table and indexes.
     */

    public java.util.List<AttributeDefinition> getAttributeDefinitions() {
        return attributeDefinitions;
    }

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and indexes.
     * </p>
     * 
     * @param attributeDefinitions
     *        An array of attributes that describe the key schema for the table and indexes.
     */

    public void setAttributeDefinitions(java.util.Collection<AttributeDefinition> attributeDefinitions) {
        if (attributeDefinitions == null) {
            this.attributeDefinitions = null;
            return;
        }

        this.attributeDefinitions = new java.util.ArrayList<AttributeDefinition>(attributeDefinitions);
    }

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and indexes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeDefinitions(java.util.Collection)} or {@link #withAttributeDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param attributeDefinitions
     *        An array of attributes that describe the key schema for the table and indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withAttributeDefinitions(AttributeDefinition... attributeDefinitions) {
        if (this.attributeDefinitions == null) {
            setAttributeDefinitions(new java.util.ArrayList<AttributeDefinition>(attributeDefinitions.length));
        }
        for (AttributeDefinition ele : attributeDefinitions) {
            this.attributeDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of attributes that describe the key schema for the table and indexes.
     * </p>
     * 
     * @param attributeDefinitions
     *        An array of attributes that describe the key schema for the table and indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withAttributeDefinitions(java.util.Collection<AttributeDefinition> attributeDefinitions) {
        setAttributeDefinitions(attributeDefinitions);
        return this;
    }

    /**
     * <p>
     * The name of the table to create.
     * </p>
     * 
     * @param tableName
     *        The name of the table to create.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table to create.
     * </p>
     * 
     * @return The name of the table to create.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table to create.
     * </p>
     * 
     * @param tableName
     *        The name of the table to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * Specifies the attributes that make up the primary key for a table or an index. The attributes in <i>KeySchema</i>
     * must also be defined in the <i>AttributeDefinitions</i> array. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data Model</a> in the
     * <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each <i>KeySchemaElement</i> in the array is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeName</i> - The name of this key attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KeyType</i> - The role that the key attribute will assume:
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
     * For a simple primary key (partition key), you must provide exactly one element with a <i>KeyType</i> of
     * <code>HASH</code>.
     * </p>
     * <p>
     * For a composite primary key (partition key and sort key), you must provide exactly two elements, in this order:
     * The first element must have a <i>KeyType</i> of <code>HASH</code>, and the second element must have a
     * <i>KeyType</i> of <code>RANGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key"
     * >Specifying the Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the attributes that make up the primary key for a table or an index. The attributes in
     *         <i>KeySchema</i> must also be defined in the <i>AttributeDefinitions</i> array. For more information, see
     *         <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data Model</a>
     *         in the <i>Amazon DynamoDB Developer Guide</i>.</p>
     *         <p>
     *         Each <i>KeySchemaElement</i> in the array is composed of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>AttributeName</i> - The name of this key attribute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>KeyType</i> - The role that the key attribute will assume:
     *         </p>
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
     *         </note>
     *         <p>
     *         For a simple primary key (partition key), you must provide exactly one element with a <i>KeyType</i> of
     *         <code>HASH</code>.
     *         </p>
     *         <p>
     *         For a composite primary key (partition key and sort key), you must provide exactly two elements, in this
     *         order: The first element must have a <i>KeyType</i> of <code>HASH</code>, and the second element must
     *         have a <i>KeyType</i> of <code>RANGE</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key"
     *         >Specifying the Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * Specifies the attributes that make up the primary key for a table or an index. The attributes in <i>KeySchema</i>
     * must also be defined in the <i>AttributeDefinitions</i> array. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data Model</a> in the
     * <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each <i>KeySchemaElement</i> in the array is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeName</i> - The name of this key attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KeyType</i> - The role that the key attribute will assume:
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
     * For a simple primary key (partition key), you must provide exactly one element with a <i>KeyType</i> of
     * <code>HASH</code>.
     * </p>
     * <p>
     * For a composite primary key (partition key and sort key), you must provide exactly two elements, in this order:
     * The first element must have a <i>KeyType</i> of <code>HASH</code>, and the second element must have a
     * <i>KeyType</i> of <code>RANGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key"
     * >Specifying the Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param keySchema
     *        Specifies the attributes that make up the primary key for a table or an index. The attributes in
     *        <i>KeySchema</i> must also be defined in the <i>AttributeDefinitions</i> array. For more information, see
     *        <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data Model</a> in
     *        the <i>Amazon DynamoDB Developer Guide</i>.</p>
     *        <p>
     *        Each <i>KeySchemaElement</i> in the array is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeName</i> - The name of this key attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>KeyType</i> - The role that the key attribute will assume:
     *        </p>
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
     *        </note>
     *        <p>
     *        For a simple primary key (partition key), you must provide exactly one element with a <i>KeyType</i> of
     *        <code>HASH</code>.
     *        </p>
     *        <p>
     *        For a composite primary key (partition key and sort key), you must provide exactly two elements, in this
     *        order: The first element must have a <i>KeyType</i> of <code>HASH</code>, and the second element must have
     *        a <i>KeyType</i> of <code>RANGE</code>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key"
     *        >Specifying the Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
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
     * Specifies the attributes that make up the primary key for a table or an index. The attributes in <i>KeySchema</i>
     * must also be defined in the <i>AttributeDefinitions</i> array. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data Model</a> in the
     * <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each <i>KeySchemaElement</i> in the array is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeName</i> - The name of this key attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KeyType</i> - The role that the key attribute will assume:
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
     * For a simple primary key (partition key), you must provide exactly one element with a <i>KeyType</i> of
     * <code>HASH</code>.
     * </p>
     * <p>
     * For a composite primary key (partition key and sort key), you must provide exactly two elements, in this order:
     * The first element must have a <i>KeyType</i> of <code>HASH</code>, and the second element must have a
     * <i>KeyType</i> of <code>RANGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key"
     * >Specifying the Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeySchema(java.util.Collection)} or {@link #withKeySchema(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keySchema
     *        Specifies the attributes that make up the primary key for a table or an index. The attributes in
     *        <i>KeySchema</i> must also be defined in the <i>AttributeDefinitions</i> array. For more information, see
     *        <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data Model</a> in
     *        the <i>Amazon DynamoDB Developer Guide</i>.</p>
     *        <p>
     *        Each <i>KeySchemaElement</i> in the array is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeName</i> - The name of this key attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>KeyType</i> - The role that the key attribute will assume:
     *        </p>
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
     *        </note>
     *        <p>
     *        For a simple primary key (partition key), you must provide exactly one element with a <i>KeyType</i> of
     *        <code>HASH</code>.
     *        </p>
     *        <p>
     *        For a composite primary key (partition key and sort key), you must provide exactly two elements, in this
     *        order: The first element must have a <i>KeyType</i> of <code>HASH</code>, and the second element must have
     *        a <i>KeyType</i> of <code>RANGE</code>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key"
     *        >Specifying the Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withKeySchema(KeySchemaElement... keySchema) {
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
     * Specifies the attributes that make up the primary key for a table or an index. The attributes in <i>KeySchema</i>
     * must also be defined in the <i>AttributeDefinitions</i> array. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data Model</a> in the
     * <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Each <i>KeySchemaElement</i> in the array is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeName</i> - The name of this key attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>KeyType</i> - The role that the key attribute will assume:
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
     * For a simple primary key (partition key), you must provide exactly one element with a <i>KeyType</i> of
     * <code>HASH</code>.
     * </p>
     * <p>
     * For a composite primary key (partition key and sort key), you must provide exactly two elements, in this order:
     * The first element must have a <i>KeyType</i> of <code>HASH</code>, and the second element must have a
     * <i>KeyType</i> of <code>RANGE</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key"
     * >Specifying the Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param keySchema
     *        Specifies the attributes that make up the primary key for a table or an index. The attributes in
     *        <i>KeySchema</i> must also be defined in the <i>AttributeDefinitions</i> array. For more information, see
     *        <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data Model</a> in
     *        the <i>Amazon DynamoDB Developer Guide</i>.</p>
     *        <p>
     *        Each <i>KeySchemaElement</i> in the array is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeName</i> - The name of this key attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>KeyType</i> - The role that the key attribute will assume:
     *        </p>
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
     *        </note>
     *        <p>
     *        For a simple primary key (partition key), you must provide exactly one element with a <i>KeyType</i> of
     *        <code>HASH</code>.
     *        </p>
     *        <p>
     *        For a composite primary key (partition key and sort key), you must provide exactly two elements, in this
     *        order: The first element must have a <i>KeyType</i> of <code>HASH</code>, and the second element must have
     *        a <i>KeyType</i> of <code>RANGE</code>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key"
     *        >Specifying the Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * One or more local secondary indexes (the maximum is five) to be created on the table. Each index is scoped to a
     * given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size of a local
     * secondary index is unconstrained.
     * </p>
     * <p>
     * Each local secondary index in the array includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>IndexName</i> - The name of the local secondary index. Must be unique only for this table.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <i>KeySchema</i> - Specifies the key schema for the local secondary index. The key schema must begin with the
     * same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ProjectionType</i> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <i>NonKeyAttributes</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the secondary
     * index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of the secondary
     * indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two
     * distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return One or more local secondary indexes (the maximum is five) to be created on the table. Each index is
     *         scoped to a given partition key value. There is a 10 GB size limit per partition key value; otherwise,
     *         the size of a local secondary index is unconstrained.</p>
     *         <p>
     *         Each local secondary index in the array includes the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>IndexName</i> - The name of the local secondary index. Must be unique only for this table.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <i>KeySchema</i> - Specifies the key schema for the local secondary index. The key schema must begin with
     *         the same partition key as the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These
     *         are in addition to the primary key attributes and index key attributes, which are automatically
     *         projected. Each attribute specification is composed of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>ProjectionType</i> - One of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of
     *         projected attributes are in <i>NonKeyAttributes</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code> - All of the table attributes are projected into the index.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the
     *         secondary index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of
     *         the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
     *         this counts as two distinct attributes when determining the total.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public java.util.List<LocalSecondaryIndex> getLocalSecondaryIndexes() {
        return localSecondaryIndexes;
    }

    /**
     * <p>
     * One or more local secondary indexes (the maximum is five) to be created on the table. Each index is scoped to a
     * given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size of a local
     * secondary index is unconstrained.
     * </p>
     * <p>
     * Each local secondary index in the array includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>IndexName</i> - The name of the local secondary index. Must be unique only for this table.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <i>KeySchema</i> - Specifies the key schema for the local secondary index. The key schema must begin with the
     * same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ProjectionType</i> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <i>NonKeyAttributes</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the secondary
     * index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of the secondary
     * indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two
     * distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param localSecondaryIndexes
     *        One or more local secondary indexes (the maximum is five) to be created on the table. Each index is scoped
     *        to a given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size
     *        of a local secondary index is unconstrained.</p>
     *        <p>
     *        Each local secondary index in the array includes the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>IndexName</i> - The name of the local secondary index. Must be unique only for this table.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <i>KeySchema</i> - Specifies the key schema for the local secondary index. The key schema must begin with
     *        the same partition key as the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These
     *        are in addition to the primary key attributes and index key attributes, which are automatically projected.
     *        Each attribute specification is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>ProjectionType</i> - One of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of
     *        projected attributes are in <i>NonKeyAttributes</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - All of the table attributes are projected into the index.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the
     *        secondary index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of
     *        the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
     *        this counts as two distinct attributes when determining the total.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setLocalSecondaryIndexes(java.util.Collection<LocalSecondaryIndex> localSecondaryIndexes) {
        if (localSecondaryIndexes == null) {
            this.localSecondaryIndexes = null;
            return;
        }

        this.localSecondaryIndexes = new java.util.ArrayList<LocalSecondaryIndex>(localSecondaryIndexes);
    }

    /**
     * <p>
     * One or more local secondary indexes (the maximum is five) to be created on the table. Each index is scoped to a
     * given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size of a local
     * secondary index is unconstrained.
     * </p>
     * <p>
     * Each local secondary index in the array includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>IndexName</i> - The name of the local secondary index. Must be unique only for this table.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <i>KeySchema</i> - Specifies the key schema for the local secondary index. The key schema must begin with the
     * same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ProjectionType</i> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <i>NonKeyAttributes</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the secondary
     * index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of the secondary
     * indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two
     * distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocalSecondaryIndexes(java.util.Collection)} or
     * {@link #withLocalSecondaryIndexes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param localSecondaryIndexes
     *        One or more local secondary indexes (the maximum is five) to be created on the table. Each index is scoped
     *        to a given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size
     *        of a local secondary index is unconstrained.</p>
     *        <p>
     *        Each local secondary index in the array includes the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>IndexName</i> - The name of the local secondary index. Must be unique only for this table.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <i>KeySchema</i> - Specifies the key schema for the local secondary index. The key schema must begin with
     *        the same partition key as the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These
     *        are in addition to the primary key attributes and index key attributes, which are automatically projected.
     *        Each attribute specification is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>ProjectionType</i> - One of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of
     *        projected attributes are in <i>NonKeyAttributes</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - All of the table attributes are projected into the index.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the
     *        secondary index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of
     *        the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
     *        this counts as two distinct attributes when determining the total.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withLocalSecondaryIndexes(LocalSecondaryIndex... localSecondaryIndexes) {
        if (this.localSecondaryIndexes == null) {
            setLocalSecondaryIndexes(new java.util.ArrayList<LocalSecondaryIndex>(localSecondaryIndexes.length));
        }
        for (LocalSecondaryIndex ele : localSecondaryIndexes) {
            this.localSecondaryIndexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more local secondary indexes (the maximum is five) to be created on the table. Each index is scoped to a
     * given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size of a local
     * secondary index is unconstrained.
     * </p>
     * <p>
     * Each local secondary index in the array includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>IndexName</i> - The name of the local secondary index. Must be unique only for this table.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <i>KeySchema</i> - Specifies the key schema for the local secondary index. The key schema must begin with the
     * same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ProjectionType</i> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <i>NonKeyAttributes</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the secondary
     * index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of the secondary
     * indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two
     * distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param localSecondaryIndexes
     *        One or more local secondary indexes (the maximum is five) to be created on the table. Each index is scoped
     *        to a given partition key value. There is a 10 GB size limit per partition key value; otherwise, the size
     *        of a local secondary index is unconstrained.</p>
     *        <p>
     *        Each local secondary index in the array includes the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>IndexName</i> - The name of the local secondary index. Must be unique only for this table.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <i>KeySchema</i> - Specifies the key schema for the local secondary index. The key schema must begin with
     *        the same partition key as the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These
     *        are in addition to the primary key attributes and index key attributes, which are automatically projected.
     *        Each attribute specification is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>ProjectionType</i> - One of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of
     *        projected attributes are in <i>NonKeyAttributes</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - All of the table attributes are projected into the index.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the
     *        secondary index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of
     *        the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
     *        this counts as two distinct attributes when determining the total.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withLocalSecondaryIndexes(java.util.Collection<LocalSecondaryIndex> localSecondaryIndexes) {
        setLocalSecondaryIndexes(localSecondaryIndexes);
        return this;
    }

    /**
     * <p>
     * One or more global secondary indexes (the maximum is five) to be created on the table. Each global secondary
     * index in the array includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>IndexName</i> - The name of the global secondary index. Must be unique only for this table.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <i>KeySchema</i> - Specifies the key schema for the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ProjectionType</i> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <i>NonKeyAttributes</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the secondary
     * index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of the secondary
     * indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two
     * distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>ProvisionedThroughput</i> - The provisioned throughput settings for the global secondary index, consisting of
     * read and write capacity units.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more global secondary indexes (the maximum is five) to be created on the table. Each global
     *         secondary index in the array includes the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>IndexName</i> - The name of the global secondary index. Must be unique only for this table.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <i>KeySchema</i> - Specifies the key schema for the global secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These
     *         are in addition to the primary key attributes and index key attributes, which are automatically
     *         projected. Each attribute specification is composed of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>ProjectionType</i> - One of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of
     *         projected attributes are in <i>NonKeyAttributes</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code> - All of the table attributes are projected into the index.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the
     *         secondary index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of
     *         the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
     *         this counts as two distinct attributes when determining the total.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <i>ProvisionedThroughput</i> - The provisioned throughput settings for the global secondary index,
     *         consisting of read and write capacity units.
     *         </p>
     *         </li>
     */

    public java.util.List<GlobalSecondaryIndex> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * <p>
     * One or more global secondary indexes (the maximum is five) to be created on the table. Each global secondary
     * index in the array includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>IndexName</i> - The name of the global secondary index. Must be unique only for this table.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <i>KeySchema</i> - Specifies the key schema for the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ProjectionType</i> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <i>NonKeyAttributes</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the secondary
     * index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of the secondary
     * indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two
     * distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>ProvisionedThroughput</i> - The provisioned throughput settings for the global secondary index, consisting of
     * read and write capacity units.
     * </p>
     * </li>
     * </ul>
     * 
     * @param globalSecondaryIndexes
     *        One or more global secondary indexes (the maximum is five) to be created on the table. Each global
     *        secondary index in the array includes the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>IndexName</i> - The name of the global secondary index. Must be unique only for this table.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <i>KeySchema</i> - Specifies the key schema for the global secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These
     *        are in addition to the primary key attributes and index key attributes, which are automatically projected.
     *        Each attribute specification is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>ProjectionType</i> - One of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of
     *        projected attributes are in <i>NonKeyAttributes</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - All of the table attributes are projected into the index.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the
     *        secondary index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of
     *        the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
     *        this counts as two distinct attributes when determining the total.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ProvisionedThroughput</i> - The provisioned throughput settings for the global secondary index,
     *        consisting of read and write capacity units.
     *        </p>
     *        </li>
     */

    public void setGlobalSecondaryIndexes(java.util.Collection<GlobalSecondaryIndex> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<GlobalSecondaryIndex>(globalSecondaryIndexes);
    }

    /**
     * <p>
     * One or more global secondary indexes (the maximum is five) to be created on the table. Each global secondary
     * index in the array includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>IndexName</i> - The name of the global secondary index. Must be unique only for this table.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <i>KeySchema</i> - Specifies the key schema for the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ProjectionType</i> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <i>NonKeyAttributes</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the secondary
     * index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of the secondary
     * indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two
     * distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>ProvisionedThroughput</i> - The provisioned throughput settings for the global secondary index, consisting of
     * read and write capacity units.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalSecondaryIndexes(java.util.Collection)} or
     * {@link #withGlobalSecondaryIndexes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        One or more global secondary indexes (the maximum is five) to be created on the table. Each global
     *        secondary index in the array includes the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>IndexName</i> - The name of the global secondary index. Must be unique only for this table.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <i>KeySchema</i> - Specifies the key schema for the global secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These
     *        are in addition to the primary key attributes and index key attributes, which are automatically projected.
     *        Each attribute specification is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>ProjectionType</i> - One of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of
     *        projected attributes are in <i>NonKeyAttributes</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - All of the table attributes are projected into the index.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the
     *        secondary index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of
     *        the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
     *        this counts as two distinct attributes when determining the total.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ProvisionedThroughput</i> - The provisioned throughput settings for the global secondary index,
     *        consisting of read and write capacity units.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withGlobalSecondaryIndexes(GlobalSecondaryIndex... globalSecondaryIndexes) {
        if (this.globalSecondaryIndexes == null) {
            setGlobalSecondaryIndexes(new java.util.ArrayList<GlobalSecondaryIndex>(globalSecondaryIndexes.length));
        }
        for (GlobalSecondaryIndex ele : globalSecondaryIndexes) {
            this.globalSecondaryIndexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more global secondary indexes (the maximum is five) to be created on the table. Each global secondary
     * index in the array includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>IndexName</i> - The name of the global secondary index. Must be unique only for this table.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <i>KeySchema</i> - Specifies the key schema for the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These are in
     * addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>ProjectionType</i> - One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected
     * attributes are in <i>NonKeyAttributes</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code> - All of the table attributes are projected into the index.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the secondary
     * index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of the secondary
     * indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two
     * distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>ProvisionedThroughput</i> - The provisioned throughput settings for the global secondary index, consisting of
     * read and write capacity units.
     * </p>
     * </li>
     * </ul>
     * 
     * @param globalSecondaryIndexes
     *        One or more global secondary indexes (the maximum is five) to be created on the table. Each global
     *        secondary index in the array includes the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>IndexName</i> - The name of the global secondary index. Must be unique only for this table.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <i>KeySchema</i> - Specifies the key schema for the global secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Projection</i> - Specifies attributes that are copied (projected) from the table into the index. These
     *        are in addition to the primary key attributes and index key attributes, which are automatically projected.
     *        Each attribute specification is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>ProjectionType</i> - One of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of
     *        projected attributes are in <i>NonKeyAttributes</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code> - All of the table attributes are projected into the index.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NonKeyAttributes</i> - A list of one or more non-key attribute names that are projected into the
     *        secondary index. The total count of attributes provided in <i>NonKeyAttributes</i>, summed across all of
     *        the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes,
     *        this counts as two distinct attributes when determining the total.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ProvisionedThroughput</i> - The provisioned throughput settings for the global secondary index,
     *        consisting of read and write capacity units.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withGlobalSecondaryIndexes(java.util.Collection<GlobalSecondaryIndex> globalSecondaryIndexes) {
        setGlobalSecondaryIndexes(globalSecondaryIndexes);
        return this;
    }

    /**
     * @param provisionedThroughput
     */

    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * @return
     */

    public ProvisionedThroughput getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    /**
     * @param provisionedThroughput
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        setProvisionedThroughput(provisionedThroughput);
        return this;
    }

    /**
     * <p>
     * The settings for DynamoDB Streams on the table. These settings consist of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>StreamEnabled</i> - Indicates whether Streams is to be enabled (true) or disabled (false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what information
     * is written to the table's stream. Valid values for <i>StreamViewType</i> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param streamSpecification
     *        The settings for DynamoDB Streams on the table. These settings consist of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>StreamEnabled</i> - Indicates whether Streams is to be enabled (true) or disabled (false).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what
     *        information is written to the table's stream. Valid values for <i>StreamViewType</i> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setStreamSpecification(StreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
    }

    /**
     * <p>
     * The settings for DynamoDB Streams on the table. These settings consist of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>StreamEnabled</i> - Indicates whether Streams is to be enabled (true) or disabled (false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what information
     * is written to the table's stream. Valid values for <i>StreamViewType</i> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The settings for DynamoDB Streams on the table. These settings consist of:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>StreamEnabled</i> - Indicates whether Streams is to be enabled (true) or disabled (false).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what
     *         information is written to the table's stream. Valid values for <i>StreamViewType</i> are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public StreamSpecification getStreamSpecification() {
        return this.streamSpecification;
    }

    /**
     * <p>
     * The settings for DynamoDB Streams on the table. These settings consist of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>StreamEnabled</i> - Indicates whether Streams is to be enabled (true) or disabled (false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what information
     * is written to the table's stream. Valid values for <i>StreamViewType</i> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param streamSpecification
     *        The settings for DynamoDB Streams on the table. These settings consist of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>StreamEnabled</i> - Indicates whether Streams is to be enabled (true) or disabled (false).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what
     *        information is written to the table's stream. Valid values for <i>StreamViewType</i> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withStreamSpecification(StreamSpecification streamSpecification) {
        setStreamSpecification(streamSpecification);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttributeDefinitions() != null)
            sb.append("AttributeDefinitions: " + getAttributeDefinitions() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getKeySchema() != null)
            sb.append("KeySchema: " + getKeySchema() + ",");
        if (getLocalSecondaryIndexes() != null)
            sb.append("LocalSecondaryIndexes: " + getLocalSecondaryIndexes() + ",");
        if (getGlobalSecondaryIndexes() != null)
            sb.append("GlobalSecondaryIndexes: " + getGlobalSecondaryIndexes() + ",");
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: " + getProvisionedThroughput() + ",");
        if (getStreamSpecification() != null)
            sb.append("StreamSpecification: " + getStreamSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTableRequest == false)
            return false;
        CreateTableRequest other = (CreateTableRequest) obj;
        if (other.getAttributeDefinitions() == null ^ this.getAttributeDefinitions() == null)
            return false;
        if (other.getAttributeDefinitions() != null && other.getAttributeDefinitions().equals(this.getAttributeDefinitions()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getKeySchema() == null ^ this.getKeySchema() == null)
            return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false)
            return false;
        if (other.getLocalSecondaryIndexes() == null ^ this.getLocalSecondaryIndexes() == null)
            return false;
        if (other.getLocalSecondaryIndexes() != null && other.getLocalSecondaryIndexes().equals(this.getLocalSecondaryIndexes()) == false)
            return false;
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null)
            return false;
        if (other.getGlobalSecondaryIndexes() != null && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false)
            return false;
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false)
            return false;
        if (other.getStreamSpecification() == null ^ this.getStreamSpecification() == null)
            return false;
        if (other.getStreamSpecification() != null && other.getStreamSpecification().equals(this.getStreamSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeDefinitions() == null) ? 0 : getAttributeDefinitions().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode());
        hashCode = prime * hashCode + ((getLocalSecondaryIndexes() == null) ? 0 : getLocalSecondaryIndexes().hashCode());
        hashCode = prime * hashCode + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        hashCode = prime * hashCode + ((getStreamSpecification() == null) ? 0 : getStreamSpecification().hashCode());
        return hashCode;
    }

    @Override
    public CreateTableRequest clone() {
        return (CreateTableRequest) super.clone();
    }
}
