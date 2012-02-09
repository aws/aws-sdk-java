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
import com.amazonaws.services.dynamodb.model.QueryRequest;
import com.amazonaws.services.dynamodb.model.QueryResult;

/**
 * Implementation of the List interface that represents the results from a query
 * in AWS DynamoDB. Paginated results are loaded on demand when the user
 * executes an operation that requires them. Only
 * {@link PaginatedQueryList#iterator()} is lazy -- fetching the Nth element of
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
public class PaginatedQueryList<T> extends PaginatedList<T> {

    /** The current query request */
    private final QueryRequest queryRequest;

    /** The current results for the last executed query operation */
    private QueryResult queryResult;


    public PaginatedQueryList(DynamoDBMapper mapper, Class<T> clazz, AmazonDynamoDB dynamo, int size, QueryRequest queryRequest, QueryResult queryResult) {
        super(mapper, clazz, dynamo, size);

        this.queryRequest = queryRequest;
        this.queryResult  = queryResult;

        unmarshallResults(queryResult.getItems());
    }

    @Override
    protected boolean hasMoreResults() {
        return queryResult.getLastEvaluatedKey() != null;
    }

    @Override
    protected void loadNextResult() {
        queryRequest.setExclusiveStartKey(queryResult.getLastEvaluatedKey());
        queryResult = dynamo.query(applyUserAgent(queryRequest));
        unmarshallResults(queryResult.getItems());        
    }

}
