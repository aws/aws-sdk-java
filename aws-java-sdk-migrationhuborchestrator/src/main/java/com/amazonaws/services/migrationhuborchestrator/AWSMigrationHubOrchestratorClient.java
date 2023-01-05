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
package com.amazonaws.services.migrationhuborchestrator;

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

import com.amazonaws.services.migrationhuborchestrator.AWSMigrationHubOrchestratorClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.migrationhuborchestrator.model.*;
import com.amazonaws.services.migrationhuborchestrator.model.transform.*;

/**
 * Client for accessing AWS Migration Hub Orchestrator. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <p>
 * This API reference provides descriptions, syntax, and other details about each of the actions and data types for AWS
 * Migration Hub Orchestrator. he topic for each action shows the API request parameters and the response.
 * Alternatively, you can use one of the AWS SDKs to access an API that is tailored to the programming language or
 * platform that you're using.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMigrationHubOrchestratorClient extends AmazonWebServiceClient implements AWSMigrationHubOrchestrator {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMigrationHubOrchestrator.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "migrationhub-orchestrator";

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
                                    com.amazonaws.services.migrationhuborchestrator.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhuborchestrator.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhuborchestrator.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhuborchestrator.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhuborchestrator.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.migrationhuborchestrator.model.AWSMigrationHubOrchestratorException.class));

    public static AWSMigrationHubOrchestratorClientBuilder builder() {
        return AWSMigrationHubOrchestratorClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Migration Hub Orchestrator using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubOrchestratorClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Migration Hub Orchestrator using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubOrchestratorClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("migrationhub-orchestrator.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/migrationhuborchestrator/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/migrationhuborchestrator/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Create a workflow to orchestrate your migrations.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return Result of the CreateWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSMigrationHubOrchestrator.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflow"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a step in the migration workflow.
     * </p>
     * 
     * @param createWorkflowStepRequest
     * @return Result of the CreateWorkflowStep operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSMigrationHubOrchestrator.CreateWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWorkflowStepResult createWorkflowStep(CreateWorkflowStepRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkflowStep(request);
    }

    @SdkInternalApi
    final CreateWorkflowStepResult executeCreateWorkflowStep(CreateWorkflowStepRequest createWorkflowStepRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkflowStepRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkflowStepRequest> request = null;
        Response<CreateWorkflowStepResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkflowStepRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkflowStepRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkflowStep");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkflowStepResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkflowStepResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a step group in a migration workflow.
     * </p>
     * 
     * @param createWorkflowStepGroupRequest
     * @return Result of the CreateWorkflowStepGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSMigrationHubOrchestrator.CreateWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWorkflowStepGroupResult createWorkflowStepGroup(CreateWorkflowStepGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkflowStepGroup(request);
    }

    @SdkInternalApi
    final CreateWorkflowStepGroupResult executeCreateWorkflowStepGroup(CreateWorkflowStepGroupRequest createWorkflowStepGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkflowStepGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkflowStepGroupRequest> request = null;
        Response<CreateWorkflowStepGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkflowStepGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createWorkflowStepGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkflowStepGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkflowStepGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateWorkflowStepGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a migration workflow. You must pause a running workflow in Migration Hub Orchestrator console to delete
     * it.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return Result of the DeleteWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/DeleteWorkflow"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a step in a migration workflow. Pause the workflow to delete a running step.
     * </p>
     * 
     * @param deleteWorkflowStepRequest
     * @return Result of the DeleteWorkflowStep operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.DeleteWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/DeleteWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWorkflowStepResult deleteWorkflowStep(DeleteWorkflowStepRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkflowStep(request);
    }

    @SdkInternalApi
    final DeleteWorkflowStepResult executeDeleteWorkflowStep(DeleteWorkflowStepRequest deleteWorkflowStepRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkflowStepRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkflowStepRequest> request = null;
        Response<DeleteWorkflowStepResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkflowStepRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkflowStepRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkflowStep");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkflowStepResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkflowStepResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a step group in a migration workflow.
     * </p>
     * 
     * @param deleteWorkflowStepGroupRequest
     * @return Result of the DeleteWorkflowStepGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.DeleteWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/DeleteWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWorkflowStepGroupResult deleteWorkflowStepGroup(DeleteWorkflowStepGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkflowStepGroup(request);
    }

    @SdkInternalApi
    final DeleteWorkflowStepGroupResult executeDeleteWorkflowStepGroup(DeleteWorkflowStepGroupRequest deleteWorkflowStepGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkflowStepGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkflowStepGroupRequest> request = null;
        Response<DeleteWorkflowStepGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkflowStepGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteWorkflowStepGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkflowStepGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkflowStepGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteWorkflowStepGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the template you want to use for creating a migration workflow.
     * </p>
     * 
     * @param getTemplateRequest
     * @return Result of the GetTemplate operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTemplateResult getTemplate(GetTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetTemplate(request);
    }

    @SdkInternalApi
    final GetTemplateResult executeGetTemplate(GetTemplateRequest getTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTemplateRequest> request = null;
        Response<GetTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a specific step in a template.
     * </p>
     * 
     * @param getTemplateStepRequest
     * @return Result of the GetTemplateStep operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.GetTemplateStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplateStep"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTemplateStepResult getTemplateStep(GetTemplateStepRequest request) {
        request = beforeClientExecution(request);
        return executeGetTemplateStep(request);
    }

    @SdkInternalApi
    final GetTemplateStepResult executeGetTemplateStep(GetTemplateStepRequest getTemplateStepRequest) {

        ExecutionContext executionContext = createExecutionContext(getTemplateStepRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTemplateStepRequest> request = null;
        Response<GetTemplateStepResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTemplateStepRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTemplateStepRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTemplateStep");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTemplateStepResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTemplateStepResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a step group in a template.
     * </p>
     * 
     * @param getTemplateStepGroupRequest
     * @return Result of the GetTemplateStepGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.GetTemplateStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplateStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTemplateStepGroupResult getTemplateStepGroup(GetTemplateStepGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetTemplateStepGroup(request);
    }

    @SdkInternalApi
    final GetTemplateStepGroupResult executeGetTemplateStepGroup(GetTemplateStepGroupRequest getTemplateStepGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getTemplateStepGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTemplateStepGroupRequest> request = null;
        Response<GetTemplateStepGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTemplateStepGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTemplateStepGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTemplateStepGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTemplateStepGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTemplateStepGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get migration workflow.
     * </p>
     * 
     * @param getWorkflowRequest
     * @return Result of the GetWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.GetWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflow"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a step in the migration workflow.
     * </p>
     * 
     * @param getWorkflowStepRequest
     * @return Result of the GetWorkflowStep operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.GetWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetWorkflowStepResult getWorkflowStep(GetWorkflowStepRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorkflowStep(request);
    }

    @SdkInternalApi
    final GetWorkflowStepResult executeGetWorkflowStep(GetWorkflowStepRequest getWorkflowStepRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorkflowStepRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkflowStepRequest> request = null;
        Response<GetWorkflowStepResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkflowStepRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorkflowStepRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorkflowStep");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkflowStepResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkflowStepResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the step group of a migration workflow.
     * </p>
     * 
     * @param getWorkflowStepGroupRequest
     * @return Result of the GetWorkflowStepGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.GetWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetWorkflowStepGroupResult getWorkflowStepGroup(GetWorkflowStepGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorkflowStepGroup(request);
    }

    @SdkInternalApi
    final GetWorkflowStepGroupResult executeGetWorkflowStepGroup(GetWorkflowStepGroupRequest getWorkflowStepGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorkflowStepGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkflowStepGroupRequest> request = null;
        Response<GetWorkflowStepGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkflowStepGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorkflowStepGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorkflowStepGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkflowStepGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkflowStepGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List AWS Migration Hub Orchestrator plugins.
     * </p>
     * 
     * @param listPluginsRequest
     * @return Result of the ListPlugins operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSMigrationHubOrchestrator.ListPlugins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListPlugins"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPluginsResult listPlugins(ListPluginsRequest request) {
        request = beforeClientExecution(request);
        return executeListPlugins(request);
    }

    @SdkInternalApi
    final ListPluginsResult executeListPlugins(ListPluginsRequest listPluginsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPluginsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPluginsRequest> request = null;
        Response<ListPluginsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPluginsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPluginsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPlugins");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPluginsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPluginsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the tags added to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
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
     * List the step groups in a template.
     * </p>
     * 
     * @param listTemplateStepGroupsRequest
     * @return Result of the ListTemplateStepGroups operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.ListTemplateStepGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplateStepGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTemplateStepGroupsResult listTemplateStepGroups(ListTemplateStepGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplateStepGroups(request);
    }

    @SdkInternalApi
    final ListTemplateStepGroupsResult executeListTemplateStepGroups(ListTemplateStepGroupsRequest listTemplateStepGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplateStepGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplateStepGroupsRequest> request = null;
        Response<ListTemplateStepGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplateStepGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTemplateStepGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplateStepGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTemplateStepGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTemplateStepGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the steps in a template.
     * </p>
     * 
     * @param listTemplateStepsRequest
     * @return Result of the ListTemplateSteps operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.ListTemplateSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplateSteps"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTemplateStepsResult listTemplateSteps(ListTemplateStepsRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplateSteps(request);
    }

    @SdkInternalApi
    final ListTemplateStepsResult executeListTemplateSteps(ListTemplateStepsRequest listTemplateStepsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplateStepsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplateStepsRequest> request = null;
        Response<ListTemplateStepsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplateStepsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTemplateStepsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplateSteps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTemplateStepsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTemplateStepsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the templates available in Migration Hub Orchestrator to create a migration workflow.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return Result of the ListTemplates operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSMigrationHubOrchestrator.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTemplatesResult listTemplates(ListTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplates(request);
    }

    @SdkInternalApi
    final ListTemplatesResult executeListTemplates(ListTemplatesRequest listTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplatesRequest> request = null;
        Response<ListTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the step groups in a migration workflow.
     * </p>
     * 
     * @param listWorkflowStepGroupsRequest
     * @return Result of the ListWorkflowStepGroups operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.ListWorkflowStepGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflowStepGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWorkflowStepGroupsResult listWorkflowStepGroups(ListWorkflowStepGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkflowStepGroups(request);
    }

    @SdkInternalApi
    final ListWorkflowStepGroupsResult executeListWorkflowStepGroups(ListWorkflowStepGroupsRequest listWorkflowStepGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkflowStepGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkflowStepGroupsRequest> request = null;
        Response<ListWorkflowStepGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkflowStepGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkflowStepGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkflowStepGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkflowStepGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListWorkflowStepGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the steps in a workflow.
     * </p>
     * 
     * @param listWorkflowStepsRequest
     * @return Result of the ListWorkflowSteps operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSMigrationHubOrchestrator.ListWorkflowSteps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflowSteps"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWorkflowStepsResult listWorkflowSteps(ListWorkflowStepsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkflowSteps(request);
    }

    @SdkInternalApi
    final ListWorkflowStepsResult executeListWorkflowSteps(ListWorkflowStepsRequest listWorkflowStepsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkflowStepsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkflowStepsRequest> request = null;
        Response<ListWorkflowStepsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkflowStepsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkflowStepsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkflowSteps");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkflowStepsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkflowStepsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the migration workflows.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return Result of the ListWorkflows operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/ListWorkflows"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkflows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkflowsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkflowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retry a failed step in a migration workflow.
     * </p>
     * 
     * @param retryWorkflowStepRequest
     * @return Result of the RetryWorkflowStep operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.RetryWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/RetryWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RetryWorkflowStepResult retryWorkflowStep(RetryWorkflowStepRequest request) {
        request = beforeClientExecution(request);
        return executeRetryWorkflowStep(request);
    }

    @SdkInternalApi
    final RetryWorkflowStepResult executeRetryWorkflowStep(RetryWorkflowStepRequest retryWorkflowStepRequest) {

        ExecutionContext executionContext = createExecutionContext(retryWorkflowStepRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetryWorkflowStepRequest> request = null;
        Response<RetryWorkflowStepResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetryWorkflowStepRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(retryWorkflowStepRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RetryWorkflowStep");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RetryWorkflowStepResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RetryWorkflowStepResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Start a migration workflow.
     * </p>
     * 
     * @param startWorkflowRequest
     * @return Result of the StartWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.StartWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/StartWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartWorkflowResult startWorkflow(StartWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeStartWorkflow(request);
    }

    @SdkInternalApi
    final StartWorkflowResult executeStartWorkflow(StartWorkflowRequest startWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(startWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartWorkflowRequest> request = null;
        Response<StartWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stop an ongoing migration workflow.
     * </p>
     * 
     * @param stopWorkflowRequest
     * @return Result of the StopWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.StopWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/StopWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopWorkflowResult stopWorkflow(StopWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeStopWorkflow(request);
    }

    @SdkInternalApi
    final StopWorkflowResult executeStopWorkflow(StopWorkflowRequest stopWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(stopWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopWorkflowRequest> request = null;
        Response<StopWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tag a resource by specifying its Amazon Resource Name (ARN).
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/TagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
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
     * Deletes the tags for a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UntagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
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
     * Update a migration workflow.
     * </p>
     * 
     * @param updateWorkflowRequest
     * @return Result of the UpdateWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.UpdateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflow"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a step in a migration workflow.
     * </p>
     * 
     * @param updateWorkflowStepRequest
     * @return Result of the UpdateWorkflowStep operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSMigrationHubOrchestrator.UpdateWorkflowStep
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflowStep"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateWorkflowStepResult updateWorkflowStep(UpdateWorkflowStepRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkflowStep(request);
    }

    @SdkInternalApi
    final UpdateWorkflowStepResult executeUpdateWorkflowStep(UpdateWorkflowStepRequest updateWorkflowStepRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkflowStepRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkflowStepRequest> request = null;
        Response<UpdateWorkflowStepResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkflowStepRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkflowStepRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkflowStep");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkflowStepResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkflowStepResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the step group in a migration workflow.
     * </p>
     * 
     * @param updateWorkflowStepGroupRequest
     * @return Result of the UpdateWorkflowStepGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The resource is not available.
     * @sample AWSMigrationHubOrchestrator.UpdateWorkflowStepGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflowStepGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateWorkflowStepGroupResult updateWorkflowStepGroup(UpdateWorkflowStepGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkflowStepGroup(request);
    }

    @SdkInternalApi
    final UpdateWorkflowStepGroupResult executeUpdateWorkflowStepGroup(UpdateWorkflowStepGroupRequest updateWorkflowStepGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkflowStepGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkflowStepGroupRequest> request = null;
        Response<UpdateWorkflowStepGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkflowStepGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateWorkflowStepGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MigrationHubOrchestrator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkflowStepGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkflowStepGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateWorkflowStepGroupResultJsonUnmarshaller());
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
