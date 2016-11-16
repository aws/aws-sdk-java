/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This is the Amazon DynamoDB API Reference. This guide provides descriptions of the low-level DynamoDB API.
 * </p>
 * <p>
 * This guide is intended for use with the following DynamoDB documentation:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/gettingstartedguide/">Amazon DynamoDB Getting Started
 * Guide</a> - provides hands-on exercises that help you learn the basics of working with DynamoDB. <i>If you are new to
 * DynamoDB, we recommend that you begin with the Getting Started Guide.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/">Amazon DynamoDB Developer Guide</a> -
 * contains detailed information about DynamoDB concepts, usage, and best practices.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/dynamodbstreams/latest/APIReference/">Amazon DynamoDB Streams API Reference</a> -
 * provides descriptions and samples of the DynamoDB Streams API. (For more information, see <a
 * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.html">Capturing Table Activity with
 * DynamoDB Streams</a> in the Amazon DynamoDB Developer Guide.)
 * </p>
 * </li>
 * </ul>
 * <p>
 * Instead of making the requests to the low-level DynamoDB API directly from your application, we recommend that you
 * use the AWS Software Development Kits (SDKs). The easy-to-use libraries in the AWS SDKs make it unnecessary to call
 * the low-level DynamoDB API directly from your application. The libraries take care of request authentication,
 * serialization, and connection management. For more information, see <a
 * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/UsingAWSSDK.html">Using the AWS SDKs with
 * DynamoDB</a> in the Amazon DynamoDB Developer Guide.
 * </p>
 * <p>
 * If you decide to code against the low-level DynamoDB API directly, you will need to write the necessary code to
 * authenticate your requests. For more information on signing your requests, see <a
 * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/API.html">Using the DynamoDB API</a> in the
 * <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * <p>
 * The following are short descriptions of each low-level API action, organized by function.
 * </p>
 * <p>
 * <b>Managing Tables</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>CreateTable</i> - Creates a table with user-specified provisioned throughput settings. You must define a primary
 * key for the table - either a simple primary key (partition key), or a composite primary key (partition key and sort
 * key). Optionally, you can create one or more secondary indexes, which provide fast data access using non-key
 * attributes.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DescribeTable</i> - Returns metadata for a table, such as table size, status, and index information.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>UpdateTable</i> - Modifies the provisioned throughput settings for a table. Optionally, you can modify the
 * provisioned throughput settings for global secondary indexes on the table.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>ListTables</i> - Returns a list of all tables associated with the current AWS account and endpoint.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DeleteTable</i> - Deletes a table and all of its indexes.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For conceptual information about managing tables, see <a
 * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html">Working with Tables</a>
 * in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * <p>
 * <b>Reading Data</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>GetItem</i> - Returns a set of attributes for the item that has a given primary key. By default, <i>GetItem</i>
 * performs an eventually consistent read; however, applications can request a strongly consistent read instead.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>BatchGetItem</i> - Performs multiple <i>GetItem</i> requests for data items using their primary keys, from one
 * table or multiple tables. The response from <i>BatchGetItem</i> has a size limit of 16 MB and returns a maximum of
 * 100 items. Both eventually consistent and strongly consistent reads can be used.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Query</i> - Returns one or more items from a table or a secondary index. You must provide a specific value for the
 * partition key. You can narrow the scope of the query using comparison operators against a sort key value, or on the
 * index key. <i>Query</i> supports either eventual or strong consistency. A single response has a size limit of 1 MB.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Scan</i> - Reads every item in a table; the result set is eventually consistent. You can limit the number of items
 * returned by filtering the data attributes, using conditional expressions. <i>Scan</i> can be used to enable ad-hoc
 * querying of a table against non-key attributes; however, since this is a full table scan without using an index,
 * <i>Scan</i> should not be used for any application query use case that requires predictable performance.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For conceptual information about reading data, see <a
 * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html">Working with Items</a>
 * and <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and Scan
 * Operations</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * <p>
 * <b>Modifying Data</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>PutItem</i> - Creates a new item, or replaces an existing item with a new item (including all the attributes). By
 * default, if an item in the table already exists with the same primary key, the new item completely replaces the
 * existing item. You can use conditional operators to replace an item only if its attribute values match certain
 * conditions, or to insert a new item only if that item doesn't already exist.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>UpdateItem</i> - Modifies the attributes of an existing item. You can also use conditional operators to perform an
 * update only if the item's attribute values match certain conditions.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DeleteItem</i> - Deletes an item in a table by primary key. You can use conditional operators to perform a delete
 * an item only if the item's attribute values match certain conditions.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>BatchWriteItem</i> - Performs multiple <i>PutItem</i> and <i>DeleteItem</i> requests across multiple tables in a
 * single request. A failure of any request(s) in the batch will not cause the entire <i>BatchWriteItem</i> operation to
 * fail. Supports batches of up to 25 items to put or delete, with a maximum total request size of 16 MB.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For conceptual information about modifying data, see <a
 * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html">Working with Items</a>
 * and <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html">Query and Scan
 * Operations</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 */
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
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "dynamodb.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://dynamodb.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     */
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
     */
    void setRegion(Region region);

    /**
     * <p>
     * The <i>BatchGetItem</i> operation returns the attributes of one or more items from one or more tables. You
     * identify requested items by primary key.
     * </p>
     * <p>
     * A single operation can retrieve up to 16 MB of data, which can contain as many as 100 items. <i>BatchGetItem</i>
     * will return a partial result if the response size limit is exceeded, the table's provisioned throughput is
     * exceeded, or an internal processing failure occurs. If a partial result is returned, the operation returns a
     * value for <i>UnprocessedKeys</i>. You can use this value to retry the operation starting with the next item to
     * get.
     * </p>
     * <important>
     * <p>
     * If you request more than 100 items <i>BatchGetItem</i> will return a <i>ValidationException</i> with the message
     * "Too many items requested for the BatchGetItem call".
     * </p>
     * </important>
     * <p>
     * For example, if you ask to retrieve 100 items, but each individual item is 300 KB in size, the system returns 52
     * items (so as not to exceed the 16 MB limit). It also returns an appropriate <i>UnprocessedKeys</i> value so you
     * can get the next page of results. If desired, your application can include its own logic to assemble the pages of
     * results into one data set.
     * </p>
     * <p>
     * If <i>none</i> of the items can be processed due to insufficient provisioned throughput on all of the tables in
     * the request, then <i>BatchGetItem</i> will return a <i>ProvisionedThroughputExceededException</i>. If <i>at least
     * one</i> of the items is successfully processed, then <i>BatchGetItem</i> completes successfully, while returning
     * the keys of the unread items in <i>UnprocessedKeys</i>.
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations">Batch
     * Operations and Error Handling</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * By default, <i>BatchGetItem</i> performs eventually consistent reads on every table in the request. If you want
     * strongly consistent reads instead, you can set <i>ConsistentRead</i> to <code>true</code> for any or all tables.
     * </p>
     * <p>
     * In order to minimize response latency, <i>BatchGetItem</i> retrieves items in parallel.
     * </p>
     * <p>
     * When designing your application, keep in mind that DynamoDB does not return items in any particular order. To
     * help parse the response by item, include the primary key values for the items in your request in the
     * <i>AttributesToGet</i> parameter.
     * </p>
     * <p>
     * If a requested item does not exist, it is not returned in the result. Requests for nonexistent items consume the
     * minimum read capacity units according to the type of read. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"
     * >Capacity Units Calculations</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param batchGetItemRequest
     *        Represents the input of a <i>BatchGetItem</i> operation.
     * @return Result of the BatchGetItem operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.BatchGetItem
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
     * The <i>BatchWriteItem</i> operation puts or deletes multiple items in one or more tables. A single call to
     * <i>BatchWriteItem</i> can write up to 16 MB of data, which can comprise as many as 25 put or delete requests.
     * Individual items to be written can be as large as 400 KB.
     * </p>
     * <note>
     * <p>
     * <i>BatchWriteItem</i> cannot update items. To update items, use the <i>UpdateItem</i> API.
     * </p>
     * </note>
     * <p>
     * The individual <i>PutItem</i> and <i>DeleteItem</i> operations specified in <i>BatchWriteItem</i> are atomic;
     * however <i>BatchWriteItem</i> as a whole is not. If any requested operations fail because the table's provisioned
     * throughput is exceeded or an internal processing failure occurs, the failed operations are returned in the
     * <i>UnprocessedItems</i> response parameter. You can investigate and optionally resend the requests. Typically,
     * you would call <i>BatchWriteItem</i> in a loop. Each iteration would check for unprocessed items and submit a new
     * <i>BatchWriteItem</i> request with those unprocessed items until all items have been processed.
     * </p>
     * <p>
     * Note that if <i>none</i> of the items can be processed due to insufficient provisioned throughput on all of the
     * tables in the request, then <i>BatchWriteItem</i> will return a <i>ProvisionedThroughputExceededException</i>.
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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations">Batch
     * Operations and Error Handling</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * With <i>BatchWriteItem</i>, you can efficiently write or delete large amounts of data, such as from Amazon
     * Elastic MapReduce (EMR), or copy data from another database into DynamoDB. In order to improve performance with
     * these large-scale operations, <i>BatchWriteItem</i> does not behave in the same way as individual <i>PutItem</i>
     * and <i>DeleteItem</i> calls would. For example, you cannot specify conditions on individual put and delete
     * requests, and <i>BatchWriteItem</i> does not return deleted items in the response.
     * </p>
     * <p>
     * If you use a programming language that supports concurrency, you can use threads to write items in parallel. Your
     * application must include the necessary logic to manage the threads. With languages that don't support threading,
     * you must update or delete the specified items one at a time. In both situations, <i>BatchWriteItem</i> provides
     * an alternative where the API performs the specified put and delete operations in parallel, giving you the power
     * of the thread pool approach without having to introduce complexity into your application.
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
     * One or more tables specified in the <i>BatchWriteItem</i> request does not exist.
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
     * You try to perform multiple operations on the same item in the same <i>BatchWriteItem</i> request. For example,
     * you cannot put and delete the same item in the same <i>BatchWriteItem</i> request.
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
     *        Represents the input of a <i>BatchWriteItem</i> operation.
     * @return Result of the BatchWriteItem operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws ItemCollectionSizeLimitExceededException
     *         An item collection is too large. This exception is only returned for tables that have one or more local
     *         secondary indexes.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.BatchWriteItem
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
     * The <i>CreateTable</i> operation adds a new table to your account. In an AWS account, table names must be unique
     * within each region. That is, you can have two tables with same name if you create the tables in different
     * regions.
     * </p>
     * <p>
     * <i>CreateTable</i> is an asynchronous operation. Upon receiving a <i>CreateTable</i> request, DynamoDB
     * immediately returns a response with a <i>TableStatus</i> of <code>CREATING</code>. After the table is created,
     * DynamoDB sets the <i>TableStatus</i> to <code>ACTIVE</code>. You can perform read and write operations only on an
     * <code>ACTIVE</code> table.
     * </p>
     * <p>
     * You can optionally define secondary indexes on the new table, as part of the <i>CreateTable</i> operation. If you
     * want to create multiple tables with secondary indexes on them, you must create the tables sequentially. Only one
     * table with secondary indexes can be in the <code>CREATING</code> state at any given time.
     * </p>
     * <p>
     * You can use the <i>DescribeTable</i> API to check the table status.
     * </p>
     * 
     * @param createTableRequest
     *        Represents the input of a <i>CreateTable</i> operation.
     * @return Result of the CreateTable operation returned by the service.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to recreate an
     *         existing table, or tried to delete a table currently in the <code>CREATING</code> state.
     * @throws LimitExceededException
     *         The number of concurrent table requests (cumulative number of tables in the <code>CREATING</code>,
     *         <code>DELETING</code> or <code>UPDATING</code> state) exceeds the maximum allowed of 10.</p>
     *         <p>
     *         Also, for tables with secondary indexes, only one of those tables can be in the <code>CREATING</code>
     *         state at any point in time. Do not attempt to create more than one such table simultaneously.
     *         </p>
     *         <p>
     *         The total limit of tables in the <code>ACTIVE</code> state is 250.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.CreateTable
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
     * Deletes a single item in a table by primary key. You can perform a conditional delete operation that deletes the
     * item if it exists, or if it has an expected attribute value.
     * </p>
     * <p>
     * In addition to deleting an item, you can also return the item's attribute values in the same operation, using the
     * <i>ReturnValues</i> parameter.
     * </p>
     * <p>
     * Unless you specify conditions, the <i>DeleteItem</i> is an idempotent operation; running it multiple times on the
     * same item or attribute does <i>not</i> result in an error response.
     * </p>
     * <p>
     * Conditional deletes are useful for deleting items only if specific conditions are met. If those conditions are
     * met, DynamoDB performs the delete. Otherwise, the item is not deleted.
     * </p>
     * 
     * @param deleteItemRequest
     *        Represents the input of a <i>DeleteItem</i> operation.
     * @return Result of the DeleteItem operation returned by the service.
     * @throws ConditionalCheckFailedException
     *         A condition specified in the operation could not be evaluated.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws ItemCollectionSizeLimitExceededException
     *         An item collection is too large. This exception is only returned for tables that have one or more local
     *         secondary indexes.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DeleteItem
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
     * The <i>DeleteTable</i> operation deletes a table and all of its items. After a <i>DeleteTable</i> request, the
     * specified table is in the <code>DELETING</code> state until DynamoDB completes the deletion. If the table is in
     * the <code>ACTIVE</code> state, you can delete it. If a table is in <code>CREATING</code> or <code>UPDATING</code>
     * states, then DynamoDB returns a <i>ResourceInUseException</i>. If the specified table does not exist, DynamoDB
     * returns a <i>ResourceNotFoundException</i>. If table is already in the <code>DELETING</code> state, no error is
     * returned.
     * </p>
     * <note>
     * <p>
     * DynamoDB might continue to accept data read and write operations, such as <i>GetItem</i> and <i>PutItem</i>, on a
     * table in the <code>DELETING</code> state until the table deletion is complete.
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
     * Use the <i>DescribeTable</i> API to check the status of the table.
     * </p>
     * 
     * @param deleteTableRequest
     *        Represents the input of a <i>DeleteTable</i> operation.
     * @return Result of the DeleteTable operation returned by the service.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to recreate an
     *         existing table, or tried to delete a table currently in the <code>CREATING</code> state.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws LimitExceededException
     *         The number of concurrent table requests (cumulative number of tables in the <code>CREATING</code>,
     *         <code>DELETING</code> or <code>UPDATING</code> state) exceeds the maximum allowed of 10.</p>
     *         <p>
     *         Also, for tables with secondary indexes, only one of those tables can be in the <code>CREATING</code>
     *         state at any point in time. Do not attempt to create more than one such table simultaneously.
     *         </p>
     *         <p>
     *         The total limit of tables in the <code>ACTIVE</code> state is 250.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DeleteTable
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
     * Returns the current provisioned-capacity limits for your AWS account in a region, both for the region as a whole
     * and for any one DynamoDB table that you create there.
     * </p>
     * <p>
     * When you establish an AWS account, the account has initial limits on the maximum read capacity units and write
     * capacity units that you can provision across all of your DynamoDB tables in a given region. Also, there are
     * per-table limits that apply when you create a table there. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> page in the
     * <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Although you can increase these limits by filing a case at <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>, obtaining the increase is not
     * instantaneous. The <i>DescribeLimits</i> API lets you write code to compare the capacity you are currently using
     * to those limits imposed by your account so that you have enough time to apply for an increase before you hit a
     * limit.
     * </p>
     * <p>
     * For example, you could use one of the AWS SDKs to do the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Call <i>DescribeLimits</i> for a particular region to obtain your current account limits on provisioned capacity
     * there.
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
     * Call <i>ListTables</i> to obtain a list of all your DynamoDB tables.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each table name listed by <i>ListTables</i>, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Call <i>DescribeTable</i> with the table name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the data returned by <i>DescribeTable</i> to add the read capacity units and write capacity units provisioned
     * for the table itself to your variables.
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
     * Report the account limits for that region returned by <i>DescribeLimits</i>, along with the total current
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
     * <i>DescribeLimits</i> should only be called periodically. You can expect throttling errors if you call it more
     * than once in a minute.
     * </p>
     * </note>
     * <p>
     * The <i>DescribeLimits</i> Request element has no content.
     * </p>
     * 
     * @param describeLimitsRequest
     *        Represents the input of a <i>DescribeLimits</i> operation. Has no content.
     * @return Result of the DescribeLimits operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DescribeLimits
     */
    DescribeLimitsResult describeLimits(DescribeLimitsRequest describeLimitsRequest);

    /**
     * <p>
     * Returns information about the table, including the current status of the table, when it was created, the primary
     * key schema, and any indexes on the table.
     * </p>
     * <note>
     * <p>
     * If you issue a <i>DescribeTable</i> request immediately after a <i>CreateTable</i> request, DynamoDB might return
     * a <i>ResourceNotFoundException</i>. This is because <i>DescribeTable</i> uses an eventually consistent query, and
     * the metadata for your table might not be available at that moment. Wait for a few seconds, and then try the
     * <i>DescribeTable</i> request again.
     * </p>
     * </note>
     * 
     * @param describeTableRequest
     *        Represents the input of a <i>DescribeTable</i> operation.
     * @return Result of the DescribeTable operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DescribeTable
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
     * The <i>GetItem</i> operation returns a set of attributes for the item with the given primary key. If there is no
     * matching item, <i>GetItem</i> does not return any data.
     * </p>
     * <p>
     * <i>GetItem</i> provides an eventually consistent read by default. If your application requires a strongly
     * consistent read, set <i>ConsistentRead</i> to <code>true</code>. Although a strongly consistent read might take
     * more time than an eventually consistent read, it always returns the last updated value.
     * </p>
     * 
     * @param getItemRequest
     *        Represents the input of a <i>GetItem</i> operation.
     * @return Result of the GetItem operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.GetItem
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
     * Returns an array of table names associated with the current account and endpoint. The output from
     * <i>ListTables</i> is paginated, with each page returning a maximum of 100 table names.
     * </p>
     * 
     * @param listTablesRequest
     *        Represents the input of a <i>ListTables</i> operation.
     * @return Result of the ListTables operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.ListTables
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
     * Creates a new item, or replaces an old item with a new item. If an item that has the same primary key as the new
     * item already exists in the specified table, the new item completely replaces the existing item. You can perform a
     * conditional put operation (add a new item if one with the specified primary key doesn't exist), or replace an
     * existing item if it has certain attribute values.
     * </p>
     * <p>
     * In addition to putting an item, you can also return the item's attribute values in the same operation, using the
     * <i>ReturnValues</i> parameter.
     * </p>
     * <p>
     * When you add an item, the primary key attribute(s) are the only required attributes. Attribute values cannot be
     * null. String and Binary type attributes must have lengths greater than zero. Set type attributes cannot be empty.
     * Requests with empty values will be rejected with a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * You can request that <i>PutItem</i> return either a copy of the original item (before the update) or a copy of
     * the updated item (after the update). For more information, see the <i>ReturnValues</i> description below.
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
     * For more information about using this API, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html">Working with
     * Items</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param putItemRequest
     *        Represents the input of a <i>PutItem</i> operation.
     * @return Result of the PutItem operation returned by the service.
     * @throws ConditionalCheckFailedException
     *         A condition specified in the operation could not be evaluated.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws ItemCollectionSizeLimitExceededException
     *         An item collection is too large. This exception is only returned for tables that have one or more local
     *         secondary indexes.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.PutItem
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
     * A <i>Query</i> operation uses the primary key of a table or a secondary index to directly access items from that
     * table or index.
     * </p>
     * <p>
     * Use the <i>KeyConditionExpression</i> parameter to provide a specific value for the partition key. The
     * <i>Query</i> operation will return all of the items from the table or index with that partition key value. You
     * can optionally narrow the scope of the <i>Query</i> operation by specifying a sort key value and a comparison
     * operator in <i>KeyConditionExpression</i>. You can use the <i>ScanIndexForward</i> parameter to get results in
     * forward or reverse order, by sort key.
     * </p>
     * <p>
     * Queries that do not return results consume the minimum number of read capacity units for that type of read
     * operation.
     * </p>
     * <p>
     * If the total number of items meeting the query criteria exceeds the result set size limit of 1 MB, the query
     * stops and results are returned to the user with the <i>LastEvaluatedKey</i> element to continue the query in a
     * subsequent operation. Unlike a <i>Scan</i> operation, a <i>Query</i> operation never returns both an empty result
     * set and a <i>LastEvaluatedKey</i> value. <i>LastEvaluatedKey</i> is only provided if you have used the
     * <i>Limit</i> parameter, or if the result set exceeds 1 MB (prior to applying a filter).
     * </p>
     * <p>
     * You can query a table, a local secondary index, or a global secondary index. For a query on a table or on a local
     * secondary index, you can set the <i>ConsistentRead</i> parameter to <code>true</code> and obtain a strongly
     * consistent result. Global secondary indexes support eventually consistent reads only, so do not specify
     * <i>ConsistentRead</i> when querying a global secondary index.
     * </p>
     * 
     * @param queryRequest
     *        Represents the input of a <i>Query</i> operation.
     * @return Result of the Query operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.Query
     */
    QueryResult query(QueryRequest queryRequest);

    /**
     * <p>
     * The <i>Scan</i> operation returns one or more items and item attributes by accessing every item in a table or a
     * secondary index. To have DynamoDB return fewer items, you can provide a <i>ScanFilter</i> operation.
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set size limit of 1 MB, the scan stops and results
     * are returned to the user as a <i>LastEvaluatedKey</i> value to continue the scan in a subsequent operation. The
     * results also include the number of items exceeding the limit. A scan can result in no table data meeting the
     * filter criteria.
     * </p>
     * <p>
     * By default, <i>Scan</i> operations proceed sequentially; however, for faster performance on a large table or
     * secondary index, applications can request a parallel <i>Scan</i> operation by providing the <i>Segment</i> and
     * <i>TotalSegments</i> parameters. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#QueryAndScanParallelScan"
     * >Parallel Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * By default, <i>Scan</i> uses eventually consistent reads when accessing the data in a table; therefore, the
     * result set might not include the changes to data in the table immediately before the operation began. If you need
     * a consistent copy of the data, as of the time that the Scan begins, you can set the <i>ConsistentRead</i>
     * parameter to <i>true</i>.
     * </p>
     * 
     * @param scanRequest
     *        Represents the input of a <i>Scan</i> operation.
     * @return Result of the Scan operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.Scan
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
     * Edits an existing item's attributes, or adds a new item to the table if it does not already exist. You can put,
     * delete, or add attribute values. You can also perform a conditional update on an existing item (insert a new
     * attribute name-value pair if it doesn't exist, or replace an existing name-value pair if it has certain expected
     * attribute values).
     * </p>
     * <p>
     * You can also return the item's attribute values in the same <i>UpdateItem</i> operation using the
     * <i>ReturnValues</i> parameter.
     * </p>
     * 
     * @param updateItemRequest
     *        Represents the input of an <i>UpdateItem</i> operation.
     * @return Result of the UpdateItem operation returned by the service.
     * @throws ConditionalCheckFailedException
     *         A condition specified in the operation could not be evaluated.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this
     *         exception. Your request is eventually successful, unless your retry queue is too large to finish. Reduce
     *         the frequency of requests and use exponential backoff. For more information, go to <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws ItemCollectionSizeLimitExceededException
     *         An item collection is too large. This exception is only returned for tables that have one or more local
     *         secondary indexes.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.UpdateItem
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
     * <i>UpdateTable</i> to perform other operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>UpdateTable</i> is an asynchronous operation; while it is executing, the table status changes from
     * <code>ACTIVE</code> to <code>UPDATING</code>. While it is <code>UPDATING</code>, you cannot issue another
     * <i>UpdateTable</i> request. When the table returns to the <code>ACTIVE</code> state, the <i>UpdateTable</i>
     * operation is complete.
     * </p>
     * 
     * @param updateTableRequest
     *        Represents the input of an <i>UpdateTable</i> operation.
     * @return Result of the UpdateTable operation returned by the service.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to recreate an
     *         existing table, or tried to delete a table currently in the <code>CREATING</code> state.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws LimitExceededException
     *         The number of concurrent table requests (cumulative number of tables in the <code>CREATING</code>,
     *         <code>DELETING</code> or <code>UPDATING</code> state) exceeds the maximum allowed of 10.</p>
     *         <p>
     *         Also, for tables with secondary indexes, only one of those tables can be in the <code>CREATING</code>
     *         state at any point in time. Do not attempt to create more than one such table simultaneously.
     *         </p>
     *         <p>
     *         The total limit of tables in the <code>ACTIVE</code> state is 250.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.UpdateTable
     */
    UpdateTableResult updateTable(UpdateTableRequest updateTableRequest);

    /**
     * Simplified method form for invoking the UpdateTable operation.
     *
     * @see #updateTable(UpdateTableRequest)
     */
    UpdateTableResult updateTable(String tableName, ProvisionedThroughput provisionedThroughput);

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
