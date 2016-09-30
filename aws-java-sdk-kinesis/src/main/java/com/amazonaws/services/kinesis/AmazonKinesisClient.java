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
package com.amazonaws.services.kinesis;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
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
import com.amazonaws.services.kinesis.waiters.AmazonKinesisWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.services.kinesis.model.transform.*;

/**
 * Client for accessing Kinesis. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon Kinesis Streams Service API Reference</fullname>
 * <p>
 * Amazon Kinesis Streams is a managed service that scales elastically for real time processing of streaming big data.
 * </p>
 */
@ThreadSafe
public class AmazonKinesisClient extends AmazonWebServiceClient implements AmazonKinesis {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonKinesis.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "kinesis";

    private volatile AmazonKinesisWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
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
                    new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                            com.amazonaws.services.kinesis.model.ResourceNotFoundException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ExpiredIteratorException").withModeledClass(
                            com.amazonaws.services.kinesis.model.ExpiredIteratorException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ProvisionedThroughputExceededException").withModeledClass(
                            com.amazonaws.services.kinesis.model.ProvisionedThroughputExceededException.class))
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
     */
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
     */
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
     */
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
     */
    public AmazonKinesisClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AmazonKinesisClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
    }

    /**
     * <p>
     * Adds or updates tags for the specified Amazon Kinesis stream. Each stream can have up to 10 tags.
     * </p>
     * <p>
     * If tags have already been assigned to the stream, <code>AddTagsToStream</code> overwrites any existing tags that
     * correspond to the specified tag keys.
     * </p>
     * 
     * @param addTagsToStreamRequest
     *        Represents the input for <code>AddTagsToStream</code>.
     * @return Result of the AddTagsToStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource needs to be in
     *         the <code>ACTIVE</code> state.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed (5).
     * @sample AmazonKinesis.AddTagsToStream
     */
    @Override
    public AddTagsToStreamResult addTagsToStream(AddTagsToStreamRequest addTagsToStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(addTagsToStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToStreamRequest> request = null;
        Response<AddTagsToStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToStreamRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsToStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Creates an Amazon Kinesis stream. A stream captures and transports data records that are continuously emitted
     * from different data sources or <i>producers</i>. Scale-out within a stream is explicitly supported by means of
     * shards, which are uniquely identified groups of data records in a stream.
     * </p>
     * <p>
     * You specify and control the number of shards that a stream is composed of. Each shard can support reads up to 5
     * transactions per second, up to a maximum data read total of 2 MB per second. Each shard can support writes up to
     * 1,000 records per second, up to a maximum data write total of 1 MB per second. You can add shards to a stream if
     * the amount of data input increases and you can remove shards if the amount of data input decreases.
     * </p>
     * <p>
     * The stream name identifies the stream. The name is scoped to the AWS account used by the application. It is also
     * scoped by region. That is, two streams in two different accounts can have the same name, and two streams in the
     * same account, but in two different regions, can have the same name.
     * </p>
     * <p>
     * <code>CreateStream</code> is an asynchronous operation. Upon receiving a <code>CreateStream</code> request,
     * Amazon Kinesis immediately returns and sets the stream status to <code>CREATING</code>. After the stream is
     * created, Amazon Kinesis sets the stream status to <code>ACTIVE</code>. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.
     * </p>
     * <p>
     * You receive a <code>LimitExceededException</code> when making a <code>CreateStream</code> request if you try to
     * do one of the following:
     * </p>
     * <ul>
     * <li>Have more than five streams in the <code>CREATING</code> state at any point in time.</li>
     * <li>Create more shards than are authorized for your account.</li>
     * </ul>
     * <p>
     * For the default shard limit for an AWS account, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in the
     * <i>Amazon Kinesis Streams Developer Guide</i>. If you need to increase this limit, <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">contact AWS Support</a>.
     * </p>
     * <p>
     * You can use <code>DescribeStream</code> to check the stream status, which is returned in
     * <code>StreamStatus</code>.
     * </p>
     * <p>
     * <a>CreateStream</a> has a limit of 5 transactions per second per account.
     * </p>
     * 
     * @param createStreamRequest
     *        Represents the input for <code>CreateStream</code>.
     * @return Result of the CreateStream operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource needs to be in
     *         the <code>ACTIVE</code> state.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed (5).
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @sample AmazonKinesis.CreateStream
     */
    @Override
    public CreateStreamResult createStream(CreateStreamRequest createStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(createStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamRequest> request = null;
        Response<CreateStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Decreases the Amazon Kinesis stream's retention period, which is the length of time data records are accessible
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
     *         The resource is not available for this operation. For successful operation, the resource needs to be in
     *         the <code>ACTIVE</code> state.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed (5).
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @sample AmazonKinesis.DecreaseStreamRetentionPeriod
     */
    @Override
    public DecreaseStreamRetentionPeriodResult decreaseStreamRetentionPeriod(DecreaseStreamRetentionPeriodRequest decreaseStreamRetentionPeriodRequest) {
        ExecutionContext executionContext = createExecutionContext(decreaseStreamRetentionPeriodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DecreaseStreamRetentionPeriodRequest> request = null;
        Response<DecreaseStreamRetentionPeriodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DecreaseStreamRetentionPeriodRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(decreaseStreamRetentionPeriodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Deletes an Amazon Kinesis stream and all its shards and data. You must shut down any applications that are
     * operating on the stream before you delete the stream. If an application attempts to operate on a deleted stream,
     * it will receive the exception <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the stream is in the <code>ACTIVE</code> state, you can delete it. After a <code>DeleteStream</code> request,
     * the specified stream is in the <code>DELETING</code> state until Amazon Kinesis completes the deletion.
     * </p>
     * <p>
     * <b>Note:</b> Amazon Kinesis might continue to accept data read and write operations, such as <a>PutRecord</a>,
     * <a>PutRecords</a>, and <a>GetRecords</a>, on a stream in the <code>DELETING</code> state until the stream
     * deletion is complete.
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
     * <a>DeleteStream</a> has a limit of 5 transactions per second per account.
     * </p>
     * 
     * @param deleteStreamRequest
     *        Represents the input for <a>DeleteStream</a>.
     * @return Result of the DeleteStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed (5).
     * @sample AmazonKinesis.DeleteStream
     */
    @Override
    public DeleteStreamResult deleteStream(DeleteStreamRequest deleteStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamRequest> request = null;
        Response<DeleteStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStreamRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Describes the specified Amazon Kinesis stream.
     * </p>
     * <p>
     * The information about the stream includes its current status, its Amazon Resource Name (ARN), and an array of
     * shard objects. For each shard object, there is information about the hash key and sequence number ranges that the
     * shard spans, and the IDs of any earlier shards that played in a role in creating the shard. A sequence number is
     * the identifier associated with every record ingested in the stream. The sequence number is assigned when a record
     * is put into the stream.
     * </p>
     * <p>
     * You can limit the number of returned shards using the <code>Limit</code> parameter. The number of shards in a
     * stream may be too large to return from a single call to <code>DescribeStream</code>. You can detect this by using
     * the <code>HasMoreShards</code> flag in the returned output. <code>HasMoreShards</code> is set to
     * <code>true</code> when there is more data available.
     * </p>
     * <p>
     * <code>DescribeStream</code> is a paginated operation. If there are more shards available, you can request them
     * using the shard ID of the last shard returned. Specify this ID in the <code>ExclusiveStartShardId</code>
     * parameter in a subsequent request to <code>DescribeStream</code>.
     * </p>
     * <p>
     * There are no guarantees about the chronological order shards returned in <code>DescribeStream</code> results. If
     * you want to process shards in chronological order, use <code>ParentShardId</code> to track lineage to the oldest
     * shard.
     * </p>
     * <p>
     * <a>DescribeStream</a> has a limit of 10 transactions per second per account.
     * </p>
     * 
     * @param describeStreamRequest
     *        Represents the input for <code>DescribeStream</code>.
     * @return Result of the DescribeStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed (5).
     * @sample AmazonKinesis.DescribeStream
     */
    @Override
    public DescribeStreamResult describeStream(DescribeStreamRequest describeStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStreamRequest> request = null;
        Response<DescribeStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStreamRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     *         exceeds the maximum number allowed (5).
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource needs to be in
     *         the <code>ACTIVE</code> state.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @sample AmazonKinesis.DisableEnhancedMonitoring
     */
    @Override
    public DisableEnhancedMonitoringResult disableEnhancedMonitoring(DisableEnhancedMonitoringRequest disableEnhancedMonitoringRequest) {
        ExecutionContext executionContext = createExecutionContext(disableEnhancedMonitoringRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableEnhancedMonitoringRequest> request = null;
        Response<DisableEnhancedMonitoringResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableEnhancedMonitoringRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableEnhancedMonitoringRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Enables enhanced Amazon Kinesis stream monitoring for shard-level metrics.
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
     *         exceeds the maximum number allowed (5).
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource needs to be in
     *         the <code>ACTIVE</code> state.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @sample AmazonKinesis.EnableEnhancedMonitoring
     */
    @Override
    public EnableEnhancedMonitoringResult enableEnhancedMonitoring(EnableEnhancedMonitoringRequest enableEnhancedMonitoringRequest) {
        ExecutionContext executionContext = createExecutionContext(enableEnhancedMonitoringRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableEnhancedMonitoringRequest> request = null;
        Response<EnableEnhancedMonitoringResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableEnhancedMonitoringRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableEnhancedMonitoringRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Gets data records from an Amazon Kinesis stream's shard.
     * </p>
     * <p>
     * Specify a shard iterator using the <code>ShardIterator</code> parameter. The shard iterator specifies the
     * position in the shard from which you want to start reading data records sequentially. If there are no records
     * available in the portion of the shard that the iterator points to, <a>GetRecords</a> returns an empty list. Note
     * that it might take multiple calls to get to a portion of the shard that contains records.
     * </p>
     * <p>
     * You can scale by provisioning multiple shards per stream while considering service limits (for more information,
     * see <a href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in
     * the <i>Amazon Kinesis Streams Developer Guide</i>). Your application should have one thread per shard, each
     * reading continuously from its stream. To read from a stream continually, call <a>GetRecords</a> in a loop. Use
     * <a>GetShardIterator</a> to get the shard iterator to specify in the first <a>GetRecords</a> call.
     * <a>GetRecords</a> returns a new shard iterator in <code>NextShardIterator</code>. Specify the shard iterator
     * returned in <code>NextShardIterator</code> in subsequent calls to <a>GetRecords</a>. Note that if the shard has
     * been closed, the shard iterator can't return more data and <a>GetRecords</a> returns <code>null</code> in
     * <code>NextShardIterator</code>. You can terminate the loop when the shard is closed, or when the shard iterator
     * reaches the record with the sequence number or other attribute that marks it as the last record to process.
     * </p>
     * <p>
     * Each data record can be up to 1 MB in size, and each shard can read up to 2 MB per second. You can ensure that
     * your calls don't exceed the maximum supported size or throughput by using the <code>Limit</code> parameter to
     * specify the maximum number of records that <a>GetRecords</a> can return. Consider your average record size when
     * determining this limit.
     * </p>
     * <p>
     * The size of the data returned by <a>GetRecords</a> varies depending on the utilization of the shard. The maximum
     * size of data that <a>GetRecords</a> can return is 10 MB. If a call returns this amount of data, subsequent calls
     * made within the next 5 seconds throw <code>ProvisionedThroughputExceededException</code>. If there is
     * insufficient provisioned throughput on the shard, subsequent calls made within the next 1 second throw
     * <code>ProvisionedThroughputExceededException</code>. Note that <a>GetRecords</a> won't return any data when it
     * throws an exception. For this reason, we recommend that you wait one second between calls to <a>GetRecords</a>;
     * however, it's possible that the application will get exceptions for longer than 1 second.
     * </p>
     * <p>
     * To detect whether the application is falling behind in processing, you can use the
     * <code>MillisBehindLatest</code> response attribute. You can also monitor the stream using CloudWatch metrics and
     * other mechanisms (see <a href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring.html">Monitoring</a> in
     * the <i>Amazon Kinesis Streams Developer Guide</i>).
     * </p>
     * <p>
     * Each Amazon Kinesis record includes a value, <code>ApproximateArrivalTimestamp</code>, that is set when a stream
     * successfully receives and stores a record. This is commonly referred to as a server-side timestamp, whereas a
     * client-side timestamp is set when a data producer creates or sends the record to a stream (a data producer is any
     * data source putting data records into a stream, for example with <a>PutRecords</a>). The timestamp has
     * millisecond precision. There are no guarantees about the timestamp accuracy, or that the timestamp is always
     * increasing. For example, records in a shard or across a stream might have timestamps that are out of order.
     * </p>
     * 
     * @param getRecordsRequest
     *        Represents the input for <a>GetRecords</a>.
     * @return Result of the GetRecords operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws ProvisionedThroughputExceededException
     *         The request rate for the stream is too high, or the requested data is too large for the available
     *         throughput. Reduce the frequency or size of your requests. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in
     *         the <i>Amazon Kinesis Streams Developer Guide</i>, and <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/api-retries.html">Error Retries and Exponential
     *         Backoff in AWS</a> in the <i>AWS General Reference</i>.
     * @throws ExpiredIteratorException
     *         The provided iterator exceeds the maximum age allowed.
     * @sample AmazonKinesis.GetRecords
     */
    @Override
    public GetRecordsResult getRecords(GetRecordsRequest getRecordsRequest) {
        ExecutionContext executionContext = createExecutionContext(getRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecordsRequest> request = null;
        Response<GetRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecordsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Gets an Amazon Kinesis shard iterator. A shard iterator expires five minutes after it is returned to the
     * requester.
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
     * <code>AT_SEQUENCE_NUMBER</code> shard iterator type, or right after the sequence number by using the
     * <code>AFTER_SEQUENCE_NUMBER</code> shard iterator type, using sequence numbers returned by earlier calls to
     * <a>PutRecord</a>, <a>PutRecords</a>, <a>GetRecords</a>, or <a>DescribeStream</a>. In the request, you can specify
     * the shard iterator type <code>AT_TIMESTAMP</code> to read records from an arbitrary point in time,
     * <code>TRIM_HORIZON</code> to cause <code>ShardIterator</code> to point to the last untrimmed record in the shard
     * in the system (the oldest data record in the shard), or <code>LATEST</code> so that you always read the most
     * recent data in the shard.
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
     * <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * <p>
     * If the shard is closed, <a>GetShardIterator</a> returns a valid iterator for the last sequence number of the
     * shard. Note that a shard can be closed as a result of using <a>SplitShard</a> or <a>MergeShards</a>.
     * </p>
     * <p>
     * <a>GetShardIterator</a> has a limit of 5 transactions per second per account per open shard.
     * </p>
     * 
     * @param getShardIteratorRequest
     *        Represents the input for <code>GetShardIterator</code>.
     * @return Result of the GetShardIterator operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws ProvisionedThroughputExceededException
     *         The request rate for the stream is too high, or the requested data is too large for the available
     *         throughput. Reduce the frequency or size of your requests. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in
     *         the <i>Amazon Kinesis Streams Developer Guide</i>, and <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/api-retries.html">Error Retries and Exponential
     *         Backoff in AWS</a> in the <i>AWS General Reference</i>.
     * @sample AmazonKinesis.GetShardIterator
     */
    @Override
    public GetShardIteratorResult getShardIterator(GetShardIteratorRequest getShardIteratorRequest) {
        ExecutionContext executionContext = createExecutionContext(getShardIteratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetShardIteratorRequest> request = null;
        Response<GetShardIteratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetShardIteratorRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getShardIteratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Increases the Amazon Kinesis stream's retention period, which is the length of time data records are accessible
     * after they are added to the stream. The maximum value of a stream's retention period is 168 hours (7 days).
     * </p>
     * <p>
     * Upon choosing a longer stream retention period, this operation will increase the time period records are
     * accessible that have not yet expired. However, it will not make previous data that has expired (older than the
     * stream's previous retention period) accessible after the operation has been called. For example, if a stream's
     * retention period is set to 24 hours and is increased to 168 hours, any data that is older than 24 hours will
     * remain inaccessible to consumer applications.
     * </p>
     * 
     * @param increaseStreamRetentionPeriodRequest
     *        Represents the input for <a>IncreaseStreamRetentionPeriod</a>.
     * @return Result of the IncreaseStreamRetentionPeriod operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource needs to be in
     *         the <code>ACTIVE</code> state.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed (5).
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @sample AmazonKinesis.IncreaseStreamRetentionPeriod
     */
    @Override
    public IncreaseStreamRetentionPeriodResult increaseStreamRetentionPeriod(IncreaseStreamRetentionPeriodRequest increaseStreamRetentionPeriodRequest) {
        ExecutionContext executionContext = createExecutionContext(increaseStreamRetentionPeriodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IncreaseStreamRetentionPeriodRequest> request = null;
        Response<IncreaseStreamRetentionPeriodResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IncreaseStreamRetentionPeriodRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(increaseStreamRetentionPeriodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Lists your Amazon Kinesis streams.
     * </p>
     * <p>
     * The number of streams may be too large to return from a single call to <code>ListStreams</code>. You can limit
     * the number of returned streams using the <code>Limit</code> parameter. If you do not specify a value for the
     * <code>Limit</code> parameter, Amazon Kinesis uses the default limit, which is currently 10.
     * </p>
     * <p>
     * You can detect if there are more streams available to list by using the <code>HasMoreStreams</code> flag from the
     * returned output. If there are more streams available, you can request more streams by using the name of the last
     * stream returned by the <code>ListStreams</code> request in the <code>ExclusiveStartStreamName</code> parameter in
     * a subsequent request to <code>ListStreams</code>. The group of stream names returned by the subsequent request is
     * then added to the list. You can continue this process until all the stream names have been collected in the list.
     * </p>
     * <p>
     * <a>ListStreams</a> has a limit of 5 transactions per second per account.
     * </p>
     * 
     * @param listStreamsRequest
     *        Represents the input for <code>ListStreams</code>.
     * @return Result of the ListStreams operation returned by the service.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed (5).
     * @sample AmazonKinesis.ListStreams
     */
    @Override
    public ListStreamsResult listStreams(ListStreamsRequest listStreamsRequest) {
        ExecutionContext executionContext = createExecutionContext(listStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamsRequest> request = null;
        Response<ListStreamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStreamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Lists the tags for the specified Amazon Kinesis stream.
     * </p>
     * 
     * @param listTagsForStreamRequest
     *        Represents the input for <code>ListTagsForStream</code>.
     * @return Result of the ListTagsForStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed (5).
     * @sample AmazonKinesis.ListTagsForStream
     */
    @Override
    public ListTagsForStreamResult listTagsForStream(ListTagsForStreamRequest listTagsForStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsForStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForStreamRequest> request = null;
        Response<ListTagsForStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForStreamRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Merges two adjacent shards in an Amazon Kinesis stream and combines them into a single shard to reduce the
     * stream's capacity to ingest and transport data. Two shards are considered adjacent if the union of the hash key
     * ranges for the two shards form a contiguous set with no gaps. For example, if you have two shards, one with a
     * hash key range of 276...381 and the other with a hash key range of 382...454, then you could merge these two
     * shards into a single shard that would have a hash key range of 276...454. After the merge, the single child shard
     * receives data for all hash key values covered by the two parent shards.
     * </p>
     * <p>
     * <code>MergeShards</code> is called when there is a need to reduce the overall capacity of a stream because of
     * excess capacity that is not being used. You must specify the shard to be merged and the adjacent shard for a
     * stream. For more information about merging shards, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-resharding-merge.html">Merge Two
     * Shards</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
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
     * Kinesis immediately returns a response and sets the <code>StreamStatus</code> to <code>UPDATING</code>. After the
     * operation is completed, Amazon Kinesis sets the <code>StreamStatus</code> to <code>ACTIVE</code>. Read and write
     * operations continue to work while the stream is in the <code>UPDATING</code> state.
     * </p>
     * <p>
     * You use <a>DescribeStream</a> to determine the shard IDs that are specified in the <code>MergeShards</code>
     * request.
     * </p>
     * <p>
     * If you try to operate on too many streams in parallel using <a>CreateStream</a>, <a>DeleteStream</a>,
     * <code>MergeShards</code> or <a>SplitShard</a>, you will receive a <code>LimitExceededException</code>.
     * </p>
     * <p>
     * <code>MergeShards</code> has limit of 5 transactions per second per account.
     * </p>
     * 
     * @param mergeShardsRequest
     *        Represents the input for <code>MergeShards</code>.
     * @return Result of the MergeShards operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource needs to be in
     *         the <code>ACTIVE</code> state.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed (5).
     * @sample AmazonKinesis.MergeShards
     */
    @Override
    public MergeShardsResult mergeShards(MergeShardsRequest mergeShardsRequest) {
        ExecutionContext executionContext = createExecutionContext(mergeShardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MergeShardsRequest> request = null;
        Response<MergeShardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MergeShardsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(mergeShardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Writes a single data record into an Amazon Kinesis stream. Call <code>PutRecord</code> to send data into the
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
     * The partition key is used by Amazon Kinesis to distribute data across shards. Amazon Kinesis segregates the data
     * records that belong to a stream into multiple shards, using the partition key associated with each data record to
     * determine which shard a given data record belongs to.
     * </p>
     * <p>
     * Partition keys are Unicode strings, with a maximum length limit of 256 characters for each key. An MD5 hash
     * function is used to map partition keys to 128-bit integer values and to map associated data records to shards
     * using the hash key ranges of the shards. You can override hashing the partition key to determine the shard by
     * explicitly specifying a hash value using the <code>ExplicitHashKey</code> parameter. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
     * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
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
     * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>PutRecord</code> request cannot be processed because of insufficient provisioned throughput on the
     * shard involved in the request, <code>PutRecord</code> throws <code>ProvisionedThroughputExceededException</code>.
     * </p>
     * <p>
     * Data records are accessible for only 24 hours from the time that they are added to a stream.
     * </p>
     * 
     * @param putRecordRequest
     *        Represents the input for <code>PutRecord</code>.
     * @return Result of the PutRecord operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws ProvisionedThroughputExceededException
     *         The request rate for the stream is too high, or the requested data is too large for the available
     *         throughput. Reduce the frequency or size of your requests. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in
     *         the <i>Amazon Kinesis Streams Developer Guide</i>, and <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/api-retries.html">Error Retries and Exponential
     *         Backoff in AWS</a> in the <i>AWS General Reference</i>.
     * @sample AmazonKinesis.PutRecord
     */
    @Override
    public PutRecordResult putRecord(PutRecordRequest putRecordRequest) {
        ExecutionContext executionContext = createExecutionContext(putRecordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRecordRequest> request = null;
        Response<PutRecordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRecordRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRecordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Writes multiple data records into an Amazon Kinesis stream in a single call (also referred to as a
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
     * The partition key is used by Amazon Kinesis as input to a hash function that maps the partition key and
     * associated data to a specific shard. An MD5 hash function is used to map partition keys to 128-bit integer values
     * and to map associated data records to shards. As a result of this hashing mechanism, all data records with the
     * same partition key map to the same shard within the stream. For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-add-data-to-stream"
     * >Adding Data to a Stream</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * <p>
     * Each record in the <code>Records</code> array may include an optional parameter, <code>ExplicitHashKey</code>,
     * which overrides the partition key to shard mapping. This parameter allows a data producer to determine explicitly
     * the shard where the record is stored. For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/developing-producers-with-sdk.html#kinesis-using-sdk-java-putrecords"
     * >Adding Multiple Records with PutRecords</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * <p>
     * The <code>PutRecords</code> response includes an array of response <code>Records</code>. Each record in the
     * response array directly correlates with a record in the request array using natural ordering, from the top to the
     * bottom of the request and response. The response <code>Records</code> array always includes the same number of
     * records as the request array.
     * </p>
     * <p>
     * The response <code>Records</code> array includes both successfully and unsuccessfully processed records. Amazon
     * Kinesis attempts to process all records in each <code>PutRecords</code> request. A single record failure does not
     * stop the processing of subsequent records.
     * </p>
     * <p>
     * A successfully-processed record includes <code>ShardId</code> and <code>SequenceNumber</code> values. The
     * <code>ShardId</code> parameter identifies the shard in the stream where the record is stored. The
     * <code>SequenceNumber</code> parameter is an identifier assigned to the put record, unique to all records in the
     * stream.
     * </p>
     * <p>
     * An unsuccessfully-processed record includes <code>ErrorCode</code> and <code>ErrorMessage</code> values.
     * <code>ErrorCode</code> reflects the type of error and can be one of the following values:
     * <code>ProvisionedThroughputExceededException</code> or <code>InternalFailure</code>. <code>ErrorMessage</code>
     * provides more detailed information about the <code>ProvisionedThroughputExceededException</code> exception
     * including the account ID, stream name, and shard ID of the record that was throttled. For more information about
     * partially successful responses, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-add-data-to-stream.html#kinesis-using-sdk-java-putrecords"
     * >Adding Multiple Records with PutRecords</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * <p>
     * By default, data records are accessible for only 24 hours from the time that they are added to an Amazon Kinesis
     * stream. This retention period can be modified using the <a>DecreaseStreamRetentionPeriod</a> and
     * <a>IncreaseStreamRetentionPeriod</a> operations.
     * </p>
     * 
     * @param putRecordsRequest
     *        A <code>PutRecords</code> request.
     * @return Result of the PutRecords operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws ProvisionedThroughputExceededException
     *         The request rate for the stream is too high, or the requested data is too large for the available
     *         throughput. Reduce the frequency or size of your requests. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in
     *         the <i>Amazon Kinesis Streams Developer Guide</i>, and <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/api-retries.html">Error Retries and Exponential
     *         Backoff in AWS</a> in the <i>AWS General Reference</i>.
     * @sample AmazonKinesis.PutRecords
     */
    @Override
    public PutRecordsResult putRecords(PutRecordsRequest putRecordsRequest) {
        ExecutionContext executionContext = createExecutionContext(putRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRecordsRequest> request = null;
        Response<PutRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRecordsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Removes tags from the specified Amazon Kinesis stream. Removed tags are deleted and cannot be recovered after
     * this operation successfully completes.
     * </p>
     * <p>
     * If you specify a tag that does not exist, it is ignored.
     * </p>
     * 
     * @param removeTagsFromStreamRequest
     *        Represents the input for <code>RemoveTagsFromStream</code>.
     * @return Result of the RemoveTagsFromStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource needs to be in
     *         the <code>ACTIVE</code> state.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed (5).
     * @sample AmazonKinesis.RemoveTagsFromStream
     */
    @Override
    public RemoveTagsFromStreamResult removeTagsFromStream(RemoveTagsFromStreamRequest removeTagsFromStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromStreamRequest> request = null;
        Response<RemoveTagsFromStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromStreamRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsFromStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Splits a shard into two new shards in the Amazon Kinesis stream to increase the stream's capacity to ingest and
     * transport data. <code>SplitShard</code> is called when there is a need to increase the overall capacity of a
     * stream because of an expected increase in the volume of data records being ingested.
     * </p>
     * <p>
     * You can also use <code>SplitShard</code> when a shard appears to be approaching its maximum utilization; for
     * example, the producers sending data into the specific shard are suddenly sending more than previously
     * anticipated. You can also call <code>SplitShard</code> to increase stream capacity, so that more Amazon Kinesis
     * applications can simultaneously read data from the stream for real-time processing.
     * </p>
     * <p>
     * You must specify the shard to be split and the new hash key, which is the position in the shard where the shard
     * gets split in two. In many cases, the new hash key might simply be the average of the beginning and ending hash
     * key, but it can be any hash key value in the range being mapped into the shard. For more information about
     * splitting shards, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/kinesis-using-sdk-java-resharding-split.html">Split a
     * Shard</a> in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * <p>
     * You can use <a>DescribeStream</a> to determine the shard ID and hash key values for the <code>ShardToSplit</code>
     * and <code>NewStartingHashKey</code> parameters that are specified in the <code>SplitShard</code> request.
     * </p>
     * <p>
     * <code>SplitShard</code> is an asynchronous operation. Upon receiving a <code>SplitShard</code> request, Amazon
     * Kinesis immediately returns a response and sets the stream status to <code>UPDATING</code>. After the operation
     * is completed, Amazon Kinesis sets the stream status to <code>ACTIVE</code>. Read and write operations continue to
     * work while the stream is in the <code>UPDATING</code> state.
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
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/service-sizes-and-limits.html">Streams Limits</a> in the
     * <i>Amazon Kinesis Streams Developer Guide</i>. If you need to increase this limit, <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">contact AWS Support</a>.
     * </p>
     * <p>
     * If you try to operate on too many streams simultaneously using <a>CreateStream</a>, <a>DeleteStream</a>,
     * <a>MergeShards</a>, and/or <a>SplitShard</a>, you receive a <code>LimitExceededException</code>.
     * </p>
     * <p>
     * <code>SplitShard</code> has limit of 5 transactions per second per account.
     * </p>
     * 
     * @param splitShardRequest
     *        Represents the input for <code>SplitShard</code>.
     * @return Result of the SplitShard operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found. The stream might not be specified correctly, or it might not
     *         be in the <code>ACTIVE</code> state if the operation requires it.
     * @throws ResourceInUseException
     *         The resource is not available for this operation. For successful operation, the resource needs to be in
     *         the <code>ACTIVE</code> state.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used. For more information,
     *         see the returned message.
     * @throws LimitExceededException
     *         The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests
     *         exceeds the maximum number allowed (5).
     * @sample AmazonKinesis.SplitShard
     */
    @Override
    public SplitShardResult splitShard(SplitShardRequest splitShardRequest) {
        ExecutionContext executionContext = createExecutionContext(splitShardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SplitShardRequest> request = null;
        Response<SplitShardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SplitShardRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(splitShardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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

}
