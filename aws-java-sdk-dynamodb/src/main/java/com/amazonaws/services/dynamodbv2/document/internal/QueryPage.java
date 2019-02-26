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
package com.amazonaws.services.dynamodbv2.document.internal;
import static com.amazonaws.services.dynamodbv2.document.internal.InternalUtils.toItemList;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Page;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.QueryRequest;
import com.amazonaws.services.dynamodbv2.model.QueryResult;

class QueryPage extends Page<Item, QueryOutcome> {
    private final AmazonDynamoDB client;
    private final QuerySpec spec;
    private final QueryRequest request;
    private final int index;
    private final Map<String, AttributeValue> lastEvaluatedKey;

    public QueryPage(
            AmazonDynamoDB client,
            QuerySpec spec,
            QueryRequest request,
            int index,
            QueryOutcome outcome) {
        super(Collections.unmodifiableList(
                toItemList(outcome.getQueryResult().getItems())),
            outcome);
        this.client = client;
        this.spec = spec;
        this.request = request;
        this.index = index;

        final Integer max = spec.getMaxResultSize();
        final QueryResult result = outcome.getQueryResult();
        final List<?> ilist = result.getItems();
        final int size = ilist == null ? 0 : ilist.size();
        if (max != null && (index + size) > max) {
            this.lastEvaluatedKey = null;
        } else {
            this.lastEvaluatedKey = result.getLastEvaluatedKey();
        }
    }

    @Override
    public boolean hasNextPage() {
        if (lastEvaluatedKey == null)
            return false;
        Integer max = spec.getMaxResultSize();
        if (max == null)
            return true;
        return nextRequestLimit(max.intValue()) > 0;
    }

    private int nextRequestLimit(int max) {
        int nextIndex = index + this.size();
        return InternalUtils.minimum(
                max - nextIndex,
                spec.getMaxPageSize());
    }

    @Override
    public Page<Item,QueryOutcome> nextPage() {
        if (lastEvaluatedKey == null) {
            throw new NoSuchElementException("No more pages");
        }
        final Integer max = spec.getMaxResultSize();
        if (max != null) {
            int nextLimit = nextRequestLimit(max.intValue());
            if (nextLimit == 0)
                throw new NoSuchElementException("No more pages");
            request.setLimit(nextLimit);
        }
        request.setExclusiveStartKey(lastEvaluatedKey);
        QueryResult result = client.query(request);
        final int nextIndex = index + this.size();
        return new QueryPage(client, spec, request, nextIndex,
                new QueryOutcome(result));
    }
}
