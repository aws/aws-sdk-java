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

public class B_PutItemJacksonTest extends AbstractQuickStart {
    @Test
    public void howToPutItems_withJSONDoc() {
        String json = "{"
                +   "\"person_id\" : 123 ,"
                +   "\"last_name\" : \"Barr\" ,"
                +   "\"first_name\" : \"Jeff\" ,"
                +   "\"current_city\" : \"Tokyo\" ,"
                +   "\"next_haircut\" : {"
                +       "\"year\" : 2014 ,"
                +       "\"month\" : 10 ,"
                +       "\"day\" : 30"
                +   "} ,"
                +   "\"children\" :"
                +   "[ \"SJB\" , \"ASB\" , \"CGB\" , \"BGB\" , \"GTB\" ]"
                + "}"
                ;
        Table table = dynamo.getTable(TABLE_NAME);
        Item item = new Item()
            .withPrimaryKey(HASH_KEY_NAME, "howToPutItems_withJSONDoc", RANGE_KEY_NAME, 1)
            // Store JSON document
            .withJSON("document", json);
        table.putItem(item);
        // Retrieve the entire document and the entire document only
        Item documentItem = table.getItem(new GetItemSpec()
            .withPrimaryKey(HASH_KEY_NAME, "howToPutItems_withJSONDoc", RANGE_KEY_NAME, 1)
            .withAttributesToGet("document"));
        System.out.println(documentItem.getJSON("document"));
        // Output: {"last_name":"Barr","children":["SJB","ASB","CGB","BGB","GTB"],"first_name":"Jeff","person_id":123,"current_city":"Tokyo","next_haircut":{"month":10,"year":2014,"day":30}}
        System.out.println(documentItem.getJSONPretty("document"));
        // Output:
//        {
//            "last_name" : "Barr",
//            "children" : [ "SJB", "ASB", "CGB", "BGB", "GTB" ],
//            "first_name" : "Jeff",
//            "person_id" : 123,
//            "current_city" : "Tokyo",
//            "next_haircut" : {
//              "month" : 10,
//              "year" : 2014,
//              "day" : 30
//            }
//        }        // Retrieve part of a document. Perhaps I need the next_haircut and nothing else
        Item partialDocItem = table.getItem(new GetItemSpec()
            .withPrimaryKey(HASH_KEY_NAME, "howToPutItems_withJSONDoc", RANGE_KEY_NAME, 1)
            .withProjectionExpression("document.next_haircut"))
            ;
        System.out.println(partialDocItem);
        // Output: { Item: {document={next_haircut={month=10, year=2014, day=30}}} }
        // I can update part of a document. Here's how I would change my current_city back to Seattle:
        table.updateItem(new UpdateItemSpec()
            .withPrimaryKey(HASH_KEY_NAME, "howToPutItems_withJSONDoc", RANGE_KEY_NAME, 1)
            .withUpdateExpression("SET document.current_city = :city")
            .withValueMap(new ValueMap().withString(":city", "Seattle"))
        );
        // Retrieve the entire item
        Item itemUpdated = table.getItem(HASH_KEY_NAME, "howToPutItems_withJSONDoc", RANGE_KEY_NAME, 1);
        System.out.println(itemUpdated);
        // Output: { Item: {document={last_name=Bar, children=[SJB, ASB, CGB, BGB, GTB], first_name=Jeff, current_city=Seattle, next_haircut={month=10, year=2014, day=30}}, myRangeKey=1, myHashKey=B_PutItemJsonTest} }
        System.out.println(itemUpdated.getJSONPretty("document"));
        // Output:
//        {
//            "last_name" : "Barr",
//            "children" : [ "SJB", "ASB", "CGB", "BGB", "GTB" ],
//            "first_name" : "Jeff",
//            "current_city" : "Seattle",
//            "person_id" : 123,
//            "next_haircut" : {
//              "month" : 10,
//              "year" : 2014,
//              "day" : 30
//            }
//        }
    }

    @Test
    public void howToPut_TopLevelJSON() {
        String json = "{"
                +   "\"person_id\" : 123 ,"
                +   "\"last_name\" : \"Barr\" ,"
                +   "\"first_name\" : \"Jeff\" ,"
                +   "\"current_city\" : \"Tokyo\" ,"
                +   "\"next_haircut\" : {"
                +       "\"year\" : 2014 ,"
                +       "\"month\" : 10 ,"
                +       "\"day\" : 30"
                +   "} ,"
                +   "\"children\" :"
                +   "[ \"SJB\" , \"ASB\" , \"CGB\" , \"BGB\" , \"GTB\" ]"
                + "}"
                ;
        Table table = dynamo.getTable(TABLE_NAME);
        Item item = Item.fromJSON(json)
             // We don't even need to set the primary key if it's already included in the JSON document
            .withPrimaryKey(HASH_KEY_NAME, "howToPut_TopLevelJSON", RANGE_KEY_NAME, 1);
        table.putItem(item);
        // Retrieve the entire document and the entire document only
        Item documentItem = table.getItem(new GetItemSpec()
            .withPrimaryKey(HASH_KEY_NAME, "howToPut_TopLevelJSON", RANGE_KEY_NAME, 1));
        System.out.println(documentItem.toJSON());
        // Output: {"first_name":"Jeff","myRangeKey":1,"person_id":123,"current_city":"Tokyo","next_haircut":{"month":10,"year":2014,"day":30},"last_name":"Barr","children":["SJB","ASB","CGB","BGB","GTB"],"myHashKey":"howToPut_TopLevelJSON"}
        System.out.println(documentItem.toJSONPretty());
        // Output:
//        {
//            "first_name" : "Jeff",
//            "myRangeKey" : 1,
//            "person_id" : 123,
//            "current_city" : "Tokyo",
//            "next_haircut" : {
//              "month" : 10,
//              "year" : 2014,
//              "day" : 30
//            },
//            "last_name" : "Barr",
//            "children" : [ "SJB", "ASB", "CGB", "BGB", "GTB" ],
//            "myHashKey" : "howToPut_TopLevelJSON"
//          }
        // Retrieve part of a document. Perhaps I need the next_haircut and nothing else
        Item partialDocItem = table.getItem(new GetItemSpec()
            .withPrimaryKey(HASH_KEY_NAME, "howToPut_TopLevelJSON", RANGE_KEY_NAME, 1)
            .withProjectionExpression("next_haircut"))
            ;
        System.out.println(partialDocItem);
        // Output: { Item: {next_haircut={month=10, year=2014, day=30}} }
        // I can update part of a document. Here's how I would change my current_city back to Seattle:
        table.updateItem(new UpdateItemSpec()
            .withPrimaryKey(HASH_KEY_NAME, "howToPut_TopLevelJSON", RANGE_KEY_NAME, 1)
            .withUpdateExpression("SET current_city = :city")
            .withValueMap(new ValueMap().withString(":city", "Seattle"))
        );
        // Retrieve the entire item
        Item itemUpdated = table.getItem(HASH_KEY_NAME, "howToPut_TopLevelJSON", RANGE_KEY_NAME, 1);
        System.out.println(itemUpdated);
        // Output: { Item: {first_name=Jeff, myRangeKey=1, person_id=123, current_city=Seattle, next_haircut={month=10, year=2014, day=30}, last_name=Barr, children=[SJB, ASB, CGB, BGB, GTB], myHashKey=howToPut_TopLevelJSON} }
        System.out.println(itemUpdated.toJSONPretty());
        // Output:
//        {
//            "first_name" : "Jeff",
//            "myRangeKey" : 1,
//            "person_id" : 123,
//            "current_city" : "Seattle",
//            "next_haircut" : {
//              "month" : 10,
//              "year" : 2014,
//              "day" : 30
//            },
//            "last_name" : "Barr",
//            "children" : [ "SJB", "ASB", "CGB", "BGB", "GTB" ],
//            "myHashKey" : "howToPut_TopLevelJSON"
//        }
    }
}
