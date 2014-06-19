/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.services.dynamodbv2.model.transform.*;

/**
 * Client for accessing AmazonDynamoDBv2.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon DynamoDB <b>Overview</b> <p>
 * This is the Amazon DynamoDB API Reference. This guide provides
 * descriptions and samples of the low-level DynamoDB API. For
 * information about DynamoDB application development, go to the
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/"> Amazon DynamoDB Developer Guide </a>
 * .
 * </p>
 * <p>
 * Instead of making the requests to the low-level DynamoDB API directly
 * from your application, we recommend that you use the AWS Software
 * Development Kits (SDKs). The easy-to-use libraries in the AWS SDKs
 * make it unnecessary to call the low-level DynamoDB API directly from
 * your application. The libraries take care of request authentication,
 * serialization, and connection management. For more information, go to
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/UsingAWSSDK.html"> Using the AWS SDKs with DynamoDB </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 * <p>
 * If you decide to code against the low-level DynamoDB API directly, you
 * will need to write the necessary code to authenticate your requests.
 * For more information on signing your requests, go to
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/API.html"> Using the DynamoDB API </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 * <p>
 * The following are short descriptions of each low-level API action,
 * organized by function.
 * </p>
 * <p>
 * <b>Managing Tables</b>
 * </p>
 * <p>
 * 
 * <ul>
 * <li> <p>
 * <i>CreateTable</i> - Creates a table with user-specified provisioned
 * throughput settings. You must designate one attribute as the hash
 * primary key for the table; you can optionally designate a second
 * attribute as the range primary key. DynamoDB creates indexes on these
 * key attributes for fast data access. Optionally, you can create one or
 * more secondary indexes, which provide fast data access using non-key
 * attributes.
 * </p>
 * </li>
 * <li> <p>
 * <i>DescribeTable</i> - Returns metadata for a table, such as table
 * size, status, and index information.
 * </p>
 * </li>
 * <li> <p>
 * <i>UpdateTable</i> - Modifies the provisioned throughput settings for
 * a table. Optionally, you can modify the provisioned throughput
 * settings for global secondary indexes on the table.
 * </p>
 * </li>
 * <li> <p>
 * <i>ListTables</i> - Returns a list of all tables associated with the
 * current AWS account and endpoint.
 * </p>
 * </li>
 * <li> <p>
 * <i>DeleteTable</i> - Deletes a table and all of its indexes.
 * </p>
 * </li>
 * 
 * </ul>
 * 
 * </p>
 * <p>
 * For conceptual information about managing tables, go to
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html"> Working with Tables </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 * <p>
 * <b>Reading Data</b>
 * </p>
 * <p>
 * 
 * <ul>
 * <li> <p>
 * <i>GetItem</i> - Returns a set of attributes for the item that has a
 * given primary key. By default, <i>GetItem</i> performs an eventually
 * consistent read; however, applications can specify a strongly
 * consistent read instead.
 * </p>
 * </li>
 * <li> <p>
 * <i>BatchGetItem</i> - Performs multiple <i>GetItem</i> requests for
 * data items using their primary keys, from one table or multiple
 * tables. The response from <i>BatchGetItem</i> has a size limit of 1 MB
 * and returns a maximum of 100 items. Both eventually consistent and
 * strongly consistent reads can be used.
 * </p>
 * </li>
 * <li> <p>
 * <i>Query</i> - Returns one or more items from a table or a secondary
 * index. You must provide a specific hash key value. You can narrow the
 * scope of the query using comparison operators against a range key
 * value, or on the index key. <i>Query</i> supports either eventual or
 * strong consistency. A single response has a size limit of 1 MB.
 * </p>
 * </li>
 * <li> <p>
 * <i>Scan</i> - Reads every item in a table; the result set is
 * eventually consistent. You can limit the number of items returned by
 * filtering the data attributes, using conditional expressions.
 * <i>Scan</i> can be used to enable ad-hoc querying of a table against
 * non-key attributes; however, since this is a full table scan without
 * using an index, <i>Scan</i> should not be used for any application
 * query use case that requires predictable performance.
 * </p>
 * </li>
 * 
 * </ul>
 * 
 * </p>
 * <p>
 * For conceptual information about reading data, go to
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"> Working with Items </a> and <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"> Query and Scan Operations </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 * <p>
 * <b>Modifying Data</b>
 * </p>
 * <p>
 * 
 * <ul>
 * <li> <p>
 * <i>PutItem</i> - Creates a new item, or replaces an existing item
 * with a new item (including all the attributes). By default, if an item
 * in the table already exists with the same primary key, the new item
 * completely replaces the existing item. You can use conditional
 * operators to replace an item only if its attribute values match
 * certain conditions, or to insert a new item only if that item doesn't
 * already exist.
 * </p>
 * </li>
 * <li> <p>
 * <i>UpdateItem</i> - Modifies the attributes of an existing item. You
 * can also use conditional operators to perform an update only if the
 * item's attribute values match certain conditions.
 * </p>
 * </li>
 * <li> <p>
 * <i>DeleteItem</i> - Deletes an item in a table by primary key. You
 * can use conditional operators to perform a delete an item only if the
 * item's attribute values match certain conditions.
 * </p>
 * </li>
 * <li> <p>
 * <i>BatchWriteItem</i> - Performs multiple <i>PutItem</i> and
 * <i>DeleteItem</i> requests across multiple tables in a single request.
 * A failure of any request(s) in the batch will not cause the entire
 * <i>BatchWriteItem</i> operation to fail. Supports batches of up to 25
 * items to put or delete, with a maximum total request size of 1 MB.
 * </p>
 * </li>
 * 
 * </ul>
 * 
 * </p>
 * <p>
 * For conceptual information about modifying data, go to
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"> Working with Items </a> and <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"> Query and Scan Operations </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 */
public class AmazonDynamoDBClient extends AmazonWebServiceClient implements AmazonDynamoDB {

    // register the service specific set of predefined metrics
    static {
        AwsSdkMetrics.addAll(Arrays.asList(com.amazonaws.services.dynamodbv2.metrics.DynamoDBRequestMetric.values()));
    }

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDynamoDB.class);

    /**
     * List of exception unmarshallers for all AmazonDynamoDBv2 exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

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
     * @see DefaultAWSCredentialsProviderChain
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
     * @see DefaultAWSCredentialsProviderChain
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
        super(adjustClientConfiguration(clientConfiguration));
        
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
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonDynamoDBv2 using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
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
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonDynamoDBClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ProvisionedThroughputExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ItemCollectionSizeLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ConditionalCheckFailedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("dynamodb.us-east-1.amazonaws.com/");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/dynamodbv2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/dynamodbv2/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        config = new ClientConfiguration(orig);
        if (config.getRetryPolicy() == com.amazonaws.retry.PredefinedRetryPolicies.DEFAULT) {
            config.setRetryPolicy(com.amazonaws.retry.PredefinedRetryPolicies.DYNAMODB_DEFAULT);
        }
        return config;
    }

    /**
     * <p>
     * The <i>Scan</i> operation returns one or more items and item
     * attributes by accessing every item in the table. To have DynamoDB
     * return fewer items, you can provide a <i>ScanFilter</i> .
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set
     * size limit of 1 MB, the scan stops and results are returned to the
     * user with a <i>LastEvaluatedKey</i> to continue the scan in a
     * subsequent operation. The results also include the number of items
     * exceeding the limit. A scan can result in no table data meeting the
     * filter criteria.
     * </p>
     * <p>
     * The result set is eventually consistent.
     * </p>
     * <p>
     * By default, <i>Scan</i> operations proceed sequentially; however, for
     * faster performance on large tables, applications can request a
     * parallel <i>Scan</i> by specifying the <i>Segment</i> and
     * <i>TotalSegments</i> parameters. For more information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#QueryAndScanParallelScan"> Parallel Scan </a>
     * in the Amazon DynamoDB Developer Guide.
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
    public ScanResult scan(ScanRequest scanRequest) {
        ExecutionContext executionContext = createExecutionContext(scanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ScanRequest> request = null;
        Response<ScanResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ScanRequestMarshaller().marshall(scanRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ScanResult, JsonUnmarshallerContext> unmarshaller = new ScanResultJsonUnmarshaller();
            JsonResponseHandler<ScanResult> responseHandler = new JsonResponseHandler<ScanResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the provisioned throughput for the given table. Setting the
     * throughput for a table helps you manage performance and is part of the
     * provisioned throughput feature of DynamoDB.
     * </p>
     * <p>
     * The provisioned throughput values can be upgraded or downgraded based
     * on the maximums and minimums listed in the
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"> Limits </a>
     * section in the Amazon DynamoDB Developer Guide.
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
     * You cannot add, modify or delete indexes using <i>UpdateTable</i> .
     * Indexes can only be defined at table creation time.
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
    public UpdateTableResult updateTable(UpdateTableRequest updateTableRequest) {
        ExecutionContext executionContext = createExecutionContext(updateTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTableRequest> request = null;
        Response<UpdateTableResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTableRequestMarshaller().marshall(updateTableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateTableResult, JsonUnmarshallerContext> unmarshaller = new UpdateTableResultJsonUnmarshaller();
            JsonResponseHandler<UpdateTableResult> responseHandler = new JsonResponseHandler<UpdateTableResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * The <i>DeleteTable</i> operation deletes a table and all of its
     * items. After a <i>DeleteTable</i> request, the specified table is in
     * the <code>DELETING</code> state until DynamoDB completes the deletion.
     * If the table is in the <code>ACTIVE</code> state, you can delete it.
     * If a table is in <code>CREATING</code> or <code>UPDATING</code>
     * states, then DynamoDB returns a <i>ResourceInUseException</i> . If the
     * specified table does not exist, DynamoDB returns a
     * <i>ResourceNotFoundException</i> . If table is already in the
     * <code>DELETING</code> state, no error is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> DynamoDB might continue to accept data read and write
     * operations, such as GetItem and PutItem, on a table in the DELETING
     * state until the table deletion is complete.
     * </p>
     * <p>
     * When you delete a table, any indexes on that table are also deleted.
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
    public DeleteTableResult deleteTable(DeleteTableRequest deleteTableRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTableRequest> request = null;
        Response<DeleteTableResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTableRequestMarshaller().marshall(deleteTableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteTableResult, JsonUnmarshallerContext> unmarshaller = new DeleteTableResultJsonUnmarshaller();
            JsonResponseHandler<DeleteTableResult> responseHandler = new JsonResponseHandler<DeleteTableResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * The <i>BatchWriteItem</i> operation puts or deletes multiple items in
     * one or more tables. A single call to <i>BatchWriteItem</i> can write
     * up to 1 MB of data, which can comprise as many as 25 put or delete
     * requests. Individual items to be written can be as large as 64 KB.
     * </p>
     * <p>
     * <b>NOTE:</b> BatchWriteItem cannot update items. To update items, use
     * the UpdateItem API.
     * </p>
     * <p>
     * The individual <i>PutItem</i> and <i>DeleteItem</i> operations
     * specified in <i>BatchWriteItem</i> are atomic; however
     * <i>BatchWriteItem</i> as a whole is not. If any requested operations
     * fail because the table's provisioned throughput is exceeded or an
     * internal processing failure occurs, the failed operations are returned
     * in the <i>UnprocessedItems</i> response parameter. You can investigate
     * and optionally resend the requests. Typically, you would call
     * <i>BatchWriteItem</i> in a loop. Each iteration would check for
     * unprocessed items and submit a new <i>BatchWriteItem</i> request with
     * those unprocessed items until all items have been processed.
     * </p>
     * <p>
     * Note that if <i>none</i> of the items can be processed due to
     * insufficient provisioned throughput on all of the tables in the
     * request, then <i>BatchGetItem</i> will throw a
     * <i>ProvisionedThroughputExceededException</i> .
     * </p>
     * <p>
     * To write one item, you can use the <i>PutItem</i> operation; to
     * delete one item, you can use the <i>DeleteItem</i> operation.
     * </p>
     * <p>
     * With <i>BatchWriteItem</i> , you can efficiently write or delete
     * large amounts of data, such as from Amazon Elastic MapReduce (EMR), or
     * copy data from another database into DynamoDB. In order to improve
     * performance with these large-scale operations, <i>BatchWriteItem</i>
     * does not behave in the same way as individual <i>PutItem</i> and
     * <i>DeleteItem</i> calls would For example, you cannot specify
     * conditions on individual put and delete requests, and
     * <i>BatchWriteItem</i> does not return deleted items in the response.
     * </p>
     * <p>
     * If you use a programming language that supports concurrency, such as
     * Java, you can use threads to write items in parallel. Your application
     * must include the necessary logic to manage the threads. With languages
     * that don't support threading, such as PHP, you must update or delete
     * the specified items one at a time. In both situations,
     * <i>BatchWriteItem</i> provides an alternative where the API performs
     * the specified put and delete operations in parallel, giving you the
     * power of the thread pool approach without having to introduce
     * complexity into your application.
     * </p>
     * <p>
     * Parallel processing reduces latency, but each specified put and
     * delete request consumes the same number of write capacity units
     * whether it is processed in parallel or not. Delete operations on
     * nonexistent items consume one write capacity unit.
     * </p>
     * <p>
     * If one or more of the following is true, DynamoDB rejects the entire
     * batch write operation:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * One or more tables specified in the <i>BatchWriteItem</i> request
     * does not exist.
     * </p>
     * </li>
     * <li> <p>
     * Primary key attributes specified on an item in the request do not
     * match those in the corresponding table's primary key schema.
     * </p>
     * </li>
     * <li> <p>
     * You try to perform multiple operations on the same item in the same
     * <i>BatchWriteItem</i> request. For example, you cannot put and delete
     * the same item in the same <i>BatchWriteItem</i> request.
     * </p>
     * </li>
     * <li> <p>
     * The total request size exceeds 1 MB.
     * </p>
     * </li>
     * <li> <p>
     * Any individual item in a batch exceeds 64 KB.
     * </p>
     * </li>
     * 
     * </ul>
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
    public BatchWriteItemResult batchWriteItem(BatchWriteItemRequest batchWriteItemRequest) {
        ExecutionContext executionContext = createExecutionContext(batchWriteItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchWriteItemRequest> request = null;
        Response<BatchWriteItemResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchWriteItemRequestMarshaller().marshall(batchWriteItemRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchWriteItemResult, JsonUnmarshallerContext> unmarshaller = new BatchWriteItemResultJsonUnmarshaller();
            JsonResponseHandler<BatchWriteItemResult> responseHandler = new JsonResponseHandler<BatchWriteItemResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
    public DescribeTableResult describeTable(DescribeTableRequest describeTableRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTableRequest> request = null;
        Response<DescribeTableResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTableRequestMarshaller().marshall(describeTableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DescribeTableResult, JsonUnmarshallerContext> unmarshaller = new DescribeTableResultJsonUnmarshaller();
            JsonResponseHandler<DescribeTableResult> responseHandler = new JsonResponseHandler<DescribeTableResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
    public GetItemResult getItem(GetItemRequest getItemRequest) {
        ExecutionContext executionContext = createExecutionContext(getItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetItemRequest> request = null;
        Response<GetItemResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetItemRequestMarshaller().marshall(getItemRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<GetItemResult, JsonUnmarshallerContext> unmarshaller = new GetItemResultJsonUnmarshaller();
            JsonResponseHandler<GetItemResult> responseHandler = new JsonResponseHandler<GetItemResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
     * conditions are met. If those conditions are met, DynamoDB performs the
     * delete. Otherwise, the item is not deleted.
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
    public DeleteItemResult deleteItem(DeleteItemRequest deleteItemRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteItemRequest> request = null;
        Response<DeleteItemResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteItemRequestMarshaller().marshall(deleteItemRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<DeleteItemResult, JsonUnmarshallerContext> unmarshaller = new DeleteItemResultJsonUnmarshaller();
            JsonResponseHandler<DeleteItemResult> responseHandler = new JsonResponseHandler<DeleteItemResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
     * <i>CreateTable</i> request, DynamoDB immediately returns a response
     * with a <i>TableStatus</i> of <code>CREATING</code> . After the table
     * is created, DynamoDB sets the <i>TableStatus</i> to
     * <code>ACTIVE</code> . You can perform read and write operations only
     * on an <code>ACTIVE</code> table.
     * </p>
     * <p>
     * If you want to create multiple tables with secondary indexes on them,
     * you must create them sequentially. Only one table with secondary
     * indexes can be in the <code>CREATING</code> state at any given time.
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
    public CreateTableResult createTable(CreateTableRequest createTableRequest) {
        ExecutionContext executionContext = createExecutionContext(createTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTableRequest> request = null;
        Response<CreateTableResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTableRequestMarshaller().marshall(createTableRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<CreateTableResult, JsonUnmarshallerContext> unmarshaller = new CreateTableResultJsonUnmarshaller();
            JsonResponseHandler<CreateTableResult> responseHandler = new JsonResponseHandler<CreateTableResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
     * <i>LastEvaluatedKey</i> . The <i>LastEvaluatedKey</i> is only provided
     * if the results exceed 1 MB, or if you have used <i>Limit</i> .
     * </p>
     * <p>
     * You can query a table, a local secondary index, or a global secondary
     * index. For a query on a table or on a local secondary index, you can
     * set <i>ConsistentRead</i> to true and obtain a strongly consistent
     * result. Global secondary indexes support eventually consistent reads
     * only, so do not specify <i>ConsistentRead</i> when querying a global
     * secondary index.
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
    public QueryResult query(QueryRequest queryRequest) {
        ExecutionContext executionContext = createExecutionContext(queryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<QueryRequest> request = null;
        Response<QueryResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new QueryRequestMarshaller().marshall(queryRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<QueryResult, JsonUnmarshallerContext> unmarshaller = new QueryResultJsonUnmarshaller();
            JsonResponseHandler<QueryResult> responseHandler = new JsonResponseHandler<QueryResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
     * use a conditional put operation with ComparisonOperator set to NULL
     * for the primary key attribute, or attributes.
     * </p>
     * <p>
     * For more information about using this API, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"> Working with Items </a>
     * in the Amazon DynamoDB Developer Guide.
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
    public PutItemResult putItem(PutItemRequest putItemRequest) {
        ExecutionContext executionContext = createExecutionContext(putItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutItemRequest> request = null;
        Response<PutItemResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutItemRequestMarshaller().marshall(putItemRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<PutItemResult, JsonUnmarshallerContext> unmarshaller = new PutItemResultJsonUnmarshaller();
            JsonResponseHandler<PutItemResult> responseHandler = new JsonResponseHandler<PutItemResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns an array of table names associated with the current account
     * and endpoint. The output from <i>ListTables</i> is paginated, with
     * each page returning a maximum of 100 table names.
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
    public ListTablesResult listTables(ListTablesRequest listTablesRequest) {
        ExecutionContext executionContext = createExecutionContext(listTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTablesRequest> request = null;
        Response<ListTablesResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTablesRequestMarshaller().marshall(listTablesRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<ListTablesResult, JsonUnmarshallerContext> unmarshaller = new ListTablesResultJsonUnmarshaller();
            JsonResponseHandler<ListTablesResult> responseHandler = new JsonResponseHandler<ListTablesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
    public UpdateItemResult updateItem(UpdateItemRequest updateItemRequest) {
        ExecutionContext executionContext = createExecutionContext(updateItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateItemRequest> request = null;
        Response<UpdateItemResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateItemRequestMarshaller().marshall(updateItemRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UpdateItemResult, JsonUnmarshallerContext> unmarshaller = new UpdateItemResultJsonUnmarshaller();
            JsonResponseHandler<UpdateItemResult> responseHandler = new JsonResponseHandler<UpdateItemResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * The <i>BatchGetItem</i> operation returns the attributes of one or
     * more items from one or more tables. You identify requested items by
     * primary key.
     * </p>
     * <p>
     * A single operation can retrieve up to 1 MB of data, which can contain
     * as many as 100 items. <i>BatchGetItem</i> will return a partial result
     * if the response size limit is exceeded, the table's provisioned
     * throughput is exceeded, or an internal processing failure occurs. If a
     * partial result is returned, the operation returns a value for
     * <i>UnprocessedKeys</i> . You can use this value to retry the operation
     * starting with the next item to get.
     * </p>
     * <p>
     * For example, if you ask to retrieve 100 items, but each individual
     * item is 50 KB in size, the system returns 20 items (1 MB) and an
     * appropriate <i>UnprocessedKeys</i> value so you can get the next page
     * of results. If desired, your application can include its own logic to
     * assemble the pages of results into one dataset.
     * </p>
     * <p>
     * If <i>none</i> of the items can be processed due to insufficient
     * provisioned throughput on all of the tables in the request, then
     * <i>BatchGetItem</i> will throw a
     * <i>ProvisionedThroughputExceededException</i> . If <i>at least one</i>
     * of the items is successfully processed, then <i>BatchGetItem</i>
     * completes successfully, while returning the keys of the unread items
     * in <i>UnprocessedKeys</i> .
     * </p>
     * <p>
     * By default, <i>BatchGetItem</i> performs eventually consistent reads
     * on every table in the request. If you want strongly consistent reads
     * instead, you can set <i>ConsistentRead</i> to <code>true</code> for
     * any or all tables.
     * </p>
     * <p>
     * In order to minimize response latency, <i>BatchGetItem</i> retrieves
     * items in parallel.
     * </p>
     * <p>
     * When designing your application, keep in mind that DynamoDB does not
     * return attributes in any particular order. To help parse the response
     * by item, include the primary key values for the items in your request
     * in the <i>AttributesToGet</i> parameter.
     * </p>
     * <p>
     * If a requested item does not exist, it is not returned in the result.
     * Requests for nonexistent items consume the minimum read capacity units
     * according to the type of read. For more information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"> Capacity Units Calculations </a>
     * in the Amazon DynamoDB Developer Guide.
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
    public BatchGetItemResult batchGetItem(BatchGetItemRequest batchGetItemRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetItemRequest> request = null;
        Response<BatchGetItemResult> response = null;
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetItemRequestMarshaller().marshall(batchGetItemRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<BatchGetItemResult, JsonUnmarshallerContext> unmarshaller = new BatchGetItemResultJsonUnmarshaller();
            JsonResponseHandler<BatchGetItemResult> responseHandler = new JsonResponseHandler<BatchGetItemResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);
            
        return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns an array of table names associated with the current account
     * and endpoint. The output from <i>ListTables</i> is paginated, with
     * each page returning a maximum of 100 table names.
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
     * <p>
     * The <i>Scan</i> operation returns one or more items and item
     * attributes by accessing every item in the table. To have DynamoDB
     * return fewer items, you can provide a <i>ScanFilter</i> .
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set
     * size limit of 1 MB, the scan stops and results are returned to the
     * user with a <i>LastEvaluatedKey</i> to continue the scan in a
     * subsequent operation. The results also include the number of items
     * exceeding the limit. A scan can result in no table data meeting the
     * filter criteria.
     * </p>
     * <p>
     * The result set is eventually consistent.
     * </p>
     * <p>
     * By default, <i>Scan</i> operations proceed sequentially; however, for
     * faster performance on large tables, applications can request a
     * parallel <i>Scan</i> by specifying the <i>Segment</i> and
     * <i>TotalSegments</i> parameters. For more information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#QueryAndScanParallelScan"> Parallel Scan </a>
     * in the Amazon DynamoDB Developer Guide.
     * </p>
     * 
     * @param tableName The name of the table containing the requested items.
     * @param attributesToGet The names of one or more attributes to
     * retrieve. If no attribute names are specified, then all attributes
     * will be returned. If any of the requested attributes are not found,
     * they will not appear in the result. <p>Note that
     * <i>AttributesToGet</i> has no effect on provisioned throughput
     * consumption. DynamoDB determines capacity units consumed based on item
     * size, not on the amount of data that is returned to an application.
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
    public ScanResult scan(String tableName, java.util.List<String> attributesToGet)
             throws AmazonServiceException, AmazonClientException  {
        ScanRequest scanRequest = new ScanRequest();
        scanRequest.setTableName(tableName);
        scanRequest.setAttributesToGet(attributesToGet);
        return scan(scanRequest);
    }
    
    /**
     * <p>
     * The <i>Scan</i> operation returns one or more items and item
     * attributes by accessing every item in the table. To have DynamoDB
     * return fewer items, you can provide a <i>ScanFilter</i> .
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set
     * size limit of 1 MB, the scan stops and results are returned to the
     * user with a <i>LastEvaluatedKey</i> to continue the scan in a
     * subsequent operation. The results also include the number of items
     * exceeding the limit. A scan can result in no table data meeting the
     * filter criteria.
     * </p>
     * <p>
     * The result set is eventually consistent.
     * </p>
     * <p>
     * By default, <i>Scan</i> operations proceed sequentially; however, for
     * faster performance on large tables, applications can request a
     * parallel <i>Scan</i> by specifying the <i>Segment</i> and
     * <i>TotalSegments</i> parameters. For more information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#QueryAndScanParallelScan"> Parallel Scan </a>
     * in the Amazon DynamoDB Developer Guide.
     * </p>
     * 
     * @param tableName The name of the table containing the requested items.
     * @param scanFilter Evaluates the scan results and returns only the
     * desired values. <p>If you specify more than one condition in the
     * <i>ScanFilter</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together.
     * (You can use the <i>ConditionalOperator</i> parameter to OR the
     * conditions instead. If you do this, then at least one of the
     * conditions must evaluate to true, rather than all of them.) <p>Each
     * <i>ScanFilter</i> element consists of an attribute name to compare,
     * along with the following: <ul> <li> <p><i>AttributeValueList</i> - One
     * or more values to evaluate against the supplied attribute. The number
     * of values in the list depends on the <i>ComparisonOperator</i> being
     * used. <p>For type Number, value comparisons are numeric. <p>String
     * value comparisons for greater than, equals, or less than are based on
     * ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>aa</code> is greater than
     * <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. <p>For information on specifying data types in
     * JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide. </li>
     * <li><p><i>ComparisonOperator</i> - A comparator for evaluating
     * attributes. For example, equals, greater than, less than, etc. <p>The
     * following comparison operators are available: <p><code>EQ | NE | LE |
     * LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH
     * | IN | BETWEEN</code> <p>For complete descriptions of all comparison
     * operators, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">API_Condition.html</a>.
     * </li> </ul>
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
    public ScanResult scan(String tableName, java.util.Map<String,Condition> scanFilter)
             throws AmazonServiceException, AmazonClientException  {
        ScanRequest scanRequest = new ScanRequest();
        scanRequest.setTableName(tableName);
        scanRequest.setScanFilter(scanFilter);
        return scan(scanRequest);
    }
    
    /**
     * <p>
     * The <i>Scan</i> operation returns one or more items and item
     * attributes by accessing every item in the table. To have DynamoDB
     * return fewer items, you can provide a <i>ScanFilter</i> .
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set
     * size limit of 1 MB, the scan stops and results are returned to the
     * user with a <i>LastEvaluatedKey</i> to continue the scan in a
     * subsequent operation. The results also include the number of items
     * exceeding the limit. A scan can result in no table data meeting the
     * filter criteria.
     * </p>
     * <p>
     * The result set is eventually consistent.
     * </p>
     * <p>
     * By default, <i>Scan</i> operations proceed sequentially; however, for
     * faster performance on large tables, applications can request a
     * parallel <i>Scan</i> by specifying the <i>Segment</i> and
     * <i>TotalSegments</i> parameters. For more information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#QueryAndScanParallelScan"> Parallel Scan </a>
     * in the Amazon DynamoDB Developer Guide.
     * </p>
     * 
     * @param tableName The name of the table containing the requested items.
     * @param attributesToGet The names of one or more attributes to
     * retrieve. If no attribute names are specified, then all attributes
     * will be returned. If any of the requested attributes are not found,
     * they will not appear in the result. <p>Note that
     * <i>AttributesToGet</i> has no effect on provisioned throughput
     * consumption. DynamoDB determines capacity units consumed based on item
     * size, not on the amount of data that is returned to an application.
     * @param scanFilter Evaluates the scan results and returns only the
     * desired values. <p>If you specify more than one condition in the
     * <i>ScanFilter</i> map, then by default all of the conditions must
     * evaluate to true. In other words, the conditions are ANDed together.
     * (You can use the <i>ConditionalOperator</i> parameter to OR the
     * conditions instead. If you do this, then at least one of the
     * conditions must evaluate to true, rather than all of them.) <p>Each
     * <i>ScanFilter</i> element consists of an attribute name to compare,
     * along with the following: <ul> <li> <p><i>AttributeValueList</i> - One
     * or more values to evaluate against the supplied attribute. The number
     * of values in the list depends on the <i>ComparisonOperator</i> being
     * used. <p>For type Number, value comparisons are numeric. <p>String
     * value comparisons for greater than, equals, or less than are based on
     * ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>aa</code> is greater than
     * <code>B</code>. For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters">http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * <p>For Binary, DynamoDB treats each byte of the binary data as
     * unsigned when it compares binary values, for example when evaluating
     * query expressions. <p>For information on specifying data types in
     * JSON, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html">JSON
     * Data Format</a> in the Amazon DynamoDB Developer Guide. </li>
     * <li><p><i>ComparisonOperator</i> - A comparator for evaluating
     * attributes. For example, equals, greater than, less than, etc. <p>The
     * following comparison operators are available: <p><code>EQ | NE | LE |
     * LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH
     * | IN | BETWEEN</code> <p>For complete descriptions of all comparison
     * operators, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html">API_Condition.html</a>.
     * </li> </ul>
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
    public ScanResult scan(String tableName, java.util.List<String> attributesToGet, java.util.Map<String,Condition> scanFilter)
             throws AmazonServiceException, AmazonClientException  {
        ScanRequest scanRequest = new ScanRequest();
        scanRequest.setTableName(tableName);
        scanRequest.setAttributesToGet(attributesToGet);
        scanRequest.setScanFilter(scanFilter);
        return scan(scanRequest);
    }
    
    /**
     * <p>
     * Updates the provisioned throughput for the given table. Setting the
     * throughput for a table helps you manage performance and is part of the
     * provisioned throughput feature of DynamoDB.
     * </p>
     * <p>
     * The provisioned throughput values can be upgraded or downgraded based
     * on the maximums and minimums listed in the
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"> Limits </a>
     * section in the Amazon DynamoDB Developer Guide.
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
     * You cannot add, modify or delete indexes using <i>UpdateTable</i> .
     * Indexes can only be defined at table creation time.
     * </p>
     * 
     * @param tableName The name of the table to be updated.
     * @param provisionedThroughput Represents the provisioned throughput
     * settings for a specified table or index. The settings can be modified
     * using the <i>UpdateTable</i> operation. <p>For current minimum and
     * maximum provisioned throughput values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
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
    public UpdateTableResult updateTable(String tableName, ProvisionedThroughput provisionedThroughput)
             throws AmazonServiceException, AmazonClientException  {
        UpdateTableRequest updateTableRequest = new UpdateTableRequest();
        updateTableRequest.setTableName(tableName);
        updateTableRequest.setProvisionedThroughput(provisionedThroughput);
        return updateTable(updateTableRequest);
    }
    
    /**
     * <p>
     * The <i>DeleteTable</i> operation deletes a table and all of its
     * items. After a <i>DeleteTable</i> request, the specified table is in
     * the <code>DELETING</code> state until DynamoDB completes the deletion.
     * If the table is in the <code>ACTIVE</code> state, you can delete it.
     * If a table is in <code>CREATING</code> or <code>UPDATING</code>
     * states, then DynamoDB returns a <i>ResourceInUseException</i> . If the
     * specified table does not exist, DynamoDB returns a
     * <i>ResourceNotFoundException</i> . If table is already in the
     * <code>DELETING</code> state, no error is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> DynamoDB might continue to accept data read and write
     * operations, such as GetItem and PutItem, on a table in the DELETING
     * state until the table deletion is complete.
     * </p>
     * <p>
     * When you delete a table, any indexes on that table are also deleted.
     * </p>
     * <p>
     * Use the <i>DescribeTable</i> API to check the status of the table.
     * </p>
     * 
     * @param tableName The name of the table to delete.
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
    public DeleteTableResult deleteTable(String tableName)
             throws AmazonServiceException, AmazonClientException  {
        DeleteTableRequest deleteTableRequest = new DeleteTableRequest();
        deleteTableRequest.setTableName(tableName);
        return deleteTable(deleteTableRequest);
    }
    
    /**
     * <p>
     * The <i>BatchWriteItem</i> operation puts or deletes multiple items in
     * one or more tables. A single call to <i>BatchWriteItem</i> can write
     * up to 1 MB of data, which can comprise as many as 25 put or delete
     * requests. Individual items to be written can be as large as 64 KB.
     * </p>
     * <p>
     * <b>NOTE:</b> BatchWriteItem cannot update items. To update items, use
     * the UpdateItem API.
     * </p>
     * <p>
     * The individual <i>PutItem</i> and <i>DeleteItem</i> operations
     * specified in <i>BatchWriteItem</i> are atomic; however
     * <i>BatchWriteItem</i> as a whole is not. If any requested operations
     * fail because the table's provisioned throughput is exceeded or an
     * internal processing failure occurs, the failed operations are returned
     * in the <i>UnprocessedItems</i> response parameter. You can investigate
     * and optionally resend the requests. Typically, you would call
     * <i>BatchWriteItem</i> in a loop. Each iteration would check for
     * unprocessed items and submit a new <i>BatchWriteItem</i> request with
     * those unprocessed items until all items have been processed.
     * </p>
     * <p>
     * Note that if <i>none</i> of the items can be processed due to
     * insufficient provisioned throughput on all of the tables in the
     * request, then <i>BatchGetItem</i> will throw a
     * <i>ProvisionedThroughputExceededException</i> .
     * </p>
     * <p>
     * To write one item, you can use the <i>PutItem</i> operation; to
     * delete one item, you can use the <i>DeleteItem</i> operation.
     * </p>
     * <p>
     * With <i>BatchWriteItem</i> , you can efficiently write or delete
     * large amounts of data, such as from Amazon Elastic MapReduce (EMR), or
     * copy data from another database into DynamoDB. In order to improve
     * performance with these large-scale operations, <i>BatchWriteItem</i>
     * does not behave in the same way as individual <i>PutItem</i> and
     * <i>DeleteItem</i> calls would For example, you cannot specify
     * conditions on individual put and delete requests, and
     * <i>BatchWriteItem</i> does not return deleted items in the response.
     * </p>
     * <p>
     * If you use a programming language that supports concurrency, such as
     * Java, you can use threads to write items in parallel. Your application
     * must include the necessary logic to manage the threads. With languages
     * that don't support threading, such as PHP, you must update or delete
     * the specified items one at a time. In both situations,
     * <i>BatchWriteItem</i> provides an alternative where the API performs
     * the specified put and delete operations in parallel, giving you the
     * power of the thread pool approach without having to introduce
     * complexity into your application.
     * </p>
     * <p>
     * Parallel processing reduces latency, but each specified put and
     * delete request consumes the same number of write capacity units
     * whether it is processed in parallel or not. Delete operations on
     * nonexistent items consume one write capacity unit.
     * </p>
     * <p>
     * If one or more of the following is true, DynamoDB rejects the entire
     * batch write operation:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * One or more tables specified in the <i>BatchWriteItem</i> request
     * does not exist.
     * </p>
     * </li>
     * <li> <p>
     * Primary key attributes specified on an item in the request do not
     * match those in the corresponding table's primary key schema.
     * </p>
     * </li>
     * <li> <p>
     * You try to perform multiple operations on the same item in the same
     * <i>BatchWriteItem</i> request. For example, you cannot put and delete
     * the same item in the same <i>BatchWriteItem</i> request.
     * </p>
     * </li>
     * <li> <p>
     * The total request size exceeds 1 MB.
     * </p>
     * </li>
     * <li> <p>
     * Any individual item in a batch exceeds 64 KB.
     * </p>
     * </li>
     * 
     * </ul>
     * 
     * @param requestItems A map of one or more table names and, for each
     * table, a list of operations to be performed (<i>DeleteRequest</i> or
     * <i>PutRequest</i>). Each element in the map consists of the following:
     * <ul> <li> <p><i>DeleteRequest</i> - Perform a <i>DeleteItem</i>
     * operation on the specified item. The item to be deleted is identified
     * by a <i>Key</i> subelement: <ul> <li> <p><i>Key</i> - A map of primary
     * key attribute values that uniquely identify the item. Each entry in
     * this map consists of an attribute name and an attribute value. </li>
     * </ul> </li> <li> <p><i>PutRequest</i> - Perform a <i>PutItem</i>
     * operation on the specified item. The item to be put is identified by
     * an <i>Item</i> subelement: <ul> <li> <p><i>Item</i> - A map of
     * attributes and their values. Each entry in this map consists of an
     * attribute name and an attribute value. Attribute values must not be
     * null; string and binary type attributes must have lengths greater than
     * zero; and set type attributes must not be empty. Requests that contain
     * empty values will be rejected with a <i>ValidationException</i>. <p>If
     * you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition. </li> </ul> </li> </ul>
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
    public BatchWriteItemResult batchWriteItem(java.util.Map<String,java.util.List<WriteRequest>> requestItems)
             throws AmazonServiceException, AmazonClientException  {
        BatchWriteItemRequest batchWriteItemRequest = new BatchWriteItemRequest();
        batchWriteItemRequest.setRequestItems(requestItems);
        return batchWriteItem(batchWriteItemRequest);
    }
    
    /**
     * <p>
     * Returns information about the table, including the current status of
     * the table, when it was created, the primary key schema, and any
     * indexes on the table.
     * </p>
     * 
     * @param tableName The name of the table to describe.
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
    public DescribeTableResult describeTable(String tableName)
             throws AmazonServiceException, AmazonClientException  {
        DescribeTableRequest describeTableRequest = new DescribeTableRequest();
        describeTableRequest.setTableName(tableName);
        return describeTable(describeTableRequest);
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
     * @param tableName The name of the table containing the requested item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve.
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
    public GetItemResult getItem(String tableName, java.util.Map<String,AttributeValue> key)
             throws AmazonServiceException, AmazonClientException  {
        GetItemRequest getItemRequest = new GetItemRequest();
        getItemRequest.setTableName(tableName);
        getItemRequest.setKey(key);
        return getItem(getItemRequest);
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
     * @param tableName The name of the table containing the requested item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve.
     * @param consistentRead If set to <code>true</code>, then the operation
     * uses strongly consistent reads; otherwise, eventually consistent reads
     * are used.
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
    public GetItemResult getItem(String tableName, java.util.Map<String,AttributeValue> key, Boolean consistentRead)
             throws AmazonServiceException, AmazonClientException  {
        GetItemRequest getItemRequest = new GetItemRequest();
        getItemRequest.setTableName(tableName);
        getItemRequest.setKey(key);
        getItemRequest.setConsistentRead(consistentRead);
        return getItem(getItemRequest);
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
     * conditions are met. If those conditions are met, DynamoDB performs the
     * delete. Otherwise, the item is not deleted.
     * </p>
     * 
     * @param tableName The name of the table from which to delete the item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete.
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
    public DeleteItemResult deleteItem(String tableName, java.util.Map<String,AttributeValue> key)
             throws AmazonServiceException, AmazonClientException  {
        DeleteItemRequest deleteItemRequest = new DeleteItemRequest();
        deleteItemRequest.setTableName(tableName);
        deleteItemRequest.setKey(key);
        return deleteItem(deleteItemRequest);
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
     * conditions are met. If those conditions are met, DynamoDB performs the
     * delete. Otherwise, the item is not deleted.
     * </p>
     * 
     * @param tableName The name of the table from which to delete the item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared before they were deleted. For
     * <i>DeleteItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This is the
     * default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     * The content of the old item is returned. </li> </ul>
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
    public DeleteItemResult deleteItem(String tableName, java.util.Map<String,AttributeValue> key, String returnValues)
             throws AmazonServiceException, AmazonClientException  {
        DeleteItemRequest deleteItemRequest = new DeleteItemRequest();
        deleteItemRequest.setTableName(tableName);
        deleteItemRequest.setKey(key);
        deleteItemRequest.setReturnValues(returnValues);
        return deleteItem(deleteItemRequest);
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
     * <i>CreateTable</i> request, DynamoDB immediately returns a response
     * with a <i>TableStatus</i> of <code>CREATING</code> . After the table
     * is created, DynamoDB sets the <i>TableStatus</i> to
     * <code>ACTIVE</code> . You can perform read and write operations only
     * on an <code>ACTIVE</code> table.
     * </p>
     * <p>
     * If you want to create multiple tables with secondary indexes on them,
     * you must create them sequentially. Only one table with secondary
     * indexes can be in the <code>CREATING</code> state at any given time.
     * </p>
     * <p>
     * You can use the <i>DescribeTable</i> API to check the table status.
     * </p>
     * 
     * @param attributeDefinitions An array of attributes that describe the
     * key schema for the table and indexes.
     * @param tableName The name of the table to create.
     * @param keySchema Specifies the attributes that make up the primary key
     * for a table or an index. The attributes in <i>KeySchema</i> must also
     * be defined in the <i>AttributeDefinitions</i> array. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html">Data
     * Model</a> in the Amazon DynamoDB Developer Guide. <p>Each
     * <i>KeySchemaElement</i> in the array is composed of: <ul> <li>
     * <p><i>AttributeName</i> - The name of this key attribute. </li> <li>
     * <p><i>KeyType</i> - Determines whether the key attribute is
     * <code>HASH</code> or <code>RANGE</code>. </li> </ul> <p>For a primary
     * key that consists of a hash attribute, you must specify exactly one
     * element with a <i>KeyType</i> of <code>HASH</code>. <p>For a primary
     * key that consists of hash and range attributes, you must specify
     * exactly two elements, in this order: The first element must have a
     * <i>KeyType</i> of <code>HASH</code>, and the second element must have
     * a <i>KeyType</i> of <code>RANGE</code>. <p>For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#WorkingWithTables.primary.key">Specifying
     * the Primary Key</a> in the Amazon DynamoDB Developer Guide.
     * @param provisionedThroughput Represents the provisioned throughput
     * settings for a specified table or index. The settings can be modified
     * using the <i>UpdateTable</i> operation. <p>For current minimum and
     * maximum provisioned throughput values, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
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
    public CreateTableResult createTable(java.util.List<AttributeDefinition> attributeDefinitions, String tableName, java.util.List<KeySchemaElement> keySchema, ProvisionedThroughput provisionedThroughput)
             throws AmazonServiceException, AmazonClientException  {
        CreateTableRequest createTableRequest = new CreateTableRequest();
        createTableRequest.setAttributeDefinitions(attributeDefinitions);
        createTableRequest.setTableName(tableName);
        createTableRequest.setKeySchema(keySchema);
        createTableRequest.setProvisionedThroughput(provisionedThroughput);
        return createTable(createTableRequest);
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
     * use a conditional put operation with ComparisonOperator set to NULL
     * for the primary key attribute, or attributes.
     * </p>
     * <p>
     * For more information about using this API, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"> Working with Items </a>
     * in the Amazon DynamoDB Developer Guide.
     * </p>
     * 
     * @param tableName The name of the table to contain the item.
     * @param item A map of attribute name/value pairs, one for each
     * attribute. Only the primary key attributes are required; you can
     * optionally provide other attribute name-value pairs for the item.
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition. <p>For more information about
     * primary keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
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
    public PutItemResult putItem(String tableName, java.util.Map<String,AttributeValue> item)
             throws AmazonServiceException, AmazonClientException  {
        PutItemRequest putItemRequest = new PutItemRequest();
        putItemRequest.setTableName(tableName);
        putItemRequest.setItem(item);
        return putItem(putItemRequest);
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
     * use a conditional put operation with ComparisonOperator set to NULL
     * for the primary key attribute, or attributes.
     * </p>
     * <p>
     * For more information about using this API, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"> Working with Items </a>
     * in the Amazon DynamoDB Developer Guide.
     * </p>
     * 
     * @param tableName The name of the table to contain the item.
     * @param item A map of attribute name/value pairs, one for each
     * attribute. Only the primary key attributes are required; you can
     * optionally provide other attribute name-value pairs for the item.
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition. <p>For more information about
     * primary keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared before they were updated with the
     * <i>PutItem</i> request. For <i>PutItem</i>, the valid values are: <ul>
     * <li> <p><code>NONE</code> - If <i>ReturnValues</i> is not specified,
     * or if its value is <code>NONE</code>, then nothing is returned. (This
     * is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute
     * name-value pair, then the content of the old item is returned. </li>
     * </ul>
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
    public PutItemResult putItem(String tableName, java.util.Map<String,AttributeValue> item, String returnValues)
             throws AmazonServiceException, AmazonClientException  {
        PutItemRequest putItemRequest = new PutItemRequest();
        putItemRequest.setTableName(tableName);
        putItemRequest.setItem(item);
        putItemRequest.setReturnValues(returnValues);
        return putItem(putItemRequest);
    }
    
    /**
     * <p>
     * Returns an array of table names associated with the current account
     * and endpoint. The output from <i>ListTables</i> is paginated, with
     * each page returning a maximum of 100 table names.
     * </p>
     * 
     * @param exclusiveStartTableName The first table name that this
     * operation will evaluate. Use the value that was returned for
     * <i>LastEvaluatedTableName</i> in a previous operation, so that you can
     * obtain the next page of results.
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
    public ListTablesResult listTables(String exclusiveStartTableName)
             throws AmazonServiceException, AmazonClientException  {
        ListTablesRequest listTablesRequest = new ListTablesRequest();
        listTablesRequest.setExclusiveStartTableName(exclusiveStartTableName);
        return listTables(listTablesRequest);
    }
    
    /**
     * <p>
     * Returns an array of table names associated with the current account
     * and endpoint. The output from <i>ListTables</i> is paginated, with
     * each page returning a maximum of 100 table names.
     * </p>
     * 
     * @param exclusiveStartTableName The first table name that this
     * operation will evaluate. Use the value that was returned for
     * <i>LastEvaluatedTableName</i> in a previous operation, so that you can
     * obtain the next page of results.
     * @param limit A maximum number of table names to return. If this
     * parameter is not specified, the limit is 100.
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
    public ListTablesResult listTables(String exclusiveStartTableName, Integer limit)
             throws AmazonServiceException, AmazonClientException  {
        ListTablesRequest listTablesRequest = new ListTablesRequest();
        listTablesRequest.setExclusiveStartTableName(exclusiveStartTableName);
        listTablesRequest.setLimit(limit);
        return listTables(listTablesRequest);
    }
    
    /**
     * <p>
     * Returns an array of table names associated with the current account
     * and endpoint. The output from <i>ListTables</i> is paginated, with
     * each page returning a maximum of 100 table names.
     * </p>
     * 
     * @param limit A maximum number of table names to return. If this
     * parameter is not specified, the limit is 100.
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
    public ListTablesResult listTables(Integer limit)
             throws AmazonServiceException, AmazonClientException  {
        ListTablesRequest listTablesRequest = new ListTablesRequest();
        listTablesRequest.setLimit(limit);
        return listTables(listTablesRequest);
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
     * @param tableName The name of the table containing the item to update.
     * @param key The primary key that defines the item. Each element
     * consists of an attribute name and a value for that attribute.
     * @param attributeUpdates The names of attributes to be modified, the
     * action to perform on each, and the new value for each. If you are
     * updating an attribute that is an index key attribute for any indexes
     * on that table, the attribute type must match the index key type
     * defined in the <i>AttributesDefinition</i> of the table description.
     * You can use <i>UpdateItem</i> to update any non-key attributes.
     * <p>Attribute values cannot be null. String and binary type attributes
     * must have lengths greater than zero. Set type attributes must not be
     * empty. Requests with empty values will be rejected with a
     * <i>ValidationException</i>. <p>Each <i>AttributeUpdates</i> element
     * consists of an attribute name to modify, along with the following:
     * <ul> <li> <p><i>Value</i> - The new value, if applicable, for this
     * attribute. </li> <li> <p><i>Action</i> - Specifies how to perform the
     * update. Valid values for <i>Action</i> are <code>PUT</code>,
     * <code>DELETE</code>, and <code>ADD</code>. The behavior depends on
     * whether the specified primary key already exists in the table. <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * <ul> <li> <p><code>PUT</code> - Adds the specified attribute to the
     * item. If the attribute already exists, it is replaced by the new
     * value. </li> <li> <p><code>DELETE</code> - If no value is specified,
     * the attribute and its value are removed from the item. The data type
     * of the specified value must match the existing value's data type.
     * <p>If a <i>set</i> of values is specified, then those values are
     * subtracted from the old set. For example, if the attribute value was
     * the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     * <code>[a,c]</code>, then the final attribute value would be
     * <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     * <p><code>ADD</code> - If the attribute does not already exist, then
     * the attribute and its values are added to the item. If the attribute
     * does exist, then the behavior of <code>ADD</code> depends on the data
     * type of the attribute: <ul> <li> <p>If the existing attribute is a
     * number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     * mathematically added to the existing attribute. If <i>Value</i> is a
     * negative number, then it is subtracted from the existing attribute.
     * <note> <p> If you use <code>ADD</code> to increment or decrement a
     * number value for an item that doesn't exist before the update,
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, DynamoDB
     * uses <code>0</code> as the initial value. For example, suppose that
     * the item you want to update does not yet have an attribute named
     * <i>itemcount</i>, but you decide to <code>ADD</code> the number
     * <code>3</code> to this attribute anyway, even though it currently does
     * not exist. DynamoDB will create the <i>itemcount</i> attribute, set
     * its initial value to <code>0</code>, and finally add <code>3</code> to
     * it. The result will be a new <i>itemcount</i> attribute in the item,
     * with a value of <code>3</code>. </note> </li> <li> <p>If the existing
     * data type is a set, and if the <i>Value</i> is also a set, then the
     * <i>Value</i> is added to the existing set. (This is a <i>set</i>
     * operation, not mathematical addition.) For example, if the attribute
     * value was the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - DynamoDB creates a new item with the specified
     * primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - DynamoDB creates an item with
     * the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul> </li> </ul>
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition.
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
    public UpdateItemResult updateItem(String tableName, java.util.Map<String,AttributeValue> key, java.util.Map<String,AttributeValueUpdate> attributeUpdates)
             throws AmazonServiceException, AmazonClientException  {
        UpdateItemRequest updateItemRequest = new UpdateItemRequest();
        updateItemRequest.setTableName(tableName);
        updateItemRequest.setKey(key);
        updateItemRequest.setAttributeUpdates(attributeUpdates);
        return updateItem(updateItemRequest);
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
     * @param tableName The name of the table containing the item to update.
     * @param key The primary key that defines the item. Each element
     * consists of an attribute name and a value for that attribute.
     * @param attributeUpdates The names of attributes to be modified, the
     * action to perform on each, and the new value for each. If you are
     * updating an attribute that is an index key attribute for any indexes
     * on that table, the attribute type must match the index key type
     * defined in the <i>AttributesDefinition</i> of the table description.
     * You can use <i>UpdateItem</i> to update any non-key attributes.
     * <p>Attribute values cannot be null. String and binary type attributes
     * must have lengths greater than zero. Set type attributes must not be
     * empty. Requests with empty values will be rejected with a
     * <i>ValidationException</i>. <p>Each <i>AttributeUpdates</i> element
     * consists of an attribute name to modify, along with the following:
     * <ul> <li> <p><i>Value</i> - The new value, if applicable, for this
     * attribute. </li> <li> <p><i>Action</i> - Specifies how to perform the
     * update. Valid values for <i>Action</i> are <code>PUT</code>,
     * <code>DELETE</code>, and <code>ADD</code>. The behavior depends on
     * whether the specified primary key already exists in the table. <p>
     * <b>If an item with the specified <i>Key</i> is found in the table:</b>
     * <ul> <li> <p><code>PUT</code> - Adds the specified attribute to the
     * item. If the attribute already exists, it is replaced by the new
     * value. </li> <li> <p><code>DELETE</code> - If no value is specified,
     * the attribute and its value are removed from the item. The data type
     * of the specified value must match the existing value's data type.
     * <p>If a <i>set</i> of values is specified, then those values are
     * subtracted from the old set. For example, if the attribute value was
     * the set <code>[a,b,c]</code> and the <i>DELETE</i> action specified
     * <code>[a,c]</code>, then the final attribute value would be
     * <code>[b]</code>. Specifying an empty set is an error. </li> <li>
     * <p><code>ADD</code> - If the attribute does not already exist, then
     * the attribute and its values are added to the item. If the attribute
     * does exist, then the behavior of <code>ADD</code> depends on the data
     * type of the attribute: <ul> <li> <p>If the existing attribute is a
     * number, and if <i>Value</i> is also a number, then the <i>Value</i> is
     * mathematically added to the existing attribute. If <i>Value</i> is a
     * negative number, then it is subtracted from the existing attribute.
     * <note> <p> If you use <code>ADD</code> to increment or decrement a
     * number value for an item that doesn't exist before the update,
     * DynamoDB uses 0 as the initial value. <p>In addition, if you use
     * <code>ADD</code> to update an existing item, and intend to increment
     * or decrement an attribute value which does not yet exist, DynamoDB
     * uses <code>0</code> as the initial value. For example, suppose that
     * the item you want to update does not yet have an attribute named
     * <i>itemcount</i>, but you decide to <code>ADD</code> the number
     * <code>3</code> to this attribute anyway, even though it currently does
     * not exist. DynamoDB will create the <i>itemcount</i> attribute, set
     * its initial value to <code>0</code>, and finally add <code>3</code> to
     * it. The result will be a new <i>itemcount</i> attribute in the item,
     * with a value of <code>3</code>. </note> </li> <li> <p>If the existing
     * data type is a set, and if the <i>Value</i> is also a set, then the
     * <i>Value</i> is added to the existing set. (This is a <i>set</i>
     * operation, not mathematical addition.) For example, if the attribute
     * value was the set <code>[1,2]</code>, and the <code>ADD</code> action
     * specified <code>[3]</code>, then the final attribute value would be
     * <code>[1,2,3]</code>. An error occurs if an Add action is specified
     * for a set attribute and the attribute type specified does not match
     * the existing set type. <p>Both sets must have the same primitive data
     * type. For example, if the existing data type is a set of strings, the
     * <i>Value</i> must also be a set of strings. The same holds true for
     * number sets and binary sets. </li> </ul> <p>This action is only valid
     * for an existing attribute whose data type is number or is a set. Do
     * not use <code>ADD</code> for any other data types. </li> </ul> <p>
     * <b>If no item with the specified <i>Key</i> is found:</b> <ul> <li>
     * <p><code>PUT</code> - DynamoDB creates a new item with the specified
     * primary key, and then adds the attribute. </li> <li>
     * <p><code>DELETE</code> - Nothing happens; there is no attribute to
     * delete. </li> <li> <p><code>ADD</code> - DynamoDB creates an item with
     * the supplied primary key and number (or set of numbers) for the
     * attribute value. The only data types allowed are number and number
     * set; no other data types can be specified. </li> </ul> </li> </ul>
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared either before or after they were
     * updated. For <i>UpdateItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This is the
     * default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     * If <i>UpdateItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> <li>
     * <p><code>UPDATED_OLD</code> - The old versions of only the updated
     * attributes are returned. </li> <li> <p><code>ALL_NEW</code> - All of
     * the attributes of the new version of the item are returned. </li> <li>
     * <p><code>UPDATED_NEW</code> - The new versions of only the updated
     * attributes are returned. </li> </ul>
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
    public UpdateItemResult updateItem(String tableName, java.util.Map<String,AttributeValue> key, java.util.Map<String,AttributeValueUpdate> attributeUpdates, String returnValues)
             throws AmazonServiceException, AmazonClientException  {
        UpdateItemRequest updateItemRequest = new UpdateItemRequest();
        updateItemRequest.setTableName(tableName);
        updateItemRequest.setKey(key);
        updateItemRequest.setAttributeUpdates(attributeUpdates);
        updateItemRequest.setReturnValues(returnValues);
        return updateItem(updateItemRequest);
    }
    
    /**
     * <p>
     * The <i>BatchGetItem</i> operation returns the attributes of one or
     * more items from one or more tables. You identify requested items by
     * primary key.
     * </p>
     * <p>
     * A single operation can retrieve up to 1 MB of data, which can contain
     * as many as 100 items. <i>BatchGetItem</i> will return a partial result
     * if the response size limit is exceeded, the table's provisioned
     * throughput is exceeded, or an internal processing failure occurs. If a
     * partial result is returned, the operation returns a value for
     * <i>UnprocessedKeys</i> . You can use this value to retry the operation
     * starting with the next item to get.
     * </p>
     * <p>
     * For example, if you ask to retrieve 100 items, but each individual
     * item is 50 KB in size, the system returns 20 items (1 MB) and an
     * appropriate <i>UnprocessedKeys</i> value so you can get the next page
     * of results. If desired, your application can include its own logic to
     * assemble the pages of results into one dataset.
     * </p>
     * <p>
     * If <i>none</i> of the items can be processed due to insufficient
     * provisioned throughput on all of the tables in the request, then
     * <i>BatchGetItem</i> will throw a
     * <i>ProvisionedThroughputExceededException</i> . If <i>at least one</i>
     * of the items is successfully processed, then <i>BatchGetItem</i>
     * completes successfully, while returning the keys of the unread items
     * in <i>UnprocessedKeys</i> .
     * </p>
     * <p>
     * By default, <i>BatchGetItem</i> performs eventually consistent reads
     * on every table in the request. If you want strongly consistent reads
     * instead, you can set <i>ConsistentRead</i> to <code>true</code> for
     * any or all tables.
     * </p>
     * <p>
     * In order to minimize response latency, <i>BatchGetItem</i> retrieves
     * items in parallel.
     * </p>
     * <p>
     * When designing your application, keep in mind that DynamoDB does not
     * return attributes in any particular order. To help parse the response
     * by item, include the primary key values for the items in your request
     * in the <i>AttributesToGet</i> parameter.
     * </p>
     * <p>
     * If a requested item does not exist, it is not returned in the result.
     * Requests for nonexistent items consume the minimum read capacity units
     * according to the type of read. For more information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"> Capacity Units Calculations </a>
     * in the Amazon DynamoDB Developer Guide.
     * </p>
     * 
     * @param requestItems A map of one or more table names and, for each
     * table, the corresponding primary keys for the items to retrieve. Each
     * table name can be invoked only once. <p>Each element in the map
     * consists of the following: <ul> <li> <p><i>Keys</i> - An array of
     * primary key attribute values that define specific items in the table.
     * </li> <li> <p><i>AttributesToGet</i> - One or more attributes to be
     * retrieved from the table. By default, all attributes are returned. If
     * a specified attribute is not found, it does not appear in the result.
     * <p>Note that <i>AttributesToGet</i> has no effect on provisioned
     * throughput consumption. DynamoDB determines capacity units consumed
     * based on item size, not on the amount of data that is returned to an
     * application. </li> <li> <p><i>ConsistentRead</i> - If
     * <code>true</code>, a strongly consistent read is used; if
     * <code>false</code> (the default), an eventually consistent read is
     * used. </li> </ul>
     * @param returnConsumedCapacity If set to <code>TOTAL</code>, the
     * response includes <i>ConsumedCapacity</i> data for tables and indexes.
     * If set to <code>INDEXES</code>, the response includes
     * <i>ConsumedCapacity</i> for indexes. If set to <code>NONE</code> (the
     * default), <i>ConsumedCapacity</i> is not included in the response.
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
    public BatchGetItemResult batchGetItem(java.util.Map<String,KeysAndAttributes> requestItems, String returnConsumedCapacity)
             throws AmazonServiceException, AmazonClientException  {
        BatchGetItemRequest batchGetItemRequest = new BatchGetItemRequest();
        batchGetItemRequest.setRequestItems(requestItems);
        batchGetItemRequest.setReturnConsumedCapacity(returnConsumedCapacity);
        return batchGetItem(batchGetItemRequest);
    }
    
    /**
     * <p>
     * The <i>BatchGetItem</i> operation returns the attributes of one or
     * more items from one or more tables. You identify requested items by
     * primary key.
     * </p>
     * <p>
     * A single operation can retrieve up to 1 MB of data, which can contain
     * as many as 100 items. <i>BatchGetItem</i> will return a partial result
     * if the response size limit is exceeded, the table's provisioned
     * throughput is exceeded, or an internal processing failure occurs. If a
     * partial result is returned, the operation returns a value for
     * <i>UnprocessedKeys</i> . You can use this value to retry the operation
     * starting with the next item to get.
     * </p>
     * <p>
     * For example, if you ask to retrieve 100 items, but each individual
     * item is 50 KB in size, the system returns 20 items (1 MB) and an
     * appropriate <i>UnprocessedKeys</i> value so you can get the next page
     * of results. If desired, your application can include its own logic to
     * assemble the pages of results into one dataset.
     * </p>
     * <p>
     * If <i>none</i> of the items can be processed due to insufficient
     * provisioned throughput on all of the tables in the request, then
     * <i>BatchGetItem</i> will throw a
     * <i>ProvisionedThroughputExceededException</i> . If <i>at least one</i>
     * of the items is successfully processed, then <i>BatchGetItem</i>
     * completes successfully, while returning the keys of the unread items
     * in <i>UnprocessedKeys</i> .
     * </p>
     * <p>
     * By default, <i>BatchGetItem</i> performs eventually consistent reads
     * on every table in the request. If you want strongly consistent reads
     * instead, you can set <i>ConsistentRead</i> to <code>true</code> for
     * any or all tables.
     * </p>
     * <p>
     * In order to minimize response latency, <i>BatchGetItem</i> retrieves
     * items in parallel.
     * </p>
     * <p>
     * When designing your application, keep in mind that DynamoDB does not
     * return attributes in any particular order. To help parse the response
     * by item, include the primary key values for the items in your request
     * in the <i>AttributesToGet</i> parameter.
     * </p>
     * <p>
     * If a requested item does not exist, it is not returned in the result.
     * Requests for nonexistent items consume the minimum read capacity units
     * according to the type of read. For more information, see
     * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"> Capacity Units Calculations </a>
     * in the Amazon DynamoDB Developer Guide.
     * </p>
     * 
     * @param requestItems A map of one or more table names and, for each
     * table, the corresponding primary keys for the items to retrieve. Each
     * table name can be invoked only once. <p>Each element in the map
     * consists of the following: <ul> <li> <p><i>Keys</i> - An array of
     * primary key attribute values that define specific items in the table.
     * </li> <li> <p><i>AttributesToGet</i> - One or more attributes to be
     * retrieved from the table. By default, all attributes are returned. If
     * a specified attribute is not found, it does not appear in the result.
     * <p>Note that <i>AttributesToGet</i> has no effect on provisioned
     * throughput consumption. DynamoDB determines capacity units consumed
     * based on item size, not on the amount of data that is returned to an
     * application. </li> <li> <p><i>ConsistentRead</i> - If
     * <code>true</code>, a strongly consistent read is used; if
     * <code>false</code> (the default), an eventually consistent read is
     * used. </li> </ul>
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
    public BatchGetItemResult batchGetItem(java.util.Map<String,KeysAndAttributes> requestItems)
             throws AmazonServiceException, AmazonClientException  {
        BatchGetItemRequest batchGetItemRequest = new BatchGetItemRequest();
        batchGetItemRequest.setRequestItems(requestItems);
        return batchGetItem(batchGetItemRequest);
    }

  @Override
  public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
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

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
        