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
package com.amazonaws.services.amplify;

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

import com.amazonaws.services.amplify.AWSAmplifyClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.services.amplify.model.transform.*;

/**
 * Client for accessing Amplify. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amplify is a fully managed continuous deployment and hosting service for modern web apps.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAmplifyClient extends AmazonWebServiceClient implements AWSAmplify {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAmplify.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "amplify";

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
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withModeledClass(
                                    com.amazonaws.services.amplify.model.InternalFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DependentServiceFailureException").withModeledClass(
                                    com.amazonaws.services.amplify.model.DependentServiceFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.amplify.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withModeledClass(
                                    com.amazonaws.services.amplify.model.UnauthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.amplify.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.amplify.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.amplify.model.AWSAmplifyException.class));

    public static AWSAmplifyClientBuilder builder() {
        return AWSAmplifyClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amplify using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAmplifyClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amplify using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAmplifyClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("amplify.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/amplify/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/amplify/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a new Amplify App.
     * </p>
     * 
     * @param createAppRequest
     *        Request structure used to create Apps in Amplify.
     * @return Result of the CreateApp operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAppResult createApp(CreateAppRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApp(request);
    }

    @SdkInternalApi
    final CreateAppResult executeCreateApp(CreateAppRequest createAppRequest) {

        ExecutionContext executionContext = createExecutionContext(createAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAppRequest> request = null;
        Response<CreateAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Branch for an Amplify App.
     * </p>
     * 
     * @param createBranchRequest
     *        Request structure for a branch create request.
     * @return Result of the CreateBranch operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.CreateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBranchResult createBranch(CreateBranchRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBranch(request);
    }

    @SdkInternalApi
    final CreateBranchResult executeCreateBranch(CreateBranchRequest createBranchRequest) {

        ExecutionContext executionContext = createExecutionContext(createBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBranchRequest> request = null;
        Response<CreateBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBranchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBranch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBranchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBranchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new DomainAssociation on an App
     * </p>
     * 
     * @param createDomainAssociationRequest
     *        Request structure for create Domain Association request.
     * @return Result of the CreateDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.CreateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDomainAssociationResult createDomainAssociation(CreateDomainAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomainAssociation(request);
    }

    @SdkInternalApi
    final CreateDomainAssociationResult executeCreateDomainAssociation(CreateDomainAssociationRequest createDomainAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainAssociationRequest> request = null;
        Response<CreateDomainAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDomainAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDomainAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDomainAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an existing Amplify App by appId.
     * </p>
     * 
     * @param deleteAppRequest
     *        Request structure for an Amplify App delete request.
     * @return Result of the DeleteApp operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAppResult deleteApp(DeleteAppRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApp(request);
    }

    @SdkInternalApi
    final DeleteAppResult executeDeleteApp(DeleteAppRequest deleteAppRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAppRequest> request = null;
        Response<DeleteAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a branch for an Amplify App.
     * </p>
     * 
     * @param deleteBranchRequest
     *        Request structure for delete branch request.
     * @return Result of the DeleteBranch operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.DeleteBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBranch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBranchResult deleteBranch(DeleteBranchRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBranch(request);
    }

    @SdkInternalApi
    final DeleteBranchResult executeDeleteBranch(DeleteBranchRequest deleteBranchRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBranchRequest> request = null;
        Response<DeleteBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBranchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBranch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBranchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBranchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a DomainAssociation.
     * </p>
     * 
     * @param deleteDomainAssociationRequest
     *        Request structure for the delete Domain Association request.
     * @return Result of the DeleteDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.DeleteDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDomainAssociationResult deleteDomainAssociation(DeleteDomainAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomainAssociation(request);
    }

    @SdkInternalApi
    final DeleteDomainAssociationResult executeDeleteDomainAssociation(DeleteDomainAssociationRequest deleteDomainAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainAssociationRequest> request = null;
        Response<DeleteDomainAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDomainAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDomainAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDomainAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a job, for an Amplify branch, part of Amplify App.
     * </p>
     * 
     * @param deleteJobRequest
     *        Request structure for delete job request.
     * @return Result of the DeleteJob operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @sample AWSAmplify.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteJobResult deleteJob(DeleteJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteJob(request);
    }

    @SdkInternalApi
    final DeleteJobResult executeDeleteJob(DeleteJobRequest deleteJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteJobRequest> request = null;
        Response<DeleteJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an existing Amplify App by appId.
     * </p>
     * 
     * @param getAppRequest
     *        Request structure for get App request.
     * @return Result of the GetApp operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAppResult getApp(GetAppRequest request) {
        request = beforeClientExecution(request);
        return executeGetApp(request);
    }

    @SdkInternalApi
    final GetAppResult executeGetApp(GetAppRequest getAppRequest) {

        ExecutionContext executionContext = createExecutionContext(getAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAppRequest> request = null;
        Response<GetAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a branch for an Amplify App.
     * </p>
     * 
     * @param getBranchRequest
     *        Result structure for get branch request.
     * @return Result of the GetBranch operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetBranch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBranchResult getBranch(GetBranchRequest request) {
        request = beforeClientExecution(request);
        return executeGetBranch(request);
    }

    @SdkInternalApi
    final GetBranchResult executeGetBranch(GetBranchRequest getBranchRequest) {

        ExecutionContext executionContext = createExecutionContext(getBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBranchRequest> request = null;
        Response<GetBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBranchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetBranch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBranchResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBranchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves domain info that corresponds to an appId and domainName.
     * </p>
     * 
     * @param getDomainAssociationRequest
     *        Request structure for the get Domain Association request.
     * @return Result of the GetDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.GetDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetDomainAssociation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDomainAssociationResult getDomainAssociation(GetDomainAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomainAssociation(request);
    }

    @SdkInternalApi
    final GetDomainAssociationResult executeGetDomainAssociation(GetDomainAssociationRequest getDomainAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainAssociationRequest> request = null;
        Response<GetDomainAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainAssociationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDomainAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDomainAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDomainAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a job for a branch, part of an Amplify App.
     * </p>
     * 
     * @param getJobRequest
     *        Request structure for get job request.
     * @return Result of the GetJob operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @sample AWSAmplify.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GetJob" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists existing Amplify Apps.
     * </p>
     * 
     * @param listAppsRequest
     *        Request structure for an Amplify App list request.
     * @return Result of the ListApps operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAppsResult listApps(ListAppsRequest request) {
        request = beforeClientExecution(request);
        return executeListApps(request);
    }

    @SdkInternalApi
    final ListAppsResult executeListApps(ListAppsRequest listAppsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAppsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAppsRequest> request = null;
        Response<ListAppsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAppsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAppsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAppsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAppsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists branches for an Amplify App.
     * </p>
     * 
     * @param listBranchesRequest
     *        Request structure for list branches request.
     * @return Result of the ListBranches operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListBranches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListBranches" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBranchesResult listBranches(ListBranchesRequest request) {
        request = beforeClientExecution(request);
        return executeListBranches(request);
    }

    @SdkInternalApi
    final ListBranchesResult executeListBranches(ListBranchesRequest listBranchesRequest) {

        ExecutionContext executionContext = createExecutionContext(listBranchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBranchesRequest> request = null;
        Response<ListBranchesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBranchesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBranchesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBranches");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBranchesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBranchesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List domains with an app
     * </p>
     * 
     * @param listDomainAssociationsRequest
     *        Request structure for the list Domain Associations request.
     * @return Result of the ListDomainAssociations operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.ListDomainAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListDomainAssociations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDomainAssociationsResult listDomainAssociations(ListDomainAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListDomainAssociations(request);
    }

    @SdkInternalApi
    final ListDomainAssociationsResult executeListDomainAssociations(ListDomainAssociationsRequest listDomainAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainAssociationsRequest> request = null;
        Response<ListDomainAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomainAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDomainAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List Jobs for a branch, part of an Amplify App.
     * </p>
     * 
     * @param listJobsRequest
     *        Request structure for list job request.
     * @return Result of the ListJobs operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @sample AWSAmplify.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListJobs" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a new job for a branch, part of an Amplify App.
     * </p>
     * 
     * @param startJobRequest
     *        Request structure for Start job request.
     * @return Result of the StartJob operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @sample AWSAmplify.StartJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StartJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartJobResult startJob(StartJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartJob(request);
    }

    @SdkInternalApi
    final StartJobResult executeStartJob(StartJobRequest startJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartJobRequest> request = null;
        Response<StartJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stop a job that is in progress, for an Amplify branch, part of Amplify App.
     * </p>
     * 
     * @param stopJobRequest
     *        Request structure for stop job request.
     * @return Result of the StopJob operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws LimitExceededException
     *         Exception thrown when a resource could not be created because of service limits.
     * @sample AWSAmplify.StopJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/StopJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopJobResult stopJob(StopJobRequest request) {
        request = beforeClientExecution(request);
        return executeStopJob(request);
    }

    @SdkInternalApi
    final StopJobResult executeStopJob(StopJobRequest stopJobRequest) {

        ExecutionContext executionContext = createExecutionContext(stopJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopJobRequest> request = null;
        Response<StopJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopJobResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing Amplify App.
     * </p>
     * 
     * @param updateAppRequest
     *        Request structure for update App request.
     * @return Result of the UpdateApp operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @sample AWSAmplify.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAppResult updateApp(UpdateAppRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApp(request);
    }

    @SdkInternalApi
    final UpdateAppResult executeUpdateApp(UpdateAppRequest updateAppRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAppRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAppRequest> request = null;
        Response<UpdateAppResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAppRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAppRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApp");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAppResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAppResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a branch for an Amplify App.
     * </p>
     * 
     * @param updateBranchRequest
     *        Request structure for update branch request.
     * @return Result of the UpdateBranch operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.UpdateBranch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateBranch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateBranchResult updateBranch(UpdateBranchRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateBranch(request);
    }

    @SdkInternalApi
    final UpdateBranchResult executeUpdateBranch(UpdateBranchRequest updateBranchRequest) {

        ExecutionContext executionContext = createExecutionContext(updateBranchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBranchRequest> request = null;
        Response<UpdateBranchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBranchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateBranchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateBranch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateBranchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateBranchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new DomainAssociation on an App
     * </p>
     * 
     * @param updateDomainAssociationRequest
     *        Request structure for update Domain Association request.
     * @return Result of the UpdateDomainAssociation operation returned by the service.
     * @throws BadRequestException
     *         Exception thrown when a request contains unexpected data.
     * @throws UnauthorizedException
     *         Exception thrown when an operation fails due to a lack of access.
     * @throws NotFoundException
     *         Exception thrown when an entity has not been found during an operation.
     * @throws InternalFailureException
     *         Exception thrown when the service fails to perform an operation due to an internal issue.
     * @throws DependentServiceFailureException
     *         Exception thrown when an operation fails due to a dependent service throwing an exception.
     * @sample AWSAmplify.UpdateDomainAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/UpdateDomainAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDomainAssociationResult updateDomainAssociation(UpdateDomainAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomainAssociation(request);
    }

    @SdkInternalApi
    final UpdateDomainAssociationResult executeUpdateDomainAssociation(UpdateDomainAssociationRequest updateDomainAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainAssociationRequest> request = null;
        Response<UpdateDomainAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDomainAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Amplify");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDomainAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDomainAssociationResultJsonUnmarshaller());
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
