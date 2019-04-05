/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.AbstractMap;
import java.util.Map;

import org.junit.Test;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;

/**
 * Tests on using convenient map setters.
 */
public class ConvenientMapSetterTest {

    /** Test on using map entry adder method. */
    @Test
    public void testMapEntryAdderMethod() {
        PutItemRequest putItemRequest = new PutItemRequest()
                .addItemEntry("hash-key", new AttributeValue().withS("1"))
                .addItemEntry("range-key", new AttributeValue().withS("2"))
                .addItemEntry("attribute", new AttributeValue().withS("3"));

        Map<String, AttributeValue> item = putItemRequest.getItem();
        assertEquals(3, item.size());
        assertEquals("1", item.get("hash-key").getS());
        assertEquals("2", item.get("range-key").getS());
        assertEquals("3", item.get("attribute").getS());

        putItemRequest.clearItemEntries();
        assertNull(putItemRequest.getItem());
    }

    /** Test on using predefined map entry setter to provide map parameter. */
    @Test
    public void testPredefinedMapEntryMethod() {
        ScanRequest scanRequest = new ScanRequest().withExclusiveStartKey(
                new AbstractMap.SimpleEntry<String, AttributeValue>("hash-key", new AttributeValue().withS("1")), 
                new AbstractMap.SimpleEntry<String, AttributeValue>("range-key", new AttributeValue().withS("2")));

        Map<String, AttributeValue> item = scanRequest.getExclusiveStartKey();
        assertEquals(2, item.size());
        assertEquals("1", item.get("hash-key").getS());
        assertEquals("2", item.get("range-key").getS());
    }

    /** Test on IllegalArgumentException when providing duplicated keys. */
    @Test(expected = IllegalArgumentException.class)
    public void testDuplicatedKeysException() {
        new PutItemRequest()
                .addItemEntry("hash-key", new AttributeValue().withS("1"))
                .addItemEntry("hash-key", new AttributeValue().withS("2"));
    }

    /** Test on handling null entry objects. */
    @Test
    public void testNullEntryException() {
        // hashKey is set as not nullable, and rangeKey is nullable
        // so this call should be fine.
        ScanRequest scanRequest = new ScanRequest().withExclusiveStartKey(
                new AbstractMap.SimpleEntry<String, AttributeValue>("hash-key", new AttributeValue().withS("1")), 
                null);

        // but this call should throw IllegalArgumentException.
        try {
            scanRequest.withExclusiveStartKey(
                    null,
                    new AbstractMap.SimpleEntry<String, AttributeValue>("hash-key", new AttributeValue().withS("1")));
            fail("Should throw IllegalArgumentException.");
        } catch (IllegalArgumentException iae) {
        }
    }
}
