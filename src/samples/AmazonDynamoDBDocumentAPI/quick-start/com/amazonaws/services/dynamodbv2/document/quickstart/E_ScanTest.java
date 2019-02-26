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
import com.amazonaws.services.dynamodbv2.document.ScanFilter;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.utils.AbstractQuickStart;
import com.amazonaws.services.dynamodbv2.document.utils.NameMap;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;

/**
 * Sample code to scan items from DynamoDB table.
 */
public class E_ScanTest extends AbstractQuickStart {
    @Before
    public void before() {
        new B_PutItemTest().howToPutItems();
    }

    @Test
    public void howToUseScanFilters() {
        Table table = dynamo.getTable(TABLE_NAME);
        ItemCollection<?> col = table.scan(
                new ScanFilter(HASH_KEY_NAME).eq("foo"),
                new ScanFilter(RANGE_KEY_NAME).between(1, 10)
        );
        int count = 0; 
        for (Item item: col) {
            System.out.println(item);
            count++;
        }
        Assert.assertTrue(count == 10);
    }

    @Test
    public void howToUseFilterExpression() {
        Table table = dynamo.getTable(TABLE_NAME);
        ItemCollection<?> col = table.scan(
            // filter expression
              "myHashKey = :myHashKey AND " 
            + "myRangeKey BETWEEN :lo and :hi AND " 
            + "intAttr > :intAttr",
            // no attribute name substitution
            null,     
            // attribute value substitution
            new ValueMap()
                .withString(":myHashKey", "foo")
                .withInt(":lo", 1).withInt(":hi", 10)
                .withInt(":intAttr", 1238)
        );
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
        ItemCollection<?> col = table.scan(
            // filter expression
              "myHashKey = :myHashKey AND "
            + "#myRangeKey BETWEEN :lo and :hi AND "
            + "intAttr > :intAttr",
            // attribute name substitution
            new NameMap().with("#myRangeKey", "myRangeKey"),
            // attribute value substitution
            new ValueMap()
                .withString(":myHashKey", "foo")
                .withInt(":lo", 1).withInt(":hi", 10)
                .withInt(":intAttr", 1238)
        );
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
        ItemCollection<?> col = table.scan(
            // filter expression
              "myHashKey = :myHashKey AND " 
            + "#myRangeKey BETWEEN :lo and :hi AND " 
            + "intAttr > :intAttr",
            // projection expression
            "intAttr, #binary",
            // attribute name substitution
            new NameMap()
                .with("#myRangeKey", "myRangeKey")
                .with("#binary", "binary"),
            // attribute value substitution
            new ValueMap()
                .withString(":myHashKey", "foo")
                .withInt(":lo", 1).withInt(":hi", 10)
                .withInt(":intAttr", 1238)
        );
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
