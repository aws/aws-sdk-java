/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness;

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
import com.amazonaws.services.alexaforbusiness.AmazonAlexaForBusinessClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.alexaforbusiness.model.*;
import com.amazonaws.services.alexaforbusiness.model.transform.*;

/**
 * Client for accessing Alexa For Business. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Alexa for Business makes it easy for you to use Alexa in your organization. Alexa for Business gives you the tools
 * you need to manage Alexa devices, enroll your users, and assign skills, at scale. You can build your own
 * context-aware voice skills using the Alexa Skills Kit, and the Alexa for Business APIs, and you can make these
 * available as private skills for your organization. Alexa for Business also makes it easy to voice-enable your
 * products and services, providing context-aware voice experiences for your customers.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAlexaForBusinessClient extends AmazonWebServiceClient implements AmazonAlexaForBusiness {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonAlexaForBusiness.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "a4b";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidUserStatusException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.InvalidUserStatusException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NameInUseException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.NameInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.alexaforbusiness.model.AmazonAlexaForBusinessException.class));

    public static AmazonAlexaForBusinessClientBuilder builder() {
        return AmazonAlexaForBusinessClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Alexa For Business using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAlexaForBusinessClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("a4b.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/alexaforbusiness/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/alexaforbusiness/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a device to a given room. This applies all the settings from the room profile to the device, and all
     * the skills in any skill groups added to that room. This operation requires the device to be online, or a manual
     * sync is required.
     * </p>
     * 
     * @param associateDeviceWithRoomRequest
     * @return Result of the AssociateDeviceWithRoom operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.AssociateDeviceWithRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateDeviceWithRoom"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateDeviceWithRoomResult associateDeviceWithRoom(AssociateDeviceWithRoomRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateDeviceWithRoom(request);
    }

    @SdkInternalApi
    final AssociateDeviceWithRoomResult executeAssociateDeviceWithRoom(AssociateDeviceWithRoomRequest associateDeviceWithRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(associateDeviceWithRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDeviceWithRoomRequest> request = null;
        Response<AssociateDeviceWithRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDeviceWithRoomRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateDeviceWithRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateDeviceWithRoomResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateDeviceWithRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a skill group to a given room. This enables all skills in the associated skill group on all devices in
     * the room.
     * </p>
     * 
     * @param associateSkillGroupWithRoomRequest
     * @return Result of the AssociateSkillGroupWithRoom operation returned by the service.
     * @sample AmazonAlexaForBusiness.AssociateSkillGroupWithRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillGroupWithRoom"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateSkillGroupWithRoomResult associateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateSkillGroupWithRoom(request);
    }

    @SdkInternalApi
    final AssociateSkillGroupWithRoomResult executeAssociateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest associateSkillGroupWithRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(associateSkillGroupWithRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSkillGroupWithRoomRequest> request = null;
        Response<AssociateSkillGroupWithRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSkillGroupWithRoomRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateSkillGroupWithRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateSkillGroupWithRoomResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateSkillGroupWithRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new room profile with the specified details.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits. HTTP Status Code: 400
     * @throws AlreadyExistsException
     *         The resource being created already exists. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateProfileResult createProfile(CreateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProfile(request);
    }

    @SdkInternalApi
    final CreateProfileResult executeCreateProfile(CreateProfileRequest createProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProfileRequest> request = null;
        Response<CreateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a room with the specified details.
     * </p>
     * 
     * @param createRoomRequest
     * @return Result of the CreateRoom operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists. HTTP Status Code: 400
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.CreateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateRoom" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateRoomResult createRoom(CreateRoomRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRoom(request);
    }

    @SdkInternalApi
    final CreateRoomResult executeCreateRoom(CreateRoomRequest createRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(createRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRoomRequest> request = null;
        Response<CreateRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRoomResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a skill group with a specified name and description.
     * </p>
     * 
     * @param createSkillGroupRequest
     * @return Result of the CreateSkillGroup operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists. HTTP Status Code: 400
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.CreateSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSkillGroupResult createSkillGroup(CreateSkillGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSkillGroup(request);
    }

    @SdkInternalApi
    final CreateSkillGroupResult executeCreateSkillGroup(CreateSkillGroupRequest createSkillGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSkillGroupRequest> request = null;
        Response<CreateSkillGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSkillGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSkillGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSkillGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSkillGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a user.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws ResourceInUseException
     *         The resource in the request is already in use. HTTP Status Code: 400
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateUser" target="_top">AWS
     *      API Documentation</a>
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
     * Deletes a room profile by the profile ARN.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteProfileResult deleteProfile(DeleteProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProfile(request);
    }

    @SdkInternalApi
    final DeleteProfileResult executeDeleteProfile(DeleteProfileRequest deleteProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProfileRequest> request = null;
        Response<DeleteProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a room by the room ARN.
     * </p>
     * 
     * @param deleteRoomRequest
     * @return Result of the DeleteRoom operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.DeleteRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteRoom" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteRoomResult deleteRoom(DeleteRoomRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRoom(request);
    }

    @SdkInternalApi
    final DeleteRoomResult executeDeleteRoom(DeleteRoomRequest deleteRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRoomRequest> request = null;
        Response<DeleteRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRoomResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes room skill parameter details by room, skill, and parameter key ID.
     * </p>
     * 
     * @param deleteRoomSkillParameterRequest
     * @return Result of the DeleteRoomSkillParameter operation returned by the service.
     * @sample AmazonAlexaForBusiness.DeleteRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRoomSkillParameterResult deleteRoomSkillParameter(DeleteRoomSkillParameterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRoomSkillParameter(request);
    }

    @SdkInternalApi
    final DeleteRoomSkillParameterResult executeDeleteRoomSkillParameter(DeleteRoomSkillParameterRequest deleteRoomSkillParameterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRoomSkillParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRoomSkillParameterRequest> request = null;
        Response<DeleteRoomSkillParameterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoomSkillParameterRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRoomSkillParameterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRoomSkillParameterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRoomSkillParameterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a skill group by skill group ARN.
     * </p>
     * 
     * @param deleteSkillGroupRequest
     * @return Result of the DeleteSkillGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.DeleteSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSkillGroupResult deleteSkillGroup(DeleteSkillGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSkillGroup(request);
    }

    @SdkInternalApi
    final DeleteSkillGroupResult executeDeleteSkillGroup(DeleteSkillGroupRequest deleteSkillGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSkillGroupRequest> request = null;
        Response<DeleteSkillGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSkillGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSkillGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSkillGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSkillGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified user by user ARN and enrollment ARN.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteUser" target="_top">AWS
     *      API Documentation</a>
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
     * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is
     * still registered to the account. The device settings and skills are removed from the room.
     * </p>
     * 
     * @param disassociateDeviceFromRoomRequest
     * @return Result of the DisassociateDeviceFromRoom operation returned by the service.
     * @sample AmazonAlexaForBusiness.DisassociateDeviceFromRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateDeviceFromRoom"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateDeviceFromRoomResult disassociateDeviceFromRoom(DisassociateDeviceFromRoomRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateDeviceFromRoom(request);
    }

    @SdkInternalApi
    final DisassociateDeviceFromRoomResult executeDisassociateDeviceFromRoom(DisassociateDeviceFromRoomRequest disassociateDeviceFromRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateDeviceFromRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDeviceFromRoomRequest> request = null;
        Response<DisassociateDeviceFromRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDeviceFromRoomRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateDeviceFromRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateDeviceFromRoomResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateDeviceFromRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in
     * the room.
     * </p>
     * 
     * @param disassociateSkillGroupFromRoomRequest
     * @return Result of the DisassociateSkillGroupFromRoom operation returned by the service.
     * @sample AmazonAlexaForBusiness.DisassociateSkillGroupFromRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillGroupFromRoom"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateSkillGroupFromRoomResult disassociateSkillGroupFromRoom(DisassociateSkillGroupFromRoomRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateSkillGroupFromRoom(request);
    }

    @SdkInternalApi
    final DisassociateSkillGroupFromRoomResult executeDisassociateSkillGroupFromRoom(DisassociateSkillGroupFromRoomRequest disassociateSkillGroupFromRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateSkillGroupFromRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateSkillGroupFromRoomRequest> request = null;
        Response<DisassociateSkillGroupFromRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateSkillGroupFromRoomRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateSkillGroupFromRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateSkillGroupFromRoomResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateSkillGroupFromRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of a device by device ARN.
     * </p>
     * 
     * @param getDeviceRequest
     * @return Result of the GetDevice operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDeviceResult getDevice(GetDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeGetDevice(request);
    }

    @SdkInternalApi
    final GetDeviceResult executeGetDevice(GetDeviceRequest getDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeviceRequest> request = null;
        Response<GetDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeviceResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of a room profile by profile ARN.
     * </p>
     * 
     * @param getProfileRequest
     * @return Result of the GetProfile operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetProfileResult getProfile(GetProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetProfile(request);
    }

    @SdkInternalApi
    final GetProfileResult executeGetProfile(GetProfileRequest getProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProfileRequest> request = null;
        Response<GetProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProfileResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets room details by room ARN.
     * </p>
     * 
     * @param getRoomRequest
     * @return Result of the GetRoom operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.GetRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetRoom" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRoomResult getRoom(GetRoomRequest request) {
        request = beforeClientExecution(request);
        return executeGetRoom(request);
    }

    @SdkInternalApi
    final GetRoomResult executeGetRoom(GetRoomRequest getRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(getRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoomRequest> request = null;
        Response<GetRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRoomResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets room skill parameter details by room, skill, and parameter key ARN.
     * </p>
     * 
     * @param getRoomSkillParameterRequest
     * @return Result of the GetRoomSkillParameter operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.GetRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRoomSkillParameterResult getRoomSkillParameter(GetRoomSkillParameterRequest request) {
        request = beforeClientExecution(request);
        return executeGetRoomSkillParameter(request);
    }

    @SdkInternalApi
    final GetRoomSkillParameterResult executeGetRoomSkillParameter(GetRoomSkillParameterRequest getRoomSkillParameterRequest) {

        ExecutionContext executionContext = createExecutionContext(getRoomSkillParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoomSkillParameterRequest> request = null;
        Response<GetRoomSkillParameterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoomSkillParameterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRoomSkillParameterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRoomSkillParameterResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetRoomSkillParameterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets skill group details by skill group ARN.
     * </p>
     * 
     * @param getSkillGroupRequest
     * @return Result of the GetSkillGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.GetSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetSkillGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSkillGroupResult getSkillGroup(GetSkillGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetSkillGroup(request);
    }

    @SdkInternalApi
    final GetSkillGroupResult executeGetSkillGroup(GetSkillGroupRequest getSkillGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSkillGroupRequest> request = null;
        Response<GetSkillGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSkillGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSkillGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSkillGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSkillGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all enabled skills in a specific skill group.
     * </p>
     * 
     * @param listSkillsRequest
     * @return Result of the ListSkills operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListSkills
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkills" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSkillsResult listSkills(ListSkillsRequest request) {
        request = beforeClientExecution(request);
        return executeListSkills(request);
    }

    @SdkInternalApi
    final ListSkillsResult executeListSkills(ListSkillsRequest listSkillsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSkillsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSkillsRequest> request = null;
        Response<ListSkillsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSkillsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSkillsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSkillsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSkillsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags for a specific resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListTags(request);
    }

    @SdkInternalApi
    final ListTagsResult executeListTags(ListTagsRequest listTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill
     * parameter.
     * </p>
     * 
     * @param putRoomSkillParameterRequest
     * @return Result of the PutRoomSkillParameter operation returned by the service.
     * @sample AmazonAlexaForBusiness.PutRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutRoomSkillParameterResult putRoomSkillParameter(PutRoomSkillParameterRequest request) {
        request = beforeClientExecution(request);
        return executePutRoomSkillParameter(request);
    }

    @SdkInternalApi
    final PutRoomSkillParameterResult executePutRoomSkillParameter(PutRoomSkillParameterRequest putRoomSkillParameterRequest) {

        ExecutionContext executionContext = createExecutionContext(putRoomSkillParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRoomSkillParameterRequest> request = null;
        Response<PutRoomSkillParameterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRoomSkillParameterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRoomSkillParameterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRoomSkillParameterResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutRoomSkillParameterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Determines the details for the room from which a skill request was invoked. This operation is used by skill
     * developers.
     * </p>
     * 
     * @param resolveRoomRequest
     * @return Result of the ResolveRoom operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.ResolveRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ResolveRoom" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ResolveRoomResult resolveRoom(ResolveRoomRequest request) {
        request = beforeClientExecution(request);
        return executeResolveRoom(request);
    }

    @SdkInternalApi
    final ResolveRoomResult executeResolveRoom(ResolveRoomRequest resolveRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(resolveRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResolveRoomRequest> request = null;
        Response<ResolveRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResolveRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resolveRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResolveRoomResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResolveRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes an invitation and invalidates the enrollment URL.
     * </p>
     * 
     * @param revokeInvitationRequest
     * @return Result of the RevokeInvitation operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.RevokeInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RevokeInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RevokeInvitationResult revokeInvitation(RevokeInvitationRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeInvitation(request);
    }

    @SdkInternalApi
    final RevokeInvitationResult executeRevokeInvitation(RevokeInvitationRequest revokeInvitationRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeInvitationRequest> request = null;
        Response<RevokeInvitationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeInvitationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(revokeInvitationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RevokeInvitationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RevokeInvitationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches devices and lists the ones that meet a set of filter criteria.
     * </p>
     * 
     * @param searchDevicesRequest
     * @return Result of the SearchDevices operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchDevices" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchDevicesResult searchDevices(SearchDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchDevices(request);
    }

    @SdkInternalApi
    final SearchDevicesResult executeSearchDevices(SearchDevicesRequest searchDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchDevicesRequest> request = null;
        Response<SearchDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchDevicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches room profiles and lists the ones that meet a set of filter criteria.
     * </p>
     * 
     * @param searchProfilesRequest
     * @return Result of the SearchProfiles operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchProfilesResult searchProfiles(SearchProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchProfiles(request);
    }

    @SdkInternalApi
    final SearchProfilesResult executeSearchProfiles(SearchProfilesRequest searchProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchProfilesRequest> request = null;
        Response<SearchProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches rooms and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchRoomsRequest
     * @return Result of the SearchRooms operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchRooms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchRooms" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchRoomsResult searchRooms(SearchRoomsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchRooms(request);
    }

    @SdkInternalApi
    final SearchRoomsResult executeSearchRooms(SearchRoomsRequest searchRoomsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchRoomsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchRoomsRequest> request = null;
        Response<SearchRoomsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchRoomsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchRoomsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchRoomsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchRoomsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchSkillGroupsRequest
     * @return Result of the SearchSkillGroups operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchSkillGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchSkillGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchSkillGroupsResult searchSkillGroups(SearchSkillGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchSkillGroups(request);
    }

    @SdkInternalApi
    final SearchSkillGroupsResult executeSearchSkillGroups(SearchSkillGroupsRequest searchSkillGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchSkillGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchSkillGroupsRequest> request = null;
        Response<SearchSkillGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchSkillGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchSkillGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchSkillGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchSkillGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches users and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchUsersRequest
     * @return Result of the SearchUsers operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchUsers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchUsersResult searchUsers(SearchUsersRequest request) {
        request = beforeClientExecution(request);
        return executeSearchUsers(request);
    }

    @SdkInternalApi
    final SearchUsersResult executeSearchUsers(SearchUsersRequest searchUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(searchUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchUsersRequest> request = null;
        Response<SearchUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchUsersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchUsersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends an enrollment invitation email with a URL to a user. The URL is valid for 72 hours or until you call this
     * operation again, whichever comes first.
     * </p>
     * 
     * @param sendInvitationRequest
     * @return Result of the SendInvitation operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @throws InvalidUserStatusException
     *         The attempt to update a user is invalid due to the user's current status. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.SendInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SendInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendInvitationResult sendInvitation(SendInvitationRequest request) {
        request = beforeClientExecution(request);
        return executeSendInvitation(request);
    }

    @SdkInternalApi
    final SendInvitationResult executeSendInvitation(SendInvitationRequest sendInvitationRequest) {

        ExecutionContext executionContext = createExecutionContext(sendInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendInvitationRequest> request = null;
        Response<SendInvitationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendInvitationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendInvitationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendInvitationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendInvitationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resets a device and its account to the known default settings by clearing all information and settings set by
     * previous users.
     * </p>
     * 
     * @param startDeviceSyncRequest
     * @return Result of the StartDeviceSync operation returned by the service.
     * @sample AmazonAlexaForBusiness.StartDeviceSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/StartDeviceSync"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartDeviceSyncResult startDeviceSync(StartDeviceSyncRequest request) {
        request = beforeClientExecution(request);
        return executeStartDeviceSync(request);
    }

    @SdkInternalApi
    final StartDeviceSyncResult executeStartDeviceSync(StartDeviceSyncRequest startDeviceSyncRequest) {

        ExecutionContext executionContext = createExecutionContext(startDeviceSyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDeviceSyncRequest> request = null;
        Response<StartDeviceSyncResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDeviceSyncRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startDeviceSyncRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDeviceSyncResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartDeviceSyncResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds metadata tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/TagResource" target="_top">AWS
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
     * Removes metadata tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UntagResource" target="_top">AWS
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
     * Updates the device name by device ARN.
     * </p>
     * 
     * @param updateDeviceRequest
     * @return Result of the UpdateDevice operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDeviceResult updateDevice(UpdateDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDevice(request);
    }

    @SdkInternalApi
    final UpdateDeviceResult executeUpdateDevice(UpdateDeviceRequest updateDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeviceRequest> request = null;
        Response<UpdateDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing room profile by room profile ARN.
     * </p>
     * 
     * @param updateProfileRequest
     * @return Result of the UpdateProfile operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @throws NameInUseException
     *         The name sent in the request is already in use. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateProfileResult updateProfile(UpdateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProfile(request);
    }

    @SdkInternalApi
    final UpdateProfileResult executeUpdateProfile(UpdateProfileRequest updateProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProfileRequest> request = null;
        Response<UpdateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates room details by room ARN.
     * </p>
     * 
     * @param updateRoomRequest
     * @return Result of the UpdateRoom operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @throws NameInUseException
     *         The name sent in the request is already in use. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.UpdateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateRoom" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateRoomResult updateRoom(UpdateRoomRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoom(request);
    }

    @SdkInternalApi
    final UpdateRoomResult executeUpdateRoom(UpdateRoomRequest updateRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoomRequest> request = null;
        Response<UpdateRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRoomResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates skill group details by skill group ARN.
     * </p>
     * 
     * @param updateSkillGroupRequest
     * @return Result of the UpdateSkillGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found. HTTP Status Code: 400
     * @throws NameInUseException
     *         The name sent in the request is already in use. HTTP Status Code: 400
     * @sample AmazonAlexaForBusiness.UpdateSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSkillGroupResult updateSkillGroup(UpdateSkillGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSkillGroup(request);
    }

    @SdkInternalApi
    final UpdateSkillGroupResult executeUpdateSkillGroup(UpdateSkillGroupRequest updateSkillGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSkillGroupRequest> request = null;
        Response<UpdateSkillGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSkillGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSkillGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSkillGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSkillGroupResultJsonUnmarshaller());
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

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
