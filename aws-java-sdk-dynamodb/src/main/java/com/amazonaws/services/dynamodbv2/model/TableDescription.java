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
 * Represents the properties of a table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TableDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of <code>AttributeDefinition</code> objects. Each of these objects describes one attribute in the table
     * and index key schema.
     * </p>
     * <p>
     * Each <code>AttributeDefinition</code> object in this array is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeType</code> - The data type for the attribute.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<AttributeDefinition> attributeDefinitions;
    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The primary key structure for the table. Each <code>KeySchemaElement</code> consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyType</code> - The role of the attribute:
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
     * </note></li>
     * </ul>
     * <p>
     * For more information about primary keys, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.List<KeySchemaElement> keySchema;
    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     */
    private String tableStatus;
    /**
     * <p>
     * The date and time when the table was created, in <a href="http://www.epochconverter.com/">UNIX epoch time</a>
     * format.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The provisioned throughput settings for the table, consisting of read and write capacity units, along with data
     * about increases and decreases.
     * </p>
     */
    private ProvisionedThroughputDescription provisionedThroughput;
    /**
     * <p>
     * The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours.
     * Recent changes might not be reflected in this value.
     * </p>
     */
    private Long tableSizeBytes;
    /**
     * <p>
     * The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     */
    private Long itemCount;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the table.
     * </p>
     */
    private String tableArn;
    /**
     * <p>
     * Unique identifier for the table for which the backup was created.
     * </p>
     */
    private String tableId;
    /**
     * <p>
     * Contains the details for the read/write capacity mode.
     * </p>
     */
    private BillingModeSummary billingModeSummary;
    /**
     * <p>
     * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value.
     * Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of
     * data within a given item collection cannot exceed 10 GB. Each element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the local secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be
     * between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These
     * are in addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
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
     * attributes are in <code>NonKeyAttributes</code>.
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
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     * secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of
     * the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this
     * counts as two distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - Represents the total size of the index, in bytes. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - Represents the number of items in the index. DynamoDB updates this value approximately
     * every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * </p>
     */
    private java.util.List<LocalSecondaryIndexDescription> localSecondaryIndexes;
    /**
     * <p>
     * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each
     * element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Backfilling</code> - If true, then the index is currently in the backfilling phase. Backfilling occurs only
     * when a new global secondary index is added to the table; it is the process by which DynamoDB populates the new
     * index with data from the table. (This attribute does not appear for indexes that were created during a
     * <code>CreateTable</code> operation.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - The total size of the global secondary index, in bytes. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexStatus</code> - The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - The number of items in the global secondary index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be
     * between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These
     * are in addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
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
     * attributes are in <code>NonKeyAttributes</code>.
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
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     * secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of
     * the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this
     * counts as two distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index,
     * consisting of read and write capacity units, along with data about increases and decreases.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * </p>
     */
    private java.util.List<GlobalSecondaryIndexDescription> globalSecondaryIndexes;
    /**
     * <p>
     * The current DynamoDB Streams configuration for the table.
     * </p>
     */
    private StreamSpecification streamSpecification;
    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible that a
     * stream from another table might have the same timestamp. However, the combination of the following three elements
     * is guaranteed to be unique:
     * </p>
     * <ul>
     * <li>
     * <p>
     * the AWS customer ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * the table name.
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>StreamLabel</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String latestStreamLabel;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
     * </p>
     */
    private String latestStreamArn;
    /**
     * <p>
     * Contains details for the restore.
     * </p>
     */
    private RestoreSummary restoreSummary;
    /**
     * <p>
     * The description of the server-side encryption status on the specified table.
     * </p>
     */
    private SSEDescription sSEDescription;

    /**
     * <p>
     * An array of <code>AttributeDefinition</code> objects. Each of these objects describes one attribute in the table
     * and index key schema.
     * </p>
     * <p>
     * Each <code>AttributeDefinition</code> object in this array is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeType</code> - The data type for the attribute.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of <code>AttributeDefinition</code> objects. Each of these objects describes one attribute in
     *         the table and index key schema.</p>
     *         <p>
     *         Each <code>AttributeDefinition</code> object in this array is composed of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AttributeName</code> - The name of the attribute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AttributeType</code> - The data type for the attribute.
     *         </p>
     *         </li>
     */

    public java.util.List<AttributeDefinition> getAttributeDefinitions() {
        return attributeDefinitions;
    }

    /**
     * <p>
     * An array of <code>AttributeDefinition</code> objects. Each of these objects describes one attribute in the table
     * and index key schema.
     * </p>
     * <p>
     * Each <code>AttributeDefinition</code> object in this array is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeType</code> - The data type for the attribute.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributeDefinitions
     *        An array of <code>AttributeDefinition</code> objects. Each of these objects describes one attribute in the
     *        table and index key schema.</p>
     *        <p>
     *        Each <code>AttributeDefinition</code> object in this array is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AttributeName</code> - The name of the attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AttributeType</code> - The data type for the attribute.
     *        </p>
     *        </li>
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
     * An array of <code>AttributeDefinition</code> objects. Each of these objects describes one attribute in the table
     * and index key schema.
     * </p>
     * <p>
     * Each <code>AttributeDefinition</code> object in this array is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeType</code> - The data type for the attribute.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeDefinitions(java.util.Collection)} or {@link #withAttributeDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param attributeDefinitions
     *        An array of <code>AttributeDefinition</code> objects. Each of these objects describes one attribute in the
     *        table and index key schema.</p>
     *        <p>
     *        Each <code>AttributeDefinition</code> object in this array is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AttributeName</code> - The name of the attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AttributeType</code> - The data type for the attribute.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withAttributeDefinitions(AttributeDefinition... attributeDefinitions) {
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
     * An array of <code>AttributeDefinition</code> objects. Each of these objects describes one attribute in the table
     * and index key schema.
     * </p>
     * <p>
     * Each <code>AttributeDefinition</code> object in this array is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeType</code> - The data type for the attribute.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributeDefinitions
     *        An array of <code>AttributeDefinition</code> objects. Each of these objects describes one attribute in the
     *        table and index key schema.</p>
     *        <p>
     *        Each <code>AttributeDefinition</code> object in this array is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AttributeName</code> - The name of the attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AttributeType</code> - The data type for the attribute.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withAttributeDefinitions(java.util.Collection<AttributeDefinition> attributeDefinitions) {
        setAttributeDefinitions(attributeDefinitions);
        return this;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The primary key structure for the table. Each <code>KeySchemaElement</code> consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyType</code> - The role of the attribute:
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
     * </note></li>
     * </ul>
     * <p>
     * For more information about primary keys, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return The primary key structure for the table. Each <code>KeySchemaElement</code> consists of:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AttributeName</code> - The name of the attribute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KeyType</code> - The role of the attribute:
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
     *         </note></li>
     *         </ul>
     *         <p>
     *         For more information about primary keys, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *         >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * The primary key structure for the table. Each <code>KeySchemaElement</code> consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyType</code> - The role of the attribute:
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
     * </note></li>
     * </ul>
     * <p>
     * For more information about primary keys, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param keySchema
     *        The primary key structure for the table. Each <code>KeySchemaElement</code> consists of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AttributeName</code> - The name of the attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KeyType</code> - The role of the attribute:
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
     *        </note></li>
     *        </ul>
     *        <p>
     *        For more information about primary keys, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *        >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
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
     * The primary key structure for the table. Each <code>KeySchemaElement</code> consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyType</code> - The role of the attribute:
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
     * </note></li>
     * </ul>
     * <p>
     * For more information about primary keys, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeySchema(java.util.Collection)} or {@link #withKeySchema(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keySchema
     *        The primary key structure for the table. Each <code>KeySchemaElement</code> consists of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AttributeName</code> - The name of the attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KeyType</code> - The role of the attribute:
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
     *        </note></li>
     *        </ul>
     *        <p>
     *        For more information about primary keys, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *        >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withKeySchema(KeySchemaElement... keySchema) {
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
     * The primary key structure for the table. Each <code>KeySchemaElement</code> consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AttributeName</code> - The name of the attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyType</code> - The role of the attribute:
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
     * </note></li>
     * </ul>
     * <p>
     * For more information about primary keys, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     * >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param keySchema
     *        The primary key structure for the table. Each <code>KeySchemaElement</code> consists of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AttributeName</code> - The name of the attribute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KeyType</code> - The role of the attribute:
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
     *        </note></li>
     *        </ul>
     *        <p>
     *        For more information about primary keys, see <a href=
     *        "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey"
     *        >Primary Key</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tableStatus
     *        The current state of the table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The table is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The table is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The table is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The table is ready for use.
     *        </p>
     *        </li>
     * @see TableStatus
     */

    public void setTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the table:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The table is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The table is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The table is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The table is ready for use.
     *         </p>
     *         </li>
     * @see TableStatus
     */

    public String getTableStatus() {
        return this.tableStatus;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tableStatus
     *        The current state of the table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The table is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The table is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The table is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The table is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableStatus
     */

    public TableDescription withTableStatus(String tableStatus) {
        setTableStatus(tableStatus);
        return this;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tableStatus
     *        The current state of the table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The table is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The table is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The table is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The table is ready for use.
     *        </p>
     *        </li>
     * @see TableStatus
     */

    public void setTableStatus(TableStatus tableStatus) {
        withTableStatus(tableStatus);
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tableStatus
     *        The current state of the table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The table is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The table is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The table is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The table is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableStatus
     */

    public TableDescription withTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the table was created, in <a href="http://www.epochconverter.com/">UNIX epoch time</a>
     * format.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the table was created, in <a href="http://www.epochconverter.com/">UNIX epoch
     *        time</a> format.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time when the table was created, in <a href="http://www.epochconverter.com/">UNIX epoch time</a>
     * format.
     * </p>
     * 
     * @return The date and time when the table was created, in <a href="http://www.epochconverter.com/">UNIX epoch
     *         time</a> format.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time when the table was created, in <a href="http://www.epochconverter.com/">UNIX epoch time</a>
     * format.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the table was created, in <a href="http://www.epochconverter.com/">UNIX epoch
     *        time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The provisioned throughput settings for the table, consisting of read and write capacity units, along with data
     * about increases and decreases.
     * </p>
     * 
     * @param provisionedThroughput
     *        The provisioned throughput settings for the table, consisting of read and write capacity units, along with
     *        data about increases and decreases.
     */

    public void setProvisionedThroughput(ProvisionedThroughputDescription provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * <p>
     * The provisioned throughput settings for the table, consisting of read and write capacity units, along with data
     * about increases and decreases.
     * </p>
     * 
     * @return The provisioned throughput settings for the table, consisting of read and write capacity units, along
     *         with data about increases and decreases.
     */

    public ProvisionedThroughputDescription getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    /**
     * <p>
     * The provisioned throughput settings for the table, consisting of read and write capacity units, along with data
     * about increases and decreases.
     * </p>
     * 
     * @param provisionedThroughput
     *        The provisioned throughput settings for the table, consisting of read and write capacity units, along with
     *        data about increases and decreases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withProvisionedThroughput(ProvisionedThroughputDescription provisionedThroughput) {
        setProvisionedThroughput(provisionedThroughput);
        return this;
    }

    /**
     * <p>
     * The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours.
     * Recent changes might not be reflected in this value.
     * </p>
     * 
     * @param tableSizeBytes
     *        The total size of the specified table, in bytes. DynamoDB updates this value approximately every six
     *        hours. Recent changes might not be reflected in this value.
     */

    public void setTableSizeBytes(Long tableSizeBytes) {
        this.tableSizeBytes = tableSizeBytes;
    }

    /**
     * <p>
     * The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours.
     * Recent changes might not be reflected in this value.
     * </p>
     * 
     * @return The total size of the specified table, in bytes. DynamoDB updates this value approximately every six
     *         hours. Recent changes might not be reflected in this value.
     */

    public Long getTableSizeBytes() {
        return this.tableSizeBytes;
    }

    /**
     * <p>
     * The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours.
     * Recent changes might not be reflected in this value.
     * </p>
     * 
     * @param tableSizeBytes
     *        The total size of the specified table, in bytes. DynamoDB updates this value approximately every six
     *        hours. Recent changes might not be reflected in this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withTableSizeBytes(Long tableSizeBytes) {
        setTableSizeBytes(tableSizeBytes);
        return this;
    }

    /**
     * <p>
     * The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * 
     * @param itemCount
     *        The number of items in the specified table. DynamoDB updates this value approximately every six hours.
     *        Recent changes might not be reflected in this value.
     */

    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * 
     * @return The number of items in the specified table. DynamoDB updates this value approximately every six hours.
     *         Recent changes might not be reflected in this value.
     */

    public Long getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent
     * changes might not be reflected in this value.
     * </p>
     * 
     * @param itemCount
     *        The number of items in the specified table. DynamoDB updates this value approximately every six hours.
     *        Recent changes might not be reflected in this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withItemCount(Long itemCount) {
        setItemCount(itemCount);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the table.
     * </p>
     * 
     * @param tableArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the table.
     */

    public void setTableArn(String tableArn) {
        this.tableArn = tableArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the table.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that uniquely identifies the table.
     */

    public String getTableArn() {
        return this.tableArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the table.
     * </p>
     * 
     * @param tableArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withTableArn(String tableArn) {
        setTableArn(tableArn);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the table for which the backup was created.
     * </p>
     * 
     * @param tableId
     *        Unique identifier for the table for which the backup was created.
     */

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * <p>
     * Unique identifier for the table for which the backup was created.
     * </p>
     * 
     * @return Unique identifier for the table for which the backup was created.
     */

    public String getTableId() {
        return this.tableId;
    }

    /**
     * <p>
     * Unique identifier for the table for which the backup was created.
     * </p>
     * 
     * @param tableId
     *        Unique identifier for the table for which the backup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withTableId(String tableId) {
        setTableId(tableId);
        return this;
    }

    /**
     * <p>
     * Contains the details for the read/write capacity mode.
     * </p>
     * 
     * @param billingModeSummary
     *        Contains the details for the read/write capacity mode.
     */

    public void setBillingModeSummary(BillingModeSummary billingModeSummary) {
        this.billingModeSummary = billingModeSummary;
    }

    /**
     * <p>
     * Contains the details for the read/write capacity mode.
     * </p>
     * 
     * @return Contains the details for the read/write capacity mode.
     */

    public BillingModeSummary getBillingModeSummary() {
        return this.billingModeSummary;
    }

    /**
     * <p>
     * Contains the details for the read/write capacity mode.
     * </p>
     * 
     * @param billingModeSummary
     *        Contains the details for the read/write capacity mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withBillingModeSummary(BillingModeSummary billingModeSummary) {
        setBillingModeSummary(billingModeSummary);
        return this;
    }

    /**
     * <p>
     * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value.
     * Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of
     * data within a given item collection cannot exceed 10 GB. Each element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the local secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be
     * between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These
     * are in addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
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
     * attributes are in <code>NonKeyAttributes</code>.
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
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     * secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of
     * the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this
     * counts as two distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - Represents the total size of the index, in bytes. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - Represents the number of items in the index. DynamoDB updates this value approximately
     * every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * </p>
     * 
     * @return Represents one or more local secondary indexes on the table. Each index is scoped to a given partition
     *         key value. Tables with one or more local secondary indexes are subject to an item collection size limit,
     *         where the amount of data within a given item collection cannot exceed 10 GB. Each element is composed
     *         of:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IndexName</code> - The name of the local secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema
     *         must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key
     *         as the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index.
     *         These are in addition to the primary key attributes and index key attributes, which are automatically
     *         projected. Each attribute specification is composed of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ProjectionType</code> - One of the following:
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
     *         projected attributes are in <code>NonKeyAttributes</code>.
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
     *         <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     *         secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across
     *         all of the secondary indexes, must not exceed 20. If you project the same attribute into two different
     *         indexes, this counts as two distinct attributes when determining the total.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IndexSizeBytes</code> - Represents the total size of the index, in bytes. DynamoDB updates this
     *         value approximately every six hours. Recent changes might not be reflected in this value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ItemCount</code> - Represents the number of items in the index. DynamoDB updates this value
     *         approximately every six hours. Recent changes might not be reflected in this value.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     */

    public java.util.List<LocalSecondaryIndexDescription> getLocalSecondaryIndexes() {
        return localSecondaryIndexes;
    }

    /**
     * <p>
     * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value.
     * Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of
     * data within a given item collection cannot exceed 10 GB. Each element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the local secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be
     * between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These
     * are in addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
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
     * attributes are in <code>NonKeyAttributes</code>.
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
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     * secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of
     * the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this
     * counts as two distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - Represents the total size of the index, in bytes. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - Represents the number of items in the index. DynamoDB updates this value approximately
     * every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * </p>
     * 
     * @param localSecondaryIndexes
     *        Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key
     *        value. Tables with one or more local secondary indexes are subject to an item collection size limit, where
     *        the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IndexName</code> - The name of the local secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema
     *        must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as
     *        the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index.
     *        These are in addition to the primary key attributes and index key attributes, which are automatically
     *        projected. Each attribute specification is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ProjectionType</code> - One of the following:
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
     *        projected attributes are in <code>NonKeyAttributes</code>.
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
     *        <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     *        secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across
     *        all of the secondary indexes, must not exceed 20. If you project the same attribute into two different
     *        indexes, this counts as two distinct attributes when determining the total.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IndexSizeBytes</code> - Represents the total size of the index, in bytes. DynamoDB updates this
     *        value approximately every six hours. Recent changes might not be reflected in this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ItemCount</code> - Represents the number of items in the index. DynamoDB updates this value
     *        approximately every six hours. Recent changes might not be reflected in this value.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     */

    public void setLocalSecondaryIndexes(java.util.Collection<LocalSecondaryIndexDescription> localSecondaryIndexes) {
        if (localSecondaryIndexes == null) {
            this.localSecondaryIndexes = null;
            return;
        }

        this.localSecondaryIndexes = new java.util.ArrayList<LocalSecondaryIndexDescription>(localSecondaryIndexes);
    }

    /**
     * <p>
     * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value.
     * Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of
     * data within a given item collection cannot exceed 10 GB. Each element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the local secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be
     * between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These
     * are in addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
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
     * attributes are in <code>NonKeyAttributes</code>.
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
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     * secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of
     * the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this
     * counts as two distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - Represents the total size of the index, in bytes. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - Represents the number of items in the index. DynamoDB updates this value approximately
     * every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocalSecondaryIndexes(java.util.Collection)} or
     * {@link #withLocalSecondaryIndexes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param localSecondaryIndexes
     *        Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key
     *        value. Tables with one or more local secondary indexes are subject to an item collection size limit, where
     *        the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IndexName</code> - The name of the local secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema
     *        must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as
     *        the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index.
     *        These are in addition to the primary key attributes and index key attributes, which are automatically
     *        projected. Each attribute specification is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ProjectionType</code> - One of the following:
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
     *        projected attributes are in <code>NonKeyAttributes</code>.
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
     *        <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     *        secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across
     *        all of the secondary indexes, must not exceed 20. If you project the same attribute into two different
     *        indexes, this counts as two distinct attributes when determining the total.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IndexSizeBytes</code> - Represents the total size of the index, in bytes. DynamoDB updates this
     *        value approximately every six hours. Recent changes might not be reflected in this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ItemCount</code> - Represents the number of items in the index. DynamoDB updates this value
     *        approximately every six hours. Recent changes might not be reflected in this value.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withLocalSecondaryIndexes(LocalSecondaryIndexDescription... localSecondaryIndexes) {
        if (this.localSecondaryIndexes == null) {
            setLocalSecondaryIndexes(new java.util.ArrayList<LocalSecondaryIndexDescription>(localSecondaryIndexes.length));
        }
        for (LocalSecondaryIndexDescription ele : localSecondaryIndexes) {
            this.localSecondaryIndexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value.
     * Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of
     * data within a given item collection cannot exceed 10 GB. Each element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the local secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be
     * between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These
     * are in addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
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
     * attributes are in <code>NonKeyAttributes</code>.
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
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     * secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of
     * the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this
     * counts as two distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - Represents the total size of the index, in bytes. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - Represents the number of items in the index. DynamoDB updates this value approximately
     * every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * </p>
     * 
     * @param localSecondaryIndexes
     *        Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key
     *        value. Tables with one or more local secondary indexes are subject to an item collection size limit, where
     *        the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IndexName</code> - The name of the local secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema
     *        must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as
     *        the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index.
     *        These are in addition to the primary key attributes and index key attributes, which are automatically
     *        projected. Each attribute specification is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ProjectionType</code> - One of the following:
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
     *        projected attributes are in <code>NonKeyAttributes</code>.
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
     *        <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     *        secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across
     *        all of the secondary indexes, must not exceed 20. If you project the same attribute into two different
     *        indexes, this counts as two distinct attributes when determining the total.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IndexSizeBytes</code> - Represents the total size of the index, in bytes. DynamoDB updates this
     *        value approximately every six hours. Recent changes might not be reflected in this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ItemCount</code> - Represents the number of items in the index. DynamoDB updates this value
     *        approximately every six hours. Recent changes might not be reflected in this value.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withLocalSecondaryIndexes(java.util.Collection<LocalSecondaryIndexDescription> localSecondaryIndexes) {
        setLocalSecondaryIndexes(localSecondaryIndexes);
        return this;
    }

    /**
     * <p>
     * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each
     * element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Backfilling</code> - If true, then the index is currently in the backfilling phase. Backfilling occurs only
     * when a new global secondary index is added to the table; it is the process by which DynamoDB populates the new
     * index with data from the table. (This attribute does not appear for indexes that were created during a
     * <code>CreateTable</code> operation.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - The total size of the global secondary index, in bytes. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexStatus</code> - The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - The number of items in the global secondary index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be
     * between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These
     * are in addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
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
     * attributes are in <code>NonKeyAttributes</code>.
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
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     * secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of
     * the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this
     * counts as two distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index,
     * consisting of read and write capacity units, along with data about increases and decreases.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * </p>
     * 
     * @return The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value.
     *         Each element is composed of:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Backfilling</code> - If true, then the index is currently in the backfilling phase. Backfilling
     *         occurs only when a new global secondary index is added to the table; it is the process by which DynamoDB
     *         populates the new index with data from the table. (This attribute does not appear for indexes that were
     *         created during a <code>CreateTable</code> operation.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IndexName</code> - The name of the global secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IndexSizeBytes</code> - The total size of the global secondary index, in bytes. DynamoDB updates
     *         this value approximately every six hours. Recent changes might not be reflected in this value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IndexStatus</code> - The current status of the global secondary index:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The index is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The index is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The index is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The index is ready for use.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ItemCount</code> - The number of items in the global secondary index. DynamoDB updates this value
     *         approximately every six hours. Recent changes might not be reflected in this value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema
     *         must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key
     *         as the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index.
     *         These are in addition to the primary key attributes and index key attributes, which are automatically
     *         projected. Each attribute specification is composed of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ProjectionType</code> - One of the following:
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
     *         projected attributes are in <code>NonKeyAttributes</code>.
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
     *         <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     *         secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across
     *         all of the secondary indexes, must not exceed 20. If you project the same attribute into two different
     *         indexes, this counts as two distinct attributes when determining the total.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index,
     *         consisting of read and write capacity units, along with data about increases and decreases.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     */

    public java.util.List<GlobalSecondaryIndexDescription> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * <p>
     * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each
     * element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Backfilling</code> - If true, then the index is currently in the backfilling phase. Backfilling occurs only
     * when a new global secondary index is added to the table; it is the process by which DynamoDB populates the new
     * index with data from the table. (This attribute does not appear for indexes that were created during a
     * <code>CreateTable</code> operation.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - The total size of the global secondary index, in bytes. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexStatus</code> - The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - The number of items in the global secondary index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be
     * between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These
     * are in addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
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
     * attributes are in <code>NonKeyAttributes</code>.
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
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     * secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of
     * the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this
     * counts as two distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index,
     * consisting of read and write capacity units, along with data about increases and decreases.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value.
     *        Each element is composed of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Backfilling</code> - If true, then the index is currently in the backfilling phase. Backfilling
     *        occurs only when a new global secondary index is added to the table; it is the process by which DynamoDB
     *        populates the new index with data from the table. (This attribute does not appear for indexes that were
     *        created during a <code>CreateTable</code> operation.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IndexName</code> - The name of the global secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IndexSizeBytes</code> - The total size of the global secondary index, in bytes. DynamoDB updates
     *        this value approximately every six hours. Recent changes might not be reflected in this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IndexStatus</code> - The current status of the global secondary index:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The index is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The index is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The index is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The index is ready for use.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ItemCount</code> - The number of items in the global secondary index. DynamoDB updates this value
     *        approximately every six hours. Recent changes might not be reflected in this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema
     *        must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as
     *        the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index.
     *        These are in addition to the primary key attributes and index key attributes, which are automatically
     *        projected. Each attribute specification is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ProjectionType</code> - One of the following:
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
     *        projected attributes are in <code>NonKeyAttributes</code>.
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
     *        <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     *        secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across
     *        all of the secondary indexes, must not exceed 20. If you project the same attribute into two different
     *        indexes, this counts as two distinct attributes when determining the total.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index,
     *        consisting of read and write capacity units, along with data about increases and decreases.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     */

    public void setGlobalSecondaryIndexes(java.util.Collection<GlobalSecondaryIndexDescription> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<GlobalSecondaryIndexDescription>(globalSecondaryIndexes);
    }

    /**
     * <p>
     * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each
     * element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Backfilling</code> - If true, then the index is currently in the backfilling phase. Backfilling occurs only
     * when a new global secondary index is added to the table; it is the process by which DynamoDB populates the new
     * index with data from the table. (This attribute does not appear for indexes that were created during a
     * <code>CreateTable</code> operation.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - The total size of the global secondary index, in bytes. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexStatus</code> - The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - The number of items in the global secondary index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be
     * between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These
     * are in addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
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
     * attributes are in <code>NonKeyAttributes</code>.
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
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     * secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of
     * the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this
     * counts as two distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index,
     * consisting of read and write capacity units, along with data about increases and decreases.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalSecondaryIndexes(java.util.Collection)} or
     * {@link #withGlobalSecondaryIndexes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value.
     *        Each element is composed of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Backfilling</code> - If true, then the index is currently in the backfilling phase. Backfilling
     *        occurs only when a new global secondary index is added to the table; it is the process by which DynamoDB
     *        populates the new index with data from the table. (This attribute does not appear for indexes that were
     *        created during a <code>CreateTable</code> operation.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IndexName</code> - The name of the global secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IndexSizeBytes</code> - The total size of the global secondary index, in bytes. DynamoDB updates
     *        this value approximately every six hours. Recent changes might not be reflected in this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IndexStatus</code> - The current status of the global secondary index:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The index is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The index is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The index is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The index is ready for use.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ItemCount</code> - The number of items in the global secondary index. DynamoDB updates this value
     *        approximately every six hours. Recent changes might not be reflected in this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema
     *        must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as
     *        the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index.
     *        These are in addition to the primary key attributes and index key attributes, which are automatically
     *        projected. Each attribute specification is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ProjectionType</code> - One of the following:
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
     *        projected attributes are in <code>NonKeyAttributes</code>.
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
     *        <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     *        secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across
     *        all of the secondary indexes, must not exceed 20. If you project the same attribute into two different
     *        indexes, this counts as two distinct attributes when determining the total.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index,
     *        consisting of read and write capacity units, along with data about increases and decreases.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withGlobalSecondaryIndexes(GlobalSecondaryIndexDescription... globalSecondaryIndexes) {
        if (this.globalSecondaryIndexes == null) {
            setGlobalSecondaryIndexes(new java.util.ArrayList<GlobalSecondaryIndexDescription>(globalSecondaryIndexes.length));
        }
        for (GlobalSecondaryIndexDescription ele : globalSecondaryIndexes) {
            this.globalSecondaryIndexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each
     * element is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Backfilling</code> - If true, then the index is currently in the backfilling phase. Backfilling occurs only
     * when a new global secondary index is added to the table; it is the process by which DynamoDB populates the new
     * index with data from the table. (This attribute does not appear for indexes that were created during a
     * <code>CreateTable</code> operation.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexName</code> - The name of the global secondary index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexSizeBytes</code> - The total size of the global secondary index, in bytes. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IndexStatus</code> - The current status of the global secondary index:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The index is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The index is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The index is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The index is ready for use.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ItemCount</code> - The number of items in the global secondary index. DynamoDB updates this value
     * approximately every six hours. Recent changes might not be reflected in this value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema must be
     * between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index. These
     * are in addition to the primary key attributes and index key attributes, which are automatically projected. Each
     * attribute specification is composed of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProjectionType</code> - One of the following:
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
     * attributes are in <code>NonKeyAttributes</code>.
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
     * <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     * secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across all of
     * the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this
     * counts as two distinct attributes when determining the total.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index,
     * consisting of read and write capacity units, along with data about increases and decreases.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value.
     *        Each element is composed of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Backfilling</code> - If true, then the index is currently in the backfilling phase. Backfilling
     *        occurs only when a new global secondary index is added to the table; it is the process by which DynamoDB
     *        populates the new index with data from the table. (This attribute does not appear for indexes that were
     *        created during a <code>CreateTable</code> operation.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IndexName</code> - The name of the global secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IndexSizeBytes</code> - The total size of the global secondary index, in bytes. DynamoDB updates
     *        this value approximately every six hours. Recent changes might not be reflected in this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IndexStatus</code> - The current status of the global secondary index:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The index is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The index is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The index is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The index is ready for use.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ItemCount</code> - The number of items in the global secondary index. DynamoDB updates this value
     *        approximately every six hours. Recent changes might not be reflected in this value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KeySchema</code> - Specifies the complete index key schema. The attribute names in the key schema
     *        must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as
     *        the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Projection</code> - Specifies attributes that are copied (projected) from the table into the index.
     *        These are in addition to the primary key attributes and index key attributes, which are automatically
     *        projected. Each attribute specification is composed of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ProjectionType</code> - One of the following:
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
     *        projected attributes are in <code>NonKeyAttributes</code>.
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
     *        <code>NonKeyAttributes</code> - A list of one or more non-key attribute names that are projected into the
     *        secondary index. The total count of attributes provided in <code>NonKeyAttributes</code>, summed across
     *        all of the secondary indexes, must not exceed 20. If you project the same attribute into two different
     *        indexes, this counts as two distinct attributes when determining the total.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProvisionedThroughput</code> - The provisioned throughput settings for the global secondary index,
     *        consisting of read and write capacity units, along with data about increases and decreases.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the table is in the <code>DELETING</code> state, no information about indexes will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withGlobalSecondaryIndexes(java.util.Collection<GlobalSecondaryIndexDescription> globalSecondaryIndexes) {
        setGlobalSecondaryIndexes(globalSecondaryIndexes);
        return this;
    }

    /**
     * <p>
     * The current DynamoDB Streams configuration for the table.
     * </p>
     * 
     * @param streamSpecification
     *        The current DynamoDB Streams configuration for the table.
     */

    public void setStreamSpecification(StreamSpecification streamSpecification) {
        this.streamSpecification = streamSpecification;
    }

    /**
     * <p>
     * The current DynamoDB Streams configuration for the table.
     * </p>
     * 
     * @return The current DynamoDB Streams configuration for the table.
     */

    public StreamSpecification getStreamSpecification() {
        return this.streamSpecification;
    }

    /**
     * <p>
     * The current DynamoDB Streams configuration for the table.
     * </p>
     * 
     * @param streamSpecification
     *        The current DynamoDB Streams configuration for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withStreamSpecification(StreamSpecification streamSpecification) {
        setStreamSpecification(streamSpecification);
        return this;
    }

    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible that a
     * stream from another table might have the same timestamp. However, the combination of the following three elements
     * is guaranteed to be unique:
     * </p>
     * <ul>
     * <li>
     * <p>
     * the AWS customer ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * the table name.
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>StreamLabel</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param latestStreamLabel
     *        A timestamp, in ISO 8601 format, for this stream.</p>
     *        <p>
     *        Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible
     *        that a stream from another table might have the same timestamp. However, the combination of the following
     *        three elements is guaranteed to be unique:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        the AWS customer ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        the table name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        the <code>StreamLabel</code>.
     *        </p>
     *        </li>
     */

    public void setLatestStreamLabel(String latestStreamLabel) {
        this.latestStreamLabel = latestStreamLabel;
    }

    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible that a
     * stream from another table might have the same timestamp. However, the combination of the following three elements
     * is guaranteed to be unique:
     * </p>
     * <ul>
     * <li>
     * <p>
     * the AWS customer ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * the table name.
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>StreamLabel</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A timestamp, in ISO 8601 format, for this stream.</p>
     *         <p>
     *         Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is
     *         possible that a stream from another table might have the same timestamp. However, the combination of the
     *         following three elements is guaranteed to be unique:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         the AWS customer ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         the table name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         the <code>StreamLabel</code>.
     *         </p>
     *         </li>
     */

    public String getLatestStreamLabel() {
        return this.latestStreamLabel;
    }

    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible that a
     * stream from another table might have the same timestamp. However, the combination of the following three elements
     * is guaranteed to be unique:
     * </p>
     * <ul>
     * <li>
     * <p>
     * the AWS customer ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * the table name.
     * </p>
     * </li>
     * <li>
     * <p>
     * the <code>StreamLabel</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param latestStreamLabel
     *        A timestamp, in ISO 8601 format, for this stream.</p>
     *        <p>
     *        Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible
     *        that a stream from another table might have the same timestamp. However, the combination of the following
     *        three elements is guaranteed to be unique:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        the AWS customer ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        the table name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        the <code>StreamLabel</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withLatestStreamLabel(String latestStreamLabel) {
        setLatestStreamLabel(latestStreamLabel);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
     * </p>
     * 
     * @param latestStreamArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
     */

    public void setLatestStreamArn(String latestStreamArn) {
        this.latestStreamArn = latestStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
     */

    public String getLatestStreamArn() {
        return this.latestStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
     * </p>
     * 
     * @param latestStreamArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withLatestStreamArn(String latestStreamArn) {
        setLatestStreamArn(latestStreamArn);
        return this;
    }

    /**
     * <p>
     * Contains details for the restore.
     * </p>
     * 
     * @param restoreSummary
     *        Contains details for the restore.
     */

    public void setRestoreSummary(RestoreSummary restoreSummary) {
        this.restoreSummary = restoreSummary;
    }

    /**
     * <p>
     * Contains details for the restore.
     * </p>
     * 
     * @return Contains details for the restore.
     */

    public RestoreSummary getRestoreSummary() {
        return this.restoreSummary;
    }

    /**
     * <p>
     * Contains details for the restore.
     * </p>
     * 
     * @param restoreSummary
     *        Contains details for the restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withRestoreSummary(RestoreSummary restoreSummary) {
        setRestoreSummary(restoreSummary);
        return this;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the specified table.
     * </p>
     * 
     * @param sSEDescription
     *        The description of the server-side encryption status on the specified table.
     */

    public void setSSEDescription(SSEDescription sSEDescription) {
        this.sSEDescription = sSEDescription;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the specified table.
     * </p>
     * 
     * @return The description of the server-side encryption status on the specified table.
     */

    public SSEDescription getSSEDescription() {
        return this.sSEDescription;
    }

    /**
     * <p>
     * The description of the server-side encryption status on the specified table.
     * </p>
     * 
     * @param sSEDescription
     *        The description of the server-side encryption status on the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDescription withSSEDescription(SSEDescription sSEDescription) {
        setSSEDescription(sSEDescription);
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
        if (getAttributeDefinitions() != null)
            sb.append("AttributeDefinitions: ").append(getAttributeDefinitions()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getKeySchema() != null)
            sb.append("KeySchema: ").append(getKeySchema()).append(",");
        if (getTableStatus() != null)
            sb.append("TableStatus: ").append(getTableStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: ").append(getProvisionedThroughput()).append(",");
        if (getTableSizeBytes() != null)
            sb.append("TableSizeBytes: ").append(getTableSizeBytes()).append(",");
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount()).append(",");
        if (getTableArn() != null)
            sb.append("TableArn: ").append(getTableArn()).append(",");
        if (getTableId() != null)
            sb.append("TableId: ").append(getTableId()).append(",");
        if (getBillingModeSummary() != null)
            sb.append("BillingModeSummary: ").append(getBillingModeSummary()).append(",");
        if (getLocalSecondaryIndexes() != null)
            sb.append("LocalSecondaryIndexes: ").append(getLocalSecondaryIndexes()).append(",");
        if (getGlobalSecondaryIndexes() != null)
            sb.append("GlobalSecondaryIndexes: ").append(getGlobalSecondaryIndexes()).append(",");
        if (getStreamSpecification() != null)
            sb.append("StreamSpecification: ").append(getStreamSpecification()).append(",");
        if (getLatestStreamLabel() != null)
            sb.append("LatestStreamLabel: ").append(getLatestStreamLabel()).append(",");
        if (getLatestStreamArn() != null)
            sb.append("LatestStreamArn: ").append(getLatestStreamArn()).append(",");
        if (getRestoreSummary() != null)
            sb.append("RestoreSummary: ").append(getRestoreSummary()).append(",");
        if (getSSEDescription() != null)
            sb.append("SSEDescription: ").append(getSSEDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableDescription == false)
            return false;
        TableDescription other = (TableDescription) obj;
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
        if (other.getTableStatus() == null ^ this.getTableStatus() == null)
            return false;
        if (other.getTableStatus() != null && other.getTableStatus().equals(this.getTableStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false)
            return false;
        if (other.getTableSizeBytes() == null ^ this.getTableSizeBytes() == null)
            return false;
        if (other.getTableSizeBytes() != null && other.getTableSizeBytes().equals(this.getTableSizeBytes()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getTableArn() == null ^ this.getTableArn() == null)
            return false;
        if (other.getTableArn() != null && other.getTableArn().equals(this.getTableArn()) == false)
            return false;
        if (other.getTableId() == null ^ this.getTableId() == null)
            return false;
        if (other.getTableId() != null && other.getTableId().equals(this.getTableId()) == false)
            return false;
        if (other.getBillingModeSummary() == null ^ this.getBillingModeSummary() == null)
            return false;
        if (other.getBillingModeSummary() != null && other.getBillingModeSummary().equals(this.getBillingModeSummary()) == false)
            return false;
        if (other.getLocalSecondaryIndexes() == null ^ this.getLocalSecondaryIndexes() == null)
            return false;
        if (other.getLocalSecondaryIndexes() != null && other.getLocalSecondaryIndexes().equals(this.getLocalSecondaryIndexes()) == false)
            return false;
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null)
            return false;
        if (other.getGlobalSecondaryIndexes() != null && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false)
            return false;
        if (other.getStreamSpecification() == null ^ this.getStreamSpecification() == null)
            return false;
        if (other.getStreamSpecification() != null && other.getStreamSpecification().equals(this.getStreamSpecification()) == false)
            return false;
        if (other.getLatestStreamLabel() == null ^ this.getLatestStreamLabel() == null)
            return false;
        if (other.getLatestStreamLabel() != null && other.getLatestStreamLabel().equals(this.getLatestStreamLabel()) == false)
            return false;
        if (other.getLatestStreamArn() == null ^ this.getLatestStreamArn() == null)
            return false;
        if (other.getLatestStreamArn() != null && other.getLatestStreamArn().equals(this.getLatestStreamArn()) == false)
            return false;
        if (other.getRestoreSummary() == null ^ this.getRestoreSummary() == null)
            return false;
        if (other.getRestoreSummary() != null && other.getRestoreSummary().equals(this.getRestoreSummary()) == false)
            return false;
        if (other.getSSEDescription() == null ^ this.getSSEDescription() == null)
            return false;
        if (other.getSSEDescription() != null && other.getSSEDescription().equals(this.getSSEDescription()) == false)
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
        hashCode = prime * hashCode + ((getTableStatus() == null) ? 0 : getTableStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        hashCode = prime * hashCode + ((getTableSizeBytes() == null) ? 0 : getTableSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getTableArn() == null) ? 0 : getTableArn().hashCode());
        hashCode = prime * hashCode + ((getTableId() == null) ? 0 : getTableId().hashCode());
        hashCode = prime * hashCode + ((getBillingModeSummary() == null) ? 0 : getBillingModeSummary().hashCode());
        hashCode = prime * hashCode + ((getLocalSecondaryIndexes() == null) ? 0 : getLocalSecondaryIndexes().hashCode());
        hashCode = prime * hashCode + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes().hashCode());
        hashCode = prime * hashCode + ((getStreamSpecification() == null) ? 0 : getStreamSpecification().hashCode());
        hashCode = prime * hashCode + ((getLatestStreamLabel() == null) ? 0 : getLatestStreamLabel().hashCode());
        hashCode = prime * hashCode + ((getLatestStreamArn() == null) ? 0 : getLatestStreamArn().hashCode());
        hashCode = prime * hashCode + ((getRestoreSummary() == null) ? 0 : getRestoreSummary().hashCode());
        hashCode = prime * hashCode + ((getSSEDescription() == null) ? 0 : getSSEDescription().hashCode());
        return hashCode;
    }

    @Override
    public TableDescription clone() {
        try {
            return (TableDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.TableDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
