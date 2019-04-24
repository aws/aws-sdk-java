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
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.alexaforbusiness.AmazonAlexaForBusinessClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.alexaforbusiness.model.*;
import com.amazonaws.services.alexaforbusiness.model.transform.*;

/**
 * Client for accessing Alexa For Business. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Alexa for Business helps you use Alexa in your organization. Alexa for Business provides you with the tools to manage
 * Alexa devices, enroll your users, and assign skills, at scale. You can build your own context-aware voice skills
 * using the Alexa Skills Kit and the Alexa for Business API operations. You can also make these available as private
 * skills for your organization. Alexa for Business makes it efficient to voice-enable your products and services, thus
 * providing context-aware voice experiences for your customers. Device makers building with the Alexa Voice Service
 * (AVS) can create fully integrated solutions, register their products with Alexa for Business, and manage them as
 * shared devices in their organization.
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

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SkillNotLinkedException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.SkillNotLinkedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAssociatedException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.ResourceAssociatedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NameInUseException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.NameInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.UnauthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidUserStatusException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.InvalidUserStatusException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCertificateAuthorityException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.InvalidCertificateAuthorityException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeviceException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.InvalidDeviceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeviceNotRegisteredException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.DeviceNotRegisteredException.class))
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
        this(clientParams, false);
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
    AmazonAlexaForBusinessClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
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
     * Associates a skill with the organization under the customer's AWS account. If a skill is private, the user
     * implicitly accepts access to this skill during enablement.
     * </p>
     * 
     * @param approveSkillRequest
     * @return Result of the ApproveSkill operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.ApproveSkill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ApproveSkill" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ApproveSkillResult approveSkill(ApproveSkillRequest request) {
        request = beforeClientExecution(request);
        return executeApproveSkill(request);
    }

    @SdkInternalApi
    final ApproveSkillResult executeApproveSkill(ApproveSkillRequest approveSkillRequest) {

        ExecutionContext executionContext = createExecutionContext(approveSkillRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ApproveSkillRequest> request = null;
        Response<ApproveSkillResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ApproveSkillRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(approveSkillRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ApproveSkill");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ApproveSkillResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ApproveSkillResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a contact with a given address book.
     * </p>
     * 
     * @param associateContactWithAddressBookRequest
     * @return Result of the AssociateContactWithAddressBook operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @sample AmazonAlexaForBusiness.AssociateContactWithAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateContactWithAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateContactWithAddressBookResult associateContactWithAddressBook(AssociateContactWithAddressBookRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateContactWithAddressBook(request);
    }

    @SdkInternalApi
    final AssociateContactWithAddressBookResult executeAssociateContactWithAddressBook(
            AssociateContactWithAddressBookRequest associateContactWithAddressBookRequest) {

        ExecutionContext executionContext = createExecutionContext(associateContactWithAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateContactWithAddressBookRequest> request = null;
        Response<AssociateContactWithAddressBookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateContactWithAddressBookRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateContactWithAddressBookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateContactWithAddressBook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateContactWithAddressBookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateContactWithAddressBookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a device with a given room. This applies all the settings from the room profile to the device, and all
     * the skills in any skill groups added to that room. This operation requires the device to be online, or else a
     * manual sync is required.
     * </p>
     * 
     * @param associateDeviceWithRoomRequest
     * @return Result of the AssociateDeviceWithRoom operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws DeviceNotRegisteredException
     *         The request failed because this device is no longer registered and therefore no longer managed by this
     *         account.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateDeviceWithRoom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices
     * in the room.
     * </p>
     * 
     * @param associateSkillGroupWithRoomRequest
     * @return Result of the AssociateSkillGroupWithRoom operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateSkillGroupWithRoom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Associates a skill with a skill group.
     * </p>
     * 
     * @param associateSkillWithSkillGroupRequest
     * @return Result of the AssociateSkillWithSkillGroup operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws SkillNotLinkedException
     *         The skill must be linked to a third-party account.
     * @sample AmazonAlexaForBusiness.AssociateSkillWithSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillWithSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateSkillWithSkillGroupResult associateSkillWithSkillGroup(AssociateSkillWithSkillGroupRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateSkillWithSkillGroup(request);
    }

    @SdkInternalApi
    final AssociateSkillWithSkillGroupResult executeAssociateSkillWithSkillGroup(AssociateSkillWithSkillGroupRequest associateSkillWithSkillGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(associateSkillWithSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSkillWithSkillGroupRequest> request = null;
        Response<AssociateSkillWithSkillGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSkillWithSkillGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateSkillWithSkillGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateSkillWithSkillGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateSkillWithSkillGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateSkillWithSkillGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Makes a private skill available for enrolled users to enable on their devices.
     * </p>
     * 
     * @param associateSkillWithUsersRequest
     * @return Result of the AssociateSkillWithUsers operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.AssociateSkillWithUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillWithUsers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateSkillWithUsersResult associateSkillWithUsers(AssociateSkillWithUsersRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateSkillWithUsers(request);
    }

    @SdkInternalApi
    final AssociateSkillWithUsersResult executeAssociateSkillWithUsers(AssociateSkillWithUsersRequest associateSkillWithUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(associateSkillWithUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSkillWithUsersRequest> request = null;
        Response<AssociateSkillWithUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSkillWithUsersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateSkillWithUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateSkillWithUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateSkillWithUsersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateSkillWithUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an address book with the specified details.
     * </p>
     * 
     * @param createAddressBookRequest
     * @return Result of the CreateAddressBook operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @sample AmazonAlexaForBusiness.CreateAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAddressBookResult createAddressBook(CreateAddressBookRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAddressBook(request);
    }

    @SdkInternalApi
    final CreateAddressBookResult executeCreateAddressBook(CreateAddressBookRequest createAddressBookRequest) {

        ExecutionContext executionContext = createExecutionContext(createAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAddressBookRequest> request = null;
        Response<CreateAddressBookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAddressBookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAddressBookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAddressBook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAddressBookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAddressBookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or
     * weekly interval.
     * </p>
     * 
     * @param createBusinessReportScheduleRequest
     * @return Result of the CreateBusinessReportSchedule operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @sample AmazonAlexaForBusiness.CreateBusinessReportSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateBusinessReportSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateBusinessReportScheduleResult createBusinessReportSchedule(CreateBusinessReportScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBusinessReportSchedule(request);
    }

    @SdkInternalApi
    final CreateBusinessReportScheduleResult executeCreateBusinessReportSchedule(CreateBusinessReportScheduleRequest createBusinessReportScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(createBusinessReportScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBusinessReportScheduleRequest> request = null;
        Response<CreateBusinessReportScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBusinessReportScheduleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createBusinessReportScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBusinessReportSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBusinessReportScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateBusinessReportScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a new conference provider under the user's AWS account.
     * </p>
     * 
     * @param createConferenceProviderRequest
     * @return Result of the CreateConferenceProvider operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @sample AmazonAlexaForBusiness.CreateConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConferenceProviderResult createConferenceProvider(CreateConferenceProviderRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConferenceProvider(request);
    }

    @SdkInternalApi
    final CreateConferenceProviderResult executeCreateConferenceProvider(CreateConferenceProviderRequest createConferenceProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(createConferenceProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConferenceProviderRequest> request = null;
        Response<CreateConferenceProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConferenceProviderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createConferenceProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConferenceProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConferenceProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateConferenceProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a contact with the specified details.
     * </p>
     * 
     * @param createContactRequest
     * @return Result of the CreateContact operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @sample AmazonAlexaForBusiness.CreateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateContactResult createContact(CreateContactRequest request) {
        request = beforeClientExecution(request);
        return executeCreateContact(request);
    }

    @SdkInternalApi
    final CreateContactResult executeCreateContact(CreateContactRequest createContactRequest) {

        ExecutionContext executionContext = createExecutionContext(createContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContactRequest> request = null;
        Response<CreateContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a gateway group with the specified details.
     * </p>
     * 
     * @param createGatewayGroupRequest
     * @return Result of the CreateGatewayGroup operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @sample AmazonAlexaForBusiness.CreateGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateGatewayGroupResult createGatewayGroup(CreateGatewayGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGatewayGroup(request);
    }

    @SdkInternalApi
    final CreateGatewayGroupResult executeCreateGatewayGroup(CreateGatewayGroupRequest createGatewayGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createGatewayGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGatewayGroupRequest> request = null;
        Response<CreateGatewayGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGatewayGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGatewayGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGatewayGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGatewayGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGatewayGroupResultJsonUnmarshaller());
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
     *         You are performing an action that would put you beyond your account's limits.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRoom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSkillGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The resource in the request is already in use.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
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
     * Deletes an address book by the address book ARN.
     * </p>
     * 
     * @param deleteAddressBookRequest
     * @return Result of the DeleteAddressBook operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.DeleteAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAddressBookResult deleteAddressBook(DeleteAddressBookRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAddressBook(request);
    }

    @SdkInternalApi
    final DeleteAddressBookResult executeDeleteAddressBook(DeleteAddressBookRequest deleteAddressBookRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAddressBookRequest> request = null;
        Response<DeleteAddressBookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAddressBookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAddressBookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAddressBook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAddressBookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAddressBookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the recurring report delivery schedule with the specified schedule ARN.
     * </p>
     * 
     * @param deleteBusinessReportScheduleRequest
     * @return Result of the DeleteBusinessReportSchedule operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.DeleteBusinessReportSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteBusinessReportSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteBusinessReportScheduleResult deleteBusinessReportSchedule(DeleteBusinessReportScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBusinessReportSchedule(request);
    }

    @SdkInternalApi
    final DeleteBusinessReportScheduleResult executeDeleteBusinessReportSchedule(DeleteBusinessReportScheduleRequest deleteBusinessReportScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBusinessReportScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBusinessReportScheduleRequest> request = null;
        Response<DeleteBusinessReportScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBusinessReportScheduleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteBusinessReportScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBusinessReportSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBusinessReportScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteBusinessReportScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a conference provider.
     * </p>
     * 
     * @param deleteConferenceProviderRequest
     * @return Result of the DeleteConferenceProvider operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.DeleteConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConferenceProviderResult deleteConferenceProvider(DeleteConferenceProviderRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConferenceProvider(request);
    }

    @SdkInternalApi
    final DeleteConferenceProviderResult executeDeleteConferenceProvider(DeleteConferenceProviderRequest deleteConferenceProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConferenceProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConferenceProviderRequest> request = null;
        Response<DeleteConferenceProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConferenceProviderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteConferenceProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConferenceProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConferenceProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConferenceProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a contact by the contact ARN.
     * </p>
     * 
     * @param deleteContactRequest
     * @return Result of the DeleteContact operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.DeleteContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteContactResult deleteContact(DeleteContactRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteContact(request);
    }

    @SdkInternalApi
    final DeleteContactResult executeDeleteContact(DeleteContactRequest deleteContactRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContactRequest> request = null;
        Response<DeleteContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a device from Alexa For Business.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return Result of the DeleteDevice operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws InvalidCertificateAuthorityException
     *         The Certificate Authority can't issue or revoke a certificate.
     * @sample AmazonAlexaForBusiness.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDeviceResult deleteDevice(DeleteDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDevice(request);
    }

    @SdkInternalApi
    final DeleteDeviceResult executeDeleteDevice(DeleteDeviceRequest deleteDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeviceRequest> request = null;
        Response<DeleteDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a gateway group.
     * </p>
     * 
     * @param deleteGatewayGroupRequest
     * @return Result of the DeleteGatewayGroup operation returned by the service.
     * @throws ResourceAssociatedException
     *         Another resource is associated with the resource in the request.
     * @sample AmazonAlexaForBusiness.DeleteGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteGatewayGroupResult deleteGatewayGroup(DeleteGatewayGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGatewayGroup(request);
    }

    @SdkInternalApi
    final DeleteGatewayGroupResult executeDeleteGatewayGroup(DeleteGatewayGroupRequest deleteGatewayGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGatewayGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGatewayGroupRequest> request = null;
        Response<DeleteGatewayGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGatewayGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGatewayGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGatewayGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGatewayGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGatewayGroupResultJsonUnmarshaller());
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
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRoom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRoomSkillParameter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Unlinks a third-party account from a skill.
     * </p>
     * 
     * @param deleteSkillAuthorizationRequest
     * @return Result of the DeleteSkillAuthorization operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.DeleteSkillAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteSkillAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSkillAuthorizationResult deleteSkillAuthorization(DeleteSkillAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSkillAuthorization(request);
    }

    @SdkInternalApi
    final DeleteSkillAuthorizationResult executeDeleteSkillAuthorization(DeleteSkillAuthorizationRequest deleteSkillAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSkillAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSkillAuthorizationRequest> request = null;
        Response<DeleteSkillAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSkillAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSkillAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSkillAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSkillAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSkillAuthorizationResultJsonUnmarshaller());
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
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSkillGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
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
     * Disassociates a contact from a given address book.
     * </p>
     * 
     * @param disassociateContactFromAddressBookRequest
     * @return Result of the DisassociateContactFromAddressBook operation returned by the service.
     * @sample AmazonAlexaForBusiness.DisassociateContactFromAddressBook
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateContactFromAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateContactFromAddressBookResult disassociateContactFromAddressBook(DisassociateContactFromAddressBookRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateContactFromAddressBook(request);
    }

    @SdkInternalApi
    final DisassociateContactFromAddressBookResult executeDisassociateContactFromAddressBook(
            DisassociateContactFromAddressBookRequest disassociateContactFromAddressBookRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateContactFromAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateContactFromAddressBookRequest> request = null;
        Response<DisassociateContactFromAddressBookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateContactFromAddressBookRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateContactFromAddressBookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateContactFromAddressBook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateContactFromAddressBookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateContactFromAddressBookResultJsonUnmarshaller());
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
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws DeviceNotRegisteredException
     *         The request failed because this device is no longer registered and therefore no longer managed by this
     *         account.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateDeviceFromRoom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Disassociates a skill from a skill group.
     * </p>
     * 
     * @param disassociateSkillFromSkillGroupRequest
     * @return Result of the DisassociateSkillFromSkillGroup operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.DisassociateSkillFromSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillFromSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateSkillFromSkillGroupResult disassociateSkillFromSkillGroup(DisassociateSkillFromSkillGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateSkillFromSkillGroup(request);
    }

    @SdkInternalApi
    final DisassociateSkillFromSkillGroupResult executeDisassociateSkillFromSkillGroup(
            DisassociateSkillFromSkillGroupRequest disassociateSkillFromSkillGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateSkillFromSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateSkillFromSkillGroupRequest> request = null;
        Response<DisassociateSkillFromSkillGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateSkillFromSkillGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateSkillFromSkillGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateSkillFromSkillGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateSkillFromSkillGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateSkillFromSkillGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.
     * </p>
     * 
     * @param disassociateSkillFromUsersRequest
     * @return Result of the DisassociateSkillFromUsers operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.DisassociateSkillFromUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillFromUsers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateSkillFromUsersResult disassociateSkillFromUsers(DisassociateSkillFromUsersRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateSkillFromUsers(request);
    }

    @SdkInternalApi
    final DisassociateSkillFromUsersResult executeDisassociateSkillFromUsers(DisassociateSkillFromUsersRequest disassociateSkillFromUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateSkillFromUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateSkillFromUsersRequest> request = null;
        Response<DisassociateSkillFromUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateSkillFromUsersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateSkillFromUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateSkillFromUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateSkillFromUsersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateSkillFromUsersResultJsonUnmarshaller());
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
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateSkillGroupFromRoom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Forgets smart home appliances associated to a room.
     * </p>
     * 
     * @param forgetSmartHomeAppliancesRequest
     * @return Result of the ForgetSmartHomeAppliances operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.ForgetSmartHomeAppliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ForgetSmartHomeAppliances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ForgetSmartHomeAppliancesResult forgetSmartHomeAppliances(ForgetSmartHomeAppliancesRequest request) {
        request = beforeClientExecution(request);
        return executeForgetSmartHomeAppliances(request);
    }

    @SdkInternalApi
    final ForgetSmartHomeAppliancesResult executeForgetSmartHomeAppliances(ForgetSmartHomeAppliancesRequest forgetSmartHomeAppliancesRequest) {

        ExecutionContext executionContext = createExecutionContext(forgetSmartHomeAppliancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ForgetSmartHomeAppliancesRequest> request = null;
        Response<ForgetSmartHomeAppliancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ForgetSmartHomeAppliancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(forgetSmartHomeAppliancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ForgetSmartHomeAppliances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ForgetSmartHomeAppliancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ForgetSmartHomeAppliancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets address the book details by the address book ARN.
     * </p>
     * 
     * @param getAddressBookRequest
     * @return Result of the GetAddressBook operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAddressBookResult getAddressBook(GetAddressBookRequest request) {
        request = beforeClientExecution(request);
        return executeGetAddressBook(request);
    }

    @SdkInternalApi
    final GetAddressBookResult executeGetAddressBook(GetAddressBookRequest getAddressBookRequest) {

        ExecutionContext executionContext = createExecutionContext(getAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAddressBookRequest> request = null;
        Response<GetAddressBookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAddressBookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAddressBookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAddressBook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAddressBookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAddressBookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the existing conference preferences.
     * </p>
     * 
     * @param getConferencePreferenceRequest
     * @return Result of the GetConferencePreference operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetConferencePreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetConferencePreference"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConferencePreferenceResult getConferencePreference(GetConferencePreferenceRequest request) {
        request = beforeClientExecution(request);
        return executeGetConferencePreference(request);
    }

    @SdkInternalApi
    final GetConferencePreferenceResult executeGetConferencePreference(GetConferencePreferenceRequest getConferencePreferenceRequest) {

        ExecutionContext executionContext = createExecutionContext(getConferencePreferenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConferencePreferenceRequest> request = null;
        Response<GetConferencePreferenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConferencePreferenceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getConferencePreferenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConferencePreference");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConferencePreferenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConferencePreferenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a specific conference provider.
     * </p>
     * 
     * @param getConferenceProviderRequest
     * @return Result of the GetConferenceProvider operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConferenceProviderResult getConferenceProvider(GetConferenceProviderRequest request) {
        request = beforeClientExecution(request);
        return executeGetConferenceProvider(request);
    }

    @SdkInternalApi
    final GetConferenceProviderResult executeGetConferenceProvider(GetConferenceProviderRequest getConferenceProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(getConferenceProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConferenceProviderRequest> request = null;
        Response<GetConferenceProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConferenceProviderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConferenceProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConferenceProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConferenceProviderResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetConferenceProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the contact details by the contact ARN.
     * </p>
     * 
     * @param getContactRequest
     * @return Result of the GetContact operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetContactResult getContact(GetContactRequest request) {
        request = beforeClientExecution(request);
        return executeGetContact(request);
    }

    @SdkInternalApi
    final GetContactResult executeGetContact(GetContactRequest getContactRequest) {

        ExecutionContext executionContext = createExecutionContext(getContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContactRequest> request = null;
        Response<GetContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContactResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContactResultJsonUnmarshaller());
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
     *         The resource is not found.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Retrieves the details of a gateway.
     * </p>
     * 
     * @param getGatewayRequest
     * @return Result of the GetGateway operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetGateway" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetGatewayResult getGateway(GetGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeGetGateway(request);
    }

    @SdkInternalApi
    final GetGatewayResult executeGetGateway(GetGatewayRequest getGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(getGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGatewayRequest> request = null;
        Response<GetGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGatewayResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of a gateway group.
     * </p>
     * 
     * @param getGatewayGroupRequest
     * @return Result of the GetGatewayGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetGatewayGroupResult getGatewayGroup(GetGatewayGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetGatewayGroup(request);
    }

    @SdkInternalApi
    final GetGatewayGroupResult executeGetGatewayGroup(GetGatewayGroupRequest getGatewayGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getGatewayGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGatewayGroupRequest> request = null;
        Response<GetGatewayGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGatewayGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGatewayGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGatewayGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGatewayGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGatewayGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the configured values for the user enrollment invitation email template.
     * </p>
     * 
     * @param getInvitationConfigurationRequest
     * @return Result of the GetInvitationConfiguration operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetInvitationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetInvitationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInvitationConfigurationResult getInvitationConfiguration(GetInvitationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetInvitationConfiguration(request);
    }

    @SdkInternalApi
    final GetInvitationConfigurationResult executeGetInvitationConfiguration(GetInvitationConfigurationRequest getInvitationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getInvitationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInvitationConfigurationRequest> request = null;
        Response<GetInvitationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInvitationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getInvitationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInvitationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInvitationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetInvitationConfigurationResultJsonUnmarshaller());
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
     *         The resource is not found.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The resource is not found.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRoom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The resource is not found.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRoomSkillParameter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The resource is not found.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSkillGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Lists the details of the schedules that a user configured.
     * </p>
     * 
     * @param listBusinessReportSchedulesRequest
     * @return Result of the ListBusinessReportSchedules operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListBusinessReportSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListBusinessReportSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListBusinessReportSchedulesResult listBusinessReportSchedules(ListBusinessReportSchedulesRequest request) {
        request = beforeClientExecution(request);
        return executeListBusinessReportSchedules(request);
    }

    @SdkInternalApi
    final ListBusinessReportSchedulesResult executeListBusinessReportSchedules(ListBusinessReportSchedulesRequest listBusinessReportSchedulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listBusinessReportSchedulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBusinessReportSchedulesRequest> request = null;
        Response<ListBusinessReportSchedulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBusinessReportSchedulesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listBusinessReportSchedulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBusinessReportSchedules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBusinessReportSchedulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListBusinessReportSchedulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists conference providers under a specific AWS account.
     * </p>
     * 
     * @param listConferenceProvidersRequest
     * @return Result of the ListConferenceProviders operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListConferenceProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListConferenceProviders"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConferenceProvidersResult listConferenceProviders(ListConferenceProvidersRequest request) {
        request = beforeClientExecution(request);
        return executeListConferenceProviders(request);
    }

    @SdkInternalApi
    final ListConferenceProvidersResult executeListConferenceProviders(ListConferenceProvidersRequest listConferenceProvidersRequest) {

        ExecutionContext executionContext = createExecutionContext(listConferenceProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConferenceProvidersRequest> request = null;
        Response<ListConferenceProvidersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConferenceProvidersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listConferenceProvidersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConferenceProviders");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConferenceProvidersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListConferenceProvidersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the device event history, including device connection status, for up to 30 days.
     * </p>
     * 
     * @param listDeviceEventsRequest
     * @return Result of the ListDeviceEvents operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.ListDeviceEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListDeviceEvents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDeviceEventsResult listDeviceEvents(ListDeviceEventsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeviceEvents(request);
    }

    @SdkInternalApi
    final ListDeviceEventsResult executeListDeviceEvents(ListDeviceEventsRequest listDeviceEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeviceEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeviceEventsRequest> request = null;
        Response<ListDeviceEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeviceEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeviceEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeviceEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeviceEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeviceEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of gateway group summaries. Use GetGatewayGroup to retrieve details of a specific gateway group.
     * </p>
     * 
     * @param listGatewayGroupsRequest
     * @return Result of the ListGatewayGroups operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListGatewayGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListGatewayGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListGatewayGroupsResult listGatewayGroups(ListGatewayGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListGatewayGroups(request);
    }

    @SdkInternalApi
    final ListGatewayGroupsResult executeListGatewayGroups(ListGatewayGroupsRequest listGatewayGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGatewayGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGatewayGroupsRequest> request = null;
        Response<ListGatewayGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGatewayGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGatewayGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGatewayGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGatewayGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGatewayGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of gateway summaries. Use GetGateway to retrieve details of a specific gateway. An optional
     * gateway group ARN can be provided to only retrieve gateway summaries of gateways that are associated with that
     * gateway group ARN.
     * </p>
     * 
     * @param listGatewaysRequest
     * @return Result of the ListGateways operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListGateways" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListGatewaysResult listGateways(ListGatewaysRequest request) {
        request = beforeClientExecution(request);
        return executeListGateways(request);
    }

    @SdkInternalApi
    final ListGatewaysResult executeListGateways(ListGatewaysRequest listGatewaysRequest) {

        ExecutionContext executionContext = createExecutionContext(listGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGatewaysRequest> request = null;
        Response<ListGatewaysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGatewaysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGatewaysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGateways");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGatewaysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGatewaysResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSkills");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Lists all categories in the Alexa skill store.
     * </p>
     * 
     * @param listSkillsStoreCategoriesRequest
     * @return Result of the ListSkillsStoreCategories operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListSkillsStoreCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkillsStoreCategories"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSkillsStoreCategoriesResult listSkillsStoreCategories(ListSkillsStoreCategoriesRequest request) {
        request = beforeClientExecution(request);
        return executeListSkillsStoreCategories(request);
    }

    @SdkInternalApi
    final ListSkillsStoreCategoriesResult executeListSkillsStoreCategories(ListSkillsStoreCategoriesRequest listSkillsStoreCategoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSkillsStoreCategoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSkillsStoreCategoriesRequest> request = null;
        Response<ListSkillsStoreCategoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSkillsStoreCategoriesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSkillsStoreCategoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSkillsStoreCategories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSkillsStoreCategoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSkillsStoreCategoriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all skills in the Alexa skill store by category.
     * </p>
     * 
     * @param listSkillsStoreSkillsByCategoryRequest
     * @return Result of the ListSkillsStoreSkillsByCategory operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListSkillsStoreSkillsByCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkillsStoreSkillsByCategory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSkillsStoreSkillsByCategoryResult listSkillsStoreSkillsByCategory(ListSkillsStoreSkillsByCategoryRequest request) {
        request = beforeClientExecution(request);
        return executeListSkillsStoreSkillsByCategory(request);
    }

    @SdkInternalApi
    final ListSkillsStoreSkillsByCategoryResult executeListSkillsStoreSkillsByCategory(
            ListSkillsStoreSkillsByCategoryRequest listSkillsStoreSkillsByCategoryRequest) {

        ExecutionContext executionContext = createExecutionContext(listSkillsStoreSkillsByCategoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSkillsStoreSkillsByCategoryRequest> request = null;
        Response<ListSkillsStoreSkillsByCategoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSkillsStoreSkillsByCategoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSkillsStoreSkillsByCategoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSkillsStoreSkillsByCategory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSkillsStoreSkillsByCategoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSkillsStoreSkillsByCategoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the smart home appliances associated with a room.
     * </p>
     * 
     * @param listSmartHomeAppliancesRequest
     * @return Result of the ListSmartHomeAppliances operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.ListSmartHomeAppliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSmartHomeAppliances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSmartHomeAppliancesResult listSmartHomeAppliances(ListSmartHomeAppliancesRequest request) {
        request = beforeClientExecution(request);
        return executeListSmartHomeAppliances(request);
    }

    @SdkInternalApi
    final ListSmartHomeAppliancesResult executeListSmartHomeAppliances(ListSmartHomeAppliancesRequest listSmartHomeAppliancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSmartHomeAppliancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSmartHomeAppliancesRequest> request = null;
        Response<ListSmartHomeAppliancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSmartHomeAppliancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSmartHomeAppliancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSmartHomeAppliances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSmartHomeAppliancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSmartHomeAppliancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags for the specified resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Sets the conference preferences on a specific conference provider at the account level.
     * </p>
     * 
     * @param putConferencePreferenceRequest
     * @return Result of the PutConferencePreference operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.PutConferencePreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutConferencePreference"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutConferencePreferenceResult putConferencePreference(PutConferencePreferenceRequest request) {
        request = beforeClientExecution(request);
        return executePutConferencePreference(request);
    }

    @SdkInternalApi
    final PutConferencePreferenceResult executePutConferencePreference(PutConferencePreferenceRequest putConferencePreferenceRequest) {

        ExecutionContext executionContext = createExecutionContext(putConferencePreferenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConferencePreferenceRequest> request = null;
        Response<PutConferencePreferenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConferencePreferenceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putConferencePreferenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutConferencePreference");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutConferencePreferenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutConferencePreferenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures the email template for the user enrollment invitation with the specified attributes.
     * </p>
     * 
     * @param putInvitationConfigurationRequest
     * @return Result of the PutInvitationConfiguration operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.PutInvitationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutInvitationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutInvitationConfigurationResult putInvitationConfiguration(PutInvitationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutInvitationConfiguration(request);
    }

    @SdkInternalApi
    final PutInvitationConfigurationResult executePutInvitationConfiguration(PutInvitationConfigurationRequest putInvitationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putInvitationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutInvitationConfigurationRequest> request = null;
        Response<PutInvitationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutInvitationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putInvitationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutInvitationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutInvitationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutInvitationConfigurationResultJsonUnmarshaller());
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
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRoomSkillParameter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role,
     * the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the
     * IAM role.
     * </p>
     * 
     * @param putSkillAuthorizationRequest
     * @return Result of the PutSkillAuthorization operation returned by the service.
     * @throws UnauthorizedException
     *         The caller has no permissions to operate on the resource involved in the API call.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.PutSkillAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutSkillAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutSkillAuthorizationResult putSkillAuthorization(PutSkillAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executePutSkillAuthorization(request);
    }

    @SdkInternalApi
    final PutSkillAuthorizationResult executePutSkillAuthorization(PutSkillAuthorizationRequest putSkillAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(putSkillAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSkillAuthorizationRequest> request = null;
        Response<PutSkillAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSkillAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putSkillAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSkillAuthorization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSkillAuthorizationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutSkillAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service
     * (AVS).
     * </p>
     * 
     * @param registerAVSDeviceRequest
     * @return Result of the RegisterAVSDevice operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws InvalidDeviceException
     *         The device is in an invalid state.
     * @sample AmazonAlexaForBusiness.RegisterAVSDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RegisterAVSDevice"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterAVSDeviceResult registerAVSDevice(RegisterAVSDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterAVSDevice(request);
    }

    @SdkInternalApi
    final RegisterAVSDeviceResult executeRegisterAVSDevice(RegisterAVSDeviceRequest registerAVSDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(registerAVSDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterAVSDeviceRequest> request = null;
        Response<RegisterAVSDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterAVSDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerAVSDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterAVSDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterAVSDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterAVSDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves
     * to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the
     * ApproveSkill API.
     * </p>
     * 
     * @param rejectSkillRequest
     * @return Result of the RejectSkill operation returned by the service.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.RejectSkill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RejectSkill" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RejectSkillResult rejectSkill(RejectSkillRequest request) {
        request = beforeClientExecution(request);
        return executeRejectSkill(request);
    }

    @SdkInternalApi
    final RejectSkillResult executeRejectSkill(RejectSkillRequest rejectSkillRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectSkillRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectSkillRequest> request = null;
        Response<RejectSkillResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectSkillRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rejectSkillRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectSkill");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectSkillResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RejectSkillResultJsonUnmarshaller());
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
     *         The resource is not found.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResolveRoom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeInvitation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Searches address books and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchAddressBooksRequest
     * @return Result of the SearchAddressBooks operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchAddressBooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchAddressBooks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchAddressBooksResult searchAddressBooks(SearchAddressBooksRequest request) {
        request = beforeClientExecution(request);
        return executeSearchAddressBooks(request);
    }

    @SdkInternalApi
    final SearchAddressBooksResult executeSearchAddressBooks(SearchAddressBooksRequest searchAddressBooksRequest) {

        ExecutionContext executionContext = createExecutionContext(searchAddressBooksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchAddressBooksRequest> request = null;
        Response<SearchAddressBooksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchAddressBooksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchAddressBooksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchAddressBooks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchAddressBooksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchAddressBooksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches contacts and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchContactsRequest
     * @return Result of the SearchContacts operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchContacts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchContactsResult searchContacts(SearchContactsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchContacts(request);
    }

    @SdkInternalApi
    final SearchContactsResult executeSearchContacts(SearchContactsRequest searchContactsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchContactsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchContactsRequest> request = null;
        Response<SearchContactsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchContactsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchContactsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchContacts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchContactsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchContactsResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchRooms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchSkillGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The resource is not found.
     * @throws InvalidUserStatusException
     *         The attempt to update a user is invalid due to the user's current status.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendInvitation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Resets a device and its account to the known default settings, by clearing all information and settings set by
     * previous users.
     * </p>
     * 
     * @param startDeviceSyncRequest
     * @return Result of the StartDeviceSync operation returned by the service.
     * @throws DeviceNotRegisteredException
     *         The request failed because this device is no longer registered and therefore no longer managed by this
     *         account.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDeviceSync");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Initiates the discovery of any smart home appliances associated with the room.
     * </p>
     * 
     * @param startSmartHomeApplianceDiscoveryRequest
     * @return Result of the StartSmartHomeApplianceDiscovery operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.StartSmartHomeApplianceDiscovery
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/StartSmartHomeApplianceDiscovery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartSmartHomeApplianceDiscoveryResult startSmartHomeApplianceDiscovery(StartSmartHomeApplianceDiscoveryRequest request) {
        request = beforeClientExecution(request);
        return executeStartSmartHomeApplianceDiscovery(request);
    }

    @SdkInternalApi
    final StartSmartHomeApplianceDiscoveryResult executeStartSmartHomeApplianceDiscovery(
            StartSmartHomeApplianceDiscoveryRequest startSmartHomeApplianceDiscoveryRequest) {

        ExecutionContext executionContext = createExecutionContext(startSmartHomeApplianceDiscoveryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSmartHomeApplianceDiscoveryRequest> request = null;
        Response<StartSmartHomeApplianceDiscoveryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSmartHomeApplianceDiscoveryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startSmartHomeApplianceDiscoveryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSmartHomeApplianceDiscovery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSmartHomeApplianceDiscoveryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartSmartHomeApplianceDiscoveryResultJsonUnmarshaller());
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
     *         The resource is not found.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
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
     * Removes metadata tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
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
     * Updates address book details by the address book ARN.
     * </p>
     * 
     * @param updateAddressBookRequest
     * @return Result of the UpdateAddressBook operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.UpdateAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAddressBookResult updateAddressBook(UpdateAddressBookRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAddressBook(request);
    }

    @SdkInternalApi
    final UpdateAddressBookResult executeUpdateAddressBook(UpdateAddressBookRequest updateAddressBookRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAddressBookRequest> request = null;
        Response<UpdateAddressBookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAddressBookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAddressBookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAddressBook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAddressBookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAddressBookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of the report delivery schedule with the specified schedule ARN.
     * </p>
     * 
     * @param updateBusinessReportScheduleRequest
     * @return Result of the UpdateBusinessReportSchedule operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.UpdateBusinessReportSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateBusinessReportSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateBusinessReportScheduleResult updateBusinessReportSchedule(UpdateBusinessReportScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBusinessReportSchedule(request);
    }

    @SdkInternalApi
    final UpdateBusinessReportScheduleResult executeUpdateBusinessReportSchedule(UpdateBusinessReportScheduleRequest updateBusinessReportScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBusinessReportScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBusinessReportScheduleRequest> request = null;
        Response<UpdateBusinessReportScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBusinessReportScheduleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateBusinessReportScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBusinessReportSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBusinessReportScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateBusinessReportScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing conference provider's settings.
     * </p>
     * 
     * @param updateConferenceProviderRequest
     * @return Result of the UpdateConferenceProvider operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.UpdateConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConferenceProviderResult updateConferenceProvider(UpdateConferenceProviderRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConferenceProvider(request);
    }

    @SdkInternalApi
    final UpdateConferenceProviderResult executeUpdateConferenceProvider(UpdateConferenceProviderRequest updateConferenceProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConferenceProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConferenceProviderRequest> request = null;
        Response<UpdateConferenceProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConferenceProviderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateConferenceProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConferenceProvider");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConferenceProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateConferenceProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the contact details by the contact ARN.
     * </p>
     * 
     * @param updateContactRequest
     * @return Result of the UpdateContact operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @sample AmazonAlexaForBusiness.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateContactResult updateContact(UpdateContactRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContact(request);
    }

    @SdkInternalApi
    final UpdateContactResult executeUpdateContact(UpdateContactRequest updateContactRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactRequest> request = null;
        Response<UpdateContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateContactResultJsonUnmarshaller());
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
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
     * @throws DeviceNotRegisteredException
     *         The request failed because this device is no longer registered and therefore no longer managed by this
     *         account.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * Updates the details of a gateway. If any optional field is not provided, the existing corresponding value is left
     * unmodified.
     * </p>
     * 
     * @param updateGatewayRequest
     * @return Result of the UpdateGateway operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @sample AmazonAlexaForBusiness.UpdateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateGateway" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateGatewayResult updateGateway(UpdateGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGateway(request);
    }

    @SdkInternalApi
    final UpdateGatewayResult executeUpdateGateway(UpdateGatewayRequest updateGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayRequest> request = null;
        Response<UpdateGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the details of a gateway group. If any optional field is not provided, the existing corresponding value
     * is left unmodified.
     * </p>
     * 
     * @param updateGatewayGroupRequest
     * @return Result of the UpdateGatewayGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @sample AmazonAlexaForBusiness.UpdateGatewayGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateGatewayGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGatewayGroupResult updateGatewayGroup(UpdateGatewayGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGatewayGroup(request);
    }

    @SdkInternalApi
    final UpdateGatewayGroupResult executeUpdateGatewayGroup(UpdateGatewayGroupRequest updateGatewayGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGatewayGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGatewayGroupRequest> request = null;
        Response<UpdateGatewayGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGatewayGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGatewayGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGatewayGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGatewayGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGatewayGroupResultJsonUnmarshaller());
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
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @throws ConcurrentModificationException
     *         There is a concurrent modification of resources.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSkillGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
