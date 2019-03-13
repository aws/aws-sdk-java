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
 * You can use Amazon CloudWatch Logs to monitor, store, and access your log files from Amazon EC2 instances, AWS
 * CloudTrail, or other sources. You can then retrieve the associated log data from CloudWatch Logs using the CloudWatch
 * console, CloudWatch Logs commands in the AWS CLI, CloudWatch Logs API, or CloudWatch Logs SDK.
 * </p>
 * <p>
 * You can use CloudWatch Logs to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Monitor logs from EC2 instances in real-time</b>: You can use CloudWatch Logs to monitor applications and systems
 * using log data. For example, CloudWatch Logs can track the number of errors that occur in your application logs and
 * send you a notification whenever the rate of errors exceeds a threshold that you specify. CloudWatch Logs uses your
 * log data for monitoring; so, no code changes are required. For example, you can monitor application logs for specific
 * literal terms (such as "NullReferenceException") or count the number of occurrences of a literal term at a particular
 * position in log data (such as "404" status codes in an Apache access log). When the term you are searching for is
 * found, CloudWatch Logs reports the data to a CloudWatch metric that you specify.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Monitor AWS CloudTrail logged events</b>: You can create alarms in CloudWatch and receive notifications of
 * particular API activity as captured by CloudTrail and use the notification to perform troubleshooting.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Archive log data</b>: You can use CloudWatch Logs to store your log data in highly durable storage. You can change
 * the log retention setting so that any log events older than this setting are automatically deleted. The CloudWatch
 * Logs agent makes it easy to quickly send both rotated and non-rotated log data off of a host and into the log
 * service. You can then access the raw log data when you need it.
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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.logs.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOperationException").withModeledClass(
                                    com.amazonaws.services.logs.model.InvalidOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationAbortedException").withModeledClass(
                                    com.amazonaws.services.logs.model.OperationAbortedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.logs.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnrecognizedClientException").withModeledClass(
                                    com.amazonaws.services.logs.model.UnrecognizedClientException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedQueryException").withModeledClass(
                                    com.amazonaws.services.logs.model.MalformedQueryException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.logs.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DataAlreadyAcceptedException").withModeledClass(
                                    com.amazonaws.services.logs.model.DataAlreadyAcceptedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSequenceTokenException").withModeledClass(
                                    com.amazonaws.services.logs.model.InvalidSequenceTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.logs.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.logs.model.ResourceAlreadyExistsException.class))
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
     * Associates the specified AWS Key Management Service (AWS KMS) customer master key (CMK) with the specified log
     * group.
     * </p>
     * <p>
     * Associating an AWS KMS CMK with a log group overrides any existing associations between the log group and a CMK.
     * After a CMK is associated with a log group, all newly ingested data for the log group is encrypted using the CMK.
     * This association is stored as long as the data encrypted with the CMK is still within Amazon CloudWatch Logs.
     * This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested.
     * </p>
     * <p>
     * Note that it can take up to 5 minutes for this operation to take effect.
     * </p>
     * <p>
     * If you attempt to associate a CMK with a log group but the CMK does not exist or the CMK is disabled, you will
     * receive an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param associateKmsKeyRequest
     * @return Result of the AssociateKmsKey operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
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
     * Creates an export task, which allows you to efficiently export data from a log group to an Amazon S3 bucket.
     * </p>
     * <p>
     * This is an asynchronous call. If all the required information is provided, this operation initiates an export
     * task and responds with the ID of the task. After the task has started, you can use <a>DescribeExportTasks</a> to
     * get the status of the export task. Each account can only have one active (<code>RUNNING</code> or
     * <code>PENDING</code>) export task at a time. To cancel an export task, use <a>CancelExportTask</a>.
     * </p>
     * <p>
     * You can export logs from multiple log groups or multiple time ranges to the same S3 bucket. To separate out log
     * data for each export task, you can specify a prefix to be used as the Amazon S3 key prefix for all exported
     * objects.
     * </p>
     * 
     * @param createExportTaskRequest
     * @return Result of the CreateExportTask operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws LimitExceededException
     *         You have reached the maximum number of resources that can be created.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
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
     * Creates a log group with the specified name.
     * </p>
     * <p>
     * You can create up to 5000 log groups per account.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Log group names must be unique within a region for an AWS account.
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
     * slash), and '.' (period).
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you associate a AWS Key Management Service (AWS KMS) customer master key (CMK) with the log group, ingested
     * data is encrypted using the CMK. This association is stored as long as the data encrypted with the CMK is still
     * within Amazon CloudWatch Logs. This enables Amazon CloudWatch Logs to decrypt this data whenever it is requested.
     * </p>
     * <p>
     * If you attempt to associate a CMK with the log group but the CMK does not exist or the CMK is disabled, you will
     * receive an <code>InvalidParameterException</code> error.
     * </p>
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
     *         Multiple requests to update the same resource were in conflict.
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
     * Creates a log stream for the specified log group.
     * </p>
     * <p>
     * There is no limit on the number of log streams that you can create for a log group.
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
     * The ':' (colon) and '*' (asterisk) characters are not allowed.
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
     *         Multiple requests to update the same resource were in conflict.
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
     *         Multiple requests to update the same resource were in conflict.
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
     *         Multiple requests to update the same resource were in conflict.
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
     *         Multiple requests to update the same resource were in conflict.
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
     *         Multiple requests to update the same resource were in conflict.
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
     *         Multiple requests to update the same resource were in conflict.
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
     * This operation has a limit of five transactions per second, after which transactions are throttled.
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
     * Lists the specified metric filters. You can list all the metric filters or filter the results by log name,
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
     * Returns a list of CloudWatch Logs Insights queries that are scheduled, executing, or have been executed recently
     * in this account. You can request all queries, or limit it to queries of a specific log group or queries with a
     * certain status.
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
     * Disassociates the associated AWS Key Management Service (AWS KMS) customer master key (CMK) from the specified
     * log group.
     * </p>
     * <p>
     * After the AWS KMS CMK is disassociated from the log group, AWS CloudWatch Logs stops encrypting newly ingested
     * data for the log group. All previously ingested data remains encrypted, and AWS CloudWatch Logs requires
     * permissions for the CMK whenever the encrypted data is requested.
     * </p>
     * <p>
     * Note that it can take up to 5 minutes for this operation to take effect.
     * </p>
     * 
     * @param disassociateKmsKeyRequest
     * @return Result of the DisassociateKmsKey operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
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
     * By default, this operation returns as many log events as can fit in 1 MB (up to 10,000 log events), or all the
     * events found within the time range that you specify. If the results include a token, then there are more log
     * events available, and you can get additional results by specifying the token in a subsequent call.
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
     * Lists log events from the specified log stream. You can list all the log events or filter using a time range.
     * </p>
     * <p>
     * By default, this operation returns as many log events as can fit in a response size of 1MB (up to 10,000 log
     * events). You can get additional log events by specifying one of the tokens in a subsequent call.
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
     * Returns a list of the fields that are included in log events in the specified log group, along with the
     * percentage of log events that contain each field. The search is limited to a time period that you specify.
     * </p>
     * <p>
     * In the results, fields that start with @ are fields generated by CloudWatch Logs. For example,
     * <code>@timestamp</code> is the timestamp of each log event.
     * </p>
     * <p>
     * The response results are sorted by the frequency percentage, starting with the highest percentage.
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
     * Retrieves all the fields and values of a single log event. All fields are retrieved, even if the original query
     * that produced the <code>logRecordPointer</code> retrieved only a subset of fields. Fields are returned as field
     * name/field value pairs.
     * </p>
     * <p>
     * Additionally, the entire unparsed log event is returned within <code>@message</code>.
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
     * Returns the results from the specified query. If the query is in progress, partial results of that current
     * execution are returned. Only the fields requested in the query are returned.
     * </p>
     * <p>
     * <code>GetQueryResults</code> does not start a query execution. To run a query, use .
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
     * Creates or updates a destination. A destination encapsulates a physical resource (such as an Amazon Kinesis
     * stream) and enables you to subscribe to a real-time stream of log events for a different account, ingested using
     * <a>PutLogEvents</a>. Currently, the only supported physical resource is a Kinesis stream belonging to the same
     * account as the destination.
     * </p>
     * <p>
     * Through an access policy, a destination controls what is written to its Kinesis stream. By default,
     * <code>PutDestination</code> does not set any access policy with the destination, which means a cross-account user
     * cannot call <a>PutSubscriptionFilter</a> against this destination. To enable this, the destination owner must
     * call <a>PutDestinationPolicy</a> after <code>PutDestination</code>.
     * </p>
     * 
     * @param putDestinationRequest
     * @return Result of the PutDestination operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
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
     *         Multiple requests to update the same resource were in conflict.
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
     * <p>
     * You must include the sequence token obtained from the response of the previous call. An upload in a newly created
     * log stream does not require a sequence token. You can also get the sequence token using
     * <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code> twice within a narrow time period using the same
     * value for <code>sequenceToken</code>, both calls may be successful, or one may be rejected.
     * </p>
     * <p>
     * The batch of events must satisfy the following constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The maximum batch size is 1,048,576 bytes, and this size is calculated as the sum of all event messages in UTF-8,
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
     * None of the log events in the batch can be older than 14 days or the retention period of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The log events in the batch must be in chronological ordered by their timestamp. The timestamp is the time the
     * event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. (In AWS Tools for
     * PowerShell and the AWS SDK for .NET, the timestamp is specified in .NET format: yyyy-mm-ddThh:mm:ss. For example,
     * 2017-09-15T13:45:30.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum number of log events in a batch is 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * A batch of log events in a single request cannot span more than 24 hours. Otherwise, the operation fails.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a call to PutLogEvents returns "UnrecognizedClientException" the most likely cause is an invalid AWS access
     * key ID or secret key.
     * </p>
     * 
     * @param putLogEventsRequest
     * @return Result of the PutLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws InvalidSequenceTokenException
     *         The sequence token is not valid.
     * @throws DataAlreadyAcceptedException
     *         The event was already logged.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws UnrecognizedClientException
     *         The most likely cause is an invalid AWS access key ID or secret key.
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
     * Creates or updates a metric filter and associates it with the specified log group. Metric filters allow you to
     * configure rules to extract metric data from log events ingested through <a>PutLogEvents</a>.
     * </p>
     * <p>
     * The maximum number of metric filters that can be associated with a log group is 100.
     * </p>
     * 
     * @param putMetricFilterRequest
     * @return Result of the PutMetricFilter operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
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
     * Creates or updates a resource policy allowing other AWS services to put log events to this account, such as
     * Amazon Route 53. An account can have up to 10 resource policies per region.
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
     * Sets the retention of the specified log group. A retention policy allows you to configure the number of days for
     * which to retain log events in the specified log group.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @return Result of the PutRetentionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
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
     * Creates or updates a subscription filter and associates it with the specified log group. Subscription filters
     * allow you to subscribe to a real-time stream of log events ingested through <a>PutLogEvents</a> and have them
     * delivered to a specific destination. Currently, the supported destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination that belongs to a different account, for cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose delivery stream that belongs to the same account as the subscription filter, for
     * same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function that belongs to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There can only be one subscription filter associated with a log group. If you are updating an existing filter,
     * you must specify the correct name in <code>filterName</code>. Otherwise, the call fails because you cannot
     * associate a second filter with a log group.
     * </p>
     * 
     * @param putSubscriptionFilterRequest
     * @return Result of the PutSubscriptionFilter operation returned by the service.
     * @throws InvalidParameterException
     *         A parameter is specified incorrectly.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws OperationAbortedException
     *         Multiple requests to update the same resource were in conflict.
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
     * query, and the query string to use.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/CWL_QuerySyntax.html">CloudWatch Logs Insights
     * Query Syntax</a>.
     * </p>
     * 
     * @param startQueryRequest
     * @return Result of the StartQuery operation returned by the service.
     * @throws MalformedQueryException
     *         The query string is not valid. Details about this error are displayed in a <code>QueryCompileError</code>
     *         object. For more information, see .</p>
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
     * <p>
     * Adds or updates the specified tags for the specified log group.
     * </p>
     * <p>
     * To list the tags for a log group, use <a>ListTagsLogGroup</a>. To remove tags, use <a>UntagLogGroup</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/log-group-tagging.html">Tag Log Groups in Amazon
     * CloudWatch Logs</a> in the <i>Amazon CloudWatch Logs User Guide</i>.
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
     * <p>
     * Removes the specified tags from the specified log group.
     * </p>
     * <p>
     * To list the tags for a log group, use <a>ListTagsLogGroup</a>. To add tags, use <a>UntagLogGroup</a>.
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

}
