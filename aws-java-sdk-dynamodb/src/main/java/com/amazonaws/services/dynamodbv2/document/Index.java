/*
 * Copyright 2014-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.api.QueryApi;
import com.amazonaws.services.dynamodbv2.document.internal.IndexQueryImpl;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;

/**
 * Represents a secondary index on a DynamoDB table. This covers
 * both GSI (Global Secondary Index) and LSI (Local Secondary Index). Instance
 * of this class can be obtained via {@link Table#getIndex(String)}.
 */
public class Index implements QueryApi {
    private final Table table;
    private final String indexName;
    private final QueryApi queryDelegate;

    Index(AmazonDynamoDB client, String indexName, Table table) {
        if (client == null)
            throw new IllegalArgumentException("client must be specified");
        if (indexName == null || indexName.trim().length() == 0)
            throw new IllegalArgumentException("index name must not be null or empty");
        if (table == null)
            throw new IllegalArgumentException("table must be specified");
        this.table = table;
        this.indexName = indexName;
        this.queryDelegate = new IndexQueryImpl(client, this);
    }

    /**
     * Returns the owning table.
     */
    public final Table getTable() {
        return table;
    }

    /**
     * @return the name of this index
     */
    public final String getIndexName() {
        return indexName;
    }

    @Override
    public ItemCollection<QueryOutcome> query(KeyAttribute hashKey,
            RangeKeyCondition rangeKeyCondition) {
        return queryDelegate.query(hashKey, rangeKeyCondition);
    }

    @Override
    public ItemCollection<QueryOutcome> query(KeyAttribute hashKey,
            RangeKeyCondition rangeKeyCondition, QueryFilter... queryFilters) {
        return queryDelegate.query(hashKey, rangeKeyCondition, queryFilters);
    }

    @Override
    public ItemCollection<QueryOutcome> query(KeyAttribute hashKey,
            RangeKeyCondition rangeKeyCondition, String filterExpression,
            Map<String, String> nameMap, Map<String, Object> valueMap) {
        return queryDelegate.query(hashKey, rangeKeyCondition,
                filterExpression, nameMap, valueMap);
    }

    @Override
    public ItemCollection<QueryOutcome> query(KeyAttribute hashKey,
            RangeKeyCondition rangeKeyCondition, String projectionExpression,
            String filterExpression, Map<String, String> nameMap,
            Map<String, Object> valueMap) {
        return queryDelegate.query(hashKey, rangeKeyCondition,
                projectionExpression, filterExpression, nameMap, valueMap);
    }

    @Override
    public ItemCollection<QueryOutcome> query(QuerySpec spec) {
        return queryDelegate.query(spec);
    }

    @Override
    public ItemCollection<QueryOutcome> query(
            String hashKeyName, Object hashKeyValue) {
        return queryDelegate.query(hashKeyName, hashKeyValue);
    }

    @Override
    public ItemCollection<QueryOutcome> query(String hashKeyName,
            Object hashKeyValue, RangeKeyCondition rangeKeyCondition) {
        return queryDelegate.query(hashKeyName, hashKeyValue, rangeKeyCondition);
    }

    @Override
    public ItemCollection<QueryOutcome> query(String hashKeyName,
            Object hashKeyValue, RangeKeyCondition rangeKeyCondition,
            QueryFilter... queryFilters) {
        return queryDelegate.query(hashKeyName, hashKeyValue,
                rangeKeyCondition, queryFilters);
    }

    @Override
    public ItemCollection<QueryOutcome> query(String hashKeyName,
            Object hashKeyValue, RangeKeyCondition rangeKeyCondition,
            String filterExpression, Map<String, String> nameMap,
            Map<String, Object> valueMap) {
        return queryDelegate.query(hashKeyName, hashKeyValue,
                rangeKeyCondition, filterExpression, nameMap, valueMap);
    }

    @Override
    public ItemCollection<QueryOutcome> query(String hashKeyName,
            Object hashKeyValue, RangeKeyCondition rangeKeyCondition,
            String filterExpression, String projectionExpression,
            Map<String, String> nameMap, Map<String, Object> valueMap) {
        return queryDelegate.query(hashKeyName, hashKeyValue,
                rangeKeyCondition, filterExpression, projectionExpression,
                nameMap, valueMap);
    }

    @Override
    public ItemCollection<QueryOutcome> query(KeyAttribute hashKey) {
        return queryDelegate.query(hashKey);
    }
}
