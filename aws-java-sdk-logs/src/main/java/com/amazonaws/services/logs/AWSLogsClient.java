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
package com.amazonaws.services.logs;

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

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.services.logs.model.transform.*;

/**
 * Client for accessing Amazon CloudWatch Logs. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * You can use Amazon CloudWatch Logs to monitor, store, and access your log files from Amazon Elastic Compute Cloud
 * (Amazon EC2) instances, Amazon CloudTrail, or other sources. You can then retrieve the associated log data from
 * CloudWatch Logs using the Amazon CloudWatch console, the CloudWatch Logs commands in the AWS CLI, the CloudWatch Logs
 * API, or the CloudWatch Logs SDK.
 * </p>
 * <p>
 * You can use CloudWatch Logs to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Monitor Logs from Amazon EC2 Instances in Real-time</b>: You can use CloudWatch Logs to monitor applications and
 * systems using log data. For example, CloudWatch Logs can track the number of errors that occur in your application
 * logs and send you a notification whenever the rate of errors exceeds a threshold you specify. CloudWatch Logs uses
 * your log data for monitoring; so, no code changes are required. For example, you can monitor application logs for
 * specific literal terms (such as "NullReferenceException") or count the number of occurrences of a literal term at a
 * particular position in log data (such as "404" status codes in an Apache access log). When the term you are searching
 * for is found, CloudWatch Logs reports the data to a Amazon CloudWatch metric that you specify.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Monitor Amazon CloudTrail Logged Events</b>: You can create alarms in Amazon CloudWatch and receive notifications
 * of particular API activity as captured by CloudTrail and use the notification to perform troubleshooting.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Archive Log Data</b>: You can use CloudWatch Logs to store your log data in highly durable storage. You can change
 * the log retention setting so that any log events older than this setting are automatically deleted. The CloudWatch
 * Logs agent makes it easy to quickly send both rotated and non-rotated log data off of a host and into the log
 * service. You can then access the raw log data when you need it.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
public class AWSLogsClient extends AmazonWebServiceClient implements AWSLogs {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSLogs.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "logs";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
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
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("OperationAbortedException").withModeledClass(
                            com.amazonaws.services.logs.model.OperationAbortedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                            com.amazonaws.services.logs.model.LimitExceededException.class))
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
     */
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
     */
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
     */
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
     */
    public AWSLogsClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AWSLogsClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
    }

    /**
     * <p>
     * Cancels an export task if it is in <code>PENDING</code> or <code>RUNNING</code> state.
     * </p>
     * 
     * @param cancelExportTaskRequest
     * @return Result of the CancelExportTask operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws InvalidOperationException
     *         Returned if the operation is not valid on the specified resource
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.CancelExportTask
     */
    @Override
    public CancelExportTaskResult cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelExportTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelExportTaskRequest> request = null;
        Response<CancelExportTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelExportTaskRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelExportTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Creates an <code>ExportTask</code> which allows you to efficiently export data from a Log Group to your Amazon S3
     * bucket.
     * </p>
     * <p>
     * This is an asynchronous call. If all the required information is provided, this API will initiate an export task
     * and respond with the task Id. Once started, <code>DescribeExportTasks</code> can be used to get the status of an
     * export task. You can only have one active (<code>RUNNING</code> or <code>PENDING</code>) export task at a time,
     * per account.
     * </p>
     * <p>
     * You can export logs from multiple log groups or multiple time ranges to the same Amazon S3 bucket. To separate
     * out log data for each export task, you can specify a prefix that will be used as the Amazon S3 key prefix for all
     * exported objects.
     * </p>
     * 
     * @param createExportTaskRequest
     * @return Result of the CreateExportTask operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws LimitExceededException
     *         Returned if you have reached the maximum number of resources that can be created.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ResourceAlreadyExistsException
     *         Returned if the specified resource already exists.
     * @sample AWSLogs.CreateExportTask
     */
    @Override
    public CreateExportTaskResult createExportTask(CreateExportTaskRequest createExportTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(createExportTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateExportTaskRequest> request = null;
        Response<CreateExportTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateExportTaskRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createExportTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Creates a new log group with the specified name. The name of the log group must be unique within a region for an
     * AWS account. You can create up to 500 log groups per account.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Log group names can be between 1 and 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).
     * </p>
     * </li>
     * </ul>
     * 
     * @param createLogGroupRequest
     * @return Result of the CreateLogGroup operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceAlreadyExistsException
     *         Returned if the specified resource already exists.
     * @throws LimitExceededException
     *         Returned if you have reached the maximum number of resources that can be created.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.CreateLogGroup
     */
    @Override
    public CreateLogGroupResult createLogGroup(CreateLogGroupRequest createLogGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createLogGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLogGroupRequest> request = null;
        Response<CreateLogGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLogGroupRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLogGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Creates a new log stream in the specified log group. The name of the log stream must be unique within the log
     * group. There is no limit on the number of log streams that can exist in a log group.
     * </p>
     * <p>
     * You must use the following guidelines when naming a log stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Log stream names can be between 1 and 512 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ':' colon character is not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createLogStreamRequest
     * @return Result of the CreateLogStream operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceAlreadyExistsException
     *         Returned if the specified resource already exists.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.CreateLogStream
     */
    @Override
    public CreateLogStreamResult createLogStream(CreateLogStreamRequest createLogStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(createLogStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLogStreamRequest> request = null;
        Response<CreateLogStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLogStreamRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLogStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Deletes the destination with the specified name and eventually disables all the subscription filters that publish
     * to it. This will not delete the physical resource encapsulated by the destination.
     * </p>
     * 
     * @param deleteDestinationRequest
     * @return Result of the DeleteDestination operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DeleteDestination
     */
    @Override
    public DeleteDestinationResult deleteDestination(DeleteDestinationRequest deleteDestinationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDestinationRequest> request = null;
        Response<DeleteDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDestinationRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Deletes the log group with the specified name and permanently deletes all the archived log events associated with
     * it.
     * </p>
     * 
     * @param deleteLogGroupRequest
     * @return Result of the DeleteLogGroup operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DeleteLogGroup
     */
    @Override
    public DeleteLogGroupResult deleteLogGroup(DeleteLogGroupRequest deleteLogGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLogGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLogGroupRequest> request = null;
        Response<DeleteLogGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLogGroupRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLogGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Deletes a log stream and permanently deletes all the archived log events associated with it.
     * </p>
     * 
     * @param deleteLogStreamRequest
     * @return Result of the DeleteLogStream operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DeleteLogStream
     */
    @Override
    public DeleteLogStreamResult deleteLogStream(DeleteLogStreamRequest deleteLogStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLogStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLogStreamRequest> request = null;
        Response<DeleteLogStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLogStreamRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLogStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Deletes a metric filter associated with the specified log group.
     * </p>
     * 
     * @param deleteMetricFilterRequest
     * @return Result of the DeleteMetricFilter operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DeleteMetricFilter
     */
    @Override
    public DeleteMetricFilterResult deleteMetricFilter(DeleteMetricFilterRequest deleteMetricFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteMetricFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMetricFilterRequest> request = null;
        Response<DeleteMetricFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMetricFilterRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMetricFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Deletes the retention policy of the specified log group. Log events would not expire if they belong to log groups
     * without a retention policy.
     * </p>
     * 
     * @param deleteRetentionPolicyRequest
     * @return Result of the DeleteRetentionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DeleteRetentionPolicy
     */
    @Override
    public DeleteRetentionPolicyResult deleteRetentionPolicy(DeleteRetentionPolicyRequest deleteRetentionPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRetentionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRetentionPolicyRequest> request = null;
        Response<DeleteRetentionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRetentionPolicyRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRetentionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Deletes a subscription filter associated with the specified log group.
     * </p>
     * 
     * @param deleteSubscriptionFilterRequest
     * @return Result of the DeleteSubscriptionFilter operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DeleteSubscriptionFilter
     */
    @Override
    public DeleteSubscriptionFilterResult deleteSubscriptionFilter(DeleteSubscriptionFilterRequest deleteSubscriptionFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSubscriptionFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubscriptionFilterRequest> request = null;
        Response<DeleteSubscriptionFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubscriptionFilterRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSubscriptionFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns all the destinations that are associated with the AWS account making the request. The list returned in
     * the response is ASCII-sorted by destination name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 destinations. If there are more destinations to list, the response
     * would contain a <code>nextToken</code> value in the response body. You can also limit the number of destinations
     * returned in the response by specifying the <code>limit</code> parameter in the request.
     * </p>
     * 
     * @param describeDestinationsRequest
     * @return Result of the DescribeDestinations operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DescribeDestinations
     */
    @Override
    public DescribeDestinationsResult describeDestinations(DescribeDestinationsRequest describeDestinationsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDestinationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDestinationsRequest> request = null;
        Response<DescribeDestinationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDestinationsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDestinationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns all the export tasks that are associated with the AWS account making the request. The export tasks can be
     * filtered based on <code>TaskId</code> or <code>TaskStatus</code>.
     * </p>
     * <p>
     * By default, this operation returns up to 50 export tasks that satisfy the specified filters. If there are more
     * export tasks to list, the response would contain a <code>nextToken</code> value in the response body. You can
     * also limit the number of export tasks returned in the response by specifying the <code>limit</code> parameter in
     * the request.
     * </p>
     * 
     * @param describeExportTasksRequest
     * @return Result of the DescribeExportTasks operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DescribeExportTasks
     */
    @Override
    public DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest describeExportTasksRequest) {
        ExecutionContext executionContext = createExecutionContext(describeExportTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExportTasksRequest> request = null;
        Response<DescribeExportTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExportTasksRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeExportTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns all the log groups that are associated with the AWS account making the request. The list returned in the
     * response is ASCII-sorted by log group name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log groups. If there are more log groups to list, the response would
     * contain a <code>nextToken</code> value in the response body. You can also limit the number of log groups returned
     * in the response by specifying the <code>limit</code> parameter in the request.
     * </p>
     * 
     * @param describeLogGroupsRequest
     * @return Result of the DescribeLogGroups operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DescribeLogGroups
     */
    @Override
    public DescribeLogGroupsResult describeLogGroups(DescribeLogGroupsRequest describeLogGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLogGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLogGroupsRequest> request = null;
        Response<DescribeLogGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLogGroupsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLogGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns all the log streams that are associated with the specified log group. The list returned in the response
     * is ASCII-sorted by log stream name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 log streams. If there are more log streams to list, the response
     * would contain a <code>nextToken</code> value in the response body. You can also limit the number of log streams
     * returned in the response by specifying the <code>limit</code> parameter in the request. This operation has a
     * limit of five transactions per second, after which transactions are throttled.
     * </p>
     * 
     * @param describeLogStreamsRequest
     * @return Result of the DescribeLogStreams operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DescribeLogStreams
     */
    @Override
    public DescribeLogStreamsResult describeLogStreams(DescribeLogStreamsRequest describeLogStreamsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLogStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLogStreamsRequest> request = null;
        Response<DescribeLogStreamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLogStreamsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLogStreamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns all the metrics filters associated with the specified log group. The list returned in the response is
     * ASCII-sorted by filter name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 metric filters. If there are more metric filters to list, the
     * response would contain a <code>nextToken</code> value in the response body. You can also limit the number of
     * metric filters returned in the response by specifying the <code>limit</code> parameter in the request.
     * </p>
     * 
     * @param describeMetricFiltersRequest
     * @return Result of the DescribeMetricFilters operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DescribeMetricFilters
     */
    @Override
    public DescribeMetricFiltersResult describeMetricFilters(DescribeMetricFiltersRequest describeMetricFiltersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeMetricFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMetricFiltersRequest> request = null;
        Response<DescribeMetricFiltersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMetricFiltersRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMetricFiltersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns all the subscription filters associated with the specified log group. The list returned in the response
     * is ASCII-sorted by filter name.
     * </p>
     * <p>
     * By default, this operation returns up to 50 subscription filters. If there are more subscription filters to list,
     * the response would contain a <code>nextToken</code> value in the response body. You can also limit the number of
     * subscription filters returned in the response by specifying the <code>limit</code> parameter in the request.
     * </p>
     * 
     * @param describeSubscriptionFiltersRequest
     * @return Result of the DescribeSubscriptionFilters operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.DescribeSubscriptionFilters
     */
    @Override
    public DescribeSubscriptionFiltersResult describeSubscriptionFilters(DescribeSubscriptionFiltersRequest describeSubscriptionFiltersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSubscriptionFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSubscriptionFiltersRequest> request = null;
        Response<DescribeSubscriptionFiltersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSubscriptionFiltersRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSubscriptionFiltersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Retrieves log events, optionally filtered by a filter pattern from the specified log group. You can provide an
     * optional time range to filter the results on the event <code>timestamp</code>. You can limit the streams searched
     * to an explicit list of <code>logStreamNames</code>.
     * </p>
     * <p>
     * By default, this operation returns as much matching log events as can fit in a response size of 1MB, up to 10,000
     * log events, or all the events found within a time-bounded scan window. If the response includes a
     * <code>nextToken</code>, then there is more data to search, and the search can be resumed with a new request
     * providing the nextToken. The response will contain a list of <code>searchedLogStreams</code> that contains
     * information about which streams were searched in the request and whether they have been searched completely or
     * require further pagination. The <code>limit</code> parameter in the request can be used to specify the maximum
     * number of events to return in a page.
     * </p>
     * 
     * @param filterLogEventsRequest
     * @return Result of the FilterLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.FilterLogEvents
     */
    @Override
    public FilterLogEventsResult filterLogEvents(FilterLogEventsRequest filterLogEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(filterLogEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FilterLogEventsRequest> request = null;
        Response<FilterLogEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new FilterLogEventsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(filterLogEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Retrieves log events from the specified log stream. You can provide an optional time range to filter the results
     * on the event <code>timestamp</code>.
     * </p>
     * <p>
     * By default, this operation returns as much log events as can fit in a response size of 1MB, up to 10,000 log
     * events. The response will always include a <code>nextForwardToken</code> and a <code>nextBackwardToken</code> in
     * the response body. You can use any of these tokens in subsequent <code>GetLogEvents</code> requests to paginate
     * through events in either forward or backward direction. You can also limit the number of log events returned in
     * the response by specifying the <code>limit</code> parameter in the request.
     * </p>
     * 
     * @param getLogEventsRequest
     * @return Result of the GetLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.GetLogEvents
     */
    @Override
    public GetLogEventsResult getLogEvents(GetLogEventsRequest getLogEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(getLogEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLogEventsRequest> request = null;
        Response<GetLogEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLogEventsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLogEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Creates or updates a <code>Destination</code>. A destination encapsulates a physical resource (such as a Kinesis
     * stream) and allows you to subscribe to a real-time stream of log events of a different account, ingested through
     * <code>PutLogEvents</code> requests. Currently, the only supported physical resource is a Amazon Kinesis stream
     * belonging to the same account as the destination.
     * </p>
     * <p>
     * A destination controls what is written to its Amazon Kinesis stream through an access policy. By default,
     * PutDestination does not set any access policy with the destination, which means a cross-account user will not be
     * able to call <code>PutSubscriptionFilter</code> against this destination. To enable that, the destination owner
     * must call <code>PutDestinationPolicy</code> after PutDestination.
     * </p>
     * 
     * @param putDestinationRequest
     * @return Result of the PutDestination operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.PutDestination
     */
    @Override
    public PutDestinationResult putDestination(PutDestinationRequest putDestinationRequest) {
        ExecutionContext executionContext = createExecutionContext(putDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDestinationRequest> request = null;
        Response<PutDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDestinationRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Creates or updates an access policy associated with an existing <code>Destination</code>. An access policy is an
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies_overview.html">IAM policy document</a> that is
     * used to authorize claims to register a subscription filter against a given destination.
     * </p>
     * 
     * @param putDestinationPolicyRequest
     * @return Result of the PutDestinationPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.PutDestinationPolicy
     */
    @Override
    public PutDestinationPolicyResult putDestinationPolicy(PutDestinationPolicyRequest putDestinationPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putDestinationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDestinationPolicyRequest> request = null;
        Response<PutDestinationPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDestinationPolicyRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putDestinationPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Every PutLogEvents request must include the <code>sequenceToken</code> obtained from the response of the previous
     * request. An upload in a newly created log stream does not require a <code>sequenceToken</code>. You can also get
     * the <code>sequenceToken</code> using <a>DescribeLogStreams</a>.
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
     * The log events in the batch must be in chronological ordered by their <code>timestamp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The maximum number of log events in a batch is 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * A batch of log events in a single PutLogEvents request cannot span more than 24 hours. Otherwise, the
     * PutLogEvents operation will fail.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putLogEventsRequest
     * @return Result of the PutLogEvents operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws InvalidSequenceTokenException
     * @throws DataAlreadyAcceptedException
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.PutLogEvents
     */
    @Override
    public PutLogEventsResult putLogEvents(PutLogEventsRequest putLogEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(putLogEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLogEventsRequest> request = null;
        Response<PutLogEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLogEventsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putLogEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * configure rules to extract metric data from log events ingested through <code>PutLogEvents</code> requests.
     * </p>
     * <p>
     * The maximum number of metric filters that can be associated with a log group is 100.
     * </p>
     * 
     * @param putMetricFilterRequest
     * @return Result of the PutMetricFilter operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws LimitExceededException
     *         Returned if you have reached the maximum number of resources that can be created.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.PutMetricFilter
     */
    @Override
    public PutMetricFilterResult putMetricFilter(PutMetricFilterRequest putMetricFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(putMetricFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMetricFilterRequest> request = null;
        Response<PutMetricFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMetricFilterRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putMetricFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Sets the retention of the specified log group. A retention policy allows you to configure the number of days you
     * want to retain log events in the specified log group.
     * </p>
     * 
     * @param putRetentionPolicyRequest
     * @return Result of the PutRetentionPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.PutRetentionPolicy
     */
    @Override
    public PutRetentionPolicyResult putRetentionPolicy(PutRetentionPolicyRequest putRetentionPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putRetentionPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRetentionPolicyRequest> request = null;
        Response<PutRetentionPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRetentionPolicyRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRetentionPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * allow you to subscribe to a real-time stream of log events ingested through <code>PutLogEvents</code> requests
     * and have them delivered to a specific destination. Currently, the supported destinations are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Kinesis stream belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * A logical destination (used via an ARN of <code>Destination</code>) belonging to a different account, for
     * cross-account delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Kinesis Firehose stream belonging to the same account as the subscription filter, for same-account
     * delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS Lambda function belonging to the same account as the subscription filter, for same-account delivery.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Currently there can only be one subscription filter associated with a log group.
     * </p>
     * 
     * @param putSubscriptionFilterRequest
     * @return Result of the PutSubscriptionFilter operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ResourceNotFoundException
     *         Returned if the specified resource does not exist.
     * @throws OperationAbortedException
     *         Returned if multiple requests to update the same resource were in conflict.
     * @throws LimitExceededException
     *         Returned if you have reached the maximum number of resources that can be created.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.PutSubscriptionFilter
     */
    @Override
    public PutSubscriptionFilterResult putSubscriptionFilter(PutSubscriptionFilterRequest putSubscriptionFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(putSubscriptionFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSubscriptionFilterRequest> request = null;
        Response<PutSubscriptionFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSubscriptionFilterRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(putSubscriptionFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Tests the filter pattern of a metric filter against a sample of log event messages. You can use this operation to
     * validate the correctness of a metric filter pattern.
     * </p>
     * 
     * @param testMetricFilterRequest
     * @return Result of the TestMetricFilter operation returned by the service.
     * @throws InvalidParameterException
     *         Returned if a parameter of the request is incorrectly specified.
     * @throws ServiceUnavailableException
     *         Returned if the service cannot complete the request.
     * @sample AWSLogs.TestMetricFilter
     */
    @Override
    public TestMetricFilterResult testMetricFilter(TestMetricFilterRequest testMetricFilterRequest) {
        ExecutionContext executionContext = createExecutionContext(testMetricFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestMetricFilterRequest> request = null;
        Response<TestMetricFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestMetricFilterRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(testMetricFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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

}
