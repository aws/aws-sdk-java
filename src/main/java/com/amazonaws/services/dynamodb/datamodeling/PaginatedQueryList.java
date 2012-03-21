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
package com.amazonaws.services.dynamodb.datamodeling;

import java.util.List;

import com.amazonaws.services.dynamodb.AmazonDynamoDB;
import com.amazonaws.services.dynamodb.model.QueryRequest;
import com.amazonaws.services.dynamodb.model.QueryResult;

/**
 * Implementation of the List interface that represents the results from a query
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
public class PaginatedQueryList<T> extends PaginatedList<T> {

    /** The current query request */
    private final QueryRequest queryRequest;

    /** The current results for the last executed query operation */
    private QueryResult queryResult;


    public PaginatedQueryList(DynamoDBMapper mapper, Class<T> clazz, AmazonDynamoDB dynamo, QueryRequest queryRequest, QueryResult queryResult) {
        super(mapper, clazz, dynamo);

        this.queryRequest = queryRequest;
        this.queryResult  = queryResult;

        allResults.addAll(mapper.marshallIntoObjects(clazz, queryResult.getItems()));
    }

    @Override    
    protected boolean atEndOfResults() {
        return queryResult.getLastEvaluatedKey() == null;
    }

    @Override    
    protected synchronized List<T> fetchNextPage() {
        queryRequest.setExclusiveStartKey(queryResult.getLastEvaluatedKey());
        queryResult = dynamo.query(DynamoDBMapper.applyUserAgent(queryRequest));
        return mapper.marshallIntoObjects(clazz, queryResult.getItems());
    }
}
