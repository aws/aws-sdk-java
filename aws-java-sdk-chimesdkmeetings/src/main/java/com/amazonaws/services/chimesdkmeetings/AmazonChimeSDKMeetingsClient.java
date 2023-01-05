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
package com.amazonaws.services.chimesdkmeetings;

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

import com.amazonaws.services.chimesdkmeetings.AmazonChimeSDKMeetingsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.chimesdkmeetings.model.*;
import com.amazonaws.services.chimesdkmeetings.model.transform.*;

/**
 * Client for accessing Amazon Chime SDK Meetings. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * The Amazon Chime SDK meetings APIs in this section allow software developers to create Amazon Chime SDK meetings, set
 * the AWS Regions for meetings, create and manage users, and send and receive meeting notifications. For more
 * information about the meeting APIs, see <a
 * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Meetings.html">Amazon
 * Chime SDK meetings</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonChimeSDKMeetingsClient extends AmazonWebServiceClient implements AmazonChimeSDKMeetings {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonChimeSDKMeetings.class);

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
                                    com.amazonaws.services.chimesdkmeetings.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmeetings.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmeetings.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnprocessableEntityException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmeetings.model.transform.UnprocessableEntityExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmeetings.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmeetings.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmeetings.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmeetings.model.transform.UnauthorizedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmeetings.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmeetings.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmeetings.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkmeetings.model.transform.ServiceFailureExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.chimesdkmeetings.model.AmazonChimeSDKMeetingsException.class));

    public static AmazonChimeSDKMeetingsClientBuilder builder() {
        return AmazonChimeSDKMeetingsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Chime SDK Meetings using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKMeetingsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Chime SDK Meetings using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKMeetingsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("meetings-chime.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/chimesdkmeetings/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/chimesdkmeetings/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates up to 100 attendees for an active Amazon Chime SDK meeting. For more information about the Amazon Chime
     * SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a>
     * in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param batchCreateAttendeeRequest
     * @return Result of the BatchCreateAttendee operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws UnprocessableEntityException
     *         The request was well-formed but was unable to be followed due to semantic errors.
     * @throws LimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.BatchCreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/BatchCreateAttendee"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchCreateAttendeeResult batchCreateAttendee(BatchCreateAttendeeRequest request) {
        request = beforeClientExecution(request);
        return executeBatchCreateAttendee(request);
    }

    @SdkInternalApi
    final BatchCreateAttendeeResult executeBatchCreateAttendee(BatchCreateAttendeeRequest batchCreateAttendeeRequest) {

        ExecutionContext executionContext = createExecutionContext(batchCreateAttendeeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCreateAttendeeRequest> request = null;
        Response<BatchCreateAttendeeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCreateAttendeeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchCreateAttendeeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchCreateAttendee");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchCreateAttendeeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchCreateAttendeeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates <code>AttendeeCapabilities</code> except the capabilities listed in an <code>ExcludedAttendeeIds</code>
     * table.
     * </p>
     * <note>
     * <p>
     * You use the capabilities with a set of values that control what the capabilities can do, such as
     * <code>SendReceive</code> data. For more information about those values, see .
     * </p>
     * </note>
     * <p>
     * When using capabilities, be aware of these corner cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't set <code>content</code> capabilities to <code>SendReceive</code> or <code>Receive</code> unless you
     * also set <code>video</code> capabilities to <code>SendReceive</code> or <code>Receive</code>. If you don't set
     * the <code>video</code> capability to receive, the response will contain an HTTP 400 Bad Request status code.
     * However, you can set your <code>video</code> capability to receive and you set your <code>content</code>
     * capability to not receive.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change an <code>audio</code> capability from <code>None</code> or <code>Receive</code> to
     * <code>Send</code> or <code>SendReceive</code> , and if the attendee left their microphone unmuted, audio will
     * flow from the attendee to the other meeting participants.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change a <code>video</code> or <code>content</code> capability from <code>None</code> or
     * <code>Receive</code> to <code>Send</code> or <code>SendReceive</code> , and if the attendee turned on their video
     * or content streams, remote attendess can receive those streams, but only after media renegotiation between the
     * client and the Amazon Chime back-end server.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchUpdateAttendeeCapabilitiesExceptRequest
     * @return Result of the BatchUpdateAttendeeCapabilitiesExcept operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request have been made simultaneously.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AmazonChimeSDKMeetings.BatchUpdateAttendeeCapabilitiesExcept
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/BatchUpdateAttendeeCapabilitiesExcept"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchUpdateAttendeeCapabilitiesExceptResult batchUpdateAttendeeCapabilitiesExcept(BatchUpdateAttendeeCapabilitiesExceptRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateAttendeeCapabilitiesExcept(request);
    }

    @SdkInternalApi
    final BatchUpdateAttendeeCapabilitiesExceptResult executeBatchUpdateAttendeeCapabilitiesExcept(
            BatchUpdateAttendeeCapabilitiesExceptRequest batchUpdateAttendeeCapabilitiesExceptRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateAttendeeCapabilitiesExceptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateAttendeeCapabilitiesExceptRequest> request = null;
        Response<BatchUpdateAttendeeCapabilitiesExceptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateAttendeeCapabilitiesExceptRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchUpdateAttendeeCapabilitiesExceptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateAttendeeCapabilitiesExcept");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateAttendeeCapabilitiesExceptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchUpdateAttendeeCapabilitiesExceptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new attendee for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createAttendeeRequest
     * @return Result of the CreateAttendee operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws UnprocessableEntityException
     *         The request was well-formed but was unable to be followed due to semantic errors.
     * @throws LimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.CreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateAttendee"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAttendeeResult createAttendee(CreateAttendeeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAttendee(request);
    }

    @SdkInternalApi
    final CreateAttendeeResult executeCreateAttendee(CreateAttendeeRequest createAttendeeRequest) {

        ExecutionContext executionContext = createExecutionContext(createAttendeeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAttendeeRequest> request = null;
        Response<CreateAttendeeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAttendeeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAttendeeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAttendee");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAttendeeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAttendeeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region with no initial attendees. For more
     * information about specifying media Regions, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html">Amazon Chime SDK Media
     * Regions</a> in the <i>Amazon Chime Developer Guide</i>. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createMeetingRequest
     * @return Result of the CreateMeeting operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws LimitExceededException
     *         The request exceeds the resource limit.
     * @sample AmazonChimeSDKMeetings.CreateMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateMeeting"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMeetingResult createMeeting(CreateMeetingRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMeeting(request);
    }

    @SdkInternalApi
    final CreateMeetingResult executeCreateMeeting(CreateMeetingRequest createMeetingRequest) {

        ExecutionContext executionContext = createExecutionContext(createMeetingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMeetingRequest> request = null;
        Response<CreateMeetingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMeetingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMeetingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMeeting");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMeetingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMeetingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region, with attendees. For more information about
     * specifying media Regions, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html">Amazon Chime SDK Media
     * Regions</a> in the <i>Amazon Chime Developer Guide</i>. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createMeetingWithAttendeesRequest
     * @return Result of the CreateMeetingWithAttendees operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws LimitExceededException
     *         The request exceeds the resource limit.
     * @sample AmazonChimeSDKMeetings.CreateMeetingWithAttendees
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/CreateMeetingWithAttendees"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMeetingWithAttendeesResult createMeetingWithAttendees(CreateMeetingWithAttendeesRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMeetingWithAttendees(request);
    }

    @SdkInternalApi
    final CreateMeetingWithAttendeesResult executeCreateMeetingWithAttendees(CreateMeetingWithAttendeesRequest createMeetingWithAttendeesRequest) {

        ExecutionContext executionContext = createExecutionContext(createMeetingWithAttendeesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMeetingWithAttendeesRequest> request = null;
        Response<CreateMeetingWithAttendeesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMeetingWithAttendeesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMeetingWithAttendeesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMeetingWithAttendees");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMeetingWithAttendeesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMeetingWithAttendeesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an attendee from the specified Amazon Chime SDK meeting and deletes their <code>JoinToken</code>.
     * Attendees are automatically deleted when a Amazon Chime SDK meeting is deleted. For more information about the
     * Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon
     * Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteAttendeeRequest
     * @return Result of the DeleteAttendee operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.DeleteAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/DeleteAttendee"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAttendeeResult deleteAttendee(DeleteAttendeeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAttendee(request);
    }

    @SdkInternalApi
    final DeleteAttendeeResult executeDeleteAttendee(DeleteAttendeeRequest deleteAttendeeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAttendeeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAttendeeRequest> request = null;
        Response<DeleteAttendeeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAttendeeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAttendeeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAttendee");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAttendeeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAttendeeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Amazon Chime SDK meeting. The operation deletes all attendees, disconnects all clients, and
     * prevents new clients from joining the meeting. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteMeetingRequest
     * @return Result of the DeleteMeeting operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.DeleteMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/DeleteMeeting"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMeetingResult deleteMeeting(DeleteMeetingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMeeting(request);
    }

    @SdkInternalApi
    final DeleteMeetingResult executeDeleteMeeting(DeleteMeetingRequest deleteMeetingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMeetingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMeetingRequest> request = null;
        Response<DeleteMeetingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMeetingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMeetingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMeeting");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMeetingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMeetingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the Amazon Chime SDK attendee details for a specified meeting ID and attendee ID. For more information about
     * the Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the
     * Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param getAttendeeRequest
     * @return Result of the GetAttendee operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.GetAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/GetAttendee" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAttendeeResult getAttendee(GetAttendeeRequest request) {
        request = beforeClientExecution(request);
        return executeGetAttendee(request);
    }

    @SdkInternalApi
    final GetAttendeeResult executeGetAttendee(GetAttendeeRequest getAttendeeRequest) {

        ExecutionContext executionContext = createExecutionContext(getAttendeeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAttendeeRequest> request = null;
        Response<GetAttendeeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAttendeeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAttendeeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAttendee");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAttendeeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAttendeeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the Amazon Chime SDK meeting details for the specified meeting ID. For more information about the Amazon
     * Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime
     * SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param getMeetingRequest
     * @return Result of the GetMeeting operation returned by the service.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.GetMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/GetMeeting" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetMeetingResult getMeeting(GetMeetingRequest request) {
        request = beforeClientExecution(request);
        return executeGetMeeting(request);
    }

    @SdkInternalApi
    final GetMeetingResult executeGetMeeting(GetMeetingRequest getMeetingRequest) {

        ExecutionContext executionContext = createExecutionContext(getMeetingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMeetingRequest> request = null;
        Response<GetMeetingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMeetingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMeetingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMeeting");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMeetingResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMeetingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the attendees for the specified Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param listAttendeesRequest
     * @return Result of the ListAttendees operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @sample AmazonChimeSDKMeetings.ListAttendees
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/ListAttendees"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAttendeesResult listAttendees(ListAttendeesRequest request) {
        request = beforeClientExecution(request);
        return executeListAttendees(request);
    }

    @SdkInternalApi
    final ListAttendeesResult executeListAttendees(ListAttendeesRequest listAttendeesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAttendeesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttendeesRequest> request = null;
        Response<ListAttendeesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttendeesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAttendeesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAttendees");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAttendeesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAttendeesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the tags available for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that you want to tag couldn't be found.
     * @sample AmazonChimeSDKMeetings.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
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
     * Starts transcription for the specified <code>meetingId</code>.
     * </p>
     * 
     * @param startMeetingTranscriptionRequest
     * @return Result of the StartMeetingTranscription operation returned by the service.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws LimitExceededException
     *         The request exceeds the resource limit.
     * @throws UnprocessableEntityException
     *         The request was well-formed but was unable to be followed due to semantic errors.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMeetings.StartMeetingTranscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/StartMeetingTranscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMeetingTranscriptionResult startMeetingTranscription(StartMeetingTranscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeStartMeetingTranscription(request);
    }

    @SdkInternalApi
    final StartMeetingTranscriptionResult executeStartMeetingTranscription(StartMeetingTranscriptionRequest startMeetingTranscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(startMeetingTranscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMeetingTranscriptionRequest> request = null;
        Response<StartMeetingTranscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMeetingTranscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startMeetingTranscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMeetingTranscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMeetingTranscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartMeetingTranscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops transcription for the specified <code>meetingId</code>.
     * </p>
     * 
     * @param stopMeetingTranscriptionRequest
     * @return Result of the StopMeetingTranscription operation returned by the service.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws UnprocessableEntityException
     *         The request was well-formed but was unable to be followed due to semantic errors.
     * @throws ThrottlingException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMeetings.StopMeetingTranscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/StopMeetingTranscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopMeetingTranscriptionResult stopMeetingTranscription(StopMeetingTranscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeStopMeetingTranscription(request);
    }

    @SdkInternalApi
    final StopMeetingTranscriptionResult executeStopMeetingTranscription(StopMeetingTranscriptionRequest stopMeetingTranscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopMeetingTranscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopMeetingTranscriptionRequest> request = null;
        Response<StopMeetingTranscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopMeetingTranscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopMeetingTranscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopMeetingTranscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopMeetingTranscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopMeetingTranscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The resource that supports tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ResourceNotFoundException
     *         The resource that you want to tag couldn't be found.
     * @throws TooManyTagsException
     *         Too many tags were added to the specified resource.
     * @sample AmazonChimeSDKMeetings.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/TagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
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
     * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that
     * key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were
     * already removed. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to
     * as well as permissions for removing tags. For more information, see the documentation for the service whose
     * resource you want to untag.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can only tag resources that are located in the specified AWS Region for the calling AWS account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Minimum permissions</b>
     * </p>
     * <p>
     * In addition to the <code>tag:UntagResources</code> permission required by this operation, you must also have the
     * remove tags permission defined by the service that created the resource. For example, to remove the tags from an
     * Amazon EC2 instance using the <code>UntagResources</code> operation, you must have both of the following
     * permissions:
     * </p>
     * <p>
     * <code>tag:UntagResource</code>
     * </p>
     * <p>
     * <code>ChimeSDKMeetings:DeleteTags</code>
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ResourceNotFoundException
     *         The resource that you want to tag couldn't be found.
     * @sample AmazonChimeSDKMeetings.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/UntagResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
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
     * The capabilties that you want to update.
     * </p>
     * <note>
     * <p>
     * You use the capabilities with a set of values that control what the capabilities can do, such as
     * <code>SendReceive</code> data. For more information about those values, see .
     * </p>
     * </note>
     * <p>
     * When using capabilities, be aware of these corner cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't set <code>content</code> capabilities to <code>SendReceive</code> or <code>Receive</code> unless you
     * also set <code>video</code> capabilities to <code>SendReceive</code> or <code>Receive</code>. If you don't set
     * the <code>video</code> capability to receive, the response will contain an HTTP 400 Bad Request status code.
     * However, you can set your <code>video</code> capability to receive and you set your <code>content</code>
     * capability to not receive.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change an <code>audio</code> capability from <code>None</code> or <code>Receive</code> to
     * <code>Send</code> or <code>SendReceive</code> , and if the attendee left their microphone unmuted, audio will
     * flow from the attendee to the other meeting participants.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you change a <code>video</code> or <code>content</code> capability from <code>None</code> or
     * <code>Receive</code> to <code>Send</code> or <code>SendReceive</code> , and if the attendee turned on their video
     * or content streams, remote attendess can receive those streams, but only after media renegotiation between the
     * client and the Amazon Chime back-end server.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAttendeeCapabilitiesRequest
     * @return Result of the UpdateAttendeeCapabilities operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request have been made simultaneously.
     * @throws UnauthorizedException
     *         The user isn't authorized to request a resource.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AmazonChimeSDKMeetings.UpdateAttendeeCapabilities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/UpdateAttendeeCapabilities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAttendeeCapabilitiesResult updateAttendeeCapabilities(UpdateAttendeeCapabilitiesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAttendeeCapabilities(request);
    }

    @SdkInternalApi
    final UpdateAttendeeCapabilitiesResult executeUpdateAttendeeCapabilities(UpdateAttendeeCapabilitiesRequest updateAttendeeCapabilitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAttendeeCapabilitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAttendeeCapabilitiesRequest> request = null;
        Response<UpdateAttendeeCapabilitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAttendeeCapabilitiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAttendeeCapabilitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Meetings");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAttendeeCapabilities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAttendeeCapabilitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAttendeeCapabilitiesResultJsonUnmarshaller());
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
