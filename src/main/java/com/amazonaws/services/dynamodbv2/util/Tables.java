/*
 * Copyright 2013-2013 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.util;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.DescribeTableRequest;
import com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException;
import com.amazonaws.services.dynamodbv2.model.TableDescription;
import com.amazonaws.services.dynamodbv2.model.TableStatus;

/**
 * Utility methods for working with AWS DynamoDB tables.
 *
 * <pre>
 * if (Tables.doesTableExist(dynamoDB, myTableName) == false) {
 *    // ... create your table ...
 *    Tables.waitForTableToBecomeActive(dynamoDB, myTableName);
 * }
 * </pre>
 */
public class Tables {

    /**
     * Checks if a specified table exists.
     *
     * @param dynamo
     *            The AWS DynamoDB client to use to make requests.
     * @param tableName
     *            The name of the table being searched for.
     *
     * @return True if a table already exists with the specified name, otherwise
     *         false.
     */
    public static boolean doesTableExist(AmazonDynamoDB dynamo, String tableName) {
        try {
            TableDescription table = dynamo.describeTable(new DescribeTableRequest(tableName)).getTable();
            return TableStatus.ACTIVE.toString().equals(table.getTableStatus());
        } catch (ResourceNotFoundException rnfe) {
            // This means the table doesn't exist in the account yet
            return false;
        }
    }

    /**
     * Waits up to 10 minutes for a specified AWS DynamoDB table to move into
     * the <code>ACTIVE</code> state. If the table doesn't transition to the
     * <code>ACTIVE</code> state, then an AmazonClientException is thrown.
     *
     * @param dynamo
     *            The AWS DynamoDB client to use to make requests.
     * @param tableName
     *            The name of the table whose status is being checked.
     *
     * @throws AmazonClientException
     *             If the specified table does not transition into the
     *             <code>ACTIVE</code> state before this method times out and
     *             stops polling.
     */
    public static void waitForTableToBecomeActive(AmazonDynamoDB dynamo, String tableName) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (10 * 60 * 1000);
        while (System.currentTimeMillis() < endTime) {
            try {
                TableDescription table = dynamo.describeTable(new DescribeTableRequest(tableName)).getTable();
                if (table != null && table.getTableStatus().equals(TableStatus.ACTIVE.toString()))
                    return;
            } catch (ResourceNotFoundException rnfe) {
                // ResourceNotFound means the table doesn't exist yet,
                // so ignore this error and just keep polling.
            }

            try {
                Thread.sleep(1000 * 20);
            } catch (InterruptedException e) {
                Thread.interrupted();
                throw new AmazonClientException("Interrupted while waiting for table to become active", e);
            }
        }

        throw new AmazonClientException("Table " + tableName + " never became active");
    }
}