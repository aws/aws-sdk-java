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
package com.amazonaws.services.kinesis;

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
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.kinesis.AmazonKinesisClientBuilder;
import com.amazonaws.services.kinesis.waiters.AmazonKinesisWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.services.kinesis.model.transform.*;

/**
 * Client for accessing Kinesis. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon Kinesis Data Streams Service API Reference</fullname>
 * <p>
 * Amazon Kinesis Data Streams is a managed service that scales elastically for real-time processing of streaming big
 * data.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisClient extends AmazonWebServiceClient implements AmazonKinesis {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonKinesis.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "kinesis";

    private volatile AmazonKinesisWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(true)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withModeledClass(
                                    com.amazonaws.services.kinesis.model.InvalidArgumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.kinesis.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSOptInRequired").withModeledClass(
                                    com.amazonaws.services.kinesis.model.KMSOptInRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.kinesis.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExpiredIteratorException").withModeledClass(
                                    com.amazonaws.services.kinesis.model.ExpiredIteratorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSAccessDeniedException").withModeledClass(
                                    com.amazonaws.services.kinesis.model.KMSAccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSInvalidStateException").withModeledClass(
                                    com.amazonaws.services.kinesis.model.KMSInvalidStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSDisabledException").withModeledClass(
                                    com.amazonaws.services.kinesis.model.KMSDisabledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSNotFoundException").withModeledClass(
                                    com.amazonaws.services.kinesis.model.KMSNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ProvisionedThroughputExceededException").withModeledClass(
                                    com.amazonaws.services.kinesis.model.ProvisionedThroughputExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSThrottlingException").withModeledClass(
                                    com.amazonaws.services.kinesis.model.KMSThrottlingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExpiredNextTokenException").withModeledClass(
                                    com.amazonaws.services.kinesis.model.ExpiredNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.kinesis.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.kinesis.model.AmazonKinesisException.class));

    /**
     * Constructs a new client to invoke service methods on Kinesis. A credentials provider chain will be used that
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
     * @deprecated use {@link AmazonKinesisClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonKinesisClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis. A credentials provider chain will be used that
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
     *        The client configuration options controlling how this client connects to Kinesis (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonKinesisClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonKinesisClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonKinesisClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonKinesisClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Kinesis (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonKinesisClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonKinesisClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonKinesisClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis using the specified AWS account credentials provider
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Kinesis (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonKinesisClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Kinesis (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonKinesisClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonKinesisClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonKinesisClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonKinesisClientBuilder builder() {
        return AmazonKinesisClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://kinesis.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/kinesis/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/kinesis/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds or updates tags for the specified Kinesis data stream. Each time you invoke this operation, you can specify
     * up to 10 tags. If you want to add more than 10 tags to your stream, you can invoke this operation multiple times.
     * In total, each stream can have up to 50 tags.
     * </p>
     * <p>
     * If tags have already been assigned to the stream, <code>AddTagsToStream</code> overwrites any existing tags that
     * correspond to the specified tag keys.
     * </p>
     * <p>
     * <a>AddTagsToStream</a> has a limit of five transactions per second per account.
     * </p>
     * 
     * @param addTagsToStreamRequest
     *        Represents the input for <code>AddTagsToStream</code>.
     * @return Result of the AddTagsToStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @sample AmazonKinesis.AddTagsToStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/AddTagsToStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddTagsToStreamResult addTagsToStream(AddTagsToStreamRequest request) {
        request = beforeClientExecution(request);
        return executeAddTagsToStream(request);
    }

    @SdkInternalApi
    final AddTagsToStreamResult executeAddTagsToStream(AddTagsToStreamRequest addTagsToStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsToStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToStreamRequest> request = null;
        Response<AddTagsToStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsToStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTagsToStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsToStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddTagsToStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Kinesis data stream. A stream captures and transports data records that are continuously emitted from
     * different data sources or <i>producers</i>. Scale-out within a stream is explicitly supported by means of shards,
     * which are uniquely identified groups of data records in a stream.
     * </p>
     * <p>
     * You specify and control the number of shards that a stream is composed of. Each shard can support reads up to
     * five transactions per second, up to a maximum data read total of 2 MB per second. Each shard can support writes
     * up to 1,000 records per second, up to a maximum data write total of 1 MB per second. If the amount of data input
     * increases or decreases, you can add or remove shards.
     * </p>
     * <p>
     * The stream name identifies the stream. The name is scoped to the AWS account used by the application. It is also
     * scoped by AWS Region. That is, two streams in two different accounts can have the same name, and two streams in
     * the same account, but in two different Regions, can have the same name.
     * </p>
     * <p>
     * <code>CreateStream</code> is an asynchronous operation. Upon receiving a <code>CreateStream</code> request,
     * Kinesis Data Streams immediately returns and sets the stream status to <code>CREATING</code>. After the stream is
     * created, Kinesis Data Streams sets the stream status to <code>ACTIVE</code>. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.
     * </p>
     * <p>
     * You receive a <code>LimitExceededException</code> when making a <code>CreateStream</code> request when you try to
     * do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Have more than five streams in the <code>CREATING</code> state at any point in time.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create more shards than are authorized for your account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the default shard limit for an AWS account, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Amazon Kinesis Data Streams
     * Limits</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>. To increase this limit, <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">contact AWS Support</a>.
     * </p>
     * <p>
     * You can use <code>DescribeStream</code> to check the stream status, which is returned in
     * <code>StreamStatus</code>.
     * </p>
     * <p>
     * <a>CreateStream</a> has a limit of five transactions per second per account.
     * </p>
     * 
     * @param createStreamRequest
     *        Represents the input for <code>CreateStream</code>.
     * @return Result of the CreateStream operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @sample AmazonKinesis.CreateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/CreateStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateStreamResult createStream(CreateStreamRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStream(request);
    }

    @SdkInternalApi
    final CreateStreamResult executeCreateStream(CreateStreamRequest createStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(createStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamRequest> request = null;
        Response<CreateStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public CreateStreamResult createStream(String streamName, Integer shardCount) {
        return createStream(new CreateStreamRequest().withStreamName(streamName).withShardCount(shardCount));
    }

    /**
     * <p>
     * Decreases the Kinesis data stream's retention period, which is the length of time data records are accessible
     * after they are added to the stream. The minimum value of a stream's retention period is 24 hours.
     * </p>
     * <p>
     * This operation may result in lost data. For example, if the stream's retention period is 48 hours and is
     * decreased to 24 hours, any data already in the stream that is older than 24 hours is inaccessible.
     * </p>
     * 
     * @param decreaseStreamRetentionPeriodRequest
     *        Represents the input for <a>DecreaseStreamRetentionPeriod</a>.
     * @return Result of the DecreaseStreamRetentionPeriod operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @sample AmazonKinesis.DecreaseStreamRetentionPeriod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DecreaseStreamRetentionPeriod"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DecreaseStreamRetentionPeriodResult decreaseStreamRetentionPeriod(DecreaseStreamRetentionPeriodRequest request) {
        request = beforeClientExecution(request);
        return executeDecreaseStreamRetentionPeriod(request);
    }

    @SdkInternalApi
    final DecreaseStreamRetentionPeriodResult executeDecreaseStreamRetentionPeriod(DecreaseStreamRetentionPeriodRequest decreaseStreamRetentionPeriodRequest) {

        ExecutionContext executionContext = createExecutionContext(decreaseStreamRetentionPeriodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DecreaseStreamRetentionPeriodRequest> request = null;
        Response<DecreaseStreamRetentionPeriodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DecreaseStreamRetentionPeriodRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(decreaseStreamRetentionPeriodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DecreaseStreamRetentionPeriod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DecreaseStreamRetentionPeriodResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DecreaseStreamRetentionPeriodResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Kinesis data stream and all its shards and data. You must shut down any applications that are operating
     * on the stream before you delete the stream. If an application attempts to operate on a deleted stream, it
     * receives the exception <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the stream is in the <code>ACTIVE</code> state, you can delete it. After a <code>DeleteStream</code> request,
     * the specified stream is in the <code>DELETING</code> state until Kinesis Data Streams completes the deletion.
     * </p>
     * <p>
     * <b>Note:</b> Kinesis Data Streams might continue to accept data read and write operations, such as
     * <a>PutRecord</a>, <a>PutRecords</a>, and <a>GetRecords</a>, on a stream in the <code>DELETING</code> state until
     * the stream deletion is complete.
     * </p>
     * <p>
     * When you delete a stream, any shards in that stream are also deleted, and any tags are dissociated from the
     * stream.
     * </p>
     * <p>
     * You can use the <a>DescribeStream</a> operation to check the state of the stream, which is returned in
     * <code>StreamStatus</code>.
     * </p>
     * <p>
     * <a>DeleteStream</a> has a limit of five transactions per second per account.
     * </p>
     * 
     * @param deleteStreamRequest
     *        Represents the input for <a>DeleteStream</a>.
     * @return Result of the DeleteStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @sample AmazonKinesis.DeleteStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DeleteStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteStreamResult deleteStream(DeleteStreamRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStream(request);
    }

    @SdkInternalApi
    final DeleteStreamResult executeDeleteStream(DeleteStreamRequest deleteStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamRequest> request = null;
        Response<DeleteStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DeleteStreamResult deleteStream(String streamName) {
        return deleteStream(new DeleteStreamRequest().withStreamName(streamName));
    }

    /**
     * <p>
     * To deregister a consumer, provide its ARN. Alternatively, you can provide the ARN of the data stream and the name
     * you gave the consumer when you registered it. You may also provide all three parameters, as long as they don't
     * conflict with each other. If you don't know the name or ARN of the consumer that you want to deregister, you can
     * use the <a>ListStreamConsumers</a> operation to get a list of the descriptions of all the consumers that are
     * currently registered with a given data stream. The description of a consumer contains its name and ARN.
     * </p>
     * <p>
     * This operation has a limit of five transactions per second per account.
     * </p>
     * 
     * @param deregisterStreamConsumerRequest
     * @return Result of the DeregisterStreamConsumer operation returned by the service.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @sample AmazonKinesis.DeregisterStreamConsumer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DeregisterStreamConsumer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterStreamConsumerResult deregisterStreamConsumer(DeregisterStreamConsumerRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterStreamConsumer(request);
    }

    @SdkInternalApi
    final DeregisterStreamConsumerResult executeDeregisterStreamConsumer(DeregisterStreamConsumerRequest deregisterStreamConsumerRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterStreamConsumerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterStreamConsumerRequest> request = null;
        Response<DeregisterStreamConsumerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterStreamConsumerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterStreamConsumerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterStreamConsumer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterStreamConsumerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterStreamConsumerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the shard limits and usage for the account.
     * </p>
     * <p>
     * If you update your account limits, the old limits might be returned for a few minutes.
     * </p>
     * <p>
     * This operation has a limit of one transaction per second per account.
     * </p>
     * 
     * @param describeLimitsRequest
     * @return Result of the DescribeLimits operation returned by the service.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @sample AmazonKinesis.DescribeLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DescribeLimits" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLimits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Describes the specified Kinesis data stream.
     * </p>
     * <p>
     * The information returned includes the stream name, Amazon Resource Name (ARN), creation time, enhanced metric
     * configuration, and shard map. The shard map is an array of shard objects. For each shard object, there is the
     * hash key and sequence number ranges that the shard spans, and the IDs of any earlier shards that played in a role
     * in creating the shard. Every record ingested in the stream is identified by a sequence number, which is assigned
     * when the record is put into the stream.
     * </p>
     * <p>
     * You can limit the number of shards returned by each call. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-retrieve-shards.html">Retrieving
     * Shards from a Stream</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * <p>
     * There are no guarantees about the chronological order shards returned. To process shards in chronological order,
     * use the ID of the parent shard to track the lineage to the oldest shard.
     * </p>
     * <p>
     * This operation has a limit of 10 transactions per second per account.
     * </p>
     * 
     * @param describeStreamRequest
     *        Represents the input for <code>DescribeStream</code>.
     * @return Result of the DescribeStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @sample AmazonKinesis.DescribeStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DescribeStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeStreamResult describeStream(DescribeStreamRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStream(request);
    }

    @SdkInternalApi
    final DescribeStreamResult executeDescribeStream(DescribeStreamRequest describeStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStreamRequest> request = null;
        Response<DescribeStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeStreamResult describeStream(String streamName) {
        return describeStream(new DescribeStreamRequest().withStreamName(streamName));
    }

    @Override
    public DescribeStreamResult describeStream(String streamName, String exclusiveStartShardId) {
        return describeStream(new DescribeStreamRequest().withStreamName(streamName).withExclusiveStartShardId(exclusiveStartShardId));
    }

    @Override
    public DescribeStreamResult describeStream(String streamName, Integer limit, String exclusiveStartShardId) {
        return describeStream(new DescribeStreamRequest().withStreamName(streamName).withLimit(limit).withExclusiveStartShardId(exclusiveStartShardId));
    }

    /**
     * <p>
     * To get the description of a registered consumer, provide the ARN of the consumer. Alternatively, you can provide
     * the ARN of the data stream and the name you gave the consumer when you registered it. You may also provide all
     * three parameters, as long as they don't conflict with each other. If you don't know the name or ARN of the
     * consumer that you want to describe, you can use the <a>ListStreamConsumers</a> operation to get a list of the
     * descriptions of all the consumers that are currently registered with a given data stream.
     * </p>
     * <p>
     * This operation has a limit of 20 transactions per second per account.
     * </p>
     * 
     * @param describeStreamConsumerRequest
     * @return Result of the DescribeStreamConsumer operation returned by the service.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @sample AmazonKinesis.DescribeStreamConsumer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DescribeStreamConsumer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeStreamConsumerResult describeStreamConsumer(DescribeStreamConsumerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStreamConsumer(request);
    }

    @SdkInternalApi
    final DescribeStreamConsumerResult executeDescribeStreamConsumer(DescribeStreamConsumerRequest describeStreamConsumerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStreamConsumerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStreamConsumerRequest> request = null;
        Response<DescribeStreamConsumerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStreamConsumerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStreamConsumerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStreamConsumer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStreamConsumerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeStreamConsumerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a summarized description of the specified Kinesis data stream without the shard list.
     * </p>
     * <p>
     * The information returned includes the stream name, Amazon Resource Name (ARN), status, record retention period,
     * approximate creation time, monitoring, encryption details, and open shard count.
     * </p>
     * 
     * @param describeStreamSummaryRequest
     * @return Result of the DescribeStreamSummary operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @sample AmazonKinesis.DescribeStreamSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DescribeStreamSummary" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeStreamSummaryResult describeStreamSummary(DescribeStreamSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStreamSummary(request);
    }

    @SdkInternalApi
    final DescribeStreamSummaryResult executeDescribeStreamSummary(DescribeStreamSummaryRequest describeStreamSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStreamSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStreamSummaryRequest> request = null;
        Response<DescribeStreamSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStreamSummaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStreamSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStreamSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStreamSummaryResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeStreamSummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables enhanced monitoring.
     * </p>
     * 
     * @param disableEnhancedMonitoringRequest
     *        Represents the input for <a>DisableEnhancedMonitoring</a>.
     * @return Result of the DisableEnhancedMonitoring operation returned by the service.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @sample AmazonKinesis.DisableEnhancedMonitoring
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DisableEnhancedMonitoring"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableEnhancedMonitoringResult disableEnhancedMonitoring(DisableEnhancedMonitoringRequest request) {
        request = beforeClientExecution(request);
        return executeDisableEnhancedMonitoring(request);
    }

    @SdkInternalApi
    final DisableEnhancedMonitoringResult executeDisableEnhancedMonitoring(DisableEnhancedMonitoringRequest disableEnhancedMonitoringRequest) {

        ExecutionContext executionContext = createExecutionContext(disableEnhancedMonitoringRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableEnhancedMonitoringRequest> request = null;
        Response<DisableEnhancedMonitoringResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableEnhancedMonitoringRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disableEnhancedMonitoringRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableEnhancedMonitoring");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableEnhancedMonitoringResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisableEnhancedMonitoringResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables enhanced Kinesis data stream monitoring for shard-level metrics.
     * </p>
     * 
     * @param enableEnhancedMonitoringRequest
     *        Represents the input for <a>EnableEnhancedMonitoring</a>.
     * @return Result of the EnableEnhancedMonitoring operation returned by the service.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @sample AmazonKinesis.EnableEnhancedMonitoring
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/EnableEnhancedMonitoring"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableEnhancedMonitoringResult enableEnhancedMonitoring(EnableEnhancedMonitoringRequest request) {
        request = beforeClientExecution(request);
        return executeEnableEnhancedMonitoring(request);
    }

    @SdkInternalApi
    final EnableEnhancedMonitoringResult executeEnableEnhancedMonitoring(EnableEnhancedMonitoringRequest enableEnhancedMonitoringRequest) {

        ExecutionContext executionContext = createExecutionContext(enableEnhancedMonitoringRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableEnhancedMonitoringRequest> request = null;
        Response<EnableEnhancedMonitoringResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableEnhancedMonitoringRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(enableEnhancedMonitoringRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableEnhancedMonitoring");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableEnhancedMonitoringResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new EnableEnhancedMonitoringResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets data records from a Kinesis data stream's shard.
     * </p>
     * <p>
     * Specify a shard iterator using the <code>ShardIterator</code> parameter. The shard iterator specifies the
     * position in the shard from which you want to start reading data records sequentially. If there are no records
     * available in the portion of the shard that the iterator points to, <a>GetRecords</a> returns an empty list. It
     * might take multiple calls to get to a portion of the shard that contains records.
     * </p>
     * <p>
     * You can scale by provisioning multiple shards per stream while considering service limits (for more information,
     * see <a href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Amazon Kinesis Data
     * Streams Limits</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>). Your application should have one
     * thread per shard, each reading continuously from its stream. To read from a stream continually, call
     * <a>GetRecords</a> in a loop. Use <a>GetShardIterator</a> to get the shard iterator to specify in the first
     * <a>GetRecords</a> call. <a>GetRecords</a> returns a new shard iterator in <code>NextShardIterator</code>. Specify
     * the shard iterator returned in <code>NextShardIterator</code> in subsequent calls to <a>GetRecords</a>. If the
     * shard has been closed, the shard iterator can't return more data and <a>GetRecords</a> returns <code>null</code>
     * in <code>NextShardIterator</code>. You can terminate the loop when the shard is closed, or when the shard
     * iterator reaches the record with the sequence number or other attribute that marks it as the last record to
     * process.
     * </p>
     * <p>
     * Each data record can be up to 1 MiB in size, and each shard can read up to 2 MiB per second. You can ensure that
     * your calls don't exceed the maximum supported size or throughput by using the <code>Limit</code> parameter to
     * specify the maximum number of records that <a>GetRecords</a> can return. Consider your average record size when
     * determining this limit. The maximum number of records that can be returned per call is 10,000.
     * </p>
     * <p>
     * The size of the data returned by <a>GetRecords</a> varies depending on the utilization of the shard. The maximum
     * size of data that <a>GetRecords</a> can return is 10 MiB. If a call returns this amount of data, subsequent calls
     * made within the next 5 seconds throw <code>ProvisionedThroughputExceededException</code>. If there is
     * insufficient provisioned throughput on the stream, subsequent calls made within the next 1 second throw
     * <code>ProvisionedThroughputExceededException</code>. <a>GetRecords</a> doesn't return any data when it throws an
     * exception. For this reason, we recommend that you wait 1 second between calls to <a>GetRecords</a>. However, it's
     * possible that the application will get exceptions for longer than 1 second.
     * </p>
     * <p>
     * To detect whether the application is falling behind in processing, you can use the
     * <code>MillisBehindLatest</code> response attribute. You can also monitor the stream using CloudWatch metrics and
     * other mechanisms (see <a href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring.html">Monitoring</a> in
     * the <i>Amazon Kinesis Data Streams Developer Guide</i>).
     * </p>
     * <p>
     * Each Amazon Kinesis record includes a value, <code>ApproximateArrivalTimestamp</code>, that is set when a stream
     * successfully receives and stores a record. This is commonly referred to as a server-side time stamp, whereas a
     * client-side time stamp is set when a data producer creates or sends the record to a stream (a data producer is
     * any data source putting data records into a stream, for example with <a>PutRecords</a>). The time stamp has
     * millisecond precision. There are no guarantees about the time stamp accuracy, or that the time stamp is always
     * increasing. For example, records in a shard or across a stream might have time stamps that are out of order.
     * </p>
     * <p>
     * This operation has a limit of five transactions per second per account.
     * </p>
     * 
     * @param getRecordsRequest
     *        Represents the input for <a>GetRecords</a>.
     * @return Result of the GetRecords operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws ProvisionedThroughputExceededException
     *         The request rate for the stream is too high, or the requested data is too large for the available
     *         throughput. Reduce the frequency or size of your requests. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in
     *         the <i>Amazon Kinesis Data Streams Developer Guide</i>, and <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/api-retries.html">Error Retries and Exponential
     *         Backoff in AWS</a> in the <i>AWS General Reference</i>.
     * @throws ExpiredIteratorException
     *         The provided iterator exceeds the maximum age allowed.
     * @throws KMSDisabledException
     *         The request was rejected because the specified customer master key (CMK) isn't enabled.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource isn't valid for this request. For
     *         more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     *         Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @throws KMSAccessDeniedException
     *         The ciphertext references a key that doesn't exist or that you don't have access to.
     * @throws KMSNotFoundException
     *         The request was rejected because the specified entity or resource can't be found.
     * @throws KMSOptInRequiredException
     *         The AWS access key ID needs a subscription for the service.
     * @throws KMSThrottlingException
     *         The request was denied due to request throttling. For more information about throttling, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html#requests-per-second">Limits</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AmazonKinesis.GetRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/GetRecords" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRecordsResult getRecords(GetRecordsRequest request) {
        request = beforeClientExecution(request);
        return executeGetRecords(request);
    }

    @SdkInternalApi
    final GetRecordsResult executeGetRecords(GetRecordsRequest getRecordsRequest) {

        ExecutionContext executionContext = createExecutionContext(getRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecordsRequest> request = null;
        Response<GetRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecordsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRecords");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRecordsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRecordsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Amazon Kinesis shard iterator. A shard iterator expires 5 minutes after it is returned to the requester.
     * </p>
     * <p>
     * A shard iterator specifies the shard position from which to start reading data records sequentially. The position
     * is specified using the sequence number of a data record in a shard. A sequence number is the identifier
     * associated with every record ingested in the stream, and is assigned when a record is put into the stream. Each
     * stream has one or more shards.
     * </p>
     * <p>
     * You must specify the shard iterator type. For example, you can set the <code>ShardIteratorType</code> parameter
     * to read exactly from the position denoted by a specific sequence number by using the
     * <code>AT_SEQUENCE_NUMBER</code> shard iterator type. Alternatively, the parameter can read right after the
     * sequence number by using the <code>AFTER_SEQUENCE_NUMBER</code> shard iterator type, using sequence numbers
     * returned by earlier calls to <a>PutRecord</a>, <a>PutRecords</a>, <a>GetRecords</a>, or <a>DescribeStream</a>. In
     * the request, you can specify the shard iterator type <code>AT_TIMESTAMP</code> to read records from an arbitrary
     * point in time, <code>TRIM_HORIZON</code> to cause <code>ShardIterator</code> to point to the last untrimmed
     * record in the shard in the system (the oldest data record in the shard), or <code>LATEST</code> so that you
     * always read the most recent data in the shard.
     * </p>
     * <p>
     * When you read repeatedly from a stream, use a <a>GetShardIterator</a> request to get the first shard iterator for
     * use in your first <a>GetRecords</a> request and for subsequent reads use the shard iterator returned by the
     * <a>GetRecords</a> request in <code>NextShardIterator</code>. A new shard iterator is returned by every
     * <a>GetRecords</a> request in <code>NextShardIterator</code>, which you use in the <code>ShardIterator</code>
     * parameter of the next <a>GetRecords</a> request.
     * </p>
     * <p>
     * If a <a>GetShardIterator</a> request is made too often, you receive a
     * <code>ProvisionedThroughputExceededException</code>. For more information about throughput limits, see
     * <a>GetRecords</a>, and <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in the
     * <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * <p>
     * If the shard is closed, <a>GetShardIterator</a> returns a valid iterator for the last sequence number of the
     * shard. A shard can be closed as a result of using <a>SplitShard</a> or <a>MergeShards</a>.
     * </p>
     * <p>
     * <a>GetShardIterator</a> has a limit of five transactions per second per account per open shard.
     * </p>
     * 
     * @param getShardIteratorRequest
     *        Represents the input for <code>GetShardIterator</code>.
     * @return Result of the GetShardIterator operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws ProvisionedThroughputExceededException
     *         The request rate for the stream is too high, or the requested data is too large for the available
     *         throughput. Reduce the frequency or size of your requests. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in
     *         the <i>Amazon Kinesis Data Streams Developer Guide</i>, and <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/api-retries.html">Error Retries and Exponential
     *         Backoff in AWS</a> in the <i>AWS General Reference</i>.
     * @sample AmazonKinesis.GetShardIterator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/GetShardIterator" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetShardIteratorResult getShardIterator(GetShardIteratorRequest request) {
        request = beforeClientExecution(request);
        return executeGetShardIterator(request);
    }

    @SdkInternalApi
    final GetShardIteratorResult executeGetShardIterator(GetShardIteratorRequest getShardIteratorRequest) {

        ExecutionContext executionContext = createExecutionContext(getShardIteratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetShardIteratorRequest> request = null;
        Response<GetShardIteratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetShardIteratorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getShardIteratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetShardIterator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetShardIteratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetShardIteratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetShardIteratorResult getShardIterator(String streamName, String shardId, String shardIteratorType) {
        return getShardIterator(new GetShardIteratorRequest().withStreamName(streamName).withShardId(shardId).withShardIteratorType(shardIteratorType));
    }

    @Override
    public GetShardIteratorResult getShardIterator(String streamName, String shardId, String shardIteratorType, String startingSequenceNumber) {
        return getShardIterator(new GetShardIteratorRequest().withStreamName(streamName).withShardId(shardId).withShardIteratorType(shardIteratorType)
                .withStartingSequenceNumber(startingSequenceNumber));
    }

    /**
     * <p>
     * Increases the Kinesis data stream's retention period, which is the length of time data records are accessible
     * after they are added to the stream. The maximum value of a stream's retention period is 168 hours (7 days).
     * </p>
     * <p>
     * If you choose a longer stream retention period, this operation increases the time period during which records
     * that have not yet expired are accessible. However, it does not make previous, expired data (older than the
     * stream's previous retention period) accessible after the operation has been called. For example, if a stream's
     * retention period is set to 24 hours and is increased to 168 hours, any data that is older than 24 hours remains
     * inaccessible to consumer applications.
     * </p>
     * 
     * @param increaseStreamRetentionPeriodRequest
     *        Represents the input for <a>IncreaseStreamRetentionPeriod</a>.
     * @return Result of the IncreaseStreamRetentionPeriod operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @sample AmazonKinesis.IncreaseStreamRetentionPeriod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/IncreaseStreamRetentionPeriod"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public IncreaseStreamRetentionPeriodResult increaseStreamRetentionPeriod(IncreaseStreamRetentionPeriodRequest request) {
        request = beforeClientExecution(request);
        return executeIncreaseStreamRetentionPeriod(request);
    }

    @SdkInternalApi
    final IncreaseStreamRetentionPeriodResult executeIncreaseStreamRetentionPeriod(IncreaseStreamRetentionPeriodRequest increaseStreamRetentionPeriodRequest) {

        ExecutionContext executionContext = createExecutionContext(increaseStreamRetentionPeriodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IncreaseStreamRetentionPeriodRequest> request = null;
        Response<IncreaseStreamRetentionPeriodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IncreaseStreamRetentionPeriodRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(increaseStreamRetentionPeriodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "IncreaseStreamRetentionPeriod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<IncreaseStreamRetentionPeriodResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new IncreaseStreamRetentionPeriodResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the shards in a stream and provides information about each shard. This operation has a limit of 100
     * transactions per second per data stream.
     * </p>
     * <important>
     * <p>
     * This API is a new operation that is used by the Amazon Kinesis Client Library (KCL). If you have a fine-grained
     * IAM policy that only allows specific operations, you must update your policy to allow calls to this API. For more
     * information, see <a href="https://docs.aws.amazon.com/streams/latest/dev/controlling-access.html">Controlling
     * Access to Amazon Kinesis Data Streams Resources Using IAM</a>.
     * </p>
     * </important>
     * 
     * @param listShardsRequest
     * @return Result of the ListShards operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ExpiredNextTokenException
     *         The pagination token passed to the operation is expired.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @sample AmazonKinesis.ListShards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ListShards" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListShardsResult listShards(ListShardsRequest request) {
        request = beforeClientExecution(request);
        return executeListShards(request);
    }

    @SdkInternalApi
    final ListShardsResult executeListShards(ListShardsRequest listShardsRequest) {

        ExecutionContext executionContext = createExecutionContext(listShardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListShardsRequest> request = null;
        Response<ListShardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListShardsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listShardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListShards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListShardsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListShardsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the consumers registered to receive data from a stream using enhanced fan-out, and provides information
     * about each consumer.
     * </p>
     * <p>
     * This operation has a limit of 10 transactions per second per account.
     * </p>
     * 
     * @param listStreamConsumersRequest
     * @return Result of the ListStreamConsumers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ExpiredNextTokenException
     *         The pagination token passed to the operation is expired.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @sample AmazonKinesis.ListStreamConsumers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ListStreamConsumers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListStreamConsumersResult listStreamConsumers(ListStreamConsumersRequest request) {
        request = beforeClientExecution(request);
        return executeListStreamConsumers(request);
    }

    @SdkInternalApi
    final ListStreamConsumersResult executeListStreamConsumers(ListStreamConsumersRequest listStreamConsumersRequest) {

        ExecutionContext executionContext = createExecutionContext(listStreamConsumersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamConsumersRequest> request = null;
        Response<ListStreamConsumersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamConsumersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStreamConsumersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStreamConsumers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStreamConsumersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStreamConsumersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your Kinesis data streams.
     * </p>
     * <p>
     * The number of streams may be too large to return from a single call to <code>ListStreams</code>. You can limit
     * the number of returned streams using the <code>Limit</code> parameter. If you do not specify a value for the
     * <code>Limit</code> parameter, Kinesis Data Streams uses the default limit, which is currently 10.
     * </p>
     * <p>
     * You can detect if there are more streams available to list by using the <code>HasMoreStreams</code> flag from the
     * returned output. If there are more streams available, you can request more streams by using the name of the last
     * stream returned by the <code>ListStreams</code> request in the <code>ExclusiveStartStreamName</code> parameter in
     * a subsequent request to <code>ListStreams</code>. The group of stream names returned by the subsequent request is
     * then added to the list. You can continue this process until all the stream names have been collected in the list.
     * </p>
     * <p>
     * <a>ListStreams</a> has a limit of five transactions per second per account.
     * </p>
     * 
     * @param listStreamsRequest
     *        Represents the input for <code>ListStreams</code>.
     * @return Result of the ListStreams operation returned by the service.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @sample AmazonKinesis.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ListStreams" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStreamsResult listStreams(ListStreamsRequest request) {
        request = beforeClientExecution(request);
        return executeListStreams(request);
    }

    @SdkInternalApi
    final ListStreamsResult executeListStreams(ListStreamsRequest listStreamsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamsRequest> request = null;
        Response<ListStreamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStreamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStreams");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStreamsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStreamsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListStreamsResult listStreams() {
        return listStreams(new ListStreamsRequest());
    }

    @Override
    public ListStreamsResult listStreams(String exclusiveStartStreamName) {
        return listStreams(new ListStreamsRequest().withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    @Override
    public ListStreamsResult listStreams(Integer limit, String exclusiveStartStreamName) {
        return listStreams(new ListStreamsRequest().withLimit(limit).withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    /**
     * <p>
     * Lists the tags for the specified Kinesis data stream. This operation has a limit of five transactions per second
     * per account.
     * </p>
     * 
     * @param listTagsForStreamRequest
     *        Represents the input for <code>ListTagsForStream</code>.
     * @return Result of the ListTagsForStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @sample AmazonKinesis.ListTagsForStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ListTagsForStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsForStreamResult listTagsForStream(ListTagsForStreamRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForStream(request);
    }

    @SdkInternalApi
    final ListTagsForStreamResult executeListTagsForStream(ListTagsForStreamRequest listTagsForStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForStreamRequest> request = null;
        Response<ListTagsForStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Merges two adjacent shards in a Kinesis data stream and combines them into a single shard to reduce the stream's
     * capacity to ingest and transport data. Two shards are considered adjacent if the union of the hash key ranges for
     * the two shards form a contiguous set with no gaps. For example, if you have two shards, one with a hash key range
     * of 276...381 and the other with a hash key range of 382...454, then you could merge these two shards into a
     * single shard that would have a hash key range of 276...454. After the merge, the single child shard receives data
     * for all hash key values covered by the two parent shards.
     * </p>
     * <p>
     * <code>MergeShards</code> is called when there is a need to reduce the overall capacity of a stream because of
     * excess capacity that is not being used. You must specify the shard to be merged and the adjacent shard for a
     * stream. For more information about merging shards, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-resharding-merge.html">Merge Two
     * Shards</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * <p>
     * If the stream is in the <code>ACTIVE</code> state, you can call <code>MergeShards</code>. If a stream is in the
     * <code>CREATING</code>, <code>UPDATING</code>, or <code>DELETING</code> state, <code>MergeShards</code> returns a
     * <code>ResourceInUseException</code>. If the specified stream does not exist, <code>MergeShards</code> returns a
     * <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * You can use <a>DescribeStream</a> to check the state of the stream, which is returned in
     * <code>StreamStatus</code>.
     * </p>
     * <p>
     * <code>MergeShards</code> is an asynchronous operation. Upon receiving a <code>MergeShards</code> request, Amazon
     * Kinesis Data Streams immediately returns a response and sets the <code>StreamStatus</code> to
     * <code>UPDATING</code>. After the operation is completed, Kinesis Data Streams sets the <code>StreamStatus</code>
     * to <code>ACTIVE</code>. Read and write operations continue to work while the stream is in the
     * <code>UPDATING</code> state.
     * </p>
     * <p>
     * You use <a>DescribeStream</a> to determine the shard IDs that are specified in the <code>MergeShards</code>
     * request.
     * </p>
     * <p>
     * If you try to operate on too many streams in parallel using <a>CreateStream</a>, <a>DeleteStream</a>,
     * <code>MergeShards</code>, or <a>SplitShard</a>, you receive a <code>LimitExceededException</code>.
     * </p>
     * <p>
     * <code>MergeShards</code> has a limit of five transactions per second per account.
     * </p>
     * 
     * @param mergeShardsRequest
     *        Represents the input for <code>MergeShards</code>.
     * @return Result of the MergeShards operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @sample AmazonKinesis.MergeShards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/MergeShards" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public MergeShardsResult mergeShards(MergeShardsRequest request) {
        request = beforeClientExecution(request);
        return executeMergeShards(request);
    }

    @SdkInternalApi
    final MergeShardsResult executeMergeShards(MergeShardsRequest mergeShardsRequest) {

        ExecutionContext executionContext = createExecutionContext(mergeShardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergeShardsRequest> request = null;
        Response<MergeShardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergeShardsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(mergeShardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MergeShards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MergeShardsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new MergeShardsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public MergeShardsResult mergeShards(String streamName, String shardToMerge, String adjacentShardToMerge) {
        return mergeShards(new MergeShardsRequest().withStreamName(streamName).withShardToMerge(shardToMerge).withAdjacentShardToMerge(adjacentShardToMerge));
    }

    /**
     * <p>
     * Writes a single data record into an Amazon Kinesis data stream. Call <code>PutRecord</code> to send data into the
     * stream for real-time ingestion and subsequent processing, one record at a time. Each shard can support writes up
     * to 1,000 records per second, up to a maximum data write total of 1 MB per second.
     * </p>
     * <p>
     * You must specify the name of the stream that captures, stores, and transports the data; a partition key; and the
     * data blob itself.
     * </p>
     * <p>
     * The data blob can be any type of data; for example, a segment from a log file, geographic/location data, website
     * clickstream data, and so on.
     * </p>
     * <p>
     * The partition key is used by Kinesis Data Streams to distribute data across shards. Kinesis Data Streams
     * segregates the data records that belong to a stream into multiple shards, using the partition key associated with
     * each data record to determine the shard to which a given data record belongs.
     * </p>
     * <p>
     * Partition keys are Unicode strings, with a maximum length limit of 256 characters for each key. An MD5 hash
     * function is used to map partition keys to 128-bit integer values and to map associated data records to shards
     * using the hash key ranges of the shards. You can override hashing the partition key to determine the shard by
     * explicitly specifying a hash value using the <code>ExplicitHashKey</code> parameter. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
     * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * <p>
     * <code>PutRecord</code> returns the shard ID of where the data record was placed and the sequence number that was
     * assigned to the data record.
     * </p>
     * <p>
     * Sequence numbers increase over time and are specific to a shard within a stream, not across all shards within a
     * stream. To guarantee strictly increasing ordering, write serially to a shard and use the
     * <code>SequenceNumberForOrdering</code> parameter. For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
     * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>PutRecord</code> request cannot be processed because of insufficient provisioned throughput on the
     * shard involved in the request, <code>PutRecord</code> throws <code>ProvisionedThroughputExceededException</code>.
     * </p>
     * <p>
     * By default, data records are accessible for 24 hours from the time that they are added to a stream. You can use
     * <a>IncreaseStreamRetentionPeriod</a> or <a>DecreaseStreamRetentionPeriod</a> to modify this retention period.
     * </p>
     * 
     * @param putRecordRequest
     *        Represents the input for <code>PutRecord</code>.
     * @return Result of the PutRecord operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws ProvisionedThroughputExceededException
     *         The request rate for the stream is too high, or the requested data is too large for the available
     *         throughput. Reduce the frequency or size of your requests. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in
     *         the <i>Amazon Kinesis Data Streams Developer Guide</i>, and <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/api-retries.html">Error Retries and Exponential
     *         Backoff in AWS</a> in the <i>AWS General Reference</i>.
     * @throws KMSDisabledException
     *         The request was rejected because the specified customer master key (CMK) isn't enabled.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource isn't valid for this request. For
     *         more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     *         Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @throws KMSAccessDeniedException
     *         The ciphertext references a key that doesn't exist or that you don't have access to.
     * @throws KMSNotFoundException
     *         The request was rejected because the specified entity or resource can't be found.
     * @throws KMSOptInRequiredException
     *         The AWS access key ID needs a subscription for the service.
     * @throws KMSThrottlingException
     *         The request was denied due to request throttling. For more information about throttling, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html#requests-per-second">Limits</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AmazonKinesis.PutRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/PutRecord" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutRecordResult putRecord(PutRecordRequest request) {
        request = beforeClientExecution(request);
        return executePutRecord(request);
    }

    @SdkInternalApi
    final PutRecordResult executePutRecord(PutRecordRequest putRecordRequest) {

        ExecutionContext executionContext = createExecutionContext(putRecordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRecordRequest> request = null;
        Response<PutRecordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRecordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRecordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRecord");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRecordResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutRecordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public PutRecordResult putRecord(String streamName, java.nio.ByteBuffer data, String partitionKey) {
        return putRecord(new PutRecordRequest().withStreamName(streamName).withData(data).withPartitionKey(partitionKey));
    }

    @Override
    public PutRecordResult putRecord(String streamName, java.nio.ByteBuffer data, String partitionKey, String sequenceNumberForOrdering) {
        return putRecord(new PutRecordRequest().withStreamName(streamName).withData(data).withPartitionKey(partitionKey)
                .withSequenceNumberForOrdering(sequenceNumberForOrdering));
    }

    /**
     * <p>
     * Writes multiple data records into a Kinesis data stream in a single call (also referred to as a
     * <code>PutRecords</code> request). Use this operation to send data into the stream for data ingestion and
     * processing.
     * </p>
     * <p>
     * Each <code>PutRecords</code> request can support up to 500 records. Each record in the request can be as large as
     * 1 MB, up to a limit of 5 MB for the entire request, including partition keys. Each shard can support writes up to
     * 1,000 records per second, up to a maximum data write total of 1 MB per second.
     * </p>
     * <p>
     * You must specify the name of the stream that captures, stores, and transports the data; and an array of request
     * <code>Records</code>, with each record in the array requiring a partition key and data blob. The record size
     * limit applies to the total size of the partition key and data blob.
     * </p>
     * <p>
     * The data blob can be any type of data; for example, a segment from a log file, geographic/location data, website
     * clickstream data, and so on.
     * </p>
     * <p>
     * The partition key is used by Kinesis Data Streams as input to a hash function that maps the partition key and
     * associated data to a specific shard. An MD5 hash function is used to map partition keys to 128-bit integer values
     * and to map associated data records to shards. As a result of this hashing mechanism, all data records with the
     * same partition key map to the same shard within the stream. For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
     * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * <p>
     * Each record in the <code>Records</code> array may include an optional parameter, <code>ExplicitHashKey</code>,
     * which overrides the partition key to shard mapping. This parameter allows a data producer to determine explicitly
     * the shard where the record is stored. For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-putrecords"
     * >Adding Multiple Records with PutRecords</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * <p>
     * The <code>PutRecords</code> response includes an array of response <code>Records</code>. Each record in the
     * response array directly correlates with a record in the request array using natural ordering, from the top to the
     * bottom of the request and response. The response <code>Records</code> array always includes the same number of
     * records as the request array.
     * </p>
     * <p>
     * The response <code>Records</code> array includes both successfully and unsuccessfully processed records. Kinesis
     * Data Streams attempts to process all records in each <code>PutRecords</code> request. A single record failure
     * does not stop the processing of subsequent records.
     * </p>
     * <p>
     * A successfully processed record includes <code>ShardId</code> and <code>SequenceNumber</code> values. The
     * <code>ShardId</code> parameter identifies the shard in the stream where the record is stored. The
     * <code>SequenceNumber</code> parameter is an identifier assigned to the put record, unique to all records in the
     * stream.
     * </p>
     * <p>
     * An unsuccessfully processed record includes <code>ErrorCode</code> and <code>ErrorMessage</code> values.
     * <code>ErrorCode</code> reflects the type of error and can be one of the following values:
     * <code>ProvisionedThroughputExceededException</code> or <code>InternalFailure</code>. <code>ErrorMessage</code>
     * provides more detailed information about the <code>ProvisionedThroughputExceededException</code> exception
     * including the account ID, stream name, and shard ID of the record that was throttled. For more information about
     * partially successful responses, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-add-data-to-stream.html#kinesis-using-sdk-java-putrecords"
     * >Adding Multiple Records with PutRecords</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * <p>
     * By default, data records are accessible for 24 hours from the time that they are added to a stream. You can use
     * <a>IncreaseStreamRetentionPeriod</a> or <a>DecreaseStreamRetentionPeriod</a> to modify this retention period.
     * </p>
     * 
     * @param putRecordsRequest
     *        A <code>PutRecords</code> request.
     * @return Result of the PutRecords operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws ProvisionedThroughputExceededException
     *         The request rate for the stream is too high, or the requested data is too large for the available
     *         throughput. Reduce the frequency or size of your requests. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in
     *         the <i>Amazon Kinesis Data Streams Developer Guide</i>, and <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/api-retries.html">Error Retries and Exponential
     *         Backoff in AWS</a> in the <i>AWS General Reference</i>.
     * @throws KMSDisabledException
     *         The request was rejected because the specified customer master key (CMK) isn't enabled.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource isn't valid for this request. For
     *         more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     *         Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @throws KMSAccessDeniedException
     *         The ciphertext references a key that doesn't exist or that you don't have access to.
     * @throws KMSNotFoundException
     *         The request was rejected because the specified entity or resource can't be found.
     * @throws KMSOptInRequiredException
     *         The AWS access key ID needs a subscription for the service.
     * @throws KMSThrottlingException
     *         The request was denied due to request throttling. For more information about throttling, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html#requests-per-second">Limits</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AmazonKinesis.PutRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/PutRecords" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutRecordsResult putRecords(PutRecordsRequest request) {
        request = beforeClientExecution(request);
        return executePutRecords(request);
    }

    @SdkInternalApi
    final PutRecordsResult executePutRecords(PutRecordsRequest putRecordsRequest) {

        ExecutionContext executionContext = createExecutionContext(putRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRecordsRequest> request = null;
        Response<PutRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRecordsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRecords");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRecordsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutRecordsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a consumer with a Kinesis data stream. When you use this operation, the consumer you register can read
     * data from the stream at a rate of up to 2 MiB per second. This rate is unaffected by the total number of
     * consumers that read from the same stream.
     * </p>
     * <p>
     * You can register up to 5 consumers per stream. A given consumer can only be registered with one stream.
     * </p>
     * <p>
     * This operation has a limit of five transactions per second per account.
     * </p>
     * 
     * @param registerStreamConsumerRequest
     * @return Result of the RegisterStreamConsumer operation returned by the service.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @sample AmazonKinesis.RegisterStreamConsumer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/RegisterStreamConsumer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterStreamConsumerResult registerStreamConsumer(RegisterStreamConsumerRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterStreamConsumer(request);
    }

    @SdkInternalApi
    final RegisterStreamConsumerResult executeRegisterStreamConsumer(RegisterStreamConsumerRequest registerStreamConsumerRequest) {

        ExecutionContext executionContext = createExecutionContext(registerStreamConsumerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterStreamConsumerRequest> request = null;
        Response<RegisterStreamConsumerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterStreamConsumerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerStreamConsumerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterStreamConsumer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterStreamConsumerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterStreamConsumerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from the specified Kinesis data stream. Removed tags are deleted and cannot be recovered after this
     * operation successfully completes.
     * </p>
     * <p>
     * If you specify a tag that does not exist, it is ignored.
     * </p>
     * <p>
     * <a>RemoveTagsFromStream</a> has a limit of five transactions per second per account.
     * </p>
     * 
     * @param removeTagsFromStreamRequest
     *        Represents the input for <code>RemoveTagsFromStream</code>.
     * @return Result of the RemoveTagsFromStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @sample AmazonKinesis.RemoveTagsFromStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/RemoveTagsFromStream" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RemoveTagsFromStreamResult removeTagsFromStream(RemoveTagsFromStreamRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTagsFromStream(request);
    }

    @SdkInternalApi
    final RemoveTagsFromStreamResult executeRemoveTagsFromStream(RemoveTagsFromStreamRequest removeTagsFromStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsFromStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromStreamRequest> request = null;
        Response<RemoveTagsFromStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsFromStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTagsFromStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTagsFromStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveTagsFromStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Splits a shard into two new shards in the Kinesis data stream, to increase the stream's capacity to ingest and
     * transport data. <code>SplitShard</code> is called when there is a need to increase the overall capacity of a
     * stream because of an expected increase in the volume of data records being ingested.
     * </p>
     * <p>
     * You can also use <code>SplitShard</code> when a shard appears to be approaching its maximum utilization; for
     * example, the producers sending data into the specific shard are suddenly sending more than previously
     * anticipated. You can also call <code>SplitShard</code> to increase stream capacity, so that more Kinesis Data
     * Streams applications can simultaneously read data from the stream for real-time processing.
     * </p>
     * <p>
     * You must specify the shard to be split and the new hash key, which is the position in the shard where the shard
     * gets split in two. In many cases, the new hash key might be the average of the beginning and ending hash key, but
     * it can be any hash key value in the range being mapped into the shard. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-resharding-split.html">Split a
     * Shard</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * <p>
     * You can use <a>DescribeStream</a> to determine the shard ID and hash key values for the <code>ShardToSplit</code>
     * and <code>NewStartingHashKey</code> parameters that are specified in the <code>SplitShard</code> request.
     * </p>
     * <p>
     * <code>SplitShard</code> is an asynchronous operation. Upon receiving a <code>SplitShard</code> request, Kinesis
     * Data Streams immediately returns a response and sets the stream status to <code>UPDATING</code>. After the
     * operation is completed, Kinesis Data Streams sets the stream status to <code>ACTIVE</code>. Read and write
     * operations continue to work while the stream is in the <code>UPDATING</code> state.
     * </p>
     * <p>
     * You can use <code>DescribeStream</code> to check the status of the stream, which is returned in
     * <code>StreamStatus</code>. If the stream is in the <code>ACTIVE</code> state, you can call
     * <code>SplitShard</code>. If a stream is in <code>CREATING</code> or <code>UPDATING</code> or
     * <code>DELETING</code> states, <code>DescribeStream</code> returns a <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * If the specified stream does not exist, <code>DescribeStream</code> returns a
     * <code>ResourceNotFoundException</code>. If you try to create more shards than are authorized for your account,
     * you receive a <code>LimitExceededException</code>.
     * </p>
     * <p>
     * For the default shard limit for an AWS account, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Kinesis Data Streams
     * Limits</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>. To increase this limit, <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">contact AWS Support</a>.
     * </p>
     * <p>
     * If you try to operate on too many streams simultaneously using <a>CreateStream</a>, <a>DeleteStream</a>,
     * <a>MergeShards</a>, and/or <a>SplitShard</a>, you receive a <code>LimitExceededException</code>.
     * </p>
     * <p>
     * <code>SplitShard</code> has a limit of five transactions per second per account.
     * </p>
     * 
     * @param splitShardRequest
     *        Represents the input for <code>SplitShard</code>.
     * @return Result of the SplitShard operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @sample AmazonKinesis.SplitShard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/SplitShard" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SplitShardResult splitShard(SplitShardRequest request) {
        request = beforeClientExecution(request);
        return executeSplitShard(request);
    }

    @SdkInternalApi
    final SplitShardResult executeSplitShard(SplitShardRequest splitShardRequest) {

        ExecutionContext executionContext = createExecutionContext(splitShardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SplitShardRequest> request = null;
        Response<SplitShardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SplitShardRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(splitShardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SplitShard");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SplitShardResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SplitShardResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public SplitShardResult splitShard(String streamName, String shardToSplit, String newStartingHashKey) {
        return splitShard(new SplitShardRequest().withStreamName(streamName).withShardToSplit(shardToSplit).withNewStartingHashKey(newStartingHashKey));
    }

    /**
     * <p>
     * Enables or updates server-side encryption using an AWS KMS key for a specified stream.
     * </p>
     * <p>
     * Starting encryption is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns
     * immediately and sets the status of the stream to <code>UPDATING</code>. After the update is complete, Kinesis
     * Data Streams sets the status of the stream back to <code>ACTIVE</code>. Updating or applying encryption normally
     * takes a few seconds to complete, but it can take minutes. You can continue to read and write data to your stream
     * while its status is <code>UPDATING</code>. Once the status of the stream is <code>ACTIVE</code>, encryption
     * begins for records written to the stream.
     * </p>
     * <p>
     * API Limits: You can successfully apply a new AWS KMS key for server-side encryption 25 times in a rolling 24-hour
     * period.
     * </p>
     * <p>
     * Note: It can take up to 5 seconds after the stream is in an <code>ACTIVE</code> status before all records written
     * to the stream are encrypted. After you enable encryption, you can verify that encryption is applied by inspecting
     * the API response from <code>PutRecord</code> or <code>PutRecords</code>.
     * </p>
     * 
     * @param startStreamEncryptionRequest
     * @return Result of the StartStreamEncryption operation returned by the service.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @throws KMSDisabledException
     *         The request was rejected because the specified customer master key (CMK) isn't enabled.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource isn't valid for this request. For
     *         more information, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     *         Key State Affects Use of a Customer Master Key</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @throws KMSAccessDeniedException
     *         The ciphertext references a key that doesn't exist or that you don't have access to.
     * @throws KMSNotFoundException
     *         The request was rejected because the specified entity or resource can't be found.
     * @throws KMSOptInRequiredException
     *         The AWS access key ID needs a subscription for the service.
     * @throws KMSThrottlingException
     *         The request was denied due to request throttling. For more information about throttling, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html#requests-per-second">Limits</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AmazonKinesis.StartStreamEncryption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/StartStreamEncryption" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartStreamEncryptionResult startStreamEncryption(StartStreamEncryptionRequest request) {
        request = beforeClientExecution(request);
        return executeStartStreamEncryption(request);
    }

    @SdkInternalApi
    final StartStreamEncryptionResult executeStartStreamEncryption(StartStreamEncryptionRequest startStreamEncryptionRequest) {

        ExecutionContext executionContext = createExecutionContext(startStreamEncryptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartStreamEncryptionRequest> request = null;
        Response<StartStreamEncryptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartStreamEncryptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startStreamEncryptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartStreamEncryption");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartStreamEncryptionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartStreamEncryptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables server-side encryption for a specified stream.
     * </p>
     * <p>
     * Stopping encryption is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns
     * immediately and sets the status of the stream to <code>UPDATING</code>. After the update is complete, Kinesis
     * Data Streams sets the status of the stream back to <code>ACTIVE</code>. Stopping encryption normally takes a few
     * seconds to complete, but it can take minutes. You can continue to read and write data to your stream while its
     * status is <code>UPDATING</code>. Once the status of the stream is <code>ACTIVE</code>, records written to the
     * stream are no longer encrypted by Kinesis Data Streams.
     * </p>
     * <p>
     * API Limits: You can successfully disable server-side encryption 25 times in a rolling 24-hour period.
     * </p>
     * <p>
     * Note: It can take up to 5 seconds after the stream is in an <code>ACTIVE</code> status before all records written
     * to the stream are no longer subject to encryption. After you disabled encryption, you can verify that encryption
     * is not applied by inspecting the API response from <code>PutRecord</code> or <code>PutRecords</code>.
     * </p>
     * 
     * @param stopStreamEncryptionRequest
     * @return Result of the StopStreamEncryption operation returned by the service.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @sample AmazonKinesis.StopStreamEncryption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/StopStreamEncryption" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopStreamEncryptionResult stopStreamEncryption(StopStreamEncryptionRequest request) {
        request = beforeClientExecution(request);
        return executeStopStreamEncryption(request);
    }

    @SdkInternalApi
    final StopStreamEncryptionResult executeStopStreamEncryption(StopStreamEncryptionRequest stopStreamEncryptionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopStreamEncryptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopStreamEncryptionRequest> request = null;
        Response<StopStreamEncryptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopStreamEncryptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopStreamEncryptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopStreamEncryption");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopStreamEncryptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopStreamEncryptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the shard count of the specified stream to the specified number of shards.
     * </p>
     * <p>
     * Updating the shard count is an asynchronous operation. Upon receiving the request, Kinesis Data Streams returns
     * immediately and sets the status of the stream to <code>UPDATING</code>. After the update is complete, Kinesis
     * Data Streams sets the status of the stream back to <code>ACTIVE</code>. Depending on the size of the stream, the
     * scaling action could take a few minutes to complete. You can continue to read and write data to your stream while
     * its status is <code>UPDATING</code>.
     * </p>
     * <p>
     * To update the shard count, Kinesis Data Streams performs splits or merges on individual shards. This can cause
     * short-lived shards to be created, in addition to the final shards. We recommend that you double or halve the
     * shard count, as this results in the fewest number of splits or merges.
     * </p>
     * <p>
     * This operation has the following default limits. By default, you cannot do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Scale more than twice per rolling 24-hour period per stream
     * </p>
     * </li>
     * <li>
     * <p>
     * Scale up to more than double your current shard count for a stream
     * </p>
     * </li>
     * <li>
     * <p>
     * Scale down below half your current shard count for a stream
     * </p>
     * </li>
     * <li>
     * <p>
     * Scale up to more than 500 shards in a stream
     * </p>
     * </li>
     * <li>
     * <p>
     * Scale a stream with more than 500 shards down unless the result is less than 500 shards
     * </p>
     * </li>
     * <li>
     * <p>
     * Scale up to more than the shard limit for your account
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the default limits for an AWS account, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in the
     * <i>Amazon Kinesis Data Streams Developer Guide</i>. To request an increase in the call rate limit, the shard
     * limit for this API, or your overall shard limit, use the <a href=
     * "https://console.aws.amazon.com/support/v1#/case/create?issueType=service-limit-increase&amp;limitType=service-code-kinesis"
     * >limits form</a>.
     * </p>
     * 
     * @param updateShardCountRequest
     * @return Result of the UpdateShardCount operation returned by the service.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource must be in the
     *         <code>ACTIVE</code> state.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly.
     * @sample AmazonKinesis.UpdateShardCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/UpdateShardCount" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateShardCountResult updateShardCount(UpdateShardCountRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateShardCount(request);
    }

    @SdkInternalApi
    final UpdateShardCountResult executeUpdateShardCount(UpdateShardCountRequest updateShardCountRequest) {

        ExecutionContext executionContext = createExecutionContext(updateShardCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateShardCountRequest> request = null;
        Response<UpdateShardCountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateShardCountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateShardCountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kinesis");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateShardCount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateShardCountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateShardCountResultJsonUnmarshaller());
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

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public AmazonKinesisWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonKinesisWaiters(this);
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
