/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.honeycode;

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

import com.amazonaws.services.honeycode.AmazonHoneycodeClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.honeycode.model.*;
import com.amazonaws.services.honeycode.model.transform.*;

/**
 * Client for accessing Honeycode. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon Honeycode is a fully managed service that allows you to quickly build mobile and web apps for teams—without
 * programming. Build Honeycode apps for managing almost anything, like projects, customers, operations, approvals,
 * resources, and even your team.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonHoneycodeClient extends AmazonWebServiceClient implements AmazonHoneycode {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonHoneycode.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "honeycode";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.honeycode.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.honeycode.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.honeycode.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.honeycode.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AutomationExecutionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.honeycode.model.transform.AutomationExecutionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestTimeoutException").withExceptionUnmarshaller(
                                    com.amazonaws.services.honeycode.model.transform.RequestTimeoutExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.honeycode.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.honeycode.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AutomationExecutionTimeoutException").withExceptionUnmarshaller(
                                    com.amazonaws.services.honeycode.model.transform.AutomationExecutionTimeoutExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.honeycode.model.AmazonHoneycodeException.class));

    public static AmazonHoneycodeClientBuilder builder() {
        return AmazonHoneycodeClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Honeycode using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonHoneycodeClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Honeycode using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonHoneycodeClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("honeycode.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/honeycode/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/honeycode/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * The GetScreenData API allows retrieval of data from a screen in a Honeycode app. The API allows setting local
     * variables in the screen to filter, sort or otherwise affect what will be displayed on the screen.
     * </p>
     * 
     * @param getScreenDataRequest
     * @return Result of the GetScreenData operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the screen/automation in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @throws ResourceNotFoundException
     *         A Workbook, App, Screen or Screen Automation was not found with the given ID.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @sample AmazonHoneycode.GetScreenData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/GetScreenData" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetScreenDataResult getScreenData(GetScreenDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetScreenData(request);
    }

    @SdkInternalApi
    final GetScreenDataResult executeGetScreenData(GetScreenDataRequest getScreenDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getScreenDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetScreenDataRequest> request = null;
        Response<GetScreenDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetScreenDataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getScreenDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Honeycode");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetScreenData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetScreenDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetScreenDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The InvokeScreenAutomation API allows invoking an action defined in a screen in a Honeycode app. The API allows
     * setting local variables, which can then be used in the automation being invoked. This allows automating the
     * Honeycode app interactions to write, update or delete data in the workbook.
     * </p>
     * 
     * @param invokeScreenAutomationRequest
     * @return Result of the InvokeScreenAutomation operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the screen/automation in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws ResourceNotFoundException
     *         A Workbook, App, Screen or Screen Automation was not found with the given ID.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws AutomationExecutionException
     *         The automation execution did not end successfully.
     * @throws AutomationExecutionTimeoutException
     *         The automation execution timed out.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonHoneycode.InvokeScreenAutomation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/InvokeScreenAutomation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public InvokeScreenAutomationResult invokeScreenAutomation(InvokeScreenAutomationRequest request) {
        request = beforeClientExecution(request);
        return executeInvokeScreenAutomation(request);
    }

    @SdkInternalApi
    final InvokeScreenAutomationResult executeInvokeScreenAutomation(InvokeScreenAutomationRequest invokeScreenAutomationRequest) {

        ExecutionContext executionContext = createExecutionContext(invokeScreenAutomationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InvokeScreenAutomationRequest> request = null;
        Response<InvokeScreenAutomationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InvokeScreenAutomationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(invokeScreenAutomationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Honeycode");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InvokeScreenAutomation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InvokeScreenAutomationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new InvokeScreenAutomationResultJsonUnmarshaller());
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
