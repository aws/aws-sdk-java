/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper.FailedBatch;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest;
import com.amazonaws.services.s3.model.Region;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Abstract implementation of {@code IDynamoDBMapper}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractDynamoDBMapper implements IDynamoDBMapper {

    private final DynamoDBMapperConfig config;

    protected AbstractDynamoDBMapper(final DynamoDBMapperConfig defaults) {
        this.config = DynamoDBMapperConfig.DEFAULT.merge(defaults);
    }

    protected AbstractDynamoDBMapper() {
        this(DynamoDBMapperConfig.DEFAULT);
    }

    protected final String getTableName(Class<?> clazz, Object object, DynamoDBMapperConfig config) {
        if (config.getObjectTableNameResolver() != null && object != null) {
            return config.getObjectTableNameResolver().getTableName(object, config);
        }
        return getTableName(clazz, config);
    }

    protected final String getTableName(Class<?> clazz, DynamoDBMapperConfig config) {
        if (config.getTableNameResolver() == null) {
            return DynamoDBMapperConfig.DefaultTableNameResolver.INSTANCE.getTableName(clazz, config);
        }
        return config.getTableNameResolver().getTableName(clazz, config);
    }

    protected final DynamoDBMapperConfig mergeConfig(DynamoDBMapperConfig overrides) {
        return this.config.merge(overrides);
    }

    @Override
    public <T extends Object> DynamoDBMapperTableModel<T> getTableModel(Class<T> clazz) {
        return getTableModel(clazz, config);
    }

    @Override
    public <T extends Object> DynamoDBMapperTableModel<T> getTableModel(Class<T> clazz, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public <T> T load(Class<T> clazz, Object hashKey, DynamoDBMapperConfig config) {
        return load(clazz, hashKey, (Object)null, config);
    }

    @Override
    public <T> T load(Class<T> clazz, Object hashKey) {
        return load(clazz, hashKey, (Object)null, config);
    }

    @Override
    public <T> T load(Class<T> clazz, Object hashKey, Object rangeKey) {
        return load(clazz, hashKey, rangeKey, config);
    }

    @Override
    public <T> T load(Class<T> clazz, Object hashKey, Object rangeKey, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public <T> T load(T keyObject) {
        return load(keyObject, config);
    }

    @Override
    public <T> T load(T keyObject, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public <T> T marshallIntoObject(Class<T> clazz, Map<String, AttributeValue> itemAttributes) {
        return marshallIntoObject(clazz, itemAttributes, config);
    }

    public <T> T marshallIntoObject(Class<T> clazz, Map<String, AttributeValue> itemAttributes, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public <T> List<T> marshallIntoObjects(Class<T> clazz, List<Map<String, AttributeValue>> itemAttributes) {
        return marshallIntoObjects(clazz, itemAttributes, config);
    }

    public <T> List<T> marshallIntoObjects(Class<T> clazz, List<Map<String, AttributeValue>> itemAttributes, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public <T> void save(T object) {
        save(object, (DynamoDBSaveExpression)null, config);
    }

    @Override
    public <T> void save(T object, DynamoDBSaveExpression saveExpression) {
        save(object, saveExpression, config);
    }

    @Override
    public <T> void save(T object, DynamoDBMapperConfig config) {
        save(object, (DynamoDBSaveExpression)null, config);
    }

    @Override
    public <T> void save(T object, DynamoDBSaveExpression saveExpression, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public void delete(Object object) {
        delete(object, (DynamoDBDeleteExpression)null, config);
    }

    @Override
    public void delete(Object object, DynamoDBDeleteExpression deleteExpression) {
        delete(object, deleteExpression, config);
    }

    @Override
    public void delete(Object object, DynamoDBMapperConfig config) {
        delete(object, (DynamoDBDeleteExpression)null, config);
    }

    @Override
    public <T> void delete(T object, DynamoDBDeleteExpression deleteExpression, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public void transactionWrite(TransactionWriteRequest transactionWriteRequest) {
        transactionWrite(transactionWriteRequest, (DynamoDBMapperConfig) null);
    }

    @Override
    public void transactionWrite(TransactionWriteRequest transactionWriteRequest, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public List<Object> transactionLoad(TransactionLoadRequest transactionLoadRequest) {
        return transactionLoad(transactionLoadRequest, (DynamoDBMapperConfig) null);
    }

    @Override
    public List<Object> transactionLoad(TransactionLoadRequest transactionLoadRequest, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public List<FailedBatch> batchDelete(Iterable<? extends Object> objectsToDelete) {
        return batchWrite(Collections.emptyList(), objectsToDelete, config);
    }

    @Override
    public List<FailedBatch> batchDelete(Object... objectsToDelete) {
        return batchWrite(Collections.emptyList(), Arrays.asList(objectsToDelete), config);
    }

    @Override
    public List<FailedBatch> batchSave(Iterable<? extends Object> objectsToSave) {
        return batchWrite(objectsToSave, Collections.emptyList(), config);
    }

    @Override
    public List<FailedBatch> batchSave(Object... objectsToSave) {
        return batchWrite(Arrays.asList(objectsToSave), Collections.emptyList(), config);
    }

    @Override
    public List<FailedBatch> batchWrite(Iterable<? extends Object> objectsToWrite,
                                        Iterable<? extends Object> objectsToDelete) {
        return batchWrite(objectsToWrite, objectsToDelete, config);
    }

    @Override
    public List<FailedBatch> batchWrite(Iterable<? extends Object> objectsToWrite,
                                        Iterable<? extends Object> objectsToDelete,
                                        DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public Map<String, List<Object>> batchLoad(Iterable<? extends Object> itemsToGet) {
        return batchLoad(itemsToGet, config);
    }

    @Override
    public Map<String, List<Object>> batchLoad(Iterable<? extends Object> itemsToGet, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public Map<String, List<Object>> batchLoad(Map<Class<?>, List<KeyPair>> itemsToGet) {
        return batchLoad(itemsToGet, config);
    }

    @Override
    public Map<String, List<Object>> batchLoad(Map<Class<?>, List<KeyPair>> itemsToGet, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public <T> PaginatedScanList<T> scan(Class<T> clazz, DynamoDBScanExpression scanExpression) {
        return scan(clazz, scanExpression, config);
    }

    @Override
    public <T> PaginatedScanList<T> scan(Class<T> clazz,
                                         DynamoDBScanExpression scanExpression,
                                         DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public <T> PaginatedParallelScanList<T> parallelScan(Class<T> clazz,
                                                         DynamoDBScanExpression scanExpression,
                                                         int totalSegments) {
        return parallelScan(clazz, scanExpression, totalSegments, config);
    }

    @Override
    public <T> PaginatedParallelScanList<T> parallelScan(Class<T> clazz,
                                                         DynamoDBScanExpression scanExpression,
                                                         int totalSegments,
                                                         DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public <T> ScanResultPage<T> scanPage(Class<T> clazz, DynamoDBScanExpression scanExpression) {
        return scanPage(clazz, scanExpression, config);
    }

    @Override
    public <T> ScanResultPage<T> scanPage(Class<T> clazz,
                                          DynamoDBScanExpression scanExpression,
                                          DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public int count(Class<?> clazz, DynamoDBScanExpression scanExpression) {
        return count(clazz, scanExpression, config);
    }

    @Override
    public int count(Class<?> clazz, DynamoDBScanExpression scanExpression, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public <T> PaginatedQueryList<T> query(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression) {
        return query(clazz, queryExpression, config);
    }

    @Override
    public <T> PaginatedQueryList<T> query(Class<T> clazz,
                                           DynamoDBQueryExpression<T> queryExpression,
                                           DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public <T> QueryResultPage<T> queryPage(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression) {
        return queryPage(clazz, queryExpression, config);
    }

    @Override
    public <T> QueryResultPage<T> queryPage(Class<T> clazz,
                                            DynamoDBQueryExpression<T> queryExpression,
                                            DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public <T> int count(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression) {
        return count(clazz, queryExpression, config);
    }

    @Override
    public <T> int count(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public S3ClientCache getS3ClientCache() {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public S3Link createS3Link(String bucketName, String key) {
        return createS3Link((Region)null, bucketName, key);
    }

    @Override
    public S3Link createS3Link(Region s3region, String bucketName, String key) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public S3Link createS3Link(String s3region, String bucketName, String key) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public CreateTableRequest generateCreateTableRequest(Class<?> clazz) {
        return generateCreateTableRequest(clazz, config);
    }

    public <T> CreateTableRequest generateCreateTableRequest(Class<T> clazz, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

    @Override
    public DeleteTableRequest generateDeleteTableRequest(Class<?> clazz) {
        return generateDeleteTableRequest(clazz, config);
    }

    public <T> DeleteTableRequest generateDeleteTableRequest(Class<T> clazz, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException("operation not supported in " + getClass());
    }

}
