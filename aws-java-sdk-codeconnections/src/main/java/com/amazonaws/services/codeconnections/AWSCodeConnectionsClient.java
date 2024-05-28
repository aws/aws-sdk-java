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
package com.amazonaws.services.codeconnections;

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

import com.amazonaws.services.codeconnections.AWSCodeConnectionsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.codeconnections.model.*;

import com.amazonaws.services.codeconnections.model.transform.*;

/**
 * Client for accessing AWS CodeConnections. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>AWS CodeConnections</fullname>
 * <p>
 * This Amazon Web Services CodeConnections API Reference provides descriptions and usage examples of the operations and
 * data types for the Amazon Web Services CodeConnections API. You can use the connections API to work with connections
 * and installations.
 * </p>
 * <p>
 * <i>Connections</i> are configurations that you use to connect Amazon Web Services resources to external code
 * repositories. Each connection is a resource that can be given to services such as CodePipeline to connect to a
 * third-party repository such as Bitbucket. For example, you can add the connection in CodePipeline so that it triggers
 * your pipeline when a code change is made to your third-party code repository. Each connection is named and associated
 * with a unique ARN that is used to reference the connection.
 * </p>
 * <p>
 * When you create a connection, the console initiates a third-party connection handshake. <i>Installations</i> are the
 * apps that are used to conduct this handshake. For example, the installation for the Bitbucket provider type is the
 * Bitbucket app. When you create a connection, you can choose an existing installation or create one.
 * </p>
 * <p>
 * When you want to create a connection to an installed provider type such as GitHub Enterprise Server, you create a
 * <i>host</i> for your connections.
 * </p>
 * <p>
 * You can work with connections by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateConnection</a>, which creates a uniquely named connection that can be referenced by services such as
 * CodePipeline.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteConnection</a>, which deletes the specified connection.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetConnection</a>, which returns information about the connection, including the connection status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListConnections</a>, which lists the connections associated with your account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can work with hosts by calling:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateHost</a>, which creates a host that represents the infrastructure where your provider is installed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteHost</a>, which deletes the specified host.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetHost</a>, which returns information about the host, including the setup status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListHosts</a>, which lists the hosts associated with your account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can work with tags in Amazon Web Services CodeConnections by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a>, which gets information about Amazon Web Services tags for a specified Amazon Resource
 * Name (ARN) in Amazon Web Services CodeConnections.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a>, which adds or updates tags for a resource in Amazon Web Services CodeConnections.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a>, which removes tags for a resource in Amazon Web Services CodeConnections.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to use Amazon Web Services CodeConnections, see the <a
 * href="https://docs.aws.amazon.com/dtconsole/latest/userguide/welcome-connections.html">Developer Tools User
 * Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCodeConnectionsClient extends AmazonWebServiceClient implements AWSCodeConnections {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCodeConnections.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codeconnections";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.ConcurrentModificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SyncBlockerDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.SyncBlockerDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.UnsupportedOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.InvalidInputExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedProviderTypeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.UnsupportedProviderTypeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.ResourceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SyncConfigurationStillExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.SyncConfigurationStillExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UpdateOutOfSyncException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.UpdateOutOfSyncExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RetryLatestCommitFailedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.RetryLatestCommitFailedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConditionalCheckFailedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.ConditionalCheckFailedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codeconnections.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.codeconnections.model.AWSCodeConnectionsException.class));

    public static AWSCodeConnectionsClientBuilder builder() {
        return AWSCodeConnectionsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeConnections using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodeConnectionsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS CodeConnections using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCodeConnectionsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("codeconnections.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/codeconnections/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/codeconnections/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a connection that can then be given to other Amazon Web Services services like CodePipeline so that it
     * can access third-party code repositories. The connection is in pending status until the third-party connection
     * handshake is completed from the console.
     * </p>
     * 
     * @param createConnectionRequest
     * @return Result of the CreateConnection operation returned by the service.
     * @throws LimitExceededException
     *         Exceeded the maximum limit for connections.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ResourceUnavailableException
     *         Resource not found. Verify the ARN for the host resource and try again.
     * @sample AWSCodeConnections.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/CreateConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConnectionResult createConnection(CreateConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConnection(request);
    }

    @SdkInternalApi
    final CreateConnectionResult executeCreateConnection(CreateConnectionRequest createConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectionRequest> request = null;
        Response<CreateConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a resource that represents the infrastructure where a third-party provider is installed. The host is used
     * when you create connections to an installed third-party provider type, such as GitHub Enterprise Server. You
     * create one host for all connections to that provider.
     * </p>
     * <note>
     * <p>
     * A host created through the CLI or the SDK is in `PENDING` status by default. You can make its status `AVAILABLE`
     * by setting up the host in the console.
     * </p>
     * </note>
     * 
     * @param createHostRequest
     * @return Result of the CreateHost operation returned by the service.
     * @throws LimitExceededException
     *         Exceeded the maximum limit for connections.
     * @sample AWSCodeConnections.CreateHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/CreateHost" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateHostResult createHost(CreateHostRequest request) {
        request = beforeClientExecution(request);
        return executeCreateHost(request);
    }

    @SdkInternalApi
    final CreateHostResult executeCreateHost(CreateHostRequest createHostRequest) {

        ExecutionContext executionContext = createExecutionContext(createHostRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHostRequest> request = null;
        Response<CreateHostResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHostRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createHostRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateHost");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateHostResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateHostResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a link to a specified external Git repository. A repository link allows Git sync to monitor and sync
     * changes to files in a specified Git repository.
     * </p>
     * 
     * @param createRepositoryLinkRequest
     * @return Result of the CreateRepositoryLink operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws LimitExceededException
     *         Exceeded the maximum limit for connections.
     * @throws ResourceAlreadyExistsException
     *         Unable to create resource. Resource already exists.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeConnections.CreateRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/CreateRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRepositoryLinkResult createRepositoryLink(CreateRepositoryLinkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRepositoryLink(request);
    }

    @SdkInternalApi
    final CreateRepositoryLinkResult executeCreateRepositoryLink(CreateRepositoryLinkRequest createRepositoryLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(createRepositoryLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRepositoryLinkRequest> request = null;
        Response<CreateRepositoryLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRepositoryLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRepositoryLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRepositoryLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRepositoryLinkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRepositoryLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a sync configuration which allows Amazon Web Services to sync content from a Git repository to update a
     * specified Amazon Web Services resource. Parameters for the sync configuration are determined by the sync type.
     * </p>
     * 
     * @param createSyncConfigurationRequest
     * @return Result of the CreateSyncConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws LimitExceededException
     *         Exceeded the maximum limit for connections.
     * @throws ResourceAlreadyExistsException
     *         Unable to create resource. Resource already exists.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeConnections.CreateSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/CreateSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSyncConfigurationResult createSyncConfiguration(CreateSyncConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSyncConfiguration(request);
    }

    @SdkInternalApi
    final CreateSyncConfigurationResult executeCreateSyncConfiguration(CreateSyncConfigurationRequest createSyncConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createSyncConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSyncConfigurationRequest> request = null;
        Response<CreateSyncConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSyncConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSyncConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSyncConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSyncConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSyncConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The connection to be deleted.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @sample AWSCodeConnections.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/DeleteConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConnectionResult deleteConnection(DeleteConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConnection(request);
    }

    @SdkInternalApi
    final DeleteConnectionResult executeDeleteConnection(DeleteConnectionRequest deleteConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectionRequest> request = null;
        Response<DeleteConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The host to be deleted. Before you delete a host, all connections associated to the host must be deleted.
     * </p>
     * <note>
     * <p>
     * A host cannot be deleted if it is in the VPC_CONFIG_INITIALIZING or VPC_CONFIG_DELETING state.
     * </p>
     * </note>
     * 
     * @param deleteHostRequest
     * @return Result of the DeleteHost operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ResourceUnavailableException
     *         Resource not found. Verify the ARN for the host resource and try again.
     * @sample AWSCodeConnections.DeleteHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/DeleteHost" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteHostResult deleteHost(DeleteHostRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteHost(request);
    }

    @SdkInternalApi
    final DeleteHostResult executeDeleteHost(DeleteHostRequest deleteHostRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteHostRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHostRequest> request = null;
        Response<DeleteHostResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHostRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteHostRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteHost");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteHostResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteHostResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the association between your connection and a specified external Git repository.
     * </p>
     * 
     * @param deleteRepositoryLinkRequest
     * @return Result of the DeleteRepositoryLink operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws SyncConfigurationStillExistsException
     *         Unable to continue. The sync blocker still exists.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UnsupportedProviderTypeException
     *         The specified provider type is not supported for connections.
     * @sample AWSCodeConnections.DeleteRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/DeleteRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRepositoryLinkResult deleteRepositoryLink(DeleteRepositoryLinkRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRepositoryLink(request);
    }

    @SdkInternalApi
    final DeleteRepositoryLinkResult executeDeleteRepositoryLink(DeleteRepositoryLinkRequest deleteRepositoryLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRepositoryLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRepositoryLinkRequest> request = null;
        Response<DeleteRepositoryLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRepositoryLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRepositoryLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRepositoryLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRepositoryLinkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRepositoryLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the sync configuration for a specified repository and connection.
     * </p>
     * 
     * @param deleteSyncConfigurationRequest
     * @return Result of the DeleteSyncConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws LimitExceededException
     *         Exceeded the maximum limit for connections.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeConnections.DeleteSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/DeleteSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSyncConfigurationResult deleteSyncConfiguration(DeleteSyncConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSyncConfiguration(request);
    }

    @SdkInternalApi
    final DeleteSyncConfigurationResult executeDeleteSyncConfiguration(DeleteSyncConfigurationRequest deleteSyncConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSyncConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSyncConfigurationRequest> request = null;
        Response<DeleteSyncConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSyncConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSyncConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSyncConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSyncConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSyncConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the connection ARN and details such as status, owner, and provider type.
     * </p>
     * 
     * @param getConnectionRequest
     * @return Result of the GetConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ResourceUnavailableException
     *         Resource not found. Verify the ARN for the host resource and try again.
     * @sample AWSCodeConnections.GetConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/GetConnection" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetConnectionResult getConnection(GetConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeGetConnection(request);
    }

    @SdkInternalApi
    final GetConnectionResult executeGetConnection(GetConnectionRequest getConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(getConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectionRequest> request = null;
        Response<GetConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the host ARN and details such as status, provider type, endpoint, and, if applicable, the VPC
     * configuration.
     * </p>
     * 
     * @param getHostRequest
     * @return Result of the GetHost operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ResourceUnavailableException
     *         Resource not found. Verify the ARN for the host resource and try again.
     * @sample AWSCodeConnections.GetHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/GetHost" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetHostResult getHost(GetHostRequest request) {
        request = beforeClientExecution(request);
        return executeGetHost(request);
    }

    @SdkInternalApi
    final GetHostResult executeGetHost(GetHostRequest getHostRequest) {

        ExecutionContext executionContext = createExecutionContext(getHostRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHostRequest> request = null;
        Response<GetHostResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHostRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getHostRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetHost");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetHostResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetHostResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about a repository link. A repository link allows Git sync to monitor and sync changes from files
     * in a specified Git repository.
     * </p>
     * 
     * @param getRepositoryLinkRequest
     * @return Result of the GetRepositoryLink operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeConnections.GetRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/GetRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRepositoryLinkResult getRepositoryLink(GetRepositoryLinkRequest request) {
        request = beforeClientExecution(request);
        return executeGetRepositoryLink(request);
    }

    @SdkInternalApi
    final GetRepositoryLinkResult executeGetRepositoryLink(GetRepositoryLinkRequest getRepositoryLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(getRepositoryLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositoryLinkRequest> request = null;
        Response<GetRepositoryLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositoryLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRepositoryLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRepositoryLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRepositoryLinkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRepositoryLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about the sync status for a repository. A repository sync uses Git sync to push and pull changes
     * from your remote repository.
     * </p>
     * 
     * @param getRepositorySyncStatusRequest
     * @return Result of the GetRepositorySyncStatus operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeConnections.GetRepositorySyncStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/GetRepositorySyncStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRepositorySyncStatusResult getRepositorySyncStatus(GetRepositorySyncStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetRepositorySyncStatus(request);
    }

    @SdkInternalApi
    final GetRepositorySyncStatusResult executeGetRepositorySyncStatus(GetRepositorySyncStatusRequest getRepositorySyncStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getRepositorySyncStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRepositorySyncStatusRequest> request = null;
        Response<GetRepositorySyncStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRepositorySyncStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRepositorySyncStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRepositorySyncStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRepositorySyncStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRepositorySyncStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the status of the sync with the Git repository for a specific Amazon Web Services resource.
     * </p>
     * 
     * @param getResourceSyncStatusRequest
     * @return Result of the GetResourceSyncStatus operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeConnections.GetResourceSyncStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/GetResourceSyncStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourceSyncStatusResult getResourceSyncStatus(GetResourceSyncStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourceSyncStatus(request);
    }

    @SdkInternalApi
    final GetResourceSyncStatusResult executeGetResourceSyncStatus(GetResourceSyncStatusRequest getResourceSyncStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceSyncStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceSyncStatusRequest> request = null;
        Response<GetResourceSyncStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceSyncStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourceSyncStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourceSyncStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceSyncStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetResourceSyncStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the most recent sync blockers.
     * </p>
     * 
     * @param getSyncBlockerSummaryRequest
     * @return Result of the GetSyncBlockerSummary operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeConnections.GetSyncBlockerSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/GetSyncBlockerSummary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSyncBlockerSummaryResult getSyncBlockerSummary(GetSyncBlockerSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetSyncBlockerSummary(request);
    }

    @SdkInternalApi
    final GetSyncBlockerSummaryResult executeGetSyncBlockerSummary(GetSyncBlockerSummaryRequest getSyncBlockerSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getSyncBlockerSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSyncBlockerSummaryRequest> request = null;
        Response<GetSyncBlockerSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSyncBlockerSummaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSyncBlockerSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSyncBlockerSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSyncBlockerSummaryResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetSyncBlockerSummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about a sync configuration, including the sync type and resource name. A sync configuration
     * allows the configuration to sync (push and pull) changes from the remote repository for a specified branch in a
     * Git repository.
     * </p>
     * 
     * @param getSyncConfigurationRequest
     * @return Result of the GetSyncConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeConnections.GetSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/GetSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSyncConfigurationResult getSyncConfiguration(GetSyncConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetSyncConfiguration(request);
    }

    @SdkInternalApi
    final GetSyncConfigurationResult executeGetSyncConfiguration(GetSyncConfigurationRequest getSyncConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getSyncConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSyncConfigurationRequest> request = null;
        Response<GetSyncConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSyncConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSyncConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSyncConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSyncConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSyncConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the connections associated with your account.
     * </p>
     * 
     * @param listConnectionsRequest
     * @return Result of the ListConnections operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @sample AWSCodeConnections.ListConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/ListConnections"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConnectionsResult listConnections(ListConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeListConnections(request);
    }

    @SdkInternalApi
    final ListConnectionsResult executeListConnections(ListConnectionsRequest listConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConnectionsRequest> request = null;
        Response<ListConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConnectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the hosts associated with your account.
     * </p>
     * 
     * @param listHostsRequest
     * @return Result of the ListHosts operation returned by the service.
     * @sample AWSCodeConnections.ListHosts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/ListHosts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListHostsResult listHosts(ListHostsRequest request) {
        request = beforeClientExecution(request);
        return executeListHosts(request);
    }

    @SdkInternalApi
    final ListHostsResult executeListHosts(ListHostsRequest listHostsRequest) {

        ExecutionContext executionContext = createExecutionContext(listHostsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHostsRequest> request = null;
        Response<ListHostsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHostsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listHostsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListHosts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListHostsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListHostsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the repository links created for connections in your account.
     * </p>
     * 
     * @param listRepositoryLinksRequest
     * @return Result of the ListRepositoryLinks operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeConnections.ListRepositoryLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/ListRepositoryLinks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRepositoryLinksResult listRepositoryLinks(ListRepositoryLinksRequest request) {
        request = beforeClientExecution(request);
        return executeListRepositoryLinks(request);
    }

    @SdkInternalApi
    final ListRepositoryLinksResult executeListRepositoryLinks(ListRepositoryLinksRequest listRepositoryLinksRequest) {

        ExecutionContext executionContext = createExecutionContext(listRepositoryLinksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRepositoryLinksRequest> request = null;
        Response<ListRepositoryLinksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRepositoryLinksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRepositoryLinksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRepositoryLinks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRepositoryLinksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRepositoryLinksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the repository sync definitions for repository links in your account.
     * </p>
     * 
     * @param listRepositorySyncDefinitionsRequest
     * @return Result of the ListRepositorySyncDefinitions operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeConnections.ListRepositorySyncDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/ListRepositorySyncDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRepositorySyncDefinitionsResult listRepositorySyncDefinitions(ListRepositorySyncDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeListRepositorySyncDefinitions(request);
    }

    @SdkInternalApi
    final ListRepositorySyncDefinitionsResult executeListRepositorySyncDefinitions(ListRepositorySyncDefinitionsRequest listRepositorySyncDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRepositorySyncDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRepositorySyncDefinitionsRequest> request = null;
        Response<ListRepositorySyncDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRepositorySyncDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRepositorySyncDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRepositorySyncDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRepositorySyncDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRepositorySyncDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of sync configurations for a specified repository.
     * </p>
     * 
     * @param listSyncConfigurationsRequest
     * @return Result of the ListSyncConfigurations operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeConnections.ListSyncConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/ListSyncConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSyncConfigurationsResult listSyncConfigurations(ListSyncConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListSyncConfigurations(request);
    }

    @SdkInternalApi
    final ListSyncConfigurationsResult executeListSyncConfigurations(ListSyncConfigurationsRequest listSyncConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSyncConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSyncConfigurationsRequest> request = null;
        Response<ListSyncConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSyncConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSyncConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSyncConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSyncConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSyncConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the set of key-value pairs (metadata) that are used to manage the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @sample AWSCodeConnections.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
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
     * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws LimitExceededException
     *         Exceeded the maximum limit for connections.
     * @sample AWSCodeConnections.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
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
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @sample AWSCodeConnections.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
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
     * Updates a specified host with the provided configurations.
     * </p>
     * 
     * @param updateHostRequest
     * @return Result of the UpdateHost operation returned by the service.
     * @throws ConflictException
     *         Two conflicting operations have been made on the same resource.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ResourceUnavailableException
     *         Resource not found. Verify the ARN for the host resource and try again.
     * @throws UnsupportedOperationException
     *         The operation is not supported. Check the connection status and try again.
     * @sample AWSCodeConnections.UpdateHost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/UpdateHost" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateHostResult updateHost(UpdateHostRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateHost(request);
    }

    @SdkInternalApi
    final UpdateHostResult executeUpdateHost(UpdateHostRequest updateHostRequest) {

        ExecutionContext executionContext = createExecutionContext(updateHostRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateHostRequest> request = null;
        Response<UpdateHostResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateHostRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateHostRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateHost");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateHostResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateHostResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the association between your connection and a specified external Git repository. A repository link allows
     * Git sync to monitor and sync changes to files in a specified Git repository.
     * </p>
     * 
     * @param updateRepositoryLinkRequest
     * @return Result of the UpdateRepositoryLink operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConditionalCheckFailedException
     *         The conditional check failed. Try again later.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UpdateOutOfSyncException
     *         The update is out of sync. Try syncing again.
     * @sample AWSCodeConnections.UpdateRepositoryLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/UpdateRepositoryLink"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRepositoryLinkResult updateRepositoryLink(UpdateRepositoryLinkRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRepositoryLink(request);
    }

    @SdkInternalApi
    final UpdateRepositoryLinkResult executeUpdateRepositoryLink(UpdateRepositoryLinkRequest updateRepositoryLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRepositoryLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRepositoryLinkRequest> request = null;
        Response<UpdateRepositoryLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRepositoryLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRepositoryLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRepositoryLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRepositoryLinkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRepositoryLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to update the status of a sync blocker, resolving the blocker and allowing syncing to continue.
     * </p>
     * 
     * @param updateSyncBlockerRequest
     * @return Result of the UpdateSyncBlocker operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws RetryLatestCommitFailedException
     *         Retrying the latest commit failed. Try again later.
     * @throws SyncBlockerDoesNotExistException
     *         Unable to continue. The sync blocker does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCodeConnections.UpdateSyncBlocker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/UpdateSyncBlocker"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSyncBlockerResult updateSyncBlocker(UpdateSyncBlockerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSyncBlocker(request);
    }

    @SdkInternalApi
    final UpdateSyncBlockerResult executeUpdateSyncBlocker(UpdateSyncBlockerRequest updateSyncBlockerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSyncBlockerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSyncBlockerRequest> request = null;
        Response<UpdateSyncBlockerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSyncBlockerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSyncBlockerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSyncBlocker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSyncBlockerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSyncBlockerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the sync configuration for your connection and a specified external Git repository.
     * </p>
     * 
     * @param updateSyncConfigurationRequest
     * @return Result of the UpdateSyncConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws InternalServerException
     *         Received an internal server exception. Try again later.
     * @throws InvalidInputException
     *         The input is not valid. Verify that the action is typed correctly.
     * @throws ResourceNotFoundException
     *         Resource not found. Verify the connection resource ARN and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws UpdateOutOfSyncException
     *         The update is out of sync. Try syncing again.
     * @sample AWSCodeConnections.UpdateSyncConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/UpdateSyncConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSyncConfigurationResult updateSyncConfiguration(UpdateSyncConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSyncConfiguration(request);
    }

    @SdkInternalApi
    final UpdateSyncConfigurationResult executeUpdateSyncConfiguration(UpdateSyncConfigurationRequest updateSyncConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSyncConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSyncConfigurationRequest> request = null;
        Response<UpdateSyncConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSyncConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSyncConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeConnections");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSyncConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSyncConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSyncConfigurationResultJsonUnmarshaller());
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
