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
package com.amazonaws.services.chimesdkidentity;

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

import com.amazonaws.services.chimesdkidentity.AmazonChimeSDKIdentityClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.services.chimesdkidentity.model.transform.*;

/**
 * Client for accessing Amazon Chime SDK Identity. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * The Amazon Chime SDK Identity APIs in this section allow software developers to create and manage unique instances of
 * their messaging applications. These APIs provide the overarching framework for creating and sending messages. For
 * more information about the identity APIs, refer to <a
 * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Identity.html">Amazon
 * Chime SDK identity</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonChimeSDKIdentityClient extends AmazonWebServiceClient implements AmazonChimeSDKIdentity {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonChimeSDKIdentity.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "chime";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkidentity.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkidentity.model.transform.UnauthorizedClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottledClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkidentity.model.transform.ThrottledClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkidentity.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkidentity.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkidentity.model.transform.ResourceLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkidentity.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkidentity.model.transform.ServiceFailureExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.chimesdkidentity.model.AmazonChimeSDKIdentityException.class));

    public static AmazonChimeSDKIdentityClientBuilder builder() {
        return AmazonChimeSDKIdentityClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Chime SDK Identity using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKIdentityClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Chime SDK Identity using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKIdentityClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("identity-chime.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/chimesdkidentity/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/chimesdkidentity/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an Amazon Chime SDK messaging <code>AppInstance</code> under an AWS account. Only SDK messaging customers
     * use this API. <code>CreateAppInstance</code> supports idempotency behavior as described in the AWS API Standard.
     * </p>
     * <p>
     * identity
     * </p>
     * 
     * @param createAppInstanceRequest
     * @return Result of the CreateAppInstance operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.CreateAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/CreateAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAppInstanceResult createAppInstance(CreateAppInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAppInstance(request);
    }

    @SdkInternalApi
    final CreateAppInstanceResult executeCreateAppInstance(CreateAppInstanceRequest createAppInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(createAppInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppInstanceRequest> request = null;
        Response<CreateAppInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAppInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAppInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAppInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAppInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Promotes an <code>AppInstanceUser</code> to an <code>AppInstanceAdmin</code>. The promoted user can perform the
     * following actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChannelModerator</code> actions across all channels in the <code>AppInstance</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteChannelMessage</code> actions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only an <code>AppInstanceUser</code> can be promoted to an <code>AppInstanceAdmin</code> role.
     * </p>
     * 
     * @param createAppInstanceAdminRequest
     * @return Result of the CreateAppInstanceAdmin operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.CreateAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/CreateAppInstanceAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAppInstanceAdminResult createAppInstanceAdmin(CreateAppInstanceAdminRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAppInstanceAdmin(request);
    }

    @SdkInternalApi
    final CreateAppInstanceAdminResult executeCreateAppInstanceAdmin(CreateAppInstanceAdminRequest createAppInstanceAdminRequest) {

        ExecutionContext executionContext = createExecutionContext(createAppInstanceAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppInstanceAdminRequest> request = null;
        Response<CreateAppInstanceAdminResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppInstanceAdminRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAppInstanceAdminRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAppInstanceAdmin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAppInstanceAdminResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAppInstanceAdminResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a user under an Amazon Chime <code>AppInstance</code>. The request consists of a unique
     * <code>appInstanceUserId</code> and <code>Name</code> for that user.
     * </p>
     * 
     * @param createAppInstanceUserRequest
     * @return Result of the CreateAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.CreateAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/CreateAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAppInstanceUserResult createAppInstanceUser(CreateAppInstanceUserRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAppInstanceUser(request);
    }

    @SdkInternalApi
    final CreateAppInstanceUserResult executeCreateAppInstanceUser(CreateAppInstanceUserRequest createAppInstanceUserRequest) {

        ExecutionContext executionContext = createExecutionContext(createAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppInstanceUserRequest> request = null;
        Response<CreateAppInstanceUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppInstanceUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAppInstanceUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAppInstanceUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAppInstanceUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateAppInstanceUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an <code>AppInstance</code> and all associated data asynchronously.
     * </p>
     * 
     * @param deleteAppInstanceRequest
     * @return Result of the DeleteAppInstance operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DeleteAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeleteAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAppInstanceResult deleteAppInstance(DeleteAppInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAppInstance(request);
    }

    @SdkInternalApi
    final DeleteAppInstanceResult executeDeleteAppInstance(DeleteAppInstanceRequest deleteAppInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppInstanceRequest> request = null;
        Response<DeleteAppInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAppInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAppInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAppInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Demotes an <code>AppInstanceAdmin</code> to an <code>AppInstanceUser</code>. This action does not delete the
     * user.
     * </p>
     * 
     * @param deleteAppInstanceAdminRequest
     * @return Result of the DeleteAppInstanceAdmin operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DeleteAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeleteAppInstanceAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAppInstanceAdminResult deleteAppInstanceAdmin(DeleteAppInstanceAdminRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAppInstanceAdmin(request);
    }

    @SdkInternalApi
    final DeleteAppInstanceAdminResult executeDeleteAppInstanceAdmin(DeleteAppInstanceAdminRequest deleteAppInstanceAdminRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppInstanceAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppInstanceAdminRequest> request = null;
        Response<DeleteAppInstanceAdminResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppInstanceAdminRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAppInstanceAdminRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAppInstanceAdmin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppInstanceAdminResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAppInstanceAdminResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param deleteAppInstanceUserRequest
     * @return Result of the DeleteAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DeleteAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeleteAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAppInstanceUserResult deleteAppInstanceUser(DeleteAppInstanceUserRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAppInstanceUser(request);
    }

    @SdkInternalApi
    final DeleteAppInstanceUserResult executeDeleteAppInstanceUser(DeleteAppInstanceUserRequest deleteAppInstanceUserRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppInstanceUserRequest> request = null;
        Response<DeleteAppInstanceUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppInstanceUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAppInstanceUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAppInstanceUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppInstanceUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteAppInstanceUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param deregisterAppInstanceUserEndpointRequest
     * @return Result of the DeregisterAppInstanceUserEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DeregisterAppInstanceUserEndpoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DeregisterAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterAppInstanceUserEndpointResult deregisterAppInstanceUserEndpoint(DeregisterAppInstanceUserEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterAppInstanceUserEndpoint(request);
    }

    @SdkInternalApi
    final DeregisterAppInstanceUserEndpointResult executeDeregisterAppInstanceUserEndpoint(
            DeregisterAppInstanceUserEndpointRequest deregisterAppInstanceUserEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterAppInstanceUserEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterAppInstanceUserEndpointRequest> request = null;
        Response<DeregisterAppInstanceUserEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterAppInstanceUserEndpointRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterAppInstanceUserEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterAppInstanceUserEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterAppInstanceUserEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterAppInstanceUserEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the full details of an <code>AppInstance</code>.
     * </p>
     * 
     * @param describeAppInstanceRequest
     * @return Result of the DescribeAppInstance operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DescribeAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAppInstanceResult describeAppInstance(DescribeAppInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAppInstance(request);
    }

    @SdkInternalApi
    final DescribeAppInstanceResult executeDescribeAppInstance(DescribeAppInstanceRequest describeAppInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAppInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppInstanceRequest> request = null;
        Response<DescribeAppInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAppInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAppInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAppInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAppInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceAdmin</code>.
     * </p>
     * 
     * @param describeAppInstanceAdminRequest
     * @return Result of the DescribeAppInstanceAdmin operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DescribeAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAppInstanceAdminResult describeAppInstanceAdmin(DescribeAppInstanceAdminRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAppInstanceAdmin(request);
    }

    @SdkInternalApi
    final DescribeAppInstanceAdminResult executeDescribeAppInstanceAdmin(DescribeAppInstanceAdminRequest describeAppInstanceAdminRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAppInstanceAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppInstanceAdminRequest> request = null;
        Response<DescribeAppInstanceAdminResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppInstanceAdminRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAppInstanceAdminRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAppInstanceAdmin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAppInstanceAdminResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAppInstanceAdminResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param describeAppInstanceUserRequest
     * @return Result of the DescribeAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DescribeAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAppInstanceUserResult describeAppInstanceUser(DescribeAppInstanceUserRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAppInstanceUser(request);
    }

    @SdkInternalApi
    final DescribeAppInstanceUserResult executeDescribeAppInstanceUser(DescribeAppInstanceUserRequest describeAppInstanceUserRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppInstanceUserRequest> request = null;
        Response<DescribeAppInstanceUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppInstanceUserRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAppInstanceUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAppInstanceUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAppInstanceUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAppInstanceUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param describeAppInstanceUserEndpointRequest
     * @return Result of the DescribeAppInstanceUserEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.DescribeAppInstanceUserEndpoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAppInstanceUserEndpointResult describeAppInstanceUserEndpoint(DescribeAppInstanceUserEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAppInstanceUserEndpoint(request);
    }

    @SdkInternalApi
    final DescribeAppInstanceUserEndpointResult executeDescribeAppInstanceUserEndpoint(
            DescribeAppInstanceUserEndpointRequest describeAppInstanceUserEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAppInstanceUserEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAppInstanceUserEndpointRequest> request = null;
        Response<DescribeAppInstanceUserEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAppInstanceUserEndpointRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAppInstanceUserEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAppInstanceUserEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAppInstanceUserEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAppInstanceUserEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the retention settings for an <code>AppInstance</code>.
     * </p>
     * 
     * @param getAppInstanceRetentionSettingsRequest
     * @return Result of the GetAppInstanceRetentionSettings operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.GetAppInstanceRetentionSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/GetAppInstanceRetentionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAppInstanceRetentionSettingsResult getAppInstanceRetentionSettings(GetAppInstanceRetentionSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAppInstanceRetentionSettings(request);
    }

    @SdkInternalApi
    final GetAppInstanceRetentionSettingsResult executeGetAppInstanceRetentionSettings(
            GetAppInstanceRetentionSettingsRequest getAppInstanceRetentionSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAppInstanceRetentionSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppInstanceRetentionSettingsRequest> request = null;
        Response<GetAppInstanceRetentionSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppInstanceRetentionSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAppInstanceRetentionSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAppInstanceRetentionSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAppInstanceRetentionSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAppInstanceRetentionSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the administrators in the <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceAdminsRequest
     * @return Result of the ListAppInstanceAdmins operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.ListAppInstanceAdmins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceAdmins"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAppInstanceAdminsResult listAppInstanceAdmins(ListAppInstanceAdminsRequest request) {
        request = beforeClientExecution(request);
        return executeListAppInstanceAdmins(request);
    }

    @SdkInternalApi
    final ListAppInstanceAdminsResult executeListAppInstanceAdmins(ListAppInstanceAdminsRequest listAppInstanceAdminsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppInstanceAdminsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppInstanceAdminsRequest> request = null;
        Response<ListAppInstanceAdminsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppInstanceAdminsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppInstanceAdminsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppInstanceAdmins");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppInstanceAdminsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAppInstanceAdminsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the <code>AppInstanceUserEndpoints</code> created under a single <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param listAppInstanceUserEndpointsRequest
     * @return Result of the ListAppInstanceUserEndpoints operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.ListAppInstanceUserEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceUserEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAppInstanceUserEndpointsResult listAppInstanceUserEndpoints(ListAppInstanceUserEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeListAppInstanceUserEndpoints(request);
    }

    @SdkInternalApi
    final ListAppInstanceUserEndpointsResult executeListAppInstanceUserEndpoints(ListAppInstanceUserEndpointsRequest listAppInstanceUserEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppInstanceUserEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppInstanceUserEndpointsRequest> request = null;
        Response<ListAppInstanceUserEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppInstanceUserEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAppInstanceUserEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppInstanceUserEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppInstanceUserEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAppInstanceUserEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all <code>AppInstanceUsers</code> created under a single <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceUsersRequest
     * @return Result of the ListAppInstanceUsers operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.ListAppInstanceUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstanceUsers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAppInstanceUsersResult listAppInstanceUsers(ListAppInstanceUsersRequest request) {
        request = beforeClientExecution(request);
        return executeListAppInstanceUsers(request);
    }

    @SdkInternalApi
    final ListAppInstanceUsersResult executeListAppInstanceUsers(ListAppInstanceUsersRequest listAppInstanceUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppInstanceUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppInstanceUsersRequest> request = null;
        Response<ListAppInstanceUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppInstanceUsersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppInstanceUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppInstanceUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppInstanceUsersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAppInstanceUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Amazon Chime <code>AppInstance</code>s created under a single AWS account.
     * </p>
     * 
     * @param listAppInstancesRequest
     * @return Result of the ListAppInstances operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.ListAppInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListAppInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAppInstancesResult listAppInstances(ListAppInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListAppInstances(request);
    }

    @SdkInternalApi
    final ListAppInstancesResult executeListAppInstances(ListAppInstancesRequest listAppInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppInstancesRequest> request = null;
        Response<ListAppInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAppInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAppInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
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
     * Sets the amount of time in days that a given <code>AppInstance</code> retains data.
     * </p>
     * 
     * @param putAppInstanceRetentionSettingsRequest
     * @return Result of the PutAppInstanceRetentionSettings operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.PutAppInstanceRetentionSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/PutAppInstanceRetentionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutAppInstanceRetentionSettingsResult putAppInstanceRetentionSettings(PutAppInstanceRetentionSettingsRequest request) {
        request = beforeClientExecution(request);
        return executePutAppInstanceRetentionSettings(request);
    }

    @SdkInternalApi
    final PutAppInstanceRetentionSettingsResult executePutAppInstanceRetentionSettings(
            PutAppInstanceRetentionSettingsRequest putAppInstanceRetentionSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(putAppInstanceRetentionSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAppInstanceRetentionSettingsRequest> request = null;
        Response<PutAppInstanceRetentionSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAppInstanceRetentionSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putAppInstanceRetentionSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAppInstanceRetentionSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAppInstanceRetentionSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutAppInstanceRetentionSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers an endpoint under an Amazon Chime <code>AppInstanceUser</code>. The endpoint receives messages for a
     * user. For push notifications, the endpoint is a mobile device used to receive mobile push notifications for a
     * user.
     * </p>
     * 
     * @param registerAppInstanceUserEndpointRequest
     * @return Result of the RegisterAppInstanceUserEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.RegisterAppInstanceUserEndpoint
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/RegisterAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterAppInstanceUserEndpointResult registerAppInstanceUserEndpoint(RegisterAppInstanceUserEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterAppInstanceUserEndpoint(request);
    }

    @SdkInternalApi
    final RegisterAppInstanceUserEndpointResult executeRegisterAppInstanceUserEndpoint(
            RegisterAppInstanceUserEndpointRequest registerAppInstanceUserEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(registerAppInstanceUserEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterAppInstanceUserEndpointRequest> request = null;
        Response<RegisterAppInstanceUserEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterAppInstanceUserEndpointRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerAppInstanceUserEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterAppInstanceUserEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterAppInstanceUserEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterAppInstanceUserEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/TagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
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
     * Removes the specified tags from the specified Amazon Chime SDK identity resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UntagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
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
     * Updates <code>AppInstance</code> metadata.
     * </p>
     * 
     * @param updateAppInstanceRequest
     * @return Result of the UpdateAppInstance operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.UpdateAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAppInstanceResult updateAppInstance(UpdateAppInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAppInstance(request);
    }

    @SdkInternalApi
    final UpdateAppInstanceResult executeUpdateAppInstance(UpdateAppInstanceRequest updateAppInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAppInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppInstanceRequest> request = null;
        Response<UpdateAppInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAppInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAppInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAppInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAppInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the details of an <code>AppInstanceUser</code>. You can update names and metadata.
     * </p>
     * 
     * @param updateAppInstanceUserRequest
     * @return Result of the UpdateAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.UpdateAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAppInstanceUserResult updateAppInstanceUser(UpdateAppInstanceUserRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAppInstanceUser(request);
    }

    @SdkInternalApi
    final UpdateAppInstanceUserResult executeUpdateAppInstanceUser(UpdateAppInstanceUserRequest updateAppInstanceUserRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAppInstanceUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppInstanceUserRequest> request = null;
        Response<UpdateAppInstanceUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppInstanceUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAppInstanceUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAppInstanceUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAppInstanceUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateAppInstanceUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the details of an <code>AppInstanceUserEndpoint</code>. You can update the name and
     * <code>AllowMessage</code> values.
     * </p>
     * 
     * @param updateAppInstanceUserEndpointRequest
     * @return Result of the UpdateAppInstanceUserEndpoint operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKIdentity.UpdateAppInstanceUserEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstanceUserEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAppInstanceUserEndpointResult updateAppInstanceUserEndpoint(UpdateAppInstanceUserEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAppInstanceUserEndpoint(request);
    }

    @SdkInternalApi
    final UpdateAppInstanceUserEndpointResult executeUpdateAppInstanceUserEndpoint(UpdateAppInstanceUserEndpointRequest updateAppInstanceUserEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAppInstanceUserEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppInstanceUserEndpointRequest> request = null;
        Response<UpdateAppInstanceUserEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppInstanceUserEndpointRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAppInstanceUserEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Identity");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAppInstanceUserEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAppInstanceUserEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAppInstanceUserEndpointResultJsonUnmarshaller());
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
