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

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.amazonaws.services.dynamodbv2.document.GetItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.GetItemSpec;
import com.amazonaws.services.dynamodbv2.document.utils.AbstractQuickStart;
import com.amazonaws.services.dynamodbv2.document.utils.NameMap;

/**
 * Sample code to get item outcome from DynamoDB table.
 */
public class C_GetItemOutComeTest extends AbstractQuickStart {

    @Before
    public void before() {
        new B_PutItemTest().howToPutItems();
    }

    @Test
    public void howToGetItemOutcomes() {
        Table table = dynamo.getTable(TABLE_NAME);
        for (int i=1; i <= 10; i++) {
            GetItemOutcome outcome = table.getItemOutcome(
                HASH_KEY_NAME, "foo", RANGE_KEY_NAME, i);
            Item item = outcome.getItem();
            System.out.println("========== item " + i + " ==========");
            System.out.println(item);
            byte[] binary = item.getBinary("binary");
            System.out.println("binary: " + Arrays.toString(binary));
            Set<byte[]> binarySet = item.getBinarySet("binarySet");
            for (byte[] ba: binarySet) {
                System.out.println("binary set element: " + Arrays.toString(ba));
            }
            boolean bTrue = item.getBoolean("booleanTrue");
            System.out.println("booleanTrue: " + bTrue);
            int intval = item.getInt("intAttr");
            System.out.println("intAttr: " + intval);
            List<Object> listval = item.getList("listAtr");
            System.out.println("listAtr: " + listval);
            Map<String,Object> mapval = item.getMap("mapAttr");
            System.out.println("mapAttr: " + mapval);
            Object nullval = item.get("nullAttr");
            System.out.println("nullAttr: " + nullval);
            BigDecimal numval = item.getNumber("numberAttr");
            System.out.println("numberAttr: " + numval);
            String strval = item.getString("stringAttr");
            System.out.println("stringAttr: " + strval);
            Set<String> strset = item.getStringSet("stringSetAttr");
            System.out.println("stringSetAttr: " + strset);
            // "Outcome" allows access to the low level result
            System.out.println("low level result: " + outcome.getGetItemResult());
        }
    }

    @Test
    public void howToUseProjectionExpression() {
        Table table = dynamo.getTable(TABLE_NAME);
        for (int i=1; i <= 10; i++) {
            GetItemOutcome outcome = table.getItemOutcome(
                HASH_KEY_NAME, "foo", RANGE_KEY_NAME, i,
                // Here is the projection expression to select 3 attributes
                // to be returned.
                // This expression requires attribute name substitution for 
                // "binary" which is a reserved word in DynamoDB
                "#binary, intAttr, stringAttr", 
                new NameMap().with("#binary", "binary"));
            Item item = outcome.getItem();
            System.out.println("========== item " + i + " ==========");
            System.out.println(item);
            byte[] binary = item.getBinary("binary");
            System.out.println("binary: " + Arrays.toString(binary));
            int intval = item.getInt("intAttr");
            System.out.println("intAttr: " + intval);
            Set<String> strset = item.getStringSet("stringSetAttr");
            System.out.println("stringSetAttr: " + strset);
            // "Outcome" allows access to the low level result
            System.out.println("low level result: " + outcome.getGetItemResult());
        }
    }

    @Test
    public void howToUseGetItemSpec() {
        Table table = dynamo.getTable(TABLE_NAME);
        for (int i=1; i <= 10; i++) {
            GetItemOutcome outcome = table.getItemOutcome(new GetItemSpec()
                .withPrimaryKey(HASH_KEY_NAME, "foo", RANGE_KEY_NAME, i)
                .withProjectionExpression("#binary, intAttr, stringAttr")
                .withNameMap(new NameMap().with("#binary", "binary")));
            Item item = outcome.getItem();
            System.out.println("========== item " + i + " ==========");
            System.out.println(item);
            byte[] binary = item.getBinary("binary");
            System.out.println("binary: " + Arrays.toString(binary));
            int intval = item.getInt("intAttr");
            System.out.println("intAttr: " + intval);
            Set<String> strset = item.getStringSet("stringSetAttr");
            System.out.println("stringSetAttr: " + strset);
            // "Outcome" allows access to the low level result
            System.out.println("low level result: " + outcome.getGetItemResult());
        }
    }

    @Test
    public void getNonExistentItem() {
        Table table = dynamo.getTable(TABLE_NAME);
        GetItemOutcome outcome = table.getItemOutcome(
            HASH_KEY_NAME, "bar", RANGE_KEY_NAME, 99);
        Item item = outcome.getItem();
        Assert.assertNull(item);
        // "Outcome" allows access to the low level result
        System.out.println("low level result: " + outcome.getGetItemResult());
    }
}
