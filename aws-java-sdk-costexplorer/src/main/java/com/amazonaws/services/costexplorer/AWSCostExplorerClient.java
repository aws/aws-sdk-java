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
 * You can use the Cost Explorer API to programmatically query your cost and usage data. You can query for aggregated
 * data such as total monthly costs or total daily usage. You can also query for granular data. This might include the
 * number of daily write operations for Amazon DynamoDB database tables in your production environment.
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
 * For information about the costs that are associated with the Cost Explorer API, see <a
 * href="http://aws.amazon.com/aws-cost-management/pricing/">Amazon Web Services Cost Management Pricing</a>.
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
                            new JsonErrorShapeMetadata().withErrorCode("GenerationExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costexplorer.model.transform.GenerationExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnresolvableUsageUnitException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costexplorer.model.transform.UnresolvableUsageUnitExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnknownSubscriptionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costexplorer.model.transform.UnknownSubscriptionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestChangedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costexplorer.model.transform.RequestChangedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DataUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costexplorer.model.transform.DataUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costexplorer.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackfillLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costexplorer.model.transform.BackfillLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costexplorer.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costexplorer.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costexplorer.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnknownMonitorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costexplorer.model.transform.UnknownMonitorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costexplorer.model.transform.TooManyTagsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BillExpirationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.costexplorer.model.transform.BillExpirationExceptionUnmarshaller.getInstance()))
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
     * Creates a new cost anomaly detection monitor with the requested type and monitor specification.
     * </p>
     * 
     * @param createAnomalyMonitorRequest
     * @return Result of the CreateAnomalyMonitor operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.CreateAnomalyMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateAnomalyMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAnomalyMonitorResult createAnomalyMonitor(CreateAnomalyMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAnomalyMonitor(request);
    }

    @SdkInternalApi
    final CreateAnomalyMonitorResult executeCreateAnomalyMonitor(CreateAnomalyMonitorRequest createAnomalyMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(createAnomalyMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAnomalyMonitorRequest> request = null;
        Response<CreateAnomalyMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAnomalyMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAnomalyMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAnomalyMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAnomalyMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAnomalyMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an alert subscription to a cost anomaly detection monitor. You can use each subscription to define
     * subscribers with email or SNS notifications. Email subscribers can set an absolute or percentage threshold and a
     * time frequency for receiving notifications.
     * </p>
     * 
     * @param createAnomalySubscriptionRequest
     * @return Result of the CreateAnomalySubscription operation returned by the service.
     * @throws UnknownMonitorException
     *         The cost anomaly monitor does not exist for the account.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.CreateAnomalySubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateAnomalySubscription" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAnomalySubscriptionResult createAnomalySubscription(CreateAnomalySubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAnomalySubscription(request);
    }

    @SdkInternalApi
    final CreateAnomalySubscriptionResult executeCreateAnomalySubscription(CreateAnomalySubscriptionRequest createAnomalySubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(createAnomalySubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAnomalySubscriptionRequest> request = null;
        Response<CreateAnomalySubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAnomalySubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createAnomalySubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAnomalySubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAnomalySubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAnomalySubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Cost Category with the requested name and rules.
     * </p>
     * 
     * @param createCostCategoryDefinitionRequest
     * @return Result of the CreateCostCategoryDefinition operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You've reached the limit on the number of resources you can create, or exceeded the size of an individual
     *         resource.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.CreateCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CreateCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCostCategoryDefinitionResult createCostCategoryDefinition(CreateCostCategoryDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCostCategoryDefinition(request);
    }

    @SdkInternalApi
    final CreateCostCategoryDefinitionResult executeCreateCostCategoryDefinition(CreateCostCategoryDefinitionRequest createCostCategoryDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(createCostCategoryDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCostCategoryDefinitionRequest> request = null;
        Response<CreateCostCategoryDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCostCategoryDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCostCategoryDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCostCategoryDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCostCategoryDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCostCategoryDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a cost anomaly monitor.
     * </p>
     * 
     * @param deleteAnomalyMonitorRequest
     * @return Result of the DeleteAnomalyMonitor operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws UnknownMonitorException
     *         The cost anomaly monitor does not exist for the account.
     * @sample AWSCostExplorer.DeleteAnomalyMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DeleteAnomalyMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAnomalyMonitorResult deleteAnomalyMonitor(DeleteAnomalyMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAnomalyMonitor(request);
    }

    @SdkInternalApi
    final DeleteAnomalyMonitorResult executeDeleteAnomalyMonitor(DeleteAnomalyMonitorRequest deleteAnomalyMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAnomalyMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAnomalyMonitorRequest> request = null;
        Response<DeleteAnomalyMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAnomalyMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAnomalyMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAnomalyMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAnomalyMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAnomalyMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a cost anomaly subscription.
     * </p>
     * 
     * @param deleteAnomalySubscriptionRequest
     * @return Result of the DeleteAnomalySubscription operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws UnknownSubscriptionException
     *         The cost anomaly subscription does not exist for the account.
     * @sample AWSCostExplorer.DeleteAnomalySubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DeleteAnomalySubscription" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAnomalySubscriptionResult deleteAnomalySubscription(DeleteAnomalySubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAnomalySubscription(request);
    }

    @SdkInternalApi
    final DeleteAnomalySubscriptionResult executeDeleteAnomalySubscription(DeleteAnomalySubscriptionRequest deleteAnomalySubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAnomalySubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAnomalySubscriptionRequest> request = null;
        Response<DeleteAnomalySubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAnomalySubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAnomalySubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAnomalySubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAnomalySubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAnomalySubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Cost Category. Expenses from this month going forward will no longer be categorized with this Cost
     * Category.
     * </p>
     * 
     * @param deleteCostCategoryDefinitionRequest
     * @return Result of the DeleteCostCategoryDefinition operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ARN in the request doesn't exist.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.DeleteCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DeleteCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCostCategoryDefinitionResult deleteCostCategoryDefinition(DeleteCostCategoryDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCostCategoryDefinition(request);
    }

    @SdkInternalApi
    final DeleteCostCategoryDefinitionResult executeDeleteCostCategoryDefinition(DeleteCostCategoryDefinitionRequest deleteCostCategoryDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCostCategoryDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCostCategoryDefinitionRequest> request = null;
        Response<DeleteCostCategoryDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCostCategoryDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteCostCategoryDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCostCategoryDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCostCategoryDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCostCategoryDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the name, Amazon Resource Name (ARN), rules, definition, and effective dates of a Cost Category that's
     * defined in the account.
     * </p>
     * <p>
     * You have the option to use <code>EffectiveOn</code> to return a Cost Category that's active on a specific date.
     * If there's no <code>EffectiveOn</code> specified, you see a Cost Category that's effective on the current date.
     * If Cost Category is still effective, <code>EffectiveEnd</code> is omitted in the response.
     * </p>
     * 
     * @param describeCostCategoryDefinitionRequest
     * @return Result of the DescribeCostCategoryDefinition operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ARN in the request doesn't exist.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.DescribeCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DescribeCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCostCategoryDefinitionResult describeCostCategoryDefinition(DescribeCostCategoryDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCostCategoryDefinition(request);
    }

    @SdkInternalApi
    final DescribeCostCategoryDefinitionResult executeDescribeCostCategoryDefinition(DescribeCostCategoryDefinitionRequest describeCostCategoryDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCostCategoryDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCostCategoryDefinitionRequest> request = null;
        Response<DescribeCostCategoryDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCostCategoryDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCostCategoryDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCostCategoryDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCostCategoryDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCostCategoryDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all of the cost anomalies detected on your account during the time period that's specified by the
     * <code>DateInterval</code> object. Anomalies are available for up to 90 days.
     * </p>
     * 
     * @param getAnomaliesRequest
     * @return Result of the GetAnomalies operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetAnomalies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAnomaliesResult getAnomalies(GetAnomaliesRequest request) {
        request = beforeClientExecution(request);
        return executeGetAnomalies(request);
    }

    @SdkInternalApi
    final GetAnomaliesResult executeGetAnomalies(GetAnomaliesRequest getAnomaliesRequest) {

        ExecutionContext executionContext = createExecutionContext(getAnomaliesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAnomaliesRequest> request = null;
        Response<GetAnomaliesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAnomaliesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAnomaliesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAnomalies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAnomaliesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAnomaliesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the cost anomaly monitor definitions for your account. You can filter using a list of cost anomaly
     * monitor Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param getAnomalyMonitorsRequest
     * @return Result of the GetAnomalyMonitors operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws UnknownMonitorException
     *         The cost anomaly monitor does not exist for the account.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetAnomalyMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalyMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAnomalyMonitorsResult getAnomalyMonitors(GetAnomalyMonitorsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAnomalyMonitors(request);
    }

    @SdkInternalApi
    final GetAnomalyMonitorsResult executeGetAnomalyMonitors(GetAnomalyMonitorsRequest getAnomalyMonitorsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAnomalyMonitorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAnomalyMonitorsRequest> request = null;
        Response<GetAnomalyMonitorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAnomalyMonitorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAnomalyMonitorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAnomalyMonitors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAnomalyMonitorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAnomalyMonitorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the cost anomaly subscription objects for your account. You can filter using a list of cost anomaly
     * monitor Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param getAnomalySubscriptionsRequest
     * @return Result of the GetAnomalySubscriptions operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws UnknownSubscriptionException
     *         The cost anomaly subscription does not exist for the account.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetAnomalySubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalySubscriptions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAnomalySubscriptionsResult getAnomalySubscriptions(GetAnomalySubscriptionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAnomalySubscriptions(request);
    }

    @SdkInternalApi
    final GetAnomalySubscriptionsResult executeGetAnomalySubscriptions(GetAnomalySubscriptionsRequest getAnomalySubscriptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAnomalySubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAnomalySubscriptionsRequest> request = null;
        Response<GetAnomalySubscriptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAnomalySubscriptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAnomalySubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAnomalySubscriptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAnomalySubscriptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAnomalySubscriptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves estimated usage records for hourly granularity or resource-level data at daily granularity.
     * </p>
     * 
     * @param getApproximateUsageRecordsRequest
     * @return Result of the GetApproximateUsageRecords operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @sample AWSCostExplorer.GetApproximateUsageRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetApproximateUsageRecords" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetApproximateUsageRecordsResult getApproximateUsageRecords(GetApproximateUsageRecordsRequest request) {
        request = beforeClientExecution(request);
        return executeGetApproximateUsageRecords(request);
    }

    @SdkInternalApi
    final GetApproximateUsageRecordsResult executeGetApproximateUsageRecords(GetApproximateUsageRecordsRequest getApproximateUsageRecordsRequest) {

        ExecutionContext executionContext = createExecutionContext(getApproximateUsageRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApproximateUsageRecordsRequest> request = null;
        Response<GetApproximateUsageRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApproximateUsageRecordsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getApproximateUsageRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApproximateUsageRecords");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApproximateUsageRecordsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetApproximateUsageRecordsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves cost and usage metrics for your account. You can specify which cost and usage-related metric that you
     * want the request to return. For example, you can specify <code>BlendedCosts</code> or <code>UsageQuantity</code>.
     * You can also filter and group your data by various dimensions, such as <code>SERVICE</code> or <code>AZ</code>,
     * in a specific time range. For a complete list of valid dimensions, see the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Management account in an organization in Organizations have access to all
     * member accounts.
     * </p>
     * <p>
     * For information about filter limitations, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-limits.html">Quotas and
     * restrictions</a> in the <i>Billing and Cost Management User Guide</i>.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Retrieves cost and usage metrics with resources for your account. You can specify which cost and usage-related
     * metric, such as <code>BlendedCosts</code> or <code>UsageQuantity</code>, that you want the request to return. You
     * can also filter and group your data by various dimensions, such as <code>SERVICE</code> or <code>AZ</code>, in a
     * specific time range. For a complete list of valid dimensions, see the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_GetDimensionValues.html"
     * >GetDimensionValues</a> operation. Management account in an organization in Organizations have access to all
     * member accounts.
     * </p>
     * <p>
     * Hourly granularity is only available for EC2-Instances (Elastic Compute Cloud) resource-level data. All other
     * resource-level data is available at daily granularity.
     * </p>
     * <note>
     * <p>
     * This is an opt-in only feature. You can enable this feature from the Cost Explorer Settings page. For information
     * about how to access the Settings page, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-access.html">Controlling Access for Cost
     * Explorer</a> in the <i>Billing and Cost Management User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getCostAndUsageWithResourcesRequest
     * @return Result of the GetCostAndUsageWithResources operation returned by the service.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws BillExpirationException
     *         The requested report expired. Update the date interval and try again.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws RequestChangedException
     *         Your request parameters changed between pages. Try again with the old parameters or without a pagination
     *         token.
     * @sample AWSCostExplorer.GetCostAndUsageWithResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostAndUsageWithResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCostAndUsageWithResourcesResult getCostAndUsageWithResources(GetCostAndUsageWithResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeGetCostAndUsageWithResources(request);
    }

    @SdkInternalApi
    final GetCostAndUsageWithResourcesResult executeGetCostAndUsageWithResources(GetCostAndUsageWithResourcesRequest getCostAndUsageWithResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(getCostAndUsageWithResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCostAndUsageWithResourcesRequest> request = null;
        Response<GetCostAndUsageWithResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCostAndUsageWithResourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCostAndUsageWithResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCostAndUsageWithResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCostAndUsageWithResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCostAndUsageWithResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an array of Cost Category names and values incurred cost.
     * </p>
     * <note>
     * <p>
     * If some Cost Category names and values are not associated with any cost, they will not be returned by this API.
     * </p>
     * </note>
     * 
     * @param getCostCategoriesRequest
     * @return Result of the GetCostCategories operation returned by the service.
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
     * @sample AWSCostExplorer.GetCostCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostCategories" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCostCategoriesResult getCostCategories(GetCostCategoriesRequest request) {
        request = beforeClientExecution(request);
        return executeGetCostCategories(request);
    }

    @SdkInternalApi
    final GetCostCategoriesResult executeGetCostCategories(GetCostCategoriesRequest getCostCategoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(getCostCategoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCostCategoriesRequest> request = null;
        Response<GetCostCategoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCostCategoriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCostCategoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCostCategories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCostCategoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCostCategoriesResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Retrieves the reservation coverage for your account, which you can use to see how much of your Amazon Elastic
     * Compute Cloud, Amazon ElastiCache, Amazon Relational Database Service, or Amazon Redshift usage is covered by a
     * reservation. An organization's management account can see the coverage of the associated member accounts. This
     * supports dimensions, Cost Categories, and nested expressions. For any time period, you can filter data about
     * reservation usage by the following dimensions:
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Gets recommendations for reservation purchases. These recommendations might help you to reduce your costs.
     * Reservations provide a discounted hourly rate (up to 75%) compared to On-Demand pricing.
     * </p>
     * <p>
     * Amazon Web Services generates your recommendations by identifying your On-Demand usage during a specific time
     * period and collecting your usage into categories that are eligible for a reservation. After Amazon Web Services
     * has these categories, it simulates every combination of reservations in each category of usage to identify the
     * best number of each type of Reserved Instance (RI) to purchase to maximize your estimated savings.
     * </p>
     * <p>
     * For example, Amazon Web Services automatically aggregates your Amazon EC2 Linux, shared tenancy, and c4 family
     * usage in the US West (Oregon) Region and recommends that you buy size-flexible regional reservations to apply to
     * the c4 family usage. Amazon Web Services recommends the smallest size instance in an instance family. This makes
     * it easier to purchase a size-flexible Reserved Instance (RI). Amazon Web Services also shows the equal number of
     * normalized units. This way, you can purchase any instance size that you want. For this example, your RI
     * recommendation is for <code>c4.large</code> because that is the smallest size instance in the c4 instance family.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Retrieves the reservation utilization for your account. Management account in an organization have access to
     * member accounts. You can filter data by dimensions in a time period. You can use <code>GetDimensionValues</code>
     * to determine the possible dimension values. Currently, you can group only by <code>SUBSCRIPTION_ID</code>.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Creates recommendations that help you save cost by identifying idle and underutilized Amazon EC2 instances.
     * </p>
     * <p>
     * Recommendations are generated to either downsize or terminate instances, along with providing savings detail and
     * metrics. For more information about calculation and function, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-rightsizing.html">Optimizing Your Cost with
     * Rightsizing Recommendations</a> in the <i>Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param getRightsizingRecommendationRequest
     * @return Result of the GetRightsizingRecommendation operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetRightsizingRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetRightsizingRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRightsizingRecommendationResult getRightsizingRecommendation(GetRightsizingRecommendationRequest request) {
        request = beforeClientExecution(request);
        return executeGetRightsizingRecommendation(request);
    }

    @SdkInternalApi
    final GetRightsizingRecommendationResult executeGetRightsizingRecommendation(GetRightsizingRecommendationRequest getRightsizingRecommendationRequest) {

        ExecutionContext executionContext = createExecutionContext(getRightsizingRecommendationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRightsizingRecommendationRequest> request = null;
        Response<GetRightsizingRecommendationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRightsizingRecommendationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getRightsizingRecommendationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRightsizingRecommendation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRightsizingRecommendationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetRightsizingRecommendationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details for a Savings Plan recommendation. These details include the hourly data-points that
     * construct the cost, coverage, and utilization charts.
     * </p>
     * 
     * @param getSavingsPlanPurchaseRecommendationDetailsRequest
     * @return Result of the GetSavingsPlanPurchaseRecommendationDetails operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @sample AWSCostExplorer.GetSavingsPlanPurchaseRecommendationDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlanPurchaseRecommendationDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSavingsPlanPurchaseRecommendationDetailsResult getSavingsPlanPurchaseRecommendationDetails(
            GetSavingsPlanPurchaseRecommendationDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSavingsPlanPurchaseRecommendationDetails(request);
    }

    @SdkInternalApi
    final GetSavingsPlanPurchaseRecommendationDetailsResult executeGetSavingsPlanPurchaseRecommendationDetails(
            GetSavingsPlanPurchaseRecommendationDetailsRequest getSavingsPlanPurchaseRecommendationDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSavingsPlanPurchaseRecommendationDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSavingsPlanPurchaseRecommendationDetailsRequest> request = null;
        Response<GetSavingsPlanPurchaseRecommendationDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSavingsPlanPurchaseRecommendationDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSavingsPlanPurchaseRecommendationDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSavingsPlanPurchaseRecommendationDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSavingsPlanPurchaseRecommendationDetailsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetSavingsPlanPurchaseRecommendationDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the Savings Plans covered for your account. This enables you to see how much of your cost is covered by
     * a Savings Plan. An organization’s management account can see the coverage of the associated member accounts. This
     * supports dimensions, Cost Categories, and nested expressions. For any time period, you can filter data for
     * Savings Plans usage with the following dimensions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LINKED_ACCOUNT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSTANCE_FAMILY</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To determine valid values for a dimension, use the <code>GetDimensionValues</code> operation.
     * </p>
     * 
     * @param getSavingsPlansCoverageRequest
     * @return Result of the GetSavingsPlansCoverage operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetSavingsPlansCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSavingsPlansCoverageResult getSavingsPlansCoverage(GetSavingsPlansCoverageRequest request) {
        request = beforeClientExecution(request);
        return executeGetSavingsPlansCoverage(request);
    }

    @SdkInternalApi
    final GetSavingsPlansCoverageResult executeGetSavingsPlansCoverage(GetSavingsPlansCoverageRequest getSavingsPlansCoverageRequest) {

        ExecutionContext executionContext = createExecutionContext(getSavingsPlansCoverageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSavingsPlansCoverageRequest> request = null;
        Response<GetSavingsPlansCoverageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSavingsPlansCoverageRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSavingsPlansCoverageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSavingsPlansCoverage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSavingsPlansCoverageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSavingsPlansCoverageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the Savings Plans recommendations for your account. First use
     * <code>StartSavingsPlansPurchaseRecommendationGeneration</code> to generate a new set of recommendations, and then
     * use <code>GetSavingsPlansPurchaseRecommendation</code> to retrieve them.
     * </p>
     * 
     * @param getSavingsPlansPurchaseRecommendationRequest
     * @return Result of the GetSavingsPlansPurchaseRecommendation operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetSavingsPlansPurchaseRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansPurchaseRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSavingsPlansPurchaseRecommendationResult getSavingsPlansPurchaseRecommendation(GetSavingsPlansPurchaseRecommendationRequest request) {
        request = beforeClientExecution(request);
        return executeGetSavingsPlansPurchaseRecommendation(request);
    }

    @SdkInternalApi
    final GetSavingsPlansPurchaseRecommendationResult executeGetSavingsPlansPurchaseRecommendation(
            GetSavingsPlansPurchaseRecommendationRequest getSavingsPlansPurchaseRecommendationRequest) {

        ExecutionContext executionContext = createExecutionContext(getSavingsPlansPurchaseRecommendationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSavingsPlansPurchaseRecommendationRequest> request = null;
        Response<GetSavingsPlansPurchaseRecommendationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSavingsPlansPurchaseRecommendationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSavingsPlansPurchaseRecommendationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSavingsPlansPurchaseRecommendation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSavingsPlansPurchaseRecommendationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSavingsPlansPurchaseRecommendationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the Savings Plans utilization for your account across date ranges with daily or monthly granularity.
     * Management account in an organization have access to member accounts. You can use <code>GetDimensionValues</code>
     * in <code>SAVINGS_PLANS</code> to determine the possible dimension values.
     * </p>
     * <note>
     * <p>
     * You can't group by any dimension values for <code>GetSavingsPlansUtilization</code>.
     * </p>
     * </note>
     * 
     * @param getSavingsPlansUtilizationRequest
     * @return Result of the GetSavingsPlansUtilization operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @sample AWSCostExplorer.GetSavingsPlansUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansUtilization" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSavingsPlansUtilizationResult getSavingsPlansUtilization(GetSavingsPlansUtilizationRequest request) {
        request = beforeClientExecution(request);
        return executeGetSavingsPlansUtilization(request);
    }

    @SdkInternalApi
    final GetSavingsPlansUtilizationResult executeGetSavingsPlansUtilization(GetSavingsPlansUtilizationRequest getSavingsPlansUtilizationRequest) {

        ExecutionContext executionContext = createExecutionContext(getSavingsPlansUtilizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSavingsPlansUtilizationRequest> request = null;
        Response<GetSavingsPlansUtilizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSavingsPlansUtilizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSavingsPlansUtilizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSavingsPlansUtilization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSavingsPlansUtilizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSavingsPlansUtilizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves attribute data along with aggregate utilization and savings data for a given time period. This doesn't
     * support granular or grouped data (daily/monthly) in response. You can't retrieve data by dates in a single
     * response similar to <code>GetSavingsPlanUtilization</code>, but you have the option to make multiple calls to
     * <code>GetSavingsPlanUtilizationDetails</code> by providing individual dates. You can use
     * <code>GetDimensionValues</code> in <code>SAVINGS_PLANS</code> to determine the possible dimension values.
     * </p>
     * <note>
     * <p>
     * <code>GetSavingsPlanUtilizationDetails</code> internally groups data by <code>SavingsPlansArn</code>.
     * </p>
     * </note>
     * 
     * @param getSavingsPlansUtilizationDetailsRequest
     * @return Result of the GetSavingsPlansUtilizationDetails operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.GetSavingsPlansUtilizationDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansUtilizationDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSavingsPlansUtilizationDetailsResult getSavingsPlansUtilizationDetails(GetSavingsPlansUtilizationDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSavingsPlansUtilizationDetails(request);
    }

    @SdkInternalApi
    final GetSavingsPlansUtilizationDetailsResult executeGetSavingsPlansUtilizationDetails(
            GetSavingsPlansUtilizationDetailsRequest getSavingsPlansUtilizationDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSavingsPlansUtilizationDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSavingsPlansUtilizationDetailsRequest> request = null;
        Response<GetSavingsPlansUtilizationDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSavingsPlansUtilizationDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSavingsPlansUtilizationDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSavingsPlansUtilizationDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSavingsPlansUtilizationDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSavingsPlansUtilizationDetailsResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <p>
     * Retrieves a forecast for how much Amazon Web Services predicts that you will use over the forecast time period
     * that you select, based on your past usage.
     * </p>
     * 
     * @param getUsageForecastRequest
     * @return Result of the GetUsageForecast operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @throws UnresolvableUsageUnitException
     *         Cost Explorer was unable to identify the usage unit. Provide <code>UsageType/UsageTypeGroup</code> filter
     *         selections that contain matching units, for example: <code>hours</code>.
     * @sample AWSCostExplorer.GetUsageForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetUsageForecast" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetUsageForecastResult getUsageForecast(GetUsageForecastRequest request) {
        request = beforeClientExecution(request);
        return executeGetUsageForecast(request);
    }

    @SdkInternalApi
    final GetUsageForecastResult executeGetUsageForecast(GetUsageForecastRequest getUsageForecastRequest) {

        ExecutionContext executionContext = createExecutionContext(getUsageForecastRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetUsageForecastRequest> request = null;
        Response<GetUsageForecastResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetUsageForecastRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getUsageForecastRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetUsageForecast");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetUsageForecastResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetUsageForecastResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of your historical cost allocation tag backfill requests.
     * </p>
     * 
     * @param listCostAllocationTagBackfillHistoryRequest
     * @return Result of the ListCostAllocationTagBackfillHistory operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.ListCostAllocationTagBackfillHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListCostAllocationTagBackfillHistory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCostAllocationTagBackfillHistoryResult listCostAllocationTagBackfillHistory(ListCostAllocationTagBackfillHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeListCostAllocationTagBackfillHistory(request);
    }

    @SdkInternalApi
    final ListCostAllocationTagBackfillHistoryResult executeListCostAllocationTagBackfillHistory(
            ListCostAllocationTagBackfillHistoryRequest listCostAllocationTagBackfillHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(listCostAllocationTagBackfillHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCostAllocationTagBackfillHistoryRequest> request = null;
        Response<ListCostAllocationTagBackfillHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCostAllocationTagBackfillHistoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCostAllocationTagBackfillHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCostAllocationTagBackfillHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCostAllocationTagBackfillHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCostAllocationTagBackfillHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a list of cost allocation tags. All inputs in the API are optional and serve as filters. By default, all cost
     * allocation tags are returned.
     * </p>
     * 
     * @param listCostAllocationTagsRequest
     * @return Result of the ListCostAllocationTags operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @sample AWSCostExplorer.ListCostAllocationTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListCostAllocationTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCostAllocationTagsResult listCostAllocationTags(ListCostAllocationTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListCostAllocationTags(request);
    }

    @SdkInternalApi
    final ListCostAllocationTagsResult executeListCostAllocationTags(ListCostAllocationTagsRequest listCostAllocationTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCostAllocationTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCostAllocationTagsRequest> request = null;
        Response<ListCostAllocationTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCostAllocationTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCostAllocationTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCostAllocationTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCostAllocationTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCostAllocationTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the name, Amazon Resource Name (ARN), <code>NumberOfRules</code> and effective dates of all Cost
     * Categories defined in the account. You have the option to use <code>EffectiveOn</code> to return a list of Cost
     * Categories that were active on a specific date. If there is no <code>EffectiveOn</code> specified, you’ll see
     * Cost Categories that are effective on the current date. If Cost Category is still effective,
     * <code>EffectiveEnd</code> is omitted in the response. <code>ListCostCategoryDefinitions</code> supports
     * pagination. The request can have a <code>MaxResults</code> range up to 100.
     * </p>
     * 
     * @param listCostCategoryDefinitionsRequest
     * @return Result of the ListCostCategoryDefinitions operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.ListCostCategoryDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListCostCategoryDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListCostCategoryDefinitionsResult listCostCategoryDefinitions(ListCostCategoryDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeListCostCategoryDefinitions(request);
    }

    @SdkInternalApi
    final ListCostCategoryDefinitionsResult executeListCostCategoryDefinitions(ListCostCategoryDefinitionsRequest listCostCategoryDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCostCategoryDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCostCategoryDefinitionsRequest> request = null;
        Response<ListCostCategoryDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCostCategoryDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCostCategoryDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCostCategoryDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCostCategoryDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCostCategoryDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of your historical recommendation generations within the past 30 days.
     * </p>
     * 
     * @param listSavingsPlansPurchaseRecommendationGenerationRequest
     * @return Result of the ListSavingsPlansPurchaseRecommendationGeneration operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @sample AWSCostExplorer.ListSavingsPlansPurchaseRecommendationGeneration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListSavingsPlansPurchaseRecommendationGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSavingsPlansPurchaseRecommendationGenerationResult listSavingsPlansPurchaseRecommendationGeneration(
            ListSavingsPlansPurchaseRecommendationGenerationRequest request) {
        request = beforeClientExecution(request);
        return executeListSavingsPlansPurchaseRecommendationGeneration(request);
    }

    @SdkInternalApi
    final ListSavingsPlansPurchaseRecommendationGenerationResult executeListSavingsPlansPurchaseRecommendationGeneration(
            ListSavingsPlansPurchaseRecommendationGenerationRequest listSavingsPlansPurchaseRecommendationGenerationRequest) {

        ExecutionContext executionContext = createExecutionContext(listSavingsPlansPurchaseRecommendationGenerationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSavingsPlansPurchaseRecommendationGenerationRequest> request = null;
        Response<ListSavingsPlansPurchaseRecommendationGenerationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSavingsPlansPurchaseRecommendationGenerationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSavingsPlansPurchaseRecommendationGenerationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSavingsPlansPurchaseRecommendationGeneration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSavingsPlansPurchaseRecommendationGenerationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListSavingsPlansPurchaseRecommendationGenerationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of resource tags associated with the resource specified by the Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ARN in the request doesn't exist.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
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
     * Modifies the feedback property of a given cost anomaly.
     * </p>
     * 
     * @param provideAnomalyFeedbackRequest
     * @return Result of the ProvideAnomalyFeedback operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.ProvideAnomalyFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ProvideAnomalyFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ProvideAnomalyFeedbackResult provideAnomalyFeedback(ProvideAnomalyFeedbackRequest request) {
        request = beforeClientExecution(request);
        return executeProvideAnomalyFeedback(request);
    }

    @SdkInternalApi
    final ProvideAnomalyFeedbackResult executeProvideAnomalyFeedback(ProvideAnomalyFeedbackRequest provideAnomalyFeedbackRequest) {

        ExecutionContext executionContext = createExecutionContext(provideAnomalyFeedbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ProvideAnomalyFeedbackRequest> request = null;
        Response<ProvideAnomalyFeedbackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ProvideAnomalyFeedbackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(provideAnomalyFeedbackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ProvideAnomalyFeedback");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ProvideAnomalyFeedbackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ProvideAnomalyFeedbackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Request a cost allocation tag backfill. This will backfill the activation status (either <code>active</code> or
     * <code>inactive</code>) for all tag keys from <code>para:BackfillFrom</code> up to the when this request is made.
     * </p>
     * <p>
     * You can request a backfill once every 24 hours.
     * </p>
     * 
     * @param startCostAllocationTagBackfillRequest
     * @return Result of the StartCostAllocationTagBackfill operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws BackfillLimitExceededException
     *         A request to backfill is already in progress. Once the previous request is complete, you can create
     *         another request.
     * @sample AWSCostExplorer.StartCostAllocationTagBackfill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/StartCostAllocationTagBackfill"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartCostAllocationTagBackfillResult startCostAllocationTagBackfill(StartCostAllocationTagBackfillRequest request) {
        request = beforeClientExecution(request);
        return executeStartCostAllocationTagBackfill(request);
    }

    @SdkInternalApi
    final StartCostAllocationTagBackfillResult executeStartCostAllocationTagBackfill(StartCostAllocationTagBackfillRequest startCostAllocationTagBackfillRequest) {

        ExecutionContext executionContext = createExecutionContext(startCostAllocationTagBackfillRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCostAllocationTagBackfillRequest> request = null;
        Response<StartCostAllocationTagBackfillResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCostAllocationTagBackfillRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startCostAllocationTagBackfillRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartCostAllocationTagBackfill");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartCostAllocationTagBackfillResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartCostAllocationTagBackfillResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests a Savings Plans recommendation generation. This enables you to calculate a fresh set of Savings Plans
     * recommendations that takes your latest usage data and current Savings Plans inventory into account. You can
     * refresh Savings Plans recommendations up to three times daily for a consolidated billing family.
     * </p>
     * <note>
     * <p>
     * <code>StartSavingsPlansPurchaseRecommendationGeneration</code> has no request syntax because no input parameters
     * are needed to support this operation.
     * </p>
     * </note>
     * 
     * @param startSavingsPlansPurchaseRecommendationGenerationRequest
     * @return Result of the StartSavingsPlansPurchaseRecommendationGeneration operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws ServiceQuotaExceededException
     *         You've reached the limit on the number of resources you can create, or exceeded the size of an individual
     *         resource.
     * @throws GenerationExistsException
     *         A request to generate a recommendation is already in progress.
     * @throws DataUnavailableException
     *         The requested data is unavailable.
     * @sample AWSCostExplorer.StartSavingsPlansPurchaseRecommendationGeneration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/StartSavingsPlansPurchaseRecommendationGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartSavingsPlansPurchaseRecommendationGenerationResult startSavingsPlansPurchaseRecommendationGeneration(
            StartSavingsPlansPurchaseRecommendationGenerationRequest request) {
        request = beforeClientExecution(request);
        return executeStartSavingsPlansPurchaseRecommendationGeneration(request);
    }

    @SdkInternalApi
    final StartSavingsPlansPurchaseRecommendationGenerationResult executeStartSavingsPlansPurchaseRecommendationGeneration(
            StartSavingsPlansPurchaseRecommendationGenerationRequest startSavingsPlansPurchaseRecommendationGenerationRequest) {

        ExecutionContext executionContext = createExecutionContext(startSavingsPlansPurchaseRecommendationGenerationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSavingsPlansPurchaseRecommendationGenerationRequest> request = null;
        Response<StartSavingsPlansPurchaseRecommendationGenerationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSavingsPlansPurchaseRecommendationGenerationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startSavingsPlansPurchaseRecommendationGenerationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSavingsPlansPurchaseRecommendationGeneration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSavingsPlansPurchaseRecommendationGenerationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartSavingsPlansPurchaseRecommendationGenerationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * An API operation for adding one or more tags (key-value pairs) to a resource.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> operation with a resource that already has tags. If you specify a new
     * tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a
     * tag key that is already associated with the resource, the new tag value you specify replaces the previous value
     * for that tag.
     * </p>
     * <p>
     * Although the maximum number of array members is 200, user-tag maximum is 50. The remaining are reserved for
     * Amazon Web Services use.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ARN in the request doesn't exist.
     * @throws TooManyTagsException
     *         Can occur if you specify a number of tags for a resource greater than the maximum 50 user tags per
     *         resource.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
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
     * Removes one or more tags from a resource. Specify only tag keys in your request. Don't specify the value.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ARN in the request doesn't exist.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
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
     * Updates an existing cost anomaly monitor. The changes made are applied going forward, and doesn't change
     * anomalies detected in the past.
     * </p>
     * 
     * @param updateAnomalyMonitorRequest
     * @return Result of the UpdateAnomalyMonitor operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws UnknownMonitorException
     *         The cost anomaly monitor does not exist for the account.
     * @sample AWSCostExplorer.UpdateAnomalyMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateAnomalyMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAnomalyMonitorResult updateAnomalyMonitor(UpdateAnomalyMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAnomalyMonitor(request);
    }

    @SdkInternalApi
    final UpdateAnomalyMonitorResult executeUpdateAnomalyMonitor(UpdateAnomalyMonitorRequest updateAnomalyMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAnomalyMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAnomalyMonitorRequest> request = null;
        Response<UpdateAnomalyMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAnomalyMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAnomalyMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAnomalyMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAnomalyMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAnomalyMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing cost anomaly subscription. Specify the fields that you want to update. Omitted fields are
     * unchanged.
     * </p>
     * <note>
     * <p>
     * The JSON below describes the generic construct for each type. See <a href=
     * "https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_UpdateAnomalySubscription.html#API_UpdateAnomalySubscription_RequestParameters"
     * >Request Parameters</a> for possible values as they apply to <code>AnomalySubscription</code>.
     * </p>
     * </note>
     * 
     * @param updateAnomalySubscriptionRequest
     * @return Result of the UpdateAnomalySubscription operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @throws UnknownMonitorException
     *         The cost anomaly monitor does not exist for the account.
     * @throws UnknownSubscriptionException
     *         The cost anomaly subscription does not exist for the account.
     * @sample AWSCostExplorer.UpdateAnomalySubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateAnomalySubscription" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateAnomalySubscriptionResult updateAnomalySubscription(UpdateAnomalySubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAnomalySubscription(request);
    }

    @SdkInternalApi
    final UpdateAnomalySubscriptionResult executeUpdateAnomalySubscription(UpdateAnomalySubscriptionRequest updateAnomalySubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAnomalySubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAnomalySubscriptionRequest> request = null;
        Response<UpdateAnomalySubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAnomalySubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAnomalySubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAnomalySubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAnomalySubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAnomalySubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates status for cost allocation tags in bulk, with maximum batch size of 20. If the tag status that's updated
     * is the same as the existing tag status, the request doesn't fail. Instead, it doesn't have any effect on the tag
     * status (for example, activating the active tag).
     * </p>
     * 
     * @param updateCostAllocationTagsStatusRequest
     * @return Result of the UpdateCostAllocationTagsStatus operation returned by the service.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.UpdateCostAllocationTagsStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateCostAllocationTagsStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCostAllocationTagsStatusResult updateCostAllocationTagsStatus(UpdateCostAllocationTagsStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCostAllocationTagsStatus(request);
    }

    @SdkInternalApi
    final UpdateCostAllocationTagsStatusResult executeUpdateCostAllocationTagsStatus(UpdateCostAllocationTagsStatusRequest updateCostAllocationTagsStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCostAllocationTagsStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCostAllocationTagsStatusRequest> request = null;
        Response<UpdateCostAllocationTagsStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCostAllocationTagsStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCostAllocationTagsStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCostAllocationTagsStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCostAllocationTagsStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateCostAllocationTagsStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing Cost Category. Changes made to the Cost Category rules will be used to categorize the current
     * month’s expenses and future expenses. This won’t change categorization for the previous months.
     * </p>
     * 
     * @param updateCostCategoryDefinitionRequest
     * @return Result of the UpdateCostCategoryDefinition operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified ARN in the request doesn't exist.
     * @throws ServiceQuotaExceededException
     *         You've reached the limit on the number of resources you can create, or exceeded the size of an individual
     *         resource.
     * @throws LimitExceededException
     *         You made too many calls in a short period of time. Try again later.
     * @sample AWSCostExplorer.UpdateCostCategoryDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UpdateCostCategoryDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCostCategoryDefinitionResult updateCostCategoryDefinition(UpdateCostCategoryDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCostCategoryDefinition(request);
    }

    @SdkInternalApi
    final UpdateCostCategoryDefinitionResult executeUpdateCostCategoryDefinition(UpdateCostCategoryDefinitionRequest updateCostCategoryDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCostCategoryDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCostCategoryDefinitionRequest> request = null;
        Response<UpdateCostCategoryDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCostCategoryDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCostCategoryDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cost Explorer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCostCategoryDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCostCategoryDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateCostCategoryDefinitionResultJsonUnmarshaller());
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
