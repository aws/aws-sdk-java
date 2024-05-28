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
 * Amazon Managed Service for Prometheus is a serverless, Prometheus-compatible monitoring service for container metrics
 * that makes it easier to securely monitor container environments at scale. With Amazon Managed Service for Prometheus,
 * you can use the same open-source Prometheus data model and query language that you use today to monitor the
 * performance of your containerized workloads, and also enjoy improved scalability, availability, and security without
 * having to manage the underlying infrastructure.
 * </p>
 * <p>
 * For more information about Amazon Managed Service for Prometheus, see the <a
 * href="https://docs.aws.amazon.com/prometheus/latest/userguide/what-is-Amazon-Managed-Service-Prometheus.html">Amazon
 * Managed Service for Prometheus</a> User Guide.
 * </p>
 * <p>
 * Amazon Managed Service for Prometheus includes two APIs.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the Amazon Web Services API described in this guide to manage Amazon Managed Service for Prometheus resources,
 * such as workspaces, rule groups, and alert managers.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the <a href=
 * "https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-APIReference.html#AMP-APIReference-Prometheus-Compatible-Apis"
 * >Prometheus-compatible API</a> to work within your Prometheus workspace.
 * </p>
 * </li>
 * </ul>
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
     * The <code>CreateAlertManagerDefinition</code> operation creates the alert manager definition in a workspace. If a
     * workspace already has an alert manager definition, don't use this operation to update it. Instead, use
     * <code>PutAlertManagerDefinition</code>.
     * </p>
     * 
     * @param createAlertManagerDefinitionRequest
     *        Represents the input of a <code>CreateAlertManagerDefinition</code> operation.
     * @return Result of the CreateAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
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
     * The <code>CreateLoggingConfiguration</code> operation creates a logging configuration for the workspace. Use this
     * operation to set the CloudWatch log group to which the logs will be published to.
     * </p>
     * 
     * @param createLoggingConfigurationRequest
     *        Represents the input of a <code>CreateLoggingConfiguration</code> operation.
     * @return Result of the CreateLoggingConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * The <code>CreateRuleGroupsNamespace</code> operation creates a rule groups namespace within a workspace. A rule
     * groups namespace is associated with exactly one rules file. A workspace can have multiple rule groups namespaces.
     * </p>
     * <p>
     * Use this operation only to create new rule groups namespaces. To update an existing rule groups namespace, use
     * <code>PutRuleGroupsNamespace</code>.
     * </p>
     * 
     * @param createRuleGroupsNamespaceRequest
     *        Represents the input of a <code>CreateRuleGroupsNamespace</code> operation.
     * @return Result of the CreateRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
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
     * The <code>CreateScraper</code> operation creates a scraper to collect metrics. A scraper pulls metrics from
     * Prometheus-compatible sources within an Amazon EKS cluster, and sends them to your Amazon Managed Service for
     * Prometheus workspace. You can configure the scraper to control what metrics are collected, and what
     * transformations are applied prior to sending them to your workspace.
     * </p>
     * <p>
     * If needed, an IAM role will be created for you that gives Amazon Managed Service for Prometheus access to the
     * metrics in your cluster. For more information, see <a href=
     * "https://docs.aws.amazon.com/prometheus/latest/userguide/using-service-linked-roles.html#using-service-linked-roles-prom-scraper"
     * >Using roles for scraping metrics from EKS</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     * <p>
     * You cannot update a scraper. If you want to change the configuration of the scraper, create a new scraper and
     * delete the old one.
     * </p>
     * <p>
     * The <code>scrapeConfiguration</code> parameter contains the base64-encoded version of the YAML configuration
     * file.
     * </p>
     * <note>
     * <p>
     * For more information about collectors, including what metrics are collected, and how to configure the scraper,
     * see <a href="https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-collector.html">Amazon Web Services
     * managed collectors</a> in the <i>Amazon Managed Service for Prometheus User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createScraperRequest
     *        Represents the input of a <code>CreateScraper</code> operation.
     * @return Result of the CreateScraper operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
     * @sample AmazonPrometheus.CreateScraper
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateScraper" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateScraperResult createScraper(CreateScraperRequest request) {
        request = beforeClientExecution(request);
        return executeCreateScraper(request);
    }

    @SdkInternalApi
    final CreateScraperResult executeCreateScraper(CreateScraperRequest createScraperRequest) {

        ExecutionContext executionContext = createExecutionContext(createScraperRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateScraperRequest> request = null;
        Response<CreateScraperResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateScraperRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createScraperRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateScraper");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateScraperResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateScraperResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Prometheus workspace. A workspace is a logical space dedicated to the storage and querying of
     * Prometheus metrics. You can have one or more workspaces in each Region in your account.
     * </p>
     * 
     * @param createWorkspaceRequest
     *        Represents the input of a <code>CreateWorkspace</code> operation.
     * @return Result of the CreateWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
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
     * Deletes the alert manager definition from a workspace.
     * </p>
     * 
     * @param deleteAlertManagerDefinitionRequest
     *        Represents the input of a <code>DeleteAlertManagerDefinition</code> operation.
     * @return Result of the DeleteAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * Deletes the logging configuration for a workspace.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     *        Represents the input of a <code>DeleteLoggingConfiguration</code> operation.
     * @return Result of the DeleteLoggingConfiguration operation returned by the service.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * Deletes one rule groups namespace and its associated rule groups definition.
     * </p>
     * 
     * @param deleteRuleGroupsNamespaceRequest
     *        Represents the input of a <code>DeleteRuleGroupsNamespace</code> operation.
     * @return Result of the DeleteRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * The <code>DeleteScraper</code> operation deletes one scraper, and stops any metrics collection that the scraper
     * performs.
     * </p>
     * 
     * @param deleteScraperRequest
     *        Represents the input of a <code>DeleteScraper</code> operation.
     * @return Result of the DeleteScraper operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.DeleteScraper
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DeleteScraper" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteScraperResult deleteScraper(DeleteScraperRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteScraper(request);
    }

    @SdkInternalApi
    final DeleteScraperResult executeDeleteScraper(DeleteScraperRequest deleteScraperRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteScraperRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScraperRequest> request = null;
        Response<DeleteScraperResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScraperRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteScraperRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteScraper");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteScraperResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteScraperResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing workspace.
     * </p>
     * <note>
     * <p>
     * When you delete a workspace, the data that has been ingested into it is not immediately deleted. It will be
     * permanently deleted within one month.
     * </p>
     * </note>
     * 
     * @param deleteWorkspaceRequest
     *        Represents the input of a <code>DeleteWorkspace</code> operation.
     * @return Result of the DeleteWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * Retrieves the full information about the alert manager definition for a workspace.
     * </p>
     * 
     * @param describeAlertManagerDefinitionRequest
     *        Represents the input of a <code>DescribeAlertManagerDefinition</code> operation.
     * @return Result of the DescribeAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * Returns complete information about the current logging configuration of the workspace.
     * </p>
     * 
     * @param describeLoggingConfigurationRequest
     *        Represents the input of a <code>DescribeLoggingConfiguration</code> operation.
     * @return Result of the DescribeLoggingConfiguration operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * Returns complete information about one rule groups namespace. To retrieve a list of rule groups namespaces, use
     * <code>ListRuleGroupsNamespaces</code>.
     * </p>
     * 
     * @param describeRuleGroupsNamespaceRequest
     *        Represents the input of a <code>DescribeRuleGroupsNamespace</code> operation.
     * @return Result of the DescribeRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * The <code>DescribeScraper</code> operation displays information about an existing scraper.
     * </p>
     * 
     * @param describeScraperRequest
     *        Represents the input of a <code>DescribeScraper</code> operation.
     * @return Result of the DescribeScraper operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.DescribeScraper
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeScraper" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeScraperResult describeScraper(DescribeScraperRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScraper(request);
    }

    @SdkInternalApi
    final DescribeScraperResult executeDescribeScraper(DescribeScraperRequest describeScraperRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScraperRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScraperRequest> request = null;
        Response<DescribeScraperResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScraperRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeScraperRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScraper");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeScraperResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeScraperResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about an existing workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     *        Represents the input of a <code>DescribeWorkspace</code> operation.
     * @return Result of the DescribeWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * The <code>GetDefaultScraperConfiguration</code> operation returns the default scraper configuration used when
     * Amazon EKS creates a scraper for you.
     * </p>
     * 
     * @param getDefaultScraperConfigurationRequest
     *        Represents the input of a <code>GetDefaultScraperConfiguration</code> operation.
     * @return Result of the GetDefaultScraperConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.GetDefaultScraperConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/GetDefaultScraperConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDefaultScraperConfigurationResult getDefaultScraperConfiguration(GetDefaultScraperConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetDefaultScraperConfiguration(request);
    }

    @SdkInternalApi
    final GetDefaultScraperConfigurationResult executeGetDefaultScraperConfiguration(GetDefaultScraperConfigurationRequest getDefaultScraperConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getDefaultScraperConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDefaultScraperConfigurationRequest> request = null;
        Response<GetDefaultScraperConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDefaultScraperConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDefaultScraperConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDefaultScraperConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDefaultScraperConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDefaultScraperConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of rule groups namespaces in a workspace.
     * </p>
     * 
     * @param listRuleGroupsNamespacesRequest
     *        Represents the input of a <code>ListRuleGroupsNamespaces</code> operation.
     * @return Result of the ListRuleGroupsNamespaces operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * The <code>ListScrapers</code> operation lists all of the scrapers in your account. This includes scrapers being
     * created or deleted. You can optionally filter the returned list.
     * </p>
     * 
     * @param listScrapersRequest
     *        Represents the input of a <code>ListScrapers</code> operation.
     * @return Result of the ListScrapers operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @sample AmazonPrometheus.ListScrapers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ListScrapers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListScrapersResult listScrapers(ListScrapersRequest request) {
        request = beforeClientExecution(request);
        return executeListScrapers(request);
    }

    @SdkInternalApi
    final ListScrapersResult executeListScrapers(ListScrapersRequest listScrapersRequest) {

        ExecutionContext executionContext = createExecutionContext(listScrapersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListScrapersRequest> request = null;
        Response<ListScrapersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListScrapersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listScrapersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "amp");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListScrapers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListScrapersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListScrapersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ListTagsForResource</code> operation returns the tags that are associated with an Amazon Managed
     * Service for Prometheus resource. Currently, the only resources that can be tagged are workspaces and rule groups
     * namespaces.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * Lists all of the Amazon Managed Service for Prometheus workspaces in your account. This includes workspaces being
     * created or deleted.
     * </p>
     * 
     * @param listWorkspacesRequest
     *        Represents the input of a <code>ListWorkspaces</code> operation.
     * @return Result of the ListWorkspaces operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * Updates an existing alert manager definition in a workspace. If the workspace does not already have an alert
     * manager definition, don't use this operation to create it. Instead, use <code>CreateAlertManagerDefinition</code>
     * .
     * </p>
     * 
     * @param putAlertManagerDefinitionRequest
     *        Represents the input of a <code>PutAlertManagerDefinition</code> operation.
     * @return Result of the PutAlertManagerDefinition operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
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
     * Updates an existing rule groups namespace within a workspace. A rule groups namespace is associated with exactly
     * one rules file. A workspace can have multiple rule groups namespaces.
     * </p>
     * <p>
     * Use this operation only to update existing rule groups namespaces. To create a new rule groups namespace, use
     * <code>CreateRuleGroupsNamespace</code>.
     * </p>
     * <p>
     * You can't use this operation to add tags to an existing rule groups namespace. Instead, use
     * <code>TagResource</code>.
     * </p>
     * 
     * @param putRuleGroupsNamespaceRequest
     *        Represents the input of a <code>PutRuleGroupsNamespace</code> operation.
     * @return Result of the PutRuleGroupsNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
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
     * The <code>TagResource</code> operation associates tags with an Amazon Managed Service for Prometheus resource.
     * The only resources that can be tagged are workspaces and rule groups namespaces.
     * </p>
     * <p>
     * If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the
     * resource. If you specify a tag key that is already associated with the resource, the new tag value that you
     * specify replaces the previous value for that tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * Removes the specified tags from an Amazon Managed Service for Prometheus resource. The only resources that can be
     * tagged are workspaces and rule groups namespaces.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * Updates the log group ARN or the workspace ID of the current logging configuration.
     * </p>
     * 
     * @param updateLoggingConfigurationRequest
     *        Represents the input of an <code>UpdateLoggingConfiguration</code> operation.
     * @return Result of the UpdateLoggingConfiguration operation returned by the service.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
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
     * Updates the alias of an existing workspace.
     * </p>
     * 
     * @param updateWorkspaceAliasRequest
     *        Represents the input of an <code>UpdateWorkspaceAlias</code> operation.
     * @return Result of the UpdateWorkspaceAlias operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request would cause an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The request references a resources that doesn't exist.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of the request.
     * @throws ServiceQuotaExceededException
     *         Completing the request would cause a service quota to be exceeded.
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
