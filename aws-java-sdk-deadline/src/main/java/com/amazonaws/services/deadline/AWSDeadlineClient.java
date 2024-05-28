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
package com.amazonaws.services.deadline;

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

import com.amazonaws.services.deadline.AWSDeadlineClientBuilder;
import com.amazonaws.services.deadline.waiters.AWSDeadlineWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.deadline.model.*;

import com.amazonaws.services.deadline.model.transform.*;

/**
 * Client for accessing AWSDeadlineCloud. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * The Amazon Web Services Deadline Cloud API provides infrastructure and centralized management for your projects. Use
 * the Deadline Cloud API to onboard users, assign projects, and attach permissions specific to their job function.
 * </p>
 * <p>
 * With Deadline Cloud, content production teams can deploy resources for their workforce securely in the cloud,
 * reducing the costs of added physical infrastructure. Keep your content production operations secure, while allowing
 * your contributors to access the tools they need, such as scalable high-speed storage, licenses, and cost management
 * services.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDeadlineClient extends AmazonWebServiceClient implements AWSDeadline {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSDeadline.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "deadline";

    private volatile AWSDeadlineWaiters waiters;

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
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.deadline.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.deadline.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.deadline.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.deadline.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.deadline.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.deadline.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.deadline.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.deadline.model.AWSDeadlineException.class));

    public static AWSDeadlineClientBuilder builder() {
        return AWSDeadlineClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWSDeadlineCloud using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSDeadlineClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWSDeadlineCloud using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSDeadlineClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("deadline.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/deadline/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/deadline/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Assigns a farm membership level to a member.
     * </p>
     * 
     * @param associateMemberToFarmRequest
     * @return Result of the AssociateMemberToFarm operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.AssociateMemberToFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToFarm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateMemberToFarmResult associateMemberToFarm(AssociateMemberToFarmRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateMemberToFarm(request);
    }

    @SdkInternalApi
    final AssociateMemberToFarmResult executeAssociateMemberToFarm(AssociateMemberToFarmRequest associateMemberToFarmRequest) {

        ExecutionContext executionContext = createExecutionContext(associateMemberToFarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateMemberToFarmRequest> request = null;
        Response<AssociateMemberToFarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateMemberToFarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateMemberToFarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateMemberToFarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateMemberToFarmResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociateMemberToFarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns a fleet membership level to a member.
     * </p>
     * 
     * @param associateMemberToFleetRequest
     * @return Result of the AssociateMemberToFleet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.AssociateMemberToFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToFleet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateMemberToFleetResult associateMemberToFleet(AssociateMemberToFleetRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateMemberToFleet(request);
    }

    @SdkInternalApi
    final AssociateMemberToFleetResult executeAssociateMemberToFleet(AssociateMemberToFleetRequest associateMemberToFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(associateMemberToFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateMemberToFleetRequest> request = null;
        Response<AssociateMemberToFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateMemberToFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateMemberToFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateMemberToFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateMemberToFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateMemberToFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns a job membership level to a member
     * </p>
     * 
     * @param associateMemberToJobRequest
     * @return Result of the AssociateMemberToJob operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.AssociateMemberToJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateMemberToJobResult associateMemberToJob(AssociateMemberToJobRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateMemberToJob(request);
    }

    @SdkInternalApi
    final AssociateMemberToJobResult executeAssociateMemberToJob(AssociateMemberToJobRequest associateMemberToJobRequest) {

        ExecutionContext executionContext = createExecutionContext(associateMemberToJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateMemberToJobRequest> request = null;
        Response<AssociateMemberToJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateMemberToJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateMemberToJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateMemberToJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateMemberToJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateMemberToJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns a queue membership level to a member
     * </p>
     * 
     * @param associateMemberToQueueRequest
     * @return Result of the AssociateMemberToQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.AssociateMemberToQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToQueue"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateMemberToQueueResult associateMemberToQueue(AssociateMemberToQueueRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateMemberToQueue(request);
    }

    @SdkInternalApi
    final AssociateMemberToQueueResult executeAssociateMemberToQueue(AssociateMemberToQueueRequest associateMemberToQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(associateMemberToQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateMemberToQueueRequest> request = null;
        Response<AssociateMemberToQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateMemberToQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateMemberToQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateMemberToQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateMemberToQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateMemberToQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get Amazon Web Services credentials from the fleet role. The IAM permissions of the credentials are scoped down
     * to have read-only access.
     * </p>
     * 
     * @param assumeFleetRoleForReadRequest
     * @return Result of the AssumeFleetRoleForRead operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.AssumeFleetRoleForRead
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeFleetRoleForRead"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssumeFleetRoleForReadResult assumeFleetRoleForRead(AssumeFleetRoleForReadRequest request) {
        request = beforeClientExecution(request);
        return executeAssumeFleetRoleForRead(request);
    }

    @SdkInternalApi
    final AssumeFleetRoleForReadResult executeAssumeFleetRoleForRead(AssumeFleetRoleForReadRequest assumeFleetRoleForReadRequest) {

        ExecutionContext executionContext = createExecutionContext(assumeFleetRoleForReadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssumeFleetRoleForReadRequest> request = null;
        Response<AssumeFleetRoleForReadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssumeFleetRoleForReadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(assumeFleetRoleForReadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssumeFleetRoleForRead");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssumeFleetRoleForReadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssumeFleetRoleForReadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get credentials from the fleet role for a worker.
     * </p>
     * 
     * @param assumeFleetRoleForWorkerRequest
     * @return Result of the AssumeFleetRoleForWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.AssumeFleetRoleForWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeFleetRoleForWorker"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssumeFleetRoleForWorkerResult assumeFleetRoleForWorker(AssumeFleetRoleForWorkerRequest request) {
        request = beforeClientExecution(request);
        return executeAssumeFleetRoleForWorker(request);
    }

    @SdkInternalApi
    final AssumeFleetRoleForWorkerResult executeAssumeFleetRoleForWorker(AssumeFleetRoleForWorkerRequest assumeFleetRoleForWorkerRequest) {

        ExecutionContext executionContext = createExecutionContext(assumeFleetRoleForWorkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssumeFleetRoleForWorkerRequest> request = null;
        Response<AssumeFleetRoleForWorkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssumeFleetRoleForWorkerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(assumeFleetRoleForWorkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssumeFleetRoleForWorker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "scheduling.";
                String resolvedHostPrefix = String.format("scheduling.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssumeFleetRoleForWorkerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssumeFleetRoleForWorkerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets Amazon Web Services credentials from the queue role. The IAM permissions of the credentials are scoped down
     * to have read-only access.
     * </p>
     * 
     * @param assumeQueueRoleForReadRequest
     * @return Result of the AssumeQueueRoleForRead operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.AssumeQueueRoleForRead
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeQueueRoleForRead"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssumeQueueRoleForReadResult assumeQueueRoleForRead(AssumeQueueRoleForReadRequest request) {
        request = beforeClientExecution(request);
        return executeAssumeQueueRoleForRead(request);
    }

    @SdkInternalApi
    final AssumeQueueRoleForReadResult executeAssumeQueueRoleForRead(AssumeQueueRoleForReadRequest assumeQueueRoleForReadRequest) {

        ExecutionContext executionContext = createExecutionContext(assumeQueueRoleForReadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssumeQueueRoleForReadRequest> request = null;
        Response<AssumeQueueRoleForReadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssumeQueueRoleForReadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(assumeQueueRoleForReadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssumeQueueRoleForRead");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssumeQueueRoleForReadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssumeQueueRoleForReadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows a user to assume a role for a queue.
     * </p>
     * 
     * @param assumeQueueRoleForUserRequest
     * @return Result of the AssumeQueueRoleForUser operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.AssumeQueueRoleForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeQueueRoleForUser"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssumeQueueRoleForUserResult assumeQueueRoleForUser(AssumeQueueRoleForUserRequest request) {
        request = beforeClientExecution(request);
        return executeAssumeQueueRoleForUser(request);
    }

    @SdkInternalApi
    final AssumeQueueRoleForUserResult executeAssumeQueueRoleForUser(AssumeQueueRoleForUserRequest assumeQueueRoleForUserRequest) {

        ExecutionContext executionContext = createExecutionContext(assumeQueueRoleForUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssumeQueueRoleForUserRequest> request = null;
        Response<AssumeQueueRoleForUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssumeQueueRoleForUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(assumeQueueRoleForUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssumeQueueRoleForUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssumeQueueRoleForUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssumeQueueRoleForUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows a worker to assume a queue role.
     * </p>
     * 
     * @param assumeQueueRoleForWorkerRequest
     * @return Result of the AssumeQueueRoleForWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.AssumeQueueRoleForWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssumeQueueRoleForWorker"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssumeQueueRoleForWorkerResult assumeQueueRoleForWorker(AssumeQueueRoleForWorkerRequest request) {
        request = beforeClientExecution(request);
        return executeAssumeQueueRoleForWorker(request);
    }

    @SdkInternalApi
    final AssumeQueueRoleForWorkerResult executeAssumeQueueRoleForWorker(AssumeQueueRoleForWorkerRequest assumeQueueRoleForWorkerRequest) {

        ExecutionContext executionContext = createExecutionContext(assumeQueueRoleForWorkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssumeQueueRoleForWorkerRequest> request = null;
        Response<AssumeQueueRoleForWorkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssumeQueueRoleForWorkerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(assumeQueueRoleForWorkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssumeQueueRoleForWorker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "scheduling.";
                String resolvedHostPrefix = String.format("scheduling.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssumeQueueRoleForWorkerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssumeQueueRoleForWorkerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get batched job details for a worker.
     * </p>
     * 
     * @param batchGetJobEntityRequest
     * @return Result of the BatchGetJobEntity operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.BatchGetJobEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/BatchGetJobEntity" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchGetJobEntityResult batchGetJobEntity(BatchGetJobEntityRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetJobEntity(request);
    }

    @SdkInternalApi
    final BatchGetJobEntityResult executeBatchGetJobEntity(BatchGetJobEntityRequest batchGetJobEntityRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetJobEntityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetJobEntityRequest> request = null;
        Response<BatchGetJobEntityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetJobEntityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetJobEntityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetJobEntity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "scheduling.";
                String resolvedHostPrefix = String.format("scheduling.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetJobEntityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetJobEntityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies a job template to an Amazon S3 bucket.
     * </p>
     * 
     * @param copyJobTemplateRequest
     * @return Result of the CopyJobTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.CopyJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CopyJobTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CopyJobTemplateResult copyJobTemplate(CopyJobTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCopyJobTemplate(request);
    }

    @SdkInternalApi
    final CopyJobTemplateResult executeCopyJobTemplate(CopyJobTemplateRequest copyJobTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(copyJobTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyJobTemplateRequest> request = null;
        Response<CopyJobTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyJobTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(copyJobTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyJobTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CopyJobTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CopyJobTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a budget to set spending thresholds for your rendering activity.
     * </p>
     * 
     * @param createBudgetRequest
     * @return Result of the CreateBudget operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateBudget" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBudgetResult createBudget(CreateBudgetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBudget(request);
    }

    @SdkInternalApi
    final CreateBudgetResult executeCreateBudget(CreateBudgetRequest createBudgetRequest) {

        ExecutionContext executionContext = createExecutionContext(createBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBudgetRequest> request = null;
        Response<CreateBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBudgetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBudget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBudgetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBudgetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a farm to allow space for queues and fleets. Farms are the space where the components of your renders
     * gather and are pieced together in the cloud. Farms contain budgets and allow you to enforce permissions. Deadline
     * Cloud farms are a useful container for large projects.
     * </p>
     * 
     * @param createFarmRequest
     * @return Result of the CreateFarm operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateFarm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFarmResult createFarm(CreateFarmRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFarm(request);
    }

    @SdkInternalApi
    final CreateFarmResult executeCreateFarm(CreateFarmRequest createFarmRequest) {

        ExecutionContext executionContext = createExecutionContext(createFarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFarmRequest> request = null;
        Response<CreateFarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFarmResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a fleet. Fleets gather information relating to compute, or capacity, for renders within your farms. You
     * can choose to manage your own capacity or opt to have fleets fully managed by Deadline Cloud.
     * </p>
     * 
     * @param createFleetRequest
     * @return Result of the CreateFleet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFleetResult createFleet(CreateFleetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFleet(request);
    }

    @SdkInternalApi
    final CreateFleetResult executeCreateFleet(CreateFleetRequest createFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(createFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFleetRequest> request = null;
        Response<CreateFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a job. A job is a render submission submitted by a user. It contains specific job properties outlined as
     * steps and tasks.
     * </p>
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateJobResult createJob(CreateJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateJob(request);
    }

    @SdkInternalApi
    final CreateJobResult executeCreateJob(CreateJobRequest createJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateJobRequest> request = null;
        Response<CreateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a license endpoint to integrate your various licensed software used for rendering on Deadline Cloud.
     * </p>
     * 
     * @param createLicenseEndpointRequest
     * @return Result of the CreateLicenseEndpoint operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateLicenseEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateLicenseEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateLicenseEndpointResult createLicenseEndpoint(CreateLicenseEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLicenseEndpoint(request);
    }

    @SdkInternalApi
    final CreateLicenseEndpointResult executeCreateLicenseEndpoint(CreateLicenseEndpointRequest createLicenseEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createLicenseEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLicenseEndpointRequest> request = null;
        Response<CreateLicenseEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLicenseEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLicenseEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLicenseEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLicenseEndpointResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateLicenseEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Web Services Deadline Cloud monitor that you can use to view your farms, queues, and fleets.
     * After you submit a job, you can track the progress of the tasks and steps that make up the job, and then download
     * the job's results.
     * </p>
     * 
     * @param createMonitorRequest
     * @return Result of the CreateMonitor operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateMonitorResult createMonitor(CreateMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMonitor(request);
    }

    @SdkInternalApi
    final CreateMonitorResult executeCreateMonitor(CreateMonitorRequest createMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(createMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMonitorRequest> request = null;
        Response<CreateMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a queue to coordinate the order in which jobs run on a farm. A queue can also specify where to pull
     * resources and indicate where to output completed jobs.
     * </p>
     * 
     * @param createQueueRequest
     * @return Result of the CreateQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateQueueResult createQueue(CreateQueueRequest request) {
        request = beforeClientExecution(request);
        return executeCreateQueue(request);
    }

    @SdkInternalApi
    final CreateQueueResult executeCreateQueue(CreateQueueRequest createQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(createQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateQueueRequest> request = null;
        Response<CreateQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an environment for a queue that defines how jobs in the queue run.
     * </p>
     * 
     * @param createQueueEnvironmentRequest
     * @return Result of the CreateQueueEnvironment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueueEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateQueueEnvironmentResult createQueueEnvironment(CreateQueueEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateQueueEnvironment(request);
    }

    @SdkInternalApi
    final CreateQueueEnvironmentResult executeCreateQueueEnvironment(CreateQueueEnvironmentRequest createQueueEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createQueueEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateQueueEnvironmentRequest> request = null;
        Response<CreateQueueEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateQueueEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createQueueEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateQueueEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateQueueEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateQueueEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an association between a queue and a fleet.
     * </p>
     * 
     * @param createQueueFleetAssociationRequest
     * @return Result of the CreateQueueFleetAssociation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.CreateQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateQueueFleetAssociationResult createQueueFleetAssociation(CreateQueueFleetAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateQueueFleetAssociation(request);
    }

    @SdkInternalApi
    final CreateQueueFleetAssociationResult executeCreateQueueFleetAssociation(CreateQueueFleetAssociationRequest createQueueFleetAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(createQueueFleetAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateQueueFleetAssociationRequest> request = null;
        Response<CreateQueueFleetAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateQueueFleetAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createQueueFleetAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateQueueFleetAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateQueueFleetAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateQueueFleetAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a storage profile that specifies the operating system, file type, and file location of resources used on
     * a farm.
     * </p>
     * 
     * @param createStorageProfileRequest
     * @return Result of the CreateStorageProfile operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.CreateStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateStorageProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateStorageProfileResult createStorageProfile(CreateStorageProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStorageProfile(request);
    }

    @SdkInternalApi
    final CreateStorageProfileResult executeCreateStorageProfile(CreateStorageProfileRequest createStorageProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createStorageProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStorageProfileRequest> request = null;
        Response<CreateStorageProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStorageProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStorageProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStorageProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStorageProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStorageProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a worker. A worker tells your instance how much processing power (vCPU), and memory (GiB) you’ll need to
     * assemble the digital assets held within a particular instance. You can specify certain instance types to use, or
     * let the worker know which instances types to exclude.
     * </p>
     * 
     * @param createWorkerRequest
     * @return Result of the CreateWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.CreateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateWorker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWorkerResult createWorker(CreateWorkerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorker(request);
    }

    @SdkInternalApi
    final CreateWorkerResult executeCreateWorker(CreateWorkerRequest createWorkerRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkerRequest> request = null;
        Response<CreateWorkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "scheduling.";
                String resolvedHostPrefix = String.format("scheduling.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a budget.
     * </p>
     * 
     * @param deleteBudgetRequest
     * @return Result of the DeleteBudget operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteBudget" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBudgetResult deleteBudget(DeleteBudgetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBudget(request);
    }

    @SdkInternalApi
    final DeleteBudgetResult executeDeleteBudget(DeleteBudgetRequest deleteBudgetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBudgetRequest> request = null;
        Response<DeleteBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBudgetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBudget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBudgetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBudgetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a farm.
     * </p>
     * 
     * @param deleteFarmRequest
     * @return Result of the DeleteFarm operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteFarm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFarmResult deleteFarm(DeleteFarmRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFarm(request);
    }

    @SdkInternalApi
    final DeleteFarmResult executeDeleteFarm(DeleteFarmRequest deleteFarmRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFarmRequest> request = null;
        Response<DeleteFarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFarmResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFleetResult deleteFleet(DeleteFleetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFleet(request);
    }

    @SdkInternalApi
    final DeleteFleetResult executeDeleteFleet(DeleteFleetRequest deleteFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFleetRequest> request = null;
        Response<DeleteFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a license endpoint.
     * </p>
     * 
     * @param deleteLicenseEndpointRequest
     * @return Result of the DeleteLicenseEndpoint operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteLicenseEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteLicenseEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteLicenseEndpointResult deleteLicenseEndpoint(DeleteLicenseEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLicenseEndpoint(request);
    }

    @SdkInternalApi
    final DeleteLicenseEndpointResult executeDeleteLicenseEndpoint(DeleteLicenseEndpointRequest deleteLicenseEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLicenseEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLicenseEndpointRequest> request = null;
        Response<DeleteLicenseEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLicenseEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLicenseEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLicenseEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLicenseEndpointResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteLicenseEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a metered product.
     * </p>
     * 
     * @param deleteMeteredProductRequest
     * @return Result of the DeleteMeteredProduct operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteMeteredProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteMeteredProduct" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteMeteredProductResult deleteMeteredProduct(DeleteMeteredProductRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMeteredProduct(request);
    }

    @SdkInternalApi
    final DeleteMeteredProductResult executeDeleteMeteredProduct(DeleteMeteredProductRequest deleteMeteredProductRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMeteredProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMeteredProductRequest> request = null;
        Response<DeleteMeteredProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMeteredProductRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMeteredProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMeteredProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMeteredProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMeteredProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a Deadline Cloud monitor. After you delete a monitor, you can create a new one and attach farms to the
     * monitor.
     * </p>
     * 
     * @param deleteMonitorRequest
     * @return Result of the DeleteMonitor operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteMonitorResult deleteMonitor(DeleteMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMonitor(request);
    }

    @SdkInternalApi
    final DeleteMonitorResult executeDeleteMonitor(DeleteMonitorRequest deleteMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMonitorRequest> request = null;
        Response<DeleteMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a queue.
     * </p>
     * 
     * @param deleteQueueRequest
     * @return Result of the DeleteQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteQueueResult deleteQueue(DeleteQueueRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteQueue(request);
    }

    @SdkInternalApi
    final DeleteQueueResult executeDeleteQueue(DeleteQueueRequest deleteQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQueueRequest> request = null;
        Response<DeleteQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a queue environment.
     * </p>
     * 
     * @param deleteQueueEnvironmentRequest
     * @return Result of the DeleteQueueEnvironment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteQueueEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteQueueEnvironmentResult deleteQueueEnvironment(DeleteQueueEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteQueueEnvironment(request);
    }

    @SdkInternalApi
    final DeleteQueueEnvironmentResult executeDeleteQueueEnvironment(DeleteQueueEnvironmentRequest deleteQueueEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteQueueEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQueueEnvironmentRequest> request = null;
        Response<DeleteQueueEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteQueueEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteQueueEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteQueueEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteQueueEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteQueueEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a queue-fleet association.
     * </p>
     * 
     * @param deleteQueueFleetAssociationRequest
     * @return Result of the DeleteQueueFleetAssociation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteQueueFleetAssociationResult deleteQueueFleetAssociation(DeleteQueueFleetAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteQueueFleetAssociation(request);
    }

    @SdkInternalApi
    final DeleteQueueFleetAssociationResult executeDeleteQueueFleetAssociation(DeleteQueueFleetAssociationRequest deleteQueueFleetAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteQueueFleetAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQueueFleetAssociationRequest> request = null;
        Response<DeleteQueueFleetAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteQueueFleetAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteQueueFleetAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteQueueFleetAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteQueueFleetAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteQueueFleetAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a storage profile.
     * </p>
     * 
     * @param deleteStorageProfileRequest
     * @return Result of the DeleteStorageProfile operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteStorageProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteStorageProfileResult deleteStorageProfile(DeleteStorageProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStorageProfile(request);
    }

    @SdkInternalApi
    final DeleteStorageProfileResult executeDeleteStorageProfile(DeleteStorageProfileRequest deleteStorageProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStorageProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStorageProfileRequest> request = null;
        Response<DeleteStorageProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStorageProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStorageProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStorageProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStorageProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStorageProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a worker.
     * </p>
     * 
     * @param deleteWorkerRequest
     * @return Result of the DeleteWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DeleteWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DeleteWorker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWorkerResult deleteWorker(DeleteWorkerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorker(request);
    }

    @SdkInternalApi
    final DeleteWorkerResult executeDeleteWorker(DeleteWorkerRequest deleteWorkerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkerRequest> request = null;
        Response<DeleteWorkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a member from a farm.
     * </p>
     * 
     * @param disassociateMemberFromFarmRequest
     * @return Result of the DisassociateMemberFromFarm operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DisassociateMemberFromFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromFarm"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateMemberFromFarmResult disassociateMemberFromFarm(DisassociateMemberFromFarmRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateMemberFromFarm(request);
    }

    @SdkInternalApi
    final DisassociateMemberFromFarmResult executeDisassociateMemberFromFarm(DisassociateMemberFromFarmRequest disassociateMemberFromFarmRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateMemberFromFarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMemberFromFarmRequest> request = null;
        Response<DisassociateMemberFromFarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMemberFromFarmRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateMemberFromFarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateMemberFromFarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateMemberFromFarmResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateMemberFromFarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a member from a fleet.
     * </p>
     * 
     * @param disassociateMemberFromFleetRequest
     * @return Result of the DisassociateMemberFromFleet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DisassociateMemberFromFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromFleet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateMemberFromFleetResult disassociateMemberFromFleet(DisassociateMemberFromFleetRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateMemberFromFleet(request);
    }

    @SdkInternalApi
    final DisassociateMemberFromFleetResult executeDisassociateMemberFromFleet(DisassociateMemberFromFleetRequest disassociateMemberFromFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateMemberFromFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMemberFromFleetRequest> request = null;
        Response<DisassociateMemberFromFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMemberFromFleetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateMemberFromFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateMemberFromFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateMemberFromFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateMemberFromFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a member from a job.
     * </p>
     * 
     * @param disassociateMemberFromJobRequest
     * @return Result of the DisassociateMemberFromJob operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DisassociateMemberFromJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateMemberFromJobResult disassociateMemberFromJob(DisassociateMemberFromJobRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateMemberFromJob(request);
    }

    @SdkInternalApi
    final DisassociateMemberFromJobResult executeDisassociateMemberFromJob(DisassociateMemberFromJobRequest disassociateMemberFromJobRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateMemberFromJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMemberFromJobRequest> request = null;
        Response<DisassociateMemberFromJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMemberFromJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateMemberFromJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateMemberFromJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateMemberFromJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateMemberFromJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a member from a queue.
     * </p>
     * 
     * @param disassociateMemberFromQueueRequest
     * @return Result of the DisassociateMemberFromQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.DisassociateMemberFromQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DisassociateMemberFromQueue"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateMemberFromQueueResult disassociateMemberFromQueue(DisassociateMemberFromQueueRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateMemberFromQueue(request);
    }

    @SdkInternalApi
    final DisassociateMemberFromQueueResult executeDisassociateMemberFromQueue(DisassociateMemberFromQueueRequest disassociateMemberFromQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateMemberFromQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMemberFromQueueRequest> request = null;
        Response<DisassociateMemberFromQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMemberFromQueueRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateMemberFromQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateMemberFromQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateMemberFromQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateMemberFromQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a budget.
     * </p>
     * 
     * @param getBudgetRequest
     * @return Result of the GetBudget operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetBudget" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBudgetResult getBudget(GetBudgetRequest request) {
        request = beforeClientExecution(request);
        return executeGetBudget(request);
    }

    @SdkInternalApi
    final GetBudgetResult executeGetBudget(GetBudgetRequest getBudgetRequest) {

        ExecutionContext executionContext = createExecutionContext(getBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBudgetRequest> request = null;
        Response<GetBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBudgetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBudget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBudgetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBudgetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a farm.
     * </p>
     * 
     * @param getFarmRequest
     * @return Result of the GetFarm operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetFarm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFarmResult getFarm(GetFarmRequest request) {
        request = beforeClientExecution(request);
        return executeGetFarm(request);
    }

    @SdkInternalApi
    final GetFarmResult executeGetFarm(GetFarmRequest getFarmRequest) {

        ExecutionContext executionContext = createExecutionContext(getFarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFarmRequest> request = null;
        Response<GetFarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFarmResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a fleet.
     * </p>
     * 
     * @param getFleetRequest
     * @return Result of the GetFleet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFleetResult getFleet(GetFleetRequest request) {
        request = beforeClientExecution(request);
        return executeGetFleet(request);
    }

    @SdkInternalApi
    final GetFleetResult executeGetFleet(GetFleetRequest getFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(getFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFleetRequest> request = null;
        Response<GetFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFleetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a Deadline Cloud job.
     * </p>
     * 
     * @param getJobRequest
     * @return Result of the GetJob operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobResult getJob(GetJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetJob(request);
    }

    @SdkInternalApi
    final GetJobResult executeGetJob(GetJobRequest getJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobRequest> request = null;
        Response<GetJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a licence endpoint.
     * </p>
     * 
     * @param getLicenseEndpointRequest
     * @return Result of the GetLicenseEndpoint operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetLicenseEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetLicenseEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetLicenseEndpointResult getLicenseEndpoint(GetLicenseEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeGetLicenseEndpoint(request);
    }

    @SdkInternalApi
    final GetLicenseEndpointResult executeGetLicenseEndpoint(GetLicenseEndpointRequest getLicenseEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(getLicenseEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLicenseEndpointRequest> request = null;
        Response<GetLicenseEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLicenseEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLicenseEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLicenseEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLicenseEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLicenseEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified monitor.
     * </p>
     * 
     * @param getMonitorRequest
     * @return Result of the GetMonitor operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMonitorResult getMonitor(GetMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeGetMonitor(request);
    }

    @SdkInternalApi
    final GetMonitorResult executeGetMonitor(GetMonitorRequest getMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(getMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMonitorRequest> request = null;
        Response<GetMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMonitorResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a queue.
     * </p>
     * 
     * @param getQueueRequest
     * @return Result of the GetQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetQueueResult getQueue(GetQueueRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueue(request);
    }

    @SdkInternalApi
    final GetQueueResult executeGetQueue(GetQueueRequest getQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueueRequest> request = null;
        Response<GetQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueueResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a queue environment.
     * </p>
     * 
     * @param getQueueEnvironmentRequest
     * @return Result of the GetQueueEnvironment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueueEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetQueueEnvironmentResult getQueueEnvironment(GetQueueEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueueEnvironment(request);
    }

    @SdkInternalApi
    final GetQueueEnvironmentResult executeGetQueueEnvironment(GetQueueEnvironmentRequest getQueueEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueueEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueueEnvironmentRequest> request = null;
        Response<GetQueueEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueueEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQueueEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueueEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueueEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQueueEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a queue-fleet association.
     * </p>
     * 
     * @param getQueueFleetAssociationRequest
     * @return Result of the GetQueueFleetAssociation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetQueueFleetAssociationResult getQueueFleetAssociation(GetQueueFleetAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueueFleetAssociation(request);
    }

    @SdkInternalApi
    final GetQueueFleetAssociationResult executeGetQueueFleetAssociation(GetQueueFleetAssociationRequest getQueueFleetAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueueFleetAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueueFleetAssociationRequest> request = null;
        Response<GetQueueFleetAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueueFleetAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getQueueFleetAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueueFleetAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueueFleetAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetQueueFleetAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a session.
     * </p>
     * 
     * @param getSessionRequest
     * @return Result of the GetSession operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSessionResult getSession(GetSessionRequest request) {
        request = beforeClientExecution(request);
        return executeGetSession(request);
    }

    @SdkInternalApi
    final GetSessionResult executeGetSession(GetSessionRequest getSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(getSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSessionRequest> request = null;
        Response<GetSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSessionResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a session action for the job.
     * </p>
     * 
     * @param getSessionActionRequest
     * @return Result of the GetSessionAction operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetSessionAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSessionAction" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSessionActionResult getSessionAction(GetSessionActionRequest request) {
        request = beforeClientExecution(request);
        return executeGetSessionAction(request);
    }

    @SdkInternalApi
    final GetSessionActionResult executeGetSessionAction(GetSessionActionRequest getSessionActionRequest) {

        ExecutionContext executionContext = createExecutionContext(getSessionActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSessionActionRequest> request = null;
        Response<GetSessionActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSessionActionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSessionActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSessionAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSessionActionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSessionActionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a set of statistics for queues or farms. Before you can call the
     * <code>GetSessionStatisticsAggregation</code> operation, you must first call the
     * <code>StartSessionsStatisticsAggregation</code> operation. Statistics are available for 1 hour after you call the
     * <code>StartSessionsStatisticsAggregation</code> operation.
     * </p>
     * 
     * @param getSessionsStatisticsAggregationRequest
     * @return Result of the GetSessionsStatisticsAggregation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetSessionsStatisticsAggregation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSessionsStatisticsAggregation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSessionsStatisticsAggregationResult getSessionsStatisticsAggregation(GetSessionsStatisticsAggregationRequest request) {
        request = beforeClientExecution(request);
        return executeGetSessionsStatisticsAggregation(request);
    }

    @SdkInternalApi
    final GetSessionsStatisticsAggregationResult executeGetSessionsStatisticsAggregation(
            GetSessionsStatisticsAggregationRequest getSessionsStatisticsAggregationRequest) {

        ExecutionContext executionContext = createExecutionContext(getSessionsStatisticsAggregationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSessionsStatisticsAggregationRequest> request = null;
        Response<GetSessionsStatisticsAggregationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSessionsStatisticsAggregationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSessionsStatisticsAggregationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSessionsStatisticsAggregation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSessionsStatisticsAggregationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSessionsStatisticsAggregationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a step.
     * </p>
     * 
     * @param getStepRequest
     * @return Result of the GetStep operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStep" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStepResult getStep(GetStepRequest request) {
        request = beforeClientExecution(request);
        return executeGetStep(request);
    }

    @SdkInternalApi
    final GetStepResult executeGetStep(GetStepRequest getStepRequest) {

        ExecutionContext executionContext = createExecutionContext(getStepRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStepRequest> request = null;
        Response<GetStepResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStepRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStepRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStep");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStepResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStepResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a storage profile.
     * </p>
     * 
     * @param getStorageProfileRequest
     * @return Result of the GetStorageProfile operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStorageProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStorageProfileResult getStorageProfile(GetStorageProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetStorageProfile(request);
    }

    @SdkInternalApi
    final GetStorageProfileResult executeGetStorageProfile(GetStorageProfileRequest getStorageProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getStorageProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStorageProfileRequest> request = null;
        Response<GetStorageProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStorageProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStorageProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStorageProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStorageProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStorageProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a storage profile for a queue.
     * </p>
     * 
     * @param getStorageProfileForQueueRequest
     * @return Result of the GetStorageProfileForQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetStorageProfileForQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStorageProfileForQueue"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetStorageProfileForQueueResult getStorageProfileForQueue(GetStorageProfileForQueueRequest request) {
        request = beforeClientExecution(request);
        return executeGetStorageProfileForQueue(request);
    }

    @SdkInternalApi
    final GetStorageProfileForQueueResult executeGetStorageProfileForQueue(GetStorageProfileForQueueRequest getStorageProfileForQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(getStorageProfileForQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStorageProfileForQueueRequest> request = null;
        Response<GetStorageProfileForQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStorageProfileForQueueRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getStorageProfileForQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStorageProfileForQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStorageProfileForQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetStorageProfileForQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a task.
     * </p>
     * 
     * @param getTaskRequest
     * @return Result of the GetTask operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTaskResult getTask(GetTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetTask(request);
    }

    @SdkInternalApi
    final GetTaskResult executeGetTask(GetTaskRequest getTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTaskRequest> request = null;
        Response<GetTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTaskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a worker.
     * </p>
     * 
     * @param getWorkerRequest
     * @return Result of the GetWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.GetWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetWorker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetWorkerResult getWorker(GetWorkerRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorker(request);
    }

    @SdkInternalApi
    final GetWorkerResult executeGetWorker(GetWorkerRequest getWorkerRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkerRequest> request = null;
        Response<GetWorkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkerResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A list of the available metered products.
     * </p>
     * 
     * @param listAvailableMeteredProductsRequest
     * @return Result of the ListAvailableMeteredProducts operation returned by the service.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @sample AWSDeadline.ListAvailableMeteredProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListAvailableMeteredProducts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAvailableMeteredProductsResult listAvailableMeteredProducts(ListAvailableMeteredProductsRequest request) {
        request = beforeClientExecution(request);
        return executeListAvailableMeteredProducts(request);
    }

    @SdkInternalApi
    final ListAvailableMeteredProductsResult executeListAvailableMeteredProducts(ListAvailableMeteredProductsRequest listAvailableMeteredProductsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAvailableMeteredProductsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAvailableMeteredProductsRequest> request = null;
        Response<ListAvailableMeteredProductsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAvailableMeteredProductsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAvailableMeteredProductsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAvailableMeteredProducts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAvailableMeteredProductsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAvailableMeteredProductsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A list of budgets in a farm.
     * </p>
     * 
     * @param listBudgetsRequest
     * @return Result of the ListBudgets operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListBudgets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListBudgets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBudgetsResult listBudgets(ListBudgetsRequest request) {
        request = beforeClientExecution(request);
        return executeListBudgets(request);
    }

    @SdkInternalApi
    final ListBudgetsResult executeListBudgets(ListBudgetsRequest listBudgetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBudgetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBudgetsRequest> request = null;
        Response<ListBudgetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBudgetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBudgetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBudgets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBudgetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBudgetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the members of a farm.
     * </p>
     * 
     * @param listFarmMembersRequest
     * @return Result of the ListFarmMembers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListFarmMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFarmMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFarmMembersResult listFarmMembers(ListFarmMembersRequest request) {
        request = beforeClientExecution(request);
        return executeListFarmMembers(request);
    }

    @SdkInternalApi
    final ListFarmMembersResult executeListFarmMembers(ListFarmMembersRequest listFarmMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(listFarmMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFarmMembersRequest> request = null;
        Response<ListFarmMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFarmMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFarmMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFarmMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFarmMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFarmMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists farms.
     * </p>
     * 
     * @param listFarmsRequest
     * @return Result of the ListFarms operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListFarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFarms" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFarmsResult listFarms(ListFarmsRequest request) {
        request = beforeClientExecution(request);
        return executeListFarms(request);
    }

    @SdkInternalApi
    final ListFarmsResult executeListFarms(ListFarmsRequest listFarmsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFarmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFarmsRequest> request = null;
        Response<ListFarmsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFarmsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFarmsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFarms");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFarmsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFarmsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists fleet members.
     * </p>
     * 
     * @param listFleetMembersRequest
     * @return Result of the ListFleetMembers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListFleetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFleetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFleetMembersResult listFleetMembers(ListFleetMembersRequest request) {
        request = beforeClientExecution(request);
        return executeListFleetMembers(request);
    }

    @SdkInternalApi
    final ListFleetMembersResult executeListFleetMembers(ListFleetMembersRequest listFleetMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(listFleetMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFleetMembersRequest> request = null;
        Response<ListFleetMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFleetMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFleetMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFleetMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFleetMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFleetMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists fleets.
     * </p>
     * 
     * @param listFleetsRequest
     * @return Result of the ListFleets operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFleetsResult listFleets(ListFleetsRequest request) {
        request = beforeClientExecution(request);
        return executeListFleets(request);
    }

    @SdkInternalApi
    final ListFleetsResult executeListFleets(ListFleetsRequest listFleetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFleetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFleetsRequest> request = null;
        Response<ListFleetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFleetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFleetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFleets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFleetsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFleetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists members on a job.
     * </p>
     * 
     * @param listJobMembersRequest
     * @return Result of the ListJobMembers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListJobMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListJobMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListJobMembersResult listJobMembers(ListJobMembersRequest request) {
        request = beforeClientExecution(request);
        return executeListJobMembers(request);
    }

    @SdkInternalApi
    final ListJobMembersResult executeListJobMembers(ListJobMembersRequest listJobMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobMembersRequest> request = null;
        Response<ListJobMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists jobs.
     * </p>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListJobs(request);
    }

    @SdkInternalApi
    final ListJobsResult executeListJobs(ListJobsRequest listJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobsRequest> request = null;
        Response<ListJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists license endpoints.
     * </p>
     * 
     * @param listLicenseEndpointsRequest
     * @return Result of the ListLicenseEndpoints operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListLicenseEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListLicenseEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListLicenseEndpointsResult listLicenseEndpoints(ListLicenseEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeListLicenseEndpoints(request);
    }

    @SdkInternalApi
    final ListLicenseEndpointsResult executeListLicenseEndpoints(ListLicenseEndpointsRequest listLicenseEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLicenseEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLicenseEndpointsRequest> request = null;
        Response<ListLicenseEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLicenseEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLicenseEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLicenseEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLicenseEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLicenseEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists metered products.
     * </p>
     * 
     * @param listMeteredProductsRequest
     * @return Result of the ListMeteredProducts operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListMeteredProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListMeteredProducts" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListMeteredProductsResult listMeteredProducts(ListMeteredProductsRequest request) {
        request = beforeClientExecution(request);
        return executeListMeteredProducts(request);
    }

    @SdkInternalApi
    final ListMeteredProductsResult executeListMeteredProducts(ListMeteredProductsRequest listMeteredProductsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMeteredProductsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMeteredProductsRequest> request = null;
        Response<ListMeteredProductsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMeteredProductsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMeteredProductsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMeteredProducts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMeteredProductsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMeteredProductsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of your monitors in Deadline Cloud.
     * </p>
     * 
     * @param listMonitorsRequest
     * @return Result of the ListMonitors operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMonitorsResult listMonitors(ListMonitorsRequest request) {
        request = beforeClientExecution(request);
        return executeListMonitors(request);
    }

    @SdkInternalApi
    final ListMonitorsResult executeListMonitors(ListMonitorsRequest listMonitorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMonitorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMonitorsRequest> request = null;
        Response<ListMonitorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMonitorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMonitorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMonitors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMonitorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMonitorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists queue environments.
     * </p>
     * 
     * @param listQueueEnvironmentsRequest
     * @return Result of the ListQueueEnvironments operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListQueueEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueueEnvironments" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListQueueEnvironmentsResult listQueueEnvironments(ListQueueEnvironmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListQueueEnvironments(request);
    }

    @SdkInternalApi
    final ListQueueEnvironmentsResult executeListQueueEnvironments(ListQueueEnvironmentsRequest listQueueEnvironmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listQueueEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueueEnvironmentsRequest> request = null;
        Response<ListQueueEnvironmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueueEnvironmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQueueEnvironmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQueueEnvironments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQueueEnvironmentsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListQueueEnvironmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists queue-fleet associations.
     * </p>
     * 
     * @param listQueueFleetAssociationsRequest
     * @return Result of the ListQueueFleetAssociations operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @sample AWSDeadline.ListQueueFleetAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueueFleetAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListQueueFleetAssociationsResult listQueueFleetAssociations(ListQueueFleetAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListQueueFleetAssociations(request);
    }

    @SdkInternalApi
    final ListQueueFleetAssociationsResult executeListQueueFleetAssociations(ListQueueFleetAssociationsRequest listQueueFleetAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listQueueFleetAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueueFleetAssociationsRequest> request = null;
        Response<ListQueueFleetAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueueFleetAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listQueueFleetAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQueueFleetAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQueueFleetAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListQueueFleetAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the members in a queue.
     * </p>
     * 
     * @param listQueueMembersRequest
     * @return Result of the ListQueueMembers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListQueueMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueueMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListQueueMembersResult listQueueMembers(ListQueueMembersRequest request) {
        request = beforeClientExecution(request);
        return executeListQueueMembers(request);
    }

    @SdkInternalApi
    final ListQueueMembersResult executeListQueueMembers(ListQueueMembersRequest listQueueMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(listQueueMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueueMembersRequest> request = null;
        Response<ListQueueMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueueMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQueueMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQueueMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQueueMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListQueueMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists queues.
     * </p>
     * 
     * @param listQueuesRequest
     * @return Result of the ListQueues operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListQueuesResult listQueues(ListQueuesRequest request) {
        request = beforeClientExecution(request);
        return executeListQueues(request);
    }

    @SdkInternalApi
    final ListQueuesResult executeListQueues(ListQueuesRequest listQueuesRequest) {

        ExecutionContext executionContext = createExecutionContext(listQueuesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueuesRequest> request = null;
        Response<ListQueuesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueuesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQueuesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQueues");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQueuesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListQueuesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists session actions.
     * </p>
     * 
     * @param listSessionActionsRequest
     * @return Result of the ListSessionActions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListSessionActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSessionActions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSessionActionsResult listSessionActions(ListSessionActionsRequest request) {
        request = beforeClientExecution(request);
        return executeListSessionActions(request);
    }

    @SdkInternalApi
    final ListSessionActionsResult executeListSessionActions(ListSessionActionsRequest listSessionActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSessionActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSessionActionsRequest> request = null;
        Response<ListSessionActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSessionActionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSessionActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSessionActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSessionActionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSessionActionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists sessions.
     * </p>
     * 
     * @param listSessionsRequest
     * @return Result of the ListSessions operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSessions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSessionsResult listSessions(ListSessionsRequest request) {
        request = beforeClientExecution(request);
        return executeListSessions(request);
    }

    @SdkInternalApi
    final ListSessionsResult executeListSessions(ListSessionsRequest listSessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSessionsRequest> request = null;
        Response<ListSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSessionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSessions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSessionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists sessions for a worker.
     * </p>
     * 
     * @param listSessionsForWorkerRequest
     * @return Result of the ListSessionsForWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListSessionsForWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSessionsForWorker" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSessionsForWorkerResult listSessionsForWorker(ListSessionsForWorkerRequest request) {
        request = beforeClientExecution(request);
        return executeListSessionsForWorker(request);
    }

    @SdkInternalApi
    final ListSessionsForWorkerResult executeListSessionsForWorker(ListSessionsForWorkerRequest listSessionsForWorkerRequest) {

        ExecutionContext executionContext = createExecutionContext(listSessionsForWorkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSessionsForWorkerRequest> request = null;
        Response<ListSessionsForWorkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSessionsForWorkerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSessionsForWorkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSessionsForWorker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSessionsForWorkerResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListSessionsForWorkerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists step consumers.
     * </p>
     * 
     * @param listStepConsumersRequest
     * @return Result of the ListStepConsumers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListStepConsumers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStepConsumers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStepConsumersResult listStepConsumers(ListStepConsumersRequest request) {
        request = beforeClientExecution(request);
        return executeListStepConsumers(request);
    }

    @SdkInternalApi
    final ListStepConsumersResult executeListStepConsumers(ListStepConsumersRequest listStepConsumersRequest) {

        ExecutionContext executionContext = createExecutionContext(listStepConsumersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStepConsumersRequest> request = null;
        Response<ListStepConsumersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStepConsumersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStepConsumersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStepConsumers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStepConsumersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStepConsumersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the dependencies for a step.
     * </p>
     * 
     * @param listStepDependenciesRequest
     * @return Result of the ListStepDependencies operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListStepDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStepDependencies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListStepDependenciesResult listStepDependencies(ListStepDependenciesRequest request) {
        request = beforeClientExecution(request);
        return executeListStepDependencies(request);
    }

    @SdkInternalApi
    final ListStepDependenciesResult executeListStepDependencies(ListStepDependenciesRequest listStepDependenciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listStepDependenciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStepDependenciesRequest> request = null;
        Response<ListStepDependenciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStepDependenciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStepDependenciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStepDependencies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStepDependenciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStepDependenciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists steps for a job.
     * </p>
     * 
     * @param listStepsRequest
     * @return Result of the ListSteps operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListSteps" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStepsResult listSteps(ListStepsRequest request) {
        request = beforeClientExecution(request);
        return executeListSteps(request);
    }

    @SdkInternalApi
    final ListStepsResult executeListSteps(ListStepsRequest listStepsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStepsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStepsRequest> request = null;
        Response<ListStepsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStepsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStepsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSteps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStepsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStepsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists storage profiles.
     * </p>
     * 
     * @param listStorageProfilesRequest
     * @return Result of the ListStorageProfiles operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListStorageProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStorageProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListStorageProfilesResult listStorageProfiles(ListStorageProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListStorageProfiles(request);
    }

    @SdkInternalApi
    final ListStorageProfilesResult executeListStorageProfiles(ListStorageProfilesRequest listStorageProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listStorageProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStorageProfilesRequest> request = null;
        Response<ListStorageProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStorageProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStorageProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStorageProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStorageProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStorageProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists storage profiles for a queue.
     * </p>
     * 
     * @param listStorageProfilesForQueueRequest
     * @return Result of the ListStorageProfilesForQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListStorageProfilesForQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListStorageProfilesForQueue"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStorageProfilesForQueueResult listStorageProfilesForQueue(ListStorageProfilesForQueueRequest request) {
        request = beforeClientExecution(request);
        return executeListStorageProfilesForQueue(request);
    }

    @SdkInternalApi
    final ListStorageProfilesForQueueResult executeListStorageProfilesForQueue(ListStorageProfilesForQueueRequest listStorageProfilesForQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(listStorageProfilesForQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStorageProfilesForQueueRequest> request = null;
        Response<ListStorageProfilesForQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStorageProfilesForQueueRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listStorageProfilesForQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStorageProfilesForQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStorageProfilesForQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListStorageProfilesForQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists tasks for a job.
     * </p>
     * 
     * @param listTasksRequest
     * @return Result of the ListTasks operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListTasks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTasksResult listTasks(ListTasksRequest request) {
        request = beforeClientExecution(request);
        return executeListTasks(request);
    }

    @SdkInternalApi
    final ListTasksResult executeListTasks(ListTasksRequest listTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(listTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTasksRequest> request = null;
        Response<ListTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTasksResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists workers.
     * </p>
     * 
     * @param listWorkersRequest
     * @return Result of the ListWorkers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.ListWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListWorkers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWorkersResult listWorkers(ListWorkersRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkers(request);
    }

    @SdkInternalApi
    final ListWorkersResult executeListWorkers(ListWorkersRequest listWorkersRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkersRequest> request = null;
        Response<ListWorkersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a metered product.
     * </p>
     * 
     * @param putMeteredProductRequest
     * @return Result of the PutMeteredProduct operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.PutMeteredProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/PutMeteredProduct" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutMeteredProductResult putMeteredProduct(PutMeteredProductRequest request) {
        request = beforeClientExecution(request);
        return executePutMeteredProduct(request);
    }

    @SdkInternalApi
    final PutMeteredProductResult executePutMeteredProduct(PutMeteredProductRequest putMeteredProductRequest) {

        ExecutionContext executionContext = createExecutionContext(putMeteredProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutMeteredProductRequest> request = null;
        Response<PutMeteredProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutMeteredProductRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putMeteredProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutMeteredProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutMeteredProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutMeteredProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for jobs.
     * </p>
     * 
     * @param searchJobsRequest
     * @return Result of the SearchJobs operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.SearchJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchJobs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchJobsResult searchJobs(SearchJobsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchJobs(request);
    }

    @SdkInternalApi
    final SearchJobsResult executeSearchJobs(SearchJobsRequest searchJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchJobsRequest> request = null;
        Response<SearchJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchJobsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for steps.
     * </p>
     * 
     * @param searchStepsRequest
     * @return Result of the SearchSteps operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.SearchSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchSteps" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchStepsResult searchSteps(SearchStepsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchSteps(request);
    }

    @SdkInternalApi
    final SearchStepsResult executeSearchSteps(SearchStepsRequest searchStepsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchStepsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchStepsRequest> request = null;
        Response<SearchStepsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchStepsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchStepsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchSteps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchStepsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchStepsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for tasks.
     * </p>
     * 
     * @param searchTasksRequest
     * @return Result of the SearchTasks operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.SearchTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchTasks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchTasksResult searchTasks(SearchTasksRequest request) {
        request = beforeClientExecution(request);
        return executeSearchTasks(request);
    }

    @SdkInternalApi
    final SearchTasksResult executeSearchTasks(SearchTasksRequest searchTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(searchTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchTasksRequest> request = null;
        Response<SearchTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches for workers.
     * </p>
     * 
     * @param searchWorkersRequest
     * @return Result of the SearchWorkers operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.SearchWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchWorkers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SearchWorkersResult searchWorkers(SearchWorkersRequest request) {
        request = beforeClientExecution(request);
        return executeSearchWorkers(request);
    }

    @SdkInternalApi
    final SearchWorkersResult executeSearchWorkers(SearchWorkersRequest searchWorkersRequest) {

        ExecutionContext executionContext = createExecutionContext(searchWorkersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchWorkersRequest> request = null;
        Response<SearchWorkersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchWorkersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchWorkersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchWorkers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchWorkersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchWorkersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an asynchronous request for getting aggregated statistics about queues and farms. Get the statistics using
     * the <code>GetSessionsStatisticsAggregation</code> operation. Statistics are available for 1 hour after you call
     * the <code>StartSessionsStatisticsAggregation</code> operation.
     * </p>
     * 
     * @param startSessionsStatisticsAggregationRequest
     * @return Result of the StartSessionsStatisticsAggregation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.StartSessionsStatisticsAggregation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/StartSessionsStatisticsAggregation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartSessionsStatisticsAggregationResult startSessionsStatisticsAggregation(StartSessionsStatisticsAggregationRequest request) {
        request = beforeClientExecution(request);
        return executeStartSessionsStatisticsAggregation(request);
    }

    @SdkInternalApi
    final StartSessionsStatisticsAggregationResult executeStartSessionsStatisticsAggregation(
            StartSessionsStatisticsAggregationRequest startSessionsStatisticsAggregationRequest) {

        ExecutionContext executionContext = createExecutionContext(startSessionsStatisticsAggregationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSessionsStatisticsAggregationRequest> request = null;
        Response<StartSessionsStatisticsAggregationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSessionsStatisticsAggregationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startSessionsStatisticsAggregationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSessionsStatisticsAggregation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSessionsStatisticsAggregationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartSessionsStatisticsAggregationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags a resource using the resource's ARN and desired tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a tag from a resource using the resource's ARN and tag to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a budget that sets spending thresholds for rendering activity.
     * </p>
     * 
     * @param updateBudgetRequest
     * @return Result of the UpdateBudget operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateBudget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateBudget" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateBudgetResult updateBudget(UpdateBudgetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBudget(request);
    }

    @SdkInternalApi
    final UpdateBudgetResult executeUpdateBudget(UpdateBudgetRequest updateBudgetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBudgetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBudgetRequest> request = null;
        Response<UpdateBudgetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBudgetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBudgetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBudget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBudgetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBudgetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a farm.
     * </p>
     * 
     * @param updateFarmRequest
     * @return Result of the UpdateFarm operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateFarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateFarm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFarmResult updateFarm(UpdateFarmRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFarm(request);
    }

    @SdkInternalApi
    final UpdateFarmResult executeUpdateFarm(UpdateFarmRequest updateFarmRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFarmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFarmRequest> request = null;
        Response<UpdateFarmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFarmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFarmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFarm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFarmResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFarmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a fleet.
     * </p>
     * 
     * @param updateFleetRequest
     * @return Result of the UpdateFleet operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your Amazon Web Services account.
     * @sample AWSDeadline.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFleetResult updateFleet(UpdateFleetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFleet(request);
    }

    @SdkInternalApi
    final UpdateFleetResult executeUpdateFleet(UpdateFleetRequest updateFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFleetRequest> request = null;
        Response<UpdateFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a job.
     * </p>
     * 
     * @param updateJobRequest
     * @return Result of the UpdateJob operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateJobResult updateJob(UpdateJobRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateJob(request);
    }

    @SdkInternalApi
    final UpdateJobResult executeUpdateJob(UpdateJobRequest updateJobRequest) {

        ExecutionContext executionContext = createExecutionContext(updateJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobRequest> request = null;
        Response<UpdateJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a Deadline Cloud monitor. You can modify one or all of the settings when you call
     * <code>UpdateMonitor</code>.
     * </p>
     * 
     * @param updateMonitorRequest
     * @return Result of the UpdateMonitor operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateMonitorResult updateMonitor(UpdateMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMonitor(request);
    }

    @SdkInternalApi
    final UpdateMonitorResult executeUpdateMonitor(UpdateMonitorRequest updateMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMonitorRequest> request = null;
        Response<UpdateMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a queue.
     * </p>
     * 
     * @param updateQueueRequest
     * @return Result of the UpdateQueue operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateQueueResult updateQueue(UpdateQueueRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQueue(request);
    }

    @SdkInternalApi
    final UpdateQueueResult executeUpdateQueue(UpdateQueueRequest updateQueueRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQueueRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQueueRequest> request = null;
        Response<UpdateQueueResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQueueRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateQueueRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQueue");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQueueResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateQueueResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the queue environment.
     * </p>
     * 
     * @param updateQueueEnvironmentRequest
     * @return Result of the UpdateQueueEnvironment operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateQueueEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateQueueEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateQueueEnvironmentResult updateQueueEnvironment(UpdateQueueEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQueueEnvironment(request);
    }

    @SdkInternalApi
    final UpdateQueueEnvironmentResult executeUpdateQueueEnvironment(UpdateQueueEnvironmentRequest updateQueueEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQueueEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQueueEnvironmentRequest> request = null;
        Response<UpdateQueueEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQueueEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateQueueEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQueueEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQueueEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateQueueEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a queue-fleet association.
     * </p>
     * 
     * @param updateQueueFleetAssociationRequest
     * @return Result of the UpdateQueueFleetAssociation operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateQueueFleetAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateQueueFleetAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateQueueFleetAssociationResult updateQueueFleetAssociation(UpdateQueueFleetAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQueueFleetAssociation(request);
    }

    @SdkInternalApi
    final UpdateQueueFleetAssociationResult executeUpdateQueueFleetAssociation(UpdateQueueFleetAssociationRequest updateQueueFleetAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQueueFleetAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQueueFleetAssociationRequest> request = null;
        Response<UpdateQueueFleetAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQueueFleetAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateQueueFleetAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQueueFleetAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQueueFleetAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateQueueFleetAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a session.
     * </p>
     * 
     * @param updateSessionRequest
     * @return Result of the UpdateSession operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSessionResult updateSession(UpdateSessionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSession(request);
    }

    @SdkInternalApi
    final UpdateSessionResult executeUpdateSession(UpdateSessionRequest updateSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSessionRequest> request = null;
        Response<UpdateSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a step.
     * </p>
     * 
     * @param updateStepRequest
     * @return Result of the UpdateStep operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateStep" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateStepResult updateStep(UpdateStepRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStep(request);
    }

    @SdkInternalApi
    final UpdateStepResult executeUpdateStep(UpdateStepRequest updateStepRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStepRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStepRequest> request = null;
        Response<UpdateStepResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStepRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStepRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStep");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStepResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateStepResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a storage profile.
     * </p>
     * 
     * @param updateStorageProfileRequest
     * @return Result of the UpdateStorageProfile operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateStorageProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateStorageProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateStorageProfileResult updateStorageProfile(UpdateStorageProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStorageProfile(request);
    }

    @SdkInternalApi
    final UpdateStorageProfileResult executeUpdateStorageProfile(UpdateStorageProfileRequest updateStorageProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStorageProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStorageProfileRequest> request = null;
        Response<UpdateStorageProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStorageProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStorageProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStorageProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStorageProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateStorageProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a task.
     * </p>
     * 
     * @param updateTaskRequest
     * @return Result of the UpdateTask operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTaskResult updateTask(UpdateTaskRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTask(request);
    }

    @SdkInternalApi
    final UpdateTaskResult executeUpdateTask(UpdateTaskRequest updateTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTaskRequest> request = null;
        Response<UpdateTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "management.";
                String resolvedHostPrefix = String.format("management.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTaskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a worker.
     * </p>
     * 
     * @param updateWorkerRequest
     * @return Result of the UpdateWorker operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateWorker" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWorkerResult updateWorker(UpdateWorkerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorker(request);
    }

    @SdkInternalApi
    final UpdateWorkerResult executeUpdateWorker(UpdateWorkerRequest updateWorkerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkerRequest> request = null;
        Response<UpdateWorkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "scheduling.";
                String resolvedHostPrefix = String.format("scheduling.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the schedule for a worker.
     * </p>
     * 
     * @param updateWorkerScheduleRequest
     * @return Result of the UpdateWorkerSchedule operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action.
     * @throws InternalServerErrorException
     *         Deadline Cloud can't process your request right now. Try again later.
     * @throws ResourceNotFoundException
     *         The requested resource can't be found.
     * @throws ThrottlingException
     *         Your request exceeded a request rate quota.
     * @throws ConflictException
     *         Your request has conflicting operations. This can occur if you're trying to perform more than one
     *         operation on the same resource at the same time.
     * @throws ValidationException
     *         The request isn't valid. This can occur if your request contains malformed JSON or unsupported
     *         characters.
     * @sample AWSDeadline.UpdateWorkerSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateWorkerSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateWorkerScheduleResult updateWorkerSchedule(UpdateWorkerScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkerSchedule(request);
    }

    @SdkInternalApi
    final UpdateWorkerScheduleResult executeUpdateWorkerSchedule(UpdateWorkerScheduleRequest updateWorkerScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkerScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkerScheduleRequest> request = null;
        Response<UpdateWorkerScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkerScheduleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkerScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "deadline");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkerSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "scheduling.";
                String resolvedHostPrefix = String.format("scheduling.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkerScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkerScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

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
    public AWSDeadlineWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSDeadlineWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
