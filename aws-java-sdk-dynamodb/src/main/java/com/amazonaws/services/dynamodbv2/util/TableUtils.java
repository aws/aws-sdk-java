/*
 * Copyright 2013-2019 Amazon Technologies, Inc.
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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeTableRequest;
import com.amazonaws.services.dynamodbv2.model.ResourceInUseException;
import com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException;
import com.amazonaws.services.dynamodbv2.model.TableDescription;
import com.amazonaws.services.dynamodbv2.model.TableStatus;

/**
 * Utility methods for working with DynamoDB tables.
 *
 * <pre class="brush: java">
 * // ... create DynamoDB table ...
 * try {
 * 	waitUntilActive(dynamoDB, myTableName());
 * } catch (AmazonClientException e) {
 * 	// table didn't become active
 * }
 * // ... start making calls to table ...
 * </pre>
 */
public class TableUtils {

	/**
	 * Thrown by {@link TableUtils} when a table never reaches a desired state
	 */
	public static class TableNeverTransitionedToStateException extends SdkClientException {

		private static final long serialVersionUID = 8920567021104846647L;

		public TableNeverTransitionedToStateException(String tableName, TableStatus desiredStatus) {
			super("Table " + tableName + " never transitioned to desired state of " + desiredStatus.toString());
		}

	}

	private static final int DEFAULT_WAIT_TIMEOUT = 10 * 60 * 1000;
	private static final int DEFAULT_WAIT_INTERVAL = 20 * 1000;

    /**
     * The logging utility.
     */
    private static final Log LOG = LogFactory.getLog(TableUtils.class);

	/**
	 * Waits up to 10 minutes for a specified DynamoDB table to resolve,
	 * indicating that it exists. If the table doesn't return a result after
	 * this time, a SdkClientException is thrown.
	 *
	 * @param dynamo
	 *            The DynamoDB client to use to make requests.
	 * @param tableName
	 *            The name of the table being resolved.
	 *
	 * @throws SdkClientException
	 *             If the specified table does not resolve before this method
	 *             times out and stops polling.
	 * @throws InterruptedException
	 *             If the thread is interrupted while waiting for the table to
	 *             resolve.
	 */
	public static void waitUntilExists(final AmazonDynamoDB dynamo, final String tableName)
			throws InterruptedException {
		waitUntilExists(dynamo, tableName, DEFAULT_WAIT_TIMEOUT, DEFAULT_WAIT_INTERVAL);
	}

	/**
	 * Waits up to a specified amount of time for a specified DynamoDB table to
	 * resolve, indicating that it exists. If the table doesn't return a result
	 * after this time, a SdkClientException is thrown.
	 *
	 * @param dynamo
	 *            The DynamoDB client to use to make requests.
	 * @param tableName
	 *            The name of the table being resolved.
	 * @param timeout
	 *            The maximum number of milliseconds to wait.
	 * @param interval
	 *            The poll interval in milliseconds.
	 *
	 * @throws SdkClientException
	 *             If the specified table does not resolve before this method
	 *             times out and stops polling.
	 * @throws InterruptedException
	 *             If the thread is interrupted while waiting for the table to
	 *             resolve.
	 */
	public static void waitUntilExists(final AmazonDynamoDB dynamo, final String tableName, final int timeout,
			final int interval) throws InterruptedException {
		TableDescription table = waitForTableDescription(dynamo, tableName, null, timeout, interval);

		if (table == null) {
			throw new SdkClientException("Table " + tableName + " never returned a result");
		}
	}

	/**
	 * Waits up to 10 minutes for a specified DynamoDB table to move into the
	 * <code>ACTIVE</code> state. If the table does not exist or does not
	 * transition to the <code>ACTIVE</code> state after this time, then
	 * SdkClientException is thrown.
	 *
	 * @param dynamo
	 *            The DynamoDB client to use to make requests.
	 * @param tableName
	 *            The name of the table whose status is being checked.
	 *
	 * @throws TableNeverTransitionedToStateException
	 *             If the specified table does not exist or does not transition
	 *             into the <code>ACTIVE</code> state before this method times
	 *             out and stops polling.
	 * @throws InterruptedException
	 *             If the thread is interrupted while waiting for the table to
	 *             transition into the <code>ACTIVE</code> state.
	 */
	public static void waitUntilActive(final AmazonDynamoDB dynamo, final String tableName)
			throws InterruptedException, TableNeverTransitionedToStateException {
		waitUntilActive(dynamo, tableName, DEFAULT_WAIT_TIMEOUT, DEFAULT_WAIT_INTERVAL);
	}

	/**
	 * Waits up to a specified amount of time for a specified DynamoDB table to
	 * move into the <code>ACTIVE</code> state. If the table does not exist or
	 * does not transition to the <code>ACTIVE</code> state after this time,
	 * then a SdkClientException is thrown.
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
	 * @throws TableNeverTransitionedToStateException
	 *             If the specified table does not exist or does not transition
	 *             into the <code>ACTIVE</code> state before this method times
	 *             out and stops polling.
	 * @throws InterruptedException
	 *             If the thread is interrupted while waiting for the table to
	 *             transition into the <code>ACTIVE</code> state.
	 */
	public static void waitUntilActive(final AmazonDynamoDB dynamo, final String tableName, final int timeout,
			final int interval) throws InterruptedException, TableNeverTransitionedToStateException {
		TableDescription table = waitForTableDescription(dynamo, tableName, TableStatus.ACTIVE, timeout, interval);

		if (table == null || !table.getTableStatus().equals(TableStatus.ACTIVE.toString())) {
			throw new TableNeverTransitionedToStateException(tableName, TableStatus.ACTIVE);
		}
	}

	/**
	 * Wait for the table to reach the desired status and returns the table
	 * description
	 * 
	 * @param dynamo
	 *            Dynamo client to use
	 * @param tableName
	 *            Table name to poll status of
	 * @param desiredStatus
	 *            Desired {@link TableStatus} to wait for. If null this method
	 *            simply waits until DescribeTable returns something non-null
	 *            (i.e. any status)
	 * @param timeout
	 *            Timeout in milliseconds to continue to poll for desired status
	 * @param interval
	 *            Time to wait in milliseconds between poll attempts
	 * @return Null if DescribeTables never returns a result, otherwise the
	 *         result of the last poll attempt (which may or may not have the
	 *         desired state)
	 * @throws InterruptedException
	 * @throws {@link
	 *             IllegalArgumentException} If timeout or interval is invalid
	 */
	private static TableDescription waitForTableDescription(final AmazonDynamoDB dynamo, final String tableName,
			TableStatus desiredStatus, final int timeout, final int interval)
					throws InterruptedException, IllegalArgumentException {
		if (timeout < 0) {
			throw new IllegalArgumentException("Timeout must be >= 0");
		}
		if (interval <= 0 || interval >= timeout) {
			throw new IllegalArgumentException("Interval must be > 0 and < timeout");
		}
		long startTime = System.currentTimeMillis();
		long endTime = startTime + timeout;

		TableDescription table = null;
		while (System.currentTimeMillis() < endTime) {
			try {
				table = dynamo.describeTable(new DescribeTableRequest(tableName)).getTable();
				if (desiredStatus == null || table.getTableStatus().equals(desiredStatus.toString())) {
					return table;

				}
			} catch (ResourceNotFoundException rnfe) {
				// ResourceNotFound means the table doesn't exist yet,
				// so ignore this error and just keep polling.
			}

			Thread.sleep(interval);
		}
		return table;
	}

    /**
     * Creates the table and ignores any errors if it already exists.
     * @param dynamo The Dynamo client to use.
     * @param createTableRequest The create table request.
     * @return True if created, false otherwise.
     */
    public static final boolean createTableIfNotExists(final AmazonDynamoDB dynamo, final CreateTableRequest createTableRequest) {
        try {
            dynamo.createTable(createTableRequest);
            return true;
        } catch (final ResourceInUseException e) {
            if (LOG.isTraceEnabled()) {
                LOG.trace("Table " + createTableRequest.getTableName() + " already exists", e);
            }
        }
        return false;
    }

    /**
     * Deletes the table and ignores any errors if it doesn't exist.
     * @param dynamo The Dynamo client to use.
     * @param deleteTableRequest The delete table request.
     * @return True if deleted, false otherwise.
     */
    public static final boolean deleteTableIfExists(final AmazonDynamoDB dynamo, final DeleteTableRequest deleteTableRequest) {
        try {
            dynamo.deleteTable(deleteTableRequest);
            return true;
        } catch (final ResourceNotFoundException e) {
            if (LOG.isTraceEnabled()) {
                LOG.trace("Table " + deleteTableRequest.getTableName() + " does not exist", e);
            }
        }
        return false;
    }

}
