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
package com.amazonaws.services.costoptimizationhub;

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

import com.amazonaws.services.costoptimizationhub.AWSCostOptimizationHubClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.costoptimizationhub.model.*;

import com.amazonaws.services.costoptimizationhub.model.transform.*;

/**
 * Client for accessing Cost Optimization Hub. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * You can use the Cost Optimization Hub API to programmatically identify, filter, aggregate, and quantify savings for
 * your cost optimization recommendations across multiple Amazon Web Services Regions and Amazon Web Services accounts
 * in your organization.
 * </p>
 * <p>
 * The Cost Optimization Hub API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://cost-optimization-hub.us-east-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCostOptimizationHubClient extends AmazonWebServiceClient implements AWSCostOptimizationHub {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCostOptimizationHub.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cost-optimization-hub";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costoptimizationhub.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costoptimizationhub.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costoptimizationhub.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costoptimizationhub.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costoptimizationhub.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.costoptimizationhub.model.AWSCostOptimizationHubException.class));

    public static AWSCostOptimizationHubClientBuilder builder() {
        return AWSCostOptimizationHubClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Cost Optimization Hub using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCostOptimizationHubClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Cost Optimization Hub using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCostOptimizationHubClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("cost-optimization-hub.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/costoptimizationhub/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/costoptimizationhub/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns a set of preferences for an account in order to add account-specific preferences into the service. These
     * preferences impact how the savings associated with recommendations are presented—estimated savings after
     * discounts or estimated savings before discounts, for example.
     * </p>
     * 
     * @param getPreferencesRequest
     * @return Result of the GetPreferences operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.GetPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/GetPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPreferencesResult getPreferences(GetPreferencesRequest request) {
        request = beforeClientExecution(request);
        return executeGetPreferences(request);
    }

    @SdkInternalApi
    final GetPreferencesResult executeGetPreferences(GetPreferencesRequest getPreferencesRequest) {

        ExecutionContext executionContext = createExecutionContext(getPreferencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPreferencesRequest> request = null;
        Response<GetPreferencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPreferencesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPreferencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Optimization Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPreferences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPreferencesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPreferencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns both the current and recommended resource configuration and the estimated cost impact for a
     * recommendation.
     * </p>
     * <p>
     * The <code>recommendationId</code> is only valid for up to a maximum of 24 hours as recommendations are refreshed
     * daily. To retrieve the <code>recommendationId</code>, use the <code>ListRecommendations</code> API.
     * </p>
     * 
     * @param getRecommendationRequest
     * @return Result of the GetRecommendation operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ResourceNotFoundException
     *         The specified Amazon Resource Name (ARN) in the request doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.GetRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/GetRecommendation"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Optimization Hub");
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
     * Retrieves the enrollment status for an account. It can also return the list of accounts that are enrolled under
     * the organization.
     * </p>
     * 
     * @param listEnrollmentStatusesRequest
     * @return Result of the ListEnrollmentStatuses operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.ListEnrollmentStatuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListEnrollmentStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEnrollmentStatusesResult listEnrollmentStatuses(ListEnrollmentStatusesRequest request) {
        request = beforeClientExecution(request);
        return executeListEnrollmentStatuses(request);
    }

    @SdkInternalApi
    final ListEnrollmentStatusesResult executeListEnrollmentStatuses(ListEnrollmentStatusesRequest listEnrollmentStatusesRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnrollmentStatusesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnrollmentStatusesRequest> request = null;
        Response<ListEnrollmentStatusesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnrollmentStatusesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEnrollmentStatusesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Optimization Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnrollmentStatuses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnrollmentStatusesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEnrollmentStatusesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a concise representation of savings estimates for resources. Also returns de-duped savings across
     * different types of recommendations.
     * </p>
     * <note>
     * <p>
     * The following filters are not supported for this API: <code>recommendationIds</code>, <code>resourceArns</code>,
     * and <code>resourceIds</code>.
     * </p>
     * </note>
     * 
     * @param listRecommendationSummariesRequest
     * @return Result of the ListRecommendationSummaries operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.ListRecommendationSummaries
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListRecommendationSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRecommendationSummariesResult listRecommendationSummaries(ListRecommendationSummariesRequest request) {
        request = beforeClientExecution(request);
        return executeListRecommendationSummaries(request);
    }

    @SdkInternalApi
    final ListRecommendationSummariesResult executeListRecommendationSummaries(ListRecommendationSummariesRequest listRecommendationSummariesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecommendationSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecommendationSummariesRequest> request = null;
        Response<ListRecommendationSummariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecommendationSummariesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRecommendationSummariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Optimization Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecommendationSummaries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecommendationSummariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRecommendationSummariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of recommendations.
     * </p>
     * 
     * @param listRecommendationsRequest
     * @return Result of the ListRecommendations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListRecommendations"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Optimization Hub");
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
     * Updates the enrollment (opt in and opt out) status of an account to the Cost Optimization Hub service.
     * </p>
     * <p>
     * If the account is a management account of an organization, this action can also be used to enroll member accounts
     * of the organization.
     * </p>
     * <p>
     * You must have the appropriate permissions to opt in to Cost Optimization Hub and to view its recommendations.
     * When you opt in, Cost Optimization Hub automatically creates a service-linked role in your account to access its
     * data.
     * </p>
     * 
     * @param updateEnrollmentStatusRequest
     * @return Result of the UpdateEnrollmentStatus operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.UpdateEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/UpdateEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEnrollmentStatusResult updateEnrollmentStatus(UpdateEnrollmentStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnrollmentStatus(request);
    }

    @SdkInternalApi
    final UpdateEnrollmentStatusResult executeUpdateEnrollmentStatus(UpdateEnrollmentStatusRequest updateEnrollmentStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnrollmentStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnrollmentStatusRequest> request = null;
        Response<UpdateEnrollmentStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnrollmentStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEnrollmentStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Optimization Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnrollmentStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEnrollmentStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEnrollmentStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a set of preferences for an account in order to add account-specific preferences into the service. These
     * preferences impact how the savings associated with recommendations are presented.
     * </p>
     * 
     * @param updatePreferencesRequest
     * @return Result of the UpdatePreferences operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws AccessDeniedException
     *         You are not authorized to use this operation with the given parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCostOptimizationHub.UpdatePreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/UpdatePreferences"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdatePreferencesResult updatePreferences(UpdatePreferencesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePreferences(request);
    }

    @SdkInternalApi
    final UpdatePreferencesResult executeUpdatePreferences(UpdatePreferencesRequest updatePreferencesRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePreferencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePreferencesRequest> request = null;
        Response<UpdatePreferencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePreferencesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePreferencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Optimization Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePreferences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePreferencesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePreferencesResultJsonUnmarshaller());
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
