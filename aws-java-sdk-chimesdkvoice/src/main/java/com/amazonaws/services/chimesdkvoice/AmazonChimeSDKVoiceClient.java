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
package com.amazonaws.services.chimesdkvoice;

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

import com.amazonaws.services.chimesdkvoice.AmazonChimeSDKVoiceClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.chimesdkvoice.model.*;

import com.amazonaws.services.chimesdkvoice.model.transform.*;

/**
 * Client for accessing Amazon Chime SDK Voice. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * The Amazon Chime SDK telephony APIs in this section enable developers to create PSTN calling solutions that use
 * Amazon Chime SDK Voice Connectors, and Amazon Chime SDK SIP media applications. Developers can also order and manage
 * phone numbers, create and manage Voice Connectors and SIP media applications, and run voice analytics.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonChimeSDKVoiceClient extends AmazonWebServiceClient implements AmazonChimeSDKVoice {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonChimeSDKVoice.class);

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
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkvoice.model.transform.ForbiddenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkvoice.model.transform.ResourceLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("GoneException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkvoice.model.transform.GoneExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkvoice.model.transform.UnauthorizedClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkvoice.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceFailureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkvoice.model.transform.ServiceFailureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkvoice.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkvoice.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnprocessableEntityException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkvoice.model.transform.UnprocessableEntityExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottledClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkvoice.model.transform.ThrottledClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkvoice.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.chimesdkvoice.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.chimesdkvoice.model.AmazonChimeSDKVoiceException.class));

    public static AmazonChimeSDKVoiceClientBuilder builder() {
        return AmazonChimeSDKVoiceClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Chime SDK Voice using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKVoiceClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Chime SDK Voice using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKVoiceClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("voice-chime.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/chimesdkvoice/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/chimesdkvoice/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorRequest
     * @return Result of the AssociatePhoneNumbersWithVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.AssociatePhoneNumbersWithVoiceConnector
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/AssociatePhoneNumbersWithVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociatePhoneNumbersWithVoiceConnectorResult associatePhoneNumbersWithVoiceConnector(AssociatePhoneNumbersWithVoiceConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeAssociatePhoneNumbersWithVoiceConnector(request);
    }

    @SdkInternalApi
    final AssociatePhoneNumbersWithVoiceConnectorResult executeAssociatePhoneNumbersWithVoiceConnector(
            AssociatePhoneNumbersWithVoiceConnectorRequest associatePhoneNumbersWithVoiceConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(associatePhoneNumbersWithVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePhoneNumbersWithVoiceConnectorRequest> request = null;
        Response<AssociatePhoneNumbersWithVoiceConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePhoneNumbersWithVoiceConnectorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associatePhoneNumbersWithVoiceConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociatePhoneNumbersWithVoiceConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociatePhoneNumbersWithVoiceConnectorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociatePhoneNumbersWithVoiceConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorGroupRequest
     * @return Result of the AssociatePhoneNumbersWithVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.AssociatePhoneNumbersWithVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/AssociatePhoneNumbersWithVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociatePhoneNumbersWithVoiceConnectorGroupResult associatePhoneNumbersWithVoiceConnectorGroup(
            AssociatePhoneNumbersWithVoiceConnectorGroupRequest request) {
        request = beforeClientExecution(request);
        return executeAssociatePhoneNumbersWithVoiceConnectorGroup(request);
    }

    @SdkInternalApi
    final AssociatePhoneNumbersWithVoiceConnectorGroupResult executeAssociatePhoneNumbersWithVoiceConnectorGroup(
            AssociatePhoneNumbersWithVoiceConnectorGroupRequest associatePhoneNumbersWithVoiceConnectorGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(associatePhoneNumbersWithVoiceConnectorGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePhoneNumbersWithVoiceConnectorGroupRequest> request = null;
        Response<AssociatePhoneNumbersWithVoiceConnectorGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePhoneNumbersWithVoiceConnectorGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associatePhoneNumbersWithVoiceConnectorGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociatePhoneNumbersWithVoiceConnectorGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociatePhoneNumbersWithVoiceConnectorGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociatePhoneNumbersWithVoiceConnectorGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Moves phone numbers into the <b>Deletion queue</b>. Phone numbers must be disassociated from any users or Amazon
     * Chime SDK Voice Connectors before they can be deleted.
     * </p>
     * <p>
     * Phone numbers remain in the <b>Deletion queue</b> for 7 days before they are deleted permanently.
     * </p>
     * 
     * @param batchDeletePhoneNumberRequest
     * @return Result of the BatchDeletePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.BatchDeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/BatchDeletePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDeletePhoneNumberResult batchDeletePhoneNumber(BatchDeletePhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeletePhoneNumber(request);
    }

    @SdkInternalApi
    final BatchDeletePhoneNumberResult executeBatchDeletePhoneNumber(BatchDeletePhoneNumberRequest batchDeletePhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeletePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeletePhoneNumberRequest> request = null;
        Response<BatchDeletePhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeletePhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeletePhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeletePhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeletePhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchDeletePhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates phone number product types, calling names, or phone number names. You can update one attribute at a time
     * for each <code>UpdatePhoneNumberRequestItem</code>. For example, you can update the product type, the calling
     * name, or phone name.
     * </p>
     * <note>
     * <p>
     * You cannot have a duplicate <code>phoneNumberId</code> in a request.
     * </p>
     * </note>
     * 
     * @param batchUpdatePhoneNumberRequest
     * @return Result of the BatchUpdatePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.BatchUpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/BatchUpdatePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchUpdatePhoneNumberResult batchUpdatePhoneNumber(BatchUpdatePhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdatePhoneNumber(request);
    }

    @SdkInternalApi
    final BatchUpdatePhoneNumberResult executeBatchUpdatePhoneNumber(BatchUpdatePhoneNumberRequest batchUpdatePhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdatePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdatePhoneNumberRequest> request = null;
        Response<BatchUpdatePhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdatePhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchUpdatePhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdatePhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdatePhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchUpdatePhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an order for phone numbers to be provisioned. For numbers outside the U.S., you must use the Amazon Chime
     * SDK SIP media application dial-in product type.
     * </p>
     * 
     * @param createPhoneNumberOrderRequest
     * @return Result of the CreatePhoneNumberOrder operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreatePhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreatePhoneNumberOrder"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePhoneNumberOrderResult createPhoneNumberOrder(CreatePhoneNumberOrderRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePhoneNumberOrder(request);
    }

    @SdkInternalApi
    final CreatePhoneNumberOrderResult executeCreatePhoneNumberOrder(CreatePhoneNumberOrderRequest createPhoneNumberOrderRequest) {

        ExecutionContext executionContext = createExecutionContext(createPhoneNumberOrderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePhoneNumberOrderRequest> request = null;
        Response<CreatePhoneNumberOrderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePhoneNumberOrderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPhoneNumberOrderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePhoneNumberOrder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePhoneNumberOrderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePhoneNumberOrderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a proxy session for the specified Amazon Chime SDK Voice Connector for the specified participant phone
     * numbers.
     * </p>
     * 
     * @param createProxySessionRequest
     * @return Result of the CreateProxySession operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateProxySessionResult createProxySession(CreateProxySessionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProxySession(request);
    }

    @SdkInternalApi
    final CreateProxySessionResult executeCreateProxySession(CreateProxySessionRequest createProxySessionRequest) {

        ExecutionContext executionContext = createExecutionContext(createProxySessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProxySessionRequest> request = null;
        Response<CreateProxySessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProxySessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProxySessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProxySession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProxySessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProxySessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a SIP media application. For more information about SIP media applications, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/ag/manage-sip-applications.html">Managing SIP media
     * applications and rules</a> in the <i>Amazon Chime SDK Administrator Guide</i>.
     * </p>
     * 
     * @param createSipMediaApplicationRequest
     * @return Result of the CreateSipMediaApplication operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSipMediaApplicationResult createSipMediaApplication(CreateSipMediaApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSipMediaApplication(request);
    }

    @SdkInternalApi
    final CreateSipMediaApplicationResult executeCreateSipMediaApplication(CreateSipMediaApplicationRequest createSipMediaApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createSipMediaApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSipMediaApplicationRequest> request = null;
        Response<CreateSipMediaApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSipMediaApplicationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSipMediaApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSipMediaApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSipMediaApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSipMediaApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an outbound call to a phone number from the phone number specified in the request, and it invokes the
     * endpoint of the specified <code>sipMediaApplicationId</code>.
     * </p>
     * 
     * @param createSipMediaApplicationCallRequest
     * @return Result of the CreateSipMediaApplicationCall operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateSipMediaApplicationCall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipMediaApplicationCall"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSipMediaApplicationCallResult createSipMediaApplicationCall(CreateSipMediaApplicationCallRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSipMediaApplicationCall(request);
    }

    @SdkInternalApi
    final CreateSipMediaApplicationCallResult executeCreateSipMediaApplicationCall(CreateSipMediaApplicationCallRequest createSipMediaApplicationCallRequest) {

        ExecutionContext executionContext = createExecutionContext(createSipMediaApplicationCallRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSipMediaApplicationCallRequest> request = null;
        Response<CreateSipMediaApplicationCallResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSipMediaApplicationCallRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSipMediaApplicationCallRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSipMediaApplicationCall");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSipMediaApplicationCallResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSipMediaApplicationCallResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a SIP rule, which can be used to run a SIP media application as a target for a specific trigger type. For
     * more information about SIP rules, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/ag/manage-sip-applications.html">Managing SIP media
     * applications and rules</a> in the <i>Amazon Chime SDK Administrator Guide</i>.
     * </p>
     * 
     * @param createSipRuleRequest
     * @return Result of the CreateSipRule operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSipRuleResult createSipRule(CreateSipRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSipRule(request);
    }

    @SdkInternalApi
    final CreateSipRuleResult executeCreateSipRule(CreateSipRuleRequest createSipRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createSipRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSipRuleRequest> request = null;
        Response<CreateSipRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSipRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSipRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSipRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSipRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSipRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Chime SDK Voice Connector. For more information about Voice Connectors, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/ag/voice-connector-groups.html">Managing Amazon Chime SDK
     * Voice Connector groups</a> in the <i>Amazon Chime SDK Administrator Guide</i>.
     * </p>
     * 
     * @param createVoiceConnectorRequest
     * @return Result of the CreateVoiceConnector operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateVoiceConnectorResult createVoiceConnector(CreateVoiceConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVoiceConnector(request);
    }

    @SdkInternalApi
    final CreateVoiceConnectorResult executeCreateVoiceConnector(CreateVoiceConnectorRequest createVoiceConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(createVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVoiceConnectorRequest> request = null;
        Response<CreateVoiceConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVoiceConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVoiceConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVoiceConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVoiceConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVoiceConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Chime SDK Voice Connector group under the administrator's AWS account. You can associate Amazon
     * Chime SDK Voice Connectors with the Voice Connector group by including <code>VoiceConnectorItems</code> in the
     * request.
     * </p>
     * <p>
     * You can include Voice Connectors from different AWS Regions in your group. This creates a fault tolerant
     * mechanism for fallback in case of availability events.
     * </p>
     * 
     * @param createVoiceConnectorGroupRequest
     * @return Result of the CreateVoiceConnectorGroup operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateVoiceConnectorGroupResult createVoiceConnectorGroup(CreateVoiceConnectorGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVoiceConnectorGroup(request);
    }

    @SdkInternalApi
    final CreateVoiceConnectorGroupResult executeCreateVoiceConnectorGroup(CreateVoiceConnectorGroupRequest createVoiceConnectorGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createVoiceConnectorGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVoiceConnectorGroupRequest> request = null;
        Response<CreateVoiceConnectorGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVoiceConnectorGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createVoiceConnectorGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVoiceConnectorGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVoiceConnectorGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateVoiceConnectorGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a voice profile, which consists of an enrolled user and their latest voice print.
     * </p>
     * <important>
     * <p>
     * Before creating any voice profiles, you must provide all notices and obtain all consents from the speaker as
     * required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * <p>
     * For more information about voice profiles and voice analytics, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/dg/pstn-voice-analytics.html">Using Amazon Chime SDK Voice
     * Analytics</a> in the <i>Amazon Chime SDK Developer Guide</i>.
     * </p>
     * 
     * @param createVoiceProfileRequest
     * @return Result of the CreateVoiceProfile operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws GoneException
     *         Access to the target resource is no longer available at the origin server. This condition is likely to be
     *         permanent.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateVoiceProfileResult createVoiceProfile(CreateVoiceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVoiceProfile(request);
    }

    @SdkInternalApi
    final CreateVoiceProfileResult executeCreateVoiceProfile(CreateVoiceProfileRequest createVoiceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createVoiceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVoiceProfileRequest> request = null;
        Response<CreateVoiceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVoiceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVoiceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVoiceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVoiceProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVoiceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a voice profile domain, a collection of voice profiles, their voice prints, and encrypted enrollment
     * audio.
     * </p>
     * <important>
     * <p>
     * Before creating any voice profiles, you must provide all notices and obtain all consents from the speaker as
     * required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * <p>
     * For more information about voice profile domains, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/dg/pstn-voice-analytics.html">Using Amazon Chime SDK Voice
     * Analytics</a> in the <i>Amazon Chime SDK Developer Guide</i>.
     * </p>
     * 
     * @param createVoiceProfileDomainRequest
     * @return Result of the CreateVoiceProfileDomain operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.CreateVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateVoiceProfileDomainResult createVoiceProfileDomain(CreateVoiceProfileDomainRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVoiceProfileDomain(request);
    }

    @SdkInternalApi
    final CreateVoiceProfileDomainResult executeCreateVoiceProfileDomain(CreateVoiceProfileDomainRequest createVoiceProfileDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(createVoiceProfileDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVoiceProfileDomainRequest> request = null;
        Response<CreateVoiceProfileDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVoiceProfileDomainRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createVoiceProfileDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVoiceProfileDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVoiceProfileDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateVoiceProfileDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Moves the specified phone number into the <b>Deletion queue</b>. A phone number must be disassociated from any
     * users or Amazon Chime SDK Voice Connectors before it can be deleted.
     * </p>
     * <p>
     * Deleted phone numbers remain in the <b>Deletion queue</b> queue for 7 days before they are deleted permanently.
     * </p>
     * 
     * @param deletePhoneNumberRequest
     * @return Result of the DeletePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeletePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePhoneNumberResult deletePhoneNumber(DeletePhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePhoneNumber(request);
    }

    @SdkInternalApi
    final DeletePhoneNumberResult executeDeletePhoneNumber(DeletePhoneNumberRequest deletePhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePhoneNumberRequest> request = null;
        Response<DeletePhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified proxy session from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param deleteProxySessionRequest
     * @return Result of the DeleteProxySession operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteProxySessionResult deleteProxySession(DeleteProxySessionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProxySession(request);
    }

    @SdkInternalApi
    final DeleteProxySessionResult executeDeleteProxySession(DeleteProxySessionRequest deleteProxySessionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProxySessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProxySessionRequest> request = null;
        Response<DeleteProxySessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProxySessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProxySessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProxySession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProxySessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProxySessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a SIP media application.
     * </p>
     * 
     * @param deleteSipMediaApplicationRequest
     * @return Result of the DeleteSipMediaApplication operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSipMediaApplicationResult deleteSipMediaApplication(DeleteSipMediaApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSipMediaApplication(request);
    }

    @SdkInternalApi
    final DeleteSipMediaApplicationResult executeDeleteSipMediaApplication(DeleteSipMediaApplicationRequest deleteSipMediaApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSipMediaApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSipMediaApplicationRequest> request = null;
        Response<DeleteSipMediaApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSipMediaApplicationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSipMediaApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSipMediaApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSipMediaApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSipMediaApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a SIP rule.
     * </p>
     * 
     * @param deleteSipRuleRequest
     * @return Result of the DeleteSipRule operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSipRuleResult deleteSipRule(DeleteSipRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSipRule(request);
    }

    @SdkInternalApi
    final DeleteSipRuleResult executeDeleteSipRule(DeleteSipRuleRequest deleteSipRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSipRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSipRuleRequest> request = null;
        Response<DeleteSipRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSipRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSipRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSipRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSipRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSipRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Chime SDK Voice Connector. Any phone numbers associated with the Amazon Chime SDK Voice
     * Connector must be disassociated from it before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorRequest
     * @return Result of the DeleteVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceConnectorResult deleteVoiceConnector(DeleteVoiceConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceConnector(request);
    }

    @SdkInternalApi
    final DeleteVoiceConnectorResult executeDeleteVoiceConnector(DeleteVoiceConnectorRequest deleteVoiceConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorRequest> request = null;
        Response<DeleteVoiceConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVoiceConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVoiceConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the emergency calling details from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorEmergencyCallingConfigurationRequest
     * @return Result of the DeleteVoiceConnectorEmergencyCallingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceConnectorEmergencyCallingConfigurationResult deleteVoiceConnectorEmergencyCallingConfiguration(
            DeleteVoiceConnectorEmergencyCallingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceConnectorEmergencyCallingConfiguration(request);
    }

    @SdkInternalApi
    final DeleteVoiceConnectorEmergencyCallingConfigurationResult executeDeleteVoiceConnectorEmergencyCallingConfiguration(
            DeleteVoiceConnectorEmergencyCallingConfigurationRequest deleteVoiceConnectorEmergencyCallingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorEmergencyCallingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorEmergencyCallingConfigurationRequest> request = null;
        Response<DeleteVoiceConnectorEmergencyCallingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorEmergencyCallingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVoiceConnectorEmergencyCallingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceConnectorEmergencyCallingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceConnectorEmergencyCallingConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteVoiceConnectorEmergencyCallingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Chime SDK Voice Connector group. Any <code>VoiceConnectorItems</code> and phone numbers
     * associated with the group must be removed before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorGroupRequest
     * @return Result of the DeleteVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceConnectorGroupResult deleteVoiceConnectorGroup(DeleteVoiceConnectorGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceConnectorGroup(request);
    }

    @SdkInternalApi
    final DeleteVoiceConnectorGroupResult executeDeleteVoiceConnectorGroup(DeleteVoiceConnectorGroupRequest deleteVoiceConnectorGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorGroupRequest> request = null;
        Response<DeleteVoiceConnectorGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVoiceConnectorGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceConnectorGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceConnectorGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVoiceConnectorGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the origination settings for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * <note>
     * <p>
     * If emergency calling is configured for the Voice Connector, it must be deleted prior to deleting the origination
     * settings.
     * </p>
     * </note>
     * 
     * @param deleteVoiceConnectorOriginationRequest
     * @return Result of the DeleteVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceConnectorOriginationResult deleteVoiceConnectorOrigination(DeleteVoiceConnectorOriginationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceConnectorOrigination(request);
    }

    @SdkInternalApi
    final DeleteVoiceConnectorOriginationResult executeDeleteVoiceConnectorOrigination(
            DeleteVoiceConnectorOriginationRequest deleteVoiceConnectorOriginationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorOriginationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorOriginationRequest> request = null;
        Response<DeleteVoiceConnectorOriginationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorOriginationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVoiceConnectorOriginationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceConnectorOrigination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceConnectorOriginationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVoiceConnectorOriginationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the proxy configuration from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorProxyRequest
     * @return Result of the DeleteVoiceConnectorProxy operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceConnectorProxyResult deleteVoiceConnectorProxy(DeleteVoiceConnectorProxyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceConnectorProxy(request);
    }

    @SdkInternalApi
    final DeleteVoiceConnectorProxyResult executeDeleteVoiceConnectorProxy(DeleteVoiceConnectorProxyRequest deleteVoiceConnectorProxyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorProxyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorProxyRequest> request = null;
        Response<DeleteVoiceConnectorProxyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorProxyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVoiceConnectorProxyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceConnectorProxy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceConnectorProxyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVoiceConnectorProxyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Voice Connector's streaming configuration.
     * </p>
     * 
     * @param deleteVoiceConnectorStreamingConfigurationRequest
     * @return Result of the DeleteVoiceConnectorStreamingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceConnectorStreamingConfigurationResult deleteVoiceConnectorStreamingConfiguration(DeleteVoiceConnectorStreamingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceConnectorStreamingConfiguration(request);
    }

    @SdkInternalApi
    final DeleteVoiceConnectorStreamingConfigurationResult executeDeleteVoiceConnectorStreamingConfiguration(
            DeleteVoiceConnectorStreamingConfigurationRequest deleteVoiceConnectorStreamingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorStreamingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorStreamingConfigurationRequest> request = null;
        Response<DeleteVoiceConnectorStreamingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorStreamingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVoiceConnectorStreamingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceConnectorStreamingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceConnectorStreamingConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteVoiceConnectorStreamingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the termination settings for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * <note>
     * <p>
     * If emergency calling is configured for the Voice Connector, it must be deleted prior to deleting the termination
     * settings.
     * </p>
     * </note>
     * 
     * @param deleteVoiceConnectorTerminationRequest
     * @return Result of the DeleteVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceConnectorTerminationResult deleteVoiceConnectorTermination(DeleteVoiceConnectorTerminationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceConnectorTermination(request);
    }

    @SdkInternalApi
    final DeleteVoiceConnectorTerminationResult executeDeleteVoiceConnectorTermination(
            DeleteVoiceConnectorTerminationRequest deleteVoiceConnectorTerminationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorTerminationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorTerminationRequest> request = null;
        Response<DeleteVoiceConnectorTerminationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorTerminationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVoiceConnectorTerminationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceConnectorTermination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceConnectorTerminationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVoiceConnectorTerminationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationCredentialsRequest
     * @return Result of the DeleteVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceConnectorTerminationCredentialsResult deleteVoiceConnectorTerminationCredentials(DeleteVoiceConnectorTerminationCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceConnectorTerminationCredentials(request);
    }

    @SdkInternalApi
    final DeleteVoiceConnectorTerminationCredentialsResult executeDeleteVoiceConnectorTerminationCredentials(
            DeleteVoiceConnectorTerminationCredentialsRequest deleteVoiceConnectorTerminationCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceConnectorTerminationCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceConnectorTerminationCredentialsRequest> request = null;
        Response<DeleteVoiceConnectorTerminationCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceConnectorTerminationCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVoiceConnectorTerminationCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceConnectorTerminationCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceConnectorTerminationCredentialsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteVoiceConnectorTerminationCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a voice profile, including its voice print and enrollment data. WARNING: This action is not reversible.
     * </p>
     * 
     * @param deleteVoiceProfileRequest
     * @return Result of the DeleteVoiceProfile operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceProfileResult deleteVoiceProfile(DeleteVoiceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceProfile(request);
    }

    @SdkInternalApi
    final DeleteVoiceProfileResult executeDeleteVoiceProfile(DeleteVoiceProfileRequest deleteVoiceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceProfileRequest> request = null;
        Response<DeleteVoiceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVoiceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVoiceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes all voice profiles in the domain. WARNING: This action is not reversible.
     * </p>
     * 
     * @param deleteVoiceProfileDomainRequest
     * @return Result of the DeleteVoiceProfileDomain operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DeleteVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DeleteVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVoiceProfileDomainResult deleteVoiceProfileDomain(DeleteVoiceProfileDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVoiceProfileDomain(request);
    }

    @SdkInternalApi
    final DeleteVoiceProfileDomainResult executeDeleteVoiceProfileDomain(DeleteVoiceProfileDomainRequest deleteVoiceProfileDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVoiceProfileDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVoiceProfileDomainRequest> request = null;
        Response<DeleteVoiceProfileDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVoiceProfileDomainRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteVoiceProfileDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVoiceProfileDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVoiceProfileDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVoiceProfileDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorRequest
     * @return Result of the DisassociatePhoneNumbersFromVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DisassociatePhoneNumbersFromVoiceConnector
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DisassociatePhoneNumbersFromVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociatePhoneNumbersFromVoiceConnectorResult disassociatePhoneNumbersFromVoiceConnector(DisassociatePhoneNumbersFromVoiceConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociatePhoneNumbersFromVoiceConnector(request);
    }

    @SdkInternalApi
    final DisassociatePhoneNumbersFromVoiceConnectorResult executeDisassociatePhoneNumbersFromVoiceConnector(
            DisassociatePhoneNumbersFromVoiceConnectorRequest disassociatePhoneNumbersFromVoiceConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociatePhoneNumbersFromVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociatePhoneNumbersFromVoiceConnectorRequest> request = null;
        Response<DisassociatePhoneNumbersFromVoiceConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociatePhoneNumbersFromVoiceConnectorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociatePhoneNumbersFromVoiceConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociatePhoneNumbersFromVoiceConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociatePhoneNumbersFromVoiceConnectorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociatePhoneNumbersFromVoiceConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorGroupRequest
     * @return Result of the DisassociatePhoneNumbersFromVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.DisassociatePhoneNumbersFromVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/DisassociatePhoneNumbersFromVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociatePhoneNumbersFromVoiceConnectorGroupResult disassociatePhoneNumbersFromVoiceConnectorGroup(
            DisassociatePhoneNumbersFromVoiceConnectorGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociatePhoneNumbersFromVoiceConnectorGroup(request);
    }

    @SdkInternalApi
    final DisassociatePhoneNumbersFromVoiceConnectorGroupResult executeDisassociatePhoneNumbersFromVoiceConnectorGroup(
            DisassociatePhoneNumbersFromVoiceConnectorGroupRequest disassociatePhoneNumbersFromVoiceConnectorGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociatePhoneNumbersFromVoiceConnectorGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociatePhoneNumbersFromVoiceConnectorGroupRequest> request = null;
        Response<DisassociatePhoneNumbersFromVoiceConnectorGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociatePhoneNumbersFromVoiceConnectorGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociatePhoneNumbersFromVoiceConnectorGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociatePhoneNumbersFromVoiceConnectorGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociatePhoneNumbersFromVoiceConnectorGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociatePhoneNumbersFromVoiceConnectorGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the global settings for the Amazon Chime SDK Voice Connectors in an AWS account.
     * </p>
     * 
     * @param getGlobalSettingsRequest
     * @return Result of the GetGlobalSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetGlobalSettingsResult getGlobalSettings(GetGlobalSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetGlobalSettings(request);
    }

    @SdkInternalApi
    final GetGlobalSettingsResult executeGetGlobalSettings(GetGlobalSettingsRequest getGlobalSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getGlobalSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGlobalSettingsRequest> request = null;
        Response<GetGlobalSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGlobalSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGlobalSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGlobalSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGlobalSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGlobalSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
     * </p>
     * 
     * @param getPhoneNumberRequest
     * @return Result of the GetPhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPhoneNumberResult getPhoneNumber(GetPhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeGetPhoneNumber(request);
    }

    @SdkInternalApi
    final GetPhoneNumberResult executeGetPhoneNumber(GetPhoneNumberRequest getPhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(getPhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPhoneNumberRequest> request = null;
        Response<GetPhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details for the specified phone number order, such as the order creation timestamp, phone numbers in
     * E.164 format, product type, and order status.
     * </p>
     * 
     * @param getPhoneNumberOrderRequest
     * @return Result of the GetPhoneNumberOrder operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetPhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumberOrder"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPhoneNumberOrderResult getPhoneNumberOrder(GetPhoneNumberOrderRequest request) {
        request = beforeClientExecution(request);
        return executeGetPhoneNumberOrder(request);
    }

    @SdkInternalApi
    final GetPhoneNumberOrderResult executeGetPhoneNumberOrder(GetPhoneNumberOrderRequest getPhoneNumberOrderRequest) {

        ExecutionContext executionContext = createExecutionContext(getPhoneNumberOrderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPhoneNumberOrderRequest> request = null;
        Response<GetPhoneNumberOrderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPhoneNumberOrderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPhoneNumberOrderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPhoneNumberOrder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPhoneNumberOrderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPhoneNumberOrderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the phone number settings for the administrator's AWS account, such as the default outbound calling
     * name.
     * </p>
     * 
     * @param getPhoneNumberSettingsRequest
     * @return Result of the GetPhoneNumberSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetPhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetPhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPhoneNumberSettingsResult getPhoneNumberSettings(GetPhoneNumberSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetPhoneNumberSettings(request);
    }

    @SdkInternalApi
    final GetPhoneNumberSettingsResult executeGetPhoneNumberSettings(GetPhoneNumberSettingsRequest getPhoneNumberSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getPhoneNumberSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPhoneNumberSettingsRequest> request = null;
        Response<GetPhoneNumberSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPhoneNumberSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPhoneNumberSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPhoneNumberSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPhoneNumberSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPhoneNumberSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified proxy session details for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param getProxySessionRequest
     * @return Result of the GetProxySession operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetProxySessionResult getProxySession(GetProxySessionRequest request) {
        request = beforeClientExecution(request);
        return executeGetProxySession(request);
    }

    @SdkInternalApi
    final GetProxySessionResult executeGetProxySession(GetProxySessionRequest getProxySessionRequest) {

        ExecutionContext executionContext = createExecutionContext(getProxySessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProxySessionRequest> request = null;
        Response<GetProxySessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProxySessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProxySessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProxySession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProxySessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProxySessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the information for a SIP media application, including name, AWS Region, and endpoints.
     * </p>
     * 
     * @param getSipMediaApplicationRequest
     * @return Result of the GetSipMediaApplication operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSipMediaApplicationResult getSipMediaApplication(GetSipMediaApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeGetSipMediaApplication(request);
    }

    @SdkInternalApi
    final GetSipMediaApplicationResult executeGetSipMediaApplication(GetSipMediaApplicationRequest getSipMediaApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(getSipMediaApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSipMediaApplicationRequest> request = null;
        Response<GetSipMediaApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSipMediaApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSipMediaApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSipMediaApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSipMediaApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSipMediaApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the Alexa Skill configuration for the SIP media application.
     * </p>
     * <important>
     * <p>
     * Due to changes made by the Amazon Alexa service, this API is no longer available for use. For more information,
     * refer to the <a href="https://developer.amazon.com/en-US/alexa/alexasmartproperties">Alexa Smart Properties</a>
     * page.
     * </p>
     * </important>
     * 
     * @param getSipMediaApplicationAlexaSkillConfigurationRequest
     * @return Result of the GetSipMediaApplicationAlexaSkillConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetSipMediaApplicationAlexaSkillConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplicationAlexaSkillConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    @Deprecated
    public GetSipMediaApplicationAlexaSkillConfigurationResult getSipMediaApplicationAlexaSkillConfiguration(
            GetSipMediaApplicationAlexaSkillConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetSipMediaApplicationAlexaSkillConfiguration(request);
    }

    @SdkInternalApi
    final GetSipMediaApplicationAlexaSkillConfigurationResult executeGetSipMediaApplicationAlexaSkillConfiguration(
            GetSipMediaApplicationAlexaSkillConfigurationRequest getSipMediaApplicationAlexaSkillConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getSipMediaApplicationAlexaSkillConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSipMediaApplicationAlexaSkillConfigurationRequest> request = null;
        Response<GetSipMediaApplicationAlexaSkillConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSipMediaApplicationAlexaSkillConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSipMediaApplicationAlexaSkillConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSipMediaApplicationAlexaSkillConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSipMediaApplicationAlexaSkillConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetSipMediaApplicationAlexaSkillConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the logging configuration for the specified SIP media application.
     * </p>
     * 
     * @param getSipMediaApplicationLoggingConfigurationRequest
     * @return Result of the GetSipMediaApplicationLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetSipMediaApplicationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSipMediaApplicationLoggingConfigurationResult getSipMediaApplicationLoggingConfiguration(GetSipMediaApplicationLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetSipMediaApplicationLoggingConfiguration(request);
    }

    @SdkInternalApi
    final GetSipMediaApplicationLoggingConfigurationResult executeGetSipMediaApplicationLoggingConfiguration(
            GetSipMediaApplicationLoggingConfigurationRequest getSipMediaApplicationLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getSipMediaApplicationLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSipMediaApplicationLoggingConfigurationRequest> request = null;
        Response<GetSipMediaApplicationLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSipMediaApplicationLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSipMediaApplicationLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSipMediaApplicationLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSipMediaApplicationLoggingConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetSipMediaApplicationLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of a SIP rule, such as the rule ID, name, triggers, and target endpoints.
     * </p>
     * 
     * @param getSipRuleRequest
     * @return Result of the GetSipRule operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSipRuleResult getSipRule(GetSipRuleRequest request) {
        request = beforeClientExecution(request);
        return executeGetSipRule(request);
    }

    @SdkInternalApi
    final GetSipRuleResult executeGetSipRule(GetSipRuleRequest getSipRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(getSipRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSipRuleRequest> request = null;
        Response<GetSipRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSipRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSipRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSipRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSipRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSipRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of the specified speaker search task.
     * </p>
     * 
     * @param getSpeakerSearchTaskRequest
     * @return Result of the GetSpeakerSearchTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AmazonChimeSDKVoice.GetSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSpeakerSearchTaskResult getSpeakerSearchTask(GetSpeakerSearchTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetSpeakerSearchTask(request);
    }

    @SdkInternalApi
    final GetSpeakerSearchTaskResult executeGetSpeakerSearchTask(GetSpeakerSearchTaskRequest getSpeakerSearchTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getSpeakerSearchTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSpeakerSearchTaskRequest> request = null;
        Response<GetSpeakerSearchTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSpeakerSearchTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSpeakerSearchTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSpeakerSearchTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSpeakerSearchTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSpeakerSearchTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime SDK Voice Connector, such as timestamps,name, outbound host, and
     * encryption requirements.
     * </p>
     * 
     * @param getVoiceConnectorRequest
     * @return Result of the GetVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceConnectorResult getVoiceConnector(GetVoiceConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceConnector(request);
    }

    @SdkInternalApi
    final GetVoiceConnectorResult executeGetVoiceConnector(GetVoiceConnectorRequest getVoiceConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorRequest> request = null;
        Response<GetVoiceConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVoiceConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVoiceConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the emergency calling configuration details for the specified Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorEmergencyCallingConfigurationRequest
     * @return Result of the GetVoiceConnectorEmergencyCallingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceConnectorEmergencyCallingConfigurationResult getVoiceConnectorEmergencyCallingConfiguration(
            GetVoiceConnectorEmergencyCallingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceConnectorEmergencyCallingConfiguration(request);
    }

    @SdkInternalApi
    final GetVoiceConnectorEmergencyCallingConfigurationResult executeGetVoiceConnectorEmergencyCallingConfiguration(
            GetVoiceConnectorEmergencyCallingConfigurationRequest getVoiceConnectorEmergencyCallingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorEmergencyCallingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorEmergencyCallingConfigurationRequest> request = null;
        Response<GetVoiceConnectorEmergencyCallingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorEmergencyCallingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getVoiceConnectorEmergencyCallingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceConnectorEmergencyCallingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceConnectorEmergencyCallingConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetVoiceConnectorEmergencyCallingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime SDK Voice Connector group, such as timestamps,name, and
     * associated <code>VoiceConnectorItems</code>.
     * </p>
     * 
     * @param getVoiceConnectorGroupRequest
     * @return Result of the GetVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceConnectorGroupResult getVoiceConnectorGroup(GetVoiceConnectorGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceConnectorGroup(request);
    }

    @SdkInternalApi
    final GetVoiceConnectorGroupResult executeGetVoiceConnectorGroup(GetVoiceConnectorGroupRequest getVoiceConnectorGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorGroupRequest> request = null;
        Response<GetVoiceConnectorGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVoiceConnectorGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceConnectorGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceConnectorGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetVoiceConnectorGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the logging configuration settings for the specified Voice Connector. Shows whether SIP message logs
     * are enabled for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param getVoiceConnectorLoggingConfigurationRequest
     * @return Result of the GetVoiceConnectorLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceConnectorLoggingConfigurationResult getVoiceConnectorLoggingConfiguration(GetVoiceConnectorLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceConnectorLoggingConfiguration(request);
    }

    @SdkInternalApi
    final GetVoiceConnectorLoggingConfigurationResult executeGetVoiceConnectorLoggingConfiguration(
            GetVoiceConnectorLoggingConfigurationRequest getVoiceConnectorLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorLoggingConfigurationRequest> request = null;
        Response<GetVoiceConnectorLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getVoiceConnectorLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceConnectorLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceConnectorLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetVoiceConnectorLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the origination settings for the specified Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorOriginationRequest
     * @return Result of the GetVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceConnectorOriginationResult getVoiceConnectorOrigination(GetVoiceConnectorOriginationRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceConnectorOrigination(request);
    }

    @SdkInternalApi
    final GetVoiceConnectorOriginationResult executeGetVoiceConnectorOrigination(GetVoiceConnectorOriginationRequest getVoiceConnectorOriginationRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorOriginationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorOriginationRequest> request = null;
        Response<GetVoiceConnectorOriginationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorOriginationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getVoiceConnectorOriginationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceConnectorOrigination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceConnectorOriginationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetVoiceConnectorOriginationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the proxy configuration details for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorProxyRequest
     * @return Result of the GetVoiceConnectorProxy operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceConnectorProxyResult getVoiceConnectorProxy(GetVoiceConnectorProxyRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceConnectorProxy(request);
    }

    @SdkInternalApi
    final GetVoiceConnectorProxyResult executeGetVoiceConnectorProxy(GetVoiceConnectorProxyRequest getVoiceConnectorProxyRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorProxyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorProxyRequest> request = null;
        Response<GetVoiceConnectorProxyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorProxyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVoiceConnectorProxyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceConnectorProxy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceConnectorProxyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetVoiceConnectorProxyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the streaming configuration details for the specified Amazon Chime SDK Voice Connector. Shows whether
     * media streaming is enabled for sending to Amazon Kinesis. It also shows the retention period, in hours, for the
     * Amazon Kinesis data.
     * </p>
     * 
     * @param getVoiceConnectorStreamingConfigurationRequest
     * @return Result of the GetVoiceConnectorStreamingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceConnectorStreamingConfigurationResult getVoiceConnectorStreamingConfiguration(GetVoiceConnectorStreamingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceConnectorStreamingConfiguration(request);
    }

    @SdkInternalApi
    final GetVoiceConnectorStreamingConfigurationResult executeGetVoiceConnectorStreamingConfiguration(
            GetVoiceConnectorStreamingConfigurationRequest getVoiceConnectorStreamingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorStreamingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorStreamingConfigurationRequest> request = null;
        Response<GetVoiceConnectorStreamingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorStreamingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getVoiceConnectorStreamingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceConnectorStreamingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceConnectorStreamingConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetVoiceConnectorStreamingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the termination setting details for the specified Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationRequest
     * @return Result of the GetVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceConnectorTerminationResult getVoiceConnectorTermination(GetVoiceConnectorTerminationRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceConnectorTermination(request);
    }

    @SdkInternalApi
    final GetVoiceConnectorTerminationResult executeGetVoiceConnectorTermination(GetVoiceConnectorTerminationRequest getVoiceConnectorTerminationRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorTerminationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorTerminationRequest> request = null;
        Response<GetVoiceConnectorTerminationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorTerminationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getVoiceConnectorTerminationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceConnectorTermination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceConnectorTerminationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetVoiceConnectorTerminationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the last time a <code>SIP OPTIONS</code> ping was received from your SIP
     * infrastructure for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationHealthRequest
     * @return Result of the GetVoiceConnectorTerminationHealth operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceConnectorTerminationHealth
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceConnectorTerminationHealth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceConnectorTerminationHealthResult getVoiceConnectorTerminationHealth(GetVoiceConnectorTerminationHealthRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceConnectorTerminationHealth(request);
    }

    @SdkInternalApi
    final GetVoiceConnectorTerminationHealthResult executeGetVoiceConnectorTerminationHealth(
            GetVoiceConnectorTerminationHealthRequest getVoiceConnectorTerminationHealthRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceConnectorTerminationHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceConnectorTerminationHealthRequest> request = null;
        Response<GetVoiceConnectorTerminationHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceConnectorTerminationHealthRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getVoiceConnectorTerminationHealthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceConnectorTerminationHealth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceConnectorTerminationHealthResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetVoiceConnectorTerminationHealthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of the specified voice profile.
     * </p>
     * 
     * @param getVoiceProfileRequest
     * @return Result of the GetVoiceProfile operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceProfileResult getVoiceProfile(GetVoiceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceProfile(request);
    }

    @SdkInternalApi
    final GetVoiceProfileResult executeGetVoiceProfile(GetVoiceProfileRequest getVoiceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceProfileRequest> request = null;
        Response<GetVoiceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVoiceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVoiceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of the specified voice profile domain.
     * </p>
     * 
     * @param getVoiceProfileDomainRequest
     * @return Result of the GetVoiceProfileDomain operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.GetVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceProfileDomainResult getVoiceProfileDomain(GetVoiceProfileDomainRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceProfileDomain(request);
    }

    @SdkInternalApi
    final GetVoiceProfileDomainResult executeGetVoiceProfileDomain(GetVoiceProfileDomainRequest getVoiceProfileDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceProfileDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceProfileDomainRequest> request = null;
        Response<GetVoiceProfileDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceProfileDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVoiceProfileDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceProfileDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceProfileDomainResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetVoiceProfileDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of a voice tone analysis task.
     * </p>
     * 
     * @param getVoiceToneAnalysisTaskRequest
     * @return Result of the GetVoiceToneAnalysisTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AmazonChimeSDKVoice.GetVoiceToneAnalysisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVoiceToneAnalysisTaskResult getVoiceToneAnalysisTask(GetVoiceToneAnalysisTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetVoiceToneAnalysisTask(request);
    }

    @SdkInternalApi
    final GetVoiceToneAnalysisTaskResult executeGetVoiceToneAnalysisTask(GetVoiceToneAnalysisTaskRequest getVoiceToneAnalysisTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getVoiceToneAnalysisTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVoiceToneAnalysisTaskRequest> request = null;
        Response<GetVoiceToneAnalysisTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVoiceToneAnalysisTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getVoiceToneAnalysisTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVoiceToneAnalysisTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVoiceToneAnalysisTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetVoiceToneAnalysisTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the available AWS Regions in which you can create an Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param listAvailableVoiceConnectorRegionsRequest
     * @return Result of the ListAvailableVoiceConnectorRegions operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListAvailableVoiceConnectorRegions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListAvailableVoiceConnectorRegions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAvailableVoiceConnectorRegionsResult listAvailableVoiceConnectorRegions(ListAvailableVoiceConnectorRegionsRequest request) {
        request = beforeClientExecution(request);
        return executeListAvailableVoiceConnectorRegions(request);
    }

    @SdkInternalApi
    final ListAvailableVoiceConnectorRegionsResult executeListAvailableVoiceConnectorRegions(
            ListAvailableVoiceConnectorRegionsRequest listAvailableVoiceConnectorRegionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAvailableVoiceConnectorRegionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAvailableVoiceConnectorRegionsRequest> request = null;
        Response<ListAvailableVoiceConnectorRegionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAvailableVoiceConnectorRegionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAvailableVoiceConnectorRegionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAvailableVoiceConnectorRegions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAvailableVoiceConnectorRegionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAvailableVoiceConnectorRegionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the phone numbers for an administrator's Amazon Chime SDK account.
     * </p>
     * 
     * @param listPhoneNumberOrdersRequest
     * @return Result of the ListPhoneNumberOrders operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListPhoneNumberOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListPhoneNumberOrders"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPhoneNumberOrdersResult listPhoneNumberOrders(ListPhoneNumberOrdersRequest request) {
        request = beforeClientExecution(request);
        return executeListPhoneNumberOrders(request);
    }

    @SdkInternalApi
    final ListPhoneNumberOrdersResult executeListPhoneNumberOrders(ListPhoneNumberOrdersRequest listPhoneNumberOrdersRequest) {

        ExecutionContext executionContext = createExecutionContext(listPhoneNumberOrdersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPhoneNumberOrdersRequest> request = null;
        Response<ListPhoneNumberOrdersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPhoneNumberOrdersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPhoneNumberOrdersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPhoneNumberOrders");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPhoneNumberOrdersResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListPhoneNumberOrdersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the phone numbers for the specified Amazon Chime SDK account, Amazon Chime SDK user, Amazon Chime SDK Voice
     * Connector, or Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return Result of the ListPhoneNumbers operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListPhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPhoneNumbersResult listPhoneNumbers(ListPhoneNumbersRequest request) {
        request = beforeClientExecution(request);
        return executeListPhoneNumbers(request);
    }

    @SdkInternalApi
    final ListPhoneNumbersResult executeListPhoneNumbers(ListPhoneNumbersRequest listPhoneNumbersRequest) {

        ExecutionContext executionContext = createExecutionContext(listPhoneNumbersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPhoneNumbersRequest> request = null;
        Response<ListPhoneNumbersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPhoneNumbersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPhoneNumbersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPhoneNumbers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPhoneNumbersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPhoneNumbersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the proxy sessions for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param listProxySessionsRequest
     * @return Result of the ListProxySessions operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListProxySessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListProxySessions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProxySessionsResult listProxySessions(ListProxySessionsRequest request) {
        request = beforeClientExecution(request);
        return executeListProxySessions(request);
    }

    @SdkInternalApi
    final ListProxySessionsResult executeListProxySessions(ListProxySessionsRequest listProxySessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProxySessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProxySessionsRequest> request = null;
        Response<ListProxySessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProxySessionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProxySessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProxySessions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProxySessionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProxySessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the SIP media applications under the administrator's AWS account.
     * </p>
     * 
     * @param listSipMediaApplicationsRequest
     * @return Result of the ListSipMediaApplications operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListSipMediaApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSipMediaApplications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSipMediaApplicationsResult listSipMediaApplications(ListSipMediaApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListSipMediaApplications(request);
    }

    @SdkInternalApi
    final ListSipMediaApplicationsResult executeListSipMediaApplications(ListSipMediaApplicationsRequest listSipMediaApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSipMediaApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSipMediaApplicationsRequest> request = null;
        Response<ListSipMediaApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSipMediaApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSipMediaApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSipMediaApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSipMediaApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSipMediaApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the SIP rules under the administrator's AWS account.
     * </p>
     * 
     * @param listSipRulesRequest
     * @return Result of the ListSipRules operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListSipRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSipRules" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSipRulesResult listSipRules(ListSipRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListSipRules(request);
    }

    @SdkInternalApi
    final ListSipRulesResult executeListSipRules(ListSipRulesRequest listSipRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSipRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSipRulesRequest> request = null;
        Response<ListSipRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSipRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSipRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSipRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSipRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSipRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the countries that you can order phone numbers from.
     * </p>
     * 
     * @param listSupportedPhoneNumberCountriesRequest
     * @return Result of the ListSupportedPhoneNumberCountries operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListSupportedPhoneNumberCountries
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListSupportedPhoneNumberCountries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSupportedPhoneNumberCountriesResult listSupportedPhoneNumberCountries(ListSupportedPhoneNumberCountriesRequest request) {
        request = beforeClientExecution(request);
        return executeListSupportedPhoneNumberCountries(request);
    }

    @SdkInternalApi
    final ListSupportedPhoneNumberCountriesResult executeListSupportedPhoneNumberCountries(
            ListSupportedPhoneNumberCountriesRequest listSupportedPhoneNumberCountriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSupportedPhoneNumberCountriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSupportedPhoneNumberCountriesRequest> request = null;
        Response<ListSupportedPhoneNumberCountriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSupportedPhoneNumberCountriesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSupportedPhoneNumberCountriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSupportedPhoneNumberCountries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSupportedPhoneNumberCountriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSupportedPhoneNumberCountriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the tags in a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
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
     * Lists the Amazon Chime SDK Voice Connector groups in the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceConnectorGroupsRequest
     * @return Result of the ListVoiceConnectorGroups operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListVoiceConnectorGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectorGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVoiceConnectorGroupsResult listVoiceConnectorGroups(ListVoiceConnectorGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListVoiceConnectorGroups(request);
    }

    @SdkInternalApi
    final ListVoiceConnectorGroupsResult executeListVoiceConnectorGroups(ListVoiceConnectorGroupsRequest listVoiceConnectorGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVoiceConnectorGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVoiceConnectorGroupsRequest> request = null;
        Response<ListVoiceConnectorGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVoiceConnectorGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listVoiceConnectorGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVoiceConnectorGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVoiceConnectorGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListVoiceConnectorGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the SIP credentials for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param listVoiceConnectorTerminationCredentialsRequest
     * @return Result of the ListVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVoiceConnectorTerminationCredentialsResult listVoiceConnectorTerminationCredentials(ListVoiceConnectorTerminationCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeListVoiceConnectorTerminationCredentials(request);
    }

    @SdkInternalApi
    final ListVoiceConnectorTerminationCredentialsResult executeListVoiceConnectorTerminationCredentials(
            ListVoiceConnectorTerminationCredentialsRequest listVoiceConnectorTerminationCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVoiceConnectorTerminationCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVoiceConnectorTerminationCredentialsRequest> request = null;
        Response<ListVoiceConnectorTerminationCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVoiceConnectorTerminationCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listVoiceConnectorTerminationCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVoiceConnectorTerminationCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVoiceConnectorTerminationCredentialsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListVoiceConnectorTerminationCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Amazon Chime SDK Voice Connectors in the administrators AWS account.
     * </p>
     * 
     * @param listVoiceConnectorsRequest
     * @return Result of the ListVoiceConnectors operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListVoiceConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceConnectors"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVoiceConnectorsResult listVoiceConnectors(ListVoiceConnectorsRequest request) {
        request = beforeClientExecution(request);
        return executeListVoiceConnectors(request);
    }

    @SdkInternalApi
    final ListVoiceConnectorsResult executeListVoiceConnectors(ListVoiceConnectorsRequest listVoiceConnectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVoiceConnectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVoiceConnectorsRequest> request = null;
        Response<ListVoiceConnectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVoiceConnectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVoiceConnectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVoiceConnectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVoiceConnectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVoiceConnectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the specified voice profile domains in the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceProfileDomainsRequest
     * @return Result of the ListVoiceProfileDomains operation returned by the service.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListVoiceProfileDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceProfileDomains"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVoiceProfileDomainsResult listVoiceProfileDomains(ListVoiceProfileDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeListVoiceProfileDomains(request);
    }

    @SdkInternalApi
    final ListVoiceProfileDomainsResult executeListVoiceProfileDomains(ListVoiceProfileDomainsRequest listVoiceProfileDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVoiceProfileDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVoiceProfileDomainsRequest> request = null;
        Response<ListVoiceProfileDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVoiceProfileDomainsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listVoiceProfileDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVoiceProfileDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVoiceProfileDomainsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListVoiceProfileDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the voice profiles in a voice profile domain.
     * </p>
     * 
     * @param listVoiceProfilesRequest
     * @return Result of the ListVoiceProfiles operation returned by the service.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ListVoiceProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ListVoiceProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVoiceProfilesResult listVoiceProfiles(ListVoiceProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListVoiceProfiles(request);
    }

    @SdkInternalApi
    final ListVoiceProfilesResult executeListVoiceProfiles(ListVoiceProfilesRequest listVoiceProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listVoiceProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVoiceProfilesRequest> request = null;
        Response<ListVoiceProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVoiceProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVoiceProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVoiceProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVoiceProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVoiceProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the Alexa Skill configuration for the SIP media application.
     * </p>
     * <important>
     * <p>
     * Due to changes made by the Amazon Alexa service, this API is no longer available for use. For more information,
     * refer to the <a href="https://developer.amazon.com/en-US/alexa/alexasmartproperties">Alexa Smart Properties</a>
     * page.
     * </p>
     * </important>
     * 
     * @param putSipMediaApplicationAlexaSkillConfigurationRequest
     * @return Result of the PutSipMediaApplicationAlexaSkillConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutSipMediaApplicationAlexaSkillConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutSipMediaApplicationAlexaSkillConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    @Deprecated
    public PutSipMediaApplicationAlexaSkillConfigurationResult putSipMediaApplicationAlexaSkillConfiguration(
            PutSipMediaApplicationAlexaSkillConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutSipMediaApplicationAlexaSkillConfiguration(request);
    }

    @SdkInternalApi
    final PutSipMediaApplicationAlexaSkillConfigurationResult executePutSipMediaApplicationAlexaSkillConfiguration(
            PutSipMediaApplicationAlexaSkillConfigurationRequest putSipMediaApplicationAlexaSkillConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putSipMediaApplicationAlexaSkillConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSipMediaApplicationAlexaSkillConfigurationRequest> request = null;
        Response<PutSipMediaApplicationAlexaSkillConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSipMediaApplicationAlexaSkillConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putSipMediaApplicationAlexaSkillConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSipMediaApplicationAlexaSkillConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSipMediaApplicationAlexaSkillConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutSipMediaApplicationAlexaSkillConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the logging configuration for the specified SIP media application.
     * </p>
     * 
     * @param putSipMediaApplicationLoggingConfigurationRequest
     * @return Result of the PutSipMediaApplicationLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutSipMediaApplicationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutSipMediaApplicationLoggingConfigurationResult putSipMediaApplicationLoggingConfiguration(PutSipMediaApplicationLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutSipMediaApplicationLoggingConfiguration(request);
    }

    @SdkInternalApi
    final PutSipMediaApplicationLoggingConfigurationResult executePutSipMediaApplicationLoggingConfiguration(
            PutSipMediaApplicationLoggingConfigurationRequest putSipMediaApplicationLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putSipMediaApplicationLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSipMediaApplicationLoggingConfigurationRequest> request = null;
        Response<PutSipMediaApplicationLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSipMediaApplicationLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putSipMediaApplicationLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSipMediaApplicationLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSipMediaApplicationLoggingConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutSipMediaApplicationLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a Voice Connector's emergency calling configuration.
     * </p>
     * 
     * @param putVoiceConnectorEmergencyCallingConfigurationRequest
     * @return Result of the PutVoiceConnectorEmergencyCallingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutVoiceConnectorEmergencyCallingConfigurationResult putVoiceConnectorEmergencyCallingConfiguration(
            PutVoiceConnectorEmergencyCallingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutVoiceConnectorEmergencyCallingConfiguration(request);
    }

    @SdkInternalApi
    final PutVoiceConnectorEmergencyCallingConfigurationResult executePutVoiceConnectorEmergencyCallingConfiguration(
            PutVoiceConnectorEmergencyCallingConfigurationRequest putVoiceConnectorEmergencyCallingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorEmergencyCallingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorEmergencyCallingConfigurationRequest> request = null;
        Response<PutVoiceConnectorEmergencyCallingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorEmergencyCallingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putVoiceConnectorEmergencyCallingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutVoiceConnectorEmergencyCallingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutVoiceConnectorEmergencyCallingConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutVoiceConnectorEmergencyCallingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a Voice Connector's logging configuration.
     * </p>
     * 
     * @param putVoiceConnectorLoggingConfigurationRequest
     * @return Result of the PutVoiceConnectorLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutVoiceConnectorLoggingConfigurationResult putVoiceConnectorLoggingConfiguration(PutVoiceConnectorLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutVoiceConnectorLoggingConfiguration(request);
    }

    @SdkInternalApi
    final PutVoiceConnectorLoggingConfigurationResult executePutVoiceConnectorLoggingConfiguration(
            PutVoiceConnectorLoggingConfigurationRequest putVoiceConnectorLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorLoggingConfigurationRequest> request = null;
        Response<PutVoiceConnectorLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putVoiceConnectorLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutVoiceConnectorLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutVoiceConnectorLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutVoiceConnectorLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a Voice Connector's origination settings.
     * </p>
     * 
     * @param putVoiceConnectorOriginationRequest
     * @return Result of the PutVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutVoiceConnectorOriginationResult putVoiceConnectorOrigination(PutVoiceConnectorOriginationRequest request) {
        request = beforeClientExecution(request);
        return executePutVoiceConnectorOrigination(request);
    }

    @SdkInternalApi
    final PutVoiceConnectorOriginationResult executePutVoiceConnectorOrigination(PutVoiceConnectorOriginationRequest putVoiceConnectorOriginationRequest) {

        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorOriginationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorOriginationRequest> request = null;
        Response<PutVoiceConnectorOriginationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorOriginationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putVoiceConnectorOriginationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutVoiceConnectorOrigination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutVoiceConnectorOriginationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutVoiceConnectorOriginationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Puts the specified proxy configuration to the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorProxyRequest
     * @return Result of the PutVoiceConnectorProxy operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutVoiceConnectorProxyResult putVoiceConnectorProxy(PutVoiceConnectorProxyRequest request) {
        request = beforeClientExecution(request);
        return executePutVoiceConnectorProxy(request);
    }

    @SdkInternalApi
    final PutVoiceConnectorProxyResult executePutVoiceConnectorProxy(PutVoiceConnectorProxyRequest putVoiceConnectorProxyRequest) {

        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorProxyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorProxyRequest> request = null;
        Response<PutVoiceConnectorProxyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorProxyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putVoiceConnectorProxyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutVoiceConnectorProxy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutVoiceConnectorProxyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutVoiceConnectorProxyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a Voice Connector's streaming configuration settings.
     * </p>
     * 
     * @param putVoiceConnectorStreamingConfigurationRequest
     * @return Result of the PutVoiceConnectorStreamingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorStreamingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutVoiceConnectorStreamingConfigurationResult putVoiceConnectorStreamingConfiguration(PutVoiceConnectorStreamingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutVoiceConnectorStreamingConfiguration(request);
    }

    @SdkInternalApi
    final PutVoiceConnectorStreamingConfigurationResult executePutVoiceConnectorStreamingConfiguration(
            PutVoiceConnectorStreamingConfigurationRequest putVoiceConnectorStreamingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorStreamingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorStreamingConfigurationRequest> request = null;
        Response<PutVoiceConnectorStreamingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorStreamingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putVoiceConnectorStreamingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutVoiceConnectorStreamingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutVoiceConnectorStreamingConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutVoiceConnectorStreamingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a Voice Connector's termination settings.
     * </p>
     * 
     * @param putVoiceConnectorTerminationRequest
     * @return Result of the PutVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutVoiceConnectorTerminationResult putVoiceConnectorTermination(PutVoiceConnectorTerminationRequest request) {
        request = beforeClientExecution(request);
        return executePutVoiceConnectorTermination(request);
    }

    @SdkInternalApi
    final PutVoiceConnectorTerminationResult executePutVoiceConnectorTermination(PutVoiceConnectorTerminationRequest putVoiceConnectorTerminationRequest) {

        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorTerminationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorTerminationRequest> request = null;
        Response<PutVoiceConnectorTerminationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorTerminationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putVoiceConnectorTerminationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutVoiceConnectorTermination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutVoiceConnectorTerminationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutVoiceConnectorTerminationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a Voice Connector's termination credentials.
     * </p>
     * 
     * @param putVoiceConnectorTerminationCredentialsRequest
     * @return Result of the PutVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.PutVoiceConnectorTerminationCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PutVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutVoiceConnectorTerminationCredentialsResult putVoiceConnectorTerminationCredentials(PutVoiceConnectorTerminationCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executePutVoiceConnectorTerminationCredentials(request);
    }

    @SdkInternalApi
    final PutVoiceConnectorTerminationCredentialsResult executePutVoiceConnectorTerminationCredentials(
            PutVoiceConnectorTerminationCredentialsRequest putVoiceConnectorTerminationCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(putVoiceConnectorTerminationCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutVoiceConnectorTerminationCredentialsRequest> request = null;
        Response<PutVoiceConnectorTerminationCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutVoiceConnectorTerminationCredentialsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putVoiceConnectorTerminationCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutVoiceConnectorTerminationCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutVoiceConnectorTerminationCredentialsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutVoiceConnectorTerminationCredentialsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restores a deleted phone number.
     * </p>
     * 
     * @param restorePhoneNumberRequest
     * @return Result of the RestorePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.RestorePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/RestorePhoneNumber"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RestorePhoneNumberResult restorePhoneNumber(RestorePhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeRestorePhoneNumber(request);
    }

    @SdkInternalApi
    final RestorePhoneNumberResult executeRestorePhoneNumber(RestorePhoneNumberRequest restorePhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(restorePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestorePhoneNumberRequest> request = null;
        Response<RestorePhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestorePhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restorePhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestorePhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestorePhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RestorePhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches the provisioned phone numbers in an organization.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return Result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/SearchAvailablePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchAvailablePhoneNumbersResult searchAvailablePhoneNumbers(SearchAvailablePhoneNumbersRequest request) {
        request = beforeClientExecution(request);
        return executeSearchAvailablePhoneNumbers(request);
    }

    @SdkInternalApi
    final SearchAvailablePhoneNumbersResult executeSearchAvailablePhoneNumbers(SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest) {

        ExecutionContext executionContext = createExecutionContext(searchAvailablePhoneNumbersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchAvailablePhoneNumbersRequest> request = null;
        Response<SearchAvailablePhoneNumbersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchAvailablePhoneNumbersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(searchAvailablePhoneNumbersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchAvailablePhoneNumbers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchAvailablePhoneNumbersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SearchAvailablePhoneNumbersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a speaker search task.
     * </p>
     * <important>
     * <p>
     * Before starting any speaker search tasks, you must provide all notices and obtain all consents from the speaker
     * as required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * 
     * @param startSpeakerSearchTaskRequest
     * @return Result of the StartSpeakerSearchTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws GoneException
     *         Access to the target resource is no longer available at the origin server. This condition is likely to be
     *         permanent.
     * @throws UnprocessableEntityException
     *         A well-formed request couldn't be followed due to semantic errors.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.StartSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StartSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartSpeakerSearchTaskResult startSpeakerSearchTask(StartSpeakerSearchTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartSpeakerSearchTask(request);
    }

    @SdkInternalApi
    final StartSpeakerSearchTaskResult executeStartSpeakerSearchTask(StartSpeakerSearchTaskRequest startSpeakerSearchTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startSpeakerSearchTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSpeakerSearchTaskRequest> request = null;
        Response<StartSpeakerSearchTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSpeakerSearchTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startSpeakerSearchTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSpeakerSearchTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSpeakerSearchTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartSpeakerSearchTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a voice tone analysis task. For more information about voice tone analysis, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/dg/pstn-voice-analytics.html">Using Amazon Chime SDK voice
     * analytics</a> in the <i>Amazon Chime SDK Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * Before starting any voice tone analysis tasks, you must provide all notices and obtain all consents from the
     * speaker as required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * 
     * @param startVoiceToneAnalysisTaskRequest
     * @return Result of the StartVoiceToneAnalysisTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws GoneException
     *         Access to the target resource is no longer available at the origin server. This condition is likely to be
     *         permanent.
     * @throws UnprocessableEntityException
     *         A well-formed request couldn't be followed due to semantic errors.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.StartVoiceToneAnalysisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StartVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartVoiceToneAnalysisTaskResult startVoiceToneAnalysisTask(StartVoiceToneAnalysisTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartVoiceToneAnalysisTask(request);
    }

    @SdkInternalApi
    final StartVoiceToneAnalysisTaskResult executeStartVoiceToneAnalysisTask(StartVoiceToneAnalysisTaskRequest startVoiceToneAnalysisTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startVoiceToneAnalysisTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartVoiceToneAnalysisTaskRequest> request = null;
        Response<StartVoiceToneAnalysisTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartVoiceToneAnalysisTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startVoiceToneAnalysisTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartVoiceToneAnalysisTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartVoiceToneAnalysisTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartVoiceToneAnalysisTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a speaker search task.
     * </p>
     * 
     * @param stopSpeakerSearchTaskRequest
     * @return Result of the StopSpeakerSearchTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws UnprocessableEntityException
     *         A well-formed request couldn't be followed due to semantic errors.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.StopSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StopSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopSpeakerSearchTaskResult stopSpeakerSearchTask(StopSpeakerSearchTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStopSpeakerSearchTask(request);
    }

    @SdkInternalApi
    final StopSpeakerSearchTaskResult executeStopSpeakerSearchTask(StopSpeakerSearchTaskRequest stopSpeakerSearchTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(stopSpeakerSearchTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopSpeakerSearchTaskRequest> request = null;
        Response<StopSpeakerSearchTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopSpeakerSearchTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopSpeakerSearchTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopSpeakerSearchTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopSpeakerSearchTaskResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StopSpeakerSearchTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a voice tone analysis task.
     * </p>
     * 
     * @param stopVoiceToneAnalysisTaskRequest
     * @return Result of the StopVoiceToneAnalysisTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws UnprocessableEntityException
     *         A well-formed request couldn't be followed due to semantic errors.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.StopVoiceToneAnalysisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StopVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopVoiceToneAnalysisTaskResult stopVoiceToneAnalysisTask(StopVoiceToneAnalysisTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStopVoiceToneAnalysisTask(request);
    }

    @SdkInternalApi
    final StopVoiceToneAnalysisTaskResult executeStopVoiceToneAnalysisTask(StopVoiceToneAnalysisTaskRequest stopVoiceToneAnalysisTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(stopVoiceToneAnalysisTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopVoiceToneAnalysisTaskRequest> request = null;
        Response<StopVoiceToneAnalysisTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopVoiceToneAnalysisTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopVoiceToneAnalysisTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopVoiceToneAnalysisTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopVoiceToneAnalysisTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopVoiceToneAnalysisTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a tag to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/TagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
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
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
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
     * Updates global settings for the Amazon Chime SDK Voice Connectors in an AWS account.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @return Result of the UpdateGlobalSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGlobalSettingsResult updateGlobalSettings(UpdateGlobalSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGlobalSettings(request);
    }

    @SdkInternalApi
    final UpdateGlobalSettingsResult executeUpdateGlobalSettings(UpdateGlobalSettingsRequest updateGlobalSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGlobalSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGlobalSettingsRequest> request = null;
        Response<UpdateGlobalSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGlobalSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGlobalSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGlobalSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGlobalSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGlobalSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates phone number details, such as product type, calling name, or phone number name for the specified phone
     * number ID. You can update one phone number detail at a time. For example, you can update either the product type,
     * calling name, or phone number name in one action.
     * </p>
     * <p>
     * For numbers outside the U.S., you must use the Amazon Chime SDK SIP Media Application Dial-In product type.
     * </p>
     * <p>
     * Updates to outbound calling names can take 72 hours to complete. Pending updates to outbound calling names must
     * be complete before you can request another update.
     * </p>
     * 
     * @param updatePhoneNumberRequest
     * @return Result of the UpdatePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdatePhoneNumber"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
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
     * Updates the phone number settings for the administrator's AWS account, such as the default outbound calling name.
     * You can update the default outbound calling name once every seven days. Outbound calling names can take up to 72
     * hours to update.
     * </p>
     * 
     * @param updatePhoneNumberSettingsRequest
     * @return Result of the UpdatePhoneNumberSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdatePhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdatePhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePhoneNumberSettingsResult updatePhoneNumberSettings(UpdatePhoneNumberSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePhoneNumberSettings(request);
    }

    @SdkInternalApi
    final UpdatePhoneNumberSettingsResult executeUpdatePhoneNumberSettings(UpdatePhoneNumberSettingsRequest updatePhoneNumberSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePhoneNumberSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePhoneNumberSettingsRequest> request = null;
        Response<UpdatePhoneNumberSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePhoneNumberSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updatePhoneNumberSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePhoneNumberSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePhoneNumberSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdatePhoneNumberSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified proxy session details, such as voice or SMS capabilities.
     * </p>
     * 
     * @param updateProxySessionRequest
     * @return Result of the UpdateProxySession operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateProxySession"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateProxySessionResult updateProxySession(UpdateProxySessionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProxySession(request);
    }

    @SdkInternalApi
    final UpdateProxySessionResult executeUpdateProxySession(UpdateProxySessionRequest updateProxySessionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProxySessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProxySessionRequest> request = null;
        Response<UpdateProxySessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProxySessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProxySessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProxySession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProxySessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProxySessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the details of the specified SIP media application.
     * </p>
     * 
     * @param updateSipMediaApplicationRequest
     * @return Result of the UpdateSipMediaApplication operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSipMediaApplicationResult updateSipMediaApplication(UpdateSipMediaApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSipMediaApplication(request);
    }

    @SdkInternalApi
    final UpdateSipMediaApplicationResult executeUpdateSipMediaApplication(UpdateSipMediaApplicationRequest updateSipMediaApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSipMediaApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSipMediaApplicationRequest> request = null;
        Response<UpdateSipMediaApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSipMediaApplicationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSipMediaApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSipMediaApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSipMediaApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSipMediaApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Invokes the AWS Lambda function associated with the SIP media application and transaction ID in an update
     * request. The Lambda function can then return a new set of actions.
     * </p>
     * 
     * @param updateSipMediaApplicationCallRequest
     * @return Result of the UpdateSipMediaApplicationCall operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateSipMediaApplicationCall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipMediaApplicationCall"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSipMediaApplicationCallResult updateSipMediaApplicationCall(UpdateSipMediaApplicationCallRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSipMediaApplicationCall(request);
    }

    @SdkInternalApi
    final UpdateSipMediaApplicationCallResult executeUpdateSipMediaApplicationCall(UpdateSipMediaApplicationCallRequest updateSipMediaApplicationCallRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSipMediaApplicationCallRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSipMediaApplicationCallRequest> request = null;
        Response<UpdateSipMediaApplicationCallResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSipMediaApplicationCallRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSipMediaApplicationCallRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSipMediaApplicationCall");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSipMediaApplicationCallResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSipMediaApplicationCallResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the details of the specified SIP rule.
     * </p>
     * 
     * @param updateSipRuleRequest
     * @return Result of the UpdateSipRule operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateSipRule" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateSipRuleResult updateSipRule(UpdateSipRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSipRule(request);
    }

    @SdkInternalApi
    final UpdateSipRuleResult executeUpdateSipRule(UpdateSipRuleRequest updateSipRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSipRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSipRuleRequest> request = null;
        Response<UpdateSipRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSipRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSipRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSipRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSipRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSipRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the details for the specified Amazon Chime SDK Voice Connector.
     * </p>
     * 
     * @param updateVoiceConnectorRequest
     * @return Result of the UpdateVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateVoiceConnectorResult updateVoiceConnector(UpdateVoiceConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVoiceConnector(request);
    }

    @SdkInternalApi
    final UpdateVoiceConnectorResult executeUpdateVoiceConnector(UpdateVoiceConnectorRequest updateVoiceConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVoiceConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVoiceConnectorRequest> request = null;
        Response<UpdateVoiceConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVoiceConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVoiceConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVoiceConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVoiceConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVoiceConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the settings for the specified Amazon Chime SDK Voice Connector group.
     * </p>
     * 
     * @param updateVoiceConnectorGroupRequest
     * @return Result of the UpdateVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateVoiceConnectorGroupResult updateVoiceConnectorGroup(UpdateVoiceConnectorGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVoiceConnectorGroup(request);
    }

    @SdkInternalApi
    final UpdateVoiceConnectorGroupResult executeUpdateVoiceConnectorGroup(UpdateVoiceConnectorGroupRequest updateVoiceConnectorGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVoiceConnectorGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVoiceConnectorGroupRequest> request = null;
        Response<UpdateVoiceConnectorGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVoiceConnectorGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateVoiceConnectorGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVoiceConnectorGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVoiceConnectorGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateVoiceConnectorGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified voice profile’s voice print and refreshes its expiration timestamp.
     * </p>
     * <important>
     * <p>
     * As a condition of using this feature, you acknowledge that the collection, use, storage, and retention of your
     * caller’s biometric identifiers and biometric information (“biometric data”) in the form of a digital voiceprint
     * requires the caller’s informed consent via a written release. Such consent is required under various state laws,
     * including biometrics laws in Illinois, Texas, Washington and other state privacy laws.
     * </p>
     * <p>
     * You must provide a written release to each caller through a process that clearly reflects each caller’s informed
     * consent before using Amazon Chime SDK Voice Insights service, as required under the terms of your agreement with
     * AWS governing your use of the service.
     * </p>
     * </important>
     * 
     * @param updateVoiceProfileRequest
     * @return Result of the UpdateVoiceProfile operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ConflictException
     *         Multiple instances of the same request were made simultaneously.
     * @throws GoneException
     *         Access to the target resource is no longer available at the origin server. This condition is likely to be
     *         permanent.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateVoiceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateVoiceProfileResult updateVoiceProfile(UpdateVoiceProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVoiceProfile(request);
    }

    @SdkInternalApi
    final UpdateVoiceProfileResult executeUpdateVoiceProfile(UpdateVoiceProfileRequest updateVoiceProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVoiceProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVoiceProfileRequest> request = null;
        Response<UpdateVoiceProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVoiceProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVoiceProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVoiceProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVoiceProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVoiceProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the settings for the specified voice profile domain.
     * </p>
     * 
     * @param updateVoiceProfileDomainRequest
     * @return Result of the UpdateVoiceProfileDomain operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws AccessDeniedException
     *         You don't have the permissions needed to run this action.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.UpdateVoiceProfileDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceProfileDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateVoiceProfileDomainResult updateVoiceProfileDomain(UpdateVoiceProfileDomainRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVoiceProfileDomain(request);
    }

    @SdkInternalApi
    final UpdateVoiceProfileDomainResult executeUpdateVoiceProfileDomain(UpdateVoiceProfileDomainRequest updateVoiceProfileDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVoiceProfileDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVoiceProfileDomainRequest> request = null;
        Response<UpdateVoiceProfileDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVoiceProfileDomainRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateVoiceProfileDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVoiceProfileDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVoiceProfileDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateVoiceProfileDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Validates an address to be used for 911 calls made with Amazon Chime SDK Voice Connectors. You can use validated
     * addresses in a Presence Information Data Format Location Object file that you include in SIP requests. That helps
     * ensure that addresses are routed to the appropriate Public Safety Answering Point.
     * </p>
     * 
     * @param validateE911AddressRequest
     * @return Result of the ValidateE911Address operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client isn't authorized to request a resource.
     * @throws NotFoundException
     *         The requested resource couldn't be found.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The number of customer requests exceeds the request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKVoice.ValidateE911Address
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/ValidateE911Address"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ValidateE911AddressResult validateE911Address(ValidateE911AddressRequest request) {
        request = beforeClientExecution(request);
        return executeValidateE911Address(request);
    }

    @SdkInternalApi
    final ValidateE911AddressResult executeValidateE911Address(ValidateE911AddressRequest validateE911AddressRequest) {

        ExecutionContext executionContext = createExecutionContext(validateE911AddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateE911AddressRequest> request = null;
        Response<ValidateE911AddressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidateE911AddressRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(validateE911AddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Chime SDK Voice");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ValidateE911Address");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ValidateE911AddressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ValidateE911AddressResultJsonUnmarshaller());
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
