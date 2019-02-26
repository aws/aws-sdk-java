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
import com.amazonaws.services.dynamodbv2.document.AttributeUpdate;
import com.amazonaws.services.dynamodbv2.document.Expected;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.UpdateItemOutcome;
import com.amazonaws.services.dynamodbv2.document.api.UpdateItemApi;
import com.amazonaws.services.dynamodbv2.document.spec.UpdateItemSpec;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;

/**
 * The implementation for <code>UpdateItemApi</code>.
 */
public class UpdateItemImpl implements UpdateItemApi {

    private final Table table;
    private final AmazonDynamoDB client;

    public UpdateItemImpl(AmazonDynamoDB client, Table table) {
        this.client = client;
        this.table = table;
    }

    @Override
    public UpdateItemOutcome updateItem(PrimaryKey primaryKey,
            AttributeUpdate... attributeUpdates) {
        return updateItem(new UpdateItemSpec()
                .withPrimaryKey(primaryKey)
                .withAttributeUpdate(attributeUpdates));
    }

    @Override
    public UpdateItemOutcome updateItem(PrimaryKey primaryKey,
            Collection<Expected> expected, AttributeUpdate... attributeUpdates) {
        return updateItem(new UpdateItemSpec()
                .withPrimaryKey(primaryKey)
                .withExpected(expected)
                .withAttributeUpdate(attributeUpdates));
    }

    @Override
    public UpdateItemOutcome updateItem(PrimaryKey primaryKey,
            String updateExpression, Map<String, String> nameMap,
            Map<String, Object> valueMap) {
        return updateItem(new UpdateItemSpec()
                .withPrimaryKey(primaryKey)
                .withUpdateExpression(updateExpression)
                .withNameMap(nameMap)
                .withValueMap(valueMap));
    }

    @Override
    public UpdateItemOutcome updateItem(PrimaryKey primaryKey,
            String updateExpression, String conditionExpression,
            Map<String, String> nameMap, Map<String, Object> valueMap) {

        return updateItem(new UpdateItemSpec().withPrimaryKey(primaryKey)
                .withUpdateExpression(updateExpression)
                .withConditionExpression(conditionExpression)
                .withNameMap(nameMap)
                .withValueMap(valueMap));
    }

    @Override
    public UpdateItemOutcome updateItem(UpdateItemSpec spec) {
        return doUpdateItem(spec);
    }

    private UpdateItemOutcome doUpdateItem(UpdateItemSpec spec) {
        final UpdateItemRequest request = spec.getRequest();
        request.setKey(InternalUtils.toAttributeValueMap(spec.getKeyComponents()));
        request.setTableName(table.getTableName());
        final Collection<Expected> expected = spec.getExpected();
        final Map<String, ExpectedAttributeValue> expectedMap =
            InternalUtils.toExpectedAttributeValueMap(expected);
        request.setExpected(expectedMap);
        request.setAttributeUpdates(
            InternalUtils.toAttributeValueUpdate(spec.getAttributeUpdate()));
        request.setExpressionAttributeNames(spec.getNameMap());
        request.setExpressionAttributeValues(
            InternalUtils.fromSimpleMap(spec.getValueMap()));
        return new UpdateItemOutcome(client.updateItem(request));
    }

    @Override
    public UpdateItemOutcome updateItem(String hashKeyName,
            Object hashKeyValue, AttributeUpdate... attributeUpdates) {
        return updateItem(new PrimaryKey(hashKeyName, hashKeyValue),
                attributeUpdates);
    }

    @Override
    public UpdateItemOutcome updateItem(String hashKeyName,
            Object hashKeyValue, String rangeKeyName, Object rangeKeyValue,
            AttributeUpdate... attributeUpdates) {
        return updateItem(new PrimaryKey(hashKeyName, hashKeyValue,
                rangeKeyName, rangeKeyValue), attributeUpdates);
    }

    @Override
    public UpdateItemOutcome updateItem(String hashKeyName,
            Object hashKeyValue, Collection<Expected> expected,
            AttributeUpdate... attributeUpdates) {
        return updateItem(new PrimaryKey(hashKeyName, hashKeyValue),
                expected,
                attributeUpdates);
    }

    @Override
    public UpdateItemOutcome updateItem(
            String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue,
            Collection<Expected> expected,
            AttributeUpdate... attributeUpdates) {
        return updateItem(new PrimaryKey(hashKeyName, hashKeyValue,
                rangeKeyName, rangeKeyValue),
                expected,
                attributeUpdates);
    }

    @Override
    public UpdateItemOutcome updateItem(String hashKeyName,
            Object hashKeyValue, String updateExpression,
            Map<String, String> nameMap, Map<String, Object> valueMap) {
        return updateItem(new PrimaryKey(hashKeyName, hashKeyValue),
                updateExpression, nameMap, valueMap);
    }

    @Override
    public UpdateItemOutcome updateItem(String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue,
            String updateExpression, Map<String, String> nameMap,
            Map<String, Object> valueMap) {
        return updateItem(new PrimaryKey(hashKeyName, hashKeyValue,
                rangeKeyName, rangeKeyValue),
                updateExpression, nameMap, valueMap);
    }

    @Override
    public UpdateItemOutcome updateItem(String hashKeyName,
            Object hashKeyValue, String updateExpression,
            String conditionExpression, Map<String, String> nameMap,
            Map<String, Object> valueMap) {
        return updateItem(new PrimaryKey(hashKeyName, hashKeyValue),
                updateExpression, conditionExpression, nameMap, valueMap);
    }

    @Override
    public UpdateItemOutcome updateItem(String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue,
            String updateExpression, String conditionExpression,
            Map<String, String> nameMap, Map<String, Object> valueMap) {
        return updateItem(new PrimaryKey(hashKeyName, hashKeyValue,
                rangeKeyName, rangeKeyValue),
                updateExpression, conditionExpression, nameMap, valueMap);
    }
}
