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
package com.amazonaws.services.migrationhubstrategyrecommendations;

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

import com.amazonaws.services.migrationhubstrategyrecommendations.AWSMigrationHubStrategyRecommendationsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.*;

/**
 * Client for accessing Migration Hub Strategy Recommendations. All service calls made using this client are blocking,
 * and will not return until the service call completes.
 * <p>
 * <p>
 * <fullname>Migration Hub Strategy Recommendations</fullname>
 * </p>
 * 
 * <pre>
 * <code> &lt;p&gt;This API reference provides descriptions, syntax, and other details about each of the actions and data types for Migration Hub Strategy Recommendations (Strategy Recommendations). The topic for each action shows the API request parameters and the response. Alternatively, you can use one of the AWS SDKs to access an API that is tailored to the programming language or platform that you're using. For more information, see &lt;a href=&quot;http://aws.amazon.com/tools/#SDKs&quot;&gt;AWS SDKs&lt;/a&gt;.&lt;/p&gt; </code>
 * </pre>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMigrationHubStrategyRecommendationsClient extends AmazonWebServiceClient implements AWSMigrationHubStrategyRecommendations {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMigrationHubStrategyRecommendations.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "migrationhub-strategy";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ServiceQuotaExceededExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.InternalServerExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ResourceNotFoundExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DependencyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.DependencyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceLinkedRoleLockClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ServiceLinkedRoleLockClientExceptionUnmarshaller
                                            .getInstance()))
                    .withBaseServiceExceptionClass(
                            com.amazonaws.services.migrationhubstrategyrecommendations.model.AWSMigrationHubStrategyRecommendationsException.class));

    public static AWSMigrationHubStrategyRecommendationsClientBuilder builder() {
        return AWSMigrationHubStrategyRecommendationsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Migration Hub Strategy Recommendations using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubStrategyRecommendationsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Migration Hub Strategy Recommendations using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubStrategyRecommendationsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("migrationhub-strategy.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/migrationhubstrategyrecommendations/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/migrationhubstrategyrecommendations/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Retrieves details about an application component.
     * </p>
     * 
     * @param getApplicationComponentDetailsRequest
     * @return Result of the GetApplicationComponentDetails operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetApplicationComponentDetails
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetApplicationComponentDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApplicationComponentDetailsResult getApplicationComponentDetails(GetApplicationComponentDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplicationComponentDetails(request);
    }

    @SdkInternalApi
    final GetApplicationComponentDetailsResult executeGetApplicationComponentDetails(GetApplicationComponentDetailsRequest getApplicationComponentDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationComponentDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationComponentDetailsRequest> request = null;
        Response<GetApplicationComponentDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationComponentDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getApplicationComponentDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplicationComponentDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationComponentDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetApplicationComponentDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of all the recommended strategies and tools for an application component running on a server.
     * </p>
     * 
     * @param getApplicationComponentStrategiesRequest
     * @return Result of the GetApplicationComponentStrategies operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetApplicationComponentStrategies
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetApplicationComponentStrategies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApplicationComponentStrategiesResult getApplicationComponentStrategies(GetApplicationComponentStrategiesRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplicationComponentStrategies(request);
    }

    @SdkInternalApi
    final GetApplicationComponentStrategiesResult executeGetApplicationComponentStrategies(
            GetApplicationComponentStrategiesRequest getApplicationComponentStrategiesRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationComponentStrategiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationComponentStrategiesRequest> request = null;
        Response<GetApplicationComponentStrategiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationComponentStrategiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getApplicationComponentStrategiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplicationComponentStrategies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationComponentStrategiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetApplicationComponentStrategiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the status of an on-going assessment.
     * </p>
     * 
     * @param getAssessmentRequest
     * @return Result of the GetAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAssessmentResult getAssessment(GetAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssessment(request);
    }

    @SdkInternalApi
    final GetAssessmentResult executeGetAssessment(GetAssessmentRequest getAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssessmentRequest> request = null;
        Response<GetAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details about a specific import task.
     * </p>
     * 
     * @param getImportFileTaskRequest
     * @return Result of the GetImportFileTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetImportFileTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetImportFileTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetImportFileTaskResult getImportFileTask(GetImportFileTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetImportFileTask(request);
    }

    @SdkInternalApi
    final GetImportFileTaskResult executeGetImportFileTask(GetImportFileTaskRequest getImportFileTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getImportFileTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImportFileTaskRequest> request = null;
        Response<GetImportFileTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImportFileTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImportFileTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImportFileTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImportFileTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImportFileTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve the latest ID of a specific assessment task.
     * </p>
     * 
     * @param getLatestAssessmentIdRequest
     * @return Result of the GetLatestAssessmentId operation returned by the service.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetLatestAssessmentId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetLatestAssessmentId"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLatestAssessmentIdResult getLatestAssessmentId(GetLatestAssessmentIdRequest request) {
        request = beforeClientExecution(request);
        return executeGetLatestAssessmentId(request);
    }

    @SdkInternalApi
    final GetLatestAssessmentIdResult executeGetLatestAssessmentId(GetLatestAssessmentIdRequest getLatestAssessmentIdRequest) {

        ExecutionContext executionContext = createExecutionContext(getLatestAssessmentIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLatestAssessmentIdRequest> request = null;
        Response<GetLatestAssessmentIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLatestAssessmentIdRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLatestAssessmentIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLatestAssessmentId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLatestAssessmentIdResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetLatestAssessmentIdResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves your migration and modernization preferences.
     * </p>
     * 
     * @param getPortfolioPreferencesRequest
     * @return Result of the GetPortfolioPreferences operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetPortfolioPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetPortfolioPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPortfolioPreferencesResult getPortfolioPreferences(GetPortfolioPreferencesRequest request) {
        request = beforeClientExecution(request);
        return executeGetPortfolioPreferences(request);
    }

    @SdkInternalApi
    final GetPortfolioPreferencesResult executeGetPortfolioPreferences(GetPortfolioPreferencesRequest getPortfolioPreferencesRequest) {

        ExecutionContext executionContext = createExecutionContext(getPortfolioPreferencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPortfolioPreferencesRequest> request = null;
        Response<GetPortfolioPreferencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPortfolioPreferencesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPortfolioPreferencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPortfolioPreferences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPortfolioPreferencesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPortfolioPreferencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves overall summary including the number of servers to rehost and the overall number of anti-patterns.
     * </p>
     * 
     * @param getPortfolioSummaryRequest
     * @return Result of the GetPortfolioSummary operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetPortfolioSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetPortfolioSummary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPortfolioSummaryResult getPortfolioSummary(GetPortfolioSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetPortfolioSummary(request);
    }

    @SdkInternalApi
    final GetPortfolioSummaryResult executeGetPortfolioSummary(GetPortfolioSummaryRequest getPortfolioSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getPortfolioSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPortfolioSummaryRequest> request = null;
        Response<GetPortfolioSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPortfolioSummaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPortfolioSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPortfolioSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPortfolioSummaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPortfolioSummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves detailed information about the specified recommendation report.
     * </p>
     * 
     * @param getRecommendationReportDetailsRequest
     * @return Result of the GetRecommendationReportDetails operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetRecommendationReportDetails
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetRecommendationReportDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRecommendationReportDetailsResult getRecommendationReportDetails(GetRecommendationReportDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetRecommendationReportDetails(request);
    }

    @SdkInternalApi
    final GetRecommendationReportDetailsResult executeGetRecommendationReportDetails(GetRecommendationReportDetailsRequest getRecommendationReportDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getRecommendationReportDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecommendationReportDetailsRequest> request = null;
        Response<GetRecommendationReportDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecommendationReportDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRecommendationReportDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRecommendationReportDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRecommendationReportDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRecommendationReportDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves detailed information about a specified server.
     * </p>
     * 
     * @param getServerDetailsRequest
     * @return Result of the GetServerDetails operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetServerDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetServerDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServerDetailsResult getServerDetails(GetServerDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetServerDetails(request);
    }

    @SdkInternalApi
    final GetServerDetailsResult executeGetServerDetails(GetServerDetailsRequest getServerDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getServerDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServerDetailsRequest> request = null;
        Response<GetServerDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServerDetailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServerDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServerDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServerDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServerDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves recommended strategies and tools for the specified server.
     * </p>
     * 
     * @param getServerStrategiesRequest
     * @return Result of the GetServerStrategies operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.GetServerStrategies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetServerStrategies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServerStrategiesResult getServerStrategies(GetServerStrategiesRequest request) {
        request = beforeClientExecution(request);
        return executeGetServerStrategies(request);
    }

    @SdkInternalApi
    final GetServerStrategiesResult executeGetServerStrategies(GetServerStrategiesRequest getServerStrategiesRequest) {

        ExecutionContext executionContext = createExecutionContext(getServerStrategiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServerStrategiesRequest> request = null;
        Response<GetServerStrategiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServerStrategiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServerStrategiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServerStrategies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServerStrategiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServerStrategiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of all the application components (processes).
     * </p>
     * 
     * @param listApplicationComponentsRequest
     * @return Result of the ListApplicationComponents operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ServiceLinkedRoleLockClientException
     *         Exception to indicate that the service-linked role (SLR) is locked.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.ListApplicationComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListApplicationComponents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationComponentsResult listApplicationComponents(ListApplicationComponentsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationComponents(request);
    }

    @SdkInternalApi
    final ListApplicationComponentsResult executeListApplicationComponents(ListApplicationComponentsRequest listApplicationComponentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationComponentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationComponentsRequest> request = null;
        Response<ListApplicationComponentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationComponentsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationComponentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationComponents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationComponentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationComponentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of all the installed collectors.
     * </p>
     * 
     * @param listCollectorsRequest
     * @return Result of the ListCollectors operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.ListCollectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListCollectors"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCollectorsResult listCollectors(ListCollectorsRequest request) {
        request = beforeClientExecution(request);
        return executeListCollectors(request);
    }

    @SdkInternalApi
    final ListCollectorsResult executeListCollectors(ListCollectorsRequest listCollectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCollectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCollectorsRequest> request = null;
        Response<ListCollectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCollectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCollectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCollectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCollectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCollectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of all the imports performed.
     * </p>
     * 
     * @param listImportFileTaskRequest
     * @return Result of the ListImportFileTask operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.ListImportFileTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListImportFileTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListImportFileTaskResult listImportFileTask(ListImportFileTaskRequest request) {
        request = beforeClientExecution(request);
        return executeListImportFileTask(request);
    }

    @SdkInternalApi
    final ListImportFileTaskResult executeListImportFileTask(ListImportFileTaskRequest listImportFileTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(listImportFileTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImportFileTaskRequest> request = null;
        Response<ListImportFileTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImportFileTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listImportFileTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListImportFileTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListImportFileTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListImportFileTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all the servers.
     * </p>
     * 
     * @param listServersRequest
     * @return Result of the ListServers operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.ListServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListServers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServersResult listServers(ListServersRequest request) {
        request = beforeClientExecution(request);
        return executeListServers(request);
    }

    @SdkInternalApi
    final ListServersResult executeListServers(ListServersRequest listServersRequest) {

        ExecutionContext executionContext = createExecutionContext(listServersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServersRequest> request = null;
        Response<ListServersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Saves the specified migration and modernization preferences.
     * </p>
     * 
     * @param putPortfolioPreferencesRequest
     * @return Result of the PutPortfolioPreferences operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws ConflictException
     *         Exception to indicate that there is an ongoing task when a new task is created. Return when once the
     *         existing tasks are complete.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.PutPortfolioPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/PutPortfolioPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutPortfolioPreferencesResult putPortfolioPreferences(PutPortfolioPreferencesRequest request) {
        request = beforeClientExecution(request);
        return executePutPortfolioPreferences(request);
    }

    @SdkInternalApi
    final PutPortfolioPreferencesResult executePutPortfolioPreferences(PutPortfolioPreferencesRequest putPortfolioPreferencesRequest) {

        ExecutionContext executionContext = createExecutionContext(putPortfolioPreferencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPortfolioPreferencesRequest> request = null;
        Response<PutPortfolioPreferencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPortfolioPreferencesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putPortfolioPreferencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutPortfolioPreferences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutPortfolioPreferencesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutPortfolioPreferencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the assessment of an on-premises environment.
     * </p>
     * 
     * @param startAssessmentRequest
     * @return Result of the StartAssessment operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The AWS account has reached its quota of imports. Contact AWS Support to increase the quota for this
     *         account.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.StartAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartAssessmentResult startAssessment(StartAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeStartAssessment(request);
    }

    @SdkInternalApi
    final StartAssessmentResult executeStartAssessment(StartAssessmentRequest startAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(startAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAssessmentRequest> request = null;
        Response<StartAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a file import.
     * </p>
     * 
     * @param startImportFileTaskRequest
     * @return Result of the StartImportFileTask operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The AWS account has reached its quota of imports. Contact AWS Support to increase the quota for this
     *         account.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.StartImportFileTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartImportFileTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartImportFileTaskResult startImportFileTask(StartImportFileTaskRequest request) {
        request = beforeClientExecution(request);
        return executeStartImportFileTask(request);
    }

    @SdkInternalApi
    final StartImportFileTaskResult executeStartImportFileTask(StartImportFileTaskRequest startImportFileTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(startImportFileTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartImportFileTaskRequest> request = null;
        Response<StartImportFileTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartImportFileTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startImportFileTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartImportFileTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartImportFileTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartImportFileTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts generating a recommendation report.
     * </p>
     * 
     * @param startRecommendationReportGenerationRequest
     * @return Result of the StartRecommendationReportGeneration operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws ConflictException
     *         Exception to indicate that there is an ongoing task when a new task is created. Return when once the
     *         existing tasks are complete.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.StartRecommendationReportGeneration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StartRecommendationReportGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartRecommendationReportGenerationResult startRecommendationReportGeneration(StartRecommendationReportGenerationRequest request) {
        request = beforeClientExecution(request);
        return executeStartRecommendationReportGeneration(request);
    }

    @SdkInternalApi
    final StartRecommendationReportGenerationResult executeStartRecommendationReportGeneration(
            StartRecommendationReportGenerationRequest startRecommendationReportGenerationRequest) {

        ExecutionContext executionContext = createExecutionContext(startRecommendationReportGenerationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartRecommendationReportGenerationRequest> request = null;
        Response<StartRecommendationReportGenerationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartRecommendationReportGenerationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startRecommendationReportGenerationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartRecommendationReportGeneration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartRecommendationReportGenerationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartRecommendationReportGenerationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the assessment of an on-premises environment.
     * </p>
     * 
     * @param stopAssessmentRequest
     * @return Result of the StopAssessment operation returned by the service.
     * @throws AccessDeniedException
     *         The AWS user account does not have permission to perform the action. Check the AWS Identity and Access
     *         Management (IAM) policy associated with this account.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.StopAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StopAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopAssessmentResult stopAssessment(StopAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeStopAssessment(request);
    }

    @SdkInternalApi
    final StopAssessmentResult executeStopAssessment(StopAssessmentRequest stopAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(stopAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopAssessmentRequest> request = null;
        Response<StopAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of an application component.
     * </p>
     * 
     * @param updateApplicationComponentConfigRequest
     * @return Result of the UpdateApplicationComponentConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.UpdateApplicationComponentConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/UpdateApplicationComponentConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateApplicationComponentConfigResult updateApplicationComponentConfig(UpdateApplicationComponentConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplicationComponentConfig(request);
    }

    @SdkInternalApi
    final UpdateApplicationComponentConfigResult executeUpdateApplicationComponentConfig(
            UpdateApplicationComponentConfigRequest updateApplicationComponentConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationComponentConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationComponentConfigRequest> request = null;
        Response<UpdateApplicationComponentConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationComponentConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateApplicationComponentConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplicationComponentConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationComponentConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateApplicationComponentConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of the specified server.
     * </p>
     * 
     * @param updateServerConfigRequest
     * @return Result of the UpdateServerConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ID in the request is not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The request body isn't valid.
     * @throws InternalServerException
     *         The server experienced an internal error. Try again.
     * @sample AWSMigrationHubStrategyRecommendations.UpdateServerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/UpdateServerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServerConfigResult updateServerConfig(UpdateServerConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServerConfig(request);
    }

    @SdkInternalApi
    final UpdateServerConfigResult executeUpdateServerConfig(UpdateServerConfigRequest updateServerConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServerConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServerConfigRequest> request = null;
        Response<UpdateServerConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServerConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServerConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubStrategy");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServerConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServerConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateServerConfigResultJsonUnmarshaller());
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
