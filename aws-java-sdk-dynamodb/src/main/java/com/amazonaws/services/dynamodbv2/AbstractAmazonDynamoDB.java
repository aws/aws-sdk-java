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
import com.amazonaws.*;
import com.amazonaws.services.dynamodbv2.waiters.AmazonDynamoDBWaiters;

/**
 * Abstract implementation of {@code AmazonDynamoDB}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonDynamoDB implements AmazonDynamoDB {

    protected AbstractAmazonDynamoDB() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetItemResult batchGetItem(BatchGetItemRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchGetItemResult batchGetItem(java.util.Map<String, KeysAndAttributes> requestItems, String returnConsumedCapacity) {
        return batchGetItem(new BatchGetItemRequest().withRequestItems(requestItems).withReturnConsumedCapacity(returnConsumedCapacity));
    }

    @Override
    public BatchGetItemResult batchGetItem(java.util.Map<String, KeysAndAttributes> requestItems) {
        return batchGetItem(new BatchGetItemRequest().withRequestItems(requestItems));
    }

    @Override
    public BatchWriteItemResult batchWriteItem(BatchWriteItemRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchWriteItemResult batchWriteItem(java.util.Map<String, java.util.List<WriteRequest>> requestItems) {
        return batchWriteItem(new BatchWriteItemRequest().withRequestItems(requestItems));
    }

    @Override
    public CreateBackupResult createBackup(CreateBackupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateGlobalTableResult createGlobalTable(CreateGlobalTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTableResult createTable(CreateTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateTableResult createTable(java.util.List<AttributeDefinition> attributeDefinitions, String tableName,
            java.util.List<KeySchemaElement> keySchema, ProvisionedThroughput provisionedThroughput) {
        return createTable(new CreateTableRequest().withAttributeDefinitions(attributeDefinitions).withTableName(tableName).withKeySchema(keySchema)
                .withProvisionedThroughput(provisionedThroughput));
    }

    @Override
    public DeleteBackupResult deleteBackup(DeleteBackupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteItemResult deleteItem(DeleteItemRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteItemResult deleteItem(String tableName, java.util.Map<String, AttributeValue> key) {
        return deleteItem(new DeleteItemRequest().withTableName(tableName).withKey(key));
    }

    @Override
    public DeleteItemResult deleteItem(String tableName, java.util.Map<String, AttributeValue> key, String returnValues) {
        return deleteItem(new DeleteItemRequest().withTableName(tableName).withKey(key).withReturnValues(returnValues));
    }

    @Override
    public DeleteTableResult deleteTable(DeleteTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteTableResult deleteTable(String tableName) {
        return deleteTable(new DeleteTableRequest().withTableName(tableName));
    }

    @Override
    public DescribeBackupResult describeBackup(DescribeBackupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeContinuousBackupsResult describeContinuousBackups(DescribeContinuousBackupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeGlobalTableResult describeGlobalTable(DescribeGlobalTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeGlobalTableSettingsResult describeGlobalTableSettings(DescribeGlobalTableSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLimitsResult describeLimits(DescribeLimitsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTableResult describeTable(DescribeTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTableResult describeTable(String tableName) {
        return describeTable(new DescribeTableRequest().withTableName(tableName));
    }

    @Override
    public DescribeTimeToLiveResult describeTimeToLive(DescribeTimeToLiveRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetItemResult getItem(GetItemRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetItemResult getItem(String tableName, java.util.Map<String, AttributeValue> key) {
        return getItem(new GetItemRequest().withTableName(tableName).withKey(key));
    }

    @Override
    public GetItemResult getItem(String tableName, java.util.Map<String, AttributeValue> key, Boolean consistentRead) {
        return getItem(new GetItemRequest().withTableName(tableName).withKey(key).withConsistentRead(consistentRead));
    }

    @Override
    public ListBackupsResult listBackups(ListBackupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListGlobalTablesResult listGlobalTables(ListGlobalTablesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTablesResult listTables(ListTablesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTablesResult listTables() {
        return listTables(new ListTablesRequest());
    }

    @Override
    public ListTablesResult listTables(String exclusiveStartTableName) {
        return listTables(new ListTablesRequest().withExclusiveStartTableName(exclusiveStartTableName));
    }

    @Override
    public ListTablesResult listTables(String exclusiveStartTableName, Integer limit) {
        return listTables(new ListTablesRequest().withExclusiveStartTableName(exclusiveStartTableName).withLimit(limit));
    }

    @Override
    public ListTablesResult listTables(Integer limit) {
        return listTables(new ListTablesRequest().withLimit(limit));
    }

    @Override
    public ListTagsOfResourceResult listTagsOfResource(ListTagsOfResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutItemResult putItem(PutItemRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutItemResult putItem(String tableName, java.util.Map<String, AttributeValue> item) {
        return putItem(new PutItemRequest().withTableName(tableName).withItem(item));
    }

    @Override
    public PutItemResult putItem(String tableName, java.util.Map<String, AttributeValue> item, String returnValues) {
        return putItem(new PutItemRequest().withTableName(tableName).withItem(item).withReturnValues(returnValues));
    }

    @Override
    public QueryResult query(QueryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RestoreTableFromBackupResult restoreTableFromBackup(RestoreTableFromBackupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RestoreTableToPointInTimeResult restoreTableToPointInTime(RestoreTableToPointInTimeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ScanResult scan(ScanRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ScanResult scan(String tableName, java.util.List<String> attributesToGet) {
        return scan(new ScanRequest().withTableName(tableName).withAttributesToGet(attributesToGet));
    }

    @Override
    public ScanResult scan(String tableName, java.util.Map<String, Condition> scanFilter) {
        return scan(new ScanRequest().withTableName(tableName).withScanFilter(scanFilter));
    }

    @Override
    public ScanResult scan(String tableName, java.util.List<String> attributesToGet, java.util.Map<String, Condition> scanFilter) {
        return scan(new ScanRequest().withTableName(tableName).withAttributesToGet(attributesToGet).withScanFilter(scanFilter));
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TransactGetItemsResult transactGetItems(TransactGetItemsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TransactWriteItemsResult transactWriteItems(TransactWriteItemsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateContinuousBackupsResult updateContinuousBackups(UpdateContinuousBackupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateGlobalTableResult updateGlobalTable(UpdateGlobalTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateGlobalTableSettingsResult updateGlobalTableSettings(UpdateGlobalTableSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateItemResult updateItem(UpdateItemRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateItemResult updateItem(String tableName, java.util.Map<String, AttributeValue> key, java.util.Map<String, AttributeValueUpdate> attributeUpdates) {
        return updateItem(new UpdateItemRequest().withTableName(tableName).withKey(key).withAttributeUpdates(attributeUpdates));
    }

    @Override
    public UpdateItemResult updateItem(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates, String returnValues) {
        return updateItem(new UpdateItemRequest().withTableName(tableName).withKey(key).withAttributeUpdates(attributeUpdates).withReturnValues(returnValues));
    }

    @Override
    public UpdateTableResult updateTable(UpdateTableRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateTableResult updateTable(String tableName, ProvisionedThroughput provisionedThroughput) {
        return updateTable(new UpdateTableRequest().withTableName(tableName).withProvisionedThroughput(provisionedThroughput));
    }

    @Override
    public UpdateTimeToLiveResult updateTimeToLive(UpdateTimeToLiveRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AmazonDynamoDBWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
