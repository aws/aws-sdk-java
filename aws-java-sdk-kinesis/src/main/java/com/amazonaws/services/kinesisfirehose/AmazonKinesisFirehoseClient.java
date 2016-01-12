/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.kinesisfirehose;

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
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.services.kinesisfirehose.model.transform.*;

/**
 * Client for accessing Firehose. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon Kinesis Firehose API Reference</fullname>
 * <p>
 * Amazon Kinesis Firehose is a fully-managed service that delivers real-time
 * streaming data to destinations such as Amazon S3 and Amazon Redshift.
 * </p>
 */
public class AmazonKinesisFirehoseClient extends AmazonWebServiceClient
        implements AmazonKinesisFirehose {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory
            .getLog(AmazonKinesisFirehose.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "firehose";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "firehose";

    /**
     * List of exception unmarshallers for all Firehose exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Firehose. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonKinesisFirehoseClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Firehose. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Firehose (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonKinesisFirehoseClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Firehose using the
     * specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonKinesisFirehoseClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Firehose using the
     * specified AWS account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Firehose (ex: proxy settings, retry counts, etc.).
     */
    public AmazonKinesisFirehoseClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Firehose using the
     * specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonKinesisFirehoseClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Firehose using the
     * specified AWS account credentials provider and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Firehose (ex: proxy settings, retry counts, etc.).
     */
    public AmazonKinesisFirehoseClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Firehose using the
     * specified AWS account credentials provider, client configuration options,
     * and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Firehose (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonKinesisFirehoseClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kinesisfirehose.model.ConcurrentModificationException.class,
                        "ConcurrentModificationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kinesisfirehose.model.ResourceInUseException.class,
                        "ResourceInUseException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kinesisfirehose.model.LimitExceededException.class,
                        "LimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kinesisfirehose.model.ServiceUnavailableException.class,
                        "ServiceUnavailableException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kinesisfirehose.model.ResourceNotFoundException.class,
                        "ResourceNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kinesisfirehose.model.InvalidArgumentException.class,
                        "InvalidArgumentException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://firehose.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/kinesisfirehose/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/kinesisfirehose/request.handler2s"));
    }

    /**
     * <p>
     * Creates a delivery stream.
     * </p>
     * <p>
     * <a>CreateDeliveryStream</a> is an asynchronous operation that immediately
     * returns. The initial status of the delivery stream is
     * <code>CREATING</code>. After the delivery stream is created, its status
     * is <code>ACTIVE</code> and it now accepts data. Attempts to send data to
     * a delivery stream that is not in the <code>ACTIVE</code> state cause an
     * exception. To check the state of a delivery stream, use
     * <a>DescribeDeliveryStream</a>.
     * </p>
     * <p>
     * The name of a delivery stream identifies it. You can't have two delivery
     * streams with the same name in the same region. Two delivery streams in
     * different AWS accounts or different regions in the same AWS account can
     * have the same name.
     * </p>
     * <p>
     * By default, you can create up to 5 delivery streams per region.
     * </p>
     * <p>
     * A delivery stream can only be configured with a single destination,
     * Amazon S3 or Amazon Redshift. For correct <a>CreateDeliveryStream</a>
     * request syntax, specify only one destination configuration parameter:
     * either <code>RedshiftDestinationConfiguration</code> or
     * <code>S3DestinationConfiguration</code>
     * </p>
     * <p>
     * As part of <code>S3DestinationConfiguration</code>, optional values
     * <code>BufferingHints</code>, <code>EncryptionConfiguration</code>, and
     * <code>CompressionFormat</code> can be provided. By default, if no
     * <code>BufferingHints</code> value is provided, Amazon Kinesis Firehose
     * buffers data up to 5 MB or for 5 minutes, whichever condition is
     * satisfied first. Note that <code>BufferingHints</code> is a hint, so
     * there are some cases where the service cannot adhere to these conditions
     * strictly; for example, record boundaries are such that the size is a
     * little over or under the configured buffering size. By default, no
     * encryption is performed. We strongly recommend that you enable encryption
     * to ensure secure data storage in Amazon S3.
     * </p>
     * <p>
     * A few notes about <code>RedshiftDestinationConfiguration</code>:
     * </p>
     * <ul>
     * <li>An Amazon Redshift destination requires an S3 bucket as intermediate
     * location, as Amazon Kinesis Firehose first delivers data to S3 and then
     * uses <code>COPY</code> syntax to load data into an Amazon Redshift table.
     * This is specified in the
     * <code>RedshiftDestinationConfiguration.S3Configuration</code> parameter
     * element.</li>
     * <li>The compression formats <code>SNAPPY</code> or <code>ZIP</code>
     * cannot be specified in
     * <code>RedshiftDestinationConfiguration.S3Configuration</code> because the
     * Amazon Redshift <code>COPY</code> operation that reads from the S3 bucket
     * doesn't support these compression formats.</li>
     * <li>We strongly recommend that the username and password provided is used
     * exclusively for Amazon Kinesis Firehose purposes, and that the
     * permissions for the account are restricted for Amazon Redshift
     * <code>INSERT</code> permissions.</li>
     * </ul>
     * <p>
     * Amazon Kinesis Firehose assumes the IAM role that is configured as part
     * of destinations. The IAM role should allow the Amazon Kinesis Firehose
     * principal to assume the role, and the role should have permissions that
     * allows the service to deliver the data. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/firehose/latest/dev/controlling-access.html#using-iam-s3"
     * >Amazon S3 Bucket Access</a> in the <i>Amazon Kinesis Firehose Developer
     * Guide</i>.
     * </p>
     * 
     * @param createDeliveryStreamRequest
     *        Contains the parameters for <a>CreateDeliveryStream</a>.
     * @return Result of the CreateDeliveryStream operation returned by the
     *         service.
     * @throws InvalidArgumentException
     *         The specified input parameter has an value that is not valid.
     * @throws LimitExceededException
     *         You have already reached the limit for a requested resource.
     * @throws ResourceInUseException
     *         The resource is already in use and not available for this
     *         operation.
     * @sample AmazonKinesisFirehose.CreateDeliveryStream
     */
    @Override
    public CreateDeliveryStreamResult createDeliveryStream(
            CreateDeliveryStreamRequest createDeliveryStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(createDeliveryStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeliveryStreamRequest> request = null;
        Response<CreateDeliveryStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeliveryStreamRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createDeliveryStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateDeliveryStreamResult> responseHandler = new JsonResponseHandler<CreateDeliveryStreamResult>(
                    new CreateDeliveryStreamResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * You can delete a delivery stream only if it is in <code>ACTIVE</code> or
     * <code>DELETING</code> state, and not in the <code>CREATING</code> state.
     * While the deletion request is in process, the delivery stream is in the
     * <code>DELETING</code> state.
     * </p>
     * <p>
     * To check the state of a delivery stream, use
     * <a>DescribeDeliveryStream</a>.
     * </p>
     * <p>
     * While the delivery stream is <code>DELETING</code> state, the service may
     * continue to accept the records, but the service doesn't make any
     * guarantees with respect to delivering the data. Therefore, as a best
     * practice, you should first stop any applications that are sending records
     * before deleting a delivery stream.
     * </p>
     * 
     * @param deleteDeliveryStreamRequest
     *        Contains the parameters for <a>DeleteDeliveryStream</a>.
     * @return Result of the DeleteDeliveryStream operation returned by the
     *         service.
     * @throws ResourceInUseException
     *         The resource is already in use and not available for this
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonKinesisFirehose.DeleteDeliveryStream
     */
    @Override
    public DeleteDeliveryStreamResult deleteDeliveryStream(
            DeleteDeliveryStreamRequest deleteDeliveryStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDeliveryStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeliveryStreamRequest> request = null;
        Response<DeleteDeliveryStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeliveryStreamRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteDeliveryStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteDeliveryStreamResult> responseHandler = new JsonResponseHandler<DeleteDeliveryStreamResult>(
                    new DeleteDeliveryStreamResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified delivery stream and gets the status. For example,
     * after your delivery stream is created, call <a>DescribeDeliveryStream</a>
     * to see if the delivery stream is <code>ACTIVE</code> and therefore ready
     * for data to be sent to it.
     * </p>
     * 
     * @param describeDeliveryStreamRequest
     *        Contains the parameters for <a>DescribeDeliveryStream</a>.
     * @return Result of the DescribeDeliveryStream operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @sample AmazonKinesisFirehose.DescribeDeliveryStream
     */
    @Override
    public DescribeDeliveryStreamResult describeDeliveryStream(
            DescribeDeliveryStreamRequest describeDeliveryStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDeliveryStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeliveryStreamRequest> request = null;
        Response<DescribeDeliveryStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeliveryStreamRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeDeliveryStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeDeliveryStreamResult> responseHandler = new JsonResponseHandler<DescribeDeliveryStreamResult>(
                    new DescribeDeliveryStreamResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * The number of delivery streams might be too large to return using a
     * single call to <a>ListDeliveryStreams</a>. You can limit the number of
     * delivery streams returned, using the <code>Limit</code> parameter. To
     * determine whether there are more delivery streams to list, check the
     * value of <code>HasMoreDeliveryStreams</code> in the output. If there are
     * more delivery streams to list, you can request them by specifying the
     * name of the last delivery stream returned in the call in the
     * <code>ExclusiveStartDeliveryStreamName</code> parameter of a subsequent
     * call.
     * </p>
     * 
     * @param listDeliveryStreamsRequest
     *        Contains the parameters for <a>ListDeliveryStreams</a>.
     * @return Result of the ListDeliveryStreams operation returned by the
     *         service.
     * @sample AmazonKinesisFirehose.ListDeliveryStreams
     */
    @Override
    public ListDeliveryStreamsResult listDeliveryStreams(
            ListDeliveryStreamsRequest listDeliveryStreamsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDeliveryStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeliveryStreamsRequest> request = null;
        Response<ListDeliveryStreamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeliveryStreamsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listDeliveryStreamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListDeliveryStreamsResult> responseHandler = new JsonResponseHandler<ListDeliveryStreamsResult>(
                    new ListDeliveryStreamsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Writes a single data record into an Amazon Kinesis Firehose delivery
     * stream. To write multiple data records into a delivery stream, use
     * <a>PutRecordBatch</a>. Applications using these operations are referred
     * to as producers.
     * </p>
     * <p>
     * By default, each delivery stream can take in up to 2,000 transactions per
     * second, 5,000 records per second, or 5 MB per second. Note that if you
     * use <a>PutRecord</a> and <a>PutRecordBatch</a>, the limits are an
     * aggregate across these two operations for each delivery stream. For more
     * information about limits and how to request an increase, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon
     * Kinesis Firehose Limits</a>.
     * </p>
     * <p>
     * You must specify the name of the delivery stream and the data record when
     * using <a>PutRecord</a>. The data record consists of a data blob that can
     * be up to 1,000 KB in size, and any kind of data, for example, a segment
     * from a log file, geographic location data, web site clickstream data,
     * etc.
     * </p>
     * <p>
     * Amazon Kinesis Firehose buffers records before delivering them to the
     * destination. To disambiguate the data blobs at the destination, a common
     * solution is to use delimiters in the data, such as a newline (
     * <code>\n</code>) or some other character unique within the data. This
     * allows the consumer application(s) to parse individual data items when
     * reading the data from the destination.
     * </p>
     * <p>
     * Amazon Kinesis Firehose does not maintain data record ordering. If the
     * destination data needs to be re-ordered by the consumer application, the
     * producer should include some form of sequence number in each data record.
     * </p>
     * <p>
     * The <a>PutRecord</a> operation returns a <code>RecordId</code>, which is
     * a unique string assigned to each record. Producer applications can use
     * this ID for purposes such as auditability and investigation.
     * </p>
     * <p>
     * If the <a>PutRecord</a> operation throws a
     * <code>ServiceUnavailableException</code>, back off and retry. If the
     * exception persists, it is possible that the throughput limits have been
     * exceeded for the delivery stream.
     * </p>
     * <p>
     * Data records sent to Amazon Kinesis Firehose are stored for 24 hours from
     * the time they are added to a delivery stream as it attempts to send the
     * records to the destination. If the destination is unreachable for more
     * than 24 hours, the data is no longer available.
     * </p>
     * 
     * @param putRecordRequest
     *        Contains the parameters for <a>PutRecord</a>.
     * @return Result of the PutRecord operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidArgumentException
     *         The specified input parameter has an value that is not valid.
     * @throws ServiceUnavailableException
     *         The service is unavailable, back off and retry the operation. If
     *         you continue to see the exception, throughput limits for the
     *         delivery stream may have been exceeded. For more information
     *         about limits and how to request an increase, see <a href=
     *         "http://docs.aws.amazon.com/firehose/latest/dev/limits.html"
     *         >Amazon Kinesis Firehose Limits</a>.
     * @sample AmazonKinesisFirehose.PutRecord
     */
    @Override
    public PutRecordResult putRecord(PutRecordRequest putRecordRequest) {
        ExecutionContext executionContext = createExecutionContext(putRecordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRecordRequest> request = null;
        Response<PutRecordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRecordRequestMarshaller().marshall(super
                        .beforeMarshalling(putRecordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PutRecordResult> responseHandler = new JsonResponseHandler<PutRecordResult>(
                    new PutRecordResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Writes multiple data records into a delivery stream in a single call,
     * which can achieve higher throughput per producer than when writing single
     * records. To write single data records into a delivery stream, use
     * <a>PutRecord</a>. Applications using these operations are referred to as
     * producers.
     * </p>
     * <p>
     * Each <a>PutRecordBatch</a> request supports up to 500 records. Each
     * record in the request can be as large as 1,000 KB (before 64-bit
     * encoding), up to a limit of 4 MB for the entire request. By default, each
     * delivery stream can take in up to 2,000 transactions per second, 5,000
     * records per second, or 5 MB per second. Note that if you use
     * <a>PutRecord</a> and <a>PutRecordBatch</a>, the limits are an aggregate
     * across these two operations for each delivery stream. For more
     * information about limits and how to request an increase, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/limits.html">Amazon
     * Kinesis Firehose Limits</a>.
     * </p>
     * <p>
     * You must specify the name of the delivery stream and the data record when
     * using <a>PutRecord</a>. The data record consists of a data blob that can
     * be up to 1,000 KB in size, and any kind of data, for example, a segment
     * from a log file, geographic location data, web site clickstream data, and
     * so on.
     * </p>
     * <p>
     * Amazon Kinesis Firehose buffers records before delivering them to the
     * destination. To disambiguate the data blobs at the destination, a common
     * solution is to use delimiters in the data, such as a newline (
     * <code>\n</code>) or some other character unique within the data. This
     * allows the consumer application(s) to parse individual data items when
     * reading the data from the destination.
     * </p>
     * <p>
     * The <a>PutRecordBatch</a> response includes a count of any failed
     * records, <code>FailedPutCount</code>, and an array of responses,
     * <code>RequestResponses</code>. The <code>FailedPutCount</code> value is a
     * count of records that failed. Each entry in the
     * <code>RequestResponses</code> array gives additional information of the
     * processed record. Each entry in <code>RequestResponses</code> directly
     * correlates with a record in the request array using the same ordering,
     * from the top to the bottom of the request and response.
     * <code>RequestResponses</code> always includes the same number of records
     * as the request array. <code>RequestResponses</code> both successfully and
     * unsuccessfully processed records. Amazon Kinesis Firehose attempts to
     * process all records in each <a>PutRecordBatch</a> request. A single
     * record failure does not stop the processing of subsequent records.
     * </p>
     * <p>
     * A successfully processed record includes a <code>RecordId</code> value,
     * which is a unique value identified for the record. An unsuccessfully
     * processed record includes <code>ErrorCode</code> and
     * <code>ErrorMessage</code> values. <code>ErrorCode</code> reflects the
     * type of error and is one of the following values:
     * <code>ServiceUnavailable</code> or <code>InternalFailure</code>.
     * <code>ErrorMessage</code> provides more detailed information about the
     * error.
     * </p>
     * <p>
     * If <code>FailedPutCount</code> is greater than 0 (zero), retry the
     * request. A retry of the entire batch of records is possible; however, we
     * strongly recommend that you inspect the entire response and resend only
     * those records that failed processing. This minimizes duplicate records
     * and also reduces the total bytes sent (and corresponding charges).
     * </p>
     * <p>
     * If the <a>PutRecordBatch</a> operation throws a
     * <code>ServiceUnavailableException</code>, back off and retry. If the
     * exception persists, it is possible that the throughput limits have been
     * exceeded for the delivery stream.
     * </p>
     * <p>
     * Data records sent to Amazon Kinesis Firehose are stored for 24 hours from
     * the time they are added to a delivery stream as it attempts to send the
     * records to the destination. If the destination is unreachable for more
     * than 24 hours, the data is no longer available.
     * </p>
     * 
     * @param putRecordBatchRequest
     *        Contains the parameters for <a>PutRecordBatch</a>.
     * @return Result of the PutRecordBatch operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws InvalidArgumentException
     *         The specified input parameter has an value that is not valid.
     * @throws ServiceUnavailableException
     *         The service is unavailable, back off and retry the operation. If
     *         you continue to see the exception, throughput limits for the
     *         delivery stream may have been exceeded. For more information
     *         about limits and how to request an increase, see <a href=
     *         "http://docs.aws.amazon.com/firehose/latest/dev/limits.html"
     *         >Amazon Kinesis Firehose Limits</a>.
     * @sample AmazonKinesisFirehose.PutRecordBatch
     */
    @Override
    public PutRecordBatchResult putRecordBatch(
            PutRecordBatchRequest putRecordBatchRequest) {
        ExecutionContext executionContext = createExecutionContext(putRecordBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRecordBatchRequest> request = null;
        Response<PutRecordBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRecordBatchRequestMarshaller().marshall(super
                        .beforeMarshalling(putRecordBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PutRecordBatchResult> responseHandler = new JsonResponseHandler<PutRecordBatchResult>(
                    new PutRecordBatchResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * This operation can be used to change the destination type (for example,
     * to replace the Amazon S3 destination with Amazon Redshift) or change the
     * parameters associated with a given destination (for example, to change
     * the bucket name of the Amazon S3 destination). The update may not occur
     * immediately. The target delivery stream remains active while the
     * configurations are updated, so data writes to the delivery stream can
     * continue during this process. The updated configurations are normally
     * effective within a few minutes.
     * </p>
     * <p>
     * If the destination type is the same, Amazon Kinesis Firehose merges the
     * configuration parameters specified in the <a>UpdateDestination</a>
     * request with the destination configuration that already exists on the
     * delivery stream. If any of the parameters are not specified in the update
     * request, then the existing configuration parameters are retained. For
     * example, in the Amazon S3 destination, if <a>EncryptionConfiguration</a>
     * is not specified then the existing <a>EncryptionConfiguration</a> is
     * maintained on the destination.
     * </p>
     * <p>
     * If the destination type is not the same, for example, changing the
     * destination from Amazon S3 to Amazon Redshift, Amazon Kinesis Firehose
     * does not merge any parameters. In this case, all parameters must be
     * specified.
     * </p>
     * <p>
     * Amazon Kinesis Firehose uses the
     * <code>CurrentDeliveryStreamVersionId</code> to avoid race conditions and
     * conflicting merges. This is a required field in every request and the
     * service only updates the configuration if the existing configuration
     * matches the <code>VersionId</code>. After the update is applied
     * successfully, the <code>VersionId</code> is updated, which can be
     * retrieved with the <a>DescribeDeliveryStream</a> operation. The new
     * <code>VersionId</code> should be uses to set
     * <code>CurrentDeliveryStreamVersionId</code> in the next
     * <a>UpdateDestination</a> operation.
     * </p>
     * 
     * @param updateDestinationRequest
     *        Contains the parameters for <a>UpdateDestination</a>.
     * @return Result of the UpdateDestination operation returned by the
     *         service.
     * @throws InvalidArgumentException
     *         The specified input parameter has an value that is not valid.
     * @throws ResourceInUseException
     *         The resource is already in use and not available for this
     *         operation.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConcurrentModificationException
     *         Another modification has already happened. Fetch
     *         <code>VersionId</code> again and use it to update the
     *         destination.
     * @sample AmazonKinesisFirehose.UpdateDestination
     */
    @Override
    public UpdateDestinationResult updateDestination(
            UpdateDestinationRequest updateDestinationRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDestinationRequest> request = null;
        Response<UpdateDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDestinationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateDestinationResult> responseHandler = new JsonResponseHandler<UpdateDestinationResult>(
                    new UpdateDestinationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
