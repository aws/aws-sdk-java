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
package com.amazonaws.services.prometheus;

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

import com.amazonaws.services.prometheus.AmazonPrometheusClientBuilder;
import com.amazonaws.services.prometheus.waiters.AmazonPrometheusWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.prometheus.model.*;
import com.amazonaws.services.prometheus.model.transform.*;

/**
 * Client for accessing Amazon Prometheus Service. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon Managed Service for Prometheus
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPrometheusClient extends AmazonWebServiceClient implements AmazonPrometheus {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonPrometheus.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "aps";

    private volatile AmazonPrometheusWaiters waiters;

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
                                    com.amazonaws.services.prometheus.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.prometheus.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.prometheus.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.prometheus.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.prometheus.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.prometheus.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.prometheus.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.prometheus.model.AmazonPrometheusException.class));

    public static AmazonPrometheusClientBuilder builder() {
        return AmazonPrometheusClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Prometheus Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPrometheusClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Prometheus Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPrometheusClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("aps.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/prometheus/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/prometheus/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Create an alert manager definition.
     * </p>
     * 
     * @param createAlertManagerDefinitionRequest
     *        Represents the input of a CreateAlertManagerDefinition operation.
     * @return Result of the CreateAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.CreateAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAlertManagerDefinitionResult createAlertManagerDefinition(CreateAlertManagerDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAlertManagerDefinition(request);
    }

    @SdkInternalApi
    final CreateAlertManagerDefinitionResult executeCreateAlertManagerDefinition(CreateAlertManagerDefinitionRequest createAlertManagerDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(createAlertManagerDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAlertManagerDefinitionRequest> request = null;
        Response<CreateAlertManagerDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAlertManagerDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createAlertManagerDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAlertManagerDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAlertManagerDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAlertManagerDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create logging configuration.
     * </p>
     * 
     * @param createLoggingConfigurationRequest
     *        Represents the input of a CreateLoggingConfiguration operation.
     * @return Result of the CreateLoggingConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.CreateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateLoggingConfigurationResult createLoggingConfiguration(CreateLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLoggingConfiguration(request);
    }

    @SdkInternalApi
    final CreateLoggingConfigurationResult executeCreateLoggingConfiguration(CreateLoggingConfigurationRequest createLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLoggingConfigurationRequest> request = null;
        Response<CreateLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a rule group namespace.
     * </p>
     * 
     * @param createRuleGroupsNamespaceRequest
     *        Represents the input of a CreateRuleGroupsNamespace operation.
     * @return Result of the CreateRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.CreateRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateRuleGroupsNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateRuleGroupsNamespaceResult createRuleGroupsNamespace(CreateRuleGroupsNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRuleGroupsNamespace(request);
    }

    @SdkInternalApi
    final CreateRuleGroupsNamespaceResult executeCreateRuleGroupsNamespace(CreateRuleGroupsNamespaceRequest createRuleGroupsNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createRuleGroupsNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleGroupsNamespaceRequest> request = null;
        Response<CreateRuleGroupsNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleGroupsNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createRuleGroupsNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRuleGroupsNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRuleGroupsNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateRuleGroupsNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new AMP workspace.
     * </p>
     * 
     * @param createWorkspaceRequest
     *        Represents the input of a CreateWorkspace operation.
     * @return Result of the CreateWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWorkspaceResult createWorkspace(CreateWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkspace(request);
    }

    @SdkInternalApi
    final CreateWorkspaceResult executeCreateWorkspace(CreateWorkspaceRequest createWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkspaceRequest> request = null;
        Response<CreateWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an alert manager definition.
     * </p>
     * 
     * @param deleteAlertManagerDefinitionRequest
     *        Represents the input of a DeleteAlertManagerDefinition operation.
     * @return Result of the DeleteAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DeleteAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAlertManagerDefinitionResult deleteAlertManagerDefinition(DeleteAlertManagerDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAlertManagerDefinition(request);
    }

    @SdkInternalApi
    final DeleteAlertManagerDefinitionResult executeDeleteAlertManagerDefinition(DeleteAlertManagerDefinitionRequest deleteAlertManagerDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAlertManagerDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAlertManagerDefinitionRequest> request = null;
        Response<DeleteAlertManagerDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAlertManagerDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAlertManagerDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAlertManagerDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAlertManagerDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAlertManagerDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete logging configuration.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     *        Represents the input of a DeleteLoggingConfiguration operation.
     * @return Result of the DeleteLoggingConfiguration operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteLoggingConfigurationResult deleteLoggingConfiguration(DeleteLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLoggingConfiguration(request);
    }

    @SdkInternalApi
    final DeleteLoggingConfigurationResult executeDeleteLoggingConfiguration(DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLoggingConfigurationRequest> request = null;
        Response<DeleteLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a rule groups namespace.
     * </p>
     * 
     * @param deleteRuleGroupsNamespaceRequest
     *        Represents the input of a DeleteRuleGroupsNamespace operation.
     * @return Result of the DeleteRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DeleteRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteRuleGroupsNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteRuleGroupsNamespaceResult deleteRuleGroupsNamespace(DeleteRuleGroupsNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRuleGroupsNamespace(request);
    }

    @SdkInternalApi
    final DeleteRuleGroupsNamespaceResult executeDeleteRuleGroupsNamespace(DeleteRuleGroupsNamespaceRequest deleteRuleGroupsNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRuleGroupsNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleGroupsNamespaceRequest> request = null;
        Response<DeleteRuleGroupsNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleGroupsNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRuleGroupsNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRuleGroupsNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRuleGroupsNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRuleGroupsNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an AMP workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     *        Represents the input of a DeleteWorkspace operation.
     * @return Result of the DeleteWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWorkspaceResult deleteWorkspace(DeleteWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkspace(request);
    }

    @SdkInternalApi
    final DeleteWorkspaceResult executeDeleteWorkspace(DeleteWorkspaceRequest deleteWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkspaceRequest> request = null;
        Response<DeleteWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an alert manager definition.
     * </p>
     * 
     * @param describeAlertManagerDefinitionRequest
     *        Represents the input of a DescribeAlertManagerDefinition operation.
     * @return Result of the DescribeAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DescribeAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeAlertManagerDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAlertManagerDefinitionResult describeAlertManagerDefinition(DescribeAlertManagerDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAlertManagerDefinition(request);
    }

    @SdkInternalApi
    final DescribeAlertManagerDefinitionResult executeDescribeAlertManagerDefinition(DescribeAlertManagerDefinitionRequest describeAlertManagerDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAlertManagerDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlertManagerDefinitionRequest> request = null;
        Response<DescribeAlertManagerDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAlertManagerDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAlertManagerDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAlertManagerDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAlertManagerDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAlertManagerDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes logging configuration.
     * </p>
     * 
     * @param describeLoggingConfigurationRequest
     *        Represents the input of a DescribeLoggingConfiguration operation.
     * @return Result of the DescribeLoggingConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DescribeLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLoggingConfigurationResult describeLoggingConfiguration(DescribeLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoggingConfiguration(request);
    }

    @SdkInternalApi
    final DescribeLoggingConfigurationResult executeDescribeLoggingConfiguration(DescribeLoggingConfigurationRequest describeLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoggingConfigurationRequest> request = null;
        Response<DescribeLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe a rule groups namespace.
     * </p>
     * 
     * @param describeRuleGroupsNamespaceRequest
     *        Represents the input of a DescribeRuleGroupsNamespace operation.
     * @return Result of the DescribeRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DescribeRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeRuleGroupsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRuleGroupsNamespaceResult describeRuleGroupsNamespace(DescribeRuleGroupsNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRuleGroupsNamespace(request);
    }

    @SdkInternalApi
    final DescribeRuleGroupsNamespaceResult executeDescribeRuleGroupsNamespace(DescribeRuleGroupsNamespaceRequest describeRuleGroupsNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRuleGroupsNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRuleGroupsNamespaceRequest> request = null;
        Response<DescribeRuleGroupsNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRuleGroupsNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeRuleGroupsNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRuleGroupsNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRuleGroupsNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRuleGroupsNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an existing AMP workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     *        Represents the input of a DescribeWorkspace operation.
     * @return Result of the DescribeWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.DescribeWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeWorkspaceResult describeWorkspace(DescribeWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspace(request);
    }

    @SdkInternalApi
    final DescribeWorkspaceResult executeDescribeWorkspace(DescribeWorkspaceRequest describeWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceRequest> request = null;
        Response<DescribeWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists rule groups namespaces.
     * </p>
     * 
     * @param listRuleGroupsNamespacesRequest
     *        Represents the input of a ListRuleGroupsNamespaces operation.
     * @return Result of the ListRuleGroupsNamespaces operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.ListRuleGroupsNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListRuleGroupsNamespaces" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListRuleGroupsNamespacesResult listRuleGroupsNamespaces(ListRuleGroupsNamespacesRequest request) {
        request = beforeClientExecution(request);
        return executeListRuleGroupsNamespaces(request);
    }

    @SdkInternalApi
    final ListRuleGroupsNamespacesResult executeListRuleGroupsNamespaces(ListRuleGroupsNamespacesRequest listRuleGroupsNamespacesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRuleGroupsNamespacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRuleGroupsNamespacesRequest> request = null;
        Response<ListRuleGroupsNamespacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRuleGroupsNamespacesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listRuleGroupsNamespacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRuleGroupsNamespaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRuleGroupsNamespacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListRuleGroupsNamespacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
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
     * Lists all AMP workspaces, including workspaces being created or deleted.
     * </p>
     * 
     * @param listWorkspacesRequest
     *        Represents the input of a ListWorkspaces operation.
     * @return Result of the ListWorkspaces operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWorkspacesResult listWorkspaces(ListWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkspaces(request);
    }

    @SdkInternalApi
    final ListWorkspacesResult executeListWorkspaces(ListWorkspacesRequest listWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkspacesRequest> request = null;
        Response<ListWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkspaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update an alert manager definition.
     * </p>
     * 
     * @param putAlertManagerDefinitionRequest
     *        Represents the input of a PutAlertManagerDefinition operation.
     * @return Result of the PutAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.PutAlertManagerDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/PutAlertManagerDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutAlertManagerDefinitionResult putAlertManagerDefinition(PutAlertManagerDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executePutAlertManagerDefinition(request);
    }

    @SdkInternalApi
    final PutAlertManagerDefinitionResult executePutAlertManagerDefinition(PutAlertManagerDefinitionRequest putAlertManagerDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(putAlertManagerDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutAlertManagerDefinitionRequest> request = null;
        Response<PutAlertManagerDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutAlertManagerDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putAlertManagerDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutAlertManagerDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutAlertManagerDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutAlertManagerDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a rule groups namespace.
     * </p>
     * 
     * @param putRuleGroupsNamespaceRequest
     *        Represents the input of a PutRuleGroupsNamespace operation.
     * @return Result of the PutRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.PutRuleGroupsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/PutRuleGroupsNamespace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutRuleGroupsNamespaceResult putRuleGroupsNamespace(PutRuleGroupsNamespaceRequest request) {
        request = beforeClientExecution(request);
        return executePutRuleGroupsNamespace(request);
    }

    @SdkInternalApi
    final PutRuleGroupsNamespaceResult executePutRuleGroupsNamespace(PutRuleGroupsNamespaceRequest putRuleGroupsNamespaceRequest) {

        ExecutionContext executionContext = createExecutionContext(putRuleGroupsNamespaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRuleGroupsNamespaceRequest> request = null;
        Response<PutRuleGroupsNamespaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRuleGroupsNamespaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRuleGroupsNamespaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRuleGroupsNamespace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutRuleGroupsNamespaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutRuleGroupsNamespaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates tags for the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
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
     * Deletes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
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
     * Update logging configuration.
     * </p>
     * 
     * @param updateLoggingConfigurationRequest
     *        Represents the input of an UpdateLoggingConfiguration operation.
     * @return Result of the UpdateLoggingConfiguration operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @sample AmazonPrometheus.UpdateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateLoggingConfigurationResult updateLoggingConfiguration(UpdateLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLoggingConfiguration(request);
    }

    @SdkInternalApi
    final UpdateLoggingConfigurationResult executeUpdateLoggingConfiguration(UpdateLoggingConfigurationRequest updateLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLoggingConfigurationRequest> request = null;
        Response<UpdateLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an AMP workspace alias.
     * </p>
     * 
     * @param updateWorkspaceAliasRequest
     *        Represents the input of an UpdateWorkspaceAlias operation.
     * @return Result of the UpdateWorkspaceAlias operation returned by the service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.UpdateWorkspaceAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/UpdateWorkspaceAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWorkspaceAliasResult updateWorkspaceAlias(UpdateWorkspaceAliasRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkspaceAlias(request);
    }

    @SdkInternalApi
    final UpdateWorkspaceAliasResult executeUpdateWorkspaceAlias(UpdateWorkspaceAliasRequest updateWorkspaceAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkspaceAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkspaceAliasRequest> request = null;
        Response<UpdateWorkspaceAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkspaceAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkspaceAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkspaceAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkspaceAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkspaceAliasResultJsonUnmarshaller());
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
    public AmazonPrometheusWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonPrometheusWaiters(this);
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
