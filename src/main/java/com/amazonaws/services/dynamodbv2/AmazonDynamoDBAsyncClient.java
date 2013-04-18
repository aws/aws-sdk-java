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
package com.amazonaws.services.dynamodbv2;

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

import com.amazonaws.services.dynamodbv2.model.*;


/**
 * Asynchronous client for accessing AmazonDynamoDBv2.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon DynamoDB <b>Overview</b> <p>
 * This is the Amazon DynamoDB API Reference. This guide provides descriptions and samples of the Amazon DynamoDB API.
 * </p>
 */
public class AmazonDynamoDBAsyncClient extends AmazonDynamoDBClient
        implements AmazonDynamoDBAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDynamoDBv2.  A credentials provider chain will be used
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
     * @see DefaultAWSCredentialsProvider
     */
    public AmazonDynamoDBAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDynamoDBv2.  A credentials provider chain will be used
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
     *                       client connects to AmazonDynamoDBv2
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProvider
     */
    public AmazonDynamoDBAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonDynamoDBv2 using the specified AWS account credentials.
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
     * AmazonDynamoDBv2 using the specified AWS account credentials
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
     * AmazonDynamoDBv2 using the specified AWS account credentials,
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
     * AmazonDynamoDBv2 using the specified AWS account credentials provider.
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
     * AmazonDynamoDBv2 using the specified AWS account credentials provider
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
     * AmazonDynamoDBv2 using the specified AWS account credentials
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
     * AmazonDynamoDBv2 using the specified AWS account credentials
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
     * The <i>Scan</i> operation returns one or more items and item
     * attributes by accessing every item in the table. To have Amazon
     * DynamoDB return fewer items, you can provide a <i>ScanFilter</i> .
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set size
     * limit of 1 MB, the scan stops and results are returned to the user
     * with a <i>LastEvaluatedKey</i> to continue the scan in a subsequent
     * operation. The results also include the number of items exceeding the
     * limit. A scan can result in no table data meeting the filter criteria.
     * </p>
     * <p>
     * The result set is eventually consistent.
     * </p>
     *
     * @param scanRequest Container for the necessary parameters to execute
     *           the Scan operation on AmazonDynamoDBv2.
     * 
     * @return A Java Future object containing the response from the Scan
     *         service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * The <i>Scan</i> operation returns one or more items and item
     * attributes by accessing every item in the table. To have Amazon
     * DynamoDB return fewer items, you can provide a <i>ScanFilter</i> .
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set size
     * limit of 1 MB, the scan stops and results are returned to the user
     * with a <i>LastEvaluatedKey</i> to continue the scan in a subsequent
     * operation. The results also include the number of items exceeding the
     * limit. A scan can result in no table data meeting the filter criteria.
     * </p>
     * <p>
     * The result set is eventually consistent.
     * </p>
     *
     * @param scanRequest Container for the necessary parameters to execute
     *           the Scan operation on AmazonDynamoDBv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Scan
     *         service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * Updates the provisioned throughput for the given table. Setting the
     * throughput for a table helps you manage performance and is part of the
     * provisioned throughput feature of Amazon DynamoDB.
     * </p>
     * <p>
     * The provisioned throughput values can be upgraded or downgraded based
     * on the maximums and minimums listed in the <a
     * docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">
     * Limits </a> section of the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     * <p>
     * The table must be in the <code>ACTIVE</code> state for this operation
     * to succeed. <i>UpdateTable</i> is an asynchronous operation; while
     * executing the operation, the table is in the <code>UPDATING</code>
     * state. While the table is in the <code>UPDATING</code> state, the
     * table still has the provisioned throughput from before the call. The
     * new provisioned throughput setting is in effect only when the table
     * returns to the <code>ACTIVE</code> state after the <i>UpdateTable</i>
     * operation.
     * </p>
     * <p>
     * You cannot add, modify or delete local secondary indexes using
     * <i>UpdateTable</i> . Local secondary indexes can only be defined at
     * table creation time.
     * </p>
     *
     * @param updateTableRequest Container for the necessary parameters to
     *           execute the UpdateTable operation on AmazonDynamoDBv2.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateTable service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * Updates the provisioned throughput for the given table. Setting the
     * throughput for a table helps you manage performance and is part of the
     * provisioned throughput feature of Amazon DynamoDB.
     * </p>
     * <p>
     * The provisioned throughput values can be upgraded or downgraded based
     * on the maximums and minimums listed in the <a
     * docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">
     * Limits </a> section of the <i>Amazon DynamoDB Developer Guide</i> .
     * </p>
     * <p>
     * The table must be in the <code>ACTIVE</code> state for this operation
     * to succeed. <i>UpdateTable</i> is an asynchronous operation; while
     * executing the operation, the table is in the <code>UPDATING</code>
     * state. While the table is in the <code>UPDATING</code> state, the
     * table still has the provisioned throughput from before the call. The
     * new provisioned throughput setting is in effect only when the table
     * returns to the <code>ACTIVE</code> state after the <i>UpdateTable</i>
     * operation.
     * </p>
     * <p>
     * You cannot add, modify or delete local secondary indexes using
     * <i>UpdateTable</i> . Local secondary indexes can only be defined at
     * table creation time.
     * </p>
     *
     * @param updateTableRequest Container for the necessary parameters to
     *           execute the UpdateTable operation on AmazonDynamoDBv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateTable service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * The <i>DeleteTable</i> operation deletes a table and all of its items.
     * After a <i>DeleteTable</i> request, the specified table is in the
     * <code>DELETING</code> state until Amazon DynamoDB completes the
     * deletion. If the table is in the <code>ACTIVE</code> state, you can
     * delete it. If a table is in <code>CREATING</code> or
     * <code>UPDATING</code> states, then Amazon DynamoDB returns a
     * <i>ResourceInUseException</i> . If the specified
     * table does not exist, Amazon DynamoDB returns a
     * <i>ResourceNotFoundException</i> . If table is already in the
     * <code>DELETING</code> state, no error is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon DynamoDB might continue to accept data read and
     * write operations, such as GetItem and PutItem, on a table in the
     * DELETING state until the table deletion is complete.
     * </p>
     * <p>
     * Tables are unique among those associated with the AWS Account issuing
     * the request, and the AWS region that receives the request (such as
     * dynamodb.us-east-1.amazonaws.com). Each Amazon DynamoDB endpoint is
     * entirely independent. For example, if you have two tables called
     * "MyTable," one in dynamodb.us-east-1.amazonaws.com and one in
     * dynamodb.us-west-1.amazonaws.com, they are completely independent and
     * do not share any data; deleting one does not delete the other.
     * </p>
     * <p>
     * Use the <i>DescribeTable</i> API to check the status of the table.
     * </p>
     *
     * @param deleteTableRequest Container for the necessary parameters to
     *           execute the DeleteTable operation on AmazonDynamoDBv2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTable service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * The <i>DeleteTable</i> operation deletes a table and all of its items.
     * After a <i>DeleteTable</i> request, the specified table is in the
     * <code>DELETING</code> state until Amazon DynamoDB completes the
     * deletion. If the table is in the <code>ACTIVE</code> state, you can
     * delete it. If a table is in <code>CREATING</code> or
     * <code>UPDATING</code> states, then Amazon DynamoDB returns a
     * <i>ResourceInUseException</i> . If the specified
     * table does not exist, Amazon DynamoDB returns a
     * <i>ResourceNotFoundException</i> . If table is already in the
     * <code>DELETING</code> state, no error is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon DynamoDB might continue to accept data read and
     * write operations, such as GetItem and PutItem, on a table in the
     * DELETING state until the table deletion is complete.
     * </p>
     * <p>
     * Tables are unique among those associated with the AWS Account issuing
     * the request, and the AWS region that receives the request (such as
     * dynamodb.us-east-1.amazonaws.com). Each Amazon DynamoDB endpoint is
     * entirely independent. For example, if you have two tables called
     * "MyTable," one in dynamodb.us-east-1.amazonaws.com and one in
     * dynamodb.us-west-1.amazonaws.com, they are completely independent and
     * do not share any data; deleting one does not delete the other.
     * </p>
     * <p>
     * Use the <i>DescribeTable</i> API to check the status of the table.
     * </p>
     *
     * @param deleteTableRequest Container for the necessary parameters to
     *           execute the DeleteTable operation on AmazonDynamoDBv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTable service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * This operation enables you to put or delete several items across
     * multiple tables in a single API call.
     * </p>
     * <p>
     * To upload one item, you can use the <i>PutItem</i> API and to delete
     * one item, you can use the <i>DeleteItem</i> API. However, when you
     * want to upload or delete large amounts of data, such as uploading
     * large amounts of data from Amazon Elastic MapReduce (EMR) or migrate
     * data from another database into Amazon DynamoDB, this API offers an
     * efficient alternative.
     * </p>
     * <p>
     * If you use a programming language that supports concurrency, such as
     * Java, you can use threads to upload items in parallel. This adds
     * complexity in your application to handle the threads. With other
     * languages that don't support threading, such as PHP, you must upload
     * or delete items one at a time. In both situations, the
     * <i>BatchWriteItem</i> API provides an alternative where the API
     * performs the specified put and delete operations in parallel, giving
     * you the power of the thread pool approach without having to introduce
     * complexity in your application.
     * </p>
     * <p>
     * Note that each individual put and delete specified in a
     * <i>BatchWriteItem</i> operation costs the same in terms of consumed
     * capacity units, however, the API performs the specified operations in
     * parallel giving you lower latency. Delete operations on non-existent
     * items consume 1 write capacity unit.
     * </p>
     * <p>
     * When using this API, note the following limitations:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * <i>Maximum operations in a single request-</i> You can specify a
     * total of up to 25 put or delete operations; however, the total request
     * size cannot exceed 1 MB (the HTTP payload).
     * </p>
     * </li>
     * <li> <p>
     * You can use the <i>BatchWriteItem</i> operation only to put and delete
     * items. You cannot use it to update existing items.
     * </p>
     * </li>
     * <li> <p>
     * <i>Not an atomic operation-</i> The individual <i>PutItem</i> and
     * <i>DeleteItem</i> operations specified in <i>BatchWriteItem</i> are
     * atomic; however <i>BatchWriteItem</i> as a whole is a "best-effort"
     * operation and not an atomic operation. That is, in a
     * <i>BatchWriteItem</i> request, some operations might succeed and
     * others might fail. The failed operations are returned in
     * <i>UnprocessedItems</i> in the response. Some of these failures might
     * be because you exceeded the provisioned throughput configured for the
     * table or a transient failure such as a network error. You can
     * investigate and optionally resend the requests. Typically, you call
     * <i>BatchWriteItem</i> in a loop and in each iteration check for
     * unprocessed items, and submit a new <i>BatchWriteItem</i> request with
     * those unprocessed items.
     * </p>
     * </li>
     * <li> <p>
     * <i>Does not return any items-</i> The <i>BatchWriteItem</i> is
     * designed for uploading large amounts of data efficiently. It does not
     * provide some of the sophistication offered by APIs such as
     * <i>PutItem</i> and <i>DeleteItem</i> . For example, the
     * <i>DeleteItem</i> API supports <i>ReturnValues</i> in the request body
     * to request the deleted item in the response. The <i>BatchWriteItem</i>
     * operation does not return any items in the response.
     * </p>
     * </li>
     * <li> <p>
     * Unlike the <i>PutItem</i> and <i>DeleteItem</i> APIs,
     * <i>BatchWriteItem</i> does not allow you to specify conditions on
     * individual write requests in the operation.
     * </p>
     * </li>
     * <li> <p>
     * Attribute values must not be null; string and binary type attributes
     * must have lengths greater than zero; and set type attributes must not
     * be empty. Requests that have empty values will be rejected with a
     * <i>ValidationException</i> .
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * Amazon DynamoDB rejects the entire batch write operation if any one of
     * the following is true:
     * <ul>
     * <li> <p>
     * If one or more tables specified in the <i>BatchWriteItem</i> request
     * does not exist.
     * </p>
     * </li>
     * <li> <p>
     * If primary key attributes specified on an item in the request does not
     * match the corresponding table's primary key schema.
     * </p>
     * </li>
     * <li> <p>
     * If you try to perform multiple operations on the same item in the same
     * <i>BatchWriteItem</i> request. For example, you cannot put and delete
     * the same item in the same <i>BatchWriteItem</i> request.
     * </p>
     * </li>
     * <li> <p>
     * If the total request size exceeds the 1 MB request size (the HTTP
     * payload) limit.
     * </p>
     * </li>
     * <li> <p>
     * If any individual item in a batch exceeds the 64 KB item size limit.
     * </p>
     * </li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param batchWriteItemRequest Container for the necessary parameters to
     *           execute the BatchWriteItem operation on AmazonDynamoDBv2.
     * 
     * @return A Java Future object containing the response from the
     *         BatchWriteItem service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * This operation enables you to put or delete several items across
     * multiple tables in a single API call.
     * </p>
     * <p>
     * To upload one item, you can use the <i>PutItem</i> API and to delete
     * one item, you can use the <i>DeleteItem</i> API. However, when you
     * want to upload or delete large amounts of data, such as uploading
     * large amounts of data from Amazon Elastic MapReduce (EMR) or migrate
     * data from another database into Amazon DynamoDB, this API offers an
     * efficient alternative.
     * </p>
     * <p>
     * If you use a programming language that supports concurrency, such as
     * Java, you can use threads to upload items in parallel. This adds
     * complexity in your application to handle the threads. With other
     * languages that don't support threading, such as PHP, you must upload
     * or delete items one at a time. In both situations, the
     * <i>BatchWriteItem</i> API provides an alternative where the API
     * performs the specified put and delete operations in parallel, giving
     * you the power of the thread pool approach without having to introduce
     * complexity in your application.
     * </p>
     * <p>
     * Note that each individual put and delete specified in a
     * <i>BatchWriteItem</i> operation costs the same in terms of consumed
     * capacity units, however, the API performs the specified operations in
     * parallel giving you lower latency. Delete operations on non-existent
     * items consume 1 write capacity unit.
     * </p>
     * <p>
     * When using this API, note the following limitations:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * <i>Maximum operations in a single request-</i> You can specify a
     * total of up to 25 put or delete operations; however, the total request
     * size cannot exceed 1 MB (the HTTP payload).
     * </p>
     * </li>
     * <li> <p>
     * You can use the <i>BatchWriteItem</i> operation only to put and delete
     * items. You cannot use it to update existing items.
     * </p>
     * </li>
     * <li> <p>
     * <i>Not an atomic operation-</i> The individual <i>PutItem</i> and
     * <i>DeleteItem</i> operations specified in <i>BatchWriteItem</i> are
     * atomic; however <i>BatchWriteItem</i> as a whole is a "best-effort"
     * operation and not an atomic operation. That is, in a
     * <i>BatchWriteItem</i> request, some operations might succeed and
     * others might fail. The failed operations are returned in
     * <i>UnprocessedItems</i> in the response. Some of these failures might
     * be because you exceeded the provisioned throughput configured for the
     * table or a transient failure such as a network error. You can
     * investigate and optionally resend the requests. Typically, you call
     * <i>BatchWriteItem</i> in a loop and in each iteration check for
     * unprocessed items, and submit a new <i>BatchWriteItem</i> request with
     * those unprocessed items.
     * </p>
     * </li>
     * <li> <p>
     * <i>Does not return any items-</i> The <i>BatchWriteItem</i> is
     * designed for uploading large amounts of data efficiently. It does not
     * provide some of the sophistication offered by APIs such as
     * <i>PutItem</i> and <i>DeleteItem</i> . For example, the
     * <i>DeleteItem</i> API supports <i>ReturnValues</i> in the request body
     * to request the deleted item in the response. The <i>BatchWriteItem</i>
     * operation does not return any items in the response.
     * </p>
     * </li>
     * <li> <p>
     * Unlike the <i>PutItem</i> and <i>DeleteItem</i> APIs,
     * <i>BatchWriteItem</i> does not allow you to specify conditions on
     * individual write requests in the operation.
     * </p>
     * </li>
     * <li> <p>
     * Attribute values must not be null; string and binary type attributes
     * must have lengths greater than zero; and set type attributes must not
     * be empty. Requests that have empty values will be rejected with a
     * <i>ValidationException</i> .
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * Amazon DynamoDB rejects the entire batch write operation if any one of
     * the following is true:
     * <ul>
     * <li> <p>
     * If one or more tables specified in the <i>BatchWriteItem</i> request
     * does not exist.
     * </p>
     * </li>
     * <li> <p>
     * If primary key attributes specified on an item in the request does not
     * match the corresponding table's primary key schema.
     * </p>
     * </li>
     * <li> <p>
     * If you try to perform multiple operations on the same item in the same
     * <i>BatchWriteItem</i> request. For example, you cannot put and delete
     * the same item in the same <i>BatchWriteItem</i> request.
     * </p>
     * </li>
     * <li> <p>
     * If the total request size exceeds the 1 MB request size (the HTTP
     * payload) limit.
     * </p>
     * </li>
     * <li> <p>
     * If any individual item in a batch exceeds the 64 KB item size limit.
     * </p>
     * </li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param batchWriteItemRequest Container for the necessary parameters to
     *           execute the BatchWriteItem operation on AmazonDynamoDBv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BatchWriteItem service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * Returns information about the table, including the current status of
     * the table, when it was created, the primary key schema, and any
     * indexes on the table.
     * </p>
     *
     * @param describeTableRequest Container for the necessary parameters to
     *           execute the DescribeTable operation on AmazonDynamoDBv2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTable service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * Returns information about the table, including the current status of
     * the table, when it was created, the primary key schema, and any
     * indexes on the table.
     * </p>
     *
     * @param describeTableRequest Container for the necessary parameters to
     *           execute the DescribeTable operation on AmazonDynamoDBv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTable service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * The <i>GetItem</i> operation returns a set of attributes for the item
     * with the given primary key. If there is no matching item,
     * <i>GetItem</i> does not return any data.
     * </p>
     * <p>
     * <i>GetItem</i> provides an eventually consistent read by default. If
     * your application requires a strongly consistent read, set
     * <i>ConsistentRead</i> to <code>true</code> . Although a strongly
     * consistent read might take more time than an eventually consistent
     * read, it always returns the last updated value.
     * </p>
     *
     * @param getItemRequest Container for the necessary parameters to
     *           execute the GetItem operation on AmazonDynamoDBv2.
     * 
     * @return A Java Future object containing the response from the GetItem
     *         service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * The <i>GetItem</i> operation returns a set of attributes for the item
     * with the given primary key. If there is no matching item,
     * <i>GetItem</i> does not return any data.
     * </p>
     * <p>
     * <i>GetItem</i> provides an eventually consistent read by default. If
     * your application requires a strongly consistent read, set
     * <i>ConsistentRead</i> to <code>true</code> . Although a strongly
     * consistent read might take more time than an eventually consistent
     * read, it always returns the last updated value.
     * </p>
     *
     * @param getItemRequest Container for the necessary parameters to
     *           execute the GetItem operation on AmazonDynamoDBv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the GetItem
     *         service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * Deletes a single item in a table by primary key. You can perform a
     * conditional delete operation that deletes the item if it exists, or if
     * it has an expected attribute value.
     * </p>
     * <p>
     * In addition to deleting an item, you can also return the item's
     * attribute values in the same operation, using the <i>ReturnValues</i>
     * parameter.
     * </p>
     * <p>
     * Unless you specify conditions, the <i>DeleteItem</i> is an idempotent
     * operation; running it multiple times on the same item or attribute
     * does <i>not</i> result in an error response.
     * </p>
     * <p>
     * Conditional deletes are useful for only deleting items if specific
     * conditions are met. If those conditions are met, Amazon DynamoDB
     * performs the delete. Otherwise, the item is not deleted.
     * </p>
     *
     * @param deleteItemRequest Container for the necessary parameters to
     *           execute the DeleteItem operation on AmazonDynamoDBv2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteItem service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * Deletes a single item in a table by primary key. You can perform a
     * conditional delete operation that deletes the item if it exists, or if
     * it has an expected attribute value.
     * </p>
     * <p>
     * In addition to deleting an item, you can also return the item's
     * attribute values in the same operation, using the <i>ReturnValues</i>
     * parameter.
     * </p>
     * <p>
     * Unless you specify conditions, the <i>DeleteItem</i> is an idempotent
     * operation; running it multiple times on the same item or attribute
     * does <i>not</i> result in an error response.
     * </p>
     * <p>
     * Conditional deletes are useful for only deleting items if specific
     * conditions are met. If those conditions are met, Amazon DynamoDB
     * performs the delete. Otherwise, the item is not deleted.
     * </p>
     *
     * @param deleteItemRequest Container for the necessary parameters to
     *           execute the DeleteItem operation on AmazonDynamoDBv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteItem service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * The <i>CreateTable</i> operation adds a new table to your account. In
     * an AWS account, table names must be unique within each region. That
     * is, you can have two tables with same name if you create the tables in
     * different regions.
     * </p>
     * <p>
     * <i>CreateTable</i> is an asynchronous operation. Upon receiving a
     * <i>CreateTable</i> request, Amazon DynamoDB immediately returns a
     * response with a <i>TableStatus</i> of <code>CREATING</code> . After
     * the table is created, Amazon DynamoDB sets the <i>TableStatus</i> to
     * <code>ACTIVE</code> . You can perform read and write operations only
     * on an <code>ACTIVE</code> table.
     * </p>
     * <p>
     * If you want to create multiple tables with local secondary indexes on
     * them, you must create them sequentially. Only one table with local
     * secondary indexes can be in the <code>CREATING</code> state at any
     * given time.
     * </p>
     * <p>
     * You can use the <i>DescribeTable</i> API to check the table status.
     * </p>
     *
     * @param createTableRequest Container for the necessary parameters to
     *           execute the CreateTable operation on AmazonDynamoDBv2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTable service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * The <i>CreateTable</i> operation adds a new table to your account. In
     * an AWS account, table names must be unique within each region. That
     * is, you can have two tables with same name if you create the tables in
     * different regions.
     * </p>
     * <p>
     * <i>CreateTable</i> is an asynchronous operation. Upon receiving a
     * <i>CreateTable</i> request, Amazon DynamoDB immediately returns a
     * response with a <i>TableStatus</i> of <code>CREATING</code> . After
     * the table is created, Amazon DynamoDB sets the <i>TableStatus</i> to
     * <code>ACTIVE</code> . You can perform read and write operations only
     * on an <code>ACTIVE</code> table.
     * </p>
     * <p>
     * If you want to create multiple tables with local secondary indexes on
     * them, you must create them sequentially. Only one table with local
     * secondary indexes can be in the <code>CREATING</code> state at any
     * given time.
     * </p>
     * <p>
     * You can use the <i>DescribeTable</i> API to check the table status.
     * </p>
     *
     * @param createTableRequest Container for the necessary parameters to
     *           execute the CreateTable operation on AmazonDynamoDBv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTable service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * A <i>Query</i> operation directly accesses items from a table using
     * the table primary key, or from an index using the index key. You must
     * provide a specific hash key value. You can narrow the scope of the
     * query by using comparison operators on the range key value, or on the
     * index key. You can use the <i>ScanIndexForward</i> parameter to get
     * results in forward or reverse order, by range key or by index key.
     * </p>
     * <p>
     * Queries that do not return results consume the minimum read capacity
     * units according to the type of read.
     * </p>
     * <p>
     * If the total number of items meeting the query criteria exceeds the
     * result set size limit of 1 MB, the query stops and results are
     * returned to the user with a <i>LastEvaluatedKey</i> to continue the
     * query in a subsequent operation. Unlike a <i>Scan</i> operation, a
     * <i>Query</i> operation never returns an empty result set <i>and</i> a
     * <i>LastEvaluatedKey</i> . The
     * <i>LastEvaluatedKey</i> is only provided if the results exceed 1 MB,
     * or if you have used <i>Limit</i> .
     * </p>
     * <p>
     * To request a strongly consistent result, set <i>ConsistentRead</i> to
     * true.
     * </p>
     *
     * @param queryRequest Container for the necessary parameters to execute
     *           the Query operation on AmazonDynamoDBv2.
     * 
     * @return A Java Future object containing the response from the Query
     *         service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * A <i>Query</i> operation directly accesses items from a table using
     * the table primary key, or from an index using the index key. You must
     * provide a specific hash key value. You can narrow the scope of the
     * query by using comparison operators on the range key value, or on the
     * index key. You can use the <i>ScanIndexForward</i> parameter to get
     * results in forward or reverse order, by range key or by index key.
     * </p>
     * <p>
     * Queries that do not return results consume the minimum read capacity
     * units according to the type of read.
     * </p>
     * <p>
     * If the total number of items meeting the query criteria exceeds the
     * result set size limit of 1 MB, the query stops and results are
     * returned to the user with a <i>LastEvaluatedKey</i> to continue the
     * query in a subsequent operation. Unlike a <i>Scan</i> operation, a
     * <i>Query</i> operation never returns an empty result set <i>and</i> a
     * <i>LastEvaluatedKey</i> . The
     * <i>LastEvaluatedKey</i> is only provided if the results exceed 1 MB,
     * or if you have used <i>Limit</i> .
     * </p>
     * <p>
     * To request a strongly consistent result, set <i>ConsistentRead</i> to
     * true.
     * </p>
     *
     * @param queryRequest Container for the necessary parameters to execute
     *           the Query operation on AmazonDynamoDBv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Query
     *         service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * Creates a new item, or replaces an old item with a new item. If an
     * item already exists in the specified table with the same primary key,
     * the new item completely replaces the existing item. You can perform a
     * conditional put (insert a new item if one with the specified primary
     * key doesn't exist), or replace an existing item if it has certain
     * attribute values.
     * </p>
     * <p>
     * In addition to putting an item, you can also return the item's
     * attribute values in the same operation, using the <i>ReturnValues</i>
     * parameter.
     * </p>
     * <p>
     * When you add an item, the primary key attribute(s) are the only
     * required attributes. Attribute values cannot be null. String and
     * binary type attributes must have lengths greater than zero. Set type
     * attributes cannot be empty. Requests with empty values will be
     * rejected with a <i>ValidationException</i> .
     * </p>
     * <p>
     * You can request that <i>PutItem</i> return either a copy of the old
     * item (before the update) or a copy of the new item (after the update).
     * For more information, see the <i>ReturnValues</i> description.
     * </p>
     * <p>
     * <b>NOTE:</b> To prevent a new item from replacing an existing item,
     * use a conditional put operation with Exists set to false for the
     * primary key attribute, or attributes.
     * </p>
     * <p>
     * For more information about using this API, see <a
     * zon.com/amazondynamodb/latest/developerguide/WorkingWithDDItems.html">
     * Working with Items </a> of the <i>Amazon DynamoDB Developer
     * Guide</i> .
     * </p>
     *
     * @param putItemRequest Container for the necessary parameters to
     *           execute the PutItem operation on AmazonDynamoDBv2.
     * 
     * @return A Java Future object containing the response from the PutItem
     *         service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * Creates a new item, or replaces an old item with a new item. If an
     * item already exists in the specified table with the same primary key,
     * the new item completely replaces the existing item. You can perform a
     * conditional put (insert a new item if one with the specified primary
     * key doesn't exist), or replace an existing item if it has certain
     * attribute values.
     * </p>
     * <p>
     * In addition to putting an item, you can also return the item's
     * attribute values in the same operation, using the <i>ReturnValues</i>
     * parameter.
     * </p>
     * <p>
     * When you add an item, the primary key attribute(s) are the only
     * required attributes. Attribute values cannot be null. String and
     * binary type attributes must have lengths greater than zero. Set type
     * attributes cannot be empty. Requests with empty values will be
     * rejected with a <i>ValidationException</i> .
     * </p>
     * <p>
     * You can request that <i>PutItem</i> return either a copy of the old
     * item (before the update) or a copy of the new item (after the update).
     * For more information, see the <i>ReturnValues</i> description.
     * </p>
     * <p>
     * <b>NOTE:</b> To prevent a new item from replacing an existing item,
     * use a conditional put operation with Exists set to false for the
     * primary key attribute, or attributes.
     * </p>
     * <p>
     * For more information about using this API, see <a
     * zon.com/amazondynamodb/latest/developerguide/WorkingWithDDItems.html">
     * Working with Items </a> of the <i>Amazon DynamoDB Developer
     * Guide</i> .
     * </p>
     *
     * @param putItemRequest Container for the necessary parameters to
     *           execute the PutItem operation on AmazonDynamoDBv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the PutItem
     *         service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * Returns an array of all the tables associated with the current account
     * and endpoint.
     * </p>
     * <p>
     * Each Amazon DynamoDB endpoint is entirely independent. For example, if
     * you have two tables called "MyTable," one in
     * <i>dynamodb.us-east-1.amazonaws.com</i> and one in
     * <i>dynamodb.us-west-1.amazonaws.com</i> , they are completely
     * independent and do not share any data. The <i>ListTables</i> operation
     * returns all of the table names associated with the account making the
     * request, for the endpoint that receives the request.
     * </p>
     *
     * @param listTablesRequest Container for the necessary parameters to
     *           execute the ListTables operation on AmazonDynamoDBv2.
     * 
     * @return A Java Future object containing the response from the
     *         ListTables service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * Returns an array of all the tables associated with the current account
     * and endpoint.
     * </p>
     * <p>
     * Each Amazon DynamoDB endpoint is entirely independent. For example, if
     * you have two tables called "MyTable," one in
     * <i>dynamodb.us-east-1.amazonaws.com</i> and one in
     * <i>dynamodb.us-west-1.amazonaws.com</i> , they are completely
     * independent and do not share any data. The <i>ListTables</i> operation
     * returns all of the table names associated with the account making the
     * request, for the endpoint that receives the request.
     * </p>
     *
     * @param listTablesRequest Container for the necessary parameters to
     *           execute the ListTables operation on AmazonDynamoDBv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTables service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * Edits an existing item's attributes, or inserts a new item if it does
     * not already exist. You can put, delete, or add attribute values. You
     * can also perform a conditional update (insert a new attribute
     * name-value pair if it doesn't exist, or replace an existing name-value
     * pair if it has certain expected attribute values).
     * </p>
     * <p>
     * In addition to updating an item, you can also return the item's
     * attribute values in the same operation, using the <i>ReturnValues</i>
     * parameter.
     * </p>
     *
     * @param updateItemRequest Container for the necessary parameters to
     *           execute the UpdateItem operation on AmazonDynamoDBv2.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateItem service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * Edits an existing item's attributes, or inserts a new item if it does
     * not already exist. You can put, delete, or add attribute values. You
     * can also perform a conditional update (insert a new attribute
     * name-value pair if it doesn't exist, or replace an existing name-value
     * pair if it has certain expected attribute values).
     * </p>
     * <p>
     * In addition to updating an item, you can also return the item's
     * attribute values in the same operation, using the <i>ReturnValues</i>
     * parameter.
     * </p>
     *
     * @param updateItemRequest Container for the necessary parameters to
     *           execute the UpdateItem operation on AmazonDynamoDBv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateItem service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * The <i>BatchGetItem</i> operation returns the attributes for multiple
     * items from multiple tables using their primary keys. The maximum
     * number of items that can be retrieved for a single operation is 100.
     * Also, the number of items retrieved is constrained by a 1 MB size
     * limit. If the response size limit is exceeded or a partial result is
     * returned because the table???s provisioned throughput is exceeded, or
     * because of an internal processing failure, Amazon DynamoDB returns an
     * <i>UnprocessedKeys</i> value so you can retry the operation starting
     * with the next item to get. Amazon DynamoDB automatically adjusts the
     * number of items returned per page to enforce this limit. For example,
     * even if you ask to retrieve 100 items, but each individual item is 50
     * KB in size, the system returns 20 items and an appropriate
     * <i>UnprocessedKeys</i> value so you can get the next page of results.
     * If desired, your application can include its own logic to assemble the
     * pages of results into one set.
     * </p>
     * <p>
     * If no items could be processed because of insufficient provisioned
     * throughput on each of the tables involved in the request, Amazon
     * DynamoDB returns a <i>ProvisionedThroughputExceededException</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> By default, BatchGetItem performs eventually consistent
     * reads on every table in the request. You can set ConsistentRead to
     * true, on a per-table basis, if you want consistent reads instead.
     * BatchGetItem fetches items in parallel to minimize response latencies.
     * When designing your application, keep in mind that Amazon DynamoDB
     * does not guarantee how attributes are ordered in the returned
     * response. Include the primary key values in the AttributesToGet for
     * the items in your request to help parse the response by item. If the
     * requested items do not exist, nothing is returned in the response for
     * those items. Requests for non-existent items consume the minimum read
     * capacity units according to the type of read. For more information,
     * see Capacity Units Calculations of the Amazon DynamoDB Developer
     * Guide.
     * </p>
     *
     * @param batchGetItemRequest Container for the necessary parameters to
     *           execute the BatchGetItem operation on AmazonDynamoDBv2.
     * 
     * @return A Java Future object containing the response from the
     *         BatchGetItem service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
     * The <i>BatchGetItem</i> operation returns the attributes for multiple
     * items from multiple tables using their primary keys. The maximum
     * number of items that can be retrieved for a single operation is 100.
     * Also, the number of items retrieved is constrained by a 1 MB size
     * limit. If the response size limit is exceeded or a partial result is
     * returned because the table???s provisioned throughput is exceeded, or
     * because of an internal processing failure, Amazon DynamoDB returns an
     * <i>UnprocessedKeys</i> value so you can retry the operation starting
     * with the next item to get. Amazon DynamoDB automatically adjusts the
     * number of items returned per page to enforce this limit. For example,
     * even if you ask to retrieve 100 items, but each individual item is 50
     * KB in size, the system returns 20 items and an appropriate
     * <i>UnprocessedKeys</i> value so you can get the next page of results.
     * If desired, your application can include its own logic to assemble the
     * pages of results into one set.
     * </p>
     * <p>
     * If no items could be processed because of insufficient provisioned
     * throughput on each of the tables involved in the request, Amazon
     * DynamoDB returns a <i>ProvisionedThroughputExceededException</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> By default, BatchGetItem performs eventually consistent
     * reads on every table in the request. You can set ConsistentRead to
     * true, on a per-table basis, if you want consistent reads instead.
     * BatchGetItem fetches items in parallel to minimize response latencies.
     * When designing your application, keep in mind that Amazon DynamoDB
     * does not guarantee how attributes are ordered in the returned
     * response. Include the primary key values in the AttributesToGet for
     * the items in your request to help parse the response by item. If the
     * requested items do not exist, nothing is returned in the response for
     * those items. Requests for non-existent items consume the minimum read
     * capacity units according to the type of read. For more information,
     * see Capacity Units Calculations of the Amazon DynamoDB Developer
     * Guide.
     * </p>
     *
     * @param batchGetItemRequest Container for the necessary parameters to
     *           execute the BatchGetItem operation on AmazonDynamoDBv2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BatchGetItem service method, as returned by AmazonDynamoDBv2.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
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
        