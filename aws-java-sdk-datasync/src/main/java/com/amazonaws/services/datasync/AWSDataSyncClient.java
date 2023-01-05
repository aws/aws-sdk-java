/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync;

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

import com.amazonaws.services.datasync.AWSDataSyncClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.datasync.model.*;
import com.amazonaws.services.datasync.model.transform.*;

/**
 * Client for accessing DataSync. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>DataSync</fullname>
 * <p>
 * DataSync is a managed data transfer service that makes it simpler for you to automate moving data between on-premises
 * storage and Amazon Web Services storage services. You also can use DataSync to transfer data between other cloud
 * providers and Amazon Web Services storage services.
 * </p>
 * <p>
 * This API interface reference includes documentation for using DataSync programmatically. For complete information,
 * see the <i> <a href="https://docs.aws.amazon.com/datasync/latest/userguide/what-is-datasync.html">DataSync User
 * Guide</a> </i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDataSyncClient extends AmazonWebServiceClient implements AWSDataSync {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSDataSync.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "datasync";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.datasync.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalException").withExceptionUnmarshaller(
                                    com.amazonaws.services.datasync.model.transform.InternalExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.datasync.model.AWSDataSyncException.class));

    public static AWSDataSyncClientBuilder builder() {
        return AWSDataSyncClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on DataSync using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSDataSyncClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on DataSync using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSDataSyncClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("datasync.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/datasync/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/datasync/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Stops an DataSync task execution that's in progress. The transfer of some files are abruptly interrupted. File
     * contents that're transferred to the destination might be incomplete or inconsistent with the source files.
     * </p>
     * <p>
     * However, if you start a new task execution using the same task and allow it to finish, file content on the
     * destination will be complete and consistent. This applies to other unexpected failures that interrupt a task
     * execution. In all of these cases, DataSync successfully completes the transfer when you start the next task
     * execution.
     * </p>
     * 
     * @param cancelTaskExecutionRequest
     *        CancelTaskExecutionRequest
     * @return Result of the CancelTaskExecution operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CancelTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CancelTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelTaskExecutionResult cancelTaskExecution(CancelTaskExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeCancelTaskExecution(request);
    }

    @SdkInternalApi
    final CancelTaskExecutionResult executeCancelTaskExecution(CancelTaskExecutionRequest cancelTaskExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelTaskExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelTaskExecutionRequest> request = null;
        Response<CancelTaskExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelTaskExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelTaskExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelTaskExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelTaskExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelTaskExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Activates an DataSync agent that you have deployed in your storage environment. The activation process associates
     * your agent with your account. In the activation process, you specify information such as the Amazon Web Services
     * Region that you want to activate the agent in. You activate the agent in the Amazon Web Services Region where
     * your target locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in this Amazon Web Services
     * Region.
     * </p>
     * <p>
     * You can activate the agent in a VPC (virtual private cloud) or provide the agent access to a VPC endpoint so you
     * can run tasks without going over the public internet.
     * </p>
     * <p>
     * You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status
     * AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents
     * must be AVAILABLE for the task to run.
     * </p>
     * <p>
     * Agents are automatically updated by Amazon Web Services on a regular basis, using a mechanism that ensures
     * minimal interruption to your tasks.
     * </p>
     * 
     * @param createAgentRequest
     *        CreateAgentRequest
     * @return Result of the CreateAgent operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAgentResult createAgent(CreateAgentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAgent(request);
    }

    @SdkInternalApi
    final CreateAgentResult executeCreateAgent(CreateAgentRequest createAgentRequest) {

        ExecutionContext executionContext = createExecutionContext(createAgentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAgentRequest> request = null;
        Response<CreateAgentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAgentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAgentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAgent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAgentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAgentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an endpoint for an Amazon EFS file system that DataSync can access for a transfer. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-efs-location.html">Creating a location
     * for Amazon EFS</a>.
     * </p>
     * 
     * @param createLocationEfsRequest
     *        CreateLocationEfsRequest
     * @return Result of the CreateLocationEfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationEfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationEfs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLocationEfsResult createLocationEfs(CreateLocationEfsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLocationEfs(request);
    }

    @SdkInternalApi
    final CreateLocationEfsResult executeCreateLocationEfs(CreateLocationEfsRequest createLocationEfsRequest) {

        ExecutionContext executionContext = createExecutionContext(createLocationEfsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLocationEfsRequest> request = null;
        Response<CreateLocationEfsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLocationEfsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLocationEfsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLocationEfs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLocationEfsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLocationEfsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for Lustre file system.
     * </p>
     * 
     * @param createLocationFsxLustreRequest
     * @return Result of the CreateLocationFsxLustre operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationFsxLustre
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxLustre"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLocationFsxLustreResult createLocationFsxLustre(CreateLocationFsxLustreRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLocationFsxLustre(request);
    }

    @SdkInternalApi
    final CreateLocationFsxLustreResult executeCreateLocationFsxLustre(CreateLocationFsxLustreRequest createLocationFsxLustreRequest) {

        ExecutionContext executionContext = createExecutionContext(createLocationFsxLustreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLocationFsxLustreRequest> request = null;
        Response<CreateLocationFsxLustreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLocationFsxLustreRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createLocationFsxLustreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLocationFsxLustre");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLocationFsxLustreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateLocationFsxLustreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for NetApp ONTAP file system that DataSync can access for a transfer. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html">Creating a location for
     * FSx for ONTAP</a>.
     * </p>
     * 
     * @param createLocationFsxOntapRequest
     * @return Result of the CreateLocationFsxOntap operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationFsxOntap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxOntap"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLocationFsxOntapResult createLocationFsxOntap(CreateLocationFsxOntapRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLocationFsxOntap(request);
    }

    @SdkInternalApi
    final CreateLocationFsxOntapResult executeCreateLocationFsxOntap(CreateLocationFsxOntapRequest createLocationFsxOntapRequest) {

        ExecutionContext executionContext = createExecutionContext(createLocationFsxOntapRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLocationFsxOntapRequest> request = null;
        Response<CreateLocationFsxOntapResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLocationFsxOntapRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLocationFsxOntapRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLocationFsxOntap");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLocationFsxOntapResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateLocationFsxOntapResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for OpenZFS file system that DataSync can access for a transfer. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-openzfs-location.html">Creating a location for
     * FSx for OpenZFS</a>.
     * </p>
     * <note>
     * <p>
     * Request parameters related to <code>SMB</code> aren't supported with the <code>CreateLocationFsxOpenZfs</code>
     * operation.
     * </p>
     * </note>
     * 
     * @param createLocationFsxOpenZfsRequest
     * @return Result of the CreateLocationFsxOpenZfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationFsxOpenZfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxOpenZfs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLocationFsxOpenZfsResult createLocationFsxOpenZfs(CreateLocationFsxOpenZfsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLocationFsxOpenZfs(request);
    }

    @SdkInternalApi
    final CreateLocationFsxOpenZfsResult executeCreateLocationFsxOpenZfs(CreateLocationFsxOpenZfsRequest createLocationFsxOpenZfsRequest) {

        ExecutionContext executionContext = createExecutionContext(createLocationFsxOpenZfsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLocationFsxOpenZfsRequest> request = null;
        Response<CreateLocationFsxOpenZfsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLocationFsxOpenZfsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createLocationFsxOpenZfsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLocationFsxOpenZfs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLocationFsxOpenZfsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateLocationFsxOpenZfsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an endpoint for an Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @param createLocationFsxWindowsRequest
     * @return Result of the CreateLocationFsxWindows operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationFsxWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxWindows"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLocationFsxWindowsResult createLocationFsxWindows(CreateLocationFsxWindowsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLocationFsxWindows(request);
    }

    @SdkInternalApi
    final CreateLocationFsxWindowsResult executeCreateLocationFsxWindows(CreateLocationFsxWindowsRequest createLocationFsxWindowsRequest) {

        ExecutionContext executionContext = createExecutionContext(createLocationFsxWindowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLocationFsxWindowsRequest> request = null;
        Response<CreateLocationFsxWindowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLocationFsxWindowsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createLocationFsxWindowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLocationFsxWindows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLocationFsxWindowsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateLocationFsxWindowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an endpoint for a Hadoop Distributed File System (HDFS).
     * </p>
     * 
     * @param createLocationHdfsRequest
     * @return Result of the CreateLocationHdfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationHdfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationHdfs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateLocationHdfsResult createLocationHdfs(CreateLocationHdfsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLocationHdfs(request);
    }

    @SdkInternalApi
    final CreateLocationHdfsResult executeCreateLocationHdfs(CreateLocationHdfsRequest createLocationHdfsRequest) {

        ExecutionContext executionContext = createExecutionContext(createLocationHdfsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLocationHdfsRequest> request = null;
        Response<CreateLocationHdfsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLocationHdfsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLocationHdfsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLocationHdfs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLocationHdfsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLocationHdfsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Defines a file system on a Network File System (NFS) server that can be read from or written to.
     * </p>
     * 
     * @param createLocationNfsRequest
     *        CreateLocationNfsRequest
     * @return Result of the CreateLocationNfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationNfs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLocationNfsResult createLocationNfs(CreateLocationNfsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLocationNfs(request);
    }

    @SdkInternalApi
    final CreateLocationNfsResult executeCreateLocationNfs(CreateLocationNfsRequest createLocationNfsRequest) {

        ExecutionContext executionContext = createExecutionContext(createLocationNfsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLocationNfsRequest> request = null;
        Response<CreateLocationNfsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLocationNfsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLocationNfsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLocationNfs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLocationNfsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLocationNfsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an endpoint for an object storage system that DataSync can access for a transfer. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-object-location.html">Creating a
     * location for object storage</a>.
     * </p>
     * 
     * @param createLocationObjectStorageRequest
     *        CreateLocationObjectStorageRequest
     * @return Result of the CreateLocationObjectStorage operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationObjectStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationObjectStorage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLocationObjectStorageResult createLocationObjectStorage(CreateLocationObjectStorageRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLocationObjectStorage(request);
    }

    @SdkInternalApi
    final CreateLocationObjectStorageResult executeCreateLocationObjectStorage(CreateLocationObjectStorageRequest createLocationObjectStorageRequest) {

        ExecutionContext executionContext = createExecutionContext(createLocationObjectStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLocationObjectStorageRequest> request = null;
        Response<CreateLocationObjectStorageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLocationObjectStorageRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createLocationObjectStorageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLocationObjectStorage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLocationObjectStorageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateLocationObjectStorageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an endpoint for an Amazon S3 bucket that DataSync can access for a transfer.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-locations-cli.html#create-location-s3-cli"
     * >Create an Amazon S3 location</a> in the <i>DataSync User Guide</i>.
     * </p>
     * 
     * @param createLocationS3Request
     *        CreateLocationS3Request
     * @return Result of the CreateLocationS3 operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationS3" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLocationS3Result createLocationS3(CreateLocationS3Request request) {
        request = beforeClientExecution(request);
        return executeCreateLocationS3(request);
    }

    @SdkInternalApi
    final CreateLocationS3Result executeCreateLocationS3(CreateLocationS3Request createLocationS3Request) {

        ExecutionContext executionContext = createExecutionContext(createLocationS3Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLocationS3Request> request = null;
        Response<CreateLocationS3Result> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLocationS3RequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLocationS3Request));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLocationS3");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLocationS3Result>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLocationS3ResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Defines a file system on a Server Message Block (SMB) server that can be read from or written to.
     * </p>
     * 
     * @param createLocationSmbRequest
     *        CreateLocationSmbRequest
     * @return Result of the CreateLocationSmb operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationSmb" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLocationSmbResult createLocationSmb(CreateLocationSmbRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLocationSmb(request);
    }

    @SdkInternalApi
    final CreateLocationSmbResult executeCreateLocationSmb(CreateLocationSmbRequest createLocationSmbRequest) {

        ExecutionContext executionContext = createExecutionContext(createLocationSmbRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLocationSmbRequest> request = null;
        Response<CreateLocationSmbResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLocationSmbRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLocationSmbRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLocationSmb");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLocationSmbResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLocationSmbResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures a task, which defines where and how DataSync transfers your data.
     * </p>
     * <p>
     * A task includes a source location, a destination location, and the preferences for how and when you want to
     * transfer your data (such as bandwidth limits, scheduling, among other options).
     * </p>
     * 
     * @param createTaskRequest
     *        CreateTaskRequest
     * @return Result of the CreateTask operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.CreateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTaskResult createTask(CreateTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTask(request);
    }

    @SdkInternalApi
    final CreateTaskResult executeCreateTask(CreateTaskRequest createTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(createTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTaskRequest> request = null;
        Response<CreateTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTaskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your
     * request. The operation disassociates the agent from your Amazon Web Services account. However, it doesn't delete
     * the agent virtual machine (VM) from your on-premises environment.
     * </p>
     * 
     * @param deleteAgentRequest
     *        DeleteAgentRequest
     * @return Result of the DeleteAgent operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DeleteAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteAgent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAgentResult deleteAgent(DeleteAgentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAgent(request);
    }

    @SdkInternalApi
    final DeleteAgentResult executeDeleteAgent(DeleteAgentRequest deleteAgentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAgentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAgentRequest> request = null;
        Response<DeleteAgentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAgentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAgentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAgent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAgentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAgentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the configuration of a location used by DataSync.
     * </p>
     * 
     * @param deleteLocationRequest
     *        DeleteLocation
     * @return Result of the DeleteLocation operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DeleteLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteLocation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLocationResult deleteLocation(DeleteLocationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLocation(request);
    }

    @SdkInternalApi
    final DeleteLocationResult executeDeleteLocation(DeleteLocationRequest deleteLocationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLocationRequest> request = null;
        Response<DeleteLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLocationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLocationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLocationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an DataSync task.
     * </p>
     * 
     * @param deleteTaskRequest
     *        DeleteTask
     * @return Result of the DeleteTask operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DeleteTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DeleteTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTaskResult deleteTask(DeleteTaskRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTask(request);
    }

    @SdkInternalApi
    final DeleteTaskResult executeDeleteTask(DeleteTaskRequest deleteTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTaskRequest> request = null;
        Response<DeleteTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTaskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running
     * or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your
     * request.
     * </p>
     * 
     * @param describeAgentRequest
     *        DescribeAgent
     * @return Result of the DescribeAgent operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeAgent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAgentResult describeAgent(DescribeAgentRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAgent(request);
    }

    @SdkInternalApi
    final DescribeAgentResult executeDescribeAgent(DescribeAgentRequest describeAgentRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAgentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAgentRequest> request = null;
        Response<DescribeAgentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAgentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAgentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAgent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAgentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAgentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata about your DataSync location for an Amazon EFS file system.
     * </p>
     * 
     * @param describeLocationEfsRequest
     *        DescribeLocationEfsRequest
     * @return Result of the DescribeLocationEfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationEfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationEfs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeLocationEfsResult describeLocationEfs(DescribeLocationEfsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLocationEfs(request);
    }

    @SdkInternalApi
    final DescribeLocationEfsResult executeDescribeLocationEfs(DescribeLocationEfsRequest describeLocationEfsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLocationEfsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLocationEfsRequest> request = null;
        Response<DescribeLocationEfsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLocationEfsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLocationEfsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLocationEfs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLocationEfsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLocationEfsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides details about how an DataSync location for an Amazon FSx for Lustre file system is configured.
     * </p>
     * 
     * @param describeLocationFsxLustreRequest
     * @return Result of the DescribeLocationFsxLustre operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationFsxLustre
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxLustre"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLocationFsxLustreResult describeLocationFsxLustre(DescribeLocationFsxLustreRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLocationFsxLustre(request);
    }

    @SdkInternalApi
    final DescribeLocationFsxLustreResult executeDescribeLocationFsxLustre(DescribeLocationFsxLustreRequest describeLocationFsxLustreRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLocationFsxLustreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLocationFsxLustreRequest> request = null;
        Response<DescribeLocationFsxLustreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLocationFsxLustreRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeLocationFsxLustreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLocationFsxLustre");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLocationFsxLustreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeLocationFsxLustreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides details about how an DataSync location for an Amazon FSx for NetApp ONTAP file system is configured.
     * </p>
     * <note>
     * <p>
     * If your location uses SMB, the <code>DescribeLocationFsxOntap</code> operation doesn't actually return a
     * <code>Password</code>.
     * </p>
     * </note>
     * 
     * @param describeLocationFsxOntapRequest
     * @return Result of the DescribeLocationFsxOntap operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationFsxOntap
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxOntap"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLocationFsxOntapResult describeLocationFsxOntap(DescribeLocationFsxOntapRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLocationFsxOntap(request);
    }

    @SdkInternalApi
    final DescribeLocationFsxOntapResult executeDescribeLocationFsxOntap(DescribeLocationFsxOntapRequest describeLocationFsxOntapRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLocationFsxOntapRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLocationFsxOntapRequest> request = null;
        Response<DescribeLocationFsxOntapResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLocationFsxOntapRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeLocationFsxOntapRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLocationFsxOntap");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLocationFsxOntapResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeLocationFsxOntapResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides details about how an DataSync location for an Amazon FSx for OpenZFS file system is configured.
     * </p>
     * <note>
     * <p>
     * Response elements related to <code>SMB</code> aren't supported with the <code>DescribeLocationFsxOpenZfs</code>
     * operation.
     * </p>
     * </note>
     * 
     * @param describeLocationFsxOpenZfsRequest
     * @return Result of the DescribeLocationFsxOpenZfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationFsxOpenZfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxOpenZfs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLocationFsxOpenZfsResult describeLocationFsxOpenZfs(DescribeLocationFsxOpenZfsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLocationFsxOpenZfs(request);
    }

    @SdkInternalApi
    final DescribeLocationFsxOpenZfsResult executeDescribeLocationFsxOpenZfs(DescribeLocationFsxOpenZfsRequest describeLocationFsxOpenZfsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLocationFsxOpenZfsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLocationFsxOpenZfsRequest> request = null;
        Response<DescribeLocationFsxOpenZfsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLocationFsxOpenZfsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeLocationFsxOpenZfsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLocationFsxOpenZfs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLocationFsxOpenZfsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeLocationFsxOpenZfsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata about an Amazon FSx for Windows File Server location, such as information about its path.
     * </p>
     * 
     * @param describeLocationFsxWindowsRequest
     * @return Result of the DescribeLocationFsxWindows operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationFsxWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxWindows"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLocationFsxWindowsResult describeLocationFsxWindows(DescribeLocationFsxWindowsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLocationFsxWindows(request);
    }

    @SdkInternalApi
    final DescribeLocationFsxWindowsResult executeDescribeLocationFsxWindows(DescribeLocationFsxWindowsRequest describeLocationFsxWindowsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLocationFsxWindowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLocationFsxWindowsRequest> request = null;
        Response<DescribeLocationFsxWindowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLocationFsxWindowsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeLocationFsxWindowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLocationFsxWindows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLocationFsxWindowsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeLocationFsxWindowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata, such as the authentication information about the Hadoop Distributed File System (HDFS)
     * location.
     * </p>
     * 
     * @param describeLocationHdfsRequest
     * @return Result of the DescribeLocationHdfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationHdfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationHdfs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeLocationHdfsResult describeLocationHdfs(DescribeLocationHdfsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLocationHdfs(request);
    }

    @SdkInternalApi
    final DescribeLocationHdfsResult executeDescribeLocationHdfs(DescribeLocationHdfsRequest describeLocationHdfsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLocationHdfsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLocationHdfsRequest> request = null;
        Response<DescribeLocationHdfsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLocationHdfsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLocationHdfsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLocationHdfs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLocationHdfsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLocationHdfsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata, such as the path information, about an NFS location.
     * </p>
     * 
     * @param describeLocationNfsRequest
     *        DescribeLocationNfsRequest
     * @return Result of the DescribeLocationNfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationNfs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeLocationNfsResult describeLocationNfs(DescribeLocationNfsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLocationNfs(request);
    }

    @SdkInternalApi
    final DescribeLocationNfsResult executeDescribeLocationNfs(DescribeLocationNfsRequest describeLocationNfsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLocationNfsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLocationNfsRequest> request = null;
        Response<DescribeLocationNfsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLocationNfsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLocationNfsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLocationNfs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLocationNfsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLocationNfsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata about your DataSync location for an object storage system.
     * </p>
     * 
     * @param describeLocationObjectStorageRequest
     *        DescribeLocationObjectStorageRequest
     * @return Result of the DescribeLocationObjectStorage operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationObjectStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationObjectStorage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLocationObjectStorageResult describeLocationObjectStorage(DescribeLocationObjectStorageRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLocationObjectStorage(request);
    }

    @SdkInternalApi
    final DescribeLocationObjectStorageResult executeDescribeLocationObjectStorage(DescribeLocationObjectStorageRequest describeLocationObjectStorageRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLocationObjectStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLocationObjectStorageRequest> request = null;
        Response<DescribeLocationObjectStorageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLocationObjectStorageRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeLocationObjectStorageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLocationObjectStorage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLocationObjectStorageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeLocationObjectStorageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
     * </p>
     * 
     * @param describeLocationS3Request
     *        DescribeLocationS3Request
     * @return Result of the DescribeLocationS3 operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationS3" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeLocationS3Result describeLocationS3(DescribeLocationS3Request request) {
        request = beforeClientExecution(request);
        return executeDescribeLocationS3(request);
    }

    @SdkInternalApi
    final DescribeLocationS3Result executeDescribeLocationS3(DescribeLocationS3Request describeLocationS3Request) {

        ExecutionContext executionContext = createExecutionContext(describeLocationS3Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLocationS3Request> request = null;
        Response<DescribeLocationS3Result> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLocationS3RequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLocationS3Request));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLocationS3");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLocationS3Result>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLocationS3ResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata, such as the path and user information about an SMB location.
     * </p>
     * 
     * @param describeLocationSmbRequest
     *        DescribeLocationSmbRequest
     * @return Result of the DescribeLocationSmb operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationSmb" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeLocationSmbResult describeLocationSmb(DescribeLocationSmbRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLocationSmb(request);
    }

    @SdkInternalApi
    final DescribeLocationSmbResult executeDescribeLocationSmb(DescribeLocationSmbRequest describeLocationSmbRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLocationSmbRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLocationSmbRequest> request = null;
        Response<DescribeLocationSmbResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLocationSmbRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLocationSmbRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLocationSmb");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLocationSmbResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLocationSmbResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata about a task.
     * </p>
     * 
     * @param describeTaskRequest
     *        DescribeTaskRequest
     * @return Result of the DescribeTask operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeTaskResult describeTask(DescribeTaskRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTask(request);
    }

    @SdkInternalApi
    final DescribeTaskResult executeDescribeTask(DescribeTaskRequest describeTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTaskRequest> request = null;
        Response<DescribeTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns detailed metadata about a task that is being executed.
     * </p>
     * 
     * @param describeTaskExecutionRequest
     *        DescribeTaskExecutionRequest
     * @return Result of the DescribeTaskExecution operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.DescribeTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeTaskExecutionResult describeTaskExecution(DescribeTaskExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTaskExecution(request);
    }

    @SdkInternalApi
    final DescribeTaskExecutionResult executeDescribeTaskExecution(DescribeTaskExecutionRequest describeTaskExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTaskExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTaskExecutionRequest> request = null;
        Response<DescribeTaskExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTaskExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTaskExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTaskExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTaskExecutionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeTaskExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of agents owned by an Amazon Web Services account in the Amazon Web Services Region specified in
     * the request. The returned list is ordered by agent Amazon Resource Name (ARN).
     * </p>
     * <p>
     * By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you
     * to optionally reduce the number of agents returned in a response.
     * </p>
     * <p>
     * If you have more agents than are returned in a response (that is, the response returns only a truncated list of
     * your agents), the response contains a marker that you can specify in your next request to fetch the next page of
     * agents.
     * </p>
     * 
     * @param listAgentsRequest
     *        ListAgentsRequest
     * @return Result of the ListAgents operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.ListAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListAgents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAgentsResult listAgents(ListAgentsRequest request) {
        request = beforeClientExecution(request);
        return executeListAgents(request);
    }

    @SdkInternalApi
    final ListAgentsResult executeListAgents(ListAgentsRequest listAgentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAgentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAgentsRequest> request = null;
        Response<ListAgentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAgentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAgentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAgents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAgentsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAgentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of source and destination locations.
     * </p>
     * <p>
     * If you have more locations than are returned in a response (that is, the response returns only a truncated list
     * of your agents), the response contains a token that you can specify in your next request to fetch the next page
     * of locations.
     * </p>
     * 
     * @param listLocationsRequest
     *        ListLocationsRequest
     * @return Result of the ListLocations operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.ListLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListLocations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLocationsResult listLocations(ListLocationsRequest request) {
        request = beforeClientExecution(request);
        return executeListLocations(request);
    }

    @SdkInternalApi
    final ListLocationsResult executeListLocations(ListLocationsRequest listLocationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLocationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLocationsRequest> request = null;
        Response<ListLocationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLocationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLocationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLocations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLocationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLocationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all the tags associated with an Amazon Web Services resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
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
     * <p>
     * Returns a list of executed tasks.
     * </p>
     * 
     * @param listTaskExecutionsRequest
     *        ListTaskExecutions
     * @return Result of the ListTaskExecutions operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.ListTaskExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTaskExecutions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTaskExecutionsResult listTaskExecutions(ListTaskExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListTaskExecutions(request);
    }

    @SdkInternalApi
    final ListTaskExecutionsResult executeListTaskExecutions(ListTaskExecutionsRequest listTaskExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTaskExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTaskExecutionsRequest> request = null;
        Response<ListTaskExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTaskExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTaskExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTaskExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTaskExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTaskExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the DataSync tasks you created.
     * </p>
     * 
     * @param listTasksRequest
     *        ListTasksRequest
     * @return Result of the ListTasks operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListTasks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTasksResult listTasks(ListTasksRequest request) {
        request = beforeClientExecution(request);
        return executeListTasks(request);
    }

    @SdkInternalApi
    final ListTasksResult executeListTasks(ListTasksRequest listTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(listTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTasksRequest> request = null;
        Response<ListTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTasksResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an DataSync task. For each task, you can only run one task execution at a time.
     * </p>
     * <p>
     * There are several phases to a task execution. For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/working-with-task-executions.html#understand-task-execution-statuses"
     * >Task execution statuses</a>.
     * </p>
     * 
     * @param startTaskExecutionRequest
     *        StartTaskExecutionRequest
     * @return Result of the StartTaskExecution operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.StartTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StartTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartTaskExecutionResult startTaskExecution(StartTaskExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStartTaskExecution(request);
    }

    @SdkInternalApi
    final StartTaskExecutionResult executeStartTaskExecution(StartTaskExecutionRequest startTaskExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(startTaskExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTaskExecutionRequest> request = null;
        Response<StartTaskExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTaskExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startTaskExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartTaskExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartTaskExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartTaskExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies a <i>tag</i> to an Amazon Web Services resource. Tags are key-value pairs that can help you manage,
     * filter, and search for your resources.
     * </p>
     * <p>
     * These include DataSync resources, such as locations, tasks, and task executions.
     * </p>
     * 
     * @param tagResourceRequest
     *        TagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
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
     * Removes tags from an Amazon Web Services resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        UntagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
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
     * Updates the name of an agent.
     * </p>
     * 
     * @param updateAgentRequest
     *        UpdateAgentRequest
     * @return Result of the UpdateAgent operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAgentResult updateAgent(UpdateAgentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAgent(request);
    }

    @SdkInternalApi
    final UpdateAgentResult executeUpdateAgent(UpdateAgentRequest updateAgentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAgentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAgentRequest> request = null;
        Response<UpdateAgentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAgentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAgentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAgent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAgentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAgentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates some parameters of a previously created location for a Hadoop Distributed File System cluster.
     * </p>
     * 
     * @param updateLocationHdfsRequest
     * @return Result of the UpdateLocationHdfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateLocationHdfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationHdfs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateLocationHdfsResult updateLocationHdfs(UpdateLocationHdfsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLocationHdfs(request);
    }

    @SdkInternalApi
    final UpdateLocationHdfsResult executeUpdateLocationHdfs(UpdateLocationHdfsRequest updateLocationHdfsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLocationHdfsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLocationHdfsRequest> request = null;
        Response<UpdateLocationHdfsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLocationHdfsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLocationHdfsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLocationHdfs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLocationHdfsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLocationHdfsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates some of the parameters of a previously created location for Network File System (NFS) access. For
     * information about creating an NFS location, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html">Creating a location for
     * NFS</a>.
     * </p>
     * 
     * @param updateLocationNfsRequest
     * @return Result of the UpdateLocationNfs operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateLocationNfs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationNfs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLocationNfsResult updateLocationNfs(UpdateLocationNfsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLocationNfs(request);
    }

    @SdkInternalApi
    final UpdateLocationNfsResult executeUpdateLocationNfs(UpdateLocationNfsRequest updateLocationNfsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLocationNfsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLocationNfsRequest> request = null;
        Response<UpdateLocationNfsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLocationNfsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLocationNfsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLocationNfs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLocationNfsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLocationNfsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates some parameters of an existing object storage location that DataSync accesses for a transfer. For
     * information about creating a self-managed object storage location, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-object-location.html">Creating a location for
     * object storage</a>.
     * </p>
     * 
     * @param updateLocationObjectStorageRequest
     * @return Result of the UpdateLocationObjectStorage operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateLocationObjectStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationObjectStorage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLocationObjectStorageResult updateLocationObjectStorage(UpdateLocationObjectStorageRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLocationObjectStorage(request);
    }

    @SdkInternalApi
    final UpdateLocationObjectStorageResult executeUpdateLocationObjectStorage(UpdateLocationObjectStorageRequest updateLocationObjectStorageRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLocationObjectStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLocationObjectStorageRequest> request = null;
        Response<UpdateLocationObjectStorageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLocationObjectStorageRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLocationObjectStorageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLocationObjectStorage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLocationObjectStorageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateLocationObjectStorageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates some of the parameters of a previously created location for Server Message Block (SMB) file system
     * access. For information about creating an SMB location, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html">Creating a location for
     * SMB</a>.
     * </p>
     * 
     * @param updateLocationSmbRequest
     * @return Result of the UpdateLocationSmb operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateLocationSmb
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationSmb" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLocationSmbResult updateLocationSmb(UpdateLocationSmbRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLocationSmb(request);
    }

    @SdkInternalApi
    final UpdateLocationSmbResult executeUpdateLocationSmb(UpdateLocationSmbRequest updateLocationSmbRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLocationSmbRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLocationSmbRequest> request = null;
        Response<UpdateLocationSmbResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLocationSmbRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLocationSmbRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLocationSmb");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLocationSmbResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLocationSmbResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the metadata associated with a task.
     * </p>
     * 
     * @param updateTaskRequest
     *        UpdateTaskResponse
     * @return Result of the UpdateTask operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTaskResult updateTask(UpdateTaskRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTask(request);
    }

    @SdkInternalApi
    final UpdateTaskResult executeUpdateTask(UpdateTaskRequest updateTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTaskRequest> request = null;
        Response<UpdateTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTaskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates execution of a task.
     * </p>
     * <p>
     * You can modify bandwidth throttling for a task execution that is running or queued. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/working-with-task-executions.html#adjust-bandwidth-throttling"
     * >Adjusting Bandwidth Throttling for a Task Execution</a>.
     * </p>
     * <note>
     * <p>
     * The only <code>Option</code> that can be modified by <code>UpdateTaskExecution</code> is
     * <code> <a href="https://docs.aws.amazon.com/datasync/latest/userguide/API_Options.html#DataSync-Type-Options-BytesPerSecond">BytesPerSecond</a> </code>
     * .
     * </p>
     * </note>
     * 
     * @param updateTaskExecutionRequest
     * @return Result of the UpdateTaskExecution operation returned by the service.
     * @throws InvalidRequestException
     *         This exception is thrown when the client submits a malformed request.
     * @throws InternalException
     *         This exception is thrown when an error occurs in the DataSync service.
     * @sample AWSDataSync.UpdateTaskExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateTaskExecution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateTaskExecutionResult updateTaskExecution(UpdateTaskExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTaskExecution(request);
    }

    @SdkInternalApi
    final UpdateTaskExecutionResult executeUpdateTaskExecution(UpdateTaskExecutionRequest updateTaskExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTaskExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTaskExecutionRequest> request = null;
        Response<UpdateTaskExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTaskExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTaskExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DataSync");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTaskExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTaskExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTaskExecutionResultJsonUnmarshaller());
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
