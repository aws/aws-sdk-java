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

import java.util.Collection;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.KeyAttribute;
import com.amazonaws.services.dynamodbv2.document.ScanFilter;
import com.amazonaws.services.dynamodbv2.document.ScanOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.api.ScanApi;
import com.amazonaws.services.dynamodbv2.document.spec.ScanSpec;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;

/**
 * The implementation for <code>ScanApi</code>.
 */
public class ScanImpl extends AbstractImpl implements ScanApi {
    public ScanImpl(AmazonDynamoDB client, Table table) {
        super(client, table);
    }

    @Override
    public ItemCollection<ScanOutcome> scan(ScanFilter... scanFilters) {
        return doScan(new ScanSpec()
                .withScanFilters(scanFilters));
    }


    @Override
    public ItemCollection<ScanOutcome> scan(String filterExpression,
            Map<String, String> nameMap, Map<String, Object> valueMap) {
        return doScan(new ScanSpec()
                .withFilterExpression(filterExpression)
                .withNameMap(nameMap)
                .withValueMap(valueMap));
    }


    @Override
    public ItemCollection<ScanOutcome> scan(String filterExpression,
            String projectionExpression, Map<String, String> nameMap,
            Map<String, Object> valueMap) {
        return doScan(new ScanSpec()
                .withFilterExpression(filterExpression)
                .withProjectionExpression(projectionExpression)
                .withNameMap(nameMap)
                .withValueMap(valueMap));
    }

    @Override
    public ItemCollection<ScanOutcome> scan(ScanSpec spec) {
        return doScan(spec);
    }

    protected ItemCollection<ScanOutcome> doScan(ScanSpec spec) {
        // set the table name
        String tableName = getTable().getTableName();
        ScanRequest req = spec.getRequest().withTableName(tableName);

        // set up the start key, if any
        Collection<KeyAttribute> startKey = spec.getExclusiveStartKey();
        if (startKey != null)
            req.setExclusiveStartKey(InternalUtils.toAttributeValueMap(startKey));

        // scan filters;
        Collection<ScanFilter> filters = spec.getScanFilters();
        if (filters != null) {
            req.setScanFilter(InternalUtils.toAttributeConditionMap(filters));
        }

        // set up the value map, if any (when expression API is used)
        final Map<String,AttributeValue> attrValMap = InternalUtils.fromSimpleMap(spec.getValueMap());
        // set up expressions, if any
        req.withExpressionAttributeNames(spec.getNameMap())
           .withExpressionAttributeValues(attrValMap)
           ;
        return new ScanCollection(getClient(), spec);
    }
}
