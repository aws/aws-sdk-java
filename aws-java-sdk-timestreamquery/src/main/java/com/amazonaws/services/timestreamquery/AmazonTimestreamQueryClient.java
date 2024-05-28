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
package com.amazonaws.services.timestreamquery;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.services.timestreamquery.endpointdiscovery.AmazonTimestreamQueryEndpointCache;
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

import com.amazonaws.services.timestreamquery.AmazonTimestreamQueryClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.timestreamquery.model.*;

import com.amazonaws.services.timestreamquery.model.transform.*;

/**
 * Client for accessing Timestream Query. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon Timestream Query </fullname>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonTimestreamQueryClient extends AmazonWebServiceClient implements AmazonTimestreamQuery {

    protected AmazonTimestreamQueryEndpointCache cache;

    private final boolean endpointDiscoveryEnabled;
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonTimestreamQuery.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "timestream";

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
                                    com.amazonaws.services.timestreamquery.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamquery.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEndpointException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamquery.model.transform.InvalidEndpointExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamquery.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamquery.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamquery.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamquery.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamquery.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("QueryExecutionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.timestreamquery.model.transform.QueryExecutionExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.timestreamquery.model.AmazonTimestreamQueryException.class));

    public static AmazonTimestreamQueryClientBuilder builder() {
        return AmazonTimestreamQueryClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Timestream Query using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonTimestreamQueryClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Timestream Query using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonTimestreamQueryClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.endpointDiscoveryEnabled = endpointDiscoveryEnabled;
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        if (endpointDiscoveryEnabled) {
            cache = new AmazonTimestreamQueryEndpointCache(this);
        }
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("query.timestream.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/timestreamquery/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/timestreamquery/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels a query that has been issued. Cancellation is provided only if the query has not completed running before
     * the cancellation request was issued. Because cancellation is an idempotent operation, subsequent cancellation
     * requests will return a <code>CancellationMessage</code>, indicating that the query has already been canceled. See
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.cancel-query.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param cancelQueryRequest
     * @return Result of the CancelQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         The service was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.CancelQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/CancelQuery" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelQueryResult cancelQuery(CancelQueryRequest request) {
        request = beforeClientExecution(request);
        return executeCancelQuery(request);
    }

    @SdkInternalApi
    final CancelQueryResult executeCancelQuery(CancelQueryRequest cancelQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelQueryRequest> request = null;
        Response<CancelQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a scheduled query that will be run on your behalf at the configured schedule. Timestream assumes the
     * execution role provided as part of the <code>ScheduledQueryExecutionRoleArn</code> parameter to run the query.
     * You can use the <code>NotificationConfiguration</code> parameter to configure notification for your scheduled
     * query operations.
     * </p>
     * 
     * @param createScheduledQueryRequest
     * @return Result of the CreateScheduledQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ConflictException
     *         Unable to poll results for a cancelled query.
     * @throws InternalServerException
     *         The service was unable to fully process this request because of an internal server error.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.CreateScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/CreateScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateScheduledQueryResult createScheduledQuery(CreateScheduledQueryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateScheduledQuery(request);
    }

    @SdkInternalApi
    final CreateScheduledQueryResult executeCreateScheduledQuery(CreateScheduledQueryRequest createScheduledQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(createScheduledQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateScheduledQueryRequest> request = null;
        Response<CreateScheduledQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateScheduledQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createScheduledQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateScheduledQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateScheduledQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateScheduledQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a given scheduled query. This is an irreversible operation.
     * </p>
     * 
     * @param deleteScheduledQueryRequest
     * @return Result of the DeleteScheduledQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         The service was unable to fully process this request because of an internal server error.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.DeleteScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DeleteScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteScheduledQueryResult deleteScheduledQuery(DeleteScheduledQueryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteScheduledQuery(request);
    }

    @SdkInternalApi
    final DeleteScheduledQueryResult executeDeleteScheduledQuery(DeleteScheduledQueryRequest deleteScheduledQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteScheduledQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScheduledQueryRequest> request = null;
        Response<DeleteScheduledQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScheduledQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteScheduledQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteScheduledQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteScheduledQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteScheduledQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the settings for your account that include the query pricing model and the configured maximum TCUs the
     * service can use for your query workload.
     * </p>
     * <p>
     * You're charged only for the duration of compute units used for your workloads.
     * </p>
     * 
     * @param describeAccountSettingsRequest
     * @return Result of the DescribeAccountSettings operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         The service was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.DescribeAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DescribeAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountSettingsResult describeAccountSettings(DescribeAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountSettings(request);
    }

    @SdkInternalApi
    final DescribeAccountSettingsResult executeDescribeAccountSettings(DescribeAccountSettingsRequest describeAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountSettingsRequest> request = null;
        Response<DescribeAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * DescribeEndpoints returns a list of available endpoints to make Timestream API calls against. This API is
     * available through both Write and Query.
     * </p>
     * <p>
     * Because the Timestream SDKs are designed to transparently work with the service’s architecture, including the
     * management and mapping of the service endpoints, <i>it is not recommended that you use this API unless</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are using <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/VPCEndpoints">VPC endpoints
     * (Amazon Web Services PrivateLink) with Timestream </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Your application uses a programming language that does not yet have SDK support
     * </p>
     * </li>
     * <li>
     * <p>
     * You require better control over the client-side implementation
     * </p>
     * </li>
     * </ul>
     * <p>
     * For detailed information on how and when to use and implement DescribeEndpoints, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/Using.API.html#Using-API.endpoint-discovery"
     * >The Endpoint Discovery Pattern</a>.
     * </p>
     * 
     * @param describeEndpointsRequest
     * @return Result of the DescribeEndpoints operation returned by the service.
     * @throws InternalServerException
     *         The service was unable to fully process this request because of an internal server error.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonTimestreamQuery.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DescribeEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEndpoints(request);
    }

    @SdkInternalApi
    final DescribeEndpointsResult executeDescribeEndpoints(DescribeEndpointsRequest describeEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointsRequest> request = null;
        Response<DescribeEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides detailed information about a scheduled query.
     * </p>
     * 
     * @param describeScheduledQueryRequest
     * @return Result of the DescribeScheduledQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         The service was unable to fully process this request because of an internal server error.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.DescribeScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/DescribeScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeScheduledQueryResult describeScheduledQuery(DescribeScheduledQueryRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScheduledQuery(request);
    }

    @SdkInternalApi
    final DescribeScheduledQueryResult executeDescribeScheduledQuery(DescribeScheduledQueryRequest describeScheduledQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScheduledQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScheduledQueryRequest> request = null;
        Response<DescribeScheduledQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScheduledQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeScheduledQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScheduledQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScheduledQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeScheduledQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You can use this API to run a scheduled query manually.
     * </p>
     * 
     * @param executeScheduledQueryRequest
     * @return Result of the ExecuteScheduledQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         The service was unable to fully process this request because of an internal server error.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.ExecuteScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ExecuteScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExecuteScheduledQueryResult executeScheduledQuery(ExecuteScheduledQueryRequest request) {
        request = beforeClientExecution(request);
        return executeExecuteScheduledQuery(request);
    }

    @SdkInternalApi
    final ExecuteScheduledQueryResult executeExecuteScheduledQuery(ExecuteScheduledQueryRequest executeScheduledQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(executeScheduledQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteScheduledQueryRequest> request = null;
        Response<ExecuteScheduledQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteScheduledQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(executeScheduledQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecuteScheduledQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExecuteScheduledQueryResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ExecuteScheduledQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of all scheduled queries in the caller's Amazon account and Region. <code>ListScheduledQueries</code>
     * is eventually consistent.
     * </p>
     * 
     * @param listScheduledQueriesRequest
     * @return Result of the ListScheduledQueries operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         The service was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.ListScheduledQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ListScheduledQueries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListScheduledQueriesResult listScheduledQueries(ListScheduledQueriesRequest request) {
        request = beforeClientExecution(request);
        return executeListScheduledQueries(request);
    }

    @SdkInternalApi
    final ListScheduledQueriesResult executeListScheduledQueries(ListScheduledQueriesRequest listScheduledQueriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listScheduledQueriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListScheduledQueriesRequest> request = null;
        Response<ListScheduledQueriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListScheduledQueriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listScheduledQueriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListScheduledQueries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListScheduledQueriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListScheduledQueriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all tags on a Timestream query resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A synchronous operation that allows you to submit a query with parameters to be stored by Timestream for later
     * running. Timestream only supports using this operation with <code>ValidateOnly</code> set to <code>true</code>.
     * </p>
     * 
     * @param prepareQueryRequest
     * @return Result of the PrepareQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         The service was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.PrepareQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/PrepareQuery" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PrepareQueryResult prepareQuery(PrepareQueryRequest request) {
        request = beforeClientExecution(request);
        return executePrepareQuery(request);
    }

    @SdkInternalApi
    final PrepareQueryResult executePrepareQuery(PrepareQueryRequest prepareQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(prepareQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PrepareQueryRequest> request = null;
        Response<PrepareQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PrepareQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(prepareQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PrepareQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PrepareQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PrepareQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * <code>Query</code> is a synchronous operation that enables you to run a query against your Amazon Timestream
     * data. <code>Query</code> will time out after 60 seconds. You must update the default timeout in the SDK to
     * support a timeout of 60 seconds. See the <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.run-query.html">code sample</a>
     * for details.
     * </p>
     * <p>
     * Your query request will fail in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you submit a <code>Query</code> request with the same client token outside of the 5-minute idempotency window.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you submit a <code>Query</code> request with the same client token, but change other parameters, within the
     * 5-minute idempotency window.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the size of the row (including the query metadata) exceeds 1 MB, then the query will fail with the following
     * error message:
     * </p>
     * <p>
     * <code>Query aborted as max page response size has been exceeded by the output result row</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * If the IAM principal of the query initiator and the result reader are not the same and/or the query initiator and
     * the result reader do not have the same query string in the query requests, the query will fail with an
     * <code>Invalid pagination token</code> error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param queryRequest
     * @return Result of the Query operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ConflictException
     *         Unable to poll results for a cancelled query.
     * @throws InternalServerException
     *         The service was unable to fully process this request because of an internal server error.
     * @throws QueryExecutionException
     *         Timestream was unable to run the query successfully.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.Query
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/Query" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public QueryResult query(QueryRequest request) {
        request = beforeClientExecution(request);
        return executeQuery(request);
    }

    @SdkInternalApi
    final QueryResult executeQuery(QueryRequest queryRequest) {

        ExecutionContext executionContext = createExecutionContext(queryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<QueryRequest> request = null;
        Response<QueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new QueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(queryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Query");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<QueryResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new QueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associate a set of tags with a Timestream resource. You can then activate these user-defined tags so that they
     * appear on the Billing and Cost Management console for cost allocation tracking.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the association of tags from a Timestream query resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Transitions your account to use TCUs for query pricing and modifies the maximum query compute units that you've
     * configured. If you reduce the value of <code>MaxQueryTCU</code> to a desired configuration, the new value can
     * take up to 24 hours to be effective.
     * </p>
     * <note>
     * <p>
     * After you've transitioned your account to use TCUs for query pricing, you can't transition to using bytes scanned
     * for query pricing.
     * </p>
     * </note>
     * 
     * @param updateAccountSettingsRequest
     * @return Result of the UpdateAccountSettings operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         The service was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UpdateAccountSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAccountSettingsResult updateAccountSettings(UpdateAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccountSettings(request);
    }

    @SdkInternalApi
    final UpdateAccountSettingsResult executeUpdateAccountSettings(UpdateAccountSettingsRequest updateAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountSettingsRequest> request = null;
        Response<UpdateAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccountSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a scheduled query.
     * </p>
     * 
     * @param updateScheduledQueryRequest
     * @return Result of the UpdateScheduledQuery operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InternalServerException
     *         The service was unable to fully process this request because of an internal server error.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was not valid.
     * @sample AmazonTimestreamQuery.UpdateScheduledQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UpdateScheduledQuery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateScheduledQueryResult updateScheduledQuery(UpdateScheduledQueryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateScheduledQuery(request);
    }

    @SdkInternalApi
    final UpdateScheduledQueryResult executeUpdateScheduledQuery(UpdateScheduledQueryRequest updateScheduledQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateScheduledQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateScheduledQueryRequest> request = null;
        Response<UpdateScheduledQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateScheduledQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateScheduledQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Timestream Query");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateScheduledQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;
            if (endpointDiscoveryEnabled) {
                DescribeEndpointsRequest discoveryRequest = new DescribeEndpointsRequest();
                cachedEndpoint = cache.get(awsCredentialsProvider.getCredentials().getAWSAccessKeyId(), discoveryRequest, true, endpoint);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateScheduledQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateScheduledQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, cachedEndpoint, null);

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
        if (cache != null) {
            cache.shutdown();
        }
    }

}
