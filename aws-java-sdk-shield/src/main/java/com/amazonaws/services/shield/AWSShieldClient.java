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
package com.amazonaws.services.shield;

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

import com.amazonaws.services.shield.AWSShieldClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.shield.model.*;
import com.amazonaws.services.shield.model.transform.*;

/**
 * Client for accessing AWS Shield. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS Shield Advanced</fullname>
 * <p>
 * This is the <i>AWS Shield Advanced API Reference</i>. This guide is for developers who need detailed information
 * about the AWS Shield Advanced API actions, data types, and errors. For detailed information about AWS WAF and AWS
 * Shield Advanced features and an overview of how to use the AWS WAF and AWS Shield Advanced APIs, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and AWS Shield Developer Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSShieldClient extends AmazonWebServiceClient implements AWSShield {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSShield.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "shield";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.shield.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OptimisticLockException").withModeledClass(
                                    com.amazonaws.services.shield.model.OptimisticLockException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LockedSubscriptionException").withModeledClass(
                                    com.amazonaws.services.shield.model.LockedSubscriptionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceException").withModeledClass(
                                    com.amazonaws.services.shield.model.InvalidResourceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.shield.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOperationException").withModeledClass(
                                    com.amazonaws.services.shield.model.InvalidOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.shield.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.shield.model.ResourceAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalErrorException").withModeledClass(
                                    com.amazonaws.services.shield.model.InternalErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPaginationTokenException").withModeledClass(
                                    com.amazonaws.services.shield.model.InvalidPaginationTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitsExceededException").withModeledClass(
                                    com.amazonaws.services.shield.model.LimitsExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoAssociatedRoleException").withModeledClass(
                                    com.amazonaws.services.shield.model.NoAssociatedRoleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedForDependencyException").withModeledClass(
                                    com.amazonaws.services.shield.model.AccessDeniedForDependencyException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.shield.model.AWSShieldException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Shield. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSShieldClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSShieldClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Shield. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Shield (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSShieldClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSShieldClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Shield using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSShieldClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSShieldClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSShieldClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Shield using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Shield (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSShieldClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSShieldClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSShieldClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Shield using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSShieldClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSShieldClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Shield using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Shield (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSShieldClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSShieldClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSShieldClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Shield using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Shield (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSShieldClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSShieldClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSShieldClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSShieldClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSShieldClientBuilder builder() {
        return AWSShieldClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Shield using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSShieldClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Shield using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSShieldClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("shield.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/shield/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/shield/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Authorizes the DDoS Response team (DRT) to access the specified Amazon S3 bucket containing your flow logs. You
     * can associate up to 10 Amazon S3 buckets with your subscription.
     * </p>
     * <p>
     * To use the services of the DRT and make an <code>AssociateDRTLogBucket</code> request, you must be subscribed to
     * the <a href="https://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>.
     * </p>
     * 
     * @param associateDRTLogBucketRequest
     * @return Result of the AssociateDRTLogBucket operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @throws NoAssociatedRoleException
     *         The ARN of the role that you specifed does not exist.
     * @throws LimitsExceededException
     *         Exception that indicates that the operation would exceed a limit.</p>
     *         <p>
     *         <code>Type</code> is the type of limit that would be exceeded.
     *         </p>
     *         <p>
     *         <code>Limit</code> is the threshold that would be exceeded.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid.
     * @throws AccessDeniedForDependencyException
     *         In order to grant the necessary access to the DDoS Response Team, the user submitting
     *         <code>AssociateDRTRole</code> must have the <code>iam:PassRole</code> permission. This error indicates
     *         the user did not have the appropriate permissions. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a User
     *         Permissions to Pass a Role to an AWS Service</a>.
     * @throws OptimisticLockException
     *         Exception that indicates that the protection state has been modified by another client. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @sample AWSShield.AssociateDRTLogBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateDRTLogBucket" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateDRTLogBucketResult associateDRTLogBucket(AssociateDRTLogBucketRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateDRTLogBucket(request);
    }

    @SdkInternalApi
    final AssociateDRTLogBucketResult executeAssociateDRTLogBucket(AssociateDRTLogBucketRequest associateDRTLogBucketRequest) {

        ExecutionContext executionContext = createExecutionContext(associateDRTLogBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDRTLogBucketRequest> request = null;
        Response<AssociateDRTLogBucketResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDRTLogBucketRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateDRTLogBucketRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateDRTLogBucket");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateDRTLogBucketResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociateDRTLogBucketResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Authorizes the DDoS Response team (DRT), using the specified role, to access your AWS account to assist with DDoS
     * attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create
     * or update AWS WAF rules and web ACLs.
     * </p>
     * <p>
     * You can associate only one <code>RoleArn</code> with your subscription. If you submit an
     * <code>AssociateDRTRole</code> request for an account that already has an associated role, the new
     * <code>RoleArn</code> will replace the existing <code>RoleArn</code>.
     * </p>
     * <p>
     * Prior to making the <code>AssociateDRTRole</code> request, you must attach the <a href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     * >AWSShieldDRTAccessPolicy</a> managed policy to the role you will specify in the request. For more information
     * see <a
     * href=" https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html">Attaching and
     * Detaching IAM Policies</a>. The role must also trust the service principal <code> drt.shield.amazonaws.com</code>
     * . For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">IAM JSON
     * Policy Elements: Principal</a>.
     * </p>
     * <p>
     * The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the
     * DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your
     * behalf. The DRT takes these actions only if explicitly authorized by you.
     * </p>
     * <p>
     * You must have the <code>iam:PassRole</code> permission to make an <code>AssociateDRTRole</code> request. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a
     * User Permissions to Pass a Role to an AWS Service</a>.
     * </p>
     * <p>
     * To use the services of the DRT and make an <code>AssociateDRTRole</code> request, you must be subscribed to the
     * <a href="https://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>.
     * </p>
     * 
     * @param associateDRTRoleRequest
     * @return Result of the AssociateDRTRole operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid.
     * @throws AccessDeniedForDependencyException
     *         In order to grant the necessary access to the DDoS Response Team, the user submitting
     *         <code>AssociateDRTRole</code> must have the <code>iam:PassRole</code> permission. This error indicates
     *         the user did not have the appropriate permissions. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a User
     *         Permissions to Pass a Role to an AWS Service</a>.
     * @throws OptimisticLockException
     *         Exception that indicates that the protection state has been modified by another client. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @sample AWSShield.AssociateDRTRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateDRTRole" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateDRTRoleResult associateDRTRole(AssociateDRTRoleRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateDRTRole(request);
    }

    @SdkInternalApi
    final AssociateDRTRoleResult executeAssociateDRTRole(AssociateDRTRoleRequest associateDRTRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(associateDRTRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDRTRoleRequest> request = null;
        Response<AssociateDRTRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDRTRoleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateDRTRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateDRTRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateDRTRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateDRTRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution,
     * Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route
     * 53 hosted zone.
     * </p>
     * <p>
     * You can add protection to only a single resource with each CreateProtection request. If you want to add
     * protection to multiple resources at once, use the <a href="https://console.aws.amazon.com/waf/">AWS WAF
     * console</a>. For more information see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/getting-started-ddos.html">Getting Started with AWS
     * Shield Advanced</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/configure-new-protection.html">Add AWS Shield
     * Advanced Protection to more AWS Resources</a>.
     * </p>
     * 
     * @param createProtectionRequest
     * @return Result of the CreateProtection operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidResourceException
     *         Exception that indicates that the resource is invalid. You might not have access to the resource, or the
     *         resource might not exist.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @throws LimitsExceededException
     *         Exception that indicates that the operation would exceed a limit.</p>
     *         <p>
     *         <code>Type</code> is the type of limit that would be exceeded.
     *         </p>
     *         <p>
     *         <code>Limit</code> is the threshold that would be exceeded.
     * @throws ResourceAlreadyExistsException
     *         Exception indicating the specified resource already exists.
     * @throws OptimisticLockException
     *         Exception that indicates that the protection state has been modified by another client. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @sample AWSShield.CreateProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/CreateProtection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateProtectionResult createProtection(CreateProtectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProtection(request);
    }

    @SdkInternalApi
    final CreateProtectionResult executeCreateProtection(CreateProtectionRequest createProtectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProtectionRequest> request = null;
        Response<CreateProtectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProtectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProtectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProtection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProtectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProtectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Activates AWS Shield Advanced for an account.
     * </p>
     * <p>
     * As part of this request you can specify <code>EmergencySettings</code> that automaticaly grant the DDoS response
     * team (DRT) needed permissions to assist you during a suspected DDoS attack. For more information see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/authorize-DRT.html">Authorize the DDoS Response Team
     * to Create Rules and Web ACLs on Your Behalf</a>.
     * </p>
     * <p>
     * When you initally create a subscription, your subscription is set to be automatically renewed at the end of the
     * existing subscription period. You can change this by submitting an <code>UpdateSubscription</code> request.
     * </p>
     * 
     * @param createSubscriptionRequest
     * @return Result of the CreateSubscription operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceAlreadyExistsException
     *         Exception indicating the specified resource already exists.
     * @sample AWSShield.CreateSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/CreateSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSubscriptionResult createSubscription(CreateSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSubscription(request);
    }

    @SdkInternalApi
    final CreateSubscriptionResult executeCreateSubscription(CreateSubscriptionRequest createSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(createSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSubscriptionRequest> request = null;
        Response<CreateSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an AWS Shield Advanced <a>Protection</a>.
     * </p>
     * 
     * @param deleteProtectionRequest
     * @return Result of the DeleteProtection operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @throws OptimisticLockException
     *         Exception that indicates that the protection state has been modified by another client. You can retry the
     *         request.
     * @sample AWSShield.DeleteProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DeleteProtection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteProtectionResult deleteProtection(DeleteProtectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProtection(request);
    }

    @SdkInternalApi
    final DeleteProtectionResult executeDeleteProtection(DeleteProtectionRequest deleteProtectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProtectionRequest> request = null;
        Response<DeleteProtectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProtectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProtectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProtection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProtectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProtectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a 1-year subscription commitment. You
     * cannot delete a subscription prior to the completion of that commitment.
     * </p>
     * 
     * @param deleteSubscriptionRequest
     * @return Result of the DeleteSubscription operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws LockedSubscriptionException
     *         You are trying to update a subscription that has not yet completed the 1-year commitment. You can change
     *         the <code>AutoRenew</code> parameter during the last 30 days of your subscription. This exception
     *         indicates that you are attempting to change <code>AutoRenew</code> prior to that period.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @sample AWSShield.DeleteSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DeleteSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    @Deprecated
    public DeleteSubscriptionResult deleteSubscription(DeleteSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSubscription(request);
    }

    @SdkInternalApi
    final DeleteSubscriptionResult executeDeleteSubscription(DeleteSubscriptionRequest deleteSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubscriptionRequest> request = null;
        Response<DeleteSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the details of a DDoS attack.
     * </p>
     * 
     * @param describeAttackRequest
     * @return Result of the DescribeAttack operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws AccessDeniedException
     *         Exception that indicates the specified <code>AttackId</code> does not exist, or the requester does not
     *         have the appropriate permissions to access the <code>AttackId</code>.
     * @sample AWSShield.DescribeAttack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeAttack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAttackResult describeAttack(DescribeAttackRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAttack(request);
    }

    @SdkInternalApi
    final DescribeAttackResult executeDescribeAttack(DescribeAttackRequest describeAttackRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAttackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAttackRequest> request = null;
        Response<DescribeAttackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAttackRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAttackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAttack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAttackResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAttackResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the current role and list of Amazon S3 log buckets used by the DDoS Response team (DRT) to access your
     * AWS account while assisting with attack mitigation.
     * </p>
     * 
     * @param describeDRTAccessRequest
     * @return Result of the DescribeDRTAccess operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @sample AWSShield.DescribeDRTAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeDRTAccess" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDRTAccessResult describeDRTAccess(DescribeDRTAccessRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDRTAccess(request);
    }

    @SdkInternalApi
    final DescribeDRTAccessResult executeDescribeDRTAccess(DescribeDRTAccessRequest describeDRTAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDRTAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDRTAccessRequest> request = null;
        Response<DescribeDRTAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDRTAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDRTAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDRTAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDRTAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDRTAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the email addresses that the DRT can use to contact you during a suspected attack.
     * </p>
     * 
     * @param describeEmergencyContactSettingsRequest
     * @return Result of the DescribeEmergencyContactSettings operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @sample AWSShield.DescribeEmergencyContactSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeEmergencyContactSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEmergencyContactSettingsResult describeEmergencyContactSettings(DescribeEmergencyContactSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEmergencyContactSettings(request);
    }

    @SdkInternalApi
    final DescribeEmergencyContactSettingsResult executeDescribeEmergencyContactSettings(
            DescribeEmergencyContactSettingsRequest describeEmergencyContactSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEmergencyContactSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEmergencyContactSettingsRequest> request = null;
        Response<DescribeEmergencyContactSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEmergencyContactSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEmergencyContactSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEmergencyContactSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEmergencyContactSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEmergencyContactSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the details of a <a>Protection</a> object.
     * </p>
     * 
     * @param describeProtectionRequest
     * @return Result of the DescribeProtection operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @sample AWSShield.DescribeProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeProtection" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeProtectionResult describeProtection(DescribeProtectionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProtection(request);
    }

    @SdkInternalApi
    final DescribeProtectionResult executeDescribeProtection(DescribeProtectionRequest describeProtectionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProtectionRequest> request = null;
        Response<DescribeProtectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProtectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProtectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProtection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProtectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeProtectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides details about the AWS Shield Advanced subscription for an account.
     * </p>
     * 
     * @param describeSubscriptionRequest
     * @return Result of the DescribeSubscription operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @sample AWSShield.DescribeSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeSubscriptionResult describeSubscription(DescribeSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSubscription(request);
    }

    @SdkInternalApi
    final DescribeSubscriptionResult executeDescribeSubscription(DescribeSubscriptionRequest describeSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSubscriptionRequest> request = null;
        Response<DescribeSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSubscriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the DDoS Response team's (DRT) access to the specified Amazon S3 bucket containing your flow logs.
     * </p>
     * <p>
     * To make a <code>DisassociateDRTLogBucket</code> request, you must be subscribed to the <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>. However, if you are
     * not subscribed to one of these support plans, but had been previously and had granted the DRT access to your
     * account, you can submit a <code>DisassociateDRTLogBucket</code> request to remove this access.
     * </p>
     * 
     * @param disassociateDRTLogBucketRequest
     * @return Result of the DisassociateDRTLogBucket operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @throws NoAssociatedRoleException
     *         The ARN of the role that you specifed does not exist.
     * @throws AccessDeniedForDependencyException
     *         In order to grant the necessary access to the DDoS Response Team, the user submitting
     *         <code>AssociateDRTRole</code> must have the <code>iam:PassRole</code> permission. This error indicates
     *         the user did not have the appropriate permissions. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a User
     *         Permissions to Pass a Role to an AWS Service</a>.
     * @throws OptimisticLockException
     *         Exception that indicates that the protection state has been modified by another client. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @sample AWSShield.DisassociateDRTLogBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisassociateDRTLogBucket"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateDRTLogBucketResult disassociateDRTLogBucket(DisassociateDRTLogBucketRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateDRTLogBucket(request);
    }

    @SdkInternalApi
    final DisassociateDRTLogBucketResult executeDisassociateDRTLogBucket(DisassociateDRTLogBucketRequest disassociateDRTLogBucketRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateDRTLogBucketRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDRTLogBucketRequest> request = null;
        Response<DisassociateDRTLogBucketResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDRTLogBucketRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateDRTLogBucketRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateDRTLogBucket");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateDRTLogBucketResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateDRTLogBucketResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the DDoS Response team's (DRT) access to your AWS account.
     * </p>
     * <p>
     * To make a <code>DisassociateDRTRole</code> request, you must be subscribed to the <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>. However, if you are
     * not subscribed to one of these support plans, but had been previously and had granted the DRT access to your
     * account, you can submit a <code>DisassociateDRTRole</code> request to remove this access.
     * </p>
     * 
     * @param disassociateDRTRoleRequest
     * @return Result of the DisassociateDRTRole operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @throws OptimisticLockException
     *         Exception that indicates that the protection state has been modified by another client. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @sample AWSShield.DisassociateDRTRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisassociateDRTRole" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisassociateDRTRoleResult disassociateDRTRole(DisassociateDRTRoleRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateDRTRole(request);
    }

    @SdkInternalApi
    final DisassociateDRTRoleResult executeDisassociateDRTRole(DisassociateDRTRoleRequest disassociateDRTRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateDRTRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDRTRoleRequest> request = null;
        Response<DisassociateDRTRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDRTRoleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateDRTRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateDRTRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateDRTRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateDRTRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the <code>SubscriptionState</code>, either <code>Active</code> or <code>Inactive</code>.
     * </p>
     * 
     * @param getSubscriptionStateRequest
     * @return Result of the GetSubscriptionState operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @sample AWSShield.GetSubscriptionState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/GetSubscriptionState" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSubscriptionStateResult getSubscriptionState(GetSubscriptionStateRequest request) {
        request = beforeClientExecution(request);
        return executeGetSubscriptionState(request);
    }

    @SdkInternalApi
    final GetSubscriptionStateResult executeGetSubscriptionState(GetSubscriptionStateRequest getSubscriptionStateRequest) {

        ExecutionContext executionContext = createExecutionContext(getSubscriptionStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSubscriptionStateRequest> request = null;
        Response<GetSubscriptionStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSubscriptionStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSubscriptionStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSubscriptionState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSubscriptionStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSubscriptionStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
     * </p>
     * 
     * @param listAttacksRequest
     * @return Result of the ListAttacks operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @sample AWSShield.ListAttacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListAttacks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAttacksResult listAttacks(ListAttacksRequest request) {
        request = beforeClientExecution(request);
        return executeListAttacks(request);
    }

    @SdkInternalApi
    final ListAttacksResult executeListAttacks(ListAttacksRequest listAttacksRequest) {

        ExecutionContext executionContext = createExecutionContext(listAttacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttacksRequest> request = null;
        Response<ListAttacksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttacksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAttacksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAttacks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAttacksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAttacksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all <a>Protection</a> objects for the account.
     * </p>
     * 
     * @param listProtectionsRequest
     * @return Result of the ListProtections operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @throws InvalidPaginationTokenException
     *         Exception that indicates that the NextToken specified in the request is invalid. Submit the request using
     *         the NextToken value that was returned in the response.
     * @sample AWSShield.ListProtections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListProtections" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListProtectionsResult listProtections(ListProtectionsRequest request) {
        request = beforeClientExecution(request);
        return executeListProtections(request);
    }

    @SdkInternalApi
    final ListProtectionsResult executeListProtections(ListProtectionsRequest listProtectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProtectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProtectionsRequest> request = null;
        Response<ListProtectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProtectionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProtectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProtections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProtectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProtectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the details of the list of email addresses that the DRT can use to contact you during a suspected attack.
     * </p>
     * 
     * @param updateEmergencyContactSettingsRequest
     * @return Result of the UpdateEmergencyContactSettings operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid.
     * @throws OptimisticLockException
     *         Exception that indicates that the protection state has been modified by another client. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @sample AWSShield.UpdateEmergencyContactSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateEmergencyContactSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEmergencyContactSettingsResult updateEmergencyContactSettings(UpdateEmergencyContactSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEmergencyContactSettings(request);
    }

    @SdkInternalApi
    final UpdateEmergencyContactSettingsResult executeUpdateEmergencyContactSettings(UpdateEmergencyContactSettingsRequest updateEmergencyContactSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEmergencyContactSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEmergencyContactSettingsRequest> request = null;
        Response<UpdateEmergencyContactSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEmergencyContactSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateEmergencyContactSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEmergencyContactSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEmergencyContactSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEmergencyContactSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty
     * parameters are not updated.
     * </p>
     * 
     * @param updateSubscriptionRequest
     * @return Result of the UpdateSubscription operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws LockedSubscriptionException
     *         You are trying to update a subscription that has not yet completed the 1-year commitment. You can change
     *         the <code>AutoRenew</code> parameter during the last 30 days of your subscription. This exception
     *         indicates that you are attempting to change <code>AutoRenew</code> prior to that period.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid.
     * @throws OptimisticLockException
     *         Exception that indicates that the protection state has been modified by another client. You can retry the
     *         request.
     * @sample AWSShield.UpdateSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSubscriptionResult updateSubscription(UpdateSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSubscription(request);
    }

    @SdkInternalApi
    final UpdateSubscriptionResult executeUpdateSubscription(UpdateSubscriptionRequest updateSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSubscriptionRequest> request = null;
        Response<UpdateSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSubscriptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Shield");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSubscriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSubscriptionResultJsonUnmarshaller());
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
