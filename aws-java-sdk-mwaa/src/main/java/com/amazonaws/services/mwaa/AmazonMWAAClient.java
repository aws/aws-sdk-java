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
package com.amazonaws.services.mwaa;

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

import com.amazonaws.services.mwaa.AmazonMWAAClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mwaa.model.*;
import com.amazonaws.services.mwaa.model.transform.*;

/**
 * Client for accessing AmazonMWAA. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * <fullname>Amazon Managed Workflows for Apache Airflow</fullname>
 * <p>
 * This section contains the Amazon Managed Workflows for Apache Airflow (MWAA) API reference documentation. For more
 * information, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/what-is-mwaa.html">What Is Amazon
 * MWAA?</a>.
 * </p>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMWAAClient extends AmazonWebServiceClient implements AmazonMWAA {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonMWAA.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "airflow";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mwaa.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mwaa.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mwaa.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mwaa.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mwaa.model.AmazonMWAAException.class));

    public static AmazonMWAAClientBuilder builder() {
        return AmazonMWAAClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonMWAA using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMWAAClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonMWAA using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMWAAClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("airflow.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mwaa/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mwaa/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Create a CLI token to use Airflow CLI.
     * </p>
     * 
     * @param createCliTokenRequest
     * @return Result of the CreateCliToken operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @sample AmazonMWAA.CreateCliToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateCliToken" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateCliTokenResult createCliToken(CreateCliTokenRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCliToken(request);
    }

    @SdkInternalApi
    final CreateCliTokenResult executeCreateCliToken(CreateCliTokenRequest createCliTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(createCliTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCliTokenRequest> request = null;
        Response<CreateCliTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCliTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCliTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MWAA");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCliToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "env.";
                String resolvedHostPrefix = String.format("env.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCliTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCliTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param createEnvironmentRequest
     *        This section contains the Amazon Managed Workflows for Apache Airflow (MWAA) API reference documentation
     *        to create an environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/get-started.html">Get started with Amazon Managed
     *        Workflows for Apache Airflow</a>.
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEnvironment(request);
    }

    @SdkInternalApi
    final CreateEnvironmentResult executeCreateEnvironment(CreateEnvironmentRequest createEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEnvironmentRequest> request = null;
        Response<CreateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MWAA");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a JWT token to be used to login to Airflow Web UI with claims based Authentication.
     * </p>
     * 
     * @param createWebLoginTokenRequest
     * @return Result of the CreateWebLoginToken operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the Airflow Web UI or CLI has been Denied. Please follow the MWAA user guide to setup
     *         permissions to access the Web UI and CLI functionality.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.CreateWebLoginToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateWebLoginToken" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWebLoginTokenResult createWebLoginToken(CreateWebLoginTokenRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWebLoginToken(request);
    }

    @SdkInternalApi
    final CreateWebLoginTokenResult executeCreateWebLoginToken(CreateWebLoginTokenRequest createWebLoginTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(createWebLoginTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWebLoginTokenRequest> request = null;
        Response<CreateWebLoginTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWebLoginTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWebLoginTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MWAA");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWebLoginToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "env.";
                String resolvedHostPrefix = String.format("env.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWebLoginTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWebLoginTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEnvironment(request);
    }

    @SdkInternalApi
    final DeleteEnvironmentResult executeDeleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentRequest> request = null;
        Response<DeleteEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MWAA");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details of an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEnvironmentResult getEnvironment(GetEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnvironment(request);
    }

    @SdkInternalApi
    final GetEnvironmentResult executeGetEnvironment(GetEnvironmentRequest getEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnvironmentRequest> request = null;
        Response<GetEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MWAA");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Amazon Managed Workflows for Apache Airflow (MWAA) environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListEnvironments(request);
    }

    @SdkInternalApi
    final ListEnvironmentsResult executeListEnvironments(ListEnvironmentsRequest listEnvironmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnvironmentsRequest> request = null;
        Response<ListEnvironmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnvironmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEnvironmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MWAA");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnvironments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnvironmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEnvironmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the key-value tag pairs associated to the Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * For example, <code>"Environment": "Staging"</code>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MWAA");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

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
     * An operation for publishing metrics from the customers to the Ops plane.
     * </p>
     * 
     * @param publishMetricsRequest
     * @return Result of the PublishMetrics operation returned by the service.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.PublishMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/PublishMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PublishMetricsResult publishMetrics(PublishMetricsRequest request) {
        request = beforeClientExecution(request);
        return executePublishMetrics(request);
    }

    @SdkInternalApi
    final PublishMetricsResult executePublishMetrics(PublishMetricsRequest publishMetricsRequest) {

        ExecutionContext executionContext = createExecutionContext(publishMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishMetricsRequest> request = null;
        Response<PublishMetricsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PublishMetricsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(publishMetricsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MWAA");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PublishMetrics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "ops.";
                String resolvedHostPrefix = String.format("ops.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PublishMetricsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PublishMetricsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates key-value tag pairs to your Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MWAA");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

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
     * Removes key-value tag pairs associated to your Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * For example, <code>"Environment": "Staging"</code>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MWAA");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

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
     * Updates an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnvironment(request);
    }

    @SdkInternalApi
    final UpdateEnvironmentResult executeUpdateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnvironmentRequest> request = null;
        Response<UpdateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MWAA");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "api.";
                String resolvedHostPrefix = String.format("api.");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEnvironmentResultJsonUnmarshaller());
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
    public void shutdown() {
        super.shutdown();
    }

}
