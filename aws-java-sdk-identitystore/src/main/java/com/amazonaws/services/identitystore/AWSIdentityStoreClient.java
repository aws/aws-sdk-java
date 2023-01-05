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
package com.amazonaws.services.identitystore;

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

import com.amazonaws.services.identitystore.AWSIdentityStoreClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.identitystore.model.*;
import com.amazonaws.services.identitystore.model.transform.*;

/**
 * Client for accessing IdentityStore. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * The Identity Store service used by AWS IAM Identity Center (successor to AWS Single Sign-On) provides a single place
 * to retrieve all of your identities (users and groups). For more information, see the <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html">IAM Identity Center User Guide</a>.
 * </p>
 * 
 * <pre>
 * <code> &lt;note&gt; &lt;p&gt;Although AWS Single Sign-On was renamed, the &lt;code&gt;sso&lt;/code&gt; and &lt;code&gt;identitystore&lt;/code&gt; API namespaces will continue to retain their original name for backward compatibility purposes. For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html#renamed&quot;&gt;IAM Identity Center rename&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;This reference guide describes the identity store operations that you can call programatically and includes detailed information on data types and errors.&lt;/p&gt; </code>
 * </pre>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIdentityStoreClient extends AmazonWebServiceClient implements AWSIdentityStore {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIdentityStore.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "identitystore";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.identitystore.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.identitystore.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.identitystore.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.identitystore.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.identitystore.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.identitystore.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.identitystore.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.identitystore.model.AWSIdentityStoreException.class));

    public static AWSIdentityStoreClientBuilder builder() {
        return AWSIdentityStoreClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on IdentityStore using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIdentityStoreClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on IdentityStore using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIdentityStoreClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("identitystore.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/identitystore/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/identitystore/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a group within the specified identity store.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ServiceQuotaExceededException
     *         The request would cause the number of users or groups in the identity store to exceed the maximum
     *         allowed.
     * @sample AWSIdentityStore.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGroupResult createGroup(CreateGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGroup(request);
    }

    @SdkInternalApi
    final CreateGroupResult executeCreateGroup(CreateGroupRequest createGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupRequest> request = null;
        Response<CreateGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a relationship between a member and a group. The following identifiers must be specified:
     * <code>GroupId</code>, <code>IdentityStoreId</code>, and <code>MemberId</code>.
     * </p>
     * 
     * @param createGroupMembershipRequest
     * @return Result of the CreateGroupMembership operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ServiceQuotaExceededException
     *         The request would cause the number of users or groups in the identity store to exceed the maximum
     *         allowed.
     * @sample AWSIdentityStore.CreateGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/CreateGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateGroupMembershipResult createGroupMembership(CreateGroupMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGroupMembership(request);
    }

    @SdkInternalApi
    final CreateGroupMembershipResult executeCreateGroupMembership(CreateGroupMembershipRequest createGroupMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(createGroupMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGroupMembershipRequest> request = null;
        Response<CreateGroupMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGroupMembershipRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGroupMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGroupMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGroupMembershipResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateGroupMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new user within the specified identity store.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ServiceQuotaExceededException
     *         The request would cause the number of users or groups in the identity store to exceed the maximum
     *         allowed.
     * @sample AWSIdentityStore.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/CreateUser" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
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
     * Delete a group within an identity store given <code>GroupId</code>.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteGroupResult deleteGroup(DeleteGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGroup(request);
    }

    @SdkInternalApi
    final DeleteGroupResult executeDeleteGroup(DeleteGroupRequest deleteGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupRequest> request = null;
        Response<DeleteGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a membership within a group given <code>MembershipId</code>.
     * </p>
     * 
     * @param deleteGroupMembershipRequest
     * @return Result of the DeleteGroupMembership operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.DeleteGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DeleteGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteGroupMembershipResult deleteGroupMembership(DeleteGroupMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGroupMembership(request);
    }

    @SdkInternalApi
    final DeleteGroupMembershipResult executeDeleteGroupMembership(DeleteGroupMembershipRequest deleteGroupMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGroupMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGroupMembershipRequest> request = null;
        Response<DeleteGroupMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGroupMembershipRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGroupMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGroupMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGroupMembershipResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteGroupMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a user within an identity store given <code>UserId</code>.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DeleteUser" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
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
     * Retrieves the group metadata and attributes from <code>GroupId</code> in an identity store.
     * </p>
     * 
     * @param describeGroupRequest
     * @return Result of the DescribeGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.DescribeGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeGroupResult describeGroup(DescribeGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGroup(request);
    }

    @SdkInternalApi
    final DescribeGroupResult executeDescribeGroup(DescribeGroupRequest describeGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGroupRequest> request = null;
        Response<DescribeGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves membership metadata and attributes from <code>MembershipId</code> in an identity store.
     * </p>
     * 
     * @param describeGroupMembershipRequest
     * @return Result of the DescribeGroupMembership operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.DescribeGroupMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeGroupMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeGroupMembershipResult describeGroupMembership(DescribeGroupMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGroupMembership(request);
    }

    @SdkInternalApi
    final DescribeGroupMembershipResult executeDescribeGroupMembership(DescribeGroupMembershipRequest describeGroupMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGroupMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGroupMembershipRequest> request = null;
        Response<DescribeGroupMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGroupMembershipRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeGroupMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGroupMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGroupMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeGroupMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the user metadata and attributes from the <code>UserId</code> in an identity store.
     * </p>
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/DescribeUser" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
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
     * Retrieves <code>GroupId</code> in an identity store.
     * </p>
     * 
     * @param getGroupIdRequest
     * @return Result of the GetGroupId operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.GetGroupId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GetGroupId" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetGroupIdResult getGroupId(GetGroupIdRequest request) {
        request = beforeClientExecution(request);
        return executeGetGroupId(request);
    }

    @SdkInternalApi
    final GetGroupIdResult executeGetGroupId(GetGroupIdRequest getGroupIdRequest) {

        ExecutionContext executionContext = createExecutionContext(getGroupIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupIdRequest> request = null;
        Response<GetGroupIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupIdRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGroupIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGroupId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGroupIdResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGroupIdResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the <code>MembershipId</code> in an identity store.
     * </p>
     * 
     * @param getGroupMembershipIdRequest
     * @return Result of the GetGroupMembershipId operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.GetGroupMembershipId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GetGroupMembershipId"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetGroupMembershipIdResult getGroupMembershipId(GetGroupMembershipIdRequest request) {
        request = beforeClientExecution(request);
        return executeGetGroupMembershipId(request);
    }

    @SdkInternalApi
    final GetGroupMembershipIdResult executeGetGroupMembershipId(GetGroupMembershipIdRequest getGroupMembershipIdRequest) {

        ExecutionContext executionContext = createExecutionContext(getGroupMembershipIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGroupMembershipIdRequest> request = null;
        Response<GetGroupMembershipIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGroupMembershipIdRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGroupMembershipIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGroupMembershipId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGroupMembershipIdResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGroupMembershipIdResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the <code>UserId</code> in an identity store.
     * </p>
     * 
     * @param getUserIdRequest
     * @return Result of the GetUserId operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.GetUserId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/GetUserId" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetUserIdResult getUserId(GetUserIdRequest request) {
        request = beforeClientExecution(request);
        return executeGetUserId(request);
    }

    @SdkInternalApi
    final GetUserIdResult executeGetUserId(GetUserIdRequest getUserIdRequest) {

        ExecutionContext executionContext = createExecutionContext(getUserIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUserIdRequest> request = null;
        Response<GetUserIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUserIdRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUserIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUserId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUserIdResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUserIdResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Checks the user's membership in all requested groups and returns if the member exists in all queried groups.
     * </p>
     * 
     * @param isMemberInGroupsRequest
     * @return Result of the IsMemberInGroups operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.IsMemberInGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/IsMemberInGroups" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public IsMemberInGroupsResult isMemberInGroups(IsMemberInGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeIsMemberInGroups(request);
    }

    @SdkInternalApi
    final IsMemberInGroupsResult executeIsMemberInGroups(IsMemberInGroupsRequest isMemberInGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(isMemberInGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IsMemberInGroupsRequest> request = null;
        Response<IsMemberInGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IsMemberInGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(isMemberInGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "IsMemberInGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<IsMemberInGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new IsMemberInGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For the specified group in the specified identity store, returns the list of all <code>GroupMembership</code>
     * objects and returns results in paginated form.
     * </p>
     * 
     * @param listGroupMembershipsRequest
     * @return Result of the ListGroupMemberships operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.ListGroupMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListGroupMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListGroupMembershipsResult listGroupMemberships(ListGroupMembershipsRequest request) {
        request = beforeClientExecution(request);
        return executeListGroupMemberships(request);
    }

    @SdkInternalApi
    final ListGroupMembershipsResult executeListGroupMemberships(ListGroupMembershipsRequest listGroupMembershipsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroupMembershipsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupMembershipsRequest> request = null;
        Response<ListGroupMembershipsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupMembershipsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGroupMembershipsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroupMemberships");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroupMembershipsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGroupMembershipsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For the specified member in the specified identity store, returns the list of all <code>GroupMembership</code>
     * objects and returns results in paginated form.
     * </p>
     * 
     * @param listGroupMembershipsForMemberRequest
     * @return Result of the ListGroupMembershipsForMember operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.ListGroupMembershipsForMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListGroupMembershipsForMember"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListGroupMembershipsForMemberResult listGroupMembershipsForMember(ListGroupMembershipsForMemberRequest request) {
        request = beforeClientExecution(request);
        return executeListGroupMembershipsForMember(request);
    }

    @SdkInternalApi
    final ListGroupMembershipsForMemberResult executeListGroupMembershipsForMember(ListGroupMembershipsForMemberRequest listGroupMembershipsForMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroupMembershipsForMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupMembershipsForMemberRequest> request = null;
        Response<ListGroupMembershipsForMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupMembershipsForMemberRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listGroupMembershipsForMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroupMembershipsForMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroupMembershipsForMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListGroupMembershipsForMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all groups in the identity store. Returns a paginated list of complete <code>Group</code> objects.
     * Filtering for a <code>Group</code> by the <code>DisplayName</code> attribute is deprecated. Instead, use the
     * <code>GetGroupId</code> API action.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGroupsResult listGroups(ListGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListGroups(request);
    }

    @SdkInternalApi
    final ListGroupsResult executeListGroups(ListGroupsRequest listGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGroupsRequest> request = null;
        Response<ListGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGroupsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all users in the identity store. Returns a paginated list of complete <code>User</code> objects. Filtering
     * for a <code>User</code> by the <code>UserName</code> attribute is deprecated. Instead, use the
     * <code>GetUserId</code> API action.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSIdentityStore.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/ListUsers" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
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
     * For the specified group in the specified identity store, updates the group metadata and attributes.
     * </p>
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ServiceQuotaExceededException
     *         The request would cause the number of users or groups in the identity store to exceed the maximum
     *         allowed.
     * @sample AWSIdentityStore.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateGroupResult updateGroup(UpdateGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGroup(request);
    }

    @SdkInternalApi
    final UpdateGroupResult executeUpdateGroup(UpdateGroupRequest updateGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGroupRequest> request = null;
        Response<UpdateGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For the specified user in the specified identity store, updates the user metadata and attributes.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Performing the requested operation would violate an existing uniqueness claim in the identity store.
     *         Resolve the conflict before retrying this request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The requested resource was being concurrently modified by another request.
     *         </p>
     *         </li>
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ServiceQuotaExceededException
     *         The request would cause the number of users or groups in the identity store to exceed the maximum
     *         allowed.
     * @sample AWSIdentityStore.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/UpdateUser" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "identitystore");
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
