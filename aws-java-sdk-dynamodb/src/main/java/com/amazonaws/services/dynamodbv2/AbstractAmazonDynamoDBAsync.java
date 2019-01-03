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
package com.amazonaws.services.dynamodbv2;

import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;

/**
 * Abstract implementation of {@code AmazonDynamoDBAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonDynamoDBAsync extends AbstractAmazonDynamoDB implements AmazonDynamoDBAsync {

    protected AbstractAmazonDynamoDBAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(BatchGetItemRequest request) {

        return batchGetItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(BatchGetItemRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetItemRequest, BatchGetItemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the BatchGetItem operation.
     *
     * @see #batchGetItemAsync(BatchGetItemRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(java.util.Map<String, KeysAndAttributes> requestItems,
            String returnConsumedCapacity) {

        return batchGetItemAsync(new BatchGetItemRequest().withRequestItems(requestItems).withReturnConsumedCapacity(returnConsumedCapacity));
    }

    /**
     * Simplified method form for invoking the BatchGetItem operation with an AsyncHandler.
     *
     * @see #batchGetItemAsync(BatchGetItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(java.util.Map<String, KeysAndAttributes> requestItems,
            String returnConsumedCapacity, com.amazonaws.handlers.AsyncHandler<BatchGetItemRequest, BatchGetItemResult> asyncHandler) {

        return batchGetItemAsync(new BatchGetItemRequest().withRequestItems(requestItems).withReturnConsumedCapacity(returnConsumedCapacity), asyncHandler);
    }

    /**
     * Simplified method form for invoking the BatchGetItem operation.
     *
     * @see #batchGetItemAsync(BatchGetItemRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(java.util.Map<String, KeysAndAttributes> requestItems) {

        return batchGetItemAsync(new BatchGetItemRequest().withRequestItems(requestItems));
    }

    /**
     * Simplified method form for invoking the BatchGetItem operation with an AsyncHandler.
     *
     * @see #batchGetItemAsync(BatchGetItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(java.util.Map<String, KeysAndAttributes> requestItems,
            com.amazonaws.handlers.AsyncHandler<BatchGetItemRequest, BatchGetItemResult> asyncHandler) {

        return batchGetItemAsync(new BatchGetItemRequest().withRequestItems(requestItems), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<BatchWriteItemResult> batchWriteItemAsync(BatchWriteItemRequest request) {

        return batchWriteItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchWriteItemResult> batchWriteItemAsync(BatchWriteItemRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchWriteItemRequest, BatchWriteItemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the BatchWriteItem operation.
     *
     * @see #batchWriteItemAsync(BatchWriteItemRequest)
     */
    @Override
    public java.util.concurrent.Future<BatchWriteItemResult> batchWriteItemAsync(java.util.Map<String, java.util.List<WriteRequest>> requestItems) {

        return batchWriteItemAsync(new BatchWriteItemRequest().withRequestItems(requestItems));
    }

    /**
     * Simplified method form for invoking the BatchWriteItem operation with an AsyncHandler.
     *
     * @see #batchWriteItemAsync(BatchWriteItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<BatchWriteItemResult> batchWriteItemAsync(java.util.Map<String, java.util.List<WriteRequest>> requestItems,
            com.amazonaws.handlers.AsyncHandler<BatchWriteItemRequest, BatchWriteItemResult> asyncHandler) {

        return batchWriteItemAsync(new BatchWriteItemRequest().withRequestItems(requestItems), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest request) {

        return createBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBackupRequest, CreateBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateGlobalTableResult> createGlobalTableAsync(CreateGlobalTableRequest request) {

        return createGlobalTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGlobalTableResult> createGlobalTableAsync(CreateGlobalTableRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateGlobalTableRequest, CreateGlobalTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest request) {

        return createTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the CreateTable operation.
     *
     * @see #createTableAsync(CreateTableRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(java.util.List<AttributeDefinition> attributeDefinitions, String tableName,
            java.util.List<KeySchemaElement> keySchema, ProvisionedThroughput provisionedThroughput) {

        return createTableAsync(new CreateTableRequest().withAttributeDefinitions(attributeDefinitions).withTableName(tableName).withKeySchema(keySchema)
                .withProvisionedThroughput(provisionedThroughput));
    }

    /**
     * Simplified method form for invoking the CreateTable operation with an AsyncHandler.
     *
     * @see #createTableAsync(CreateTableRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(java.util.List<AttributeDefinition> attributeDefinitions, String tableName,
            java.util.List<KeySchemaElement> keySchema, ProvisionedThroughput provisionedThroughput,
            com.amazonaws.handlers.AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler) {

        return createTableAsync(new CreateTableRequest().withAttributeDefinitions(attributeDefinitions).withTableName(tableName).withKeySchema(keySchema)
                .withProvisionedThroughput(provisionedThroughput), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest request) {

        return deleteBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(DeleteItemRequest request) {

        return deleteItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(DeleteItemRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteItemRequest, DeleteItemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DeleteItem operation.
     *
     * @see #deleteItemAsync(DeleteItemRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(String tableName, java.util.Map<String, AttributeValue> key) {

        return deleteItemAsync(new DeleteItemRequest().withTableName(tableName).withKey(key));
    }

    /**
     * Simplified method form for invoking the DeleteItem operation with an AsyncHandler.
     *
     * @see #deleteItemAsync(DeleteItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            com.amazonaws.handlers.AsyncHandler<DeleteItemRequest, DeleteItemResult> asyncHandler) {

        return deleteItemAsync(new DeleteItemRequest().withTableName(tableName).withKey(key), asyncHandler);
    }

    /**
     * Simplified method form for invoking the DeleteItem operation.
     *
     * @see #deleteItemAsync(DeleteItemRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(String tableName, java.util.Map<String, AttributeValue> key, String returnValues) {

        return deleteItemAsync(new DeleteItemRequest().withTableName(tableName).withKey(key).withReturnValues(returnValues));
    }

    /**
     * Simplified method form for invoking the DeleteItem operation with an AsyncHandler.
     *
     * @see #deleteItemAsync(DeleteItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(String tableName, java.util.Map<String, AttributeValue> key, String returnValues,
            com.amazonaws.handlers.AsyncHandler<DeleteItemRequest, DeleteItemResult> asyncHandler) {

        return deleteItemAsync(new DeleteItemRequest().withTableName(tableName).withKey(key).withReturnValues(returnValues), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest request) {

        return deleteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DeleteTable operation.
     *
     * @see #deleteTableAsync(DeleteTableRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(String tableName) {

        return deleteTableAsync(new DeleteTableRequest().withTableName(tableName));
    }

    /**
     * Simplified method form for invoking the DeleteTable operation with an AsyncHandler.
     *
     * @see #deleteTableAsync(DeleteTableRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(String tableName,
            com.amazonaws.handlers.AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler) {

        return deleteTableAsync(new DeleteTableRequest().withTableName(tableName), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupResult> describeBackupAsync(DescribeBackupRequest request) {

        return describeBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupResult> describeBackupAsync(DescribeBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupRequest, DescribeBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeContinuousBackupsResult> describeContinuousBackupsAsync(DescribeContinuousBackupsRequest request) {

        return describeContinuousBackupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContinuousBackupsResult> describeContinuousBackupsAsync(DescribeContinuousBackupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeContinuousBackupsRequest, DescribeContinuousBackupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest request) {

        return describeEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeGlobalTableResult> describeGlobalTableAsync(DescribeGlobalTableRequest request) {

        return describeGlobalTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGlobalTableResult> describeGlobalTableAsync(DescribeGlobalTableRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeGlobalTableRequest, DescribeGlobalTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeGlobalTableSettingsResult> describeGlobalTableSettingsAsync(DescribeGlobalTableSettingsRequest request) {

        return describeGlobalTableSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGlobalTableSettingsResult> describeGlobalTableSettingsAsync(DescribeGlobalTableSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeGlobalTableSettingsRequest, DescribeGlobalTableSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLimitsResult> describeLimitsAsync(DescribeLimitsRequest request) {

        return describeLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLimitsResult> describeLimitsAsync(DescribeLimitsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLimitsRequest, DescribeLimitsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest request) {

        return describeTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeTable operation.
     *
     * @see #describeTableAsync(DescribeTableRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(String tableName) {

        return describeTableAsync(new DescribeTableRequest().withTableName(tableName));
    }

    /**
     * Simplified method form for invoking the DescribeTable operation with an AsyncHandler.
     *
     * @see #describeTableAsync(DescribeTableRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(String tableName,
            com.amazonaws.handlers.AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler) {

        return describeTableAsync(new DescribeTableRequest().withTableName(tableName), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTimeToLiveResult> describeTimeToLiveAsync(DescribeTimeToLiveRequest request) {

        return describeTimeToLiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTimeToLiveResult> describeTimeToLiveAsync(DescribeTimeToLiveRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTimeToLiveRequest, DescribeTimeToLiveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetItemResult> getItemAsync(GetItemRequest request) {

        return getItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetItemResult> getItemAsync(GetItemRequest request,
            com.amazonaws.handlers.AsyncHandler<GetItemRequest, GetItemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetItem operation.
     *
     * @see #getItemAsync(GetItemRequest)
     */
    @Override
    public java.util.concurrent.Future<GetItemResult> getItemAsync(String tableName, java.util.Map<String, AttributeValue> key) {

        return getItemAsync(new GetItemRequest().withTableName(tableName).withKey(key));
    }

    /**
     * Simplified method form for invoking the GetItem operation with an AsyncHandler.
     *
     * @see #getItemAsync(GetItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetItemResult> getItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            com.amazonaws.handlers.AsyncHandler<GetItemRequest, GetItemResult> asyncHandler) {

        return getItemAsync(new GetItemRequest().withTableName(tableName).withKey(key), asyncHandler);
    }

    /**
     * Simplified method form for invoking the GetItem operation.
     *
     * @see #getItemAsync(GetItemRequest)
     */
    @Override
    public java.util.concurrent.Future<GetItemResult> getItemAsync(String tableName, java.util.Map<String, AttributeValue> key, Boolean consistentRead) {

        return getItemAsync(new GetItemRequest().withTableName(tableName).withKey(key).withConsistentRead(consistentRead));
    }

    /**
     * Simplified method form for invoking the GetItem operation with an AsyncHandler.
     *
     * @see #getItemAsync(GetItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetItemResult> getItemAsync(String tableName, java.util.Map<String, AttributeValue> key, Boolean consistentRead,
            com.amazonaws.handlers.AsyncHandler<GetItemRequest, GetItemResult> asyncHandler) {

        return getItemAsync(new GetItemRequest().withTableName(tableName).withKey(key).withConsistentRead(consistentRead), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListBackupsResult> listBackupsAsync(ListBackupsRequest request) {

        return listBackupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackupsResult> listBackupsAsync(ListBackupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBackupsRequest, ListBackupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListGlobalTablesResult> listGlobalTablesAsync(ListGlobalTablesRequest request) {

        return listGlobalTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGlobalTablesResult> listGlobalTablesAsync(ListGlobalTablesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGlobalTablesRequest, ListGlobalTablesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest request) {

        return listTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTablesAsync(ListTablesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync() {

        return listTablesAsync(new ListTablesRequest());
    }

    /**
     * Simplified method form for invoking the ListTables operation with an AsyncHandler.
     *
     * @see #listTablesAsync(ListTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {

        return listTablesAsync(new ListTablesRequest(), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTablesAsync(ListTablesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(String exclusiveStartTableName) {

        return listTablesAsync(new ListTablesRequest().withExclusiveStartTableName(exclusiveStartTableName));
    }

    /**
     * Simplified method form for invoking the ListTables operation with an AsyncHandler.
     *
     * @see #listTablesAsync(ListTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(String exclusiveStartTableName,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {

        return listTablesAsync(new ListTablesRequest().withExclusiveStartTableName(exclusiveStartTableName), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTablesAsync(ListTablesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(String exclusiveStartTableName, Integer limit) {

        return listTablesAsync(new ListTablesRequest().withExclusiveStartTableName(exclusiveStartTableName).withLimit(limit));
    }

    /**
     * Simplified method form for invoking the ListTables operation with an AsyncHandler.
     *
     * @see #listTablesAsync(ListTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(String exclusiveStartTableName, Integer limit,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {

        return listTablesAsync(new ListTablesRequest().withExclusiveStartTableName(exclusiveStartTableName).withLimit(limit), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTablesAsync(ListTablesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(Integer limit) {

        return listTablesAsync(new ListTablesRequest().withLimit(limit));
    }

    /**
     * Simplified method form for invoking the ListTables operation with an AsyncHandler.
     *
     * @see #listTablesAsync(ListTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(Integer limit,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {

        return listTablesAsync(new ListTablesRequest().withLimit(limit), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsOfResourceResult> listTagsOfResourceAsync(ListTagsOfResourceRequest request) {

        return listTagsOfResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsOfResourceResult> listTagsOfResourceAsync(ListTagsOfResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsOfResourceRequest, ListTagsOfResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutItemResult> putItemAsync(PutItemRequest request) {

        return putItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutItemResult> putItemAsync(PutItemRequest request,
            com.amazonaws.handlers.AsyncHandler<PutItemRequest, PutItemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the PutItem operation.
     *
     * @see #putItemAsync(PutItemRequest)
     */
    @Override
    public java.util.concurrent.Future<PutItemResult> putItemAsync(String tableName, java.util.Map<String, AttributeValue> item) {

        return putItemAsync(new PutItemRequest().withTableName(tableName).withItem(item));
    }

    /**
     * Simplified method form for invoking the PutItem operation with an AsyncHandler.
     *
     * @see #putItemAsync(PutItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<PutItemResult> putItemAsync(String tableName, java.util.Map<String, AttributeValue> item,
            com.amazonaws.handlers.AsyncHandler<PutItemRequest, PutItemResult> asyncHandler) {

        return putItemAsync(new PutItemRequest().withTableName(tableName).withItem(item), asyncHandler);
    }

    /**
     * Simplified method form for invoking the PutItem operation.
     *
     * @see #putItemAsync(PutItemRequest)
     */
    @Override
    public java.util.concurrent.Future<PutItemResult> putItemAsync(String tableName, java.util.Map<String, AttributeValue> item, String returnValues) {

        return putItemAsync(new PutItemRequest().withTableName(tableName).withItem(item).withReturnValues(returnValues));
    }

    /**
     * Simplified method form for invoking the PutItem operation with an AsyncHandler.
     *
     * @see #putItemAsync(PutItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<PutItemResult> putItemAsync(String tableName, java.util.Map<String, AttributeValue> item, String returnValues,
            com.amazonaws.handlers.AsyncHandler<PutItemRequest, PutItemResult> asyncHandler) {

        return putItemAsync(new PutItemRequest().withTableName(tableName).withItem(item).withReturnValues(returnValues), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest request) {

        return queryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest request, com.amazonaws.handlers.AsyncHandler<QueryRequest, QueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RestoreTableFromBackupResult> restoreTableFromBackupAsync(RestoreTableFromBackupRequest request) {

        return restoreTableFromBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreTableFromBackupResult> restoreTableFromBackupAsync(RestoreTableFromBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreTableFromBackupRequest, RestoreTableFromBackupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RestoreTableToPointInTimeResult> restoreTableToPointInTimeAsync(RestoreTableToPointInTimeRequest request) {

        return restoreTableToPointInTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreTableToPointInTimeResult> restoreTableToPointInTimeAsync(RestoreTableToPointInTimeRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreTableToPointInTimeRequest, RestoreTableToPointInTimeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ScanResult> scanAsync(ScanRequest request) {

        return scanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ScanResult> scanAsync(ScanRequest request, com.amazonaws.handlers.AsyncHandler<ScanRequest, ScanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the Scan operation.
     *
     * @see #scanAsync(ScanRequest)
     */
    @Override
    public java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.List<String> attributesToGet) {

        return scanAsync(new ScanRequest().withTableName(tableName).withAttributesToGet(attributesToGet));
    }

    /**
     * Simplified method form for invoking the Scan operation with an AsyncHandler.
     *
     * @see #scanAsync(ScanRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.List<String> attributesToGet,
            com.amazonaws.handlers.AsyncHandler<ScanRequest, ScanResult> asyncHandler) {

        return scanAsync(new ScanRequest().withTableName(tableName).withAttributesToGet(attributesToGet), asyncHandler);
    }

    /**
     * Simplified method form for invoking the Scan operation.
     *
     * @see #scanAsync(ScanRequest)
     */
    @Override
    public java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.Map<String, Condition> scanFilter) {

        return scanAsync(new ScanRequest().withTableName(tableName).withScanFilter(scanFilter));
    }

    /**
     * Simplified method form for invoking the Scan operation with an AsyncHandler.
     *
     * @see #scanAsync(ScanRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.Map<String, Condition> scanFilter,
            com.amazonaws.handlers.AsyncHandler<ScanRequest, ScanResult> asyncHandler) {

        return scanAsync(new ScanRequest().withTableName(tableName).withScanFilter(scanFilter), asyncHandler);
    }

    /**
     * Simplified method form for invoking the Scan operation.
     *
     * @see #scanAsync(ScanRequest)
     */
    @Override
    public java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.List<String> attributesToGet,
            java.util.Map<String, Condition> scanFilter) {

        return scanAsync(new ScanRequest().withTableName(tableName).withAttributesToGet(attributesToGet).withScanFilter(scanFilter));
    }

    /**
     * Simplified method form for invoking the Scan operation with an AsyncHandler.
     *
     * @see #scanAsync(ScanRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.List<String> attributesToGet,
            java.util.Map<String, Condition> scanFilter, com.amazonaws.handlers.AsyncHandler<ScanRequest, ScanResult> asyncHandler) {

        return scanAsync(new ScanRequest().withTableName(tableName).withAttributesToGet(attributesToGet).withScanFilter(scanFilter), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TransactGetItemsResult> transactGetItemsAsync(TransactGetItemsRequest request) {

        return transactGetItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TransactGetItemsResult> transactGetItemsAsync(TransactGetItemsRequest request,
            com.amazonaws.handlers.AsyncHandler<TransactGetItemsRequest, TransactGetItemsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TransactWriteItemsResult> transactWriteItemsAsync(TransactWriteItemsRequest request) {

        return transactWriteItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TransactWriteItemsResult> transactWriteItemsAsync(TransactWriteItemsRequest request,
            com.amazonaws.handlers.AsyncHandler<TransactWriteItemsRequest, TransactWriteItemsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateContinuousBackupsResult> updateContinuousBackupsAsync(UpdateContinuousBackupsRequest request) {

        return updateContinuousBackupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContinuousBackupsResult> updateContinuousBackupsAsync(UpdateContinuousBackupsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateContinuousBackupsRequest, UpdateContinuousBackupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateGlobalTableResult> updateGlobalTableAsync(UpdateGlobalTableRequest request) {

        return updateGlobalTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGlobalTableResult> updateGlobalTableAsync(UpdateGlobalTableRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateGlobalTableRequest, UpdateGlobalTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateGlobalTableSettingsResult> updateGlobalTableSettingsAsync(UpdateGlobalTableSettingsRequest request) {

        return updateGlobalTableSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGlobalTableSettingsResult> updateGlobalTableSettingsAsync(UpdateGlobalTableSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateGlobalTableSettingsRequest, UpdateGlobalTableSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateItemResult> updateItemAsync(UpdateItemRequest request) {

        return updateItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateItemResult> updateItemAsync(UpdateItemRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateItemRequest, UpdateItemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the UpdateItem operation.
     *
     * @see #updateItemAsync(UpdateItemRequest)
     */
    @Override
    public java.util.concurrent.Future<UpdateItemResult> updateItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates) {

        return updateItemAsync(new UpdateItemRequest().withTableName(tableName).withKey(key).withAttributeUpdates(attributeUpdates));
    }

    /**
     * Simplified method form for invoking the UpdateItem operation with an AsyncHandler.
     *
     * @see #updateItemAsync(UpdateItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<UpdateItemResult> updateItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates, com.amazonaws.handlers.AsyncHandler<UpdateItemRequest, UpdateItemResult> asyncHandler) {

        return updateItemAsync(new UpdateItemRequest().withTableName(tableName).withKey(key).withAttributeUpdates(attributeUpdates), asyncHandler);
    }

    /**
     * Simplified method form for invoking the UpdateItem operation.
     *
     * @see #updateItemAsync(UpdateItemRequest)
     */
    @Override
    public java.util.concurrent.Future<UpdateItemResult> updateItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates, String returnValues) {

        return updateItemAsync(new UpdateItemRequest().withTableName(tableName).withKey(key).withAttributeUpdates(attributeUpdates)
                .withReturnValues(returnValues));
    }

    /**
     * Simplified method form for invoking the UpdateItem operation with an AsyncHandler.
     *
     * @see #updateItemAsync(UpdateItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<UpdateItemResult> updateItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates, String returnValues,
            com.amazonaws.handlers.AsyncHandler<UpdateItemRequest, UpdateItemResult> asyncHandler) {

        return updateItemAsync(
                new UpdateItemRequest().withTableName(tableName).withKey(key).withAttributeUpdates(attributeUpdates).withReturnValues(returnValues),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest request) {

        return updateTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the UpdateTable operation.
     *
     * @see #updateTableAsync(UpdateTableRequest)
     */
    @Override
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(String tableName, ProvisionedThroughput provisionedThroughput) {

        return updateTableAsync(new UpdateTableRequest().withTableName(tableName).withProvisionedThroughput(provisionedThroughput));
    }

    /**
     * Simplified method form for invoking the UpdateTable operation with an AsyncHandler.
     *
     * @see #updateTableAsync(UpdateTableRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(String tableName, ProvisionedThroughput provisionedThroughput,
            com.amazonaws.handlers.AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler) {

        return updateTableAsync(new UpdateTableRequest().withTableName(tableName).withProvisionedThroughput(provisionedThroughput), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTimeToLiveResult> updateTimeToLiveAsync(UpdateTimeToLiveRequest request) {

        return updateTimeToLiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTimeToLiveResult> updateTimeToLiveAsync(UpdateTimeToLiveRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateTimeToLiveRequest, UpdateTimeToLiveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
