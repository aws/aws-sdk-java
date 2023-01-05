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
package com.amazonaws.services.finspacedata;

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

import com.amazonaws.services.finspacedata.AWSFinSpaceDataClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.finspacedata.model.*;
import com.amazonaws.services.finspacedata.model.transform.*;

/**
 * Client for accessing FinSpace Data. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * The FinSpace APIs let you take actions inside the FinSpace.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSFinSpaceDataClient extends AmazonWebServiceClient implements AWSFinSpaceData {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSFinSpaceData.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "finspace-api";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.finspacedata.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.finspacedata.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.finspacedata.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.finspacedata.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.finspacedata.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.finspacedata.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.finspacedata.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.finspacedata.model.AWSFinSpaceDataException.class));

    public static AWSFinSpaceDataClientBuilder builder() {
        return AWSFinSpaceDataClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on FinSpace Data using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSFinSpaceDataClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on FinSpace Data using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSFinSpaceDataClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("finspace-api.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/finspacedata/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/finspacedata/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds a user account to a permission group to grant permissions for actions a user can perform in FinSpace.
     * </p>
     * 
     * @param associateUserToPermissionGroupRequest
     * @return Result of the AssociateUserToPermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.AssociateUserToPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/AssociateUserToPermissionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateUserToPermissionGroupResult associateUserToPermissionGroup(AssociateUserToPermissionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateUserToPermissionGroup(request);
    }

    @SdkInternalApi
    final AssociateUserToPermissionGroupResult executeAssociateUserToPermissionGroup(AssociateUserToPermissionGroupRequest associateUserToPermissionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(associateUserToPermissionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateUserToPermissionGroupRequest> request = null;
        Response<AssociateUserToPermissionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateUserToPermissionGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateUserToPermissionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateUserToPermissionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateUserToPermissionGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateUserToPermissionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Changeset in a FinSpace Dataset.
     * </p>
     * 
     * @param createChangesetRequest
     *        The request for a CreateChangeset operation.
     * @return Result of the CreateChangeset operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.CreateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateChangesetResult createChangeset(CreateChangesetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChangeset(request);
    }

    @SdkInternalApi
    final CreateChangesetResult executeCreateChangeset(CreateChangesetRequest createChangesetRequest) {

        ExecutionContext executionContext = createExecutionContext(createChangesetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChangesetRequest> request = null;
        Response<CreateChangesetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChangesetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createChangesetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChangeset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateChangesetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateChangesetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Dataview for a Dataset.
     * </p>
     * 
     * @param createDataViewRequest
     *        Request for creating a data view.
     * @return Result of the CreateDataView operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.CreateDataView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataView" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDataViewResult createDataView(CreateDataViewRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataView(request);
    }

    @SdkInternalApi
    final CreateDataViewResult executeCreateDataView(CreateDataViewRequest createDataViewRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataViewRequest> request = null;
        Response<CreateDataViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDataViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataViewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDataViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new FinSpace Dataset.
     * </p>
     * 
     * @param createDatasetRequest
     *        The request for a CreateDataset operation
     * @return Result of the CreateDataset operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDatasetResult createDataset(CreateDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataset(request);
    }

    @SdkInternalApi
    final CreateDatasetResult executeCreateDataset(CreateDatasetRequest createDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatasetRequest> request = null;
        Response<CreateDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a group of permissions for various actions that a user can perform in FinSpace.
     * </p>
     * 
     * @param createPermissionGroupRequest
     * @return Result of the CreatePermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.CreatePermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreatePermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePermissionGroupResult createPermissionGroup(CreatePermissionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePermissionGroup(request);
    }

    @SdkInternalApi
    final CreatePermissionGroupResult executeCreatePermissionGroup(CreatePermissionGroupRequest createPermissionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createPermissionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePermissionGroupRequest> request = null;
        Response<CreatePermissionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePermissionGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPermissionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePermissionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePermissionGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreatePermissionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new user in FinSpace.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUserResult createUser(CreateUserRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUser(request);
    }

    @SdkInternalApi
    final CreateUserResult executeCreateUser(CreateUserRequest createUserRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a FinSpace Dataset.
     * </p>
     * 
     * @param deleteDatasetRequest
     *        The request for a DeleteDataset operation.
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataset(request);
    }

    @SdkInternalApi
    final DeleteDatasetResult executeDeleteDataset(DeleteDatasetRequest deleteDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetRequest> request = null;
        Response<DeleteDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a permission group. This action is irreversible.
     * </p>
     * 
     * @param deletePermissionGroupRequest
     * @return Result of the DeletePermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.DeletePermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DeletePermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePermissionGroupResult deletePermissionGroup(DeletePermissionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePermissionGroup(request);
    }

    @SdkInternalApi
    final DeletePermissionGroupResult executeDeletePermissionGroup(DeletePermissionGroupRequest deletePermissionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePermissionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePermissionGroupRequest> request = null;
        Response<DeletePermissionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePermissionGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePermissionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePermissionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePermissionGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeletePermissionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Denies access to the FinSpace web application and API for the specified user.
     * </p>
     * 
     * @param disableUserRequest
     * @return Result of the DisableUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.DisableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DisableUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisableUserResult disableUser(DisableUserRequest request) {
        request = beforeClientExecution(request);
        return executeDisableUser(request);
    }

    @SdkInternalApi
    final DisableUserResult executeDisableUser(DisableUserRequest disableUserRequest) {

        ExecutionContext executionContext = createExecutionContext(disableUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableUserRequest> request = null;
        Response<DisableUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a user account from a permission group.
     * </p>
     * 
     * @param disassociateUserFromPermissionGroupRequest
     * @return Result of the DisassociateUserFromPermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.DisassociateUserFromPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/DisassociateUserFromPermissionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateUserFromPermissionGroupResult disassociateUserFromPermissionGroup(DisassociateUserFromPermissionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateUserFromPermissionGroup(request);
    }

    @SdkInternalApi
    final DisassociateUserFromPermissionGroupResult executeDisassociateUserFromPermissionGroup(
            DisassociateUserFromPermissionGroupRequest disassociateUserFromPermissionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateUserFromPermissionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateUserFromPermissionGroupRequest> request = null;
        Response<DisassociateUserFromPermissionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateUserFromPermissionGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateUserFromPermissionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateUserFromPermissionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateUserFromPermissionGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateUserFromPermissionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows the specified user to access the FinSpace web application and API.
     * </p>
     * 
     * @param enableUserRequest
     * @return Result of the EnableUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws LimitExceededException
     *         A limit has exceeded.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.EnableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/EnableUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableUserResult enableUser(EnableUserRequest request) {
        request = beforeClientExecution(request);
        return executeEnableUser(request);
    }

    @SdkInternalApi
    final EnableUserResult executeEnableUser(EnableUserRequest enableUserRequest) {

        ExecutionContext executionContext = createExecutionContext(enableUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableUserRequest> request = null;
        Response<EnableUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get information about a Changeset.
     * </p>
     * 
     * @param getChangesetRequest
     *        Request to describe a changeset.
     * @return Result of the GetChangeset operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.GetChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetChangesetResult getChangeset(GetChangesetRequest request) {
        request = beforeClientExecution(request);
        return executeGetChangeset(request);
    }

    @SdkInternalApi
    final GetChangesetResult executeGetChangeset(GetChangesetRequest getChangesetRequest) {

        ExecutionContext executionContext = createExecutionContext(getChangesetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChangesetRequest> request = null;
        Response<GetChangesetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChangesetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChangesetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChangeset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChangesetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetChangesetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a Dataview.
     * </p>
     * 
     * @param getDataViewRequest
     *        Request for retrieving a data view detail. Grouped / accessible within a dataset by its dataset id.
     * @return Result of the GetDataView operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.GetDataView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetDataView" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDataViewResult getDataView(GetDataViewRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataView(request);
    }

    @SdkInternalApi
    final GetDataViewResult executeGetDataView(GetDataViewRequest getDataViewRequest) {

        ExecutionContext executionContext = createExecutionContext(getDataViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataViewRequest> request = null;
        Response<GetDataViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDataViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDataViewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDataViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a Dataset.
     * </p>
     * 
     * @param getDatasetRequest
     *        Request for the GetDataset operation.
     * @return Result of the GetDataset operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.GetDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDatasetResult getDataset(GetDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeGetDataset(request);
    }

    @SdkInternalApi
    final GetDatasetResult executeGetDataset(GetDatasetRequest getDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(getDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatasetRequest> request = null;
        Response<GetDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDatasetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the credentials to access the external Dataview from an S3 location. To call this API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must retrieve the programmatic credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must be a member of a FinSpace user group, where the dataset that you want to access has
     * <code>Read Dataset Data</code> permissions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getExternalDataViewAccessDetailsRequest
     * @return Result of the GetExternalDataViewAccessDetails operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSFinSpaceData.GetExternalDataViewAccessDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetExternalDataViewAccessDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetExternalDataViewAccessDetailsResult getExternalDataViewAccessDetails(GetExternalDataViewAccessDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetExternalDataViewAccessDetails(request);
    }

    @SdkInternalApi
    final GetExternalDataViewAccessDetailsResult executeGetExternalDataViewAccessDetails(
            GetExternalDataViewAccessDetailsRequest getExternalDataViewAccessDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getExternalDataViewAccessDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetExternalDataViewAccessDetailsRequest> request = null;
        Response<GetExternalDataViewAccessDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetExternalDataViewAccessDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getExternalDataViewAccessDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetExternalDataViewAccessDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetExternalDataViewAccessDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetExternalDataViewAccessDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of a specific permission group.
     * </p>
     * 
     * @param getPermissionGroupRequest
     * @return Result of the GetPermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.GetPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetPermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPermissionGroupResult getPermissionGroup(GetPermissionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetPermissionGroup(request);
    }

    @SdkInternalApi
    final GetPermissionGroupResult executeGetPermissionGroup(GetPermissionGroupRequest getPermissionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getPermissionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPermissionGroupRequest> request = null;
        Response<GetPermissionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPermissionGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPermissionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPermissionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPermissionGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPermissionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Request programmatic credentials to use with FinSpace SDK.
     * </p>
     * 
     * @param getProgrammaticAccessCredentialsRequest
     *        Request for GetProgrammaticAccessCredentials operation
     * @return Result of the GetProgrammaticAccessCredentials operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSFinSpaceData.GetProgrammaticAccessCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetProgrammaticAccessCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetProgrammaticAccessCredentialsResult getProgrammaticAccessCredentials(GetProgrammaticAccessCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeGetProgrammaticAccessCredentials(request);
    }

    @SdkInternalApi
    final GetProgrammaticAccessCredentialsResult executeGetProgrammaticAccessCredentials(
            GetProgrammaticAccessCredentialsRequest getProgrammaticAccessCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(getProgrammaticAccessCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProgrammaticAccessCredentialsRequest> request = null;
        Response<GetProgrammaticAccessCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProgrammaticAccessCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getProgrammaticAccessCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProgrammaticAccessCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProgrammaticAccessCredentialsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetProgrammaticAccessCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details for a specific user.
     * </p>
     * 
     * @param getUserRequest
     * @return Result of the GetUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetUserResult getUser(GetUserRequest request) {
        request = beforeClientExecution(request);
        return executeGetUser(request);
    }

    @SdkInternalApi
    final GetUserResult executeGetUser(GetUserRequest getUserRequest) {

        ExecutionContext executionContext = createExecutionContext(getUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserRequest> request = null;
        Response<GetUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A temporary Amazon S3 location, where you can copy your files from a source location to stage or use as a scratch
     * space in FinSpace notebook.
     * </p>
     * 
     * @param getWorkingLocationRequest
     * @return Result of the GetWorkingLocation operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSFinSpaceData.GetWorkingLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetWorkingLocation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetWorkingLocationResult getWorkingLocation(GetWorkingLocationRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorkingLocation(request);
    }

    @SdkInternalApi
    final GetWorkingLocationResult executeGetWorkingLocation(GetWorkingLocationRequest getWorkingLocationRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorkingLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkingLocationRequest> request = null;
        Response<GetWorkingLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkingLocationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorkingLocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorkingLocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkingLocationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkingLocationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the FinSpace Changesets for a Dataset.
     * </p>
     * 
     * @param listChangesetsRequest
     *        Request to ListChangesetsRequest. It exposes minimal query filters.
     * @return Result of the ListChangesets operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.ListChangesets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListChangesets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListChangesetsResult listChangesets(ListChangesetsRequest request) {
        request = beforeClientExecution(request);
        return executeListChangesets(request);
    }

    @SdkInternalApi
    final ListChangesetsResult executeListChangesets(ListChangesetsRequest listChangesetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listChangesetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChangesetsRequest> request = null;
        Response<ListChangesetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChangesetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChangesetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChangesets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChangesetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChangesetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all available Dataviews for a Dataset.
     * </p>
     * 
     * @param listDataViewsRequest
     *        Request for a list data views.
     * @return Result of the ListDataViews operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.ListDataViews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDataViews" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDataViewsResult listDataViews(ListDataViewsRequest request) {
        request = beforeClientExecution(request);
        return executeListDataViews(request);
    }

    @SdkInternalApi
    final ListDataViewsResult executeListDataViews(ListDataViewsRequest listDataViewsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDataViewsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDataViewsRequest> request = null;
        Response<ListDataViewsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDataViewsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDataViewsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDataViews");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDataViewsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDataViewsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the active Datasets that a user has access to.
     * </p>
     * 
     * @param listDatasetsRequest
     *        Request for the ListDatasets operation.
     * @return Result of the ListDatasets operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDatasetsResult listDatasets(ListDatasetsRequest request) {
        request = beforeClientExecution(request);
        return executeListDatasets(request);
    }

    @SdkInternalApi
    final ListDatasetsResult executeListDatasets(ListDatasetsRequest listDatasetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatasetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetsRequest> request = null;
        Response<ListDatasetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatasetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatasets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatasetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatasetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all available permission groups in FinSpace.
     * </p>
     * 
     * @param listPermissionGroupsRequest
     * @return Result of the ListPermissionGroups operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSFinSpaceData.ListPermissionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListPermissionGroups" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPermissionGroupsResult listPermissionGroups(ListPermissionGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListPermissionGroups(request);
    }

    @SdkInternalApi
    final ListPermissionGroupsResult executeListPermissionGroups(ListPermissionGroupsRequest listPermissionGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPermissionGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPermissionGroupsRequest> request = null;
        Response<ListPermissionGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPermissionGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPermissionGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPermissionGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPermissionGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPermissionGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the permission groups that are associated with a specific user account.
     * </p>
     * 
     * @param listPermissionGroupsByUserRequest
     * @return Result of the ListPermissionGroupsByUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.ListPermissionGroupsByUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListPermissionGroupsByUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPermissionGroupsByUserResult listPermissionGroupsByUser(ListPermissionGroupsByUserRequest request) {
        request = beforeClientExecution(request);
        return executeListPermissionGroupsByUser(request);
    }

    @SdkInternalApi
    final ListPermissionGroupsByUserResult executeListPermissionGroupsByUser(ListPermissionGroupsByUserRequest listPermissionGroupsByUserRequest) {

        ExecutionContext executionContext = createExecutionContext(listPermissionGroupsByUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPermissionGroupsByUserRequest> request = null;
        Response<ListPermissionGroupsByUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPermissionGroupsByUserRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPermissionGroupsByUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPermissionGroupsByUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPermissionGroupsByUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPermissionGroupsByUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all available user accounts in FinSpace.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSFinSpaceData.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUsersResult listUsers(ListUsersRequest request) {
        request = beforeClientExecution(request);
        return executeListUsers(request);
    }

    @SdkInternalApi
    final ListUsersResult executeListUsers(ListUsersRequest listUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(listUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersRequest> request = null;
        Response<ListUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUsersResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists details of all the users in a specific permission group.
     * </p>
     * 
     * @param listUsersByPermissionGroupRequest
     * @return Result of the ListUsersByPermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.ListUsersByPermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ListUsersByPermissionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListUsersByPermissionGroupResult listUsersByPermissionGroup(ListUsersByPermissionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeListUsersByPermissionGroup(request);
    }

    @SdkInternalApi
    final ListUsersByPermissionGroupResult executeListUsersByPermissionGroup(ListUsersByPermissionGroupRequest listUsersByPermissionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(listUsersByPermissionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsersByPermissionGroupRequest> request = null;
        Response<ListUsersByPermissionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsersByPermissionGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listUsersByPermissionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUsersByPermissionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUsersByPermissionGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListUsersByPermissionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resets the password for a specified user ID and generates a temporary one. Only a superuser can reset password
     * for other users. Resetting the password immediately invalidates the previous password associated with the user.
     * </p>
     * 
     * @param resetUserPasswordRequest
     * @return Result of the ResetUserPassword operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.ResetUserPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ResetUserPassword" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResetUserPasswordResult resetUserPassword(ResetUserPasswordRequest request) {
        request = beforeClientExecution(request);
        return executeResetUserPassword(request);
    }

    @SdkInternalApi
    final ResetUserPasswordResult executeResetUserPassword(ResetUserPasswordRequest resetUserPasswordRequest) {

        ExecutionContext executionContext = createExecutionContext(resetUserPasswordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetUserPasswordRequest> request = null;
        Response<ResetUserPasswordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetUserPasswordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resetUserPasswordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetUserPassword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetUserPasswordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResetUserPasswordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a FinSpace Changeset.
     * </p>
     * 
     * @param updateChangesetRequest
     *        Request to update an existing changeset.
     * @return Result of the UpdateChangeset operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.UpdateChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateChangesetResult updateChangeset(UpdateChangesetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateChangeset(request);
    }

    @SdkInternalApi
    final UpdateChangesetResult executeUpdateChangeset(UpdateChangesetRequest updateChangesetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateChangesetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChangesetRequest> request = null;
        Response<UpdateChangesetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChangesetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateChangesetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateChangeset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateChangesetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateChangesetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a FinSpace Dataset.
     * </p>
     * 
     * @param updateDatasetRequest
     *        The request for an UpdateDataset operation
     * @return Result of the UpdateDataset operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSFinSpaceData.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDatasetResult updateDataset(UpdateDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataset(request);
    }

    @SdkInternalApi
    final UpdateDatasetResult executeUpdateDataset(UpdateDatasetRequest updateDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatasetRequest> request = null;
        Response<UpdateDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the details of a permission group. You cannot modify a <code>permissionGroupID</code>.
     * </p>
     * 
     * @param updatePermissionGroupRequest
     * @return Result of the UpdatePermissionGroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.UpdatePermissionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdatePermissionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdatePermissionGroupResult updatePermissionGroup(UpdatePermissionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePermissionGroup(request);
    }

    @SdkInternalApi
    final UpdatePermissionGroupResult executeUpdatePermissionGroup(UpdatePermissionGroupRequest updatePermissionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePermissionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePermissionGroupRequest> request = null;
        Response<UpdatePermissionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePermissionGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePermissionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePermissionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePermissionGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdatePermissionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the details of the specified user account. You cannot update the <code>userId</code> for a user.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ConflictException
     *         The request conflicts with an existing resource.
     * @sample AWSFinSpaceData.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateUserResult updateUser(UpdateUserRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUser(request);
    }

    @SdkInternalApi
    final UpdateUserResult executeUpdateUser(UpdateUserRequest updateUserRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserRequest> request = null;
        Response<UpdateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "finspace data");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserResultJsonUnmarshaller());
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
