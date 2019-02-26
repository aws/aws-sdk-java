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
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.GetItemSpec;
import com.amazonaws.services.dynamodbv2.document.spec.UpdateItemSpec;
import com.amazonaws.services.dynamodbv2.document.utils.AbstractQuickStart;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;

public class B_PutItemJsonTest extends AbstractQuickStart {
    @Test
    public void howToPutItems() {
        Table table = dynamo.getTable(TABLE_NAME);
        Item item = new Item()
            .withPrimaryKey(HASH_KEY_NAME, "B_PutItemJsonTest", RANGE_KEY_NAME, 1)
            // Store document as a map
            .withMap("document", new ValueMap()
                .withString("last_name", "Bar")
                .withString("first_name", "Jeff")
                .withString("current_city", "Tokyo")
                .withMap("next_haircut", 
                    new ValueMap()
                        .withInt("year", 2014)
                        .withInt("month", 10)
                        .withInt("day", 30))
                .withList("children", "SJB", "ASB", "CGB", "BGB", "GTB")
            );
        table.putItem(item);
        // Retrieve the entire document and the entire document only
        Item documentItem = table.getItem(new GetItemSpec()
            .withPrimaryKey(HASH_KEY_NAME, "B_PutItemJsonTest", RANGE_KEY_NAME, 1)
            .withAttributesToGet("document"));
        System.out.println(documentItem.get("document"));
        // Output: {last_name=Bar, children=[SJB, ASB, CGB, BGB, GTB], first_name=Jeff, current_city=Tokyo, next_haircut={month=10, year=2014, day=30}}
        // Retrieve part of a document. Perhaps I need the next_haircut and nothing else
        Item partialDocItem = table.getItem(new GetItemSpec()
            .withPrimaryKey(HASH_KEY_NAME, "B_PutItemJsonTest", RANGE_KEY_NAME, 1)
            .withProjectionExpression("document.next_haircut"))
            ;
        System.out.println(partialDocItem);
        // Output: { Item: {document={next_haircut={month=10, year=2014, day=30}}} }
        // I can update part of a document. Here's how I would change my current_city back to Seattle:
        table.updateItem(new UpdateItemSpec()
            .withPrimaryKey(HASH_KEY_NAME, "B_PutItemJsonTest", RANGE_KEY_NAME, 1)
            .withUpdateExpression("SET document.current_city = :city")
            .withValueMap(new ValueMap().withString(":city", "Seattle"))
        );
        // Retrieve the entire item
        Item itemUpdated = table.getItem(HASH_KEY_NAME, "B_PutItemJsonTest", RANGE_KEY_NAME, 1);
        System.out.println(itemUpdated);
        // Output: { Item: {document={last_name=Bar, children=[SJB, ASB, CGB, BGB, GTB], first_name=Jeff, current_city=Seattle, next_haircut={month=10, year=2014, day=30}}, myRangeKey=1, myHashKey=B_PutItemJsonTest} }
    }
}
