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
 * Amazon Connect is a cloud-based contact center solution that you use to set up and manage a customer contact center
 * and provide reliable customer engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect provides metrics and real-time reporting that enable you to optimize contact routing. You can also
 * resolve customer issues more efficiently by getting customers in touch with the appropriate agents.
 * </p>
 * <p>
 * There are limits to the number of Amazon Connect resources that you can create. There are also limits to the number
 * of requests that you can make per second. For more information, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
 * Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 * <p>
 * You can connect programmatically to an Amazon Web Services service by using an endpoint. For a list of Amazon Connect
 * endpoints, see <a href="https://docs.aws.amazon.com/general/latest/gr/connect_region.html">Amazon Connect
 * Endpoints</a>.
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
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotReadyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.ResourceNotReadyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateResourceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.DuplicateResourceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.InternalServiceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OutputTypeNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.OutputTypeNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaximumResultReturnedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.MaximumResultReturnedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ContactNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.ContactNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OutboundContactNotPermittedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.OutboundContactNotPermittedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ContactFlowNotPublishedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.ContactFlowNotPublishedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.UserNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DestinationNotAllowedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.DestinationNotAllowedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PropertyValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.PropertyValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.TooManyRequestsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidContactFlowModuleException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.InvalidContactFlowModuleExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.ResourceConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidContactFlowException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.InvalidContactFlowExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotencyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connect.model.transform.IdempotencyExceptionUnmarshaller.getInstance()))
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
     * Activates an evaluation form in the specified Amazon Connect instance. After the evaluation form is activated, it
     * is available to start new evaluations based on the form.
     * </p>
     * 
     * @param activateEvaluationFormRequest
     * @return Result of the ActivateEvaluationForm operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.ActivateEvaluationForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ActivateEvaluationForm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ActivateEvaluationFormResult activateEvaluationForm(ActivateEvaluationFormRequest request) {
        request = beforeClientExecution(request);
        return executeActivateEvaluationForm(request);
    }

    @SdkInternalApi
    final ActivateEvaluationFormResult executeActivateEvaluationForm(ActivateEvaluationFormRequest activateEvaluationFormRequest) {

        ExecutionContext executionContext = createExecutionContext(activateEvaluationFormRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ActivateEvaluationFormRequest> request = null;
        Response<ActivateEvaluationFormResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ActivateEvaluationFormRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(activateEvaluationFormRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ActivateEvaluationForm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ActivateEvaluationFormResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ActivateEvaluationFormResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates the specified dataset for a Amazon Connect instance with the target account. You can associate only
     * one dataset in a single call.
     * </p>
     * 
     * @param associateAnalyticsDataSetRequest
     * @return Result of the AssociateAnalyticsDataSet operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.AssociateAnalyticsDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateAnalyticsDataSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateAnalyticsDataSetResult associateAnalyticsDataSet(AssociateAnalyticsDataSetRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateAnalyticsDataSet(request);
    }

    @SdkInternalApi
    final AssociateAnalyticsDataSetResult executeAssociateAnalyticsDataSet(AssociateAnalyticsDataSetRequest associateAnalyticsDataSetRequest) {

        ExecutionContext executionContext = createExecutionContext(associateAnalyticsDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateAnalyticsDataSetRequest> request = null;
        Response<AssociateAnalyticsDataSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateAnalyticsDataSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateAnalyticsDataSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateAnalyticsDataSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateAnalyticsDataSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateAnalyticsDataSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates an approved origin to an Amazon Connect instance.
     * </p>
     * 
     * @param associateApprovedOriginRequest
     * @return Result of the AssociateApprovedOrigin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateApprovedOrigin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateApprovedOrigin"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateApprovedOriginResult associateApprovedOrigin(AssociateApprovedOriginRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateApprovedOrigin(request);
    }

    @SdkInternalApi
    final AssociateApprovedOriginResult executeAssociateApprovedOrigin(AssociateApprovedOriginRequest associateApprovedOriginRequest) {

        ExecutionContext executionContext = createExecutionContext(associateApprovedOriginRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateApprovedOriginRequest> request = null;
        Response<AssociateApprovedOriginResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateApprovedOriginRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateApprovedOriginRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateApprovedOrigin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateApprovedOriginResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateApprovedOriginResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param associateBotRequest
     * @return Result of the AssociateBot operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateBot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateBotResult associateBot(AssociateBotRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateBot(request);
    }

    @SdkInternalApi
    final AssociateBotResult executeAssociateBot(AssociateBotRequest associateBotRequest) {

        ExecutionContext executionContext = createExecutionContext(associateBotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateBotRequest> request = null;
        Response<AssociateBotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateBotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateBotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateBot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateBotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateBotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates an existing vocabulary as the default. Contact Lens for Amazon Connect uses the vocabulary in
     * post-call and real-time analysis sessions for the given language.
     * </p>
     * 
     * @param associateDefaultVocabularyRequest
     * @return Result of the AssociateDefaultVocabulary operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.AssociateDefaultVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateDefaultVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateDefaultVocabularyResult associateDefaultVocabulary(AssociateDefaultVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateDefaultVocabulary(request);
    }

    @SdkInternalApi
    final AssociateDefaultVocabularyResult executeAssociateDefaultVocabulary(AssociateDefaultVocabularyRequest associateDefaultVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(associateDefaultVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDefaultVocabularyRequest> request = null;
        Response<AssociateDefaultVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDefaultVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateDefaultVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateDefaultVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateDefaultVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateDefaultVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a connect resource to a flow.
     * </p>
     * 
     * @param associateFlowRequest
     * @return Result of the AssociateFlow operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateFlowResult associateFlow(AssociateFlowRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateFlow(request);
    }

    @SdkInternalApi
    final AssociateFlowResult executeAssociateFlow(AssociateFlowRequest associateFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(associateFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateFlowRequest> request = null;
        Response<AssociateFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a storage resource type for the first time. You can only associate one type of storage configuration
     * in a single call. This means, for example, that you can't define an instance with multiple S3 buckets for storing
     * chat transcripts.
     * </p>
     * <p>
     * This API does not create a resource that doesn't exist. It only associates it to the instance. Ensure that the
     * resource being specified in the storage configuration, like an S3 bucket, exists when being used for association.
     * </p>
     * 
     * @param associateInstanceStorageConfigRequest
     * @return Result of the AssociateInstanceStorageConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateInstanceStorageConfigResult associateInstanceStorageConfig(AssociateInstanceStorageConfigRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateInstanceStorageConfig(request);
    }

    @SdkInternalApi
    final AssociateInstanceStorageConfigResult executeAssociateInstanceStorageConfig(AssociateInstanceStorageConfigRequest associateInstanceStorageConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(associateInstanceStorageConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateInstanceStorageConfigRequest> request = null;
        Response<AssociateInstanceStorageConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateInstanceStorageConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateInstanceStorageConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateInstanceStorageConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateInstanceStorageConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateInstanceStorageConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Lambda function.
     * </p>
     * 
     * @param associateLambdaFunctionRequest
     * @return Result of the AssociateLambdaFunction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateLambdaFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateLambdaFunction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateLambdaFunctionResult associateLambdaFunction(AssociateLambdaFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateLambdaFunction(request);
    }

    @SdkInternalApi
    final AssociateLambdaFunctionResult executeAssociateLambdaFunction(AssociateLambdaFunctionRequest associateLambdaFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(associateLambdaFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateLambdaFunctionRequest> request = null;
        Response<AssociateLambdaFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateLambdaFunctionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateLambdaFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateLambdaFunction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateLambdaFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateLambdaFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Allows the specified Amazon Connect instance to access the specified Amazon Lex V1 bot. This API only supports
     * the association of Amazon Lex V1 bots.
     * </p>
     * 
     * @param associateLexBotRequest
     * @return Result of the AssociateLexBot operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateLexBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateLexBot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateLexBotResult associateLexBot(AssociateLexBotRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateLexBot(request);
    }

    @SdkInternalApi
    final AssociateLexBotResult executeAssociateLexBot(AssociateLexBotRequest associateLexBotRequest) {

        ExecutionContext executionContext = createExecutionContext(associateLexBotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateLexBotRequest> request = null;
        Response<AssociateLexBotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateLexBotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateLexBotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateLexBot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateLexBotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateLexBotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a flow with a phone number claimed to your Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are calling this API using an instance in the
     * Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone
     * number ARN or UUID value for the <code>PhoneNumberId</code> URI request parameter. However, if the number is
     * claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon
     * Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If
     * a UUID is provided in this scenario, you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param associatePhoneNumberContactFlowRequest
     * @return Result of the AssociatePhoneNumberContactFlow operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.AssociatePhoneNumberContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociatePhoneNumberContactFlow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociatePhoneNumberContactFlowResult associatePhoneNumberContactFlow(AssociatePhoneNumberContactFlowRequest request) {
        request = beforeClientExecution(request);
        return executeAssociatePhoneNumberContactFlow(request);
    }

    @SdkInternalApi
    final AssociatePhoneNumberContactFlowResult executeAssociatePhoneNumberContactFlow(
            AssociatePhoneNumberContactFlowRequest associatePhoneNumberContactFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(associatePhoneNumberContactFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociatePhoneNumberContactFlowRequest> request = null;
        Response<AssociatePhoneNumberContactFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociatePhoneNumberContactFlowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associatePhoneNumberContactFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociatePhoneNumberContactFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociatePhoneNumberContactFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociatePhoneNumberContactFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a set of quick connects with a queue.
     * </p>
     * 
     * @param associateQueueQuickConnectsRequest
     * @return Result of the AssociateQueueQuickConnects operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.AssociateQueueQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateQueueQuickConnects"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateQueueQuickConnectsResult associateQueueQuickConnects(AssociateQueueQuickConnectsRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateQueueQuickConnects(request);
    }

    @SdkInternalApi
    final AssociateQueueQuickConnectsResult executeAssociateQueueQuickConnects(AssociateQueueQuickConnectsRequest associateQueueQuickConnectsRequest) {

        ExecutionContext executionContext = createExecutionContext(associateQueueQuickConnectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateQueueQuickConnectsRequest> request = null;
        Response<AssociateQueueQuickConnectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateQueueQuickConnectsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateQueueQuickConnectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateQueueQuickConnects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateQueueQuickConnectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateQueueQuickConnectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a set of queues with a routing profile.
     * </p>
     * 
     * @param associateRoutingProfileQueuesRequest
     * @return Result of the AssociateRoutingProfileQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.AssociateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateRoutingProfileQueuesResult associateRoutingProfileQueues(AssociateRoutingProfileQueuesRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateRoutingProfileQueues(request);
    }

    @SdkInternalApi
    final AssociateRoutingProfileQueuesResult executeAssociateRoutingProfileQueues(AssociateRoutingProfileQueuesRequest associateRoutingProfileQueuesRequest) {

        ExecutionContext executionContext = createExecutionContext(associateRoutingProfileQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateRoutingProfileQueuesRequest> request = null;
        Response<AssociateRoutingProfileQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateRoutingProfileQueuesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateRoutingProfileQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateRoutingProfileQueues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateRoutingProfileQueuesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateRoutingProfileQueuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a security key to the instance.
     * </p>
     * 
     * @param associateSecurityKeyRequest
     * @return Result of the AssociateSecurityKey operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.AssociateSecurityKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateSecurityKey" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateSecurityKeyResult associateSecurityKey(AssociateSecurityKeyRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateSecurityKey(request);
    }

    @SdkInternalApi
    final AssociateSecurityKeyResult executeAssociateSecurityKey(AssociateSecurityKeyRequest associateSecurityKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(associateSecurityKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSecurityKeyRequest> request = null;
        Response<AssociateSecurityKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSecurityKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateSecurityKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateSecurityKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateSecurityKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateSecurityKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates an agent with a traffic distribution group.
     * </p>
     * 
     * @param associateTrafficDistributionGroupUserRequest
     * @return Result of the AssociateTrafficDistributionGroupUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.AssociateTrafficDistributionGroupUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateTrafficDistributionGroupUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateTrafficDistributionGroupUserResult associateTrafficDistributionGroupUser(AssociateTrafficDistributionGroupUserRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateTrafficDistributionGroupUser(request);
    }

    @SdkInternalApi
    final AssociateTrafficDistributionGroupUserResult executeAssociateTrafficDistributionGroupUser(
            AssociateTrafficDistributionGroupUserRequest associateTrafficDistributionGroupUserRequest) {

        ExecutionContext executionContext = createExecutionContext(associateTrafficDistributionGroupUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateTrafficDistributionGroupUserRequest> request = null;
        Response<AssociateTrafficDistributionGroupUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateTrafficDistributionGroupUserRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateTrafficDistributionGroupUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateTrafficDistributionGroupUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateTrafficDistributionGroupUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateTrafficDistributionGroupUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * &gt;Associates a set of proficiencies with a user.
     * </p>
     * 
     * @param associateUserProficienciesRequest
     * @return Result of the AssociateUserProficiencies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.AssociateUserProficiencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AssociateUserProficiencies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateUserProficienciesResult associateUserProficiencies(AssociateUserProficienciesRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateUserProficiencies(request);
    }

    @SdkInternalApi
    final AssociateUserProficienciesResult executeAssociateUserProficiencies(AssociateUserProficienciesRequest associateUserProficienciesRequest) {

        ExecutionContext executionContext = createExecutionContext(associateUserProficienciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateUserProficienciesRequest> request = null;
        Response<AssociateUserProficienciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateUserProficienciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateUserProficienciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateUserProficiencies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateUserProficienciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateUserProficienciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Associates a list of analytics datasets for a given Amazon Connect instance to a target account. You can
     * associate multiple datasets in a single call.
     * </p>
     * 
     * @param batchAssociateAnalyticsDataSetRequest
     * @return Result of the BatchAssociateAnalyticsDataSet operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.BatchAssociateAnalyticsDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchAssociateAnalyticsDataSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchAssociateAnalyticsDataSetResult batchAssociateAnalyticsDataSet(BatchAssociateAnalyticsDataSetRequest request) {
        request = beforeClientExecution(request);
        return executeBatchAssociateAnalyticsDataSet(request);
    }

    @SdkInternalApi
    final BatchAssociateAnalyticsDataSetResult executeBatchAssociateAnalyticsDataSet(BatchAssociateAnalyticsDataSetRequest batchAssociateAnalyticsDataSetRequest) {

        ExecutionContext executionContext = createExecutionContext(batchAssociateAnalyticsDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchAssociateAnalyticsDataSetRequest> request = null;
        Response<BatchAssociateAnalyticsDataSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchAssociateAnalyticsDataSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchAssociateAnalyticsDataSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchAssociateAnalyticsDataSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchAssociateAnalyticsDataSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchAssociateAnalyticsDataSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Removes a list of analytics datasets associated with a given Amazon Connect instance. You can disassociate
     * multiple datasets in a single call.
     * </p>
     * 
     * @param batchDisassociateAnalyticsDataSetRequest
     * @return Result of the BatchDisassociateAnalyticsDataSet operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.BatchDisassociateAnalyticsDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchDisassociateAnalyticsDataSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDisassociateAnalyticsDataSetResult batchDisassociateAnalyticsDataSet(BatchDisassociateAnalyticsDataSetRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDisassociateAnalyticsDataSet(request);
    }

    @SdkInternalApi
    final BatchDisassociateAnalyticsDataSetResult executeBatchDisassociateAnalyticsDataSet(
            BatchDisassociateAnalyticsDataSetRequest batchDisassociateAnalyticsDataSetRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDisassociateAnalyticsDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDisassociateAnalyticsDataSetRequest> request = null;
        Response<BatchDisassociateAnalyticsDataSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDisassociateAnalyticsDataSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchDisassociateAnalyticsDataSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDisassociateAnalyticsDataSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDisassociateAnalyticsDataSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchDisassociateAnalyticsDataSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to retrieve metadata about multiple attached files on an associated resource. Each attached file
     * provided in the input list must be associated with the input AssociatedResourceArn.
     * </p>
     * 
     * @param batchGetAttachedFileMetadataRequest
     * @return Result of the BatchGetAttachedFileMetadata operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.BatchGetAttachedFileMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchGetAttachedFileMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetAttachedFileMetadataResult batchGetAttachedFileMetadata(BatchGetAttachedFileMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetAttachedFileMetadata(request);
    }

    @SdkInternalApi
    final BatchGetAttachedFileMetadataResult executeBatchGetAttachedFileMetadata(BatchGetAttachedFileMetadataRequest batchGetAttachedFileMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetAttachedFileMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetAttachedFileMetadataRequest> request = null;
        Response<BatchGetAttachedFileMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetAttachedFileMetadataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetAttachedFileMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetAttachedFileMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetAttachedFileMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetAttachedFileMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve the flow associations for the given resources.
     * </p>
     * 
     * @param batchGetFlowAssociationRequest
     * @return Result of the BatchGetFlowAssociation operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.BatchGetFlowAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchGetFlowAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetFlowAssociationResult batchGetFlowAssociation(BatchGetFlowAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetFlowAssociation(request);
    }

    @SdkInternalApi
    final BatchGetFlowAssociationResult executeBatchGetFlowAssociation(BatchGetFlowAssociationRequest batchGetFlowAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetFlowAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetFlowAssociationRequest> request = null;
        Response<BatchGetFlowAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetFlowAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetFlowAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetFlowAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetFlowAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetFlowAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * Only the Amazon Connect outbound campaigns service principal is allowed to assume a role in your account and call
     * this API.
     * </p>
     * </note>
     * <p>
     * Allows you to create a batch of contacts in Amazon Connect. The outbound campaigns capability ingests dial
     * requests via the <a
     * href="https://docs.aws.amazon.com/connect-outbound/latest/APIReference/API_PutDialRequestBatch.html"
     * >PutDialRequestBatch</a> API. It then uses BatchPutContact to create contacts corresponding to those dial
     * requests. If agents are available, the dial requests are dialed out, which results in a voice call. The resulting
     * voice call uses the same contactId that was created by BatchPutContact.
     * </p>
     * 
     * @param batchPutContactRequest
     * @return Result of the BatchPutContact operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @sample AmazonConnect.BatchPutContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchPutContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchPutContactResult batchPutContact(BatchPutContactRequest request) {
        request = beforeClientExecution(request);
        return executeBatchPutContact(request);
    }

    @SdkInternalApi
    final BatchPutContactResult executeBatchPutContact(BatchPutContactRequest batchPutContactRequest) {

        ExecutionContext executionContext = createExecutionContext(batchPutContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchPutContactRequest> request = null;
        Response<BatchPutContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchPutContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchPutContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchPutContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchPutContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchPutContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Claims an available phone number to your Amazon Connect instance or traffic distribution group. You can call this
     * API only in the same Amazon Web Services Region where the Amazon Connect instance or traffic distribution group
     * was created.
     * </p>
     * <p>
     * For more information about how to use this operation, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-number.html">Claim a phone number in your
     * country</a> and <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/claim-phone-numbers-traffic-distribution-groups.html"
     * >Claim phone numbers to traffic distribution groups</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * You can call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html"
     * >SearchAvailablePhoneNumbers</a> API for available phone numbers that you can claim. Call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API to verify the status of a previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimPhoneNumber.html">ClaimPhoneNumber</a>
     * operation.
     * </p>
     * </important>
     * <p>
     * If you plan to claim and release numbers frequently during a 30 day period, contact us for a service quota
     * exception. Otherwise, it is possible you will be blocked from claiming and releasing any more numbers until 30
     * days past the oldest number released has expired.
     * </p>
     * <p>
     * By default you can claim and release up to 200% of your maximum number of active phone numbers during any 30 day
     * period. If you claim and release phone numbers using the UI or API during a rolling 30 day cycle that exceeds
     * 200% of your phone number service level quota, you will be blocked from claiming any more numbers until 30 days
     * past the oldest number released has expired.
     * </p>
     * <p>
     * For example, if you already have 99 claimed numbers and a service level quota of 99 phone numbers, and in any 30
     * day period you release 99, claim 99, and then release 99, you will have exceeded the 200% limit. At that point
     * you are blocked from claiming any more numbers until you open an Amazon Web Services support ticket.
     * </p>
     * 
     * @param claimPhoneNumberRequest
     * @return Result of the ClaimPhoneNumber operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.ClaimPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ClaimPhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ClaimPhoneNumberResult claimPhoneNumber(ClaimPhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeClaimPhoneNumber(request);
    }

    @SdkInternalApi
    final ClaimPhoneNumberResult executeClaimPhoneNumber(ClaimPhoneNumberRequest claimPhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(claimPhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ClaimPhoneNumberRequest> request = null;
        Response<ClaimPhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ClaimPhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(claimPhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ClaimPhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ClaimPhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ClaimPhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to confirm that the attached file has been uploaded using the pre-signed URL provided in the
     * StartAttachedFileUpload API.
     * </p>
     * 
     * @param completeAttachedFileUploadRequest
     *        Request to CompleteAttachedFileUpload API
     * @return Result of the CompleteAttachedFileUpload operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.CompleteAttachedFileUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CompleteAttachedFileUpload"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CompleteAttachedFileUploadResult completeAttachedFileUpload(CompleteAttachedFileUploadRequest request) {
        request = beforeClientExecution(request);
        return executeCompleteAttachedFileUpload(request);
    }

    @SdkInternalApi
    final CompleteAttachedFileUploadResult executeCompleteAttachedFileUpload(CompleteAttachedFileUploadRequest completeAttachedFileUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(completeAttachedFileUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompleteAttachedFileUploadRequest> request = null;
        Response<CompleteAttachedFileUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompleteAttachedFileUploadRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(completeAttachedFileUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CompleteAttachedFileUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CompleteAttachedFileUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CompleteAttachedFileUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates an agent status for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createAgentStatusRequest
     * @return Result of the CreateAgentStatus operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateAgentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateAgentStatus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAgentStatusResult createAgentStatus(CreateAgentStatusRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAgentStatus(request);
    }

    @SdkInternalApi
    final CreateAgentStatusResult executeCreateAgentStatus(CreateAgentStatusRequest createAgentStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(createAgentStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAgentStatusRequest> request = null;
        Response<CreateAgentStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAgentStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAgentStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAgentStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAgentStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAgentStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a flow for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * 
     * @param createContactFlowRequest
     * @return Result of the CreateContactFlow operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidContactFlowException
     *         The flow is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateContactFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateContactFlowResult createContactFlow(CreateContactFlowRequest request) {
        request = beforeClientExecution(request);
        return executeCreateContactFlow(request);
    }

    @SdkInternalApi
    final CreateContactFlowResult executeCreateContactFlow(CreateContactFlowRequest createContactFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(createContactFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContactFlowRequest> request = null;
        Response<CreateContactFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContactFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createContactFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateContactFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateContactFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateContactFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a flow module for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createContactFlowModuleRequest
     * @return Result of the CreateContactFlowModule operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidContactFlowModuleException
     *         The problems with the module. Please fix before trying again.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateContactFlowModule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateContactFlowModule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateContactFlowModuleResult createContactFlowModule(CreateContactFlowModuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateContactFlowModule(request);
    }

    @SdkInternalApi
    final CreateContactFlowModuleResult executeCreateContactFlowModule(CreateContactFlowModuleRequest createContactFlowModuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createContactFlowModuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContactFlowModuleRequest> request = null;
        Response<CreateContactFlowModuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContactFlowModuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createContactFlowModuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateContactFlowModule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateContactFlowModuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateContactFlowModuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an evaluation form in the specified Amazon Connect instance. The form can be used to define questions
     * related to agent performance, and create sections to organize such questions. Question and section identifiers
     * cannot be duplicated within the same evaluation form.
     * </p>
     * 
     * @param createEvaluationFormRequest
     * @return Result of the CreateEvaluationForm operation returned by the service.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.CreateEvaluationForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateEvaluationForm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateEvaluationFormResult createEvaluationForm(CreateEvaluationFormRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEvaluationForm(request);
    }

    @SdkInternalApi
    final CreateEvaluationFormResult executeCreateEvaluationForm(CreateEvaluationFormRequest createEvaluationFormRequest) {

        ExecutionContext executionContext = createExecutionContext(createEvaluationFormRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEvaluationFormRequest> request = null;
        Response<CreateEvaluationFormResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEvaluationFormRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEvaluationFormRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEvaluationForm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEvaluationFormResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEvaluationFormResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates hours of operation.
     * </p>
     * 
     * @param createHoursOfOperationRequest
     * @return Result of the CreateHoursOfOperation operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateHoursOfOperation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateHoursOfOperationResult createHoursOfOperation(CreateHoursOfOperationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateHoursOfOperation(request);
    }

    @SdkInternalApi
    final CreateHoursOfOperationResult executeCreateHoursOfOperation(CreateHoursOfOperationRequest createHoursOfOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(createHoursOfOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHoursOfOperationRequest> request = null;
        Response<CreateHoursOfOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHoursOfOperationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createHoursOfOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateHoursOfOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateHoursOfOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateHoursOfOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Initiates an Amazon Connect instance with all the supported channels enabled. It does not attach any storage,
     * such as Amazon Simple Storage Service (Amazon S3) or Amazon Kinesis. It also does not allow for any
     * configurations on features, such as Contact Lens for Amazon Connect.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you can create or delete in 30 days. If you
     * exceed this limit, you will get an error message indicating there has been an excessive number of attempts at
     * creating or deleting instances. You must wait 30 days before you can restart creating and deleting instances in
     * your account.
     * </p>
     * 
     * @param createInstanceRequest
     * @return Result of the CreateInstance operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateInstanceResult createInstance(CreateInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInstance(request);
    }

    @SdkInternalApi
    final CreateInstanceResult executeCreateInstance(CreateInstanceRequest createInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(createInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceRequest> request = null;
        Response<CreateInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Web Services resource association with an Amazon Connect instance.
     * </p>
     * 
     * @param createIntegrationAssociationRequest
     * @return Result of the CreateIntegrationAssociation operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.CreateIntegrationAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateIntegrationAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateIntegrationAssociationResult createIntegrationAssociation(CreateIntegrationAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIntegrationAssociation(request);
    }

    @SdkInternalApi
    final CreateIntegrationAssociationResult executeCreateIntegrationAssociation(CreateIntegrationAssociationRequest createIntegrationAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(createIntegrationAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIntegrationAssociationRequest> request = null;
        Response<CreateIntegrationAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIntegrationAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createIntegrationAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIntegrationAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIntegrationAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateIntegrationAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a new participant into an on-going chat contact. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-customize-flow.html">Customize chat flow
     * experiences by integrating custom participants</a>.
     * </p>
     * 
     * @param createParticipantRequest
     * @return Result of the CreateParticipant operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.CreateParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateParticipant" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateParticipantResult createParticipant(CreateParticipantRequest request) {
        request = beforeClientExecution(request);
        return executeCreateParticipant(request);
    }

    @SdkInternalApi
    final CreateParticipantResult executeCreateParticipant(CreateParticipantRequest createParticipantRequest) {

        ExecutionContext executionContext = createExecutionContext(createParticipantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateParticipantRequest> request = null;
        Response<CreateParticipantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateParticipantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createParticipantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateParticipant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateParticipantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateParticipantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables rehydration of chats for the lifespan of a contact. For more information about chat rehydration, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html">Enable persistent chat</a> in
     * the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createPersistentContactAssociationRequest
     * @return Result of the CreatePersistentContactAssociation operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreatePersistentContactAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreatePersistentContactAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePersistentContactAssociationResult createPersistentContactAssociation(CreatePersistentContactAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePersistentContactAssociation(request);
    }

    @SdkInternalApi
    final CreatePersistentContactAssociationResult executeCreatePersistentContactAssociation(
            CreatePersistentContactAssociationRequest createPersistentContactAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(createPersistentContactAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePersistentContactAssociationRequest> request = null;
        Response<CreatePersistentContactAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePersistentContactAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPersistentContactAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePersistentContactAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePersistentContactAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePersistentContactAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new predefined attribute for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createPredefinedAttributeRequest
     * @return Result of the CreatePredefinedAttribute operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreatePredefinedAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreatePredefinedAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePredefinedAttributeResult createPredefinedAttribute(CreatePredefinedAttributeRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePredefinedAttribute(request);
    }

    @SdkInternalApi
    final CreatePredefinedAttributeResult executeCreatePredefinedAttribute(CreatePredefinedAttributeRequest createPredefinedAttributeRequest) {

        ExecutionContext executionContext = createExecutionContext(createPredefinedAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePredefinedAttributeRequest> request = null;
        Response<CreatePredefinedAttributeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePredefinedAttributeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPredefinedAttributeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePredefinedAttribute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePredefinedAttributeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePredefinedAttributeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a prompt. For more information about prompts, such as supported file types and maximum length, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/prompts.html">Create prompts</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createPromptRequest
     * @return Result of the CreatePrompt operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreatePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreatePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePromptResult createPrompt(CreatePromptRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePrompt(request);
    }

    @SdkInternalApi
    final CreatePromptResult executeCreatePrompt(CreatePromptRequest createPromptRequest) {

        ExecutionContext executionContext = createExecutionContext(createPromptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePromptRequest> request = null;
        Response<CreatePromptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePromptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPromptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePrompt");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePromptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePromptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Creates a new queue for the specified Amazon Connect instance.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * If the phone number is claimed to a traffic distribution group that was created in the same Region as the Amazon
     * Connect instance where you are calling this API, then you can use a full phone number ARN or a UUID for
     * <code>OutboundCallerIdNumberId</code>. However, if the phone number is claimed to a traffic distribution group
     * that is in one Region, and you are calling this API from an instance in another Amazon Web Services Region that
     * is associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is
     * provided in this scenario, you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only use the phone number ARN format that doesn't contain <code>instance</code> in the path, for example,
     * <code>arn:aws:connect:us-east-1:1234567890:phone-number/uuid</code>. This is the same ARN format that is returned
     * when you call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html">ListPhoneNumbersV2</a>
     * API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you plan to use IAM policies to allow/deny access to this API for phone number resources claimed to a traffic
     * distribution group, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_resource-level-policy-examples.html#allow-deny-queue-actions-replica-region"
     * >Allow or Deny queue API actions for phone numbers in a replica Region</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param createQueueRequest
     * @return Result of the CreateQueue operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateQueueResult createQueue(CreateQueueRequest request) {
        request = beforeClientExecution(request);
        return executeCreateQueue(request);
    }

    @SdkInternalApi
    final CreateQueueResult executeCreateQueue(CreateQueueRequest createQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(createQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateQueueRequest> request = null;
        Response<CreateQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a quick connect for the specified Amazon Connect instance.
     * </p>
     * 
     * @param createQuickConnectRequest
     * @return Result of the CreateQuickConnect operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateQuickConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateQuickConnect" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateQuickConnectResult createQuickConnect(CreateQuickConnectRequest request) {
        request = beforeClientExecution(request);
        return executeCreateQuickConnect(request);
    }

    @SdkInternalApi
    final CreateQuickConnectResult executeCreateQuickConnect(CreateQuickConnectRequest createQuickConnectRequest) {

        ExecutionContext executionContext = createExecutionContext(createQuickConnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateQuickConnectRequest> request = null;
        Response<CreateQuickConnectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateQuickConnectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createQuickConnectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateQuickConnect");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateQuickConnectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateQuickConnectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new routing profile.
     * </p>
     * 
     * @param createRoutingProfileRequest
     * @return Result of the CreateRoutingProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateRoutingProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateRoutingProfileResult createRoutingProfile(CreateRoutingProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRoutingProfile(request);
    }

    @SdkInternalApi
    final CreateRoutingProfileResult executeCreateRoutingProfile(CreateRoutingProfileRequest createRoutingProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createRoutingProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRoutingProfileRequest> request = null;
        Response<CreateRoutingProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRoutingProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRoutingProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRoutingProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRoutingProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRoutingProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href="https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html">Rules
     * Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param createRuleRequest
     * @return Result of the CreateRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @sample AmazonConnect.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRuleResult createRule(CreateRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRule(request);
    }

    @SdkInternalApi
    final CreateRuleResult executeCreateRule(CreateRuleRequest createRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleRequest> request = null;
        Response<CreateRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a security profile.
     * </p>
     * 
     * @param createSecurityProfileRequest
     * @return Result of the CreateSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateSecurityProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSecurityProfileResult createSecurityProfile(CreateSecurityProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSecurityProfile(request);
    }

    @SdkInternalApi
    final CreateSecurityProfileResult executeCreateSecurityProfile(CreateSecurityProfileRequest createSecurityProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createSecurityProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSecurityProfileRequest> request = null;
        Response<CreateSecurityProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSecurityProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSecurityProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSecurityProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSecurityProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateSecurityProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new task template in the specified Amazon Connect instance.
     * </p>
     * 
     * @param createTaskTemplateRequest
     * @return Result of the CreateTaskTemplate operation returned by the service.
     * @throws PropertyValidationException
     *         The property is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTaskTemplateResult createTaskTemplate(CreateTaskTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTaskTemplate(request);
    }

    @SdkInternalApi
    final CreateTaskTemplateResult executeCreateTaskTemplate(CreateTaskTemplateRequest createTaskTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createTaskTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTaskTemplateRequest> request = null;
        Response<CreateTaskTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTaskTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTaskTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTaskTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTaskTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTaskTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a traffic distribution group given an Amazon Connect instance that has been replicated.
     * </p>
     * <note>
     * <p>
     * The <code>SignInConfig</code> distribution is available only on a default <code>TrafficDistributionGroup</code>
     * (see the <code>IsDefault</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_TrafficDistributionGroup.html"
     * >TrafficDistributionGroup</a> data type). If you call <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     * <p>
     * For more information about creating traffic distribution groups, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-traffic-distribution-groups.html">Set up
     * traffic distribution groups</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createTrafficDistributionGroupRequest
     * @return Result of the CreateTrafficDistributionGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws ResourceNotReadyException
     *         The resource is not ready.
     * @sample AmazonConnect.CreateTrafficDistributionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateTrafficDistributionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTrafficDistributionGroupResult createTrafficDistributionGroup(CreateTrafficDistributionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTrafficDistributionGroup(request);
    }

    @SdkInternalApi
    final CreateTrafficDistributionGroupResult executeCreateTrafficDistributionGroup(CreateTrafficDistributionGroupRequest createTrafficDistributionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createTrafficDistributionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrafficDistributionGroupRequest> request = null;
        Response<CreateTrafficDistributionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrafficDistributionGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createTrafficDistributionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTrafficDistributionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTrafficDistributionGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateTrafficDistributionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a use case for an integration association.
     * </p>
     * 
     * @param createUseCaseRequest
     * @return Result of the CreateUseCase operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.CreateUseCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUseCase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUseCaseResult createUseCase(CreateUseCaseRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUseCase(request);
    }

    @SdkInternalApi
    final CreateUseCaseResult executeCreateUseCase(CreateUseCaseRequest createUseCaseRequest) {

        ExecutionContext executionContext = createExecutionContext(createUseCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUseCaseRequest> request = null;
        Response<CreateUseCaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUseCaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUseCaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUseCase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUseCaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUseCaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a user account for the specified Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * Certain <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UserIdentityInfo.html">UserIdentityInfo</a>
     * parameters are required in some situations. For example, <code>Email</code> is required if you are using SAML for
     * identity management. <code>FirstName</code> and <code>LastName</code> are required if you are using Amazon
     * Connect or SAML for identity management.
     * </p>
     * </important>
     * <p>
     * For information about how to create users using the Amazon Connect admin website, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/user-management.html">Add Users</a> in the <i>Amazon
     * Connect Administrator Guide</i>.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Creates a new user hierarchy group.
     * </p>
     * 
     * @param createUserHierarchyGroupRequest
     * @return Result of the CreateUserHierarchyGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.CreateUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateUserHierarchyGroupResult createUserHierarchyGroup(CreateUserHierarchyGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUserHierarchyGroup(request);
    }

    @SdkInternalApi
    final CreateUserHierarchyGroupResult executeCreateUserHierarchyGroup(CreateUserHierarchyGroupRequest createUserHierarchyGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserHierarchyGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserHierarchyGroupRequest> request = null;
        Response<CreateUserHierarchyGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserHierarchyGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createUserHierarchyGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUserHierarchyGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserHierarchyGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateUserHierarchyGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new view with the possible status of <code>SAVED</code> or <code>PUBLISHED</code>.
     * </p>
     * <p>
     * The views will have a unique name for each connect instance.
     * </p>
     * <p>
     * It performs basic content validation if the status is <code>SAVED</code> or full content validation if the status
     * is set to <code>PUBLISHED</code>. An error is returned if validation fails. It associates either the
     * <code>$SAVED</code> qualifier or both of the <code>$SAVED</code> and <code>$LATEST</code> qualifiers with the
     * provided view content based on the status. The view is idempotent if ClientToken is provided.
     * </p>
     * 
     * @param createViewRequest
     * @return Result of the CreateView operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.CreateView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateView" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateViewResult createView(CreateViewRequest request) {
        request = beforeClientExecution(request);
        return executeCreateView(request);
    }

    @SdkInternalApi
    final CreateViewResult executeCreateView(CreateViewRequest createViewRequest) {

        ExecutionContext executionContext = createExecutionContext(createViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateViewRequest> request = null;
        Response<CreateViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateViewResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Publishes a new version of the view identifier.
     * </p>
     * <p>
     * Versions are immutable and monotonically increasing.
     * </p>
     * <p>
     * It returns the highest version if there is no change in content compared to that version. An error is displayed
     * if the supplied ViewContentSha256 is different from the ViewContentSha256 of the <code>$LATEST</code> alias.
     * </p>
     * 
     * @param createViewVersionRequest
     * @return Result of the CreateViewVersion operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.CreateViewVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateViewVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateViewVersionResult createViewVersion(CreateViewVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateViewVersion(request);
    }

    @SdkInternalApi
    final CreateViewVersionResult executeCreateViewVersion(CreateViewVersionRequest createViewVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createViewVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateViewVersionRequest> request = null;
        Response<CreateViewVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateViewVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createViewVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateViewVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateViewVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateViewVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a custom vocabulary associated with your Amazon Connect instance. You can set a custom vocabulary to be
     * your default vocabulary for a given language. Contact Lens for Amazon Connect uses the default vocabulary in
     * post-call and real-time contact analysis sessions for that language.
     * </p>
     * 
     * @param createVocabularyRequest
     * @return Result of the CreateVocabulary operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @sample AmazonConnect.CreateVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateVocabularyResult createVocabulary(CreateVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVocabulary(request);
    }

    @SdkInternalApi
    final CreateVocabularyResult executeCreateVocabulary(CreateVocabularyRequest createVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(createVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVocabularyRequest> request = null;
        Response<CreateVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deactivates an evaluation form in the specified Amazon Connect instance. After a form is deactivated, it is no
     * longer available for users to start new evaluations based on the form.
     * </p>
     * 
     * @param deactivateEvaluationFormRequest
     * @return Result of the DeactivateEvaluationForm operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.DeactivateEvaluationForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeactivateEvaluationForm"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeactivateEvaluationFormResult deactivateEvaluationForm(DeactivateEvaluationFormRequest request) {
        request = beforeClientExecution(request);
        return executeDeactivateEvaluationForm(request);
    }

    @SdkInternalApi
    final DeactivateEvaluationFormResult executeDeactivateEvaluationForm(DeactivateEvaluationFormRequest deactivateEvaluationFormRequest) {

        ExecutionContext executionContext = createExecutionContext(deactivateEvaluationFormRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeactivateEvaluationFormRequest> request = null;
        Response<DeactivateEvaluationFormResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeactivateEvaluationFormRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deactivateEvaluationFormRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeactivateEvaluationForm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeactivateEvaluationFormResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeactivateEvaluationFormResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an attached file along with the underlying S3 Object.
     * </p>
     * <important>
     * <p>
     * The attached file is <b>permanently deleted</b> if S3 bucket versioning is not enabled.
     * </p>
     * </important>
     * 
     * @param deleteAttachedFileRequest
     *        Request to DeleteAttachedFile API
     * @return Result of the DeleteAttachedFile operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DeleteAttachedFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteAttachedFile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAttachedFileResult deleteAttachedFile(DeleteAttachedFileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAttachedFile(request);
    }

    @SdkInternalApi
    final DeleteAttachedFileResult executeDeleteAttachedFile(DeleteAttachedFileRequest deleteAttachedFileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAttachedFileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAttachedFileRequest> request = null;
        Response<DeleteAttachedFileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAttachedFileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAttachedFileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAttachedFile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAttachedFileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAttachedFileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a contact evaluation in the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactEvaluationRequest
     * @return Result of the DeleteContactEvaluation operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.DeleteContactEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteContactEvaluation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteContactEvaluationResult deleteContactEvaluation(DeleteContactEvaluationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteContactEvaluation(request);
    }

    @SdkInternalApi
    final DeleteContactEvaluationResult executeDeleteContactEvaluation(DeleteContactEvaluationRequest deleteContactEvaluationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteContactEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContactEvaluationRequest> request = null;
        Response<DeleteContactEvaluationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContactEvaluationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteContactEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteContactEvaluation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteContactEvaluationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteContactEvaluationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a flow for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteContactFlowRequest
     * @return Result of the DeleteContactFlow operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DeleteContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteContactFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteContactFlowResult deleteContactFlow(DeleteContactFlowRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteContactFlow(request);
    }

    @SdkInternalApi
    final DeleteContactFlowResult executeDeleteContactFlow(DeleteContactFlowRequest deleteContactFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteContactFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContactFlowRequest> request = null;
        Response<DeleteContactFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContactFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteContactFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteContactFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteContactFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteContactFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified flow module.
     * </p>
     * 
     * @param deleteContactFlowModuleRequest
     * @return Result of the DeleteContactFlowModule operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteContactFlowModule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteContactFlowModule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteContactFlowModuleResult deleteContactFlowModule(DeleteContactFlowModuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteContactFlowModule(request);
    }

    @SdkInternalApi
    final DeleteContactFlowModuleResult executeDeleteContactFlowModule(DeleteContactFlowModuleRequest deleteContactFlowModuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteContactFlowModuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContactFlowModuleRequest> request = null;
        Response<DeleteContactFlowModuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContactFlowModuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteContactFlowModuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteContactFlowModule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteContactFlowModuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteContactFlowModuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an evaluation form in the specified Amazon Connect instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the version property is provided, only the specified version of the evaluation form is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If no version is provided, then the full form (all versions) is deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteEvaluationFormRequest
     * @return Result of the DeleteEvaluationForm operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.DeleteEvaluationForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteEvaluationForm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteEvaluationFormResult deleteEvaluationForm(DeleteEvaluationFormRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEvaluationForm(request);
    }

    @SdkInternalApi
    final DeleteEvaluationFormResult executeDeleteEvaluationForm(DeleteEvaluationFormRequest deleteEvaluationFormRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEvaluationFormRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEvaluationFormRequest> request = null;
        Response<DeleteEvaluationFormResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEvaluationFormRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEvaluationFormRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEvaluationForm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEvaluationFormResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEvaluationFormResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes an hours of operation.
     * </p>
     * 
     * @param deleteHoursOfOperationRequest
     * @return Result of the DeleteHoursOfOperation operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteHoursOfOperation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteHoursOfOperationResult deleteHoursOfOperation(DeleteHoursOfOperationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteHoursOfOperation(request);
    }

    @SdkInternalApi
    final DeleteHoursOfOperationResult executeDeleteHoursOfOperation(DeleteHoursOfOperationRequest deleteHoursOfOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteHoursOfOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHoursOfOperationRequest> request = null;
        Response<DeleteHoursOfOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHoursOfOperationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteHoursOfOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteHoursOfOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteHoursOfOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteHoursOfOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes the Amazon Connect instance.
     * </p>
     * <p>
     * Amazon Connect enforces a limit on the total number of instances that you can create or delete in 30 days. If you
     * exceed this limit, you will get an error message indicating there has been an excessive number of attempts at
     * creating or deleting instances. You must wait 30 days before you can restart creating and deleting instances in
     * your account.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return Result of the DeleteInstance operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @sample AmazonConnect.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteInstanceResult deleteInstance(DeleteInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInstance(request);
    }

    @SdkInternalApi
    final DeleteInstanceResult executeDeleteInstance(DeleteInstanceRequest deleteInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceRequest> request = null;
        Response<DeleteInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Web Services resource association from an Amazon Connect instance. The association must not
     * have any use cases associated with it.
     * </p>
     * 
     * @param deleteIntegrationAssociationRequest
     * @return Result of the DeleteIntegrationAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DeleteIntegrationAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteIntegrationAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteIntegrationAssociationResult deleteIntegrationAssociation(DeleteIntegrationAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIntegrationAssociation(request);
    }

    @SdkInternalApi
    final DeleteIntegrationAssociationResult executeDeleteIntegrationAssociation(DeleteIntegrationAssociationRequest deleteIntegrationAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIntegrationAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIntegrationAssociationRequest> request = null;
        Response<DeleteIntegrationAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIntegrationAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteIntegrationAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIntegrationAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIntegrationAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteIntegrationAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a predefined attribute from the specified Amazon Connect instance.
     * </p>
     * 
     * @param deletePredefinedAttributeRequest
     * @return Result of the DeletePredefinedAttribute operation returned by the service.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeletePredefinedAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeletePredefinedAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePredefinedAttributeResult deletePredefinedAttribute(DeletePredefinedAttributeRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePredefinedAttribute(request);
    }

    @SdkInternalApi
    final DeletePredefinedAttributeResult executeDeletePredefinedAttribute(DeletePredefinedAttributeRequest deletePredefinedAttributeRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePredefinedAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePredefinedAttributeRequest> request = null;
        Response<DeletePredefinedAttributeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePredefinedAttributeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deletePredefinedAttributeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePredefinedAttribute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePredefinedAttributeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeletePredefinedAttributeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a prompt.
     * </p>
     * 
     * @param deletePromptRequest
     * @return Result of the DeletePrompt operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeletePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeletePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePromptResult deletePrompt(DeletePromptRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePrompt(request);
    }

    @SdkInternalApi
    final DeletePromptResult executeDeletePrompt(DeletePromptRequest deletePromptRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePromptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePromptRequest> request = null;
        Response<DeletePromptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePromptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePromptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePrompt");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePromptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePromptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a queue.
     * </p>
     * 
     * @param deleteQueueRequest
     * @return Result of the DeleteQueue operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteQueueResult deleteQueue(DeleteQueueRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteQueue(request);
    }

    @SdkInternalApi
    final DeleteQueueResult executeDeleteQueue(DeleteQueueRequest deleteQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQueueRequest> request = null;
        Response<DeleteQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a quick connect.
     * </p>
     * <important>
     * <p>
     * After calling <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteUser.html">DeleteUser</a>, it's important
     * to call <code>DeleteQuickConnect</code> to delete any records related to the deleted users. This will help you:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Avoid dangling resources that impact your service quotas.
     * </p>
     * </li>
     * <li>
     * <p>
     * Remove deleted users so they don't appear to agents as transfer options.
     * </p>
     * </li>
     * <li>
     * <p>
     * Avoid the disruption of other Amazon Connect processes, such as instance replication and syncing if you're using
     * <a href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-connect-global-resiliency.html">Amazon
     * Connect Global Resiliency</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param deleteQuickConnectRequest
     * @return Result of the DeleteQuickConnect operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteQuickConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteQuickConnect" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteQuickConnectResult deleteQuickConnect(DeleteQuickConnectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteQuickConnect(request);
    }

    @SdkInternalApi
    final DeleteQuickConnectResult executeDeleteQuickConnect(DeleteQuickConnectRequest deleteQuickConnectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteQuickConnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQuickConnectRequest> request = null;
        Response<DeleteQuickConnectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteQuickConnectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteQuickConnectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteQuickConnect");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteQuickConnectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteQuickConnectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a routing profile.
     * </p>
     * 
     * @param deleteRoutingProfileRequest
     * @return Result of the DeleteRoutingProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteRoutingProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteRoutingProfileResult deleteRoutingProfile(DeleteRoutingProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRoutingProfile(request);
    }

    @SdkInternalApi
    final DeleteRoutingProfileResult executeDeleteRoutingProfile(DeleteRoutingProfileRequest deleteRoutingProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRoutingProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRoutingProfileRequest> request = null;
        Response<DeleteRoutingProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoutingProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRoutingProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRoutingProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRoutingProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRoutingProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return Result of the DeleteRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRuleResult deleteRule(DeleteRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRule(request);
    }

    @SdkInternalApi
    final DeleteRuleResult executeDeleteRule(DeleteRuleRequest deleteRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleRequest> request = null;
        Response<DeleteRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a security profile.
     * </p>
     * 
     * @param deleteSecurityProfileRequest
     * @return Result of the DeleteSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.DeleteSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteSecurityProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteSecurityProfileResult deleteSecurityProfile(DeleteSecurityProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSecurityProfile(request);
    }

    @SdkInternalApi
    final DeleteSecurityProfileResult executeDeleteSecurityProfile(DeleteSecurityProfileRequest deleteSecurityProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSecurityProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSecurityProfileRequest> request = null;
        Response<DeleteSecurityProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSecurityProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSecurityProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSecurityProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSecurityProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteSecurityProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the task template.
     * </p>
     * 
     * @param deleteTaskTemplateRequest
     * @return Result of the DeleteTaskTemplate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTaskTemplateResult deleteTaskTemplate(DeleteTaskTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTaskTemplate(request);
    }

    @SdkInternalApi
    final DeleteTaskTemplateResult executeDeleteTaskTemplate(DeleteTaskTemplateRequest deleteTaskTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTaskTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTaskTemplateRequest> request = null;
        Response<DeleteTaskTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTaskTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTaskTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTaskTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTaskTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTaskTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a traffic distribution group. This API can be called only in the Region where the traffic distribution
     * group is created.
     * </p>
     * <p>
     * For more information about deleting traffic distribution groups, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/delete-traffic-distribution-groups.html">Delete
     * traffic distribution groups</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param deleteTrafficDistributionGroupRequest
     * @return Result of the DeleteTrafficDistributionGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteTrafficDistributionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteTrafficDistributionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTrafficDistributionGroupResult deleteTrafficDistributionGroup(DeleteTrafficDistributionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTrafficDistributionGroup(request);
    }

    @SdkInternalApi
    final DeleteTrafficDistributionGroupResult executeDeleteTrafficDistributionGroup(DeleteTrafficDistributionGroupRequest deleteTrafficDistributionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTrafficDistributionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrafficDistributionGroupRequest> request = null;
        Response<DeleteTrafficDistributionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrafficDistributionGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteTrafficDistributionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTrafficDistributionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTrafficDistributionGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteTrafficDistributionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a use case from an integration association.
     * </p>
     * 
     * @param deleteUseCaseRequest
     * @return Result of the DeleteUseCase operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DeleteUseCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUseCase" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUseCaseResult deleteUseCase(DeleteUseCaseRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUseCase(request);
    }

    @SdkInternalApi
    final DeleteUseCaseResult executeDeleteUseCase(DeleteUseCaseRequest deleteUseCaseRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUseCaseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUseCaseRequest> request = null;
        Response<DeleteUseCaseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUseCaseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUseCaseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUseCase");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUseCaseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUseCaseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a user account from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For information about what happens to a user's data when their account is deleted, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/delete-users.html">Delete Users from Your Amazon
     * Connect Instance</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * After calling DeleteUser, call <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteQuickConnect.html">DeleteQuickConnect</a>
     * to delete any records related to the deleted users. This will help you:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Avoid dangling resources that impact your service quotas.
     * </p>
     * </li>
     * <li>
     * <p>
     * Remove deleted users so they don't appear to agents as transfer options.
     * </p>
     * </li>
     * <li>
     * <p>
     * Avoid the disruption of other Amazon Connect processes, such as instance replication and syncing if you're using
     * <a href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-connect-global-resiliency.html">Amazon
     * Connect Global Resiliency</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Deletes an existing user hierarchy group. It must not be associated with any agents or have any active child
     * groups.
     * </p>
     * 
     * @param deleteUserHierarchyGroupRequest
     * @return Result of the DeleteUserHierarchyGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DeleteUserHierarchyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteUserHierarchyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteUserHierarchyGroupResult deleteUserHierarchyGroup(DeleteUserHierarchyGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUserHierarchyGroup(request);
    }

    @SdkInternalApi
    final DeleteUserHierarchyGroupResult executeDeleteUserHierarchyGroup(DeleteUserHierarchyGroupRequest deleteUserHierarchyGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserHierarchyGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserHierarchyGroupRequest> request = null;
        Response<DeleteUserHierarchyGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserHierarchyGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteUserHierarchyGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUserHierarchyGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserHierarchyGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteUserHierarchyGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the view entirely. It deletes the view and all associated qualifiers (versions and aliases).
     * </p>
     * 
     * @param deleteViewRequest
     * @return Result of the DeleteView operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.DeleteView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteView" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteViewResult deleteView(DeleteViewRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteView(request);
    }

    @SdkInternalApi
    final DeleteViewResult executeDeleteView(DeleteViewRequest deleteViewRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteViewRequest> request = null;
        Response<DeleteViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteViewResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the particular version specified in <code>ViewVersion</code> identifier.
     * </p>
     * 
     * @param deleteViewVersionRequest
     * @return Result of the DeleteViewVersion operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.DeleteViewVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteViewVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteViewVersionResult deleteViewVersion(DeleteViewVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteViewVersion(request);
    }

    @SdkInternalApi
    final DeleteViewVersionResult executeDeleteViewVersion(DeleteViewVersionRequest deleteViewVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteViewVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteViewVersionRequest> request = null;
        Response<DeleteViewVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteViewVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteViewVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteViewVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteViewVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteViewVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the vocabulary that has the given identifier.
     * </p>
     * 
     * @param deleteVocabularyRequest
     * @return Result of the DeleteVocabulary operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.DeleteVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteVocabularyResult deleteVocabulary(DeleteVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVocabulary(request);
    }

    @SdkInternalApi
    final DeleteVocabularyResult executeDeleteVocabulary(DeleteVocabularyRequest deleteVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVocabularyRequest> request = null;
        Response<DeleteVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes an agent status.
     * </p>
     * 
     * @param describeAgentStatusRequest
     * @return Result of the DescribeAgentStatus operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeAgentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeAgentStatus" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAgentStatusResult describeAgentStatus(DescribeAgentStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAgentStatus(request);
    }

    @SdkInternalApi
    final DescribeAgentStatusResult executeDescribeAgentStatus(DescribeAgentStatusRequest describeAgentStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAgentStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAgentStatusRequest> request = null;
        Response<DescribeAgentStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAgentStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAgentStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAgentStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAgentStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAgentStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the specified contact.
     * </p>
     * <important>
     * <p>
     * Contact information remains available in Amazon Connect for 24 months, and then it is deleted.
     * </p>
     * <p>
     * Only data from November 12, 2021, and later is returned by this API.
     * </p>
     * </important>
     * 
     * @param describeContactRequest
     * @return Result of the DescribeContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DescribeContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeContactResult describeContact(DescribeContactRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeContact(request);
    }

    @SdkInternalApi
    final DescribeContactResult executeDescribeContact(DescribeContactRequest describeContactRequest) {

        ExecutionContext executionContext = createExecutionContext(describeContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeContactRequest> request = null;
        Response<DescribeContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a contact evaluation in the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeContactEvaluationRequest
     * @return Result of the DescribeContactEvaluation operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeContactEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContactEvaluation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeContactEvaluationResult describeContactEvaluation(DescribeContactEvaluationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeContactEvaluation(request);
    }

    @SdkInternalApi
    final DescribeContactEvaluationResult executeDescribeContactEvaluation(DescribeContactEvaluationRequest describeContactEvaluationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeContactEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeContactEvaluationRequest> request = null;
        Response<DescribeContactEvaluationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeContactEvaluationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeContactEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeContactEvaluation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeContactEvaluationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeContactEvaluationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * <p>
     * Use the <code>$SAVED</code> alias in the request to describe the <code>SAVED</code> content of a Flow. For
     * example, <code>arn:aws:.../contact-flow/{id}:$SAVED</code>. Once a contact flow is published, <code>$SAVED</code>
     * needs to be supplied to view saved content that has not been published.
     * </p>
     * <p>
     * In the response, <b>Status</b> indicates the flow status as either <code>SAVED</code> or <code>PUBLISHED</code>.
     * The <code>PUBLISHED</code> status will initiate validation on the content. <code>SAVED</code> does not initiate
     * validation of the content. <code>SAVED</code> | <code>PUBLISHED</code>
     * </p>
     * 
     * @param describeContactFlowRequest
     * @return Result of the DescribeContactFlow operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ContactFlowNotPublishedException
     *         The flow has not been published.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContactFlow" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeContactFlowResult describeContactFlow(DescribeContactFlowRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeContactFlow(request);
    }

    @SdkInternalApi
    final DescribeContactFlowResult executeDescribeContactFlow(DescribeContactFlowRequest describeContactFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(describeContactFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeContactFlowRequest> request = null;
        Response<DescribeContactFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeContactFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeContactFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeContactFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeContactFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeContactFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified flow module.
     * </p>
     * <p>
     * Use the <code>$SAVED</code> alias in the request to describe the <code>SAVED</code> content of a Flow. For
     * example, <code>arn:aws:.../contact-flow/{id}:$SAVED</code>. Once a contact flow is published, <code>$SAVED</code>
     * needs to be supplied to view saved content that has not been published.
     * </p>
     * 
     * @param describeContactFlowModuleRequest
     * @return Result of the DescribeContactFlowModule operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeContactFlowModule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeContactFlowModule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeContactFlowModuleResult describeContactFlowModule(DescribeContactFlowModuleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeContactFlowModule(request);
    }

    @SdkInternalApi
    final DescribeContactFlowModuleResult executeDescribeContactFlowModule(DescribeContactFlowModuleRequest describeContactFlowModuleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeContactFlowModuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeContactFlowModuleRequest> request = null;
        Response<DescribeContactFlowModuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeContactFlowModuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeContactFlowModuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeContactFlowModule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeContactFlowModuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeContactFlowModuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an evaluation form in the specified Amazon Connect instance. If the version property is not provided,
     * the latest version of the evaluation form is described.
     * </p>
     * 
     * @param describeEvaluationFormRequest
     * @return Result of the DescribeEvaluationForm operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeEvaluationForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeEvaluationForm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeEvaluationFormResult describeEvaluationForm(DescribeEvaluationFormRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEvaluationForm(request);
    }

    @SdkInternalApi
    final DescribeEvaluationFormResult executeDescribeEvaluationForm(DescribeEvaluationFormRequest describeEvaluationFormRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEvaluationFormRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEvaluationFormRequest> request = null;
        Response<DescribeEvaluationFormResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEvaluationFormRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEvaluationFormRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEvaluationForm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEvaluationFormResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEvaluationFormResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the hours of operation.
     * </p>
     * 
     * @param describeHoursOfOperationRequest
     * @return Result of the DescribeHoursOfOperation operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeHoursOfOperation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeHoursOfOperationResult describeHoursOfOperation(DescribeHoursOfOperationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeHoursOfOperation(request);
    }

    @SdkInternalApi
    final DescribeHoursOfOperationResult executeDescribeHoursOfOperation(DescribeHoursOfOperationRequest describeHoursOfOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeHoursOfOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHoursOfOperationRequest> request = null;
        Response<DescribeHoursOfOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHoursOfOperationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeHoursOfOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeHoursOfOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeHoursOfOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeHoursOfOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns the current state of the specified instance identifier. It tracks the instance while it is being created
     * and returns an error status, if applicable.
     * </p>
     * <p>
     * If an instance is not created successfully, the instance status reason field returns details relevant to the
     * reason. The instance in a failed state is returned only for 24 hours after the CreateInstance API was invoked.
     * </p>
     * 
     * @param describeInstanceRequest
     * @return Result of the DescribeInstance operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeInstanceResult describeInstance(DescribeInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstance(request);
    }

    @SdkInternalApi
    final DescribeInstanceResult executeDescribeInstance(DescribeInstanceRequest describeInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceRequest> request = null;
        Response<DescribeInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the specified instance attribute.
     * </p>
     * 
     * @param describeInstanceAttributeRequest
     * @return Result of the DescribeInstanceAttribute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DescribeInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstanceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInstanceAttributeResult describeInstanceAttribute(DescribeInstanceAttributeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstanceAttribute(request);
    }

    @SdkInternalApi
    final DescribeInstanceAttributeResult executeDescribeInstanceAttribute(DescribeInstanceAttributeRequest describeInstanceAttributeRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstanceAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceAttributeRequest> request = null;
        Response<DescribeInstanceAttributeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceAttributeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInstanceAttributeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstanceAttribute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstanceAttributeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInstanceAttributeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Retrieves the current storage configurations for the specified resource type, association ID, and instance ID.
     * </p>
     * 
     * @param describeInstanceStorageConfigRequest
     * @return Result of the DescribeInstanceStorageConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DescribeInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInstanceStorageConfigResult describeInstanceStorageConfig(DescribeInstanceStorageConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstanceStorageConfig(request);
    }

    @SdkInternalApi
    final DescribeInstanceStorageConfigResult executeDescribeInstanceStorageConfig(DescribeInstanceStorageConfigRequest describeInstanceStorageConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstanceStorageConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceStorageConfigRequest> request = null;
        Response<DescribeInstanceStorageConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceStorageConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInstanceStorageConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstanceStorageConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstanceStorageConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInstanceStorageConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details and status of a phone number that’s claimed to your Amazon Connect instance or traffic distribution
     * group.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are calling in the Amazon Web Services Region
     * where the traffic distribution group was created, you can use either a phone number ARN or UUID value for the
     * <code>PhoneNumberId</code> URI request parameter. However, if the number is claimed to a traffic distribution
     * group and you are calling this API in the alternate Amazon Web Services Region associated with the traffic
     * distribution group, you must provide a full phone number ARN. If a UUID is provided in this scenario, you will
     * receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param describePhoneNumberRequest
     * @return Result of the DescribePhoneNumber operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.DescribePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribePhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribePhoneNumberResult describePhoneNumber(DescribePhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePhoneNumber(request);
    }

    @SdkInternalApi
    final DescribePhoneNumberResult executeDescribePhoneNumber(DescribePhoneNumberRequest describePhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(describePhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePhoneNumberRequest> request = null;
        Response<DescribePhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a predefined attribute for the specified Amazon Connect instance.
     * </p>
     * 
     * @param describePredefinedAttributeRequest
     * @return Result of the DescribePredefinedAttribute operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribePredefinedAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribePredefinedAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePredefinedAttributeResult describePredefinedAttribute(DescribePredefinedAttributeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePredefinedAttribute(request);
    }

    @SdkInternalApi
    final DescribePredefinedAttributeResult executeDescribePredefinedAttribute(DescribePredefinedAttributeRequest describePredefinedAttributeRequest) {

        ExecutionContext executionContext = createExecutionContext(describePredefinedAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePredefinedAttributeRequest> request = null;
        Response<DescribePredefinedAttributeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePredefinedAttributeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describePredefinedAttributeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePredefinedAttribute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePredefinedAttributeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePredefinedAttributeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the prompt.
     * </p>
     * 
     * @param describePromptRequest
     * @return Result of the DescribePrompt operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribePromptResult describePrompt(DescribePromptRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePrompt(request);
    }

    @SdkInternalApi
    final DescribePromptResult executeDescribePrompt(DescribePromptRequest describePromptRequest) {

        ExecutionContext executionContext = createExecutionContext(describePromptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePromptRequest> request = null;
        Response<DescribePromptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePromptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePromptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePrompt");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePromptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePromptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Describes the specified queue.
     * </p>
     * 
     * @param describeQueueRequest
     * @return Result of the DescribeQueue operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeQueueResult describeQueue(DescribeQueueRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeQueue(request);
    }

    @SdkInternalApi
    final DescribeQueueResult executeDescribeQueue(DescribeQueueRequest describeQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(describeQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeQueueRequest> request = null;
        Response<DescribeQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the quick connect.
     * </p>
     * 
     * @param describeQuickConnectRequest
     * @return Result of the DescribeQuickConnect operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeQuickConnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeQuickConnect" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeQuickConnectResult describeQuickConnect(DescribeQuickConnectRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeQuickConnect(request);
    }

    @SdkInternalApi
    final DescribeQuickConnectResult executeDescribeQuickConnect(DescribeQuickConnectRequest describeQuickConnectRequest) {

        ExecutionContext executionContext = createExecutionContext(describeQuickConnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeQuickConnectRequest> request = null;
        Response<DescribeQuickConnectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeQuickConnectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeQuickConnectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeQuickConnect");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeQuickConnectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeQuickConnectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified routing profile.
     * </p>
     * 
     * @param describeRoutingProfileRequest
     * @return Result of the DescribeRoutingProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeRoutingProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeRoutingProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeRoutingProfileResult describeRoutingProfile(DescribeRoutingProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRoutingProfile(request);
    }

    @SdkInternalApi
    final DescribeRoutingProfileResult executeDescribeRoutingProfile(DescribeRoutingProfileRequest describeRoutingProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRoutingProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRoutingProfileRequest> request = null;
        Response<DescribeRoutingProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRoutingProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRoutingProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRoutingProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRoutingProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRoutingProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a rule for the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeRuleRequest
     * @return Result of the DescribeRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.DescribeRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeRuleResult describeRule(DescribeRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRule(request);
    }

    @SdkInternalApi
    final DescribeRuleResult executeDescribeRule(DescribeRuleRequest describeRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRuleRequest> request = null;
        Response<DescribeRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets basic information about the security profle.
     * </p>
     * 
     * @param describeSecurityProfileRequest
     * @return Result of the DescribeSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DescribeSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeSecurityProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSecurityProfileResult describeSecurityProfile(DescribeSecurityProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSecurityProfile(request);
    }

    @SdkInternalApi
    final DescribeSecurityProfileResult executeDescribeSecurityProfile(DescribeSecurityProfileRequest describeSecurityProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSecurityProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSecurityProfileRequest> request = null;
        Response<DescribeSecurityProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSecurityProfileRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSecurityProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSecurityProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSecurityProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSecurityProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details and status of a traffic distribution group.
     * </p>
     * 
     * @param describeTrafficDistributionGroupRequest
     * @return Result of the DescribeTrafficDistributionGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DescribeTrafficDistributionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeTrafficDistributionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTrafficDistributionGroupResult describeTrafficDistributionGroup(DescribeTrafficDistributionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTrafficDistributionGroup(request);
    }

    @SdkInternalApi
    final DescribeTrafficDistributionGroupResult executeDescribeTrafficDistributionGroup(
            DescribeTrafficDistributionGroupRequest describeTrafficDistributionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTrafficDistributionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrafficDistributionGroupRequest> request = null;
        Response<DescribeTrafficDistributionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrafficDistributionGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeTrafficDistributionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTrafficDistributionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTrafficDistributionGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeTrafficDistributionGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified user. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID in the
     * Amazon Connect console</a> (it’s the final part of the ARN). The console does not display the user IDs. Instead,
     * list the users and note the IDs provided in the output.
     * </p>
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Describes the specified hierarchy group.
     * </p>
     * 
     * @param describeUserHierarchyGroupRequest
     * @return Result of the DescribeUserHierarchyGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Describes the hierarchy structure of the specified Amazon Connect instance.
     * </p>
     * 
     * @param describeUserHierarchyStructureRequest
     * @return Result of the DescribeUserHierarchyStructure operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Retrieves the view for the specified Amazon Connect instance and view identifier.
     * </p>
     * <p>
     * The view identifier can be supplied as a ViewId or ARN.
     * </p>
     * <p>
     * <code>$SAVED</code> needs to be supplied if a view is unpublished.
     * </p>
     * <p>
     * The view identifier can contain an optional qualifier, for example, <code>&lt;view-id&gt;:$SAVED</code>, which is
     * either an actual version number or an Amazon Connect managed qualifier <code>$SAVED | $LATEST</code>. If it is
     * not supplied, then <code>$LATEST</code> is assumed for customer managed views and an error is returned if there
     * is no published content available. Version 1 is assumed for Amazon Web Services managed views.
     * </p>
     * 
     * @param describeViewRequest
     * @return Result of the DescribeView operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @sample AmazonConnect.DescribeView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeView" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeViewResult describeView(DescribeViewRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeView(request);
    }

    @SdkInternalApi
    final DescribeViewResult executeDescribeView(DescribeViewRequest describeViewRequest) {

        ExecutionContext executionContext = createExecutionContext(describeViewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeViewRequest> request = null;
        Response<DescribeViewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeViewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeViewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeView");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeViewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeViewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified vocabulary.
     * </p>
     * 
     * @param describeVocabularyRequest
     * @return Result of the DescribeVocabulary operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.DescribeVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeVocabulary" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeVocabularyResult describeVocabulary(DescribeVocabularyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVocabulary(request);
    }

    @SdkInternalApi
    final DescribeVocabularyResult executeDescribeVocabulary(DescribeVocabularyRequest describeVocabularyRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVocabularyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVocabularyRequest> request = null;
        Response<DescribeVocabularyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVocabularyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVocabularyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVocabulary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVocabularyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeVocabularyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Removes the dataset ID associated with a given Amazon Connect instance.
     * </p>
     * 
     * @param disassociateAnalyticsDataSetRequest
     * @return Result of the DisassociateAnalyticsDataSet operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DisassociateAnalyticsDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateAnalyticsDataSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateAnalyticsDataSetResult disassociateAnalyticsDataSet(DisassociateAnalyticsDataSetRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateAnalyticsDataSet(request);
    }

    @SdkInternalApi
    final DisassociateAnalyticsDataSetResult executeDisassociateAnalyticsDataSet(DisassociateAnalyticsDataSetRequest disassociateAnalyticsDataSetRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateAnalyticsDataSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateAnalyticsDataSetRequest> request = null;
        Response<DisassociateAnalyticsDataSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateAnalyticsDataSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateAnalyticsDataSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateAnalyticsDataSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateAnalyticsDataSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateAnalyticsDataSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Revokes access to integrated applications from Amazon Connect.
     * </p>
     * 
     * @param disassociateApprovedOriginRequest
     * @return Result of the DisassociateApprovedOrigin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateApprovedOrigin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateApprovedOrigin"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateApprovedOriginResult disassociateApprovedOrigin(DisassociateApprovedOriginRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateApprovedOrigin(request);
    }

    @SdkInternalApi
    final DisassociateApprovedOriginResult executeDisassociateApprovedOrigin(DisassociateApprovedOriginRequest disassociateApprovedOriginRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateApprovedOriginRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateApprovedOriginRequest> request = null;
        Response<DisassociateApprovedOriginResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateApprovedOriginRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateApprovedOriginRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateApprovedOrigin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateApprovedOriginResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateApprovedOriginResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified Amazon Lex or Amazon Lex V2 bot.
     * </p>
     * 
     * @param disassociateBotRequest
     * @return Result of the DisassociateBot operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateBot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisassociateBotResult disassociateBot(DisassociateBotRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateBot(request);
    }

    @SdkInternalApi
    final DisassociateBotResult executeDisassociateBot(DisassociateBotRequest disassociateBotRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateBotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateBotRequest> request = null;
        Response<DisassociateBotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateBotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateBotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateBot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateBotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateBotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a connect resource from a flow.
     * </p>
     * 
     * @param disassociateFlowRequest
     * @return Result of the DisassociateFlow operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisassociateFlowResult disassociateFlow(DisassociateFlowRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateFlow(request);
    }

    @SdkInternalApi
    final DisassociateFlowResult executeDisassociateFlow(DisassociateFlowRequest disassociateFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateFlowRequest> request = null;
        Response<DisassociateFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Removes the storage type configurations for the specified resource type and association ID.
     * </p>
     * 
     * @param disassociateInstanceStorageConfigRequest
     * @return Result of the DisassociateInstanceStorageConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateInstanceStorageConfigResult disassociateInstanceStorageConfig(DisassociateInstanceStorageConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateInstanceStorageConfig(request);
    }

    @SdkInternalApi
    final DisassociateInstanceStorageConfigResult executeDisassociateInstanceStorageConfig(
            DisassociateInstanceStorageConfigRequest disassociateInstanceStorageConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateInstanceStorageConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateInstanceStorageConfigRequest> request = null;
        Response<DisassociateInstanceStorageConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateInstanceStorageConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateInstanceStorageConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateInstanceStorageConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateInstanceStorageConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateInstanceStorageConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Remove the Lambda function from the dropdown options available in the relevant flow blocks.
     * </p>
     * 
     * @param disassociateLambdaFunctionRequest
     * @return Result of the DisassociateLambdaFunction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateLambdaFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateLambdaFunction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateLambdaFunctionResult disassociateLambdaFunction(DisassociateLambdaFunctionRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateLambdaFunction(request);
    }

    @SdkInternalApi
    final DisassociateLambdaFunctionResult executeDisassociateLambdaFunction(DisassociateLambdaFunctionRequest disassociateLambdaFunctionRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateLambdaFunctionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateLambdaFunctionRequest> request = null;
        Response<DisassociateLambdaFunctionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateLambdaFunctionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateLambdaFunctionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateLambdaFunction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateLambdaFunctionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateLambdaFunctionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Revokes authorization from the specified instance to access the specified Amazon Lex bot.
     * </p>
     * 
     * @param disassociateLexBotRequest
     * @return Result of the DisassociateLexBot operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateLexBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateLexBot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisassociateLexBotResult disassociateLexBot(DisassociateLexBotRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateLexBot(request);
    }

    @SdkInternalApi
    final DisassociateLexBotResult executeDisassociateLexBot(DisassociateLexBotRequest disassociateLexBotRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateLexBotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateLexBotRequest> request = null;
        Response<DisassociateLexBotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateLexBotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateLexBotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateLexBot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateLexBotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateLexBotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the flow association from a phone number claimed to your Amazon Connect instance.
     * </p>
     * <important>
     * <p>
     * If the number is claimed to a traffic distribution group, and you are calling this API using an instance in the
     * Amazon Web Services Region where the traffic distribution group was created, you can use either a full phone
     * number ARN or UUID value for the <code>PhoneNumberId</code> URI request parameter. However, if the number is
     * claimed to a traffic distribution group and you are calling this API using an instance in the alternate Amazon
     * Web Services Region associated with the traffic distribution group, you must provide a full phone number ARN. If
     * a UUID is provided in this scenario, you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </important>
     * 
     * @param disassociatePhoneNumberContactFlowRequest
     * @return Result of the DisassociatePhoneNumberContactFlow operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.DisassociatePhoneNumberContactFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociatePhoneNumberContactFlow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociatePhoneNumberContactFlowResult disassociatePhoneNumberContactFlow(DisassociatePhoneNumberContactFlowRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociatePhoneNumberContactFlow(request);
    }

    @SdkInternalApi
    final DisassociatePhoneNumberContactFlowResult executeDisassociatePhoneNumberContactFlow(
            DisassociatePhoneNumberContactFlowRequest disassociatePhoneNumberContactFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociatePhoneNumberContactFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociatePhoneNumberContactFlowRequest> request = null;
        Response<DisassociatePhoneNumberContactFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociatePhoneNumberContactFlowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociatePhoneNumberContactFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociatePhoneNumberContactFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociatePhoneNumberContactFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociatePhoneNumberContactFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Disassociates a set of quick connects from a queue.
     * </p>
     * 
     * @param disassociateQueueQuickConnectsRequest
     * @return Result of the DisassociateQueueQuickConnects operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DisassociateQueueQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateQueueQuickConnects"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateQueueQuickConnectsResult disassociateQueueQuickConnects(DisassociateQueueQuickConnectsRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateQueueQuickConnects(request);
    }

    @SdkInternalApi
    final DisassociateQueueQuickConnectsResult executeDisassociateQueueQuickConnects(DisassociateQueueQuickConnectsRequest disassociateQueueQuickConnectsRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateQueueQuickConnectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateQueueQuickConnectsRequest> request = null;
        Response<DisassociateQueueQuickConnectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateQueueQuickConnectsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateQueueQuickConnectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateQueueQuickConnects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateQueueQuickConnectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateQueueQuickConnectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a set of queues from a routing profile.
     * </p>
     * 
     * @param disassociateRoutingProfileQueuesRequest
     * @return Result of the DisassociateRoutingProfileQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DisassociateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateRoutingProfileQueuesResult disassociateRoutingProfileQueues(DisassociateRoutingProfileQueuesRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateRoutingProfileQueues(request);
    }

    @SdkInternalApi
    final DisassociateRoutingProfileQueuesResult executeDisassociateRoutingProfileQueues(
            DisassociateRoutingProfileQueuesRequest disassociateRoutingProfileQueuesRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateRoutingProfileQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateRoutingProfileQueuesRequest> request = null;
        Response<DisassociateRoutingProfileQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateRoutingProfileQueuesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateRoutingProfileQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateRoutingProfileQueues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateRoutingProfileQueuesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateRoutingProfileQueuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Deletes the specified security key.
     * </p>
     * 
     * @param disassociateSecurityKeyRequest
     * @return Result of the DisassociateSecurityKey operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.DisassociateSecurityKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateSecurityKey"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateSecurityKeyResult disassociateSecurityKey(DisassociateSecurityKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateSecurityKey(request);
    }

    @SdkInternalApi
    final DisassociateSecurityKeyResult executeDisassociateSecurityKey(DisassociateSecurityKeyRequest disassociateSecurityKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateSecurityKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateSecurityKeyRequest> request = null;
        Response<DisassociateSecurityKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateSecurityKeyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateSecurityKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateSecurityKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateSecurityKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateSecurityKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates an agent from a traffic distribution group.
     * </p>
     * 
     * @param disassociateTrafficDistributionGroupUserRequest
     * @return Result of the DisassociateTrafficDistributionGroupUser operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DisassociateTrafficDistributionGroupUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateTrafficDistributionGroupUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateTrafficDistributionGroupUserResult disassociateTrafficDistributionGroupUser(DisassociateTrafficDistributionGroupUserRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateTrafficDistributionGroupUser(request);
    }

    @SdkInternalApi
    final DisassociateTrafficDistributionGroupUserResult executeDisassociateTrafficDistributionGroupUser(
            DisassociateTrafficDistributionGroupUserRequest disassociateTrafficDistributionGroupUserRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateTrafficDistributionGroupUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateTrafficDistributionGroupUserRequest> request = null;
        Response<DisassociateTrafficDistributionGroupUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateTrafficDistributionGroupUserRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateTrafficDistributionGroupUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateTrafficDistributionGroupUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateTrafficDistributionGroupUserResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociateTrafficDistributionGroupUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a set of proficiencies from a user.
     * </p>
     * 
     * @param disassociateUserProficienciesRequest
     * @return Result of the DisassociateUserProficiencies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DisassociateUserProficiencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateUserProficiencies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateUserProficienciesResult disassociateUserProficiencies(DisassociateUserProficienciesRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateUserProficiencies(request);
    }

    @SdkInternalApi
    final DisassociateUserProficienciesResult executeDisassociateUserProficiencies(DisassociateUserProficienciesRequest disassociateUserProficienciesRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateUserProficienciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateUserProficienciesRequest> request = null;
        Response<DisassociateUserProficienciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateUserProficienciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateUserProficienciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateUserProficiencies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateUserProficienciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateUserProficienciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Dismisses contacts from an agent’s CCP and returns the agent to an available state, which allows the agent to
     * receive a new routed contact. Contacts can only be dismissed if they are in a <code>MISSED</code>,
     * <code>ERROR</code>, <code>ENDED</code>, or <code>REJECTED</code> state in the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">Agent Event Stream</a>.
     * </p>
     * 
     * @param dismissUserContactRequest
     * @return Result of the DismissUserContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.DismissUserContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DismissUserContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DismissUserContactResult dismissUserContact(DismissUserContactRequest request) {
        request = beforeClientExecution(request);
        return executeDismissUserContact(request);
    }

    @SdkInternalApi
    final DismissUserContactResult executeDismissUserContact(DismissUserContactRequest dismissUserContactRequest) {

        ExecutionContext executionContext = createExecutionContext(dismissUserContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DismissUserContactRequest> request = null;
        Response<DismissUserContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DismissUserContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(dismissUserContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DismissUserContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DismissUserContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DismissUserContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a pre-signed URL for download of an approved attached file. This API also returns metadata about the
     * attached file. It will only return a downloadURL if the status of the attached file is <code>APPROVED</code>.
     * </p>
     * 
     * @param getAttachedFileRequest
     *        Request to GetAttachedFile API.
     * @return Result of the GetAttachedFile operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.GetAttachedFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetAttachedFile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAttachedFileResult getAttachedFile(GetAttachedFileRequest request) {
        request = beforeClientExecution(request);
        return executeGetAttachedFile(request);
    }

    @SdkInternalApi
    final GetAttachedFileResult executeGetAttachedFile(GetAttachedFileRequest getAttachedFileRequest) {

        ExecutionContext executionContext = createExecutionContext(getAttachedFileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAttachedFileRequest> request = null;
        Response<GetAttachedFileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAttachedFileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAttachedFileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAttachedFile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAttachedFileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAttachedFileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the contact attributes for the specified contact.
     * </p>
     * 
     * @param getContactAttributesRequest
     * @return Result of the GetContactAttributes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Gets the real-time metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For a description of each metric, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/real-time-metrics-definitions.html">Real-time Metrics
     * Definitions</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param getCurrentMetricDataRequest
     * @return Result of the GetCurrentMetricData operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Gets the real-time active user data from the specified Amazon Connect instance.
     * </p>
     * 
     * @param getCurrentUserDataRequest
     * @return Result of the GetCurrentUserData operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.GetCurrentUserData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetCurrentUserData" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCurrentUserDataResult getCurrentUserData(GetCurrentUserDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetCurrentUserData(request);
    }

    @SdkInternalApi
    final GetCurrentUserDataResult executeGetCurrentUserData(GetCurrentUserDataRequest getCurrentUserDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getCurrentUserDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCurrentUserDataRequest> request = null;
        Response<GetCurrentUserDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCurrentUserDataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCurrentUserDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCurrentUserData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCurrentUserDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCurrentUserDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Supports SAML sign-in for Amazon Connect. Retrieves a token for federation. The token is for the Amazon Connect
     * user which corresponds to the IAM credentials that were used to invoke this action.
     * </p>
     * <p>
     * For more information about how SAML sign-in works in Amazon Connect, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/configure-saml.html ">Configure SAML with IAM for
     * Amazon Connect in the <i>Amazon Connect Administrator Guide</i>.</a>
     * </p>
     * <note>
     * <p>
     * This API doesn't support root users. If you try to invoke GetFederationToken with root credentials, an error
     * message similar to the following one appears:
     * </p>
     * <p>
     * <code>Provided identity: Principal: .... User: .... cannot be used for federation with Amazon Connect</code>
     * </p>
     * </note>
     * 
     * @param getFederationTokenRequest
     * @return Result of the GetFederationToken operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws UserNotFoundException
     *         No user with the specified credentials was found in the Amazon Connect instance.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Retrieves the flow associated for a given resource.
     * </p>
     * 
     * @param getFlowAssociationRequest
     * @return Result of the GetFlowAssociation operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.GetFlowAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetFlowAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFlowAssociationResult getFlowAssociation(GetFlowAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetFlowAssociation(request);
    }

    @SdkInternalApi
    final GetFlowAssociationResult executeGetFlowAssociation(GetFlowAssociationRequest getFlowAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getFlowAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFlowAssociationRequest> request = null;
        Response<GetFlowAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFlowAssociationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFlowAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFlowAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFlowAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFlowAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets historical metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * For a description of each historical metric, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html">Historical
     * Metrics Definitions</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <note>
     * <p>
     * We recommend using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_GetMetricDataV2.html">GetMetricDataV2</a> API.
     * It provides more flexibility, features, and the ability to query longer time ranges than
     * <code>GetMetricData</code>. Use it to retrieve historical agent and contact metrics for the last 3 months, at
     * varying intervals. You can also use it to build custom dashboards to measure historical queue and agent
     * performance. For example, you can track the number of incoming contacts for the last 7 days, with data split by
     * day, to see how contact volume changed per day of the week.
     * </p>
     * </note>
     * 
     * @param getMetricDataRequest
     * @return Result of the GetMetricData operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Gets metric data from the specified Amazon Connect instance.
     * </p>
     * <p>
     * <code>GetMetricDataV2</code> offers more features than <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_GetMetricData.html">GetMetricData</a>, the
     * previous version of this API. It has new metrics, offers filtering at a metric level, and offers the ability to
     * filter and group data by channels, queues, routing profiles, agents, and agent hierarchy levels. It can retrieve
     * historical data for the last 3 months, at varying intervals.
     * </p>
     * <p>
     * For a description of the historical metrics that are supported by <code>GetMetricDataV2</code> and
     * <code>GetMetricData</code>, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/historical-metrics-definitions.html">Historical
     * metrics definitions</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param getMetricDataV2Request
     * @return Result of the GetMetricDataV2 operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.GetMetricDataV2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetMetricDataV2" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMetricDataV2Result getMetricDataV2(GetMetricDataV2Request request) {
        request = beforeClientExecution(request);
        return executeGetMetricDataV2(request);
    }

    @SdkInternalApi
    final GetMetricDataV2Result executeGetMetricDataV2(GetMetricDataV2Request getMetricDataV2Request) {

        ExecutionContext executionContext = createExecutionContext(getMetricDataV2Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMetricDataV2Request> request = null;
        Response<GetMetricDataV2Result> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMetricDataV2RequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMetricDataV2Request));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMetricDataV2");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMetricDataV2Result>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMetricDataV2ResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the prompt file.
     * </p>
     * 
     * @param getPromptFileRequest
     * @return Result of the GetPromptFile operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.GetPromptFile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetPromptFile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPromptFileResult getPromptFile(GetPromptFileRequest request) {
        request = beforeClientExecution(request);
        return executeGetPromptFile(request);
    }

    @SdkInternalApi
    final GetPromptFileResult executeGetPromptFile(GetPromptFileRequest getPromptFileRequest) {

        ExecutionContext executionContext = createExecutionContext(getPromptFileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPromptFileRequest> request = null;
        Response<GetPromptFileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPromptFileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPromptFileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPromptFile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPromptFileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPromptFileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a specific task template in the specified Amazon Connect instance.
     * </p>
     * 
     * @param getTaskTemplateRequest
     * @return Result of the GetTaskTemplate operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.GetTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTaskTemplateResult getTaskTemplate(GetTaskTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetTaskTemplate(request);
    }

    @SdkInternalApi
    final GetTaskTemplateResult executeGetTaskTemplate(GetTaskTemplateRequest getTaskTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getTaskTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTaskTemplateRequest> request = null;
        Response<GetTaskTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTaskTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTaskTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTaskTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTaskTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTaskTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current traffic distribution for a given traffic distribution group.
     * </p>
     * 
     * @param getTrafficDistributionRequest
     * @return Result of the GetTrafficDistribution operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.GetTrafficDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetTrafficDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetTrafficDistributionResult getTrafficDistribution(GetTrafficDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeGetTrafficDistribution(request);
    }

    @SdkInternalApi
    final GetTrafficDistributionResult executeGetTrafficDistribution(GetTrafficDistributionRequest getTrafficDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(getTrafficDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTrafficDistributionRequest> request = null;
        Response<GetTrafficDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTrafficDistributionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTrafficDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTrafficDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTrafficDistributionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetTrafficDistributionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports a claimed phone number from an external service, such as Amazon Pinpoint, into an Amazon Connect
     * instance. You can call this API only in the same Amazon Web Services Region where the Amazon Connect instance was
     * created.
     * </p>
     * 
     * @param importPhoneNumberRequest
     * @return Result of the ImportPhoneNumber operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.ImportPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ImportPhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportPhoneNumberResult importPhoneNumber(ImportPhoneNumberRequest request) {
        request = beforeClientExecution(request);
        return executeImportPhoneNumber(request);
    }

    @SdkInternalApi
    final ImportPhoneNumberResult executeImportPhoneNumber(ImportPhoneNumberRequest importPhoneNumberRequest) {

        ExecutionContext executionContext = createExecutionContext(importPhoneNumberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportPhoneNumberRequest> request = null;
        Response<ImportPhoneNumberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportPhoneNumberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importPhoneNumberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportPhoneNumber");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportPhoneNumberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportPhoneNumberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Lists agent statuses.
     * </p>
     * 
     * @param listAgentStatusesRequest
     * @return Result of the ListAgentStatuses operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListAgentStatuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListAgentStatuses" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAgentStatusesResult listAgentStatuses(ListAgentStatusesRequest request) {
        request = beforeClientExecution(request);
        return executeListAgentStatuses(request);
    }

    @SdkInternalApi
    final ListAgentStatusesResult executeListAgentStatuses(ListAgentStatusesRequest listAgentStatusesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAgentStatusesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAgentStatusesRequest> request = null;
        Response<ListAgentStatusesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAgentStatusesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAgentStatusesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAgentStatuses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAgentStatusesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAgentStatusesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Lists the association status of requested dataset ID for a given Amazon Connect instance.
     * </p>
     * 
     * @param listAnalyticsDataAssociationsRequest
     * @return Result of the ListAnalyticsDataAssociations operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListAnalyticsDataAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListAnalyticsDataAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAnalyticsDataAssociationsResult listAnalyticsDataAssociations(ListAnalyticsDataAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListAnalyticsDataAssociations(request);
    }

    @SdkInternalApi
    final ListAnalyticsDataAssociationsResult executeListAnalyticsDataAssociations(ListAnalyticsDataAssociationsRequest listAnalyticsDataAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnalyticsDataAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnalyticsDataAssociationsRequest> request = null;
        Response<ListAnalyticsDataAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnalyticsDataAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAnalyticsDataAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnalyticsDataAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnalyticsDataAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAnalyticsDataAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all approved origins associated with the instance.
     * </p>
     * 
     * @param listApprovedOriginsRequest
     * @return Result of the ListApprovedOrigins operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListApprovedOrigins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListApprovedOrigins" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListApprovedOriginsResult listApprovedOrigins(ListApprovedOriginsRequest request) {
        request = beforeClientExecution(request);
        return executeListApprovedOrigins(request);
    }

    @SdkInternalApi
    final ListApprovedOriginsResult executeListApprovedOrigins(ListApprovedOriginsRequest listApprovedOriginsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApprovedOriginsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApprovedOriginsRequest> request = null;
        Response<ListApprovedOriginsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApprovedOriginsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApprovedOriginsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApprovedOrigins");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApprovedOriginsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListApprovedOriginsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * For the specified version of Amazon Lex, returns a paginated list of all the Amazon Lex bots currently associated
     * with the instance. Use this API to returns both Amazon Lex V1 and V2 bots.
     * </p>
     * 
     * @param listBotsRequest
     * @return Result of the ListBots operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListBots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBotsResult listBots(ListBotsRequest request) {
        request = beforeClientExecution(request);
        return executeListBots(request);
    }

    @SdkInternalApi
    final ListBotsResult executeListBots(ListBotsRequest listBotsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBotsRequest> request = null;
        Response<ListBotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBotsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists contact evaluations in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listContactEvaluationsRequest
     * @return Result of the ListContactEvaluations operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListContactEvaluations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactEvaluations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListContactEvaluationsResult listContactEvaluations(ListContactEvaluationsRequest request) {
        request = beforeClientExecution(request);
        return executeListContactEvaluations(request);
    }

    @SdkInternalApi
    final ListContactEvaluationsResult executeListContactEvaluations(ListContactEvaluationsRequest listContactEvaluationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listContactEvaluationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListContactEvaluationsRequest> request = null;
        Response<ListContactEvaluationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListContactEvaluationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listContactEvaluationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListContactEvaluations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListContactEvaluationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListContactEvaluationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the flow modules for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listContactFlowModulesRequest
     * @return Result of the ListContactFlowModules operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListContactFlowModules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactFlowModules" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListContactFlowModulesResult listContactFlowModules(ListContactFlowModulesRequest request) {
        request = beforeClientExecution(request);
        return executeListContactFlowModules(request);
    }

    @SdkInternalApi
    final ListContactFlowModulesResult executeListContactFlowModules(ListContactFlowModulesRequest listContactFlowModulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listContactFlowModulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListContactFlowModulesRequest> request = null;
        Response<ListContactFlowModulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListContactFlowModulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listContactFlowModulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListContactFlowModules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListContactFlowModulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListContactFlowModulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the flows for the specified Amazon Connect instance.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * <p>
     * For more information about flows, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-contact-flows.html">Flows</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listContactFlowsRequest
     * @return Result of the ListContactFlows operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListContactFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactFlows" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListContactFlowsResult listContactFlows(ListContactFlowsRequest request) {
        request = beforeClientExecution(request);
        return executeListContactFlows(request);
    }

    @SdkInternalApi
    final ListContactFlowsResult executeListContactFlows(ListContactFlowsRequest listContactFlowsRequest) {

        ExecutionContext executionContext = createExecutionContext(listContactFlowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListContactFlowsRequest> request = null;
        Response<ListContactFlowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListContactFlowsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listContactFlowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListContactFlows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListContactFlowsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListContactFlowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * For the specified <code>referenceTypes</code>, returns a list of references associated with the contact.
     * <i>References</i> are links to documents that are related to a contact, such as emails, attachments, or URLs.
     * </p>
     * 
     * @param listContactReferencesRequest
     * @return Result of the ListContactReferences operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListContactReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListContactReferences" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListContactReferencesResult listContactReferences(ListContactReferencesRequest request) {
        request = beforeClientExecution(request);
        return executeListContactReferences(request);
    }

    @SdkInternalApi
    final ListContactReferencesResult executeListContactReferences(ListContactReferencesRequest listContactReferencesRequest) {

        ExecutionContext executionContext = createExecutionContext(listContactReferencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListContactReferencesRequest> request = null;
        Response<ListContactReferencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListContactReferencesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listContactReferencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListContactReferences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListContactReferencesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListContactReferencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the default vocabularies for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listDefaultVocabulariesRequest
     * @return Result of the ListDefaultVocabularies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.ListDefaultVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListDefaultVocabularies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDefaultVocabulariesResult listDefaultVocabularies(ListDefaultVocabulariesRequest request) {
        request = beforeClientExecution(request);
        return executeListDefaultVocabularies(request);
    }

    @SdkInternalApi
    final ListDefaultVocabulariesResult executeListDefaultVocabularies(ListDefaultVocabulariesRequest listDefaultVocabulariesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDefaultVocabulariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDefaultVocabulariesRequest> request = null;
        Response<ListDefaultVocabulariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDefaultVocabulariesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDefaultVocabulariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDefaultVocabularies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDefaultVocabulariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDefaultVocabulariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists versions of an evaluation form in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listEvaluationFormVersionsRequest
     * @return Result of the ListEvaluationFormVersions operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListEvaluationFormVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListEvaluationFormVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEvaluationFormVersionsResult listEvaluationFormVersions(ListEvaluationFormVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListEvaluationFormVersions(request);
    }

    @SdkInternalApi
    final ListEvaluationFormVersionsResult executeListEvaluationFormVersions(ListEvaluationFormVersionsRequest listEvaluationFormVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEvaluationFormVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEvaluationFormVersionsRequest> request = null;
        Response<ListEvaluationFormVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEvaluationFormVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEvaluationFormVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEvaluationFormVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEvaluationFormVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEvaluationFormVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists evaluation forms in the specified Amazon Connect instance.
     * </p>
     * 
     * @param listEvaluationFormsRequest
     * @return Result of the ListEvaluationForms operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListEvaluationForms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListEvaluationForms" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListEvaluationFormsResult listEvaluationForms(ListEvaluationFormsRequest request) {
        request = beforeClientExecution(request);
        return executeListEvaluationForms(request);
    }

    @SdkInternalApi
    final ListEvaluationFormsResult executeListEvaluationForms(ListEvaluationFormsRequest listEvaluationFormsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEvaluationFormsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEvaluationFormsRequest> request = null;
        Response<ListEvaluationFormsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEvaluationFormsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEvaluationFormsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEvaluationForms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEvaluationFormsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEvaluationFormsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the flow association based on the filters.
     * </p>
     * 
     * @param listFlowAssociationsRequest
     * @return Result of the ListFlowAssociations operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListFlowAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListFlowAssociations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListFlowAssociationsResult listFlowAssociations(ListFlowAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListFlowAssociations(request);
    }

    @SdkInternalApi
    final ListFlowAssociationsResult executeListFlowAssociations(ListFlowAssociationsRequest listFlowAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFlowAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFlowAssociationsRequest> request = null;
        Response<ListFlowAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFlowAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFlowAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFlowAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFlowAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFlowAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the hours of operation for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about hours of operation, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-hours-operation.html">Set the Hours of Operation
     * for a Queue</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listHoursOfOperationsRequest
     * @return Result of the ListHoursOfOperations operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListHoursOfOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListHoursOfOperations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListHoursOfOperationsResult listHoursOfOperations(ListHoursOfOperationsRequest request) {
        request = beforeClientExecution(request);
        return executeListHoursOfOperations(request);
    }

    @SdkInternalApi
    final ListHoursOfOperationsResult executeListHoursOfOperations(ListHoursOfOperationsRequest listHoursOfOperationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listHoursOfOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHoursOfOperationsRequest> request = null;
        Response<ListHoursOfOperationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHoursOfOperationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listHoursOfOperationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListHoursOfOperations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListHoursOfOperationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListHoursOfOperationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all attribute types for the given instance.
     * </p>
     * 
     * @param listInstanceAttributesRequest
     * @return Result of the ListInstanceAttributes operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListInstanceAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstanceAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListInstanceAttributesResult listInstanceAttributes(ListInstanceAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeListInstanceAttributes(request);
    }

    @SdkInternalApi
    final ListInstanceAttributesResult executeListInstanceAttributes(ListInstanceAttributesRequest listInstanceAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(listInstanceAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceAttributesRequest> request = null;
        Response<ListInstanceAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInstanceAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstanceAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInstanceAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListInstanceAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of storage configs for the identified instance and resource type.
     * </p>
     * 
     * @param listInstanceStorageConfigsRequest
     * @return Result of the ListInstanceStorageConfigs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListInstanceStorageConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstanceStorageConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListInstanceStorageConfigsResult listInstanceStorageConfigs(ListInstanceStorageConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeListInstanceStorageConfigs(request);
    }

    @SdkInternalApi
    final ListInstanceStorageConfigsResult executeListInstanceStorageConfigs(ListInstanceStorageConfigsRequest listInstanceStorageConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInstanceStorageConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstanceStorageConfigsRequest> request = null;
        Response<ListInstanceStorageConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstanceStorageConfigsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listInstanceStorageConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstanceStorageConfigs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInstanceStorageConfigsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListInstanceStorageConfigsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Return a list of instances which are in active state, creation-in-progress state, and failed state. Instances
     * that aren't successfully created (they are in a failed state) are returned only for 24 hours after the
     * CreateInstance API was invoked.
     * </p>
     * 
     * @param listInstancesRequest
     * @return Result of the ListInstances operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstances" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListInstancesResult listInstances(ListInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListInstances(request);
    }

    @SdkInternalApi
    final ListInstancesResult executeListInstances(ListInstancesRequest listInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInstancesRequest> request = null;
        Response<ListInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides summary information about the Amazon Web Services resource associations for the specified Amazon Connect
     * instance.
     * </p>
     * 
     * @param listIntegrationAssociationsRequest
     * @return Result of the ListIntegrationAssociations operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListIntegrationAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListIntegrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIntegrationAssociationsResult listIntegrationAssociations(ListIntegrationAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListIntegrationAssociations(request);
    }

    @SdkInternalApi
    final ListIntegrationAssociationsResult executeListIntegrationAssociations(ListIntegrationAssociationsRequest listIntegrationAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIntegrationAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIntegrationAssociationsRequest> request = null;
        Response<ListIntegrationAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIntegrationAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listIntegrationAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIntegrationAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIntegrationAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListIntegrationAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all Lambda functions that display in the dropdown options in the relevant flow
     * blocks.
     * </p>
     * 
     * @param listLambdaFunctionsRequest
     * @return Result of the ListLambdaFunctions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListLambdaFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListLambdaFunctions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListLambdaFunctionsResult listLambdaFunctions(ListLambdaFunctionsRequest request) {
        request = beforeClientExecution(request);
        return executeListLambdaFunctions(request);
    }

    @SdkInternalApi
    final ListLambdaFunctionsResult executeListLambdaFunctions(ListLambdaFunctionsRequest listLambdaFunctionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLambdaFunctionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLambdaFunctionsRequest> request = null;
        Response<ListLambdaFunctionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLambdaFunctionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLambdaFunctionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLambdaFunctions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLambdaFunctionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLambdaFunctionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all the Amazon Lex V1 bots currently associated with the instance. To return both
     * Amazon Lex V1 and V2 bots, use the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListBots.html">ListBots</a> API.
     * </p>
     * 
     * @param listLexBotsRequest
     * @return Result of the ListLexBots operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListLexBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListLexBots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLexBotsResult listLexBots(ListLexBotsRequest request) {
        request = beforeClientExecution(request);
        return executeListLexBots(request);
    }

    @SdkInternalApi
    final ListLexBotsResult executeListLexBots(ListLexBotsRequest listLexBotsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLexBotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLexBotsRequest> request = null;
        Response<ListLexBotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLexBotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLexBotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLexBots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLexBotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLexBotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the phone numbers for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about phone numbers, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html">Set Up Phone
     * Numbers for Your Contact Center</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * We recommend using <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html">ListPhoneNumbersV2</a>
     * to return phone number types. ListPhoneNumbers doesn't support number types <code>UIFN</code>,
     * <code>SHARED</code>, <code>THIRD_PARTY_TF</code>, and <code>THIRD_PARTY_DID</code>. While it returns numbers of
     * those types, it incorrectly lists them as <code>TOLL_FREE</code> or <code>DID</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The phone number <code>Arn</code> value that is returned from each of the items in the <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbers.html#connect-ListPhoneNumbers-response-PhoneNumberSummaryList"
     * >PhoneNumberSummaryList</a> cannot be used to tag phone number resources. It will fail with a
     * <code>ResourceNotFoundException</code>. Instead, use the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html">ListPhoneNumbersV2</a>
     * API. It returns the new phone number ARN that can be used to tag phone number resources.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param listPhoneNumbersRequest
     * @return Result of the ListPhoneNumbers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPhoneNumbers" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
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
     * Lists phone numbers claimed to your Amazon Connect instance or traffic distribution group. If the provided
     * <code>TargetArn</code> is a traffic distribution group, you can call this API in both Amazon Web Services Regions
     * associated with traffic distribution group.
     * </p>
     * <p>
     * For more information about phone numbers, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-center-phone-number.html">Set Up Phone
     * Numbers for Your Contact Center</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * When given an instance ARN, <code>ListPhoneNumbersV2</code> returns only the phone numbers claimed to the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * When given a traffic distribution group ARN <code>ListPhoneNumbersV2</code> returns only the phone numbers
     * claimed to the traffic distribution group.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param listPhoneNumbersV2Request
     * @return Result of the ListPhoneNumbersV2 operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.ListPhoneNumbersV2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPhoneNumbersV2" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPhoneNumbersV2Result listPhoneNumbersV2(ListPhoneNumbersV2Request request) {
        request = beforeClientExecution(request);
        return executeListPhoneNumbersV2(request);
    }

    @SdkInternalApi
    final ListPhoneNumbersV2Result executeListPhoneNumbersV2(ListPhoneNumbersV2Request listPhoneNumbersV2Request) {

        ExecutionContext executionContext = createExecutionContext(listPhoneNumbersV2Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPhoneNumbersV2Request> request = null;
        Response<ListPhoneNumbersV2Result> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPhoneNumbersV2RequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPhoneNumbersV2Request));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPhoneNumbersV2");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPhoneNumbersV2Result>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPhoneNumbersV2ResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists predefined attributes for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listPredefinedAttributesRequest
     * @return Result of the ListPredefinedAttributes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListPredefinedAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPredefinedAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPredefinedAttributesResult listPredefinedAttributes(ListPredefinedAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeListPredefinedAttributes(request);
    }

    @SdkInternalApi
    final ListPredefinedAttributesResult executeListPredefinedAttributes(ListPredefinedAttributesRequest listPredefinedAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPredefinedAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPredefinedAttributesRequest> request = null;
        Response<ListPredefinedAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPredefinedAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPredefinedAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPredefinedAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPredefinedAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPredefinedAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the prompts for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listPromptsRequest
     * @return Result of the ListPrompts operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListPrompts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPrompts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPromptsResult listPrompts(ListPromptsRequest request) {
        request = beforeClientExecution(request);
        return executeListPrompts(request);
    }

    @SdkInternalApi
    final ListPromptsResult executeListPrompts(ListPromptsRequest listPromptsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPromptsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPromptsRequest> request = null;
        Response<ListPromptsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPromptsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPromptsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPrompts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPromptsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPromptsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Lists the quick connects associated with a queue.
     * </p>
     * 
     * @param listQueueQuickConnectsRequest
     * @return Result of the ListQueueQuickConnects operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListQueueQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQueueQuickConnects" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListQueueQuickConnectsResult listQueueQuickConnects(ListQueueQuickConnectsRequest request) {
        request = beforeClientExecution(request);
        return executeListQueueQuickConnects(request);
    }

    @SdkInternalApi
    final ListQueueQuickConnectsResult executeListQueueQuickConnects(ListQueueQuickConnectsRequest listQueueQuickConnectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listQueueQuickConnectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueueQuickConnectsRequest> request = null;
        Response<ListQueueQuickConnectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueueQuickConnectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQueueQuickConnectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQueueQuickConnects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQueueQuickConnectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListQueueQuickConnectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the queues for the specified Amazon Connect instance.
     * </p>
     * <p>
     * If you do not specify a <code>QueueTypes</code> parameter, both standard and agent queues are returned. This
     * might cause an unexpected truncation of results if you have more than 1000 agents and you limit the number of
     * results of the API call in code.
     * </p>
     * <p>
     * For more information about queues, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-queues-standard-and-agent.html">Queues:
     * Standard and Agent</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listQueuesRequest
     * @return Result of the ListQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListQueuesResult listQueues(ListQueuesRequest request) {
        request = beforeClientExecution(request);
        return executeListQueues(request);
    }

    @SdkInternalApi
    final ListQueuesResult executeListQueues(ListQueuesRequest listQueuesRequest) {

        ExecutionContext executionContext = createExecutionContext(listQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueuesRequest> request = null;
        Response<ListQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueuesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQueues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQueuesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListQueuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the quick connects for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listQuickConnectsRequest
     * @return Result of the ListQuickConnects operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQuickConnects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListQuickConnectsResult listQuickConnects(ListQuickConnectsRequest request) {
        request = beforeClientExecution(request);
        return executeListQuickConnects(request);
    }

    @SdkInternalApi
    final ListQuickConnectsResult executeListQuickConnects(ListQuickConnectsRequest listQuickConnectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listQuickConnectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQuickConnectsRequest> request = null;
        Response<ListQuickConnectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQuickConnectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQuickConnectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQuickConnects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQuickConnectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListQuickConnectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a list of analysis segments for a real-time analysis session.
     * </p>
     * 
     * @param listRealtimeContactAnalysisSegmentsV2Request
     * @return Result of the ListRealtimeContactAnalysisSegmentsV2 operation returned by the service.
     * @throws OutputTypeNotFoundException
     *         Thrown for analyzed content when requested OutputType was not enabled for a given contact. For example,
     *         if an OutputType.Raw was requested for a contact that had `RedactedOnly` Redaction policy set in Contact
     *         flow.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListRealtimeContactAnalysisSegmentsV2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRealtimeContactAnalysisSegmentsV2"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRealtimeContactAnalysisSegmentsV2Result listRealtimeContactAnalysisSegmentsV2(ListRealtimeContactAnalysisSegmentsV2Request request) {
        request = beforeClientExecution(request);
        return executeListRealtimeContactAnalysisSegmentsV2(request);
    }

    @SdkInternalApi
    final ListRealtimeContactAnalysisSegmentsV2Result executeListRealtimeContactAnalysisSegmentsV2(
            ListRealtimeContactAnalysisSegmentsV2Request listRealtimeContactAnalysisSegmentsV2Request) {

        ExecutionContext executionContext = createExecutionContext(listRealtimeContactAnalysisSegmentsV2Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRealtimeContactAnalysisSegmentsV2Request> request = null;
        Response<ListRealtimeContactAnalysisSegmentsV2Result> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRealtimeContactAnalysisSegmentsV2RequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRealtimeContactAnalysisSegmentsV2Request));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRealtimeContactAnalysisSegmentsV2");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRealtimeContactAnalysisSegmentsV2Result>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRealtimeContactAnalysisSegmentsV2ResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the queues associated with a routing profile.
     * </p>
     * 
     * @param listRoutingProfileQueuesRequest
     * @return Result of the ListRoutingProfileQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRoutingProfileQueuesResult listRoutingProfileQueues(ListRoutingProfileQueuesRequest request) {
        request = beforeClientExecution(request);
        return executeListRoutingProfileQueues(request);
    }

    @SdkInternalApi
    final ListRoutingProfileQueuesResult executeListRoutingProfileQueues(ListRoutingProfileQueuesRequest listRoutingProfileQueuesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRoutingProfileQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRoutingProfileQueuesRequest> request = null;
        Response<ListRoutingProfileQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRoutingProfileQueuesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRoutingProfileQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRoutingProfileQueues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRoutingProfileQueuesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRoutingProfileQueuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides summary information about the routing profiles for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about routing profiles, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/concepts-routing.html">Routing Profiles</a> and <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/routing-profiles.html">Create a Routing Profile</a>
     * in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listRoutingProfilesRequest
     * @return Result of the ListRoutingProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * List all rules for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listRulesRequest
     * @return Result of the ListRules operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRulesResult listRules(ListRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListRules(request);
    }

    @SdkInternalApi
    final ListRulesResult executeListRules(ListRulesRequest listRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRulesRequest> request = null;
        Response<ListRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRulesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Returns a paginated list of all security keys associated with the instance.
     * </p>
     * 
     * @param listSecurityKeysRequest
     * @return Result of the ListSecurityKeys operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListSecurityKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityKeys" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSecurityKeysResult listSecurityKeys(ListSecurityKeysRequest request) {
        request = beforeClientExecution(request);
        return executeListSecurityKeys(request);
    }

    @SdkInternalApi
    final ListSecurityKeysResult executeListSecurityKeys(ListSecurityKeysRequest listSecurityKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(listSecurityKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecurityKeysRequest> request = null;
        Response<ListSecurityKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecurityKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSecurityKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSecurityKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSecurityKeysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSecurityKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of third-party applications in a specific security profile.
     * </p>
     * 
     * @param listSecurityProfileApplicationsRequest
     * @return Result of the ListSecurityProfileApplications operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListSecurityProfileApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfileApplications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSecurityProfileApplicationsResult listSecurityProfileApplications(ListSecurityProfileApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListSecurityProfileApplications(request);
    }

    @SdkInternalApi
    final ListSecurityProfileApplicationsResult executeListSecurityProfileApplications(
            ListSecurityProfileApplicationsRequest listSecurityProfileApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSecurityProfileApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecurityProfileApplicationsRequest> request = null;
        Response<ListSecurityProfileApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecurityProfileApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSecurityProfileApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSecurityProfileApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSecurityProfileApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSecurityProfileApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the permissions granted to a security profile.
     * </p>
     * 
     * @param listSecurityProfilePermissionsRequest
     * @return Result of the ListSecurityProfilePermissions operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListSecurityProfilePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListSecurityProfilePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSecurityProfilePermissionsResult listSecurityProfilePermissions(ListSecurityProfilePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeListSecurityProfilePermissions(request);
    }

    @SdkInternalApi
    final ListSecurityProfilePermissionsResult executeListSecurityProfilePermissions(ListSecurityProfilePermissionsRequest listSecurityProfilePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSecurityProfilePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecurityProfilePermissionsRequest> request = null;
        Response<ListSecurityProfilePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecurityProfilePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSecurityProfilePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSecurityProfilePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSecurityProfilePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSecurityProfilePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides summary information about the security profiles for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about security profiles, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/connect-security-profiles.html">Security Profiles</a>
     * in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listSecurityProfilesRequest
     * @return Result of the ListSecurityProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Lists the tags for the specified resource.
     * </p>
     * <p>
     * For sample policies that use tags, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html">Amazon
     * Connect Identity-Based Policy Examples</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
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
     * Lists task templates for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listTaskTemplatesRequest
     * @return Result of the ListTaskTemplates operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListTaskTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTaskTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTaskTemplatesResult listTaskTemplates(ListTaskTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListTaskTemplates(request);
    }

    @SdkInternalApi
    final ListTaskTemplatesResult executeListTaskTemplates(ListTaskTemplatesRequest listTaskTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTaskTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTaskTemplatesRequest> request = null;
        Response<ListTaskTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTaskTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTaskTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTaskTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTaskTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTaskTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists traffic distribution group users.
     * </p>
     * 
     * @param listTrafficDistributionGroupUsersRequest
     * @return Result of the ListTrafficDistributionGroupUsers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListTrafficDistributionGroupUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTrafficDistributionGroupUsers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTrafficDistributionGroupUsersResult listTrafficDistributionGroupUsers(ListTrafficDistributionGroupUsersRequest request) {
        request = beforeClientExecution(request);
        return executeListTrafficDistributionGroupUsers(request);
    }

    @SdkInternalApi
    final ListTrafficDistributionGroupUsersResult executeListTrafficDistributionGroupUsers(
            ListTrafficDistributionGroupUsersRequest listTrafficDistributionGroupUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrafficDistributionGroupUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrafficDistributionGroupUsersRequest> request = null;
        Response<ListTrafficDistributionGroupUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrafficDistributionGroupUsersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listTrafficDistributionGroupUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrafficDistributionGroupUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrafficDistributionGroupUsersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTrafficDistributionGroupUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists traffic distribution groups.
     * </p>
     * 
     * @param listTrafficDistributionGroupsRequest
     * @return Result of the ListTrafficDistributionGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListTrafficDistributionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListTrafficDistributionGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTrafficDistributionGroupsResult listTrafficDistributionGroups(ListTrafficDistributionGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListTrafficDistributionGroups(request);
    }

    @SdkInternalApi
    final ListTrafficDistributionGroupsResult executeListTrafficDistributionGroups(ListTrafficDistributionGroupsRequest listTrafficDistributionGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrafficDistributionGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrafficDistributionGroupsRequest> request = null;
        Response<ListTrafficDistributionGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrafficDistributionGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listTrafficDistributionGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrafficDistributionGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrafficDistributionGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTrafficDistributionGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the use cases for the integration association.
     * </p>
     * 
     * @param listUseCasesRequest
     *        Provides summary information about the use cases for the specified integration association.
     * @return Result of the ListUseCases operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.ListUseCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUseCases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUseCasesResult listUseCases(ListUseCasesRequest request) {
        request = beforeClientExecution(request);
        return executeListUseCases(request);
    }

    @SdkInternalApi
    final ListUseCasesResult executeListUseCases(ListUseCasesRequest listUseCasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listUseCasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUseCasesRequest> request = null;
        Response<ListUseCasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUseCasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUseCasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUseCases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUseCasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUseCasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides summary information about the hierarchy groups for the specified Amazon Connect instance.
     * </p>
     * <p>
     * For more information about agent hierarchies, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/agent-hierarchy.html">Set Up Agent Hierarchies</a> in
     * the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param listUserHierarchyGroupsRequest
     * @return Result of the ListUserHierarchyGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Lists proficiencies associated with a user.
     * </p>
     * 
     * @param listUserProficienciesRequest
     * @return Result of the ListUserProficiencies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ListUserProficiencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListUserProficiencies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListUserProficienciesResult listUserProficiencies(ListUserProficienciesRequest request) {
        request = beforeClientExecution(request);
        return executeListUserProficiencies(request);
    }

    @SdkInternalApi
    final ListUserProficienciesResult executeListUserProficiencies(ListUserProficienciesRequest listUserProficienciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listUserProficienciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUserProficienciesRequest> request = null;
        Response<ListUserProficienciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUserProficienciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUserProficienciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUserProficiencies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUserProficienciesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListUserProficienciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides summary information about the users for the specified Amazon Connect instance.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns all the available versions for the specified Amazon Connect instance and view identifier.
     * </p>
     * <p>
     * Results will be sorted from highest to lowest.
     * </p>
     * 
     * @param listViewVersionsRequest
     * @return Result of the ListViewVersions operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @sample AmazonConnect.ListViewVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListViewVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListViewVersionsResult listViewVersions(ListViewVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListViewVersions(request);
    }

    @SdkInternalApi
    final ListViewVersionsResult executeListViewVersions(ListViewVersionsRequest listViewVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listViewVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListViewVersionsRequest> request = null;
        Response<ListViewVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListViewVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listViewVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListViewVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListViewVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListViewVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns views in the given instance.
     * </p>
     * <p>
     * Results are sorted primarily by type, and secondarily by name.
     * </p>
     * 
     * @param listViewsRequest
     * @return Result of the ListViews operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @sample AmazonConnect.ListViews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListViews" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListViewsResult listViews(ListViewsRequest request) {
        request = beforeClientExecution(request);
        return executeListViews(request);
    }

    @SdkInternalApi
    final ListViewsResult executeListViews(ListViewsRequest listViewsRequest) {

        ExecutionContext executionContext = createExecutionContext(listViewsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListViewsRequest> request = null;
        Response<ListViewsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListViewsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listViewsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListViews");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListViewsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListViewsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates silent monitoring of a contact. The Contact Control Panel (CCP) of the user specified by <i>userId</i>
     * will be set to silent monitoring mode on the contact.
     * </p>
     * 
     * @param monitorContactRequest
     * @return Result of the MonitorContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.MonitorContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/MonitorContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public MonitorContactResult monitorContact(MonitorContactRequest request) {
        request = beforeClientExecution(request);
        return executeMonitorContact(request);
    }

    @SdkInternalApi
    final MonitorContactResult executeMonitorContact(MonitorContactRequest monitorContactRequest) {

        ExecutionContext executionContext = createExecutionContext(monitorContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<MonitorContactRequest> request = null;
        Response<MonitorContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new MonitorContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(monitorContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "MonitorContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<MonitorContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new MonitorContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows pausing an ongoing task contact.
     * </p>
     * 
     * @param pauseContactRequest
     * @return Result of the PauseContact operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ConflictException
     *         Operation cannot be performed at this time as there is a conflict with another operation or contact
     *         state.
     * @sample AmazonConnect.PauseContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/PauseContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PauseContactResult pauseContact(PauseContactRequest request) {
        request = beforeClientExecution(request);
        return executePauseContact(request);
    }

    @SdkInternalApi
    final PauseContactResult executePauseContact(PauseContactRequest pauseContactRequest) {

        ExecutionContext executionContext = createExecutionContext(pauseContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PauseContactRequest> request = null;
        Response<PauseContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PauseContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(pauseContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PauseContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PauseContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PauseContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the current status of a user or agent in Amazon Connect. If the agent is currently handling a contact,
     * this sets the agent's next status.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/metrics-agent-status.html">Agent status</a> and <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-next-status.html">Set your next status</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param putUserStatusRequest
     * @return Result of the PutUserStatus operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.PutUserStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/PutUserStatus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutUserStatusResult putUserStatus(PutUserStatusRequest request) {
        request = beforeClientExecution(request);
        return executePutUserStatus(request);
    }

    @SdkInternalApi
    final PutUserStatusResult executePutUserStatus(PutUserStatusRequest putUserStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(putUserStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutUserStatusRequest> request = null;
        Response<PutUserStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutUserStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putUserStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutUserStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutUserStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutUserStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Releases a phone number previously claimed to an Amazon Connect instance or traffic distribution group. You can
     * call this API only in the Amazon Web Services Region where the number was claimed.
     * </p>
     * <important>
     * <p>
     * To release phone numbers from a traffic distribution group, use the <code>ReleasePhoneNumber</code> API, not the
     * Amazon Connect admin website.
     * </p>
     * <p>
     * After releasing a phone number, the phone number enters into a cooldown period of 30 days. It cannot be searched
     * for or claimed again until the period has ended. If you accidentally release a phone number, contact Amazon Web
     * Services Support.
     * </p>
     * </important>
     * <p>
     * If you plan to claim and release numbers frequently during a 30 day period, contact us for a service quota
     * exception. Otherwise, it is possible you will be blocked from claiming and releasing any more numbers until 30
     * days past the oldest number released has expired.
     * </p>
     * <p>
     * By default you can claim and release up to 200% of your maximum number of active phone numbers during any 30 day
     * period. If you claim and release phone numbers using the UI or API during a rolling 30 day cycle that exceeds
     * 200% of your phone number service level quota, you will be blocked from claiming any more numbers until 30 days
     * past the oldest number released has expired.
     * </p>
     * <p>
     * For example, if you already have 99 claimed numbers and a service level quota of 99 phone numbers, and in any 30
     * day period you release 99, claim 99, and then release 99, you will have exceeded the 200% limit. At that point
     * you are blocked from claiming any more numbers until you open an Amazon Web Services support ticket.
     * </p>
     * 
     * @param releasePhoneNumberRequest
     * @return Result of the ReleasePhoneNumber operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.ReleasePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ReleasePhoneNumber" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
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
     * Replicates an Amazon Connect instance in the specified Amazon Web Services Region and copies configuration
     * information for Amazon Connect resources across Amazon Web Services Regions.
     * </p>
     * <p>
     * For more information about replicating an Amazon Connect instance, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/create-replica-connect-instance.html">Create a
     * replica of your existing Amazon Connect instance</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param replicateInstanceRequest
     * @return Result of the ReplicateInstance operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotReadyException
     *         The resource is not ready.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.ReplicateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ReplicateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ReplicateInstanceResult replicateInstance(ReplicateInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeReplicateInstance(request);
    }

    @SdkInternalApi
    final ReplicateInstanceResult executeReplicateInstance(ReplicateInstanceRequest replicateInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(replicateInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReplicateInstanceRequest> request = null;
        Response<ReplicateInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReplicateInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(replicateInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReplicateInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReplicateInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReplicateInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows resuming a task contact in a paused state.
     * </p>
     * 
     * @param resumeContactRequest
     * @return Result of the ResumeContact operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ConflictException
     *         Operation cannot be performed at this time as there is a conflict with another operation or contact
     *         state.
     * @sample AmazonConnect.ResumeContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ResumeContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResumeContactResult resumeContact(ResumeContactRequest request) {
        request = beforeClientExecution(request);
        return executeResumeContact(request);
    }

    @SdkInternalApi
    final ResumeContactResult executeResumeContact(ResumeContactRequest resumeContactRequest) {

        ExecutionContext executionContext = createExecutionContext(resumeContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResumeContactRequest> request = null;
        Response<ResumeContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResumeContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resumeContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResumeContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResumeContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResumeContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * When a contact is being recorded, and the recording has been suspended using SuspendContactRecording, this API
     * resumes recording whatever recording is selected in the flow configuration: call, screen, or both. If only call
     * recording or only screen recording is enabled, then it would resume.
     * </p>
     * <p>
     * Voice and screen recordings are supported.
     * </p>
     * 
     * @param resumeContactRecordingRequest
     * @return Result of the ResumeContactRecording operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.ResumeContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ResumeContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ResumeContactRecordingResult resumeContactRecording(ResumeContactRecordingRequest request) {
        request = beforeClientExecution(request);
        return executeResumeContactRecording(request);
    }

    @SdkInternalApi
    final ResumeContactRecordingResult executeResumeContactRecording(ResumeContactRecordingRequest resumeContactRecordingRequest) {

        ExecutionContext executionContext = createExecutionContext(resumeContactRecordingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResumeContactRecordingRequest> request = null;
        Response<ResumeContactRecordingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResumeContactRecordingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resumeContactRecordingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResumeContactRecording");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResumeContactRecordingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ResumeContactRecordingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for available phone numbers that you can claim to your Amazon Connect instance or traffic distribution
     * group. If the provided <code>TargetArn</code> is a traffic distribution group, you can call this API in both
     * Amazon Web Services Regions associated with the traffic distribution group.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return Result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchAvailablePhoneNumbers"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
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
     * Searches the flow modules in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchContactFlowModulesRequest
     * @return Result of the SearchContactFlowModules operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchContactFlowModules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchContactFlowModules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchContactFlowModulesResult searchContactFlowModules(SearchContactFlowModulesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchContactFlowModules(request);
    }

    @SdkInternalApi
    final SearchContactFlowModulesResult executeSearchContactFlowModules(SearchContactFlowModulesRequest searchContactFlowModulesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchContactFlowModulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchContactFlowModulesRequest> request = null;
        Response<SearchContactFlowModulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchContactFlowModulesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(searchContactFlowModulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchContactFlowModules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchContactFlowModulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SearchContactFlowModulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches the contact flows in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchContactFlowsRequest
     * @return Result of the SearchContactFlows operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchContactFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchContactFlows" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchContactFlowsResult searchContactFlows(SearchContactFlowsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchContactFlows(request);
    }

    @SdkInternalApi
    final SearchContactFlowsResult executeSearchContactFlows(SearchContactFlowsRequest searchContactFlowsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchContactFlowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchContactFlowsRequest> request = null;
        Response<SearchContactFlowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchContactFlowsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchContactFlowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchContactFlows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchContactFlowsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchContactFlowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches contacts in an Amazon Connect instance.
     * </p>
     * 
     * @param searchContactsRequest
     * @return Result of the SearchContacts operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.SearchContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchContacts" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
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
     * Searches the hours of operation in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchHoursOfOperationsRequest
     * @return Result of the SearchHoursOfOperations operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchHoursOfOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchHoursOfOperations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchHoursOfOperationsResult searchHoursOfOperations(SearchHoursOfOperationsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchHoursOfOperations(request);
    }

    @SdkInternalApi
    final SearchHoursOfOperationsResult executeSearchHoursOfOperations(SearchHoursOfOperationsRequest searchHoursOfOperationsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchHoursOfOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchHoursOfOperationsRequest> request = null;
        Response<SearchHoursOfOperationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchHoursOfOperationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(searchHoursOfOperationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchHoursOfOperations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchHoursOfOperationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SearchHoursOfOperationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Predefined attributes that meet certain criteria.
     * </p>
     * 
     * @param searchPredefinedAttributesRequest
     * @return Result of the SearchPredefinedAttributes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchPredefinedAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchPredefinedAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchPredefinedAttributesResult searchPredefinedAttributes(SearchPredefinedAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchPredefinedAttributes(request);
    }

    @SdkInternalApi
    final SearchPredefinedAttributesResult executeSearchPredefinedAttributes(SearchPredefinedAttributesRequest searchPredefinedAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchPredefinedAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchPredefinedAttributesRequest> request = null;
        Response<SearchPredefinedAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchPredefinedAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(searchPredefinedAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchPredefinedAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchPredefinedAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SearchPredefinedAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches prompts in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchPromptsRequest
     * @return Result of the SearchPrompts operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchPrompts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchPrompts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchPromptsResult searchPrompts(SearchPromptsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchPrompts(request);
    }

    @SdkInternalApi
    final SearchPromptsResult executeSearchPrompts(SearchPromptsRequest searchPromptsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchPromptsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchPromptsRequest> request = null;
        Response<SearchPromptsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchPromptsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchPromptsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchPrompts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchPromptsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchPromptsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches queues in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchQueuesRequest
     * @return Result of the SearchQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchQueues" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchQueuesResult searchQueues(SearchQueuesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchQueues(request);
    }

    @SdkInternalApi
    final SearchQueuesResult executeSearchQueues(SearchQueuesRequest searchQueuesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchQueuesRequest> request = null;
        Response<SearchQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchQueuesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchQueues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchQueuesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchQueuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches quick connects in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchQuickConnectsRequest
     * @return Result of the SearchQuickConnects operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchQuickConnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchQuickConnects" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchQuickConnectsResult searchQuickConnects(SearchQuickConnectsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchQuickConnects(request);
    }

    @SdkInternalApi
    final SearchQuickConnectsResult executeSearchQuickConnects(SearchQuickConnectsRequest searchQuickConnectsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchQuickConnectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchQuickConnectsRequest> request = null;
        Response<SearchQuickConnectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchQuickConnectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchQuickConnectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchQuickConnects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchQuickConnectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchQuickConnectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches tags used in an Amazon Connect instance using optional search criteria.
     * </p>
     * 
     * @param searchResourceTagsRequest
     * @return Result of the SearchResourceTags operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws MaximumResultReturnedException
     *         Maximum number (1000) of tags have been returned with current request. Consider changing request
     *         parameters to get more tags.
     * @sample AmazonConnect.SearchResourceTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchResourceTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchResourceTagsResult searchResourceTags(SearchResourceTagsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchResourceTags(request);
    }

    @SdkInternalApi
    final SearchResourceTagsResult executeSearchResourceTags(SearchResourceTagsRequest searchResourceTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchResourceTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchResourceTagsRequest> request = null;
        Response<SearchResourceTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchResourceTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchResourceTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchResourceTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchResourceTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchResourceTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches routing profiles in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchRoutingProfilesRequest
     * @return Result of the SearchRoutingProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchRoutingProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchRoutingProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchRoutingProfilesResult searchRoutingProfiles(SearchRoutingProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchRoutingProfiles(request);
    }

    @SdkInternalApi
    final SearchRoutingProfilesResult executeSearchRoutingProfiles(SearchRoutingProfilesRequest searchRoutingProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchRoutingProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchRoutingProfilesRequest> request = null;
        Response<SearchRoutingProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchRoutingProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchRoutingProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchRoutingProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchRoutingProfilesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new SearchRoutingProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches security profiles in an Amazon Connect instance, with optional filtering.
     * </p>
     * 
     * @param searchSecurityProfilesRequest
     * @return Result of the SearchSecurityProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchSecurityProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchSecurityProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchSecurityProfilesResult searchSecurityProfiles(SearchSecurityProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchSecurityProfiles(request);
    }

    @SdkInternalApi
    final SearchSecurityProfilesResult executeSearchSecurityProfiles(SearchSecurityProfilesRequest searchSecurityProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchSecurityProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchSecurityProfilesRequest> request = null;
        Response<SearchSecurityProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchSecurityProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchSecurityProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchSecurityProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchSecurityProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SearchSecurityProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches users in an Amazon Connect instance, with optional filtering.
     * </p>
     * <note>
     * <p>
     * <code>AfterContactWorkTimeLimit</code> is returned in milliseconds.
     * </p>
     * </note>
     * 
     * @param searchUsersRequest
     * @return Result of the SearchUsers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SearchUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchUsers" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
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
     * Searches for vocabularies within a specific Amazon Connect instance using <code>State</code>,
     * <code>NameStartsWith</code>, and <code>LanguageCode</code>.
     * </p>
     * 
     * @param searchVocabulariesRequest
     * @return Result of the SearchVocabularies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.SearchVocabularies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchVocabularies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchVocabulariesResult searchVocabularies(SearchVocabulariesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchVocabularies(request);
    }

    @SdkInternalApi
    final SearchVocabulariesResult executeSearchVocabularies(SearchVocabulariesRequest searchVocabulariesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchVocabulariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchVocabulariesRequest> request = null;
        Response<SearchVocabulariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchVocabulariesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchVocabulariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchVocabularies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchVocabulariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchVocabulariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Processes chat integration events from Amazon Web Services or external integrations to Amazon Connect. A chat
     * integration event includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SourceId, DestinationId, and Subtype: a set of identifiers, uniquely representing a chat
     * </p>
     * </li>
     * <li>
     * <p>
     * ChatEvent: details of the chat action to perform such as sending a message, event, or disconnecting from a chat
     * </p>
     * </li>
     * </ul>
     * <p>
     * When a chat integration event is sent with chat identifiers that do not map to an active chat contact, a new chat
     * contact is also created before handling chat action.
     * </p>
     * <p>
     * Access to this API is currently restricted to Amazon Pinpoint for supporting SMS integration.
     * </p>
     * 
     * @param sendChatIntegrationEventRequest
     * @return Result of the SendChatIntegrationEvent operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.SendChatIntegrationEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SendChatIntegrationEvent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendChatIntegrationEventResult sendChatIntegrationEvent(SendChatIntegrationEventRequest request) {
        request = beforeClientExecution(request);
        return executeSendChatIntegrationEvent(request);
    }

    @SdkInternalApi
    final SendChatIntegrationEventResult executeSendChatIntegrationEvent(SendChatIntegrationEventRequest sendChatIntegrationEventRequest) {

        ExecutionContext executionContext = createExecutionContext(sendChatIntegrationEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendChatIntegrationEventRequest> request = null;
        Response<SendChatIntegrationEventResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendChatIntegrationEventRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(sendChatIntegrationEventRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendChatIntegrationEvent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendChatIntegrationEventResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SendChatIntegrationEventResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a pre-signed Amazon S3 URL in response for uploading your content.
     * </p>
     * <important>
     * <p>
     * You may only use this API to upload attachments to a <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Connect
     * Case</a>.
     * </p>
     * </important>
     * 
     * @param startAttachedFileUploadRequest
     * @return Result of the StartAttachedFileUpload operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @sample AmazonConnect.StartAttachedFileUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartAttachedFileUpload"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartAttachedFileUploadResult startAttachedFileUpload(StartAttachedFileUploadRequest request) {
        request = beforeClientExecution(request);
        return executeStartAttachedFileUpload(request);
    }

    @SdkInternalApi
    final StartAttachedFileUploadResult executeStartAttachedFileUpload(StartAttachedFileUploadRequest startAttachedFileUploadRequest) {

        ExecutionContext executionContext = createExecutionContext(startAttachedFileUploadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAttachedFileUploadRequest> request = null;
        Response<StartAttachedFileUploadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAttachedFileUploadRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startAttachedFileUploadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartAttachedFileUpload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAttachedFileUploadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartAttachedFileUploadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates a flow to start a new chat for the customer. Response of this API provides a token required to obtain
     * credentials from the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API in the Amazon Connect Participant Service.
     * </p>
     * <p>
     * When a new chat contact is successfully created, clients must subscribe to the participant’s connection for the
     * created chat within 5 minutes. This is achieved by invoking <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> with WEBSOCKET and CONNECTION_CREDENTIALS.
     * </p>
     * <p>
     * A 429 error occurs in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * API rate limit is exceeded. API TPS throttling returns a <code>TooManyRequests</code> exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <a href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">quota for
     * concurrent active chats</a> is exceeded. Active chat throttling returns a <code>LimitExceededException</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use the <code>ChatDurationInMinutes</code> parameter and receive a 400 error, your account may not support
     * the ability to configure custom chat durations. For more information, contact Amazon Web Services Support.
     * </p>
     * <p>
     * For more information about chat, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat.html">Chat</a> in the <i>Amazon Connect
     * Administrator Guide</i>.
     * </p>
     * 
     * @param startChatContactRequest
     * @return Result of the StartChatContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @sample AmazonConnect.StartChatContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartChatContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartChatContactResult startChatContact(StartChatContactRequest request) {
        request = beforeClientExecution(request);
        return executeStartChatContact(request);
    }

    @SdkInternalApi
    final StartChatContactResult executeStartChatContact(StartChatContactRequest startChatContactRequest) {

        ExecutionContext executionContext = createExecutionContext(startChatContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartChatContactRequest> request = null;
        Response<StartChatContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartChatContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startChatContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartChatContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartChatContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartChatContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an empty evaluation in the specified Amazon Connect instance, using the given evaluation form for the
     * particular contact. The evaluation form version used for the contact evaluation corresponds to the currently
     * activated version. If no version is activated for the evaluation form, the contact evaluation cannot be started.
     * </p>
     * <note>
     * <p>
     * Evaluations created through the public API do not contain answer values suggested from automation.
     * </p>
     * </note>
     * 
     * @param startContactEvaluationRequest
     * @return Result of the StartContactEvaluation operation returned by the service.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.StartContactEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartContactEvaluation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartContactEvaluationResult startContactEvaluation(StartContactEvaluationRequest request) {
        request = beforeClientExecution(request);
        return executeStartContactEvaluation(request);
    }

    @SdkInternalApi
    final StartContactEvaluationResult executeStartContactEvaluation(StartContactEvaluationRequest startContactEvaluationRequest) {

        ExecutionContext executionContext = createExecutionContext(startContactEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartContactEvaluationRequest> request = null;
        Response<StartContactEvaluationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartContactEvaluationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startContactEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartContactEvaluation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartContactEvaluationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartContactEvaluationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts recording the contact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the API is called <i>before</i> the agent joins the call, recording starts when the agent joins the call.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the API is called <i>after</i> the agent joins the call, recording starts at the time of the API call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * StartContactRecording is a one-time action. For example, if you use StopContactRecording to stop recording an
     * ongoing call, you can't use StartContactRecording to restart it. For scenarios where the recording has started
     * and you want to suspend and resume it, such as when collecting sensitive information (for example, a credit card
     * number), use SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * You can use this API to override the recording behavior configured in the <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-recording-behavior.html">Set recording
     * behavior</a> block.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param startContactRecordingRequest
     * @return Result of the StartContactRecording operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.StartContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartContactRecordingResult startContactRecording(StartContactRecordingRequest request) {
        request = beforeClientExecution(request);
        return executeStartContactRecording(request);
    }

    @SdkInternalApi
    final StartContactRecordingResult executeStartContactRecording(StartContactRecordingRequest startContactRecordingRequest) {

        ExecutionContext executionContext = createExecutionContext(startContactRecordingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartContactRecordingRequest> request = null;
        Response<StartContactRecordingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartContactRecordingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startContactRecordingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartContactRecording");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartContactRecordingResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartContactRecordingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates real-time message streaming for a new chat contact.
     * </p>
     * <p>
     * For more information about message streaming, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-message-streaming.html">Enable real-time chat
     * message streaming</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param startContactStreamingRequest
     * @return Result of the StartContactStreaming operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @sample AmazonConnect.StartContactStreaming
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartContactStreaming" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartContactStreamingResult startContactStreaming(StartContactStreamingRequest request) {
        request = beforeClientExecution(request);
        return executeStartContactStreaming(request);
    }

    @SdkInternalApi
    final StartContactStreamingResult executeStartContactStreaming(StartContactStreamingRequest startContactStreamingRequest) {

        ExecutionContext executionContext = createExecutionContext(startContactStreamingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartContactStreamingRequest> request = null;
        Response<StartContactStreamingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartContactStreamingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startContactStreamingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartContactStreaming");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartContactStreamingResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartContactStreamingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Places an outbound call to a contact, and then initiates the flow. It performs the actions in the flow that's
     * specified (in <code>ContactFlowId</code>).
     * </p>
     * <p>
     * Agents do not initiate the outbound API, which means that they do not dial the contact. If the flow places an
     * outbound call to a contact, and then puts the contact in queue, the call is then routed to the agent, like any
     * other inbound case.
     * </p>
     * <p>
     * There is a 60-second dialing timeout for this operation. If the call is not connected after 60 seconds, it fails.
     * </p>
     * <note>
     * <p>
     * UK numbers with a 447 prefix are not allowed by default. Before you can dial these UK mobile numbers, you must
     * submit a service quota increase request. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
     * Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </note> <note>
     * <p>
     * Campaign calls are not allowed by default. Before you can make a call with <code>TrafficType</code> =
     * <code>CAMPAIGN</code>, you must submit a service quota increase request to the quota <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#outbound-communications-quotas"
     * >Amazon Connect campaigns</a>.
     * </p>
     * </note>
     * 
     * @param startOutboundVoiceContactRequest
     * @return Result of the StartOutboundVoiceContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Initiates a flow to start a new task contact. For more information about task contacts, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/tasks.html">Concepts: Tasks in Amazon Connect</a> in
     * the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * When using <code>PreviousContactId</code> and <code>RelatedContactId</code> input parameters, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PreviousContactId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any updates to user-defined task contact attributes on any contact linked through the same
     * <code>PreviousContactId</code> will affect every contact in the chain.
     * </p>
     * </li>
     * <li>
     * <p>
     * There can be a maximum of 12 linked task contacts in a chain. That is, 12 task contacts can be created that share
     * the same <code>PreviousContactId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>RelatedContactId</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Copies contact attributes from the related task contact to the new contact.
     * </p>
     * </li>
     * <li>
     * <p>
     * Any update on attributes in a new task contact does not update attributes on previous contact.
     * </p>
     * </li>
     * <li>
     * <p>
     * There’s no limit on the number of task contacts that can be created that use the same
     * <code>RelatedContactId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * In addition, when calling StartTaskContact include only one of these parameters: <code>ContactFlowID</code>,
     * <code>QuickConnectID</code>, or <code>TaskTemplateID</code>. Only one parameter is required as long as the task
     * template has a flow configured to run it. If more than one parameter is specified, or only the
     * <code>TaskTemplateID</code> is specified but it does not have a flow configured, the request returns an error
     * because Amazon Connect cannot identify the unique flow to run when the task is created.
     * </p>
     * <p>
     * A <code>ServiceQuotaExceededException</code> occurs when the number of open tasks exceeds the active tasks quota
     * or there are already 12 tasks referencing the same <code>PreviousContactId</code>. For more information about
     * service quotas for task contacts, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
     * service quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param startTaskContactRequest
     * @return Result of the StartTaskContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.StartTaskContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartTaskContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartTaskContactResult startTaskContact(StartTaskContactRequest request) {
        request = beforeClientExecution(request);
        return executeStartTaskContact(request);
    }

    @SdkInternalApi
    final StartTaskContactResult executeStartTaskContact(StartTaskContactRequest startTaskContactRequest) {

        ExecutionContext executionContext = createExecutionContext(startTaskContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTaskContactRequest> request = null;
        Response<StartTaskContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTaskContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startTaskContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartTaskContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartTaskContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartTaskContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Places an inbound in-app, web, or video call to a contact, and then initiates the flow. It performs the actions
     * in the flow that are specified (in ContactFlowId) and present in the Amazon Connect instance (specified as
     * InstanceId).
     * </p>
     * 
     * @param startWebRTCContactRequest
     * @return Result of the StartWebRTCContact operation returned by the service.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonConnect.StartWebRTCContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartWebRTCContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartWebRTCContactResult startWebRTCContact(StartWebRTCContactRequest request) {
        request = beforeClientExecution(request);
        return executeStartWebRTCContact(request);
    }

    @SdkInternalApi
    final StartWebRTCContactResult executeStartWebRTCContact(StartWebRTCContactRequest startWebRTCContactRequest) {

        ExecutionContext executionContext = createExecutionContext(startWebRTCContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartWebRTCContactRequest> request = null;
        Response<StartWebRTCContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartWebRTCContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startWebRTCContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartWebRTCContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartWebRTCContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartWebRTCContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Ends the specified contact. Use this API to stop queued callbacks. It does not work for voice contacts that use
     * the following initiation methods:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISCONNECT
     * </p>
     * </li>
     * <li>
     * <p>
     * TRANSFER
     * </p>
     * </li>
     * <li>
     * <p>
     * QUEUE_TRANSFER
     * </p>
     * </li>
     * </ul>
     * <p>
     * Chat and task contacts can be terminated in any state, regardless of initiation method.
     * </p>
     * 
     * @param stopContactRequest
     * @return Result of the StopContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ContactNotFoundException
     *         The contact with the specified ID is not active or does not exist. Applies to Voice calls only, not to
     *         Chat or Task contacts.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Stops recording a call when a contact is being recorded. StopContactRecording is a one-time action. If you use
     * StopContactRecording to stop recording an ongoing call, you can't use StartContactRecording to restart it. For
     * scenarios where the recording has started and you want to suspend it for sensitive information (for example, to
     * collect a credit card number), and then restart it, use SuspendContactRecording and ResumeContactRecording.
     * </p>
     * <p>
     * Only voice recordings are supported at this time.
     * </p>
     * 
     * @param stopContactRecordingRequest
     * @return Result of the StopContactRecording operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.StopContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContactRecording" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopContactRecordingResult stopContactRecording(StopContactRecordingRequest request) {
        request = beforeClientExecution(request);
        return executeStopContactRecording(request);
    }

    @SdkInternalApi
    final StopContactRecordingResult executeStopContactRecording(StopContactRecordingRequest stopContactRecordingRequest) {

        ExecutionContext executionContext = createExecutionContext(stopContactRecordingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopContactRecordingRequest> request = null;
        Response<StopContactRecordingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopContactRecordingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopContactRecordingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopContactRecording");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopContactRecordingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopContactRecordingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Ends message streaming on a specified contact. To restart message streaming on that contact, call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_StartContactStreaming.html"
     * >StartContactStreaming</a> API.
     * </p>
     * 
     * @param stopContactStreamingRequest
     * @return Result of the StopContactStreaming operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.StopContactStreaming
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StopContactStreaming" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopContactStreamingResult stopContactStreaming(StopContactStreamingRequest request) {
        request = beforeClientExecution(request);
        return executeStopContactStreaming(request);
    }

    @SdkInternalApi
    final StopContactStreamingResult executeStopContactStreaming(StopContactStreamingRequest stopContactStreamingRequest) {

        ExecutionContext executionContext = createExecutionContext(stopContactStreamingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopContactStreamingRequest> request = null;
        Response<StopContactStreamingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopContactStreamingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopContactStreamingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopContactStreaming");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopContactStreamingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopContactStreamingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Submits a contact evaluation in the specified Amazon Connect instance. Answers included in the request are merged
     * with existing answers for the given evaluation. If no answers or notes are passed, the evaluation is submitted
     * with the existing answers and notes. You can delete an answer or note by passing an empty object (<code>{}</code>
     * ) to the question identifier.
     * </p>
     * <p>
     * If a contact evaluation is already in submitted state, this operation will trigger a resubmission.
     * </p>
     * 
     * @param submitContactEvaluationRequest
     * @return Result of the SubmitContactEvaluation operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.SubmitContactEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SubmitContactEvaluation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SubmitContactEvaluationResult submitContactEvaluation(SubmitContactEvaluationRequest request) {
        request = beforeClientExecution(request);
        return executeSubmitContactEvaluation(request);
    }

    @SdkInternalApi
    final SubmitContactEvaluationResult executeSubmitContactEvaluation(SubmitContactEvaluationRequest submitContactEvaluationRequest) {

        ExecutionContext executionContext = createExecutionContext(submitContactEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubmitContactEvaluationRequest> request = null;
        Response<SubmitContactEvaluationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubmitContactEvaluationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(submitContactEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SubmitContactEvaluation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SubmitContactEvaluationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SubmitContactEvaluationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * When a contact is being recorded, this API suspends recording whatever is selected in the flow configuration:
     * call, screen, or both. If only call recording or only screen recording is enabled, then it would be suspended.
     * For example, you might suspend the screen recording while collecting sensitive information, such as a credit card
     * number. Then use ResumeContactRecording to restart recording the screen.
     * </p>
     * <p>
     * The period of time that the recording is suspended is filled with silence in the final recording.
     * </p>
     * <p>
     * Voice and screen recordings are supported.
     * </p>
     * 
     * @param suspendContactRecordingRequest
     * @return Result of the SuspendContactRecording operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.SuspendContactRecording
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SuspendContactRecording"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SuspendContactRecordingResult suspendContactRecording(SuspendContactRecordingRequest request) {
        request = beforeClientExecution(request);
        return executeSuspendContactRecording(request);
    }

    @SdkInternalApi
    final SuspendContactRecordingResult executeSuspendContactRecording(SuspendContactRecordingRequest suspendContactRecordingRequest) {

        ExecutionContext executionContext = createExecutionContext(suspendContactRecordingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SuspendContactRecordingRequest> request = null;
        Response<SuspendContactRecordingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SuspendContactRecordingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(suspendContactRecordingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SuspendContactRecording");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SuspendContactRecordingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SuspendContactRecordingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified tags to the contact resource. For more information about this API is used, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/granular-billing.html">Set up granular billing for a
     * detailed view of your Amazon Connect usage</a>.
     * </p>
     * 
     * @param tagContactRequest
     * @return Result of the TagContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.TagContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TagContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagContactResult tagContact(TagContactRequest request) {
        request = beforeClientExecution(request);
        return executeTagContact(request);
    }

    @SdkInternalApi
    final TagContactResult executeTagContact(TagContactRequest tagContactRequest) {

        ExecutionContext executionContext = createExecutionContext(tagContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagContactRequest> request = null;
        Response<TagContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagContactResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * <p>
     * Some of the supported resource types are agents, routing profiles, queues, quick connects, contact flows, agent
     * statuses, hours of operation, phone numbers, security profiles, and task templates. For a complete list, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/tagging.html">Tagging resources in Amazon
     * Connect</a>.
     * </p>
     * <p>
     * For sample policies that use tags, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_id-based-policy-examples.html">Amazon
     * Connect Identity-Based Policy Examples</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TagResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
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
     * Transfers contacts from one agent or queue to another agent or queue at any point after a contact is created. You
     * can transfer a contact to another queue by providing the flow which orchestrates the contact to the destination
     * queue. This gives you more control over contact handling and helps you adhere to the service level agreement
     * (SLA) guaranteed to your customers.
     * </p>
     * <p>
     * Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Transfer is supported for only <code>TASK</code> contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use both <code>QueueId</code> and <code>UserId</code> in the same call.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following flow types are supported: Inbound flow, Transfer to agent flow, and Transfer to queue flow.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>TransferContact</code> API can be called only on active contacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * A contact cannot be transferred more than 11 times.
     * </p>
     * </li>
     * </ul>
     * 
     * @param transferContactRequest
     * @return Result of the TransferContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.TransferContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TransferContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TransferContactResult transferContact(TransferContactRequest request) {
        request = beforeClientExecution(request);
        return executeTransferContact(request);
    }

    @SdkInternalApi
    final TransferContactResult executeTransferContact(TransferContactRequest transferContactRequest) {

        ExecutionContext executionContext = createExecutionContext(transferContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TransferContactRequest> request = null;
        Response<TransferContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TransferContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(transferContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TransferContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TransferContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TransferContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified tags from the contact resource. For more information about this API is used, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/granular-billing.html">Set up granular billing for a
     * detailed view of your Amazon Connect usage</a>.
     * </p>
     * 
     * @param untagContactRequest
     * @return Result of the UntagContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.UntagContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UntagContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagContactResult untagContact(UntagContactRequest request) {
        request = beforeClientExecution(request);
        return executeUntagContact(request);
    }

    @SdkInternalApi
    final UntagContactResult executeUntagContact(UntagContactRequest untagContactRequest) {

        ExecutionContext executionContext = createExecutionContext(untagContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagContactRequest> request = null;
        Response<UntagContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UntagResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
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
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates agent status.
     * </p>
     * 
     * @param updateAgentStatusRequest
     * @return Result of the UpdateAgentStatus operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateAgentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateAgentStatus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAgentStatusResult updateAgentStatus(UpdateAgentStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAgentStatus(request);
    }

    @SdkInternalApi
    final UpdateAgentStatusResult executeUpdateAgentStatus(UpdateAgentStatusRequest updateAgentStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAgentStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAgentStatusRequest> request = null;
        Response<UpdateAgentStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAgentStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAgentStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAgentStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAgentStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAgentStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Adds or updates user-defined contact information associated with the specified contact. At least one field to be
     * updated must be present in the request.
     * </p>
     * <important>
     * <p>
     * You can add or update user-defined contact information for both ongoing and completed contacts.
     * </p>
     * </important>
     * 
     * @param updateContactRequest
     * @return Result of the UpdateContact operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContact" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
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
     * Creates or updates user-defined contact attributes associated with the specified contact.
     * </p>
     * <p>
     * You can create or update user-defined attributes for both ongoing and completed contacts. For example, while the
     * call is active, you can update the customer's name or the reason the customer called. You can add notes about
     * steps that the agent took during the call that display to the next agent that takes the call. You can also update
     * attributes for a contact using data from your CRM application and save the data with the contact in Amazon
     * Connect. You could also flag calls for additional analysis, such as legal review or to identify abusive callers.
     * </p>
     * <p>
     * Contact attributes are available in Amazon Connect for 24 months, and are then deleted. For information about
     * contact record retention and the maximum size of the contact record attributes section, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param updateContactAttributesRequest
     * @return Result of the UpdateContactAttributes operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Updates details about a contact evaluation in the specified Amazon Connect instance. A contact evaluation must be
     * in draft state. Answers included in the request are merged with existing answers for the given evaluation. An
     * answer or note can be deleted by passing an empty object (<code>{}</code>) to the question identifier.
     * </p>
     * 
     * @param updateContactEvaluationRequest
     * @return Result of the UpdateContactEvaluation operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.UpdateContactEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactEvaluation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateContactEvaluationResult updateContactEvaluation(UpdateContactEvaluationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContactEvaluation(request);
    }

    @SdkInternalApi
    final UpdateContactEvaluationResult executeUpdateContactEvaluation(UpdateContactEvaluationRequest updateContactEvaluationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContactEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactEvaluationRequest> request = null;
        Response<UpdateContactEvaluationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactEvaluationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateContactEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContactEvaluation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContactEvaluationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateContactEvaluationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * <p>
     * Use the <code>$SAVED</code> alias in the request to describe the <code>SAVED</code> content of a Flow. For
     * example, <code>arn:aws:.../contact-flow/{id}:$SAVED</code>. Once a contact flow is published, <code>$SAVED</code>
     * needs to be supplied to view saved content that has not been published.
     * </p>
     * 
     * @param updateContactFlowContentRequest
     * @return Result of the UpdateContactFlowContent operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidContactFlowException
     *         The flow is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateContactFlowContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateContactFlowContentResult updateContactFlowContent(UpdateContactFlowContentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContactFlowContent(request);
    }

    @SdkInternalApi
    final UpdateContactFlowContentResult executeUpdateContactFlowContent(UpdateContactFlowContentRequest updateContactFlowContentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContactFlowContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactFlowContentRequest> request = null;
        Response<UpdateContactFlowContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactFlowContentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateContactFlowContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContactFlowContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContactFlowContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateContactFlowContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates metadata about specified flow.
     * </p>
     * 
     * @param updateContactFlowMetadataRequest
     * @return Result of the UpdateContactFlowMetadata operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateContactFlowMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateContactFlowMetadataResult updateContactFlowMetadata(UpdateContactFlowMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContactFlowMetadata(request);
    }

    @SdkInternalApi
    final UpdateContactFlowMetadataResult executeUpdateContactFlowMetadata(UpdateContactFlowMetadataRequest updateContactFlowMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContactFlowMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactFlowMetadataRequest> request = null;
        Response<UpdateContactFlowMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactFlowMetadataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateContactFlowMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContactFlowMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContactFlowMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateContactFlowMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates specified flow module for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <code>$SAVED</code> alias in the request to describe the <code>SAVED</code> content of a Flow. For
     * example, <code>arn:aws:.../contact-flow/{id}:$SAVED</code>. Once a contact flow is published, <code>$SAVED</code>
     * needs to be supplied to view saved content that has not been published.
     * </p>
     * 
     * @param updateContactFlowModuleContentRequest
     * @return Result of the UpdateContactFlowModuleContent operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidContactFlowModuleException
     *         The problems with the module. Please fix before trying again.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateContactFlowModuleContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowModuleContent"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateContactFlowModuleContentResult updateContactFlowModuleContent(UpdateContactFlowModuleContentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContactFlowModuleContent(request);
    }

    @SdkInternalApi
    final UpdateContactFlowModuleContentResult executeUpdateContactFlowModuleContent(UpdateContactFlowModuleContentRequest updateContactFlowModuleContentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContactFlowModuleContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactFlowModuleContentRequest> request = null;
        Response<UpdateContactFlowModuleContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactFlowModuleContentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateContactFlowModuleContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContactFlowModuleContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContactFlowModuleContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateContactFlowModuleContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates metadata about specified flow module.
     * </p>
     * 
     * @param updateContactFlowModuleMetadataRequest
     * @return Result of the UpdateContactFlowModuleMetadata operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateContactFlowModuleMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowModuleMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateContactFlowModuleMetadataResult updateContactFlowModuleMetadata(UpdateContactFlowModuleMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContactFlowModuleMetadata(request);
    }

    @SdkInternalApi
    final UpdateContactFlowModuleMetadataResult executeUpdateContactFlowModuleMetadata(
            UpdateContactFlowModuleMetadataRequest updateContactFlowModuleMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContactFlowModuleMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactFlowModuleMetadataRequest> request = null;
        Response<UpdateContactFlowModuleMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactFlowModuleMetadataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateContactFlowModuleMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContactFlowModuleMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContactFlowModuleMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateContactFlowModuleMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The name of the flow.
     * </p>
     * <p>
     * You can also create and update flows using the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/flow-language.html">Amazon Connect Flow
     * language</a>.
     * </p>
     * 
     * @param updateContactFlowNameRequest
     * @return Result of the UpdateContactFlowName operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateContactFlowName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowName" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateContactFlowNameResult updateContactFlowName(UpdateContactFlowNameRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContactFlowName(request);
    }

    @SdkInternalApi
    final UpdateContactFlowNameResult executeUpdateContactFlowName(UpdateContactFlowNameRequest updateContactFlowNameRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContactFlowNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactFlowNameRequest> request = null;
        Response<UpdateContactFlowNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactFlowNameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateContactFlowNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContactFlowName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContactFlowNameResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateContactFlowNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates routing priority and age on the contact (<b>QueuePriority</b> and <b>QueueTimeAdjustmentInSeconds</b>).
     * These properties can be used to change a customer's position in the queue. For example, you can move a contact to
     * the back of the queue by setting a lower routing priority relative to other contacts in queue; or you can move a
     * contact to the front of the queue by increasing the routing age which will make the contact look artificially
     * older and therefore higher up in the first-in-first-out routing order. Note that adjusting the routing age of a
     * contact affects only its position in queue, and not its actual queue wait time as reported through metrics. These
     * properties can also be updated by using <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/change-routing-priority.html">the Set routing
     * priority / age flow block</a>.
     * </p>
     * 
     * @param updateContactRoutingDataRequest
     * @return Result of the UpdateContactRoutingData operation returned by the service.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.UpdateContactRoutingData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactRoutingData"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateContactRoutingDataResult updateContactRoutingData(UpdateContactRoutingDataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContactRoutingData(request);
    }

    @SdkInternalApi
    final UpdateContactRoutingDataResult executeUpdateContactRoutingData(UpdateContactRoutingDataRequest updateContactRoutingDataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContactRoutingDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactRoutingDataRequest> request = null;
        Response<UpdateContactRoutingDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactRoutingDataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateContactRoutingDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContactRoutingData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContactRoutingDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateContactRoutingDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the scheduled time of a task contact that is already scheduled.
     * </p>
     * 
     * @param updateContactScheduleRequest
     * @return Result of the UpdateContactSchedule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws LimitExceededException
     *         The allowed limit for the resource has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateContactSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateContactScheduleResult updateContactSchedule(UpdateContactScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContactSchedule(request);
    }

    @SdkInternalApi
    final UpdateContactScheduleResult executeUpdateContactSchedule(UpdateContactScheduleRequest updateContactScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContactScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactScheduleRequest> request = null;
        Response<UpdateContactScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateContactScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContactSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContactScheduleResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateContactScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates details about a specific evaluation form version in the specified Amazon Connect instance. Question and
     * section identifiers cannot be duplicated within the same evaluation form.
     * </p>
     * <p>
     * This operation does not support partial updates. Instead it does a full update of evaluation form content.
     * </p>
     * 
     * @param updateEvaluationFormRequest
     * @return Result of the UpdateEvaluationForm operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.UpdateEvaluationForm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateEvaluationForm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateEvaluationFormResult updateEvaluationForm(UpdateEvaluationFormRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEvaluationForm(request);
    }

    @SdkInternalApi
    final UpdateEvaluationFormResult executeUpdateEvaluationForm(UpdateEvaluationFormRequest updateEvaluationFormRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEvaluationFormRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEvaluationFormRequest> request = null;
        Response<UpdateEvaluationFormResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEvaluationFormRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEvaluationFormRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEvaluationForm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEvaluationFormResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEvaluationFormResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the hours of operation.
     * </p>
     * 
     * @param updateHoursOfOperationRequest
     * @return Result of the UpdateHoursOfOperation operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateHoursOfOperation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateHoursOfOperationResult updateHoursOfOperation(UpdateHoursOfOperationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateHoursOfOperation(request);
    }

    @SdkInternalApi
    final UpdateHoursOfOperationResult executeUpdateHoursOfOperation(UpdateHoursOfOperationRequest updateHoursOfOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateHoursOfOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateHoursOfOperationRequest> request = null;
        Response<UpdateHoursOfOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateHoursOfOperationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateHoursOfOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateHoursOfOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateHoursOfOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateHoursOfOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the value for the specified attribute type.
     * </p>
     * 
     * @param updateInstanceAttributeRequest
     * @return Result of the UpdateInstanceAttribute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.UpdateInstanceAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateInstanceAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateInstanceAttributeResult updateInstanceAttribute(UpdateInstanceAttributeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInstanceAttribute(request);
    }

    @SdkInternalApi
    final UpdateInstanceAttributeResult executeUpdateInstanceAttribute(UpdateInstanceAttributeRequest updateInstanceAttributeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInstanceAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInstanceAttributeRequest> request = null;
        Response<UpdateInstanceAttributeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInstanceAttributeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateInstanceAttributeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInstanceAttribute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInstanceAttributeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateInstanceAttributeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates an existing configuration for a resource type. This API is idempotent.
     * </p>
     * 
     * @param updateInstanceStorageConfigRequest
     * @return Result of the UpdateInstanceStorageConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @sample AmazonConnect.UpdateInstanceStorageConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateInstanceStorageConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateInstanceStorageConfigResult updateInstanceStorageConfig(UpdateInstanceStorageConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInstanceStorageConfig(request);
    }

    @SdkInternalApi
    final UpdateInstanceStorageConfigResult executeUpdateInstanceStorageConfig(UpdateInstanceStorageConfigRequest updateInstanceStorageConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInstanceStorageConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInstanceStorageConfigRequest> request = null;
        Response<UpdateInstanceStorageConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInstanceStorageConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateInstanceStorageConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInstanceStorageConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInstanceStorageConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateInstanceStorageConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates timeouts for when human chat participants are to be considered idle, and when agents are automatically
     * disconnected from a chat due to idleness. You can set four timers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Customer idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Customer auto-disconnect timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent idle timeout
     * </p>
     * </li>
     * <li>
     * <p>
     * Agent auto-disconnect timeout
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how chat timeouts work, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/setup-chat-timeouts.html">Set up chat timeouts for
     * human participants</a>.
     * </p>
     * 
     * @param updateParticipantRoleConfigRequest
     * @return Result of the UpdateParticipantRoleConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateParticipantRoleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateParticipantRoleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateParticipantRoleConfigResult updateParticipantRoleConfig(UpdateParticipantRoleConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateParticipantRoleConfig(request);
    }

    @SdkInternalApi
    final UpdateParticipantRoleConfigResult executeUpdateParticipantRoleConfig(UpdateParticipantRoleConfigRequest updateParticipantRoleConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateParticipantRoleConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateParticipantRoleConfigRequest> request = null;
        Response<UpdateParticipantRoleConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateParticipantRoleConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateParticipantRoleConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateParticipantRoleConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateParticipantRoleConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateParticipantRoleConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates your claimed phone number from its current Amazon Connect instance or traffic distribution group to
     * another Amazon Connect instance or traffic distribution group in the same Amazon Web Services Region.
     * </p>
     * <important>
     * <p>
     * After using this API, you must verify that the phone number is attached to the correct flow in the target
     * instance or traffic distribution group. You need to do this because the API switches only the phone number to a
     * new instance or traffic distribution group. It doesn't migrate the flow configuration of the phone number, too.
     * </p>
     * <p>
     * You can call <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html">DescribePhoneNumber
     * </a> API to verify the status of a previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation.
     * </p>
     * </important>
     * 
     * @param updatePhoneNumberRequest
     * @return Result of the UpdatePhoneNumber operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @sample AmazonConnect.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdatePhoneNumber" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
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
     * Updates a phone number’s metadata.
     * </p>
     * <important>
     * <p>
     * To verify the status of a previous UpdatePhoneNumberMetadata operation, call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> API.
     * </p>
     * </important>
     * 
     * @param updatePhoneNumberMetadataRequest
     * @return Result of the UpdatePhoneNumberMetadata operation returned by the service.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws IdempotencyException
     *         An entity with the same name already exists.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdatePhoneNumberMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdatePhoneNumberMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePhoneNumberMetadataResult updatePhoneNumberMetadata(UpdatePhoneNumberMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePhoneNumberMetadata(request);
    }

    @SdkInternalApi
    final UpdatePhoneNumberMetadataResult executeUpdatePhoneNumberMetadata(UpdatePhoneNumberMetadataRequest updatePhoneNumberMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePhoneNumberMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePhoneNumberMetadataRequest> request = null;
        Response<UpdatePhoneNumberMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePhoneNumberMetadataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updatePhoneNumberMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePhoneNumberMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePhoneNumberMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdatePhoneNumberMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a predefined attribute for the specified Amazon Connect instance.
     * </p>
     * 
     * @param updatePredefinedAttributeRequest
     * @return Result of the UpdatePredefinedAttribute operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdatePredefinedAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdatePredefinedAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePredefinedAttributeResult updatePredefinedAttribute(UpdatePredefinedAttributeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePredefinedAttribute(request);
    }

    @SdkInternalApi
    final UpdatePredefinedAttributeResult executeUpdatePredefinedAttribute(UpdatePredefinedAttributeRequest updatePredefinedAttributeRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePredefinedAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePredefinedAttributeRequest> request = null;
        Response<UpdatePredefinedAttributeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePredefinedAttributeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updatePredefinedAttributeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePredefinedAttribute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePredefinedAttributeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdatePredefinedAttributeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a prompt.
     * </p>
     * 
     * @param updatePromptRequest
     * @return Result of the UpdatePrompt operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdatePrompt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdatePrompt" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePromptResult updatePrompt(UpdatePromptRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePrompt(request);
    }

    @SdkInternalApi
    final UpdatePromptResult executeUpdatePrompt(UpdatePromptRequest updatePromptRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePromptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePromptRequest> request = null;
        Response<UpdatePromptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePromptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePromptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePrompt");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePromptResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePromptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the hours of operation for the specified queue.
     * </p>
     * 
     * @param updateQueueHoursOfOperationRequest
     * @return Result of the UpdateQueueHoursOfOperation operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQueueHoursOfOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueHoursOfOperation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateQueueHoursOfOperationResult updateQueueHoursOfOperation(UpdateQueueHoursOfOperationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQueueHoursOfOperation(request);
    }

    @SdkInternalApi
    final UpdateQueueHoursOfOperationResult executeUpdateQueueHoursOfOperation(UpdateQueueHoursOfOperationRequest updateQueueHoursOfOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQueueHoursOfOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQueueHoursOfOperationRequest> request = null;
        Response<UpdateQueueHoursOfOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQueueHoursOfOperationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateQueueHoursOfOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQueueHoursOfOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQueueHoursOfOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateQueueHoursOfOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the maximum number of contacts allowed in a queue before it is considered full.
     * </p>
     * 
     * @param updateQueueMaxContactsRequest
     * @return Result of the UpdateQueueMaxContacts operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQueueMaxContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueMaxContacts" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateQueueMaxContactsResult updateQueueMaxContacts(UpdateQueueMaxContactsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQueueMaxContacts(request);
    }

    @SdkInternalApi
    final UpdateQueueMaxContactsResult executeUpdateQueueMaxContacts(UpdateQueueMaxContactsRequest updateQueueMaxContactsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQueueMaxContactsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQueueMaxContactsRequest> request = null;
        Response<UpdateQueueMaxContactsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQueueMaxContactsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateQueueMaxContactsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQueueMaxContacts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQueueMaxContactsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateQueueMaxContactsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the name and description of a queue. At least <code>Name</code> or <code>Description</code> must be
     * provided.
     * </p>
     * 
     * @param updateQueueNameRequest
     * @return Result of the UpdateQueueName operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQueueName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueName" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateQueueNameResult updateQueueName(UpdateQueueNameRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQueueName(request);
    }

    @SdkInternalApi
    final UpdateQueueNameResult executeUpdateQueueName(UpdateQueueNameRequest updateQueueNameRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQueueNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQueueNameRequest> request = null;
        Response<UpdateQueueNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQueueNameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateQueueNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQueueName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQueueNameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateQueueNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the outbound caller ID name, number, and outbound whisper flow for a specified queue.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * If the phone number is claimed to a traffic distribution group that was created in the same Region as the Amazon
     * Connect instance where you are calling this API, then you can use a full phone number ARN or a UUID for
     * <code>OutboundCallerIdNumberId</code>. However, if the phone number is claimed to a traffic distribution group
     * that is in one Region, and you are calling this API from an instance in another Amazon Web Services Region that
     * is associated with the traffic distribution group, you must provide a full phone number ARN. If a UUID is
     * provided in this scenario, you will receive a <code>ResourceNotFoundException</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only use the phone number ARN format that doesn't contain <code>instance</code> in the path, for example,
     * <code>arn:aws:connect:us-east-1:1234567890:phone-number/uuid</code>. This is the same ARN format that is returned
     * when you call the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ListPhoneNumbersV2.html">ListPhoneNumbersV2</a>
     * API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you plan to use IAM policies to allow/deny access to this API for phone number resources claimed to a traffic
     * distribution group, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security_iam_resource-level-policy-examples.html#allow-deny-queue-actions-replica-region"
     * >Allow or Deny queue API actions for phone numbers in a replica Region</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param updateQueueOutboundCallerConfigRequest
     * @return Result of the UpdateQueueOutboundCallerConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQueueOutboundCallerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueOutboundCallerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateQueueOutboundCallerConfigResult updateQueueOutboundCallerConfig(UpdateQueueOutboundCallerConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQueueOutboundCallerConfig(request);
    }

    @SdkInternalApi
    final UpdateQueueOutboundCallerConfigResult executeUpdateQueueOutboundCallerConfig(
            UpdateQueueOutboundCallerConfigRequest updateQueueOutboundCallerConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQueueOutboundCallerConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQueueOutboundCallerConfigRequest> request = null;
        Response<UpdateQueueOutboundCallerConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQueueOutboundCallerConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateQueueOutboundCallerConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQueueOutboundCallerConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQueueOutboundCallerConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateQueueOutboundCallerConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is in preview release for Amazon Connect and is subject to change.
     * </p>
     * <p>
     * Updates the status of the queue.
     * </p>
     * 
     * @param updateQueueStatusRequest
     * @return Result of the UpdateQueueStatus operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQueueStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQueueStatus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateQueueStatusResult updateQueueStatus(UpdateQueueStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQueueStatus(request);
    }

    @SdkInternalApi
    final UpdateQueueStatusResult executeUpdateQueueStatus(UpdateQueueStatusRequest updateQueueStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQueueStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQueueStatusRequest> request = null;
        Response<UpdateQueueStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQueueStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateQueueStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQueueStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQueueStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateQueueStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration settings for the specified quick connect.
     * </p>
     * 
     * @param updateQuickConnectConfigRequest
     * @return Result of the UpdateQuickConnectConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQuickConnectConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQuickConnectConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateQuickConnectConfigResult updateQuickConnectConfig(UpdateQuickConnectConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQuickConnectConfig(request);
    }

    @SdkInternalApi
    final UpdateQuickConnectConfigResult executeUpdateQuickConnectConfig(UpdateQuickConnectConfigRequest updateQuickConnectConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQuickConnectConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQuickConnectConfigRequest> request = null;
        Response<UpdateQuickConnectConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQuickConnectConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateQuickConnectConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQuickConnectConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQuickConnectConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateQuickConnectConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the name and description of a quick connect. The request accepts the following data in JSON format. At
     * least <code>Name</code> or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateQuickConnectNameRequest
     * @return Result of the UpdateQuickConnectName operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateQuickConnectName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateQuickConnectName" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateQuickConnectNameResult updateQuickConnectName(UpdateQuickConnectNameRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQuickConnectName(request);
    }

    @SdkInternalApi
    final UpdateQuickConnectNameResult executeUpdateQuickConnectName(UpdateQuickConnectNameRequest updateQuickConnectNameRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQuickConnectNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQuickConnectNameRequest> request = null;
        Response<UpdateQuickConnectNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQuickConnectNameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateQuickConnectNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQuickConnectName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQuickConnectNameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateQuickConnectNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order calculated based on <i>time since their
     * last inbound contact</i> or <i>longest idle time</i>.
     * </p>
     * 
     * @param updateRoutingProfileAgentAvailabilityTimerRequest
     * @return Result of the UpdateRoutingProfileAgentAvailabilityTimer operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileAgentAvailabilityTimer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileAgentAvailabilityTimer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRoutingProfileAgentAvailabilityTimerResult updateRoutingProfileAgentAvailabilityTimer(UpdateRoutingProfileAgentAvailabilityTimerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoutingProfileAgentAvailabilityTimer(request);
    }

    @SdkInternalApi
    final UpdateRoutingProfileAgentAvailabilityTimerResult executeUpdateRoutingProfileAgentAvailabilityTimer(
            UpdateRoutingProfileAgentAvailabilityTimerRequest updateRoutingProfileAgentAvailabilityTimerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoutingProfileAgentAvailabilityTimerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoutingProfileAgentAvailabilityTimerRequest> request = null;
        Response<UpdateRoutingProfileAgentAvailabilityTimerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoutingProfileAgentAvailabilityTimerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRoutingProfileAgentAvailabilityTimerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoutingProfileAgentAvailabilityTimer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRoutingProfileAgentAvailabilityTimerResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateRoutingProfileAgentAvailabilityTimerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the channels that agents can handle in the Contact Control Panel (CCP) for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileConcurrencyRequest
     * @return Result of the UpdateRoutingProfileConcurrency operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileConcurrency"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRoutingProfileConcurrencyResult updateRoutingProfileConcurrency(UpdateRoutingProfileConcurrencyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoutingProfileConcurrency(request);
    }

    @SdkInternalApi
    final UpdateRoutingProfileConcurrencyResult executeUpdateRoutingProfileConcurrency(
            UpdateRoutingProfileConcurrencyRequest updateRoutingProfileConcurrencyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoutingProfileConcurrencyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoutingProfileConcurrencyRequest> request = null;
        Response<UpdateRoutingProfileConcurrencyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoutingProfileConcurrencyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRoutingProfileConcurrencyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoutingProfileConcurrency");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRoutingProfileConcurrencyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRoutingProfileConcurrencyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the default outbound queue of a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileDefaultOutboundQueueRequest
     * @return Result of the UpdateRoutingProfileDefaultOutboundQueue operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileDefaultOutboundQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileDefaultOutboundQueue"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRoutingProfileDefaultOutboundQueueResult updateRoutingProfileDefaultOutboundQueue(UpdateRoutingProfileDefaultOutboundQueueRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoutingProfileDefaultOutboundQueue(request);
    }

    @SdkInternalApi
    final UpdateRoutingProfileDefaultOutboundQueueResult executeUpdateRoutingProfileDefaultOutboundQueue(
            UpdateRoutingProfileDefaultOutboundQueueRequest updateRoutingProfileDefaultOutboundQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoutingProfileDefaultOutboundQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoutingProfileDefaultOutboundQueueRequest> request = null;
        Response<UpdateRoutingProfileDefaultOutboundQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoutingProfileDefaultOutboundQueueRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRoutingProfileDefaultOutboundQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoutingProfileDefaultOutboundQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRoutingProfileDefaultOutboundQueueResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateRoutingProfileDefaultOutboundQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the name and description of a routing profile. The request accepts the following data in JSON format. At
     * least <code>Name</code> or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateRoutingProfileNameRequest
     * @return Result of the UpdateRoutingProfileName operation returned by the service.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileName"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRoutingProfileNameResult updateRoutingProfileName(UpdateRoutingProfileNameRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoutingProfileName(request);
    }

    @SdkInternalApi
    final UpdateRoutingProfileNameResult executeUpdateRoutingProfileName(UpdateRoutingProfileNameRequest updateRoutingProfileNameRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoutingProfileNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoutingProfileNameRequest> request = null;
        Response<UpdateRoutingProfileNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoutingProfileNameRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRoutingProfileNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoutingProfileName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRoutingProfileNameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRoutingProfileNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the properties associated with a set of queues for a routing profile.
     * </p>
     * 
     * @param updateRoutingProfileQueuesRequest
     * @return Result of the UpdateRoutingProfileQueues operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateRoutingProfileQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileQueues"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRoutingProfileQueuesResult updateRoutingProfileQueues(UpdateRoutingProfileQueuesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoutingProfileQueues(request);
    }

    @SdkInternalApi
    final UpdateRoutingProfileQueuesResult executeUpdateRoutingProfileQueues(UpdateRoutingProfileQueuesRequest updateRoutingProfileQueuesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoutingProfileQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoutingProfileQueuesRequest> request = null;
        Response<UpdateRoutingProfileQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoutingProfileQueuesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRoutingProfileQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoutingProfileQueues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRoutingProfileQueuesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRoutingProfileQueuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a rule for the specified Amazon Connect instance.
     * </p>
     * <p>
     * Use the <a href="https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html">Rules
     * Function language</a> to code conditions for the rule.
     * </p>
     * 
     * @param updateRuleRequest
     * @return Result of the UpdateRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @sample AmazonConnect.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRuleResult updateRule(UpdateRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRule(request);
    }

    @SdkInternalApi
    final UpdateRuleResult executeUpdateRule(UpdateRuleRequest updateRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleRequest> request = null;
        Response<UpdateRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRuleResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a security profile.
     * </p>
     * 
     * @param updateSecurityProfileRequest
     * @return Result of the UpdateSecurityProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateSecurityProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateSecurityProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateSecurityProfileResult updateSecurityProfile(UpdateSecurityProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSecurityProfile(request);
    }

    @SdkInternalApi
    final UpdateSecurityProfileResult executeUpdateSecurityProfile(UpdateSecurityProfileRequest updateSecurityProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSecurityProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSecurityProfileRequest> request = null;
        Response<UpdateSecurityProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSecurityProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSecurityProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSecurityProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSecurityProfileResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateSecurityProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates details about a specific task template in the specified Amazon Connect instance. This operation does not
     * support partial updates. Instead it does a full update of template content.
     * </p>
     * 
     * @param updateTaskTemplateRequest
     * @return Result of the UpdateTaskTemplate operation returned by the service.
     * @throws PropertyValidationException
     *         The property is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateTaskTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateTaskTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTaskTemplateResult updateTaskTemplate(UpdateTaskTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTaskTemplate(request);
    }

    @SdkInternalApi
    final UpdateTaskTemplateResult executeUpdateTaskTemplate(UpdateTaskTemplateRequest updateTaskTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTaskTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTaskTemplateRequest> request = null;
        Response<UpdateTaskTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTaskTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTaskTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTaskTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTaskTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTaskTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the traffic distribution for a given traffic distribution group.
     * </p>
     * <note>
     * <p>
     * The <code>SignInConfig</code> distribution is available only on a default <code>TrafficDistributionGroup</code>
     * (see the <code>IsDefault</code> parameter in the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_TrafficDistributionGroup.html"
     * >TrafficDistributionGroup</a> data type). If you call <code>UpdateTrafficDistribution</code> with a modified
     * <code>SignInConfig</code> and a non-default <code>TrafficDistributionGroup</code>, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * </note>
     * <p>
     * For more information about updating a traffic distribution group, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/update-telephony-traffic-distribution.html">Update
     * telephony traffic distribution across Amazon Web Services Regions </a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * 
     * @param updateTrafficDistributionRequest
     * @return Result of the UpdateTrafficDistribution operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceConflictException
     *         A resource already has that name.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateTrafficDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateTrafficDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateTrafficDistributionResult updateTrafficDistribution(UpdateTrafficDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTrafficDistribution(request);
    }

    @SdkInternalApi
    final UpdateTrafficDistributionResult executeUpdateTrafficDistribution(UpdateTrafficDistributionRequest updateTrafficDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTrafficDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrafficDistributionRequest> request = null;
        Response<UpdateTrafficDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrafficDistributionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateTrafficDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTrafficDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTrafficDistributionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateTrafficDistributionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns the specified hierarchy group to the specified user.
     * </p>
     * 
     * @param updateUserHierarchyRequest
     * @return Result of the UpdateUserHierarchy operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Updates the name of the user hierarchy group.
     * </p>
     * 
     * @param updateUserHierarchyGroupNameRequest
     * @return Result of the UpdateUserHierarchyGroupName operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateUserHierarchyGroupName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchyGroupName"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateUserHierarchyGroupNameResult updateUserHierarchyGroupName(UpdateUserHierarchyGroupNameRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserHierarchyGroupName(request);
    }

    @SdkInternalApi
    final UpdateUserHierarchyGroupNameResult executeUpdateUserHierarchyGroupName(UpdateUserHierarchyGroupNameRequest updateUserHierarchyGroupNameRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserHierarchyGroupNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserHierarchyGroupNameRequest> request = null;
        Response<UpdateUserHierarchyGroupNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserHierarchyGroupNameRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateUserHierarchyGroupNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserHierarchyGroupName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserHierarchyGroupNameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateUserHierarchyGroupNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the user hierarchy structure: add, remove, and rename user hierarchy levels.
     * </p>
     * 
     * @param updateUserHierarchyStructureRequest
     * @return Result of the UpdateUserHierarchyStructure operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateUserHierarchyStructure
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserHierarchyStructure"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateUserHierarchyStructureResult updateUserHierarchyStructure(UpdateUserHierarchyStructureRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserHierarchyStructure(request);
    }

    @SdkInternalApi
    final UpdateUserHierarchyStructureResult executeUpdateUserHierarchyStructure(UpdateUserHierarchyStructureRequest updateUserHierarchyStructureRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserHierarchyStructureRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserHierarchyStructureRequest> request = null;
        Response<UpdateUserHierarchyStructureResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserHierarchyStructureRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateUserHierarchyStructureRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserHierarchyStructure");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserHierarchyStructureResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateUserHierarchyStructureResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the identity information for the specified user.
     * </p>
     * <important>
     * <p>
     * We strongly recommend limiting who has the ability to invoke <code>UpdateUserIdentityInfo</code>. Someone with
     * that ability can change the login credentials of other users by changing their email address. This poses a
     * security risk to your organization. They can change the email address of a user to the attacker's email address,
     * and then reset the password through email. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html">Best Practices
     * for Security Profiles</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </important>
     * 
     * @param updateUserIdentityInfoRequest
     * @return Result of the UpdateUserIdentityInfo operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Updates the phone configuration settings for the specified user.
     * </p>
     * 
     * @param updateUserPhoneConfigRequest
     * @return Result of the UpdateUserPhoneConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Updates the properties associated with the proficiencies of a user.
     * </p>
     * 
     * @param updateUserProficienciesRequest
     * @return Result of the UpdateUserProficiencies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @sample AmazonConnect.UpdateUserProficiencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserProficiencies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateUserProficienciesResult updateUserProficiencies(UpdateUserProficienciesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUserProficiencies(request);
    }

    @SdkInternalApi
    final UpdateUserProficienciesResult executeUpdateUserProficiencies(UpdateUserProficienciesRequest updateUserProficienciesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserProficienciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserProficienciesRequest> request = null;
        Response<UpdateUserProficienciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserProficienciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateUserProficienciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUserProficiencies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserProficienciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateUserProficienciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns the specified routing profile to the specified user.
     * </p>
     * 
     * @param updateUserRoutingProfileRequest
     * @return Result of the UpdateUserRoutingProfile operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Assigns the specified security profiles to the specified user.
     * </p>
     * 
     * @param updateUserSecurityProfilesRequest
     * @return Result of the UpdateUserSecurityProfiles operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ThrottlingException
     *         The throttling limit has been exceeded.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <p>
     * Updates the view content of the given view identifier in the specified Amazon Connect instance.
     * </p>
     * <p>
     * It performs content validation if <code>Status</code> is set to <code>SAVED</code> and performs full content
     * validation if <code>Status</code> is <code>PUBLISHED</code>. Note that the <code>$SAVED</code> alias' content
     * will always be updated, but the <code>$LATEST</code> alias' content will only be updated if <code>Status</code>
     * is <code>PUBLISHED</code>.
     * </p>
     * 
     * @param updateViewContentRequest
     * @return Result of the UpdateViewContent operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.UpdateViewContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateViewContent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateViewContentResult updateViewContent(UpdateViewContentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateViewContent(request);
    }

    @SdkInternalApi
    final UpdateViewContentResult executeUpdateViewContent(UpdateViewContentRequest updateViewContentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateViewContentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateViewContentRequest> request = null;
        Response<UpdateViewContentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateViewContentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateViewContentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateViewContent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateViewContentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateViewContentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the view metadata. Note that either <code>Name</code> or <code>Description</code> must be provided.
     * </p>
     * 
     * @param updateViewMetadataRequest
     * @return Result of the UpdateViewMetadata operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws InvalidParameterException
     *         One or more of the specified parameters are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServiceException
     *         Request processing failed because of an error or failure with the service.
     * @throws TooManyRequestsException
     *         Displayed when rate-related API limits are exceeded.
     * @throws DuplicateResourceException
     *         A resource with the specified name already exists.
     * @throws ResourceInUseException
     *         That resource is already in use. Please try another.
     * @sample AmazonConnect.UpdateViewMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateViewMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateViewMetadataResult updateViewMetadata(UpdateViewMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateViewMetadata(request);
    }

    @SdkInternalApi
    final UpdateViewMetadataResult executeUpdateViewMetadata(UpdateViewMetadataRequest updateViewMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateViewMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateViewMetadataRequest> request = null;
        Response<UpdateViewMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateViewMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateViewMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateViewMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateViewMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateViewMetadataResultJsonUnmarshaller());
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
