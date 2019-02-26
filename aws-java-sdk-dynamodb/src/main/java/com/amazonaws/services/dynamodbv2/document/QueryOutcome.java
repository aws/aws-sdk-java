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

import com.amazonaws.services.dynamodbv2.document.internal.InternalUtils;
import com.amazonaws.services.dynamodbv2.model.QueryResult;

/**
 * The outcome of query on DynamoDB table.
 */
public class QueryOutcome {
    private final QueryResult result;

    /**
     * @param result the low-level result; must not be null
     */
    public QueryOutcome(QueryResult result) {
        if (result == null)
            throw new IllegalArgumentException();
        this.result = result;
    }

    /**
     * Returns a non-null list of the returned items; can be empty.
     */
    public List<Item> getItems() {
        return InternalUtils.toItemList(result.getItems());
    }

    /**
     * Returns a non-null low-level result returned from the server side.
     */
    public QueryResult getQueryResult() {
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(result);
    }
}
