/*
 * Copyright 2011-2013 Amazon Technologies, Inc.
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

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.PaginationLoadingStrategy;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;

/**
 * Implementation of the List interface that represents the results from a scan
 * in AWS DynamoDB. Paginated results are loaded on demand when the user
 * executes an operation that requires them. Some operations, such as size(),
 * must fetch the entire list, but results are lazily fetched page by page when
 * possible.
 * <p>
 * This is an unmodifiable list, so callers should not invoke any operations
 * that modify this list, otherwise they will throw an
 * UnsupportedOperationException.
 * 
 * @param <T>
 *            The type of objects held in this list.
 * @see PaginatedList
 */
public class PaginatedScanList<T> extends PaginatedList<T> {

    /** The current scan request */
    private final ScanRequest scanRequest;

    private final DynamoDBMapperConfig config;
    
    /** The current results for the last executed scan operation */
    private ScanResult scanResult;

    public PaginatedScanList(
            DynamoDBMapper mapper,
            Class<T> clazz,
            AmazonDynamoDB dynamo,
            ScanRequest scanRequest,
            ScanResult scanResult,
            PaginationLoadingStrategy paginationLoadingStrategy,
            DynamoDBMapperConfig config
    ) {
        super(mapper, clazz, dynamo, paginationLoadingStrategy);

        this.scanRequest = scanRequest;
        this.scanResult = scanResult;
        this.config = config;

        allResults.addAll(mapper.marshalIntoObjects(
            mapper.toParameters(scanResult.getItems(), clazz, config)));
        
        // If the results should be eagerly loaded at once
        if (paginationLoadingStrategy == PaginationLoadingStrategy.EAGER_LOADING) {
            loadAllResults();
        }
    }

    @Override
    protected boolean atEndOfResults() {
        return scanResult.getLastEvaluatedKey() == null;
    }
    
    @Override
    protected synchronized List<T> fetchNextPage() {
        scanRequest.setExclusiveStartKey(scanResult.getLastEvaluatedKey());
        scanResult = dynamo.scan(DynamoDBMapper.applyUserAgent(scanRequest));
        return mapper.marshalIntoObjects(
            mapper.toParameters(scanResult.getItems(), clazz, config));
    }

}
