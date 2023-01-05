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
package com.amazonaws.services.omics;

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

import com.amazonaws.services.omics.AmazonOmicsClientBuilder;
import com.amazonaws.services.omics.waiters.AmazonOmicsWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.omics.model.*;
import com.amazonaws.services.omics.model.transform.*;

/**
 * Client for accessing Amazon Omics. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * This is the <i>Amazon Omics API Reference</i>. For an introduction to the service, see <a
 * href="https://docs.aws.amazon.com/omics/latest/dev/">What is Amazon Omics?</a> in the <i>Amazon Omics Developer
 * Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonOmicsClient extends AmazonWebServiceClient implements AmazonOmics {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonOmics.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "omics";

    private volatile AmazonOmicsWaiters waiters;

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
                            new JsonErrorShapeMetadata().withErrorCode("RangeNotSatisfiableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.omics.model.transform.RangeNotSatisfiableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.omics.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.omics.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.omics.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.omics.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestTimeoutException").withExceptionUnmarshaller(
                                    com.amazonaws.services.omics.model.transform.RequestTimeoutExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.omics.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.omics.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.omics.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.omics.model.AmazonOmicsException.class));

    public static AmazonOmicsClientBuilder builder() {
        return AmazonOmicsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Omics using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonOmicsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Omics using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonOmicsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("omics.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/omics/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/omics/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes one or more read sets.
     * </p>
     * 
     * @param batchDeleteReadSetRequest
     * @return Result of the BatchDeleteReadSet operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.BatchDeleteReadSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/BatchDeleteReadSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchDeleteReadSetResult batchDeleteReadSet(BatchDeleteReadSetRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteReadSet(request);
    }

    @SdkInternalApi
    final BatchDeleteReadSetResult executeBatchDeleteReadSet(BatchDeleteReadSetRequest batchDeleteReadSetRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteReadSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteReadSetRequest> request = null;
        Response<BatchDeleteReadSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteReadSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeleteReadSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteReadSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteReadSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDeleteReadSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels an annotation import job.
     * </p>
     * 
     * @param cancelAnnotationImportJobRequest
     * @return Result of the CancelAnnotationImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.CancelAnnotationImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CancelAnnotationImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelAnnotationImportJobResult cancelAnnotationImportJob(CancelAnnotationImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelAnnotationImportJob(request);
    }

    @SdkInternalApi
    final CancelAnnotationImportJobResult executeCancelAnnotationImportJob(CancelAnnotationImportJobRequest cancelAnnotationImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelAnnotationImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelAnnotationImportJobRequest> request = null;
        Response<CancelAnnotationImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelAnnotationImportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelAnnotationImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelAnnotationImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelAnnotationImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelAnnotationImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a run.
     * </p>
     * 
     * @param cancelRunRequest
     * @return Result of the CancelRun operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.CancelRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CancelRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelRunResult cancelRun(CancelRunRequest request) {
        request = beforeClientExecution(request);
        return executeCancelRun(request);
    }

    @SdkInternalApi
    final CancelRunResult executeCancelRun(CancelRunRequest cancelRunRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelRunRequest> request = null;
        Response<CancelRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelRunResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a variant import job.
     * </p>
     * 
     * @param cancelVariantImportJobRequest
     * @return Result of the CancelVariantImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.CancelVariantImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CancelVariantImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelVariantImportJobResult cancelVariantImportJob(CancelVariantImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCancelVariantImportJob(request);
    }

    @SdkInternalApi
    final CancelVariantImportJobResult executeCancelVariantImportJob(CancelVariantImportJobRequest cancelVariantImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelVariantImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelVariantImportJobRequest> request = null;
        Response<CancelVariantImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelVariantImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelVariantImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelVariantImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelVariantImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelVariantImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an annotation store.
     * </p>
     * 
     * @param createAnnotationStoreRequest
     * @return Result of the CreateAnnotationStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.CreateAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateAnnotationStore" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAnnotationStoreResult createAnnotationStore(CreateAnnotationStoreRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAnnotationStore(request);
    }

    @SdkInternalApi
    final CreateAnnotationStoreResult executeCreateAnnotationStore(CreateAnnotationStoreRequest createAnnotationStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(createAnnotationStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAnnotationStoreRequest> request = null;
        Response<CreateAnnotationStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAnnotationStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAnnotationStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAnnotationStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAnnotationStoreResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateAnnotationStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a reference store.
     * </p>
     * 
     * @param createReferenceStoreRequest
     * @return Result of the CreateReferenceStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.CreateReferenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateReferenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateReferenceStoreResult createReferenceStore(CreateReferenceStoreRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReferenceStore(request);
    }

    @SdkInternalApi
    final CreateReferenceStoreResult executeCreateReferenceStore(CreateReferenceStoreRequest createReferenceStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(createReferenceStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReferenceStoreRequest> request = null;
        Response<CreateReferenceStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReferenceStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createReferenceStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReferenceStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateReferenceStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateReferenceStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a run group.
     * </p>
     * 
     * @param createRunGroupRequest
     * @return Result of the CreateRunGroup operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.CreateRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRunGroupResult createRunGroup(CreateRunGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRunGroup(request);
    }

    @SdkInternalApi
    final CreateRunGroupResult executeCreateRunGroup(CreateRunGroupRequest createRunGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createRunGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRunGroupRequest> request = null;
        Response<CreateRunGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRunGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRunGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRunGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRunGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRunGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a sequence store.
     * </p>
     * 
     * @param createSequenceStoreRequest
     * @return Result of the CreateSequenceStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.CreateSequenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateSequenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSequenceStoreResult createSequenceStore(CreateSequenceStoreRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSequenceStore(request);
    }

    @SdkInternalApi
    final CreateSequenceStoreResult executeCreateSequenceStore(CreateSequenceStoreRequest createSequenceStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(createSequenceStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSequenceStoreRequest> request = null;
        Response<CreateSequenceStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSequenceStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSequenceStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSequenceStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSequenceStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSequenceStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a variant store.
     * </p>
     * 
     * @param createVariantStoreRequest
     * @return Result of the CreateVariantStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.CreateVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateVariantStoreResult createVariantStore(CreateVariantStoreRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVariantStore(request);
    }

    @SdkInternalApi
    final CreateVariantStoreResult executeCreateVariantStore(CreateVariantStoreRequest createVariantStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(createVariantStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVariantStoreRequest> request = null;
        Response<CreateVariantStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVariantStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVariantStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVariantStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVariantStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVariantStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a workflow.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return Result of the CreateWorkflow operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWorkflowResult createWorkflow(CreateWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkflow(request);
    }

    @SdkInternalApi
    final CreateWorkflowResult executeCreateWorkflow(CreateWorkflowRequest createWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkflowRequest> request = null;
        Response<CreateWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an annotation store.
     * </p>
     * 
     * @param deleteAnnotationStoreRequest
     * @return Result of the DeleteAnnotationStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.DeleteAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteAnnotationStore" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAnnotationStoreResult deleteAnnotationStore(DeleteAnnotationStoreRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAnnotationStore(request);
    }

    @SdkInternalApi
    final DeleteAnnotationStoreResult executeDeleteAnnotationStore(DeleteAnnotationStoreRequest deleteAnnotationStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAnnotationStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAnnotationStoreRequest> request = null;
        Response<DeleteAnnotationStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAnnotationStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAnnotationStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAnnotationStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAnnotationStoreResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteAnnotationStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a genome reference.
     * </p>
     * 
     * @param deleteReferenceRequest
     * @return Result of the DeleteReference operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.DeleteReference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteReference" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteReferenceResult deleteReference(DeleteReferenceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReference(request);
    }

    @SdkInternalApi
    final DeleteReferenceResult executeDeleteReference(DeleteReferenceRequest deleteReferenceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReferenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReferenceRequest> request = null;
        Response<DeleteReferenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReferenceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteReferenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReference");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReferenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteReferenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a genome reference store.
     * </p>
     * 
     * @param deleteReferenceStoreRequest
     * @return Result of the DeleteReferenceStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.DeleteReferenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteReferenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteReferenceStoreResult deleteReferenceStore(DeleteReferenceStoreRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReferenceStore(request);
    }

    @SdkInternalApi
    final DeleteReferenceStoreResult executeDeleteReferenceStore(DeleteReferenceStoreRequest deleteReferenceStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReferenceStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReferenceStoreRequest> request = null;
        Response<DeleteReferenceStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReferenceStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteReferenceStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReferenceStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReferenceStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteReferenceStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a workflow run.
     * </p>
     * 
     * @param deleteRunRequest
     * @return Result of the DeleteRun operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.DeleteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRunResult deleteRun(DeleteRunRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRun(request);
    }

    @SdkInternalApi
    final DeleteRunResult executeDeleteRun(DeleteRunRequest deleteRunRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRunRequest> request = null;
        Response<DeleteRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRunResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a workflow run group.
     * </p>
     * 
     * @param deleteRunGroupRequest
     * @return Result of the DeleteRunGroup operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.DeleteRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRunGroupResult deleteRunGroup(DeleteRunGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRunGroup(request);
    }

    @SdkInternalApi
    final DeleteRunGroupResult executeDeleteRunGroup(DeleteRunGroupRequest deleteRunGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRunGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRunGroupRequest> request = null;
        Response<DeleteRunGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRunGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRunGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRunGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRunGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRunGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a sequence store.
     * </p>
     * 
     * @param deleteSequenceStoreRequest
     * @return Result of the DeleteSequenceStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.DeleteSequenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteSequenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSequenceStoreResult deleteSequenceStore(DeleteSequenceStoreRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSequenceStore(request);
    }

    @SdkInternalApi
    final DeleteSequenceStoreResult executeDeleteSequenceStore(DeleteSequenceStoreRequest deleteSequenceStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSequenceStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSequenceStoreRequest> request = null;
        Response<DeleteSequenceStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSequenceStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSequenceStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSequenceStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSequenceStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSequenceStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a variant store.
     * </p>
     * 
     * @param deleteVariantStoreRequest
     * @return Result of the DeleteVariantStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.DeleteVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteVariantStoreResult deleteVariantStore(DeleteVariantStoreRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVariantStore(request);
    }

    @SdkInternalApi
    final DeleteVariantStoreResult executeDeleteVariantStore(DeleteVariantStoreRequest deleteVariantStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVariantStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVariantStoreRequest> request = null;
        Response<DeleteVariantStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVariantStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVariantStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVariantStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVariantStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVariantStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return Result of the DeleteWorkflow operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWorkflowResult deleteWorkflow(DeleteWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkflow(request);
    }

    @SdkInternalApi
    final DeleteWorkflowResult executeDeleteWorkflow(DeleteWorkflowRequest deleteWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkflowRequest> request = null;
        Response<DeleteWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an annotation import job.
     * </p>
     * 
     * @param getAnnotationImportJobRequest
     * @return Result of the GetAnnotationImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.GetAnnotationImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetAnnotationImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAnnotationImportJobResult getAnnotationImportJob(GetAnnotationImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetAnnotationImportJob(request);
    }

    @SdkInternalApi
    final GetAnnotationImportJobResult executeGetAnnotationImportJob(GetAnnotationImportJobRequest getAnnotationImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getAnnotationImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAnnotationImportJobRequest> request = null;
        Response<GetAnnotationImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAnnotationImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAnnotationImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAnnotationImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAnnotationImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAnnotationImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an annotation store.
     * </p>
     * 
     * @param getAnnotationStoreRequest
     * @return Result of the GetAnnotationStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.GetAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetAnnotationStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAnnotationStoreResult getAnnotationStore(GetAnnotationStoreRequest request) {
        request = beforeClientExecution(request);
        return executeGetAnnotationStore(request);
    }

    @SdkInternalApi
    final GetAnnotationStoreResult executeGetAnnotationStore(GetAnnotationStoreRequest getAnnotationStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(getAnnotationStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAnnotationStoreRequest> request = null;
        Response<GetAnnotationStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAnnotationStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAnnotationStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAnnotationStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAnnotationStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAnnotationStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a file from a read set.
     * </p>
     * 
     * @param getReadSetRequest
     * @return Result of the GetReadSet operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws RangeNotSatisfiableException
     *         The ranges specified in the request are not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReadSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetReadSetResult getReadSet(GetReadSetRequest request) {
        request = beforeClientExecution(request);
        return executeGetReadSet(request);
    }

    @SdkInternalApi
    final GetReadSetResult executeGetReadSet(GetReadSetRequest getReadSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getReadSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReadSetRequest> request = null;
        Response<GetReadSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReadSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReadSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReadSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "storage-";
                String resolvedHostPrefix = String.format("storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReadSetResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(false).withHasStreamingSuccessResponse(true), new GetReadSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a read set activation job.
     * </p>
     * 
     * @param getReadSetActivationJobRequest
     * @return Result of the GetReadSetActivationJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReadSetActivationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetActivationJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetReadSetActivationJobResult getReadSetActivationJob(GetReadSetActivationJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetReadSetActivationJob(request);
    }

    @SdkInternalApi
    final GetReadSetActivationJobResult executeGetReadSetActivationJob(GetReadSetActivationJobRequest getReadSetActivationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getReadSetActivationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReadSetActivationJobRequest> request = null;
        Response<GetReadSetActivationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReadSetActivationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getReadSetActivationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReadSetActivationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReadSetActivationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetReadSetActivationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a read set export job.
     * </p>
     * 
     * @param getReadSetExportJobRequest
     * @return Result of the GetReadSetExportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReadSetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetExportJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetReadSetExportJobResult getReadSetExportJob(GetReadSetExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetReadSetExportJob(request);
    }

    @SdkInternalApi
    final GetReadSetExportJobResult executeGetReadSetExportJob(GetReadSetExportJobRequest getReadSetExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getReadSetExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReadSetExportJobRequest> request = null;
        Response<GetReadSetExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReadSetExportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReadSetExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReadSetExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReadSetExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReadSetExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a read set import job.
     * </p>
     * 
     * @param getReadSetImportJobRequest
     * @return Result of the GetReadSetImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReadSetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetReadSetImportJobResult getReadSetImportJob(GetReadSetImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetReadSetImportJob(request);
    }

    @SdkInternalApi
    final GetReadSetImportJobResult executeGetReadSetImportJob(GetReadSetImportJobRequest getReadSetImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getReadSetImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReadSetImportJobRequest> request = null;
        Response<GetReadSetImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReadSetImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReadSetImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReadSetImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReadSetImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReadSetImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a read set.
     * </p>
     * 
     * @param getReadSetMetadataRequest
     * @return Result of the GetReadSetMetadata operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReadSetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetReadSetMetadataResult getReadSetMetadata(GetReadSetMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeGetReadSetMetadata(request);
    }

    @SdkInternalApi
    final GetReadSetMetadataResult executeGetReadSetMetadata(GetReadSetMetadataRequest getReadSetMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(getReadSetMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReadSetMetadataRequest> request = null;
        Response<GetReadSetMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReadSetMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReadSetMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReadSetMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReadSetMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReadSetMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a reference file.
     * </p>
     * 
     * @param getReferenceRequest
     * @return Result of the GetReference operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws RangeNotSatisfiableException
     *         The ranges specified in the request are not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReference" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetReferenceResult getReference(GetReferenceRequest request) {
        request = beforeClientExecution(request);
        return executeGetReference(request);
    }

    @SdkInternalApi
    final GetReferenceResult executeGetReference(GetReferenceRequest getReferenceRequest) {

        ExecutionContext executionContext = createExecutionContext(getReferenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReferenceRequest> request = null;
        Response<GetReferenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReferenceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReferenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReference");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "storage-";
                String resolvedHostPrefix = String.format("storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReferenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(true), new GetReferenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a reference import job.
     * </p>
     * 
     * @param getReferenceImportJobRequest
     * @return Result of the GetReferenceImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReferenceImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReferenceImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetReferenceImportJobResult getReferenceImportJob(GetReferenceImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetReferenceImportJob(request);
    }

    @SdkInternalApi
    final GetReferenceImportJobResult executeGetReferenceImportJob(GetReferenceImportJobRequest getReferenceImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getReferenceImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReferenceImportJobRequest> request = null;
        Response<GetReferenceImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReferenceImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReferenceImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReferenceImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReferenceImportJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetReferenceImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a genome reference's metadata.
     * </p>
     * 
     * @param getReferenceMetadataRequest
     * @return Result of the GetReferenceMetadata operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReferenceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReferenceMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetReferenceMetadataResult getReferenceMetadata(GetReferenceMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeGetReferenceMetadata(request);
    }

    @SdkInternalApi
    final GetReferenceMetadataResult executeGetReferenceMetadata(GetReferenceMetadataRequest getReferenceMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(getReferenceMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReferenceMetadataRequest> request = null;
        Response<GetReferenceMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReferenceMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReferenceMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReferenceMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReferenceMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReferenceMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a reference store.
     * </p>
     * 
     * @param getReferenceStoreRequest
     * @return Result of the GetReferenceStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReferenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReferenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetReferenceStoreResult getReferenceStore(GetReferenceStoreRequest request) {
        request = beforeClientExecution(request);
        return executeGetReferenceStore(request);
    }

    @SdkInternalApi
    final GetReferenceStoreResult executeGetReferenceStore(GetReferenceStoreRequest getReferenceStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(getReferenceStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReferenceStoreRequest> request = null;
        Response<GetReferenceStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReferenceStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReferenceStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReferenceStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReferenceStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReferenceStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a workflow run.
     * </p>
     * 
     * @param getRunRequest
     * @return Result of the GetRun operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRunResult getRun(GetRunRequest request) {
        request = beforeClientExecution(request);
        return executeGetRun(request);
    }

    @SdkInternalApi
    final GetRunResult executeGetRun(GetRunRequest getRunRequest) {

        ExecutionContext executionContext = createExecutionContext(getRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRunRequest> request = null;
        Response<GetRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRunResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a workflow run group.
     * </p>
     * 
     * @param getRunGroupRequest
     * @return Result of the GetRunGroup operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRunGroupResult getRunGroup(GetRunGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetRunGroup(request);
    }

    @SdkInternalApi
    final GetRunGroupResult executeGetRunGroup(GetRunGroupRequest getRunGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getRunGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRunGroupRequest> request = null;
        Response<GetRunGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRunGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRunGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRunGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRunGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRunGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a workflow run task.
     * </p>
     * 
     * @param getRunTaskRequest
     * @return Result of the GetRunTask operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetRunTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRunTask" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRunTaskResult getRunTask(GetRunTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetRunTask(request);
    }

    @SdkInternalApi
    final GetRunTaskResult executeGetRunTask(GetRunTaskRequest getRunTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getRunTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRunTaskRequest> request = null;
        Response<GetRunTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRunTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRunTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRunTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRunTaskResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRunTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a sequence store.
     * </p>
     * 
     * @param getSequenceStoreRequest
     * @return Result of the GetSequenceStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetSequenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetSequenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSequenceStoreResult getSequenceStore(GetSequenceStoreRequest request) {
        request = beforeClientExecution(request);
        return executeGetSequenceStore(request);
    }

    @SdkInternalApi
    final GetSequenceStoreResult executeGetSequenceStore(GetSequenceStoreRequest getSequenceStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(getSequenceStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSequenceStoreRequest> request = null;
        Response<GetSequenceStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSequenceStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSequenceStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSequenceStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSequenceStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSequenceStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a variant import job.
     * </p>
     * 
     * @param getVariantImportJobRequest
     * @return Result of the GetVariantImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.GetVariantImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetVariantImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetVariantImportJobResult getVariantImportJob(GetVariantImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetVariantImportJob(request);
    }

    @SdkInternalApi
    final GetVariantImportJobResult executeGetVariantImportJob(GetVariantImportJobRequest getVariantImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getVariantImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVariantImportJobRequest> request = null;
        Response<GetVariantImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVariantImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVariantImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVariantImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVariantImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVariantImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a variant store.
     * </p>
     * 
     * @param getVariantStoreRequest
     * @return Result of the GetVariantStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.GetVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetVariantStoreResult getVariantStore(GetVariantStoreRequest request) {
        request = beforeClientExecution(request);
        return executeGetVariantStore(request);
    }

    @SdkInternalApi
    final GetVariantStoreResult executeGetVariantStore(GetVariantStoreRequest getVariantStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(getVariantStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVariantStoreRequest> request = null;
        Response<GetVariantStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVariantStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVariantStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVariantStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVariantStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVariantStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a workflow.
     * </p>
     * 
     * @param getWorkflowRequest
     * @return Result of the GetWorkflow operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetWorkflowResult getWorkflow(GetWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorkflow(request);
    }

    @SdkInternalApi
    final GetWorkflowResult executeGetWorkflow(GetWorkflowRequest getWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkflowRequest> request = null;
        Response<GetWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of annotation import jobs.
     * </p>
     * 
     * @param listAnnotationImportJobsRequest
     * @return Result of the ListAnnotationImportJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.ListAnnotationImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListAnnotationImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAnnotationImportJobsResult listAnnotationImportJobs(ListAnnotationImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListAnnotationImportJobs(request);
    }

    @SdkInternalApi
    final ListAnnotationImportJobsResult executeListAnnotationImportJobs(ListAnnotationImportJobsRequest listAnnotationImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnnotationImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnnotationImportJobsRequest> request = null;
        Response<ListAnnotationImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnnotationImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAnnotationImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnnotationImportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnnotationImportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAnnotationImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of annotation stores.
     * </p>
     * 
     * @param listAnnotationStoresRequest
     * @return Result of the ListAnnotationStores operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.ListAnnotationStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListAnnotationStores" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAnnotationStoresResult listAnnotationStores(ListAnnotationStoresRequest request) {
        request = beforeClientExecution(request);
        return executeListAnnotationStores(request);
    }

    @SdkInternalApi
    final ListAnnotationStoresResult executeListAnnotationStores(ListAnnotationStoresRequest listAnnotationStoresRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnnotationStoresRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnnotationStoresRequest> request = null;
        Response<ListAnnotationStoresResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnnotationStoresRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAnnotationStoresRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnnotationStores");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnnotationStoresResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAnnotationStoresResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of read set activation jobs.
     * </p>
     * 
     * @param listReadSetActivationJobsRequest
     * @return Result of the ListReadSetActivationJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReadSetActivationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetActivationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListReadSetActivationJobsResult listReadSetActivationJobs(ListReadSetActivationJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListReadSetActivationJobs(request);
    }

    @SdkInternalApi
    final ListReadSetActivationJobsResult executeListReadSetActivationJobs(ListReadSetActivationJobsRequest listReadSetActivationJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listReadSetActivationJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReadSetActivationJobsRequest> request = null;
        Response<ListReadSetActivationJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReadSetActivationJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listReadSetActivationJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReadSetActivationJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReadSetActivationJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListReadSetActivationJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of read set export jobs.
     * </p>
     * 
     * @param listReadSetExportJobsRequest
     * @return Result of the ListReadSetExportJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReadSetExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListReadSetExportJobsResult listReadSetExportJobs(ListReadSetExportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListReadSetExportJobs(request);
    }

    @SdkInternalApi
    final ListReadSetExportJobsResult executeListReadSetExportJobs(ListReadSetExportJobsRequest listReadSetExportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listReadSetExportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReadSetExportJobsRequest> request = null;
        Response<ListReadSetExportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReadSetExportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReadSetExportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReadSetExportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReadSetExportJobsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListReadSetExportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of read set import jobs.
     * </p>
     * 
     * @param listReadSetImportJobsRequest
     * @return Result of the ListReadSetImportJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReadSetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListReadSetImportJobsResult listReadSetImportJobs(ListReadSetImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListReadSetImportJobs(request);
    }

    @SdkInternalApi
    final ListReadSetImportJobsResult executeListReadSetImportJobs(ListReadSetImportJobsRequest listReadSetImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listReadSetImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReadSetImportJobsRequest> request = null;
        Response<ListReadSetImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReadSetImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReadSetImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReadSetImportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReadSetImportJobsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListReadSetImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of read sets.
     * </p>
     * 
     * @param listReadSetsRequest
     * @return Result of the ListReadSets operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReadSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListReadSetsResult listReadSets(ListReadSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListReadSets(request);
    }

    @SdkInternalApi
    final ListReadSetsResult executeListReadSets(ListReadSetsRequest listReadSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listReadSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReadSetsRequest> request = null;
        Response<ListReadSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReadSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReadSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReadSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReadSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListReadSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of reference import jobs.
     * </p>
     * 
     * @param listReferenceImportJobsRequest
     * @return Result of the ListReferenceImportJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReferenceImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferenceImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListReferenceImportJobsResult listReferenceImportJobs(ListReferenceImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListReferenceImportJobs(request);
    }

    @SdkInternalApi
    final ListReferenceImportJobsResult executeListReferenceImportJobs(ListReferenceImportJobsRequest listReferenceImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listReferenceImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReferenceImportJobsRequest> request = null;
        Response<ListReferenceImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReferenceImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listReferenceImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReferenceImportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReferenceImportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListReferenceImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of reference stores.
     * </p>
     * 
     * @param listReferenceStoresRequest
     * @return Result of the ListReferenceStores operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReferenceStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferenceStores" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListReferenceStoresResult listReferenceStores(ListReferenceStoresRequest request) {
        request = beforeClientExecution(request);
        return executeListReferenceStores(request);
    }

    @SdkInternalApi
    final ListReferenceStoresResult executeListReferenceStores(ListReferenceStoresRequest listReferenceStoresRequest) {

        ExecutionContext executionContext = createExecutionContext(listReferenceStoresRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReferenceStoresRequest> request = null;
        Response<ListReferenceStoresResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReferenceStoresRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReferenceStoresRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReferenceStores");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReferenceStoresResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListReferenceStoresResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of references.
     * </p>
     * 
     * @param listReferencesRequest
     * @return Result of the ListReferences operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferences" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListReferencesResult listReferences(ListReferencesRequest request) {
        request = beforeClientExecution(request);
        return executeListReferences(request);
    }

    @SdkInternalApi
    final ListReferencesResult executeListReferences(ListReferencesRequest listReferencesRequest) {

        ExecutionContext executionContext = createExecutionContext(listReferencesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReferencesRequest> request = null;
        Response<ListReferencesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReferencesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReferencesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReferences");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReferencesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListReferencesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of run groups.
     * </p>
     * 
     * @param listRunGroupsRequest
     * @return Result of the ListRunGroups operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListRunGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRunGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRunGroupsResult listRunGroups(ListRunGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListRunGroups(request);
    }

    @SdkInternalApi
    final ListRunGroupsResult executeListRunGroups(ListRunGroupsRequest listRunGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRunGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRunGroupsRequest> request = null;
        Response<ListRunGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRunGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRunGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRunGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRunGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRunGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of tasks for a run.
     * </p>
     * 
     * @param listRunTasksRequest
     * @return Result of the ListRunTasks operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListRunTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRunTasks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRunTasksResult listRunTasks(ListRunTasksRequest request) {
        request = beforeClientExecution(request);
        return executeListRunTasks(request);
    }

    @SdkInternalApi
    final ListRunTasksResult executeListRunTasks(ListRunTasksRequest listRunTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(listRunTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRunTasksRequest> request = null;
        Response<ListRunTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRunTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRunTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRunTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRunTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRunTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of runs.
     * </p>
     * 
     * @param listRunsRequest
     * @return Result of the ListRuns operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRuns" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRunsResult listRuns(ListRunsRequest request) {
        request = beforeClientExecution(request);
        return executeListRuns(request);
    }

    @SdkInternalApi
    final ListRunsResult executeListRuns(ListRunsRequest listRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRunsRequest> request = null;
        Response<ListRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRunsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of sequence stores.
     * </p>
     * 
     * @param listSequenceStoresRequest
     * @return Result of the ListSequenceStores operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListSequenceStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListSequenceStores" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSequenceStoresResult listSequenceStores(ListSequenceStoresRequest request) {
        request = beforeClientExecution(request);
        return executeListSequenceStores(request);
    }

    @SdkInternalApi
    final ListSequenceStoresResult executeListSequenceStores(ListSequenceStoresRequest listSequenceStoresRequest) {

        ExecutionContext executionContext = createExecutionContext(listSequenceStoresRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSequenceStoresRequest> request = null;
        Response<ListSequenceStoresResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSequenceStoresRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSequenceStoresRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSequenceStores");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSequenceStoresResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSequenceStoresResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tags-";
                String resolvedHostPrefix = String.format("tags-");

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
     * Retrieves a list of variant import jobs.
     * </p>
     * 
     * @param listVariantImportJobsRequest
     * @return Result of the ListVariantImportJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.ListVariantImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListVariantImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListVariantImportJobsResult listVariantImportJobs(ListVariantImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListVariantImportJobs(request);
    }

    @SdkInternalApi
    final ListVariantImportJobsResult executeListVariantImportJobs(ListVariantImportJobsRequest listVariantImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVariantImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVariantImportJobsRequest> request = null;
        Response<ListVariantImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVariantImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVariantImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVariantImportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVariantImportJobsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListVariantImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of variant stores.
     * </p>
     * 
     * @param listVariantStoresRequest
     * @return Result of the ListVariantStores operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.ListVariantStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListVariantStores" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListVariantStoresResult listVariantStores(ListVariantStoresRequest request) {
        request = beforeClientExecution(request);
        return executeListVariantStores(request);
    }

    @SdkInternalApi
    final ListVariantStoresResult executeListVariantStores(ListVariantStoresRequest listVariantStoresRequest) {

        ExecutionContext executionContext = createExecutionContext(listVariantStoresRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVariantStoresRequest> request = null;
        Response<ListVariantStoresResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVariantStoresRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVariantStoresRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVariantStores");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVariantStoresResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVariantStoresResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of workflows.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return Result of the ListWorkflows operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWorkflowsResult listWorkflows(ListWorkflowsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkflows(request);
    }

    @SdkInternalApi
    final ListWorkflowsResult executeListWorkflows(ListWorkflowsRequest listWorkflowsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkflowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkflowsRequest> request = null;
        Response<ListWorkflowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkflowsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkflowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkflows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkflowsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkflowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an annotation import job.
     * </p>
     * 
     * @param startAnnotationImportJobRequest
     * @return Result of the StartAnnotationImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.StartAnnotationImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartAnnotationImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartAnnotationImportJobResult startAnnotationImportJob(StartAnnotationImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartAnnotationImportJob(request);
    }

    @SdkInternalApi
    final StartAnnotationImportJobResult executeStartAnnotationImportJob(StartAnnotationImportJobRequest startAnnotationImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startAnnotationImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAnnotationImportJobRequest> request = null;
        Response<StartAnnotationImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAnnotationImportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startAnnotationImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartAnnotationImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAnnotationImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartAnnotationImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a read set activation job.
     * </p>
     * 
     * @param startReadSetActivationJobRequest
     * @return Result of the StartReadSetActivationJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.StartReadSetActivationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetActivationJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartReadSetActivationJobResult startReadSetActivationJob(StartReadSetActivationJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartReadSetActivationJob(request);
    }

    @SdkInternalApi
    final StartReadSetActivationJobResult executeStartReadSetActivationJob(StartReadSetActivationJobRequest startReadSetActivationJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startReadSetActivationJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReadSetActivationJobRequest> request = null;
        Response<StartReadSetActivationJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReadSetActivationJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startReadSetActivationJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartReadSetActivationJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartReadSetActivationJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartReadSetActivationJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a read set export job.
     * </p>
     * 
     * @param startReadSetExportJobRequest
     * @return Result of the StartReadSetExportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.StartReadSetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartReadSetExportJobResult startReadSetExportJob(StartReadSetExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartReadSetExportJob(request);
    }

    @SdkInternalApi
    final StartReadSetExportJobResult executeStartReadSetExportJob(StartReadSetExportJobRequest startReadSetExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startReadSetExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReadSetExportJobRequest> request = null;
        Response<StartReadSetExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReadSetExportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startReadSetExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartReadSetExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartReadSetExportJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartReadSetExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a read set import job.
     * </p>
     * 
     * @param startReadSetImportJobRequest
     * @return Result of the StartReadSetImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.StartReadSetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartReadSetImportJobResult startReadSetImportJob(StartReadSetImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartReadSetImportJob(request);
    }

    @SdkInternalApi
    final StartReadSetImportJobResult executeStartReadSetImportJob(StartReadSetImportJobRequest startReadSetImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startReadSetImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReadSetImportJobRequest> request = null;
        Response<StartReadSetImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReadSetImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startReadSetImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartReadSetImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartReadSetImportJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartReadSetImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a reference import job.
     * </p>
     * 
     * @param startReferenceImportJobRequest
     * @return Result of the StartReferenceImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.StartReferenceImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReferenceImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartReferenceImportJobResult startReferenceImportJob(StartReferenceImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartReferenceImportJob(request);
    }

    @SdkInternalApi
    final StartReferenceImportJobResult executeStartReferenceImportJob(StartReferenceImportJobRequest startReferenceImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startReferenceImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReferenceImportJobRequest> request = null;
        Response<StartReferenceImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReferenceImportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startReferenceImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartReferenceImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "control-storage-";
                String resolvedHostPrefix = String.format("control-storage-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartReferenceImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartReferenceImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a run.
     * </p>
     * 
     * @param startRunRequest
     * @return Result of the StartRun operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.StartRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartRunResult startRun(StartRunRequest request) {
        request = beforeClientExecution(request);
        return executeStartRun(request);
    }

    @SdkInternalApi
    final StartRunResult executeStartRun(StartRunRequest startRunRequest) {

        ExecutionContext executionContext = createExecutionContext(startRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartRunRequest> request = null;
        Response<StartRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartRunResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a variant import job.
     * </p>
     * 
     * @param startVariantImportJobRequest
     * @return Result of the StartVariantImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.StartVariantImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartVariantImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartVariantImportJobResult startVariantImportJob(StartVariantImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartVariantImportJob(request);
    }

    @SdkInternalApi
    final StartVariantImportJobResult executeStartVariantImportJob(StartVariantImportJobRequest startVariantImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startVariantImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartVariantImportJobRequest> request = null;
        Response<StartVariantImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartVariantImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startVariantImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartVariantImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartVariantImportJobResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartVariantImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tags-";
                String resolvedHostPrefix = String.format("tags-");

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
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "tags-";
                String resolvedHostPrefix = String.format("tags-");

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
     * Updates an annotation store.
     * </p>
     * 
     * @param updateAnnotationStoreRequest
     * @return Result of the UpdateAnnotationStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.UpdateAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateAnnotationStore" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateAnnotationStoreResult updateAnnotationStore(UpdateAnnotationStoreRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAnnotationStore(request);
    }

    @SdkInternalApi
    final UpdateAnnotationStoreResult executeUpdateAnnotationStore(UpdateAnnotationStoreRequest updateAnnotationStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAnnotationStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAnnotationStoreRequest> request = null;
        Response<UpdateAnnotationStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAnnotationStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAnnotationStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAnnotationStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAnnotationStoreResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateAnnotationStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a run group.
     * </p>
     * 
     * @param updateRunGroupRequest
     * @return Result of the UpdateRunGroup operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.UpdateRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRunGroupResult updateRunGroup(UpdateRunGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRunGroup(request);
    }

    @SdkInternalApi
    final UpdateRunGroupResult executeUpdateRunGroup(UpdateRunGroupRequest updateRunGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRunGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRunGroupRequest> request = null;
        Response<UpdateRunGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRunGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRunGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRunGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRunGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRunGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a variant store.
     * </p>
     * 
     * @param updateVariantStoreRequest
     * @return Result of the UpdateVariantStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.UpdateVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateVariantStoreResult updateVariantStore(UpdateVariantStoreRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVariantStore(request);
    }

    @SdkInternalApi
    final UpdateVariantStoreResult executeUpdateVariantStore(UpdateVariantStoreRequest updateVariantStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVariantStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVariantStoreRequest> request = null;
        Response<UpdateVariantStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVariantStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVariantStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVariantStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "analytics-";
                String resolvedHostPrefix = String.format("analytics-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVariantStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVariantStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a workflow.
     * </p>
     * 
     * @param updateWorkflowRequest
     * @return Result of the UpdateWorkflow operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.UpdateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWorkflowResult updateWorkflow(UpdateWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkflow(request);
    }

    @SdkInternalApi
    final UpdateWorkflowResult executeUpdateWorkflow(UpdateWorkflowRequest updateWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkflowRequest> request = null;
        Response<UpdateWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Omics");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "workflows-";
                String resolvedHostPrefix = String.format("workflows-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkflowResultJsonUnmarshaller());
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
    public AmazonOmicsWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonOmicsWaiters(this);
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
