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
package com.amazonaws.services.kinesisfirehose;

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
import com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.services.kinesisfirehose.model.transform.*;

/**
 * Client for accessing Firehose. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon Kinesis Firehose API Reference</fullname>
 * <p>
 * Amazon Kinesis Firehose is a fully managed service that delivers real-time streaming data to destinations such as
 * Amazon Simple Storage Service (Amazon S3), Amazon Elasticsearch Service (Amazon ES), and Amazon Redshift.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisFirehoseClient extends AmazonWebServiceClient implements AmazonKinesisFirehose {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonKinesisFirehose.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "firehose";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.kinesisfirehose.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withModeledClass(
                                    com.amazonaws.services.kinesisfirehose.model.InvalidArgumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.kinesisfirehose.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.kinesisfirehose.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.kinesisfirehose.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.kinesisfirehose.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.kinesisfirehose.model.AmazonKinesisFirehoseException.class));

    /**
     * Constructs a new client to invoke service methods on Firehose. A credentials provider chain will be used that
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
     * @deprecated use {@link AmazonKinesisFirehoseClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonKinesisFirehoseClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Firehose. A credentials provider chain will be used that
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
     *        The client configuration options controlling how this client connects to Firehose (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonKinesisFirehoseClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisFirehoseClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Firehose using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonKinesisFirehoseClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonKinesisFirehoseClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonKinesisFirehoseClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Firehose using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Firehose (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonKinesisFirehoseClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisFirehoseClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisFirehoseClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Firehose using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonKinesisFirehoseClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonKinesisFirehoseClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Firehose using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Firehose (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonKinesisFirehoseClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisFirehoseClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonKinesisFirehoseClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Firehose using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Firehose (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonKinesisFirehoseClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonKinesisFirehoseClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonKinesisFirehoseClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonKinesisFirehoseClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    public static AmazonKinesisFirehoseClientBuilder builder() {
        return AmazonKinesisFirehoseClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Firehose using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisFirehoseClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://firehose.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/kinesisfirehose/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/kinesisfirehose/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a delivery stream.
     * </p>
     * <p>
     * By default, you can create up to 20 delivery streams per region.
     * </p>
     * <p>
     * This is an asynchronous operation that immediately returns. The initial status of the delivery stream is
     * <code>CREATING</code>. After the delivery stream is created, its status is <code>ACTIVE</code> and it now accepts
     * data. Attempts to send data to a delivery stream that is not in the <code>ACTIVE</code> state cause an exception.
     * To check the state of a delivery stream, use <a>DescribeDeliveryStream</a>.
     * </p>
     * <p>
     * A Kinesis Firehose delivery stream can be configured to receive records directly from providers using
     * <a>PutRecord</a> or <a>PutRecordBatch</a>, or it can be configured to use an existing Kinesis stream as its
     * source. To specify a Kinesis stream as input, set the <code>DeliveryStreamType</code> parameter to
     * <code>KinesisStreamAsSource</code>, and provide the Kinesis stream ARN and role ARN in the
     * <code>KinesisStreamSourceConfiguration</code> parameter.
     * </p>
     * <p>
     * A delivery stream is configured with a single destination: Amazon S3, Amazon ES, or Amazon Redshift. You must
     * specify only one of the following destination configuration parameters:
     * <b>ExtendedS3DestinationConfiguration</b>, <b>S3DestinationConfiguration</b>,
     * <b>ElasticsearchDestinationConfiguration</b>, or <b>RedshiftDestinationConfiguration</b>.
     * </p>
     * <p>
     * When you specify <b>S3DestinationConfiguration</b>, you can also provide the following optional values:
     * <b>BufferingHints</b>, <b>EncryptionConfiguration</b>, and <b>CompressionFormat</b>. By default, if no
     * <b>BufferingHints</b> value is provided, Kinesis Firehose buffers data up to 5 MB or for 5 minutes, whichever
     * condition is satisfied first. Note that <b>BufferingHints</b> is a hint, so there are some cases where the
     * service cannot adhere to these conditions strictly; for example, record boundaries are such that the size is a
     * little over or under the configured buffering size. By default, no encryption is performed. We strongly recommend
     * that you enable encryption to ensure secure data storage in Amazon S3.
     * </p>
     * <p>
     * A few notes about Amazon Redshift as a destination:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Redshift destination requires an S3 bucket as intermediate location, as Kinesis Firehose first delivers
     * data to S3 and then uses <code>COPY</code> syntax to load data into an Amazon Redshift table. This is specified
     * in the <b>RedshiftDestinationConfiguration.S3Configuration</b> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be specified in
     * <b>RedshiftDestinationConfiguration.S3Configuration</b> because the Amazon Redshift <code>COPY</code> operation
     * that reads from the S3 bucket doesn't support these compression formats.
     * </p>
     * </li>
     * <li>
     * <p>
     * We strongly recommend that you use the user name and password you provide exclusively with Kinesis Firehose, and
     * that the permissions for the account are restricted for Amazon Redshift <code>INSERT</code> permissions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Kinesis Firehose assumes the IAM role that is configured as part of the destination. The role should allow the
     * Kinesis Firehose principal to assume the role, and the role should have permissions that allow the service to
     * deliver the data. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3">Amazon S3 Bucket
     * Access</a> in the <i>Amazon Kinesis Firehose Developer Guide</i>.
     * </p>
     * 
     * @param createDeliveryStreamRequest
     * @return Result of the CreateDeliveryStream operation returned by the service.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws LimitExceededException
     *         You have already reached the limit for a requested resource.
     * @throws ResourceInUseException
     *         The resource is already in use and not available for this operation.
     * @sample AmazonKinesisFirehose.CreateDeliveryStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/CreateDeliveryStream" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDeliveryStreamResult createDeliveryStream(CreateDeliveryStreamRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDeliveryStream(request);
    }

    @SdkInternalApi
    final CreateDeliveryStreamResult executeCreateDeliveryStream(CreateDeliveryStreamRequest createDeliveryStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeliveryStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeliveryStreamRequest> request = null;
        Response<CreateDeliveryStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeliveryStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeliveryStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeliveryStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDeliveryStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a delivery stream and its data.
     * </p>
     * <p>
     * You can delete a delivery stream only if it is in <code>ACTIVE</code> or <code>DELETING</code> state, and not in
     * the <code>CREATING</code> state. While the deletion request is in process, the delivery stream is in the
     * <code>DELETING</code> state.
     * </p>
     * <p>
     * To check the state of a delivery stream, use <a>DescribeDeliveryStream</a>.
     * </p>
     * <p>
     * While the delivery stream is <code>DELETING</code> state, the service may continue to accept the records, but the
     * service doesn't make any guarantees with respect to delivering the data. Therefore, as a best practice, you
     * should first stop any applications that are sending records before deleting a delivery stream.
     * </p>
     * 
     * @param deleteDeliveryStreamRequest
     * @return Result of the DeleteDeliveryStream operation returned by the service.
     * @throws ResourceInUseException
     *         The resource is already in use and not available for this operation.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonKinesisFirehose.DeleteDeliveryStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DeleteDeliveryStream" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDeliveryStreamResult deleteDeliveryStream(DeleteDeliveryStreamRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDeliveryStream(request);
    }

    @SdkInternalApi
    final DeleteDeliveryStreamResult executeDeleteDeliveryStream(DeleteDeliveryStreamRequest deleteDeliveryStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeliveryStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeliveryStreamRequest> request = null;
        Response<DeleteDeliveryStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeliveryStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeliveryStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeliveryStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDeliveryStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified delivery stream and gets the status. For example, after your delivery stream is created,
     * call <a>DescribeDeliveryStream</a> to see if the delivery stream is <code>ACTIVE</code> and therefore ready for
     * data to be sent to it.
     * </p>
     * 
     * @param describeDeliveryStreamRequest
     * @return Result of the DescribeDeliveryStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonKinesisFirehose.DescribeDeliveryStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DescribeDeliveryStream"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDeliveryStreamResult describeDeliveryStream(DescribeDeliveryStreamRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDeliveryStream(request);
    }

    @SdkInternalApi
    final DescribeDeliveryStreamResult executeDescribeDeliveryStream(DescribeDeliveryStreamRequest describeDeliveryStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDeliveryStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeliveryStreamRequest> request = null;
        Response<DescribeDeliveryStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeliveryStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDeliveryStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDeliveryStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDeliveryStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your delivery streams.
     * </p>
     * <p>
     * The number of delivery streams might be too large to return using a single call to <a>ListDeliveryStreams</a>.
     * You can limit the number of delivery streams returned, using the <b>Limit</b> parameter. To determine whether
     * there are more delivery streams to list, check the value of <b>HasMoreDeliveryStreams</b> in the output. If there
     * are more delivery streams to list, you can request them by specifying the name of the last delivery stream
     * returned in the call in the <b>ExclusiveStartDeliveryStreamName</b> parameter of a subsequent call.
     * </p>
     * 
     * @param listDeliveryStreamsRequest
     * @return Result of the ListDeliveryStreams operation returned by the service.
     * @sample AmazonKinesisFirehose.ListDeliveryStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/ListDeliveryStreams" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDeliveryStreamsResult listDeliveryStreams(ListDeliveryStreamsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeliveryStreams(request);
    }

    @SdkInternalApi
    final ListDeliveryStreamsResult executeListDeliveryStreams(ListDeliveryStreamsRequest listDeliveryStreamsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeliveryStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeliveryStreamsRequest> request = null;
        Response<ListDeliveryStreamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeliveryStreamsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeliveryStreamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeliveryStreamsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeliveryStreamsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Writes a single data record into an Amazon Kinesis Firehose delivery stream. To write multiple data records into
     * a delivery stream, use <a>PutRecordBatch</a>. Applications using these operations are referred to as producers.
     * </p>
     * <p>
     * By default, each delivery stream can take in up to 2,000 transactions per second, 5,000 records per second, or 5
     * MB per second. Note that if you use <a>PutRecord</a> and <a>PutRecordBatch</a>, the limits are an aggregate
     * across these two operations for each delivery stream. For more information about limits and how to request an
     * increase, see <a href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon Kinesis Firehose
     * Limits</a>.
     * </p>
     * <p>
     * You must specify the name of the delivery stream and the data record when using <a>PutRecord</a>. The data record
     * consists of a data blob that can be up to 1,000 KB in size, and any kind of data, for example, a segment from a
     * log file, geographic location data, website clickstream data, and so on.
     * </p>
     * <p>
     * Kinesis Firehose buffers records before delivering them to the destination. To disambiguate the data blobs at the
     * destination, a common solution is to use delimiters in the data, such as a newline (<code>\n</code>) or some
     * other character unique within the data. This allows the consumer application to parse individual data items when
     * reading the data from the destination.
     * </p>
     * <p>
     * The <a>PutRecord</a> operation returns a <b>RecordId</b>, which is a unique string assigned to each record.
     * Producer applications can use this ID for purposes such as auditability and investigation.
     * </p>
     * <p>
     * If the <a>PutRecord</a> operation throws a <b>ServiceUnavailableException</b>, back off and retry. If the
     * exception persists, it is possible that the throughput limits have been exceeded for the delivery stream.
     * </p>
     * <p>
     * Data records sent to Kinesis Firehose are stored for 24 hours from the time they are added to a delivery stream
     * as it attempts to send the records to the destination. If the destination is unreachable for more than 24 hours,
     * the data is no longer available.
     * </p>
     * 
     * @param putRecordRequest
     * @return Result of the PutRecord operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws ServiceUnavailableException
     *         The service is unavailable, back off and retry the operation. If you continue to see the exception,
     *         throughput limits for the delivery stream may have been exceeded. For more information about limits and
     *         how to request an increase, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon Kinesis Firehose Limits</a>.
     * @sample AmazonKinesisFirehose.PutRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/PutRecord" target="_top">AWS API
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

    /**
     * <p>
     * Writes multiple data records into a delivery stream in a single call, which can achieve higher throughput per
     * producer than when writing single records. To write single data records into a delivery stream, use
     * <a>PutRecord</a>. Applications using these operations are referred to as producers.
     * </p>
     * <p>
     * By default, each delivery stream can take in up to 2,000 transactions per second, 5,000 records per second, or 5
     * MB per second. If you use <a>PutRecord</a> and <a>PutRecordBatch</a>, the limits are an aggregate across these
     * two operations for each delivery stream. For more information about limits, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon Kinesis Firehose Limits</a>.
     * </p>
     * <p>
     * Each <a>PutRecordBatch</a> request supports up to 500 records. Each record in the request can be as large as
     * 1,000 KB (before 64-bit encoding), up to a limit of 4 MB for the entire request. These limits cannot be changed.
     * </p>
     * <p>
     * You must specify the name of the delivery stream and the data record when using <a>PutRecord</a>. The data record
     * consists of a data blob that can be up to 1,000 KB in size, and any kind of data. For example, it could be a
     * segment from a log file, geographic location data, web site clickstream data, and so on.
     * </p>
     * <p>
     * Kinesis Firehose buffers records before delivering them to the destination. To disambiguate the data blobs at the
     * destination, a common solution is to use delimiters in the data, such as a newline (<code>\n</code>) or some
     * other character unique within the data. This allows the consumer application to parse individual data items when
     * reading the data from the destination.
     * </p>
     * <p>
     * The <a>PutRecordBatch</a> response includes a count of failed records, <b>FailedPutCount</b>, and an array of
     * responses, <b>RequestResponses</b>. Each entry in the <b>RequestResponses</b> array provides additional
     * information about the processed record. It directly correlates with a record in the request array using the same
     * ordering, from the top to the bottom. The response array always includes the same number of records as the
     * request array. <b>RequestResponses</b> includes both successfully and unsuccessfully processed records. Kinesis
     * Firehose attempts to process all records in each <a>PutRecordBatch</a> request. A single record failure does not
     * stop the processing of subsequent records.
     * </p>
     * <p>
     * A successfully processed record includes a <b>RecordId</b> value, which is unique for the record. An
     * unsuccessfully processed record includes <b>ErrorCode</b> and <b>ErrorMessage</b> values. <b>ErrorCode</b>
     * reflects the type of error, and is one of the following values: <code>ServiceUnavailable</code> or
     * <code>InternalFailure</code>. <b>ErrorMessage</b> provides more detailed information about the error.
     * </p>
     * <p>
     * If there is an internal server error or a timeout, the write might have completed or it might have failed. If
     * <b>FailedPutCount</b> is greater than 0, retry the request, resending only those records that might have failed
     * processing. This minimizes the possible duplicate records and also reduces the total bytes sent (and
     * corresponding charges). We recommend that you handle any duplicates at the destination.
     * </p>
     * <p>
     * If <a>PutRecordBatch</a> throws <b>ServiceUnavailableException</b>, back off and retry. If the exception
     * persists, it is possible that the throughput limits have been exceeded for the delivery stream.
     * </p>
     * <p>
     * Data records sent to Kinesis Firehose are stored for 24 hours from the time they are added to a delivery stream
     * as it attempts to send the records to the destination. If the destination is unreachable for more than 24 hours,
     * the data is no longer available.
     * </p>
     * 
     * @param putRecordBatchRequest
     * @return Result of the PutRecordBatch operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws ServiceUnavailableException
     *         The service is unavailable, back off and retry the operation. If you continue to see the exception,
     *         throughput limits for the delivery stream may have been exceeded. For more information about limits and
     *         how to request an increase, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon Kinesis Firehose Limits</a>.
     * @sample AmazonKinesisFirehose.PutRecordBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/PutRecordBatch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutRecordBatchResult putRecordBatch(PutRecordBatchRequest request) {
        request = beforeClientExecution(request);
        return executePutRecordBatch(request);
    }

    @SdkInternalApi
    final PutRecordBatchResult executePutRecordBatch(PutRecordBatchRequest putRecordBatchRequest) {

        ExecutionContext executionContext = createExecutionContext(putRecordBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRecordBatchRequest> request = null;
        Response<PutRecordBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRecordBatchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRecordBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRecordBatchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutRecordBatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified destination of the specified delivery stream.
     * </p>
     * <p>
     * You can use this operation to change the destination type (for example, to replace the Amazon S3 destination with
     * Amazon Redshift) or change the parameters associated with a destination (for example, to change the bucket name
     * of the Amazon S3 destination). The update might not occur immediately. The target delivery stream remains active
     * while the configurations are updated, so data writes to the delivery stream can continue during this process. The
     * updated configurations are usually effective within a few minutes.
     * </p>
     * <p>
     * Note that switching between Amazon ES and other services is not supported. For an Amazon ES destination, you can
     * only update to another Amazon ES destination.
     * </p>
     * <p>
     * If the destination type is the same, Kinesis Firehose merges the configuration parameters specified with the
     * destination configuration that already exists on the delivery stream. If any of the parameters are not specified
     * in the call, the existing values are retained. For example, in the Amazon S3 destination, if
     * <a>EncryptionConfiguration</a> is not specified, then the existing <a>EncryptionConfiguration</a> is maintained
     * on the destination.
     * </p>
     * <p>
     * If the destination type is not the same, for example, changing the destination from Amazon S3 to Amazon Redshift,
     * Kinesis Firehose does not merge any parameters. In this case, all parameters must be specified.
     * </p>
     * <p>
     * Kinesis Firehose uses <b>CurrentDeliveryStreamVersionId</b> to avoid race conditions and conflicting merges. This
     * is a required field, and the service updates the configuration only if the existing configuration has a version
     * ID that matches. After the update is applied successfully, the version ID is updated, and can be retrieved using
     * <a>DescribeDeliveryStream</a>. Use the new version ID to set <b>CurrentDeliveryStreamVersionId</b> in the next
     * call.
     * </p>
     * 
     * @param updateDestinationRequest
     * @return Result of the UpdateDestination operation returned by the service.
     * @throws InvalidArgumentException
     *         The specified input parameter has a value that is not valid.
     * @throws ResourceInUseException
     *         The resource is already in use and not available for this operation.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConcurrentModificationException
     *         Another modification has already happened. Fetch <b>VersionId</b> again and use it to update the
     *         destination.
     * @sample AmazonKinesisFirehose.UpdateDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/UpdateDestination" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDestinationResult updateDestination(UpdateDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDestination(request);
    }

    @SdkInternalApi
    final UpdateDestinationResult executeUpdateDestination(UpdateDestinationRequest updateDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDestinationRequest> request = null;
        Response<UpdateDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDestinationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDestinationResultJsonUnmarshaller());
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

}
