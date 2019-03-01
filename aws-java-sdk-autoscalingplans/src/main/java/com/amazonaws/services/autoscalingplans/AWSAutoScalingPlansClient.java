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
package com.amazonaws.services.autoscalingplans;

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

import com.amazonaws.services.autoscalingplans.AWSAutoScalingPlansClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.autoscalingplans.model.*;
import com.amazonaws.services.autoscalingplans.model.transform.*;

/**
 * Client for accessing AWS Auto Scaling Plans. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <fullname>AWS Auto Scaling</fullname>
 * <p>
 * Use AWS Auto Scaling to quickly discover all the scalable AWS resources for your application and configure dynamic
 * scaling and predictive scaling for your resources using scaling plans. Use this service in conjunction with the
 * Amazon EC2 Auto Scaling, Application Auto Scaling, Amazon CloudWatch, and AWS CloudFormation services.
 * </p>
 * <p>
 * Currently, predictive scaling is only available for Amazon EC2 Auto Scaling groups.
 * </p>
 * <p>
 * For more information about AWS Auto Scaling, including information about granting IAM users required permissions for
 * AWS Auto Scaling actions, see the <a
 * href="https://docs.aws.amazon.com/autoscaling/plans/userguide/what-is-aws-auto-scaling.html">AWS Auto Scaling User
 * Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAutoScalingPlansClient extends AmazonWebServiceClient implements AWSAutoScalingPlans {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAutoScalingPlans.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "autoscaling-plans";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withModeledClass(
                                    com.amazonaws.services.autoscalingplans.model.ValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceException").withModeledClass(
                                    com.amazonaws.services.autoscalingplans.model.InternalServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.autoscalingplans.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ObjectNotFoundException").withModeledClass(
                                    com.amazonaws.services.autoscalingplans.model.ObjectNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.autoscalingplans.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentUpdateException").withModeledClass(
                                    com.amazonaws.services.autoscalingplans.model.ConcurrentUpdateException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.autoscalingplans.model.AWSAutoScalingPlansException.class));

    public static AWSAutoScalingPlansClientBuilder builder() {
        return AWSAutoScalingPlansClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Auto Scaling Plans using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAutoScalingPlansClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Auto Scaling Plans using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAutoScalingPlansClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("autoscaling.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/autoscalingplans/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/autoscalingplans/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a scaling plan.
     * </p>
     * 
     * @param createScalingPlanRequest
     * @return Result of the CreateScalingPlan operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the parameters provided.
     * @throws LimitExceededException
     *         Your account exceeded a limit. This exception is thrown when a per-account resource limit is exceeded.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to a scaling plan that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSAutoScalingPlans.CreateScalingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/CreateScalingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateScalingPlanResult createScalingPlan(CreateScalingPlanRequest request) {
        request = beforeClientExecution(request);
        return executeCreateScalingPlan(request);
    }

    @SdkInternalApi
    final CreateScalingPlanResult executeCreateScalingPlan(CreateScalingPlanRequest createScalingPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(createScalingPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateScalingPlanRequest> request = null;
        Response<CreateScalingPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateScalingPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createScalingPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling Plans");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateScalingPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateScalingPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateScalingPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified scaling plan.
     * </p>
     * <p>
     * Deleting a scaling plan deletes the underlying <a>ScalingInstruction</a> for all of the scalable resources that
     * are covered by the plan.
     * </p>
     * <p>
     * If the plan has launched resources or has scaling activities in progress, you must delete those resources
     * separately.
     * </p>
     * 
     * @param deleteScalingPlanRequest
     * @return Result of the DeleteScalingPlan operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the parameters provided.
     * @throws ObjectNotFoundException
     *         The specified object could not be found.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to a scaling plan that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSAutoScalingPlans.DeleteScalingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DeleteScalingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteScalingPlanResult deleteScalingPlan(DeleteScalingPlanRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteScalingPlan(request);
    }

    @SdkInternalApi
    final DeleteScalingPlanResult executeDeleteScalingPlan(DeleteScalingPlanRequest deleteScalingPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteScalingPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScalingPlanRequest> request = null;
        Response<DeleteScalingPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScalingPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteScalingPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling Plans");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteScalingPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteScalingPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteScalingPlanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the scalable resources in the specified scaling plan.
     * </p>
     * 
     * @param describeScalingPlanResourcesRequest
     * @return Result of the DescribeScalingPlanResources operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the parameters provided.
     * @throws InvalidNextTokenException
     *         The token provided is not valid.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to a scaling plan that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSAutoScalingPlans.DescribeScalingPlanResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DescribeScalingPlanResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeScalingPlanResourcesResult describeScalingPlanResources(DescribeScalingPlanResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScalingPlanResources(request);
    }

    @SdkInternalApi
    final DescribeScalingPlanResourcesResult executeDescribeScalingPlanResources(DescribeScalingPlanResourcesRequest describeScalingPlanResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScalingPlanResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingPlanResourcesRequest> request = null;
        Response<DescribeScalingPlanResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalingPlanResourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeScalingPlanResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling Plans");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScalingPlanResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScalingPlanResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeScalingPlanResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more of your scaling plans.
     * </p>
     * 
     * @param describeScalingPlansRequest
     * @return Result of the DescribeScalingPlans operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the parameters provided.
     * @throws InvalidNextTokenException
     *         The token provided is not valid.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to a scaling plan that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSAutoScalingPlans.DescribeScalingPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DescribeScalingPlans"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeScalingPlansResult describeScalingPlans(DescribeScalingPlansRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScalingPlans(request);
    }

    @SdkInternalApi
    final DescribeScalingPlansResult executeDescribeScalingPlans(DescribeScalingPlansRequest describeScalingPlansRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScalingPlansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingPlansRequest> request = null;
        Response<DescribeScalingPlansResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalingPlansRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeScalingPlansRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling Plans");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScalingPlans");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScalingPlansResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeScalingPlansResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the forecast data for a scalable resource.
     * </p>
     * <p>
     * Capacity forecasts are represented as predicted values, or data points, that are calculated using historical data
     * points from a specified CloudWatch load metric. Data points are available for up to 56 days.
     * </p>
     * 
     * @param getScalingPlanResourceForecastDataRequest
     * @return Result of the GetScalingPlanResourceForecastData operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the parameters provided.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSAutoScalingPlans.GetScalingPlanResourceForecastData
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/GetScalingPlanResourceForecastData"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetScalingPlanResourceForecastDataResult getScalingPlanResourceForecastData(GetScalingPlanResourceForecastDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetScalingPlanResourceForecastData(request);
    }

    @SdkInternalApi
    final GetScalingPlanResourceForecastDataResult executeGetScalingPlanResourceForecastData(
            GetScalingPlanResourceForecastDataRequest getScalingPlanResourceForecastDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getScalingPlanResourceForecastDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetScalingPlanResourceForecastDataRequest> request = null;
        Response<GetScalingPlanResourceForecastDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetScalingPlanResourceForecastDataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getScalingPlanResourceForecastDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling Plans");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetScalingPlanResourceForecastData");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetScalingPlanResourceForecastDataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetScalingPlanResourceForecastDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified scaling plan.
     * </p>
     * <p>
     * You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
     * </p>
     * 
     * @param updateScalingPlanRequest
     * @return Result of the UpdateScalingPlan operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the parameters provided.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to a scaling plan that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @throws ObjectNotFoundException
     *         The specified object could not be found.
     * @sample AWSAutoScalingPlans.UpdateScalingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/UpdateScalingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateScalingPlanResult updateScalingPlan(UpdateScalingPlanRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateScalingPlan(request);
    }

    @SdkInternalApi
    final UpdateScalingPlanResult executeUpdateScalingPlan(UpdateScalingPlanRequest updateScalingPlanRequest) {

        ExecutionContext executionContext = createExecutionContext(updateScalingPlanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateScalingPlanRequest> request = null;
        Response<UpdateScalingPlanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateScalingPlanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateScalingPlanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling Plans");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateScalingPlan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateScalingPlanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateScalingPlanResultJsonUnmarshaller());
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
