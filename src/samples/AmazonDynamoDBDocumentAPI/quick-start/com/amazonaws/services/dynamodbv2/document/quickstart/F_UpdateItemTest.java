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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.Arrays;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.AttributeUpdate;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Expected;
import com.amazonaws.services.dynamodbv2.document.GetItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.GetItemSpec;
import com.amazonaws.services.dynamodbv2.document.utils.FluentHashSet;
import com.amazonaws.services.dynamodbv2.document.utils.NameMap;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.amazonaws.services.dynamodbv2.model.TableDescription;

/**
 * Sample code to update items to a dynamo table.
 */
public class F_UpdateItemTest {
    private static DynamoDB dynamo;

    public static final String TABLE_NAME = "F_UpdateItemTest";

    public static final String HASH_KEY = "customer_id";
    public static final String RANGE_KEY = "address_type";

    private static final long READ_CAPACITY = 1;

    private static final long WRITE_CAPACITY = 1;

    public static final long FIRST_CUSTOMER_ID = 1000L;

    public static final String ADDRESS_TYPE_HOME = "home";
    public static final String ADDRESS_TYPE_WORK = "work";

    @BeforeClass
    public static void setUp() throws Exception {
        AmazonDynamoDBClient client = new AmazonDynamoDBClient(awsTestCredentials());
        dynamo = new DynamoDB(client);
        setupData(dynamo);
    }
    
    static void setupData(DynamoDB dynamo) throws InterruptedException {
        createTable(dynamo);
        fillInData(dynamo);
    }

    private static void createTable(DynamoDB dynamo) throws InterruptedException {
        Table table = dynamo.getTable(TABLE_NAME);
        TableDescription desc = table.waitForActiveOrDelete();
        if (desc == null) {
            // table doesn't exist; let's create it
            KeySchemaElement hashKey = 
                new KeySchemaElement(HASH_KEY, KeyType.HASH);
            KeySchemaElement rangeKey = 
                new KeySchemaElement(RANGE_KEY, KeyType.RANGE);
            CreateTableRequest createTableRequest = 
                new CreateTableRequest(TABLE_NAME, Arrays.asList(hashKey, rangeKey))
                .withAttributeDefinitions(
                    new AttributeDefinition(HASH_KEY, ScalarAttributeType.N),
                    new AttributeDefinition(RANGE_KEY, ScalarAttributeType.S))
                .withProvisionedThroughput(
                    new ProvisionedThroughput(READ_CAPACITY, WRITE_CAPACITY));
            table = dynamo.createTable(createTableRequest);
            table.waitForActive();
        }
    }

    private static void fillInData(DynamoDB dynamo) {
        Table table = dynamo.getTable(TABLE_NAME);
        table.putItem(new Item().withLong(HASH_KEY, FIRST_CUSTOMER_ID)
            .withString(RANGE_KEY, ADDRESS_TYPE_WORK)
            .withString("AddressLine1", "1918 8th Aven")
            .withString("city", "seattle")
            .withString("state", "WA")
            .withInt("zipcode", 98104));
        table.putItem(new Item().withLong(HASH_KEY, FIRST_CUSTOMER_ID)
            .withString(RANGE_KEY, ADDRESS_TYPE_HOME)
            .withString("AddressLine1", "15606 NE 40th ST")
            .withString("city", "redmond")
            .withString("state", "WA")
            .withInt("zipcode", 98052));
    }

    @Test
    public void howToAddElementsToSet() {
        Table table = dynamo.getTable(TABLE_NAME);
        // Add a set of phone numbers to the attribute "phone"
        final String phoneNumber1 = "123-456-7890";
        table.updateItem(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK,
            new AttributeUpdate("phone").put(new FluentHashSet<String>(phoneNumber1)));
        GetItemOutcome outcome = table.getItemOutcome(new GetItemSpec()
            .withPrimaryKey(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK)
            .withConsistentRead(true)
        );
        Item item = outcome.getItem();
        Set<String> phoneNumbers = item.getStringSet("phone");
        assertTrue(1 == phoneNumbers.size());
        System.out.println(phoneNumbers);

        // Add a 2nd phone number to the set
        final String phoneNumber2 = "987-654-3210";
        table.updateItem(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK,
            new AttributeUpdate("phone").addElements(phoneNumber2));
        outcome = table.getItemOutcome(new GetItemSpec()
            .withPrimaryKey(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK)
            .withConsistentRead(true));
        item = outcome.getItem();
        phoneNumbers = item.getStringSet("phone");
        System.out.println(phoneNumbers);
        assertTrue(2== phoneNumbers.size());

        // removes the 2nd phone number from the set
        table.updateItem(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK,
            new AttributeUpdate("phone").removeElements(phoneNumber2));
        outcome = table.getItemOutcome(new GetItemSpec()
            .withPrimaryKey(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK)
            .withConsistentRead(true));
        item = outcome.getItem();
        phoneNumbers = item.getStringSet("phone");
        System.out.println(phoneNumbers);
        assertTrue(1 == phoneNumbers.size());

        // deletes the phone attribute
        table.updateItem(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK, 
                new AttributeUpdate("phone").delete());
        outcome = table.getItemOutcome(new GetItemSpec()
            .withPrimaryKey(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK)
            .withConsistentRead(true));
        item = outcome.getItem();
        phoneNumbers = item.getStringSet("phone");
        assertNull(phoneNumbers);
    }

    @Test
    public void howToAddNumerically() {
        Table table = dynamo.getTable(TABLE_NAME);
        GetItemOutcome outcome = table.getItemOutcome(new GetItemSpec()
            .withPrimaryKey(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK)
            .withConsistentRead(true)
        );
        Item item = outcome.getItem();
        final int oldZipCode = item.getInt("zipcode");

        // Increments the zip code attribute
        table.updateItem(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK,
                new AttributeUpdate("zipcode").addNumeric(1));
        outcome = table.getItemOutcome(new GetItemSpec()
            .withPrimaryKey(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK)
            .withConsistentRead(true));
        item = outcome.getItem();
        int newZipCode = item.getInt("zipcode");
        assertEquals(oldZipCode + 1, newZipCode);

        // Decrements the zip code attribute
        table.updateItem(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK,
                new AttributeUpdate("zipcode").addNumeric(-1));
        outcome = table.getItemOutcome(new GetItemSpec()
            .withPrimaryKey(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK)
            .withConsistentRead(true));
        item = outcome.getItem();
        newZipCode = item.getInt("zipcode");
        assertEquals(oldZipCode, newZipCode);
    }

    @Test
    public void howToSpecifyUpdateConditions() {
        final String phoneNumberToAdd = "987-654-3210";
        Table table = dynamo.getTable(TABLE_NAME);
        System.out.println(table.getItemOutcome(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK));
        try {
            table.updateItem(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK,
                // Specifies the criteria that the "phone" attribute must exist
                // as a precondition to adding the phone number
                Arrays.asList(new Expected("phone").exists()),
                // Adds the phone number if the expectation is satisfied
                new AttributeUpdate("phone").addElements(phoneNumberToAdd));
            fail("Update Should fail as the phone number attribute is not present in the row");
        } catch (AmazonServiceException expected) {
            // Failed the criteria as expected
        }
    }

    @Test
    public void howToUseUpdateExpression() {
        Table table = dynamo.getTable(TABLE_NAME);
        table.updateItem(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK,
            // update expression
            "set #phoneAttributeName = :phoneAtributeValue", 
            new NameMap().with("#phoneAttributeName", "phone"),
            new ValueMap().withStringSet(":phoneAtributeValue",
                "123-456-7890", "987-654-3210")
            );
        GetItemOutcome outcome = table.getItemOutcome(new GetItemSpec()
            .withPrimaryKey(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK)
            .withConsistentRead(true));
        Item item = outcome.getItem();
        Set<String> phoneNumbers = item.getStringSet("phone");
        assertTrue(phoneNumbers.size() == 2);
        System.out.println(phoneNumbers);
    }

    @Test
    public void howToUseConditionExpression() {
        Table table = dynamo.getTable(TABLE_NAME);
        GetItemOutcome outcome = table.getItemOutcome(new GetItemSpec()
            .withPrimaryKey(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK)
            .withConsistentRead(true));
        Item item = outcome.getItem();
        System.out.println(item);
        table.updateItem(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK,
            // update expression (list_append: concatenate two lists.)
            "set phone = list_append(:a, :b)",
            // condition expression
            "zipcode = :zipcode", 
            null,
            new ValueMap()
                 .withInt(":zipcode", 98104)
                 .withList(":a", "phone-1", "phone-2")
                 .withList(":b", "phone-3", "phone-4")
         );
        outcome = table.getItemOutcome(new GetItemSpec()
            .withPrimaryKey(HASH_KEY, FIRST_CUSTOMER_ID, RANGE_KEY, ADDRESS_TYPE_WORK)
            .withConsistentRead(true));
        item = outcome.getItem();
        System.out.println(item);
    }

    @AfterClass
    public static void shutDown() {
//        Table table = dynamo.getTable(TABLE_NAME);
//        table.delete();
        dynamo.shutdown();
    }

    protected static AWSCredentials awsTestCredentials() {
        try {
            return new PropertiesCredentials(new File(
                    System.getProperty("user.home")
                            + "/.aws/awsTestAccount.properties"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
