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
package com.amazonaws.services.devopsguru;

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

import com.amazonaws.services.devopsguru.AmazonDevOpsGuruClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.devopsguru.model.*;
import com.amazonaws.services.devopsguru.model.transform.*;

/**
 * Client for accessing Amazon DevOps Guru. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDevOpsGuruClient extends AmazonWebServiceClient implements AmazonDevOpsGuru {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDevOpsGuru.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "devops-guru";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.devopsguru.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.devopsguru.model.AmazonDevOpsGuruException.class));

    public static AmazonDevOpsGuruClientBuilder builder() {
        return AmazonDevOpsGuruClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DevOps Guru using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDevOpsGuruClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DevOps Guru using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDevOpsGuruClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("devops-guru.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/devopsguru/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/devopsguru/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * @param addNotificationChannelRequest
     * @return Result of the AddNotificationChannel operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @sample AmazonDevOpsGuru.AddNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AddNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddNotificationChannelResult addNotificationChannel(AddNotificationChannelRequest request) {
        request = beforeClientExecution(request);
        return executeAddNotificationChannel(request);
    }

    @SdkInternalApi
    final AddNotificationChannelResult executeAddNotificationChannel(AddNotificationChannelRequest addNotificationChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(addNotificationChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddNotificationChannelRequest> request = null;
        Response<AddNotificationChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddNotificationChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addNotificationChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddNotificationChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddNotificationChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AddNotificationChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param describeAccountHealthRequest
     * @return Result of the DescribeAccountHealth operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.DescribeAccountHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountHealth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountHealthResult describeAccountHealth(DescribeAccountHealthRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountHealth(request);
    }

    @SdkInternalApi
    final DescribeAccountHealthResult executeDescribeAccountHealth(DescribeAccountHealthRequest describeAccountHealthRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountHealthRequest> request = null;
        Response<DescribeAccountHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountHealthRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAccountHealthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountHealth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountHealthResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeAccountHealthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param describeAccountOverviewRequest
     * @return Result of the DescribeAccountOverview operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.DescribeAccountOverview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountOverview"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountOverviewResult describeAccountOverview(DescribeAccountOverviewRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountOverview(request);
    }

    @SdkInternalApi
    final DescribeAccountOverviewResult executeDescribeAccountOverview(DescribeAccountOverviewRequest describeAccountOverviewRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountOverviewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountOverviewRequest> request = null;
        Response<DescribeAccountOverviewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountOverviewRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccountOverviewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountOverview");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountOverviewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAccountOverviewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param describeAnomalyRequest
     * @return Result of the DescribeAnomaly operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.DescribeAnomaly
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAnomaly" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAnomalyResult describeAnomaly(DescribeAnomalyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAnomaly(request);
    }

    @SdkInternalApi
    final DescribeAnomalyResult executeDescribeAnomaly(DescribeAnomalyRequest describeAnomalyRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAnomalyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAnomalyRequest> request = null;
        Response<DescribeAnomalyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAnomalyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAnomalyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAnomaly");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAnomalyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAnomalyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param describeInsightRequest
     * @return Result of the DescribeInsight operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.DescribeInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeInsight" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeInsightResult describeInsight(DescribeInsightRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInsight(request);
    }

    @SdkInternalApi
    final DescribeInsightResult executeDescribeInsight(DescribeInsightRequest describeInsightRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInsightRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInsightRequest> request = null;
        Response<DescribeInsightResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInsightRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeInsightRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInsight");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInsightResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeInsightResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param describeResourceCollectionHealthRequest
     * @return Result of the DescribeResourceCollectionHealth operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.DescribeResourceCollectionHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeResourceCollectionHealth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeResourceCollectionHealthResult describeResourceCollectionHealth(DescribeResourceCollectionHealthRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeResourceCollectionHealth(request);
    }

    @SdkInternalApi
    final DescribeResourceCollectionHealthResult executeDescribeResourceCollectionHealth(
            DescribeResourceCollectionHealthRequest describeResourceCollectionHealthRequest) {

        ExecutionContext executionContext = createExecutionContext(describeResourceCollectionHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourceCollectionHealthRequest> request = null;
        Response<DescribeResourceCollectionHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourceCollectionHealthRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeResourceCollectionHealthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeResourceCollectionHealth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeResourceCollectionHealthResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeResourceCollectionHealthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param describeServiceIntegrationRequest
     * @return Result of the DescribeServiceIntegration operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.DescribeServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeServiceIntegrationResult describeServiceIntegration(DescribeServiceIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeServiceIntegration(request);
    }

    @SdkInternalApi
    final DescribeServiceIntegrationResult executeDescribeServiceIntegration(DescribeServiceIntegrationRequest describeServiceIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeServiceIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceIntegrationRequest> request = null;
        Response<DescribeServiceIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServiceIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeServiceIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeServiceIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeServiceIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeServiceIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param getResourceCollectionRequest
     * @return Result of the GetResourceCollection operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.GetResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourceCollectionResult getResourceCollection(GetResourceCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourceCollection(request);
    }

    @SdkInternalApi
    final GetResourceCollectionResult executeGetResourceCollection(GetResourceCollectionRequest getResourceCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourceCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourceCollectionRequest> request = null;
        Response<GetResourceCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourceCollectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourceCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourceCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourceCollectionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetResourceCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param listAnomaliesForInsightRequest
     * @return Result of the ListAnomaliesForInsight operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.ListAnomaliesForInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListAnomaliesForInsight"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAnomaliesForInsightResult listAnomaliesForInsight(ListAnomaliesForInsightRequest request) {
        request = beforeClientExecution(request);
        return executeListAnomaliesForInsight(request);
    }

    @SdkInternalApi
    final ListAnomaliesForInsightResult executeListAnomaliesForInsight(ListAnomaliesForInsightRequest listAnomaliesForInsightRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnomaliesForInsightRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnomaliesForInsightRequest> request = null;
        Response<ListAnomaliesForInsightResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnomaliesForInsightRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAnomaliesForInsightRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnomaliesForInsight");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnomaliesForInsightResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAnomaliesForInsightResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param listEventsRequest
     * @return Result of the ListEvents operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.ListEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEventsResult listEvents(ListEventsRequest request) {
        request = beforeClientExecution(request);
        return executeListEvents(request);
    }

    @SdkInternalApi
    final ListEventsResult executeListEvents(ListEventsRequest listEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventsRequest> request = null;
        Response<ListEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEventsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param listInsightsRequest
     * @return Result of the ListInsights operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.ListInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListInsights" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListInsightsResult listInsights(ListInsightsRequest request) {
        request = beforeClientExecution(request);
        return executeListInsights(request);
    }

    @SdkInternalApi
    final ListInsightsResult executeListInsights(ListInsightsRequest listInsightsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInsightsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInsightsRequest> request = null;
        Response<ListInsightsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInsightsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInsightsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInsights");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInsightsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInsightsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param listNotificationChannelsRequest
     * @return Result of the ListNotificationChannels operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.ListNotificationChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListNotificationChannels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNotificationChannelsResult listNotificationChannels(ListNotificationChannelsRequest request) {
        request = beforeClientExecution(request);
        return executeListNotificationChannels(request);
    }

    @SdkInternalApi
    final ListNotificationChannelsResult executeListNotificationChannels(ListNotificationChannelsRequest listNotificationChannelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listNotificationChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNotificationChannelsRequest> request = null;
        Response<ListNotificationChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNotificationChannelsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listNotificationChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNotificationChannels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNotificationChannelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListNotificationChannelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param listRecommendationsRequest
     * @return Result of the ListRecommendations operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListRecommendations"
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
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
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
     * @param putFeedbackRequest
     * @return Result of the PutFeedback operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @sample AmazonDevOpsGuru.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutFeedbackResult putFeedback(PutFeedbackRequest request) {
        request = beforeClientExecution(request);
        return executePutFeedback(request);
    }

    @SdkInternalApi
    final PutFeedbackResult executePutFeedback(PutFeedbackRequest putFeedbackRequest) {

        ExecutionContext executionContext = createExecutionContext(putFeedbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutFeedbackRequest> request = null;
        Response<PutFeedbackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutFeedbackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putFeedbackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutFeedback");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutFeedbackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutFeedbackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param removeNotificationChannelRequest
     * @return Result of the RemoveNotificationChannel operation returned by the service.
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @sample AmazonDevOpsGuru.RemoveNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/RemoveNotificationChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveNotificationChannelResult removeNotificationChannel(RemoveNotificationChannelRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveNotificationChannel(request);
    }

    @SdkInternalApi
    final RemoveNotificationChannelResult executeRemoveNotificationChannel(RemoveNotificationChannelRequest removeNotificationChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(removeNotificationChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveNotificationChannelRequest> request = null;
        Response<RemoveNotificationChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveNotificationChannelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeNotificationChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveNotificationChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveNotificationChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveNotificationChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param searchInsightsRequest
     * @return Result of the SearchInsights operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.SearchInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/SearchInsights" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchInsightsResult searchInsights(SearchInsightsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchInsights(request);
    }

    @SdkInternalApi
    final SearchInsightsResult executeSearchInsights(SearchInsightsRequest searchInsightsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchInsightsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchInsightsRequest> request = null;
        Response<SearchInsightsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchInsightsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchInsightsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchInsights");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchInsightsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchInsightsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param updateResourceCollectionRequest
     * @return Result of the UpdateResourceCollection operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.UpdateResourceCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateResourceCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateResourceCollectionResult updateResourceCollection(UpdateResourceCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResourceCollection(request);
    }

    @SdkInternalApi
    final UpdateResourceCollectionResult executeUpdateResourceCollection(UpdateResourceCollectionRequest updateResourceCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResourceCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResourceCollectionRequest> request = null;
        Response<UpdateResourceCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResourceCollectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateResourceCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResourceCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResourceCollectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateResourceCollectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param updateServiceIntegrationRequest
     * @return Result of the UpdateServiceIntegration operation returned by the service.
     * @throws ThrottlingException
     * @throws ValidationException
     * @throws InternalServerException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @sample AmazonDevOpsGuru.UpdateServiceIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateServiceIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServiceIntegrationResult updateServiceIntegration(UpdateServiceIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceIntegration(request);
    }

    @SdkInternalApi
    final UpdateServiceIntegrationResult executeUpdateServiceIntegration(UpdateServiceIntegrationRequest updateServiceIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceIntegrationRequest> request = null;
        Response<UpdateServiceIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateServiceIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DevOps Guru");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateServiceIntegrationResultJsonUnmarshaller());
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
