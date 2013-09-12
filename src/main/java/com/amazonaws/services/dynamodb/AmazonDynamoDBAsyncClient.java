/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.dynamodb.model.*;


/**
 * Asynchronous client for accessing AmazonDynamoDB.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * <p>
 * Amazon DynamoDB is a fast, highly scalable, highly available, cost-effective non-relational database service.
 * </p>
 * <p>
 * Amazon DynamoDB removes traditional scalability limitations on data storage while maintaining low latency and predictable performance.
 * </p>
 */
@Deprecated
public class AmazonDynamoDBAsyncClient extends AmazonDynamoDBClient
        implements AmazonDynamoDBAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDynamoDB.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonDynamoDBAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDynamoDB.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonDynamoDB
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonDynamoDBAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDynamoDB using the specified AWS account credentials.
     * Default client settings will be used, and a default cached thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonDynamoDBAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDynamoDB using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonDynamoDBAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDynamoDB using the specified AWS account credentials,
     * executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonDynamoDBAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDynamoDB using the specified AWS account credentials provider.
     * Default client settings will be used, and a default cached thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonDynamoDBAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDynamoDB using the specified AWS account credentials provider
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonDynamoDBAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDynamoDB using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     */
    public AmazonDynamoDBAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDynamoDB using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AmazonDynamoDBAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }


    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
            
    /**
     * <p>
     * Retrieves a paginated list of table names created by the AWS Account
     * of the caller in the AWS Region (e.g. <code>us-east-1</code> ).
     * </p>
     *
     * @param listTablesRequest Container for the necessary parameters to
     *           execute the ListTables operation on AmazonDynamoDB.
     * 
     * @return A Java Future object containing the response from the
     *         ListTables service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTablesResult> listTablesAsync(final ListTablesRequest listTablesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTablesResult>() {
            public ListTablesResult call() throws Exception {
                return listTables(listTablesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Retrieves a paginated list of table names created by the AWS Account
     * of the caller in the AWS Region (e.g. <code>us-east-1</code> ).
     * </p>
     *
     * @param listTablesRequest Container for the necessary parameters to
     *           execute the ListTables operation on AmazonDynamoDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTables service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTablesResult> listTablesAsync(
            final ListTablesRequest listTablesRequest,
            final AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTablesResult>() {
            public ListTablesResult call() throws Exception {
            	ListTablesResult result;
                try {
            		result = listTables(listTablesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listTablesRequest, result);
               	return result;
		    }
		});
    }
    
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
     *           the Query operation on AmazonDynamoDB.
     * 
     * @return A Java Future object containing the response from the Query
     *         service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<QueryResult> queryAsync(final QueryRequest queryRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<QueryResult>() {
            public QueryResult call() throws Exception {
                return query(queryRequest);
		    }
		});
    }

    
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
     *           the Query operation on AmazonDynamoDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Query
     *         service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<QueryResult> queryAsync(
            final QueryRequest queryRequest,
            final AsyncHandler<QueryRequest, QueryResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<QueryResult>() {
            public QueryResult call() throws Exception {
            	QueryResult result;
                try {
            		result = query(queryRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(queryRequest, result);
               	return result;
		    }
		});
    }
    
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
     *           execute the BatchWriteItem operation on AmazonDynamoDB.
     * 
     * @return A Java Future object containing the response from the
     *         BatchWriteItem service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BatchWriteItemResult> batchWriteItemAsync(final BatchWriteItemRequest batchWriteItemRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchWriteItemResult>() {
            public BatchWriteItemResult call() throws Exception {
                return batchWriteItem(batchWriteItemRequest);
		    }
		});
    }

    
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
     *           execute the BatchWriteItem operation on AmazonDynamoDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BatchWriteItem service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BatchWriteItemResult> batchWriteItemAsync(
            final BatchWriteItemRequest batchWriteItemRequest,
            final AsyncHandler<BatchWriteItemRequest, BatchWriteItemResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchWriteItemResult>() {
            public BatchWriteItemResult call() throws Exception {
            	BatchWriteItemResult result;
                try {
            		result = batchWriteItem(batchWriteItemRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(batchWriteItemRequest, result);
               	return result;
		    }
		});
    }
    
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
     *           execute the UpdateItem operation on AmazonDynamoDB.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateItem service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateItemResult> updateItemAsync(final UpdateItemRequest updateItemRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateItemResult>() {
            public UpdateItemResult call() throws Exception {
                return updateItem(updateItemRequest);
		    }
		});
    }

    
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
     *           execute the UpdateItem operation on AmazonDynamoDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateItem service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateItemResult> updateItemAsync(
            final UpdateItemRequest updateItemRequest,
            final AsyncHandler<UpdateItemRequest, UpdateItemResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateItemResult>() {
            public UpdateItemResult call() throws Exception {
            	UpdateItemResult result;
                try {
            		result = updateItem(updateItemRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateItemRequest, result);
               	return result;
		    }
		});
    }
    
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
     *           execute the PutItem operation on AmazonDynamoDB.
     * 
     * @return A Java Future object containing the response from the PutItem
     *         service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutItemResult> putItemAsync(final PutItemRequest putItemRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutItemResult>() {
            public PutItemResult call() throws Exception {
                return putItem(putItemRequest);
		    }
		});
    }

    
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
     *           execute the PutItem operation on AmazonDynamoDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the PutItem
     *         service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PutItemResult> putItemAsync(
            final PutItemRequest putItemRequest,
            final AsyncHandler<PutItemRequest, PutItemResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PutItemResult>() {
            public PutItemResult call() throws Exception {
            	PutItemResult result;
                try {
            		result = putItem(putItemRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(putItemRequest, result);
               	return result;
		    }
		});
    }
    
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
     *           execute the DescribeTable operation on AmazonDynamoDB.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTable service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTableResult> describeTableAsync(final DescribeTableRequest describeTableRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTableResult>() {
            public DescribeTableResult call() throws Exception {
                return describeTable(describeTableRequest);
		    }
		});
    }

    
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
     *           execute the DescribeTable operation on AmazonDynamoDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTable service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTableResult> describeTableAsync(
            final DescribeTableRequest describeTableRequest,
            final AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTableResult>() {
            public DescribeTableResult call() throws Exception {
            	DescribeTableResult result;
                try {
            		result = describeTable(describeTableRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeTableRequest, result);
               	return result;
		    }
		});
    }
    
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
     *           the Scan operation on AmazonDynamoDB.
     * 
     * @return A Java Future object containing the response from the Scan
     *         service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ScanResult> scanAsync(final ScanRequest scanRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ScanResult>() {
            public ScanResult call() throws Exception {
                return scan(scanRequest);
		    }
		});
    }

    
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
     *           the Scan operation on AmazonDynamoDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Scan
     *         service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ScanResult> scanAsync(
            final ScanRequest scanRequest,
            final AsyncHandler<ScanRequest, ScanResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ScanResult>() {
            public ScanResult call() throws Exception {
            	ScanResult result;
                try {
            		result = scan(scanRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(scanRequest, result);
               	return result;
		    }
		});
    }
    
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
     *           execute the CreateTable operation on AmazonDynamoDB.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTable service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTableResult> createTableAsync(final CreateTableRequest createTableRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTableResult>() {
            public CreateTableResult call() throws Exception {
                return createTable(createTableRequest);
		    }
		});
    }

    
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
     *           execute the CreateTable operation on AmazonDynamoDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTable service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTableResult> createTableAsync(
            final CreateTableRequest createTableRequest,
            final AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTableResult>() {
            public CreateTableResult call() throws Exception {
            	CreateTableResult result;
                try {
            		result = createTable(createTableRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createTableRequest, result);
               	return result;
		    }
		});
    }
    
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
     *           execute the UpdateTable operation on AmazonDynamoDB.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateTable service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateTableResult> updateTableAsync(final UpdateTableRequest updateTableRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateTableResult>() {
            public UpdateTableResult call() throws Exception {
                return updateTable(updateTableRequest);
		    }
		});
    }

    
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
     *           execute the UpdateTable operation on AmazonDynamoDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateTable service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateTableResult> updateTableAsync(
            final UpdateTableRequest updateTableRequest,
            final AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateTableResult>() {
            public UpdateTableResult call() throws Exception {
            	UpdateTableResult result;
                try {
            		result = updateTable(updateTableRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateTableRequest, result);
               	return result;
		    }
		});
    }
    
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
     *           execute the DeleteTable operation on AmazonDynamoDB.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTable service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTableResult> deleteTableAsync(final DeleteTableRequest deleteTableRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteTableResult>() {
            public DeleteTableResult call() throws Exception {
                return deleteTable(deleteTableRequest);
		    }
		});
    }

    
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
     *           execute the DeleteTable operation on AmazonDynamoDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTable service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTableResult> deleteTableAsync(
            final DeleteTableRequest deleteTableRequest,
            final AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteTableResult>() {
            public DeleteTableResult call() throws Exception {
            	DeleteTableResult result;
                try {
            		result = deleteTable(deleteTableRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteTableRequest, result);
               	return result;
		    }
		});
    }
    
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
     *           execute the DeleteItem operation on AmazonDynamoDB.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteItem service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteItemResult> deleteItemAsync(final DeleteItemRequest deleteItemRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteItemResult>() {
            public DeleteItemResult call() throws Exception {
                return deleteItem(deleteItemRequest);
		    }
		});
    }

    
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
     *           execute the DeleteItem operation on AmazonDynamoDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteItem service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteItemResult> deleteItemAsync(
            final DeleteItemRequest deleteItemRequest,
            final AsyncHandler<DeleteItemRequest, DeleteItemResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteItemResult>() {
            public DeleteItemResult call() throws Exception {
            	DeleteItemResult result;
                try {
            		result = deleteItem(deleteItemRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteItemRequest, result);
               	return result;
		    }
		});
    }
    
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
     *           execute the GetItem operation on AmazonDynamoDB.
     * 
     * @return A Java Future object containing the response from the GetItem
     *         service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetItemResult> getItemAsync(final GetItemRequest getItemRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetItemResult>() {
            public GetItemResult call() throws Exception {
                return getItem(getItemRequest);
		    }
		});
    }

    
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
     *           execute the GetItem operation on AmazonDynamoDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the GetItem
     *         service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetItemResult> getItemAsync(
            final GetItemRequest getItemRequest,
            final AsyncHandler<GetItemRequest, GetItemResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetItemResult>() {
            public GetItemResult call() throws Exception {
            	GetItemResult result;
                try {
            		result = getItem(getItemRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getItemRequest, result);
               	return result;
		    }
		});
    }
    
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
     *           execute the BatchGetItem operation on AmazonDynamoDB.
     * 
     * @return A Java Future object containing the response from the
     *         BatchGetItem service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BatchGetItemResult> batchGetItemAsync(final BatchGetItemRequest batchGetItemRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchGetItemResult>() {
            public BatchGetItemResult call() throws Exception {
                return batchGetItem(batchGetItemRequest);
		    }
		});
    }

    
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
     *           execute the BatchGetItem operation on AmazonDynamoDB.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BatchGetItem service method, as returned by AmazonDynamoDB.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDB indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BatchGetItemResult> batchGetItemAsync(
            final BatchGetItemRequest batchGetItemRequest,
            final AsyncHandler<BatchGetItemRequest, BatchGetItemResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<BatchGetItemResult>() {
            public BatchGetItemResult call() throws Exception {
            	BatchGetItemResult result;
                try {
            		result = batchGetItem(batchGetItemRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(batchGetItemRequest, result);
               	return result;
		    }
		});
    }
    
}
        