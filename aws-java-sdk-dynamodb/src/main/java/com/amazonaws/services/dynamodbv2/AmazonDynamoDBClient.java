/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.waiters.AmazonDynamoDBWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.services.dynamodbv2.model.transform.*;

/**
 * Client for accessing DynamoDB. All service calls made using this client are blocking, and will not return until the
 * service call completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDynamoDBClient extends AmazonWebServiceClient implements AmazonDynamoDB {
    // register the service specific set of predefined metrics
    static {
        AwsSdkMetrics.addAll(Arrays.asList(com.amazonaws.services.dynamodbv2.metrics.DynamoDBRequestMetric.values()));
    }
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDynamoDB.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "dynamodb";

    private volatile AmazonDynamoDBWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientConfigurationFactory configFactory = new com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientConfigurationFactory();

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TableAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.TableAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GlobalTableAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.GlobalTableAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReplicaAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.ReplicaAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConditionalCheckFailedException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.ConditionalCheckFailedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackupNotFoundException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.BackupNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GlobalTableNotFoundException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.GlobalTableNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ItemCollectionSizeLimitExceededException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.ItemCollectionSizeLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReplicaNotFoundException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.ReplicaNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TableNotFoundException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.TableNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackupInUseException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.BackupInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ContinuousBackupsUnavailableException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.ContinuousBackupsUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TableInUseException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.TableInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ProvisionedThroughputExceededException").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.ProvisionedThroughputExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withModeledClass(
                                    com.amazonaws.services.dynamodbv2.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.dynamodbv2.model.AmazonDynamoDBException.class));

    /**
     * Constructs a new client to invoke service methods on DynamoDB. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonDynamoDBClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonDynamoDBClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on DynamoDB. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to DynamoDB (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonDynamoDBClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonDynamoDBClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on DynamoDB using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonDynamoDBClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonDynamoDBClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonDynamoDBClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on DynamoDB using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to DynamoDB (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonDynamoDBClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDynamoDBClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonDynamoDBClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on DynamoDB using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonDynamoDBClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonDynamoDBClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on DynamoDB using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to DynamoDB (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonDynamoDBClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDynamoDBClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonDynamoDBClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on DynamoDB using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to DynamoDB (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonDynamoDBClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDynamoDBClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonDynamoDBClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonDynamoDBClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    public static AmazonDynamoDBClientBuilder builder() {
        return AmazonDynamoDBClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on DynamoDB using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDynamoDBClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://dynamodb.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/dynamodbv2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/dynamodbv2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations">Batch
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
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"
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
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.BatchGetItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchGetItem" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchGetItemResult batchGetItem(BatchGetItemRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetItem(request);
    }

    @SdkInternalApi
    final BatchGetItemResult executeBatchGetItem(BatchGetItemRequest batchGetItemRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetItemRequest> request = null;
        Response<BatchGetItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetItemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetItemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public BatchGetItemResult batchGetItem(java.util.Map<String, KeysAndAttributes> requestItems, String returnConsumedCapacity) {
        return batchGetItem(new BatchGetItemRequest().withRequestItems(requestItems).withReturnConsumedCapacity(returnConsumedCapacity));
    }

    @Override
    public BatchGetItemResult batchGetItem(java.util.Map<String, KeysAndAttributes> requestItems) {
        return batchGetItem(new BatchGetItemRequest().withRequestItems(requestItems));
    }

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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations">Batch
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
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchWriteItem" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchWriteItemResult batchWriteItem(BatchWriteItemRequest request) {
        request = beforeClientExecution(request);
        return executeBatchWriteItem(request);
    }

    @SdkInternalApi
    final BatchWriteItemResult executeBatchWriteItem(BatchWriteItemRequest batchWriteItemRequest) {

        ExecutionContext executionContext = createExecutionContext(batchWriteItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchWriteItemRequest> request = null;
        Response<BatchWriteItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchWriteItemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchWriteItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchWriteItemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchWriteItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public BatchWriteItemResult batchWriteItem(java.util.Map<String, java.util.List<WriteRequest>> requestItems) {
        return batchWriteItem(new BatchWriteItemRequest().withRequestItems(requestItems));
    }

    /**
     * <p>
     * Creates a backup for an existing table.
     * </p>
     * <p>
     * Each time you create an On-Demand Backup, the entire table data is backed up. There is no limit to the number of
     * on-demand backups that can be taken.
     * </p>
     * <p>
     * You can call <code>CreateBackup</code> at a maximum rate of 50 times per second.
     * </p>
     * <p>
     * All backups in DynamoDB work without consuming any provisioned throughput on the table. This results in a fast,
     * low-cost, and scalable backup process. In general, the larger the table, the more time it takes to back up. The
     * backup is stored in an S3 data store that is maintained and managed by DynamoDB.
     * </p>
     * <p>
     * Backups incorporate all writes (delete, put, update) that were completed within the last minute before the backup
     * request was initiated. Backups might include some writes (delete, put, update) that were completed before the
     * backup request was finished.
     * </p>
     * <p>
     * For example, if you submit the backup request on 2018-12-14 at 14:25:00, the backup is guaranteed to contain all
     * data committed to the table up to 14:24:00, and data committed after 14:26:00 will not be. The backup may or may
     * not contain data modifications made between 14:24:00 and 14:26:00. On-Demand Backup does not support causal
     * consistency.
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
     *         A table with the name <code>TableName</code> does not currently exist within the subscriber's account.
     * @throws TableInUseException
     *         A table by that name is either being created or deleted.
     * @throws ContinuousBackupsUnavailableException
     *         Backups have not yet been enabled for this table.
     * @throws BackupInUseException
     *         There is another ongoing conflicting backup control plane operation on the table. The backups is either
     *         being created, deleted or restored to a table.
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
     * @sample AmazonDynamoDB.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBackupResult createBackup(CreateBackupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBackup(request);
    }

    @SdkInternalApi
    final CreateBackupResult executeCreateBackup(CreateBackupRequest createBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(createBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackupRequest> request = null;
        Response<CreateBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a global table from an existing table. A global table creates a replication relationship between two or
     * more DynamoDB tables with the same table name in the provided regions.
     * </p>
     * <p>
     * Tables can only be added as the replicas of a global table group under the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The tables must have the same name.
     * </p>
     * </li>
     * <li>
     * <p>
     * The tables must contain no items.
     * </p>
     * </li>
     * <li>
     * <p>
     * The tables must have the same hash key and sort key (if present).
     * </p>
     * </li>
     * <li>
     * <p>
     * The tables must have DynamoDB Streams enabled (NEW_AND_OLD_IMAGES).
     * </p>
     * </li>
     * </ul>
     * 
     * @param createGlobalTableRequest
     * @return Result of the CreateGlobalTable operation returned by the service.
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
     * @throws GlobalTableAlreadyExistsException
     *         The specified global table already exists.
     * @throws TableNotFoundException
     *         A table with the name <code>TableName</code> does not currently exist within the subscriber's account.
     * @sample AmazonDynamoDB.CreateGlobalTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CreateGlobalTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGlobalTableResult createGlobalTable(CreateGlobalTableRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGlobalTable(request);
    }

    @SdkInternalApi
    final CreateGlobalTableResult executeCreateGlobalTable(CreateGlobalTableRequest createGlobalTableRequest) {

        ExecutionContext executionContext = createExecutionContext(createGlobalTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGlobalTableRequest> request = null;
        Response<CreateGlobalTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGlobalTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGlobalTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGlobalTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGlobalTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CreateTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTableResult createTable(CreateTableRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTable(request);
    }

    @SdkInternalApi
    final CreateTableResult executeCreateTable(CreateTableRequest createTableRequest) {

        ExecutionContext executionContext = createExecutionContext(createTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTableRequest> request = null;
        Response<CreateTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public CreateTableResult createTable(java.util.List<AttributeDefinition> attributeDefinitions, String tableName,
            java.util.List<KeySchemaElement> keySchema, ProvisionedThroughput provisionedThroughput) {
        return createTable(new CreateTableRequest().withAttributeDefinitions(attributeDefinitions).withTableName(tableName).withKeySchema(keySchema)
                .withProvisionedThroughput(provisionedThroughput));
    }

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
     *         There is another ongoing conflicting backup control plane operation on the table. The backups is either
     *         being created, deleted or restored to a table.
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
     * @sample AmazonDynamoDB.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBackupResult deleteBackup(DeleteBackupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackup(request);
    }

    @SdkInternalApi
    final DeleteBackupResult executeDeleteBackup(DeleteBackupRequest deleteBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupRequest> request = null;
        Response<DeleteBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteItem" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteItemResult deleteItem(DeleteItemRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteItem(request);
    }

    @SdkInternalApi
    final DeleteItemResult executeDeleteItem(DeleteItemRequest deleteItemRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteItemRequest> request = null;
        Response<DeleteItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteItemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteItemResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DeleteItemResult deleteItem(String tableName, java.util.Map<String, AttributeValue> key) {
        return deleteItem(new DeleteItemRequest().withTableName(tableName).withKey(key));
    }

    @Override
    public DeleteItemResult deleteItem(String tableName, java.util.Map<String, AttributeValue> key, String returnValues) {
        return deleteItem(new DeleteItemRequest().withTableName(tableName).withKey(key).withReturnValues(returnValues));
    }

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTableResult deleteTable(DeleteTableRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTable(request);
    }

    @SdkInternalApi
    final DeleteTableResult executeDeleteTable(DeleteTableRequest deleteTableRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTableRequest> request = null;
        Response<DeleteTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DeleteTableResult deleteTable(String tableName) {
        return deleteTable(new DeleteTableRequest().withTableName(tableName));
    }

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
    @Override
    public DescribeBackupResult describeBackup(DescribeBackupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBackup(request);
    }

    @SdkInternalApi
    final DescribeBackupResult executeDescribeBackup(DescribeBackupRequest describeBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBackupRequest> request = null;
        Response<DescribeBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Checks the status of the backup restore settings on the specified table. If backups are enabled,
     * <code>ContinuousBackupsStatus</code> will bet set to ENABLED.
     * </p>
     * <p>
     * You can call <code>DescribeContinuousBackups</code> at a maximum rate of 10 times per second.
     * </p>
     * 
     * @param describeContinuousBackupsRequest
     * @return Result of the DescribeContinuousBackups operation returned by the service.
     * @throws TableNotFoundException
     *         A table with the name <code>TableName</code> does not currently exist within the subscriber's account.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DescribeContinuousBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DescribeContinuousBackups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeContinuousBackupsResult describeContinuousBackups(DescribeContinuousBackupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeContinuousBackups(request);
    }

    @SdkInternalApi
    final DescribeContinuousBackupsResult executeDescribeContinuousBackups(DescribeContinuousBackupsRequest describeContinuousBackupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeContinuousBackupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeContinuousBackupsRequest> request = null;
        Response<DescribeContinuousBackupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeContinuousBackupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeContinuousBackupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeContinuousBackupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeContinuousBackupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the global table.
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
    @Override
    public DescribeGlobalTableResult describeGlobalTable(DescribeGlobalTableRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGlobalTable(request);
    }

    @SdkInternalApi
    final DescribeGlobalTableResult executeDescribeGlobalTable(DescribeGlobalTableRequest describeGlobalTableRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGlobalTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGlobalTableRequest> request = null;
        Response<DescribeGlobalTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGlobalTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeGlobalTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGlobalTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeGlobalTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeLimitsResult describeLimits(DescribeLimitsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLimits(request);
    }

    @SdkInternalApi
    final DescribeLimitsResult executeDescribeLimits(DescribeLimitsRequest describeLimitsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLimitsRequest> request = null;
        Response<DescribeLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLimitsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLimitsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLimitsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeTableResult describeTable(DescribeTableRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTable(request);
    }

    @SdkInternalApi
    final DescribeTableResult executeDescribeTable(DescribeTableRequest describeTableRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTableRequest> request = null;
        Response<DescribeTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeTableResult describeTable(String tableName) {
        return describeTable(new DescribeTableRequest().withTableName(tableName));
    }

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
    @Override
    public DescribeTimeToLiveResult describeTimeToLive(DescribeTimeToLiveRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTimeToLive(request);
    }

    @SdkInternalApi
    final DescribeTimeToLiveResult executeDescribeTimeToLive(DescribeTimeToLiveRequest describeTimeToLiveRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTimeToLiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTimeToLiveRequest> request = null;
        Response<DescribeTimeToLiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTimeToLiveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTimeToLiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTimeToLiveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTimeToLiveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.GetItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/GetItem" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetItemResult getItem(GetItemRequest request) {
        request = beforeClientExecution(request);
        return executeGetItem(request);
    }

    @SdkInternalApi
    final GetItemResult executeGetItem(GetItemRequest getItemRequest) {

        ExecutionContext executionContext = createExecutionContext(getItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetItemRequest> request = null;
        Response<GetItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetItemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetItemResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetItemResult getItem(String tableName, java.util.Map<String, AttributeValue> key) {
        return getItem(new GetItemRequest().withTableName(tableName).withKey(key));
    }

    @Override
    public GetItemResult getItem(String tableName, java.util.Map<String, AttributeValue> key, Boolean consistentRead) {
        return getItem(new GetItemRequest().withTableName(tableName).withKey(key).withConsistentRead(consistentRead));
    }

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
    @Override
    public ListBackupsResult listBackups(ListBackupsRequest request) {
        request = beforeClientExecution(request);
        return executeListBackups(request);
    }

    @SdkInternalApi
    final ListBackupsResult executeListBackups(ListBackupsRequest listBackupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBackupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBackupsRequest> request = null;
        Response<ListBackupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBackupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBackupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBackupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBackupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the global tables. Only those global tables that have replicas in the region specified as input are
     * returned.
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
    @Override
    public ListGlobalTablesResult listGlobalTables(ListGlobalTablesRequest request) {
        request = beforeClientExecution(request);
        return executeListGlobalTables(request);
    }

    @SdkInternalApi
    final ListGlobalTablesResult executeListGlobalTables(ListGlobalTablesRequest listGlobalTablesRequest) {

        ExecutionContext executionContext = createExecutionContext(listGlobalTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGlobalTablesRequest> request = null;
        Response<ListGlobalTablesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGlobalTablesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGlobalTablesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGlobalTablesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGlobalTablesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTablesResult listTables(ListTablesRequest request) {
        request = beforeClientExecution(request);
        return executeListTables(request);
    }

    @SdkInternalApi
    final ListTablesResult executeListTables(ListTablesRequest listTablesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTablesRequest> request = null;
        Response<ListTablesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTablesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTablesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTablesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTablesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListTablesResult listTables() {
        return listTables(new ListTablesRequest());
    }

    @Override
    public ListTablesResult listTables(String exclusiveStartTableName) {
        return listTables(new ListTablesRequest().withExclusiveStartTableName(exclusiveStartTableName));
    }

    @Override
    public ListTablesResult listTables(String exclusiveStartTableName, Integer limit) {
        return listTables(new ListTablesRequest().withExclusiveStartTableName(exclusiveStartTableName).withLimit(limit));
    }

    @Override
    public ListTablesResult listTables(Integer limit) {
        return listTables(new ListTablesRequest().withLimit(limit));
    }

    /**
     * <p>
     * List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource up to 10 times per second, per
     * account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html">Tagging for DynamoDB</a> in
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
    @Override
    public ListTagsOfResourceResult listTagsOfResource(ListTagsOfResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsOfResource(request);
    }

    @SdkInternalApi
    final ListTagsOfResourceResult executeListTagsOfResource(ListTagsOfResourceRequest listTagsOfResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsOfResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsOfResourceRequest> request = null;
        Response<ListTagsOfResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsOfResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsOfResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsOfResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsOfResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html">Working with
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
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/PutItem" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutItemResult putItem(PutItemRequest request) {
        request = beforeClientExecution(request);
        return executePutItem(request);
    }

    @SdkInternalApi
    final PutItemResult executePutItem(PutItemRequest putItemRequest) {

        ExecutionContext executionContext = createExecutionContext(putItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutItemRequest> request = null;
        Response<PutItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutItemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutItemResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public PutItemResult putItem(String tableName, java.util.Map<String, AttributeValue> item) {
        return putItem(new PutItemRequest().withTableName(tableName).withItem(item));
    }

    @Override
    public PutItemResult putItem(String tableName, java.util.Map<String, AttributeValue> item, String returnValues) {
        return putItem(new PutItemRequest().withTableName(tableName).withItem(item).withReturnValues(returnValues));
    }

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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Query.html#Query.Pagination">Paginating the
     * Results</a> in the <i>Amazon DynamoDB Developer Guide</i>.
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
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.Query
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Query" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public QueryResult query(QueryRequest request) {
        request = beforeClientExecution(request);
        return executeQuery(request);
    }

    @SdkInternalApi
    final QueryResult executeQuery(QueryRequest queryRequest) {

        ExecutionContext executionContext = createExecutionContext(queryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<QueryRequest> request = null;
        Response<QueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new QueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(queryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<QueryResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new QueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new table from an existing backup. Any number of users can execute up to 10 concurrent restores in a
     * given account.
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
     * Time to Live (TTL) settings
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreTableFromBackupRequest
     * @return Result of the RestoreTableFromBackup operation returned by the service.
     * @throws TableAlreadyExistsException
     *         A table with the name already exists.
     * @throws TableInUseException
     *         A table by that name is either being created or deleted.
     * @throws BackupNotFoundException
     *         Backup not found for the given BackupARN.
     * @throws BackupInUseException
     *         There is another ongoing conflicting backup control plane operation on the table. The backups is either
     *         being created, deleted or restored to a table.
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
     * @sample AmazonDynamoDB.RestoreTableFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/RestoreTableFromBackup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RestoreTableFromBackupResult restoreTableFromBackup(RestoreTableFromBackupRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreTableFromBackup(request);
    }

    @SdkInternalApi
    final RestoreTableFromBackupResult executeRestoreTableFromBackup(RestoreTableFromBackupRequest restoreTableFromBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreTableFromBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreTableFromBackupRequest> request = null;
        Response<RestoreTableFromBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreTableFromBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restoreTableFromBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreTableFromBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RestoreTableFromBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.Pagination">Paginating the
     * Results</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <code>Scan</code> operations proceed sequentially; however, for faster performance on a large table or secondary
     * index, applications can request a parallel <code>Scan</code> operation by providing the <code>Segment</code> and
     * <code>TotalSegments</code> parameters. For more information, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Scan.html#Scan.ParallelScan">Parallel
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
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.Scan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/Scan" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ScanResult scan(ScanRequest request) {
        request = beforeClientExecution(request);
        return executeScan(request);
    }

    @SdkInternalApi
    final ScanResult executeScan(ScanRequest scanRequest) {

        ExecutionContext executionContext = createExecutionContext(scanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ScanRequest> request = null;
        Response<ScanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ScanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(scanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ScanResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ScanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ScanResult scan(String tableName, java.util.List<String> attributesToGet) {
        return scan(new ScanRequest().withTableName(tableName).withAttributesToGet(attributesToGet));
    }

    @Override
    public ScanResult scan(String tableName, java.util.Map<String, Condition> scanFilter) {
        return scan(new ScanRequest().withTableName(tableName).withScanFilter(scanFilter));
    }

    @Override
    public ScanResult scan(String tableName, java.util.List<String> attributesToGet, java.util.Map<String, Condition> scanFilter) {
        return scan(new ScanRequest().withTableName(tableName).withAttributesToGet(attributesToGet).withScanFilter(scanFilter));
    }

    /**
     * <p>
     * Associate a set of tags with an Amazon DynamoDB resource. You can then activate these user-defined tags so that
     * they appear on the Billing and Cost Management console for cost allocation tracking. You can call TagResource up
     * to 5 times per second, per account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html">Tagging for DynamoDB</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws LimitExceededException
     *         The number of concurrent table requests (cumulative number of tables in the <code>CREATING</code>,
     *         <code>DELETING</code> or <code>UPDATING</code> state) exceeds the maximum allowed of 10.</p>
     *         <p>
     *         Also, for tables with secondary indexes, only one of those tables can be in the <code>CREATING</code>
     *         state at any point in time. Do not attempt to create more than one such table simultaneously.
     *         </p>
     *         <p>
     *         The total limit of tables in the <code>ACTIVE</code> state is 250.
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
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the association of tags from an Amazon DynamoDB resource. You can call UntagResource up to 5 times per
     * second, per account.
     * </p>
     * <p>
     * For an overview on tagging DynamoDB resources, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html">Tagging for DynamoDB</a> in
     * the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws LimitExceededException
     *         The number of concurrent table requests (cumulative number of tables in the <code>CREATING</code>,
     *         <code>DELETING</code> or <code>UPDATING</code> state) exceeds the maximum allowed of 10.</p>
     *         <p>
     *         Also, for tables with secondary indexes, only one of those tables can be in the <code>CREATING</code>
     *         state at any point in time. Do not attempt to create more than one such table simultaneously.
     *         </p>
     *         <p>
     *         The total limit of tables in the <code>ACTIVE</code> state is 250.
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
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or removes replicas to the specified global table. The global table should already exist to be able to use
     * this operation. Currently, the replica to be added should be empty.
     * </p>
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
     *         A table with the name <code>TableName</code> does not currently exist within the subscriber's account.
     * @sample AmazonDynamoDB.UpdateGlobalTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateGlobalTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGlobalTableResult updateGlobalTable(UpdateGlobalTableRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGlobalTable(request);
    }

    @SdkInternalApi
    final UpdateGlobalTableResult executeUpdateGlobalTable(UpdateGlobalTableRequest updateGlobalTableRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGlobalTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGlobalTableRequest> request = null;
        Response<UpdateGlobalTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGlobalTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGlobalTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGlobalTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGlobalTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateItem" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateItemResult updateItem(UpdateItemRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateItem(request);
    }

    @SdkInternalApi
    final UpdateItemResult executeUpdateItem(UpdateItemRequest updateItemRequest) {

        ExecutionContext executionContext = createExecutionContext(updateItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateItemRequest> request = null;
        Response<UpdateItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateItemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateItemResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateItemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public UpdateItemResult updateItem(String tableName, java.util.Map<String, AttributeValue> key, java.util.Map<String, AttributeValueUpdate> attributeUpdates) {
        return updateItem(new UpdateItemRequest().withTableName(tableName).withKey(key).withAttributeUpdates(attributeUpdates));
    }

    @Override
    public UpdateItemResult updateItem(String tableName, java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates, String returnValues) {
        return updateItem(new UpdateItemRequest().withTableName(tableName).withKey(key).withAttributeUpdates(attributeUpdates).withReturnValues(returnValues));
    }

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateTable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTableResult updateTable(UpdateTableRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTable(request);
    }

    @SdkInternalApi
    final UpdateTableResult executeUpdateTable(UpdateTableRequest updateTableRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTableRequest> request = null;
        Response<UpdateTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public UpdateTableResult updateTable(String tableName, ProvisionedThroughput provisionedThroughput) {
        return updateTable(new UpdateTableRequest().withTableName(tableName).withProvisionedThroughput(provisionedThroughput));
    }

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
     * For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/TTL.html">Time
     * To Live</a> in the Amazon DynamoDB Developer Guide.
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
     * @sample AmazonDynamoDB.UpdateTimeToLive
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateTimeToLive" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTimeToLiveResult updateTimeToLive(UpdateTimeToLiveRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTimeToLive(request);
    }

    @SdkInternalApi
    final UpdateTimeToLiveResult executeUpdateTimeToLive(UpdateTimeToLiveRequest updateTimeToLiveRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTimeToLiveRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTimeToLiveRequest> request = null;
        Response<UpdateTimeToLiveResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTimeToLiveRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTimeToLiveRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTimeToLiveResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTimeToLiveResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    @Override
    protected final boolean calculateCRC32FromCompressedData() {
        return true;
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public AmazonDynamoDBWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonDynamoDBWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
