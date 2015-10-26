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
 * Utility methods for working with DynamoDB tables.
 *
 * <pre class="brush: java">
 *  // ... create DynamoDB table ...
 * try {
 *      waitUntilActive(dynamoDB, myTableName());
 * } catch (AmazonClientException e) {
 *      // table didn't become active
 * }
 * // ... start making calls to table ...
 * </pre>
 */
public class TableUtils {
    private static final int DEFAULT_WAIT_TIMEOUT = 10 * 60 * 1000;
    private static final int DEFAULT_WAIT_INTERVAL = 20 * 1000;

    /**
     * Waits up to 10 minutes for a specified DynamoDB table to resolve,
     * indicating that it exists. If the table doesn't return a result after
     * this time, an AmazonClientException is thrown.
     *
     * @param dynamo
     *        The DynamoDB client to use to make requests.
     * @param tableName
     *        The name of the table being resolved.
     *
     * @throws AmazonClientException
     *             If the specified table does not resolve before
     *             this method times out and stops polling.
     * @throws InterruptedException
     *             If the thread is interrupted while waiting for the table to
     *             resolve.
     */
    public static void waitUntilExists(final AmazonDynamoDB dynamo,
            final String tableName) throws InterruptedException {
        waitUntilExists(dynamo, tableName, DEFAULT_WAIT_TIMEOUT, DEFAULT_WAIT_INTERVAL);
    }

    /**
     * Waits up to a specified amount of time for a specified DynamoDB table
     * to resolve, indicating that it exists. If the table doesn't return a result
     * after this time, an AmazonClientException is thrown.
     *
     * @param dynamo
     *        The DynamoDB client to use to make requests.
     * @param tableName
     *        The name of the table being resolved.
     * @param timeout
     *        The maximum number of milliseconds to wait.
     * @param interval
     *        The poll interval in milliseconds.
     *
     * @throws AmazonClientException
     *             If the specified table does not resolve before
     *             this method times out and stops polling.
     * @throws InterruptedException
     *             If the thread is interrupted while waiting for the table to
     *             resolve.
     */
    public static void waitUntilExists(final AmazonDynamoDB dynamo,
            final String tableName, final int timeout, final int interval)
            throws InterruptedException {
        TableDescription table = waitForTableDescription(dynamo, tableName,
                timeout, interval);

        if (table == null) {
            throw new AmazonClientException("Table " + tableName
                    + " never returned a result");
        }
    }

    /**
     * Waits up to 10 minutes for a specified DynamoDB table to move into
     * the <code>ACTIVE</code> state. If the table does not exist or does not
     * transition to the <code>ACTIVE</code> state after this time, then an
     * AmazonClientException is thrown.
     *
     * @param dynamo
     *        The DynamoDB client to use to make requests.
     * @param tableName
     *        The name of the table whose status is being checked.
     *
     * @throws AmazonClientException
     *             If the specified table does not exist or does not transition
     *             into the <code>ACTIVE</code> state before this method times out
     *             and stops polling.
     * @throws InterruptedException
     *             If the thread is interrupted while waiting for the table to
     *             transition into the <code>ACTIVE</code> state.
     */
    public static void waitUntilActive(final AmazonDynamoDB dynamo,
            final String tableName) throws InterruptedException {
        waitUntilActive(dynamo, tableName, DEFAULT_WAIT_TIMEOUT, DEFAULT_WAIT_INTERVAL);
    }

    /**
     * Waits up to a specified amount of time for a specified DynamoDB
     * table to move into the <code>ACTIVE</code> state. If the table does not exist
     * or does not transition to the <code>ACTIVE</code> state after this time, then
     * an AmazonClientException is thrown.
     *
     * @param dynamo
     *            The DynamoDB client to use to make requests.
     * @param tableName
     *            The name of the table whose status is being checked.
     * @param timeout
     *            The maximum number of milliseconds to wait.
     * @param interval
     *            The poll interval in milliseconds.
     *
     * @throws AmazonClientException
     *             If the specified table does not exist or does not transition
     *             into the <code>ACTIVE</code> state before this method times out
     *             and stops polling.
     * @throws InterruptedException
     *             If the thread is interrupted while waiting for the table to
     *             transition into the <code>ACTIVE</code> state.
     */
    public static void waitUntilActive(final AmazonDynamoDB dynamo,
            final String tableName, final int timeout, final int interval)
        throws InterruptedException {
        TableDescription table = waitForTableDescription(dynamo, tableName,
                timeout, interval);

        if (table == null || !table.getTableStatus().equals(TableStatus.ACTIVE.toString())) {
            throw new AmazonClientException("Table " + tableName + " never became active");
        }
    }

    private static TableDescription waitForTableDescription(final AmazonDynamoDB dynamo,
            final String tableName, final int timeout, final int interval)
            throws InterruptedException {
        if (timeout < 0) {
            throw new IllegalArgumentException("Timeout must be >= 0");
        }
        if (interval <= 0 || interval >= timeout) {
            throw new IllegalArgumentException("Interval must be > 0 and < timeout");
        }
        long startTime = System.currentTimeMillis();
        long endTime = startTime + timeout;
        while (System.currentTimeMillis() < endTime) {
            try {
                TableDescription table = dynamo.describeTable(
                        new DescribeTableRequest(tableName)).getTable();
                if (table != null) {
                    return table;
                }
            } catch (ResourceNotFoundException rnfe) {
                // ResourceNotFound means the table doesn't exist yet,
                // so ignore this error and just keep polling.
            }

            Thread.sleep(interval);
        }
        return null;
    }
}
