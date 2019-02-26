/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.document;

import java.util.List;
import java.util.Map;

import com.amazonaws.annotation.ThreadSafe;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.api.BatchGetItemApi;
import com.amazonaws.services.dynamodbv2.document.api.BatchWriteItemApi;
import com.amazonaws.services.dynamodbv2.document.api.ListTablesApi;
import com.amazonaws.services.dynamodbv2.document.internal.BatchGetItemImpl;
import com.amazonaws.services.dynamodbv2.document.internal.BatchWriteItemImpl;
import com.amazonaws.services.dynamodbv2.document.internal.ListTablesImpl;
import com.amazonaws.services.dynamodbv2.document.spec.BatchGetItemSpec;
import com.amazonaws.services.dynamodbv2.document.spec.BatchWriteItemSpec;
import com.amazonaws.services.dynamodbv2.document.spec.ListTablesSpec;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.CreateTableResult;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeysAndAttributes;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ReturnConsumedCapacity;
import com.amazonaws.services.dynamodbv2.model.WriteRequest;

/**
 * DynamoDB Document API. This class is the entry point to make use of this
 * library.
 */
@ThreadSafe
public class DynamoDB implements ListTablesApi, BatchGetItemApi,
        BatchWriteItemApi {
    private final AmazonDynamoDB client;

    private final ListTablesImpl listTablesDelegate;
    private final BatchGetItemImpl batchGetItemDelegate;
    private final BatchWriteItemImpl batchWriteItemDelegate;

    public DynamoDB(AmazonDynamoDB client) {
        if (client == null) {
            throw new IllegalArgumentException();
        }
        this.client = client;
        this.listTablesDelegate = new ListTablesImpl(client);
        this.batchGetItemDelegate = new BatchGetItemImpl(client);
        this.batchWriteItemDelegate = new BatchWriteItemImpl(client);
    }

    /**
     * Create a DynamoDB object that talks to the specified AWS region. The
     * underlying service client will use all the default client configurations,
     * including the default credentials provider chain. See
     * {@link AmazonDynamoDBClient#AmazonDynamoDBClient()} for more information.
     * <p>
     * If you need more control over the client configuration, use
     * {@link DynamoDB#DynamoDB(AmazonDynamoDB)} instead.
     *
     * @param regionEnum
     *            the AWS region enum
     * @see AmazonDynamoDBClient#AmazonDynamoDBClient()
     */
    public DynamoDB(Regions regionEnum) {
        this(new AmazonDynamoDBClient()
                .<AmazonDynamoDBClient>withRegion(regionEnum));
    }

    /**
     * Returns the specified DynamoDB table.  No network call is involved.
     */
    public Table getTable(String tableName) {
        return new Table(client, tableName);
    }

    /**
     * Creates the specified table in DynamoDB.
     */
    public Table createTable(CreateTableRequest req) {
        CreateTableResult result = client.createTable(req);
        return new Table(client, req.getTableName(),
            result.getTableDescription());
    }

    /**
     * Creates the specified table in DynamoDB.
     */
    public Table createTable(String tableName,
            List<KeySchemaElement> keySchema,
            List<AttributeDefinition> attributeDefinitions,
            ProvisionedThroughput provisionedThroughput) {
        return createTable(new CreateTableRequest()
            .withTableName(tableName)
            .withKeySchema(keySchema)
            .withAttributeDefinitions(attributeDefinitions)
            .withProvisionedThroughput(provisionedThroughput));
    }

    @Override
    public TableCollection<ListTablesResult> listTables() {
        return listTablesDelegate.listTables();
    }

    @Override
    public TableCollection<ListTablesResult> listTables(String exclusiveStartTableName) {
        return listTablesDelegate.listTables(exclusiveStartTableName);
    }

    @Override
    public TableCollection<ListTablesResult> listTables(String exclusiveStartTableName,
            int maxResultSize) {
        return listTablesDelegate.listTables(exclusiveStartTableName,
                maxResultSize);
    }

    @Override
    public TableCollection<ListTablesResult> listTables(int maxResultSize) {
        return listTablesDelegate.listTables(maxResultSize);
    }

    @Override
    public TableCollection<ListTablesResult> listTables(ListTablesSpec spec) {
        return listTablesDelegate.listTables(spec);
    }

    @Override
    public BatchGetItemOutcome batchGetItem(
            ReturnConsumedCapacity returnConsumedCapacity,
            TableKeysAndAttributes ... tableKeysAndAttributes) {
        return batchGetItemDelegate.batchGetItem(returnConsumedCapacity,
                tableKeysAndAttributes);
    }

    @Override
    public BatchGetItemOutcome batchGetItem(
            TableKeysAndAttributes ... tableKeysAndAttributes) {
        return batchGetItemDelegate.batchGetItem(tableKeysAndAttributes);
    }

    @Override
    public BatchGetItemOutcome batchGetItem(BatchGetItemSpec spec) {
        return batchGetItemDelegate.batchGetItem(spec);
    }

    @Override
    public BatchGetItemOutcome batchGetItemUnprocessed(
            ReturnConsumedCapacity returnConsumedCapacity,
            Map<String, KeysAndAttributes> unprocessedKeys) {
        return batchGetItemDelegate.batchGetItemUnprocessed(
                returnConsumedCapacity, unprocessedKeys);
    }

    @Override
    public BatchGetItemOutcome batchGetItemUnprocessed(
            Map<String, KeysAndAttributes> unprocessedKeys) {
        return batchGetItemDelegate.batchGetItemUnprocessed(unprocessedKeys);
    }

    @Override
    public BatchWriteItemOutcome batchWriteItem(
            TableWriteItems... tableWriteItems) {
        return batchWriteItemDelegate.batchWriteItem(tableWriteItems);
    }

    @Override
    public BatchWriteItemOutcome batchWriteItem(BatchWriteItemSpec spec) {
        return batchWriteItemDelegate.batchWriteItem(spec);
    }

    @Override
    public BatchWriteItemOutcome batchWriteItemUnprocessed(
            Map<String, List<WriteRequest>> unprocessedItems) {
        return batchWriteItemDelegate.batchWriteItemUnprocessed(unprocessedItems);
    }

    /**
     * Shuts down and release all resources.
     */
    public void shutdown() {
        client.shutdown();
    }
}
