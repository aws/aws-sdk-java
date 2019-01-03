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
package com.amazonaws.services.connect;

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

import com.amazonaws.services.connect.AmazonConnectClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.services.connect.model.transform.*;

/**
 * Client for accessing Amazon Connect. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * The Amazon Connect API Reference provides descriptions, syntax, and usage examples for each of the Amazon Connect
 * actions, data types, parameters, and errors. Amazon Connect is a cloud-based contact center solution that makes it
 * easy to set up and manage a customer contact center and provide reliable customer engagement at any scale.
 * </p>
 * <p>
 * Throttling limits for the Amazon Connect API operations:
 * </p>
 * <p>
 * For the <code>GetMetricData</code> and <code>GetCurrentMetricData</code> operations, a RateLimit of 5 per second, and
 * a BurstLimit of 8 per second.
 * </p>
 * <p>
 * For all other operations, a RateLimit of 2 per second, and a BurstLimit of 5 per second.
 * </p>
 * <p>
 * You can request an increase to the throttling limits by submitting a <a
 * href="https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase">Amazon Connect
 * service limits increase form</a>. You must be signed in to your AWS account to access the form.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConnectClient extends AmazonWebServiceClient implements AmazonConnect {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonConnect.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "connect";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserNotFoundException").withModeledClass(
                                    com.amazonaws.services.connect.model.UserNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OutboundContactNotPermittedException").withModeledClass(
                                    com.amazonaws.services.connect.model.OutboundContactNotPermittedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.connect.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.connect.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.connect.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DestinationNotAllowedException").withModeledClass(
                                    com.amazonaws.services.connect.model.DestinationNotAllowedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withModeledClass(
                                    com.amazonaws.services.connect.model.ThrottlingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ContactNotFoundException").withModeledClass(
                                    com.amazonaws.services.connect.model.ContactNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateResourceException").withModeledClass(
                                    com.amazonaws.services.connect.model.DuplicateResourceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceException").withModeledClass(
                                    com.amazonaws.services.connect.model.InternalServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.connect.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.connect.model.AmazonConnectException.class));

    public static AmazonConnectClientBuilder builder() {
        return AmazonConnectClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Connect using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonConnectClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Connect using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonConnectClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("connect.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/connect/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/connect/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new user account in your Amazon Connect instance.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been reached.
     * @throws DuplicateResourceException
     *         A resource with that name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUser" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
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
     * Deletes a user account from Amazon Connect.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUser(request);
    }

    @SdkInternalApi
    final DeleteUserResult executeDeleteUser(DeleteUserRequest deleteUserRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a <code>User</code> object that contains information about the user account specified by the
     * <code>UserId</code>.
     * </p>
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeUserResult describeUser(DescribeUserRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUser(request);
    }

    @SdkInternalApi
    final DescribeUserResult executeDescribeUser(DescribeUserRequest describeUserRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserRequest> request = null;
        Response<DescribeUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a <code>HierarchyGroup</code> object that includes information about a hierarchy group in your instance.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @return Result of the DescribeUserHierarchyGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.DescribeUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeUserHierarchyGroupResult describeUserHierarchyGroup(DescribeUserHierarchyGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUserHierarchyGroup(request);
    }

    @SdkInternalApi
    final DescribeUserHierarchyGroupResult executeDescribeUserHierarchyGroup(DescribeUserHierarchyGroupRequest describeUserHierarchyGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserHierarchyGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserHierarchyGroupRequest> request = null;
        Response<DescribeUserHierarchyGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserHierarchyGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeUserHierarchyGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUserHierarchyGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserHierarchyGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeUserHierarchyGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a <code>HiearchyGroupStructure</code> object, which contains data about the levels in the agent
     * hierarchy.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @return Result of the DescribeUserHierarchyStructure operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.DescribeUserHierarchyStructure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeUserHierarchyStructure"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeUserHierarchyStructureResult describeUserHierarchyStructure(DescribeUserHierarchyStructureRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUserHierarchyStructure(request);
    }

    @SdkInternalApi
    final DescribeUserHierarchyStructureResult executeDescribeUserHierarchyStructure(DescribeUserHierarchyStructureRequest describeUserHierarchyStructureRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUserHierarchyStructureRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUserHierarchyStructureRequest> request = null;
        Response<DescribeUserHierarchyStructureResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUserHierarchyStructureRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeUserHierarchyStructureRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUserHierarchyStructure");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUserHierarchyStructureResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeUserHierarchyStructureResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the contact attributes associated with a contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @return Result of the GetContactAttributes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.GetContactAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetContactAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetContactAttributesResult getContactAttributes(GetContactAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeGetContactAttributes(request);
    }

    @SdkInternalApi
    final GetContactAttributesResult executeGetContactAttributes(GetContactAttributesRequest getContactAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(getContactAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContactAttributesRequest> request = null;
        Response<GetContactAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContactAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContactAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContactAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContactAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContactAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>GetCurrentMetricData</code> operation retrieves current metric data from your Amazon Connect instance.
     * </p>
     * <p>
     * If you are using an IAM account, it must have permission to the <code>connect:GetCurrentMetricData</code> action.
     * </p>
     * 
     * @param getCurrentMetricDataRequest
     * @return Result of the GetCurrentMetricData operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.GetCurrentMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetCurrentMetricData" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCurrentMetricDataResult getCurrentMetricData(GetCurrentMetricDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetCurrentMetricData(request);
    }

    @SdkInternalApi
    final GetCurrentMetricDataResult executeGetCurrentMetricData(GetCurrentMetricDataRequest getCurrentMetricDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getCurrentMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCurrentMetricDataRequest> request = null;
        Response<GetCurrentMetricDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCurrentMetricDataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCurrentMetricDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCurrentMetricData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCurrentMetricDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCurrentMetricDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a token for federation.
     * </p>
     * 
     * @param getFederationTokenRequest
     * @return Result of the GetFederationToken operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws UserNotFoundException
     *         No user with the specified credentials was found in the Amazon Connect instance.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws DuplicateResourceException
     *         A resource with that name already exists.
     * @sample AmazonConnect.GetFederationToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetFederationToken" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFederationTokenResult getFederationToken(GetFederationTokenRequest request) {
        request = beforeClientExecution(request);
        return executeGetFederationToken(request);
    }

    @SdkInternalApi
    final GetFederationTokenResult executeGetFederationToken(GetFederationTokenRequest getFederationTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(getFederationTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFederationTokenRequest> request = null;
        Response<GetFederationTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFederationTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFederationTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFederationToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFederationTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFederationTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>GetMetricData</code> operation retrieves historical metrics data from your Amazon Connect instance.
     * </p>
     * <p>
     * If you are using an IAM account, it must have permission to the <code>connect:GetMetricData</code> action.
     * </p>
     * 
     * @param getMetricDataRequest
     * @return Result of the GetMetricData operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.GetMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetMetricData" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMetricDataResult getMetricData(GetMetricDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetMetricData(request);
    }

    @SdkInternalApi
    final GetMetricDataResult executeGetMetricData(GetMetricDataRequest getMetricDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMetricDataRequest> request = null;
        Response<GetMetricDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMetricDataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMetricDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMetricData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMetricDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMetricDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>RoutingProfileSummary</code> objects that includes information about the routing
     * profiles in your instance.
     * </p>
     * 
     * @param listRoutingProfilesRequest
     * @return Result of the ListRoutingProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListRoutingProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRoutingProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListRoutingProfilesResult listRoutingProfiles(ListRoutingProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListRoutingProfiles(request);
    }

    @SdkInternalApi
    final ListRoutingProfilesResult executeListRoutingProfiles(ListRoutingProfilesRequest listRoutingProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRoutingProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRoutingProfilesRequest> request = null;
        Response<ListRoutingProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRoutingProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRoutingProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRoutingProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRoutingProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRoutingProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of SecurityProfileSummary objects that contain information about the security profiles in your
     * instance, including the ARN, Id, and Name of the security profile.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @return Result of the ListSecurityProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSecurityProfilesResult listSecurityProfiles(ListSecurityProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListSecurityProfiles(request);
    }

    @SdkInternalApi
    final ListSecurityProfilesResult executeListSecurityProfiles(ListSecurityProfilesRequest listSecurityProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSecurityProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecurityProfilesRequest> request = null;
        Response<ListSecurityProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecurityProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSecurityProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSecurityProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSecurityProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSecurityProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a <code>UserHierarchyGroupSummaryList</code>, which is an array of <code>HierarchyGroupSummary</code>
     * objects that contain information about the hierarchy groups in your instance.
     * </p>
     * 
     * @param listUserHierarchyGroupsRequest
     * @return Result of the ListUserHierarchyGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListUserHierarchyGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUserHierarchyGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListUserHierarchyGroupsResult listUserHierarchyGroups(ListUserHierarchyGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListUserHierarchyGroups(request);
    }

    @SdkInternalApi
    final ListUserHierarchyGroupsResult executeListUserHierarchyGroups(ListUserHierarchyGroupsRequest listUserHierarchyGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listUserHierarchyGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserHierarchyGroupsRequest> request = null;
        Response<ListUserHierarchyGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserHierarchyGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listUserHierarchyGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUserHierarchyGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUserHierarchyGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListUserHierarchyGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a <code>UserSummaryList</code>, which is an array of <code>UserSummary</code> objects.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUsers" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
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
     * The <code>StartOutboundVoiceContact</code> operation initiates a contact flow to place an outbound call to a
     * customer.
     * </p>
     * <p>
     * If you are using an IAM account, it must have permission to the <code>connect:StartOutboundVoiceContact</code>
     * action.
     * </p>
     * <p>
     * There is a 60 second dialing timeout for this operation. If the call is not connected after 60 seconds, the call
     * fails.
     * </p>
     * 
     * @param startOutboundVoiceContactRequest
     * @return Result of the StartOutboundVoiceContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been reached.
     * @throws DestinationNotAllowedException
     *         Outbound calls to the destination number are not allowed.
     * @throws OutboundContactNotPermittedException
     *         The contact is not permitted.
     * @sample AmazonConnect.StartOutboundVoiceContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartOutboundVoiceContact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartOutboundVoiceContactResult startOutboundVoiceContact(StartOutboundVoiceContactRequest request) {
        request = beforeClientExecution(request);
        return executeStartOutboundVoiceContact(request);
    }

    @SdkInternalApi
    final StartOutboundVoiceContactResult executeStartOutboundVoiceContact(StartOutboundVoiceContactRequest startOutboundVoiceContactRequest) {

        ExecutionContext executionContext = createExecutionContext(startOutboundVoiceContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartOutboundVoiceContactRequest> request = null;
        Response<StartOutboundVoiceContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartOutboundVoiceContactRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startOutboundVoiceContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartOutboundVoiceContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartOutboundVoiceContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartOutboundVoiceContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Ends the contact initiated by the <code>StartOutboundVoiceContact</code> operation.
     * </p>
     * <p>
     * If you are using an IAM account, it must have permission to the <code>connect:StopContact</code> action.
     * </p>
     * 
     * @param stopContactRequest
     * @return Result of the StopContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ContactNotFoundException
     *         The contact with the specified ID is not active or does not exist.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.StopContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopContactResult stopContact(StopContactRequest request) {
        request = beforeClientExecution(request);
        return executeStopContact(request);
    }

    @SdkInternalApi
    final StopContactResult executeStopContact(StopContactRequest stopContactRequest) {

        ExecutionContext executionContext = createExecutionContext(stopContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopContactRequest> request = null;
        Response<StopContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>UpdateContactAttributes</code> operation lets you programmatically create new, or update existing,
     * contact attributes associated with a contact. You can use the operation to add or update attributes for both
     * ongoing and completed contacts. For example, you can update the customer's name or the reason the customer called
     * while the call is active, or add notes about steps that the agent took during the call that are displayed to the
     * next agent that takes the call. You can also use the <code>UpdateContactAttributes</code> operation to update
     * attributes for a contact using data from your CRM application and save the data with the contact in Amazon
     * Connect. You could also flag calls for additional analysis, such as legal review or identifying abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are then deleted.
     * </p>
     * <p>
     * <i>Important:</i>
     * </p>
     * <p>
     * You cannot use the operation to update attributes for contacts that occurred prior to the release of the API,
     * September 12, 2018. You can update attributes only for contacts that started after the release of the API. If you
     * attempt to update attributes for a contact that occurred prior to the release of the API, a 400 error is
     * returned. This applies also to queued callbacks that were initiated prior to the release of the API but are still
     * active in your instance.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @return Result of the UpdateContactAttributes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateContactAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateContactAttributesResult updateContactAttributes(UpdateContactAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContactAttributes(request);
    }

    @SdkInternalApi
    final UpdateContactAttributesResult executeUpdateContactAttributes(UpdateContactAttributesRequest updateContactAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContactAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactAttributesRequest> request = null;
        Response<UpdateContactAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateContactAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContactAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContactAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateContactAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns the specified hierarchy group to the user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
     * @return Result of the UpdateUserHierarchy operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateUserHierarchy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateUserHierarchyResult updateUserHierarchy(UpdateUserHierarchyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserHierarchy(request);
    }

    @SdkInternalApi
    final UpdateUserHierarchyResult executeUpdateUserHierarchy(UpdateUserHierarchyRequest updateUserHierarchyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserHierarchyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserHierarchyRequest> request = null;
        Response<UpdateUserHierarchyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserHierarchyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserHierarchyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserHierarchy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserHierarchyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserHierarchyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the identity information for the specified user in a <code>UserIdentityInfo</code> object, including
     * email, first name, and last name.
     * </p>
     * 
     * @param updateUserIdentityInfoRequest
     * @return Result of the UpdateUserIdentityInfo operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateUserIdentityInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserIdentityInfo" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateUserIdentityInfoResult updateUserIdentityInfo(UpdateUserIdentityInfoRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserIdentityInfo(request);
    }

    @SdkInternalApi
    final UpdateUserIdentityInfoResult executeUpdateUserIdentityInfo(UpdateUserIdentityInfoRequest updateUserIdentityInfoRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserIdentityInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserIdentityInfoRequest> request = null;
        Response<UpdateUserIdentityInfoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserIdentityInfoRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserIdentityInfoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserIdentityInfo");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserIdentityInfoResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateUserIdentityInfoResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the phone configuration settings in the <code>UserPhoneConfig</code> object for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
     * @return Result of the UpdateUserPhoneConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateUserPhoneConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserPhoneConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateUserPhoneConfigResult updateUserPhoneConfig(UpdateUserPhoneConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserPhoneConfig(request);
    }

    @SdkInternalApi
    final UpdateUserPhoneConfigResult executeUpdateUserPhoneConfig(UpdateUserPhoneConfigRequest updateUserPhoneConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserPhoneConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserPhoneConfigRequest> request = null;
        Response<UpdateUserPhoneConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserPhoneConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserPhoneConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserPhoneConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserPhoneConfigResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateUserPhoneConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns the specified routing profile to a user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
     * @return Result of the UpdateUserRoutingProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateUserRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserRoutingProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateUserRoutingProfileResult updateUserRoutingProfile(UpdateUserRoutingProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserRoutingProfile(request);
    }

    @SdkInternalApi
    final UpdateUserRoutingProfileResult executeUpdateUserRoutingProfile(UpdateUserRoutingProfileRequest updateUserRoutingProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserRoutingProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserRoutingProfileRequest> request = null;
        Response<UpdateUserRoutingProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserRoutingProfileRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateUserRoutingProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserRoutingProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserRoutingProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateUserRoutingProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the security profiles assigned to the user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
     * @return Result of the UpdateUserSecurityProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the parameters provided to the operation are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed due to an error or failure with the service.
     * @sample AmazonConnect.UpdateUserSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserSecurityProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateUserSecurityProfilesResult updateUserSecurityProfiles(UpdateUserSecurityProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserSecurityProfiles(request);
    }

    @SdkInternalApi
    final UpdateUserSecurityProfilesResult executeUpdateUserSecurityProfiles(UpdateUserSecurityProfilesRequest updateUserSecurityProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserSecurityProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserSecurityProfilesRequest> request = null;
        Response<UpdateUserSecurityProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserSecurityProfilesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateUserSecurityProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserSecurityProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserSecurityProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateUserSecurityProfilesResultJsonUnmarshaller());
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
