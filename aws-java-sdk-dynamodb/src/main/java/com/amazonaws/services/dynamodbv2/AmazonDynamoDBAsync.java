/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2;

import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;

/**
 * Interface for accessing DynamoDB asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.dynamodbv2.AbstractAmazonDynamoDBAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon DynamoDB</fullname>
 * <p>
 * Amazon DynamoDB is a fully managed NoSQL database service that provides fast and predictable performance with
 * seamless scalability. DynamoDB lets you offload the administrative burdens of operating and scaling a distributed
 * database, so that you don't have to worry about hardware provisioning, setup and configuration, replication, software
 * patching, or cluster scaling.
 * </p>
 * <p>
 * With DynamoDB, you can create database tables that can store and retrieve any amount of data, and serve any level of
 * request traffic. You can scale up or scale down your tables' throughput capacity without downtime or performance
 * degradation, and use the AWS Management Console to monitor resource utilization and performance metrics.
 * </p>
 * <p>
 * DynamoDB automatically spreads the data and traffic for your tables over a sufficient number of servers to handle
 * your throughput and storage requirements, while maintaining consistent and fast performance. All of your data is
 * stored on solid state disks (SSDs) and automatically replicated across multiple Availability Zones in an AWS region,
 * providing built-in high availability and data durability.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDynamoDBAsync extends AmazonDynamoDB {

    /**
     * <p>
     * The <code>BatchGetItem</code> operation returns the attributes of one or more items from one or more tables. You
     * identify requested items by primary key.
     * </p>
     * <p>
     * A single operation can retrieve up to 16 MB of data, which can contain as many as 100 items.
     * <code>BatchGetItem</code> will return a partial result if the response size limit is exceeded, the table's
     * provisioned throughput is exceeded, or an internal processing failure occurs. If a partial result is returned,
     * the operation returns a value for <code>UnprocessedKeys</code>. You can use this value to retry the operation
     * starting with the next item to get.
     * </p>
     * <important>
     * <p>
     * If you request more than 100 items <code>BatchGetItem</code> will return a <code>ValidationException</code> with
     * the message "Too many items requested for the BatchGetItem call".
     * </p>
     * </important>
     * <p>
     * For example, if you ask to retrieve 100 items, but each individual item is 300 KB in size, the system returns 52
     * items (so as not to exceed the 16 MB limit). It also returns an appropriate <code>UnprocessedKeys</code> value so
     * you can get the next page of results. If desired, your application can include its own logic to assemble the
     * pages of results into one data set.
     * </p>
     * <p>
     * If <i>none</i> of the items can be processed due to insufficient provisioned throughput on all of the tables in
     * the request, then <code>BatchGetItem</code> will return a <code>ProvisionedThroughputExceededException</code>. If
     * <i>at least one</i> of the items is successfully processed, then <code>BatchGetItem</code> completes
     * successfully, while returning the keys of the unread items in <code>UnprocessedKeys</code>.
     * </p>
     * <important>
     * <p>
     * If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, <i>we
     * strongly recommend that you use an exponential backoff algorithm</i>. If you retry the batch operation
     * immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If
     * you delay the batch operation using exponential backoff, the individual requests in the batch are much more
     * likely to succeed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations">Batch
     * Operations and Error Handling</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * By default, <code>BatchGetItem</code> performs eventually consistent reads on every table in the request. If you
     * want strongly consistent reads instead, you can set <code>ConsistentRead</code> to <code>true</code> for any or
     * all tables.
     * </p>
     * <p>
     * In order to minimize response latency, <code>BatchGetItem</code> retrieves items in parallel.
     * </p>
     * <p>
     * When designing your application, keep in mind that DynamoDB does not return items in any particular order. To
     * help parse the response by item, include the primary key values for the items in your request in the
     * <code>ProjectionExpression</code> parameter.
     * </p>
     * <p>
     * If a requested item does not exist, it is not returned in the result. Requests for nonexistent items consume the
     * minimum read capacity units according to the type of read. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"
     * >Capacity Units Calculations</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param batchGetItemRequest
     *        Represents the input of a <code>BatchGetItem</code> operation.
     * @return A Java Future containing the result of the BatchGetItem operation returned by the service.
     * @sample AmazonDynamoDBAsync.BatchGetItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchGetItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(BatchGetItemRequest batchGetItemRequest);

    /**
     * <p>
     * The <code>BatchGetItem</code> operation returns the attributes of one or more items from one or more tables. You
     * identify requested items by primary key.
     * </p>
     * <p>
     * A single operation can retrieve up to 16 MB of data, which can contain as many as 100 items.
     * <code>BatchGetItem</code> will return a partial result if the response size limit is exceeded, the table's
     * provisioned throughput is exceeded, or an internal processing failure occurs. If a partial result is returned,
     * the operation returns a value for <code>UnprocessedKeys</code>. You can use this value to retry the operation
     * starting with the next item to get.
     * </p>
     * <important>
     * <p>
     * If you request more than 100 items <code>BatchGetItem</code> will return a <code>ValidationException</code> with
     * the message "Too many items requested for the BatchGetItem call".
     * </p>
     * </important>
     * <p>
     * For example, if you ask to retrieve 100 items, but each individual item is 300 KB in size, the system returns 52
     * items (so as not to exceed the 16 MB limit). It also returns an appropriate <code>UnprocessedKeys</code> value so
     * you can get the next page of results. If desired, your application can include its own logic to assemble the
     * pages of results into one data set.
     * </p>
     * <p>
     * If <i>none</i> of the items can be processed due to insufficient provisioned throughput on all of the tables in
     * the request, then <code>BatchGetItem</code> will return a <code>ProvisionedThroughputExceededException</code>. If
     * <i>at least one</i> of the items is successfully processed, then <code>BatchGetItem</code> completes
     * successfully, while returning the keys of the unread items in <code>UnprocessedKeys</code>.
     * </p>
     * <important>
     * <p>
     * If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, <i>we
     * strongly recommend that you use an exponential backoff algorithm</i>. If you retry the batch operation
     * immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If
     * you delay the batch operation using exponential backoff, the individual requests in the batch are much more
     * likely to succeed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations">Batch
     * Operations and Error Handling</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * By default, <code>BatchGetItem</code> performs eventually consistent reads on every table in the request. If you
     * want strongly consistent reads instead, you can set <code>ConsistentRead</code> to <code>true</code> for any or
     * all tables.
     * </p>
     * <p>
     * In order to minimize response latency, <code>BatchGetItem</code> retrieves items in parallel.
     * </p>
     * <p>
     * When designing your application, keep in mind that DynamoDB does not return items in any particular order. To
     * help parse the response by item, include the primary key values for the items in your request in the
     * <code>ProjectionExpression</code> parameter.
     * </p>
     * <p>
     * If a requested item does not exist, it is not returned in the result. Requests for nonexistent items consume the
     * minimum read capacity units according to the type of read. For more information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"
     * >Capacity Units Calculations</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param batchGetItemRequest
     *        Represents the input of a <code>BatchGetItem</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetItem operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.BatchGetItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchGetItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(BatchGetItemRequest batchGetItemRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetItemRequest, BatchGetItemResult> asyncHandler);

    /**
     * Simplified method form for invoking the BatchGetItem operation.
     *
     * @see #batchGetItemAsync(BatchGetItemRequest)
     */
    java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(java.util.Map<String, KeysAndAttributes> requestItems, String returnConsumedCapacity);

    /**
     * Simplified method form for invoking the BatchGetItem operation with an AsyncHandler.
     *
     * @see #batchGetItemAsync(BatchGetItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(java.util.Map<String, KeysAndAttributes> requestItems, String returnConsumedCapacity,
            com.amazonaws.handlers.AsyncHandler<BatchGetItemRequest, BatchGetItemResult> asyncHandler);

    /**
     * Simplified method form for invoking the BatchGetItem operation.
     *
     * @see #batchGetItemAsync(BatchGetItemRequest)
     */
    java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(java.util.Map<String, KeysAndAttributes> requestItems);

    /**
     * Simplified method form for invoking the BatchGetItem operation with an AsyncHandler.
     *
     * @see #batchGetItemAsync(BatchGetItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<BatchGetItemResult> batchGetItemAsync(java.util.Map<String, KeysAndAttributes> requestItems,
            com.amazonaws.handlers.AsyncHandler<BatchGetItemRequest, BatchGetItemResult> asyncHandler);

    /**
     * <p>
     * The <code>BatchWriteItem</code> operation puts or deletes multiple items in one or more tables. A single call to
     * <code>BatchWriteItem</code> can write up to 16 MB of data, which can comprise as many as 25 put or delete
     * requests. Individual items to be written can be as large as 400 KB.
     * </p>
     * <note>
     * <p>
     * <code>BatchWriteItem</code> cannot update items. To update items, use the <code>UpdateItem</code> action.
     * </p>
     * </note>
     * <p>
     * The individual <code>PutItem</code> and <code>DeleteItem</code> operations specified in
     * <code>BatchWriteItem</code> are atomic; however <code>BatchWriteItem</code> as a whole is not. If any requested
     * operations fail because the table's provisioned throughput is exceeded or an internal processing failure occurs,
     * the failed operations are returned in the <code>UnprocessedItems</code> response parameter. You can investigate
     * and optionally resend the requests. Typically, you would call <code>BatchWriteItem</code> in a loop. Each
     * iteration would check for unprocessed items and submit a new <code>BatchWriteItem</code> request with those
     * unprocessed items until all items have been processed.
     * </p>
     * <p>
     * Note that if <i>none</i> of the items can be processed due to insufficient provisioned throughput on all of the
     * tables in the request, then <code>BatchWriteItem</code> will return a
     * <code>ProvisionedThroughputExceededException</code>.
     * </p>
     * <important>
     * <p>
     * If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, <i>we
     * strongly recommend that you use an exponential backoff algorithm</i>. If you retry the batch operation
     * immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If
     * you delay the batch operation using exponential backoff, the individual requests in the batch are much more
     * likely to succeed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations">Batch
     * Operations and Error Handling</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * With <code>BatchWriteItem</code>, you can efficiently write or delete large amounts of data, such as from Amazon
     * Elastic MapReduce (EMR), or copy data from another database into DynamoDB. In order to improve performance with
     * these large-scale operations, <code>BatchWriteItem</code> does not behave in the same way as individual
     * <code>PutItem</code> and <code>DeleteItem</code> calls would. For example, you cannot specify conditions on
     * individual put and delete requests, and <code>BatchWriteItem</code> does not return deleted items in the
     * response.
     * </p>
     * <p>
     * If you use a programming language that supports concurrency, you can use threads to write items in parallel. Your
     * application must include the necessary logic to manage the threads. With languages that don't support threading,
     * you must update or delete the specified items one at a time. In both situations, <code>BatchWriteItem</code>
     * performs the specified put and delete operations in parallel, giving you the power of the thread pool approach
     * without having to introduce complexity into your application.
     * </p>
     * <p>
     * Parallel processing reduces latency, but each specified put and delete request consumes the same number of write
     * capacity units whether it is processed in parallel or not. Delete operations on nonexistent items consume one
     * write capacity unit.
     * </p>
     * <p>
     * If one or more of the following is true, DynamoDB rejects the entire batch write operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One or more tables specified in the <code>BatchWriteItem</code> request does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * Primary key attributes specified on an item in the request do not match those in the corresponding table's
     * primary key schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * You try to perform multiple operations on the same item in the same <code>BatchWriteItem</code> request. For
     * example, you cannot put and delete the same item in the same <code>BatchWriteItem</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your request contains at least two items with identical hash and range keys (which essentially is two put
     * operations).
     * </p>
     * </li>
     * <li>
     * <p>
     * There are more than 25 requests in the batch.
     * </p>
     * </li>
     * <li>
     * <p>
     * Any individual item in a batch exceeds 400 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The total request size exceeds 16 MB.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchWriteItemRequest
     *        Represents the input of a <code>BatchWriteItem</code> operation.
     * @return A Java Future containing the result of the BatchWriteItem operation returned by the service.
     * @sample AmazonDynamoDBAsync.BatchWriteItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchWriteItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchWriteItemResult> batchWriteItemAsync(BatchWriteItemRequest batchWriteItemRequest);

    /**
     * <p>
     * The <code>BatchWriteItem</code> operation puts or deletes multiple items in one or more tables. A single call to
     * <code>BatchWriteItem</code> can write up to 16 MB of data, which can comprise as many as 25 put or delete
     * requests. Individual items to be written can be as large as 400 KB.
     * </p>
     * <note>
     * <p>
     * <code>BatchWriteItem</code> cannot update items. To update items, use the <code>UpdateItem</code> action.
     * </p>
     * </note>
     * <p>
     * The individual <code>PutItem</code> and <code>DeleteItem</code> operations specified in
     * <code>BatchWriteItem</code> are atomic; however <code>BatchWriteItem</code> as a whole is not. If any requested
     * operations fail because the table's provisioned throughput is exceeded or an internal processing failure occurs,
     * the failed operations are returned in the <code>UnprocessedItems</code> response parameter. You can investigate
     * and optionally resend the requests. Typically, you would call <code>BatchWriteItem</code> in a loop. Each
     * iteration would check for unprocessed items and submit a new <code>BatchWriteItem</code> request with those
     * unprocessed items until all items have been processed.
     * </p>
     * <p>
     * Note that if <i>none</i> of the items can be processed due to insufficient provisioned throughput on all of the
     * tables in the request, then <code>BatchWriteItem</code> will return a
     * <code>ProvisionedThroughputExceededException</code>.
     * </p>
     * <important>
     * <p>
     * If DynamoDB returns any unprocessed items, you should retry the batch operation on those items. However, <i>we
     * strongly recommend that you use an exponential backoff algorithm</i>. If you retry the batch operation
     * immediately, the underlying read or write requests can still fail due to throttling on the individual tables. If
     * you delay the batch operation using exponential backoff, the individual requests in the batch are much more
     * likely to succeed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations">Batch
     * Operations and Error Handling</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * With <code>BatchWriteItem</code>, you can efficiently write or delete large amounts of data, such as from Amazon
     * Elastic MapReduce (EMR), or copy data from another database into DynamoDB. In order to improve performance with
     * these large-scale operations, <code>BatchWriteItem</code> does not behave in the same way as individual
     * <code>PutItem</code> and <code>DeleteItem</code> calls would. For example, you cannot specify conditions on
     * individual put and delete requests, and <code>BatchWriteItem</code> does not return deleted items in the
     * response.
     * </p>
     * <p>
     * If you use a programming language that supports concurrency, you can use threads to write items in parallel. Your
     * application must include the necessary logic to manage the threads. With languages that don't support threading,
     * you must update or delete the specified items one at a time. In both situations, <code>BatchWriteItem</code>
     * performs the specified put and delete operations in parallel, giving you the power of the thread pool approach
     * without having to introduce complexity into your application.
     * </p>
     * <p>
     * Parallel processing reduces latency, but each specified put and delete request consumes the same number of write
     * capacity units whether it is processed in parallel or not. Delete operations on nonexistent items consume one
     * write capacity unit.
     * </p>
     * <p>
     * If one or more of the following is true, DynamoDB rejects the entire batch write operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One or more tables specified in the <code>BatchWriteItem</code> request does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * Primary key attributes specified on an item in the request do not match those in the corresponding table's
     * primary key schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * You try to perform multiple operations on the same item in the same <code>BatchWriteItem</code> request. For
     * example, you cannot put and delete the same item in the same <code>BatchWriteItem</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your request contains at least two items with identical hash and range keys (which essentially is two put
     * operations).
     * </p>
     * </li>
     * <li>
     * <p>
     * There are more than 25 requests in the batch.
     * </p>
     * </li>
     * <li>
     * <p>
     * Any individual item in a batch exceeds 400 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The total request size exceeds 16 MB.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchWriteItemRequest
     *        Represents the input of a <code>BatchWriteItem</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchWriteItem operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.BatchWriteItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchWriteItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchWriteItemResult> batchWriteItemAsync(BatchWriteItemRequest batchWriteItemRequest,
            com.amazonaws.handlers.AsyncHandler<BatchWriteItemRequest, BatchWriteItemResult> asyncHandler);

    /**
     * Simplified method form for invoking the BatchWriteItem operation.
     *
     * @see #batchWriteItemAsync(BatchWriteItemRequest)
     */
    java.util.concurrent.Future<BatchWriteItemResult> batchWriteItemAsync(java.util.Map<String, java.util.List<WriteRequest>> requestItems);

    /**
     * Simplified method form for invoking the BatchWriteItem operation with an AsyncHandler.
     *
     * @see #batchWriteItemAsync(BatchWriteItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<BatchWriteItemResult> batchWriteItemAsync(java.util.Map<String, java.util.List<WriteRequest>> requestItems,
            com.amazonaws.handlers.AsyncHandler<BatchWriteItemRequest, BatchWriteItemResult> asyncHandler);

    /**
     * <p>
     * Creates a backup for an existing table.
     * </p>
     * <p>
     * Each time you create an On-Demand Backup, the entire table data is backed up. There is no limit to the number of
     * on-demand backups that can be taken.
     * </p>
     * <p>
     * When you create an On-Demand Backup, a time marker of the request is cataloged, and the backup is created
     * asynchronously, by applying all changes until the time of the request to the last full table snapshot. Backup
     * requests are processed instantaneously and become available for restore within minutes.
     * </p>
     * <p>
     * You can call <code>CreateBackup</code> at a maximum rate of 50 times per second.
     * </p>
     * <p>
     * All backups in DynamoDB work without consuming any provisioned throughput on the table.
     * </p>
     * <p>
     * If you submit a backup request on 2018-12-14 at 14:25:00, the backup is guaranteed to contain all data committed
     * to the table up to 14:24:00, and data committed after 14:26:00 will not be. The backup may or may not contain
     * data modifications made between 14:24:00 and 14:26:00. On-Demand Backup does not support causal consistency.
     * </p>
     * <p>
     * Along with data, the following are also included on the backups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Global secondary indexes (GSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Local secondary indexes (LSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Streams
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned read and write capacity
     * </p>
     * </li>
     * </ul>
     * 
     * @param createBackupRequest
     * @return A Java Future containing the result of the CreateBackup operation returned by the service.
     * @sample AmazonDynamoDBAsync.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest createBackupRequest);

    /**
     * <p>
     * Creates a backup for an existing table.
     * </p>
     * <p>
     * Each time you create an On-Demand Backup, the entire table data is backed up. There is no limit to the number of
     * on-demand backups that can be taken.
     * </p>
     * <p>
     * When you create an On-Demand Backup, a time marker of the request is cataloged, and the backup is created
     * asynchronously, by applying all changes until the time of the request to the last full table snapshot. Backup
     * requests are processed instantaneously and become available for restore within minutes.
     * </p>
     * <p>
     * You can call <code>CreateBackup</code> at a maximum rate of 50 times per second.
     * </p>
     * <p>
     * All backups in DynamoDB work without consuming any provisioned throughput on the table.
     * </p>
     * <p>
     * If you submit a backup request on 2018-12-14 at 14:25:00, the backup is guaranteed to contain all data committed
     * to the table up to 14:24:00, and data committed after 14:26:00 will not be. The backup may or may not contain
     * data modifications made between 14:24:00 and 14:26:00. On-Demand Backup does not support causal consistency.
     * </p>
     * <p>
     * Along with data, the following are also included on the backups:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Global secondary indexes (GSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Local secondary indexes (LSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Streams
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned read and write capacity
     * </p>
     * </li>
     * </ul>
     * 
     * @param createBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBackup operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupResult> createBackupAsync(CreateBackupRequest createBackupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBackupRequest, CreateBackupResult> asyncHandler);

    /**
     * <p>
     * Creates a global table from an existing table. A global table creates a replication relationship between two or
     * more DynamoDB tables with the same table name in the provided regions.
     * </p>
     * <p>
     * If you want to add a new replica table to a global table, each of the following conditions must be true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The table must have the same primary key as all of the other replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The table must have the same name as all of the other replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The table must have DynamoDB Streams enabled, with the stream containing both the new and the old images of the
     * item.
     * </p>
     * </li>
     * <li>
     * <p>
     * None of the replica tables in the global table can contain any data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If global secondary indexes are specified, then the following conditions must also be met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The global secondary indexes must have the same name.
     * </p>
     * </li>
     * <li>
     * <p>
     * The global secondary indexes must have the same hash key and sort key (if present).
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Write capacity settings should be set consistently across your replica tables and secondary indexes. DynamoDB
     * strongly recommends enabling auto scaling to manage the write capacity settings for all of your global tables
     * replicas and indexes.
     * </p>
     * <p>
     * If you prefer to manage write capacity settings manually, you should provision equal replicated write capacity
     * units to your replica tables. You should also provision equal replicated write capacity units to matching
     * secondary indexes across your global table.
     * </p>
     * </important>
     * 
     * @param createGlobalTableRequest
     * @return A Java Future containing the result of the CreateGlobalTable operation returned by the service.
     * @sample AmazonDynamoDBAsync.CreateGlobalTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CreateGlobalTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGlobalTableResult> createGlobalTableAsync(CreateGlobalTableRequest createGlobalTableRequest);

    /**
     * <p>
     * Creates a global table from an existing table. A global table creates a replication relationship between two or
     * more DynamoDB tables with the same table name in the provided regions.
     * </p>
     * <p>
     * If you want to add a new replica table to a global table, each of the following conditions must be true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The table must have the same primary key as all of the other replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The table must have the same name as all of the other replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The table must have DynamoDB Streams enabled, with the stream containing both the new and the old images of the
     * item.
     * </p>
     * </li>
     * <li>
     * <p>
     * None of the replica tables in the global table can contain any data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If global secondary indexes are specified, then the following conditions must also be met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The global secondary indexes must have the same name.
     * </p>
     * </li>
     * <li>
     * <p>
     * The global secondary indexes must have the same hash key and sort key (if present).
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Write capacity settings should be set consistently across your replica tables and secondary indexes. DynamoDB
     * strongly recommends enabling auto scaling to manage the write capacity settings for all of your global tables
     * replicas and indexes.
     * </p>
     * <p>
     * If you prefer to manage write capacity settings manually, you should provision equal replicated write capacity
     * units to your replica tables. You should also provision equal replicated write capacity units to matching
     * secondary indexes across your global table.
     * </p>
     * </important>
     * 
     * @param createGlobalTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGlobalTable operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.CreateGlobalTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CreateGlobalTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGlobalTableResult> createGlobalTableAsync(CreateGlobalTableRequest createGlobalTableRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGlobalTableRequest, CreateGlobalTableResult> asyncHandler);

    /**
     * <p>
     * The <code>CreateTable</code> operation adds a new table to your account. In an AWS account, table names must be
     * unique within each region. That is, you can have two tables with same name if you create the tables in different
     * regions.
     * </p>
     * <p>
     * <code>CreateTable</code> is an asynchronous operation. Upon receiving a <code>CreateTable</code> request,
     * DynamoDB immediately returns a response with a <code>TableStatus</code> of <code>CREATING</code>. After the table
     * is created, DynamoDB sets the <code>TableStatus</code> to <code>ACTIVE</code>. You can perform read and write
     * operations only on an <code>ACTIVE</code> table.
     * </p>
     * <p>
     * You can optionally define secondary indexes on the new table, as part of the <code>CreateTable</code> operation.
     * If you want to create multiple tables with secondary indexes on them, you must create the tables sequentially.
     * Only one table with secondary indexes can be in the <code>CREATING</code> state at any given time.
     * </p>
     * <p>
     * You can use the <code>DescribeTable</code> action to check the table status.
     * </p>
     * 
     * @param createTableRequest
     *        Represents the input of a <code>CreateTable</code> operation.
     * @return A Java Future containing the result of the CreateTable operation returned by the service.
     * @sample AmazonDynamoDBAsync.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CreateTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest createTableRequest);

    /**
     * <p>
     * The <code>CreateTable</code> operation adds a new table to your account. In an AWS account, table names must be
     * unique within each region. That is, you can have two tables with same name if you create the tables in different
     * regions.
     * </p>
     * <p>
     * <code>CreateTable</code> is an asynchronous operation. Upon receiving a <code>CreateTable</code> request,
     * DynamoDB immediately returns a response with a <code>TableStatus</code> of <code>CREATING</code>. After the table
     * is created, DynamoDB sets the <code>TableStatus</code> to <code>ACTIVE</code>. You can perform read and write
     * operations only on an <code>ACTIVE</code> table.
     * </p>
     * <p>
     * You can optionally define secondary indexes on the new table, as part of the <code>CreateTable</code> operation.
     * If you want to create multiple tables with secondary indexes on them, you must create the tables sequentially.
     * Only one table with secondary indexes can be in the <code>CREATING</code> state at any given time.
     * </p>
     * <p>
     * You can use the <code>DescribeTable</code> action to check the table status.
     * </p>
     * 
     * @param createTableRequest
     *        Represents the input of a <code>CreateTable</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTable operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CreateTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest createTableRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler);

    /**
     * Simplified method form for invoking the CreateTable operation.
     *
     * @see #createTableAsync(CreateTableRequest)
     */
    java.util.concurrent.Future<CreateTableResult> createTableAsync(java.util.List<AttributeDefinition> attributeDefinitions, String tableName,
            java.util.List<KeySchemaElement> keySchema, ProvisionedThroughput provisionedThroughput);

    /**
     * Simplified method form for invoking the CreateTable operation with an AsyncHandler.
     *
     * @see #createTableAsync(CreateTableRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<CreateTableResult> createTableAsync(java.util.List<AttributeDefinition> attributeDefinitions, String tableName,
            java.util.List<KeySchemaElement> keySchema, ProvisionedThroughput provisionedThroughput,
            com.amazonaws.handlers.AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing backup of a table.
     * </p>
     * <p>
     * You can call <code>DeleteBackup</code> at a maximum rate of 10 times per second.
     * </p>
     * 
     * @param deleteBackupRequest
     * @return A Java Future containing the result of the DeleteBackup operation returned by the service.
     * @sample AmazonDynamoDBAsync.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest);

    /**
     * <p>
     * Deletes an existing backup of a table.
     * </p>
     * <p>
     * You can call <code>DeleteBackup</code> at a maximum rate of 10 times per second.
     * </p>
     * 
     * @param deleteBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackup operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest deleteBackupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler);

    /**
     * <p>
     * Deletes a single item in a table by primary key. You can perform a conditional delete operation that deletes the
     * item if it exists, or if it has an expected attribute value.
     * </p>
     * <p>
     * In addition to deleting an item, you can also return the item's attribute values in the same operation, using the
     * <code>ReturnValues</code> parameter.
     * </p>
     * <p>
     * Unless you specify conditions, the <code>DeleteItem</code> is an idempotent operation; running it multiple times
     * on the same item or attribute does <i>not</i> result in an error response.
     * </p>
     * <p>
     * Conditional deletes are useful for deleting items only if specific conditions are met. If those conditions are
     * met, DynamoDB performs the delete. Otherwise, the item is not deleted.
     * </p>
     * 
     * @param deleteItemRequest
     *        Represents the input of a <code>DeleteItem</code> operation.
     * @return A Java Future containing the result of the DeleteItem operation returned by the service.
     * @sample AmazonDynamoDBAsync.DeleteItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(DeleteItemRequest deleteItemRequest);

    /**
     * <p>
     * Deletes a single item in a table by primary key. You can perform a conditional delete operation that deletes the
     * item if it exists, or if it has an expected attribute value.
     * </p>
     * <p>
     * In addition to deleting an item, you can also return the item's attribute values in the same operation, using the
     * <code>ReturnValues</code> parameter.
     * </p>
     * <p>
     * Unless you specify conditions, the <code>DeleteItem</code> is an idempotent operation; running it multiple times
     * on the same item or attribute does <i>not</i> result in an error response.
     * </p>
     * <p>
     * Conditional deletes are useful for deleting items only if specific conditions are met. If those conditions are
     * met, DynamoDB performs the delete. Otherwise, the item is not deleted.
     * </p>
     * 
     * @param deleteItemRequest
     *        Represents the input of a <code>DeleteItem</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteItem operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.DeleteItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(DeleteItemRequest deleteItemRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteItemRequest, DeleteItemResult> asyncHandler);

    /**
     * Simplified method form for invoking the DeleteItem operation.
     *
     * @see #deleteItemAsync(DeleteItemRequest)
     */
    java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(String tableName, java.util.Map<String, AttributeValue> key);

    /**
     * Simplified method form for invoking the DeleteItem operation with an AsyncHandler.
     *
     * @see #deleteItemAsync(DeleteItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            com.amazonaws.handlers.AsyncHandler<DeleteItemRequest, DeleteItemResult> asyncHandler);

    /**
     * Simplified method form for invoking the DeleteItem operation.
     *
     * @see #deleteItemAsync(DeleteItemRequest)
     */
    java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(String tableName, java.util.Map<String, AttributeValue> key, String returnValues);

    /**
     * Simplified method form for invoking the DeleteItem operation with an AsyncHandler.
     *
     * @see #deleteItemAsync(DeleteItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DeleteItemResult> deleteItemAsync(String tableName, java.util.Map<String, AttributeValue> key, String returnValues,
            com.amazonaws.handlers.AsyncHandler<DeleteItemRequest, DeleteItemResult> asyncHandler);

    /**
     * <p>
     * The <code>DeleteTable</code> operation deletes a table and all of its items. After a <code>DeleteTable</code>
     * request, the specified table is in the <code>DELETING</code> state until DynamoDB completes the deletion. If the
     * table is in the <code>ACTIVE</code> state, you can delete it. If a table is in <code>CREATING</code> or
     * <code>UPDATING</code> states, then DynamoDB returns a <code>ResourceInUseException</code>. If the specified table
     * does not exist, DynamoDB returns a <code>ResourceNotFoundException</code>. If table is already in the
     * <code>DELETING</code> state, no error is returned.
     * </p>
     * <note>
     * <p>
     * DynamoDB might continue to accept data read and write operations, such as <code>GetItem</code> and
     * <code>PutItem</code>, on a table in the <code>DELETING</code> state until the table deletion is complete.
     * </p>
     * </note>
     * <p>
     * When you delete a table, any indexes on that table are also deleted.
     * </p>
     * <p>
     * If you have DynamoDB Streams enabled on the table, then the corresponding stream on that table goes into the
     * <code>DISABLED</code> state, and the stream is automatically deleted after 24 hours.
     * </p>
     * <p>
     * Use the <code>DescribeTable</code> action to check the status of the table.
     * </p>
     * 
     * @param deleteTableRequest
     *        Represents the input of a <code>DeleteTable</code> operation.
     * @return A Java Future containing the result of the DeleteTable operation returned by the service.
     * @sample AmazonDynamoDBAsync.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest deleteTableRequest);

    /**
     * <p>
     * The <code>DeleteTable</code> operation deletes a table and all of its items. After a <code>DeleteTable</code>
     * request, the specified table is in the <code>DELETING</code> state until DynamoDB completes the deletion. If the
     * table is in the <code>ACTIVE</code> state, you can delete it. If a table is in <code>CREATING</code> or
     * <code>UPDATING</code> states, then DynamoDB returns a <code>ResourceInUseException</code>. If the specified table
     * does not exist, DynamoDB returns a <code>ResourceNotFoundException</code>. If table is already in the
     * <code>DELETING</code> state, no error is returned.
     * </p>
     * <note>
     * <p>
     * DynamoDB might continue to accept data read and write operations, such as <code>GetItem</code> and
     * <code>PutItem</code>, on a table in the <code>DELETING</code> state until the table deletion is complete.
     * </p>
     * </note>
     * <p>
     * When you delete a table, any indexes on that table are also deleted.
     * </p>
     * <p>
     * If you have DynamoDB Streams enabled on the table, then the corresponding stream on that table goes into the
     * <code>DISABLED</code> state, and the stream is automatically deleted after 24 hours.
     * </p>
     * <p>
     * Use the <code>DescribeTable</code> action to check the status of the table.
     * </p>
     * 
     * @param deleteTableRequest
     *        Represents the input of a <code>DeleteTable</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTable operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest deleteTableRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler);

    /**
     * Simplified method form for invoking the DeleteTable operation.
     *
     * @see #deleteTableAsync(DeleteTableRequest)
     */
    java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(String tableName);

    /**
     * Simplified method form for invoking the DeleteTable operation with an AsyncHandler.
     *
     * @see #deleteTableAsync(DeleteTableRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(String tableName,
            com.amazonaws.handlers.AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler);

    /**
     * <p>
     * Describes an existing backup of a table.
     * </p>
     * <p>
     * You can call <code>DescribeBackup</code> at a maximum rate of 10 times per second.
     * </p>
     * 
     * @param describeBackupRequest
     * @return A Java Future containing the result of the DescribeBackup operation returned by the service.
     * @sample AmazonDynamoDBAsync.DescribeBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupResult> describeBackupAsync(DescribeBackupRequest describeBackupRequest);

    /**
     * <p>
     * Describes an existing backup of a table.
     * </p>
     * <p>
     * You can call <code>DescribeBackup</code> at a maximum rate of 10 times per second.
     * </p>
     * 
     * @param describeBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBackup operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.DescribeBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeBackup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupResult> describeBackupAsync(DescribeBackupRequest describeBackupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupRequest, DescribeBackupResult> asyncHandler);

    /**
     * <p>
     * Checks the status of continuous backups and point in time recovery on the specified table. Continuous backups are
     * <code>ENABLED</code> on all tables at table creation. If point in time recovery is enabled,
     * <code>PointInTimeRecoveryStatus</code> will be set to ENABLED.
     * </p>
     * <p>
     * Once continuous backups and point in time recovery are enabled, you can restore to any point in time within
     * <code>EarliestRestorableDateTime</code> and <code>LatestRestorableDateTime</code>.
     * </p>
     * <p>
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. You can restore your table
     * to any point in time during the last 35 days.
     * </p>
     * <p>
     * You can call <code>DescribeContinuousBackups</code> at a maximum rate of 10 times per second.
     * </p>
     * 
     * @param describeContinuousBackupsRequest
     * @return A Java Future containing the result of the DescribeContinuousBackups operation returned by the service.
     * @sample AmazonDynamoDBAsync.DescribeContinuousBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeContinuousBackups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeContinuousBackupsResult> describeContinuousBackupsAsync(
            DescribeContinuousBackupsRequest describeContinuousBackupsRequest);

    /**
     * <p>
     * Checks the status of continuous backups and point in time recovery on the specified table. Continuous backups are
     * <code>ENABLED</code> on all tables at table creation. If point in time recovery is enabled,
     * <code>PointInTimeRecoveryStatus</code> will be set to ENABLED.
     * </p>
     * <p>
     * Once continuous backups and point in time recovery are enabled, you can restore to any point in time within
     * <code>EarliestRestorableDateTime</code> and <code>LatestRestorableDateTime</code>.
     * </p>
     * <p>
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. You can restore your table
     * to any point in time during the last 35 days.
     * </p>
     * <p>
     * You can call <code>DescribeContinuousBackups</code> at a maximum rate of 10 times per second.
     * </p>
     * 
     * @param describeContinuousBackupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeContinuousBackups operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.DescribeContinuousBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeContinuousBackups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeContinuousBackupsResult> describeContinuousBackupsAsync(
            DescribeContinuousBackupsRequest describeContinuousBackupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeContinuousBackupsRequest, DescribeContinuousBackupsResult> asyncHandler);

    /**
     * <p>
     * Returns the regional endpoint information.
     * </p>
     * 
     * @param describeEndpointsRequest
     * @return A Java Future containing the result of the DescribeEndpoints operation returned by the service.
     * @sample AmazonDynamoDBAsync.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest describeEndpointsRequest);

    /**
     * <p>
     * Returns the regional endpoint information.
     * </p>
     * 
     * @param describeEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpoints operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest describeEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified global table.
     * </p>
     * 
     * @param describeGlobalTableRequest
     * @return A Java Future containing the result of the DescribeGlobalTable operation returned by the service.
     * @sample AmazonDynamoDBAsync.DescribeGlobalTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeGlobalTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGlobalTableResult> describeGlobalTableAsync(DescribeGlobalTableRequest describeGlobalTableRequest);

    /**
     * <p>
     * Returns information about the specified global table.
     * </p>
     * 
     * @param describeGlobalTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGlobalTable operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.DescribeGlobalTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeGlobalTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGlobalTableResult> describeGlobalTableAsync(DescribeGlobalTableRequest describeGlobalTableRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGlobalTableRequest, DescribeGlobalTableResult> asyncHandler);

    /**
     * <p>
     * Describes region specific settings for a global table.
     * </p>
     * 
     * @param describeGlobalTableSettingsRequest
     * @return A Java Future containing the result of the DescribeGlobalTableSettings operation returned by the service.
     * @sample AmazonDynamoDBAsync.DescribeGlobalTableSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeGlobalTableSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGlobalTableSettingsResult> describeGlobalTableSettingsAsync(
            DescribeGlobalTableSettingsRequest describeGlobalTableSettingsRequest);

    /**
     * <p>
     * Describes region specific settings for a global table.
     * </p>
     * 
     * @param describeGlobalTableSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGlobalTableSettings operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.DescribeGlobalTableSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeGlobalTableSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGlobalTableSettingsResult> describeGlobalTableSettingsAsync(
            DescribeGlobalTableSettingsRequest describeGlobalTableSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGlobalTableSettingsRequest, DescribeGlobalTableSettingsResult> asyncHandler);

    /**
     * <p>
     * Returns the current provisioned-capacity limits for your AWS account in a region, both for the region as a whole
     * and for any one DynamoDB table that you create there.
     * </p>
     * <p>
     * When you establish an AWS account, the account has initial limits on the maximum read capacity units and write
     * capacity units that you can provision across all of your DynamoDB tables in a given region. Also, there are
     * per-table limits that apply when you create a table there. For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> page in the
     * <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Although you can increase these limits by filing a case at <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>, obtaining the increase is not
     * instantaneous. The <code>DescribeLimits</code> action lets you write code to compare the capacity you are
     * currently using to those limits imposed by your account so that you have enough time to apply for an increase
     * before you hit a limit.
     * </p>
     * <p>
     * For example, you could use one of the AWS SDKs to do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Call <code>DescribeLimits</code> for a particular region to obtain your current account limits on provisioned
     * capacity there.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a variable to hold the aggregate read capacity units provisioned for all your tables in that region, and
     * one to hold the aggregate write capacity units. Zero them both.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>ListTables</code> to obtain a list of all your DynamoDB tables.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each table name listed by <code>ListTables</code>, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Call <code>DescribeTable</code> with the table name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the data returned by <code>DescribeTable</code> to add the read capacity units and write capacity units
     * provisioned for the table itself to your variables.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the table has one or more global secondary indexes (GSIs), loop over these GSIs and add their provisioned
     * capacity values to your variables as well.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Report the account limits for that region returned by <code>DescribeLimits</code>, along with the total current
     * provisioned capacity levels you have calculated.
     * </p>
     * </li>
     * </ol>
     * <p>
     * This will let you see whether you are getting close to your account-level limits.
     * </p>
     * <p>
     * The per-table limits apply only when you are creating a new table. They restrict the sum of the provisioned
     * capacity of the new table itself and all its global secondary indexes.
     * </p>
     * <p>
     * For existing tables and their GSIs, DynamoDB will not let you increase provisioned capacity extremely rapidly,
     * but the only upper limit that applies is that the aggregate provisioned capacity over all your tables and GSIs
     * cannot exceed either of the per-account limits.
     * </p>
     * <note>
     * <p>
     * <code>DescribeLimits</code> should only be called periodically. You can expect throttling errors if you call it
     * more than once in a minute.
     * </p>
     * </note>
     * <p>
     * The <code>DescribeLimits</code> Request element has no content.
     * </p>
     * 
     * @param describeLimitsRequest
     *        Represents the input of a <code>DescribeLimits</code> operation. Has no content.
     * @return A Java Future containing the result of the DescribeLimits operation returned by the service.
     * @sample AmazonDynamoDBAsync.DescribeLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeLimits" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeLimitsResult> describeLimitsAsync(DescribeLimitsRequest describeLimitsRequest);

    /**
     * <p>
     * Returns the current provisioned-capacity limits for your AWS account in a region, both for the region as a whole
     * and for any one DynamoDB table that you create there.
     * </p>
     * <p>
     * When you establish an AWS account, the account has initial limits on the maximum read capacity units and write
     * capacity units that you can provision across all of your DynamoDB tables in a given region. Also, there are
     * per-table limits that apply when you create a table there. For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> page in the
     * <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Although you can increase these limits by filing a case at <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>, obtaining the increase is not
     * instantaneous. The <code>DescribeLimits</code> action lets you write code to compare the capacity you are
     * currently using to those limits imposed by your account so that you have enough time to apply for an increase
     * before you hit a limit.
     * </p>
     * <p>
     * For example, you could use one of the AWS SDKs to do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Call <code>DescribeLimits</code> for a particular region to obtain your current account limits on provisioned
     * capacity there.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a variable to hold the aggregate read capacity units provisioned for all your tables in that region, and
     * one to hold the aggregate write capacity units. Zero them both.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>ListTables</code> to obtain a list of all your DynamoDB tables.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each table name listed by <code>ListTables</code>, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Call <code>DescribeTable</code> with the table name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the data returned by <code>DescribeTable</code> to add the read capacity units and write capacity units
     * provisioned for the table itself to your variables.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the table has one or more global secondary indexes (GSIs), loop over these GSIs and add their provisioned
     * capacity values to your variables as well.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Report the account limits for that region returned by <code>DescribeLimits</code>, along with the total current
     * provisioned capacity levels you have calculated.
     * </p>
     * </li>
     * </ol>
     * <p>
     * This will let you see whether you are getting close to your account-level limits.
     * </p>
     * <p>
     * The per-table limits apply only when you are creating a new table. They restrict the sum of the provisioned
     * capacity of the new table itself and all its global secondary indexes.
     * </p>
     * <p>
     * For existing tables and their GSIs, DynamoDB will not let you increase provisioned capacity extremely rapidly,
     * but the only upper limit that applies is that the aggregate provisioned capacity over all your tables and GSIs
     * cannot exceed either of the per-account limits.
     * </p>
     * <note>
     * <p>
     * <code>DescribeLimits</code> should only be called periodically. You can expect throttling errors if you call it
     * more than once in a minute.
     * </p>
     * </note>
     * <p>
     * The <code>DescribeLimits</code> Request element has no content.
     * </p>
     * 
     * @param describeLimitsRequest
     *        Represents the input of a <code>DescribeLimits</code> operation. Has no content.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLimits operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.DescribeLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeLimits" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeLimitsResult> describeLimitsAsync(DescribeLimitsRequest describeLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLimitsRequest, DescribeLimitsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the table, including the current status of the table, when it was created, the primary
     * key schema, and any indexes on the table.
     * </p>
     * <note>
     * <p>
     * If you issue a <code>DescribeTable</code> request immediately after a <code>CreateTable</code> request, DynamoDB
     * might return a <code>ResourceNotFoundException</code>. This is because <code>DescribeTable</code> uses an
     * eventually consistent query, and the metadata for your table might not be available at that moment. Wait for a
     * few seconds, and then try the <code>DescribeTable</code> request again.
     * </p>
     * </note>
     * 
     * @param describeTableRequest
     *        Represents the input of a <code>DescribeTable</code> operation.
     * @return A Java Future containing the result of the DescribeTable operation returned by the service.
     * @sample AmazonDynamoDBAsync.DescribeTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest describeTableRequest);

    /**
     * <p>
     * Returns information about the table, including the current status of the table, when it was created, the primary
     * key schema, and any indexes on the table.
     * </p>
     * <note>
     * <p>
     * If you issue a <code>DescribeTable</code> request immediately after a <code>CreateTable</code> request, DynamoDB
     * might return a <code>ResourceNotFoundException</code>. This is because <code>DescribeTable</code> uses an
     * eventually consistent query, and the metadata for your table might not be available at that moment. Wait for a
     * few seconds, and then try the <code>DescribeTable</code> request again.
     * </p>
     * </note>
     * 
     * @param describeTableRequest
     *        Represents the input of a <code>DescribeTable</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTable operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.DescribeTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest describeTableRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTable operation.
     *
     * @see #describeTableAsync(DescribeTableRequest)
     */
    java.util.concurrent.Future<DescribeTableResult> describeTableAsync(String tableName);

    /**
     * Simplified method form for invoking the DescribeTable operation with an AsyncHandler.
     *
     * @see #describeTableAsync(DescribeTableRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTableResult> describeTableAsync(String tableName,
            com.amazonaws.handlers.AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler);

    /**
     * <p>
     * Gives a description of the Time to Live (TTL) status on the specified table.
     * </p>
     * 
     * @param describeTimeToLiveRequest
     * @return A Java Future containing the result of the DescribeTimeToLive operation returned by the service.
     * @sample AmazonDynamoDBAsync.DescribeTimeToLive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeTimeToLive" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTimeToLiveResult> describeTimeToLiveAsync(DescribeTimeToLiveRequest describeTimeToLiveRequest);

    /**
     * <p>
     * Gives a description of the Time to Live (TTL) status on the specified table.
     * </p>
     * 
     * @param describeTimeToLiveRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTimeToLive operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.DescribeTimeToLive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeTimeToLive" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTimeToLiveResult> describeTimeToLiveAsync(DescribeTimeToLiveRequest describeTimeToLiveRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTimeToLiveRequest, DescribeTimeToLiveResult> asyncHandler);

    /**
     * <p>
     * The <code>GetItem</code> operation returns a set of attributes for the item with the given primary key. If there
     * is no matching item, <code>GetItem</code> does not return any data and there will be no <code>Item</code> element
     * in the response.
     * </p>
     * <p>
     * <code>GetItem</code> provides an eventually consistent read by default. If your application requires a strongly
     * consistent read, set <code>ConsistentRead</code> to <code>true</code>. Although a strongly consistent read might
     * take more time than an eventually consistent read, it always returns the last updated value.
     * </p>
     * 
     * @param getItemRequest
     *        Represents the input of a <code>GetItem</code> operation.
     * @return A Java Future containing the result of the GetItem operation returned by the service.
     * @sample AmazonDynamoDBAsync.GetItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/GetItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetItemResult> getItemAsync(GetItemRequest getItemRequest);

    /**
     * <p>
     * The <code>GetItem</code> operation returns a set of attributes for the item with the given primary key. If there
     * is no matching item, <code>GetItem</code> does not return any data and there will be no <code>Item</code> element
     * in the response.
     * </p>
     * <p>
     * <code>GetItem</code> provides an eventually consistent read by default. If your application requires a strongly
     * consistent read, set <code>ConsistentRead</code> to <code>true</code>. Although a strongly consistent read might
     * take more time than an eventually consistent read, it always returns the last updated value.
     * </p>
     * 
     * @param getItemRequest
     *        Represents the input of a <code>GetItem</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetItem operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.GetItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/GetItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetItemResult> getItemAsync(GetItemRequest getItemRequest,
            com.amazonaws.handlers.AsyncHandler<GetItemRequest, GetItemResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetItem operation.
     *
     * @see #getItemAsync(GetItemRequest)
     */
    java.util.concurrent.Future<GetItemResult> getItemAsync(String tableName, java.util.Map<String, AttributeValue> key);

    /**
     * Simplified method form for invoking the GetItem operation with an AsyncHandler.
     *
     * @see #getItemAsync(GetItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetItemResult> getItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            com.amazonaws.handlers.AsyncHandler<GetItemRequest, GetItemResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetItem operation.
     *
     * @see #getItemAsync(GetItemRequest)
     */
    java.util.concurrent.Future<GetItemResult> getItemAsync(String tableName, java.util.Map<String, AttributeValue> key, Boolean consistentRead);

    /**
     * Simplified method form for invoking the GetItem operation with an AsyncHandler.
     *
     * @see #getItemAsync(GetItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetItemResult> getItemAsync(String tableName, java.util.Map<String, AttributeValue> key, Boolean consistentRead,
            com.amazonaws.handlers.AsyncHandler<GetItemRequest, GetItemResult> asyncHandler);

    /**
     * <p>
     * List backups associated with an AWS account. To list backups for a given table, specify <code>TableName</code>.
     * <code>ListBackups</code> returns a paginated list of results with at most 1MB worth of items in a page. You can
     * also specify a limit for the maximum number of entries to be returned in a page.
     * </p>
     * <p>
     * In the request, start time is inclusive but end time is exclusive. Note that these limits are for the time at
     * which the original backup was requested.
     * </p>
     * <p>
     * You can call <code>ListBackups</code> a maximum of 5 times per second.
     * </p>
     * 
     * @param listBackupsRequest
     * @return A Java Future containing the result of the ListBackups operation returned by the service.
     * @sample AmazonDynamoDBAsync.ListBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListBackups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBackupsResult> listBackupsAsync(ListBackupsRequest listBackupsRequest);

    /**
     * <p>
     * List backups associated with an AWS account. To list backups for a given table, specify <code>TableName</code>.
     * <code>ListBackups</code> returns a paginated list of results with at most 1MB worth of items in a page. You can
     * also specify a limit for the maximum number of entries to be returned in a page.
     * </p>
     * <p>
     * In the request, start time is inclusive but end time is exclusive. Note that these limits are for the time at
     * which the original backup was requested.
     * </p>
     * <p>
     * You can call <code>ListBackups</code> a maximum of 5 times per second.
     * </p>
     * 
     * @param listBackupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBackups operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.ListBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListBackups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBackupsResult> listBackupsAsync(ListBackupsRequest listBackupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBackupsRequest, ListBackupsResult> asyncHandler);

    /**
     * <p>
     * Lists all global tables that have a replica in the specified region.
     * </p>
     * 
     * @param listGlobalTablesRequest
     * @return A Java Future containing the result of the ListGlobalTables operation returned by the service.
     * @sample AmazonDynamoDBAsync.ListGlobalTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListGlobalTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGlobalTablesResult> listGlobalTablesAsync(ListGlobalTablesRequest listGlobalTablesRequest);

    /**
     * <p>
     * Lists all global tables that have a replica in the specified region.
     * </p>
     * 
     * @param listGlobalTablesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGlobalTables operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.ListGlobalTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListGlobalTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGlobalTablesResult> listGlobalTablesAsync(ListGlobalTablesRequest listGlobalTablesRequest,
            com.amazonaws.handlers.AsyncHandler<ListGlobalTablesRequest, ListGlobalTablesResult> asyncHandler);

    /**
     * <p>
     * Returns an array of table names associated with the current account and endpoint. The output from
     * <code>ListTables</code> is paginated, with each page returning a maximum of 100 table names.
     * </p>
     * 
     * @param listTablesRequest
     *        Represents the input of a <code>ListTables</code> operation.
     * @return A Java Future containing the result of the ListTables operation returned by the service.
     * @sample AmazonDynamoDBAsync.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest);

    /**
     * <p>
     * Returns an array of table names associated with the current account and endpoint. The output from
     * <code>ListTables</code> is paginated, with each page returning a maximum of 100 table names.
     * </p>
     * 
     * @param listTablesRequest
     *        Represents the input of a <code>ListTables</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTables operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTablesAsync(ListTablesRequest)
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync();

    /**
     * Simplified method form for invoking the ListTables operation with an AsyncHandler.
     *
     * @see #listTablesAsync(ListTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTablesAsync(ListTablesRequest)
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(String exclusiveStartTableName);

    /**
     * Simplified method form for invoking the ListTables operation with an AsyncHandler.
     *
     * @see #listTablesAsync(ListTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(String exclusiveStartTableName,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTablesAsync(ListTablesRequest)
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(String exclusiveStartTableName, Integer limit);

    /**
     * Simplified method form for invoking the ListTables operation with an AsyncHandler.
     *
     * @see #listTablesAsync(ListTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(String exclusiveStartTableName, Integer limit,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTablesAsync(ListTablesRequest)
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(Integer limit);

    /**
     * Simplified method form for invoking the ListTables operation with an AsyncHandler.
     *
     * @see #listTablesAsync(ListTablesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(Integer limit,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler);

    /**
     * <p>
     * List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up to 10 times per second, per
     * account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html">Tagging for DynamoDB</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param listTagsOfResourceRequest
     * @return A Java Future containing the result of the ListTagsOfResource operation returned by the service.
     * @sample AmazonDynamoDBAsync.ListTagsOfResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListTagsOfResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsOfResourceResult> listTagsOfResourceAsync(ListTagsOfResourceRequest listTagsOfResourceRequest);

    /**
     * <p>
     * List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up to 10 times per second, per
     * account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html">Tagging for DynamoDB</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param listTagsOfResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsOfResource operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.ListTagsOfResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListTagsOfResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsOfResourceResult> listTagsOfResourceAsync(ListTagsOfResourceRequest listTagsOfResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsOfResourceRequest, ListTagsOfResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a new item, or replaces an old item with a new item. If an item that has the same primary key as the new
     * item already exists in the specified table, the new item completely replaces the existing item. You can perform a
     * conditional put operation (add a new item if one with the specified primary key doesn't exist), or replace an
     * existing item if it has certain attribute values. You can return the item's attribute values in the same
     * operation, using the <code>ReturnValues</code> parameter.
     * </p>
     * <important>
     * <p>
     * This topic provides general information about the <code>PutItem</code> API.
     * </p>
     * <p>
     * For information on how to call the <code>PutItem</code> API using the AWS SDK in specific languages, see the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/aws-cli/dynamodb-2012-08-10/PutItem"> PutItem in the AWS Command Line
     * Interface </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/DotNetSDKV3/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for
     * .NET </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/SdkForCpp/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for C++
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/SdkForGoV1/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for Go
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/SdkForJava/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for Java
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/AWSJavaScriptSDK/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK
     * for JavaScript </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/SdkForPHPV3/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for PHP
     * V3 </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/boto3/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for Python
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/SdkForRubyV2/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for
     * Ruby V2 </a>
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * When you add an item, the primary key attribute(s) are the only required attributes. Attribute values cannot be
     * null. String and Binary type attributes must have lengths greater than zero. Set type attributes cannot be empty.
     * Requests with empty values will be rejected with a <code>ValidationException</code> exception.
     * </p>
     * <note>
     * <p>
     * To prevent a new item from replacing an existing item, use a conditional expression that contains the
     * <code>attribute_not_exists</code> function with the name of the attribute being used as the partition key for the
     * table. Since every record must contain that attribute, the <code>attribute_not_exists</code> function will only
     * succeed if no matching item exists.
     * </p>
     * </note>
     * <p>
     * For more information about <code>PutItem</code>, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html">Working with
     * Items</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param putItemRequest
     *        Represents the input of a <code>PutItem</code> operation.
     * @return A Java Future containing the result of the PutItem operation returned by the service.
     * @sample AmazonDynamoDBAsync.PutItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/PutItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutItemResult> putItemAsync(PutItemRequest putItemRequest);

    /**
     * <p>
     * Creates a new item, or replaces an old item with a new item. If an item that has the same primary key as the new
     * item already exists in the specified table, the new item completely replaces the existing item. You can perform a
     * conditional put operation (add a new item if one with the specified primary key doesn't exist), or replace an
     * existing item if it has certain attribute values. You can return the item's attribute values in the same
     * operation, using the <code>ReturnValues</code> parameter.
     * </p>
     * <important>
     * <p>
     * This topic provides general information about the <code>PutItem</code> API.
     * </p>
     * <p>
     * For information on how to call the <code>PutItem</code> API using the AWS SDK in specific languages, see the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/aws-cli/dynamodb-2012-08-10/PutItem"> PutItem in the AWS Command Line
     * Interface </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/DotNetSDKV3/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for
     * .NET </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/SdkForCpp/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for C++
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/SdkForGoV1/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for Go
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/SdkForJava/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for Java
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/AWSJavaScriptSDK/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK
     * for JavaScript </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/SdkForPHPV3/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for PHP
     * V3 </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/boto3/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for Python
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/goto/SdkForRubyV2/dynamodb-2012-08-10/PutItem"> PutItem in the AWS SDK for
     * Ruby V2 </a>
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * When you add an item, the primary key attribute(s) are the only required attributes. Attribute values cannot be
     * null. String and Binary type attributes must have lengths greater than zero. Set type attributes cannot be empty.
     * Requests with empty values will be rejected with a <code>ValidationException</code> exception.
     * </p>
     * <note>
     * <p>
     * To prevent a new item from replacing an existing item, use a conditional expression that contains the
     * <code>attribute_not_exists</code> function with the name of the attribute being used as the partition key for the
     * table. Since every record must contain that attribute, the <code>attribute_not_exists</code> function will only
     * succeed if no matching item exists.
     * </p>
     * </note>
     * <p>
     * For more information about <code>PutItem</code>, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html">Working with
     * Items</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param putItemRequest
     *        Represents the input of a <code>PutItem</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutItem operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.PutItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/PutItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutItemResult> putItemAsync(PutItemRequest putItemRequest,
            com.amazonaws.handlers.AsyncHandler<PutItemRequest, PutItemResult> asyncHandler);

    /**
     * Simplified method form for invoking the PutItem operation.
     *
     * @see #putItemAsync(PutItemRequest)
     */
    java.util.concurrent.Future<PutItemResult> putItemAsync(String tableName, java.util.Map<String, AttributeValue> item);

    /**
     * Simplified method form for invoking the PutItem operation with an AsyncHandler.
     *
     * @see #putItemAsync(PutItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<PutItemResult> putItemAsync(String tableName, java.util.Map<String, AttributeValue> item,
            com.amazonaws.handlers.AsyncHandler<PutItemRequest, PutItemResult> asyncHandler);

    /**
     * Simplified method form for invoking the PutItem operation.
     *
     * @see #putItemAsync(PutItemRequest)
     */
    java.util.concurrent.Future<PutItemResult> putItemAsync(String tableName, java.util.Map<String, AttributeValue> item, String returnValues);

    /**
     * Simplified method form for invoking the PutItem operation with an AsyncHandler.
     *
     * @see #putItemAsync(PutItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<PutItemResult> putItemAsync(String tableName, java.util.Map<String, AttributeValue> item, String returnValues,
            com.amazonaws.handlers.AsyncHandler<PutItemRequest, PutItemResult> asyncHandler);

    /**
     * <p>
     * The <code>Query</code> operation finds items based on primary key values. You can query any table or secondary
     * index that has a composite primary key (a partition key and a sort key).
     * </p>
     * <p>
     * Use the <code>KeyConditionExpression</code> parameter to provide a specific value for the partition key. The
     * <code>Query</code> operation will return all of the items from the table or index with that partition key value.
     * You can optionally narrow the scope of the <code>Query</code> operation by specifying a sort key value and a
     * comparison operator in <code>KeyConditionExpression</code>. To further refine the <code>Query</code> results, you
     * can optionally provide a <code>FilterExpression</code>. A <code>FilterExpression</code> determines which items
     * within the results should be returned to you. All of the other results are discarded.
     * </p>
     * <p>
     * A <code>Query</code> operation always returns a result set. If no matching items are found, the result set will
     * be empty. Queries that do not return results consume the minimum number of read capacity units for that type of
     * read operation.
     * </p>
     * <note>
     * <p>
     * DynamoDB calculates the number of read capacity units consumed based on item size, not on the amount of data that
     * is returned to an application. The number of capacity units consumed will be the same whether you request all of
     * the attributes (the default behavior) or just some of them (using a projection expression). The number will also
     * be the same whether or not you use a <code>FilterExpression</code>.
     * </p>
     * </note>
     * <p>
     * <code>Query</code> results are always sorted by the sort key value. If the data type of the sort key is Number,
     * the results are returned in numeric order; otherwise, the results are returned in order of UTF-8 bytes. By
     * default, the sort order is ascending. To reverse the order, set the <code>ScanIndexForward</code> parameter to
     * false.
     * </p>
     * <p>
     * A single <code>Query</code> operation will read up to the maximum number of items set (if using the
     * <code>Limit</code> parameter) or a maximum of 1 MB of data and then apply any filtering to the results using
     * <code>FilterExpression</code>. If <code>LastEvaluatedKey</code> is present in the response, you will need to
     * paginate the result set. For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Query.html#Query.Pagination">Paginating
     * the Results</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <code>FilterExpression</code> is applied after a <code>Query</code> finishes, but before the results are
     * returned. A <code>FilterExpression</code> cannot contain partition key or sort key attributes. You need to
     * specify those attributes in the <code>KeyConditionExpression</code>.
     * </p>
     * <note>
     * <p>
     * A <code>Query</code> operation can return an empty result set and a <code>LastEvaluatedKey</code> if all the
     * items read for the page of results are filtered out.
     * </p>
     * </note>
     * <p>
     * You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local
     * secondary index, you can set the <code>ConsistentRead</code> parameter to <code>true</code> and obtain a strongly
     * consistent result. Global secondary indexes support eventually consistent reads only, so do not specify
     * <code>ConsistentRead</code> when querying a global secondary index.
     * </p>
     * 
     * @param queryRequest
     *        Represents the input of a <code>Query</code> operation.
     * @return A Java Future containing the result of the Query operation returned by the service.
     * @sample AmazonDynamoDBAsync.Query
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Query" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest queryRequest);

    /**
     * <p>
     * The <code>Query</code> operation finds items based on primary key values. You can query any table or secondary
     * index that has a composite primary key (a partition key and a sort key).
     * </p>
     * <p>
     * Use the <code>KeyConditionExpression</code> parameter to provide a specific value for the partition key. The
     * <code>Query</code> operation will return all of the items from the table or index with that partition key value.
     * You can optionally narrow the scope of the <code>Query</code> operation by specifying a sort key value and a
     * comparison operator in <code>KeyConditionExpression</code>. To further refine the <code>Query</code> results, you
     * can optionally provide a <code>FilterExpression</code>. A <code>FilterExpression</code> determines which items
     * within the results should be returned to you. All of the other results are discarded.
     * </p>
     * <p>
     * A <code>Query</code> operation always returns a result set. If no matching items are found, the result set will
     * be empty. Queries that do not return results consume the minimum number of read capacity units for that type of
     * read operation.
     * </p>
     * <note>
     * <p>
     * DynamoDB calculates the number of read capacity units consumed based on item size, not on the amount of data that
     * is returned to an application. The number of capacity units consumed will be the same whether you request all of
     * the attributes (the default behavior) or just some of them (using a projection expression). The number will also
     * be the same whether or not you use a <code>FilterExpression</code>.
     * </p>
     * </note>
     * <p>
     * <code>Query</code> results are always sorted by the sort key value. If the data type of the sort key is Number,
     * the results are returned in numeric order; otherwise, the results are returned in order of UTF-8 bytes. By
     * default, the sort order is ascending. To reverse the order, set the <code>ScanIndexForward</code> parameter to
     * false.
     * </p>
     * <p>
     * A single <code>Query</code> operation will read up to the maximum number of items set (if using the
     * <code>Limit</code> parameter) or a maximum of 1 MB of data and then apply any filtering to the results using
     * <code>FilterExpression</code>. If <code>LastEvaluatedKey</code> is present in the response, you will need to
     * paginate the result set. For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Query.html#Query.Pagination">Paginating
     * the Results</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <code>FilterExpression</code> is applied after a <code>Query</code> finishes, but before the results are
     * returned. A <code>FilterExpression</code> cannot contain partition key or sort key attributes. You need to
     * specify those attributes in the <code>KeyConditionExpression</code>.
     * </p>
     * <note>
     * <p>
     * A <code>Query</code> operation can return an empty result set and a <code>LastEvaluatedKey</code> if all the
     * items read for the page of results are filtered out.
     * </p>
     * </note>
     * <p>
     * You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local
     * secondary index, you can set the <code>ConsistentRead</code> parameter to <code>true</code> and obtain a strongly
     * consistent result. Global secondary indexes support eventually consistent reads only, so do not specify
     * <code>ConsistentRead</code> when querying a global secondary index.
     * </p>
     * 
     * @param queryRequest
     *        Represents the input of a <code>Query</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Query operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.Query
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Query" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest queryRequest, com.amazonaws.handlers.AsyncHandler<QueryRequest, QueryResult> asyncHandler);

    /**
     * <p>
     * Creates a new table from an existing backup. Any number of users can execute up to 4 concurrent restores (any
     * type of restore) in a given account.
     * </p>
     * <p>
     * You can call <code>RestoreTableFromBackup</code> at a maximum rate of 10 times per second.
     * </p>
     * <p>
     * You must manually set up the following on the restored table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto scaling policies
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM policies
     * </p>
     * </li>
     * <li>
     * <p>
     * Cloudwatch metrics and alarms
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags
     * </p>
     * </li>
     * <li>
     * <p>
     * Stream settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Time to Live (TTL) settings
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreTableFromBackupRequest
     * @return A Java Future containing the result of the RestoreTableFromBackup operation returned by the service.
     * @sample AmazonDynamoDBAsync.RestoreTableFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/RestoreTableFromBackup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreTableFromBackupResult> restoreTableFromBackupAsync(RestoreTableFromBackupRequest restoreTableFromBackupRequest);

    /**
     * <p>
     * Creates a new table from an existing backup. Any number of users can execute up to 4 concurrent restores (any
     * type of restore) in a given account.
     * </p>
     * <p>
     * You can call <code>RestoreTableFromBackup</code> at a maximum rate of 10 times per second.
     * </p>
     * <p>
     * You must manually set up the following on the restored table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto scaling policies
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM policies
     * </p>
     * </li>
     * <li>
     * <p>
     * Cloudwatch metrics and alarms
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags
     * </p>
     * </li>
     * <li>
     * <p>
     * Stream settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Time to Live (TTL) settings
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreTableFromBackupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreTableFromBackup operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.RestoreTableFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/RestoreTableFromBackup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreTableFromBackupResult> restoreTableFromBackupAsync(RestoreTableFromBackupRequest restoreTableFromBackupRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreTableFromBackupRequest, RestoreTableFromBackupResult> asyncHandler);

    /**
     * <p>
     * Restores the specified table to the specified point in time within <code>EarliestRestorableDateTime</code> and
     * <code>LatestRestorableDateTime</code>. You can restore your table to any point in time during the last 35 days.
     * Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.
     * </p>
     * <p>
     * When you restore using point in time recovery, DynamoDB restores your table data to the state based on the
     * selected date and time (day:hour:minute:second) to a new table.
     * </p>
     * <p>
     * Along with data, the following are also included on the new restored table using point in time recovery:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Global secondary indexes (GSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Local secondary indexes (LSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned read and write capacity
     * </p>
     * </li>
     * <li>
     * <p>
     * Encryption settings
     * </p>
     * <important>
     * <p>
     * All these settings come from the current settings of the source table at the time of restore.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * You must manually set up the following on the restored table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto scaling policies
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM policies
     * </p>
     * </li>
     * <li>
     * <p>
     * Cloudwatch metrics and alarms
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags
     * </p>
     * </li>
     * <li>
     * <p>
     * Stream settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Time to Live (TTL) settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Point in time recovery settings
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreTableToPointInTimeRequest
     * @return A Java Future containing the result of the RestoreTableToPointInTime operation returned by the service.
     * @sample AmazonDynamoDBAsync.RestoreTableToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/RestoreTableToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreTableToPointInTimeResult> restoreTableToPointInTimeAsync(
            RestoreTableToPointInTimeRequest restoreTableToPointInTimeRequest);

    /**
     * <p>
     * Restores the specified table to the specified point in time within <code>EarliestRestorableDateTime</code> and
     * <code>LatestRestorableDateTime</code>. You can restore your table to any point in time during the last 35 days.
     * Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.
     * </p>
     * <p>
     * When you restore using point in time recovery, DynamoDB restores your table data to the state based on the
     * selected date and time (day:hour:minute:second) to a new table.
     * </p>
     * <p>
     * Along with data, the following are also included on the new restored table using point in time recovery:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Global secondary indexes (GSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Local secondary indexes (LSIs)
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned read and write capacity
     * </p>
     * </li>
     * <li>
     * <p>
     * Encryption settings
     * </p>
     * <important>
     * <p>
     * All these settings come from the current settings of the source table at the time of restore.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * You must manually set up the following on the restored table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto scaling policies
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM policies
     * </p>
     * </li>
     * <li>
     * <p>
     * Cloudwatch metrics and alarms
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags
     * </p>
     * </li>
     * <li>
     * <p>
     * Stream settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Time to Live (TTL) settings
     * </p>
     * </li>
     * <li>
     * <p>
     * Point in time recovery settings
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreTableToPointInTimeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreTableToPointInTime operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.RestoreTableToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/RestoreTableToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreTableToPointInTimeResult> restoreTableToPointInTimeAsync(
            RestoreTableToPointInTimeRequest restoreTableToPointInTimeRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreTableToPointInTimeRequest, RestoreTableToPointInTimeResult> asyncHandler);

    /**
     * <p>
     * The <code>Scan</code> operation returns one or more items and item attributes by accessing every item in a table
     * or a secondary index. To have DynamoDB return fewer items, you can provide a <code>FilterExpression</code>
     * operation.
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results
     * are returned to the user as a <code>LastEvaluatedKey</code> value to continue the scan in a subsequent operation.
     * The results also include the number of items exceeding the limit. A scan can result in no table data meeting the
     * filter criteria.
     * </p>
     * <p>
     * A single <code>Scan</code> operation will read up to the maximum number of items set (if using the
     * <code>Limit</code> parameter) or a maximum of 1 MB of data and then apply any filtering to the results using
     * <code>FilterExpression</code>. If <code>LastEvaluatedKey</code> is present in the response, you will need to
     * paginate the result set. For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.Pagination">Paginating the
     * Results</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <code>Scan</code> operations proceed sequentially; however, for faster performance on a large table or secondary
     * index, applications can request a parallel <code>Scan</code> operation by providing the <code>Segment</code> and
     * <code>TotalSegments</code> parameters. For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.ParallelScan">Parallel
     * Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <code>Scan</code> uses eventually consistent reads when accessing the data in a table; therefore, the result set
     * might not include the changes to data in the table immediately before the operation began. If you need a
     * consistent copy of the data, as of the time that the <code>Scan</code> begins, you can set the
     * <code>ConsistentRead</code> parameter to <code>true</code>.
     * </p>
     * 
     * @param scanRequest
     *        Represents the input of a <code>Scan</code> operation.
     * @return A Java Future containing the result of the Scan operation returned by the service.
     * @sample AmazonDynamoDBAsync.Scan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Scan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ScanResult> scanAsync(ScanRequest scanRequest);

    /**
     * <p>
     * The <code>Scan</code> operation returns one or more items and item attributes by accessing every item in a table
     * or a secondary index. To have DynamoDB return fewer items, you can provide a <code>FilterExpression</code>
     * operation.
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results
     * are returned to the user as a <code>LastEvaluatedKey</code> value to continue the scan in a subsequent operation.
     * The results also include the number of items exceeding the limit. A scan can result in no table data meeting the
     * filter criteria.
     * </p>
     * <p>
     * A single <code>Scan</code> operation will read up to the maximum number of items set (if using the
     * <code>Limit</code> parameter) or a maximum of 1 MB of data and then apply any filtering to the results using
     * <code>FilterExpression</code>. If <code>LastEvaluatedKey</code> is present in the response, you will need to
     * paginate the result set. For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.Pagination">Paginating the
     * Results</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <code>Scan</code> operations proceed sequentially; however, for faster performance on a large table or secondary
     * index, applications can request a parallel <code>Scan</code> operation by providing the <code>Segment</code> and
     * <code>TotalSegments</code> parameters. For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.ParallelScan">Parallel
     * Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <code>Scan</code> uses eventually consistent reads when accessing the data in a table; therefore, the result set
     * might not include the changes to data in the table immediately before the operation began. If you need a
     * consistent copy of the data, as of the time that the <code>Scan</code> begins, you can set the
     * <code>ConsistentRead</code> parameter to <code>true</code>.
     * </p>
     * 
     * @param scanRequest
     *        Represents the input of a <code>Scan</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Scan operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.Scan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Scan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ScanResult> scanAsync(ScanRequest scanRequest, com.amazonaws.handlers.AsyncHandler<ScanRequest, ScanResult> asyncHandler);

    /**
     * Simplified method form for invoking the Scan operation.
     *
     * @see #scanAsync(ScanRequest)
     */
    java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.List<String> attributesToGet);

    /**
     * Simplified method form for invoking the Scan operation with an AsyncHandler.
     *
     * @see #scanAsync(ScanRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.List<String> attributesToGet,
            com.amazonaws.handlers.AsyncHandler<ScanRequest, ScanResult> asyncHandler);

    /**
     * Simplified method form for invoking the Scan operation.
     *
     * @see #scanAsync(ScanRequest)
     */
    java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.Map<String, Condition> scanFilter);

    /**
     * Simplified method form for invoking the Scan operation with an AsyncHandler.
     *
     * @see #scanAsync(ScanRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.Map<String, Condition> scanFilter,
            com.amazonaws.handlers.AsyncHandler<ScanRequest, ScanResult> asyncHandler);

    /**
     * Simplified method form for invoking the Scan operation.
     *
     * @see #scanAsync(ScanRequest)
     */
    java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.List<String> attributesToGet, java.util.Map<String, Condition> scanFilter);

    /**
     * Simplified method form for invoking the Scan operation with an AsyncHandler.
     *
     * @see #scanAsync(ScanRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ScanResult> scanAsync(String tableName, java.util.List<String> attributesToGet, java.util.Map<String, Condition> scanFilter,
            com.amazonaws.handlers.AsyncHandler<ScanRequest, ScanResult> asyncHandler);

    /**
     * <p>
     * Associate a set of tags with an Amazon DynamoDB resource. You can then activate these user-defined tags so that
     * they appear on the Billing and Cost Management console for cost allocation tracking. You can call TagResource up
     * to 5 times per second, per account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html">Tagging for DynamoDB</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonDynamoDBAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associate a set of tags with an Amazon DynamoDB resource. You can then activate these user-defined tags so that
     * they appear on the Billing and Cost Management console for cost allocation tracking. You can call TagResource up
     * to 5 times per second, per account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html">Tagging for DynamoDB</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * <code>TransactGetItems</code> is a synchronous operation that atomically retrieves multiple items from one or
     * more tables (but not from indexes) in a single account and region. A <code>TransactGetItems</code> call can
     * contain up to 10 <code>TransactGetItem</code> objects, each of which contains a <code>Get</code> structure that
     * specifies an item to retrieve from a table in the account and region. A call to <code>TransactGetItems</code>
     * cannot retrieve items from tables in more than one AWS account or region.
     * </p>
     * <p>
     * DynamoDB rejects the entire <code>TransactGetItems</code> request if any of the following is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A conflicting operation is in the process of updating an item to be read.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is insufficient provisioned capacity for the transaction to be completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is a user error, such as an invalid data format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transactGetItemsRequest
     * @return A Java Future containing the result of the TransactGetItems operation returned by the service.
     * @sample AmazonDynamoDBAsync.TransactGetItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TransactGetItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TransactGetItemsResult> transactGetItemsAsync(TransactGetItemsRequest transactGetItemsRequest);

    /**
     * <p>
     * <code>TransactGetItems</code> is a synchronous operation that atomically retrieves multiple items from one or
     * more tables (but not from indexes) in a single account and region. A <code>TransactGetItems</code> call can
     * contain up to 10 <code>TransactGetItem</code> objects, each of which contains a <code>Get</code> structure that
     * specifies an item to retrieve from a table in the account and region. A call to <code>TransactGetItems</code>
     * cannot retrieve items from tables in more than one AWS account or region.
     * </p>
     * <p>
     * DynamoDB rejects the entire <code>TransactGetItems</code> request if any of the following is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A conflicting operation is in the process of updating an item to be read.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is insufficient provisioned capacity for the transaction to be completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is a user error, such as an invalid data format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transactGetItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TransactGetItems operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.TransactGetItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TransactGetItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TransactGetItemsResult> transactGetItemsAsync(TransactGetItemsRequest transactGetItemsRequest,
            com.amazonaws.handlers.AsyncHandler<TransactGetItemsRequest, TransactGetItemsResult> asyncHandler);

    /**
     * <p>
     * <code>TransactWriteItems</code> is a synchronous write operation that groups up to 10 action requests. These
     * actions can target items in different tables, but not in different AWS accounts or regions, and no two actions
     * can target the same item. For example, you cannot both <code>ConditionCheck</code> and <code>Update</code> the
     * same item.
     * </p>
     * <p>
     * The actions are completed atomically so that either all of them succeed, or all of them fail. They are defined by
     * the following objects:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Put</code>  &#x97;   Initiates a <code>PutItem</code> operation to write a new item. This structure
     * specifies the primary key of the item to be written, the name of the table to write it in, an optional condition
     * expression that must be satisfied for the write to succeed, a list of the item's attributes, and a field
     * indicating whether or not to retrieve the item's attributes if the condition is not met.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Update</code>  &#x97;   Initiates an <code>UpdateItem</code> operation to update an existing item. This
     * structure specifies the primary key of the item to be updated, the name of the table where it resides, an
     * optional condition expression that must be satisfied for the update to succeed, an expression that defines one or
     * more attributes to be updated, and a field indicating whether or not to retrieve the item's attributes if the
     * condition is not met.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delete</code>  &#x97;   Initiates a <code>DeleteItem</code> operation to delete an existing item. This
     * structure specifies the primary key of the item to be deleted, the name of the table where it resides, an
     * optional condition expression that must be satisfied for the deletion to succeed, and a field indicating whether
     * or not to retrieve the item's attributes if the condition is not met.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConditionCheck</code>  &#x97;   Applies a condition to an item that is not being modified by the
     * transaction. This structure specifies the primary key of the item to be checked, the name of the table where it
     * resides, a condition expression that must be satisfied for the transaction to succeed, and a field indicating
     * whether or not to retrieve the item's attributes if the condition is not met.
     * </p>
     * </li>
     * </ul>
     * <p>
     * DynamoDB rejects the entire <code>TransactWriteItems</code> request if any of the following is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A condition in one of the condition expressions is not met.
     * </p>
     * </li>
     * <li>
     * <p>
     * A conflicting operation is in the process of updating the same item.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is insufficient provisioned capacity for the transaction to be completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * An item size becomes too large (bigger than 400 KB), a Local Secondary Index (LSI) becomes too large, or a
     * similar validation error occurs because of changes made by the transaction.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is a user error, such as an invalid data format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transactWriteItemsRequest
     * @return A Java Future containing the result of the TransactWriteItems operation returned by the service.
     * @sample AmazonDynamoDBAsync.TransactWriteItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TransactWriteItems" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TransactWriteItemsResult> transactWriteItemsAsync(TransactWriteItemsRequest transactWriteItemsRequest);

    /**
     * <p>
     * <code>TransactWriteItems</code> is a synchronous write operation that groups up to 10 action requests. These
     * actions can target items in different tables, but not in different AWS accounts or regions, and no two actions
     * can target the same item. For example, you cannot both <code>ConditionCheck</code> and <code>Update</code> the
     * same item.
     * </p>
     * <p>
     * The actions are completed atomically so that either all of them succeed, or all of them fail. They are defined by
     * the following objects:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Put</code>  &#x97;   Initiates a <code>PutItem</code> operation to write a new item. This structure
     * specifies the primary key of the item to be written, the name of the table to write it in, an optional condition
     * expression that must be satisfied for the write to succeed, a list of the item's attributes, and a field
     * indicating whether or not to retrieve the item's attributes if the condition is not met.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Update</code>  &#x97;   Initiates an <code>UpdateItem</code> operation to update an existing item. This
     * structure specifies the primary key of the item to be updated, the name of the table where it resides, an
     * optional condition expression that must be satisfied for the update to succeed, an expression that defines one or
     * more attributes to be updated, and a field indicating whether or not to retrieve the item's attributes if the
     * condition is not met.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delete</code>  &#x97;   Initiates a <code>DeleteItem</code> operation to delete an existing item. This
     * structure specifies the primary key of the item to be deleted, the name of the table where it resides, an
     * optional condition expression that must be satisfied for the deletion to succeed, and a field indicating whether
     * or not to retrieve the item's attributes if the condition is not met.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConditionCheck</code>  &#x97;   Applies a condition to an item that is not being modified by the
     * transaction. This structure specifies the primary key of the item to be checked, the name of the table where it
     * resides, a condition expression that must be satisfied for the transaction to succeed, and a field indicating
     * whether or not to retrieve the item's attributes if the condition is not met.
     * </p>
     * </li>
     * </ul>
     * <p>
     * DynamoDB rejects the entire <code>TransactWriteItems</code> request if any of the following is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A condition in one of the condition expressions is not met.
     * </p>
     * </li>
     * <li>
     * <p>
     * A conflicting operation is in the process of updating the same item.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is insufficient provisioned capacity for the transaction to be completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * An item size becomes too large (bigger than 400 KB), a Local Secondary Index (LSI) becomes too large, or a
     * similar validation error occurs because of changes made by the transaction.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is a user error, such as an invalid data format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transactWriteItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TransactWriteItems operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.TransactWriteItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TransactWriteItems" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TransactWriteItemsResult> transactWriteItemsAsync(TransactWriteItemsRequest transactWriteItemsRequest,
            com.amazonaws.handlers.AsyncHandler<TransactWriteItemsRequest, TransactWriteItemsResult> asyncHandler);

    /**
     * <p>
     * Removes the association of tags from an Amazon DynamoDB resource. You can call UntagResource up to 5 times per
     * second, per account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html">Tagging for DynamoDB</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonDynamoDBAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the association of tags from an Amazon DynamoDB resource. You can call UntagResource up to 5 times per
     * second, per account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html">Tagging for DynamoDB</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * <code>UpdateContinuousBackups</code> enables or disables point in time recovery for the specified table. A
     * successful <code>UpdateContinuousBackups</code> call returns the current
     * <code>ContinuousBackupsDescription</code>. Continuous backups are <code>ENABLED</code> on all tables at table
     * creation. If point in time recovery is enabled, <code>PointInTimeRecoveryStatus</code> will be set to ENABLED.
     * </p>
     * <p>
     * Once continuous backups and point in time recovery are enabled, you can restore to any point in time within
     * <code>EarliestRestorableDateTime</code> and <code>LatestRestorableDateTime</code>.
     * </p>
     * <p>
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. You can restore your table
     * to any point in time during the last 35 days..
     * </p>
     * 
     * @param updateContinuousBackupsRequest
     * @return A Java Future containing the result of the UpdateContinuousBackups operation returned by the service.
     * @sample AmazonDynamoDBAsync.UpdateContinuousBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateContinuousBackups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContinuousBackupsResult> updateContinuousBackupsAsync(UpdateContinuousBackupsRequest updateContinuousBackupsRequest);

    /**
     * <p>
     * <code>UpdateContinuousBackups</code> enables or disables point in time recovery for the specified table. A
     * successful <code>UpdateContinuousBackups</code> call returns the current
     * <code>ContinuousBackupsDescription</code>. Continuous backups are <code>ENABLED</code> on all tables at table
     * creation. If point in time recovery is enabled, <code>PointInTimeRecoveryStatus</code> will be set to ENABLED.
     * </p>
     * <p>
     * Once continuous backups and point in time recovery are enabled, you can restore to any point in time within
     * <code>EarliestRestorableDateTime</code> and <code>LatestRestorableDateTime</code>.
     * </p>
     * <p>
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. You can restore your table
     * to any point in time during the last 35 days..
     * </p>
     * 
     * @param updateContinuousBackupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateContinuousBackups operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.UpdateContinuousBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateContinuousBackups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateContinuousBackupsResult> updateContinuousBackupsAsync(UpdateContinuousBackupsRequest updateContinuousBackupsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateContinuousBackupsRequest, UpdateContinuousBackupsResult> asyncHandler);

    /**
     * <p>
     * Adds or removes replicas in the specified global table. The global table must already exist to be able to use
     * this operation. Any replica to be added must be empty, must have the same name as the global table, must have the
     * same key schema, and must have DynamoDB Streams enabled and must have same provisioned and maximum write capacity
     * units.
     * </p>
     * <note>
     * <p>
     * Although you can use <code>UpdateGlobalTable</code> to add replicas and remove replicas in a single request, for
     * simplicity we recommend that you issue separate requests for adding or removing replicas.
     * </p>
     * </note>
     * <p>
     * If global secondary indexes are specified, then the following conditions must also be met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The global secondary indexes must have the same name.
     * </p>
     * </li>
     * <li>
     * <p>
     * The global secondary indexes must have the same hash key and sort key (if present).
     * </p>
     * </li>
     * <li>
     * <p>
     * The global secondary indexes must have the same provisioned and maximum write capacity units.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateGlobalTableRequest
     * @return A Java Future containing the result of the UpdateGlobalTable operation returned by the service.
     * @sample AmazonDynamoDBAsync.UpdateGlobalTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateGlobalTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlobalTableResult> updateGlobalTableAsync(UpdateGlobalTableRequest updateGlobalTableRequest);

    /**
     * <p>
     * Adds or removes replicas in the specified global table. The global table must already exist to be able to use
     * this operation. Any replica to be added must be empty, must have the same name as the global table, must have the
     * same key schema, and must have DynamoDB Streams enabled and must have same provisioned and maximum write capacity
     * units.
     * </p>
     * <note>
     * <p>
     * Although you can use <code>UpdateGlobalTable</code> to add replicas and remove replicas in a single request, for
     * simplicity we recommend that you issue separate requests for adding or removing replicas.
     * </p>
     * </note>
     * <p>
     * If global secondary indexes are specified, then the following conditions must also be met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The global secondary indexes must have the same name.
     * </p>
     * </li>
     * <li>
     * <p>
     * The global secondary indexes must have the same hash key and sort key (if present).
     * </p>
     * </li>
     * <li>
     * <p>
     * The global secondary indexes must have the same provisioned and maximum write capacity units.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateGlobalTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGlobalTable operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.UpdateGlobalTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateGlobalTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlobalTableResult> updateGlobalTableAsync(UpdateGlobalTableRequest updateGlobalTableRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGlobalTableRequest, UpdateGlobalTableResult> asyncHandler);

    /**
     * <p>
     * Updates settings for a global table.
     * </p>
     * 
     * @param updateGlobalTableSettingsRequest
     * @return A Java Future containing the result of the UpdateGlobalTableSettings operation returned by the service.
     * @sample AmazonDynamoDBAsync.UpdateGlobalTableSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateGlobalTableSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlobalTableSettingsResult> updateGlobalTableSettingsAsync(
            UpdateGlobalTableSettingsRequest updateGlobalTableSettingsRequest);

    /**
     * <p>
     * Updates settings for a global table.
     * </p>
     * 
     * @param updateGlobalTableSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGlobalTableSettings operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.UpdateGlobalTableSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateGlobalTableSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlobalTableSettingsResult> updateGlobalTableSettingsAsync(
            UpdateGlobalTableSettingsRequest updateGlobalTableSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGlobalTableSettingsRequest, UpdateGlobalTableSettingsResult> asyncHandler);

    /**
     * <p>
     * Edits an existing item's attributes, or adds a new item to the table if it does not already exist. You can put,
     * delete, or add attribute values. You can also perform a conditional update on an existing item (insert a new
     * attribute name-value pair if it doesn't exist, or replace an existing name-value pair if it has certain expected
     * attribute values).
     * </p>
     * <p>
     * You can also return the item's attribute values in the same <code>UpdateItem</code> operation using the
     * <code>ReturnValues</code> parameter.
     * </p>
     * 
     * @param updateItemRequest
     *        Represents the input of an <code>UpdateItem</code> operation.
     * @return A Java Future containing the result of the UpdateItem operation returned by the service.
     * @sample AmazonDynamoDBAsync.UpdateItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateItemResult> updateItemAsync(UpdateItemRequest updateItemRequest);

    /**
     * <p>
     * Edits an existing item's attributes, or adds a new item to the table if it does not already exist. You can put,
     * delete, or add attribute values. You can also perform a conditional update on an existing item (insert a new
     * attribute name-value pair if it doesn't exist, or replace an existing name-value pair if it has certain expected
     * attribute values).
     * </p>
     * <p>
     * You can also return the item's attribute values in the same <code>UpdateItem</code> operation using the
     * <code>ReturnValues</code> parameter.
     * </p>
     * 
     * @param updateItemRequest
     *        Represents the input of an <code>UpdateItem</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateItem operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.UpdateItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateItemResult> updateItemAsync(UpdateItemRequest updateItemRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateItemRequest, UpdateItemResult> asyncHandler);

    /**
     * Simplified method form for invoking the UpdateItem operation.
     *
     * @see #updateItemAsync(UpdateItemRequest)
     */
    java.util.concurrent.Future<UpdateItemResult> updateItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates);

    /**
     * Simplified method form for invoking the UpdateItem operation with an AsyncHandler.
     *
     * @see #updateItemAsync(UpdateItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<UpdateItemResult> updateItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates, com.amazonaws.handlers.AsyncHandler<UpdateItemRequest, UpdateItemResult> asyncHandler);

    /**
     * Simplified method form for invoking the UpdateItem operation.
     *
     * @see #updateItemAsync(UpdateItemRequest)
     */
    java.util.concurrent.Future<UpdateItemResult> updateItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates, String returnValues);

    /**
     * Simplified method form for invoking the UpdateItem operation with an AsyncHandler.
     *
     * @see #updateItemAsync(UpdateItemRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<UpdateItemResult> updateItemAsync(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates, String returnValues,
            com.amazonaws.handlers.AsyncHandler<UpdateItemRequest, UpdateItemResult> asyncHandler);

    /**
     * <p>
     * Modifies the provisioned throughput settings, global secondary indexes, or DynamoDB Streams settings for a given
     * table.
     * </p>
     * <p>
     * You can only perform one of the following operations at once:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Modify the provisioned throughput settings of the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enable or disable Streams on the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Remove a global secondary index from the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a new global secondary index on the table. Once the index begins backfilling, you can use
     * <code>UpdateTable</code> to perform other operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>UpdateTable</code> is an asynchronous operation; while it is executing, the table status changes from
     * <code>ACTIVE</code> to <code>UPDATING</code>. While it is <code>UPDATING</code>, you cannot issue another
     * <code>UpdateTable</code> request. When the table returns to the <code>ACTIVE</code> state, the
     * <code>UpdateTable</code> operation is complete.
     * </p>
     * 
     * @param updateTableRequest
     *        Represents the input of an <code>UpdateTable</code> operation.
     * @return A Java Future containing the result of the UpdateTable operation returned by the service.
     * @sample AmazonDynamoDBAsync.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest updateTableRequest);

    /**
     * <p>
     * Modifies the provisioned throughput settings, global secondary indexes, or DynamoDB Streams settings for a given
     * table.
     * </p>
     * <p>
     * You can only perform one of the following operations at once:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Modify the provisioned throughput settings of the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enable or disable Streams on the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Remove a global secondary index from the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a new global secondary index on the table. Once the index begins backfilling, you can use
     * <code>UpdateTable</code> to perform other operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>UpdateTable</code> is an asynchronous operation; while it is executing, the table status changes from
     * <code>ACTIVE</code> to <code>UPDATING</code>. While it is <code>UPDATING</code>, you cannot issue another
     * <code>UpdateTable</code> request. When the table returns to the <code>ACTIVE</code> state, the
     * <code>UpdateTable</code> operation is complete.
     * </p>
     * 
     * @param updateTableRequest
     *        Represents the input of an <code>UpdateTable</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTable operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest updateTableRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler);

    /**
     * Simplified method form for invoking the UpdateTable operation.
     *
     * @see #updateTableAsync(UpdateTableRequest)
     */
    java.util.concurrent.Future<UpdateTableResult> updateTableAsync(String tableName, ProvisionedThroughput provisionedThroughput);

    /**
     * Simplified method form for invoking the UpdateTable operation with an AsyncHandler.
     *
     * @see #updateTableAsync(UpdateTableRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<UpdateTableResult> updateTableAsync(String tableName, ProvisionedThroughput provisionedThroughput,
            com.amazonaws.handlers.AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler);

    /**
     * <p>
     * The UpdateTimeToLive method will enable or disable TTL for the specified table. A successful
     * <code>UpdateTimeToLive</code> call returns the current <code>TimeToLiveSpecification</code>; it may take up to
     * one hour for the change to fully process. Any additional <code>UpdateTimeToLive</code> calls for the same table
     * during this one hour duration result in a <code>ValidationException</code>.
     * </p>
     * <p>
     * TTL compares the current time in epoch time format to the time stored in the TTL attribute of an item. If the
     * epoch time value stored in the attribute is less than the current time, the item is marked as expired and
     * subsequently deleted.
     * </p>
     * <note>
     * <p>
     * The epoch time format is the number of seconds elapsed since 12:00:00 AM January 1st, 1970 UTC.
     * </p>
     * </note>
     * <p>
     * DynamoDB deletes expired items on a best-effort basis to ensure availability of throughput for other data
     * operations.
     * </p>
     * <important>
     * <p>
     * DynamoDB typically deletes expired items within two days of expiration. The exact duration within which an item
     * gets deleted after expiration is specific to the nature of the workload. Items that have expired and not been
     * deleted will still show up in reads, queries, and scans.
     * </p>
     * </important>
     * <p>
     * As items are deleted, they are removed from any Local Secondary Index and Global Secondary Index immediately in
     * the same eventually consistent way as a standard delete operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/TTL.html">Time To Live</a> in the Amazon
     * DynamoDB Developer Guide.
     * </p>
     * 
     * @param updateTimeToLiveRequest
     *        Represents the input of an <code>UpdateTimeToLive</code> operation.
     * @return A Java Future containing the result of the UpdateTimeToLive operation returned by the service.
     * @sample AmazonDynamoDBAsync.UpdateTimeToLive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateTimeToLive" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTimeToLiveResult> updateTimeToLiveAsync(UpdateTimeToLiveRequest updateTimeToLiveRequest);

    /**
     * <p>
     * The UpdateTimeToLive method will enable or disable TTL for the specified table. A successful
     * <code>UpdateTimeToLive</code> call returns the current <code>TimeToLiveSpecification</code>; it may take up to
     * one hour for the change to fully process. Any additional <code>UpdateTimeToLive</code> calls for the same table
     * during this one hour duration result in a <code>ValidationException</code>.
     * </p>
     * <p>
     * TTL compares the current time in epoch time format to the time stored in the TTL attribute of an item. If the
     * epoch time value stored in the attribute is less than the current time, the item is marked as expired and
     * subsequently deleted.
     * </p>
     * <note>
     * <p>
     * The epoch time format is the number of seconds elapsed since 12:00:00 AM January 1st, 1970 UTC.
     * </p>
     * </note>
     * <p>
     * DynamoDB deletes expired items on a best-effort basis to ensure availability of throughput for other data
     * operations.
     * </p>
     * <important>
     * <p>
     * DynamoDB typically deletes expired items within two days of expiration. The exact duration within which an item
     * gets deleted after expiration is specific to the nature of the workload. Items that have expired and not been
     * deleted will still show up in reads, queries, and scans.
     * </p>
     * </important>
     * <p>
     * As items are deleted, they are removed from any Local Secondary Index and Global Secondary Index immediately in
     * the same eventually consistent way as a standard delete operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/TTL.html">Time To Live</a> in the Amazon
     * DynamoDB Developer Guide.
     * </p>
     * 
     * @param updateTimeToLiveRequest
     *        Represents the input of an <code>UpdateTimeToLive</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTimeToLive operation returned by the service.
     * @sample AmazonDynamoDBAsyncHandler.UpdateTimeToLive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateTimeToLive" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTimeToLiveResult> updateTimeToLiveAsync(UpdateTimeToLiveRequest updateTimeToLiveRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTimeToLiveRequest, UpdateTimeToLiveResult> asyncHandler);

}
