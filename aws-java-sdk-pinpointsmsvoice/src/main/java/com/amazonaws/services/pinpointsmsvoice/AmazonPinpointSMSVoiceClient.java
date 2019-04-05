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
package com.amazonaws.services.pinpointsmsvoice;

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

import com.amazonaws.services.pinpointsmsvoice.AmazonPinpointSMSVoiceClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.pinpointsmsvoice.model.*;
import com.amazonaws.services.pinpointsmsvoice.model.transform.*;

/**
 * Client for accessing Pinpoint SMS Voice. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * Pinpoint SMS and Voice Messaging public facing APIs
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPinpointSMSVoiceClient extends AmazonWebServiceClient implements AmazonPinpointSMSVoice {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonPinpointSMSVoice.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sms-voice";

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
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.pinpointsmsvoice.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceErrorException").withModeledClass(
                                    com.amazonaws.services.pinpointsmsvoice.model.InternalServiceErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.pinpointsmsvoice.model.AlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.pinpointsmsvoice.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.pinpointsmsvoice.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.pinpointsmsvoice.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.pinpointsmsvoice.model.AmazonPinpointSMSVoiceException.class));

    public static AmazonPinpointSMSVoiceClientBuilder builder() {
        return AmazonPinpointSMSVoiceClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Pinpoint SMS Voice using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPinpointSMSVoiceClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Pinpoint SMS Voice using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPinpointSMSVoiceClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("sms-voice.pinpoint.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/pinpointsmsvoice/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/pinpointsmsvoice/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * Create a new configuration set. After you create the configuration set, you can add one or more event
     * destinations to it.
     * 
     * @param createConfigurationSetRequest
     *        A request to create a new configuration set.
     * @return Result of the CreateConfigurationSet operation returned by the service.
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws LimitExceededException
     *         LimitExceededException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @throws AlreadyExistsException
     *         AlreadyExistsException
     * @sample AmazonPinpointSMSVoice.CreateConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/CreateConfigurationSet"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice");
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
     * Create a new event destination in a configuration set.
     * 
     * @param createConfigurationSetEventDestinationRequest
     *        Create a new event destination in a configuration set.
     * @return Result of the CreateConfigurationSetEventDestination operation returned by the service.
     * @throws BadRequestException
     *         BadRequestException
     * @throws LimitExceededException
     *         LimitExceededException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @throws NotFoundException
     *         NotFoundException
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws AlreadyExistsException
     *         AlreadyExistsException
     * @sample AmazonPinpointSMSVoice.CreateConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/CreateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConfigurationSetEventDestinationResult createConfigurationSetEventDestination(CreateConfigurationSetEventDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfigurationSetEventDestination(request);
    }

    @SdkInternalApi
    final CreateConfigurationSetEventDestinationResult executeCreateConfigurationSetEventDestination(
            CreateConfigurationSetEventDestinationRequest createConfigurationSetEventDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfigurationSetEventDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigurationSetEventDestinationRequest> request = null;
        Response<CreateConfigurationSetEventDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfigurationSetEventDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createConfigurationSetEventDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfigurationSetEventDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConfigurationSetEventDestinationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateConfigurationSetEventDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes an existing configuration set.
     * 
     * @param deleteConfigurationSetRequest
     * @return Result of the DeleteConfigurationSet operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @sample AmazonPinpointSMSVoice.DeleteConfigurationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/DeleteConfigurationSet"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice");
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
     * Deletes an event destination in a configuration set.
     * 
     * @param deleteConfigurationSetEventDestinationRequest
     * @return Result of the DeleteConfigurationSetEventDestination operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @sample AmazonPinpointSMSVoice.DeleteConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/DeleteConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfigurationSetEventDestinationResult deleteConfigurationSetEventDestination(DeleteConfigurationSetEventDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfigurationSetEventDestination(request);
    }

    @SdkInternalApi
    final DeleteConfigurationSetEventDestinationResult executeDeleteConfigurationSetEventDestination(
            DeleteConfigurationSetEventDestinationRequest deleteConfigurationSetEventDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfigurationSetEventDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigurationSetEventDestinationRequest> request = null;
        Response<DeleteConfigurationSetEventDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigurationSetEventDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteConfigurationSetEventDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfigurationSetEventDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfigurationSetEventDestinationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteConfigurationSetEventDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Obtain information about an event destination, including the types of events it reports, the Amazon Resource Name
     * (ARN) of the destination, and the name of the event destination.
     * 
     * @param getConfigurationSetEventDestinationsRequest
     * @return Result of the GetConfigurationSetEventDestinations operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @sample AmazonPinpointSMSVoice.GetConfigurationSetEventDestinations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/GetConfigurationSetEventDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConfigurationSetEventDestinationsResult getConfigurationSetEventDestinations(GetConfigurationSetEventDestinationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetConfigurationSetEventDestinations(request);
    }

    @SdkInternalApi
    final GetConfigurationSetEventDestinationsResult executeGetConfigurationSetEventDestinations(
            GetConfigurationSetEventDestinationsRequest getConfigurationSetEventDestinationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getConfigurationSetEventDestinationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfigurationSetEventDestinationsRequest> request = null;
        Response<GetConfigurationSetEventDestinationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfigurationSetEventDestinationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getConfigurationSetEventDestinationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConfigurationSetEventDestinations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConfigurationSetEventDestinationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConfigurationSetEventDestinationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * List all of the configuration sets associated with your Amazon Pinpoint account in the current region.
     * 
     * @param listConfigurationSetsRequest
     * @return Result of the ListConfigurationSets operation returned by the service.
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @sample AmazonPinpointSMSVoice.ListConfigurationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/ListConfigurationSets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConfigurationSetsResult listConfigurationSets(ListConfigurationSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListConfigurationSets(request);
    }

    @SdkInternalApi
    final ListConfigurationSetsResult executeListConfigurationSets(ListConfigurationSetsRequest listConfigurationSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConfigurationSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfigurationSetsRequest> request = null;
        Response<ListConfigurationSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfigurationSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConfigurationSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConfigurationSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConfigurationSetsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListConfigurationSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Create a new voice message and send it to a recipient's phone number.
     * 
     * @param sendVoiceMessageRequest
     *        SendVoiceMessageRequest
     * @return Result of the SendVoiceMessage operation returned by the service.
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @sample AmazonPinpointSMSVoice.SendVoiceMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/SendVoiceMessage"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice");
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
     * Update an event destination in a configuration set. An event destination is a location that you publish
     * information about your voice calls to. For example, you can log an event to an Amazon CloudWatch destination when
     * a call fails.
     * 
     * @param updateConfigurationSetEventDestinationRequest
     *        UpdateConfigurationSetEventDestinationRequest
     * @return Result of the UpdateConfigurationSetEventDestination operation returned by the service.
     * @throws NotFoundException
     *         NotFoundException
     * @throws TooManyRequestsException
     *         TooManyRequestsException
     * @throws BadRequestException
     *         BadRequestException
     * @throws InternalServiceErrorException
     *         InternalServiceErrorException
     * @sample AmazonPinpointSMSVoice.UpdateConfigurationSetEventDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/UpdateConfigurationSetEventDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConfigurationSetEventDestinationResult updateConfigurationSetEventDestination(UpdateConfigurationSetEventDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfigurationSetEventDestination(request);
    }

    @SdkInternalApi
    final UpdateConfigurationSetEventDestinationResult executeUpdateConfigurationSetEventDestination(
            UpdateConfigurationSetEventDestinationRequest updateConfigurationSetEventDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfigurationSetEventDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfigurationSetEventDestinationRequest> request = null;
        Response<UpdateConfigurationSetEventDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfigurationSetEventDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateConfigurationSetEventDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pinpoint SMS Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfigurationSetEventDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConfigurationSetEventDestinationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateConfigurationSetEventDestinationResultJsonUnmarshaller());
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
