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

import java.util.Map;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.Expected;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.api.PutItemApi;
import com.amazonaws.services.dynamodbv2.document.spec.PutItemSpec;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.PutItemResult;

/**
 * The implementation for <code>PutItemApi</code>.
 */
public class PutItemImpl extends AbstractImpl implements PutItemApi {
    public PutItemImpl(AmazonDynamoDB client, Table table) {
        super(client, table);
    }

    @Override
    public PutItemOutcome putItem(Item item) {
        return doPutItem(new PutItemSpec().withItem(item));
    }

    @Override
    public PutItemOutcome putItem(Item item, Expected ... expected) {
        return doPutItem(new PutItemSpec()
                .withItem(item)
                .withExpected(expected));
    }

    @Override
    public PutItemOutcome putItem(Item item, String conditionExpression,
            Map<String, String> nameMap, Map<String, Object> valueMap) {
        return doPutItem(new PutItemSpec()
                .withItem(item)
                .withConditionExpression(conditionExpression)
                .withNameMap(nameMap)
                .withValueMap(valueMap));
    }

    @Override
    public PutItemOutcome putItem(PutItemSpec spec) {
        return doPutItem(spec);
    }

    private PutItemOutcome doPutItem(PutItemSpec spec) {
        // set the table name
        String tableName = getTable().getTableName();
        PutItemRequest req = spec.getRequest().withTableName(tableName);
        // set up the item
        Item item = spec.getItem();
        final Map<String,AttributeValue> attributes = InternalUtils.toAttributeValues(item);
        // set up the expected attribute map, if any
        final Map<String, ExpectedAttributeValue> expectedMap =
            InternalUtils.toExpectedAttributeValueMap(spec.getExpected());
        // set up the value map, if any (when expression API is used)
        final Map<String,AttributeValue> attrValMap =
            InternalUtils.fromSimpleMap(spec.getValueMap());
        // set up the request
        req.withItem(attributes)
            .withExpected(expectedMap)
            .withExpressionAttributeNames(spec.getNameMap())
            .withExpressionAttributeValues(attrValMap)
            ;
        PutItemResult result = getClient().putItem(req);
        return new PutItemOutcome(result);
    }
}
