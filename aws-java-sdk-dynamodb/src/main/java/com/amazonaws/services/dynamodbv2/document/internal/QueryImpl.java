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

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.KeyAttribute;
import com.amazonaws.services.dynamodbv2.document.KeyConditions;
import com.amazonaws.services.dynamodbv2.document.QueryFilter;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.amazonaws.services.dynamodbv2.document.RangeKeyCondition;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.api.QueryApi;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.QueryRequest;
import java.util.Collection;
import java.util.Map;

/**
 * The implementation for <code>QueryApi</code> of a table.
 */
public class QueryImpl extends AbstractImpl implements QueryApi {
    public QueryImpl(AmazonDynamoDB client, Table table) {
        super(client, table);
    }

    @Override
    public ItemCollection<QueryOutcome> query(String hashKeyName, Object hashKey) {
        return doQuery(new QuerySpec()
            .withHashKey(new KeyAttribute(hashKeyName, hashKey)));
    }

    @Override
    public ItemCollection<QueryOutcome> query(KeyAttribute hashKey) {
        return doQuery(new QuerySpec().withHashKey(hashKey));
    }

    @Override
    public ItemCollection<QueryOutcome> query(KeyAttribute hashKey,
            RangeKeyCondition rangeKeyCondition) {
        return doQuery(new QuerySpec().withHashKey(hashKey)
                .withRangeKeyCondition(rangeKeyCondition));
    }

    @Override
    public ItemCollection<QueryOutcome> query(KeyAttribute hashKey,
            RangeKeyCondition rangeKeyCondition, QueryFilter... queryFilters) {
        return doQuery(new QuerySpec().withHashKey(hashKey)
                .withRangeKeyCondition(rangeKeyCondition)
                .withQueryFilters(queryFilters));
    }

    @Override
    public ItemCollection<QueryOutcome> query(KeyAttribute hashKey,
            RangeKeyCondition rangeKeyCondition, String filterExpression,
            Map<String, String> nameMap, Map<String, Object> valueMap) {
        return doQuery(new QuerySpec().withHashKey(hashKey)
                .withRangeKeyCondition(rangeKeyCondition)
                .withFilterExpression(filterExpression)
                .withNameMap(nameMap)
                .withValueMap(valueMap));
    }

    @Override
    public ItemCollection<QueryOutcome> query(KeyAttribute hashKey,
            RangeKeyCondition rangeKeyCondition, String filterExpression,
            String projectionExpression, Map<String, String> nameMap,
            Map<String, Object> valueMap) {
        return doQuery(new QuerySpec().withHashKey(hashKey)
                .withRangeKeyCondition(rangeKeyCondition)
                .withFilterExpression(filterExpression)
                .withProjectionExpression(projectionExpression)
                .withNameMap(nameMap)
                .withValueMap(valueMap));
    }

    @Override
    public ItemCollection<QueryOutcome> query(QuerySpec spec) {
        return doQuery(spec);
    }

    protected ItemCollection<QueryOutcome> doQuery(QuerySpec spec) {
        // set the table name
        String tableName = getTable().getTableName();
        QueryRequest req = spec.getRequest().withTableName(tableName);
        // hash key
        final KeyAttribute hashKey = spec.getHashKey();
        if (hashKey != null) {
            addHashKeyCondition(req, hashKey);
        }
        // range key condition
        RangeKeyCondition rangeKeyCond = spec.getRangeKeyCondition();
        if (rangeKeyCond != null) {
            addRangeKeyCondition(req, rangeKeyCond);
        }
        // query filters;
        Collection<QueryFilter> filters = spec.getQueryFilters();
        if (filters != null) {
            req.setQueryFilter(InternalUtils.toAttributeConditionMap(filters));
        }

        // set up the start key, if any
        Collection<KeyAttribute> startKey = spec.getExclusiveStartKey();
        if (startKey != null)
            req.setExclusiveStartKey(InternalUtils.toAttributeValueMap(startKey));

        // set up the value map, if any (when expression API is used)
        final Map<String,AttributeValue> attrValMap = InternalUtils.fromSimpleMap(spec.getValueMap());
        // set up expressions, if any
        req.withExpressionAttributeNames(spec.getNameMap())
           .withExpressionAttributeValues(attrValMap)
           ;
        return new QueryCollection(getClient(), spec);
    }

    private void addHashKeyCondition(QueryRequest req, KeyAttribute hashKey) {
        addKeyCondition(req, hashKey.getName(), ComparisonOperator.EQ, InternalUtils.toAttributeValue(hashKey.getValue()));
    }

    private void addRangeKeyCondition(QueryRequest req, RangeKeyCondition rangeKeyCond) {
        KeyConditions keyCond = rangeKeyCond.getKeyCondition();
        if (keyCond == null) {
            throw new IllegalArgumentException("key condition not specified in range key condition");
        }

        Object[] values = rangeKeyCond.getValues();
        if (values == null) {
            throw new IllegalArgumentException("key condition values not specified in range key condition");
        }

        addKeyCondition(req, rangeKeyCond.getAttrName(), keyCond.toComparisonOperator(), InternalUtils.toAttributeValues(values));
    }

    private void addKeyCondition(QueryRequest req, String keyName, ComparisonOperator comparison, AttributeValue... values) {
        Map<String, Condition> currentConditions = req.getKeyConditions();
        Condition currentCondition = currentConditions == null ? null : currentConditions.get(keyName);
        Condition newCondition = new Condition().withComparisonOperator(comparison)
                                                .withAttributeValueList(values);

        // If there's already a condition on the key in the item, make sure it's not any different than the condition they
        // specified in the query spec
        if (currentCondition == null) {
            req.addKeyConditionsEntry(keyName, newCondition);
        } else if (!currentCondition.equals(newCondition)) {
            throw new IllegalArgumentException("a different condition was specified for '" + keyName + "' in the query spec " +
                                               "and the query request");
        }
    }

    @Override
    public ItemCollection<QueryOutcome> query(String hashKeyName,
            Object hashKeyValue, RangeKeyCondition rangeKeyCondition) {
        return query(new KeyAttribute(hashKeyName, hashKeyValue), rangeKeyCondition);
    }

    @Override
    public ItemCollection<QueryOutcome> query(String hashKeyName,
            Object hashKeyValue, RangeKeyCondition rangeKeyCondition,
            QueryFilter... queryFilters) {
        return query(new KeyAttribute(hashKeyName, hashKeyValue),
                rangeKeyCondition, queryFilters);
    }

    @Override
    public ItemCollection<QueryOutcome> query(String hashKeyName,
            Object hashKeyValue, RangeKeyCondition rangeKeyCondition,
            String filterExpression, Map<String, String> nameMap,
            Map<String, Object> valueMap) {
        return query(new KeyAttribute(hashKeyName, hashKeyValue),
                rangeKeyCondition, filterExpression, nameMap, valueMap);
    }

    @Override
    public ItemCollection<QueryOutcome> query(String hashKeyName,
            Object hashKeyValue, RangeKeyCondition rangeKeyCondition,
            String filterExpression, String projectionExpression,
            Map<String, String> nameMap, Map<String, Object> valueMap) {
        return query(new KeyAttribute(hashKeyName, hashKeyValue),
                rangeKeyCondition, filterExpression, projectionExpression,
                nameMap, valueMap);
    }
}
