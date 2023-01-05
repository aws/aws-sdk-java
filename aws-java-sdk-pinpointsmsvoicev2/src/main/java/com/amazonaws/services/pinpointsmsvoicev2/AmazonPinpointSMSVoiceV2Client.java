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
package com.amazonaws.services.pinpointsmsvoicev2;

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

import com.amazonaws.services.pinpointsmsvoicev2.AmazonPinpointSMSVoiceV2ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.pinpointsmsvoicev2.model.*;
import com.amazonaws.services.pinpointsmsvoicev2.model.transform.*;

/**
 * Client for accessing Amazon Pinpoint SMS Voice V2. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <p>
 * Welcome to the <i>Amazon Pinpoint SMS and Voice, version 2 API Reference</i>. This guide provides information about
 * Amazon Pinpoint SMS and Voice, version 2 API resources, including supported HTTP methods, parameters, and schemas.
 * </p>
 * <p>
 * Amazon Pinpoint is an Amazon Web Services service that you can use to engage with your recipients across multiple
 * messaging channels. The Amazon Pinpoint SMS and Voice, version 2 API provides programmatic access to options that are
 * unique to the SMS and voice channels and supplements the resources provided by the Amazon Pinpoint API.
 * </p>
 * <p>
 * If you're new to Amazon Pinpoint, it's also helpful to review the <a
 * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html"> Amazon Pinpoint Developer Guide</a>.
 * The <i>Amazon Pinpoint Developer Guide</i> provides tutorials, code samples, and procedures that demonstrate how to
 * use Amazon Pinpoint features programmatically and how to integrate Amazon Pinpoint functionality into mobile apps and
 * other types of applications. The guide also provides key information, such as Amazon Pinpoint integration with other
 * Amazon Web Services services, and the quotas that apply to use of the service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPinpointSMSVoiceV2Client extends AmazonWebServiceClient implements AmazonPinpointSMSVoiceV2 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonPinpointSMSVoiceV2.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sms-voice";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpointsmsvoicev2.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpointsmsvoicev2.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpointsmsvoicev2.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpointsmsvoicev2.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpointsmsvoicev2.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpointsmsvoicev2.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pinpointsmsvoicev2.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.pinpointsmsvoicev2.model.AmazonPinpointSMSVoiceV2Exception.class));

    public static AmazonPinpointSMSVoiceV2ClientBuilder builder() {
        return AmazonPinpointSMSVoiceV2ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint SMS Voice V2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPinpointSMSVoiceV2Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Pinpoint SMS Voice V2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPinpointSMSVoiceV2Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("sms-voice.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/pinpointsmsvoicev2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/pinpointsmsvoicev2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates the specified origination identity with a pool.
     * </p>
     * <p>
     * If the origination identity is a phone number and is already associated with another pool, an Error is returned.
     * A sender ID can be associated with multiple pools.
     * </p>
     * <p>
     * If the origination identity configuration doesn't match the pool's configuration, an Error is returned.
     * </p>
     * 
     * @param associateOriginationIdentityRequest
     * @return Result of the AssociateOriginationIdentity operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.AssociateOriginationIdentity
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/AssociateOriginationIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateOriginationIdentityResult associateOriginationIdentity(AssociateOriginationIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateOriginationIdentity(request);
    }

    @SdkInternalApi
    final AssociateOriginationIdentityResult executeAssociateOriginationIdentity(AssociateOriginationIdentityRequest associateOriginationIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(associateOriginationIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateOriginationIdentityRequest> request = null;
        Response<AssociateOriginationIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateOriginationIdentityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateOriginationIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateOriginationIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateOriginationIdentityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateOriginationIdentityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new configuration set. After you create the configuration set, you can add one or more event
     * destinations to it.
     * </p>
     * <p>
     * A configuration set is a set of rules that you apply to the SMS and voice messages that you send.
     * </p>
     * <p>
     * When you send a message, you can optionally specify a single configuration set.
     * </p>
     * 
     * @param createConfigurationSetRequest
     * @return Result of the CreateConfigurationSet operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfigurationSet(request);
    }

    @SdkInternalApi
    final CreateConfigurationSetResult executeCreateConfigurationSet(CreateConfigurationSetRequest createConfigurationSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfigurationSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigurationSetRequest> request = null;
        Response<CreateConfigurationSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfigurationSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConfigurationSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfigurationSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConfigurationSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateConfigurationSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new event destination in a configuration set.
     * </p>
     * <p>
     * An event destination is a location where you send message events. The event options are Amazon CloudWatch, Amazon
     * Kinesis Data Firehose, or Amazon SNS. For example, when a message is delivered successfully, you can send
     * information about that event to an event destination, or send notifications to endpoints that are subscribed to
     * an Amazon SNS topic.
     * </p>
     * <p>
     * Each configuration set can contain between 0 and 5 event destinations. Each event destination can contain a
     * reference to a single destination, such as a CloudWatch or Kinesis Data Firehose destination.
     * </p>
     * 
     * @param createEventDestinationRequest
     * @return Result of the CreateEventDestination operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.CreateEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEventDestinationResult createEventDestination(CreateEventDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEventDestination(request);
    }

    @SdkInternalApi
    final CreateEventDestinationResult executeCreateEventDestination(CreateEventDestinationRequest createEventDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(createEventDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventDestinationRequest> request = null;
        Response<CreateEventDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEventDestinationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEventDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEventDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEventDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateEventDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new opt-out list.
     * </p>
     * <p>
     * If the opt-out list name already exists, an Error is returned.
     * </p>
     * <p>
     * An opt-out list is a list of phone numbers that are opted out, meaning you can't send SMS or voice messages to
     * them. If end user replies with the keyword "STOP," an entry for the phone number is added to the opt-out list. In
     * addition to STOP, your recipients can use any supported opt-out keyword, such as CANCEL or OPTOUT. For a list of
     * supported opt-out keywords, see <a href=
     * "https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-manage.html#channels-sms-manage-optout"> SMS
     * opt out </a> in the <i>Amazon Pinpoint User Guide</i>.
     * </p>
     * 
     * @param createOptOutListRequest
     * @return Result of the CreateOptOutList operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.CreateOptOutList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateOptOutList"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateOptOutListResult createOptOutList(CreateOptOutListRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOptOutList(request);
    }

    @SdkInternalApi
    final CreateOptOutListResult executeCreateOptOutList(CreateOptOutListRequest createOptOutListRequest) {

        ExecutionContext executionContext = createExecutionContext(createOptOutListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOptOutListRequest> request = null;
        Response<CreateOptOutListResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOptOutListRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createOptOutListRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOptOutList");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateOptOutListResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateOptOutListResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new pool and associates the specified origination identity to the pool. A pool can include one or more
     * phone numbers and SenderIds that are associated with your Amazon Web Services account.
     * </p>
     * <p>
     * The new pool inherits its configuration from the specified origination identity. This includes keywords, message
     * type, opt-out list, two-way configuration, and self-managed opt-out configuration. Deletion protection isn't
     * inherited from the origination identity and defaults to false.
     * </p>
     * <p>
     * If the origination identity is a phone number and is already associated with another pool, an Error is returned.
     * A sender ID can be associated with multiple pools.
     * </p>
     * 
     * @param createPoolRequest
     * @return Result of the CreatePool operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.CreatePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreatePool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePoolResult createPool(CreatePoolRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePool(request);
    }

    @SdkInternalApi
    final CreatePoolResult executeCreatePool(CreatePoolRequest createPoolRequest) {

        ExecutionContext executionContext = createExecutionContext(createPoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePoolRequest> request = null;
        Response<CreatePoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePoolResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing configuration set.
     * </p>
     * <p>
     * A configuration set is a set of rules that you apply to voice and SMS messages that you send. In a configuration
     * set, you can specify a destination for specific types of events related to voice and SMS messages.
     * </p>
     * 
     * @param deleteConfigurationSetRequest
     * @return Result of the DeleteConfigurationSet operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteConfigurationSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfigurationSetResult deleteConfigurationSet(DeleteConfigurationSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfigurationSet(request);
    }

    @SdkInternalApi
    final DeleteConfigurationSetResult executeDeleteConfigurationSet(DeleteConfigurationSetRequest deleteConfigurationSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfigurationSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigurationSetRequest> request = null;
        Response<DeleteConfigurationSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigurationSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConfigurationSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfigurationSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfigurationSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConfigurationSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing default message type on a configuration set.
     * </p>
     * <p>
     * A message type is a type of messages that you plan to send. If you send account-related messages or
     * time-sensitive messages such as one-time passcodes, choose <b>Transactional</b>. If you plan to send messages
     * that contain marketing material or other promotional content, choose <b>Promotional</b>. This setting applies to
     * your entire Amazon Web Services account.
     * </p>
     * 
     * @param deleteDefaultMessageTypeRequest
     * @return Result of the DeleteDefaultMessageType operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteDefaultMessageType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteDefaultMessageType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDefaultMessageTypeResult deleteDefaultMessageType(DeleteDefaultMessageTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDefaultMessageType(request);
    }

    @SdkInternalApi
    final DeleteDefaultMessageTypeResult executeDeleteDefaultMessageType(DeleteDefaultMessageTypeRequest deleteDefaultMessageTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDefaultMessageTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDefaultMessageTypeRequest> request = null;
        Response<DeleteDefaultMessageTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDefaultMessageTypeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDefaultMessageTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDefaultMessageType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDefaultMessageTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDefaultMessageTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing default sender ID on a configuration set.
     * </p>
     * <p>
     * A default sender ID is the identity that appears on recipients' devices when they receive SMS messages. Support
     * for sender ID capabilities varies by country or region.
     * </p>
     * 
     * @param deleteDefaultSenderIdRequest
     * @return Result of the DeleteDefaultSenderId operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteDefaultSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteDefaultSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDefaultSenderIdResult deleteDefaultSenderId(DeleteDefaultSenderIdRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDefaultSenderId(request);
    }

    @SdkInternalApi
    final DeleteDefaultSenderIdResult executeDeleteDefaultSenderId(DeleteDefaultSenderIdRequest deleteDefaultSenderIdRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDefaultSenderIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDefaultSenderIdRequest> request = null;
        Response<DeleteDefaultSenderIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDefaultSenderIdRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDefaultSenderIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDefaultSenderId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDefaultSenderIdResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteDefaultSenderIdResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing event destination.
     * </p>
     * <p>
     * An event destination is a location where you send response information about the messages that you send. For
     * example, when a message is delivered successfully, you can send information about that event to an Amazon
     * CloudWatch destination, or send notifications to endpoints that are subscribed to an Amazon SNS topic.
     * </p>
     * 
     * @param deleteEventDestinationRequest
     * @return Result of the DeleteEventDestination operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEventDestinationResult deleteEventDestination(DeleteEventDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEventDestination(request);
    }

    @SdkInternalApi
    final DeleteEventDestinationResult executeDeleteEventDestination(DeleteEventDestinationRequest deleteEventDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventDestinationRequest> request = null;
        Response<DeleteEventDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventDestinationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEventDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEventDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEventDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEventDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing keyword from an origination phone number or pool.
     * </p>
     * <p>
     * A keyword is a word that you can search for on a particular phone number or pool. It is also a specific word or
     * phrase that an end user can send to your number to elicit a response, such as an informational message or a
     * special offer. When your number receives a message that begins with a keyword, Amazon Pinpoint responds with a
     * customizable message.
     * </p>
     * <p>
     * Keywords "HELP" and "STOP" can't be deleted or modified.
     * </p>
     * 
     * @param deleteKeywordRequest
     * @return Result of the DeleteKeyword operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteKeyword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteKeyword"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteKeywordResult deleteKeyword(DeleteKeywordRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteKeyword(request);
    }

    @SdkInternalApi
    final DeleteKeywordResult executeDeleteKeyword(DeleteKeywordRequest deleteKeywordRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteKeywordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteKeywordRequest> request = null;
        Response<DeleteKeywordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteKeywordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteKeywordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteKeyword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteKeywordResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteKeywordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing opt-out list. All opted out phone numbers in the opt-out list are deleted.
     * </p>
     * <p>
     * If the specified opt-out list name doesn't exist or is in-use by an origination phone number or pool, an Error is
     * returned.
     * </p>
     * 
     * @param deleteOptOutListRequest
     * @return Result of the DeleteOptOutList operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteOptOutList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteOptOutList"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteOptOutListResult deleteOptOutList(DeleteOptOutListRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOptOutList(request);
    }

    @SdkInternalApi
    final DeleteOptOutListResult executeDeleteOptOutList(DeleteOptOutListRequest deleteOptOutListRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOptOutListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOptOutListRequest> request = null;
        Response<DeleteOptOutListResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOptOutListRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteOptOutListRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOptOutList");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOptOutListResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteOptOutListResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing opted out destination phone number from the specified opt-out list.
     * </p>
     * <p>
     * Each destination phone number can only be deleted once every 30 days.
     * </p>
     * <p>
     * If the specified destination phone number doesn't exist or if the opt-out list doesn't exist, an Error is
     * returned.
     * </p>
     * 
     * @param deleteOptedOutNumberRequest
     * @return Result of the DeleteOptedOutNumber operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteOptedOutNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteOptedOutNumber"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteOptedOutNumberResult deleteOptedOutNumber(DeleteOptedOutNumberRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOptedOutNumber(request);
    }

    @SdkInternalApi
    final DeleteOptedOutNumberResult executeDeleteOptedOutNumber(DeleteOptedOutNumberRequest deleteOptedOutNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOptedOutNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOptedOutNumberRequest> request = null;
        Response<DeleteOptedOutNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOptedOutNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteOptedOutNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOptedOutNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOptedOutNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteOptedOutNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing pool. Deleting a pool disassociates all origination identities from that pool.
     * </p>
     * <p>
     * If the pool status isn't active or if deletion protection is enabled, an Error is returned.
     * </p>
     * <p>
     * A pool is a collection of phone numbers and SenderIds. A pool can include one or more phone numbers and SenderIds
     * that are associated with your Amazon Web Services account.
     * </p>
     * 
     * @param deletePoolRequest
     * @return Result of the DeletePool operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeletePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeletePool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePoolResult deletePool(DeletePoolRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePool(request);
    }

    @SdkInternalApi
    final DeletePoolResult executeDeletePool(DeletePoolRequest deletePoolRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePoolRequest> request = null;
        Response<DeletePoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePoolResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePoolResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an account-level monthly spending limit override for sending text messages. Deleting a spend limit
     * override will set the <code>EnforcedLimit</code> to equal the <code>MaxLimit</code>, which is controlled by
     * Amazon Web Services. For more information on spend limits (quotas) see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/quotas.html">Amazon Pinpoint quotas </a> in the
     * <i>Amazon Pinpoint Developer Guide</i>.
     * </p>
     * 
     * @param deleteTextMessageSpendLimitOverrideRequest
     * @return Result of the DeleteTextMessageSpendLimitOverride operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteTextMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteTextMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTextMessageSpendLimitOverrideResult deleteTextMessageSpendLimitOverride(DeleteTextMessageSpendLimitOverrideRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTextMessageSpendLimitOverride(request);
    }

    @SdkInternalApi
    final DeleteTextMessageSpendLimitOverrideResult executeDeleteTextMessageSpendLimitOverride(
            DeleteTextMessageSpendLimitOverrideRequest deleteTextMessageSpendLimitOverrideRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTextMessageSpendLimitOverrideRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTextMessageSpendLimitOverrideRequest> request = null;
        Response<DeleteTextMessageSpendLimitOverrideResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTextMessageSpendLimitOverrideRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteTextMessageSpendLimitOverrideRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTextMessageSpendLimitOverride");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTextMessageSpendLimitOverrideResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteTextMessageSpendLimitOverrideResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an account level monthly spend limit override for sending voice messages. Deleting a spend limit override
     * sets the <code>EnforcedLimit</code> equal to the <code>MaxLimit</code>, which is controlled by Amazon Web
     * Services. For more information on spending limits (quotas) see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/quotas.html">Amazon Pinpoint quotas</a> in the
     * <i>Amazon Pinpoint Developer Guide</i>.
     * </p>
     * 
     * @param deleteVoiceMessageSpendLimitOverrideRequest
     * @return Result of the DeleteVoiceMessageSpendLimitOverride operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DeleteVoiceMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteVoiceMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceMessageSpendLimitOverrideResult deleteVoiceMessageSpendLimitOverride(DeleteVoiceMessageSpendLimitOverrideRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceMessageSpendLimitOverride(request);
    }

    @SdkInternalApi
    final DeleteVoiceMessageSpendLimitOverrideResult executeDeleteVoiceMessageSpendLimitOverride(
            DeleteVoiceMessageSpendLimitOverrideRequest deleteVoiceMessageSpendLimitOverrideRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceMessageSpendLimitOverrideRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceMessageSpendLimitOverrideRequest> request = null;
        Response<DeleteVoiceMessageSpendLimitOverrideResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceMessageSpendLimitOverrideRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVoiceMessageSpendLimitOverrideRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceMessageSpendLimitOverride");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceMessageSpendLimitOverrideResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVoiceMessageSpendLimitOverrideResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes attributes of your Amazon Web Services account. The supported account attributes include account tier,
     * which indicates whether your account is in the sandbox or production environment. When you're ready to move your
     * account out of the sandbox, create an Amazon Web Services Support case for a service limit increase request.
     * </p>
     * <p>
     * New Amazon Pinpoint accounts are placed into an SMS or voice sandbox. The sandbox protects both Amazon Web
     * Services end recipients and SMS or voice recipients from fraud and abuse.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeAccountAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountAttributes(request);
    }

    @SdkInternalApi
    final DescribeAccountAttributesResult executeDescribeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountAttributesRequest> request = null;
        Response<DescribeAccountAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccountAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAccountAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the current Amazon Pinpoint SMS Voice V2 resource quotas for your account. The description for a quota
     * includes the quota name, current usage toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * When you establish an Amazon Web Services account, the account has initial quotas on the maximum number of
     * configuration sets, opt-out lists, phone numbers, and pools that you can create in a given Region. For more
     * information see <a href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/quotas.html"> Amazon Pinpoint
     * quotas </a> in the <i>Amazon Pinpoint Developer Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @return Result of the DescribeAccountLimits operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountLimits(request);
    }

    @SdkInternalApi
    final DescribeAccountLimitsResult executeDescribeAccountLimits(DescribeAccountLimitsRequest describeAccountLimitsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountLimitsRequest> request = null;
        Response<DescribeAccountLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountLimitsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAccountLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountLimits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountLimitsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeAccountLimitsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified configuration sets or all in your account.
     * </p>
     * <p>
     * If you specify configuration set names, the output includes information for only the specified configuration
     * sets. If you specify filters, the output includes information for only those configuration sets that meet the
     * filter criteria. If you don't specify configuration set names or filters, the output includes information for all
     * configuration sets.
     * </p>
     * <p>
     * If you specify a configuration set name that isn't valid, an error is returned.
     * </p>
     * 
     * @param describeConfigurationSetsRequest
     * @return Result of the DescribeConfigurationSets operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeConfigurationSets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConfigurationSetsResult describeConfigurationSets(DescribeConfigurationSetsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConfigurationSets(request);
    }

    @SdkInternalApi
    final DescribeConfigurationSetsResult executeDescribeConfigurationSets(DescribeConfigurationSetsRequest describeConfigurationSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConfigurationSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationSetsRequest> request = null;
        Response<DescribeConfigurationSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationSetsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConfigurationSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConfigurationSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConfigurationSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConfigurationSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified keywords or all keywords on your origination phone number or pool.
     * </p>
     * <p>
     * A keyword is a word that you can search for on a particular phone number or pool. It is also a specific word or
     * phrase that an end user can send to your number to elicit a response, such as an informational message or a
     * special offer. When your number receives a message that begins with a keyword, Amazon Pinpoint responds with a
     * customizable message.
     * </p>
     * <p>
     * If you specify a keyword that isn't valid, an Error is returned.
     * </p>
     * 
     * @param describeKeywordsRequest
     * @return Result of the DescribeKeywords operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeKeywords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeKeywords"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeKeywordsResult describeKeywords(DescribeKeywordsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeKeywords(request);
    }

    @SdkInternalApi
    final DescribeKeywordsResult executeDescribeKeywords(DescribeKeywordsRequest describeKeywordsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeKeywordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeKeywordsRequest> request = null;
        Response<DescribeKeywordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeKeywordsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeKeywordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeKeywords");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeKeywordsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeKeywordsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified opt-out list or all opt-out lists in your account.
     * </p>
     * <p>
     * If you specify opt-out list names, the output includes information for only the specified opt-out lists. Opt-out
     * lists include only those that meet the filter criteria. If you don't specify opt-out list names or filters, the
     * output includes information for all opt-out lists.
     * </p>
     * <p>
     * If you specify an opt-out list name that isn't valid, an Error is returned.
     * </p>
     * 
     * @param describeOptOutListsRequest
     * @return Result of the DescribeOptOutLists operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeOptOutLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeOptOutLists"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOptOutListsResult describeOptOutLists(DescribeOptOutListsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOptOutLists(request);
    }

    @SdkInternalApi
    final DescribeOptOutListsResult executeDescribeOptOutLists(DescribeOptOutListsRequest describeOptOutListsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOptOutListsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOptOutListsRequest> request = null;
        Response<DescribeOptOutListsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOptOutListsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeOptOutListsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOptOutLists");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOptOutListsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeOptOutListsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified opted out destination numbers or all opted out destination numbers in an opt-out list.
     * </p>
     * <p>
     * If you specify opted out numbers, the output includes information for only the specified opted out numbers. If
     * you specify filters, the output includes information for only those opted out numbers that meet the filter
     * criteria. If you don't specify opted out numbers or filters, the output includes information for all opted out
     * destination numbers in your opt-out list.
     * </p>
     * <p>
     * If you specify an opted out number that isn't valid, an Error is returned.
     * </p>
     * 
     * @param describeOptedOutNumbersRequest
     * @return Result of the DescribeOptedOutNumbers operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeOptedOutNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeOptedOutNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOptedOutNumbersResult describeOptedOutNumbers(DescribeOptedOutNumbersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOptedOutNumbers(request);
    }

    @SdkInternalApi
    final DescribeOptedOutNumbersResult executeDescribeOptedOutNumbers(DescribeOptedOutNumbersRequest describeOptedOutNumbersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOptedOutNumbersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOptedOutNumbersRequest> request = null;
        Response<DescribeOptedOutNumbersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOptedOutNumbersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOptedOutNumbersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOptedOutNumbers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOptedOutNumbersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeOptedOutNumbersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified origination phone number, or all the phone numbers in your account.
     * </p>
     * <p>
     * If you specify phone number IDs, the output includes information for only the specified phone numbers. If you
     * specify filters, the output includes information for only those phone numbers that meet the filter criteria. If
     * you don't specify phone number IDs or filters, the output includes information for all phone numbers.
     * </p>
     * <p>
     * If you specify a phone number ID that isn't valid, an Error is returned.
     * </p>
     * 
     * @param describePhoneNumbersRequest
     * @return Result of the DescribePhoneNumbers operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePhoneNumbersResult describePhoneNumbers(DescribePhoneNumbersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePhoneNumbers(request);
    }

    @SdkInternalApi
    final DescribePhoneNumbersResult executeDescribePhoneNumbers(DescribePhoneNumbersRequest describePhoneNumbersRequest) {

        ExecutionContext executionContext = createExecutionContext(describePhoneNumbersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePhoneNumbersRequest> request = null;
        Response<DescribePhoneNumbersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePhoneNumbersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePhoneNumbersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePhoneNumbers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePhoneNumbersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePhoneNumbersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified pools or all pools associated with your Amazon Web Services account.
     * </p>
     * <p>
     * If you specify pool IDs, the output includes information for only the specified pools. If you specify filters,
     * the output includes information for only those pools that meet the filter criteria. If you don't specify pool IDs
     * or filters, the output includes information for all pools.
     * </p>
     * <p>
     * If you specify a pool ID that isn't valid, an Error is returned.
     * </p>
     * <p>
     * A pool is a collection of phone numbers and SenderIds. A pool can include one or more phone numbers and SenderIds
     * that are associated with your Amazon Web Services account.
     * </p>
     * 
     * @param describePoolsRequest
     * @return Result of the DescribePools operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribePools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribePools"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePoolsResult describePools(DescribePoolsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePools(request);
    }

    @SdkInternalApi
    final DescribePoolsResult executeDescribePools(DescribePoolsRequest describePoolsRequest) {

        ExecutionContext executionContext = createExecutionContext(describePoolsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePoolsRequest> request = null;
        Response<DescribePoolsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePoolsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePoolsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePools");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePoolsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePoolsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified SenderIds or all SenderIds associated with your Amazon Web Services account.
     * </p>
     * <p>
     * If you specify SenderIds, the output includes information for only the specified SenderIds. If you specify
     * filters, the output includes information for only those SenderIds that meet the filter criteria. If you don't
     * specify SenderIds or filters, the output includes information for all SenderIds.
     * </p>
     * <p>
     * f you specify a sender ID that isn't valid, an Error is returned.
     * </p>
     * 
     * @param describeSenderIdsRequest
     * @return Result of the DescribeSenderIds operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeSenderIds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeSenderIds"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSenderIdsResult describeSenderIds(DescribeSenderIdsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSenderIds(request);
    }

    @SdkInternalApi
    final DescribeSenderIdsResult executeDescribeSenderIds(DescribeSenderIdsRequest describeSenderIdsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSenderIdsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSenderIdsRequest> request = null;
        Response<DescribeSenderIdsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSenderIdsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSenderIdsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSenderIds");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSenderIdsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSenderIdsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the current Amazon Pinpoint monthly spend limits for sending voice and text messages.
     * </p>
     * <p>
     * When you establish an Amazon Web Services account, the account has initial monthly spend limit in a given Region.
     * For more information on increasing your monthly spend limit, see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-awssupport-spend-threshold.html">
     * Requesting increases to your monthly SMS spending quota for Amazon Pinpoint </a> in the <i>Amazon Pinpoint User
     * Guide</i>.
     * </p>
     * 
     * @param describeSpendLimitsRequest
     * @return Result of the DescribeSpendLimits operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DescribeSpendLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeSpendLimits"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSpendLimitsResult describeSpendLimits(DescribeSpendLimitsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSpendLimits(request);
    }

    @SdkInternalApi
    final DescribeSpendLimitsResult executeDescribeSpendLimits(DescribeSpendLimitsRequest describeSpendLimitsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSpendLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSpendLimitsRequest> request = null;
        Response<DescribeSpendLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSpendLimitsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSpendLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSpendLimits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSpendLimitsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSpendLimitsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified origination identity from an existing pool.
     * </p>
     * <p>
     * If the origination identity isn't associated with the specified pool, an Error is returned.
     * </p>
     * 
     * @param disassociateOriginationIdentityRequest
     * @return Result of the DisassociateOriginationIdentity operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.DisassociateOriginationIdentity
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DisassociateOriginationIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateOriginationIdentityResult disassociateOriginationIdentity(DisassociateOriginationIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateOriginationIdentity(request);
    }

    @SdkInternalApi
    final DisassociateOriginationIdentityResult executeDisassociateOriginationIdentity(
            DisassociateOriginationIdentityRequest disassociateOriginationIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateOriginationIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateOriginationIdentityRequest> request = null;
        Response<DisassociateOriginationIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateOriginationIdentityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateOriginationIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateOriginationIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateOriginationIdentityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateOriginationIdentityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all associated origination identities in your pool.
     * </p>
     * <p>
     * If you specify filters, the output includes information for only those origination identities that meet the
     * filter criteria.
     * </p>
     * 
     * @param listPoolOriginationIdentitiesRequest
     * @return Result of the ListPoolOriginationIdentities operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.ListPoolOriginationIdentities
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ListPoolOriginationIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPoolOriginationIdentitiesResult listPoolOriginationIdentities(ListPoolOriginationIdentitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListPoolOriginationIdentities(request);
    }

    @SdkInternalApi
    final ListPoolOriginationIdentitiesResult executeListPoolOriginationIdentities(ListPoolOriginationIdentitiesRequest listPoolOriginationIdentitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPoolOriginationIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPoolOriginationIdentitiesRequest> request = null;
        Response<ListPoolOriginationIdentitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPoolOriginationIdentitiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPoolOriginationIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPoolOriginationIdentities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPoolOriginationIdentitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPoolOriginationIdentitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
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
     * Creates or updates a keyword configuration on an origination phone number or pool.
     * </p>
     * <p>
     * A keyword is a word that you can search for on a particular phone number or pool. It is also a specific word or
     * phrase that an end user can send to your number to elicit a response, such as an informational message or a
     * special offer. When your number receives a message that begins with a keyword, Amazon Pinpoint responds with a
     * customizable message.
     * </p>
     * <p>
     * If you specify a keyword that isn't valid, an Error is returned.
     * </p>
     * 
     * @param putKeywordRequest
     * @return Result of the PutKeyword operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.PutKeyword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutKeyword"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutKeywordResult putKeyword(PutKeywordRequest request) {
        request = beforeClientExecution(request);
        return executePutKeyword(request);
    }

    @SdkInternalApi
    final PutKeywordResult executePutKeyword(PutKeywordRequest putKeywordRequest) {

        ExecutionContext executionContext = createExecutionContext(putKeywordRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutKeywordRequest> request = null;
        Response<PutKeywordResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutKeywordRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putKeywordRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutKeyword");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutKeywordResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutKeywordResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an opted out destination phone number in the opt-out list.
     * </p>
     * <p>
     * If the destination phone number isn't valid or if the specified opt-out list doesn't exist, an Error is returned.
     * </p>
     * 
     * @param putOptedOutNumberRequest
     * @return Result of the PutOptedOutNumber operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.PutOptedOutNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutOptedOutNumber"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutOptedOutNumberResult putOptedOutNumber(PutOptedOutNumberRequest request) {
        request = beforeClientExecution(request);
        return executePutOptedOutNumber(request);
    }

    @SdkInternalApi
    final PutOptedOutNumberResult executePutOptedOutNumber(PutOptedOutNumberRequest putOptedOutNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(putOptedOutNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutOptedOutNumberRequest> request = null;
        Response<PutOptedOutNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutOptedOutNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putOptedOutNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutOptedOutNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutOptedOutNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutOptedOutNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Releases an existing origination phone number in your account. Once released, a phone number is no longer
     * available for sending messages.
     * </p>
     * <p>
     * If the origination phone number has deletion protection enabled or is associated with a pool, an Error is
     * returned.
     * </p>
     * 
     * @param releasePhoneNumberRequest
     * @return Result of the ReleasePhoneNumber operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.ReleasePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ReleasePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReleasePhoneNumberResult releasePhoneNumber(ReleasePhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeReleasePhoneNumber(request);
    }

    @SdkInternalApi
    final ReleasePhoneNumberResult executeReleasePhoneNumber(ReleasePhoneNumberRequest releasePhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(releasePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReleasePhoneNumberRequest> request = null;
        Response<ReleasePhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReleasePhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(releasePhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReleasePhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReleasePhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReleasePhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Request an origination phone number for use in your account. For more information on phone number request see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/settings-sms-request-number.html"> Requesting a
     * number </a> in the <i>Amazon Pinpoint User Guide</i>.
     * </p>
     * 
     * @param requestPhoneNumberRequest
     * @return Result of the RequestPhoneNumber operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.RequestPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RequestPhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RequestPhoneNumberResult requestPhoneNumber(RequestPhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeRequestPhoneNumber(request);
    }

    @SdkInternalApi
    final RequestPhoneNumberResult executeRequestPhoneNumber(RequestPhoneNumberRequest requestPhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(requestPhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RequestPhoneNumberRequest> request = null;
        Response<RequestPhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RequestPhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(requestPhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RequestPhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RequestPhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RequestPhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new text message and sends it to a recipient's phone number.
     * </p>
     * <p>
     * SMS throughput limits are measured in Message Parts per Second (MPS). Your MPS limit depends on the destination
     * country of your messages, as well as the type of phone number (origination number) that you use to send the
     * message. For more information, see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-limitations-mps.html">Message Parts per
     * Second (MPS) limits</a> in the <i>Amazon Pinpoint User Guide</i>.
     * </p>
     * 
     * @param sendTextMessageRequest
     * @return Result of the SendTextMessage operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.SendTextMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendTextMessage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendTextMessageResult sendTextMessage(SendTextMessageRequest request) {
        request = beforeClientExecution(request);
        return executeSendTextMessage(request);
    }

    @SdkInternalApi
    final SendTextMessageResult executeSendTextMessage(SendTextMessageRequest sendTextMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(sendTextMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendTextMessageRequest> request = null;
        Response<SendTextMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendTextMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendTextMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendTextMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendTextMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendTextMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to send a request that sends a text message through Amazon Pinpoint. This operation uses <a
     * href="http://aws.amazon.com/polly/">Amazon Polly</a> to convert a text script into a voice message.
     * </p>
     * 
     * @param sendVoiceMessageRequest
     * @return Result of the SendVoiceMessage operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.SendVoiceMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendVoiceMessage"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendVoiceMessageResult sendVoiceMessage(SendVoiceMessageRequest request) {
        request = beforeClientExecution(request);
        return executeSendVoiceMessage(request);
    }

    @SdkInternalApi
    final SendVoiceMessageResult executeSendVoiceMessage(SendVoiceMessageRequest sendVoiceMessageRequest) {

        ExecutionContext executionContext = createExecutionContext(sendVoiceMessageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendVoiceMessageRequest> request = null;
        Response<SendVoiceMessageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendVoiceMessageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendVoiceMessageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendVoiceMessage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendVoiceMessageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendVoiceMessageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the default message type on a configuration set.
     * </p>
     * <p>
     * Choose the category of SMS messages that you plan to send from this account. If you send account-related messages
     * or time-sensitive messages such as one-time passcodes, choose <b>Transactional</b>. If you plan to send messages
     * that contain marketing material or other promotional content, choose <b>Promotional</b>. This setting applies to
     * your entire Amazon Web Services account.
     * </p>
     * 
     * @param setDefaultMessageTypeRequest
     * @return Result of the SetDefaultMessageType operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.SetDefaultMessageType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetDefaultMessageType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetDefaultMessageTypeResult setDefaultMessageType(SetDefaultMessageTypeRequest request) {
        request = beforeClientExecution(request);
        return executeSetDefaultMessageType(request);
    }

    @SdkInternalApi
    final SetDefaultMessageTypeResult executeSetDefaultMessageType(SetDefaultMessageTypeRequest setDefaultMessageTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(setDefaultMessageTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetDefaultMessageTypeRequest> request = null;
        Response<SetDefaultMessageTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetDefaultMessageTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setDefaultMessageTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetDefaultMessageType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetDefaultMessageTypeResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new SetDefaultMessageTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets default sender ID on a configuration set.
     * </p>
     * <p>
     * When sending a text message to a destination country that supports sender IDs, the default sender ID on the
     * configuration set specified will be used if no dedicated origination phone numbers or registered sender IDs are
     * available in your account.
     * </p>
     * 
     * @param setDefaultSenderIdRequest
     * @return Result of the SetDefaultSenderId operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.SetDefaultSenderId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetDefaultSenderId"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetDefaultSenderIdResult setDefaultSenderId(SetDefaultSenderIdRequest request) {
        request = beforeClientExecution(request);
        return executeSetDefaultSenderId(request);
    }

    @SdkInternalApi
    final SetDefaultSenderIdResult executeSetDefaultSenderId(SetDefaultSenderIdRequest setDefaultSenderIdRequest) {

        ExecutionContext executionContext = createExecutionContext(setDefaultSenderIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetDefaultSenderIdRequest> request = null;
        Response<SetDefaultSenderIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetDefaultSenderIdRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(setDefaultSenderIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetDefaultSenderId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetDefaultSenderIdResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetDefaultSenderIdResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets an account level monthly spend limit override for sending text messages. The requested spend limit must be
     * less than or equal to the <code>MaxLimit</code>, which is set by Amazon Web Services.
     * </p>
     * 
     * @param setTextMessageSpendLimitOverrideRequest
     * @return Result of the SetTextMessageSpendLimitOverride operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.SetTextMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetTextMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetTextMessageSpendLimitOverrideResult setTextMessageSpendLimitOverride(SetTextMessageSpendLimitOverrideRequest request) {
        request = beforeClientExecution(request);
        return executeSetTextMessageSpendLimitOverride(request);
    }

    @SdkInternalApi
    final SetTextMessageSpendLimitOverrideResult executeSetTextMessageSpendLimitOverride(
            SetTextMessageSpendLimitOverrideRequest setTextMessageSpendLimitOverrideRequest) {

        ExecutionContext executionContext = createExecutionContext(setTextMessageSpendLimitOverrideRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTextMessageSpendLimitOverrideRequest> request = null;
        Response<SetTextMessageSpendLimitOverrideResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetTextMessageSpendLimitOverrideRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(setTextMessageSpendLimitOverrideRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetTextMessageSpendLimitOverride");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetTextMessageSpendLimitOverrideResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SetTextMessageSpendLimitOverrideResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets an account level monthly spend limit override for sending voice messages. The requested spend limit must be
     * less than or equal to the <code>MaxLimit</code>, which is set by Amazon Web Services.
     * </p>
     * 
     * @param setVoiceMessageSpendLimitOverrideRequest
     * @return Result of the SetVoiceMessageSpendLimitOverride operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.SetVoiceMessageSpendLimitOverride
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SetVoiceMessageSpendLimitOverride"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetVoiceMessageSpendLimitOverrideResult setVoiceMessageSpendLimitOverride(SetVoiceMessageSpendLimitOverrideRequest request) {
        request = beforeClientExecution(request);
        return executeSetVoiceMessageSpendLimitOverride(request);
    }

    @SdkInternalApi
    final SetVoiceMessageSpendLimitOverrideResult executeSetVoiceMessageSpendLimitOverride(
            SetVoiceMessageSpendLimitOverrideRequest setVoiceMessageSpendLimitOverrideRequest) {

        ExecutionContext executionContext = createExecutionContext(setVoiceMessageSpendLimitOverrideRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetVoiceMessageSpendLimitOverrideRequest> request = null;
        Response<SetVoiceMessageSpendLimitOverrideResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetVoiceMessageSpendLimitOverrideRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(setVoiceMessageSpendLimitOverrideRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetVoiceMessageSpendLimitOverride");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetVoiceMessageSpendLimitOverrideResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SetVoiceMessageSpendLimitOverrideResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or overwrites only the specified tags for the specified Amazon Pinpoint SMS Voice, version 2 resource. When
     * you specify an existing tag key, the value is overwritten with the new value. Each resource can have a maximum of
     * 50 tags. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more
     * information about tags, see <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/tagging-resources.html"> Tagging Amazon Pinpoint
     * resources</a> in the <i>Amazon Pinpoint Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/TagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
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
     * Removes the association of the specified tags from an Amazon Pinpoint SMS Voice V2 resource. For more information
     * on tags see <a href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/tagging-resources.html"> Tagging
     * Amazon Pinpoint resources</a> in the <i>Amazon Pinpoint Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UntagResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
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
     * Updates an existing event destination in a configuration set. You can update the IAM role ARN for CloudWatch Logs
     * and Kinesis Data Firehose. You can also enable or disable the event destination.
     * </p>
     * <p>
     * You may want to update an event destination to change its matching event types or updating the destination
     * resource ARN. You can't change an event destination's type between CloudWatch Logs, Kinesis Data Firehose, and
     * Amazon SNS.
     * </p>
     * 
     * @param updateEventDestinationRequest
     * @return Result of the UpdateEventDestination operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.UpdateEventDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdateEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEventDestinationResult updateEventDestination(UpdateEventDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEventDestination(request);
    }

    @SdkInternalApi
    final UpdateEventDestinationResult executeUpdateEventDestination(UpdateEventDestinationRequest updateEventDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEventDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEventDestinationRequest> request = null;
        Response<UpdateEventDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEventDestinationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEventDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEventDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEventDestinationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEventDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of an existing origination phone number. You can update the opt-out list, enable or
     * disable two-way messaging, change the TwoWayChannelArn, enable or disable self-managed opt-outs, and enable or
     * disable deletion protection.
     * </p>
     * <p>
     * If the origination phone number is associated with a pool, an Error is returned.
     * </p>
     * 
     * @param updatePhoneNumberRequest
     * @return Result of the UpdatePhoneNumber operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePhoneNumberResult updatePhoneNumber(UpdatePhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePhoneNumber(request);
    }

    @SdkInternalApi
    final UpdatePhoneNumberResult executeUpdatePhoneNumber(UpdatePhoneNumberRequest updatePhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePhoneNumberRequest> request = null;
        Response<UpdatePhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of an existing pool. You can update the opt-out list, enable or disable two-way
     * messaging, change the <code>TwoWayChannelArn</code>, enable or disable self-managed opt-outs, enable or disable
     * deletion protection, and enable or disable shared routes.
     * </p>
     * 
     * @param updatePoolRequest
     * @return Result of the UpdatePool operation returned by the service.
     * @throws ThrottlingException
     *         An error that occurred because too many requests were sent during a certain amount of time.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient permissions to access the resource.
     * @throws ResourceNotFoundException
     *         A requested resource couldn't be found.
     * @throws ValidationException
     *         A validation exception for a field.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time or it could be that the requested action isn't valid for
     *         the current state or configuration of the resource.
     * @throws InternalServerException
     *         The API encountered an unexpected error and couldn't complete the request. You might be able to
     *         successfully issue the request again in the future.
     * @sample AmazonPinpointSMSVoiceV2.UpdatePool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/UpdatePool"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePoolResult updatePool(UpdatePoolRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePool(request);
    }

    @SdkInternalApi
    final UpdatePoolResult executeUpdatePool(UpdatePoolRequest updatePoolRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePoolRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePoolRequest> request = null;
        Response<UpdatePoolResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePoolRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePoolRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePool");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePoolResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePoolResultJsonUnmarshaller());
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
