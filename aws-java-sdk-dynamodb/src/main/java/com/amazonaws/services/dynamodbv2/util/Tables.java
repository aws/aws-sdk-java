/*
 * Copyright 2013-2015 Amazon Technologies, Inc.
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
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.DescribeTableRequest;
import com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException;
import com.amazonaws.services.dynamodbv2.model.TableDescription;
import com.amazonaws.services.dynamodbv2.model.TableStatus;

/**
 * Utility methods for working with AWS DynamoDB tables.
 *
 * <pre class="brush: java">
 * if (Tables.doesTableExist(dynamoDB, myTableName) == false) {
 *    // ... create your table ...
 *    Tables.awaitTableToBecomeActive(dynamoDB, myTableName);
 * }
 * </pre>
 */
public class Tables {
    private static final int DEFAULT_WAIT_TIMEOUT = 10 * 60 * 1000;
    private static final int DEFAULT_WAIT_INTERVAL = 20 * 1000;

    /**
     * Checks if a specified table exists and is in <code>ACTIVE</code> state.
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
     *
     * @deprecated Use {@link #awaitTableToBecomeActive(AmazonDynamoDB, String)}.
     */
    @Deprecated
    public static void waitForTableToBecomeActive(AmazonDynamoDB dynamo, String tableName) {
        waitForTableToBecomeActive(dynamo, tableName, DEFAULT_WAIT_TIMEOUT, DEFAULT_WAIT_INTERVAL);
    }

    /**
     * Waits up to 10 minutes for a specified AWS DynamoDB table to move into
     * the <code>ACTIVE</code> state. If the table doesn't transition to the
     * <code>ACTIVE</code> state, then an AmazonClientException is thrown.
     *
     * @param dynamo
     *        The AWS DynamoDB client to use to make requests.
     * @param tableName
     *        The name of the table whose status is being checked.
     *
     * @throws AmazonClientException
     *             If the specified table does not transition into the
     *             <code>ACTIVE</code> state before this method times out and
     *             stops polling.
     * @throws InterruptedException
     *             If the thread is interrupted while waiting for the table to
     *             transition into the <code>ACTIVE</code> state.
     */
    public static void awaitTableToBecomeActive(AmazonDynamoDB dynamo, String tableName) throws InterruptedException {
        awaitTableToBecomeActive(dynamo, tableName, DEFAULT_WAIT_TIMEOUT, DEFAULT_WAIT_INTERVAL);
    }

    /**
     * Waits up to a specified amount of time for a specified AWS DynamoDB
     * table to move into the <code>ACTIVE</code> state. If the table doesn't
     * transition to the <code>ACTIVE</code> state, then an
     * AmazonClientException is thrown.
     *
     * @param dynamo
     *            The AWS DynamoDB client to use to make requests.
     * @param tableName
     *            The name of the table whose status is being checked.
     * @param timeout
     *            The maximum number of milliseconds to wait.
     * @param interval
     *            The poll interval in milliseconds.
     *
     * @throws AmazonClientException
     *             If the specified table does not transition into the
     *             <code>ACTIVE</code> state before this method times out and
     *             stops polling.
     *
     * @deprecated Use {@link #awaitTableToBecomeActive(AmazonDynamoDB, String, int, int)}.
     */
    @Deprecated
    public static void waitForTableToBecomeActive(AmazonDynamoDB dynamo, String tableName, int timeout, int interval) {
        try {
            awaitTableToBecomeActive(dynamo, tableName, timeout, interval);
        } catch (InterruptedException e) {
            throw new AmazonClientException("Interrupted while waiting for table to become active", e);
        }
    }

    /**
     * Waits up to a specified amount of time for a specified AWS DynamoDB
     * table to move into the <code>ACTIVE</code> state. If the table doesn't
     * transition to the <code>ACTIVE</code> state, then an
     * AmazonClientException is thrown.
     *
     * @param dynamo
     *            The AWS DynamoDB client to use to make requests.
     * @param tableName
     *            The name of the table whose status is being checked.
     * @param timeout
     *            The maximum number of milliseconds to wait.
     * @param interval
     *            The poll interval in milliseconds.
     *
     * @throws AmazonClientException
     *             If the specified table does not transition into the
     *             <code>ACTIVE</code> state before this method times out and
     *             stops polling.
     * @throws InterruptedException
     *             If the thread is interrupted while waiting for the table to
     *             transition into the <code>ACTIVE</code> state.
     */
    public static void awaitTableToBecomeActive(AmazonDynamoDB dynamo, String tableName, int timeout, int interval)
        throws InterruptedException {
        if (timeout < 0)
            throw new AmazonClientException("Timeout must be >= 0");
        if (interval <= 0 || interval >= timeout)
            throw new AmazonClientException("Interval must be > 0 and < timeout");
        long startTime = System.currentTimeMillis();
        long endTime = startTime + timeout;
        while (System.currentTimeMillis() < endTime) {
            try {
                TableDescription table = dynamo.describeTable(new DescribeTableRequest(tableName)).getTable();
                if (table != null && table.getTableStatus().equals(TableStatus.ACTIVE.toString()))
                    return;
            } catch (ResourceNotFoundException rnfe) {
                // ResourceNotFound means the table doesn't exist yet,
                // so ignore this error and just keep polling.
            }

            Thread.sleep(interval);
        }

        throw new AmazonClientException("Table " + tableName + " never became active");
    }
}