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
package com.amazonaws.services.trustedadvisor;

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

import com.amazonaws.services.trustedadvisor.AWSTrustedAdvisorClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.trustedadvisor.model.*;

import com.amazonaws.services.trustedadvisor.model.transform.*;

/**
 * Client for accessing TrustedAdvisor Public API. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * TrustedAdvisor Public API
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSTrustedAdvisorClient extends AmazonWebServiceClient implements AWSTrustedAdvisor {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSTrustedAdvisor.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "trustedadvisor";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.trustedadvisor.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.trustedadvisor.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.trustedadvisor.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.trustedadvisor.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.trustedadvisor.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.trustedadvisor.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.trustedadvisor.model.AWSTrustedAdvisorException.class));

    public static AWSTrustedAdvisorClientBuilder builder() {
        return AWSTrustedAdvisorClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on TrustedAdvisor Public API using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSTrustedAdvisorClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on TrustedAdvisor Public API using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSTrustedAdvisorClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("trustedadvisor.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/trustedadvisor/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/trustedadvisor/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Update one or more exclusion status for a list of recommendation resources
     * </p>
     * 
     * @param batchUpdateRecommendationResourceExclusionRequest
     * @return Result of the BatchUpdateRecommendationResourceExclusion operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws ConflictException
     *         Exception that the request was denied due to conflictions in state
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.BatchUpdateRecommendationResourceExclusion
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/BatchUpdateRecommendationResourceExclusion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchUpdateRecommendationResourceExclusionResult batchUpdateRecommendationResourceExclusion(BatchUpdateRecommendationResourceExclusionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateRecommendationResourceExclusion(request);
    }

    @SdkInternalApi
    final BatchUpdateRecommendationResourceExclusionResult executeBatchUpdateRecommendationResourceExclusion(
            BatchUpdateRecommendationResourceExclusionRequest batchUpdateRecommendationResourceExclusionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateRecommendationResourceExclusionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateRecommendationResourceExclusionRequest> request = null;
        Response<BatchUpdateRecommendationResourceExclusionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateRecommendationResourceExclusionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchUpdateRecommendationResourceExclusionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "TrustedAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateRecommendationResourceExclusion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateRecommendationResourceExclusionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchUpdateRecommendationResourceExclusionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a specific recommendation within an AWS Organizations organization. This API supports only prioritized
     * recommendations.
     * </p>
     * 
     * @param getOrganizationRecommendationRequest
     * @return Result of the GetOrganizationRecommendation operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.GetOrganizationRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/GetOrganizationRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOrganizationRecommendationResult getOrganizationRecommendation(GetOrganizationRecommendationRequest request) {
        request = beforeClientExecution(request);
        return executeGetOrganizationRecommendation(request);
    }

    @SdkInternalApi
    final GetOrganizationRecommendationResult executeGetOrganizationRecommendation(GetOrganizationRecommendationRequest getOrganizationRecommendationRequest) {

        ExecutionContext executionContext = createExecutionContext(getOrganizationRecommendationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOrganizationRecommendationRequest> request = null;
        Response<GetOrganizationRecommendationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOrganizationRecommendationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getOrganizationRecommendationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "TrustedAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOrganizationRecommendation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOrganizationRecommendationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetOrganizationRecommendationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a specific Recommendation
     * </p>
     * 
     * @param getRecommendationRequest
     * @return Result of the GetRecommendation operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.GetRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/GetRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRecommendationResult getRecommendation(GetRecommendationRequest request) {
        request = beforeClientExecution(request);
        return executeGetRecommendation(request);
    }

    @SdkInternalApi
    final GetRecommendationResult executeGetRecommendation(GetRecommendationRequest getRecommendationRequest) {

        ExecutionContext executionContext = createExecutionContext(getRecommendationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecommendationRequest> request = null;
        Response<GetRecommendationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecommendationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRecommendationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "TrustedAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRecommendation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRecommendationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRecommendationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List a filterable set of Checks
     * </p>
     * 
     * @param listChecksRequest
     * @return Result of the ListChecks operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.ListChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListChecks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListChecksResult listChecks(ListChecksRequest request) {
        request = beforeClientExecution(request);
        return executeListChecks(request);
    }

    @SdkInternalApi
    final ListChecksResult executeListChecks(ListChecksRequest listChecksRequest) {

        ExecutionContext executionContext = createExecutionContext(listChecksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChecksRequest> request = null;
        Response<ListChecksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChecksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChecksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "TrustedAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChecks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChecksResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChecksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the accounts that own the resources for an organization aggregate recommendation. This API only supports
     * prioritized recommendations.
     * </p>
     * 
     * @param listOrganizationRecommendationAccountsRequest
     * @return Result of the ListOrganizationRecommendationAccounts operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.ListOrganizationRecommendationAccounts
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendationAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOrganizationRecommendationAccountsResult listOrganizationRecommendationAccounts(ListOrganizationRecommendationAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeListOrganizationRecommendationAccounts(request);
    }

    @SdkInternalApi
    final ListOrganizationRecommendationAccountsResult executeListOrganizationRecommendationAccounts(
            ListOrganizationRecommendationAccountsRequest listOrganizationRecommendationAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOrganizationRecommendationAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrganizationRecommendationAccountsRequest> request = null;
        Response<ListOrganizationRecommendationAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrganizationRecommendationAccountsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listOrganizationRecommendationAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "TrustedAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOrganizationRecommendationAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOrganizationRecommendationAccountsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListOrganizationRecommendationAccountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List Resources of a Recommendation within an Organization. This API only supports prioritized recommendations.
     * </p>
     * 
     * @param listOrganizationRecommendationResourcesRequest
     * @return Result of the ListOrganizationRecommendationResources operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.ListOrganizationRecommendationResources
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendationResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOrganizationRecommendationResourcesResult listOrganizationRecommendationResources(ListOrganizationRecommendationResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListOrganizationRecommendationResources(request);
    }

    @SdkInternalApi
    final ListOrganizationRecommendationResourcesResult executeListOrganizationRecommendationResources(
            ListOrganizationRecommendationResourcesRequest listOrganizationRecommendationResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listOrganizationRecommendationResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrganizationRecommendationResourcesRequest> request = null;
        Response<ListOrganizationRecommendationResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrganizationRecommendationResourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listOrganizationRecommendationResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "TrustedAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOrganizationRecommendationResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOrganizationRecommendationResourcesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListOrganizationRecommendationResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List a filterable set of Recommendations within an Organization. This API only supports prioritized
     * recommendations.
     * </p>
     * 
     * @param listOrganizationRecommendationsRequest
     * @return Result of the ListOrganizationRecommendations operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.ListOrganizationRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListOrganizationRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOrganizationRecommendationsResult listOrganizationRecommendations(ListOrganizationRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeListOrganizationRecommendations(request);
    }

    @SdkInternalApi
    final ListOrganizationRecommendationsResult executeListOrganizationRecommendations(
            ListOrganizationRecommendationsRequest listOrganizationRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOrganizationRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrganizationRecommendationsRequest> request = null;
        Response<ListOrganizationRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrganizationRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listOrganizationRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "TrustedAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOrganizationRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOrganizationRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListOrganizationRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List Resources of a Recommendation
     * </p>
     * 
     * @param listRecommendationResourcesRequest
     * @return Result of the ListRecommendationResources operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.ListRecommendationResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListRecommendationResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRecommendationResourcesResult listRecommendationResources(ListRecommendationResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListRecommendationResources(request);
    }

    @SdkInternalApi
    final ListRecommendationResourcesResult executeListRecommendationResources(ListRecommendationResourcesRequest listRecommendationResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecommendationResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecommendationResourcesRequest> request = null;
        Response<ListRecommendationResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecommendationResourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRecommendationResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "TrustedAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecommendationResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecommendationResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRecommendationResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List a filterable set of Recommendations
     * </p>
     * 
     * @param listRecommendationsRequest
     * @return Result of the ListRecommendations operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRecommendationsResult listRecommendations(ListRecommendationsRequest request) {
        request = beforeClientExecution(request);
        return executeListRecommendations(request);
    }

    @SdkInternalApi
    final ListRecommendationsResult executeListRecommendations(ListRecommendationsRequest listRecommendationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecommendationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecommendationsRequest> request = null;
        Response<ListRecommendationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecommendationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRecommendationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "TrustedAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecommendations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecommendationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRecommendationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the lifecycle of a Recommendation within an Organization. This API only supports prioritized
     * recommendations.
     * </p>
     * 
     * @param updateOrganizationRecommendationLifecycleRequest
     * @return Result of the UpdateOrganizationRecommendationLifecycle operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws ConflictException
     *         Exception that the request was denied due to conflictions in state
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.UpdateOrganizationRecommendationLifecycle
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/UpdateOrganizationRecommendationLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateOrganizationRecommendationLifecycleResult updateOrganizationRecommendationLifecycle(UpdateOrganizationRecommendationLifecycleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateOrganizationRecommendationLifecycle(request);
    }

    @SdkInternalApi
    final UpdateOrganizationRecommendationLifecycleResult executeUpdateOrganizationRecommendationLifecycle(
            UpdateOrganizationRecommendationLifecycleRequest updateOrganizationRecommendationLifecycleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateOrganizationRecommendationLifecycleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOrganizationRecommendationLifecycleRequest> request = null;
        Response<UpdateOrganizationRecommendationLifecycleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOrganizationRecommendationLifecycleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateOrganizationRecommendationLifecycleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "TrustedAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateOrganizationRecommendationLifecycle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateOrganizationRecommendationLifecycleResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateOrganizationRecommendationLifecycleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the lifecyle of a Recommendation. This API only supports prioritized recommendations.
     * </p>
     * 
     * @param updateRecommendationLifecycleRequest
     * @return Result of the UpdateRecommendationLifecycle operation returned by the service.
     * @throws AccessDeniedException
     *         Exception that access has been denied due to insufficient access
     * @throws ConflictException
     *         Exception that the request was denied due to conflictions in state
     * @throws InternalServerException
     *         Exception to notify that an unexpected internal error occurred during processing of the request
     * @throws ValidationException
     *         Exception that the request failed to satisfy service constraints
     * @throws ResourceNotFoundException
     *         Exception that the requested resource has not been found
     * @throws ThrottlingException
     *         Exception to notify that requests are being throttled
     * @sample AWSTrustedAdvisor.UpdateRecommendationLifecycle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/UpdateRecommendationLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRecommendationLifecycleResult updateRecommendationLifecycle(UpdateRecommendationLifecycleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRecommendationLifecycle(request);
    }

    @SdkInternalApi
    final UpdateRecommendationLifecycleResult executeUpdateRecommendationLifecycle(UpdateRecommendationLifecycleRequest updateRecommendationLifecycleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRecommendationLifecycleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRecommendationLifecycleRequest> request = null;
        Response<UpdateRecommendationLifecycleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRecommendationLifecycleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRecommendationLifecycleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "TrustedAdvisor");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRecommendationLifecycle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRecommendationLifecycleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRecommendationLifecycleResultJsonUnmarshaller());
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
