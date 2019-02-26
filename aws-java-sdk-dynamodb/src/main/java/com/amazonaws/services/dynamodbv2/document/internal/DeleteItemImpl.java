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
import com.amazonaws.services.dynamodbv2.document.DeleteItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Expected;
import com.amazonaws.services.dynamodbv2.document.KeyAttribute;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.api.DeleteItemApi;
import com.amazonaws.services.dynamodbv2.document.spec.DeleteItemSpec;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.DeleteItemRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteItemResult;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;

/**
 * The implementation for <code>DeleteItemApi</code>.
 */
public class DeleteItemImpl extends AbstractImpl implements DeleteItemApi {
    public DeleteItemImpl(AmazonDynamoDB client, Table table) {
        super(client, table);
    }

    @Override
    public DeleteItemOutcome deleteItem(KeyAttribute... primaryKeyComponents) {
        return doDeleteItem(new DeleteItemSpec()
            .withPrimaryKey(primaryKeyComponents));
    }

    @Override
    public DeleteItemOutcome deleteItem(PrimaryKey primaryKey) {
        return doDeleteItem(new DeleteItemSpec()
                .withPrimaryKey(primaryKey));
    }

    @Override
    public DeleteItemOutcome deleteItem(PrimaryKey primaryKeys,
            Expected... expected) {
        return doDeleteItem(new DeleteItemSpec()
                .withPrimaryKey(primaryKeys)
                .withExpected(expected));
    }

    @Override
    public DeleteItemOutcome deleteItem(PrimaryKey primaryKeys,
            String conditionExpression, Map<String, String> nameMap,
            Map<String, Object> valueMap) {
        return doDeleteItem(new DeleteItemSpec()
            .withPrimaryKey(primaryKeys)
            .withConditionExpression(conditionExpression)
            .withNameMap(nameMap)
            .withValueMap(valueMap))
            ;
    }

    @Override
    public DeleteItemOutcome deleteItem(DeleteItemSpec spec) {
        return doDeleteItem(spec);
    }

    private DeleteItemOutcome doDeleteItem(DeleteItemSpec spec) {
        // set the table name
        final String tableName = getTable().getTableName();
        // set up the keys
        DeleteItemRequest req = spec.getRequest().withTableName(tableName)
            .withKey(InternalUtils.toAttributeValueMap(spec.getKeyComponents()));
        // set up the expected attribute map, if any
        final Collection<Expected> expected = spec.getExpected();
        final Map<String, ExpectedAttributeValue> expectedMap =
            InternalUtils.toExpectedAttributeValueMap(expected);
        // set up the value map, if any (when expression API is used)
        final Map<String,AttributeValue> attrValMap =
            InternalUtils.fromSimpleMap(spec.getValueMap());
        // set up the request
        req.withExpected(expectedMap)
           .withExpressionAttributeNames(spec.getNameMap())
           .withExpressionAttributeValues(attrValMap)
           ;
        DeleteItemResult result = getClient().deleteItem(req);
        return new DeleteItemOutcome(result);
    }

    @Override
    public DeleteItemOutcome deleteItem(String hashKeyName, Object hashKeyValue) {
        return deleteItem(new PrimaryKey(hashKeyName, hashKeyValue));
    }

    @Override
    public DeleteItemOutcome deleteItem(String hashKeyName,
            Object hashKeyValue, String rangeKeyName, Object rangeKeyValue) {
        return deleteItem(
            new PrimaryKey(hashKeyName, hashKeyValue,  rangeKeyName, rangeKeyValue));
    }

    @Override
    public DeleteItemOutcome deleteItem(String hashKeyName,
            Object hashKeyValue, Expected... expected) {
        return deleteItem(new PrimaryKey(hashKeyName, hashKeyValue), expected);
    }

    @Override
    public DeleteItemOutcome deleteItem(String hashKeyName,
            Object hashKeyValue, String rangeKeyName, Object rangeKeyValue,
            Expected... expected) {
        return deleteItem(
                new PrimaryKey(hashKeyName, hashKeyValue,  rangeKeyName, rangeKeyValue),
                    expected);
    }

    @Override
    public DeleteItemOutcome deleteItem(String hashKeyName,
            Object hashKeyValue, String conditionExpression,
            Map<String, String> nameMap, Map<String, Object> valueMap) {
        return deleteItem(new PrimaryKey(hashKeyName, hashKeyValue),
                    conditionExpression, nameMap, valueMap);
    }

    @Override
    public DeleteItemOutcome deleteItem(String hashKeyName,
            Object hashKeyValue, String rangeKeyName, Object rangeKeyValue,
            String conditionExpression, Map<String, String> nameMap,
            Map<String, Object> valueMap) {
        return deleteItem(
                new PrimaryKey(hashKeyName, hashKeyValue,  rangeKeyName, rangeKeyValue),
                    conditionExpression, nameMap, valueMap);
    }
}
