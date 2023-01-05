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
package com.amazonaws.services.route53recoverycontrolconfig;

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

import com.amazonaws.services.route53recoverycontrolconfig.AWSRoute53RecoveryControlConfigClientBuilder;
import com.amazonaws.services.route53recoverycontrolconfig.waiters.AWSRoute53RecoveryControlConfigWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.route53recoverycontrolconfig.model.*;
import com.amazonaws.services.route53recoverycontrolconfig.model.transform.*;

/**
 * Client for accessing AWS Route53 Recovery Control Config. All service calls made using this client are blocking, and
 * will not return until the service call completes.
 * <p>
 * <p>
 * Recovery Control Configuration API Reference for Amazon Route 53 Application Recovery Controller
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRoute53RecoveryControlConfigClient extends AmazonWebServiceClient implements AWSRoute53RecoveryControlConfig {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSRoute53RecoveryControlConfig.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "route53-recovery-control-config";

    private volatile AWSRoute53RecoveryControlConfigWaiters waiters;

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
                                    com.amazonaws.services.route53recoverycontrolconfig.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoverycontrolconfig.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoverycontrolconfig.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoverycontrolconfig.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoverycontrolconfig.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException")
                                    .withExceptionUnmarshaller(
                                            com.amazonaws.services.route53recoverycontrolconfig.model.transform.ServiceQuotaExceededExceptionUnmarshaller
                                                    .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53recoverycontrolconfig.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.route53recoverycontrolconfig.model.AWSRoute53RecoveryControlConfigException.class));

    public static AWSRoute53RecoveryControlConfigClientBuilder builder() {
        return AWSRoute53RecoveryControlConfigClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Route53 Recovery Control Config using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRoute53RecoveryControlConfigClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Route53 Recovery Control Config using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSRoute53RecoveryControlConfigClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("route53-recovery-control-config.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/route53recoverycontrolconfig/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/route53recoverycontrolconfig/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Create a new cluster. A cluster is a set of redundant Regional endpoints against which you can run API calls to
     * update or get the state of one or more routing controls. Each cluster has a name, status, Amazon Resource Name
     * (ARN), and an array of the five cluster endpoints (one for each supported Amazon Web Services Region) that you
     * can use with API calls to the cluster data plane.
     * </p>
     * 
     * @param createClusterRequest
     *        Creates a cluster.
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws ServiceQuotaExceededException
     *         402 response
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateCluster"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateClusterResult createCluster(CreateClusterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCluster(request);
    }

    @SdkInternalApi
    final CreateClusterResult executeCreateCluster(CreateClusterRequest createClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(createClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterRequest> request = null;
        Response<CreateClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new control panel. A control panel represents a group of routing controls that can be changed together
     * in a single transaction. You can use a control panel to centrally view the operational status of applications
     * across your organization, and trigger multi-app failovers in a single transaction, for example, to fail over an
     * Availability Zone or Amazon Web Services Region.
     * </p>
     * 
     * @param createControlPanelRequest
     *        The details of the control panel that you're creating.
     * @return Result of the CreateControlPanel operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws ServiceQuotaExceededException
     *         402 response
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.CreateControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateControlPanelResult createControlPanel(CreateControlPanelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateControlPanel(request);
    }

    @SdkInternalApi
    final CreateControlPanelResult executeCreateControlPanel(CreateControlPanelRequest createControlPanelRequest) {

        ExecutionContext executionContext = createExecutionContext(createControlPanelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateControlPanelRequest> request = null;
        Response<CreateControlPanelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateControlPanelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createControlPanelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateControlPanel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateControlPanelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateControlPanelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new routing control.
     * </p>
     * <p>
     * A routing control has one of two states: ON and OFF. You can map the routing control state to the state of an
     * Amazon Route 53 health check, which can be used to control traffic routing.
     * </p>
     * <p>
     * To get or update the routing control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53
     * Application Recovery Controller.
     * </p>
     * 
     * @param createRoutingControlRequest
     *        The details of the routing control that you're creating.
     * @return Result of the CreateRoutingControl operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws ServiceQuotaExceededException
     *         402 response
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.CreateRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRoutingControlResult createRoutingControl(CreateRoutingControlRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRoutingControl(request);
    }

    @SdkInternalApi
    final CreateRoutingControlResult executeCreateRoutingControl(CreateRoutingControlRequest createRoutingControlRequest) {

        ExecutionContext executionContext = createExecutionContext(createRoutingControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRoutingControlRequest> request = null;
        Response<CreateRoutingControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRoutingControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRoutingControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRoutingControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRoutingControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRoutingControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a safety rule in a control panel. Safety rules let you add safeguards around changing routing control
     * states, and for enabling and disabling routing controls, to help prevent unexpected outcomes.
     * </p>
     * <p>
     * There are two types of safety rules: assertion rules and gating rules.
     * </p>
     * <p>
     * Assertion rule: An assertion rule enforces that, when you change a routing control state, that a certain criteria
     * is met. For example, the criteria might be that at least one routing control state is On after the transaction so
     * that traffic continues to flow to at least one cell for the application. This ensures that you avoid a fail-open
     * scenario.
     * </p>
     * <p>
     * Gating rule: A gating rule lets you configure a gating routing control as an overall "on/off" switch for a group
     * of routing controls. Or, you can configure more complex gating scenarios, for example by configuring multiple
     * gating routing controls.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.safety-rules.html">Safety rules</a> in
     * the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param createSafetyRuleRequest
     *        The request body that you include when you create a safety rule.
     * @return Result of the CreateSafetyRule operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.CreateSafetyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSafetyRuleResult createSafetyRule(CreateSafetyRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSafetyRule(request);
    }

    @SdkInternalApi
    final CreateSafetyRuleResult executeCreateSafetyRule(CreateSafetyRuleRequest createSafetyRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createSafetyRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSafetyRuleRequest> request = null;
        Response<CreateSafetyRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSafetyRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSafetyRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSafetyRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSafetyRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSafetyRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a cluster.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteCluster"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteClusterResult deleteCluster(DeleteClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCluster(request);
    }

    @SdkInternalApi
    final DeleteClusterResult executeDeleteCluster(DeleteClusterRequest deleteClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterRequest> request = null;
        Response<DeleteClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a control panel.
     * </p>
     * 
     * @param deleteControlPanelRequest
     * @return Result of the DeleteControlPanel operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.DeleteControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteControlPanelResult deleteControlPanel(DeleteControlPanelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteControlPanel(request);
    }

    @SdkInternalApi
    final DeleteControlPanelResult executeDeleteControlPanel(DeleteControlPanelRequest deleteControlPanelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteControlPanelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteControlPanelRequest> request = null;
        Response<DeleteControlPanelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteControlPanelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteControlPanelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteControlPanel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteControlPanelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteControlPanelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a routing control.
     * </p>
     * 
     * @param deleteRoutingControlRequest
     * @return Result of the DeleteRoutingControl operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.DeleteRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRoutingControlResult deleteRoutingControl(DeleteRoutingControlRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRoutingControl(request);
    }

    @SdkInternalApi
    final DeleteRoutingControlResult executeDeleteRoutingControl(DeleteRoutingControlRequest deleteRoutingControlRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRoutingControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRoutingControlRequest> request = null;
        Response<DeleteRoutingControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoutingControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRoutingControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRoutingControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRoutingControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRoutingControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a safety rule.
     * </p>
     * /&gt;
     * 
     * @param deleteSafetyRuleRequest
     * @return Result of the DeleteSafetyRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.DeleteSafetyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSafetyRuleResult deleteSafetyRule(DeleteSafetyRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSafetyRule(request);
    }

    @SdkInternalApi
    final DeleteSafetyRuleResult executeDeleteSafetyRule(DeleteSafetyRuleRequest deleteSafetyRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSafetyRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSafetyRuleRequest> request = null;
        Response<DeleteSafetyRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSafetyRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSafetyRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSafetyRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSafetyRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSafetyRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Display the details about a cluster. The response includes the cluster name, endpoints, status, and Amazon
     * Resource Name (ARN).
     * </p>
     * 
     * @param describeClusterRequest
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeCluster"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeClusterResult describeCluster(DescribeClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCluster(request);
    }

    @SdkInternalApi
    final DescribeClusterResult executeDescribeCluster(DescribeClusterRequest describeClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterRequest> request = null;
        Response<DescribeClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays details about a control panel.
     * </p>
     * 
     * @param describeControlPanelRequest
     * @return Result of the DescribeControlPanel operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.DescribeControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeControlPanelResult describeControlPanel(DescribeControlPanelRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeControlPanel(request);
    }

    @SdkInternalApi
    final DescribeControlPanelResult executeDescribeControlPanel(DescribeControlPanelRequest describeControlPanelRequest) {

        ExecutionContext executionContext = createExecutionContext(describeControlPanelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeControlPanelRequest> request = null;
        Response<DescribeControlPanelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeControlPanelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeControlPanelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeControlPanel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeControlPanelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeControlPanelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays details about a routing control. A routing control has one of two states: ON and OFF. You can map the
     * routing control state to the state of an Amazon Route 53 health check, which can be used to control routing.
     * </p>
     * <p>
     * To get or update the routing control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53
     * Application Recovery Controller.
     * </p>
     * 
     * @param describeRoutingControlRequest
     * @return Result of the DescribeRoutingControl operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.DescribeRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRoutingControlResult describeRoutingControl(DescribeRoutingControlRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRoutingControl(request);
    }

    @SdkInternalApi
    final DescribeRoutingControlResult executeDescribeRoutingControl(DescribeRoutingControlRequest describeRoutingControlRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRoutingControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRoutingControlRequest> request = null;
        Response<DescribeRoutingControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRoutingControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRoutingControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRoutingControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRoutingControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeRoutingControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a safety rule.
     * </p>
     * 
     * @param describeSafetyRuleRequest
     * @return Result of the DescribeSafetyRule operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @sample AWSRoute53RecoveryControlConfig.DescribeSafetyRule
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSafetyRuleResult describeSafetyRule(DescribeSafetyRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSafetyRule(request);
    }

    @SdkInternalApi
    final DescribeSafetyRuleResult executeDescribeSafetyRule(DescribeSafetyRuleRequest describeSafetyRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSafetyRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSafetyRuleRequest> request = null;
        Response<DescribeSafetyRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSafetyRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSafetyRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSafetyRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSafetyRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSafetyRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of all Amazon Route 53 health checks associated with a specific routing control.
     * </p>
     * 
     * @param listAssociatedRoute53HealthChecksRequest
     * @return Result of the ListAssociatedRoute53HealthChecks operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.ListAssociatedRoute53HealthChecks
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListAssociatedRoute53HealthChecks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssociatedRoute53HealthChecksResult listAssociatedRoute53HealthChecks(ListAssociatedRoute53HealthChecksRequest request) {
        request = beforeClientExecution(request);
        return executeListAssociatedRoute53HealthChecks(request);
    }

    @SdkInternalApi
    final ListAssociatedRoute53HealthChecksResult executeListAssociatedRoute53HealthChecks(
            ListAssociatedRoute53HealthChecksRequest listAssociatedRoute53HealthChecksRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssociatedRoute53HealthChecksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociatedRoute53HealthChecksRequest> request = null;
        Response<ListAssociatedRoute53HealthChecksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociatedRoute53HealthChecksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAssociatedRoute53HealthChecksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssociatedRoute53HealthChecks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssociatedRoute53HealthChecksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAssociatedRoute53HealthChecksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of all the clusters in an account.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryControlConfig.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListClusters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListClustersResult listClusters(ListClustersRequest request) {
        request = beforeClientExecution(request);
        return executeListClusters(request);
    }

    @SdkInternalApi
    final ListClustersResult executeListClusters(ListClustersRequest listClustersRequest) {

        ExecutionContext executionContext = createExecutionContext(listClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClustersRequest> request = null;
        Response<ListClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClustersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListClusters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListClustersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListClustersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of control panels in an account or in a cluster.
     * </p>
     * 
     * @param listControlPanelsRequest
     * @return Result of the ListControlPanels operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryControlConfig.ListControlPanels
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListControlPanels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListControlPanelsResult listControlPanels(ListControlPanelsRequest request) {
        request = beforeClientExecution(request);
        return executeListControlPanels(request);
    }

    @SdkInternalApi
    final ListControlPanelsResult executeListControlPanels(ListControlPanelsRequest listControlPanelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listControlPanelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListControlPanelsRequest> request = null;
        Response<ListControlPanelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListControlPanelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listControlPanelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListControlPanels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListControlPanelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListControlPanelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of routing controls for a control panel. A routing control is an Amazon Route 53 Application
     * Recovery Controller construct that has one of two states: ON and OFF. You can map the routing control state to
     * the state of an Amazon Route 53 health check, which can be used to control routing.
     * </p>
     * 
     * @param listRoutingControlsRequest
     * @return Result of the ListRoutingControls operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryControlConfig.ListRoutingControls
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListRoutingControls"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRoutingControlsResult listRoutingControls(ListRoutingControlsRequest request) {
        request = beforeClientExecution(request);
        return executeListRoutingControls(request);
    }

    @SdkInternalApi
    final ListRoutingControlsResult executeListRoutingControls(ListRoutingControlsRequest listRoutingControlsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRoutingControlsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRoutingControlsRequest> request = null;
        Response<ListRoutingControlsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRoutingControlsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRoutingControlsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRoutingControls");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRoutingControlsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRoutingControlsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the safety rules (the assertion rules and gating rules) that you've defined for the routing controls in a
     * control panel.
     * </p>
     * 
     * @param listSafetyRulesRequest
     * @return Result of the ListSafetyRules operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryControlConfig.ListSafetyRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListSafetyRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSafetyRulesResult listSafetyRules(ListSafetyRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListSafetyRules(request);
    }

    @SdkInternalApi
    final ListSafetyRulesResult executeListSafetyRules(ListSafetyRulesRequest listSafetyRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSafetyRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSafetyRulesRequest> request = null;
        Response<ListSafetyRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSafetyRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSafetyRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSafetyRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSafetyRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSafetyRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.ListTagsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
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
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        Request of adding tag to the resource
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/TagResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
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
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UntagResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
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
     * Updates a control panel. The only update you can make to a control panel is to change the name of the control
     * panel.
     * </p>
     * 
     * @param updateControlPanelRequest
     *        The details of the control panel that you're updating.
     * @return Result of the UpdateControlPanel operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.UpdateControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateControlPanelResult updateControlPanel(UpdateControlPanelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateControlPanel(request);
    }

    @SdkInternalApi
    final UpdateControlPanelResult executeUpdateControlPanel(UpdateControlPanelRequest updateControlPanelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateControlPanelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateControlPanelRequest> request = null;
        Response<UpdateControlPanelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateControlPanelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateControlPanelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateControlPanel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateControlPanelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateControlPanelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a routing control. You can only update the name of the routing control. To get or update the routing
     * control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53 Application Recovery
     * Controller.
     * </p>
     * 
     * @param updateRoutingControlRequest
     *        The details of the routing control that you're updating.
     * @return Result of the UpdateRoutingControl operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.UpdateRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRoutingControlResult updateRoutingControl(UpdateRoutingControlRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoutingControl(request);
    }

    @SdkInternalApi
    final UpdateRoutingControlResult executeUpdateRoutingControl(UpdateRoutingControlRequest updateRoutingControlRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoutingControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoutingControlRequest> request = null;
        Response<UpdateRoutingControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoutingControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRoutingControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoutingControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRoutingControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRoutingControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a safety rule (an assertion rule or gating rule). You can only update the name and the waiting period for
     * a safety rule. To make other updates, delete the safety rule and create a new one.
     * </p>
     * 
     * @param updateSafetyRuleRequest
     *        A rule that you add to Application Recovery Controller to ensure that recovery actions don't accidentally
     *        impair your application's availability.
     * @return Result of the UpdateSafetyRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.UpdateSafetyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSafetyRuleResult updateSafetyRule(UpdateSafetyRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSafetyRule(request);
    }

    @SdkInternalApi
    final UpdateSafetyRuleResult executeUpdateSafetyRule(UpdateSafetyRuleRequest updateSafetyRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSafetyRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSafetyRuleRequest> request = null;
        Response<UpdateSafetyRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSafetyRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSafetyRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53 Recovery Control Config");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSafetyRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSafetyRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSafetyRuleResultJsonUnmarshaller());
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
    public AWSRoute53RecoveryControlConfigWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSRoute53RecoveryControlConfigWaiters(this);
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
