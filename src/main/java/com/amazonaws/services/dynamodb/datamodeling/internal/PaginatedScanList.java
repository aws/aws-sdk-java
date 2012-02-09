/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
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
package com.amazonaws.services.dynamodb.datamodeling.internal;

import com.amazonaws.services.dynamodb.AmazonDynamoDB;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodb.model.ScanRequest;
import com.amazonaws.services.dynamodb.model.ScanResult;

/**
 * Implementation of the List interface that represents the results from a scan
 * in AWS DynamoDB. Paginated results are loaded on demand when the user
 * executes an operation that requires them. Only
 * {@link PaginatedScanList#iterator()} is lazy -- fetching the Nth element of
 * the list, converting it to an array, etc. will cause all results to be loaded
 * eagerly.
 * <p>
 * This is an unmodifiable list, so callers should not invoke any operations
 * that modify this list, otherwise they will throw an
 * UnsupportedOperationException.
 * 
 * @param <T>
 *            The type of objects held in this list.
 */
public class PaginatedScanList<T> extends PaginatedList<T> {

    /** The current scan request */
    private final ScanRequest scanRequest;

    /** The current results for the last executed scan operation */
    private ScanResult scanResult;


    public PaginatedScanList(DynamoDBMapper mapper, Class<T> clazz, AmazonDynamoDB dynamo, int size, ScanRequest scanRequest, ScanResult scanResult) {
        super(mapper, clazz, dynamo, size);

        this.scanRequest = scanRequest;
        this.scanResult = scanResult;

        unmarshallResults(scanResult.getItems());
    }

    @Override
    protected synchronized boolean hasMoreResults() {
        return scanResult.getLastEvaluatedKey() != null;
    }

    @Override
    protected synchronized void loadNextResult() {
        scanRequest.setExclusiveStartKey(scanResult.getLastEvaluatedKey());
        scanResult = dynamo.scan(applyUserAgent(scanRequest));
        unmarshallResults(scanResult.getItems());
    }

}
