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

import org.junit.Test;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.utils.AbstractQuickStart;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;

/**
 * Sample code to put items to a DynamoDB table.
 */
public class B_PutItemTest extends AbstractQuickStart {
    @Test
    public void howToPutItems() {
        Table table = dynamo.getTable(TABLE_NAME);
        Item item = newItem();
        int intAttrVal = item.getInt("intAttr");
        // Creates 10 items of range key values from 1 to 10
        for (int i=1; i <= 10; i++) {
            PutItemOutcome result = table.putItem(
                item.withInt(RANGE_KEY_NAME, i)
                .withInt("intAttr", intAttrVal+i)
            );
            System.out.println(result);
        }
    }

    private Item newItem() {
        Item item = new Item()
            .withString(HASH_KEY_NAME, "foo")
            .withBinary("binary", new byte[]{1,2,3,4})
            .withBinarySet("binarySet", new byte[]{5,6}, new byte[]{7,8})
            .withBoolean("booleanTrue", true)
            .withBoolean("booleanFalse", false)
            .withInt("intAttr", 1234)
            .withList("listAtr","abc", "123")
            .withMap("mapAttr",
                new ValueMap()
                    .withString("key1", "value1")
                    .withInt("key2", 999))
            .withNull("nullAttr")
            .withNumber("numberAttr", 999.1234)
            .withString("stringAttr", "bla")
            .withStringSet("stringSetAttr", "da","di","foo","bar","bazz")
            ;
        return item;
    }
}
