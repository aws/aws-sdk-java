/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.LinkedList;
import java.util.List;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.PaginationLoadingStrategy;
import com.amazonaws.services.dynamodbv2.model.ScanResult;

/**
 * Implementation of the List interface that represents the results from a parallel scan
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
public class PaginatedParallelScanList<T> extends PaginatedList<T> {

    /** The current parallel scan task which contains all the information about the scan request */
    private final ParallelScanTask parallelScanTask;

    private final DynamoDBMapperConfig config;

    public PaginatedParallelScanList(
            DynamoDBMapper mapper,
            Class<T> clazz,
            AmazonDynamoDB dynamo,
            ParallelScanTask parallelScanTask,
            PaginationLoadingStrategy paginationLoadingStrategy,
            DynamoDBMapperConfig config) {
        super(mapper, clazz, dynamo, paginationLoadingStrategy);

        this.parallelScanTask = parallelScanTask;
        this.config = config;

        // Marshal the first batch of results in allResults
        allResults.addAll(marshalParallelScanResultsIntoObjects(parallelScanTask.getNextBatchOfScanResults()));

        // If the results should be eagerly loaded at once
        if (paginationLoadingStrategy == PaginationLoadingStrategy.EAGER_LOADING) {
            loadAllResults();
        }
    }

    @Override
    protected boolean atEndOfResults() {
        return parallelScanTask.isAllSegmentScanFinished();
    }

    @Override
    protected List<T> fetchNextPage() {
        return marshalParallelScanResultsIntoObjects(parallelScanTask.getNextBatchOfScanResults());
    }

    private List<T> marshalParallelScanResultsIntoObjects(List<ScanResult> scanResults) {
        List<T> allItems = new LinkedList<T>();
        for (ScanResult scanResult : scanResults) {
            if (null != scanResult) {
                allItems.addAll(mapper.marshallIntoObjects(
                    mapper.toParameters(
                        scanResult.getItems(),
                        clazz,
                        parallelScanTask.getTableName(),
                        config)));
            }
        }
        return allItems;
    }
}
