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

import java.util.LinkedHashMap;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.Page;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.QueryRequest;
import com.amazonaws.services.dynamodbv2.model.QueryResult;

class QueryCollection extends ItemCollection<QueryOutcome>
{
    private final AmazonDynamoDB client;
    private final QuerySpec spec;
    private final Map<String, AttributeValue> startKey;

    public QueryCollection(AmazonDynamoDB client, QuerySpec spec) {
        this.client = client;
        this.spec = spec;
        Map<String, AttributeValue> startKey =
            spec.getRequest().getExclusiveStartKey();
        this.startKey = startKey == null
                      ? null
                      : new LinkedHashMap<String, AttributeValue>(startKey);
    }

    @Override
    public Page<Item, QueryOutcome> firstPage() {
        QueryRequest request = spec.getRequest();
        request.setExclusiveStartKey(startKey);
        request.setLimit(InternalUtils.minimum(
                spec.getMaxResultSize(),
                spec.getMaxPageSize()));
        QueryResult result = client.query(request);
        QueryOutcome outcome = new QueryOutcome(result);
        setLastLowLevelResult(outcome);
        return new QueryPage(client, spec, request, 0, outcome);
    }

    @Override
    public Integer getMaxResultSize() {
        return spec.getMaxResultSize();
    }

    protected void setLastLowLevelResult(QueryOutcome lowLevelResult) {
        super.setLastLowLevelResult(lowLevelResult);
        QueryResult result = lowLevelResult.getQueryResult();
        accumulateStats(result.getConsumedCapacity(), result.getCount(),
                result.getScannedCount());
    }
}
