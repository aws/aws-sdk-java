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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.LowLevelResultListener;
import com.amazonaws.services.dynamodbv2.document.QueryFilter;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.amazonaws.services.dynamodbv2.document.RangeKeyCondition;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.utils.AbstractQuickStart;
import com.amazonaws.services.dynamodbv2.document.utils.NameMap;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;

/**
 * Sample code to query items from DynamoDB table.
 */
public class D_QueryTest extends AbstractQuickStart {
    @Before
    public void before() {
        new B_PutItemTest().howToPutItems();
    }

    @Test
    public void simpleQuery() {
        Table table = dynamo.getTable(TABLE_NAME);
        ItemCollection<?> col = table.query(HASH_KEY_NAME, "foo", 
            new RangeKeyCondition(RANGE_KEY_NAME).between(1, 10));
        int count = 0; 
        for (Item item: col) {
            System.out.println(item);
            count++;
        }
        Assert.assertTrue(count == 10);
    }

    @Test
    public void howToUseQueryFilters() {
        Table table = dynamo.getTable(TABLE_NAME);
        ItemCollection<QueryOutcome> col = table.query(HASH_KEY_NAME, "foo", 
            new RangeKeyCondition(RANGE_KEY_NAME).between(1, 10), 
            new QueryFilter("intAttr").gt(1238));
        int count = 0; 
        QueryOutcome lastOutcome = null;
        for (Item item: col) {
            Assert.assertTrue(item.getInt("intAttr") > 1238);
            System.out.println(item);
            count++;
            // can retrieve the low level result if needed
            QueryOutcome lowLevelOutcome= col.getLastLowLevelResult();
            if (lowLevelOutcome != lastOutcome) {
                System.out.println(lowLevelOutcome);
                lastOutcome = lowLevelOutcome;
            }
        }
        Assert.assertTrue(count > 0);
        Assert.assertTrue(count < 10);
    }

    @Test
    public void howToUseFilterExpression() {
        Table table = dynamo.getTable(TABLE_NAME);
        ItemCollection<QueryOutcome> col = table.query(
            HASH_KEY_NAME, "foo",
            new RangeKeyCondition(RANGE_KEY_NAME).between(1, 10),
            // filter expression
            "intAttr > :intAttr",
            // no attribute name substitution
            null,     
            // attribute value substitution
            new ValueMap().withInt(":intAttr", 1238));
        // can be notified of the low level result if needed
        col.registerLowLevelResultListener(new LowLevelResultListener<QueryOutcome>() {
            @Override
            public void onLowLevelResult(QueryOutcome outcome) {
                System.out.println(outcome);
            }
        });
        int count = 0; 
        for (Item item: col) {
            Assert.assertTrue(item.getInt("intAttr") > 1238);
            System.out.println(item);
            count++;
        }
        Assert.assertTrue(count > 0);
        Assert.assertTrue(count < 10);
    }

    @Test
    public void howToUseFilterExpression_AttrNameSubstitution() {
        Table table = dynamo.getTable(TABLE_NAME);
        ItemCollection<?> col = table.query(
            HASH_KEY_NAME, "foo",
            new RangeKeyCondition(RANGE_KEY_NAME).between(1, 10),
            // filter expression with name substitution
            "#intAttr > :intAttr",
            // attribute name substitution
            new NameMap().with("#intAttr", "intAttr"),
            // attribute value substitution
            new ValueMap().withInt(":intAttr", 1238));
        int count = 0; 
        for (Item item: col) {
            Assert.assertTrue(item.getInt("intAttr") > 1238);
            System.out.println(item);
            count++;
        }
        Assert.assertTrue(count > 0);
        Assert.assertTrue(count < 10);
    }

    @Test
    public void howToUseProjectionExpression() {
        Table table = dynamo.getTable(TABLE_NAME);
        ItemCollection<?> col = table.query(
            HASH_KEY_NAME, "foo",
            new RangeKeyCondition(RANGE_KEY_NAME).between(1, 10),
            // filter expression
            "#intAttr > :intAttr",
            // projection expression
            "intAttr, #binary",
            // attribute name substitution
            new NameMap()
                .with("#intAttr", "intAttr")
                .with("#binary", "binary"),
            // attribute value substitution
            new ValueMap().withInt(":intAttr", 1238));
        int count = 0; 
        for (Item item: col) {
            Assert.assertTrue(item.getInt("intAttr") > 1238);
            System.out.println(item);
            count++;
        }
        Assert.assertTrue(count > 0);
        Assert.assertTrue(count < 10);
    }
}
