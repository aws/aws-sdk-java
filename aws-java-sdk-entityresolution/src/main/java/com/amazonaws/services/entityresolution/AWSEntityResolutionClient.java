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
package com.amazonaws.services.entityresolution;

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

import com.amazonaws.services.entityresolution.AWSEntityResolutionClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.entityresolution.model.*;

import com.amazonaws.services.entityresolution.model.transform.*;

/**
 * Client for accessing AWSEntityResolution. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Welcome to the <i>Entity Resolution API Reference</i>.
 * </p>
 * <p>
 * Entity Resolution is an Amazon Web Services service that provides pre-configured entity resolution capabilities that
 * enable developers and analysts at advertising and marketing companies to build an accurate and complete view of their
 * consumers.
 * </p>
 * <p>
 * With Entity Resolution, you can match source records containing consumer identifiers, such as name, email address,
 * and phone number. This is true even when these records have incomplete or conflicting identifiers. For example,
 * Entity Resolution can effectively match a source record from a customer relationship management (CRM) system with a
 * source record from a marketing system containing campaign information.
 * </p>
 * <p>
 * To learn more about Entity Resolution concepts, procedures, and best practices, see the <a
 * href="https://docs.aws.amazon.com/entityresolution/latest/userguide/what-is-service.html">Entity Resolution User
 * Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSEntityResolutionClient extends AmazonWebServiceClient implements AWSEntityResolution {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSEntityResolution.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "entityresolution";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.entityresolution.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.entityresolution.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.entityresolution.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.entityresolution.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.entityresolution.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.entityresolution.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExceedsLimitException").withExceptionUnmarshaller(
                                    com.amazonaws.services.entityresolution.model.transform.ExceedsLimitExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.entityresolution.model.AWSEntityResolutionException.class));

    public static AWSEntityResolutionClientBuilder builder() {
        return AWSEntityResolutionClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWSEntityResolution using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSEntityResolutionClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWSEntityResolution using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSEntityResolutionClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("entityresolution.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/entityresolution/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/entityresolution/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds a policy statement object. To retrieve a list of existing policy statements, use the <code>GetPolicy</code>
     * API.
     * </p>
     * 
     * @param addPolicyStatementRequest
     * @return Result of the AddPolicyStatement operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.AddPolicyStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/AddPolicyStatement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddPolicyStatementResult addPolicyStatement(AddPolicyStatementRequest request) {
        request = beforeClientExecution(request);
        return executeAddPolicyStatement(request);
    }

    @SdkInternalApi
    final AddPolicyStatementResult executeAddPolicyStatement(AddPolicyStatementRequest addPolicyStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(addPolicyStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddPolicyStatementRequest> request = null;
        Response<AddPolicyStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddPolicyStatementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addPolicyStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddPolicyStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddPolicyStatementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddPolicyStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes multiple unique IDs in a matching workflow.
     * </p>
     * 
     * @param batchDeleteUniqueIdRequest
     * @return Result of the BatchDeleteUniqueId operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.BatchDeleteUniqueId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/BatchDeleteUniqueId"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDeleteUniqueIdResult batchDeleteUniqueId(BatchDeleteUniqueIdRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteUniqueId(request);
    }

    @SdkInternalApi
    final BatchDeleteUniqueIdResult executeBatchDeleteUniqueId(BatchDeleteUniqueIdRequest batchDeleteUniqueIdRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteUniqueIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteUniqueIdRequest> request = null;
        Response<BatchDeleteUniqueIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteUniqueIdRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDeleteUniqueIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteUniqueId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteUniqueIdResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchDeleteUniqueIdResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an <code>IdMappingWorkflow</code> object which stores the configuration of the data processing job to be
     * run. Each <code>IdMappingWorkflow</code> must have a unique workflow name. To modify an existing workflow, use
     * the <code>UpdateIdMappingWorkflow</code> API.
     * </p>
     * 
     * @param createIdMappingWorkflowRequest
     * @return Result of the CreateIdMappingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ExceedsLimitException
     *         The request was rejected because it attempted to create resources beyond the current Entity Resolution
     *         account limits. The error message describes the limit exceeded. <code>HTTP Status Code: 402</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.CreateIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateIdMappingWorkflowResult createIdMappingWorkflow(CreateIdMappingWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIdMappingWorkflow(request);
    }

    @SdkInternalApi
    final CreateIdMappingWorkflowResult executeCreateIdMappingWorkflow(CreateIdMappingWorkflowRequest createIdMappingWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(createIdMappingWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIdMappingWorkflowRequest> request = null;
        Response<CreateIdMappingWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIdMappingWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createIdMappingWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIdMappingWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIdMappingWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateIdMappingWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an ID namespace object which will help customers provide metadata explaining their dataset and how to use
     * it. Each ID namespace must have a unique name. To modify an existing ID namespace, use the
     * <code>UpdateIdNamespace</code> API.
     * </p>
     * 
     * @param createIdNamespaceRequest
     * @return Result of the CreateIdNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ExceedsLimitException
     *         The request was rejected because it attempted to create resources beyond the current Entity Resolution
     *         account limits. The error message describes the limit exceeded. <code>HTTP Status Code: 402</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.CreateIdNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateIdNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateIdNamespaceResult createIdNamespace(CreateIdNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIdNamespace(request);
    }

    @SdkInternalApi
    final CreateIdNamespaceResult executeCreateIdNamespace(CreateIdNamespaceRequest createIdNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createIdNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIdNamespaceRequest> request = null;
        Response<CreateIdNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIdNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIdNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIdNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIdNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIdNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <code>MatchingWorkflow</code> object which stores the configuration of the data processing job to be
     * run. It is important to note that there should not be a pre-existing <code>MatchingWorkflow</code> with the same
     * name. To modify an existing workflow, utilize the <code>UpdateMatchingWorkflow</code> API.
     * </p>
     * 
     * @param createMatchingWorkflowRequest
     * @return Result of the CreateMatchingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ExceedsLimitException
     *         The request was rejected because it attempted to create resources beyond the current Entity Resolution
     *         account limits. The error message describes the limit exceeded. <code>HTTP Status Code: 402</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.CreateMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMatchingWorkflowResult createMatchingWorkflow(CreateMatchingWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMatchingWorkflow(request);
    }

    @SdkInternalApi
    final CreateMatchingWorkflowResult executeCreateMatchingWorkflow(CreateMatchingWorkflowRequest createMatchingWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(createMatchingWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMatchingWorkflowRequest> request = null;
        Response<CreateMatchingWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMatchingWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMatchingWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMatchingWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMatchingWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMatchingWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a schema mapping, which defines the schema of the input customer records table. The
     * <code>SchemaMapping</code> also provides Entity Resolution with some metadata about the table, such as the
     * attribute types of the columns and which columns to match on.
     * </p>
     * 
     * @param createSchemaMappingRequest
     * @return Result of the CreateSchemaMapping operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ExceedsLimitException
     *         The request was rejected because it attempted to create resources beyond the current Entity Resolution
     *         account limits. The error message describes the limit exceeded. <code>HTTP Status Code: 402</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.CreateSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSchemaMappingResult createSchemaMapping(CreateSchemaMappingRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSchemaMapping(request);
    }

    @SdkInternalApi
    final CreateSchemaMappingResult executeCreateSchemaMapping(CreateSchemaMappingRequest createSchemaMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(createSchemaMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSchemaMappingRequest> request = null;
        Response<CreateSchemaMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSchemaMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSchemaMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSchemaMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSchemaMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSchemaMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the <code>IdMappingWorkflow</code> with a given name. This operation will succeed even if a workflow with
     * the given name does not exist.
     * </p>
     * 
     * @param deleteIdMappingWorkflowRequest
     * @return Result of the DeleteIdMappingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.DeleteIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteIdMappingWorkflowResult deleteIdMappingWorkflow(DeleteIdMappingWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIdMappingWorkflow(request);
    }

    @SdkInternalApi
    final DeleteIdMappingWorkflowResult executeDeleteIdMappingWorkflow(DeleteIdMappingWorkflowRequest deleteIdMappingWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIdMappingWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdMappingWorkflowRequest> request = null;
        Response<DeleteIdMappingWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdMappingWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteIdMappingWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIdMappingWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIdMappingWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteIdMappingWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the <code>IdNamespace</code> with a given name.
     * </p>
     * 
     * @param deleteIdNamespaceRequest
     * @return Result of the DeleteIdNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.DeleteIdNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteIdNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteIdNamespaceResult deleteIdNamespace(DeleteIdNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIdNamespace(request);
    }

    @SdkInternalApi
    final DeleteIdNamespaceResult executeDeleteIdNamespace(DeleteIdNamespaceRequest deleteIdNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIdNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdNamespaceRequest> request = null;
        Response<DeleteIdNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIdNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIdNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIdNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIdNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the <code>MatchingWorkflow</code> with a given name. This operation will succeed even if a workflow with
     * the given name does not exist.
     * </p>
     * 
     * @param deleteMatchingWorkflowRequest
     * @return Result of the DeleteMatchingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.DeleteMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMatchingWorkflowResult deleteMatchingWorkflow(DeleteMatchingWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMatchingWorkflow(request);
    }

    @SdkInternalApi
    final DeleteMatchingWorkflowResult executeDeleteMatchingWorkflow(DeleteMatchingWorkflowRequest deleteMatchingWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMatchingWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMatchingWorkflowRequest> request = null;
        Response<DeleteMatchingWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMatchingWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMatchingWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMatchingWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMatchingWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMatchingWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the policy statement.
     * </p>
     * 
     * @param deletePolicyStatementRequest
     * @return Result of the DeletePolicyStatement operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.DeletePolicyStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeletePolicyStatement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePolicyStatementResult deletePolicyStatement(DeletePolicyStatementRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePolicyStatement(request);
    }

    @SdkInternalApi
    final DeletePolicyStatementResult executeDeletePolicyStatement(DeletePolicyStatementRequest deletePolicyStatementRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePolicyStatementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyStatementRequest> request = null;
        Response<DeletePolicyStatementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyStatementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePolicyStatementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePolicyStatement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePolicyStatementResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeletePolicyStatementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the <code>SchemaMapping</code> with a given name. This operation will succeed even if a schema with the
     * given name does not exist. This operation will fail if there is a <code>MatchingWorkflow</code> object that
     * references the <code>SchemaMapping</code> in the workflow's <code>InputSourceConfig</code>.
     * </p>
     * 
     * @param deleteSchemaMappingRequest
     * @return Result of the DeleteSchemaMapping operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.DeleteSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSchemaMappingResult deleteSchemaMapping(DeleteSchemaMappingRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSchemaMapping(request);
    }

    @SdkInternalApi
    final DeleteSchemaMappingResult executeDeleteSchemaMapping(DeleteSchemaMappingRequest deleteSchemaMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSchemaMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSchemaMappingRequest> request = null;
        Response<DeleteSchemaMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSchemaMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSchemaMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSchemaMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSchemaMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSchemaMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the status, metrics, and errors (if there are any) that are associated with a job.
     * </p>
     * 
     * @param getIdMappingJobRequest
     * @return Result of the GetIdMappingJob operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetIdMappingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetIdMappingJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIdMappingJobResult getIdMappingJob(GetIdMappingJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetIdMappingJob(request);
    }

    @SdkInternalApi
    final GetIdMappingJobResult executeGetIdMappingJob(GetIdMappingJobRequest getIdMappingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdMappingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdMappingJobRequest> request = null;
        Response<GetIdMappingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdMappingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIdMappingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIdMappingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIdMappingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIdMappingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <code>IdMappingWorkflow</code> with a given name, if it exists.
     * </p>
     * 
     * @param getIdMappingWorkflowRequest
     * @return Result of the GetIdMappingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIdMappingWorkflowResult getIdMappingWorkflow(GetIdMappingWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeGetIdMappingWorkflow(request);
    }

    @SdkInternalApi
    final GetIdMappingWorkflowResult executeGetIdMappingWorkflow(GetIdMappingWorkflowRequest getIdMappingWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdMappingWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdMappingWorkflowRequest> request = null;
        Response<GetIdMappingWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdMappingWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIdMappingWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIdMappingWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIdMappingWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIdMappingWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <code>IdNamespace</code> with a given name, if it exists.
     * </p>
     * 
     * @param getIdNamespaceRequest
     * @return Result of the GetIdNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetIdNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetIdNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetIdNamespaceResult getIdNamespace(GetIdNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeGetIdNamespace(request);
    }

    @SdkInternalApi
    final GetIdNamespaceResult executeGetIdNamespace(GetIdNamespaceRequest getIdNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdNamespaceRequest> request = null;
        Response<GetIdNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIdNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIdNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIdNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIdNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the corresponding Match ID of a customer record if the record has been processed.
     * </p>
     * 
     * @param getMatchIdRequest
     * @return Result of the GetMatchId operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetMatchId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchId" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetMatchIdResult getMatchId(GetMatchIdRequest request) {
        request = beforeClientExecution(request);
        return executeGetMatchId(request);
    }

    @SdkInternalApi
    final GetMatchIdResult executeGetMatchId(GetMatchIdRequest getMatchIdRequest) {

        ExecutionContext executionContext = createExecutionContext(getMatchIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMatchIdRequest> request = null;
        Response<GetMatchIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMatchIdRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMatchIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMatchId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMatchIdResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMatchIdResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the status, metrics, and errors (if there are any) that are associated with a job.
     * </p>
     * 
     * @param getMatchingJobRequest
     * @return Result of the GetMatchingJob operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetMatchingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchingJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMatchingJobResult getMatchingJob(GetMatchingJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetMatchingJob(request);
    }

    @SdkInternalApi
    final GetMatchingJobResult executeGetMatchingJob(GetMatchingJobRequest getMatchingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getMatchingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMatchingJobRequest> request = null;
        Response<GetMatchingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMatchingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMatchingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMatchingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMatchingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMatchingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <code>MatchingWorkflow</code> with a given name, if it exists.
     * </p>
     * 
     * @param getMatchingWorkflowRequest
     * @return Result of the GetMatchingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMatchingWorkflowResult getMatchingWorkflow(GetMatchingWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeGetMatchingWorkflow(request);
    }

    @SdkInternalApi
    final GetMatchingWorkflowResult executeGetMatchingWorkflow(GetMatchingWorkflowRequest getMatchingWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(getMatchingWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMatchingWorkflowRequest> request = null;
        Response<GetMatchingWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMatchingWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMatchingWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMatchingWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMatchingWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMatchingWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the resource-based policy.
     * </p>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetPolicy(request);
    }

    @SdkInternalApi
    final GetPolicyResult executeGetPolicy(GetPolicyRequest getPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyRequest> request = null;
        Response<GetPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPolicyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the SchemaMapping of a given name.
     * </p>
     * 
     * @param getSchemaMappingRequest
     * @return Result of the GetSchemaMapping operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSchemaMappingResult getSchemaMapping(GetSchemaMappingRequest request) {
        request = beforeClientExecution(request);
        return executeGetSchemaMapping(request);
    }

    @SdkInternalApi
    final GetSchemaMappingResult executeGetSchemaMapping(GetSchemaMappingRequest getSchemaMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(getSchemaMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSchemaMappingRequest> request = null;
        Response<GetSchemaMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSchemaMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSchemaMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSchemaMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSchemaMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSchemaMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all ID mapping jobs for a given workflow.
     * </p>
     * 
     * @param listIdMappingJobsRequest
     * @return Result of the ListIdMappingJobs operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListIdMappingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListIdMappingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIdMappingJobsResult listIdMappingJobs(ListIdMappingJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListIdMappingJobs(request);
    }

    @SdkInternalApi
    final ListIdMappingJobsResult executeListIdMappingJobs(ListIdMappingJobsRequest listIdMappingJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIdMappingJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdMappingJobsRequest> request = null;
        Response<ListIdMappingJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdMappingJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIdMappingJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIdMappingJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIdMappingJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIdMappingJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all the <code>IdMappingWorkflows</code> that have been created for an Amazon Web Services
     * account.
     * </p>
     * 
     * @param listIdMappingWorkflowsRequest
     * @return Result of the ListIdMappingWorkflows operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListIdMappingWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListIdMappingWorkflows"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIdMappingWorkflowsResult listIdMappingWorkflows(ListIdMappingWorkflowsRequest request) {
        request = beforeClientExecution(request);
        return executeListIdMappingWorkflows(request);
    }

    @SdkInternalApi
    final ListIdMappingWorkflowsResult executeListIdMappingWorkflows(ListIdMappingWorkflowsRequest listIdMappingWorkflowsRequest) {

        ExecutionContext executionContext = createExecutionContext(listIdMappingWorkflowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdMappingWorkflowsRequest> request = null;
        Response<ListIdMappingWorkflowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdMappingWorkflowsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIdMappingWorkflowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIdMappingWorkflows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIdMappingWorkflowsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListIdMappingWorkflowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all ID namespaces.
     * </p>
     * 
     * @param listIdNamespacesRequest
     * @return Result of the ListIdNamespaces operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListIdNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListIdNamespaces"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListIdNamespacesResult listIdNamespaces(ListIdNamespacesRequest request) {
        request = beforeClientExecution(request);
        return executeListIdNamespaces(request);
    }

    @SdkInternalApi
    final ListIdNamespacesResult executeListIdNamespaces(ListIdNamespacesRequest listIdNamespacesRequest) {

        ExecutionContext executionContext = createExecutionContext(listIdNamespacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdNamespacesRequest> request = null;
        Response<ListIdNamespacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdNamespacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIdNamespacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIdNamespaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIdNamespacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIdNamespacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all jobs for a given workflow.
     * </p>
     * 
     * @param listMatchingJobsRequest
     * @return Result of the ListMatchingJobs operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListMatchingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListMatchingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMatchingJobsResult listMatchingJobs(ListMatchingJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListMatchingJobs(request);
    }

    @SdkInternalApi
    final ListMatchingJobsResult executeListMatchingJobs(ListMatchingJobsRequest listMatchingJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMatchingJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMatchingJobsRequest> request = null;
        Response<ListMatchingJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMatchingJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMatchingJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMatchingJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMatchingJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMatchingJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all the <code>MatchingWorkflows</code> that have been created for an Amazon Web Services
     * account.
     * </p>
     * 
     * @param listMatchingWorkflowsRequest
     * @return Result of the ListMatchingWorkflows operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListMatchingWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListMatchingWorkflows"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMatchingWorkflowsResult listMatchingWorkflows(ListMatchingWorkflowsRequest request) {
        request = beforeClientExecution(request);
        return executeListMatchingWorkflows(request);
    }

    @SdkInternalApi
    final ListMatchingWorkflowsResult executeListMatchingWorkflows(ListMatchingWorkflowsRequest listMatchingWorkflowsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMatchingWorkflowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMatchingWorkflowsRequest> request = null;
        Response<ListMatchingWorkflowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMatchingWorkflowsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMatchingWorkflowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMatchingWorkflows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMatchingWorkflowsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListMatchingWorkflowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all the <code>ProviderServices</code> that are available in this Amazon Web Services Region.
     * </p>
     * 
     * @param listProviderServicesRequest
     * @return Result of the ListProviderServices operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListProviderServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListProviderServices"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProviderServicesResult listProviderServices(ListProviderServicesRequest request) {
        request = beforeClientExecution(request);
        return executeListProviderServices(request);
    }

    @SdkInternalApi
    final ListProviderServicesResult executeListProviderServices(ListProviderServicesRequest listProviderServicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listProviderServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProviderServicesRequest> request = null;
        Response<ListProviderServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProviderServicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProviderServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProviderServices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProviderServicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProviderServicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all the <code>SchemaMappings</code> that have been created for an Amazon Web Services account.
     * </p>
     * 
     * @param listSchemaMappingsRequest
     * @return Result of the ListSchemaMappings operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListSchemaMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListSchemaMappings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSchemaMappingsResult listSchemaMappings(ListSchemaMappingsRequest request) {
        request = beforeClientExecution(request);
        return executeListSchemaMappings(request);
    }

    @SdkInternalApi
    final ListSchemaMappingsResult executeListSchemaMappings(ListSchemaMappingsRequest listSchemaMappingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSchemaMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchemaMappingsRequest> request = null;
        Response<ListSchemaMappingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchemaMappingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSchemaMappingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSchemaMappings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSchemaMappingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSchemaMappingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the tags associated with an Entity Resolution resource. In Entity Resolution, <code>SchemaMapping</code>
     * , and <code>MatchingWorkflow</code> can be tagged.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
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
     * Updates the resource-based policy.
     * </p>
     * 
     * @param putPolicyRequest
     * @return Result of the PutPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.PutPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/PutPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutPolicyResult putPolicy(PutPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutPolicy(request);
    }

    @SdkInternalApi
    final PutPolicyResult executePutPolicy(PutPolicyRequest putPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPolicyRequest> request = null;
        Response<PutPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutPolicyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the <code>IdMappingJob</code> of a workflow. The workflow must have previously been created using the
     * <code>CreateIdMappingWorkflow</code> endpoint.
     * </p>
     * 
     * @param startIdMappingJobRequest
     * @return Result of the StartIdMappingJob operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ExceedsLimitException
     *         The request was rejected because it attempted to create resources beyond the current Entity Resolution
     *         account limits. The error message describes the limit exceeded. <code>HTTP Status Code: 402</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.StartIdMappingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/StartIdMappingJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartIdMappingJobResult startIdMappingJob(StartIdMappingJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartIdMappingJob(request);
    }

    @SdkInternalApi
    final StartIdMappingJobResult executeStartIdMappingJob(StartIdMappingJobRequest startIdMappingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startIdMappingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartIdMappingJobRequest> request = null;
        Response<StartIdMappingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartIdMappingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startIdMappingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartIdMappingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartIdMappingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartIdMappingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the <code>MatchingJob</code> of a workflow. The workflow must have previously been created using the
     * <code>CreateMatchingWorkflow</code> endpoint.
     * </p>
     * 
     * @param startMatchingJobRequest
     * @return Result of the StartMatchingJob operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ExceedsLimitException
     *         The request was rejected because it attempted to create resources beyond the current Entity Resolution
     *         account limits. The error message describes the limit exceeded. <code>HTTP Status Code: 402</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.StartMatchingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/StartMatchingJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartMatchingJobResult startMatchingJob(StartMatchingJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartMatchingJob(request);
    }

    @SdkInternalApi
    final StartMatchingJobResult executeStartMatchingJob(StartMatchingJobRequest startMatchingJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startMatchingJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMatchingJobRequest> request = null;
        Response<StartMatchingJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMatchingJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startMatchingJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMatchingJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMatchingJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartMatchingJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Entity Resolution resource. Tags can help you
     * organize and categorize your resources. You can also use them to scope user permissions by granting a user
     * permission to access or change only resources with certain tag values. In Entity Resolution,
     * <code>SchemaMapping</code> and <code>MatchingWorkflow</code> can be tagged. Tags don't have any semantic meaning
     * to Amazon Web Services and are interpreted strictly as strings of characters. You can use the
     * <code>TagResource</code> action with a resource that already has tags. If you specify a new tag key, this tag is
     * appended to the list of tags associated with the resource. If you specify a tag key that is already associated
     * with the resource, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/TagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
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
     * Removes one or more tags from the specified Entity Resolution resource. In Entity Resolution,
     * <code>SchemaMapping</code>, and <code>MatchingWorkflow</code> can be tagged.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @sample AWSEntityResolution.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
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
     * Updates an existing <code>IdMappingWorkflow</code>. This method is identical to
     * <code>CreateIdMappingWorkflow</code>, except it uses an HTTP <code>PUT</code> request instead of a
     * <code>POST</code> request, and the <code>IdMappingWorkflow</code> must already exist for the method to succeed.
     * </p>
     * 
     * @param updateIdMappingWorkflowRequest
     * @return Result of the UpdateIdMappingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.UpdateIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateIdMappingWorkflowResult updateIdMappingWorkflow(UpdateIdMappingWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIdMappingWorkflow(request);
    }

    @SdkInternalApi
    final UpdateIdMappingWorkflowResult executeUpdateIdMappingWorkflow(UpdateIdMappingWorkflowRequest updateIdMappingWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIdMappingWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIdMappingWorkflowRequest> request = null;
        Response<UpdateIdMappingWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIdMappingWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateIdMappingWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIdMappingWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIdMappingWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateIdMappingWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing ID namespace.
     * </p>
     * 
     * @param updateIdNamespaceRequest
     * @return Result of the UpdateIdNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.UpdateIdNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateIdNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateIdNamespaceResult updateIdNamespace(UpdateIdNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIdNamespace(request);
    }

    @SdkInternalApi
    final UpdateIdNamespaceResult executeUpdateIdNamespace(UpdateIdNamespaceRequest updateIdNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIdNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIdNamespaceRequest> request = null;
        Response<UpdateIdNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIdNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIdNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIdNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIdNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateIdNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing <code>MatchingWorkflow</code>. This method is identical to
     * <code>CreateMatchingWorkflow</code>, except it uses an HTTP <code>PUT</code> request instead of a
     * <code>POST</code> request, and the <code>MatchingWorkflow</code> must already exist for the method to succeed.
     * </p>
     * 
     * @param updateMatchingWorkflowRequest
     * @return Result of the UpdateMatchingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.UpdateMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMatchingWorkflowResult updateMatchingWorkflow(UpdateMatchingWorkflowRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMatchingWorkflow(request);
    }

    @SdkInternalApi
    final UpdateMatchingWorkflowResult executeUpdateMatchingWorkflow(UpdateMatchingWorkflowRequest updateMatchingWorkflowRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMatchingWorkflowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMatchingWorkflowRequest> request = null;
        Response<UpdateMatchingWorkflowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMatchingWorkflowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMatchingWorkflowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMatchingWorkflow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMatchingWorkflowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateMatchingWorkflowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a schema mapping.
     * </p>
     * <note>
     * <p>
     * A schema is immutable if it is being used by a workflow. Therefore, you can't update a schema mapping if it's
     * associated with a workflow.
     * </p>
     * </note>
     * 
     * @param updateSchemaMappingRequest
     * @return Result of the UpdateSchemaMapping operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.UpdateSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSchemaMappingResult updateSchemaMapping(UpdateSchemaMappingRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSchemaMapping(request);
    }

    @SdkInternalApi
    final UpdateSchemaMappingResult executeUpdateSchemaMapping(UpdateSchemaMappingRequest updateSchemaMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSchemaMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSchemaMappingRequest> request = null;
        Response<UpdateSchemaMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSchemaMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSchemaMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EntityResolution");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSchemaMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSchemaMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSchemaMappingResultJsonUnmarshaller());
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
