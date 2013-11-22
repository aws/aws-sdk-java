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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#createTable(CreateTableRequest) CreateTable operation}.
 * <p>
 * The <i>CreateTable</i> operation adds a new table to your account. In an AWS account, table names must be unique within each region. That is, you can
 * have two tables with same name if you create the tables in different regions.
 * </p>
 * <p>
 * <i>CreateTable</i> is an asynchronous operation. Upon receiving a <i>CreateTable</i> request, Amazon DynamoDB immediately returns a response with a
 * <i>TableStatus</i> of <code>CREATING</code> . After the table is created, Amazon DynamoDB sets the <i>TableStatus</i> to <code>ACTIVE</code> . You can
 * perform read and write operations only on an <code>ACTIVE</code> table.
 * </p>
 * <p>
 * If you want to create multiple tables with local secondary indexes on them, you must create them sequentially. Only one table with local secondary
 * indexes can be in the <code>CREATING</code> state at any given time.
 * </p>
 * <p>
 * You can use the <i>DescribeTable</i> API to check the table status.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#createTable(CreateTableRequest)
 */
public class CreateTableRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * An array of attributes that describe the key schema for the table and
     * indexes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AttributeDefinition> attributeDefinitions;

    /**
     * The name of the table to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * Specifies the attributes that make up the primary key for the table.
     * The attributes in <i>KeySchema</i> must also be defined in the
     * <i>AttributeDefinitions</i> array. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
     * Model</a> in the Amazon DynamoDB Developer Guide. <p>Each
     * <i>KeySchemaElement</i> in the array is composed of: <ul> <li>
     * <p><i>AttributeName</i> - The name of this key attribute. </li> <li>
     * <p><i>KeyType</i> - Determines whether the key attribute is
     * <code>HASH</code> or <code>RANGE</code>. </li> </ul> <p>For a primary
     * key that consists of a hash attribute, you must specify exactly one
     * element with a <i>KeyType</i> of <code>HASH</code>. <p>For a primary
     * key that consists of hash and range attributes, you must specify
     * exactly two elements, in this order: The first element must have a
     * <i>KeyType</i> of <code>HASH</code>, and the second element must have
     * a <i>KeyType</i> of <code>RANGE</code>. <p>For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithDDTables.html#WorkingWithDDTables.primary.key">Specifying
     * the Primary Key</a> in the Amazon DynamoDB Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchema;

    /**
     * One or more secondary indexes (the maximum is five) to be created on
     * the table. Each index is scoped to a given hash key value. There is a
     * 10 gigabyte size limit per hash key; otherwise, the size of a local
     * secondary index is unconstrained. <p>Each secondary index in the array
     * includes the following: <ul> <li> <p><i>IndexName</i> - The name of
     * the secondary index. Must be unique only for this table. <p> </li>
     * <li> <p><i>KeySchema</i> - Specifies the key schema for the index. The
     * key schema must begin with the same hash key attribute as the table.
     * </li> <li> <p><i>Projection</i> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to
     * the primary key attributes and index key attributes, which are
     * automatically projected. Each attribute specification is composed of:
     * <ul> <li> <p><i>ProjectionType</i> - One of the following: <ul> <li>
     * <p><code>KEYS_ONLY</code> - Only the index and primary keys are
     * projected into the index. </li> <li> <p><code>INCLUDE</code> - Only
     * the specified table attributes are projected into the index. The list
     * of projected attributes are in <i>NonKeyAttributes</i>. </li> <li>
     * <p><code>ALL</code> - All of the table attributes are projected into
     * the index. </li> </ul> </li> <li> <p><i>NonKeyAttributes</i> - A list
     * of one or more non-key attribute names that are projected into the
     * index. The total count of attributes specified in
     * <i>NonKeyAttributes</i>, summed across all of the local secondary
     * indexes, must not exceed 20. If you project the same attribute into
     * two different indexes, this counts as two distinct attributes when
     * determining the total. </li> </ul> </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LocalSecondaryIndex> localSecondaryIndexes;

    /**
     * The provisioned throughput settings for the specified table. The
     * settings can be modified using the <i>UpdateTable</i> operation.
     * <p>For current minimum and maximum provisioned throughput values, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
     */
    private ProvisionedThroughput provisionedThroughput;

    /**
     * Default constructor for a new CreateTableRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateTableRequest() {}
    
    /**
     * Constructs a new CreateTableRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table to create.
     * @param keySchema Specifies the attributes that make up the primary key
     * for the table. The attributes in <i>KeySchema</i> must also be defined
     * in the <i>AttributeDefinitions</i> array. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
     * Model</a> in the Amazon DynamoDB Developer Guide. <p>Each
     * <i>KeySchemaElement</i> in the array is composed of: <ul> <li>
     * <p><i>AttributeName</i> - The name of this key attribute. </li> <li>
     * <p><i>KeyType</i> - Determines whether the key attribute is
     * <code>HASH</code> or <code>RANGE</code>. </li> </ul> <p>For a primary
     * key that consists of a hash attribute, you must specify exactly one
     * element with a <i>KeyType</i> of <code>HASH</code>. <p>For a primary
     * key that consists of hash and range attributes, you must specify
     * exactly two elements, in this order: The first element must have a
     * <i>KeyType</i> of <code>HASH</code>, and the second element must have
     * a <i>KeyType</i> of <code>RANGE</code>. <p>For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithDDTables.html#WorkingWithDDTables.primary.key">Specifying
     * the Primary Key</a> in the Amazon DynamoDB Developer Guide.
     */
    public CreateTableRequest(String tableName, java.util.List<KeySchemaElement> keySchema) {
        setTableName(tableName);
        setKeySchema(keySchema);
    }

    /**
     * Constructs a new CreateTableRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param attributeDefinitions An array of attributes that describe the
     * key schema for the table and indexes.
     * @param tableName The name of the table to create.
     * @param keySchema Specifies the attributes that make up the primary key
     * for the table. The attributes in <i>KeySchema</i> must also be defined
     * in the <i>AttributeDefinitions</i> array. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
     * Model</a> in the Amazon DynamoDB Developer Guide. <p>Each
     * <i>KeySchemaElement</i> in the array is composed of: <ul> <li>
     * <p><i>AttributeName</i> - The name of this key attribute. </li> <li>
     * <p><i>KeyType</i> - Determines whether the key attribute is
     * <code>HASH</code> or <code>RANGE</code>. </li> </ul> <p>For a primary
     * key that consists of a hash attribute, you must specify exactly one
     * element with a <i>KeyType</i> of <code>HASH</code>. <p>For a primary
     * key that consists of hash and range attributes, you must specify
     * exactly two elements, in this order: The first element must have a
     * <i>KeyType</i> of <code>HASH</code>, and the second element must have
     * a <i>KeyType</i> of <code>RANGE</code>. <p>For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithDDTables.html#WorkingWithDDTables.primary.key">Specifying
     * the Primary Key</a> in the Amazon DynamoDB Developer Guide.
     * @param provisionedThroughput The provisioned throughput settings for
     * the specified table. The settings can be modified using the
     * <i>UpdateTable</i> operation. <p>For current minimum and maximum
     * provisioned throughput values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
     */
    public CreateTableRequest(java.util.List<AttributeDefinition> attributeDefinitions, String tableName, java.util.List<KeySchemaElement> keySchema, ProvisionedThroughput provisionedThroughput) {
        setAttributeDefinitions(attributeDefinitions);
        setTableName(tableName);
        setKeySchema(keySchema);
        setProvisionedThroughput(provisionedThroughput);
    }

    /**
     * An array of attributes that describe the key schema for the table and
     * indexes.
     *
     * @return An array of attributes that describe the key schema for the table and
     *         indexes.
     */
    public java.util.List<AttributeDefinition> getAttributeDefinitions() {
        return attributeDefinitions;
    }
    
    /**
     * An array of attributes that describe the key schema for the table and
     * indexes.
     *
     * @param attributeDefinitions An array of attributes that describe the key schema for the table and
     *         indexes.
     */
    public void setAttributeDefinitions(java.util.Collection<AttributeDefinition> attributeDefinitions) {
        if (attributeDefinitions == null) {
            this.attributeDefinitions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AttributeDefinition> attributeDefinitionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeDefinition>(attributeDefinitions.size());
        attributeDefinitionsCopy.addAll(attributeDefinitions);
        this.attributeDefinitions = attributeDefinitionsCopy;
    }
    
    /**
     * An array of attributes that describe the key schema for the table and
     * indexes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeDefinitions An array of attributes that describe the key schema for the table and
     *         indexes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTableRequest withAttributeDefinitions(AttributeDefinition... attributeDefinitions) {
        if (getAttributeDefinitions() == null) setAttributeDefinitions(new java.util.ArrayList<AttributeDefinition>(attributeDefinitions.length));
        for (AttributeDefinition value : attributeDefinitions) {
            getAttributeDefinitions().add(value);
        }
        return this;
    }
    
    /**
     * An array of attributes that describe the key schema for the table and
     * indexes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeDefinitions An array of attributes that describe the key schema for the table and
     *         indexes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTableRequest withAttributeDefinitions(java.util.Collection<AttributeDefinition> attributeDefinitions) {
        if (attributeDefinitions == null) {
            this.attributeDefinitions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AttributeDefinition> attributeDefinitionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeDefinition>(attributeDefinitions.size());
            attributeDefinitionsCopy.addAll(attributeDefinitions);
            this.attributeDefinitions = attributeDefinitionsCopy;
        }

        return this;
    }

    /**
     * The name of the table to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table to create.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table to create.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table to create.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table to create.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTableRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Specifies the attributes that make up the primary key for the table.
     * The attributes in <i>KeySchema</i> must also be defined in the
     * <i>AttributeDefinitions</i> array. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
     * Model</a> in the Amazon DynamoDB Developer Guide. <p>Each
     * <i>KeySchemaElement</i> in the array is composed of: <ul> <li>
     * <p><i>AttributeName</i> - The name of this key attribute. </li> <li>
     * <p><i>KeyType</i> - Determines whether the key attribute is
     * <code>HASH</code> or <code>RANGE</code>. </li> </ul> <p>For a primary
     * key that consists of a hash attribute, you must specify exactly one
     * element with a <i>KeyType</i> of <code>HASH</code>. <p>For a primary
     * key that consists of hash and range attributes, you must specify
     * exactly two elements, in this order: The first element must have a
     * <i>KeyType</i> of <code>HASH</code>, and the second element must have
     * a <i>KeyType</i> of <code>RANGE</code>. <p>For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithDDTables.html#WorkingWithDDTables.primary.key">Specifying
     * the Primary Key</a> in the Amazon DynamoDB Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return Specifies the attributes that make up the primary key for the table.
     *         The attributes in <i>KeySchema</i> must also be defined in the
     *         <i>AttributeDefinitions</i> array. For more information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
     *         Model</a> in the Amazon DynamoDB Developer Guide. <p>Each
     *         <i>KeySchemaElement</i> in the array is composed of: <ul> <li>
     *         <p><i>AttributeName</i> - The name of this key attribute. </li> <li>
     *         <p><i>KeyType</i> - Determines whether the key attribute is
     *         <code>HASH</code> or <code>RANGE</code>. </li> </ul> <p>For a primary
     *         key that consists of a hash attribute, you must specify exactly one
     *         element with a <i>KeyType</i> of <code>HASH</code>. <p>For a primary
     *         key that consists of hash and range attributes, you must specify
     *         exactly two elements, in this order: The first element must have a
     *         <i>KeyType</i> of <code>HASH</code>, and the second element must have
     *         a <i>KeyType</i> of <code>RANGE</code>. <p>For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithDDTables.html#WorkingWithDDTables.primary.key">Specifying
     *         the Primary Key</a> in the Amazon DynamoDB Developer Guide.
     */
    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }
    
    /**
     * Specifies the attributes that make up the primary key for the table.
     * The attributes in <i>KeySchema</i> must also be defined in the
     * <i>AttributeDefinitions</i> array. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
     * Model</a> in the Amazon DynamoDB Developer Guide. <p>Each
     * <i>KeySchemaElement</i> in the array is composed of: <ul> <li>
     * <p><i>AttributeName</i> - The name of this key attribute. </li> <li>
     * <p><i>KeyType</i> - Determines whether the key attribute is
     * <code>HASH</code> or <code>RANGE</code>. </li> </ul> <p>For a primary
     * key that consists of a hash attribute, you must specify exactly one
     * element with a <i>KeyType</i> of <code>HASH</code>. <p>For a primary
     * key that consists of hash and range attributes, you must specify
     * exactly two elements, in this order: The first element must have a
     * <i>KeyType</i> of <code>HASH</code>, and the second element must have
     * a <i>KeyType</i> of <code>RANGE</code>. <p>For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithDDTables.html#WorkingWithDDTables.primary.key">Specifying
     * the Primary Key</a> in the Amazon DynamoDB Developer Guide.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema Specifies the attributes that make up the primary key for the table.
     *         The attributes in <i>KeySchema</i> must also be defined in the
     *         <i>AttributeDefinitions</i> array. For more information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
     *         Model</a> in the Amazon DynamoDB Developer Guide. <p>Each
     *         <i>KeySchemaElement</i> in the array is composed of: <ul> <li>
     *         <p><i>AttributeName</i> - The name of this key attribute. </li> <li>
     *         <p><i>KeyType</i> - Determines whether the key attribute is
     *         <code>HASH</code> or <code>RANGE</code>. </li> </ul> <p>For a primary
     *         key that consists of a hash attribute, you must specify exactly one
     *         element with a <i>KeyType</i> of <code>HASH</code>. <p>For a primary
     *         key that consists of hash and range attributes, you must specify
     *         exactly two elements, in this order: The first element must have a
     *         <i>KeyType</i> of <code>HASH</code>, and the second element must have
     *         a <i>KeyType</i> of <code>RANGE</code>. <p>For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithDDTables.html#WorkingWithDDTables.primary.key">Specifying
     *         the Primary Key</a> in the Amazon DynamoDB Developer Guide.
     */
    public void setKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchemaCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement>(keySchema.size());
        keySchemaCopy.addAll(keySchema);
        this.keySchema = keySchemaCopy;
    }
    
    /**
     * Specifies the attributes that make up the primary key for the table.
     * The attributes in <i>KeySchema</i> must also be defined in the
     * <i>AttributeDefinitions</i> array. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
     * Model</a> in the Amazon DynamoDB Developer Guide. <p>Each
     * <i>KeySchemaElement</i> in the array is composed of: <ul> <li>
     * <p><i>AttributeName</i> - The name of this key attribute. </li> <li>
     * <p><i>KeyType</i> - Determines whether the key attribute is
     * <code>HASH</code> or <code>RANGE</code>. </li> </ul> <p>For a primary
     * key that consists of a hash attribute, you must specify exactly one
     * element with a <i>KeyType</i> of <code>HASH</code>. <p>For a primary
     * key that consists of hash and range attributes, you must specify
     * exactly two elements, in this order: The first element must have a
     * <i>KeyType</i> of <code>HASH</code>, and the second element must have
     * a <i>KeyType</i> of <code>RANGE</code>. <p>For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithDDTables.html#WorkingWithDDTables.primary.key">Specifying
     * the Primary Key</a> in the Amazon DynamoDB Developer Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema Specifies the attributes that make up the primary key for the table.
     *         The attributes in <i>KeySchema</i> must also be defined in the
     *         <i>AttributeDefinitions</i> array. For more information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
     *         Model</a> in the Amazon DynamoDB Developer Guide. <p>Each
     *         <i>KeySchemaElement</i> in the array is composed of: <ul> <li>
     *         <p><i>AttributeName</i> - The name of this key attribute. </li> <li>
     *         <p><i>KeyType</i> - Determines whether the key attribute is
     *         <code>HASH</code> or <code>RANGE</code>. </li> </ul> <p>For a primary
     *         key that consists of a hash attribute, you must specify exactly one
     *         element with a <i>KeyType</i> of <code>HASH</code>. <p>For a primary
     *         key that consists of hash and range attributes, you must specify
     *         exactly two elements, in this order: The first element must have a
     *         <i>KeyType</i> of <code>HASH</code>, and the second element must have
     *         a <i>KeyType</i> of <code>RANGE</code>. <p>For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithDDTables.html#WorkingWithDDTables.primary.key">Specifying
     *         the Primary Key</a> in the Amazon DynamoDB Developer Guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTableRequest withKeySchema(KeySchemaElement... keySchema) {
        if (getKeySchema() == null) setKeySchema(new java.util.ArrayList<KeySchemaElement>(keySchema.length));
        for (KeySchemaElement value : keySchema) {
            getKeySchema().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the attributes that make up the primary key for the table.
     * The attributes in <i>KeySchema</i> must also be defined in the
     * <i>AttributeDefinitions</i> array. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
     * Model</a> in the Amazon DynamoDB Developer Guide. <p>Each
     * <i>KeySchemaElement</i> in the array is composed of: <ul> <li>
     * <p><i>AttributeName</i> - The name of this key attribute. </li> <li>
     * <p><i>KeyType</i> - Determines whether the key attribute is
     * <code>HASH</code> or <code>RANGE</code>. </li> </ul> <p>For a primary
     * key that consists of a hash attribute, you must specify exactly one
     * element with a <i>KeyType</i> of <code>HASH</code>. <p>For a primary
     * key that consists of hash and range attributes, you must specify
     * exactly two elements, in this order: The first element must have a
     * <i>KeyType</i> of <code>HASH</code>, and the second element must have
     * a <i>KeyType</i> of <code>RANGE</code>. <p>For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithDDTables.html#WorkingWithDDTables.primary.key">Specifying
     * the Primary Key</a> in the Amazon DynamoDB Developer Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema Specifies the attributes that make up the primary key for the table.
     *         The attributes in <i>KeySchema</i> must also be defined in the
     *         <i>AttributeDefinitions</i> array. For more information, see <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
     *         Model</a> in the Amazon DynamoDB Developer Guide. <p>Each
     *         <i>KeySchemaElement</i> in the array is composed of: <ul> <li>
     *         <p><i>AttributeName</i> - The name of this key attribute. </li> <li>
     *         <p><i>KeyType</i> - Determines whether the key attribute is
     *         <code>HASH</code> or <code>RANGE</code>. </li> </ul> <p>For a primary
     *         key that consists of a hash attribute, you must specify exactly one
     *         element with a <i>KeyType</i> of <code>HASH</code>. <p>For a primary
     *         key that consists of hash and range attributes, you must specify
     *         exactly two elements, in this order: The first element must have a
     *         <i>KeyType</i> of <code>HASH</code>, and the second element must have
     *         a <i>KeyType</i> of <code>RANGE</code>. <p>For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithDDTables.html#WorkingWithDDTables.primary.key">Specifying
     *         the Primary Key</a> in the Amazon DynamoDB Developer Guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTableRequest withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchemaCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement>(keySchema.size());
            keySchemaCopy.addAll(keySchema);
            this.keySchema = keySchemaCopy;
        }

        return this;
    }

    /**
     * One or more secondary indexes (the maximum is five) to be created on
     * the table. Each index is scoped to a given hash key value. There is a
     * 10 gigabyte size limit per hash key; otherwise, the size of a local
     * secondary index is unconstrained. <p>Each secondary index in the array
     * includes the following: <ul> <li> <p><i>IndexName</i> - The name of
     * the secondary index. Must be unique only for this table. <p> </li>
     * <li> <p><i>KeySchema</i> - Specifies the key schema for the index. The
     * key schema must begin with the same hash key attribute as the table.
     * </li> <li> <p><i>Projection</i> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to
     * the primary key attributes and index key attributes, which are
     * automatically projected. Each attribute specification is composed of:
     * <ul> <li> <p><i>ProjectionType</i> - One of the following: <ul> <li>
     * <p><code>KEYS_ONLY</code> - Only the index and primary keys are
     * projected into the index. </li> <li> <p><code>INCLUDE</code> - Only
     * the specified table attributes are projected into the index. The list
     * of projected attributes are in <i>NonKeyAttributes</i>. </li> <li>
     * <p><code>ALL</code> - All of the table attributes are projected into
     * the index. </li> </ul> </li> <li> <p><i>NonKeyAttributes</i> - A list
     * of one or more non-key attribute names that are projected into the
     * index. The total count of attributes specified in
     * <i>NonKeyAttributes</i>, summed across all of the local secondary
     * indexes, must not exceed 20. If you project the same attribute into
     * two different indexes, this counts as two distinct attributes when
     * determining the total. </li> </ul> </li> </ul>
     *
     * @return One or more secondary indexes (the maximum is five) to be created on
     *         the table. Each index is scoped to a given hash key value. There is a
     *         10 gigabyte size limit per hash key; otherwise, the size of a local
     *         secondary index is unconstrained. <p>Each secondary index in the array
     *         includes the following: <ul> <li> <p><i>IndexName</i> - The name of
     *         the secondary index. Must be unique only for this table. <p> </li>
     *         <li> <p><i>KeySchema</i> - Specifies the key schema for the index. The
     *         key schema must begin with the same hash key attribute as the table.
     *         </li> <li> <p><i>Projection</i> - Specifies attributes that are copied
     *         (projected) from the table into the index. These are in addition to
     *         the primary key attributes and index key attributes, which are
     *         automatically projected. Each attribute specification is composed of:
     *         <ul> <li> <p><i>ProjectionType</i> - One of the following: <ul> <li>
     *         <p><code>KEYS_ONLY</code> - Only the index and primary keys are
     *         projected into the index. </li> <li> <p><code>INCLUDE</code> - Only
     *         the specified table attributes are projected into the index. The list
     *         of projected attributes are in <i>NonKeyAttributes</i>. </li> <li>
     *         <p><code>ALL</code> - All of the table attributes are projected into
     *         the index. </li> </ul> </li> <li> <p><i>NonKeyAttributes</i> - A list
     *         of one or more non-key attribute names that are projected into the
     *         index. The total count of attributes specified in
     *         <i>NonKeyAttributes</i>, summed across all of the local secondary
     *         indexes, must not exceed 20. If you project the same attribute into
     *         two different indexes, this counts as two distinct attributes when
     *         determining the total. </li> </ul> </li> </ul>
     */
    public java.util.List<LocalSecondaryIndex> getLocalSecondaryIndexes() {
        return localSecondaryIndexes;
    }
    
    /**
     * One or more secondary indexes (the maximum is five) to be created on
     * the table. Each index is scoped to a given hash key value. There is a
     * 10 gigabyte size limit per hash key; otherwise, the size of a local
     * secondary index is unconstrained. <p>Each secondary index in the array
     * includes the following: <ul> <li> <p><i>IndexName</i> - The name of
     * the secondary index. Must be unique only for this table. <p> </li>
     * <li> <p><i>KeySchema</i> - Specifies the key schema for the index. The
     * key schema must begin with the same hash key attribute as the table.
     * </li> <li> <p><i>Projection</i> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to
     * the primary key attributes and index key attributes, which are
     * automatically projected. Each attribute specification is composed of:
     * <ul> <li> <p><i>ProjectionType</i> - One of the following: <ul> <li>
     * <p><code>KEYS_ONLY</code> - Only the index and primary keys are
     * projected into the index. </li> <li> <p><code>INCLUDE</code> - Only
     * the specified table attributes are projected into the index. The list
     * of projected attributes are in <i>NonKeyAttributes</i>. </li> <li>
     * <p><code>ALL</code> - All of the table attributes are projected into
     * the index. </li> </ul> </li> <li> <p><i>NonKeyAttributes</i> - A list
     * of one or more non-key attribute names that are projected into the
     * index. The total count of attributes specified in
     * <i>NonKeyAttributes</i>, summed across all of the local secondary
     * indexes, must not exceed 20. If you project the same attribute into
     * two different indexes, this counts as two distinct attributes when
     * determining the total. </li> </ul> </li> </ul>
     *
     * @param localSecondaryIndexes One or more secondary indexes (the maximum is five) to be created on
     *         the table. Each index is scoped to a given hash key value. There is a
     *         10 gigabyte size limit per hash key; otherwise, the size of a local
     *         secondary index is unconstrained. <p>Each secondary index in the array
     *         includes the following: <ul> <li> <p><i>IndexName</i> - The name of
     *         the secondary index. Must be unique only for this table. <p> </li>
     *         <li> <p><i>KeySchema</i> - Specifies the key schema for the index. The
     *         key schema must begin with the same hash key attribute as the table.
     *         </li> <li> <p><i>Projection</i> - Specifies attributes that are copied
     *         (projected) from the table into the index. These are in addition to
     *         the primary key attributes and index key attributes, which are
     *         automatically projected. Each attribute specification is composed of:
     *         <ul> <li> <p><i>ProjectionType</i> - One of the following: <ul> <li>
     *         <p><code>KEYS_ONLY</code> - Only the index and primary keys are
     *         projected into the index. </li> <li> <p><code>INCLUDE</code> - Only
     *         the specified table attributes are projected into the index. The list
     *         of projected attributes are in <i>NonKeyAttributes</i>. </li> <li>
     *         <p><code>ALL</code> - All of the table attributes are projected into
     *         the index. </li> </ul> </li> <li> <p><i>NonKeyAttributes</i> - A list
     *         of one or more non-key attribute names that are projected into the
     *         index. The total count of attributes specified in
     *         <i>NonKeyAttributes</i>, summed across all of the local secondary
     *         indexes, must not exceed 20. If you project the same attribute into
     *         two different indexes, this counts as two distinct attributes when
     *         determining the total. </li> </ul> </li> </ul>
     */
    public void setLocalSecondaryIndexes(java.util.Collection<LocalSecondaryIndex> localSecondaryIndexes) {
        if (localSecondaryIndexes == null) {
            this.localSecondaryIndexes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LocalSecondaryIndex> localSecondaryIndexesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LocalSecondaryIndex>(localSecondaryIndexes.size());
        localSecondaryIndexesCopy.addAll(localSecondaryIndexes);
        this.localSecondaryIndexes = localSecondaryIndexesCopy;
    }
    
    /**
     * One or more secondary indexes (the maximum is five) to be created on
     * the table. Each index is scoped to a given hash key value. There is a
     * 10 gigabyte size limit per hash key; otherwise, the size of a local
     * secondary index is unconstrained. <p>Each secondary index in the array
     * includes the following: <ul> <li> <p><i>IndexName</i> - The name of
     * the secondary index. Must be unique only for this table. <p> </li>
     * <li> <p><i>KeySchema</i> - Specifies the key schema for the index. The
     * key schema must begin with the same hash key attribute as the table.
     * </li> <li> <p><i>Projection</i> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to
     * the primary key attributes and index key attributes, which are
     * automatically projected. Each attribute specification is composed of:
     * <ul> <li> <p><i>ProjectionType</i> - One of the following: <ul> <li>
     * <p><code>KEYS_ONLY</code> - Only the index and primary keys are
     * projected into the index. </li> <li> <p><code>INCLUDE</code> - Only
     * the specified table attributes are projected into the index. The list
     * of projected attributes are in <i>NonKeyAttributes</i>. </li> <li>
     * <p><code>ALL</code> - All of the table attributes are projected into
     * the index. </li> </ul> </li> <li> <p><i>NonKeyAttributes</i> - A list
     * of one or more non-key attribute names that are projected into the
     * index. The total count of attributes specified in
     * <i>NonKeyAttributes</i>, summed across all of the local secondary
     * indexes, must not exceed 20. If you project the same attribute into
     * two different indexes, this counts as two distinct attributes when
     * determining the total. </li> </ul> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param localSecondaryIndexes One or more secondary indexes (the maximum is five) to be created on
     *         the table. Each index is scoped to a given hash key value. There is a
     *         10 gigabyte size limit per hash key; otherwise, the size of a local
     *         secondary index is unconstrained. <p>Each secondary index in the array
     *         includes the following: <ul> <li> <p><i>IndexName</i> - The name of
     *         the secondary index. Must be unique only for this table. <p> </li>
     *         <li> <p><i>KeySchema</i> - Specifies the key schema for the index. The
     *         key schema must begin with the same hash key attribute as the table.
     *         </li> <li> <p><i>Projection</i> - Specifies attributes that are copied
     *         (projected) from the table into the index. These are in addition to
     *         the primary key attributes and index key attributes, which are
     *         automatically projected. Each attribute specification is composed of:
     *         <ul> <li> <p><i>ProjectionType</i> - One of the following: <ul> <li>
     *         <p><code>KEYS_ONLY</code> - Only the index and primary keys are
     *         projected into the index. </li> <li> <p><code>INCLUDE</code> - Only
     *         the specified table attributes are projected into the index. The list
     *         of projected attributes are in <i>NonKeyAttributes</i>. </li> <li>
     *         <p><code>ALL</code> - All of the table attributes are projected into
     *         the index. </li> </ul> </li> <li> <p><i>NonKeyAttributes</i> - A list
     *         of one or more non-key attribute names that are projected into the
     *         index. The total count of attributes specified in
     *         <i>NonKeyAttributes</i>, summed across all of the local secondary
     *         indexes, must not exceed 20. If you project the same attribute into
     *         two different indexes, this counts as two distinct attributes when
     *         determining the total. </li> </ul> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTableRequest withLocalSecondaryIndexes(LocalSecondaryIndex... localSecondaryIndexes) {
        if (getLocalSecondaryIndexes() == null) setLocalSecondaryIndexes(new java.util.ArrayList<LocalSecondaryIndex>(localSecondaryIndexes.length));
        for (LocalSecondaryIndex value : localSecondaryIndexes) {
            getLocalSecondaryIndexes().add(value);
        }
        return this;
    }
    
    /**
     * One or more secondary indexes (the maximum is five) to be created on
     * the table. Each index is scoped to a given hash key value. There is a
     * 10 gigabyte size limit per hash key; otherwise, the size of a local
     * secondary index is unconstrained. <p>Each secondary index in the array
     * includes the following: <ul> <li> <p><i>IndexName</i> - The name of
     * the secondary index. Must be unique only for this table. <p> </li>
     * <li> <p><i>KeySchema</i> - Specifies the key schema for the index. The
     * key schema must begin with the same hash key attribute as the table.
     * </li> <li> <p><i>Projection</i> - Specifies attributes that are copied
     * (projected) from the table into the index. These are in addition to
     * the primary key attributes and index key attributes, which are
     * automatically projected. Each attribute specification is composed of:
     * <ul> <li> <p><i>ProjectionType</i> - One of the following: <ul> <li>
     * <p><code>KEYS_ONLY</code> - Only the index and primary keys are
     * projected into the index. </li> <li> <p><code>INCLUDE</code> - Only
     * the specified table attributes are projected into the index. The list
     * of projected attributes are in <i>NonKeyAttributes</i>. </li> <li>
     * <p><code>ALL</code> - All of the table attributes are projected into
     * the index. </li> </ul> </li> <li> <p><i>NonKeyAttributes</i> - A list
     * of one or more non-key attribute names that are projected into the
     * index. The total count of attributes specified in
     * <i>NonKeyAttributes</i>, summed across all of the local secondary
     * indexes, must not exceed 20. If you project the same attribute into
     * two different indexes, this counts as two distinct attributes when
     * determining the total. </li> </ul> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param localSecondaryIndexes One or more secondary indexes (the maximum is five) to be created on
     *         the table. Each index is scoped to a given hash key value. There is a
     *         10 gigabyte size limit per hash key; otherwise, the size of a local
     *         secondary index is unconstrained. <p>Each secondary index in the array
     *         includes the following: <ul> <li> <p><i>IndexName</i> - The name of
     *         the secondary index. Must be unique only for this table. <p> </li>
     *         <li> <p><i>KeySchema</i> - Specifies the key schema for the index. The
     *         key schema must begin with the same hash key attribute as the table.
     *         </li> <li> <p><i>Projection</i> - Specifies attributes that are copied
     *         (projected) from the table into the index. These are in addition to
     *         the primary key attributes and index key attributes, which are
     *         automatically projected. Each attribute specification is composed of:
     *         <ul> <li> <p><i>ProjectionType</i> - One of the following: <ul> <li>
     *         <p><code>KEYS_ONLY</code> - Only the index and primary keys are
     *         projected into the index. </li> <li> <p><code>INCLUDE</code> - Only
     *         the specified table attributes are projected into the index. The list
     *         of projected attributes are in <i>NonKeyAttributes</i>. </li> <li>
     *         <p><code>ALL</code> - All of the table attributes are projected into
     *         the index. </li> </ul> </li> <li> <p><i>NonKeyAttributes</i> - A list
     *         of one or more non-key attribute names that are projected into the
     *         index. The total count of attributes specified in
     *         <i>NonKeyAttributes</i>, summed across all of the local secondary
     *         indexes, must not exceed 20. If you project the same attribute into
     *         two different indexes, this counts as two distinct attributes when
     *         determining the total. </li> </ul> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTableRequest withLocalSecondaryIndexes(java.util.Collection<LocalSecondaryIndex> localSecondaryIndexes) {
        if (localSecondaryIndexes == null) {
            this.localSecondaryIndexes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LocalSecondaryIndex> localSecondaryIndexesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LocalSecondaryIndex>(localSecondaryIndexes.size());
            localSecondaryIndexesCopy.addAll(localSecondaryIndexes);
            this.localSecondaryIndexes = localSecondaryIndexesCopy;
        }

        return this;
    }

    /**
     * The provisioned throughput settings for the specified table. The
     * settings can be modified using the <i>UpdateTable</i> operation.
     * <p>For current minimum and maximum provisioned throughput values, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
     *
     * @return The provisioned throughput settings for the specified table. The
     *         settings can be modified using the <i>UpdateTable</i> operation.
     *         <p>For current minimum and maximum provisioned throughput values, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the Amazon DynamoDB Developer Guide.
     */
    public ProvisionedThroughput getProvisionedThroughput() {
        return provisionedThroughput;
    }
    
    /**
     * The provisioned throughput settings for the specified table. The
     * settings can be modified using the <i>UpdateTable</i> operation.
     * <p>For current minimum and maximum provisioned throughput values, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
     *
     * @param provisionedThroughput The provisioned throughput settings for the specified table. The
     *         settings can be modified using the <i>UpdateTable</i> operation.
     *         <p>For current minimum and maximum provisioned throughput values, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the Amazon DynamoDB Developer Guide.
     */
    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }
    
    /**
     * The provisioned throughput settings for the specified table. The
     * settings can be modified using the <i>UpdateTable</i> operation.
     * <p>For current minimum and maximum provisioned throughput values, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param provisionedThroughput The provisioned throughput settings for the specified table. The
     *         settings can be modified using the <i>UpdateTable</i> operation.
     *         <p>For current minimum and maximum provisioned throughput values, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the Amazon DynamoDB Developer Guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateTableRequest withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
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
        if (getAttributeDefinitions() != null) sb.append("AttributeDefinitions: " + getAttributeDefinitions() + ",");
        if (getTableName() != null) sb.append("TableName: " + getTableName() + ",");
        if (getKeySchema() != null) sb.append("KeySchema: " + getKeySchema() + ",");
        if (getLocalSecondaryIndexes() != null) sb.append("LocalSecondaryIndexes: " + getLocalSecondaryIndexes() + ",");
        if (getProvisionedThroughput() != null) sb.append("ProvisionedThroughput: " + getProvisionedThroughput() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributeDefinitions() == null) ? 0 : getAttributeDefinitions().hashCode()); 
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode()); 
        hashCode = prime * hashCode + ((getLocalSecondaryIndexes() == null) ? 0 : getLocalSecondaryIndexes().hashCode()); 
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateTableRequest == false) return false;
        CreateTableRequest other = (CreateTableRequest)obj;
        
        if (other.getAttributeDefinitions() == null ^ this.getAttributeDefinitions() == null) return false;
        if (other.getAttributeDefinitions() != null && other.getAttributeDefinitions().equals(this.getAttributeDefinitions()) == false) return false; 
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getKeySchema() == null ^ this.getKeySchema() == null) return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false) return false; 
        if (other.getLocalSecondaryIndexes() == null ^ this.getLocalSecondaryIndexes() == null) return false;
        if (other.getLocalSecondaryIndexes() != null && other.getLocalSecondaryIndexes().equals(this.getLocalSecondaryIndexes()) == false) return false; 
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null) return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false) return false; 
        return true;
    }
    
}
    