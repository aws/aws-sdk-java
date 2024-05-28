/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs;

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

import com.amazonaws.services.logs.AWSLogsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.logs.model.*;

import com.amazonaws.services.logs.model.transform.*;

/**
 * Client for accessing Amazon CloudWatch Logs. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * You can use Amazon CloudWatch Logs to monitor, store, and access your log files from EC2 instances, CloudTrail, and
 * other sources. You can then retrieve the associated log data from CloudWatch Logs using the CloudWatch console.
 * Alternatively, you can use CloudWatch Logs commands in the Amazon Web Services CLI, CloudWatch Logs API, or
 * CloudWatch Logs SDK.
 * </p>
 * <p>
 * You can use CloudWatch Logs to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Monitor logs from EC2 instances in real time</b>: You can use CloudWatch Logs to monitor applications and systems
 * using log data. For example, CloudWatch Logs can track the number of errors that occur in your application logs.
 * Then, it can send you a notification whenever the rate of errors exceeds a threshold that you specify. CloudWatch
 * Logs uses your log data for monitoring so no code changes are required. For example, you can monitor application logs
 * for specific literal terms (such as "NullReferenceException"). You can also count the number of occurrences of a
 * literal term at a particular position in log data (such as "404" status codes in an Apache access log). When the term
 * you are searching for is found, CloudWatch Logs reports the data to a CloudWatch metric that you specify.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Monitor CloudTrail logged events</b>: You can create alarms in CloudWatch and receive notifications of particular
 * API activity as captured by CloudTrail. You can use the notification to perform troubleshooting.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Archive log data</b>: You can use CloudWatch Logs to store your log data in highly durable storage. You can change
 * the log retention setting so that any log events earlier than this setting are automatically deleted. The CloudWatch
 * Logs agent helps to quickly send both rotated and non-rotated log data off of a host and into the log service. You
 * can then access the raw log data when you need it.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLogsClient extends AmazonWebServiceClient implements AWSLogs {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSLogs.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "logs";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.InvalidOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DataAlreadyAcceptedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.DataAlreadyAcceptedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSequenceTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.InvalidSequenceTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationAbortedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.OperationAbortedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnrecognizedClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.UnrecognizedClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedQueryException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.MalformedQueryExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.logs.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.logs.model.AWSLogsException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Logs. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     * @deprecated use {@link AWSLogsClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSLogsClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Logs. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon CloudWatch Logs (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSLogsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSLogsClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Logs using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSLogsClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSLogsClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSLogsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Logs using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudWatch Logs (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSLogsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLogsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSLogsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Logs using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSLogsClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSLogsClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Logs using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudWatch Logs (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSLogsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLogsClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSLogsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Logs using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon CloudWatch Logs (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSLogsClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSLogsClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSLogsClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSLogsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSLogsClientBuilder builder() {
        return AWSLogsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Logs using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLogsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudWatch Logs using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLogsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://logs.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/logs/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/logs/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates the specified KMS key with either one log group in the account, or with all stored CloudWatch Logs
     * query insights results in the account.
     * </p>
     * <p>
     * When you use <code>AssociateKmsKey</code>, you specify either the <code>logGroupName</code> parameter or the
     * <code>resourceIdentifier</code> parameter. You can't specify both of those parameters in the same operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the <code>logGroupName</code> parameter to cause all log events stored in the log group to be encrypted
     * with that key. Only the log events ingested after the key is associated are encrypted with that key.
     * </p>
     * <p>
     * Associating a KMS key with a log group overrides any existing associations between the log group and a KMS key.
     * After a KMS key is associated with a log group, all newly ingested data for the log group is encrypted using the
     * KMS key. This association is stored as long as the data encrypted with the KMS key is still within CloudWatch
     * Logs. This enables CloudWatch Logs to decrypt this data whenever it is requested.
     * </p>
     * <p>
     * Associating a key with a log group does not cause the results of queries of that log group to be encrypted with
     * that key. To have query results encrypted with a KMS key, you must use an <code>AssociateKmsKey</code> operation
     * with the <code>resourceIdentifier</code> parameter that specifies a <code>query-result</code> resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the <code>resourceIdentifier</code> parameter with a <code>query-result</code> resource, to use that key
     * to encrypt the stored results of all future <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_StartQuery.html">StartQuery</a>
     * operations in the account. The response from a <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetQueryResults.html"
     * >GetQueryResults</a> operation will still return the query results in plain text.
     * </p>
     * <p>
     * Even if you have not associated a key with your query results, the query results are encrypted when stored, using
     * the default CloudWatch Logs method.
     * </p>
     * <p>
     * If you run a query from a monitoring account that queries logs in a source account, the query results key from
     * the monitoring account, if any, is used.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * If you delete the key that is used to encrypt log events or log group query results, then all the associated
     * stored log events or query results that were encrypted with that key will be unencryptable and unusable.
     * </p>
     * </important> <note>
     * <p>
     * CloudWatch Logs supports only symmetric KMS keys. Do not use an associate an asymmetric KMS key with your log
     * group or query results. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using Symmetric and
     * Asymmetric Keys</a>.
     * </p>
     * </note>
     * <p>
     * It can take up to 5 minutes for this operation to take effect.
     * </p>
     * <p>
     * If you attempt to associate a KMS key with a log group but the KMS key does not exist or the KMS key is disabled,
     * you receive an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param associateKmsKeyRequest
     * @return Result of the AssociateKmsKey operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.AssociateKmsKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/AssociateKmsKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateKmsKeyResult associateKmsKey(AssociateKmsKeyRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateKmsKey(request);
    }

    @SdkInternalApi
    final AssociateKmsKeyResult executeAssociateKmsKey(AssociateKmsKeyRequest associateKmsKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(associateKmsKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateKmsKeyRequest> request = null;
        Response<AssociateKmsKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateKmsKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateKmsKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateKmsKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateKmsKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateKmsKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels the specified export task.
     * </p>
     * <p>
     * The task must be in the <code>PENDING</code> or <code>RUNNING</code> state.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @return Result of the CancelExportTask operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidOperationException
     *         The operation is not valid on the specified resource.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.CancelExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CancelExportTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelExportTaskResult cancelExportTask(CancelExportTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCancelExportTask(request);
    }

    @SdkInternalApi
    final CancelExportTaskResult executeCancelExportTask(CancelExportTaskRequest cancelExportTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelExportTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelExportTaskRequest> request = null;
        Response<CancelExportTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelExportTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelExportTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelExportTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelExportTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelExportTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <i>delivery</i>. A delivery is a connection between a logical <i>delivery source</i> and a logical
     * <i>delivery destination</i> that you have already created.
     * </p>
     * <p>
     * Only some Amazon Web Services services support being configured as a delivery source using this operation. These
     * services are listed as <b>Supported [V2 Permissions]</b> in the table at <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html">Enabling
     * logging from Amazon Web Services services.</a>
     * </p>
     * <p>
     * A delivery destination can represent a log group in CloudWatch Logs, an Amazon S3 bucket, or a delivery stream in
     * Firehose.
     * </p>
     * <p>
     * To configure logs delivery between a supported Amazon Web Services service and a destination, you must do the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create a delivery source, which is a logical object that represents the resource that is actually sending the
     * logs. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliverySource.html"
     * >PutDeliverySource</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a <i>delivery destination</i>, which is a logical object that represents the actual delivery destination.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestination.html"
     * >PutDeliveryDestination</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are delivering logs cross-account, you must use <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html"
     * >PutDeliveryDestinationPolicy</a> in the destination account to assign an IAM policy to the destination. This
     * policy allows delivery to that destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>CreateDelivery</code> to create a <i>delivery</i> by pairing exactly one delivery source and one
     * delivery destination.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can configure a single delivery source to send logs to multiple destinations by creating multiple deliveries.
     * You can also create multiple deliveries to configure multiple delivery sources to send logs to the same delivery
     * destination.
     * </p>
     * <p>
     * You can't update an existing delivery. You can only create and delete deliveries.
     * </p>
     * 
     * @param createDeliveryRequest
     * @return Result of the CreateDelivery operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AWSLogs.CreateDelivery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateDelivery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDeliveryResult createDelivery(CreateDeliveryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDelivery(request);
    }

    @SdkInternalApi
    final CreateDeliveryResult executeCreateDelivery(CreateDeliveryRequest createDeliveryRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeliveryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeliveryRequest> request = null;
        Response<CreateDeliveryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeliveryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeliveryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDelivery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeliveryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDeliveryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an export task so that you can efficiently export data from a log group to an Amazon S3 bucket. When you
     * perform a <code>CreateExportTask</code> operation, you must use credentials that have permission to write to the
     * S3 bucket that you specify as the destination.
     * </p>
     * <p>
     * Exporting log data to S3 buckets that are encrypted by KMS is supported. Exporting log data to Amazon S3 buckets
     * that have S3 Object Lock enabled with a retention period is also supported.
     * </p>
     * <p>
     * Exporting to S3 buckets that are encrypted with AES-256 is supported.
     * </p>
     * <p>
     * This is an asynchronous call. If all the required information is provided, this operation initiates an export
     * task and responds with the ID of the task. After the task has started, you can use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeExportTasks.html"
     * >DescribeExportTasks</a> to get the status of the export task. Each account can only have one active (
     * <code>RUNNING</code> or <code>PENDING</code>) export task at a time. To cancel an export task, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CancelExportTask.html"
     * >CancelExportTask</a>.
     * </p>
     * <p>
     * You can export logs from multiple log groups or multiple time ranges to the same S3 bucket. To separate log data
     * for each export task, specify a prefix to be used as the Amazon S3 key prefix for all exported objects.
     * </p>
     * <note>
     * <p>
     * Time-based sorting on chunks of log data inside an exported file is not guaranteed. You can sort the exported log
     * field data by using Linux utilities.
     * </p>
     * </note>
     * 
     * @param createExportTaskRequest
     * @return Result of the CreateExportTask operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @sample AWSLogs.CreateExportTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateExportTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateExportTaskResult createExportTask(CreateExportTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCreateExportTask(request);
    }

    @SdkInternalApi
    final CreateExportTaskResult executeCreateExportTask(CreateExportTaskRequest createExportTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(createExportTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateExportTaskRequest> request = null;
        Response<CreateExportTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateExportTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createExportTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateExportTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateExportTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateExportTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an <i>anomaly detector</i> that regularly scans one or more log groups and look for patterns and
     * anomalies in the logs.
     * </p>
     * <p>
     * An anomaly detector can help surface issues by automatically discovering anomalies in your log event traffic. An
     * anomaly detector uses machine learning algorithms to scan log events and find <i>patterns</i>. A pattern is a
     * shared text structure that recurs among your log fields. Patterns provide a useful tool for analyzing large sets
     * of logs because a large number of log events can often be compressed into a few patterns.
     * </p>
     * <p>
     * The anomaly detector uses pattern recognition to find <code>anomalies</code>, which are unusual log events. It
     * uses the <code>evaluationFrequency</code> to compare current log events and patterns with trained baselines.
     * </p>
     * <p>
     * Fields within a pattern are called <i>tokens</i>. Fields that vary within a pattern, such as a request ID or
     * timestamp, are referred to as <i>dynamic tokens</i> and represented by <code>&lt;*&gt;</code>.
     * </p>
     * <p>
     * The following is an example of a pattern:
     * </p>
     * <p>
     * <code>[INFO] Request time: &lt;*&gt; ms</code>
     * </p>
     * <p>
     * This pattern represents log events like <code>[INFO] Request time: 327 ms</code> and other similar log events
     * that differ only by the number, in this csse 327. When the pattern is displayed, the different numbers are
     * replaced by <code>&lt;*&gt;</code>
     * </p>
     * <note>
     * <p>
     * Any parts of log events that are masked as sensitive data are not scanned for anomalies. For more information
     * about masking sensitive data, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html">Help protect
     * sensitive log data with masking</a>.
     * </p>
     * </note>
     * 
     * @param createLogAnomalyDetectorRequest
     * @return Result of the CreateLogAnomalyDetector operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @sample AWSLogs.CreateLogAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateLogAnomalyDetector" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateLogAnomalyDetectorResult createLogAnomalyDetector(CreateLogAnomalyDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLogAnomalyDetector(request);
    }

    @SdkInternalApi
    final CreateLogAnomalyDetectorResult executeCreateLogAnomalyDetector(CreateLogAnomalyDetectorRequest createLogAnomalyDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(createLogAnomalyDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLogAnomalyDetectorRequest> request = null;
        Response<CreateLogAnomalyDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLogAnomalyDetectorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createLogAnomalyDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLogAnomalyDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLogAnomalyDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateLogAnomalyDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a log group with the specified name. You can create up to 1,000,000 log groups per Region per account.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Log group names must be unique within a Region for an Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Log group names can be between 1 and 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Log group names consist of the following characters: a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward
     * slash), '.' (period), and '#' (number sign)
     * </p>
     * </li>
     * <li>
     * <p>
     * Log group names can't start with the string <code>aws/</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you create a log group, by default the log events in the log group do not expire. To set a retention policy
     * so that events expire and are deleted after a specified time, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutRetentionPolicy.html"
     * >PutRetentionPolicy</a>.
     * </p>
     * <p>
     * If you associate an KMS key with the log group, ingested data is encrypted using the KMS key. This association is
     * stored as long as the data encrypted with the KMS key is still within CloudWatch Logs. This enables CloudWatch
     * Logs to decrypt this data whenever it is requested.
     * </p>
     * <p>
     * If you attempt to associate a KMS key with the log group but the KMS key does not exist or the KMS key is
     * disabled, you receive an <code>InvalidParameterException</code> error.
     * </p>
     * <important>
     * <p>
     * CloudWatch Logs supports only symmetric KMS keys. Do not associate an asymmetric KMS key with your log group. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using Symmetric and
     * Asymmetric Keys</a>.
     * </p>
     * </important>
     * 
     * @param createLogGroupRequest
     * @return Result of the CreateLogGroup operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.CreateLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLogGroupResult createLogGroup(CreateLogGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLogGroup(request);
    }

    @SdkInternalApi
    final CreateLogGroupResult executeCreateLogGroup(CreateLogGroupRequest createLogGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createLogGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLogGroupRequest> request = null;
        Response<CreateLogGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLogGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLogGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLogGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLogGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLogGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a log stream for the specified log group. A log stream is a sequence of log events that originate from a
     * single source, such as an application instance or a resource that is being monitored.
     * </p>
     * <p>
     * There is no limit on the number of log streams that you can create for a log group. There is a limit of 50 TPS on
     * <code>CreateLogStream</code> operations, after which transactions are throttled.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Log stream names must be unique within the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Log stream names can be between 1 and 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use ':' (colon) or '*' (asterisk) characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createLogStreamRequest
     * @return Result of the CreateLogStream operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.CreateLogStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateLogStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLogStreamResult createLogStream(CreateLogStreamRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLogStream(request);
    }

    @SdkInternalApi
    final CreateLogStreamResult executeCreateLogStream(CreateLogStreamRequest createLogStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(createLogStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLogStreamRequest> request = null;
        Response<CreateLogStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLogStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLogStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLogStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLogStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLogStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a CloudWatch Logs account policy. This stops the policy from applying to all log groups or a subset of
     * log groups in the account. Log-group level policies will still be in effect.
     * </p>
     * <p>
     * To use this operation, you must be signed on with the correct permissions depending on the type of policy that
     * you are deleting.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To delete a data protection policy, you must have the <code>logs:DeleteDataProtectionPolicy</code> and
     * <code>logs:DeleteAccountPolicy</code> permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * To delete a subscription filter policy, you must have the <code>logs:DeleteSubscriptionFilter</code> and
     * <code>logs:DeleteAccountPolicy</code> permissions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccountPolicyRequest
     * @return Result of the DeleteAccountPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @sample AWSLogs.DeleteAccountPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteAccountPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAccountPolicyResult deleteAccountPolicy(DeleteAccountPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccountPolicy(request);
    }

    @SdkInternalApi
    final DeleteAccountPolicyResult executeDeleteAccountPolicy(DeleteAccountPolicyRequest deleteAccountPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAccountPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAccountPolicyRequest> request = null;
        Response<DeleteAccountPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAccountPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAccountPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccountPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAccountPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAccountPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the data protection policy from the specified log group.
     * </p>
     * <p>
     * For more information about data protection policies, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDataProtectionPolicy.html"
     * >PutDataProtectionPolicy</a>.
     * </p>
     * 
     * @param deleteDataProtectionPolicyRequest
     * @return Result of the DeleteDataProtectionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteDataProtectionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteDataProtectionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDataProtectionPolicyResult deleteDataProtectionPolicy(DeleteDataProtectionPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataProtectionPolicy(request);
    }

    @SdkInternalApi
    final DeleteDataProtectionPolicyResult executeDeleteDataProtectionPolicy(DeleteDataProtectionPolicyRequest deleteDataProtectionPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataProtectionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataProtectionPolicyRequest> request = null;
        Response<DeleteDataProtectionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataProtectionPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDataProtectionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataProtectionPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataProtectionPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDataProtectionPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes s <i>delivery</i>. A delivery is a connection between a logical <i>delivery source</i> and a logical
     * <i>delivery destination</i>. Deleting a delivery only deletes the connection between the delivery source and
     * delivery destination. It does not delete the delivery destination or the delivery source.
     * </p>
     * 
     * @param deleteDeliveryRequest
     * @return Result of the DeleteDelivery operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AWSLogs.DeleteDelivery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteDelivery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDeliveryResult deleteDelivery(DeleteDeliveryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDelivery(request);
    }

    @SdkInternalApi
    final DeleteDeliveryResult executeDeleteDelivery(DeleteDeliveryRequest deleteDeliveryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeliveryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeliveryRequest> request = null;
        Response<DeleteDeliveryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeliveryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeliveryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDelivery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeliveryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDeliveryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <i>delivery destination</i>. A delivery is a connection between a logical <i>delivery source</i> and a
     * logical <i>delivery destination</i>.
     * </p>
     * <p>
     * You can't delete a delivery destination if any current deliveries are associated with it. To find whether any
     * deliveries are associated with this delivery destination, use the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeDeliveries.html"
     * >DescribeDeliveries</a> operation and check the <code>deliveryDestinationArn</code> field in the results.
     * </p>
     * 
     * @param deleteDeliveryDestinationRequest
     * @return Result of the DeleteDeliveryDestination operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AWSLogs.DeleteDeliveryDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteDeliveryDestination" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDeliveryDestinationResult deleteDeliveryDestination(DeleteDeliveryDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDeliveryDestination(request);
    }

    @SdkInternalApi
    final DeleteDeliveryDestinationResult executeDeleteDeliveryDestination(DeleteDeliveryDestinationRequest deleteDeliveryDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeliveryDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeliveryDestinationRequest> request = null;
        Response<DeleteDeliveryDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeliveryDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDeliveryDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDeliveryDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeliveryDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDeliveryDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a delivery destination policy. For more information about these policies, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html"
     * >PutDeliveryDestinationPolicy</a>.
     * </p>
     * 
     * @param deleteDeliveryDestinationPolicyRequest
     * @return Result of the DeleteDeliveryDestinationPolicy operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @sample AWSLogs.DeleteDeliveryDestinationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteDeliveryDestinationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDeliveryDestinationPolicyResult deleteDeliveryDestinationPolicy(DeleteDeliveryDestinationPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDeliveryDestinationPolicy(request);
    }

    @SdkInternalApi
    final DeleteDeliveryDestinationPolicyResult executeDeleteDeliveryDestinationPolicy(
            DeleteDeliveryDestinationPolicyRequest deleteDeliveryDestinationPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeliveryDestinationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeliveryDestinationPolicyRequest> request = null;
        Response<DeleteDeliveryDestinationPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeliveryDestinationPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDeliveryDestinationPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDeliveryDestinationPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeliveryDestinationPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDeliveryDestinationPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a <i>delivery source</i>. A delivery is a connection between a logical <i>delivery source</i> and a
     * logical <i>delivery destination</i>.
     * </p>
     * <p>
     * You can't delete a delivery source if any current deliveries are associated with it. To find whether any
     * deliveries are associated with this delivery source, use the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeDeliveries.html"
     * >DescribeDeliveries</a> operation and check the <code>deliverySourceName</code> field in the results.
     * </p>
     * 
     * @param deleteDeliverySourceRequest
     * @return Result of the DeleteDeliverySource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AWSLogs.DeleteDeliverySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteDeliverySource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDeliverySourceResult deleteDeliverySource(DeleteDeliverySourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDeliverySource(request);
    }

    @SdkInternalApi
    final DeleteDeliverySourceResult executeDeleteDeliverySource(DeleteDeliverySourceRequest deleteDeliverySourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeliverySourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeliverySourceRequest> request = null;
        Response<DeleteDeliverySourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeliverySourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeliverySourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDeliverySource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeliverySourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDeliverySourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified destination, and eventually disables all the subscription filters that publish to it. This
     * operation does not delete the physical resource encapsulated by the destination.
     * </p>
     * 
     * @param deleteDestinationRequest
     * @return Result of the DeleteDestination operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteDestination" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDestinationResult deleteDestination(DeleteDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDestination(request);
    }

    @SdkInternalApi
    final DeleteDestinationResult executeDeleteDestination(DeleteDestinationRequest deleteDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDestinationRequest> request = null;
        Response<DeleteDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDestinationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified CloudWatch Logs anomaly detector.
     * </p>
     * 
     * @param deleteLogAnomalyDetectorRequest
     * @return Result of the DeleteLogAnomalyDetector operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @sample AWSLogs.DeleteLogAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteLogAnomalyDetector" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteLogAnomalyDetectorResult deleteLogAnomalyDetector(DeleteLogAnomalyDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLogAnomalyDetector(request);
    }

    @SdkInternalApi
    final DeleteLogAnomalyDetectorResult executeDeleteLogAnomalyDetector(DeleteLogAnomalyDetectorRequest deleteLogAnomalyDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLogAnomalyDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLogAnomalyDetectorRequest> request = null;
        Response<DeleteLogAnomalyDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLogAnomalyDetectorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteLogAnomalyDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLogAnomalyDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLogAnomalyDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteLogAnomalyDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified log group and permanently deletes all the archived log events associated with the log
     * group.
     * </p>
     * 
     * @param deleteLogGroupRequest
     * @return Result of the DeleteLogGroup operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLogGroupResult deleteLogGroup(DeleteLogGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLogGroup(request);
    }

    @SdkInternalApi
    final DeleteLogGroupResult executeDeleteLogGroup(DeleteLogGroupRequest deleteLogGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLogGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLogGroupRequest> request = null;
        Response<DeleteLogGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLogGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLogGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLogGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLogGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLogGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified log stream and permanently deletes all the archived log events associated with the log
     * stream.
     * </p>
     * 
     * @param deleteLogStreamRequest
     * @return Result of the DeleteLogStream operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteLogStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteLogStream" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLogStreamResult deleteLogStream(DeleteLogStreamRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLogStream(request);
    }

    @SdkInternalApi
    final DeleteLogStreamResult executeDeleteLogStream(DeleteLogStreamRequest deleteLogStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLogStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLogStreamRequest> request = null;
        Response<DeleteLogStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLogStreamRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLogStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLogStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLogStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLogStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified metric filter.
     * </p>
     * 
     * @param deleteMetricFilterRequest
     * @return Result of the DeleteMetricFilter operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteMetricFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteMetricFilter" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteMetricFilterResult deleteMetricFilter(DeleteMetricFilterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMetricFilter(request);
    }

    @SdkInternalApi
    final DeleteMetricFilterResult executeDeleteMetricFilter(DeleteMetricFilterRequest deleteMetricFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMetricFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMetricFilterRequest> request = null;
        Response<DeleteMetricFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMetricFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMetricFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMetricFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMetricFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMetricFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a saved CloudWatch Logs Insights query definition. A query definition contains details about a saved
     * CloudWatch Logs Insights query.
     * </p>
     * <p>
     * Each <code>DeleteQueryDefinition</code> operation can delete one query definition.
     * </p>
     * <p>
     * You must have the <code>logs:DeleteQueryDefinition</code> permission to be able to perform this operation.
     * </p>
     * 
     * @param deleteQueryDefinitionRequest
     * @return Result of the DeleteQueryDefinition operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteQueryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteQueryDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteQueryDefinitionResult deleteQueryDefinition(DeleteQueryDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteQueryDefinition(request);
    }

    @SdkInternalApi
    final DeleteQueryDefinitionResult executeDeleteQueryDefinition(DeleteQueryDefinitionRequest deleteQueryDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteQueryDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQueryDefinitionRequest> request = null;
        Response<DeleteQueryDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteQueryDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteQueryDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteQueryDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteQueryDefinitionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteQueryDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a resource policy from this account. This revokes the access of the identities in that policy to put log
     * events to this account.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourcePolicy(request);
    }

    @SdkInternalApi
    final DeleteResourcePolicyResult executeDeleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePolicyRequest> request = null;
        Response<DeleteResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified retention policy.
     * </p>
     * <p>
     * Log events do not expire if they belong to log groups without a retention policy.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     * @return Result of the DeleteRetentionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteRetentionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRetentionPolicyResult deleteRetentionPolicy(DeleteRetentionPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRetentionPolicy(request);
    }

    @SdkInternalApi
    final DeleteRetentionPolicyResult executeDeleteRetentionPolicy(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRetentionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRetentionPolicyRequest> request = null;
        Response<DeleteRetentionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRetentionPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRetentionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRetentionPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRetentionPolicyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteRetentionPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified subscription filter.
     * </p>
     * 
     * @param deleteSubscriptionFilterRequest
     * @return Result of the DeleteSubscriptionFilter operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DeleteSubscriptionFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DeleteSubscriptionFilter" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSubscriptionFilterResult deleteSubscriptionFilter(DeleteSubscriptionFilterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSubscriptionFilter(request);
    }

    @SdkInternalApi
    final DeleteSubscriptionFilterResult executeDeleteSubscriptionFilter(DeleteSubscriptionFilterRequest deleteSubscriptionFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSubscriptionFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubscriptionFilterRequest> request = null;
        Response<DeleteSubscriptionFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubscriptionFilterRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSubscriptionFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSubscriptionFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSubscriptionFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSubscriptionFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all CloudWatch Logs account policies in the account.
     * </p>
     * 
     * @param describeAccountPoliciesRequest
     * @return Result of the DescribeAccountPolicies operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeAccountPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeAccountPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAccountPoliciesResult describeAccountPolicies(DescribeAccountPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountPolicies(request);
    }

    @SdkInternalApi
    final DescribeAccountPoliciesResult executeDescribeAccountPolicies(DescribeAccountPoliciesRequest describeAccountPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountPoliciesRequest> request = null;
        Response<DescribeAccountPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccountPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAccountPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of the deliveries that have been created in the account.
     * </p>
     * <p>
     * A <i>delivery</i> is a connection between a <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliverySource.html">
     * <i>delivery source</i> </a> and a <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestination.html">
     * <i>delivery destination</i> </a>.
     * </p>
     * <p>
     * A delivery source represents an Amazon Web Services resource that sends logs to an logs delivery destination. The
     * destination can be CloudWatch Logs, Amazon S3, or Firehose. Only some Amazon Web Services services support being
     * configured as a delivery source. These services are listed in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html">Enable logging
     * from Amazon Web Services services.</a>
     * </p>
     * 
     * @param describeDeliveriesRequest
     * @return Result of the DescribeDeliveries operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AWSLogs.DescribeDeliveries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeDeliveries" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDeliveriesResult describeDeliveries(DescribeDeliveriesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDeliveries(request);
    }

    @SdkInternalApi
    final DescribeDeliveriesResult executeDescribeDeliveries(DescribeDeliveriesRequest describeDeliveriesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDeliveriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeliveriesRequest> request = null;
        Response<DescribeDeliveriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeliveriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDeliveriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDeliveries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDeliveriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDeliveriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of the delivery destinations that have been created in the account.
     * </p>
     * 
     * @param describeDeliveryDestinationsRequest
     * @return Result of the DescribeDeliveryDestinations operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AWSLogs.DescribeDeliveryDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeDeliveryDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDeliveryDestinationsResult describeDeliveryDestinations(DescribeDeliveryDestinationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDeliveryDestinations(request);
    }

    @SdkInternalApi
    final DescribeDeliveryDestinationsResult executeDescribeDeliveryDestinations(DescribeDeliveryDestinationsRequest describeDeliveryDestinationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDeliveryDestinationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeliveryDestinationsRequest> request = null;
        Response<DescribeDeliveryDestinationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeliveryDestinationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDeliveryDestinationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDeliveryDestinations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDeliveryDestinationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDeliveryDestinationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of the delivery sources that have been created in the account.
     * </p>
     * 
     * @param describeDeliverySourcesRequest
     * @return Result of the DescribeDeliverySources operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AWSLogs.DescribeDeliverySources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeDeliverySources" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDeliverySourcesResult describeDeliverySources(DescribeDeliverySourcesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDeliverySources(request);
    }

    @SdkInternalApi
    final DescribeDeliverySourcesResult executeDescribeDeliverySources(DescribeDeliverySourcesRequest describeDeliverySourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDeliverySourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeliverySourcesRequest> request = null;
        Response<DescribeDeliverySourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeliverySourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDeliverySourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDeliverySources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDeliverySourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDeliverySourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all your destinations. The results are ASCII-sorted by destination name.
     * </p>
     * 
     * @param describeDestinationsRequest
     * @return Result of the DescribeDestinations operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeDestinations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDestinationsResult describeDestinations(DescribeDestinationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDestinations(request);
    }

    @SdkInternalApi
    final DescribeDestinationsResult executeDescribeDestinations(DescribeDestinationsRequest describeDestinationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDestinationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDestinationsRequest> request = null;
        Response<DescribeDestinationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDestinationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDestinationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDestinations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDestinationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDestinationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDestinationsResult describeDestinations() {
        return describeDestinations(new DescribeDestinationsRequest());
    }

    /**
     * <p>
     * Lists the specified export tasks. You can list all your export tasks or filter the results based on task ID or
     * task status.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return Result of the DescribeExportTasks operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeExportTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeExportTasks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExportTasks(request);
    }

    @SdkInternalApi
    final DescribeExportTasksResult executeDescribeExportTasks(DescribeExportTasksRequest describeExportTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExportTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExportTasksRequest> request = null;
        Response<DescribeExportTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExportTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeExportTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExportTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExportTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeExportTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the specified log groups. You can list all your log groups or filter the results by prefix. The results are
     * ASCII-sorted by log group name.
     * </p>
     * <p>
     * CloudWatch Logs doesn’t support IAM policies that control access to the <code>DescribeLogGroups</code> action by
     * using the <code>aws:ResourceTag/<i>key-name</i> </code> condition key. Other CloudWatch Logs actions do support
     * the use of the <code>aws:ResourceTag/<i>key-name</i> </code> condition key to control access. For more
     * information about using tags to control access, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Controlling access to Amazon Web
     * Services resources using tags</a>.
     * </p>
     * <p>
     * If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and
     * view data from the linked source accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html"
     * >CloudWatch cross-account observability</a>.
     * </p>
     * 
     * @param describeLogGroupsRequest
     * @return Result of the DescribeLogGroups operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeLogGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeLogGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeLogGroupsResult describeLogGroups(DescribeLogGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLogGroups(request);
    }

    @SdkInternalApi
    final DescribeLogGroupsResult executeDescribeLogGroups(DescribeLogGroupsRequest describeLogGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLogGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLogGroupsRequest> request = null;
        Response<DescribeLogGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLogGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLogGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLogGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLogGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLogGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeLogGroupsResult describeLogGroups() {
        return describeLogGroups(new DescribeLogGroupsRequest());
    }

    /**
     * <p>
     * Lists the log streams for the specified log group. You can list all the log streams or filter the results by
     * prefix. You can also control how the results are ordered.
     * </p>
     * <p>
     * You can specify the log group to search by using either <code>logGroupIdentifier</code> or
     * <code>logGroupName</code>. You must include one of these two parameters, but you can't include both.
     * </p>
     * <p>
     * This operation has a limit of five transactions per second, after which transactions are throttled.
     * </p>
     * <p>
     * If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and
     * view data from the linked source accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html"
     * >CloudWatch cross-account observability</a>.
     * </p>
     * 
     * @param describeLogStreamsRequest
     * @return Result of the DescribeLogStreams operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeLogStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeLogStreams" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeLogStreamsResult describeLogStreams(DescribeLogStreamsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLogStreams(request);
    }

    @SdkInternalApi
    final DescribeLogStreamsResult executeDescribeLogStreams(DescribeLogStreamsRequest describeLogStreamsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLogStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLogStreamsRequest> request = null;
        Response<DescribeLogStreamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLogStreamsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLogStreamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLogStreams");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLogStreamsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLogStreamsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the specified metric filters. You can list all of the metric filters or filter the results by log name,
     * prefix, metric name, or metric namespace. The results are ASCII-sorted by filter name.
     * </p>
     * 
     * @param describeMetricFiltersRequest
     * @return Result of the DescribeMetricFilters operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeMetricFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeMetricFilters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeMetricFiltersResult describeMetricFilters(DescribeMetricFiltersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMetricFilters(request);
    }

    @SdkInternalApi
    final DescribeMetricFiltersResult executeDescribeMetricFilters(DescribeMetricFiltersRequest describeMetricFiltersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMetricFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMetricFiltersRequest> request = null;
        Response<DescribeMetricFiltersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMetricFiltersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMetricFiltersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMetricFilters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMetricFiltersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeMetricFiltersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of CloudWatch Logs Insights queries that are scheduled, running, or have been run recently in this
     * account. You can request all queries or limit it to queries of a specific log group or queries with a certain
     * status.
     * </p>
     * 
     * @param describeQueriesRequest
     * @return Result of the DescribeQueries operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeQueries" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeQueriesResult describeQueries(DescribeQueriesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeQueries(request);
    }

    @SdkInternalApi
    final DescribeQueriesResult executeDescribeQueries(DescribeQueriesRequest describeQueriesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeQueriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeQueriesRequest> request = null;
        Response<DescribeQueriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeQueriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeQueriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeQueries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeQueriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeQueriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns a paginated list of your saved CloudWatch Logs Insights query definitions. You can
     * retrieve query definitions from the current account or from a source account that is linked to the current
     * account.
     * </p>
     * <p>
     * You can use the <code>queryDefinitionNamePrefix</code> parameter to limit the results to only the query
     * definitions that have names that start with a certain string.
     * </p>
     * 
     * @param describeQueryDefinitionsRequest
     * @return Result of the DescribeQueryDefinitions operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeQueryDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeQueryDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeQueryDefinitionsResult describeQueryDefinitions(DescribeQueryDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeQueryDefinitions(request);
    }

    @SdkInternalApi
    final DescribeQueryDefinitionsResult executeDescribeQueryDefinitions(DescribeQueryDefinitionsRequest describeQueryDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeQueryDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeQueryDefinitionsRequest> request = null;
        Response<DescribeQueryDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeQueryDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeQueryDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeQueryDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeQueryDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeQueryDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the resource policies in this account.
     * </p>
     * 
     * @param describeResourcePoliciesRequest
     * @return Result of the DescribeResourcePolicies operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeResourcePolicies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeResourcePoliciesResult describeResourcePolicies(DescribeResourcePoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeResourcePolicies(request);
    }

    @SdkInternalApi
    final DescribeResourcePoliciesResult executeDescribeResourcePolicies(DescribeResourcePoliciesRequest describeResourcePoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeResourcePoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourcePoliciesRequest> request = null;
        Response<DescribeResourcePoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourcePoliciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeResourcePoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeResourcePolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeResourcePoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeResourcePoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the subscription filters for the specified log group. You can list all the subscription filters or filter
     * the results by prefix. The results are ASCII-sorted by filter name.
     * </p>
     * 
     * @param describeSubscriptionFiltersRequest
     * @return Result of the DescribeSubscriptionFilters operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DescribeSubscriptionFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeSubscriptionFilters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSubscriptionFiltersResult describeSubscriptionFilters(DescribeSubscriptionFiltersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSubscriptionFilters(request);
    }

    @SdkInternalApi
    final DescribeSubscriptionFiltersResult executeDescribeSubscriptionFilters(DescribeSubscriptionFiltersRequest describeSubscriptionFiltersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSubscriptionFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSubscriptionFiltersRequest> request = null;
        Response<DescribeSubscriptionFiltersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSubscriptionFiltersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSubscriptionFiltersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSubscriptionFilters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSubscriptionFiltersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSubscriptionFiltersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified KMS key from the specified log group or from all CloudWatch Logs Insights query
     * results in the account.
     * </p>
     * <p>
     * When you use <code>DisassociateKmsKey</code>, you specify either the <code>logGroupName</code> parameter or the
     * <code>resourceIdentifier</code> parameter. You can't specify both of those parameters in the same operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify the <code>logGroupName</code> parameter to stop using the KMS key to encrypt future log events ingested
     * and stored in the log group. Instead, they will be encrypted with the default CloudWatch Logs method. The log
     * events that were ingested while the key was associated with the log group are still encrypted with that key.
     * Therefore, CloudWatch Logs will need permissions for the key whenever that data is accessed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify the <code>resourceIdentifier</code> parameter with the <code>query-result</code> resource to stop using
     * the KMS key to encrypt the results of all future <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_StartQuery.html">StartQuery</a>
     * operations in the account. They will instead be encrypted with the default CloudWatch Logs method. The results
     * from queries that ran while the key was associated with the account are still encrypted with that key. Therefore,
     * CloudWatch Logs will need permissions for the key whenever that data is accessed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * It can take up to 5 minutes for this operation to take effect.
     * </p>
     * 
     * @param disassociateKmsKeyRequest
     * @return Result of the DisassociateKmsKey operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.DisassociateKmsKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DisassociateKmsKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisassociateKmsKeyResult disassociateKmsKey(DisassociateKmsKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateKmsKey(request);
    }

    @SdkInternalApi
    final DisassociateKmsKeyResult executeDisassociateKmsKey(DisassociateKmsKeyRequest disassociateKmsKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateKmsKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateKmsKeyRequest> request = null;
        Response<DisassociateKmsKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateKmsKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateKmsKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateKmsKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateKmsKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateKmsKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists log events from the specified log group. You can list all the log events or filter the results using a
     * filter pattern, a time range, and the name of the log stream.
     * </p>
     * <p>
     * You must have the <code>logs:FilterLogEvents</code> permission to perform this operation.
     * </p>
     * <p>
     * You can specify the log group to search by using either <code>logGroupIdentifier</code> or
     * <code>logGroupName</code>. You must include one of these two parameters, but you can't include both.
     * </p>
     * <p>
     * By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events) or all the
     * events found within the specified time range. If the results include a token, that means there are more log
     * events available. You can get additional results by specifying the token in a subsequent call. This operation can
     * return empty results while there are more log events available through the token.
     * </p>
     * <p>
     * The returned log events are sorted by event timestamp, the timestamp when the event was ingested by CloudWatch
     * Logs, and the ID of the <code>PutLogEvents</code> request.
     * </p>
     * <p>
     * If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and
     * view data from the linked source accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html"
     * >CloudWatch cross-account observability</a>.
     * </p>
     * 
     * @param filterLogEventsRequest
     * @return Result of the FilterLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.FilterLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/FilterLogEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public FilterLogEventsResult filterLogEvents(FilterLogEventsRequest request) {
        request = beforeClientExecution(request);
        return executeFilterLogEvents(request);
    }

    @SdkInternalApi
    final FilterLogEventsResult executeFilterLogEvents(FilterLogEventsRequest filterLogEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(filterLogEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FilterLogEventsRequest> request = null;
        Response<FilterLogEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new FilterLogEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(filterLogEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "FilterLogEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<FilterLogEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new FilterLogEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a log group data protection policy.
     * </p>
     * 
     * @param getDataProtectionPolicyRequest
     * @return Result of the GetDataProtectionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.GetDataProtectionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetDataProtectionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDataProtectionPolicyResult getDataProtectionPolicy(GetDataProtectionPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataProtectionPolicy(request);
    }

    @SdkInternalApi
    final GetDataProtectionPolicyResult executeGetDataProtectionPolicy(GetDataProtectionPolicyRequest getDataProtectionPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataProtectionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataProtectionPolicyRequest> request = null;
        Response<GetDataProtectionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataProtectionPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDataProtectionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataProtectionPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataProtectionPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDataProtectionPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns complete information about one logical <i>delivery</i>. A delivery is a connection between a <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliverySource.html">
     * <i>delivery source</i> </a> and a <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestination.html">
     * <i>delivery destination</i> </a>.
     * </p>
     * <p>
     * A delivery source represents an Amazon Web Services resource that sends logs to an logs delivery destination. The
     * destination can be CloudWatch Logs, Amazon S3, or Firehose. Only some Amazon Web Services services support being
     * configured as a delivery source. These services are listed in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html">Enable logging
     * from Amazon Web Services services.</a>
     * </p>
     * <p>
     * You need to specify the delivery <code>id</code> in this operation. You can find the IDs of the deliveries in
     * your account with the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_DescribeDeliveries.html"
     * >DescribeDeliveries</a> operation.
     * </p>
     * 
     * @param getDeliveryRequest
     * @return Result of the GetDelivery operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AWSLogs.GetDelivery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetDelivery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDeliveryResult getDelivery(GetDeliveryRequest request) {
        request = beforeClientExecution(request);
        return executeGetDelivery(request);
    }

    @SdkInternalApi
    final GetDeliveryResult executeGetDelivery(GetDeliveryRequest getDeliveryRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeliveryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeliveryRequest> request = null;
        Response<GetDeliveryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeliveryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeliveryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDelivery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeliveryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeliveryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves complete information about one delivery destination.
     * </p>
     * 
     * @param getDeliveryDestinationRequest
     * @return Result of the GetDeliveryDestination operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AWSLogs.GetDeliveryDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetDeliveryDestination" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDeliveryDestinationResult getDeliveryDestination(GetDeliveryDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeliveryDestination(request);
    }

    @SdkInternalApi
    final GetDeliveryDestinationResult executeGetDeliveryDestination(GetDeliveryDestinationRequest getDeliveryDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeliveryDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeliveryDestinationRequest> request = null;
        Response<GetDeliveryDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeliveryDestinationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeliveryDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeliveryDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeliveryDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDeliveryDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the delivery destination policy assigned to the delivery destination that you specify. For more
     * information about delivery destinations and their policies, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html"
     * >PutDeliveryDestinationPolicy</a>.
     * </p>
     * 
     * @param getDeliveryDestinationPolicyRequest
     * @return Result of the GetDeliveryDestinationPolicy operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSLogs.GetDeliveryDestinationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetDeliveryDestinationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDeliveryDestinationPolicyResult getDeliveryDestinationPolicy(GetDeliveryDestinationPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeliveryDestinationPolicy(request);
    }

    @SdkInternalApi
    final GetDeliveryDestinationPolicyResult executeGetDeliveryDestinationPolicy(GetDeliveryDestinationPolicyRequest getDeliveryDestinationPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeliveryDestinationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeliveryDestinationPolicyRequest> request = null;
        Response<GetDeliveryDestinationPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeliveryDestinationPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDeliveryDestinationPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeliveryDestinationPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeliveryDestinationPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDeliveryDestinationPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves complete information about one delivery source.
     * </p>
     * 
     * @param getDeliverySourceRequest
     * @return Result of the GetDeliverySource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AWSLogs.GetDeliverySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetDeliverySource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDeliverySourceResult getDeliverySource(GetDeliverySourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeliverySource(request);
    }

    @SdkInternalApi
    final GetDeliverySourceResult executeGetDeliverySource(GetDeliverySourceRequest getDeliverySourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeliverySourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeliverySourceRequest> request = null;
        Response<GetDeliverySourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeliverySourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeliverySourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeliverySource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeliverySourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeliverySourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the log anomaly detector that you specify.
     * </p>
     * 
     * @param getLogAnomalyDetectorRequest
     * @return Result of the GetLogAnomalyDetector operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @sample AWSLogs.GetLogAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogAnomalyDetector" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLogAnomalyDetectorResult getLogAnomalyDetector(GetLogAnomalyDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeGetLogAnomalyDetector(request);
    }

    @SdkInternalApi
    final GetLogAnomalyDetectorResult executeGetLogAnomalyDetector(GetLogAnomalyDetectorRequest getLogAnomalyDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(getLogAnomalyDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLogAnomalyDetectorRequest> request = null;
        Response<GetLogAnomalyDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLogAnomalyDetectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLogAnomalyDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLogAnomalyDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLogAnomalyDetectorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetLogAnomalyDetectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists log events from the specified log stream. You can list all of the log events or filter using a time range.
     * </p>
     * <p>
     * By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log
     * events). You can get additional log events by specifying one of the tokens in a subsequent call. This operation
     * can return empty results while there are more log events available through the token.
     * </p>
     * <p>
     * If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and
     * view data from the linked source accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html"
     * >CloudWatch cross-account observability</a>.
     * </p>
     * <p>
     * You can specify the log group to search by using either <code>logGroupIdentifier</code> or
     * <code>logGroupName</code>. You must include one of these two parameters, but you can't include both.
     * </p>
     * 
     * @param getLogEventsRequest
     * @return Result of the GetLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.GetLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLogEventsResult getLogEvents(GetLogEventsRequest request) {
        request = beforeClientExecution(request);
        return executeGetLogEvents(request);
    }

    @SdkInternalApi
    final GetLogEventsResult executeGetLogEvents(GetLogEventsRequest getLogEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(getLogEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLogEventsRequest> request = null;
        Response<GetLogEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLogEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLogEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLogEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLogEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLogEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the fields that are included in log events in the specified log group. Includes the percentage
     * of log events that contain each field. The search is limited to a time period that you specify.
     * </p>
     * <p>
     * You can specify the log group to search by using either <code>logGroupIdentifier</code> or
     * <code>logGroupName</code>. You must specify one of these parameters, but you can't specify both.
     * </p>
     * <p>
     * In the results, fields that start with <code>@</code> are fields generated by CloudWatch Logs. For example,
     * <code>@timestamp</code> is the timestamp of each log event. For more information about the fields that are
     * generated by CloudWatch logs, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_AnalyzeLogData-discoverable-fields.html"
     * >Supported Logs and Discovered Fields</a>.
     * </p>
     * <p>
     * The response results are sorted by the frequency percentage, starting with the highest percentage.
     * </p>
     * <p>
     * If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account and
     * view data from the linked source accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html"
     * >CloudWatch cross-account observability</a>.
     * </p>
     * 
     * @param getLogGroupFieldsRequest
     * @return Result of the GetLogGroupFields operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.GetLogGroupFields
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogGroupFields" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLogGroupFieldsResult getLogGroupFields(GetLogGroupFieldsRequest request) {
        request = beforeClientExecution(request);
        return executeGetLogGroupFields(request);
    }

    @SdkInternalApi
    final GetLogGroupFieldsResult executeGetLogGroupFields(GetLogGroupFieldsRequest getLogGroupFieldsRequest) {

        ExecutionContext executionContext = createExecutionContext(getLogGroupFieldsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLogGroupFieldsRequest> request = null;
        Response<GetLogGroupFieldsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLogGroupFieldsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLogGroupFieldsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLogGroupFields");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLogGroupFieldsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLogGroupFieldsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all of the fields and values of a single log event. All fields are retrieved, even if the original
     * query that produced the <code>logRecordPointer</code> retrieved only a subset of fields. Fields are returned as
     * field name/field value pairs.
     * </p>
     * <p>
     * The full unparsed log event is returned within <code>@message</code>.
     * </p>
     * 
     * @param getLogRecordRequest
     * @return Result of the GetLogRecord operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.GetLogRecord
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogRecord" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLogRecordResult getLogRecord(GetLogRecordRequest request) {
        request = beforeClientExecution(request);
        return executeGetLogRecord(request);
    }

    @SdkInternalApi
    final GetLogRecordResult executeGetLogRecord(GetLogRecordRequest getLogRecordRequest) {

        ExecutionContext executionContext = createExecutionContext(getLogRecordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLogRecordRequest> request = null;
        Response<GetLogRecordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLogRecordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLogRecordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLogRecord");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLogRecordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLogRecordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the results from the specified query.
     * </p>
     * <p>
     * Only the fields requested in the query are returned, along with a <code>@ptr</code> field, which is the
     * identifier for the log record. You can use the value of <code>@ptr</code> in a <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetLogRecord.html"
     * >GetLogRecord</a> operation to get the full log record.
     * </p>
     * <p>
     * <code>GetQueryResults</code> does not start running a query. To run a query, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_StartQuery.html">StartQuery</a>.
     * For more information about how long results of previous queries are available, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/cloudwatch_limits_cwl.html">CloudWatch Logs
     * quotas</a>.
     * </p>
     * <p>
     * If the value of the <code>Status</code> field in the output is <code>Running</code>, this operation returns only
     * partial results. If you see a value of <code>Scheduled</code> or <code>Running</code> for the status, you can
     * retry the operation later to see the final results.
     * </p>
     * <p>
     * If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account to
     * start queries in linked source accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html"
     * >CloudWatch cross-account observability</a>.
     * </p>
     * 
     * @param getQueryResultsRequest
     * @return Result of the GetQueryResults operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetQueryResults" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetQueryResultsResult getQueryResults(GetQueryResultsRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueryResults(request);
    }

    @SdkInternalApi
    final GetQueryResultsResult executeGetQueryResults(GetQueryResultsRequest getQueryResultsRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueryResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueryResultsRequest> request = null;
        Response<GetQueryResultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueryResultsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQueryResultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueryResults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueryResultsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQueryResultsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of anomalies that log anomaly detectors have found. For details about the structure format of each
     * anomaly object that is returned, see the example in this section.
     * </p>
     * 
     * @param listAnomaliesRequest
     * @return Result of the ListAnomalies operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @sample AWSLogs.ListAnomalies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/ListAnomalies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAnomaliesResult listAnomalies(ListAnomaliesRequest request) {
        request = beforeClientExecution(request);
        return executeListAnomalies(request);
    }

    @SdkInternalApi
    final ListAnomaliesResult executeListAnomalies(ListAnomaliesRequest listAnomaliesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnomaliesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnomaliesRequest> request = null;
        Response<ListAnomaliesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnomaliesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAnomaliesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnomalies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnomaliesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAnomaliesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of the log anomaly detectors in the account.
     * </p>
     * 
     * @param listLogAnomalyDetectorsRequest
     * @return Result of the ListLogAnomalyDetectors operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @sample AWSLogs.ListLogAnomalyDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/ListLogAnomalyDetectors" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListLogAnomalyDetectorsResult listLogAnomalyDetectors(ListLogAnomalyDetectorsRequest request) {
        request = beforeClientExecution(request);
        return executeListLogAnomalyDetectors(request);
    }

    @SdkInternalApi
    final ListLogAnomalyDetectorsResult executeListLogAnomalyDetectors(ListLogAnomalyDetectorsRequest listLogAnomalyDetectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLogAnomalyDetectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLogAnomalyDetectorsRequest> request = null;
        Response<ListLogAnomalyDetectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLogAnomalyDetectorsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listLogAnomalyDetectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLogAnomalyDetectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLogAnomalyDetectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListLogAnomalyDetectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the tags associated with a CloudWatch Logs resource. Currently, log groups and destinations support
     * tagging.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <important>
     * <p>
     * The ListTagsLogGroup operation is on the path to deprecation. We recommend that you use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     * >ListTagsForResource</a> instead.
     * </p>
     * </important>
     * <p>
     * Lists the tags for the specified log group.
     * </p>
     * 
     * @param listTagsLogGroupRequest
     * @return Result of the ListTagsLogGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.ListTagsLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/ListTagsLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    @Deprecated
    public ListTagsLogGroupResult listTagsLogGroup(ListTagsLogGroupRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsLogGroup(request);
    }

    @SdkInternalApi
    final ListTagsLogGroupResult executeListTagsLogGroup(ListTagsLogGroupRequest listTagsLogGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsLogGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsLogGroupRequest> request = null;
        Response<ListTagsLogGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsLogGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsLogGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsLogGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsLogGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsLogGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an account-level data protection policy or subscription filter policy that applies to all log groups or a
     * subset of log groups in the account.
     * </p>
     * <p>
     * <b>Data protection policy</b>
     * </p>
     * <p>
     * A data protection policy can help safeguard sensitive data that's ingested by your log groups by auditing and
     * masking the sensitive log data. Each account can have only one account-level data protection policy.
     * </p>
     * <important>
     * <p>
     * Sensitive data is detected and masked when it is ingested into a log group. When you set a data protection
     * policy, log events ingested into the log groups before that time are not masked.
     * </p>
     * </important>
     * <p>
     * If you use <code>PutAccountPolicy</code> to create a data protection policy for your whole account, it applies to
     * both existing log groups and all log groups that are created later in this account. The account-level policy is
     * applied to existing log groups with eventual consistency. It might take up to 5 minutes before sensitive data in
     * existing log groups begins to be masked.
     * </p>
     * <p>
     * By default, when a user views a log event that includes masked data, the sensitive data is replaced by asterisks.
     * A user who has the <code>logs:Unmask</code> permission can use a <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetLogEvents.html"
     * >GetLogEvents</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_FilterLogEvents.html"
     * >FilterLogEvents</a> operation with the <code>unmask</code> parameter set to <code>true</code> to view the
     * unmasked log events. Users with the <code>logs:Unmask</code> can also view unmasked data in the CloudWatch Logs
     * console by running a CloudWatch Logs Insights query with the <code>unmask</code> query command.
     * </p>
     * <p>
     * For more information, including a list of types of data that can be audited and masked, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html">Protect sensitive
     * log data with masking</a>.
     * </p>
     * <p>
     * To use the <code>PutAccountPolicy</code> operation for a data protection policy, you must be signed on with the
     * <code>logs:PutDataProtectionPolicy</code> and <code>logs:PutAccountPolicy</code> permissions.
     * </p>
     * <p>
     * The <code>PutAccountPolicy</code> operation applies to all log groups in the account. You can use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDataProtectionPolicy.html"
     * >PutDataProtectionPolicy</a> to create a data protection policy that applies to just one log group. If a log
     * group has its own data protection policy and the account also has an account-level data protection policy, then
     * the two policies are cumulative. Any sensitive term specified in either policy is masked.
     * </p>
     * <p>
     * <b>Subscription filter policy</b>
     * </p>
     * <p>
     * A subscription filter policy sets up a real-time feed of log events from CloudWatch Logs to other Amazon Web
     * Services services. Account-level subscription filter policies apply to both existing log groups and log groups
     * that are created later in this account. Supported destinations are Kinesis Data Streams, Firehose, and Lambda.
     * When log events are sent to the receiving service, they are Base64 encoded and compressed with the GZIP format.
     * </p>
     * <p>
     * The following destinations are supported for subscription filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Kinesis Data Streams data stream in the same account as the subscription policy, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Firehose data stream in the same account as the subscription policy, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Lambda function in the same account as the subscription policy, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination in a different account created with <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDestination.html"
     * >PutDestination</a>, for cross-account delivery. Kinesis Data Streams and Firehose are supported as logical
     * destinations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each account can have one account-level subscription filter policy. If you are updating an existing filter, you
     * must specify the correct name in <code>PolicyName</code>. To perform a <code>PutAccountPolicy</code> subscription
     * filter operation for any destination except a Lambda function, you must also have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * 
     * @param putAccountPolicyRequest
     * @return Result of the PutAccountPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @sample AWSLogs.PutAccountPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutAccountPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutAccountPolicyResult putAccountPolicy(PutAccountPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutAccountPolicy(request);
    }

    @SdkInternalApi
    final PutAccountPolicyResult executePutAccountPolicy(PutAccountPolicyRequest putAccountPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putAccountPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAccountPolicyRequest> request = null;
        Response<PutAccountPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAccountPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putAccountPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAccountPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAccountPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutAccountPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a data protection policy for the specified log group. A data protection policy can help safeguard
     * sensitive data that's ingested by the log group by auditing and masking the sensitive log data.
     * </p>
     * <important>
     * <p>
     * Sensitive data is detected and masked when it is ingested into the log group. When you set a data protection
     * policy, log events ingested into the log group before that time are not masked.
     * </p>
     * </important>
     * <p>
     * By default, when a user views a log event that includes masked data, the sensitive data is replaced by asterisks.
     * A user who has the <code>logs:Unmask</code> permission can use a <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetLogEvents.html"
     * >GetLogEvents</a> or <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_FilterLogEvents.html"
     * >FilterLogEvents</a> operation with the <code>unmask</code> parameter set to <code>true</code> to view the
     * unmasked log events. Users with the <code>logs:Unmask</code> can also view unmasked data in the CloudWatch Logs
     * console by running a CloudWatch Logs Insights query with the <code>unmask</code> query command.
     * </p>
     * <p>
     * For more information, including a list of types of data that can be audited and masked, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html">Protect sensitive
     * log data with masking</a>.
     * </p>
     * <p>
     * The <code>PutDataProtectionPolicy</code> operation applies to only the specified log group. You can also use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutAccountPolicy.html">
     * PutAccountPolicy</a> to create an account-level data protection policy that applies to all log groups in the
     * account, including both existing log groups and log groups that are created level. If a log group has its own
     * data protection policy and the account also has an account-level data protection policy, then the two policies
     * are cumulative. Any sensitive term specified in either policy is masked.
     * </p>
     * 
     * @param putDataProtectionPolicyRequest
     * @return Result of the PutDataProtectionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutDataProtectionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDataProtectionPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutDataProtectionPolicyResult putDataProtectionPolicy(PutDataProtectionPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutDataProtectionPolicy(request);
    }

    @SdkInternalApi
    final PutDataProtectionPolicyResult executePutDataProtectionPolicy(PutDataProtectionPolicyRequest putDataProtectionPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putDataProtectionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDataProtectionPolicyRequest> request = null;
        Response<PutDataProtectionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDataProtectionPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putDataProtectionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDataProtectionPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDataProtectionPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutDataProtectionPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a logical <i>delivery destination</i>. A delivery destination is an Amazon Web Services
     * resource that represents an Amazon Web Services service that logs can be sent to. CloudWatch Logs, Amazon S3, and
     * Firehose are supported as logs delivery destinations.
     * </p>
     * <p>
     * To configure logs delivery between a supported Amazon Web Services service and a destination, you must do the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create a delivery source, which is a logical object that represents the resource that is actually sending the
     * logs. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliverySource.html"
     * >PutDeliverySource</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>PutDeliveryDestination</code> to create a <i>delivery destination</i>, which is a logical object that
     * represents the actual delivery destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are delivering logs cross-account, you must use <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html"
     * >PutDeliveryDestinationPolicy</a> in the destination account to assign an IAM policy to the destination. This
     * policy allows delivery to that destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>CreateDelivery</code> to create a <i>delivery</i> by pairing exactly one delivery source and one
     * delivery destination. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateDelivery.html"
     * >CreateDelivery</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can configure a single delivery source to send logs to multiple destinations by creating multiple deliveries.
     * You can also create multiple deliveries to configure multiple delivery sources to send logs to the same delivery
     * destination.
     * </p>
     * <p>
     * Only some Amazon Web Services services support being configured as a delivery source. These services are listed
     * as <b>Supported [V2 Permissions]</b> in the table at <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html">Enabling
     * logging from Amazon Web Services services.</a>
     * </p>
     * <p>
     * If you use this operation to update an existing delivery destination, all the current delivery destination
     * parameters are overwritten with the new parameter values that you specify.
     * </p>
     * 
     * @param putDeliveryDestinationRequest
     * @return Result of the PutDeliveryDestination operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSLogs.PutDeliveryDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDeliveryDestination" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutDeliveryDestinationResult putDeliveryDestination(PutDeliveryDestinationRequest request) {
        request = beforeClientExecution(request);
        return executePutDeliveryDestination(request);
    }

    @SdkInternalApi
    final PutDeliveryDestinationResult executePutDeliveryDestination(PutDeliveryDestinationRequest putDeliveryDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(putDeliveryDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDeliveryDestinationRequest> request = null;
        Response<PutDeliveryDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDeliveryDestinationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putDeliveryDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDeliveryDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDeliveryDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutDeliveryDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates and assigns an IAM policy that grants permissions to CloudWatch Logs to deliver logs cross-account to a
     * specified destination in this account. To configure the delivery of logs from an Amazon Web Services service in
     * another account to a logs delivery destination in the current account, you must do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create a delivery source, which is a logical object that represents the resource that is actually sending the
     * logs. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliverySource.html"
     * >PutDeliverySource</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a <i>delivery destination</i>, which is a logical object that represents the actual delivery destination.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestination.html"
     * >PutDeliveryDestination</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use this operation in the destination account to assign an IAM policy to the destination. This policy allows
     * delivery to that destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a <i>delivery</i> by pairing exactly one delivery source and one delivery destination. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateDelivery.html"
     * >CreateDelivery</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only some Amazon Web Services services support being configured as a delivery source. These services are listed
     * as <b>Supported [V2 Permissions]</b> in the table at <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html">Enabling
     * logging from Amazon Web Services services.</a>
     * </p>
     * <p>
     * The contents of the policy must include two statements. One statement enables general logs delivery, and the
     * other allows delivery to the chosen destination. See the examples for the needed policies.
     * </p>
     * 
     * @param putDeliveryDestinationPolicyRequest
     * @return Result of the PutDeliveryDestinationPolicy operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @sample AWSLogs.PutDeliveryDestinationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDeliveryDestinationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutDeliveryDestinationPolicyResult putDeliveryDestinationPolicy(PutDeliveryDestinationPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutDeliveryDestinationPolicy(request);
    }

    @SdkInternalApi
    final PutDeliveryDestinationPolicyResult executePutDeliveryDestinationPolicy(PutDeliveryDestinationPolicyRequest putDeliveryDestinationPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putDeliveryDestinationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDeliveryDestinationPolicyRequest> request = null;
        Response<PutDeliveryDestinationPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDeliveryDestinationPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putDeliveryDestinationPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDeliveryDestinationPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDeliveryDestinationPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutDeliveryDestinationPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a logical <i>delivery source</i>. A delivery source represents an Amazon Web Services resource
     * that sends logs to an logs delivery destination. The destination can be CloudWatch Logs, Amazon S3, or Firehose.
     * </p>
     * <p>
     * To configure logs delivery between a delivery destination and an Amazon Web Services service that is supported as
     * a delivery source, you must do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>PutDeliverySource</code> to create a delivery source, which is a logical object that represents the
     * resource that is actually sending the logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>PutDeliveryDestination</code> to create a <i>delivery destination</i>, which is a logical object that
     * represents the actual delivery destination. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestination.html"
     * >PutDeliveryDestination</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are delivering logs cross-account, you must use <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html"
     * >PutDeliveryDestinationPolicy</a> in the destination account to assign an IAM policy to the destination. This
     * policy allows delivery to that destination.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>CreateDelivery</code> to create a <i>delivery</i> by pairing exactly one delivery source and one
     * delivery destination. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateDelivery.html"
     * >CreateDelivery</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can configure a single delivery source to send logs to multiple destinations by creating multiple deliveries.
     * You can also create multiple deliveries to configure multiple delivery sources to send logs to the same delivery
     * destination.
     * </p>
     * <p>
     * Only some Amazon Web Services services support being configured as a delivery source. These services are listed
     * as <b>Supported [V2 Permissions]</b> in the table at <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html">Enabling
     * logging from Amazon Web Services services.</a>
     * </p>
     * <p>
     * If you use this operation to update an existing delivery source, all the current delivery source parameters are
     * overwritten with the new parameter values that you specify.
     * </p>
     * 
     * @param putDeliverySourceRequest
     * @return Result of the PutDeliverySource operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The request was throttled because of quota limits.
     * @sample AWSLogs.PutDeliverySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDeliverySource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutDeliverySourceResult putDeliverySource(PutDeliverySourceRequest request) {
        request = beforeClientExecution(request);
        return executePutDeliverySource(request);
    }

    @SdkInternalApi
    final PutDeliverySourceResult executePutDeliverySource(PutDeliverySourceRequest putDeliverySourceRequest) {

        ExecutionContext executionContext = createExecutionContext(putDeliverySourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDeliverySourceRequest> request = null;
        Response<PutDeliverySourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDeliverySourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putDeliverySourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDeliverySource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDeliverySourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutDeliverySourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a destination. This operation is used only to create destinations for cross-account
     * subscriptions.
     * </p>
     * <p>
     * A destination encapsulates a physical resource (such as an Amazon Kinesis stream). With a destination, you can
     * subscribe to a real-time stream of log events for a different account, ingested using <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutLogEvents.html"
     * >PutLogEvents</a>.
     * </p>
     * <p>
     * Through an access policy, a destination controls what is written to it. By default, <code>PutDestination</code>
     * does not set any access policy with the destination, which means a cross-account user cannot call <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutSubscriptionFilter.html"
     * >PutSubscriptionFilter</a> against this destination. To enable this, the destination owner must call <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDestinationPolicy.html"
     * >PutDestinationPolicy</a> after <code>PutDestination</code>.
     * </p>
     * <p>
     * To perform a <code>PutDestination</code> operation, you must also have the <code>iam:PassRole</code> permission.
     * </p>
     * 
     * @param putDestinationRequest
     * @return Result of the PutDestination operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDestination" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutDestinationResult putDestination(PutDestinationRequest request) {
        request = beforeClientExecution(request);
        return executePutDestination(request);
    }

    @SdkInternalApi
    final PutDestinationResult executePutDestination(PutDestinationRequest putDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(putDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDestinationRequest> request = null;
        Response<PutDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDestinationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates an access policy associated with an existing destination. An access policy is an <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html">IAM policy document</a> that is
     * used to authorize claims to register a subscription filter against a given destination.
     * </p>
     * 
     * @param putDestinationPolicyRequest
     * @return Result of the PutDestinationPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutDestinationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDestinationPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutDestinationPolicyResult putDestinationPolicy(PutDestinationPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutDestinationPolicy(request);
    }

    @SdkInternalApi
    final PutDestinationPolicyResult executePutDestinationPolicy(PutDestinationPolicyRequest putDestinationPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putDestinationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDestinationPolicyRequest> request = null;
        Response<PutDestinationPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDestinationPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putDestinationPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDestinationPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDestinationPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutDestinationPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uploads a batch of log events to the specified log stream.
     * </p>
     * <important>
     * <p>
     * The sequence token is now ignored in <code>PutLogEvents</code> actions. <code>PutLogEvents</code> actions are
     * always accepted and never return <code>InvalidSequenceTokenException</code> or
     * <code>DataAlreadyAcceptedException</code> even if the sequence token is not valid. You can use parallel
     * <code>PutLogEvents</code> actions on the same log stream.
     * </p>
     * </important>
     * <p>
     * The batch of events must satisfy the following constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The maximum batch size is 1,048,576 bytes. This size is calculated as the sum of all event messages in UTF-8,
     * plus 26 bytes for each log event.
     * </p>
     * </li>
     * <li>
     * <p>
     * None of the log events in the batch can be more than 2 hours in the future.
     * </p>
     * </li>
     * <li>
     * <p>
     * None of the log events in the batch can be more than 14 days in the past. Also, none of the log events can be
     * from earlier than the retention period of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The log events in the batch must be in chronological order by their timestamp. The timestamp is the time that the
     * event occurred, expressed as the number of milliseconds after <code>Jan 1, 1970 00:00:00 UTC</code>. (In Amazon
     * Web Services Tools for PowerShell and the Amazon Web Services SDK for .NET, the timestamp is specified in .NET
     * format: <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2017-09-15T13:45:30</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * A batch of log events in a single request cannot span more than 24 hours. Otherwise, the operation fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each log event can be no larger than 256 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum number of log events in a batch is 10,000.
     * </p>
     * </li>
     * <li><important>
     * <p>
     * The quota of five requests per second per log stream has been removed. Instead, <code>PutLogEvents</code> actions
     * are throttled based on a per-second per-account quota. You can request an increase to the per-second throttling
     * quota by using the Service Quotas service.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * If a call to <code>PutLogEvents</code> returns "UnrecognizedClientException" the most likely cause is a non-valid
     * Amazon Web Services access key ID or secret key.
     * </p>
     * 
     * @param putLogEventsRequest
     * @return Result of the PutLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws InvalidSequenceTokenException
     *         The sequence token is not valid. You can get the correct sequence token in the
     *         <code>expectedSequenceToken</code> field in the <code>InvalidSequenceTokenException</code> message. </p>
     *         <important>
     *         <p>
     *         <code>PutLogEvents</code> actions are now always accepted and never return
     *         <code>InvalidSequenceTokenException</code> regardless of receiving an invalid sequence token.
     *         </p>
     * @throws DataAlreadyAcceptedException
     *         The event was already logged.</p> <important>
     *         <p>
     *         <code>PutLogEvents</code> actions are now always accepted and never return
     *         <code>DataAlreadyAcceptedException</code> regardless of whether a given batch of log events has already
     *         been accepted.
     *         </p>
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws UnrecognizedClientException
     *         The most likely cause is an Amazon Web Services access key ID or secret key that's not valid.
     * @sample AWSLogs.PutLogEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutLogEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutLogEventsResult putLogEvents(PutLogEventsRequest request) {
        request = beforeClientExecution(request);
        return executePutLogEvents(request);
    }

    @SdkInternalApi
    final PutLogEventsResult executePutLogEvents(PutLogEventsRequest putLogEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(putLogEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLogEventsRequest> request = null;
        Response<PutLogEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLogEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putLogEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutLogEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutLogEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutLogEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a metric filter and associates it with the specified log group. With metric filters, you can
     * configure rules to extract metric data from log events ingested through <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutLogEvents.html"
     * >PutLogEvents</a>.
     * </p>
     * <p>
     * The maximum number of metric filters that can be associated with a log group is 100.
     * </p>
     * <p>
     * When you create a metric filter, you can also optionally assign a unit and dimensions to the metric that is
     * created.
     * </p>
     * <important>
     * <p>
     * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high charges, do not
     * specify high-cardinality fields such as <code>IPAddress</code> or <code>requestID</code> as dimensions. Each
     * different value found for a dimension is treated as a separate metric and accrues charges as a separate custom
     * metric.
     * </p>
     * <p>
     * CloudWatch Logs might disable a metric filter if it generates 1,000 different name/value pairs for your specified
     * dimensions within one hour.
     * </p>
     * <p>
     * You can also set up a billing alarm to alert you if your charges are higher than expected. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html">
     * Creating a Billing Alarm to Monitor Your Estimated Amazon Web Services Charges</a>.
     * </p>
     * </important>
     * 
     * @param putMetricFilterRequest
     * @return Result of the PutMetricFilter operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutMetricFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutMetricFilter" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutMetricFilterResult putMetricFilter(PutMetricFilterRequest request) {
        request = beforeClientExecution(request);
        return executePutMetricFilter(request);
    }

    @SdkInternalApi
    final PutMetricFilterResult executePutMetricFilter(PutMetricFilterRequest putMetricFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(putMetricFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMetricFilterRequest> request = null;
        Response<PutMetricFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMetricFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putMetricFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutMetricFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutMetricFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutMetricFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a query definition for CloudWatch Logs Insights. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AnalyzingLogData.html">Analyzing Log Data with
     * CloudWatch Logs Insights</a>.
     * </p>
     * <p>
     * To update a query definition, specify its <code>queryDefinitionId</code> in your request. The values of
     * <code>name</code>, <code>queryString</code>, and <code>logGroupNames</code> are changed to the values that you
     * specify in your update operation. No current values are retained from the current query definition. For example,
     * imagine updating a current query definition that includes log groups. If you don't specify the
     * <code>logGroupNames</code> parameter in your update operation, the query definition changes to contain no log
     * groups.
     * </p>
     * <p>
     * You must have the <code>logs:PutQueryDefinition</code> permission to be able to perform this operation.
     * </p>
     * 
     * @param putQueryDefinitionRequest
     * @return Result of the PutQueryDefinition operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutQueryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutQueryDefinition" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutQueryDefinitionResult putQueryDefinition(PutQueryDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executePutQueryDefinition(request);
    }

    @SdkInternalApi
    final PutQueryDefinitionResult executePutQueryDefinition(PutQueryDefinitionRequest putQueryDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(putQueryDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutQueryDefinitionRequest> request = null;
        Response<PutQueryDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutQueryDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putQueryDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutQueryDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutQueryDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutQueryDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a resource policy allowing other Amazon Web Services services to put log events to this
     * account, such as Amazon Route 53. An account can have up to 10 resource policies per Amazon Web Services Region.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutResourcePolicy(request);
    }

    @SdkInternalApi
    final PutResourcePolicyResult executePutResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourcePolicyRequest> request = null;
        Response<PutResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the retention of the specified log group. With a retention policy, you can configure the number of days for
     * which to retain log events in the specified log group.
     * </p>
     * <note>
     * <p>
     * CloudWatch Logs doesn’t immediately delete log events when they reach their retention setting. It typically takes
     * up to 72 hours after that before log events are deleted, but in rare situations might take longer.
     * </p>
     * <p>
     * To illustrate, imagine that you change a log group to have a longer retention setting when it contains log events
     * that are past the expiration date, but haven’t been deleted. Those log events will take up to 72 hours to be
     * deleted after the new retention date is reached. To make sure that log data is deleted permanently, keep a log
     * group at its lower retention setting until 72 hours after the previous retention period ends. Alternatively, wait
     * to change the retention setting until you confirm that the earlier log events are deleted.
     * </p>
     * <p>
     * When log events reach their retention setting they are marked for deletion. After they are marked for deletion,
     * they do not add to your archival storage costs anymore, even if they are not actually deleted until later. These
     * log events marked for deletion are also not included when you use an API to retrieve the <code>storedBytes</code>
     * value to see how many bytes a log group is storing.
     * </p>
     * </note>
     * 
     * @param putRetentionPolicyRequest
     * @return Result of the PutRetentionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutRetentionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutRetentionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutRetentionPolicyResult putRetentionPolicy(PutRetentionPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutRetentionPolicy(request);
    }

    @SdkInternalApi
    final PutRetentionPolicyResult executePutRetentionPolicy(PutRetentionPolicyRequest putRetentionPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putRetentionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRetentionPolicyRequest> request = null;
        Response<PutRetentionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRetentionPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRetentionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRetentionPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRetentionPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutRetentionPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a subscription filter and associates it with the specified log group. With subscription
     * filters, you can subscribe to a real-time stream of log events ingested through <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutLogEvents.html"
     * >PutLogEvents</a> and have them delivered to a specific destination. When log events are sent to the receiving
     * service, they are Base64 encoded and compressed with the GZIP format.
     * </p>
     * <p>
     * The following destinations are supported for subscription filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis data stream belonging to the same account as the subscription filter, for same-account
     * delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination created with <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDestination.html"
     * >PutDestination</a> that belongs to a different account, for cross-account delivery. We currently support Kinesis
     * Data Streams and Firehose as logical destinations.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Data Firehose delivery stream that belongs to the same account as the subscription filter, for
     * same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Lambda function that belongs to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each log group can have up to two subscription filters associated with it. If you are updating an existing
     * filter, you must specify the correct name in <code>filterName</code>.
     * </p>
     * <p>
     * To perform a <code>PutSubscriptionFilter</code> operation for any destination except a Lambda function, you must
     * also have the <code>iam:PassRole</code> permission.
     * </p>
     * 
     * @param putSubscriptionFilterRequest
     * @return Result of the PutSubscriptionFilter operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.PutSubscriptionFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutSubscriptionFilter" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutSubscriptionFilterResult putSubscriptionFilter(PutSubscriptionFilterRequest request) {
        request = beforeClientExecution(request);
        return executePutSubscriptionFilter(request);
    }

    @SdkInternalApi
    final PutSubscriptionFilterResult executePutSubscriptionFilter(PutSubscriptionFilterRequest putSubscriptionFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(putSubscriptionFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSubscriptionFilterRequest> request = null;
        Response<PutSubscriptionFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSubscriptionFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putSubscriptionFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSubscriptionFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSubscriptionFilterResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutSubscriptionFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Schedules a query of a log group using CloudWatch Logs Insights. You specify the log group and time range to
     * query and the query string to use.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs Insights
     * Query Syntax</a>.
     * </p>
     * <p>
     * After you run a query using <code>StartQuery</code>, the query results are stored by CloudWatch Logs. You can use
     * <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_GetQueryResults.html">
     * GetQueryResults</a> to retrieve the results of a query, using the <code>queryId</code> that
     * <code>StartQuery</code> returns.
     * </p>
     * <p>
     * If you have associated a KMS key with the query results in this account, then <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_StartQuery.html">StartQuery</a>
     * uses that key to encrypt the results when it stores them. If no key is associated with query results, the query
     * results are encrypted with the default CloudWatch Logs encryption method.
     * </p>
     * <p>
     * Queries time out after 60 minutes of runtime. If your queries are timing out, reduce the time range being
     * searched or partition your query into a number of queries.
     * </p>
     * <p>
     * If you are using CloudWatch cross-account observability, you can use this operation in a monitoring account to
     * start a query in a linked source account. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Unified-Cross-Account.html"
     * >CloudWatch cross-account observability</a>. For a cross-account <code>StartQuery</code> operation, the query
     * definition must be defined in the monitoring account.
     * </p>
     * <p>
     * You can have up to 30 concurrent CloudWatch Logs insights queries, including queries that have been added to
     * dashboards.
     * </p>
     * 
     * @param startQueryRequest
     * @return Result of the StartQuery operation returned by the service.
     * @throws MalformedQueryException
     *         The query string is not valid. Details about this error are displayed in a <code>QueryCompileError</code>
     *         object. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_QueryCompileError.html"
     *         >QueryCompileError</a>.</p>
     *         <p>
     *         For more information about valid query syntax, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs
     *         Insights Query Syntax</a>.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.StartQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/StartQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartQueryResult startQuery(StartQueryRequest request) {
        request = beforeClientExecution(request);
        return executeStartQuery(request);
    }

    @SdkInternalApi
    final StartQueryResult executeStartQuery(StartQueryRequest startQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(startQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartQueryRequest> request = null;
        Response<StartQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartQueryResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a CloudWatch Logs Insights query that is in progress. If the query has already ended, the operation returns
     * an error indicating that the specified query is not running.
     * </p>
     * 
     * @param stopQueryRequest
     * @return Result of the StopQuery operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.StopQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/StopQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopQueryResult stopQuery(StopQueryRequest request) {
        request = beforeClientExecution(request);
        return executeStopQuery(request);
    }

    @SdkInternalApi
    final StopQueryResult executeStopQuery(StopQueryRequest stopQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(stopQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopQueryRequest> request = null;
        Response<StopQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopQueryResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <important>
     * <p>
     * The TagLogGroup operation is on the path to deprecation. We recommend that you use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html">TagResource</a>
     * instead.
     * </p>
     * </important>
     * <p>
     * Adds or updates the specified tags for the specified log group.
     * </p>
     * <p>
     * To list the tags for a log group, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     * >ListTagsForResource</a>. To remove tags, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html"
     * >UntagResource</a>.
     * </p>
     * <p>
     * For more information about tags, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html#log-group-tagging"
     * >Tag Log Groups in Amazon CloudWatch Logs</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
     * </p>
     * <p>
     * CloudWatch Logs doesn’t support IAM policies that prevent users from assigning specified tags to log groups using
     * the <code>aws:Resource/<i>key-name</i> </code> or <code>aws:TagKeys</code> condition keys. For more information
     * about using tags to control access, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Controlling access to Amazon Web
     * Services resources using tags</a>.
     * </p>
     * 
     * @param tagLogGroupRequest
     * @return Result of the TagLogGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @sample AWSLogs.TagLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/TagLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    @Deprecated
    public TagLogGroupResult tagLogGroup(TagLogGroupRequest request) {
        request = beforeClientExecution(request);
        return executeTagLogGroup(request);
    }

    @SdkInternalApi
    final TagLogGroupResult executeTagLogGroup(TagLogGroupRequest tagLogGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(tagLogGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagLogGroupRequest> request = null;
        Response<TagLogGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagLogGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagLogGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagLogGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagLogGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagLogGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified CloudWatch Logs resource. Currently, the only
     * CloudWatch Logs resources that can be tagged are log groups and destinations.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the alarm, this tag is appended to the list of tags associated with the alarm. If you specify a tag key
     * that is already associated with the alarm, the new tag value that you specify replaces the previous value for
     * that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a CloudWatch Logs resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws TooManyTagsException
     *         A resource can have no more than 50 tags.
     * @sample AWSLogs.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to
     * validate the correctness of a metric filter pattern.
     * </p>
     * 
     * @param testMetricFilterRequest
     * @return Result of the TestMetricFilter operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.TestMetricFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/TestMetricFilter" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TestMetricFilterResult testMetricFilter(TestMetricFilterRequest request) {
        request = beforeClientExecution(request);
        return executeTestMetricFilter(request);
    }

    @SdkInternalApi
    final TestMetricFilterResult executeTestMetricFilter(TestMetricFilterRequest testMetricFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(testMetricFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestMetricFilterRequest> request = null;
        Response<TestMetricFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestMetricFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testMetricFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestMetricFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestMetricFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestMetricFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <important>
     * <p>
     * The UntagLogGroup operation is on the path to deprecation. We recommend that you use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UntagResource.html"
     * >UntagResource</a> instead.
     * </p>
     * </important>
     * <p>
     * Removes the specified tags from the specified log group.
     * </p>
     * <p>
     * To list the tags for a log group, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListTagsForResource.html"
     * >ListTagsForResource</a>. To add tags, use <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * <p>
     * CloudWatch Logs doesn’t support IAM policies that prevent users from assigning specified tags to log groups using
     * the <code>aws:Resource/<i>key-name</i> </code> or <code>aws:TagKeys</code> condition keys.
     * </p>
     * 
     * @param untagLogGroupRequest
     * @return Result of the UntagLogGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSLogs.UntagLogGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/UntagLogGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    @Deprecated
    public UntagLogGroupResult untagLogGroup(UntagLogGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUntagLogGroup(request);
    }

    @SdkInternalApi
    final UntagLogGroupResult executeUntagLogGroup(UntagLogGroupRequest untagLogGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(untagLogGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagLogGroupRequest> request = null;
        Response<UntagLogGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagLogGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagLogGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagLogGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagLogGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagLogGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @sample AWSLogs.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Use this operation to <i>suppress</i> anomaly detection for a specified anomaly or pattern. If you suppress an
     * anomaly, CloudWatch Logs won’t report new occurrences of that anomaly and won't update that anomaly with new
     * data. If you suppress a pattern, CloudWatch Logs won’t report any anomalies related to that pattern.
     * </p>
     * <p>
     * You must specify either <code>anomalyId</code> or <code>patternId</code>, but you can't specify both parameters
     * in the same operation.
     * </p>
     * <p>
     * If you have previously used this operation to suppress detection of a pattern or anomaly, you can use it again to
     * cause CloudWatch Logs to end the suppression. To do this, use this operation and specify the anomaly or pattern
     * to stop suppressing, and omit the <code>suppressionType</code> and <code>suppressionPeriod</code> parameters.
     * </p>
     * 
     * @param updateAnomalyRequest
     * @return Result of the UpdateAnomaly operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @sample AWSLogs.UpdateAnomaly
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/UpdateAnomaly" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAnomalyResult updateAnomaly(UpdateAnomalyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAnomaly(request);
    }

    @SdkInternalApi
    final UpdateAnomalyResult executeUpdateAnomaly(UpdateAnomalyRequest updateAnomalyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAnomalyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAnomalyRequest> request = null;
        Response<UpdateAnomalyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAnomalyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAnomalyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAnomaly");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAnomalyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAnomalyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing log anomaly detector.
     * </p>
     * 
     * @param updateLogAnomalyDetectorRequest
     * @return Result of the UpdateLogAnomalyDetector operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws OperationAbortedException
     *         Multiple concurrent requests to update the same resource were in conflict.
     * @sample AWSLogs.UpdateLogAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/UpdateLogAnomalyDetector" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateLogAnomalyDetectorResult updateLogAnomalyDetector(UpdateLogAnomalyDetectorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLogAnomalyDetector(request);
    }

    @SdkInternalApi
    final UpdateLogAnomalyDetectorResult executeUpdateLogAnomalyDetector(UpdateLogAnomalyDetectorRequest updateLogAnomalyDetectorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLogAnomalyDetectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLogAnomalyDetectorRequest> request = null;
        Response<UpdateLogAnomalyDetectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLogAnomalyDetectorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLogAnomalyDetectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudWatch Logs");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLogAnomalyDetector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLogAnomalyDetectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateLogAnomalyDetectorResultJsonUnmarshaller());
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
    public void shutdown() {
        super.shutdown();
    }

}
