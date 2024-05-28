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
package com.amazonaws.services.kendraranking;

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

import com.amazonaws.services.kendraranking.AmazonKendraRankingClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kendraranking.model.*;

import com.amazonaws.services.kendraranking.model.transform.*;

/**
 * Client for accessing Kendra Ranking. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Amazon Kendra Intelligent Ranking uses Amazon Kendra semantic search capabilities to intelligently re-rank a search
 * service's results.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKendraRankingClient extends AmazonWebServiceClient implements AmazonKendraRanking {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonKendraRanking.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "kendra-ranking";

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
                                    com.amazonaws.services.kendraranking.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendraranking.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendraranking.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendraranking.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendraranking.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendraranking.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendraranking.model.transform.ResourceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kendraranking.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.kendraranking.model.AmazonKendraRankingException.class));

    public static AmazonKendraRankingClientBuilder builder() {
        return AmazonKendraRankingClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Kendra Ranking using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKendraRankingClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Kendra Ranking using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKendraRankingClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("kendra-ranking.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/kendraranking/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/kendraranking/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used
     * for provisioning the <code>Rescore</code> API. You set the number of capacity units that you require for Amazon
     * Kendra Intelligent Ranking to rescore or re-rank a search service's results.
     * </p>
     * <p>
     * For an example of using the <code>CreateRescoreExecutionPlan</code> API, including using the Python and Java
     * SDKs, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/search-service-rerank.html">Semantically ranking
     * a search service's results</a>.
     * </p>
     * 
     * @param createRescoreExecutionPlanRequest
     * @return Result of the CreateRescoreExecutionPlan operation returned by the service.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistencies with your resources and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra Intelligent Ranking service. Please see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a> for more information, or
     *         contact <a href="http://aws.amazon.com/contact-us/">Support</a> to inquire about an increase of limits.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.CreateRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/CreateRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRescoreExecutionPlanResult createRescoreExecutionPlan(CreateRescoreExecutionPlanRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRescoreExecutionPlan(request);
    }

    @SdkInternalApi
    final CreateRescoreExecutionPlanResult executeCreateRescoreExecutionPlan(CreateRescoreExecutionPlanRequest createRescoreExecutionPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(createRescoreExecutionPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRescoreExecutionPlanRequest> request = null;
        Response<CreateRescoreExecutionPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRescoreExecutionPlanRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createRescoreExecutionPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kendra Ranking");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRescoreExecutionPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRescoreExecutionPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateRescoreExecutionPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used
     * for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param deleteRescoreExecutionPlanRequest
     * @return Result of the DeleteRescoreExecutionPlan operation returned by the service.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistencies with your resources and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn't exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.DeleteRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/DeleteRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRescoreExecutionPlanResult deleteRescoreExecutionPlan(DeleteRescoreExecutionPlanRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRescoreExecutionPlan(request);
    }

    @SdkInternalApi
    final DeleteRescoreExecutionPlanResult executeDeleteRescoreExecutionPlan(DeleteRescoreExecutionPlanRequest deleteRescoreExecutionPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRescoreExecutionPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRescoreExecutionPlanRequest> request = null;
        Response<DeleteRescoreExecutionPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRescoreExecutionPlanRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRescoreExecutionPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kendra Ranking");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRescoreExecutionPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRescoreExecutionPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRescoreExecutionPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking
     * resource used for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param describeRescoreExecutionPlanRequest
     * @return Result of the DescribeRescoreExecutionPlan operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn't exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.DescribeRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/DescribeRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRescoreExecutionPlanResult describeRescoreExecutionPlan(DescribeRescoreExecutionPlanRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRescoreExecutionPlan(request);
    }

    @SdkInternalApi
    final DescribeRescoreExecutionPlanResult executeDescribeRescoreExecutionPlan(DescribeRescoreExecutionPlanRequest describeRescoreExecutionPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRescoreExecutionPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRescoreExecutionPlanRequest> request = null;
        Response<DescribeRescoreExecutionPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRescoreExecutionPlanRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRescoreExecutionPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kendra Ranking");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRescoreExecutionPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRescoreExecutionPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRescoreExecutionPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your rescore execution plans. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource
     * used for provisioning the <code>Rescore</code> API.
     * </p>
     * 
     * @param listRescoreExecutionPlansRequest
     * @return Result of the ListRescoreExecutionPlans operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.ListRescoreExecutionPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/ListRescoreExecutionPlans"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRescoreExecutionPlansResult listRescoreExecutionPlans(ListRescoreExecutionPlansRequest request) {
        request = beforeClientExecution(request);
        return executeListRescoreExecutionPlans(request);
    }

    @SdkInternalApi
    final ListRescoreExecutionPlansResult executeListRescoreExecutionPlans(ListRescoreExecutionPlansRequest listRescoreExecutionPlansRequest) {

        ExecutionContext executionContext = createExecutionContext(listRescoreExecutionPlansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRescoreExecutionPlansRequest> request = null;
        Response<ListRescoreExecutionPlansResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRescoreExecutionPlansRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRescoreExecutionPlansRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kendra Ranking");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRescoreExecutionPlans");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRescoreExecutionPlansResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRescoreExecutionPlansResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of tags associated with a specified resource. A rescore execution plan is an example of a resource
     * that can have tags associated with it.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The request information for listing tags associated with a rescore execution plan. A rescore execution
     *        plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the <code>Rescore</code> API.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ResourceUnavailableException
     *         The resource you want to use is unavailable. Please check you have provided the correct resource
     *         information and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kendra Ranking");
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
     * Rescores or re-ranks search results from a search service such as OpenSearch (self managed). You use the semantic
     * search capabilities of Amazon Kendra Intelligent Ranking to improve the search service's results.
     * </p>
     * 
     * @param rescoreRequest
     * @return Result of the Rescore operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistencies with your resources and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn't exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.Rescore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/Rescore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RescoreResult rescore(RescoreRequest request) {
        request = beforeClientExecution(request);
        return executeRescore(request);
    }

    @SdkInternalApi
    final RescoreResult executeRescore(RescoreRequest rescoreRequest) {

        ExecutionContext executionContext = createExecutionContext(rescoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RescoreRequest> request = null;
        Response<RescoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RescoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rescoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kendra Ranking");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Rescore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RescoreResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new RescoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a specified tag to a specified rescore execution plan. A rescore execution plan is an Amazon Kendra
     * Intelligent Ranking resource used for provisioning the <code>Rescore</code> API. If the tag already exists, the
     * existing value is replaced with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request information for tagging a rescore execution plan. A rescore execution plan is an Amazon Kendra
     *        Intelligent Ranking resource used for provisioning the <code>Rescore</code> API.
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ResourceUnavailableException
     *         The resource you want to use is unavailable. Please check you have provided the correct resource
     *         information and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kendra Ranking");
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
     * Removes a tag from a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking
     * resource used for provisioning the <code>Rescore</code> operation.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request information to remove a tag from a rescore execution plan. A rescore execution plan is an
     *        Amazon Kendra Intelligent Ranking resource used for provisioning the <code>Rescore</code> API.
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ResourceUnavailableException
     *         The resource you want to use is unavailable. Please check you have provided the correct resource
     *         information and try again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kendra Ranking");
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
     * Updates a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used
     * for provisioning the <code>Rescore</code> API. You can update the number of capacity units you require for Amazon
     * Kendra Intelligent Ranking to rescore or re-rank a search service's results.
     * </p>
     * 
     * @param updateRescoreExecutionPlanRequest
     * @return Result of the UpdateRescoreExecutionPlan operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the Amazon Kendra Intelligent Ranking service. Please
     *         provide the correct input and try again.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn't exist. Please check you have provided the correct resource and try
     *         again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. Please reduce the number of requests and try again.
     * @throws AccessDeniedException
     *         You don’t have sufficient access to perform this action. Please ensure you have the required permission
     *         policies and user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Kendra Intelligent Ranking service. Please see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas</a> for more information, or
     *         contact <a href="http://aws.amazon.com/contact-us/">Support</a> to inquire about an increase of limits.
     * @throws ConflictException
     *         A conflict occurred with the request. Please fix any inconsistencies with your resources and try again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Kendra Intelligent Ranking service.
     *         Please wait a few minutes and try again, or contact <a
     *         href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @sample AmazonKendraRanking.UpdateRescoreExecutionPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-ranking-2022-10-19/UpdateRescoreExecutionPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRescoreExecutionPlanResult updateRescoreExecutionPlan(UpdateRescoreExecutionPlanRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRescoreExecutionPlan(request);
    }

    @SdkInternalApi
    final UpdateRescoreExecutionPlanResult executeUpdateRescoreExecutionPlan(UpdateRescoreExecutionPlanRequest updateRescoreExecutionPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRescoreExecutionPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRescoreExecutionPlanRequest> request = null;
        Response<UpdateRescoreExecutionPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRescoreExecutionPlanRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateRescoreExecutionPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Kendra Ranking");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRescoreExecutionPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRescoreExecutionPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateRescoreExecutionPlanResultJsonUnmarshaller());
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
