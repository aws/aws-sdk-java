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
package com.amazonaws.services.dynamodbv2.document.quickstart;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.amazonaws.services.dynamodbv2.document.BatchGetItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.TableKeysAndAttributes;
import com.amazonaws.services.dynamodbv2.document.utils.AbstractQuickStart;
import com.amazonaws.services.dynamodbv2.document.utils.NameMap;
import com.amazonaws.services.dynamodbv2.model.KeysAndAttributes;
import com.amazonaws.services.dynamodbv2.model.ReturnConsumedCapacity;

/**
 * Sample code to perform batch get items from DynamoDB.
 */
public class H_BatchGetItemTest extends AbstractQuickStart {

    @Before
    public void before() throws InterruptedException {
        new B_PutItemTest().howToPutItems();
        F_UpdateItemTest.setupData(dynamo);
    }

    @Test
    public void howToBatchGet_FromOneTable() {
        TableKeysAndAttributes tableKeysAndAttributes =
            new TableKeysAndAttributes(TABLE_NAME)
            .withAttrbuteNames("binary", "booleanTrue", "intAttr",
                    "mapAttr", "stringSetAttr")
            // you can add a bunch of keys in one go
            .addHashAndRangePrimaryKeys(
                HASH_KEY_NAME, RANGE_KEY_NAME,
                "foo",          1,
                "foo",          2,
                "foo",          3
                // etc.
            )
            // or you can take it slow and add one at a time
            .addHashAndRangePrimaryKey(HASH_KEY_NAME, "foo", RANGE_KEY_NAME, 4)
            .addHashAndRangePrimaryKey(HASH_KEY_NAME, "foo", RANGE_KEY_NAME, 5)
            ;
        BatchGetItemOutcome outcome = dynamo.batchGetItem(
                ReturnConsumedCapacity.TOTAL, tableKeysAndAttributes);
        Map<String, List<Item>> tableItems = outcome.getTableItems();
        Assert.assertTrue(tableItems.size() == 1);
        for (Map.Entry<String, List<Item>> e: tableItems.entrySet()) {
            System.out.println("tableName: " + e.getKey());
            for (Item item: e.getValue()) {
                System.out.println("item: " + item);
            }
            Assert.assertTrue(e.getValue().size() == 5);
        }
    }

    @Test
    public void howToUse_ProjectionExpression() {
        TableKeysAndAttributes tableKeysAndAttributes =
            new TableKeysAndAttributes(TABLE_NAME)
            // use projection expression instead of attribute names 
            .withProjectionExpression(
                HASH_KEY_NAME + ", " + RANGE_KEY_NAME + ", "
              + "#binary, booleanTrue, intAttr, mapAttr, stringSetAttr")
            .withNameMap(new NameMap().with("#binary", "binary"))
            // you can add a bunch of keys in one go
            .addHashAndRangePrimaryKeys(
                HASH_KEY_NAME, RANGE_KEY_NAME,
                "foo",          2,
                "foo",          3,
                "foo",          4,
                "foo",          5
                // etc.
            );
        BatchGetItemOutcome outcome = dynamo.batchGetItem(
                ReturnConsumedCapacity.TOTAL, tableKeysAndAttributes);
        Map<String, List<Item>> tableItems = outcome.getTableItems();
        Assert.assertTrue(tableItems.size() == 1);
        for (Map.Entry<String, List<Item>> e: tableItems.entrySet()) {
            System.out.println("tableName: " + e.getKey());
            for (Item item: e.getValue()) {
                System.out.println("item: " + item);
            }
            Assert.assertTrue(e.getValue().size() == 4);
        }
    }

    @Test
    public void howToBatchGet_FromMultipleTables() {
        BatchGetItemOutcome outcome = dynamo.batchGetItem(
            // First table
            new TableKeysAndAttributes(TABLE_NAME)
                .withAttrbuteNames("binary", "booleanTrue", "intAttr",
                        "mapAttr", "stringSetAttr")
                // you can add a bunch of keys in one go
                .addHashAndRangePrimaryKeys(
                    HASH_KEY_NAME, RANGE_KEY_NAME,
                    "foo",          1,
                    "foo",          2,
                    "foo",          3
                    // etc.
                ),
            // Second table
            new TableKeysAndAttributes(F_UpdateItemTest.TABLE_NAME)
                .withAttrbuteNames(F_UpdateItemTest.HASH_KEY, F_UpdateItemTest.RANGE_KEY, "AddressLine1",
                        "city", "state", "zipcode", "phone")
                // you can add a bunch of keys in one go
                .addHashAndRangePrimaryKeys(
                    F_UpdateItemTest.HASH_KEY,          F_UpdateItemTest.RANGE_KEY,
                    F_UpdateItemTest.FIRST_CUSTOMER_ID, F_UpdateItemTest.ADDRESS_TYPE_HOME,
                    F_UpdateItemTest.FIRST_CUSTOMER_ID, F_UpdateItemTest.ADDRESS_TYPE_WORK
                    // etc.
                )
            );
        Map<String, List<Item>> tableItems = outcome.getTableItems();
        Assert.assertTrue(tableItems.size() == 2);
        for (Map.Entry<String, List<Item>> e: tableItems.entrySet()) {
            String tableName = e.getKey();
            System.out.println("tableName: " + tableName);
            for (Item item: e.getValue()) {
                System.out.println("item: " + item);
            }
            if (tableName.equals(TABLE_NAME))
                Assert.assertTrue(e.getValue().size() == 3);
            else 
                Assert.assertTrue(e.getValue().size() == 2);
        }
    }

    @Test
    public void howToHandle_UnprocessedKeys() throws InterruptedException {
        TableKeysAndAttributes tableKeysAndAttributes =
            new TableKeysAndAttributes(TABLE_NAME)
            .withAttrbuteNames("binary", "booleanTrue", "intAttr",
                    "mapAttr", "stringSetAttr")
            // you can add a bunch of keys in one go
            .addHashAndRangePrimaryKeys(
                HASH_KEY_NAME, RANGE_KEY_NAME,
                "foo",          1,
                "foo",          2,
                "foo",          3,
                "foo",          4,
                "foo",          5
                // etc.
            )
            ;
        // unprocessed items from DynamoDB
        int attempts = 0; 
        Map<String, KeysAndAttributes> unprocessed = null ;
        do {
            if (attempts > 0) {
                // exponential backoff per DynamoDB recommendation
                Thread.sleep((1 << attempts) * 1000);
            }
            BatchGetItemOutcome outcome;
            if (unprocessed == null || unprocessed.size() > 0) {
                // handle initial request
                outcome = dynamo.batchGetItem(tableKeysAndAttributes);
            } else {
                // handle unprocessed items
                outcome = dynamo.batchGetItemUnprocessed(unprocessed);
            }
            Map<String, List<Item>> tableItems = outcome.getTableItems();
            for (Map.Entry<String, List<Item>> e : tableItems.entrySet()) {
                System.out.println("tableName: " + e.getKey());
                for (Item item : e.getValue()) {
                    System.out.println("item: " + item);
                }
                Assert.assertTrue(e.getValue().size() == 5);
            }
            unprocessed = outcome.getUnprocessedKeys();
            System.out.println("unprocessed: " + unprocessed);
        } while (unprocessed.size() > 0);
    }
}
