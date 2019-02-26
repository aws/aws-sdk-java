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

import com.amazonaws.services.dynamodbv2.document.BatchWriteItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.RangeKeyCondition;
import com.amazonaws.services.dynamodbv2.document.TableWriteItems;
import com.amazonaws.services.dynamodbv2.document.utils.AbstractQuickStart;
import com.amazonaws.services.dynamodbv2.model.WriteRequest;

/**
 * Sample code to perform batch write item to DynamoDB.
 */
public class I_BatchWriteItemTest extends AbstractQuickStart {
    @Before
    public void before() throws InterruptedException {
        F_UpdateItemTest.setupData(dynamo);
        new B_PutItemTest().howToPutItems();
        ItemCollection<?> itemCol = dynamo.getTable(TABLE_NAME)
                .query(HASH_KEY_NAME, "foo",
                        new RangeKeyCondition(RANGE_KEY_NAME).between(1, 5));
          int count = 0;
          for (Item item: itemCol) {
              System.out.println(item);
              count++;
          }
          Assert.assertTrue(count == 5);
    }

    @Test
    public void howToBatchWrite_ToOneTable() {
        TableWriteItems tableWriteItems =
            new TableWriteItems(TABLE_NAME)
            // you can add a bunch of keys to delete in one go
            .withHashAndRangeKeysToDelete(HASH_KEY_NAME, RANGE_KEY_NAME,
                "foo", 1,
                "foo", 2,
                "foo", 3)
            // you can add a bunch of items to put in one go
            .withItemsToPut(
                new Item()
                    .withPrimaryKey(HASH_KEY_NAME, "TestingPutItemInBatch", RANGE_KEY_NAME, 111)
                    .withString("someStringAttr", "someStrVal1")
                    .withInt("someIntAttr", 111),
                new Item()
                    .withPrimaryKey(HASH_KEY_NAME, "TestingPutItemInBatch", RANGE_KEY_NAME, 222)
                    .withString("someStringAttr", "someStrVal2")
                    .withInt("someIntAttr", 222),
                new Item()
                    .withPrimaryKey(HASH_KEY_NAME, "TestingPutItemInBatch", RANGE_KEY_NAME, 333)
                    .withString("someStringAttr", "someStrVal3")
                    .withInt("someIntAttr", 333))
            // or you can take it slow and add one key to delete at a time
            .addHashAndRangePrimaryKeyToDelete(
                HASH_KEY_NAME, "foo", RANGE_KEY_NAME, 4)
            .addHashAndRangePrimaryKeyToDelete(
                HASH_KEY_NAME, "foo", RANGE_KEY_NAME, 5)
            // or you can take it slow and add one item to put at a time
            .addItemToPut(new Item()
                .withPrimaryKey(HASH_KEY_NAME, "TestingPutItemInBatch", RANGE_KEY_NAME, 444)
                .withString("someStringAttr", "someStrVal4")
                .withInt("someIntAttr", 444))
            .addItemToPut(new Item()
                .withPrimaryKey(HASH_KEY_NAME, "TestingPutItemInBatch", RANGE_KEY_NAME, 555)
                .withString("someStringAttr", "someStrVal5")
                .withInt("someIntAttr", 555))
            ;
        BatchWriteItemOutcome outcome = dynamo.batchWriteItem(tableWriteItems);
        System.out.println(outcome);
        verify_BatchWrite_ToOneTable();
    }

    private void verify_BatchWrite_ToOneTable() {
        {   // Verify the 5 items put via the batch operation
            ItemCollection<?> itemCol = dynamo.getTable(TABLE_NAME)
                  .query(HASH_KEY_NAME, "TestingPutItemInBatch",
                          new RangeKeyCondition(RANGE_KEY_NAME).between(111, 555));
            int count = 0;
            for (Item item: itemCol) {
                System.out.println(item);
                count++;
            }
            Assert.assertTrue(count == 5);
        }
        {   // Verify the 5 keys deleted via the batch operation
            ItemCollection<?> itemCol = dynamo.getTable(TABLE_NAME)
                    .query(HASH_KEY_NAME, "foo",
                    new RangeKeyCondition(RANGE_KEY_NAME).between(1, 5));
            int count = 0;
            for (Item item : itemCol) {
                System.out.println(item);
                count++;
            }
            Assert.assertTrue(count == 0);
        }
    }


    @Test
    public void howToBatchWrite_ToMultiTables() {
        BatchWriteItemOutcome outcome = dynamo.batchWriteItem(
            // 1st table 
            new TableWriteItems(TABLE_NAME)
                .withHashAndRangeKeysToDelete(HASH_KEY_NAME, RANGE_KEY_NAME,
                    "foo", 1,
                    "foo", 2)
                .withItemsToPut(
                    new Item()
                        .withPrimaryKey(HASH_KEY_NAME, "TestingPutItemInBatch", RANGE_KEY_NAME, 666)
                        .withString("someStringAttr", "someStrVal6")
                        .withInt("someIntAttr", 666),
                    new Item()
                        .withPrimaryKey(HASH_KEY_NAME, "TestingPutItemInBatch", RANGE_KEY_NAME, 777)
                        .withString("someStringAttr", "someStrVal7")
                        .withInt("someIntAttr", 777)),
            // 2nd table 
            new TableWriteItems(F_UpdateItemTest.TABLE_NAME)
                .withHashAndRangeKeysToDelete(F_UpdateItemTest.HASH_KEY, F_UpdateItemTest.RANGE_KEY,
                        F_UpdateItemTest.FIRST_CUSTOMER_ID, F_UpdateItemTest.ADDRESS_TYPE_HOME,
                        F_UpdateItemTest.FIRST_CUSTOMER_ID, F_UpdateItemTest.ADDRESS_TYPE_WORK)
                .withItemsToPut(
                    new Item()
                        .withPrimaryKey(F_UpdateItemTest.HASH_KEY, 111, 
                            F_UpdateItemTest.RANGE_KEY, F_UpdateItemTest.ADDRESS_TYPE_HOME)
                        .withString("AddressLine1", "crazy ave")
                        .withString("city", "crazy city")
                        .withString("state", "XX")
                        .withInt("zipcode", 99199),
                        new Item()
                    .withPrimaryKey(F_UpdateItemTest.HASH_KEY, 111, 
                            F_UpdateItemTest.RANGE_KEY, F_UpdateItemTest.ADDRESS_TYPE_WORK)
                        .withString("AddressLine1", "silly ave")
                        .withString("city", "silly city")
                        .withString("state", "YY")
                        .withInt("zipcode", 11911)));
        System.out.println(outcome);
        verify_BatchWrite_ToMultiTables();
    }

    private void verify_BatchWrite_ToMultiTables() {
        {   // Verify the 2 items put to the 1st table via the batch operation
            ItemCollection<?> itemCol = dynamo.getTable(TABLE_NAME)
                  .query(HASH_KEY_NAME, "TestingPutItemInBatch",
                          new RangeKeyCondition(RANGE_KEY_NAME).between(666, 777));
            int count = 0;
            for (Item item: itemCol) {
                System.out.println(item);
                count++;
            }
            Assert.assertTrue(count == 2);
        }
        {   // Verify the 2 keys deleted from the 1st table via the batch operation
            ItemCollection<?> itemCol = dynamo.getTable(TABLE_NAME)
                    .query(HASH_KEY_NAME, "foo",
                    new RangeKeyCondition(RANGE_KEY_NAME).between(1, 2));
            int count = 0;
            for (Item item : itemCol) {
                System.out.println(item);
                count++;
            }
            Assert.assertTrue(count == 0);
        }
        {   // Verify the 2 items put to the 2nd table via the batch operation
            ItemCollection<?> itemCol = dynamo.getTable(F_UpdateItemTest.TABLE_NAME)
                  .query(F_UpdateItemTest.HASH_KEY, 111);
            int count = 0;
            for (Item item: itemCol) {
                System.out.println(item);
                count++;
            }
            Assert.assertTrue(count == 2);
        }
        {   // Verify the 2 keys deleted from the 1st table via the batch operation
            ItemCollection<?> itemCol = dynamo.getTable(F_UpdateItemTest.TABLE_NAME)
                    .query(F_UpdateItemTest.HASH_KEY, F_UpdateItemTest.FIRST_CUSTOMER_ID);
            int count = 0;
            for (Item item : itemCol) {
                System.out.println(item);
                count++;
            }
            Assert.assertTrue(count == 0);
        }
    }

    @Test
    public void howToHandle_UnprocessedItems() throws InterruptedException {
        TableWriteItems tableWriteItems =
            new TableWriteItems(TABLE_NAME)
            // you can add a bunch of keys to delete in one go
            .withHashAndRangeKeysToDelete(HASH_KEY_NAME, RANGE_KEY_NAME,
                "foo", 1,
                "foo", 2,
                "foo", 3)
            // you can add a bunch of items to put in one go
            .withItemsToPut(
                new Item()
                    .withPrimaryKey(HASH_KEY_NAME, "TestingPutItemInBatch", RANGE_KEY_NAME, 111)
                    .withString("someStringAttr", "someStrVal1")
                    .withInt("someIntAttr", 111),
                new Item()
                    .withPrimaryKey(HASH_KEY_NAME, "TestingPutItemInBatch", RANGE_KEY_NAME, 222)
                    .withString("someStringAttr", "someStrVal2")
                    .withInt("someIntAttr", 222),
                new Item()
                    .withPrimaryKey(HASH_KEY_NAME, "TestingPutItemInBatch", RANGE_KEY_NAME, 333)
                    .withString("someStringAttr", "someStrVal3")
                    .withInt("someIntAttr", 333));
        // unprocessed items from DynamoDB
        Map<String, List<WriteRequest>> unprocessed = null ;
        int attempts = 0; 
        do {
            if (attempts > 0) {
                // exponential backoff per DynamoDB recommendation
                Thread.sleep((1 << attempts) * 1000);
            }
            attempts++;
            BatchWriteItemOutcome outcome;
            if (unprocessed == null || unprocessed.size() > 0) {
                // handle initial request
                outcome = dynamo.batchWriteItem(tableWriteItems);
            } else {
                // handle unprocessed items
                outcome = dynamo.batchWriteItemUnprocessed(unprocessed);
            }
            System.out.println("outcome: " + outcome);
            unprocessed = outcome.getUnprocessedItems();
            System.out.println("unprocessed: " + unprocessed);
        } while (unprocessed.size() > 0);
    }
}
