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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.services.dynamodbv2.waiters.AmazonDynamoDBWaiters;

/**
 * Interface for accessing DynamoDB.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.dynamodbv2.AbstractAmazonDynamoDB} instead.
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
public interface AmazonDynamoDB {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "dynamodb";

    /**
     * Overrides the default endpoint for this client ("https://dynamodb.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "dynamodb.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://dynamodb.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "dynamodb.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://dynamodb.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonDynamoDB#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
     * @return Result of the BatchGetItem operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws RequestLimitExceededException
     *         Throughput exceeds the current throughput limit for your account. Please contact AWS Support at <a
     *         href="https://docs.aws.amazon.com/https:/aws.amazon.com/support">AWS Support</a> to request a limit
     *         increase.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.BatchGetItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchGetItem" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetItemResult batchGetItem(BatchGetItemRequest batchGetItemRequest);

    /**
     * Simplified method form for invoking the BatchGetItem operation.
     *
     * @see #batchGetItem(BatchGetItemRequest)
     */
    BatchGetItemResult batchGetItem(java.util.Map<String, KeysAndAttributes> requestItems, String returnConsumedCapacity);

    /**
     * Simplified method form for invoking the BatchGetItem operation.
     *
     * @see #batchGetItem(BatchGetItemRequest)
     */
    BatchGetItemResult batchGetItem(java.util.Map<String, KeysAndAttributes> requestItems);

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
     * @return Result of the BatchWriteItem operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws ItemCollectionSizeLimitExceededException
     *         An item collection is too large. This exception is only returned for tables that have one or more local
     *         secondary indexes.
     * @throws RequestLimitExceededException
     *         Throughput exceeds the current throughput limit for your account. Please contact AWS Support at <a
     *         href="https://docs.aws.amazon.com/https:/aws.amazon.com/support">AWS Support</a> to request a limit
     *         increase.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.BatchWriteItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchWriteItem" target="_top">AWS API
     *      Documentation</a>
     */
    BatchWriteItemResult batchWriteItem(BatchWriteItemRequest batchWriteItemRequest);

    /**
     * Simplified method form for invoking the BatchWriteItem operation.
     *
     * @see #batchWriteItem(BatchWriteItemRequest)
     */
    BatchWriteItemResult batchWriteItem(java.util.Map<String, java.util.List<WriteRequest>> requestItems);

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
     * @return Result of the CreateBackup operation returned by the service.
     * @throws TableNotFoundException
     *         A source table with the name <code>TableName</code> does not currently exist within the subscriber's
     *         account.
     * @throws TableInUseException
     *         A target table with the specified name is either being created or deleted.
     * @throws ContinuousBackupsUnavailableException
     *         Backups have not yet been enabled for this table.
     * @throws BackupInUseException
     *         There is another ongoing conflicting backup control plane operation on the table. The backup is either
     *         being created, deleted or restored to a table.
     * @throws LimitExceededException
     *         There is no limit to the number of daily on-demand backups that can be taken. </p>
     *         <p>
     *         Up to 50 simultaneous table operations are allowed per account. These operations include
     *         <code>CreateTable</code>, <code>UpdateTable</code>, <code>DeleteTable</code>,
     *         <code>UpdateTimeToLive</code>, <code>RestoreTableFromBackup</code>, and
     *         <code>RestoreTableToPointInTime</code>.
     *         </p>
     *         <p>
     *         The only exception is when you are creating a table with one or more secondary indexes. You can have up
     *         to 25 such requests running at a time; however, if the table or index specifications are complex,
     *         DynamoDB might temporarily reduce the number of concurrent operations.
     *         </p>
     *         <p>
     *         There is a soft account limit of 256 tables.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBackupResult createBackup(CreateBackupRequest createBackupRequest);

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
     * @return Result of the CreateGlobalTable operation returned by the service.
     * @throws LimitExceededException
     *         There is no limit to the number of daily on-demand backups that can be taken. </p>
     *         <p>
     *         Up to 50 simultaneous table operations are allowed per account. These operations include
     *         <code>CreateTable</code>, <code>UpdateTable</code>, <code>DeleteTable</code>,
     *         <code>UpdateTimeToLive</code>, <code>RestoreTableFromBackup</code>, and
     *         <code>RestoreTableToPointInTime</code>.
     *         </p>
     *         <p>
     *         The only exception is when you are creating a table with one or more secondary indexes. You can have up
     *         to 25 such requests running at a time; however, if the table or index specifications are complex,
     *         DynamoDB might temporarily reduce the number of concurrent operations.
     *         </p>
     *         <p>
     *         There is a soft account limit of 256 tables.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws GlobalTableAlreadyExistsException
     *         The specified global table already exists.
     * @throws TableNotFoundException
     *         A source table with the name <code>TableName</code> does not currently exist within the subscriber's
     *         account.
     * @sample AmazonDynamoDB.CreateGlobalTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CreateGlobalTable" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGlobalTableResult createGlobalTable(CreateGlobalTableRequest createGlobalTableRequest);

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
     * @return Result of the CreateTable operation returned by the service.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to recreate an
     *         existing table, or tried to delete a table currently in the <code>CREATING</code> state.
     * @throws LimitExceededException
     *         There is no limit to the number of daily on-demand backups that can be taken. </p>
     *         <p>
     *         Up to 50 simultaneous table operations are allowed per account. These operations include
     *         <code>CreateTable</code>, <code>UpdateTable</code>, <code>DeleteTable</code>,
     *         <code>UpdateTimeToLive</code>, <code>RestoreTableFromBackup</code>, and
     *         <code>RestoreTableToPointInTime</code>.
     *         </p>
     *         <p>
     *         The only exception is when you are creating a table with one or more secondary indexes. You can have up
     *         to 25 such requests running at a time; however, if the table or index specifications are complex,
     *         DynamoDB might temporarily reduce the number of concurrent operations.
     *         </p>
     *         <p>
     *         There is a soft account limit of 256 tables.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CreateTable" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTableResult createTable(CreateTableRequest createTableRequest);

    /**
     * Simplified method form for invoking the CreateTable operation.
     *
     * @see #createTable(CreateTableRequest)
     */
    CreateTableResult createTable(java.util.List<AttributeDefinition> attributeDefinitions, String tableName, java.util.List<KeySchemaElement> keySchema,
            ProvisionedThroughput provisionedThroughput);

    /**
     * <p>
     * Deletes an existing backup of a table.
     * </p>
     * <p>
     * You can call <code>DeleteBackup</code> at a maximum rate of 10 times per second.
     * </p>
     * 
     * @param deleteBackupRequest
     * @return Result of the DeleteBackup operation returned by the service.
     * @throws BackupNotFoundException
     *         Backup not found for the given BackupARN.
     * @throws BackupInUseException
     *         There is another ongoing conflicting backup control plane operation on the table. The backup is either
     *         being created, deleted or restored to a table.
     * @throws LimitExceededException
     *         There is no limit to the number of daily on-demand backups that can be taken. </p>
     *         <p>
     *         Up to 50 simultaneous table operations are allowed per account. These operations include
     *         <code>CreateTable</code>, <code>UpdateTable</code>, <code>DeleteTable</code>,
     *         <code>UpdateTimeToLive</code>, <code>RestoreTableFromBackup</code>, and
     *         <code>RestoreTableToPointInTime</code>.
     *         </p>
     *         <p>
     *         The only exception is when you are creating a table with one or more secondary indexes. You can have up
     *         to 25 such requests running at a time; however, if the table or index specifications are complex,
     *         DynamoDB might temporarily reduce the number of concurrent operations.
     *         </p>
     *         <p>
     *         There is a soft account limit of 256 tables.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBackupResult deleteBackup(DeleteBackupRequest deleteBackupRequest);

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
     * @return Result of the DeleteItem operation returned by the service.
     * @throws ConditionalCheckFailedException
     *         A condition specified in the operation could not be evaluated.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws ItemCollectionSizeLimitExceededException
     *         An item collection is too large. This exception is only returned for tables that have one or more local
     *         secondary indexes.
     * @throws TransactionConflictException
     *         Operation was rejected because there is an ongoing transaction for the item.
     * @throws RequestLimitExceededException
     *         Throughput exceeds the current throughput limit for your account. Please contact AWS Support at <a
     *         href="https://docs.aws.amazon.com/https:/aws.amazon.com/support">AWS Support</a> to request a limit
     *         increase.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DeleteItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteItem" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteItemResult deleteItem(DeleteItemRequest deleteItemRequest);

    /**
     * Simplified method form for invoking the DeleteItem operation.
     *
     * @see #deleteItem(DeleteItemRequest)
     */
    DeleteItemResult deleteItem(String tableName, java.util.Map<String, AttributeValue> key);

    /**
     * Simplified method form for invoking the DeleteItem operation.
     *
     * @see #deleteItem(DeleteItemRequest)
     */
    DeleteItemResult deleteItem(String tableName, java.util.Map<String, AttributeValue> key, String returnValues);

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
     * @return Result of the DeleteTable operation returned by the service.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to recreate an
     *         existing table, or tried to delete a table currently in the <code>CREATING</code> state.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws LimitExceededException
     *         There is no limit to the number of daily on-demand backups that can be taken. </p>
     *         <p>
     *         Up to 50 simultaneous table operations are allowed per account. These operations include
     *         <code>CreateTable</code>, <code>UpdateTable</code>, <code>DeleteTable</code>,
     *         <code>UpdateTimeToLive</code>, <code>RestoreTableFromBackup</code>, and
     *         <code>RestoreTableToPointInTime</code>.
     *         </p>
     *         <p>
     *         The only exception is when you are creating a table with one or more secondary indexes. You can have up
     *         to 25 such requests running at a time; however, if the table or index specifications are complex,
     *         DynamoDB might temporarily reduce the number of concurrent operations.
     *         </p>
     *         <p>
     *         There is a soft account limit of 256 tables.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTableResult deleteTable(DeleteTableRequest deleteTableRequest);

    /**
     * Simplified method form for invoking the DeleteTable operation.
     *
     * @see #deleteTable(DeleteTableRequest)
     */
    DeleteTableResult deleteTable(String tableName);

    /**
     * <p>
     * Describes an existing backup of a table.
     * </p>
     * <p>
     * You can call <code>DescribeBackup</code> at a maximum rate of 10 times per second.
     * </p>
     * 
     * @param describeBackupRequest
     * @return Result of the DescribeBackup operation returned by the service.
     * @throws BackupNotFoundException
     *         Backup not found for the given BackupARN.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DescribeBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeBackup" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBackupResult describeBackup(DescribeBackupRequest describeBackupRequest);

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
     * @return Result of the DescribeContinuousBackups operation returned by the service.
     * @throws TableNotFoundException
     *         A source table with the name <code>TableName</code> does not currently exist within the subscriber's
     *         account.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DescribeContinuousBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeContinuousBackups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeContinuousBackupsResult describeContinuousBackups(DescribeContinuousBackupsRequest describeContinuousBackupsRequest);

    /**
     * <p>
     * Returns the regional endpoint information.
     * </p>
     * 
     * @param describeEndpointsRequest
     * @return Result of the DescribeEndpoints operation returned by the service.
     * @sample AmazonDynamoDB.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest describeEndpointsRequest);

    /**
     * <p>
     * Returns information about the specified global table.
     * </p>
     * 
     * @param describeGlobalTableRequest
     * @return Result of the DescribeGlobalTable operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws GlobalTableNotFoundException
     *         The specified global table does not exist.
     * @sample AmazonDynamoDB.DescribeGlobalTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeGlobalTable" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeGlobalTableResult describeGlobalTable(DescribeGlobalTableRequest describeGlobalTableRequest);

    /**
     * <p>
     * Describes region specific settings for a global table.
     * </p>
     * 
     * @param describeGlobalTableSettingsRequest
     * @return Result of the DescribeGlobalTableSettings operation returned by the service.
     * @throws GlobalTableNotFoundException
     *         The specified global table does not exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DescribeGlobalTableSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeGlobalTableSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeGlobalTableSettingsResult describeGlobalTableSettings(DescribeGlobalTableSettingsRequest describeGlobalTableSettingsRequest);

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
     * @return Result of the DescribeLimits operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DescribeLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeLimits" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeLimitsResult describeLimits(DescribeLimitsRequest describeLimitsRequest);

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
     * @return Result of the DescribeTable operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DescribeTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeTable" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeTableResult describeTable(DescribeTableRequest describeTableRequest);

    /**
     * Simplified method form for invoking the DescribeTable operation.
     *
     * @see #describeTable(DescribeTableRequest)
     */
    DescribeTableResult describeTable(String tableName);

    /**
     * <p>
     * Gives a description of the Time to Live (TTL) status on the specified table.
     * </p>
     * 
     * @param describeTimeToLiveRequest
     * @return Result of the DescribeTimeToLive operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DescribeTimeToLive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeTimeToLive" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeTimeToLiveResult describeTimeToLive(DescribeTimeToLiveRequest describeTimeToLiveRequest);

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
     * @return Result of the GetItem operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws RequestLimitExceededException
     *         Throughput exceeds the current throughput limit for your account. Please contact AWS Support at <a
     *         href="https://docs.aws.amazon.com/https:/aws.amazon.com/support">AWS Support</a> to request a limit
     *         increase.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.GetItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/GetItem" target="_top">AWS API
     *      Documentation</a>
     */
    GetItemResult getItem(GetItemRequest getItemRequest);

    /**
     * Simplified method form for invoking the GetItem operation.
     *
     * @see #getItem(GetItemRequest)
     */
    GetItemResult getItem(String tableName, java.util.Map<String, AttributeValue> key);

    /**
     * Simplified method form for invoking the GetItem operation.
     *
     * @see #getItem(GetItemRequest)
     */
    GetItemResult getItem(String tableName, java.util.Map<String, AttributeValue> key, Boolean consistentRead);

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
     * @return Result of the ListBackups operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.ListBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListBackups" target="_top">AWS API
     *      Documentation</a>
     */
    ListBackupsResult listBackups(ListBackupsRequest listBackupsRequest);

    /**
     * <p>
     * Lists all global tables that have a replica in the specified region.
     * </p>
     * 
     * @param listGlobalTablesRequest
     * @return Result of the ListGlobalTables operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.ListGlobalTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListGlobalTables" target="_top">AWS API
     *      Documentation</a>
     */
    ListGlobalTablesResult listGlobalTables(ListGlobalTablesRequest listGlobalTablesRequest);

    /**
     * <p>
     * Returns an array of table names associated with the current account and endpoint. The output from
     * <code>ListTables</code> is paginated, with each page returning a maximum of 100 table names.
     * </p>
     * 
     * @param listTablesRequest
     *        Represents the input of a <code>ListTables</code> operation.
     * @return Result of the ListTables operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListTables" target="_top">AWS API
     *      Documentation</a>
     */
    ListTablesResult listTables(ListTablesRequest listTablesRequest);

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTables(ListTablesRequest)
     */
    ListTablesResult listTables();

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTables(ListTablesRequest)
     */
    ListTablesResult listTables(String exclusiveStartTableName);

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTables(ListTablesRequest)
     */
    ListTablesResult listTables(String exclusiveStartTableName, Integer limit);

    /**
     * Simplified method form for invoking the ListTables operation.
     *
     * @see #listTables(ListTablesRequest)
     */
    ListTablesResult listTables(Integer limit);

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
     * @return Result of the ListTagsOfResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.ListTagsOfResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListTagsOfResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsOfResourceResult listTagsOfResource(ListTagsOfResourceRequest listTagsOfResourceRequest);

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
     * @return Result of the PutItem operation returned by the service.
     * @throws ConditionalCheckFailedException
     *         A condition specified in the operation could not be evaluated.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws ItemCollectionSizeLimitExceededException
     *         An item collection is too large. This exception is only returned for tables that have one or more local
     *         secondary indexes.
     * @throws TransactionConflictException
     *         Operation was rejected because there is an ongoing transaction for the item.
     * @throws RequestLimitExceededException
     *         Throughput exceeds the current throughput limit for your account. Please contact AWS Support at <a
     *         href="https://docs.aws.amazon.com/https:/aws.amazon.com/support">AWS Support</a> to request a limit
     *         increase.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.PutItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/PutItem" target="_top">AWS API
     *      Documentation</a>
     */
    PutItemResult putItem(PutItemRequest putItemRequest);

    /**
     * Simplified method form for invoking the PutItem operation.
     *
     * @see #putItem(PutItemRequest)
     */
    PutItemResult putItem(String tableName, java.util.Map<String, AttributeValue> item);

    /**
     * Simplified method form for invoking the PutItem operation.
     *
     * @see #putItem(PutItemRequest)
     */
    PutItemResult putItem(String tableName, java.util.Map<String, AttributeValue> item, String returnValues);

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
     * @return Result of the Query operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws RequestLimitExceededException
     *         Throughput exceeds the current throughput limit for your account. Please contact AWS Support at <a
     *         href="https://docs.aws.amazon.com/https:/aws.amazon.com/support">AWS Support</a> to request a limit
     *         increase.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.Query
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Query" target="_top">AWS API
     *      Documentation</a>
     */
    QueryResult query(QueryRequest queryRequest);

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
     * @return Result of the RestoreTableFromBackup operation returned by the service.
     * @throws TableAlreadyExistsException
     *         A target table with the specified name already exists.
     * @throws TableInUseException
     *         A target table with the specified name is either being created or deleted.
     * @throws BackupNotFoundException
     *         Backup not found for the given BackupARN.
     * @throws BackupInUseException
     *         There is another ongoing conflicting backup control plane operation on the table. The backup is either
     *         being created, deleted or restored to a table.
     * @throws LimitExceededException
     *         There is no limit to the number of daily on-demand backups that can be taken. </p>
     *         <p>
     *         Up to 50 simultaneous table operations are allowed per account. These operations include
     *         <code>CreateTable</code>, <code>UpdateTable</code>, <code>DeleteTable</code>,
     *         <code>UpdateTimeToLive</code>, <code>RestoreTableFromBackup</code>, and
     *         <code>RestoreTableToPointInTime</code>.
     *         </p>
     *         <p>
     *         The only exception is when you are creating a table with one or more secondary indexes. You can have up
     *         to 25 such requests running at a time; however, if the table or index specifications are complex,
     *         DynamoDB might temporarily reduce the number of concurrent operations.
     *         </p>
     *         <p>
     *         There is a soft account limit of 256 tables.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.RestoreTableFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/RestoreTableFromBackup"
     *      target="_top">AWS API Documentation</a>
     */
    RestoreTableFromBackupResult restoreTableFromBackup(RestoreTableFromBackupRequest restoreTableFromBackupRequest);

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
     * @return Result of the RestoreTableToPointInTime operation returned by the service.
     * @throws TableAlreadyExistsException
     *         A target table with the specified name already exists.
     * @throws TableNotFoundException
     *         A source table with the name <code>TableName</code> does not currently exist within the subscriber's
     *         account.
     * @throws TableInUseException
     *         A target table with the specified name is either being created or deleted.
     * @throws LimitExceededException
     *         There is no limit to the number of daily on-demand backups that can be taken. </p>
     *         <p>
     *         Up to 50 simultaneous table operations are allowed per account. These operations include
     *         <code>CreateTable</code>, <code>UpdateTable</code>, <code>DeleteTable</code>,
     *         <code>UpdateTimeToLive</code>, <code>RestoreTableFromBackup</code>, and
     *         <code>RestoreTableToPointInTime</code>.
     *         </p>
     *         <p>
     *         The only exception is when you are creating a table with one or more secondary indexes. You can have up
     *         to 25 such requests running at a time; however, if the table or index specifications are complex,
     *         DynamoDB might temporarily reduce the number of concurrent operations.
     *         </p>
     *         <p>
     *         There is a soft account limit of 256 tables.
     * @throws InvalidRestoreTimeException
     *         An invalid restore time was specified. RestoreDateTime must be between EarliestRestorableDateTime and
     *         LatestRestorableDateTime.
     * @throws PointInTimeRecoveryUnavailableException
     *         Point in time recovery has not yet been enabled for this source table.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.RestoreTableToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/RestoreTableToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    RestoreTableToPointInTimeResult restoreTableToPointInTime(RestoreTableToPointInTimeRequest restoreTableToPointInTimeRequest);

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
     * @return Result of the Scan operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws RequestLimitExceededException
     *         Throughput exceeds the current throughput limit for your account. Please contact AWS Support at <a
     *         href="https://docs.aws.amazon.com/https:/aws.amazon.com/support">AWS Support</a> to request a limit
     *         increase.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.Scan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Scan" target="_top">AWS API
     *      Documentation</a>
     */
    ScanResult scan(ScanRequest scanRequest);

    /**
     * Simplified method form for invoking the Scan operation.
     *
     * @see #scan(ScanRequest)
     */
    ScanResult scan(String tableName, java.util.List<String> attributesToGet);

    /**
     * Simplified method form for invoking the Scan operation.
     *
     * @see #scan(ScanRequest)
     */
    ScanResult scan(String tableName, java.util.Map<String, Condition> scanFilter);

    /**
     * Simplified method form for invoking the Scan operation.
     *
     * @see #scan(ScanRequest)
     */
    ScanResult scan(String tableName, java.util.List<String> attributesToGet, java.util.Map<String, Condition> scanFilter);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws LimitExceededException
     *         There is no limit to the number of daily on-demand backups that can be taken. </p>
     *         <p>
     *         Up to 50 simultaneous table operations are allowed per account. These operations include
     *         <code>CreateTable</code>, <code>UpdateTable</code>, <code>DeleteTable</code>,
     *         <code>UpdateTimeToLive</code>, <code>RestoreTableFromBackup</code>, and
     *         <code>RestoreTableToPointInTime</code>.
     *         </p>
     *         <p>
     *         The only exception is when you are creating a table with one or more secondary indexes. You can have up
     *         to 25 such requests running at a time; however, if the table or index specifications are complex,
     *         DynamoDB might temporarily reduce the number of concurrent operations.
     *         </p>
     *         <p>
     *         There is a soft account limit of 256 tables.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to recreate an
     *         existing table, or tried to delete a table currently in the <code>CREATING</code> state.
     * @sample AmazonDynamoDB.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
     * @return Result of the TransactGetItems operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws TransactionCanceledException
     *         The entire transaction request was rejected.</p>
     *         <p>
     *         DynamoDB rejects a <code>TransactWriteItems</code> request under the following circumstances:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A condition in one of the condition expressions is not met.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A table in the <code>TransactWriteItems</code> request is in a different account or region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         More than one action in the <code>TransactWriteItems</code> operation targets the same item.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is insufficient provisioned capacity for the transaction to be completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An item size becomes too large (larger than 400 KB), or a local secondary index (LSI) becomes too large,
     *         or a similar validation error occurs because of changes made by the transaction.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is a user error, such as an invalid data format.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         DynamoDB rejects a <code>TransactGetItems</code> request under the following circumstances:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         There is an ongoing <code>TransactGetItems</code> operation that conflicts with a concurrent
     *         <code>PutItem</code>, <code>UpdateItem</code>, <code>DeleteItem</code> or <code>TransactWriteItems</code>
     *         request. In this case the <code>TransactGetItems</code> operation fails with a
     *         <code>TransactionCanceledException</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A table in the <code>TransactGetItems</code> request is in a different account or region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is insufficient provisioned capacity for the transaction to be completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is a user error, such as an invalid data format.
     *         </p>
     *         </li>
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.TransactGetItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TransactGetItems" target="_top">AWS API
     *      Documentation</a>
     */
    TransactGetItemsResult transactGetItems(TransactGetItemsRequest transactGetItemsRequest);

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
     * @return Result of the TransactWriteItems operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws TransactionCanceledException
     *         The entire transaction request was rejected.</p>
     *         <p>
     *         DynamoDB rejects a <code>TransactWriteItems</code> request under the following circumstances:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A condition in one of the condition expressions is not met.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A table in the <code>TransactWriteItems</code> request is in a different account or region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         More than one action in the <code>TransactWriteItems</code> operation targets the same item.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is insufficient provisioned capacity for the transaction to be completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An item size becomes too large (larger than 400 KB), or a local secondary index (LSI) becomes too large,
     *         or a similar validation error occurs because of changes made by the transaction.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is a user error, such as an invalid data format.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         DynamoDB rejects a <code>TransactGetItems</code> request under the following circumstances:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         There is an ongoing <code>TransactGetItems</code> operation that conflicts with a concurrent
     *         <code>PutItem</code>, <code>UpdateItem</code>, <code>DeleteItem</code> or <code>TransactWriteItems</code>
     *         request. In this case the <code>TransactGetItems</code> operation fails with a
     *         <code>TransactionCanceledException</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A table in the <code>TransactGetItems</code> request is in a different account or region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is insufficient provisioned capacity for the transaction to be completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is a user error, such as an invalid data format.
     *         </p>
     *         </li>
     * @throws TransactionInProgressException
     *         The transaction with the given request token is already in progress.
     * @throws IdempotentParameterMismatchException
     *         DynamoDB rejected the request because you retried a request with a different payload but with an
     *         idempotent token that was already used.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.TransactWriteItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TransactWriteItems" target="_top">AWS
     *      API Documentation</a>
     */
    TransactWriteItemsResult transactWriteItems(TransactWriteItemsRequest transactWriteItemsRequest);

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
     * @return Result of the UntagResource operation returned by the service.
     * @throws LimitExceededException
     *         There is no limit to the number of daily on-demand backups that can be taken. </p>
     *         <p>
     *         Up to 50 simultaneous table operations are allowed per account. These operations include
     *         <code>CreateTable</code>, <code>UpdateTable</code>, <code>DeleteTable</code>,
     *         <code>UpdateTimeToLive</code>, <code>RestoreTableFromBackup</code>, and
     *         <code>RestoreTableToPointInTime</code>.
     *         </p>
     *         <p>
     *         The only exception is when you are creating a table with one or more secondary indexes. You can have up
     *         to 25 such requests running at a time; however, if the table or index specifications are complex,
     *         DynamoDB might temporarily reduce the number of concurrent operations.
     *         </p>
     *         <p>
     *         There is a soft account limit of 256 tables.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to recreate an
     *         existing table, or tried to delete a table currently in the <code>CREATING</code> state.
     * @sample AmazonDynamoDB.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
     * @return Result of the UpdateContinuousBackups operation returned by the service.
     * @throws TableNotFoundException
     *         A source table with the name <code>TableName</code> does not currently exist within the subscriber's
     *         account.
     * @throws ContinuousBackupsUnavailableException
     *         Backups have not yet been enabled for this table.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.UpdateContinuousBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateContinuousBackups"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateContinuousBackupsResult updateContinuousBackups(UpdateContinuousBackupsRequest updateContinuousBackupsRequest);

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
     * @return Result of the UpdateGlobalTable operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws GlobalTableNotFoundException
     *         The specified global table does not exist.
     * @throws ReplicaAlreadyExistsException
     *         The specified replica is already part of the global table.
     * @throws ReplicaNotFoundException
     *         The specified replica is no longer part of the global table.
     * @throws TableNotFoundException
     *         A source table with the name <code>TableName</code> does not currently exist within the subscriber's
     *         account.
     * @sample AmazonDynamoDB.UpdateGlobalTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateGlobalTable" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGlobalTableResult updateGlobalTable(UpdateGlobalTableRequest updateGlobalTableRequest);

    /**
     * <p>
     * Updates settings for a global table.
     * </p>
     * 
     * @param updateGlobalTableSettingsRequest
     * @return Result of the UpdateGlobalTableSettings operation returned by the service.
     * @throws GlobalTableNotFoundException
     *         The specified global table does not exist.
     * @throws ReplicaNotFoundException
     *         The specified replica is no longer part of the global table.
     * @throws IndexNotFoundException
     *         The operation tried to access a nonexistent index.
     * @throws LimitExceededException
     *         There is no limit to the number of daily on-demand backups that can be taken. </p>
     *         <p>
     *         Up to 50 simultaneous table operations are allowed per account. These operations include
     *         <code>CreateTable</code>, <code>UpdateTable</code>, <code>DeleteTable</code>,
     *         <code>UpdateTimeToLive</code>, <code>RestoreTableFromBackup</code>, and
     *         <code>RestoreTableToPointInTime</code>.
     *         </p>
     *         <p>
     *         The only exception is when you are creating a table with one or more secondary indexes. You can have up
     *         to 25 such requests running at a time; however, if the table or index specifications are complex,
     *         DynamoDB might temporarily reduce the number of concurrent operations.
     *         </p>
     *         <p>
     *         There is a soft account limit of 256 tables.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to recreate an
     *         existing table, or tried to delete a table currently in the <code>CREATING</code> state.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.UpdateGlobalTableSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateGlobalTableSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGlobalTableSettingsResult updateGlobalTableSettings(UpdateGlobalTableSettingsRequest updateGlobalTableSettingsRequest);

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
     * @return Result of the UpdateItem operation returned by the service.
     * @throws ConditionalCheckFailedException
     *         A condition specified in the operation could not be evaluated.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws ItemCollectionSizeLimitExceededException
     *         An item collection is too large. This exception is only returned for tables that have one or more local
     *         secondary indexes.
     * @throws TransactionConflictException
     *         Operation was rejected because there is an ongoing transaction for the item.
     * @throws RequestLimitExceededException
     *         Throughput exceeds the current throughput limit for your account. Please contact AWS Support at <a
     *         href="https://docs.aws.amazon.com/https:/aws.amazon.com/support">AWS Support</a> to request a limit
     *         increase.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.UpdateItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateItem" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateItemResult updateItem(UpdateItemRequest updateItemRequest);

    /**
     * Simplified method form for invoking the UpdateItem operation.
     *
     * @see #updateItem(UpdateItemRequest)
     */
    UpdateItemResult updateItem(String tableName, java.util.Map<String, AttributeValue> key, java.util.Map<String, AttributeValueUpdate> attributeUpdates);

    /**
     * Simplified method form for invoking the UpdateItem operation.
     *
     * @see #updateItem(UpdateItemRequest)
     */
    UpdateItemResult updateItem(String tableName, java.util.Map<String, AttributeValue> key, java.util.Map<String, AttributeValueUpdate> attributeUpdates,
            String returnValues);

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
     * @return Result of the UpdateTable operation returned by the service.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to recreate an
     *         existing table, or tried to delete a table currently in the <code>CREATING</code> state.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws LimitExceededException
     *         There is no limit to the number of daily on-demand backups that can be taken. </p>
     *         <p>
     *         Up to 50 simultaneous table operations are allowed per account. These operations include
     *         <code>CreateTable</code>, <code>UpdateTable</code>, <code>DeleteTable</code>,
     *         <code>UpdateTimeToLive</code>, <code>RestoreTableFromBackup</code>, and
     *         <code>RestoreTableToPointInTime</code>.
     *         </p>
     *         <p>
     *         The only exception is when you are creating a table with one or more secondary indexes. You can have up
     *         to 25 such requests running at a time; however, if the table or index specifications are complex,
     *         DynamoDB might temporarily reduce the number of concurrent operations.
     *         </p>
     *         <p>
     *         There is a soft account limit of 256 tables.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateTable" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTableResult updateTable(UpdateTableRequest updateTableRequest);

    /**
     * Simplified method form for invoking the UpdateTable operation.
     *
     * @see #updateTable(UpdateTableRequest)
     */
    UpdateTableResult updateTable(String tableName, ProvisionedThroughput provisionedThroughput);

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
     * @return Result of the UpdateTimeToLive operation returned by the service.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to recreate an
     *         existing table, or tried to delete a table currently in the <code>CREATING</code> state.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws LimitExceededException
     *         There is no limit to the number of daily on-demand backups that can be taken. </p>
     *         <p>
     *         Up to 50 simultaneous table operations are allowed per account. These operations include
     *         <code>CreateTable</code>, <code>UpdateTable</code>, <code>DeleteTable</code>,
     *         <code>UpdateTimeToLive</code>, <code>RestoreTableFromBackup</code>, and
     *         <code>RestoreTableToPointInTime</code>.
     *         </p>
     *         <p>
     *         The only exception is when you are creating a table with one or more secondary indexes. You can have up
     *         to 25 such requests running at a time; however, if the table or index specifications are complex,
     *         DynamoDB might temporarily reduce the number of concurrent operations.
     *         </p>
     *         <p>
     *         There is a soft account limit of 256 tables.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.UpdateTimeToLive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateTimeToLive" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTimeToLiveResult updateTimeToLive(UpdateTimeToLiveRequest updateTimeToLiveRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonDynamoDBWaiters waiters();

}
