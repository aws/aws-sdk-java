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
package com.amazonaws.services.connectcampaign;

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

import com.amazonaws.services.connectcampaign.AmazonConnectCampaignClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.connectcampaign.model.*;
import com.amazonaws.services.connectcampaign.model.transform.*;

/**
 * Client for accessing AmazonConnectCampaignService. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <p>
 * Provide APIs to create and manage Amazon Connect Campaigns.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConnectCampaignClient extends AmazonWebServiceClient implements AmazonConnectCampaign {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonConnectCampaign.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "connect-campaigns";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcampaign.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcampaign.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcampaign.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcampaign.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcampaign.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcampaign.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCampaignStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcampaign.model.transform.InvalidCampaignStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcampaign.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.connectcampaign.model.transform.InvalidStateExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.connectcampaign.model.AmazonConnectCampaignException.class));

    public static AmazonConnectCampaignClientBuilder builder() {
        return AmazonConnectCampaignClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonConnectCampaignService using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonConnectCampaignClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonConnectCampaignService using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonConnectCampaignClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("connect-campaigns.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/connectcampaign/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/connectcampaign/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a campaign for the specified Amazon Connect account. This API is idempotent.
     * </p>
     * 
     * @param createCampaignRequest
     *        The request for Create Campaign API.
     * @return Result of the CreateCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/CreateCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCampaignResult createCampaign(CreateCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCampaign(request);
    }

    @SdkInternalApi
    final CreateCampaignResult executeCreateCampaign(CreateCampaignRequest createCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(createCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCampaignRequest> request = null;
        Response<CreateCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a campaign from the specified Amazon Connect account.
     * </p>
     * 
     * @param deleteCampaignRequest
     *        DeleteCampaignRequest
     * @return Result of the DeleteCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DeleteCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCampaignResult deleteCampaign(DeleteCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCampaign(request);
    }

    @SdkInternalApi
    final DeleteCampaignResult executeDeleteCampaign(DeleteCampaignRequest deleteCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCampaignRequest> request = null;
        Response<DeleteCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a connect instance config from the specified AWS account.
     * </p>
     * 
     * @param deleteConnectInstanceConfigRequest
     *        DeleteCampaignRequest
     * @return Result of the DeleteConnectInstanceConfig operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidStateException
     *         The request could not be processed because of conflict in the current state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.DeleteConnectInstanceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DeleteConnectInstanceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConnectInstanceConfigResult deleteConnectInstanceConfig(DeleteConnectInstanceConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConnectInstanceConfig(request);
    }

    @SdkInternalApi
    final DeleteConnectInstanceConfigResult executeDeleteConnectInstanceConfig(DeleteConnectInstanceConfigRequest deleteConnectInstanceConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConnectInstanceConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectInstanceConfigRequest> request = null;
        Response<DeleteConnectInstanceConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectInstanceConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteConnectInstanceConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConnectInstanceConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConnectInstanceConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConnectInstanceConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete the Connect Campaigns onboarding job for the specified Amazon Connect instance.
     * </p>
     * 
     * @param deleteInstanceOnboardingJobRequest
     *        The request for DeleteInstanceOnboardingJob API.
     * @return Result of the DeleteInstanceOnboardingJob operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidStateException
     *         The request could not be processed because of conflict in the current state.
     * @sample AmazonConnectCampaign.DeleteInstanceOnboardingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DeleteInstanceOnboardingJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteInstanceOnboardingJobResult deleteInstanceOnboardingJob(DeleteInstanceOnboardingJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInstanceOnboardingJob(request);
    }

    @SdkInternalApi
    final DeleteInstanceOnboardingJobResult executeDeleteInstanceOnboardingJob(DeleteInstanceOnboardingJobRequest deleteInstanceOnboardingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInstanceOnboardingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceOnboardingJobRequest> request = null;
        Response<DeleteInstanceOnboardingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceOnboardingJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteInstanceOnboardingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInstanceOnboardingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInstanceOnboardingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteInstanceOnboardingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specific campaign.
     * </p>
     * 
     * @param describeCampaignRequest
     *        DescribeCampaignRequests
     * @return Result of the DescribeCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.DescribeCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/DescribeCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCampaignResult describeCampaign(DescribeCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCampaign(request);
    }

    @SdkInternalApi
    final DescribeCampaignResult executeDescribeCampaign(DescribeCampaignRequest describeCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCampaignRequest> request = null;
        Response<DescribeCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get state of a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param getCampaignStateRequest
     *        GetCampaignStateRequest
     * @return Result of the GetCampaignState operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.GetCampaignState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetCampaignState"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCampaignStateResult getCampaignState(GetCampaignStateRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaignState(request);
    }

    @SdkInternalApi
    final GetCampaignStateResult executeGetCampaignState(GetCampaignStateRequest getCampaignStateRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignStateRequest> request = null;
        Response<GetCampaignStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCampaignStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCampaignState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCampaignStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get state of campaigns for the specified Amazon Connect account.
     * </p>
     * 
     * @param getCampaignStateBatchRequest
     *        GetCampaignStateBatchRequest
     * @return Result of the GetCampaignStateBatch operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.GetCampaignStateBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetCampaignStateBatch"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCampaignStateBatchResult getCampaignStateBatch(GetCampaignStateBatchRequest request) {
        request = beforeClientExecution(request);
        return executeGetCampaignStateBatch(request);
    }

    @SdkInternalApi
    final GetCampaignStateBatchResult executeGetCampaignStateBatch(GetCampaignStateBatchRequest getCampaignStateBatchRequest) {

        ExecutionContext executionContext = createExecutionContext(getCampaignStateBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCampaignStateBatchRequest> request = null;
        Response<GetCampaignStateBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCampaignStateBatchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCampaignStateBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCampaignStateBatch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCampaignStateBatchResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetCampaignStateBatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the specific Connect instance config.
     * </p>
     * 
     * @param getConnectInstanceConfigRequest
     *        GetConnectInstanceConfigRequest
     * @return Result of the GetConnectInstanceConfig operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.GetConnectInstanceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetConnectInstanceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConnectInstanceConfigResult getConnectInstanceConfig(GetConnectInstanceConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetConnectInstanceConfig(request);
    }

    @SdkInternalApi
    final GetConnectInstanceConfigResult executeGetConnectInstanceConfig(GetConnectInstanceConfigRequest getConnectInstanceConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getConnectInstanceConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectInstanceConfigRequest> request = null;
        Response<GetConnectInstanceConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectInstanceConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getConnectInstanceConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConnectInstanceConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConnectInstanceConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConnectInstanceConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the specific instance onboarding job status.
     * </p>
     * 
     * @param getInstanceOnboardingJobStatusRequest
     *        GetInstanceOnboardingJobStatusRequest
     * @return Result of the GetInstanceOnboardingJobStatus operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.GetInstanceOnboardingJobStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetInstanceOnboardingJobStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInstanceOnboardingJobStatusResult getInstanceOnboardingJobStatus(GetInstanceOnboardingJobStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceOnboardingJobStatus(request);
    }

    @SdkInternalApi
    final GetInstanceOnboardingJobStatusResult executeGetInstanceOnboardingJobStatus(GetInstanceOnboardingJobStatusRequest getInstanceOnboardingJobStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceOnboardingJobStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceOnboardingJobStatusRequest> request = null;
        Response<GetInstanceOnboardingJobStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceOnboardingJobStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getInstanceOnboardingJobStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInstanceOnboardingJobStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceOnboardingJobStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetInstanceOnboardingJobStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides summary information about the campaigns under the specified Amazon Connect account.
     * </p>
     * 
     * @param listCampaignsRequest
     *        ListCampaignsRequest
     * @return Result of the ListCampaigns operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.ListCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ListCampaigns" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListCampaignsResult listCampaigns(ListCampaignsRequest request) {
        request = beforeClientExecution(request);
        return executeListCampaigns(request);
    }

    @SdkInternalApi
    final ListCampaignsResult executeListCampaigns(ListCampaignsRequest listCampaignsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCampaignsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCampaignsRequest> request = null;
        Response<ListCampaignsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCampaignsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCampaignsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCampaigns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCampaignsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCampaignsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        ListTagsForResource
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
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
     * Pauses a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param pauseCampaignRequest
     *        PauseCampaignRequest
     * @return Result of the PauseCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InvalidCampaignStateException
     *         The request could not be processed because of conflict in the current state of the campaign.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.PauseCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/PauseCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PauseCampaignResult pauseCampaign(PauseCampaignRequest request) {
        request = beforeClientExecution(request);
        return executePauseCampaign(request);
    }

    @SdkInternalApi
    final PauseCampaignResult executePauseCampaign(PauseCampaignRequest pauseCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(pauseCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PauseCampaignRequest> request = null;
        Response<PauseCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PauseCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(pauseCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PauseCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PauseCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PauseCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates dials requests for the specified campaign Amazon Connect account. This API is idempotent.
     * </p>
     * 
     * @param putDialRequestBatchRequest
     *        PutDialRequestBatchRequest
     * @return Result of the PutDialRequestBatch operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InvalidCampaignStateException
     *         The request could not be processed because of conflict in the current state of the campaign.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.PutDialRequestBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/PutDialRequestBatch"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutDialRequestBatchResult putDialRequestBatch(PutDialRequestBatchRequest request) {
        request = beforeClientExecution(request);
        return executePutDialRequestBatch(request);
    }

    @SdkInternalApi
    final PutDialRequestBatchResult executePutDialRequestBatch(PutDialRequestBatchRequest putDialRequestBatchRequest) {

        ExecutionContext executionContext = createExecutionContext(putDialRequestBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutDialRequestBatchRequest> request = null;
        Response<PutDialRequestBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutDialRequestBatchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putDialRequestBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutDialRequestBatch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutDialRequestBatchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutDialRequestBatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param resumeCampaignRequest
     *        ResumeCampaignRequest
     * @return Result of the ResumeCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InvalidCampaignStateException
     *         The request could not be processed because of conflict in the current state of the campaign.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.ResumeCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/ResumeCampaign"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResumeCampaignResult resumeCampaign(ResumeCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeResumeCampaign(request);
    }

    @SdkInternalApi
    final ResumeCampaignResult executeResumeCampaign(ResumeCampaignRequest resumeCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(resumeCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResumeCampaignRequest> request = null;
        Response<ResumeCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResumeCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resumeCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResumeCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResumeCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResumeCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param startCampaignRequest
     *        StartCampaignRequest
     * @return Result of the StartCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InvalidCampaignStateException
     *         The request could not be processed because of conflict in the current state of the campaign.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.StartCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/StartCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartCampaignResult startCampaign(StartCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeStartCampaign(request);
    }

    @SdkInternalApi
    final StartCampaignResult executeStartCampaign(StartCampaignRequest startCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(startCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCampaignRequest> request = null;
        Response<StartCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Onboard the specific Amazon Connect instance to Connect Campaigns.
     * </p>
     * 
     * @param startInstanceOnboardingJobRequest
     *        The request for StartInstanceOnboardingJob API.
     * @return Result of the StartInstanceOnboardingJob operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.StartInstanceOnboardingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/StartInstanceOnboardingJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartInstanceOnboardingJobResult startInstanceOnboardingJob(StartInstanceOnboardingJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartInstanceOnboardingJob(request);
    }

    @SdkInternalApi
    final StartInstanceOnboardingJobResult executeStartInstanceOnboardingJob(StartInstanceOnboardingJobRequest startInstanceOnboardingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startInstanceOnboardingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartInstanceOnboardingJobRequest> request = null;
        Response<StartInstanceOnboardingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartInstanceOnboardingJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startInstanceOnboardingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartInstanceOnboardingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartInstanceOnboardingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartInstanceOnboardingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a campaign for the specified Amazon Connect account.
     * </p>
     * 
     * @param stopCampaignRequest
     *        StopCampaignRequest
     * @return Result of the StopCampaign operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InvalidCampaignStateException
     *         The request could not be processed because of conflict in the current state of the campaign.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.StopCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/StopCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopCampaignResult stopCampaign(StopCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeStopCampaign(request);
    }

    @SdkInternalApi
    final StopCampaignResult executeStopCampaign(StopCampaignRequest stopCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(stopCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopCampaignRequest> request = null;
        Response<StopCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tag a resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        TagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/TagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
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
     * Untag a resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        UntagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
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
     * Updates the dialer config of a campaign. This API is idempotent.
     * </p>
     * 
     * @param updateCampaignDialerConfigRequest
     *        UpdateCampaignDialerConfigRequest
     * @return Result of the UpdateCampaignDialerConfig operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.UpdateCampaignDialerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignDialerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCampaignDialerConfigResult updateCampaignDialerConfig(UpdateCampaignDialerConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCampaignDialerConfig(request);
    }

    @SdkInternalApi
    final UpdateCampaignDialerConfigResult executeUpdateCampaignDialerConfig(UpdateCampaignDialerConfigRequest updateCampaignDialerConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCampaignDialerConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCampaignDialerConfigRequest> request = null;
        Response<UpdateCampaignDialerConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCampaignDialerConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCampaignDialerConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCampaignDialerConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCampaignDialerConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateCampaignDialerConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the name of a campaign. This API is idempotent.
     * </p>
     * 
     * @param updateCampaignNameRequest
     *        UpdateCampaignNameRequest
     * @return Result of the UpdateCampaignName operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCampaign.UpdateCampaignName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignName"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCampaignNameResult updateCampaignName(UpdateCampaignNameRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCampaignName(request);
    }

    @SdkInternalApi
    final UpdateCampaignNameResult executeUpdateCampaignName(UpdateCampaignNameRequest updateCampaignNameRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCampaignNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCampaignNameRequest> request = null;
        Response<UpdateCampaignNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCampaignNameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCampaignNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCampaignName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCampaignNameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCampaignNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the outbound call config of a campaign. This API is idempotent.
     * </p>
     * 
     * @param updateCampaignOutboundCallConfigRequest
     *        UpdateCampaignOutboundCallConfigRequest
     * @return Result of the UpdateCampaignOutboundCallConfig operation returned by the service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonConnectCampaign.UpdateCampaignOutboundCallConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignOutboundCallConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCampaignOutboundCallConfigResult updateCampaignOutboundCallConfig(UpdateCampaignOutboundCallConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCampaignOutboundCallConfig(request);
    }

    @SdkInternalApi
    final UpdateCampaignOutboundCallConfigResult executeUpdateCampaignOutboundCallConfig(
            UpdateCampaignOutboundCallConfigRequest updateCampaignOutboundCallConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCampaignOutboundCallConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCampaignOutboundCallConfigRequest> request = null;
        Response<UpdateCampaignOutboundCallConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCampaignOutboundCallConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCampaignOutboundCallConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ConnectCampaigns");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCampaignOutboundCallConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCampaignOutboundCallConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateCampaignOutboundCallConfigResultJsonUnmarshaller());
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
