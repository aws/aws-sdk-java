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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.json.JSONObject;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.services.dynamodbv2.model.transform.*;


/**
 * Client for accessing AmazonDynamoDBv2.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon DynamoDB <b>Overview</b> <p>
 * This is the Amazon DynamoDB API Reference. This guide provides descriptions and samples of the Amazon DynamoDB API.
 * </p>
 */
public class AmazonDynamoDBClient extends AmazonWebServiceClient implements AmazonDynamoDB {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDynamoDB.class);

    /**
     * List of exception unmarshallers for all AmazonDynamoDBv2 exceptions.
     */
    protected List<Unmarshaller<AmazonServiceException, JSONObject>> exceptionUnmarshallers;

    
    /** AWS signer for authenticating requests. */
    private AWS4Signer signer;


    /**
     * Constructs a new client to invoke service methods on
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
    public AmazonDynamoDBClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
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
    public AmazonDynamoDBClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonDynamoDBv2 using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonDynamoDBClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonDynamoDBv2 using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonDynamoDBv2
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonDynamoDBClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonDynamoDBv2 using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonDynamoDBClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonDynamoDBv2 using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonDynamoDBv2
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonDynamoDBClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }


    private void init() {
        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, JSONObject>>();
        exceptionUnmarshallers.add(new ProvisionedThroughputExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ItemCollectionSizeLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ConditionalCheckFailedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new JsonErrorUnmarshaller());
        setEndpoint("dynamodb.us-east-1.amazonaws.com/");

        signer = new AWS4Signer();
        
        signer.setServiceName("dynamodb");
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/dynamodbv2/request.handlers"));

        
        clientConfiguration = new ClientConfiguration(clientConfiguration);
        if (clientConfiguration.getMaxErrorRetry() == ClientConfiguration.DEFAULT_MAX_RETRIES) {
            log.debug("Overriding default max error retry value to: " + 10);
            clientConfiguration.setMaxErrorRetry(10);
        }
        setConfiguration(clientConfiguration);
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
     *           the Scan service method on AmazonDynamoDBv2.
     * 
     * @return The response from the Scan service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ScanResult scan(ScanRequest scanRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<ScanRequest> request = new ScanRequestMarshaller().marshall(scanRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<ScanResult, JsonUnmarshallerContext> unmarshaller = new ScanResultJsonUnmarshaller();
        
        JsonResponseHandler<ScanResult> responseHandler = new JsonResponseHandler<ScanResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
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
     *           execute the UpdateTable service method on AmazonDynamoDBv2.
     * 
     * @return The response from the UpdateTable service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateTableResult updateTable(UpdateTableRequest updateTableRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<UpdateTableRequest> request = new UpdateTableRequestMarshaller().marshall(updateTableRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<UpdateTableResult, JsonUnmarshallerContext> unmarshaller = new UpdateTableResultJsonUnmarshaller();
        
        JsonResponseHandler<UpdateTableResult> responseHandler = new JsonResponseHandler<UpdateTableResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
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
     *           execute the DeleteTable service method on AmazonDynamoDBv2.
     * 
     * @return The response from the DeleteTable service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ResourceInUseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteTableResult deleteTable(DeleteTableRequest deleteTableRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DeleteTableRequest> request = new DeleteTableRequestMarshaller().marshall(deleteTableRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DeleteTableResult, JsonUnmarshallerContext> unmarshaller = new DeleteTableResultJsonUnmarshaller();
        
        JsonResponseHandler<DeleteTableResult> responseHandler = new JsonResponseHandler<DeleteTableResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
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
     *           execute the BatchWriteItem service method on AmazonDynamoDBv2.
     * 
     * @return The response from the BatchWriteItem service method, as
     *         returned by AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchWriteItemResult batchWriteItem(BatchWriteItemRequest batchWriteItemRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<BatchWriteItemRequest> request = new BatchWriteItemRequestMarshaller().marshall(batchWriteItemRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<BatchWriteItemResult, JsonUnmarshallerContext> unmarshaller = new BatchWriteItemResultJsonUnmarshaller();
        
        JsonResponseHandler<BatchWriteItemResult> responseHandler = new JsonResponseHandler<BatchWriteItemResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Returns information about the table, including the current status of
     * the table, when it was created, the primary key schema, and any
     * indexes on the table.
     * </p>
     *
     * @param describeTableRequest Container for the necessary parameters to
     *           execute the DescribeTable service method on AmazonDynamoDBv2.
     * 
     * @return The response from the DescribeTable service method, as
     *         returned by AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTableResult describeTable(DescribeTableRequest describeTableRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeTableRequest> request = new DescribeTableRequestMarshaller().marshall(describeTableRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeTableResult, JsonUnmarshallerContext> unmarshaller = new DescribeTableResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeTableResult> responseHandler = new JsonResponseHandler<DescribeTableResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
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
     *           execute the GetItem service method on AmazonDynamoDBv2.
     * 
     * @return The response from the GetItem service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetItemResult getItem(GetItemRequest getItemRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<GetItemRequest> request = new GetItemRequestMarshaller().marshall(getItemRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<GetItemResult, JsonUnmarshallerContext> unmarshaller = new GetItemResultJsonUnmarshaller();
        
        JsonResponseHandler<GetItemResult> responseHandler = new JsonResponseHandler<GetItemResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
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
     *           execute the DeleteItem service method on AmazonDynamoDBv2.
     * 
     * @return The response from the DeleteItem service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteItemResult deleteItem(DeleteItemRequest deleteItemRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DeleteItemRequest> request = new DeleteItemRequestMarshaller().marshall(deleteItemRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DeleteItemResult, JsonUnmarshallerContext> unmarshaller = new DeleteItemResultJsonUnmarshaller();
        
        JsonResponseHandler<DeleteItemResult> responseHandler = new JsonResponseHandler<DeleteItemResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
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
     *           execute the CreateTable service method on AmazonDynamoDBv2.
     * 
     * @return The response from the CreateTable service method, as returned
     *         by AmazonDynamoDBv2.
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
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateTableResult createTable(CreateTableRequest createTableRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<CreateTableRequest> request = new CreateTableRequestMarshaller().marshall(createTableRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<CreateTableResult, JsonUnmarshallerContext> unmarshaller = new CreateTableResultJsonUnmarshaller();
        
        JsonResponseHandler<CreateTableResult> responseHandler = new JsonResponseHandler<CreateTableResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
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
     *           the Query service method on AmazonDynamoDBv2.
     * 
     * @return The response from the Query service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public QueryResult query(QueryRequest queryRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<QueryRequest> request = new QueryRequestMarshaller().marshall(queryRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<QueryResult, JsonUnmarshallerContext> unmarshaller = new QueryResultJsonUnmarshaller();
        
        JsonResponseHandler<QueryResult> responseHandler = new JsonResponseHandler<QueryResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
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
     *           execute the PutItem service method on AmazonDynamoDBv2.
     * 
     * @return The response from the PutItem service method, as returned by
     *         AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutItemResult putItem(PutItemRequest putItemRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<PutItemRequest> request = new PutItemRequestMarshaller().marshall(putItemRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<PutItemResult, JsonUnmarshallerContext> unmarshaller = new PutItemResultJsonUnmarshaller();
        
        JsonResponseHandler<PutItemResult> responseHandler = new JsonResponseHandler<PutItemResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
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
     *           execute the ListTables service method on AmazonDynamoDBv2.
     * 
     * @return The response from the ListTables service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTablesResult listTables(ListTablesRequest listTablesRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<ListTablesRequest> request = new ListTablesRequestMarshaller().marshall(listTablesRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<ListTablesResult, JsonUnmarshallerContext> unmarshaller = new ListTablesResultJsonUnmarshaller();
        
        JsonResponseHandler<ListTablesResult> responseHandler = new JsonResponseHandler<ListTablesResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
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
     *           execute the UpdateItem service method on AmazonDynamoDBv2.
     * 
     * @return The response from the UpdateItem service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ItemCollectionSizeLimitExceededException
     * @throws ResourceNotFoundException
     * @throws ConditionalCheckFailedException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateItemResult updateItem(UpdateItemRequest updateItemRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<UpdateItemRequest> request = new UpdateItemRequestMarshaller().marshall(updateItemRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<UpdateItemResult, JsonUnmarshallerContext> unmarshaller = new UpdateItemResultJsonUnmarshaller();
        
        JsonResponseHandler<UpdateItemResult> responseHandler = new JsonResponseHandler<UpdateItemResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
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
     *           execute the BatchGetItem service method on AmazonDynamoDBv2.
     * 
     * @return The response from the BatchGetItem service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws ResourceNotFoundException
     * @throws ProvisionedThroughputExceededException
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BatchGetItemResult batchGetItem(BatchGetItemRequest batchGetItemRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<BatchGetItemRequest> request = new BatchGetItemRequestMarshaller().marshall(batchGetItemRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<BatchGetItemResult, JsonUnmarshallerContext> unmarshaller = new BatchGetItemResultJsonUnmarshaller();
        
        JsonResponseHandler<BatchGetItemResult> responseHandler = new JsonResponseHandler<BatchGetItemResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
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
     * @return The response from the ListTables service method, as returned
     *         by AmazonDynamoDBv2.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonDynamoDBv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTablesResult listTables() throws AmazonServiceException, AmazonClientException {
        return listTables(new ListTablesRequest());
    }
    
    /**
     * Overrides the default endpoint for this client ("http://dynamodb.us-east-1.amazonaws.com/") and explicitly provides
     * an AWS region ID and AWS service name to use when the client calculates a signature
     * for requests.  In almost all cases, this region ID and service name
     * are automatically determined from the endpoint, and callers should use the simpler
     * one-argument form of setEndpoint instead of this method.
     * <p>
     * <b>This method is not threadsafe. Endpoints should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit.</b>
     * <p>
     * Callers can pass in just the endpoint (ex: "dynamodb.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "http://dynamodb.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "dynamodb.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "http://dynamodb.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @param serviceName
     *            The name of the AWS service to use when signing requests.
     * @param regionId
     *            The ID of the region in which this service resides.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     * @see AmazonDynamoDB#setRegion(Region)     
     */
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        setEndpoint(endpoint);
        signer.setServiceName(serviceName);
        signer.setRegionName(regionId);
    }
    
    @Override
    protected String getServiceAbbreviation() {
        return "dynamodb";
    }
    

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request,
                                                                HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
                                                                ExecutionContext executionContext) throws AmazonClientException {

        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();

        awsRequestMetrics.startEvent(Field.CredentialsRequestTime.name());
        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        awsRequestMetrics.endEvent(Field.CredentialsRequestTime.name());

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);

        executionContext.setCustomBackoffStrategy(com.amazonaws.internal.DynamoDBBackoffStrategy.DEFAULT);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(exceptionUnmarshallers);

        awsRequestMetrics.startEvent(Field.ClientExecuteTime.name());
        X result = (X) client.execute(request, responseHandler, errorResponseHandler, executionContext);
        awsRequestMetrics.endEvent(Field.ClientExecuteTime.name());

        awsRequestMetrics.log();

        return result;
    }
}
        