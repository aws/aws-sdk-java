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
package com.amazonaws.services.comprehendmedical;

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

import com.amazonaws.services.comprehendmedical.AWSComprehendMedicalClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.services.comprehendmedical.model.transform.*;

/**
 * Client for accessing ComprehendMedical. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Comprehend Medical extracts structured information from unstructured clinical text. Use these actions to gain insight
 * in your documents.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSComprehendMedicalClient extends AmazonWebServiceClient implements AWSComprehendMedical {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSComprehendMedical.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "comprehendmedical";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withModeledClass(
                                    com.amazonaws.services.comprehendmedical.model.InternalServerException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.comprehendmedical.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.comprehendmedical.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.comprehendmedical.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TextSizeLimitExceededException").withModeledClass(
                                    com.amazonaws.services.comprehendmedical.model.TextSizeLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEncodingException").withModeledClass(
                                    com.amazonaws.services.comprehendmedical.model.InvalidEncodingException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.comprehendmedical.model.AWSComprehendMedicalException.class));

    public static AWSComprehendMedicalClientBuilder builder() {
        return AWSComprehendMedicalClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on ComprehendMedical using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSComprehendMedicalClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on ComprehendMedical using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSComprehendMedicalClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("comprehendmedical.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/comprehendmedical/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/comprehendmedical/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Inspects the clinical text for a variety of medical entities and returns specific information about them such as
     * entity category, location, and confidence score on that information .
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return Result of the DetectEntities operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Comprehend Medical service is temporarily unavailable. Please wait and then retry your request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectEntities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DetectEntitiesResult detectEntities(DetectEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeDetectEntities(request);
    }

    @SdkInternalApi
    final DetectEntitiesResult executeDetectEntities(DetectEntitiesRequest detectEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(detectEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectEntitiesRequest> request = null;
        Response<DetectEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectEntitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectEntitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectEntitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Inspects the clinical text for personal health information (PHI) entities and entity category, location, and
     * confidence score on that information.
     * </p>
     * 
     * @param detectPHIRequest
     * @return Result of the DetectPHI operation returned by the service.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ServiceUnavailableException
     *         The Comprehend Medical service is temporarily unavailable. Please wait and then retry your request.
     * @throws TooManyRequestsException
     *         You have made too many requests within a short period of time. Wait for a short time and then try your
     *         request again. Contact customer support for more information about a service limit increase.
     * @throws InvalidRequestException
     *         The request that you made is invalid. Check your request to determine why it's invalid and then retry the
     *         request.
     * @throws InvalidEncodingException
     *         The input text was not in valid UTF-8 character encoding. Check your text then retry your request.
     * @throws TextSizeLimitExceededException
     *         The size of the text you submitted exceeds the size limit. Reduce the size of the text or use a smaller
     *         document and then retry your request.
     * @sample AWSComprehendMedical.DetectPHI
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/DetectPHI" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DetectPHIResult detectPHI(DetectPHIRequest request) {
        request = beforeClientExecution(request);
        return executeDetectPHI(request);
    }

    @SdkInternalApi
    final DetectPHIResult executeDetectPHI(DetectPHIRequest detectPHIRequest) {

        ExecutionContext executionContext = createExecutionContext(detectPHIRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectPHIRequest> request = null;
        Response<DetectPHIResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectPHIRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detectPHIRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ComprehendMedical");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectPHI");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetectPHIResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetectPHIResultJsonUnmarshaller());
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
