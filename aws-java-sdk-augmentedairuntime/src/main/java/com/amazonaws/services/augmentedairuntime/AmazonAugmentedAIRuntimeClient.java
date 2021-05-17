/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.augmentedairuntime;

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

import com.amazonaws.services.augmentedairuntime.AmazonAugmentedAIRuntimeClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.augmentedairuntime.model.*;
import com.amazonaws.services.augmentedairuntime.model.transform.*;

/**
 * Client for accessing Amazon Augmented AI Runtime. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon Augmented AI (Amazon A2I) adds the benefit of human judgment to any machine learning application. When an AI
 * application can't evaluate data with a high degree of confidence, human reviewers can take over. This human review is
 * called a human review workflow. To create and start a human review workflow, you need three resources: a <i>worker
 * task template</i>, a <i>flow definition</i>, and a <i>human loop</i>.
 * </p>
 * <p>
 * For information about these resources and prerequisites for using Amazon A2I, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-getting-started.html">Get Started with Amazon Augmented
 * AI</a> in the Amazon SageMaker Developer Guide.
 * </p>
 * <p>
 * This API reference includes information about API actions and data types that you can use to interact with Amazon A2I
 * programmatically. Use this guide to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Start a human loop with the <code>StartHumanLoop</code> operation when using Amazon A2I with a <i>custom task
 * type</i>. To learn more about the difference between custom and built-in task types, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-task-types-general.html">Use Task Types </a>. To learn how
 * to start a human loop using this API, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-start-human-loop.html#a2i-instructions-starthumanloop"
 * >Create and Start a Human Loop for a Custom Task Type </a> in the Amazon SageMaker Developer Guide.
 * </p>
 * </li>
 * <li>
 * <p>
 * Manage your human loops. You can list all human loops that you have created, describe individual human loops, and
 * stop and delete human loops. To learn more, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-monitor-humanloop-results.html">Monitor and Manage Your
 * Human Loop </a> in the Amazon SageMaker Developer Guide.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Amazon A2I integrates APIs from various AWS services to create and start human review workflows for those services.
 * To learn how Amazon A2I uses these APIs, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-api-references.html">Use APIs in Amazon A2I</a> in the
 * Amazon SageMaker Developer Guide.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAugmentedAIRuntimeClient extends AmazonWebServiceClient implements AmazonAugmentedAIRuntime {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonAugmentedAIRuntime.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "sagemaker";

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
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.augmentedairuntime.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.augmentedairuntime.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.augmentedairuntime.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.augmentedairuntime.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.augmentedairuntime.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.augmentedairuntime.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.augmentedairuntime.model.AmazonAugmentedAIRuntimeException.class));

    public static AmazonAugmentedAIRuntimeClientBuilder builder() {
        return AmazonAugmentedAIRuntimeClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Augmented AI Runtime using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAugmentedAIRuntimeClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Augmented AI Runtime using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAugmentedAIRuntimeClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("a2i-runtime.sagemaker.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/augmentedairuntime/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/augmentedairuntime/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes the specified human loop for a flow definition.
     * </p>
     * <p>
     * If the human loop was deleted, this operation will return a <code>ResourceNotFoundException</code>.
     * </p>
     * 
     * @param deleteHumanLoopRequest
     * @return Result of the DeleteHumanLoop operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         AWS Region as your request, and try your request again.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @sample AmazonAugmentedAIRuntime.DeleteHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/DeleteHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteHumanLoopResult deleteHumanLoop(DeleteHumanLoopRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteHumanLoop(request);
    }

    @SdkInternalApi
    final DeleteHumanLoopResult executeDeleteHumanLoop(DeleteHumanLoopRequest deleteHumanLoopRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteHumanLoopRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHumanLoopRequest> request = null;
        Response<DeleteHumanLoopResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHumanLoopRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteHumanLoopRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker A2I Runtime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteHumanLoop");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteHumanLoopResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteHumanLoopResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the specified human loop. If the human loop was deleted, this operation will return a
     * <code>ResourceNotFoundException</code> error.
     * </p>
     * 
     * @param describeHumanLoopRequest
     * @return Result of the DescribeHumanLoop operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         AWS Region as your request, and try your request again.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @sample AmazonAugmentedAIRuntime.DescribeHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/DescribeHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeHumanLoopResult describeHumanLoop(DescribeHumanLoopRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeHumanLoop(request);
    }

    @SdkInternalApi
    final DescribeHumanLoopResult executeDescribeHumanLoop(DescribeHumanLoopRequest describeHumanLoopRequest) {

        ExecutionContext executionContext = createExecutionContext(describeHumanLoopRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHumanLoopRequest> request = null;
        Response<DescribeHumanLoopResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHumanLoopRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeHumanLoopRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker A2I Runtime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeHumanLoop");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeHumanLoopResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeHumanLoopResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about human loops, given the specified parameters. If a human loop was deleted, it will not
     * be included.
     * </p>
     * 
     * @param listHumanLoopsRequest
     * @return Result of the ListHumanLoops operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         AWS Region as your request, and try your request again.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @sample AmazonAugmentedAIRuntime.ListHumanLoops
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/ListHumanLoops"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListHumanLoopsResult listHumanLoops(ListHumanLoopsRequest request) {
        request = beforeClientExecution(request);
        return executeListHumanLoops(request);
    }

    @SdkInternalApi
    final ListHumanLoopsResult executeListHumanLoops(ListHumanLoopsRequest listHumanLoopsRequest) {

        ExecutionContext executionContext = createExecutionContext(listHumanLoopsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHumanLoopsRequest> request = null;
        Response<ListHumanLoopsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHumanLoopsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listHumanLoopsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker A2I Runtime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListHumanLoops");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListHumanLoopsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListHumanLoopsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a human loop, provided that at least one activation condition is met.
     * </p>
     * 
     * @param startHumanLoopRequest
     * @return Result of the StartHumanLoop operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your AWS account. For a list of Amazon A2I service quotes, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/a2i.html">Amazon Augmented AI Service Quotes</a>.
     *         Delete some resources or request an increase in your service quota. You can request a quota increase
     *         using Service Quotas or the AWS Support Center. To request an increase, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Quotas</a> in
     *         the <i>AWS General Reference</i>.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ConflictException
     *         Your request has the same name as another active human loop but has different input data. You cannot
     *         start two human loops with the same name and different input data.
     * @sample AmazonAugmentedAIRuntime.StartHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/StartHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartHumanLoopResult startHumanLoop(StartHumanLoopRequest request) {
        request = beforeClientExecution(request);
        return executeStartHumanLoop(request);
    }

    @SdkInternalApi
    final StartHumanLoopResult executeStartHumanLoop(StartHumanLoopRequest startHumanLoopRequest) {

        ExecutionContext executionContext = createExecutionContext(startHumanLoopRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartHumanLoopRequest> request = null;
        Response<StartHumanLoopResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartHumanLoopRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startHumanLoopRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker A2I Runtime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartHumanLoop");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartHumanLoopResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartHumanLoopResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the specified human loop.
     * </p>
     * 
     * @param stopHumanLoopRequest
     * @return Result of the StopHumanLoop operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         AWS Region as your request, and try your request again.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @sample AmazonAugmentedAIRuntime.StopHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/StopHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopHumanLoopResult stopHumanLoop(StopHumanLoopRequest request) {
        request = beforeClientExecution(request);
        return executeStopHumanLoop(request);
    }

    @SdkInternalApi
    final StopHumanLoopResult executeStopHumanLoop(StopHumanLoopRequest stopHumanLoopRequest) {

        ExecutionContext executionContext = createExecutionContext(stopHumanLoopRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopHumanLoopRequest> request = null;
        Response<StopHumanLoopResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopHumanLoopRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopHumanLoopRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SageMaker A2I Runtime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopHumanLoop");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopHumanLoopResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopHumanLoopResultJsonUnmarshaller());
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
