/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb;

import com.amazonaws.*;
import com.amazonaws.services.dynamodb.model.*;


/**
 * Interface for accessing AmazonDynamoDB.
 * <p>
 * Amazon DynamoDB is a fast, highly scalable, highly available, cost-effective non-relational database service.
 * </p>
 * <p>
 * Amazon DynamoDB removes traditional scalability limitations on data storage while maintaining low latency and predictable performance.
 * </p>
 */
public interface AmazonDynamoDB {

    /**
     * Overrides the default endpoint for this client ("http://dynamodb.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ec2.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "ec2.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ec2.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Retrieves a paginated list of table names created by the AWS Account
     * of the caller in the AWS Region (e.g. <code>us-east-1</code> ).
     * </p>
     *
     * @param listTablesRequest Container for the necessary parameters to
     *           execute the ListTables service method on AmazonDynamoDB.
     * 
     * @return The response from the ListTables service method, as returned
     *         by AmazonDynamoDB.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTablesResult listTables(ListTablesRequest listTablesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the values of one or more items and its attributes by primary key
     * (composite primary key, only).
     * </p>
     * <p>
     * Narrow the scope of the query using comparison operators on the
     * <code>RangeKeyValue</code> of the composite key. Use the
     * <code>ScanIndexForward</code> parameter to get results in forward or
     * reverse order by range key.
     * </p>
     *
     * @param queryRequest Container for the necessary parameters to execute
     *           the Query service method on AmazonDynamoDB.
     * 
     * @return The response from the Query service method, as returned by
     *         AmazonDynamoDB.
     * 
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public QueryResult query(QueryRequest queryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows to execute a batch of Put and/or Delete Requests for many
     * tables in a single call. A total of 25 requests are allowed.
     * </p>
     * <p>
     * There are no transaction guarantees provided by this API. It does not
     * allow conditional puts nor does it support return values.
     * </p>
     *
     * @param batchWriteItemRequest Container for the necessary parameters to
     *           execute the BatchWriteItem service method on AmazonDynamoDB.
     * 
     * @return The response from the BatchWriteItem service method, as
     *         returned by AmazonDynamoDB.
     * 
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchWriteItemResult batchWriteItem(BatchWriteItemRequest batchWriteItemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Edits an existing item's attributes.
     * </p>
     * <p>
     * You can perform a conditional update (insert a new attribute
     * name-value pair if it doesn't exist, or replace an existing name-value
     * pair if it has certain expected attribute values).
     * </p>
     *
     * @param updateItemRequest Container for the necessary parameters to
     *           execute the UpdateItem service method on AmazonDynamoDB.
     * 
     * @return The response from the UpdateItem service method, as returned
     *         by AmazonDynamoDB.
     * 
     * @throws ProvisionedThroughputExceededException
     * @throws ConditionalCheckFailedException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateItemResult updateItem(UpdateItemRequest updateItemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new item, or replaces an old item with a new item (including
     * all the attributes).
     * </p>
     * <p>
     * If an item already exists in the specified table with the same primary
     * key, the new item completely replaces the existing item. You can
     * perform a conditional put (insert a new item if one with the specified
     * primary key doesn't exist), or replace an existing item if it has
     * certain attribute values.
     * </p>
     *
     * @param putItemRequest Container for the necessary parameters to
     *           execute the PutItem service method on AmazonDynamoDB.
     * 
     * @return The response from the PutItem service method, as returned by
     *         AmazonDynamoDB.
     * 
     * @throws ProvisionedThroughputExceededException
     * @throws ConditionalCheckFailedException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutItemResult putItem(PutItemRequest putItemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about the table, including the current status of
     * the table, the primary key schema and when the table was created.
     * </p>
     * <p>
     * If the table does not exist, Amazon DynamoDB returns a
     * <code>ResourceNotFoundException</code> .
     * </p>
     *
     * @param describeTableRequest Container for the necessary parameters to
     *           execute the DescribeTable service method on AmazonDynamoDB.
     * 
     * @return The response from the DescribeTable service method, as
     *         returned by AmazonDynamoDB.
     * 
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTableResult describeTable(DescribeTableRequest describeTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves one or more items and its attributes by performing a full
     * scan of a table.
     * </p>
     * <p>
     * Provide a <code>ScanFilter</code> to get more specific results.
     * </p>
     *
     * @param scanRequest Container for the necessary parameters to execute
     *           the Scan service method on AmazonDynamoDB.
     * 
     * @return The response from the Scan service method, as returned by
     *         AmazonDynamoDB.
     * 
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ScanResult scan(ScanRequest scanRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds a new table to your account.
     * </p>
     * <p>
     * The table name must be unique among those associated with the AWS
     * Account issuing the request, and the AWS Region that receives the
     * request (e.g. <code>us-east-1</code> ).
     * </p>
     * <p>
     * The <code>CreateTable</code> operation triggers an asynchronous
     * workflow to begin creating the table. Amazon DynamoDB immediately
     * returns the state of the table ( <code>CREATING</code> ) until the
     * table is in the <code>ACTIVE</code> state. Once the table is in the
     * <code>ACTIVE</code> state, you can perform data plane operations.
     * </p>
     *
     * @param createTableRequest Container for the necessary parameters to
     *           execute the CreateTable service method on AmazonDynamoDB.
     * 
     * @return The response from the CreateTable service method, as returned
     *         by AmazonDynamoDB.
     * 
     * @throws ResourceInUseException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateTableResult createTable(CreateTableRequest createTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the provisioned throughput for the given table.
     * </p>
     * <p>
     * Setting the throughput for a table helps you manage performance and is
     * part of the Provisioned Throughput feature of Amazon DynamoDB.
     * </p>
     *
     * @param updateTableRequest Container for the necessary parameters to
     *           execute the UpdateTable service method on AmazonDynamoDB.
     * 
     * @return The response from the UpdateTable service method, as returned
     *         by AmazonDynamoDB.
     * 
     * @throws ResourceInUseException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateTableResult updateTable(UpdateTableRequest updateTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a table and all of its items.
     * </p>
     * <p>
     * If the table is in the <code>ACTIVE</code> state, you can delete it.
     * If a table is in <code>CREATING</code> or <code>UPDATING</code> states
     * then Amazon DynamoDB returns a <code>ResourceInUseException</code> .
     * If the specified table does not exist, Amazon DynamoDB returns a
     * <code>ResourceNotFoundException</code> .
     * </p>
     *
     * @param deleteTableRequest Container for the necessary parameters to
     *           execute the DeleteTable service method on AmazonDynamoDB.
     * 
     * @return The response from the DeleteTable service method, as returned
     *         by AmazonDynamoDB.
     * 
     * @throws ResourceInUseException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteTableResult deleteTable(DeleteTableRequest deleteTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a single item in a table by primary key.
     * </p>
     * <p>
     * You can perform a conditional delete operation that deletes the item
     * if it exists, or if it has an expected attribute value.
     * </p>
     *
     * @param deleteItemRequest Container for the necessary parameters to
     *           execute the DeleteItem service method on AmazonDynamoDB.
     * 
     * @return The response from the DeleteItem service method, as returned
     *         by AmazonDynamoDB.
     * 
     * @throws ProvisionedThroughputExceededException
     * @throws ConditionalCheckFailedException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteItemResult deleteItem(DeleteItemRequest deleteItemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a set of Attributes for an item that matches the primary
     * key.
     * </p>
     * <p>
     * The <code>GetItem</code> operation provides an eventually-consistent
     * read by default. If eventually-consistent reads are not acceptable for
     * your application, use <code>ConsistentRead</code> . Although this
     * operation might take longer than a standard read, it always returns
     * the last updated value.
     * </p>
     *
     * @param getItemRequest Container for the necessary parameters to
     *           execute the GetItem service method on AmazonDynamoDB.
     * 
     * @return The response from the GetItem service method, as returned by
     *         AmazonDynamoDB.
     * 
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetItemResult getItem(GetItemRequest getItemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the attributes for multiple items from multiple tables using
     * their primary keys.
     * </p>
     * <p>
     * The maximum number of item attributes that can be retrieved for a
     * single operation is 100. Also, the number of items retrieved is
     * constrained by a 1 MB the size limit. If the response size limit is
     * exceeded or a partial result is returned due to an internal processing
     * failure, Amazon DynamoDB returns an <code>UnprocessedKeys</code> value
     * so you can retry the operation starting with the next item to get.
     * </p>
     * <p>
     * Amazon DynamoDB automatically adjusts the number of items returned per
     * page to enforce this limit. For example, even if you ask to retrieve
     * 100 items, but each individual item is 50k in size, the system returns
     * 20 items and an appropriate <code>UnprocessedKeys</code> value so you
     * can get the next page of results. If necessary, your application needs
     * its own logic to assemble the pages of results into one set.
     * </p>
     *
     * @param batchGetItemRequest Container for the necessary parameters to
     *           execute the BatchGetItem service method on AmazonDynamoDB.
     * 
     * @return The response from the BatchGetItem service method, as returned
     *         by AmazonDynamoDB.
     * 
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchGetItemResult batchGetItem(BatchGetItemRequest batchGetItemRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves a paginated list of table names created by the AWS Account
     * of the caller in the AWS Region (e.g. <code>us-east-1</code> ).
     * </p>
     * 
     * @return The response from the ListTables service method, as returned
     *         by AmazonDynamoDB.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTablesResult listTables() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
        