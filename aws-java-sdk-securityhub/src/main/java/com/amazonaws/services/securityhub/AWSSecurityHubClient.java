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
package com.amazonaws.services.securityhub;

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

import com.amazonaws.services.securityhub.AWSSecurityHubClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.services.securityhub.model.transform.*;

/**
 * Client for accessing AWS SecurityHub. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Security Hub provides you with a comprehensive view of your security state in Amazon Web Services and helps you
 * assess your Amazon Web Services environment against security industry standards and best practices.
 * </p>
 * <p>
 * Security Hub collects security data across Amazon Web Services accounts, Amazon Web Services, and supported
 * third-party products and helps you analyze your security trends and identify the highest priority security issues.
 * </p>
 * <p>
 * To help you manage the security state of your organization, Security Hub supports multiple security standards. These
 * include the Amazon Web Services Foundational Security Best Practices (FSBP) standard developed by Amazon Web
 * Services, and external compliance frameworks such as the Center for Internet Security (CIS), the Payment Card
 * Industry Data Security Standard (PCI DSS), and the National Institute of Standards and Technology (NIST). Each
 * standard includes several security controls, each of which represents a security best practice. Security Hub runs
 * checks against security controls and generates control findings to help you assess your compliance against security
 * best practices.
 * </p>
 * <p>
 * In addition to generating control findings, Security Hub also receives findings from other Amazon Web Services, such
 * as Amazon GuardDuty and Amazon Inspector, and supported third-party products. This gives you a single pane of glass
 * into a variety of security-related issues. You can also send Security Hub findings to other Amazon Web Services and
 * supported third-party products.
 * </p>
 * <p>
 * Security Hub offers automation features that help you triage and remediate security issues. For example, you can use
 * automation rules to automatically update critical findings when a security check fails. You can also leverage the
 * integration with Amazon EventBridge to trigger automatic responses to specific findings.
 * </p>
 * <p>
 * This guide, the <i>Security Hub API Reference</i>, provides information about the Security Hub API. This includes
 * supported resources, HTTP methods, parameters, and schemas. If you're new to Security Hub, you might find it helpful
 * to also review the <a href="https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html">
 * <i>Security Hub User Guide</i> </a>. The user guide explains key concepts and provides procedures that demonstrate
 * how to use Security Hub features. It also provides information about topics such as integrating Security Hub with
 * other Amazon Web Services.
 * </p>
 * <p>
 * In addition to interacting with Security Hub by making calls to the Security Hub API, you can use a current version
 * of an Amazon Web Services command line tool or SDK. Amazon Web Services provides tools and SDKs that consist of
 * libraries and sample code for various languages and platforms, such as PowerShell, Java, Go, Python, C++, and .NET.
 * These tools and SDKs provide convenient, programmatic access to Security Hub and other Amazon Web Services . They
 * also handle tasks such as signing requests, managing errors, and retrying requests automatically. For information
 * about installing and using the Amazon Web Services tools and SDKs, see <a
 * href="http://aws.amazon.com/developer/tools/">Tools to Build on Amazon Web Services</a>.
 * </p>
 * <p>
 * With the exception of operations that are related to central configuration, Security Hub API requests are executed
 * only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that
 * you specify in your request. Any configuration or settings change that results from the operation is applied only to
 * that Region. To make the same change in other Regions, call the same API operation in each Region in which you want
 * to apply the change. When you use central configuration, API requests for enabling Security Hub, standards, and
 * controls are executed in the home Region and all linked Regions. For a list of central configuration operations, see
 * the <a href=
 * "https://docs.aws.amazon.com/securityhub/latest/userguide/central-configuration-intro.html#central-configuration-concepts"
 * >Central configuration terms and concepts</a> section of the <i>Security Hub User Guide</i>.
 * </p>
 * <p>
 * The following throttling limits apply to Security Hub API operations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1
 * request per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per
 * second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30
 * requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30
 * requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5
 * requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per
 * second.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSecurityHubClient extends AmazonWebServiceClient implements AWSSecurityHub {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSecurityHub.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "securityhub";

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
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securityhub.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securityhub.model.transform.InvalidInputExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securityhub.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securityhub.model.transform.InternalExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securityhub.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAccessException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securityhub.model.transform.InvalidAccessExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securityhub.model.transform.ResourceConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.securityhub.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.securityhub.model.AWSSecurityHubException.class));

    public static AWSSecurityHubClientBuilder builder() {
        return AWSSecurityHubClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS SecurityHub using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSecurityHubClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS SecurityHub using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSecurityHubClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("securityhub.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/securityhub/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/securityhub/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the
     * invitation was sent from.
     * </p>
     * <p>
     * This operation is only used by member accounts that are not added through Organizations.
     * </p>
     * <p>
     * When the member account accepts the invitation, permission is granted to the administrator account to view
     * findings generated in the member account.
     * </p>
     * 
     * @param acceptAdministratorInvitationRequest
     * @return Result of the AcceptAdministratorInvitation operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @sample AWSSecurityHub.AcceptAdministratorInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptAdministratorInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AcceptAdministratorInvitationResult acceptAdministratorInvitation(AcceptAdministratorInvitationRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptAdministratorInvitation(request);
    }

    @SdkInternalApi
    final AcceptAdministratorInvitationResult executeAcceptAdministratorInvitation(AcceptAdministratorInvitationRequest acceptAdministratorInvitationRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptAdministratorInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptAdministratorInvitationRequest> request = null;
        Response<AcceptAdministratorInvitationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptAdministratorInvitationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acceptAdministratorInvitationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptAdministratorInvitation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptAdministratorInvitationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AcceptAdministratorInvitationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This method is deprecated. Instead, use <code>AcceptAdministratorInvitation</code>.
     * </p>
     * <p>
     * The Security Hub console continues to use <code>AcceptInvitation</code>. It will eventually change to use
     * <code>AcceptAdministratorInvitation</code>. Any IAM policies that specifically control access to this function
     * must continue to use <code>AcceptInvitation</code>. You should also add
     * <code>AcceptAdministratorInvitation</code> to your policies to ensure that the correct permissions are in place
     * after the console begins to use <code>AcceptAdministratorInvitation</code>.
     * </p>
     * <p>
     * Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the
     * invitation was sent from.
     * </p>
     * <p>
     * This operation is only used by member accounts that are not added through Organizations.
     * </p>
     * <p>
     * When the member account accepts the invitation, permission is granted to the administrator account to view
     * findings generated in the member account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return Result of the AcceptInvitation operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @sample AWSSecurityHub.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptInvitation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    @Deprecated
    public AcceptInvitationResult acceptInvitation(AcceptInvitationRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptInvitation(request);
    }

    @SdkInternalApi
    final AcceptInvitationResult executeAcceptInvitation(AcceptInvitationRequest acceptInvitationRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptInvitationRequest> request = null;
        Response<AcceptInvitationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptInvitationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(acceptInvitationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptInvitation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptInvitationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AcceptInvitationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes one or more automation rules.
     * </p>
     * 
     * @param batchDeleteAutomationRulesRequest
     * @return Result of the BatchDeleteAutomationRules operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.BatchDeleteAutomationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDeleteAutomationRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDeleteAutomationRulesResult batchDeleteAutomationRules(BatchDeleteAutomationRulesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteAutomationRules(request);
    }

    @SdkInternalApi
    final BatchDeleteAutomationRulesResult executeBatchDeleteAutomationRules(BatchDeleteAutomationRulesRequest batchDeleteAutomationRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteAutomationRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteAutomationRulesRequest> request = null;
        Response<BatchDeleteAutomationRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteAutomationRulesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchDeleteAutomationRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteAutomationRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteAutomationRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchDeleteAutomationRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the standards specified by the provided <code>StandardsSubscriptionArns</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html">Security Standards</a>
     * section of the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchDisableStandardsRequest
     * @return Result of the BatchDisableStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.BatchDisableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDisableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDisableStandardsResult batchDisableStandards(BatchDisableStandardsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDisableStandards(request);
    }

    @SdkInternalApi
    final BatchDisableStandardsResult executeBatchDisableStandards(BatchDisableStandardsRequest batchDisableStandardsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDisableStandardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDisableStandardsRequest> request = null;
        Response<BatchDisableStandardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDisableStandardsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchDisableStandardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDisableStandards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDisableStandardsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchDisableStandardsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the standards specified by the provided <code>StandardsArn</code>. To obtain the ARN for a standard, use
     * the <code>DescribeStandards</code> operation.
     * </p>
     * <p>
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html">Security Standards</a>
     * section of the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchEnableStandardsRequest
     * @return Result of the BatchEnableStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.BatchEnableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchEnableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchEnableStandardsResult batchEnableStandards(BatchEnableStandardsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchEnableStandards(request);
    }

    @SdkInternalApi
    final BatchEnableStandardsResult executeBatchEnableStandards(BatchEnableStandardsRequest batchEnableStandardsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchEnableStandardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchEnableStandardsRequest> request = null;
        Response<BatchEnableStandardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchEnableStandardsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchEnableStandardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchEnableStandards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchEnableStandardsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchEnableStandardsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of details for automation rules based on rule Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param batchGetAutomationRulesRequest
     * @return Result of the BatchGetAutomationRules operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.BatchGetAutomationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetAutomationRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetAutomationRulesResult batchGetAutomationRules(BatchGetAutomationRulesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetAutomationRules(request);
    }

    @SdkInternalApi
    final BatchGetAutomationRulesResult executeBatchGetAutomationRules(BatchGetAutomationRulesRequest batchGetAutomationRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetAutomationRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetAutomationRulesRequest> request = null;
        Response<BatchGetAutomationRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetAutomationRulesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetAutomationRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetAutomationRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetAutomationRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetAutomationRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns associations between an Security Hub configuration and a batch of target accounts, organizational units,
     * or the root. Only the Security Hub delegated administrator can invoke this operation from the home Region. A
     * configuration can refer to a configuration policy or to a self-managed configuration.
     * </p>
     * 
     * @param batchGetConfigurationPolicyAssociationsRequest
     * @return Result of the BatchGetConfigurationPolicyAssociations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.BatchGetConfigurationPolicyAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetConfigurationPolicyAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetConfigurationPolicyAssociationsResult batchGetConfigurationPolicyAssociations(BatchGetConfigurationPolicyAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetConfigurationPolicyAssociations(request);
    }

    @SdkInternalApi
    final BatchGetConfigurationPolicyAssociationsResult executeBatchGetConfigurationPolicyAssociations(
            BatchGetConfigurationPolicyAssociationsRequest batchGetConfigurationPolicyAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetConfigurationPolicyAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetConfigurationPolicyAssociationsRequest> request = null;
        Response<BatchGetConfigurationPolicyAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetConfigurationPolicyAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetConfigurationPolicyAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetConfigurationPolicyAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetConfigurationPolicyAssociationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchGetConfigurationPolicyAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides details about a batch of security controls for the current Amazon Web Services account and Amazon Web
     * Services Region.
     * </p>
     * 
     * @param batchGetSecurityControlsRequest
     * @return Result of the BatchGetSecurityControls operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @sample AWSSecurityHub.BatchGetSecurityControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetSecurityControls"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetSecurityControlsResult batchGetSecurityControls(BatchGetSecurityControlsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetSecurityControls(request);
    }

    @SdkInternalApi
    final BatchGetSecurityControlsResult executeBatchGetSecurityControls(BatchGetSecurityControlsRequest batchGetSecurityControlsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetSecurityControlsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetSecurityControlsRequest> request = null;
        Response<BatchGetSecurityControlsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetSecurityControlsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetSecurityControlsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetSecurityControls");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetSecurityControlsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetSecurityControlsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For a batch of security controls and standards, identifies whether each control is currently enabled or disabled
     * in a standard.
     * </p>
     * 
     * @param batchGetStandardsControlAssociationsRequest
     * @return Result of the BatchGetStandardsControlAssociations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @sample AWSSecurityHub.BatchGetStandardsControlAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetStandardsControlAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetStandardsControlAssociationsResult batchGetStandardsControlAssociations(BatchGetStandardsControlAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetStandardsControlAssociations(request);
    }

    @SdkInternalApi
    final BatchGetStandardsControlAssociationsResult executeBatchGetStandardsControlAssociations(
            BatchGetStandardsControlAssociationsRequest batchGetStandardsControlAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetStandardsControlAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetStandardsControlAssociationsRequest> request = null;
        Response<BatchGetStandardsControlAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetStandardsControlAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetStandardsControlAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetStandardsControlAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetStandardsControlAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetStandardsControlAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports security findings generated by a finding provider into Security Hub. This action is requested by the
     * finding provider to import its findings into Security Hub.
     * </p>
     * <p>
     * <code>BatchImportFindings</code> must be called by one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon Web Services account that is associated with a finding if you are using the <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-custom-providers.html#securityhub-custom-providers-bfi-reqs"
     * >default product ARN</a> or are a partner sending findings from within a customer's Amazon Web Services account.
     * In these cases, the identifier of the account that you are calling <code>BatchImportFindings</code> from needs to
     * be the same as the <code>AwsAccountId</code> attribute for the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Web Services account that Security Hub has allow-listed for an official partner integration. In this
     * case, you can call <code>BatchImportFindings</code> from the allow-listed account and send findings from
     * different customer accounts in the same batch.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The maximum allowed size for a finding is 240 Kb. An error is returned for any finding larger than 240 Kb.
     * </p>
     * <p>
     * After a finding is created, <code>BatchImportFindings</code> cannot be used to update the following finding
     * fields and objects, which Security Hub customers use to manage their investigation workflow.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Finding providers also should not use <code>BatchImportFindings</code> to update the following attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Instead, finding providers use <code>FindingProviderFields</code> to provide values for these attributes.
     * </p>
     * 
     * @param batchImportFindingsRequest
     * @return Result of the BatchImportFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @sample AWSSecurityHub.BatchImportFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchImportFindings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchImportFindingsResult batchImportFindings(BatchImportFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchImportFindings(request);
    }

    @SdkInternalApi
    final BatchImportFindingsResult executeBatchImportFindings(BatchImportFindingsRequest batchImportFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchImportFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchImportFindingsRequest> request = null;
        Response<BatchImportFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchImportFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchImportFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchImportFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchImportFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchImportFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates one or more automation rules based on rule Amazon Resource Names (ARNs) and input parameters.
     * </p>
     * 
     * @param batchUpdateAutomationRulesRequest
     * @return Result of the BatchUpdateAutomationRules operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.BatchUpdateAutomationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateAutomationRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchUpdateAutomationRulesResult batchUpdateAutomationRules(BatchUpdateAutomationRulesRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateAutomationRules(request);
    }

    @SdkInternalApi
    final BatchUpdateAutomationRulesResult executeBatchUpdateAutomationRules(BatchUpdateAutomationRulesRequest batchUpdateAutomationRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateAutomationRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateAutomationRulesRequest> request = null;
        Response<BatchUpdateAutomationRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateAutomationRulesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchUpdateAutomationRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateAutomationRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateAutomationRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchUpdateAutomationRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used by Security Hub customers to update information about their investigation into a finding. Requested by
     * administrator accounts or member accounts. Administrator accounts can update findings for their account and their
     * member accounts. Member accounts can update findings for their account.
     * </p>
     * <p>
     * Updates from <code>BatchUpdateFindings</code> do not affect the value of <code>UpdatedAt</code> for a finding.
     * </p>
     * <p>
     * Administrator and member accounts can use <code>BatchUpdateFindings</code> to update the following finding fields
     * and objects.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can configure IAM policies to restrict access to fields and field values. For example, you might not want
     * member accounts to be able to suppress findings or change the finding severity. See <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/finding-update-batchupdatefindings.html#batchupdatefindings-configure-access"
     * >Configuring access to BatchUpdateFindings</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchUpdateFindingsRequest
     * @return Result of the BatchUpdateFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @sample AWSSecurityHub.BatchUpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateFindings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchUpdateFindingsResult batchUpdateFindings(BatchUpdateFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateFindings(request);
    }

    @SdkInternalApi
    final BatchUpdateFindingsResult executeBatchUpdateFindings(BatchUpdateFindingsRequest batchUpdateFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateFindingsRequest> request = null;
        Response<BatchUpdateFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchUpdateFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchUpdateFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For a batch of security controls and standards, this operation updates the enablement status of a control in a
     * standard.
     * </p>
     * 
     * @param batchUpdateStandardsControlAssociationsRequest
     * @return Result of the BatchUpdateStandardsControlAssociations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.BatchUpdateStandardsControlAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateStandardsControlAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchUpdateStandardsControlAssociationsResult batchUpdateStandardsControlAssociations(BatchUpdateStandardsControlAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateStandardsControlAssociations(request);
    }

    @SdkInternalApi
    final BatchUpdateStandardsControlAssociationsResult executeBatchUpdateStandardsControlAssociations(
            BatchUpdateStandardsControlAssociationsRequest batchUpdateStandardsControlAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateStandardsControlAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateStandardsControlAssociationsRequest> request = null;
        Response<BatchUpdateStandardsControlAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateStandardsControlAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchUpdateStandardsControlAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateStandardsControlAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateStandardsControlAssociationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchUpdateStandardsControlAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a custom action target in Security Hub.
     * </p>
     * <p>
     * You can use custom actions on findings and insights in Security Hub to trigger target actions in Amazon
     * CloudWatch Events.
     * </p>
     * 
     * @param createActionTargetRequest
     * @return Result of the CreateActionTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.CreateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateActionTargetResult createActionTarget(CreateActionTargetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateActionTarget(request);
    }

    @SdkInternalApi
    final CreateActionTargetResult executeCreateActionTarget(CreateActionTargetRequest createActionTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(createActionTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateActionTargetRequest> request = null;
        Response<CreateActionTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateActionTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createActionTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateActionTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateActionTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateActionTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an automation rule based on input parameters.
     * </p>
     * 
     * @param createAutomationRuleRequest
     * @return Result of the CreateAutomationRule operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.CreateAutomationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateAutomationRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAutomationRuleResult createAutomationRule(CreateAutomationRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAutomationRule(request);
    }

    @SdkInternalApi
    final CreateAutomationRuleResult executeCreateAutomationRule(CreateAutomationRuleRequest createAutomationRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createAutomationRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAutomationRuleRequest> request = null;
        Response<CreateAutomationRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAutomationRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAutomationRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAutomationRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAutomationRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAutomationRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a configuration policy with the defined configuration. Only the Security Hub delegated administrator can
     * invoke this operation from the home Region.
     * </p>
     * 
     * @param createConfigurationPolicyRequest
     * @return Result of the CreateConfigurationPolicy operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.CreateConfigurationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateConfigurationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConfigurationPolicyResult createConfigurationPolicy(CreateConfigurationPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfigurationPolicy(request);
    }

    @SdkInternalApi
    final CreateConfigurationPolicyResult executeCreateConfigurationPolicy(CreateConfigurationPolicyRequest createConfigurationPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfigurationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigurationPolicyRequest> request = null;
        Response<CreateConfigurationPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfigurationPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createConfigurationPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfigurationPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConfigurationPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateConfigurationPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used to enable finding aggregation. Must be called from the aggregation Region.
     * </p>
     * <p>
     * For more details about cross-Region replication, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/finding-aggregation.html">Configuring finding
     * aggregation</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param createFindingAggregatorRequest
     * @return Result of the CreateFindingAggregator operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @sample AWSSecurityHub.CreateFindingAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateFindingAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateFindingAggregatorResult createFindingAggregator(CreateFindingAggregatorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFindingAggregator(request);
    }

    @SdkInternalApi
    final CreateFindingAggregatorResult executeCreateFindingAggregator(CreateFindingAggregatorRequest createFindingAggregatorRequest) {

        ExecutionContext executionContext = createExecutionContext(createFindingAggregatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFindingAggregatorRequest> request = null;
        Response<CreateFindingAggregatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFindingAggregatorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createFindingAggregatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFindingAggregator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFindingAggregatorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateFindingAggregatorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security
     * issue that requires attention or remediation.
     * </p>
     * <p>
     * To group the related findings in the insight, use the <code>GroupByAttribute</code>.
     * </p>
     * 
     * @param createInsightRequest
     * @return Result of the CreateInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.CreateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateInsightResult createInsight(CreateInsightRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInsight(request);
    }

    @SdkInternalApi
    final CreateInsightResult executeCreateInsight(CreateInsightRequest createInsightRequest) {

        ExecutionContext executionContext = createExecutionContext(createInsightRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInsightRequest> request = null;
        Response<CreateInsightResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInsightRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInsightRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInsight");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInsightResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateInsightResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a member association in Security Hub between the specified accounts and the account used to make the
     * request, which is the administrator account. If you are integrated with Organizations, then the administrator
     * account is designated by the organization management account.
     * </p>
     * <p>
     * <code>CreateMembers</code> is always used to add accounts that are not organization members.
     * </p>
     * <p>
     * For accounts that are managed using Organizations, <code>CreateMembers</code> is only used in the following
     * cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Security Hub is not configured to automatically add new organization accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The account was disassociated or deleted in Security Hub.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action can only be used by an account that has Security Hub enabled. To enable Security Hub, you can use the
     * <code>EnableSecurityHub</code> operation.
     * </p>
     * <p>
     * For accounts that are not organization members, you create the account association and then send an invitation to
     * the member account. To send the invitation, you use the <code>InviteMembers</code> operation. If the account
     * owner accepts the invitation, the account becomes a member account in Security Hub.
     * </p>
     * <p>
     * Accounts that are managed using Organizations do not receive an invitation. They automatically become a member
     * account in Security Hub.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the organization account does not have Security Hub enabled, then Security Hub and the default standards are
     * automatically enabled. Note that Security Hub cannot be enabled automatically for the organization management
     * account. The organization management account must enable Security Hub before the administrator account enables it
     * as a member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * For organization accounts that already have Security Hub enabled, Security Hub does not make any other changes to
     * those accounts. It does not change their enabled standards or controls.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A permissions policy is added that permits the administrator account to view the findings generated in the member
     * account.
     * </p>
     * <p>
     * To remove the association between the administrator and member accounts, use the
     * <code>DisassociateFromMasterAccount</code> or <code>DisassociateMembers</code> operation.
     * </p>
     * 
     * @param createMembersRequest
     * @return Result of the CreateMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateMembersResult createMembers(CreateMembersRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMembers(request);
    }

    @SdkInternalApi
    final CreateMembersResult executeCreateMembers(CreateMembersRequest createMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(createMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMembersRequest> request = null;
        Response<CreateMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Declines invitations to become a member account.
     * </p>
     * <p>
     * A prospective member account uses this operation to decline an invitation to become a member.
     * </p>
     * <p>
     * This operation is only called by member accounts that aren't part of an organization. Organization accounts don't
     * receive invitations.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return Result of the DeclineInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeclineInvitationsResult declineInvitations(DeclineInvitationsRequest request) {
        request = beforeClientExecution(request);
        return executeDeclineInvitations(request);
    }

    @SdkInternalApi
    final DeclineInvitationsResult executeDeclineInvitations(DeclineInvitationsRequest declineInvitationsRequest) {

        ExecutionContext executionContext = createExecutionContext(declineInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeclineInvitationsRequest> request = null;
        Response<DeclineInvitationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeclineInvitationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(declineInvitationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeclineInvitations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeclineInvitationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeclineInvitationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a custom action target from Security Hub.
     * </p>
     * <p>
     * Deleting a custom action target does not affect any findings or insights that were already sent to Amazon
     * CloudWatch Events using the custom action.
     * </p>
     * 
     * @param deleteActionTargetRequest
     * @return Result of the DeleteActionTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DeleteActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteActionTargetResult deleteActionTarget(DeleteActionTargetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteActionTarget(request);
    }

    @SdkInternalApi
    final DeleteActionTargetResult executeDeleteActionTarget(DeleteActionTargetRequest deleteActionTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteActionTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteActionTargetRequest> request = null;
        Response<DeleteActionTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteActionTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteActionTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteActionTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteActionTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteActionTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a configuration policy. Only the Security Hub delegated administrator can invoke this operation from the
     * home Region. For the deletion to succeed, you must first disassociate a configuration policy from target
     * accounts, organizational units, or the root by invoking the <code>StartConfigurationPolicyDisassociation</code>
     * operation.
     * </p>
     * 
     * @param deleteConfigurationPolicyRequest
     * @return Result of the DeleteConfigurationPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.DeleteConfigurationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteConfigurationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfigurationPolicyResult deleteConfigurationPolicy(DeleteConfigurationPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfigurationPolicy(request);
    }

    @SdkInternalApi
    final DeleteConfigurationPolicyResult executeDeleteConfigurationPolicy(DeleteConfigurationPolicyRequest deleteConfigurationPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfigurationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigurationPolicyRequest> request = null;
        Response<DeleteConfigurationPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigurationPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteConfigurationPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfigurationPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfigurationPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConfigurationPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a finding aggregator. When you delete the finding aggregator, you stop finding aggregation.
     * </p>
     * <p>
     * When you stop finding aggregation, findings that were already aggregated to the aggregation Region are still
     * visible from the aggregation Region. New findings and finding updates are not aggregated.
     * </p>
     * 
     * @param deleteFindingAggregatorRequest
     * @return Result of the DeleteFindingAggregator operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DeleteFindingAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteFindingAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFindingAggregatorResult deleteFindingAggregator(DeleteFindingAggregatorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFindingAggregator(request);
    }

    @SdkInternalApi
    final DeleteFindingAggregatorResult executeDeleteFindingAggregator(DeleteFindingAggregatorRequest deleteFindingAggregatorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFindingAggregatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFindingAggregatorRequest> request = null;
        Response<DeleteFindingAggregatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFindingAggregatorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteFindingAggregatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFindingAggregator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFindingAggregatorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteFindingAggregatorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the insight specified by the <code>InsightArn</code>.
     * </p>
     * 
     * @param deleteInsightRequest
     * @return Result of the DeleteInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DeleteInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInsight" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteInsightResult deleteInsight(DeleteInsightRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInsight(request);
    }

    @SdkInternalApi
    final DeleteInsightResult executeDeleteInsight(DeleteInsightRequest deleteInsightRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInsightRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInsightRequest> request = null;
        Response<DeleteInsightResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInsightRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInsightRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInsight");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInsightResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteInsightResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes invitations received by the Amazon Web Services account to become a member account.
     * </p>
     * <p>
     * A Security Hub administrator account can use this operation to delete invitations sent to one or more member
     * accounts.
     * </p>
     * <p>
     * This operation is only used to delete invitations that are sent to member accounts that aren't part of an
     * organization. Organization accounts don't receive invitations.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return Result of the DeleteInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @sample AWSSecurityHub.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteInvitationsResult deleteInvitations(DeleteInvitationsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInvitations(request);
    }

    @SdkInternalApi
    final DeleteInvitationsResult executeDeleteInvitations(DeleteInvitationsRequest deleteInvitationsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInvitationsRequest> request = null;
        Response<DeleteInvitationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInvitationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInvitationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInvitations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInvitationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteInvitationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified member accounts from Security Hub.
     * </p>
     * <p>
     * You can invoke this API only to delete accounts that became members through invitation. You can't invoke this API
     * to delete accounts that belong to an Organizations organization.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return Result of the DeleteMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteMembersResult deleteMembers(DeleteMembersRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMembers(request);
    }

    @SdkInternalApi
    final DeleteMembersResult executeDeleteMembers(DeleteMembersRequest deleteMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMembersRequest> request = null;
        Response<DeleteMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the custom action targets in Security Hub in your account.
     * </p>
     * 
     * @param describeActionTargetsRequest
     * @return Result of the DescribeActionTargets operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DescribeActionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeActionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeActionTargetsResult describeActionTargets(DescribeActionTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeActionTargets(request);
    }

    @SdkInternalApi
    final DescribeActionTargetsResult executeDescribeActionTargets(DescribeActionTargetsRequest describeActionTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeActionTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeActionTargetsRequest> request = null;
        Response<DescribeActionTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeActionTargetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeActionTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeActionTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeActionTargetsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeActionTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about the Hub resource in your account, including the <code>HubArn</code> and the time when you
     * enabled Security Hub.
     * </p>
     * 
     * @param describeHubRequest
     * @return Result of the DescribeHub operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DescribeHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeHub" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeHubResult describeHub(DescribeHubRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeHub(request);
    }

    @SdkInternalApi
    final DescribeHubResult executeDescribeHub(DescribeHubRequest describeHubRequest) {

        ExecutionContext executionContext = createExecutionContext(describeHubRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHubRequest> request = null;
        Response<DescribeHubResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHubRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeHubRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeHub");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeHubResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeHubResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the way your organization is configured in Security Hub. Only the Security Hub
     * administrator account can invoke this operation.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return Result of the DescribeOrganizationConfiguration operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOrganizationConfigurationResult describeOrganizationConfiguration(DescribeOrganizationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOrganizationConfiguration(request);
    }

    @SdkInternalApi
    final DescribeOrganizationConfigurationResult executeDescribeOrganizationConfiguration(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOrganizationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationConfigurationRequest> request = null;
        Response<DescribeOrganizationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOrganizationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOrganizationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOrganizationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeOrganizationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about product integrations in Security Hub.
     * </p>
     * <p>
     * You can optionally provide an integration ARN. If you provide an integration ARN, then the results only include
     * that integration.
     * </p>
     * <p>
     * If you do not provide an integration ARN, then the results include all of the available product integrations.
     * </p>
     * 
     * @param describeProductsRequest
     * @return Result of the DescribeProducts operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @sample AWSSecurityHub.DescribeProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeProducts" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeProductsResult describeProducts(DescribeProductsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProducts(request);
    }

    @SdkInternalApi
    final DescribeProductsResult executeDescribeProducts(DescribeProductsRequest describeProductsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProductsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProductsRequest> request = null;
        Response<DescribeProductsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProductsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProductsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProducts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProductsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeProductsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the available standards in Security Hub.
     * </p>
     * <p>
     * For each standard, the results include the standard ARN, the name, and a description.
     * </p>
     * 
     * @param describeStandardsRequest
     * @return Result of the DescribeStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @sample AWSSecurityHub.DescribeStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandards" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeStandardsResult describeStandards(DescribeStandardsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStandards(request);
    }

    @SdkInternalApi
    final DescribeStandardsResult executeDescribeStandards(DescribeStandardsRequest describeStandardsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStandardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStandardsRequest> request = null;
        Response<DescribeStandardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStandardsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeStandardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStandards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStandardsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeStandardsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of security standards controls.
     * </p>
     * <p>
     * For each control, the results include information about whether it is currently enabled, the severity, and a link
     * to remediation information.
     * </p>
     * 
     * @param describeStandardsControlsRequest
     * @return Result of the DescribeStandardsControls operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DescribeStandardsControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandardsControls"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStandardsControlsResult describeStandardsControls(DescribeStandardsControlsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStandardsControls(request);
    }

    @SdkInternalApi
    final DescribeStandardsControlsResult executeDescribeStandardsControls(DescribeStandardsControlsRequest describeStandardsControlsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStandardsControlsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStandardsControlsRequest> request = null;
        Response<DescribeStandardsControlsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStandardsControlsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeStandardsControlsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStandardsControls");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStandardsControlsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeStandardsControlsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the integration of the specified product with Security Hub. After the integration is disabled, findings
     * from that product are no longer sent to Security Hub.
     * </p>
     * 
     * @param disableImportFindingsForProductRequest
     * @return Result of the DisableImportFindingsForProduct operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.DisableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableImportFindingsForProductResult disableImportFindingsForProduct(DisableImportFindingsForProductRequest request) {
        request = beforeClientExecution(request);
        return executeDisableImportFindingsForProduct(request);
    }

    @SdkInternalApi
    final DisableImportFindingsForProductResult executeDisableImportFindingsForProduct(
            DisableImportFindingsForProductRequest disableImportFindingsForProductRequest) {

        ExecutionContext executionContext = createExecutionContext(disableImportFindingsForProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableImportFindingsForProductRequest> request = null;
        Response<DisableImportFindingsForProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableImportFindingsForProductRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disableImportFindingsForProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableImportFindingsForProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableImportFindingsForProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisableImportFindingsForProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables a Security Hub administrator account. Can only be called by the organization management account.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return Result of the DisableOrganizationAdminAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDisableOrganizationAdminAccount(request);
    }

    @SdkInternalApi
    final DisableOrganizationAdminAccountResult executeDisableOrganizationAdminAccount(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(disableOrganizationAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableOrganizationAdminAccountRequest> request = null;
        Response<DisableOrganizationAdminAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableOrganizationAdminAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disableOrganizationAdminAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableOrganizationAdminAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableOrganizationAdminAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisableOrganizationAdminAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables Security Hub in your account only in the current Amazon Web Services Region. To disable Security Hub in
     * all Regions, you must submit one request per Region where you have enabled Security Hub.
     * </p>
     * <p>
     * You can't disable Security Hub in an account that is currently the Security Hub administrator.
     * </p>
     * <p>
     * When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings
     * are deleted after 90 days and cannot be recovered. Any standards that were enabled are disabled, and your
     * administrator and member account associations are removed.
     * </p>
     * <p>
     * If you want to save your existing findings, you must export them before you disable Security Hub.
     * </p>
     * 
     * @param disableSecurityHubRequest
     * @return Result of the DisableSecurityHub operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.DisableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisableSecurityHubResult disableSecurityHub(DisableSecurityHubRequest request) {
        request = beforeClientExecution(request);
        return executeDisableSecurityHub(request);
    }

    @SdkInternalApi
    final DisableSecurityHubResult executeDisableSecurityHub(DisableSecurityHubRequest disableSecurityHubRequest) {

        ExecutionContext executionContext = createExecutionContext(disableSecurityHubRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableSecurityHubRequest> request = null;
        Response<DisableSecurityHubResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableSecurityHubRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableSecurityHubRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableSecurityHub");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableSecurityHubResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableSecurityHubResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the current Security Hub member account from the associated administrator account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. For organization accounts, only the
     * administrator account can disassociate a member account.
     * </p>
     * 
     * @param disassociateFromAdministratorAccountRequest
     * @return Result of the DisassociateFromAdministratorAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DisassociateFromAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateFromAdministratorAccountResult disassociateFromAdministratorAccount(DisassociateFromAdministratorAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateFromAdministratorAccount(request);
    }

    @SdkInternalApi
    final DisassociateFromAdministratorAccountResult executeDisassociateFromAdministratorAccount(
            DisassociateFromAdministratorAccountRequest disassociateFromAdministratorAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateFromAdministratorAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateFromAdministratorAccountRequest> request = null;
        Response<DisassociateFromAdministratorAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateFromAdministratorAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateFromAdministratorAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateFromAdministratorAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateFromAdministratorAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateFromAdministratorAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This method is deprecated. Instead, use <code>DisassociateFromAdministratorAccount</code>.
     * </p>
     * <p>
     * The Security Hub console continues to use <code>DisassociateFromMasterAccount</code>. It will eventually change
     * to use <code>DisassociateFromAdministratorAccount</code>. Any IAM policies that specifically control access to
     * this function must continue to use <code>DisassociateFromMasterAccount</code>. You should also add
     * <code>DisassociateFromAdministratorAccount</code> to your policies to ensure that the correct permissions are in
     * place after the console begins to use <code>DisassociateFromAdministratorAccount</code>.
     * </p>
     * <p>
     * Disassociates the current Security Hub member account from the associated administrator account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. For organization accounts, only the
     * administrator account can disassociate a member account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return Result of the DisassociateFromMasterAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    @Deprecated
    public DisassociateFromMasterAccountResult disassociateFromMasterAccount(DisassociateFromMasterAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateFromMasterAccount(request);
    }

    @SdkInternalApi
    final DisassociateFromMasterAccountResult executeDisassociateFromMasterAccount(DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateFromMasterAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateFromMasterAccountRequest> request = null;
        Response<DisassociateFromMasterAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateFromMasterAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateFromMasterAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateFromMasterAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateFromMasterAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateFromMasterAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified member accounts from the associated administrator account.
     * </p>
     * <p>
     * Can be used to disassociate both accounts that are managed using Organizations and accounts that were invited
     * manually.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @return Result of the DisassociateMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateMembers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateMembersResult disassociateMembers(DisassociateMembersRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateMembers(request);
    }

    @SdkInternalApi
    final DisassociateMembersResult executeDisassociateMembers(DisassociateMembersRequest disassociateMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMembersRequest> request = null;
        Response<DisassociateMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the integration of a partner product with Security Hub. Integrated products send findings to Security
     * Hub.
     * </p>
     * <p>
     * When you enable a product integration, a permissions policy that grants permission for the product to send
     * findings to Security Hub is applied.
     * </p>
     * 
     * @param enableImportFindingsForProductRequest
     * @return Result of the EnableImportFindingsForProduct operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.EnableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableImportFindingsForProductResult enableImportFindingsForProduct(EnableImportFindingsForProductRequest request) {
        request = beforeClientExecution(request);
        return executeEnableImportFindingsForProduct(request);
    }

    @SdkInternalApi
    final EnableImportFindingsForProductResult executeEnableImportFindingsForProduct(EnableImportFindingsForProductRequest enableImportFindingsForProductRequest) {

        ExecutionContext executionContext = createExecutionContext(enableImportFindingsForProductRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableImportFindingsForProductRequest> request = null;
        Response<EnableImportFindingsForProductResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableImportFindingsForProductRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(enableImportFindingsForProductRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableImportFindingsForProduct");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableImportFindingsForProductResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new EnableImportFindingsForProductResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Designates the Security Hub administrator account for an organization. Can only be called by the organization
     * management account.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return Result of the EnableOrganizationAdminAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableOrganizationAdminAccountResult enableOrganizationAdminAccount(EnableOrganizationAdminAccountRequest request) {
        request = beforeClientExecution(request);
        return executeEnableOrganizationAdminAccount(request);
    }

    @SdkInternalApi
    final EnableOrganizationAdminAccountResult executeEnableOrganizationAdminAccount(EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(enableOrganizationAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableOrganizationAdminAccountRequest> request = null;
        Response<EnableOrganizationAdminAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableOrganizationAdminAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(enableOrganizationAdminAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableOrganizationAdminAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableOrganizationAdminAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new EnableOrganizationAdminAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables Security Hub for your account in the current Region or the Region you specify in the request.
     * </p>
     * <p>
     * When you enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from other
     * services that are integrated with Security Hub.
     * </p>
     * <p>
     * When you use the <code>EnableSecurityHub</code> operation to enable Security Hub, you also automatically enable
     * the following standards:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Center for Internet Security (CIS) Amazon Web Services Foundations Benchmark v1.2.0
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Web Services Foundational Security Best Practices
     * </p>
     * </li>
     * </ul>
     * <p>
     * Other standards are not automatically enabled.
     * </p>
     * <p>
     * To opt out of automatically enabled standards, set <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     * <p>
     * After you enable Security Hub, to enable a standard, use the <code>BatchEnableStandards</code> operation. To
     * disable a standard, use the <code>BatchDisableStandards</code> operation.
     * </p>
     * <p>
     * To learn more, see the <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-settingup.html">setup information</a>
     * in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param enableSecurityHubRequest
     * @return Result of the EnableSecurityHub operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.EnableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public EnableSecurityHubResult enableSecurityHub(EnableSecurityHubRequest request) {
        request = beforeClientExecution(request);
        return executeEnableSecurityHub(request);
    }

    @SdkInternalApi
    final EnableSecurityHubResult executeEnableSecurityHub(EnableSecurityHubRequest enableSecurityHubRequest) {

        ExecutionContext executionContext = createExecutionContext(enableSecurityHubRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableSecurityHubRequest> request = null;
        Response<EnableSecurityHubResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableSecurityHubRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableSecurityHubRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableSecurityHub");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableSecurityHubResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableSecurityHubResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides the details for the Security Hub administrator account for the current member account.
     * </p>
     * <p>
     * Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
     * </p>
     * 
     * @param getAdministratorAccountRequest
     * @return Result of the GetAdministratorAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAdministratorAccountResult getAdministratorAccount(GetAdministratorAccountRequest request) {
        request = beforeClientExecution(request);
        return executeGetAdministratorAccount(request);
    }

    @SdkInternalApi
    final GetAdministratorAccountResult executeGetAdministratorAccount(GetAdministratorAccountRequest getAdministratorAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(getAdministratorAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAdministratorAccountRequest> request = null;
        Response<GetAdministratorAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAdministratorAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAdministratorAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAdministratorAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAdministratorAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAdministratorAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about a configuration policy. Only the Security Hub delegated administrator can invoke this
     * operation from the home Region.
     * </p>
     * 
     * @param getConfigurationPolicyRequest
     * @return Result of the GetConfigurationPolicy operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.GetConfigurationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetConfigurationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConfigurationPolicyResult getConfigurationPolicy(GetConfigurationPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetConfigurationPolicy(request);
    }

    @SdkInternalApi
    final GetConfigurationPolicyResult executeGetConfigurationPolicy(GetConfigurationPolicyRequest getConfigurationPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getConfigurationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfigurationPolicyRequest> request = null;
        Response<GetConfigurationPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfigurationPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConfigurationPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConfigurationPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConfigurationPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConfigurationPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the association between a configuration and a target account, organizational unit, or the root. The
     * configuration can be a configuration policy or self-managed behavior. Only the Security Hub delegated
     * administrator can invoke this operation from the home Region.
     * </p>
     * 
     * @param getConfigurationPolicyAssociationRequest
     * @return Result of the GetConfigurationPolicyAssociation operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.GetConfigurationPolicyAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetConfigurationPolicyAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConfigurationPolicyAssociationResult getConfigurationPolicyAssociation(GetConfigurationPolicyAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetConfigurationPolicyAssociation(request);
    }

    @SdkInternalApi
    final GetConfigurationPolicyAssociationResult executeGetConfigurationPolicyAssociation(
            GetConfigurationPolicyAssociationRequest getConfigurationPolicyAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getConfigurationPolicyAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfigurationPolicyAssociationRequest> request = null;
        Response<GetConfigurationPolicyAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfigurationPolicyAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getConfigurationPolicyAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConfigurationPolicyAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConfigurationPolicyAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConfigurationPolicyAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the standards that are currently enabled.
     * </p>
     * 
     * @param getEnabledStandardsRequest
     * @return Result of the GetEnabledStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.GetEnabledStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetEnabledStandards"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEnabledStandardsResult getEnabledStandards(GetEnabledStandardsRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnabledStandards(request);
    }

    @SdkInternalApi
    final GetEnabledStandardsResult executeGetEnabledStandards(GetEnabledStandardsRequest getEnabledStandardsRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnabledStandardsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnabledStandardsRequest> request = null;
        Response<GetEnabledStandardsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnabledStandardsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEnabledStandardsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnabledStandards");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnabledStandardsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEnabledStandardsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the current finding aggregation configuration.
     * </p>
     * 
     * @param getFindingAggregatorRequest
     * @return Result of the GetFindingAggregator operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetFindingAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindingAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetFindingAggregatorResult getFindingAggregator(GetFindingAggregatorRequest request) {
        request = beforeClientExecution(request);
        return executeGetFindingAggregator(request);
    }

    @SdkInternalApi
    final GetFindingAggregatorResult executeGetFindingAggregator(GetFindingAggregatorRequest getFindingAggregatorRequest) {

        ExecutionContext executionContext = createExecutionContext(getFindingAggregatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFindingAggregatorRequest> request = null;
        Response<GetFindingAggregatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFindingAggregatorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFindingAggregatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFindingAggregator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFindingAggregatorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFindingAggregatorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns history for a Security Hub finding in the last 90 days. The history includes changes made to any fields
     * in the Amazon Web Services Security Finding Format (ASFF).
     * </p>
     * 
     * @param getFindingHistoryRequest
     * @return Result of the GetFindingHistory operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.GetFindingHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindingHistory" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetFindingHistoryResult getFindingHistory(GetFindingHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetFindingHistory(request);
    }

    @SdkInternalApi
    final GetFindingHistoryResult executeGetFindingHistory(GetFindingHistoryRequest getFindingHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getFindingHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFindingHistoryRequest> request = null;
        Response<GetFindingHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFindingHistoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFindingHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFindingHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFindingHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFindingHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of findings that match the specified criteria.
     * </p>
     * <p>
     * If finding aggregation is enabled, then when you call <code>GetFindings</code> from the aggregation Region, the
     * results include all of the matching findings from both the aggregation Region and the linked Regions.
     * </p>
     * 
     * @param getFindingsRequest
     * @return Result of the GetFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFindingsResult getFindings(GetFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetFindings(request);
    }

    @SdkInternalApi
    final GetFindingsResult executeGetFindings(GetFindingsRequest getFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFindingsRequest> request = null;
        Response<GetFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the results of the Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param getInsightResultsRequest
     * @return Result of the GetInsightResults operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetInsightResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsightResults" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetInsightResultsResult getInsightResults(GetInsightResultsRequest request) {
        request = beforeClientExecution(request);
        return executeGetInsightResults(request);
    }

    @SdkInternalApi
    final GetInsightResultsResult executeGetInsightResults(GetInsightResultsRequest getInsightResultsRequest) {

        ExecutionContext executionContext = createExecutionContext(getInsightResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInsightResultsRequest> request = null;
        Response<GetInsightResultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInsightResultsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInsightResultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInsightResults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInsightResultsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInsightResultsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists and describes insights for the specified insight ARNs.
     * </p>
     * 
     * @param getInsightsRequest
     * @return Result of the GetInsights operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInsightsResult getInsights(GetInsightsRequest request) {
        request = beforeClientExecution(request);
        return executeGetInsights(request);
    }

    @SdkInternalApi
    final GetInsightsResult executeGetInsights(GetInsightsRequest getInsightsRequest) {

        ExecutionContext executionContext = createExecutionContext(getInsightsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInsightsRequest> request = null;
        Response<GetInsightsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInsightsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInsightsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInsights");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInsightsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInsightsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the count of all Security Hub membership invitations that were sent to the current member account, not
     * including the currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return Result of the GetInvitationsCount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInvitationsCount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInvitationsCountResult getInvitationsCount(GetInvitationsCountRequest request) {
        request = beforeClientExecution(request);
        return executeGetInvitationsCount(request);
    }

    @SdkInternalApi
    final GetInvitationsCountResult executeGetInvitationsCount(GetInvitationsCountRequest getInvitationsCountRequest) {

        ExecutionContext executionContext = createExecutionContext(getInvitationsCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInvitationsCountRequest> request = null;
        Response<GetInvitationsCountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInvitationsCountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInvitationsCountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInvitationsCount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInvitationsCountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInvitationsCountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This method is deprecated. Instead, use <code>GetAdministratorAccount</code>.
     * </p>
     * <p>
     * The Security Hub console continues to use <code>GetMasterAccount</code>. It will eventually change to use
     * <code>GetAdministratorAccount</code>. Any IAM policies that specifically control access to this function must
     * continue to use <code>GetMasterAccount</code>. You should also add <code>GetAdministratorAccount</code> to your
     * policies to ensure that the correct permissions are in place after the console begins to use
     * <code>GetAdministratorAccount</code>.
     * </p>
     * <p>
     * Provides the details for the Security Hub administrator account for the current member account.
     * </p>
     * <p>
     * Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return Result of the GetMasterAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMasterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    @Deprecated
    public GetMasterAccountResult getMasterAccount(GetMasterAccountRequest request) {
        request = beforeClientExecution(request);
        return executeGetMasterAccount(request);
    }

    @SdkInternalApi
    final GetMasterAccountResult executeGetMasterAccount(GetMasterAccountRequest getMasterAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(getMasterAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMasterAccountRequest> request = null;
        Response<GetMasterAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMasterAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMasterAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMasterAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMasterAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMasterAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details for the Security Hub member accounts for the specified account IDs.
     * </p>
     * <p>
     * An administrator account can be either the delegated Security Hub administrator account for an organization or an
     * administrator account that enabled Security Hub manually.
     * </p>
     * <p>
     * The results include both member accounts that are managed using Organizations and accounts that were invited
     * manually.
     * </p>
     * 
     * @param getMembersRequest
     * @return Result of the GetMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMembersResult getMembers(GetMembersRequest request) {
        request = beforeClientExecution(request);
        return executeGetMembers(request);
    }

    @SdkInternalApi
    final GetMembersResult executeGetMembers(GetMembersRequest getMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(getMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMembersRequest> request = null;
        Response<GetMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMembersResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the definition of a security control. The definition includes the control title, description, Region
     * availability, parameter definitions, and other details.
     * </p>
     * 
     * @param getSecurityControlDefinitionRequest
     * @return Result of the GetSecurityControlDefinition operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetSecurityControlDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetSecurityControlDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSecurityControlDefinitionResult getSecurityControlDefinition(GetSecurityControlDefinitionRequest request) {
        request = beforeClientExecution(request);
        return executeGetSecurityControlDefinition(request);
    }

    @SdkInternalApi
    final GetSecurityControlDefinitionResult executeGetSecurityControlDefinition(GetSecurityControlDefinitionRequest getSecurityControlDefinitionRequest) {

        ExecutionContext executionContext = createExecutionContext(getSecurityControlDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSecurityControlDefinitionRequest> request = null;
        Response<GetSecurityControlDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSecurityControlDefinitionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSecurityControlDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSecurityControlDefinition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSecurityControlDefinitionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSecurityControlDefinitionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Invites other Amazon Web Services accounts to become member accounts for the Security Hub administrator account
     * that the invitation is sent from.
     * </p>
     * <p>
     * This operation is only used to invite accounts that do not belong to an organization. Organization accounts do
     * not receive invitations.
     * </p>
     * <p>
     * Before you can use this action to invite a member, you must first use the <code>CreateMembers</code> action to
     * create the member account in Security Hub.
     * </p>
     * <p>
     * When the account owner enables Security Hub and accepts the invitation to become a member account, the
     * administrator account can view the findings generated from the member account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @return Result of the InviteMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public InviteMembersResult inviteMembers(InviteMembersRequest request) {
        request = beforeClientExecution(request);
        return executeInviteMembers(request);
    }

    @SdkInternalApi
    final InviteMembersResult executeInviteMembers(InviteMembersRequest inviteMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(inviteMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InviteMembersRequest> request = null;
        Response<InviteMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InviteMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(inviteMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InviteMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InviteMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InviteMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A list of automation rules and their metadata for the calling account.
     * </p>
     * 
     * @param listAutomationRulesRequest
     * @return Result of the ListAutomationRules operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.ListAutomationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListAutomationRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAutomationRulesResult listAutomationRules(ListAutomationRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListAutomationRules(request);
    }

    @SdkInternalApi
    final ListAutomationRulesResult executeListAutomationRules(ListAutomationRulesRequest listAutomationRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAutomationRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAutomationRulesRequest> request = null;
        Response<ListAutomationRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAutomationRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAutomationRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAutomationRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAutomationRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAutomationRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the configuration policies that the Security Hub delegated administrator has created for your organization.
     * Only the delegated administrator can invoke this operation from the home Region.
     * </p>
     * 
     * @param listConfigurationPoliciesRequest
     * @return Result of the ListConfigurationPolicies operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.ListConfigurationPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListConfigurationPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConfigurationPoliciesResult listConfigurationPolicies(ListConfigurationPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListConfigurationPolicies(request);
    }

    @SdkInternalApi
    final ListConfigurationPoliciesResult executeListConfigurationPolicies(ListConfigurationPoliciesRequest listConfigurationPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listConfigurationPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfigurationPoliciesRequest> request = null;
        Response<ListConfigurationPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfigurationPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listConfigurationPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConfigurationPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConfigurationPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListConfigurationPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the associations for your configuration policies and self-managed behavior. Only the
     * Security Hub delegated administrator can invoke this operation from the home Region.
     * </p>
     * 
     * @param listConfigurationPolicyAssociationsRequest
     * @return Result of the ListConfigurationPolicyAssociations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.ListConfigurationPolicyAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListConfigurationPolicyAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConfigurationPolicyAssociationsResult listConfigurationPolicyAssociations(ListConfigurationPolicyAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListConfigurationPolicyAssociations(request);
    }

    @SdkInternalApi
    final ListConfigurationPolicyAssociationsResult executeListConfigurationPolicyAssociations(
            ListConfigurationPolicyAssociationsRequest listConfigurationPolicyAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConfigurationPolicyAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfigurationPolicyAssociationsRequest> request = null;
        Response<ListConfigurationPolicyAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfigurationPolicyAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listConfigurationPolicyAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConfigurationPolicyAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConfigurationPolicyAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListConfigurationPolicyAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all findings-generating solutions (products) that you are subscribed to receive findings from in Security
     * Hub.
     * </p>
     * 
     * @param listEnabledProductsForImportRequest
     * @return Result of the ListEnabledProductsForImport operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @sample AWSSecurityHub.ListEnabledProductsForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListEnabledProductsForImport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEnabledProductsForImportResult listEnabledProductsForImport(ListEnabledProductsForImportRequest request) {
        request = beforeClientExecution(request);
        return executeListEnabledProductsForImport(request);
    }

    @SdkInternalApi
    final ListEnabledProductsForImportResult executeListEnabledProductsForImport(ListEnabledProductsForImportRequest listEnabledProductsForImportRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnabledProductsForImportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnabledProductsForImportRequest> request = null;
        Response<ListEnabledProductsForImportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnabledProductsForImportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEnabledProductsForImportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnabledProductsForImport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnabledProductsForImportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEnabledProductsForImportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * If finding aggregation is enabled, then <code>ListFindingAggregators</code> returns the ARN of the finding
     * aggregator. You can run this operation from any Region.
     * </p>
     * 
     * @param listFindingAggregatorsRequest
     * @return Result of the ListFindingAggregators operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @sample AWSSecurityHub.ListFindingAggregators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListFindingAggregators"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFindingAggregatorsResult listFindingAggregators(ListFindingAggregatorsRequest request) {
        request = beforeClientExecution(request);
        return executeListFindingAggregators(request);
    }

    @SdkInternalApi
    final ListFindingAggregatorsResult executeListFindingAggregators(ListFindingAggregatorsRequest listFindingAggregatorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFindingAggregatorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFindingAggregatorsRequest> request = null;
        Response<ListFindingAggregatorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFindingAggregatorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFindingAggregatorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFindingAggregators");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFindingAggregatorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListFindingAggregatorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all Security Hub membership invitations that were sent to the current Amazon Web Services account.
     * </p>
     * <p>
     * This operation is only used by accounts that are managed by invitation. Accounts that are managed using the
     * integration with Organizations do not receive invitations.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return Result of the ListInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListInvitationsResult listInvitations(ListInvitationsRequest request) {
        request = beforeClientExecution(request);
        return executeListInvitations(request);
    }

    @SdkInternalApi
    final ListInvitationsResult executeListInvitations(ListInvitationsRequest listInvitationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInvitationsRequest> request = null;
        Response<ListInvitationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInvitationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInvitationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInvitations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInvitationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInvitationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists details about all member accounts for the current Security Hub administrator account.
     * </p>
     * <p>
     * The results include both member accounts that belong to an organization and member accounts that were invited
     * manually.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMembersResult listMembers(ListMembersRequest request) {
        request = beforeClientExecution(request);
        return executeListMembers(request);
    }

    @SdkInternalApi
    final ListMembersResult executeListMembers(ListMembersRequest listMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(listMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMembersRequest> request = null;
        Response<ListMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Security Hub administrator accounts. Can only be called by the organization management account.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return Result of the ListOrganizationAdminAccounts operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOrganizationAdminAccountsResult listOrganizationAdminAccounts(ListOrganizationAdminAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeListOrganizationAdminAccounts(request);
    }

    @SdkInternalApi
    final ListOrganizationAdminAccountsResult executeListOrganizationAdminAccounts(ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOrganizationAdminAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrganizationAdminAccountsRequest> request = null;
        Response<ListOrganizationAdminAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrganizationAdminAccountsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listOrganizationAdminAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOrganizationAdminAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOrganizationAdminAccountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListOrganizationAdminAccountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the security controls that apply to a specified standard.
     * </p>
     * 
     * @param listSecurityControlDefinitionsRequest
     * @return Result of the ListSecurityControlDefinitions operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @sample AWSSecurityHub.ListSecurityControlDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListSecurityControlDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSecurityControlDefinitionsResult listSecurityControlDefinitions(ListSecurityControlDefinitionsRequest request) {
        request = beforeClientExecution(request);
        return executeListSecurityControlDefinitions(request);
    }

    @SdkInternalApi
    final ListSecurityControlDefinitionsResult executeListSecurityControlDefinitions(ListSecurityControlDefinitionsRequest listSecurityControlDefinitionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSecurityControlDefinitionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSecurityControlDefinitionsRequest> request = null;
        Response<ListSecurityControlDefinitionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSecurityControlDefinitionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSecurityControlDefinitionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSecurityControlDefinitions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSecurityControlDefinitionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSecurityControlDefinitionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specifies whether a control is currently enabled or disabled in each enabled standard in the calling account.
     * </p>
     * 
     * @param listStandardsControlAssociationsRequest
     * @return Result of the ListStandardsControlAssociations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @sample AWSSecurityHub.ListStandardsControlAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListStandardsControlAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStandardsControlAssociationsResult listStandardsControlAssociations(ListStandardsControlAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListStandardsControlAssociations(request);
    }

    @SdkInternalApi
    final ListStandardsControlAssociationsResult executeListStandardsControlAssociations(
            ListStandardsControlAssociationsRequest listStandardsControlAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStandardsControlAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStandardsControlAssociationsRequest> request = null;
        Response<ListStandardsControlAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStandardsControlAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listStandardsControlAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStandardsControlAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStandardsControlAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListStandardsControlAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
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
     * Associates a target account, organizational unit, or the root with a specified configuration. The target can be
     * associated with a configuration policy or self-managed behavior. Only the Security Hub delegated administrator
     * can invoke this operation from the home Region.
     * </p>
     * 
     * @param startConfigurationPolicyAssociationRequest
     * @return Result of the StartConfigurationPolicyAssociation operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.StartConfigurationPolicyAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StartConfigurationPolicyAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartConfigurationPolicyAssociationResult startConfigurationPolicyAssociation(StartConfigurationPolicyAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeStartConfigurationPolicyAssociation(request);
    }

    @SdkInternalApi
    final StartConfigurationPolicyAssociationResult executeStartConfigurationPolicyAssociation(
            StartConfigurationPolicyAssociationRequest startConfigurationPolicyAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(startConfigurationPolicyAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartConfigurationPolicyAssociationRequest> request = null;
        Response<StartConfigurationPolicyAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartConfigurationPolicyAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startConfigurationPolicyAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartConfigurationPolicyAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartConfigurationPolicyAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartConfigurationPolicyAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a target account, organizational unit, or the root from a specified configuration. When you
     * disassociate a configuration from its target, the target inherits the configuration of the closest parent. If
     * there’s no configuration to inherit, the target retains its settings but becomes a self-managed account. A target
     * can be disassociated from a configuration policy or self-managed behavior. Only the Security Hub delegated
     * administrator can invoke this operation from the home Region.
     * </p>
     * 
     * @param startConfigurationPolicyDisassociationRequest
     * @return Result of the StartConfigurationPolicyDisassociation operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.StartConfigurationPolicyDisassociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StartConfigurationPolicyDisassociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartConfigurationPolicyDisassociationResult startConfigurationPolicyDisassociation(StartConfigurationPolicyDisassociationRequest request) {
        request = beforeClientExecution(request);
        return executeStartConfigurationPolicyDisassociation(request);
    }

    @SdkInternalApi
    final StartConfigurationPolicyDisassociationResult executeStartConfigurationPolicyDisassociation(
            StartConfigurationPolicyDisassociationRequest startConfigurationPolicyDisassociationRequest) {

        ExecutionContext executionContext = createExecutionContext(startConfigurationPolicyDisassociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartConfigurationPolicyDisassociationRequest> request = null;
        Response<StartConfigurationPolicyDisassociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartConfigurationPolicyDisassociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startConfigurationPolicyDisassociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartConfigurationPolicyDisassociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartConfigurationPolicyDisassociationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartConfigurationPolicyDisassociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
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
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
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
     * Updates the name and description of a custom action target in Security Hub.
     * </p>
     * 
     * @param updateActionTargetRequest
     * @return Result of the UpdateActionTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UpdateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateActionTargetResult updateActionTarget(UpdateActionTargetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateActionTarget(request);
    }

    @SdkInternalApi
    final UpdateActionTargetResult executeUpdateActionTarget(UpdateActionTargetRequest updateActionTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateActionTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateActionTargetRequest> request = null;
        Response<UpdateActionTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateActionTargetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateActionTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateActionTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateActionTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateActionTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a configuration policy. Only the Security Hub delegated administrator can invoke this operation from the
     * home Region.
     * </p>
     * 
     * @param updateConfigurationPolicyRequest
     * @return Result of the UpdateConfigurationPolicy operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.UpdateConfigurationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateConfigurationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConfigurationPolicyResult updateConfigurationPolicy(UpdateConfigurationPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfigurationPolicy(request);
    }

    @SdkInternalApi
    final UpdateConfigurationPolicyResult executeUpdateConfigurationPolicy(UpdateConfigurationPolicyRequest updateConfigurationPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfigurationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfigurationPolicyRequest> request = null;
        Response<UpdateConfigurationPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfigurationPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateConfigurationPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfigurationPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConfigurationPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateConfigurationPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the finding aggregation configuration. Used to update the Region linking mode and the list of included or
     * excluded Regions. You cannot use <code>UpdateFindingAggregator</code> to change the aggregation Region.
     * </p>
     * <p>
     * You must run <code>UpdateFindingAggregator</code> from the current aggregation Region.
     * </p>
     * 
     * @param updateFindingAggregatorRequest
     * @return Result of the UpdateFindingAggregator operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UpdateFindingAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindingAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFindingAggregatorResult updateFindingAggregator(UpdateFindingAggregatorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFindingAggregator(request);
    }

    @SdkInternalApi
    final UpdateFindingAggregatorResult executeUpdateFindingAggregator(UpdateFindingAggregatorRequest updateFindingAggregatorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFindingAggregatorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFindingAggregatorRequest> request = null;
        Response<UpdateFindingAggregatorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFindingAggregatorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateFindingAggregatorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFindingAggregator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFindingAggregatorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateFindingAggregatorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * <code>UpdateFindings</code> is a deprecated operation. Instead of <code>UpdateFindings</code>, use the
     * <code>BatchUpdateFindings</code> operation.
     * </p>
     * <p>
     * Updates the <code>Note</code> and <code>RecordState</code> of the Security Hub-aggregated findings that the
     * filter attributes specify. Any member account that can view the finding also sees the update to the finding.
     * </p>
     * <p>
     * Finding updates made with <code>UpdateFindings</code> might not be persisted if the same finding is later updated
     * by the finding provider through the <code>BatchImportFindings</code> operation.
     * </p>
     * 
     * @param updateFindingsRequest
     * @return Result of the UpdateFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFindingsResult updateFindings(UpdateFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFindings(request);
    }

    @SdkInternalApi
    final UpdateFindingsResult executeUpdateFindings(UpdateFindingsRequest updateFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFindingsRequest> request = null;
        Response<UpdateFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the Security Hub insight identified by the specified insight ARN.
     * </p>
     * 
     * @param updateInsightRequest
     * @return Result of the UpdateInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UpdateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateInsightResult updateInsight(UpdateInsightRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateInsight(request);
    }

    @SdkInternalApi
    final UpdateInsightResult executeUpdateInsight(UpdateInsightRequest updateInsightRequest) {

        ExecutionContext executionContext = createExecutionContext(updateInsightRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateInsightRequest> request = null;
        Response<UpdateInsightResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateInsightRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateInsightRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateInsight");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateInsightResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateInsightResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of your organization in Security Hub. Only the Security Hub administrator account can
     * invoke this operation.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return Result of the UpdateOrganizationConfiguration operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateOrganizationConfigurationResult updateOrganizationConfiguration(UpdateOrganizationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateOrganizationConfiguration(request);
    }

    @SdkInternalApi
    final UpdateOrganizationConfigurationResult executeUpdateOrganizationConfiguration(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateOrganizationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOrganizationConfigurationRequest> request = null;
        Response<UpdateOrganizationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOrganizationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateOrganizationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateOrganizationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateOrganizationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateOrganizationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the properties of a security control.
     * </p>
     * 
     * @param updateSecurityControlRequest
     * @return Result of the UpdateSecurityControl operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws ResourceInUseException
     *         The request was rejected because it conflicts with the resource's availability. For example, you tried to
     *         update a security control that's currently in the <code>UPDATING</code> state.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws ResourceInUseException
     *         The request was rejected because it conflicts with the resource's availability. For example, you tried to
     *         update a security control that's currently in the <code>UPDATING</code> state.
     * @sample AWSSecurityHub.UpdateSecurityControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateSecurityControl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSecurityControlResult updateSecurityControl(UpdateSecurityControlRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSecurityControl(request);
    }

    @SdkInternalApi
    final UpdateSecurityControlResult executeUpdateSecurityControl(UpdateSecurityControlRequest updateSecurityControlRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSecurityControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSecurityControlRequest> request = null;
        Response<UpdateSecurityControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSecurityControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSecurityControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSecurityControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSecurityControlResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateSecurityControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates configuration options for Security Hub.
     * </p>
     * 
     * @param updateSecurityHubConfigurationRequest
     * @return Result of the UpdateSecurityHubConfiguration operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current Amazon Web Services
     *         account or throttling limits. The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.UpdateSecurityHubConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateSecurityHubConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSecurityHubConfigurationResult updateSecurityHubConfiguration(UpdateSecurityHubConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSecurityHubConfiguration(request);
    }

    @SdkInternalApi
    final UpdateSecurityHubConfigurationResult executeUpdateSecurityHubConfiguration(UpdateSecurityHubConfigurationRequest updateSecurityHubConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSecurityHubConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSecurityHubConfigurationRequest> request = null;
        Response<UpdateSecurityHubConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSecurityHubConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSecurityHubConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSecurityHubConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSecurityHubConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSecurityHubConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used to control whether an individual security standard control is enabled or disabled.
     * </p>
     * 
     * @param updateStandardsControlRequest
     * @return Result of the UpdateStandardsControl operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         The account doesn't have permission to perform this action.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.UpdateStandardsControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateStandardsControl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateStandardsControlResult updateStandardsControl(UpdateStandardsControlRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStandardsControl(request);
    }

    @SdkInternalApi
    final UpdateStandardsControlResult executeUpdateStandardsControl(UpdateStandardsControlRequest updateStandardsControlRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStandardsControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStandardsControlRequest> request = null;
        Response<UpdateStandardsControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStandardsControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStandardsControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SecurityHub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStandardsControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStandardsControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateStandardsControlResultJsonUnmarshaller());
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
