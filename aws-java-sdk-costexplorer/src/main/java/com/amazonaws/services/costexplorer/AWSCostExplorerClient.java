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
package com.amazonaws.services.costexplorer;

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

import com.amazonaws.services.costexplorer.AWSCostExplorerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.costexplorer.model.*;
import com.amazonaws.services.costexplorer.model.transform.*;

/**
 * Client for accessing AWS Cost Explorer. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * The Cost Explorer API enables you to programmatically query your cost and usage data. You can query for aggregated
 * data such as total monthly costs or total daily usage. You can also query for granular data, such as the number of
 * daily write operations for Amazon DynamoDB database tables in your production environment.
 * </p>
 * <p>
 * Service Endpoint
 * </p>
 * <p>
 * The Cost Explorer API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>https://ce.us-east-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about costs associated with the Cost Explorer API, see <a
 * href="https://aws.amazon.com/aws-cost-management/pricing/">AWS Cost Management Pricing</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCostExplorerClient extends AmazonWebServiceClient implements AWSCostExplorer {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCostExplorer.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ce";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestChangedException").withModeledClass(
                                    com.amazonaws.services.costexplorer.model.RequestChangedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DataUnavailableException").withModeledClass(
                                    com.amazonaws.services.costexplorer.model.DataUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BillExpirationException").withModeledClass(
                                    com.amazonaws.services.costexplorer.model.BillExpirationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.costexplorer.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.costexplorer.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.costexplorer.model.AWSCostExplorerException.class));

    public static AWSCostExplorerClientBuilder builder() {
        return AWSCostExplorerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Cost Explorer using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCostExplorerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Cost Explorer using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCostExplorerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("ce.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/costexplorer/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/costexplorer/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric, such as
     * <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want the request to return. You can also filter
     * and group your data by various dimensions, such as <code>SERVICE</code> or <code>AZ</code>, in a specific time
     * range. For a complete list of valid dimensions, see the <a
     * href="http://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Master accounts in an organization in AWS Organizations have access to all
     * member accounts.
     * </p>
     * 
     * @param getCostAndUsageRequest
     * @return Result of the GetCostAndUsage operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws BillExpirationException
     *         The requested report expired. Update the date interval and try again.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws RequestChangedException
     *         Your request parameters changed between pages. Try again with the old parameters or without a pagination
     *         token.
     * @sample AWSCostExplorer.GetCostAndUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostAndUsage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCostAndUsageResult getCostAndUsage(GetCostAndUsageRequest request) {
        request = beforeClientExecution(request);
        return executeGetCostAndUsage(request);
    }

    @SdkInternalApi
    final GetCostAndUsageResult executeGetCostAndUsage(GetCostAndUsageRequest getCostAndUsageRequest) {

        ExecutionContext executionContext = createExecutionContext(getCostAndUsageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCostAndUsageRequest> request = null;
        Response<GetCostAndUsageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCostAndUsageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCostAndUsageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCostAndUsage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCostAndUsageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCostAndUsageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a forecast for how much Amazon Web Services predicts that you will spend over the forecast time period
     * that you select, based on your past costs.
     * </p>
     * 
     * @param getCostForecastRequest
     * @return Result of the GetCostForecast operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @sample AWSCostExplorer.GetCostForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostForecast" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCostForecastResult getCostForecast(GetCostForecastRequest request) {
        request = beforeClientExecution(request);
        return executeGetCostForecast(request);
    }

    @SdkInternalApi
    final GetCostForecastResult executeGetCostForecast(GetCostForecastRequest getCostForecastRequest) {

        ExecutionContext executionContext = createExecutionContext(getCostForecastRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCostForecastRequest> request = null;
        Response<GetCostForecastResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCostForecastRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCostForecastRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCostForecast");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCostForecastResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCostForecastResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all available filter values for a specified filter over a period of time. You can search the dimension
     * values for an arbitrary string.
     * </p>
     * 
     * @param getDimensionValuesRequest
     * @return Result of the GetDimensionValues operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws BillExpirationException
     *         The requested report expired. Update the date interval and try again.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws RequestChangedException
     *         Your request parameters changed between pages. Try again with the old parameters or without a pagination
     *         token.
     * @sample AWSCostExplorer.GetDimensionValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetDimensionValues" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDimensionValuesResult getDimensionValues(GetDimensionValuesRequest request) {
        request = beforeClientExecution(request);
        return executeGetDimensionValues(request);
    }

    @SdkInternalApi
    final GetDimensionValuesResult executeGetDimensionValues(GetDimensionValuesRequest getDimensionValuesRequest) {

        ExecutionContext executionContext = createExecutionContext(getDimensionValuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDimensionValuesRequest> request = null;
        Response<GetDimensionValuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDimensionValuesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDimensionValuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDimensionValues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDimensionValuesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDimensionValuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the reservation coverage for your account. This enables you to see how much of your Amazon Elastic
     * Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a
     * reservation. An organization's master account can see the coverage of the associated member accounts. For any
     * time period, you can filter data about reservation usage by the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * To determine valid values for a dimension, use the <code>GetDimensionValues</code> operation.
     * </p>
     * 
     * @param getReservationCoverageRequest
     *        You can use the following request parameters to query for how much of your instance usage a reservation
     *        covered.
     * @return Result of the GetReservationCoverage operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetReservationCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetReservationCoverageResult getReservationCoverage(GetReservationCoverageRequest request) {
        request = beforeClientExecution(request);
        return executeGetReservationCoverage(request);
    }

    @SdkInternalApi
    final GetReservationCoverageResult executeGetReservationCoverage(GetReservationCoverageRequest getReservationCoverageRequest) {

        ExecutionContext executionContext = createExecutionContext(getReservationCoverageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReservationCoverageRequest> request = null;
        Response<GetReservationCoverageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReservationCoverageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReservationCoverageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReservationCoverage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReservationCoverageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetReservationCoverageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets recommendations for which reservations to purchase. These recommendations could help you reduce your costs.
     * Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing.
     * </p>
     * <p>
     * AWS generates your recommendations by identifying your On-Demand usage during a specific time period and
     * collecting your usage into categories that are eligible for a reservation. After AWS has these categories, it
     * simulates every combination of reservations in each category of usage to identify the best number of each type of
     * RI to purchase to maximize your estimated savings.
     * </p>
     * <p>
     * For example, AWS automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family usage in the US
     * West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to the c4 family
     * usage. AWS recommends the smallest size instance in an instance family. This makes it easier to purchase a
     * size-flexible RI. AWS also shows the equal number of normalized units so that you can purchase any instance size
     * that you want. For this example, your RI recommendation would be for <code>c4.large</code> because that is the
     * smallest size instance in the c4 instance family.
     * </p>
     * 
     * @param getReservationPurchaseRecommendationRequest
     * @return Result of the GetReservationPurchaseRecommendation operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetReservationPurchaseRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationPurchaseRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetReservationPurchaseRecommendationResult getReservationPurchaseRecommendation(GetReservationPurchaseRecommendationRequest request) {
        request = beforeClientExecution(request);
        return executeGetReservationPurchaseRecommendation(request);
    }

    @SdkInternalApi
    final GetReservationPurchaseRecommendationResult executeGetReservationPurchaseRecommendation(
            GetReservationPurchaseRecommendationRequest getReservationPurchaseRecommendationRequest) {

        ExecutionContext executionContext = createExecutionContext(getReservationPurchaseRecommendationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReservationPurchaseRecommendationRequest> request = null;
        Response<GetReservationPurchaseRecommendationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReservationPurchaseRecommendationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getReservationPurchaseRecommendationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReservationPurchaseRecommendation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReservationPurchaseRecommendationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetReservationPurchaseRecommendationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the reservation utilization for your account. Master accounts in an organization have access to member
     * accounts. You can filter data by dimensions in a time period. You can use <code>GetDimensionValues</code> to
     * determine the possible dimension values. Currently, you can group only by <code>SUBSCRIPTION_ID</code>.
     * </p>
     * 
     * @param getReservationUtilizationRequest
     * @return Result of the GetReservationUtilization operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetReservationUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationUtilization" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetReservationUtilizationResult getReservationUtilization(GetReservationUtilizationRequest request) {
        request = beforeClientExecution(request);
        return executeGetReservationUtilization(request);
    }

    @SdkInternalApi
    final GetReservationUtilizationResult executeGetReservationUtilization(GetReservationUtilizationRequest getReservationUtilizationRequest) {

        ExecutionContext executionContext = createExecutionContext(getReservationUtilizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReservationUtilizationRequest> request = null;
        Response<GetReservationUtilizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReservationUtilizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getReservationUtilizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReservationUtilization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReservationUtilizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetReservationUtilizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Queries for available tag keys and tag values for a specified period. You can search the tag values for an
     * arbitrary string.
     * </p>
     * 
     * @param getTagsRequest
     * @return Result of the GetTags operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws BillExpirationException
     *         The requested report expired. Update the date interval and try again.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws RequestChangedException
     *         Your request parameters changed between pages. Try again with the old parameters or without a pagination
     *         token.
     * @sample AWSCostExplorer.GetTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTagsResult getTags(GetTagsRequest request) {
        request = beforeClientExecution(request);
        return executeGetTags(request);
    }

    @SdkInternalApi
    final GetTagsResult executeGetTags(GetTagsRequest getTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(getTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTagsRequest> request = null;
        Response<GetTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTagsResultJsonUnmarshaller());
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
