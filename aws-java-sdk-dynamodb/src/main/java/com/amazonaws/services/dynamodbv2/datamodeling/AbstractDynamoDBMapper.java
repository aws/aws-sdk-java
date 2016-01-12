/*   
 * Copyright 2015-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.   
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

import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper.FailedBatch;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.s3.model.Region;

/**
 * Abstract implementation of {@code IDynamoDBMapper}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractDynamoDBMapper implements IDynamoDBMapper {

    protected AbstractDynamoDBMapper() {
    }

    @Override
    public <T> T load(Class<T> clazz, Object hashKey, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T load(Class<T> clazz, Object hashKey) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T load(Class<T> clazz, Object hashKey, Object rangeKey) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T load(T keyObject) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T load(T keyObject, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T load(Class<T> clazz, Object hashKey, Object rangeKey, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T marshallIntoObject(Class<T> clazz, Map<String, AttributeValue> itemAttributes) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> List<T> marshallIntoObjects(Class<T> clazz, List<Map<String, AttributeValue>> itemAttributes) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void save(T object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void save(T object, DynamoDBSaveExpression saveExpression) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void save(T object, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void save(T object, DynamoDBSaveExpression saveExpression, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Object object, DynamoDBDeleteExpression deleteExpression) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Object object, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> void delete(T object, DynamoDBDeleteExpression deleteExpression, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<FailedBatch> batchDelete(List<? extends Object> objectsToDelete) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<FailedBatch> batchDelete(Iterable<? extends Object> objectsToDelete) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<FailedBatch> batchDelete(Object... objectsToDelete) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<FailedBatch> batchSave(List<? extends Object> objectsToSave) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<FailedBatch> batchSave(Iterable<? extends Object> objectsToSave) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<FailedBatch> batchSave(Object... objectsToSave) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<FailedBatch> batchWrite(List<? extends Object> objectsToWrite, List<? extends Object> objectsToDelete) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<FailedBatch> batchWrite(Iterable<? extends Object> objectsToWrite,
                                        Iterable<? extends Object> objectsToDelete) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<FailedBatch> batchWrite(List<? extends Object> objectsToWrite,
                                        List<? extends Object> objectsToDelete,
                                        DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<FailedBatch> batchWrite(Iterable<? extends Object> objectsToWrite,
                                        Iterable<? extends Object> objectsToDelete,
                                        DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<String, List<Object>> batchLoad(List<Object> itemsToGet) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<String, List<Object>> batchLoad(Iterable<? extends Object> itemsToGet) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<String, List<Object>> batchLoad(List<Object> itemsToGet, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<String, List<Object>> batchLoad(Iterable<? extends Object> itemsToGet, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<String, List<Object>> batchLoad(Map<Class<?>, List<KeyPair>> itemsToGet) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<String, List<Object>> batchLoad(Map<Class<?>, List<KeyPair>> itemsToGet, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> PaginatedScanList<T> scan(Class<T> clazz, DynamoDBScanExpression scanExpression) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> PaginatedScanList<T> scan(Class<T> clazz,
                                         DynamoDBScanExpression scanExpression,
                                         DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> PaginatedParallelScanList<T> parallelScan(Class<T> clazz,
                                                         DynamoDBScanExpression scanExpression,
                                                         int totalSegments) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> PaginatedParallelScanList<T> parallelScan(Class<T> clazz,
                                                         DynamoDBScanExpression scanExpression,
                                                         int totalSegments,
                                                         DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> ScanResultPage<T> scanPage(Class<T> clazz,
                                          DynamoDBScanExpression scanExpression,
                                          DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> ScanResultPage<T> scanPage(Class<T> clazz, DynamoDBScanExpression scanExpression) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> PaginatedQueryList<T> query(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> PaginatedQueryList<T> query(Class<T> clazz,
                                           DynamoDBQueryExpression<T> queryExpression,
                                           DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> QueryResultPage<T> queryPage(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> QueryResultPage<T> queryPage(Class<T> clazz,
                                            DynamoDBQueryExpression<T> queryExpression,
                                            DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int count(Class<?> clazz, DynamoDBScanExpression scanExpression) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int count(Class<?> clazz, DynamoDBScanExpression scanExpression, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> int count(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> int count(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression, DynamoDBMapperConfig config) {
        throw new UnsupportedOperationException();
    }

    @Override
    public S3ClientCache getS3ClientCache() {
        throw new UnsupportedOperationException();
    }

    @Override
    public S3Link createS3Link(String bucketName, String key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public S3Link createS3Link(Region s3region, String bucketName, String key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateTableRequest generateCreateTableRequest(Class<?> clazz) {
        throw new UnsupportedOperationException();
    }

}
