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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.*;
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

import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.services.dynamodb.model.transform.*;


/**
 * Client for accessing AmazonDynamoDB.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * Amazon DynamoDB is a fast, highly scalable, highly available, cost-effective non-relational database service.
 * </p>
 * <p>
 * Amazon DynamoDB removes traditional scalability limitations on data storage while maintaining low latency and predictable performance.
 * </p>
 */
public class AmazonDynamoDBClient extends AmazonWebServiceClient implements AmazonDynamoDB {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDynamoDB.class);

    /**
     * List of exception unmarshallers for all AmazonDynamoDB exceptions.
     */
    protected List<Unmarshaller<AmazonServiceException, JSONObject>> exceptionUnmarshallers;

    
    /** AWS signer for authenticating requests. */
    private AWS4Signer signer;


    /**
     * Constructs a new client to invoke service methods on
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
     * @see DefaultAWSCredentialsProvider
     */
    public AmazonDynamoDBClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
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
     * @see DefaultAWSCredentialsProvider
     */
    public AmazonDynamoDBClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonDynamoDB using the specified AWS account credentials.
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
     * AmazonDynamoDB using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonDynamoDB
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonDynamoDBClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonDynamoDB using the specified AWS account credentials provider.
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
     * AmazonDynamoDB using the specified AWS account credentials
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
     *                       client connects to AmazonDynamoDB
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonDynamoDBClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }


    private void init() {
        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, JSONObject>>();
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalServerErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ProvisionedThroughputExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ConditionalCheckFailedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new JsonErrorUnmarshaller());
        setEndpoint("dynamodb.us-east-1.amazonaws.com/");

        signer = new AWS4Signer();
        
        signer.setServiceName("dynamodb");
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/dynamodb/request.handlers"));

        
        clientConfiguration = new ClientConfiguration(clientConfiguration);
        if (clientConfiguration.getMaxErrorRetry() == ClientConfiguration.DEFAULT_MAX_RETRIES) {
            log.debug("Overriding default max error retry value to: " + 10);
            clientConfiguration.setMaxErrorRetry(10);
        }
        setConfiguration(clientConfiguration);
    }

    
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
    public ListTablesResult listTables() throws AmazonServiceException, AmazonClientException {
        return listTables(new ListTablesRequest());
    }
    
    /**
     * Overrides the default endpoint for this client and explicitly provides
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
     */
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        setEndpoint(endpoint);
        signer.setServiceName(serviceName);
        signer.setRegionName(regionId);
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
        