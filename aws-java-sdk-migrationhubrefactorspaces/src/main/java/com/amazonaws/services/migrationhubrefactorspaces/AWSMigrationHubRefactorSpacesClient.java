/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubrefactorspaces;

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

import com.amazonaws.services.migrationhubrefactorspaces.AWSMigrationHubRefactorSpacesClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.migrationhubrefactorspaces.model.*;
import com.amazonaws.services.migrationhubrefactorspaces.model.transform.*;

/**
 * Client for accessing AWS Migration Hub Refactor Spaces. All service calls made using this client are blocking, and
 * will not return until the service call completes.
 * <p>
 * <p>
 * <fullname>Amazon Web Services Migration Hub Refactor Spaces</fullname>
 * </p>
 * 
 * <pre>
 * <code> &lt;p&gt;This API reference provides descriptions, syntax, and other details about each of the actions and data types for Amazon Web Services Migration Hub Refactor Spaces (Refactor Spaces). The topic for each action shows the API request parameters and the response. Alternatively, you can use one of the Amazon Web Services SDKs to access an API that is tailored to the programming language or platform that you're using. For more information, see &lt;a href=&quot;https://aws.amazon.com/tools/#SDKs&quot;&gt;Amazon Web Services SDKs&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;To share Refactor Spaces environments with other Amazon Web Services accounts or with Organizations and their OUs, use Resource Access Manager's &lt;code&gt;CreateResourceShare&lt;/code&gt; API. See &lt;a href=&quot;https://docs.aws.amazon.com/ram/latest/APIReference/API_CreateResourceShare.html&quot;&gt;CreateResourceShare&lt;/a&gt; in the &lt;i&gt;Amazon Web Services RAM API Reference&lt;/i&gt;.&lt;/p&gt; </code>
 * </pre>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMigrationHubRefactorSpacesClient extends AmazonWebServiceClient implements AWSMigrationHubRefactorSpaces {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMigrationHubRefactorSpaces.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "refactor-spaces";

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
                                    com.amazonaws.services.migrationhubrefactorspaces.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubrefactorspaces.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubrefactorspaces.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubrefactorspaces.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubrefactorspaces.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubrefactorspaces.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubrefactorspaces.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourcePolicyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.migrationhubrefactorspaces.model.transform.InvalidResourcePolicyExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.migrationhubrefactorspaces.model.AWSMigrationHubRefactorSpacesException.class));

    public static AWSMigrationHubRefactorSpacesClientBuilder builder() {
        return AWSMigrationHubRefactorSpacesClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Migration Hub Refactor Spaces using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubRefactorSpacesClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Migration Hub Refactor Spaces using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubRefactorSpacesClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("refactor-spaces.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/migrationhubrefactorspaces/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/migrationhubrefactorspaces/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an Amazon Web Services Migration Hub Refactor Spaces application. The account that owns the environment
     * also owns the applications created inside the environment, regardless of the account that creates the
     * application. Refactor Spaces provisions an Amazon API Gateway, API Gateway VPC link, and Network Load Balancer
     * for the application proxy inside your account.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplication(request);
    }

    @SdkInternalApi
    final CreateApplicationResult executeCreateApplication(CreateApplicationRequest createApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Web Services Migration Hub Refactor Spaces environment. The caller owns the environment
     * resource, and all Refactor Spaces applications, services, and routes created within the environment. They are
     * referred to as the <i>environment owner</i>. The environment owner has cross-account visibility and control of
     * Refactor Spaces resources that are added to the environment by other accounts that the environment is shared
     * with. When creating an environment, Refactor Spaces provisions a transit gateway in your account.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateEnvironment"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Web Services Migration Hub Refactor Spaces route. The account owner of the service resource is
     * always the environment owner, regardless of which account creates the route. Routes target a service in the
     * application. If an application does not have any routes, then the first route must be created as a
     * <code>DEFAULT</code> <code>RouteType</code>.
     * </p>
     * <p>
     * When created, the default route defaults to an active state so state is not a required input. However, like all
     * other state values the state of the default route can be updated after creation, but only when all other routes
     * are also inactive. Conversely, no route can be active without the default route also being active.
     * </p>
     * <p>
     * When you create a route, Refactor Spaces configures the Amazon API Gateway to send traffic to the target service
     * as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the service has a URL endpoint, and the endpoint resolves to a private IP address, Refactor Spaces routes
     * traffic using the API Gateway VPC link.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service has a URL endpoint, and the endpoint resolves to a public IP address, Refactor Spaces routes
     * traffic over the public internet.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service has an Lambda function endpoint, then Refactor Spaces configures the Lambda function's resource
     * policy to allow the application's API Gateway to invoke the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A one-time health check is performed on the service when either the route is updated from inactive to active, or
     * when it is created with an active state. If the health check fails, the route transitions the route state to
     * <code>FAILED</code>, an error code of <code>SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE</code> is provided, and no
     * traffic is sent to the service.
     * </p>
     * <p>
     * For Lambda functions, the Lambda function state is checked. If the function is not active, the function
     * configuration is updated so that Lambda resources are provisioned. If the Lambda state is <code>Failed</code>,
     * then the route creation fails. For more information, see the <a href=
     * "https://docs.aws.amazon.com/lambda/latest/dg/API_GetFunctionConfiguration.html#SSS-GetFunctionConfiguration-response-State"
     * >GetFunctionConfiguration's State response parameter</a> in the <i>Lambda Developer Guide</i>.
     * </p>
     * <p>
     * For Lambda endpoints, a check is performed to determine that a Lambda function with the specified ARN exists. If
     * it does not exist, the health check fails. For public URLs, a connection is opened to the public endpoint. If the
     * URL is not reachable, the health check fails.
     * </p>
     * <p>
     * For private URLS, a target group is created on the Elastic Load Balancing and the target group health check is
     * run. The <code>HealthCheckProtocol</code>, <code>HealthCheckPort</code>, and <code>HealthCheckPath</code> are the
     * same protocol, port, and path specified in the URL or health URL, if used. All other settings use the default
     * values, as described in <a
     * href="https://docs.aws.amazon.com/elasticloadbalancing/latest/application/target-group-health-checks.html">Health
     * checks for your target groups</a>. The health check is considered successful if at least one target within the
     * target group transitions to a healthy state.
     * </p>
     * <p>
     * Services can have HTTP or HTTPS URL endpoints. For HTTPS URLs, publicly-signed certificates are supported.
     * Private Certificate Authorities (CAs) are permitted only if the CA's domain is also publicly resolvable.
     * </p>
     * 
     * @param createRouteRequest
     * @return Result of the CreateRoute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateRoute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRouteResult createRoute(CreateRouteRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRoute(request);
    }

    @SdkInternalApi
    final CreateRouteResult executeCreateRoute(CreateRouteRequest createRouteRequest) {

        ExecutionContext executionContext = createExecutionContext(createRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRouteRequest> request = null;
        Response<CreateRouteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRouteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRouteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRoute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRouteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRouteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Web Services Migration Hub Refactor Spaces service. The account owner of the service is always
     * the environment owner, regardless of which account in the environment creates the service. Services have either a
     * URL endpoint in a virtual private cloud (VPC), or a Lambda function endpoint.
     * </p>
     * <important>
     * <p>
     * If an Amazon Web Services resource is launched in a service VPC, and you want it to be accessible to all of an
     * environment’s services with VPCs and routes, apply the <code>RefactorSpacesSecurityGroup</code> to the resource.
     * Alternatively, to add more cross-account constraints, apply your own security group.
     * </p>
     * </important>
     * 
     * @param createServiceRequest
     * @return Result of the CreateService operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateService"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateServiceResult createService(CreateServiceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateService(request);
    }

    @SdkInternalApi
    final CreateServiceResult executeCreateService(CreateServiceRequest createServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceRequest> request = null;
        Response<CreateServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces application. Before you can delete an application,
     * you must first delete any services or routes within the application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplication(request);
    }

    @SdkInternalApi
    final DeleteApplicationResult executeDeleteApplication(DeleteApplicationRequest deleteApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<DeleteApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces environment. Before you can delete an environment,
     * you must first delete any applications and services within the environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteEnvironment"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the resource policy set for the environment.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.DeleteResourcePolicy
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourcePolicy(request);
    }

    @SdkInternalApi
    final DeleteResourcePolicyResult executeDeleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePolicyRequest> request = null;
        Response<DeleteResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @return Result of the DeleteRoute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.DeleteRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteRoute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRouteResult deleteRoute(DeleteRouteRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRoute(request);
    }

    @SdkInternalApi
    final DeleteRouteResult executeDeleteRoute(DeleteRouteRequest deleteRouteRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRouteRequest> request = null;
        Response<DeleteRouteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRouteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRouteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRoute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRouteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRouteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Web Services Migration Hub Refactor Spaces service.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return Result of the DeleteService operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteService"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteServiceResult deleteService(DeleteServiceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteService(request);
    }

    @SdkInternalApi
    final DeleteServiceResult executeDeleteService(DeleteServiceRequest deleteServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceRequest> request = null;
        Response<DeleteServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApplicationResult getApplication(GetApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplication(request);
    }

    @SdkInternalApi
    final GetApplicationResult executeGetApplication(GetApplicationRequest getApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRequest> request = null;
        Response<GetApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetEnvironment"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the resource-based permission policy that is set for the given environment.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourcePolicy(request);
    }

    @SdkInternalApi
    final GetResourcePolicyResult executeGetResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcePolicyRequest> request = null;
        Response<GetResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces route.
     * </p>
     * 
     * @param getRouteRequest
     * @return Result of the GetRoute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.GetRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetRoute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRouteResult getRoute(GetRouteRequest request) {
        request = beforeClientExecution(request);
        return executeGetRoute(request);
    }

    @SdkInternalApi
    final GetRouteResult executeGetRoute(GetRouteRequest getRouteRequest) {

        ExecutionContext executionContext = createExecutionContext(getRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRouteRequest> request = null;
        Response<GetRouteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRouteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRouteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRoute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRouteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRouteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an Amazon Web Services Migration Hub Refactor Spaces service.
     * </p>
     * 
     * @param getServiceRequest
     * @return Result of the GetService operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetService"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServiceResult getService(GetServiceRequest request) {
        request = beforeClientExecution(request);
        return executeGetService(request);
    }

    @SdkInternalApi
    final GetServiceResult executeGetService(GetServiceRequest getServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceRequest> request = null;
        Response<GetServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the Amazon Web Services Migration Hub Refactor Spaces applications within an environment.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplications(request);
    }

    @SdkInternalApi
    final ListApplicationsResult executeListApplications(ListApplicationsRequest listApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Amazon Web Services Migration Hub Refactor Spaces service virtual private clouds (VPCs) that are part
     * of the environment.
     * </p>
     * 
     * @param listEnvironmentVpcsRequest
     * @return Result of the ListEnvironmentVpcs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.ListEnvironmentVpcs
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListEnvironmentVpcs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEnvironmentVpcsResult listEnvironmentVpcs(ListEnvironmentVpcsRequest request) {
        request = beforeClientExecution(request);
        return executeListEnvironmentVpcs(request);
    }

    @SdkInternalApi
    final ListEnvironmentVpcsResult executeListEnvironmentVpcs(ListEnvironmentVpcsRequest listEnvironmentVpcsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnvironmentVpcsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnvironmentVpcsRequest> request = null;
        Response<ListEnvironmentVpcsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnvironmentVpcsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEnvironmentVpcsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnvironmentVpcs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnvironmentVpcsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEnvironmentVpcsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists Amazon Web Services Migration Hub Refactor Spaces environments owned by a caller account or shared with the
     * caller account.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListEnvironments"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnvironments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnvironmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEnvironmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the Amazon Web Services Migration Hub Refactor Spaces routes within an application.
     * </p>
     * 
     * @param listRoutesRequest
     * @return Result of the ListRoutes operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.ListRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRoutesResult listRoutes(ListRoutesRequest request) {
        request = beforeClientExecution(request);
        return executeListRoutes(request);
    }

    @SdkInternalApi
    final ListRoutesResult executeListRoutes(ListRoutesRequest listRoutesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRoutesRequest> request = null;
        Response<ListRoutesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRoutesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRoutesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRoutes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRoutesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRoutesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the Amazon Web Services Migration Hub Refactor Spaces services within an application.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListServices"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServicesResult listServices(ListServicesRequest request) {
        request = beforeClientExecution(request);
        return executeListServices(request);
    }

    @SdkInternalApi
    final ListServicesResult executeListServices(ListServicesRequest listServicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServicesRequest> request = null;
        Response<ListServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags of a resource. The caller account must be the same as the resource’s <code>OwnerAccountId</code>.
     * Listing tags in other accounts is not supported.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @sample AWSMigrationHubRefactorSpaces.ListTagsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
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
     * Attaches a resource-based permission policy to the Amazon Web Services Migration Hub Refactor Spaces environment.
     * The policy must contain the same actions and condition statements as the
     * <code>arn:aws:ram::aws:permission/AWSRAMDefaultPermissionRefactorSpacesEnvironment</code> permission in Resource
     * Access Manager. The policy must not contain new lines or blank lines.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws InvalidResourcePolicyException
     *         The resource policy is not valid.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutResourcePolicy(request);
    }

    @SdkInternalApi
    final PutResourcePolicyResult executePutResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourcePolicyRequest> request = null;
        Response<PutResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the tags of a given resource. Tags are metadata which can be used to manage a resource. To tag a
     * resource, the caller account must be the same as the resource’s <code>OwnerAccountId</code>. Tagging resources in
     * other accounts is not supported.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services Migration Hub Refactor Spaces does not propagate tags to orchestrated resources, such as an
     * environment’s transit gateway.
     * </p>
     * </note>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @sample AWSMigrationHubRefactorSpaces.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/TagResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
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
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource. To
     * untag a resource, the caller account must be the same as the resource’s <code>OwnerAccountId</code>. Untagging
     * resources across accounts is not supported.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @sample AWSMigrationHubRefactorSpaces.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/UntagResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
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
     * Updates an Amazon Web Services Migration Hub Refactor Spaces route.
     * </p>
     * 
     * @param updateRouteRequest
     * @return Result of the UpdateRoute operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws InternalServerException
     *         An unexpected error occurred while processing the request.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         Request was denied because the request was throttled.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @sample AWSMigrationHubRefactorSpaces.UpdateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/UpdateRoute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRouteResult updateRoute(UpdateRouteRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoute(request);
    }

    @SdkInternalApi
    final UpdateRouteResult executeUpdateRoute(UpdateRouteRequest updateRouteRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRouteRequest> request = null;
        Response<UpdateRouteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRouteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRouteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub Refactor Spaces");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRouteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRouteResultJsonUnmarshaller());
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
